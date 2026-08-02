package defpackage;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.a;

/* loaded from: classes10.dex */
public abstract class xlf implements iax0 {
    public final int a;
    public final int b;
    public e5j0 c;

    public xlf() {
        if (!pw21.m(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            ny61.g("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
            throw null;
        }
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
    }

    @Override // defpackage.iax0
    public final e5j0 getRequest() {
        return this.c;
    }

    @Override // defpackage.iax0
    public final void getSize(ojs0 ojs0Var) {
        ((a) ojs0Var).onSizeReady(this.a, this.b);
    }

    @Override // defpackage.hey
    public final void onDestroy() {
    }

    @Override // defpackage.iax0
    public void onLoadFailed(Drawable drawable) {
    }

    @Override // defpackage.iax0
    public final void onLoadStarted(Drawable drawable) {
    }

    @Override // defpackage.hey
    public final void onStart() {
    }

    @Override // defpackage.hey
    public final void onStop() {
    }

    @Override // defpackage.iax0
    public final void removeCallback(ojs0 ojs0Var) {
    }

    @Override // defpackage.iax0
    public final void setRequest(e5j0 e5j0Var) {
        this.c = e5j0Var;
    }
}
