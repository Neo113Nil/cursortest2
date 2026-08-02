package defpackage;

import android.webkit.SslErrorHandler;

/* loaded from: classes2.dex */
public final class zmf implements rt41, ui51 {
    public final /* synthetic */ SslErrorHandler a;

    @Override // defpackage.rt41
    public void l() {
        this.a.proceed();
    }

    @Override // defpackage.rt41
    public void onCanceled() {
        this.a.cancel();
    }
}
