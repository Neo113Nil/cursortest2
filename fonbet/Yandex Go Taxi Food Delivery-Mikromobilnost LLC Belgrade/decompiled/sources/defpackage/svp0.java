package defpackage;

import com.yandex.mapkit.ScreenRect;

/* loaded from: classes14.dex */
public interface svp0 {
    void attach();

    void b9(ScreenRect screenRect);

    void detach();

    default yx01 p6() {
        return new rvp0(this, 1);
    }

    void pause();

    void resume();

    default yx01 s5() {
        return new rvp0(this, 0);
    }

    default void setVisible(boolean z) {
    }
}
