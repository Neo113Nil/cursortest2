package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* loaded from: classes.dex */
public final class tcd extends wx6 {
    public final Handler d;
    public final int e;
    public final long f;
    public Bitmap g;

    public tcd(Handler handler, int i, long j) {
        this.d = handler;
        this.e = i;
        this.f = j;
    }

    @Override // defpackage.j6s
    public final void d(Object obj) {
        this.g = (Bitmap) obj;
        Handler handler = this.d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f);
    }

    @Override // defpackage.j6s
    public final void g(Drawable drawable) {
        this.g = null;
    }
}
