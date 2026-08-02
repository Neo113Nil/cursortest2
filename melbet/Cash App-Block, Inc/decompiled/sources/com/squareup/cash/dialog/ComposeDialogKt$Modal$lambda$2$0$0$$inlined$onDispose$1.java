package com.squareup.cash.dialog;

import androidx.compose.runtime.DisposableEffectResult;
import com.squareup.cash.overlays.OverlayLayer;

/* loaded from: classes6.dex */
public final class ComposeDialogKt$Modal$lambda$2$0$0$$inlined$onDispose$1 implements DisposableEffectResult {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ OverlayLayer.Session $session$inlined;

    public /* synthetic */ ComposeDialogKt$Modal$lambda$2$0$0$$inlined$onDispose$1(OverlayLayer.Session session, int i) {
        this.$r8$classId = i;
        this.$session$inlined = session;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        int i = this.$r8$classId;
        OverlayLayer.Session session = this.$session$inlined;
        switch (i) {
            case 0:
                session.dismiss();
                break;
            case 1:
                if (session != null) {
                    session.dismiss();
                    break;
                }
                break;
            case 2:
                session.dismiss();
                break;
            default:
                session.dismiss();
                break;
        }
    }
}
