package com.squareup.cash.profile.views;

import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.squareup.cash.activity.backend.contacts.ActivityContact;
import com.squareup.cash.arcade.components.RealSegmentedControlScope;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.moneybot.viewmodels.chat.ChatCardViewModel;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda8;
import com.squareup.cash.profile.viewmodels.OpenSourceViewModel;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.protos.franklin.common.RequestContext;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class OpenSourceKt$$ExternalSyntheticLambda6 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ List f$0;

    public /* synthetic */ OpenSourceKt$$ExternalSyntheticLambda6(List list, int i) {
        this.$r8$classId = i;
        this.f$0 = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        boolean z = true;
        List list = this.f$0;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                return Recorder$$ExternalSyntheticOutline2.m$1(((OpenSourceViewModel.ArtifactViewModel) list.get(intValue)).groupId, ((OpenSourceViewModel.ArtifactViewModel) list.get(intValue)).artifactId);
            case 1:
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((DeferrableSurface) it.next()).decrementUseCount();
                }
                return Unit.INSTANCE;
            case 2:
                ActivityContact activityContact = (ActivityContact) obj;
                activityContact.getClass();
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (Intrinsics.areEqual(((Recipient) it2.next()).customerId, activityContact.customerId)) {
                                z = false;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 3:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver);
                SemanticsPropertiesKt.setCollectionInfo(semanticsPropertyReceiver, new CollectionInfo(1, list.size()));
                return Unit.INSTANCE;
            case 4:
                BlockersData blockersData = (BlockersData) obj;
                blockersData.getClass();
                return BlockersData.copy$default(blockersData, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, RequestContext.copy$default(blockersData.requestContext, null, null, null, null, this.f$0, null, null, null, null, null, null, null, 8175), null, null, -1, 57343);
            case 5:
                BlockersData blockersData2 = (BlockersData) obj;
                blockersData2.getClass();
                return BlockersData.copy$default(blockersData2, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, RequestContext.copy$default(blockersData2.requestContext, null, null, null, null, this.f$0, null, null, null, null, null, null, null, 8175), null, null, -1, 57343);
            case 6:
                RealSegmentedControlScope realSegmentedControlScope = (RealSegmentedControlScope) obj;
                realSegmentedControlScope.getClass();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    realSegmentedControlScope.segments.add(new ComposableLambdaImpl(new SuggestionUiKt$$ExternalSyntheticLambda8((ChatCardViewModel.InsightCard.ChartToggleButton) it3.next(), 7), true, 528945924));
                }
                return Unit.INSTANCE;
            default:
                return ((RecipientViewModel) list.get(((Integer) obj).intValue())).listUniqueId;
        }
    }
}
