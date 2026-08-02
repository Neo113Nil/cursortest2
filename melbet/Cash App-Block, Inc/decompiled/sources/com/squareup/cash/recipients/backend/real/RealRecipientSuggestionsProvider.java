package com.squareup.cash.recipients.backend.real;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.history.navigation.PaymentActionHandler$transform$$inlined$flatMapLatest$2;
import com.squareup.cash.recipients.backend.api.RecipientSuggestionsProvider$RecipientWithAnalyticsData;
import com.squareup.cash.recipients.data.RealRecipientRepository$suggestions$$inlined$map$1;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.upsell.presenters.NullStateSwipeConfigProvider;
import com.squareup.kotterknife.Lazy;
import com.squareup.protos.franklin.common.Orientation;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;

/* loaded from: classes7.dex */
public final class RealRecipientSuggestionsProvider {
    public final FeatureFlagManager featureFlagManager;
    public final ToolbarTuckTargets recipientsVendor;

    public final class Suggestions {
        public final RecipientSuggestionsProvider$RecipientWithAnalyticsData exactMatch;
        public final List localContacts;
        public final List recent;
        public final List serverSuggestions;

        public Suggestions(RecipientSuggestionsProvider$RecipientWithAnalyticsData recipientSuggestionsProvider$RecipientWithAnalyticsData, List list, List list2, List list3) {
            list.getClass();
            list2.getClass();
            list3.getClass();
            this.exactMatch = recipientSuggestionsProvider$RecipientWithAnalyticsData;
            this.serverSuggestions = list;
            this.localContacts = list2;
            this.recent = list3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
        public static Suggestions copy$default(Suggestions suggestions, RecipientSuggestionsProvider$RecipientWithAnalyticsData recipientSuggestionsProvider$RecipientWithAnalyticsData, ArrayList arrayList, ArrayList arrayList2, List list, int i) {
            if ((i & 1) != 0) {
                recipientSuggestionsProvider$RecipientWithAnalyticsData = suggestions.exactMatch;
            }
            ArrayList arrayList3 = arrayList;
            if ((i & 2) != 0) {
                arrayList3 = suggestions.serverSuggestions;
            }
            ArrayList arrayList4 = arrayList2;
            if ((i & 4) != 0) {
                arrayList4 = suggestions.localContacts;
            }
            if ((i & 8) != 0) {
                list = suggestions.recent;
            }
            arrayList3.getClass();
            arrayList4.getClass();
            list.getClass();
            return new Suggestions(recipientSuggestionsProvider$RecipientWithAnalyticsData, arrayList3, arrayList4, list);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Suggestions)) {
                return false;
            }
            Suggestions suggestions = (Suggestions) obj;
            return Intrinsics.areEqual(this.exactMatch, suggestions.exactMatch) && Intrinsics.areEqual(this.serverSuggestions, suggestions.serverSuggestions) && Intrinsics.areEqual(this.localContacts, suggestions.localContacts) && Intrinsics.areEqual(this.recent, suggestions.recent);
        }

        public final int hashCode() {
            RecipientSuggestionsProvider$RecipientWithAnalyticsData recipientSuggestionsProvider$RecipientWithAnalyticsData = this.exactMatch;
            return this.recent.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((recipientSuggestionsProvider$RecipientWithAnalyticsData == null ? 0 : recipientSuggestionsProvider$RecipientWithAnalyticsData.hashCode()) * 31, 31, this.serverSuggestions), 31, this.localContacts);
        }

        public final String toString() {
            return "Suggestions(exactMatch=" + this.exactMatch + ", serverSuggestions=" + this.serverSuggestions + ", localContacts=" + this.localContacts + ", recent=" + this.recent + ")";
        }
    }

    public RealRecipientSuggestionsProvider(ToolbarTuckTargets toolbarTuckTargets, FeatureFlagManager featureFlagManager) {
        this.recipientsVendor = toolbarTuckTargets;
        this.featureFlagManager = featureFlagManager;
    }

    public static final ArrayList access$applyClientSideFilters(RealRecipientSuggestionsProvider realRecipientSuggestionsProvider, ArrayList arrayList, boolean z, Set set) {
        ArrayList arrayList2;
        String concat;
        if (!z || !set.isEmpty()) {
            if (set.isEmpty()) {
                arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((RecipientSuggestionsProvider$RecipientWithAnalyticsData) obj).recipient.isCashCustomer) {
                        arrayList2.add(obj);
                    }
                }
            } else {
                arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    Recipient recipient = ((RecipientSuggestionsProvider$RecipientWithAnalyticsData) obj2).recipient;
                    boolean z2 = recipient.isCashCustomer;
                    if ((!z2 && z) || (z2 && CollectionsKt.contains(set, recipient.region))) {
                        arrayList2.add(obj2);
                    }
                }
            }
            arrayList = arrayList2;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList) {
            Recipient recipient2 = ((RecipientSuggestionsProvider$RecipientWithAnalyticsData) obj3).recipient;
            String str = recipient2.customerId;
            if (str != null) {
                concat = "customerId_".concat(str);
            } else {
                String str2 = recipient2.sms;
                if (str2 != null) {
                    concat = "sms_".concat(str2);
                } else {
                    String str3 = recipient2.email;
                    concat = str3 != null ? "email_".concat(str3) : null;
                }
            }
            if (hashSet.add(concat)) {
                arrayList3.add(obj3);
            }
        }
        return arrayList3;
    }

    public static ChannelFlowTransformLatest sections$default(RealRecipientSuggestionsProvider realRecipientSuggestionsProvider, AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$2, Orientation orientation, boolean z, EmptySet emptySet, boolean z2, AppLockMonitor$special$$inlined$map$2 appLockMonitor$special$$inlined$map$22, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            emptySet = EmptySet.INSTANCE;
        }
        int i2 = 0;
        boolean z3 = (i & 32) == 0;
        emptySet.getClass();
        ToolbarTuckTargets toolbarTuckTargets = realRecipientSuggestionsProvider.recipientsVendor;
        Lazy lazy = (Lazy) toolbarTuckTargets.endCornerCenterX$delegate;
        RealContactRepository realContactRepository = (RealContactRepository) lazy.initializer;
        int i3 = 20;
        Continuation continuation = null;
        return FlowKt.transformLatest(appLockMonitor$special$$inlined$map$2, new RealRecipientSuggestionsProvider$sections$$inlined$flatMapLatest$1(null, new RealRecipientSuggestionsProvider$sections$$inlined$map$1(FlowKt.transformLatest(new FlowExtensionsKt$combine$$inlined$combine$1(2, FlowKt.transformLatest(new RealRecipientRepository$suggestions$$inlined$map$1(z3 ? new NullStateSwipeConfigProvider(realContactRepository.recipients(), i3) : new RealRecipientSearchController$search$$inlined$map$2(realContactRepository.contacts(), i2), 4), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1(continuation, lazy, appLockMonitor$special$$inlined$map$2, i3)), toolbarTuckTargets), new PaymentActionHandler$transform$$inlined$flatMapLatest$2(toolbarTuckTargets, orientation, appLockMonitor$special$$inlined$map$22, continuation, 5)), z2), realRecipientSuggestionsProvider, z, emptySet));
    }
}
