package defpackage;

import androidx.compose.foundation.gestures.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class iyo {
    public mxo a;
    public qg0 b;
    public jic c;
    public bxj d;
    public boolean e;
    public cyi f;
    public final kgk g;
    public boolean h;
    public int i = 1;
    public rwo j = a.a;
    public final hyo k = new hyo(this);
    public final hxo l = new hxo(1, this);

    public iyo(mxo mxoVar, qg0 qg0Var, jic jicVar, bxj bxjVar, boolean z, cyi cyiVar, kgk kgkVar) {
        this.a = mxoVar;
        this.b = qg0Var;
        this.c = jicVar;
        this.d = bxjVar;
        this.e = z;
        this.f = cyiVar;
        this.g = kgkVar;
    }

    public static final long a(iyo iyoVar, rwo rwoVar, long j, int i) {
        gyi gyiVar = iyoVar.f.a;
        gyi gyiVar2 = null;
        gyi gyiVar3 = (gyiVar == null || !gyiVar.n) ? null : (gyi) q7g.F(gyiVar);
        long x = gyiVar3 != null ? gyiVar3.x(i, j) : 0L;
        long g = enj.g(j, x);
        long d = iyoVar.d(iyoVar.g(rwoVar.a(iyoVar.f(iyoVar.d(enj.a(0.0f, 0.0f, iyoVar.d == bxj.b ? 1 : 2, g))))));
        long g2 = enj.g(g, d);
        gyi gyiVar4 = iyoVar.f.a;
        if (gyiVar4 != null && gyiVar4.n) {
            gyiVar2 = (gyi) q7g.F(gyiVar4);
        }
        gyi gyiVar5 = gyiVar2;
        return enj.h(enj.h(x, d), gyiVar5 != null ? gyiVar5.K(i, d, g2) : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, cg6 cg6Var) {
        fyo fyoVar;
        int i;
        iyo iyoVar;
        wqn wqnVar;
        if (cg6Var instanceof fyo) {
            fyoVar = (fyo) cg6Var;
            int i2 = fyoVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fyoVar.n = i2 - Integer.MIN_VALUE;
                Object obj = fyoVar.l;
                nm6 nm6Var = nm6.a;
                i = fyoVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    wqn wqnVar2 = new wqn();
                    wqnVar2.a = j;
                    this.h = true;
                    hqi hqiVar = hqi.a;
                    gyo gyoVar = new gyo(this, wqnVar2, j, null);
                    fyoVar.j = this;
                    fyoVar.k = wqnVar2;
                    fyoVar.n = 1;
                    if (e(hqiVar, gyoVar, fyoVar) == nm6Var) {
                        return nm6Var;
                    }
                    iyoVar = this;
                    wqnVar = wqnVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wqnVar = fyoVar.k;
                    iyoVar = fyoVar.j;
                    qgg.h0(obj);
                }
                iyoVar.h = false;
                return new yzt(wqnVar.a);
            }
        }
        fyoVar = new fyo(this, cg6Var);
        Object obj2 = fyoVar.l;
        nm6 nm6Var2 = nm6.a;
        i = fyoVar.n;
        if (i != 0) {
        }
        iyoVar.h = false;
        return new yzt(wqnVar.a);
    }

    public final float c(float f) {
        return this.e ? f * (-1) : f;
    }

    public final long d(long j) {
        return this.e ? enj.i(-1.0f, j) : j;
    }

    public final Object e(hqi hqiVar, Function2 function2, cg6 cg6Var) {
        Object a = this.a.a(hqiVar, new kun(this, function2, null, 11), cg6Var);
        return a == nm6.a ? a : Unit.a;
    }

    public final float f(long j) {
        return Float.intBitsToFloat((int) (this.d == bxj.b ? j >> 32 : j & 4294967295L));
    }

    public final long g(float f) {
        long floatToRawIntBits;
        long j;
        if (f == 0.0f) {
            return 0L;
        }
        if (this.d == bxj.b) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(f);
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits = Float.floatToRawIntBits(f);
            j = floatToRawIntBits3 << 32;
        }
        return j | (floatToRawIntBits & 4294967295L);
    }
}
