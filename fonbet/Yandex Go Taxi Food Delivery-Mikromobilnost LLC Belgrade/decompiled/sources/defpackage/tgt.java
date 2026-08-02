package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* loaded from: classes10.dex */
public final class tgt extends xlf {
    public final Handler w;
    public final int x;
    public final long y;
    public Bitmap z;

    public tgt(Handler handler, int i, long j) {
        this.w = handler;
        this.x = i;
        this.y = j;
    }

    @Override // defpackage.iax0
    public final void onLoadCleared(Drawable drawable) {
        this.z = null;
    }

    @Override // defpackage.iax0
    public final void onResourceReady(Object obj, xx01 xx01Var) {
        this.z = (Bitmap) obj;
        Handler handler = this.w;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.y);
    }
}
