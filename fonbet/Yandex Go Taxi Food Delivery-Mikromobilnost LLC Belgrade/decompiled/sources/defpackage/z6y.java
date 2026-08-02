package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.b;
import androidx.compose.foundation.pager.d;
import java.util.List;
import kotlin.Pair;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class z6y implements j1t0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ wkp0 b;
    public final /* synthetic */ Object c;

    public z6y(d dVar, y740 y740Var, v890 v890Var) {
        this.b = dVar;
        this.c = y740Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c4, code lost:
    
        if (java.lang.Math.abs(r10) <= java.lang.Math.abs(r9)) goto L91;
     */
    @Override // defpackage.j1t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f) {
        int i = this.a;
        Object obj = this.c;
        wkp0 wkp0Var = this.b;
        switch (i) {
            case 0:
                b bVar = (b) wkp0Var;
                List list = bVar.j().k;
                k1t0 k1t0Var = (k1t0) obj;
                int size = list.size();
                float f2 = Float.NEGATIVE_INFINITY;
                float f3 = Float.POSITIVE_INFINITY;
                for (int i2 = 0; i2 < size; i2++) {
                    n6y n6yVar = (n6y) list.get(i2);
                    u5y u5yVar = n6yVar instanceof u5y ? (u5y) n6yVar : null;
                    if (u5yVar == null || !u5yVar.f()) {
                        s6y j = bVar.j();
                        int e = (int) (j.o == Orientation.Vertical ? j.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD : j.e() >> 32);
                        int i3 = -bVar.j().l;
                        int i4 = bVar.j().p;
                        int i5 = ((t6y) n6yVar).p;
                        int i6 = ((t6y) n6yVar).o;
                        int i7 = bVar.j().n;
                        float c = i6 - k1t0Var.c(e, i5, i3, i4);
                        if (c <= 0.0f && c > f2) {
                            f2 = c;
                        }
                        if (c >= 0.0f && c < f3) {
                            f3 = c;
                        }
                    }
                }
                char c2 = Math.abs(f) < ((s6y) bVar.f.getValue()).i.w0(400.0f) ? (char) 0 : f > 0.0f ? (char) 1 : (char) 2;
                if (c2 == 0) {
                    break;
                } else {
                    if (c2 != 1) {
                        if (c2 != 2) {
                            f2 = 0.0f;
                        }
                    }
                    f2 = f3;
                }
                if (f2 == Float.POSITIVE_INFINITY || f2 == Float.NEGATIVE_INFINITY) {
                    return 0.0f;
                }
                return f2;
            default:
                d dVar = (d) wkp0Var;
                k1t0 k1t0Var2 = dVar.n().n;
                List list2 = dVar.n().a;
                int size2 = list2.size();
                float f4 = Float.NEGATIVE_INFINITY;
                float f5 = Float.POSITIVE_INFINITY;
                for (int i8 = 0; i8 < size2; i8++) {
                    c790 c790Var = (c790) list2.get(i8);
                    int i9 = h6u0.i(dVar.n());
                    int i10 = -dVar.n().f;
                    int i11 = dVar.n().d;
                    int i12 = dVar.n().b;
                    int i13 = ((da10) c790Var).j;
                    dVar.o();
                    float c3 = i13 - k1t0Var2.c(i9, i12, i10, i11);
                    if (c3 <= 0.0f && c3 > f4) {
                        f4 = c3;
                    }
                    if (c3 >= 0.0f && c3 < f5) {
                        f5 = c3;
                    }
                }
                if (f4 == Float.NEGATIVE_INFINITY) {
                    f4 = f5;
                }
                if (f5 == Float.POSITIVE_INFINITY) {
                    f5 = f4;
                }
                if (!dVar.b()) {
                    if (dr31.b(dVar, f)) {
                        f4 = 0.0f;
                        f5 = 0.0f;
                    } else {
                        f5 = 0.0f;
                    }
                }
                if (!dVar.e()) {
                    f4 = 0.0f;
                    if (!dr31.b(dVar, f)) {
                        f5 = 0.0f;
                    }
                }
                Pair pair = new Pair(Float.valueOf(f4), Float.valueOf(f5));
                float floatValue = ((Number) pair.getFirst()).floatValue();
                float floatValue2 = ((Number) pair.getSecond()).floatValue();
                float floatValue3 = ((Number) ((y740) obj).invoke(Float.valueOf(f), Float.valueOf(floatValue), Float.valueOf(floatValue2))).floatValue();
                if (floatValue3 != floatValue && floatValue3 != floatValue2 && floatValue3 != 0.0f) {
                    lxv.c("Final Snapping Offset Should Be one of " + floatValue + Extension.FIX_SPACE + floatValue2 + " or 0.0");
                }
                if (floatValue3 == Float.POSITIVE_INFINITY || floatValue3 == Float.NEGATIVE_INFINITY) {
                    return 0.0f;
                }
                return floatValue3;
        }
    }

    @Override // defpackage.j1t0
    public final float b(float f, float f2) {
        int i = this.a;
        wkp0 wkp0Var = this.b;
        switch (i) {
            case 0:
                float abs = Math.abs(f2);
                List list = ((b) wkp0Var).j().k;
                if (!list.isEmpty()) {
                    int size = list.size();
                    int size2 = list.size();
                    int i2 = 0;
                    while (r1 < size2) {
                        i2 += ((t6y) ((n6y) list.get(r1))).p;
                        r1++;
                    }
                    r1 = i2 / size;
                }
                float f3 = abs - r1;
                return Math.signum(f2) * (f3 >= 0.0f ? f3 : 0.0f);
            default:
                d dVar = (d) wkp0Var;
                int p = dVar.p();
                oz40 oz40Var = dVar.m;
                int i3 = ((s890) oz40Var.getValue()).c + p;
                if (i3 == 0) {
                    return 0.0f;
                }
                int i4 = dVar.e;
                if (f < 0.0f) {
                    i4++;
                }
                int d = y6i0.d(((int) (f2 / i3)) + i4, 0, dVar.o());
                dVar.p();
                int i5 = ((s890) oz40Var.getValue()).c;
                long j = i4;
                long j2 = j - 1;
                if (j2 < 0) {
                    j2 = 0;
                }
                int i6 = (int) j2;
                long j3 = j + 1;
                if (j3 > 2147483647L) {
                    j3 = 2147483647L;
                }
                int abs2 = Math.abs((y6i0.d(y6i0.d(d, i6, (int) j3), 0, dVar.o()) - i4) * i3) - i3;
                r1 = abs2 >= 0 ? abs2 : 0;
                if (r1 == 0) {
                    return r1;
                }
                return Math.signum(f) * r1;
        }
    }

    public z6y(b bVar, k1t0 k1t0Var) {
        this.b = bVar;
        this.c = k1t0Var;
    }
}
