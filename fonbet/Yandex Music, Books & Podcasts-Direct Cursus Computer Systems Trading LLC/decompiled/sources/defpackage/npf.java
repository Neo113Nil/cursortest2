package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class npf {
    public final ksk a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public n40 h;
    public final /* synthetic */ int j;
    public boolean b = true;
    public final HashMap i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public npf(n40 n40Var, int i) {
        this.j = i;
        this.a = (ksk) n40Var;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [ezc, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r3v6, types: [ksk, n40] */
    public static final void a(npf npfVar, v2e v2eVar, int i, f8j f8jVar) {
        HashMap hashMap = npfVar.i;
        float f = i;
        long floatToRawIntBits = Float.floatToRawIntBits(f) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f) & 4294967295L;
        while (true) {
            long j = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (npfVar.j) {
                    case 0:
                        tzj tzjVar = f8jVar.F;
                        if (tzjVar != null) {
                            j = tzjVar.d(j, false);
                        }
                        j = xv.O(j, f8jVar.w);
                        break;
                    default:
                        vwg Z0 = f8jVar.Z0();
                        Z0.getClass();
                        long j2 = Z0.m;
                        j = enj.h((Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
                        break;
                }
                f8jVar = f8jVar.n;
                f8jVar.getClass();
                if (f8jVar.equals(npfVar.a.D())) {
                    int round = Math.round(v2eVar instanceof v2e ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j >> 32)));
                    if (hashMap.containsKey(v2eVar)) {
                        int intValue = ((Number) uah.c(v2eVar, hashMap)).intValue();
                        v2e v2eVar2 = j40.a;
                        round = ((Number) v2eVar.a.invoke(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(v2eVar, Integer.valueOf(round));
                    return;
                }
            } while (!npfVar.b(f8jVar).containsKey(v2eVar));
            float c = npfVar.c(f8jVar, v2eVar);
            long floatToRawIntBits3 = Float.floatToRawIntBits(c);
            long floatToRawIntBits4 = Float.floatToRawIntBits(c);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(f8j f8jVar) {
        switch (this.j) {
            case 0:
                return f8jVar.K0().b();
            default:
                vwg Z0 = f8jVar.Z0();
                Z0.getClass();
                return Z0.K0().b();
        }
    }

    public final int c(f8j f8jVar, v2e v2eVar) {
        switch (this.j) {
            case 0:
                return f8jVar.Y(v2eVar);
            default:
                vwg Z0 = f8jVar.Z0();
                Z0.getClass();
                return Z0.Y(v2eVar);
        }
    }

    public final boolean d() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean e() {
        h();
        return this.h != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ksk, n40] */
    public final void f() {
        this.b = true;
        ?? r0 = this.a;
        n40 c = r0.c();
        if (c == null) {
            return;
        }
        if (this.c) {
            c.X();
        } else if (this.e || this.d) {
            c.requestLayout();
        }
        if (this.f) {
            r0.X();
        }
        if (this.g) {
            r0.requestLayout();
        }
        c.b().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ksk, n40] */
    public final void g() {
        HashMap hashMap = this.i;
        hashMap.clear();
        m40 m40Var = new m40(0, this);
        ?? r2 = this.a;
        r2.R(m40Var);
        hashMap.putAll(b(r2.D()));
        this.b = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [ksk, n40] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        npf b;
        npf b2;
        boolean d = d();
        ?? r1 = this.a;
        n40 n40Var = r1;
        if (!d) {
            n40 c = r1.c();
            if (c == null) {
                return;
            }
            n40 n40Var2 = c.b().h;
            if (n40Var2 != null) {
                boolean d2 = n40Var2.b().d();
                n40Var = n40Var2;
            }
            n40 n40Var3 = this.h;
            if (n40Var3 == null || n40Var3.b().d()) {
                return;
            }
            n40 c2 = n40Var3.c();
            if (c2 != null && (b2 = c2.b()) != null) {
                b2.h();
            }
            n40 c3 = n40Var3.c();
            n40Var = (c3 == null || (b = c3.b()) == null) ? null : b.h;
        }
        this.h = n40Var;
    }
}
