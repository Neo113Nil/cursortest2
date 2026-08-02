package defpackage;

import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import androidx.media3.exoplayer.video.a;
import androidx.media3.exoplayer.video.b;

/* loaded from: classes.dex */
public final class ckh implements Handler.Callback {
    public final /* synthetic */ int a = 0;
    public final Handler b;
    public final /* synthetic */ at2 c;

    public ckh(b bVar, iih iihVar) {
        this.c = bVar;
        Handler p = dvt.p(this);
        this.b = p;
        iihVar.o(this, p);
    }

    public void a(long j) {
        Surface surface;
        a aVar = (a) this.c;
        if (this != aVar.Q1 || aVar.L == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            aVar.c1 = true;
            return;
        }
        try {
            dxr dxrVar = aVar.l1;
            aVar.D0(j);
            tcu tcuVar = aVar.L1;
            if (!tcuVar.equals(tcu.d) && !tcuVar.equals(aVar.M1)) {
                aVar.M1 = tcuVar;
                dxrVar.i(tcuVar);
            }
            aVar.e1.e++;
            if (aVar.o1.e() && (surface = aVar.y1) != null) {
                dxrVar.g(surface);
                aVar.B1 = true;
            }
            aVar.l0(j);
        } catch (pqb e) {
            aVar.d1 = e;
        }
    }

    public void b(long j) {
        Surface surface;
        b bVar = (b) this.c;
        if (this != bVar.Y1 || bVar.G == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            bVar.g1 = true;
            return;
        }
        try {
            dxr dxrVar = bVar.t1;
            bVar.E0(j);
            tcu tcuVar = bVar.T1;
            if (!tcuVar.equals(tcu.d) && !tcuVar.equals(bVar.U1)) {
                bVar.U1 = tcuVar;
                dxrVar.i(tcuVar);
            }
            bVar.h1.e++;
            if (bVar.w1.e() && (surface = bVar.G1) != null) {
                dxrVar.g(surface);
                bVar.J1 = true;
            }
            bVar.m0(j);
        } catch (pqb e) {
            bVar.x0 = e;
        }
    }

    public final void c(long j) {
        switch (this.a) {
            case 0:
                if (dvt.a >= 30) {
                    a(j);
                    break;
                } else {
                    Handler handler = this.b;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    break;
                }
            default:
                if (dvt.a >= 30) {
                    b(j);
                    break;
                } else {
                    Handler handler2 = this.b;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    break;
                }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                if (message.what == 0) {
                    int i = message.arg1;
                    int i2 = message.arg2;
                    int i3 = dvt.a;
                    a((i2 & 4294967295L) | ((i & 4294967295L) << 32));
                    break;
                } else {
                    break;
                }
            default:
                if (message.what == 0) {
                    int i4 = message.arg1;
                    int i5 = message.arg2;
                    int i6 = dvt.a;
                    b((i5 & 4294967295L) | ((i4 & 4294967295L) << 32));
                    break;
                } else {
                    break;
                }
        }
        return true;
    }

    public ckh(a aVar, iih iihVar) {
        this.c = aVar;
        Handler p = dvt.p(this);
        this.b = p;
        iihVar.o(this, p);
    }
}
