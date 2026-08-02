package defpackage;

import android.view.View;
import com.yandex.div.core.view2.divs.widgets.a;
import com.yandex.div2.DivBorder;

/* loaded from: classes.dex */
public interface ugk {
    a getDivBorderDrawer();

    boolean getNeedClipping();

    default void invalidateBorder() {
        a divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.g();
        }
    }

    default void releaseBorderDrawer() {
        a divBorderDrawer = getDivBorderDrawer();
        if (divBorderDrawer != null) {
            divBorderDrawer.closeAllSubscription();
        }
    }

    void setBorder(aw5 aw5Var, DivBorder divBorder, View view);

    void setNeedClipping(boolean z);
}
