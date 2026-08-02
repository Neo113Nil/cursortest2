package com.squareup.cash.profile.presenters;

import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.account.screens.Account;
import com.squareup.cash.account.screens.AccountSwitcherScreen;
import com.squareup.cash.account.settings.viewmodels.UnsupportedSettingViewEvent;
import com.squareup.cash.cdf.account.AccountSwitchAccountViewSwitcher;
import com.squareup.cash.clientrouting.data.TargetDestination;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.recipients.backend.api.GenerationStrategy;
import com.squareup.cash.recipients.backend.api.RecipientSuggestionsProvider$RecipientAnalyticsData;
import com.squareup.cash.recipients.backend.api.RecipientSuggestionsProvider$RecipientWithAnalyticsData;
import com.squareup.cash.recipients.backend.api.RecipientVendor$Section;
import com.squareup.cash.recipients.backend.real.RealRecipientSuggestionsProvider;
import com.squareup.cash.recipients.backend.real.RealRecipientSuggestionsProvider$sections$$inlined$map$1$2$1;
import com.squareup.cash.screens.Back;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class UnsupportedSettingPresenter$models$$inlined$CollectEffect$1$1 implements FlowCollector {
    public final /* synthetic */ boolean $isRoutingEnabled$inlined;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object this$0;

    public UnsupportedSettingPresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, TaxReturnsPresenter taxReturnsPresenter, boolean z) {
        this.this$0 = taxReturnsPresenter;
        this.$isRoutingEnabled$inlined = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        Screen screen;
        RealRecipientSuggestionsProvider$sections$$inlined$map$1$2$1 realRecipientSuggestionsProvider$sections$$inlined$map$1$2$1;
        int i;
        int i2 = this.$r8$classId;
        boolean z = this.$isRoutingEnabled$inlined;
        Object obj2 = this.this$0;
        TargetDestination.ScreenDestination screenDestination = null;
        switch (i2) {
            case 0:
                TaxReturnsPresenter taxReturnsPresenter = (TaxReturnsPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) taxReturnsPresenter.navigator;
                ProfileScreens.UnsupportedSettingScreen unsupportedSettingScreen = (ProfileScreens.UnsupportedSettingScreen) taxReturnsPresenter.router;
                UnsupportedSettingViewEvent unsupportedSettingViewEvent = (UnsupportedSettingViewEvent) obj;
                if (!Intrinsics.areEqual(unsupportedSettingViewEvent, UnsupportedSettingViewEvent.CloseClicked.INSTANCE)) {
                    if (!Intrinsics.areEqual(unsupportedSettingViewEvent, UnsupportedSettingViewEvent.SwitchAccountsClicked.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    AccountSwitchAccountViewSwitcher.Entrypoint entrypoint = unsupportedSettingScreen.entrypoint;
                    if (z && (screen = unsupportedSettingScreen.exitScreen) != null) {
                        screenDestination = new TargetDestination.ScreenDestination(screen);
                    }
                    screenNavigator.goTo(new AccountSwitcherScreen(entrypoint, unsupportedSettingScreen, screenDestination));
                } else if (unsupportedSettingScreen.shouldNavigateBack) {
                    screenNavigator.goTo(Back.INSTANCE);
                } else {
                    screenNavigator.goTo(Account.INSTANCE);
                }
                return Unit.INSTANCE;
            default:
                if (continuation instanceof RealRecipientSuggestionsProvider$sections$$inlined$map$1$2$1) {
                    realRecipientSuggestionsProvider$sections$$inlined$map$1$2$1 = (RealRecipientSuggestionsProvider$sections$$inlined$map$1$2$1) continuation;
                    int i3 = realRecipientSuggestionsProvider$sections$$inlined$map$1$2$1.label;
                    if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                        realRecipientSuggestionsProvider$sections$$inlined$map$1$2$1.label = i3 - PKIFailureInfo.systemUnavail;
                        Object obj3 = realRecipientSuggestionsProvider$sections$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = realRecipientSuggestionsProvider$sections$$inlined$map$1$2$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            FlowCollector flowCollector = (FlowCollector) obj2;
                            EmptyList emptyList = EmptyList.INSTANCE;
                            RealRecipientSuggestionsProvider.Suggestions suggestions = new RealRecipientSuggestionsProvider.Suggestions(null, emptyList, emptyList, emptyList);
                            while (true) {
                                RealRecipientSuggestionsProvider.Suggestions suggestions2 = suggestions;
                                for (RecipientVendor$Section recipientVendor$Section : (List) obj) {
                                    if (recipientVendor$Section instanceof RecipientVendor$Section.ServerSuggestion) {
                                        RecipientVendor$Section.ServerSuggestion serverSuggestion = (RecipientVendor$Section.ServerSuggestion) recipientVendor$Section;
                                        Recipient recipient = serverSuggestion.exactMatch;
                                        RecipientSuggestionsProvider$RecipientWithAnalyticsData recipientSuggestionsProvider$RecipientWithAnalyticsData = recipient != null ? new RecipientSuggestionsProvider$RecipientWithAnalyticsData(new RecipientSuggestionsProvider$RecipientAnalyticsData(recipient.isInContacts ? GenerationStrategy.CONTACT : recipient.isRecent ? GenerationStrategy.RECENT : GenerationStrategy.REMOTE_EXACT_MATCH), recipient) : null;
                                        List list = serverSuggestion.matches;
                                        RecipientSuggestionsProvider$RecipientWithAnalyticsData recipientSuggestionsProvider$RecipientWithAnalyticsData2 = recipientSuggestionsProvider$RecipientWithAnalyticsData;
                                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(new RecipientSuggestionsProvider$RecipientWithAnalyticsData(new RecipientSuggestionsProvider$RecipientAnalyticsData(GenerationStrategy.REMOTE_MATCHES), (Recipient) it.next()));
                                        }
                                        suggestions = RealRecipientSuggestionsProvider.Suggestions.copy$default(suggestions2, recipientSuggestionsProvider$RecipientWithAnalyticsData2, arrayList, null, null, 12);
                                    } else if (recipientVendor$Section instanceof RecipientVendor$Section.LocalContacts) {
                                        RecipientVendor$Section.LocalContacts localContacts = (RecipientVendor$Section.LocalContacts) recipientVendor$Section;
                                        boolean z2 = localContacts.isGenerated;
                                        if (!z2 || z) {
                                            List list2 = localContacts.recipients;
                                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                            Iterator it2 = list2.iterator();
                                            while (it2.hasNext()) {
                                                arrayList2.add(new RecipientSuggestionsProvider$RecipientWithAnalyticsData(new RecipientSuggestionsProvider$RecipientAnalyticsData(z2 ? GenerationStrategy.NEW_CUSTOMER : GenerationStrategy.CONTACT), (Recipient) it2.next()));
                                            }
                                            suggestions = RealRecipientSuggestionsProvider.Suggestions.copy$default(suggestions2, null, null, arrayList2, null, 11);
                                        }
                                    } else {
                                        if (!(recipientVendor$Section instanceof RecipientVendor$Section.Recents)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        List list3 = ((RecipientVendor$Section.Recents) recipientVendor$Section).recipients;
                                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                                        Iterator it3 = list3.iterator();
                                        while (it3.hasNext()) {
                                            arrayList3.add(new RecipientSuggestionsProvider$RecipientWithAnalyticsData(new RecipientSuggestionsProvider$RecipientAnalyticsData(GenerationStrategy.RECENT), (Recipient) it3.next()));
                                        }
                                        boolean isEmpty = arrayList3.isEmpty();
                                        Collection collection = arrayList3;
                                        if (isEmpty) {
                                            collection = suggestions2.recent;
                                        }
                                        suggestions = RealRecipientSuggestionsProvider.Suggestions.copy$default(suggestions2, null, null, null, (List) collection, 7);
                                    }
                                }
                                realRecipientSuggestionsProvider$sections$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(suggestions2, realRecipientSuggestionsProvider$sections$$inlined$map$1$2$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj3);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realRecipientSuggestionsProvider$sections$$inlined$map$1$2$1 = new RealRecipientSuggestionsProvider$sections$$inlined$map$1$2$1(this, continuation);
                Object obj32 = realRecipientSuggestionsProvider$sections$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realRecipientSuggestionsProvider$sections$$inlined$map$1$2$1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
        }
    }

    public UnsupportedSettingPresenter$models$$inlined$CollectEffect$1$1(FlowCollector flowCollector, boolean z) {
        this.this$0 = flowCollector;
        this.$isRoutingEnabled$inlined = z;
    }
}
