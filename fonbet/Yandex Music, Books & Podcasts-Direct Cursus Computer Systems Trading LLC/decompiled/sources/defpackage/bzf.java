package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.widget.Toast;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import coil.compose.ContentPainterElement;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.media.ynison.service.f;
import com.yandex.media.ynison.service.k0;
import com.yandex.media.ynison.service.v0;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class bzf {
    public final /* synthetic */ int a;

    public /* synthetic */ bzf(int i) {
        this.a = i;
    }

    public static final a4w A(t4w t4wVar) {
        t4wVar.getClass();
        return new a4w(t4wVar.a, t4wVar.t);
    }

    public static byte[] B(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = i0n.a;
        String optString = jSONObject.optString("challenge", "");
        optString.getClass();
        if (optString.length() == 0) {
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }
        byte[] decode = Base64.decode(optString, 11);
        decode.getClass();
        return decode;
    }

    public static final ArrayList C(fxe fxeVar) {
        fxeVar.getClass();
        mpf J0 = ((twg) fxeVar).J0();
        boolean F = F(J0);
        List p = J0.p();
        epi epiVar = (epi) p;
        ArrayList arrayList = new ArrayList(((eqi) epiVar.b).c);
        int size = p.size();
        for (int i = 0; i < size; i++) {
            mpf mpfVar = (mpf) epiVar.get(i);
            arrayList.add(F ? mpfVar.m() : mpfVar.n());
        }
        return arrayList;
    }

    public static final qdi D(CoroutineContext coroutineContext) {
        qdi qdiVar = (qdi) coroutineContext.get(l48.f);
        if (qdiVar != null) {
            return qdiVar;
        }
        xq0.q("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final List E(maq maqVar) {
        maqVar.getClass();
        if (maqVar instanceof jbq) {
            return ((jbq) maqVar).h.a.a.f();
        }
        if (maqVar instanceof vaq) {
            return ((vaq) maqVar).c;
        }
        if (maqVar instanceof eaq) {
            return t75.c(((eaq) maqVar).d);
        }
        if (maqVar instanceof raq) {
            raq raqVar = (raq) maqVar;
            return t75.c((qaq) raqVar.c.get(raqVar.d));
        }
        b6e.s();
        return null;
    }

    public static final boolean F(mpf mpfVar) {
        int ordinal = mpfVar.G.d.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return false;
            }
            if (ordinal != 3) {
                if (ordinal != 4) {
                    b6e.s();
                    return false;
                }
                mpf u = mpfVar.u();
                if (u != null) {
                    return F(u);
                }
                xq0.x("no parent for idle node");
                return false;
            }
        }
        return true;
    }

    public static final nyn G(nyn nynVar, n7q n7qVar) {
        nynVar.getClass();
        if (n7qVar == null) {
            return nyn.a;
        }
        nynVar.getClass();
        h4b h4bVar = new h4b();
        h4bVar.a = nynVar;
        return (nyn) wdg.A(n7qVar, h4bVar);
    }

    public static final void H(Context context) {
        context.getClass();
        context.startActivity(new Intent("android.settings.SETTINGS"));
    }

    public static final void I(Context context) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", "com.google.android.webview", null));
            context.startActivity(intent);
        } catch (Exception unused) {
            try {
                try {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(Uri.parse("market://details?id=com.google.android.webview"));
                    context.startActivity(intent2);
                } catch (Exception e) {
                    Toast.makeText(context, e.getMessage(), 1).show();
                    H(context);
                }
            } catch (ActivityNotFoundException unused2) {
                Intent intent3 = new Intent("android.intent.action.VIEW");
                intent3.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.webview"));
                context.startActivity(intent3);
            }
        }
    }

    public static f J(String str, lwk lwkVar, String str2, String str3, String str4, String str5, String str6, String str7, qwk qwkVar) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        jwk D = f.D();
        D.d();
        f.j((f) D.b, str);
        D.d();
        f.k((f) D.b, lwkVar);
        D.d();
        f.h((f) D.b, str4);
        dlr h = dlr.h(str2);
        D.d();
        f.i((f) D.b, h);
        dlr h2 = dlr.h(str3);
        D.d();
        f.l((f) D.b, h2);
        D.d();
        f.m((f) D.b, str5);
        if (str6 != null) {
            dlr h3 = dlr.h(str6);
            D.d();
            f.f((f) D.b, h3);
        }
        if (str7 != null) {
            dlr h4 = dlr.h(str7);
            D.d();
            f.g((f) D.b, h4);
        }
        if (qwkVar instanceof owk) {
            aws l = k0.l();
            owk owkVar = (owk) qwkVar;
            int i = owkVar.a;
            l.d();
            k0.g((k0) l.b, i);
            String str8 = owkVar.b;
            if (str8 != null) {
                dlr h5 = dlr.h(str8);
                l.d();
                k0.f((k0) l.b, h5);
            }
            k0 k0Var = (k0) l.b();
            D.d();
            f.n((f) D.b, k0Var);
        } else if (qwkVar instanceof pwk) {
            k4u i2 = v0.i();
            int i3 = ((pwk) qwkVar).a;
            i2.d();
            v0.f((v0) i2.b, i3);
            v0 v0Var = (v0) i2.b();
            D.d();
            f.o((f) D.b, v0Var);
        } else if (qwkVar != null) {
            b6e.s();
            return null;
        }
        return (f) D.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0308 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x035b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void K(ViewStructure viewStructure, mpf mpfVar, AutofillId autofillId, String str, znn znnVar) {
        int i;
        long j;
        long j2;
        char c;
        long j3;
        sls slsVar;
        meo meoVar;
        mn0 mn0Var;
        uf0 uf0Var;
        boolean z;
        ce6 ce6Var;
        Boolean bool;
        boolean z2;
        Integer num;
        Integer num2;
        List list;
        Integer valueOf;
        boolean z3;
        boolean z4;
        boolean z5;
        String s0;
        String[] z6;
        String[] z7;
        tpi tpiVar;
        int i2;
        int i3;
        int i4;
        tpi tpiVar2;
        sls slsVar2;
        meo meoVar2;
        mn0 mn0Var2;
        Integer num3 = 1;
        xfp xfpVar = ufp.a;
        xfp xfpVar2 = hfp.a;
        jfp w = mpfVar.w();
        int i5 = 8;
        if (w == null || (tpiVar2 = w.a) == null) {
            i = 2;
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            slsVar = null;
            meoVar = null;
            mn0Var = null;
            uf0Var = null;
            z = false;
            ce6Var = null;
            bool = null;
            z2 = false;
            num = null;
        } else {
            j = 128;
            Object[] objArr = tpiVar2.b;
            Object[] objArr2 = tpiVar2.c;
            long[] jArr = tpiVar2.a;
            j2 = 255;
            int length = jArr.length - 2;
            i = 2;
            if (length >= 0) {
                int i6 = 0;
                uf0Var = null;
                z = false;
                slsVar2 = null;
                ce6Var = null;
                bool = null;
                meoVar2 = null;
                z2 = false;
                num = null;
                mn0Var2 = null;
                c = 7;
                while (true) {
                    long j4 = jArr[i6];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        for (int i8 = 0; i8 < i7; i8++) {
                            if ((j4 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                Object obj = objArr[i9];
                                Object obj2 = objArr2[i9];
                                xfp xfpVar3 = (xfp) obj;
                                if (Intrinsics.d(xfpVar3, ufp.q)) {
                                    obj2.getClass();
                                    uf0Var = (uf0) obj2;
                                } else if (Intrinsics.d(xfpVar3, ufp.a)) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) CollectionsKt.firstOrNull((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (Intrinsics.d(xfpVar3, ufp.p)) {
                                    obj2.getClass();
                                    ce6Var = (ce6) obj2;
                                } else if (Intrinsics.d(xfpVar3, ufp.D)) {
                                    obj2.getClass();
                                    mn0Var2 = (mn0) obj2;
                                } else if (Intrinsics.d(xfpVar3, ufp.k)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (Intrinsics.d(xfpVar3, ufp.M)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (Intrinsics.d(xfpVar3, ufp.I)) {
                                    z2 = true;
                                } else if (Intrinsics.d(xfpVar3, ufp.w)) {
                                    obj2.getClass();
                                    meoVar2 = (meo) obj2;
                                } else if (Intrinsics.d(xfpVar3, ufp.G)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (Intrinsics.d(xfpVar3, ufp.H)) {
                                    obj2.getClass();
                                    slsVar2 = (sls) obj2;
                                } else if (Intrinsics.d(xfpVar3, hfp.b)) {
                                    viewStructure.setClickable(true);
                                } else if (Intrinsics.d(xfpVar3, hfp.c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (Intrinsics.d(xfpVar3, hfp.v)) {
                                    viewStructure.setFocusable(true);
                                } else if (Intrinsics.d(xfpVar3, hfp.j)) {
                                    z = true;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i7 != 8) {
                            break;
                        }
                    }
                    if (i6 == length) {
                        break;
                    } else {
                        i6++;
                    }
                }
            } else {
                c = 7;
                j3 = -9187201950435737472L;
                uf0Var = null;
                z = false;
                slsVar2 = null;
                ce6Var = null;
                bool = null;
                meoVar2 = null;
                z2 = false;
                num = null;
                mn0Var2 = null;
            }
            slsVar = slsVar2;
            meoVar = meoVar2;
            mn0Var = mn0Var2;
        }
        jfp w2 = mpfVar.w();
        if (w2 != null && w2.c && !w2.d) {
            w2 = w2.a();
            gpi gpiVar = new gpi(((eqi) ((epi) mpfVar.o()).b).c);
            gpiVar.b(mpfVar.o());
            while (true) {
                int i10 = gpiVar.b;
                if (i10 == 0) {
                    break;
                }
                mpf mpfVar2 = (mpf) gpiVar.i(i10 - 1);
                jfp w3 = mpfVar2.w();
                if (w3 != null && !w3.c) {
                    w2.m(w3);
                    if (!w3.d) {
                        gpiVar.b(mpfVar2.o());
                    }
                }
            }
        }
        if (w2 != null && (tpiVar = w2.a) != null) {
            Object[] objArr3 = tpiVar.b;
            Object[] objArr4 = tpiVar.c;
            long[] jArr2 = tpiVar.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i11 = 0;
                list = null;
                while (true) {
                    long j5 = jArr2[i11];
                    num2 = num3;
                    if ((((~j5) << c) & j5 & j3) != j3) {
                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j5 & j2) < j) {
                                int i14 = (i11 << 3) + i13;
                                Object obj3 = objArr3[i14];
                                Object obj4 = objArr4[i14];
                                i4 = i5;
                                xfp xfpVar4 = (xfp) obj3;
                                i3 = i13;
                                if (Intrinsics.d(xfpVar4, ufp.i)) {
                                    viewStructure.setEnabled(false);
                                } else if (Intrinsics.d(xfpVar4, ufp.z)) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                i3 = i13;
                                i4 = i5;
                            }
                            j5 >>= i4;
                            i13 = i3 + 1;
                            i5 = i4;
                        }
                        i2 = i5;
                        if (i12 != i2) {
                            break;
                        }
                    } else {
                        i2 = i5;
                    }
                    if (i11 == length2) {
                        break;
                    }
                    i11++;
                    i5 = i2;
                    num3 = num2;
                }
                Integer valueOf2 = Integer.valueOf(mpfVar.b);
                if (mpfVar.u() == null) {
                    valueOf2 = null;
                }
                int intValue = valueOf2 == null ? valueOf2.intValue() : -1;
                ge2.c(viewStructure, autofillId, intValue);
                viewStructure.setId(intValue, str, null, null);
                valueOf = (uf0Var == null && !z) ? slsVar == null ? Integer.valueOf(i) : null : num2;
                if (valueOf != null) {
                    ge2.d(viewStructure, valueOf.intValue());
                }
                if (ce6Var != null && (z7 = vnj.z(ce6Var)) != null) {
                    ge2.b(viewStructure, z7);
                }
                znnVar.a.f0(mpfVar.b, new lh0(4, viewStructure));
                if (bool != null) {
                    viewStructure.setSelected(bool.booleanValue());
                }
                if (slsVar != null) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(slsVar == sls.a);
                } else if (bool != null && (meoVar == null || meoVar.a != 4)) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(bool.booleanValue());
                }
                ce6.a.getClass();
                String str2 = (String) xz0.y(vnj.z(ae6.b));
                if (ce6Var != null || (z6 = vnj.z(ce6Var)) == null) {
                    z3 = true;
                } else {
                    boolean u = xz0.u(z6, str2);
                    z3 = true;
                    if (u) {
                        z4 = true;
                        z5 = (!z2 || z4) ? z3 : false;
                        if (z5) {
                            ge2.f(viewStructure);
                        }
                        viewStructure.setVisibility(((f8j) mpfVar.F.d).j1() ? 4 : 0);
                        if (list != null) {
                            int size = list.size();
                            String str3 = "";
                            for (int i15 = 0; i15 < size; i15++) {
                                str3 = dfi.i(dfi.k(str3), ((mn0) list.get(i15)).b, '\n');
                            }
                            viewStructure.setText(str3);
                            viewStructure.setClassName("android.widget.TextView");
                        }
                        if (((epi) mpfVar.o()).isEmpty() && meoVar != null && (s0 = bkp.s0(meoVar.a)) != null) {
                            viewStructure.setClassName(s0);
                        }
                        if (z) {
                            return;
                        }
                        viewStructure.setClassName("android.widget.EditText");
                        if (Build.VERSION.SDK_INT >= 28 && num != null) {
                            jo0.I(viewStructure, num.intValue());
                        }
                        if (mn0Var != null) {
                            ge2.e(viewStructure, ge2.a(mn0Var.b));
                        }
                        if (z5) {
                            ge2.g(viewStructure);
                            return;
                        }
                        return;
                    }
                }
                z4 = false;
                if (z2) {
                }
                if (z5) {
                }
                viewStructure.setVisibility(((f8j) mpfVar.F.d).j1() ? 4 : 0);
                if (list != null) {
                }
                if (((epi) mpfVar.o()).isEmpty()) {
                    viewStructure.setClassName(s0);
                }
                if (z) {
                }
            }
        }
        num2 = num3;
        list = null;
        Integer valueOf22 = Integer.valueOf(mpfVar.b);
        if (mpfVar.u() == null) {
        }
        if (valueOf22 == null) {
        }
        ge2.c(viewStructure, autofillId, intValue);
        viewStructure.setId(intValue, str, null, null);
        if (uf0Var == null) {
            if (valueOf != null) {
            }
            if (ce6Var != null) {
                ge2.b(viewStructure, z7);
            }
            znnVar.a.f0(mpfVar.b, new lh0(4, viewStructure));
            if (bool != null) {
            }
            if (slsVar != null) {
            }
            ce6.a.getClass();
            String str22 = (String) xz0.y(vnj.z(ae6.b));
            if (ce6Var != null) {
            }
            z3 = true;
            z4 = false;
            if (z2) {
            }
            if (z5) {
            }
            viewStructure.setVisibility(((f8j) mpfVar.F.d).j1() ? 4 : 0);
            if (list != null) {
            }
            if (((epi) mpfVar.o()).isEmpty()) {
            }
            if (z) {
            }
        }
        if (valueOf != null) {
        }
        if (ce6Var != null) {
        }
        znnVar.a.f0(mpfVar.b, new lh0(4, viewStructure));
        if (bool != null) {
        }
        if (slsVar != null) {
        }
        ce6.a.getClass();
        String str222 = (String) xz0.y(vnj.z(ae6.b));
        if (ce6Var != null) {
        }
        z3 = true;
        z4 = false;
        if (z2) {
        }
        if (z5) {
        }
        viewStructure.setVisibility(((f8j) mpfVar.F.d).j1() ? 4 : 0);
        if (list != null) {
        }
        if (((epi) mpfVar.o()).isEmpty()) {
        }
        if (z) {
        }
    }

    public static final void L(xy0 xy0Var, Function1 function1) {
        xy0Var.getClass();
        xy0 xy0Var2 = new xy0(999);
        int i = xy0Var.c;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            xy0Var2.put(xy0Var.f(i2), xy0Var.j(i2));
            i2++;
            i3++;
            if (i3 == 999) {
                function1.invoke(xy0Var2);
                xy0Var2.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            function1.invoke(xy0Var2);
        }
    }

    public static final seo M(Class cls, Context context, String str, usr usrVar, z2b z2bVar, e9r e9rVar) {
        seo A = str != null ? hyf.A(context, cls, str) : new seo(context, cls, null);
        A.j = teo.c;
        A.h = new j42(usrVar, xz0.w(new e9r[]{new wc5(2), new wc5(4), new wc5(z2bVar), new wc5(3), new wc5(0), e9rVar}), 1);
        A.f = u2x.u(dm6.a);
        if (str == null) {
            str = "memory";
        }
        Executor executor = hdg.c0("Music:RoomTransaction-".concat(str)).d;
        executor.getClass();
        A.g = executor;
        return A;
    }

    public static long N(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        if (!((numberOfLeadingZeros < 64) | ((j2 == Long.MIN_VALUE) & (j < 0)))) {
            long j4 = j * j2;
            if (j == 0 || j4 / j == j2) {
                return j4;
            }
        }
        return j3;
    }

    public static final void c(Function1 function1, hq5 hq5Var, int i) {
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(380922246);
        if ((((oq5Var.h(function1) ? 4 : 2) | i) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Unit unit = Unit.a;
            boolean h = oq5Var.h(function1);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new jqj(function1, (Continuation) null, 0);
                oq5Var.k0(K);
            }
            gld.w(oq5Var, unit, (Function2) K);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ai6(i, 2, function1);
        }
    }

    public static final void d(Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(352314722);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            yci d = d.d(wyf.C(a.n(androidx.compose.ui.platform.a.a(yciVar, "paging_connection_error"), 16, 8), function0, 0.0f, 0.0f, 14), 1.0f);
            kfh d2 = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, d);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            String M = rvf.M(R.string.search_no_connection_text_highlight, oq5Var);
            xcs.c(o8g.x(rvf.N(R.string.search_no_connection_text, new Object[]{M}, oq5Var), StringsKt.T(rvf.M(R.string.search_no_connection_text, oq5Var), "%s", 0, false, 6), M.length(), oq5Var), null, ((dq0) oq5Var.j(eq0.a)).b.a, 0L, null, 0L, new o9s(3), 0L, 0, false, 0, 0, null, null, nu0.j(), oq5Var, 0, 0, 130554);
            oq5Var = oq5Var;
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ni6(function0, yciVar, i, 4);
        }
    }

    public static final void e(fvf fvfVar, ArrayList arrayList, eha ehaVar, yci yciVar, hq5 hq5Var, int i) {
        fvfVar.getClass();
        ehaVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1894328389);
        int i2 = i | (oq5Var.f(fvfVar) ? 4 : 2) | (oq5Var.f(arrayList) ? 256 : 128) | (oq5Var.h(ehaVar) ? 2048 : 1024) | (oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            c3x.t(fvfVar, arrayList, oq5Var, (i2 & 14) | ((i2 >> 3) & 112));
            yci c = d.c(yciVar, 1.0f);
            vm C = ghh.C(ghh.C(a.c(0.0f, 12, 0.0f, 16, 5), zs4.g(oq5Var)), ogp.A(oq5Var));
            boolean h = oq5Var.h(ehaVar) | ((i2 & 896) == 256);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new avi(18, arrayList, ehaVar);
                oq5Var.k0(K);
            }
            weo.f(c, fvfVar, C, null, null, null, false, null, (Function1) K, oq5Var, (i2 << 3) & 112, 504);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gvl(i, 1, fvfVar, arrayList, ehaVar, yciVar);
        }
    }

    public static final void f(euu euuVar, owu owuVar, yci yciVar, hq5 hq5Var, int i) {
        owuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-493756465);
        int i2 = i | (oq5Var.f(euuVar) ? 4 : 2) | (oq5Var.h(owuVar) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            fxf.p(euuVar, owuVar, yciVar, null, false, null, oq5Var, i2 & 1022, 56);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t2n(euuVar, owuVar, yciVar, i, 6);
        }
    }

    public static final void g(int i, hq5 hq5Var, yci yciVar, boolean z, boolean z2) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-483346227);
        int i2 = (oq5Var.g(z) ? 4 : 2) | i | (oq5Var.g(z2) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            wn5 C = ild.C(-789535330, new a9g(1, z2, z), oq5Var);
            wn5 C2 = ild.C(-486647939, new k4m(5, z), oq5Var);
            wn5 C3 = ild.C(-183760548, new k4m(6, z), oq5Var);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new h2q(25);
                oq5Var.k0(K);
            }
            yciVar2 = yciVar;
            wyf.m(C, C2, C3, (Function0) K, yciVar2, oq5Var, ((i2 << 6) & 57344) | 3510);
        } else {
            yciVar2 = yciVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new l32(i, yciVar2, z, z2);
        }
    }

    public static final void h(final njq njqVar, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1049255592);
        int i2 = (oq5Var.f(njqVar) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            final int i3 = 0;
            final int i4 = 1;
            final int i5 = 2;
            wyf.m(ild.C(38882233, new Function2() { // from class: ijq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i3) {
                        case 0:
                            hq5 hq5Var2 = (hq5) obj;
                            int intValue = ((Integer) obj2).intValue();
                            oq5 oq5Var2 = (oq5) hq5Var2;
                            if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                                String str = njqVar.d;
                                if (str == null) {
                                    oq5Var2.Z(-1300523340);
                                } else {
                                    oq5Var2.Z(-1300523339);
                                    qo6 qo6Var = qo6.e;
                                    e9g e9gVar = e9g.a;
                                    irf.y(str, qo6Var, androidx.compose.ui.platform.a.a(d.m(vci.a, lsq.s(e9gVar)), "simple_playlist_block_cover_image"), false, false, null, null, lsq.r(e9gVar, qo6Var, oq5Var2, 54), oq5Var2, 48, 120);
                                }
                                oq5Var2.p(false);
                            } else {
                                oq5Var2.S();
                            }
                            break;
                        case 1:
                            hq5 hq5Var3 = (hq5) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            oq5 oq5Var3 = (oq5) hq5Var3;
                            if (oq5Var3.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                                xv7.j(njqVar.b, androidx.compose.ui.platform.a.a(vci.a, "simple_playlist_title"), ((dq0) oq5Var3.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, null, null, oq5Var3, 48, 3120, 120824);
                            } else {
                                oq5Var3.S();
                            }
                            break;
                        default:
                            hq5 hq5Var4 = (hq5) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            oq5 oq5Var4 = (oq5) hq5Var4;
                            if (oq5Var4.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                                String str2 = njqVar.c;
                                String str3 = (str2 == null || StringsKt.U(str2)) ? null : str2;
                                if (str3 == null) {
                                    oq5Var4.Z(298653835);
                                } else {
                                    oq5Var4.Z(298653836);
                                    xv7.j(str3, androidx.compose.ui.platform.a.a(vci.a, "simple_playlist_description"), ((dq0) oq5Var4.j(eq0.a)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, null, oq5Var4, 48, 3120, 120824);
                                }
                                oq5Var4.p(false);
                            } else {
                                oq5Var4.S();
                            }
                            break;
                    }
                    return Unit.a;
                }
            }, oq5Var), ild.C(-376444584, new Function2() { // from class: ijq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i4) {
                        case 0:
                            hq5 hq5Var2 = (hq5) obj;
                            int intValue = ((Integer) obj2).intValue();
                            oq5 oq5Var2 = (oq5) hq5Var2;
                            if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                                String str = njqVar.d;
                                if (str == null) {
                                    oq5Var2.Z(-1300523340);
                                } else {
                                    oq5Var2.Z(-1300523339);
                                    qo6 qo6Var = qo6.e;
                                    e9g e9gVar = e9g.a;
                                    irf.y(str, qo6Var, androidx.compose.ui.platform.a.a(d.m(vci.a, lsq.s(e9gVar)), "simple_playlist_block_cover_image"), false, false, null, null, lsq.r(e9gVar, qo6Var, oq5Var2, 54), oq5Var2, 48, 120);
                                }
                                oq5Var2.p(false);
                            } else {
                                oq5Var2.S();
                            }
                            break;
                        case 1:
                            hq5 hq5Var3 = (hq5) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            oq5 oq5Var3 = (oq5) hq5Var3;
                            if (oq5Var3.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                                xv7.j(njqVar.b, androidx.compose.ui.platform.a.a(vci.a, "simple_playlist_title"), ((dq0) oq5Var3.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, null, null, oq5Var3, 48, 3120, 120824);
                            } else {
                                oq5Var3.S();
                            }
                            break;
                        default:
                            hq5 hq5Var4 = (hq5) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            oq5 oq5Var4 = (oq5) hq5Var4;
                            if (oq5Var4.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                                String str2 = njqVar.c;
                                String str3 = (str2 == null || StringsKt.U(str2)) ? null : str2;
                                if (str3 == null) {
                                    oq5Var4.Z(298653835);
                                } else {
                                    oq5Var4.Z(298653836);
                                    xv7.j(str3, androidx.compose.ui.platform.a.a(vci.a, "simple_playlist_description"), ((dq0) oq5Var4.j(eq0.a)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, null, oq5Var4, 48, 3120, 120824);
                                }
                                oq5Var4.p(false);
                            } else {
                                oq5Var4.S();
                            }
                            break;
                    }
                    return Unit.a;
                }
            }, oq5Var), ild.C(-791771401, new Function2() { // from class: ijq
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i5) {
                        case 0:
                            hq5 hq5Var2 = (hq5) obj;
                            int intValue = ((Integer) obj2).intValue();
                            oq5 oq5Var2 = (oq5) hq5Var2;
                            if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                                String str = njqVar.d;
                                if (str == null) {
                                    oq5Var2.Z(-1300523340);
                                } else {
                                    oq5Var2.Z(-1300523339);
                                    qo6 qo6Var = qo6.e;
                                    e9g e9gVar = e9g.a;
                                    irf.y(str, qo6Var, androidx.compose.ui.platform.a.a(d.m(vci.a, lsq.s(e9gVar)), "simple_playlist_block_cover_image"), false, false, null, null, lsq.r(e9gVar, qo6Var, oq5Var2, 54), oq5Var2, 48, 120);
                                }
                                oq5Var2.p(false);
                            } else {
                                oq5Var2.S();
                            }
                            break;
                        case 1:
                            hq5 hq5Var3 = (hq5) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            oq5 oq5Var3 = (oq5) hq5Var3;
                            if (oq5Var3.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                                xv7.j(njqVar.b, androidx.compose.ui.platform.a.a(vci.a, "simple_playlist_title"), ((dq0) oq5Var3.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, null, null, oq5Var3, 48, 3120, 120824);
                            } else {
                                oq5Var3.S();
                            }
                            break;
                        default:
                            hq5 hq5Var4 = (hq5) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            oq5 oq5Var4 = (oq5) hq5Var4;
                            if (oq5Var4.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                                String str2 = njqVar.c;
                                String str3 = (str2 == null || StringsKt.U(str2)) ? null : str2;
                                if (str3 == null) {
                                    oq5Var4.Z(298653835);
                                } else {
                                    oq5Var4.Z(298653836);
                                    xv7.j(str3, androidx.compose.ui.platform.a.a(vci.a, "simple_playlist_description"), ((dq0) oq5Var4.j(eq0.a)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, null, oq5Var4, 48, 3120, 120824);
                                }
                                oq5Var4.p(false);
                            } else {
                                oq5Var4.S();
                            }
                            break;
                    }
                    return Unit.a;
                }
            }, oq5Var), function0, androidx.compose.ui.platform.a.a(yciVar, "simple_playlist_block"), oq5Var, ((i2 << 6) & 7168) | 438);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t2n(njqVar, function0, yciVar, i, 14);
        }
    }

    public static final void i(ejq ejqVar, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        ejqVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(729972017);
        int i2 = (oq5Var.h(ejqVar) ? 4 : 2) | i | 48;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            ojq ojqVar = (ojq) szf.Q(ejqVar.c, oq5Var).getValue();
            yciVar2 = vci.a;
            yci d = d.d(yciVar2, 1.0f);
            kfh d2 = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, d);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            boolean z = ojqVar instanceof mjq;
            kjn kjnVar = gq5.a;
            if (z) {
                oq5Var.Z(1284000912);
                mjq mjqVar = (mjq) ojqVar;
                boolean z2 = mjqVar.a;
                boolean z3 = mjqVar.b;
                Object K = oq5Var.K();
                if (K == kjnVar) {
                    K = new haq(4);
                    oq5Var.k0(K);
                }
                g(0, oq5Var, nfp.a(yciVar2, (Function1) K), z2, z3);
                oq5Var.p(false);
            } else {
                if (!(ojqVar instanceof njq)) {
                    throw vz1.i(oq5Var, 1283999199, false);
                }
                oq5Var.Z(1284008923);
                njq njqVar = (njq) ojqVar;
                boolean h = oq5Var.h(ejqVar);
                Object K2 = oq5Var.K();
                if (h || K2 == kjnVar) {
                    qbp qbpVar = new qbp(0, ejqVar, ejq.class, "onPlaylistClick", "onPlaylistClick()V", 0, 24);
                    oq5Var.k0(qbpVar);
                    K2 = qbpVar;
                }
                Function0 function0 = (Function0) ((h9f) K2);
                boolean h2 = oq5Var.h(ejqVar);
                Object K3 = oq5Var.K();
                if (h2 || K3 == kjnVar) {
                    K3 = new fjq(ejqVar, 1);
                    oq5Var.k0(K3);
                }
                h(njqVar, function0, com.yandex.music.core.ui.compose.a.b(yciVar2, null, 0L, 0.0f, null, (Function2) K3, 15), oq5Var, 0);
                oq5Var.p(false);
            }
            oq5Var.p(true);
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hon(ejqVar, yciVar2, i, 24);
        }
    }

    public static final void k(String str, etq etqVar, String str2, um0 um0Var, d85 d85Var, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci u;
        long j;
        vci vciVar;
        boolean z;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(381494355);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.d(etqVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.d(um0Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.f(d85Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i3 = i2 | 196608;
        if ((74899 & i3) == 74898 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            vm0 b = fn0.b(0, 0.0f, um0Var, oq5Var, ((i3 >> 3) & 896) | 6, 2);
            oq5Var = oq5Var;
            boolean f = oq5Var.f(b);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                K = new a9q(b, 22);
                oq5Var.k0(K);
            }
            vci vciVar2 = vci.a;
            yci s = wyf.s(vciVar2, (Function0) K);
            ta5 a = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, s);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            htq htqVar = new htq(etqVar);
            yci m = d.m(vciVar2, 52);
            if (etqVar == etq.b) {
                oq5Var.Z(1439927162);
                u = if4.b(1.0f, ((dq0) oq5Var.j(eq0.a)).c.a, true);
                oq5Var.p(false);
            } else {
                oq5Var.Z(1440180866);
                oq5Var.p(false);
                u = xp3.u(vciVar2, ugo.a(8));
            }
            ocg.e(str, htqVar, m.f(u), null, oq5Var, i3 & 14, 8);
            if (str2 == null) {
                oq5Var.Z(1440327123);
                oq5Var.p(false);
                vciVar = vciVar2;
                z = true;
            } else {
                oq5Var.Z(1440327124);
                u1g.l(oq5Var, d.e(vciVar2, 8));
                ges c = nu0.c();
                if (d85Var == null) {
                    oq5Var.Z(-1255418510);
                    j = ((dq0) oq5Var.j(eq0.a)).b.a;
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-1255419533);
                    oq5Var.p(false);
                    j = d85Var.a;
                }
                vciVar = vciVar2;
                xv7.j(str2, null, j, 0L, 0L, 3, 0L, 2, false, 1, 0, null, c, oq5Var, 0, 3120, 55034);
                oq5Var = oq5Var;
                oq5Var.p(false);
                z = true;
            }
            oq5Var.p(z);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu0(str, etqVar, str2, um0Var, d85Var, yciVar2, i, 15);
        }
    }

    public static final void l(Object obj, cce cceVar, yci yciVar, ryc rycVar, ryc rycVar2, ryc rycVar3, Function1 function1, Function1 function12, Function1 function13, g40 g40Var, jd6 jd6Var, float f, int i, hq5 hq5Var, int i2, int i3) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(934816934);
        is1 is1Var = new is1(obj, ild.j, cceVar);
        rq1 rq1Var = rq1.u;
        xkn xknVar = zvt.b;
        int i4 = i3 << 15;
        m(is1Var, null, yciVar, rq1Var, (function1 == null && function12 == null && function13 == null) ? null : new lma(27, function1, function12, function13), g40Var, jd6Var, f, null, i, (rycVar == null && rycVar2 == null && rycVar3 == null) ? xo5.a : new wn5(new zl0(6, rycVar, rycVar2, rycVar3), -1302781228, true), oq5Var, (i2 & 112) | 3072 | ((i2 >> 3) & 896) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), 6);
        oq5Var.p(false);
    }

    public static final void m(is1 is1Var, String str, yci yciVar, Function1 function1, Function1 function12, g40 g40Var, jd6 jd6Var, float f, m85 m85Var, int i, wn5 wn5Var, hq5 hq5Var, int i2, int i3) {
        int i4;
        Function1 function13;
        Function1 function14;
        int i5;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-892827826);
        if ((i2 & 14) == 0) {
            i4 = (oq5Var.f(is1Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 112) == 0) {
            i4 |= oq5Var.f(str) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i4 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            function13 = function1;
            i4 |= oq5Var.h(function13) ? 2048 : 1024;
        } else {
            function13 = function1;
        }
        if ((i2 & 57344) == 0) {
            function14 = function12;
            i4 |= oq5Var.h(function14) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            function14 = function12;
        }
        if ((i2 & 458752) == 0) {
            i4 |= oq5Var.f(g40Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((i2 & 3670016) == 0) {
            i4 |= oq5Var.f(jd6Var) ? 1048576 : 524288;
        }
        if ((i2 & 29360128) == 0) {
            i4 |= oq5Var.c(f) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((i2 & 234881024) == 0) {
            i4 |= oq5Var.f(m85Var) ? 67108864 : 33554432;
        }
        if ((i2 & 1879048192) == 0) {
            i4 |= oq5Var.d(i) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i3 & 14) == 0) {
            i5 = i3 | (oq5Var.g(true) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 112) == 0) {
            i5 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((1533916891 & i4) == 306783378 && (i5 & 91) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            rce a = zvt.a(is1Var.a, jd6Var, oq5Var);
            int i6 = i4 >> 3;
            int i7 = i4 >> 6;
            int i8 = i4 >> 12;
            fs1 E = yd5.E(a, is1Var.c, function13, function14, jd6Var, i, null, oq5Var, (i6 & 896) | 72 | (i6 & 7168) | (i7 & 57344) | (i8 & 458752), 64);
            bnq bnqVar = a.y;
            if (bnqVar instanceof ka6) {
                oq5Var.a0(-247973763);
                bg3.a(yciVar, g40Var, true, ild.s(oq5Var, 748478484, new wmr(bnqVar, wn5Var, E, str, g40Var, jd6Var, f, m85Var)), oq5Var, (i7 & 14) | 3456 | (i8 & 112), 0);
                oq5Var.p(false);
            } else {
                oq5Var.a0(-247974462);
                oq5Var.a0(733328855);
                wg3 e = ug3.e(g40Var, true, oq5Var, (((((i7 & 14) | 384) | (i8 & 112)) >> 3) & 14) | 48);
                oq5Var.a0(-1323940314);
                int i9 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                xp5.T.getClass();
                grb grbVar = wp5.b;
                wn5 A = ghh.A(yciVar);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, e, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i9))) {
                    ouj.x(i9, oq5Var, i9, kb5Var);
                }
                A.invoke(new lrq(oq5Var), oq5Var, 0);
                oq5Var.a0(2058660585);
                wn5Var.invoke(new zkn(b.a, E, str, g40Var, jd6Var, f, m85Var), oq5Var, Integer.valueOf(i5 & 112));
                oq5Var.p(false);
                k5r.s(oq5Var, true, false, false, false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xmr(is1Var, str, yciVar, function1, function12, g40Var, jd6Var, f, m85Var, i, wn5Var, i2, i3);
        }
    }

    public static final void n(Object obj, String str, cce cceVar, yci yciVar, Function1 function1, Function1 function12, g40 g40Var, jd6 jd6Var, float f, m85 m85Var, int i, wn5 wn5Var, hq5 hq5Var, int i2, int i3) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(10937794);
        int i4 = i2 >> 3;
        m(new is1(obj, ild.j, cceVar), str, yciVar, function1, function12, g40Var, jd6Var, f, m85Var, i, wn5Var, oq5Var, (i2 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (i4 & 234881024) | ((i3 << 27) & 1879048192), (i3 & 112) | 6);
        oq5Var.p(false);
    }

    public static final void o(zkn zknVar, yci yciVar, w4k w4kVar, String str, g40 g40Var, jd6 jd6Var, float f, m85 m85Var, boolean z, hq5 hq5Var, int i) {
        int i2;
        w4k w4kVar2;
        String str2;
        g40 g40Var2;
        jd6 jd6Var2;
        float f2;
        m85 m85Var2;
        yci yciVar2;
        boolean z2;
        yci yciVar3;
        boolean z3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(880638523);
        if ((i & 14) == 0) {
            i2 = (oq5Var.f(zknVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 176;
        if ((i & 7168) == 0) {
            i3 = i2 | 1200;
        }
        if ((57344 & i) == 0) {
            i3 |= RemoteCameraConfig.Notification.ID;
        }
        if ((458752 & i) == 0) {
            i3 |= SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((3670016 & i) == 0) {
            i3 |= 524288;
        }
        if ((29360128 & i) == 0) {
            i3 |= RemoteCameraConfig.Camera.BITRATE;
        }
        if ((234881024 & i) == 0) {
            i3 |= 33554432;
        }
        if ((191739611 & i3) == 38347922 && oq5Var.z()) {
            oq5Var.S();
            yciVar3 = yciVar;
            str2 = str;
            g40Var2 = g40Var;
            jd6Var2 = jd6Var;
            f2 = f;
            m85Var2 = m85Var;
            z3 = z;
        } else {
            oq5Var.U();
            if ((i & 1) == 0 || oq5Var.y()) {
                w4kVar2 = zknVar.b;
                str2 = zknVar.c;
                g40Var2 = zknVar.d;
                jd6Var2 = zknVar.e;
                f2 = zknVar.f;
                m85Var2 = zknVar.g;
                zknVar.getClass();
                yciVar2 = vci.a;
                z2 = true;
            } else {
                oq5Var.S();
                yciVar2 = yciVar;
                w4kVar2 = w4kVar;
                str2 = str;
                g40Var2 = g40Var;
                jd6Var2 = jd6Var;
                f2 = f;
                m85Var2 = m85Var;
                z2 = z;
            }
            oq5Var.q();
            xkn xknVar = zvt.b;
            yci b = str2 != null ? nfp.b(yciVar2, false, new r23(str2, 11)) : yciVar2;
            if (z2) {
                b = xp3.v(b);
            }
            yci f3 = b.f(new ContentPainterElement(w4kVar2, g40Var2, jd6Var2, f2, m85Var2));
            r30 r30Var = r30.n;
            oq5Var.a0(544976794);
            int i4 = oq5Var.P;
            yci H = vnj.H(oq5Var, f3);
            androidx.compose.runtime.internal.a l = oq5Var.l();
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.a0(1405779621);
            oq5Var.d0();
            if (oq5Var.O) {
                w4kVar = w4kVar2;
                oq5Var.k(new vr1(5, grbVar));
            } else {
                w4kVar = w4kVar2;
                oq5Var.n0();
            }
            g0g.U(oq5Var, r30Var, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            g0g.U(oq5Var, H, wp5.d);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            f1d.u(oq5Var, true, false, false);
            yciVar3 = yciVar2;
            z3 = z2;
        }
        w4k w4kVar3 = w4kVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ymr(zknVar, yciVar3, w4kVar3, str2, g40Var2, jd6Var2, f2, m85Var2, z3, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [int] */
    /* JADX WARN: Type inference failed for: r5v16 */
    public static final void p(pas pasVar, um0 um0Var, hvq hvqVar, d85 d85Var, yci yciVar, zsq zsqVar, hq5 hq5Var, int i, int i2) {
        int i3;
        d85 d85Var2;
        ox0 ox0Var;
        boolean z;
        boolean z2;
        String str;
        zsq zsqVar2;
        yci yciVar2;
        zsq zsqVar3 = zsqVar;
        um0Var.getClass();
        hvqVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(339956998);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(pasVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.d(um0Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.h(hvqVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            d85Var2 = d85Var;
            i3 |= oq5Var.f(d85Var2) ? 2048 : 1024;
        } else {
            d85Var2 = d85Var;
        }
        int i4 = i3 | 24576;
        int i5 = i2 & 32;
        if (i5 != 0) {
            i4 = 221184 | i3;
        } else if ((196608 & i) == 0) {
            i4 |= (i & SQLiteDatabase.OPEN_PRIVATECACHE) == 0 ? oq5Var.f(zsqVar3) : oq5Var.h(zsqVar3) ? 131072 : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i6 = i4;
        if ((74899 & i6) == 74898 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
            zsqVar2 = zsqVar3;
        } else {
            if (i5 != 0) {
                zsqVar3 = null;
            }
            zsq zsqVar4 = zsqVar3;
            vci vciVar = vci.a;
            yci o = a.o(d.c(vciVar, 1.0f), 16, 0.0f, 2);
            boolean h = ((458752 & i6) == 131072 || ((i6 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && oq5Var.h(zsqVar4))) | oq5Var.h(hvqVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new ko1(zsqVar4, hvqVar, 11);
                oq5Var.k0(K);
            }
            yci b = com.yandex.music.core.ui.compose.a.b(o, null, 0L, 0.0f, null, (Function2) K, 15);
            gz2 gz2Var = b2c.o;
            dtq dtqVar = pasVar.f;
            String str2 = pasVar.g;
            if (dtqVar == null || (ox0Var = dtqVar.a) == null) {
                ox0Var = qx0.e;
            }
            ta5 a = sa5.a(ox0Var, gz2Var, oq5Var, 48);
            int i7 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (str2 == null) {
                oq5Var.Z(948668734);
                oq5Var.p(false);
                z = false;
                str = str2;
                z2 = true;
            } else {
                oq5Var.Z(948668735);
                etq etqVar = pasVar.h;
                if (etqVar == null) {
                    etqVar = etq.b;
                }
                z = false;
                z2 = true;
                etq etqVar2 = etqVar;
                str = str2;
                k(str, etqVar2, pasVar.i, um0Var, d85Var2, null, oq5Var, ((i6 << 6) & 7168) | ((i6 << 3) & 57344));
                eta.p(vciVar, 20, oq5Var, false);
            }
            wyf.n(pasVar, um0Var, hvqVar.a(), d85Var, null, str != null ? z2 : z, oq5Var, i6 & 7294, 16);
            oq5Var = oq5Var;
            oq5Var.p(z2);
            zsqVar2 = zsqVar4;
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fd1((Object) pasVar, (Object) um0Var, (Object) hvqVar, d85Var, yciVar2, zsqVar2, i, i2, 15);
        }
    }

    public static final g2t q(int i, String str, boolean z, int i2, Function1 function1) {
        str.getClass();
        function1.getClass();
        f2t f2tVar = new f2t();
        f2tVar.a = z;
        function1.invoke(f2tVar);
        return new g2t(i, str, z, i2, f2tVar.b);
    }

    public static final void r(d9g d9gVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1348087976);
        int i2 = (oq5Var2.d(d9gVar.ordinal()) ? 4 : 2) | i | (oq5Var2.g(true) ? 32 : 16) | 384;
        if (oq5Var2.P(i2 & 1, (i2 & 147) != 146)) {
            int ordinal = d9gVar.ordinal();
            vci vciVar = vci.a;
            if (ordinal == 0) {
                oq5Var2.Z(1567591804);
                ghh.b(true, vciVar, null, oq5Var2, (i2 >> 3) & 126, 4);
                oq5Var = oq5Var2;
                oq5Var.p(false);
            } else if (ordinal == 1) {
                oq5Var = oq5Var2;
                oq5Var.Z(1567588255);
                wyf.i(true, vciVar, null, false, oq5Var, (i2 >> 3) & 126, 12);
                oq5Var.p(false);
            } else if (ordinal == 2) {
                oq5Var2.Z(1567584861);
                jf0.e(true, vciVar, null, false, false, null, oq5Var2, (i2 >> 3) & 126, 60);
                oq5Var = oq5Var2;
                oq5Var.p(false);
            } else {
                if (ordinal != 3) {
                    throw vz1.i(oq5Var2, 1567583353, false);
                }
                oq5Var2.Z(1567595096);
                hdg.j((i2 >> 3) & 126, 0, oq5Var2, vciVar, true);
                oq5Var2.p(false);
                oq5Var = oq5Var2;
            }
            yciVar = vciVar;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k0r(d9gVar, yciVar, i, 23);
        }
    }

    public static final long s(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final boolean t(svu svuVar, j9q j9qVar) {
        if (!Intrinsics.d(svuVar, qvu.a)) {
            if (!(svuVar instanceof rvu)) {
                if (Intrinsics.d(svuVar, pvu.a)) {
                    return false;
                }
                b6e.s();
                return false;
            }
            int ordinal = j9qVar.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal != 1) {
                b6e.s();
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0074  */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [sr5] */
    /* JADX WARN: Type inference failed for: r1v7, types: [sr5] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [aw0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v5, types: [cnn] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v5, types: [r2f] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v19, types: [int] */
    /* JADX WARN: Type inference failed for: r4v20, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object u(gjs gjsVar, Context context, aw0 aw0Var, ajs ajsVar, s6f s6fVar, cg6 cg6Var) {
        hnp hnpVar;
        ase aseVar;
        hnp hnpVar2;
        nm6 nm6Var;
        ?? r1;
        ase aseVar2;
        cnn cnnVar;
        aw0 aw0Var2;
        rar rarVar;
        Context context2;
        ajs ajsVar2;
        gjs gjsVar2;
        cnn cnnVar2;
        r2f r2fVar;
        ase aseVar3;
        wr5 wr5Var;
        wr5 wr5Var2;
        lma lmaVar;
        wr5 wr5Var3;
        cnn cnnVar3;
        ?? r4;
        ?? r3 = context;
        ?? r2 = aw0Var;
        try {
            if (cg6Var instanceof hnp) {
                hnpVar = (hnp) cg6Var;
                r4 = hnpVar.s;
                if ((r4 & Integer.MIN_VALUE) != 0) {
                    ?? r42 = r4 - Integer.MIN_VALUE;
                    hnpVar.s = r42;
                    aseVar = r42;
                    hnpVar2 = hnpVar;
                    Object obj = hnpVar2.r;
                    nm6Var = nm6.a;
                    r1 = hnpVar2.s;
                    int i = 2;
                    Continuation continuation = null;
                    if (r1 == 0) {
                        try {
                            if (r1 != 1) {
                                if (r1 != 2) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                ?? r12 = (sr5) hnpVar2.m;
                                cnnVar2 = (cnn) hnpVar2.l;
                                r2fVar = (r2f) hnpVar2.k;
                                aseVar3 = (ase) hnpVar2.j;
                                qgg.h0(obj);
                                wr5Var = r12;
                                wr5Var.c();
                                aseVar3.c();
                                r2fVar.g(null);
                                cnnVar2.w();
                                return Unit.a;
                            }
                            wr5 wr5Var4 = hnpVar2.q;
                            cnn cnnVar4 = hnpVar2.p;
                            rar rarVar2 = hnpVar2.o;
                            ase aseVar4 = hnpVar2.n;
                            ajs ajsVar3 = (ajs) hnpVar2.m;
                            aw0 aw0Var3 = (aw0) hnpVar2.l;
                            Context context3 = (Context) hnpVar2.k;
                            gjs gjsVar3 = (gjs) hnpVar2.j;
                            qgg.h0(obj);
                            aseVar2 = aseVar4;
                            cnnVar = cnnVar4;
                            aw0Var2 = aw0Var3;
                            rarVar = rarVar2;
                            context2 = context3;
                            ajsVar2 = ajsVar3;
                            gjsVar2 = gjsVar3;
                            wr5Var2 = wr5Var4;
                        } catch (Throwable th) {
                            th = th;
                            r1.c();
                            aseVar.c();
                            r3.g(null);
                            r2.w();
                            throw th;
                        }
                    } else {
                        qgg.h0(obj);
                        aseVar2 = new ase(gjsVar);
                        rar y = x97.y(gjsVar, null, null, new dt0(i, 15, continuation), 3);
                        mm6 mm6Var = gjsVar.a;
                        r2.getClass();
                        yvn yvnVar = new yvn(50);
                        xdr a = ydr.a(Boolean.FALSE);
                        gnp gnpVar = new gnp(gjsVar, r2, r3);
                        s6fVar.getClass();
                        w2f p = saf.p();
                        r2f r2fVar2 = (r2f) mm6Var.getCoroutineContext().get(o6c.l);
                        if (r2fVar2 != null) {
                            r2fVar2.R(new hxo(6, p));
                        }
                        cnn cnnVar5 = new cnn(mm6Var.getCoroutineContext().plus(p).plus(gnpVar));
                        wr5 wr5Var5 = new wr5(cnnVar5, new mw0(yvnVar));
                        try {
                            xg xgVar = new xg(wr5Var5, (Object) r2, (Object) r3, cnnVar5, gjsVar, (Continuation) null, 19);
                            wr5Var3 = wr5Var5;
                            cnnVar3 = cnnVar5;
                            try {
                                x97.y(gjsVar, aseVar2, null, xgVar, 2);
                                aw0Var2 = aw0Var;
                                try {
                                    context2 = context;
                                    gjsVar2 = gjsVar;
                                    x97.y(gjsVar2, null, null, new f44(cnnVar3, aw0Var2, a, context, yvnVar, gjsVar, ajsVar, (Continuation) null, 9), 3);
                                    lf2 lf2Var = new lf2(2, 11, continuation);
                                    hnpVar2.j = gjsVar2;
                                    hnpVar2.k = context2;
                                    hnpVar2.l = aw0Var2;
                                    ajsVar2 = ajsVar;
                                    hnpVar2.m = ajsVar2;
                                    hnpVar2.n = aseVar2;
                                    rarVar = y;
                                    try {
                                        hnpVar2.o = rarVar;
                                        hnpVar2.p = cnnVar3;
                                        hnpVar2.q = wr5Var3;
                                        hnpVar2.s = 1;
                                        if (zsd.h0(a, lf2Var, hnpVar2) != nm6Var) {
                                            cnnVar = cnnVar3;
                                            wr5Var2 = wr5Var3;
                                        }
                                        return nm6Var;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r2 = cnnVar3;
                                        r3 = rarVar;
                                        r1 = wr5Var3;
                                        aseVar = aseVar2;
                                        r1.c();
                                        aseVar.c();
                                        r3.g(null);
                                        r2.w();
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    rarVar = y;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                rarVar = y;
                                r2 = cnnVar3;
                                r3 = rarVar;
                                r1 = wr5Var3;
                                aseVar = aseVar2;
                                r1.c();
                                aseVar.c();
                                r3.g(null);
                                r2.w();
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            wr5Var3 = wr5Var5;
                            cnnVar3 = cnnVar5;
                        }
                    }
                    lmaVar = new lma(22, gjsVar2, ajsVar2, aseVar2);
                    hnpVar2.j = aseVar2;
                    hnpVar2.k = rarVar;
                    hnpVar2.l = cnnVar;
                    hnpVar2.m = wr5Var2;
                    hnpVar2.n = null;
                    hnpVar2.o = null;
                    hnpVar2.p = null;
                    hnpVar2.q = null;
                    hnpVar2.s = 2;
                    if (aw0Var2.d(context2, lmaVar, hnpVar2) != nm6Var) {
                        cnnVar2 = cnnVar;
                        r2fVar = rarVar;
                        aseVar3 = aseVar2;
                        wr5Var = wr5Var2;
                        wr5Var.c();
                        aseVar3.c();
                        r2fVar.g(null);
                        cnnVar2.w();
                        return Unit.a;
                    }
                    return nm6Var;
                }
            }
            lmaVar = new lma(22, gjsVar2, ajsVar2, aseVar2);
            hnpVar2.j = aseVar2;
            hnpVar2.k = rarVar;
            hnpVar2.l = cnnVar;
            hnpVar2.m = wr5Var2;
            hnpVar2.n = null;
            hnpVar2.o = null;
            hnpVar2.p = null;
            hnpVar2.q = null;
            hnpVar2.s = 2;
            if (aw0Var2.d(context2, lmaVar, hnpVar2) != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th6) {
            th = th6;
            r2 = cnnVar;
            r3 = rarVar;
            r1 = wr5Var2;
            aseVar = aseVar2;
            r1.c();
            aseVar.c();
            r3.g(null);
            r2.w();
            throw th;
        }
        hnpVar = new hnp(cg6Var);
        aseVar = r4;
        hnpVar2 = hnpVar;
        Object obj2 = hnpVar2.r;
        nm6Var = nm6.a;
        r1 = hnpVar2.s;
        int i2 = 2;
        Continuation continuation2 = null;
        if (r1 == 0) {
        }
    }

    public static final void v(jnb jnbVar) {
        jnbVar.getLifecycle().a(new azf(jnbVar.getClass().getSimpleName()));
    }

    public static long x(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j2) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException(hrg.m(j2, ")", tlm.l(j, "overflow: checkedAdd(", ", ")));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long y(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        if (j4 == 0) {
            return j3;
        }
        int i = ((int) ((j ^ j2) >> 63)) | 1;
        switch (xug.a[roundingMode.ordinal()]) {
            case 1:
                ixf.s(j4 == 0);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i >= 0) {
                    return j3;
                }
                return j3 + i;
            case 4:
                return j3 + i;
            case 5:
                if (i <= 0) {
                    return j3;
                }
                return j3 + i;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j4);
                long abs2 = abs - (Math.abs(j2) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (abs2 <= 0) {
                    return j3;
                }
                return j3 + i;
            default:
                wvs.b();
                return 0L;
        }
    }

    public static long z(long j, long j2) {
        ixf.r(j, "a");
        ixf.r(j2, "b");
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long j3 = j >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j4 = j2 >> numberOfTrailingZeros2;
        while (j3 != j4) {
            long j5 = j3 - j4;
            long j6 = (j5 >> 63) & j5;
            long j7 = (j5 - j6) - j6;
            j4 += j6;
            j3 = j7 >> Long.numberOfTrailingZeros(j7);
        }
        return j3 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public String toString() {
        switch (this.a) {
            case 27:
                return ((olx) this).b.toString();
            default:
                return super.toString();
        }
    }

    public abstract void w();
}
