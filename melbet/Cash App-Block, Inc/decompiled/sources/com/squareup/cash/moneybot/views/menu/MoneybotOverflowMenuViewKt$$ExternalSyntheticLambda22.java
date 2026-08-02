package com.squareup.cash.moneybot.views.menu;

import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.moneybot.viewmodels.MoneybotChatHistoryViewModel;
import com.squareup.cash.moneybot.viewmodels.RecentChatHistoryViewModel$Loaded;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneybotOverflowMenuViewKt$$ExternalSyntheticLambda22 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SnapshotStateMap f$0;

    public /* synthetic */ MoneybotOverflowMenuViewKt$$ExternalSyntheticLambda22(SnapshotStateMap snapshotStateMap, int i) {
        this.$r8$classId = i;
        this.f$0 = snapshotStateMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        SnapshotStateMap snapshotStateMap = this.f$0;
        switch (i) {
            case 0:
                RecentChatHistoryViewModel$Loaded.Session session = (RecentChatHistoryViewModel$Loaded.Session) obj;
                session.getClass();
                String str = session.sessionId;
                Integer num = (Integer) snapshotStateMap.get(str);
                return Boxes$$ExternalSyntheticOutline1.m(num != null ? num.intValue() : 0, str, "-");
            default:
                MoneybotChatHistoryViewModel.Content.Session session2 = (MoneybotChatHistoryViewModel.Content.Session) obj;
                session2.getClass();
                String str2 = session2.sessionId;
                Integer num2 = (Integer) snapshotStateMap.get(str2);
                return Boxes$$ExternalSyntheticOutline1.m(num2 != null ? num2.intValue() : 0, str2, "-");
        }
    }
}
