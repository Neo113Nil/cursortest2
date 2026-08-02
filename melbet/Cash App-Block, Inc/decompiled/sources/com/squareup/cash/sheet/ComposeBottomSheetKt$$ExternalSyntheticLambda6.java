package com.squareup.cash.sheet;

import androidx.paging.PageFetcher$generateNewPagingSource$3;
import com.squareup.cash.arcade.treehouse.BottomSheetBinding;
import com.squareup.cash.ui.BottomSheetStateListener;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class ComposeBottomSheetKt$$ExternalSyntheticLambda6 implements BottomSheetStateListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ComposeBottomSheetKt$$ExternalSyntheticLambda6(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.squareup.cash.ui.BottomSheetStateListener
    public final void onBottomSheetStateChange(BottomSheetState bottomSheetState) {
        PageFetcher$generateNewPagingSource$3 pageFetcher$generateNewPagingSource$3;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj;
                bottomSheetState.getClass();
                if (bottomSheetState == BottomSheetState.USER_HIDDEN) {
                    function0.invoke();
                    break;
                }
                break;
            default:
                BottomSheetBinding bottomSheetBinding = (BottomSheetBinding) obj;
                bottomSheetState.getClass();
                if (bottomSheetState == BottomSheetState.USER_HIDDEN && bottomSheetBinding.overlaySession != null && (pageFetcher$generateNewPagingSource$3 = bottomSheetBinding.onUserHidden) != null) {
                    pageFetcher$generateNewPagingSource$3.invoke();
                    break;
                }
                break;
        }
    }
}
