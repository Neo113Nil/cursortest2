package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class x4c implements zme, ese, vo51, p0m, q0k0, m131, sxy, e3t0, m8j0, e1d, wxr, fw5, s77, nhe, ams {
    public final /* synthetic */ int a;
    public static final uo5 b = new uo5(-1.0f, -1.0f);
    public static final uo5 c = new uo5(0.0f, -1.0f);
    public static final uo5 w = new uo5(1.0f, -1.0f);
    public static final uo5 x = new uo5(-1.0f, 0.0f);
    public static final uo5 y = new uo5(0.0f, 0.0f);
    public static final uo5 z = new uo5(1.0f, 0.0f);
    public static final uo5 A = new uo5(-1.0f, 1.0f);
    public static final uo5 B = new uo5(0.0f, 1.0f);
    public static final uo5 C = new uo5(1.0f, 1.0f);
    public static final to5 D = new to5(-1.0f);
    public static final to5 E = new to5(0.0f);
    public static final to5 F = new to5(1.0f);
    public static final so5 G = new so5(-1.0f);
    public static final so5 H = new so5(0.0f);
    public static final so5 I = new so5(1.0f);
    public static final x4c J = new x4c(2);
    public static final /* synthetic */ x4c K = new x4c(3);
    public static final x4c L = new x4c(4);
    public static final x4c M = new x4c(5);
    public static final x4c N = new x4c(7);
    public static final x4c O = new x4c(8);
    public static final x4c P = new x4c(9);
    public static final x4c Q = new x4c(10);
    public static final /* synthetic */ x4c R = new x4c(11);
    public static final hay S = new hay(7);
    public static final x4c T = new x4c(12);
    public static final x4c U = new x4c(13);
    public static final x4c V = new x4c(14);
    public static final /* synthetic */ x4c W = new x4c(15);

    public /* synthetic */ x4c(int i) {
        this.a = i;
    }

    public static void e(String str, Throwable th, Object obj, List list) {
        String X;
        boolean isEmpty = list.isEmpty();
        if (isEmpty) {
            X = null;
        } else {
            if (isEmpty) {
                w511.b();
                return;
            }
            X = a.X(list, "", null, null, new dsg(16), 30);
        }
        if (th == null) {
            trp0 trp0Var = trp0.a;
            trp0.e(new mqp0(str, X, obj));
        } else {
            trp0 trp0Var2 = trp0.a;
            trp0.e(new jqp0(th, str, obj, X));
        }
    }

    public static /* synthetic */ void g(String str, Throwable th, Object obj, List list, int i) {
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        if ((i & 8) != 0) {
            list = EmptyList.a;
        }
        e(str, th, obj, list);
    }

    public static void h(String str, srp0[] srp0VarArr, String str2, int i) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        e(str, null, str2, j73.d0(srp0VarArr));
    }

    public static long n(float f, float f2, float f3, int i) {
        int i2 = ldc.n;
        androidx.compose.ui.graphics.colorspace.a aVar = wgc.e;
        if (0.0f > f || f > 360.0f || 0.0f > f2 || f2 > 1.0f || 0.0f > f3 || f3 > 1.0f) {
            StringBuilder k = oo31.k("HSL (", f, Extension.FIX_SPACE, f2, Extension.FIX_SPACE);
            k.append(f3);
            k.append(") must be in range (0..360, 0..1, 0..1)");
            hxv.a(k.toString());
        }
        return rzo.c(o(f, f2, f3, 0), o(f, f2, f3, 8), o(f, f2, f3, 4), 1.0f, aVar);
    }

    public static float o(float f, float f2, float f3, int i) {
        float f4 = ((f / 30.0f) + i) % 12.0f;
        return f3 - (Math.max(-1.0f, Math.min(f4 - 3.0f, Math.min(9.0f - f4, 1.0f))) * (Math.min(f3, 1.0f - f3) * f2));
    }

    @Override // defpackage.sxy
    public Drawable a(Drawable drawable) {
        return drawable;
    }

    @Override // defpackage.s77
    public byte[] b(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // defpackage.p0m
    public o0m c() {
        return new ngd0(23);
    }

    @Override // defpackage.ams
    public Object d(jje jjeVar, inj injVar) {
        int lastIndexOf;
        long j;
        boolean z2 = false;
        switch (this.a) {
            case 25:
                if (injVar.c != 1) {
                    throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"empty\" requires 1 argument but "));
                }
                Object obj = injVar.a[0];
                if (obj instanceof String) {
                    if (((CharSequence) obj).length() == 0) {
                        z2 = true;
                    }
                } else if (obj instanceof List) {
                    z2 = ((List) obj).isEmpty();
                } else {
                    if (!(obj instanceof Map)) {
                        throw oyr.y(obj, "Function \"empty\" is not defined for ");
                    }
                    z2 = ((Map) obj).isEmpty();
                }
                return Boolean.valueOf(z2);
            case 26:
                if (injVar.c == 1) {
                    return ihb1.p(injVar.a[0]);
                }
                throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"trimstart\" requires 1 argument but "));
            case 27:
                if (injVar.c != 1) {
                    throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"clone\" requires 1 argument but "));
                }
                Object obj2 = injVar.a[0];
                if (!(obj2 instanceof List) && !(obj2 instanceof Map)) {
                    throw jason.statham.interpreter.error.a.a("Function \"clone\" is not defined for ".concat(rhb1.e(obj2)));
                }
                return qje.f(obj2);
            case 28:
                if (injVar.c == 1) {
                    return nrb1.i(injVar.a[0]);
                }
                throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"str\" requires 1 argument but "));
            default:
                if (injVar.c != 2) {
                    throw oyr.x(injVar.c, " arguments passed", new StringBuilder("Function \"lastindex\" requires 2 argument but "));
                }
                Object[] objArr = injVar.a;
                Object obj3 = objArr[0];
                Object obj4 = objArr[1];
                if (obj3 instanceof String) {
                    j = -1;
                    if (obj4 instanceof String) {
                        if (((CharSequence) obj4).length() == 0) {
                            lastIndexOf = ((String) obj3).length() - 1;
                        } else {
                            CharSequence charSequence = (CharSequence) obj3;
                            if (charSequence.length() != 0) {
                                lastIndexOf = evu0.L((String) obj4, charSequence, 6);
                            }
                        }
                    }
                    return Long.valueOf(j);
                }
                if (!(obj3 instanceof List)) {
                    throw jason.statham.interpreter.error.a.a("Function \"lastindex\" is not defined for " + rhb1.e(obj3) + Extension.FIX_SPACE + rhb1.e(obj4));
                }
                lastIndexOf = ((List) obj3).lastIndexOf(obj4);
                j = lastIndexOf;
                return Long.valueOf(j);
        }
    }

    @Override // defpackage.e3t0
    public boolean f(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.m8j0
    public String i() {
        return "Expired local ttl";
    }

    @Override // defpackage.nhe
    public long j(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        int i = blm0.a;
        return floatToRawIntBits;
    }

    @Override // defpackage.e1d
    public Object k(yuf0 yuf0Var) {
        return new zl91((qk20) yuf0Var.a(qk20.class));
    }

    @Override // defpackage.zme
    public Object l(Object obj) {
        rvj0 rvj0Var = (rvj0) obj;
        try {
            yp6 yp6Var = new yp6();
            rvj0Var.source().y0(yp6Var);
            return rvj0.create(rvj0Var.contentType(), rvj0Var.contentLength(), yp6Var);
        } finally {
            rvj0Var.close();
        }
    }

    public hxk m(Context context) {
        hxk hxkVar = hxk.d;
        if (hxkVar != null) {
            return hxkVar;
        }
        synchronized (this) {
            hxk hxkVar2 = hxk.d;
            if (hxkVar2 != null) {
                return hxkVar2;
            }
            hxk hxkVar3 = new hxk(context, hxk.c);
            hxk.d = hxkVar3;
            return hxkVar3;
        }
    }

    public String toString() {
        switch (this.a) {
            case 10:
                return "NeverEqualPolicy";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.m131
    public Object x(com.airbnb.lottie.parser.moshi.a aVar, float f) {
        return Integer.valueOf(Math.round(yex.d(aVar) * f));
    }
}
