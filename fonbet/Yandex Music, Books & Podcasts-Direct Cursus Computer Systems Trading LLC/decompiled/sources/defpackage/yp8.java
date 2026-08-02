package defpackage;

import android.view.View;

/* loaded from: classes3.dex */
public interface yp8 {
    void g(e23 e23Var, op8 op8Var, View view);

    tp8 getDivBorderDrawer();

    boolean getNeedClipping();

    default void k() {
        tp8 divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.h();
        }
    }

    default void m() {
        tp8 divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.l();
        }
    }

    void setNeedClipping(boolean z);
}
