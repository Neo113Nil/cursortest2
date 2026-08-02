package com.squareup.cash.pools.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.amountslider.viewmodels.AmountSelectorWidgetModel;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.instruments.backend.real.RealInstrumentRowLoader;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.offers.presenters.OffersHomePresenter$models$2$1;
import com.squareup.cash.payments.RealPaymentInitiator;
import com.squareup.cash.pools.screens.PoolContributeScreen;
import com.squareup.cash.pools.viewmodels.PoolContributeWithNoteViewModel;
import com.squareup.cash.pools.viewmodels.PoolParticipant;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.scrubbing.DateScrubber$$ExternalSyntheticLambda0;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda2;
import com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda12;
import com.squareup.moshi.LinkedHashTreeMap;
import com.squareup.protos.cash.pools.MoneyPool;
import com.squareup.protos.cash.pools.PoolOwner;
import com.squareup.protos.cash.pools.PoolParticipantType;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.InstrumentSelection;
import com.squareup.util.cash.ColorsKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import kotlinx.coroutines.flow.Flow;
import okhttp3.internal.Tags;

/* loaded from: classes6.dex */
public final class PoolContributeWithNotePresenter implements MoleculePresenter {
    public static final AbstractPersistentList quickAmounts;
    public final Analytics analytics;
    public final PoolContributeScreen args;
    public final FlowStarter blockersNavigator;
    public final RealInstrumentRowLoader instrumentRowLoader;
    public final boolean isOwner;
    public final MoneyFormatter moneyFormatter;
    public final BetterNavigator.ScreenNavigator navigator;
    public final MoneyFormatter noSymbolMoneyFormatter;
    public final RealPaymentInitiator paymentInitiator;
    public final UUID paymentToken;
    public final AndroidStringManager stringManager;

    static {
        CurrencyCode currencyCode = CurrencyCode.USD;
        quickAmounts = Tags.persistentListOf(new Money((Long) 500L, currencyCode, 4), new Money((Long) 1000L, currencyCode, 4), new Money((Long) 2500L, currencyCode, 4), new Money((Long) 5000L, currencyCode, 4), new Money((Long) 10000L, currencyCode, 4));
    }

    public PoolContributeWithNotePresenter(PoolContributeScreen poolContributeScreen, BetterNavigator.ScreenNavigator screenNavigator, RealUuidGenerator realUuidGenerator, AndroidStringManager androidStringManager, RealInstrumentRowLoader realInstrumentRowLoader, Analytics analytics, FlowStarter flowStarter, RealPaymentInitiator realPaymentInitiator, LocalizedMoneyFormatter.Factory factory, SessionManager sessionManager) {
        poolContributeScreen.getClass();
        this.args = poolContributeScreen;
        this.navigator = screenNavigator;
        this.stringManager = androidStringManager;
        this.instrumentRowLoader = realInstrumentRowLoader;
        this.analytics = analytics;
        this.blockersNavigator = flowStarter;
        this.paymentInitiator = realPaymentInitiator;
        this.paymentToken = RealUuidGenerator.generate();
        this.moneyFormatter = factory.create(MoneyFormatterConfig.COMPACT);
        this.noSymbolMoneyFormatter = factory.createNoSymbolCompact();
        this.isOwner = Intrinsics.areEqual(PlatformKt.activeAccountTokenOrNull(sessionManager), poolContributeScreen.ownerToken.getValue());
    }

    public final ListBuilder buildAmountPickerOptions(Money money) {
        money.getClass();
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        AbstractPersistentList abstractPersistentList = quickAmounts;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(abstractPersistentList, 10));
        ListIterator listIterator = abstractPersistentList.listIterator(0);
        while (listIterator.hasNext()) {
            Money money2 = (Money) listIterator.next();
            arrayList.add(new PoolContributeWithNoteViewModel.AmountAtmPicker.AmountPickerQuickAmount(this.moneyFormatter.format(money2), money2.equals(money), null, 12));
        }
        createListBuilder.addAll(arrayList);
        AmountSelectorWidgetModel.Item.Icon icon = AmountSelectorWidgetModel.Item.Icon.PENDING;
        createListBuilder.add(new PoolContributeWithNoteViewModel.AmountAtmPicker.AmountPickerQuickAmount("...", false, this.stringManager.get(R.string.custom_amount_content_description), 2));
        return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
    }

    public final ImmutableList buildParticipantList() {
        MoneyPool moneyPool;
        Redacted redacted = this.args.pool;
        if (redacted != null && (moneyPool = (MoneyPool) redacted.getValue()) != null) {
            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            PoolOwner poolOwner = moneyPool.owner;
            poolOwner.getClass();
            String str = poolOwner.customer_token;
            str.getClass();
            String str2 = poolOwner.full_name;
            String str3 = poolOwner.profile_photo_url;
            createListBuilder.add(new PoolParticipant(str2, str, str3 != null ? new Image(str3, str3, 4) : null, ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, poolOwner.customer_token, poolOwner.full_name, null, null))));
            List list = moneyPool.participants;
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (hashSet.add(((com.squareup.protos.cash.pools.PoolParticipant) obj).customer_identifier)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((com.squareup.protos.cash.pools.PoolParticipant) next).participant_type == PoolParticipantType.POOL_PARTICIPANT_TYPE_CASH_APP_USER) {
                    arrayList2.add(next);
                }
            }
            List<com.squareup.protos.cash.pools.PoolParticipant> sortedWith = CollectionsKt.sortedWith(arrayList2, new LinkedHashTreeMap.AnonymousClass1(3));
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedWith, 10));
            for (com.squareup.protos.cash.pools.PoolParticipant poolParticipant : sortedWith) {
                String str4 = poolParticipant.customer_identifier;
                str4.getClass();
                String str5 = poolParticipant.full_name;
                String str6 = poolParticipant.profile_photo_url;
                arrayList3.add(new PoolParticipant(str5, str4, str6 != null ? new Image(str6, str6, 4) : null, ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, poolParticipant.customer_identifier, poolParticipant.full_name, null, null))));
            }
            createListBuilder.addAll(Tags.toImmutableList(arrayList3));
            ImmutableList immutableList = Tags.toImmutableList(CollectionsKt__CollectionsJVMKt.build(createListBuilder));
            if (immutableList != null) {
                return immutableList;
            }
        }
        return SmallPersistentVector.EMPTY;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        Object obj;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(359765339);
        Object[] objArr = new Object[0];
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new BottomSheet$$ExternalSyntheticLambda2(this, 4);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 0);
        Object[] objArr2 = new Object[0];
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new DateScrubber$$ExternalSyntheticLambda0(3);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue2, gapComposer, 48);
        boolean changed = gapComposer.changed(((PoolContributeWithNoteViewModel) mutableState.getValue()).getAmount()) | gapComposer.changed((InstrumentSelection) mutableState2.getValue());
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed || rememberedValue3 == neverEqualPolicy) {
            Money amount = ((PoolContributeWithNoteViewModel) mutableState.getValue()).getAmount();
            PoolContributeScreen poolContributeScreen = this.args;
            String str = (String) poolContributeScreen.ownerToken.getValue();
            Long l = poolContributeScreen.poolCreditCardBps;
            rememberedValue3 = this.instrumentRowLoader.models(amount, CollectionsKt__CollectionsJVMKt.listOf(new Recipient(null, false, false, str, null, null, false, false, false, null, null, null, null, null, null, false, l != null ? l.longValue() : 0L, null, null, false, null, null, null, null, null, null, null, null, false, null, null, false, false, null, -65545, 3)), (InstrumentSelection) mutableState2.getValue(), !this.isOwner, true, false, false);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue3, null, null, gapComposer, 48, 2);
        boolean changed2 = gapComposer.changed(mutableState2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = new HeroTagViewKt$$ExternalSyntheticLambda12(25, mutableState2);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Function2 function2 = (Function2) rememberedValue4;
        AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer.consume(AnswersKt.LocalAnswerDispatcher);
        boolean changed3 = gapComposer.changed(function2) | gapComposer.changedInstance(answerDispatcher);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changed3 || rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 20);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue5, gapComposer);
        InstrumentSelectionRowViewModel instrumentSelectionRowViewModel = (InstrumentSelectionRowViewModel) collectAsState.getValue();
        boolean changed4 = gapComposer.changed(mutableState) | gapComposer.changed(collectAsState);
        Object rememberedValue6 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changed4 || rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = new OffersHomePresenter$models$2$1(mutableState, collectAsState, continuation, 13);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        Updater.LaunchedEffect(gapComposer, instrumentSelectionRowViewModel, (Function2) rememberedValue6);
        Updater.LaunchedEffect(gapComposer, flow, new PoolsListPresenter$models$2$2(flow, (Continuation) null, (Object) this, mutableState, collectAsState, 10));
        if (((PoolContributeWithNoteViewModel) mutableState.getValue()) instanceof PoolContributeWithNoteViewModel.InputNote) {
            PoolContributeWithNoteViewModel poolContributeWithNoteViewModel = (PoolContributeWithNoteViewModel) mutableState.getValue();
            poolContributeWithNoteViewModel.getClass();
            obj = PoolContributeWithNoteViewModel.InputNote.copy$default((PoolContributeWithNoteViewModel.InputNote) poolContributeWithNoteViewModel, null, buildParticipantList(), 31);
        } else if (((PoolContributeWithNoteViewModel) mutableState.getValue()) instanceof PoolContributeWithNoteViewModel.Review) {
            PoolContributeWithNoteViewModel poolContributeWithNoteViewModel2 = (PoolContributeWithNoteViewModel) mutableState.getValue();
            poolContributeWithNoteViewModel2.getClass();
            obj = PoolContributeWithNoteViewModel.Review.copy$default((PoolContributeWithNoteViewModel.Review) poolContributeWithNoteViewModel2, null, buildParticipantList(), 127);
        } else {
            obj = (PoolContributeWithNoteViewModel) mutableState.getValue();
        }
        gapComposer.end(false);
        return obj;
    }
}
