package defpackage;

import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.Choreographer;

/* loaded from: classes5.dex */
public final class ffc {
    public final bai a;
    public int f;
    public boolean d = true;
    public final SparseArray e = new SparseArray();
    public final Handler g = new Handler(Looper.getMainLooper());
    public final long b = 2000;
    public boolean c = false;

    public ffc(bai baiVar) {
        this.a = baiVar;
    }

    public final void a(long j, String str) {
        this.e.clear();
        nkk nkkVar = new nkk(j);
        this.c = true;
        Choreographer.getInstance().postFrameCallback(new efc(this, nkkVar, str));
    }

    public final void b(hvo hvoVar) {
        int i = hvoVar.e;
        this.f = i * i;
        int i2 = hvoVar.a() == 5 ? (hvoVar.b & 65280) >> 8 : 0;
        int i3 = hvoVar.c[i2];
        PointF pointF = hvoVar.d[i2];
        this.e.put(i3, new PointF(pointF.x, pointF.y));
    }
}
