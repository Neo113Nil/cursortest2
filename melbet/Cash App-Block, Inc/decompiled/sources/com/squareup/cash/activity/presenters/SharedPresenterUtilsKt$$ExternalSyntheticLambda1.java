package com.squareup.cash.activity.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import com.squareup.cash.activity.backend.FormattingFailedActivityItem;
import com.squareup.cash.activity.viewmodels.ActivityFeedEntry;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class SharedPresenterUtilsKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FormattingFailedActivityItem f$0;

    public /* synthetic */ SharedPresenterUtilsKt$$ExternalSyntheticLambda1(FormattingFailedActivityItem formattingFailedActivityItem, int i) {
        this.$r8$classId = i;
        this.f$0 = formattingFailedActivityItem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        FormattingFailedActivityItem formattingFailedActivityItem = this.f$0;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(360057206);
                ActivityFeedEntry.ErrorItem errorItem = new ActivityFeedEntry.ErrorItem(formattingFailedActivityItem);
                gapComposer.end(false);
                return errorItem;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(1253394914);
                ActivityFeedEntry.ErrorItem errorItem2 = new ActivityFeedEntry.ErrorItem(formattingFailedActivityItem);
                gapComposer2.end(false);
                return errorItem2;
        }
    }
}
