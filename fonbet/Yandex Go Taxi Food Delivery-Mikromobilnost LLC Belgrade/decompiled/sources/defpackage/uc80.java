package defpackage;

import android.view.View;

/* loaded from: classes14.dex */
public interface uc80 extends r330 {
    int anchoredHeight();

    View asModalView();

    void forceAnchor();

    void forceCollapse();

    boolean interceptOnBackPressed();

    void pauseShortcuts();

    void resumeShortcuts();

    void show(int i);
}
