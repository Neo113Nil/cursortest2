package com.squareup.cash.borrow.views;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.ButtonKt$Button$2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalContext;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import com.squareup.cash.R;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel;
import com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt;
import com.squareup.cash.pools.viewmodels.PoolListSection;
import com.squareup.cash.pools.viewmodels.PoolMemberListViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final class BorrowHomeOverlayKt$Overlay$contentWithLocals$1 implements Function3 {
    public final /* synthetic */ Object $compositionLocalContext;
    public final /* synthetic */ Object $content;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BorrowHomeOverlayKt$Overlay$contentWithLocals$1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.$compositionLocalContext = obj;
        this.$content = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object obj4 = this.$content;
        Object obj5 = this.$compositionLocalContext;
        switch (i) {
            case 0:
                BorrowHomeOverlayViewModel borrowHomeOverlayViewModel = (BorrowHomeOverlayViewModel) obj;
                Composer composer = (Composer) obj2;
                ((Number) obj3).intValue();
                borrowHomeOverlayViewModel.getClass();
                Updater.CompositionLocalProvider((CompositionLocalContext) obj5, Expect_jvmKt.rememberComposableLambda(1294301051, new ButtonKt$Button$2.AnonymousClass1((ComposableLambdaImpl) obj4, borrowHomeOverlayViewModel, 12), composer), composer, 48);
                break;
            case 1:
                ((Number) obj3).intValue();
                ((AnimatedVisibilityScope) obj).getClass();
                MoneybotHomeViewKt.WidgetCard(null, (MoneybotHomeViewModel.WidgetCard) obj5, (Function1) obj4, false, (Composer) obj2, 0, 9);
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue = ((Number) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer2;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    PoolMemberListViewModel poolMemberListViewModel = (PoolMemberListViewModel) obj4;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer, ((PoolListSection.PoolListPerson) obj5).isRequestInFlight ? poolMemberListViewModel.isOwner ? R.string.pools_removing_people_button_title : R.string.pools_leaving_button_title : poolMemberListViewModel.isOwner ? R.string.pools_remove_people_button_title : R.string.pools_leave_button_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
