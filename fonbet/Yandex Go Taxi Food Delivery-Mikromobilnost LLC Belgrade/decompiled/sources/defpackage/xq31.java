package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes9.dex */
public final class xq31 implements g18 {
    public final /* synthetic */ ViewTreeObserver a;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener b;
    public final /* synthetic */ View c;

    public xq31(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener, View view) {
        this.a = viewTreeObserver;
        this.b = onPreDrawListener;
        this.c = view;
    }

    @Override // defpackage.g18
    public final void cancel() {
        ViewTreeObserver viewTreeObserver = this.a;
        boolean isAlive = viewTreeObserver.isAlive();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.b;
        if (isAlive) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
        } else {
            this.c.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
    }
}
