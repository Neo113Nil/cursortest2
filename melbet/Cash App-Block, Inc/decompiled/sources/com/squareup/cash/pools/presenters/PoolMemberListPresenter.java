package com.squareup.cash.pools.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.molecule.PlatformKt;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import com.google.android.gms.internal.time.zzel$EnumUnboxingLocalUtility;
import com.squareup.cash.R;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.featureflags.AmplitudeExperiments$P2pPools;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.invitations.InviteErrorPresenter$models$1$1;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.pools.backend.real.RealPoolsRepository;
import com.squareup.cash.pools.screens.PoolMemberListScreen;
import com.squareup.cash.pools.viewmodels.FailureDialogViewModel;
import com.squareup.cash.pools.viewmodels.MemberStatusUpdateSnackBarViewModel;
import com.squareup.cash.pools.viewmodels.PoolMemberListViewModel;
import com.squareup.cash.pools.viewmodels.PoolOwnerInformation;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda2;
import com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.wallet.views.HeroTagViewKt$$ExternalSyntheticLambda12;
import com.squareup.protos.cash.pools.PoolOwner;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.cash.pools.PoolParticipantType;
import com.squareup.protos.cash.pools.RemoveCustomersFromPoolResponse;
import com.squareup.protos.cash.tax.TaxEnvironment;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.cash.ColorsKt;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda25;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes6.dex */
public final class PoolMemberListPresenter implements MoleculePresenter {
    public final Analytics analytics;
    public final PoolMemberListScreen args;
    public final FlowStarter blockersNavigator;
    public final CoroutineContext ioDispatcher;
    public final boolean isModifyingParticipantsEnabled;
    public final boolean isOwner;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealPoolsRepository poolsRepository;
    public final SessionManager sessionManager;
    public final AndroidStringManager stringManager;

    /* loaded from: classes7.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RemoveCustomersFromPoolResponse.FailureReason.values().length];
            try {
                TaxEnvironment.Companion companion = RemoveCustomersFromPoolResponse.FailureReason.Companion;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TaxEnvironment.Companion companion2 = RemoveCustomersFromPoolResponse.FailureReason.Companion;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PoolMemberListPresenter(AndroidStringManager androidStringManager, RealPoolsRepository realPoolsRepository, SessionManager sessionManager, FlowStarter flowStarter, RealUuidGenerator realUuidGenerator, Analytics analytics, FeatureFlagManager featureFlagManager, CoroutineContext coroutineContext, PoolMemberListScreen poolMemberListScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        poolMemberListScreen.getClass();
        this.stringManager = androidStringManager;
        this.poolsRepository = realPoolsRepository;
        this.sessionManager = sessionManager;
        this.blockersNavigator = flowStarter;
        this.analytics = analytics;
        this.ioDispatcher = coroutineContext;
        this.args = poolMemberListScreen;
        this.navigator = screenNavigator;
        String str = ((PoolOwner) poolMemberListScreen.poolOwner.getValue()).customer_token;
        str.getClass();
        this.isOwner = str.equals(PlatformKt.activeAccountTokenOrNull(sessionManager));
        this.isModifyingParticipantsEnabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) featureFlagManager).currentValue(AmplitudeExperiments$P2pPools.INSTANCE)).enabled();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        MutableState mutableState;
        MutableState mutableState2;
        Throwable th;
        MutableState mutableState3;
        int i2;
        PoolMemberListPresenter poolMemberListPresenter = this;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-194453388);
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = Updater.mutableStateOf$default(EmptyList.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState4 = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        PoolMemberListScreen poolMemberListScreen = poolMemberListPresenter.args;
        if (rememberedValue2 == obj) {
            Iterable iterable = (Iterable) poolMemberListScreen.participants.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (((PoolParticipant) obj2).participant_type != PoolParticipantType.POOL_PARTICIPANT_TYPE_CASH_APP_USER) {
                    arrayList.add(obj2);
                }
            }
            rememberedValue2 = Updater.mutableStateOf$default(arrayList);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState5 = (MutableState) rememberedValue2;
        Object[] objArr = new Object[0];
        boolean changedInstance = gapComposer.changedInstance(poolMemberListPresenter);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue3 == obj) {
            rememberedValue3 = new BottomSheet$$ExternalSyntheticLambda2(poolMemberListPresenter, 5);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState6 = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue3, gapComposer, 0);
        Object rememberedValue4 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (rememberedValue4 == obj) {
            rememberedValue4 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState7 = (MutableState) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == obj) {
            rememberedValue5 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState8 = (MutableState) rememberedValue5;
        boolean changed = gapComposer.changed((List) mutableState6.getValue()) | gapComposer.changed((List) mutableState4.getValue()) | gapComposer.changed((List) mutableState5.getValue());
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (changed || rememberedValue6 == obj) {
            poolMemberListPresenter = this;
            mutableState = mutableState6;
            mutableState2 = mutableState4;
            rememberedValue6 = Updater.derivedStateOf(new UiWorkflow$$ExternalSyntheticLambda25(this, mutableState6, mutableState5, mutableState4, 12));
            gapComposer.updateRememberedValue(rememberedValue6);
        } else {
            mutableState = mutableState6;
            mutableState2 = mutableState4;
        }
        State state = (State) rememberedValue6;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance2 = gapComposer.changedInstance(poolMemberListPresenter);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue7 == obj) {
            rememberedValue7 = new InviteErrorPresenter$models$1$1(poolMemberListPresenter, continuation, 27);
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue7);
        MemberStatusUpdateSnackBarViewModel memberStatusUpdateSnackBarViewModel = (MemberStatusUpdateSnackBarViewModel) mutableState7.getValue();
        if (memberStatusUpdateSnackBarViewModel != null) {
            gapComposer.startReplaceGroup(-1106477359);
            mutableState3 = mutableState7;
            th = null;
            Updater.LaunchedEffect(gapComposer, memberStatusUpdateSnackBarViewModel, new DotGridKt$DotGrid$3$1(25, mutableState3, poolMemberListPresenter, memberStatusUpdateSnackBarViewModel, (Continuation) null));
            gapComposer.end(false);
        } else {
            th = null;
            mutableState3 = mutableState7;
            gapComposer.startReplaceGroup(-1106436997);
            gapComposer.end(false);
        }
        boolean changed2 = gapComposer.changed(mutableState);
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue8 == obj) {
            rememberedValue8 = new HeroTagViewKt$$ExternalSyntheticLambda12(26, mutableState);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        Function2 function2 = (Function2) rememberedValue8;
        AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer.consume(AnswersKt.LocalAnswerDispatcher);
        boolean changed3 = gapComposer.changed(function2) | gapComposer.changedInstance(answerDispatcher);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (changed3 || rememberedValue9 == obj) {
            rememberedValue9 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 21);
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue9, gapComposer);
        MutableState mutableState9 = mutableState3;
        Updater.LaunchedEffect(gapComposer, flow, new ZiplineLoader$load$2(flow, (Continuation) null, this, mutableState, state, mutableState2, mutableState9, mutableState8, 25));
        ArrayMap m = NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(((List) mutableState.getValue()).size() + 1), "count");
        Resources resources = this.stringManager.resources;
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.pools_list_people_title)).format(m);
        format2.getClass();
        Redacted redacted = poolMemberListScreen.poolOwner;
        String str = ((PoolOwner) redacted.getValue()).full_name;
        str.getClass();
        String str2 = ((PoolOwner) redacted.getValue()).cashtag;
        if (str2 == null) {
            str2 = "";
        }
        String format3 = new MessageFormat(resources.getString(R.string.pools_owner_row_subtitle)).format(zzel$EnumUnboxingLocalUtility.m(1, "cashtag", str2));
        format3.getClass();
        String str3 = ((PoolOwner) redacted.getValue()).full_name;
        str3.getClass();
        String valueOf = String.valueOf(StringsKt___StringsKt.firstOrNull(str3));
        String str4 = ((PoolOwner) redacted.getValue()).profile_photo_url;
        PoolOwnerInformation poolOwnerInformation = new PoolOwnerInformation(str, format3, valueOf, str4 != null ? new Image(str4, str4, 4) : th, ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(25, null, ((PoolOwner) redacted.getValue()).customer_token, ((PoolOwner) redacted.getValue()).full_name, null, null)));
        ImmutableList immutableList = (ImmutableList) state.getValue();
        boolean z = !poolMemberListScreen.isPoolClosed && this.isModifyingParticipantsEnabled;
        boolean z2 = this.isOwner;
        boolean z3 = !z2;
        MemberStatusUpdateSnackBarViewModel memberStatusUpdateSnackBarViewModel2 = (MemberStatusUpdateSnackBarViewModel) mutableState9.getValue();
        FailureDialogViewModel failureDialogViewModel = (FailureDialogViewModel) mutableState8.getValue();
        List list = (List) mutableState.getValue();
        if ((list instanceof Collection) && list.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it = list.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (((PoolParticipant) it.next()).participant_type == PoolParticipantType.POOL_PARTICIPANT_TYPE_CASH_APP_USER && (i2 = i2 + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                    throw th;
                }
            }
        }
        PoolMemberListViewModel poolMemberListViewModel = new PoolMemberListViewModel(format2, poolOwnerInformation, immutableList, z2, z3, i2 >= 50, memberStatusUpdateSnackBarViewModel2, failureDialogViewModel, z);
        gapComposer.end(false);
        return poolMemberListViewModel;
    }
}
