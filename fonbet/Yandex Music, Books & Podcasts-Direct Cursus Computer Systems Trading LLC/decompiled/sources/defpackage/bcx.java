package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.webkit.WebView;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes.dex */
public abstract class bcx {
    public static final wn5 a = new wn5(new bo5(29), -658259663, false);
    public static final wn5 b;
    public static final wn5 c;
    public static final wn5 d;
    public static final wn5 e;
    public static final xfp f;
    public static final xfp g;
    public static final ns9 h;
    public static final s3f i;
    public static final int[] j;
    public static final int[] k;

    static {
        new wn5(new h3(27), -603997033, false);
        b = new wn5(new rz3(8), -1638601686, false);
        c = new wn5(new rz3(9), -1742004732, false);
        int i2 = 10;
        d = new wn5(new rz3(i2), -2061610400, false);
        e = new wn5(new wo5(i2), 400375856, false);
        f = new xfp("TestStateTag", new fp5(17));
        g = new xfp("TestIndexTag", new fp5(18));
        h = new ns9(19);
        i = new s3f(3);
        j = new int[]{R.attr.colorPrimary};
        k = new int[]{R.attr.colorPrimaryVariant};
    }

    public static final String A(String str) {
        str.getClass();
        String O = up6.O(0, 6, str);
        return O.concat(up6.E(str.length() - O.length(), up6.O(-(str.length() < 14 ? 2 : 4), null, str)));
    }

    public static TypedArray B(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        t(context, attributeSet, i2, i3);
        u(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    public static final void C(sv7 sv7Var) {
        sd0 sd0Var;
        mpf F = F(sv7Var);
        if (F.t) {
            return;
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) ppf.a(F);
        if (!AndroidComposeView.h() || (sd0Var = androidComposeView.C) == null) {
            return;
        }
        sd0Var.d.a.f0(F.b, new cl(2, sd0Var, F));
    }

    public static final f8j D(sv7 sv7Var, int i2) {
        f8j f8jVar = ((xci) sv7Var).a.h;
        f8jVar.getClass();
        if (f8jVar.b1() != sv7Var || !g8j.g(i2)) {
            return f8jVar;
        }
        f8j f8jVar2 = f8jVar.m;
        f8jVar2.getClass();
        return f8jVar2;
    }

    public static final f8j E(sv7 sv7Var) {
        if (!((xci) sv7Var).a.n) {
            sme.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        f8j D = D(sv7Var, 2);
        if (!D.b1().n) {
            sme.b("LayoutCoordinates is not attached.");
        }
        return D;
    }

    public static final mpf F(sv7 sv7Var) {
        f8j f8jVar = ((xci) sv7Var).a.h;
        if (f8jVar != null) {
            return f8jVar.l;
        }
        throw ouj.f("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final uzj G(sv7 sv7Var) {
        uzj uzjVar = F(sv7Var).n;
        if (uzjVar != null) {
            return uzjVar;
        }
        throw ouj.f("This node does not have an owner.");
    }

    public static final void H(float[] fArr) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = 1 - 0.0f;
        float f3 = 0.213f * f2;
        float f4 = 0.715f * f2;
        float f5 = f2 * 0.072f;
        fArr[0] = f3 + 0.0f;
        fArr[1] = f4;
        fArr[2] = f5;
        fArr[5] = f3;
        fArr[6] = f4 + 0.0f;
        fArr[7] = f5;
        fArr[10] = f3;
        fArr[11] = f4;
        fArr[12] = f5 + 0.0f;
    }

    public static final v9b I(u9b u9bVar, int i2) {
        u9bVar.getClass();
        String e2 = u9bVar.e(i2, WebPath$Storage.AVATARS);
        String str = u9bVar.b;
        return new v9b(e2, str != null ? pd.T(str) : null, u9bVar.c);
    }

    public static final Float J(Double d2) {
        if (d2 != null) {
            return Float.valueOf(yhn.c((float) d2.doubleValue(), -1.0f, 1.0f));
        }
        return null;
    }

    public static final Activity K(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        baseContext.getClass();
        return K(baseContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e0e L(e6b e6bVar, Uri uri) {
        h0e h0eVar;
        Object obj;
        xzd xzdVar;
        jch d2;
        String str;
        Integer intOrNull;
        u7e u7eVar;
        i0e G;
        i0e G2;
        a0e a0eVar = a0e.d;
        uri.getClass();
        try {
            G2 = e6bVar.G(uri);
        } catch (pte unused) {
        }
        if (G2 instanceof h0e) {
            h0eVar = (h0e) G2;
            if (h0eVar != null) {
                return a0e.b;
            }
            List list = h0eVar.d;
            list.getClass();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Uri uri2 = (Uri) obj;
                uri2.getClass();
                if (e6bVar.H(uri2).c) {
                    break;
                }
            }
            Uri uri3 = (Uri) obj;
            if (uri3 != null) {
                try {
                    G = e6bVar.G(uri3);
                } catch (pte unused2) {
                }
                if (G instanceof xzd) {
                    xzdVar = (xzd) G;
                    if (xzdVar != null) {
                        yde ydeVar = xzdVar.r;
                        if (xzdVar.o) {
                            ydeVar.getClass();
                            ArrayList arrayList = new ArrayList(v75.o(ydeVar, 10));
                            Iterator<E> it2 = ydeVar.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    String str2 = ((uzd) it2.next()).a;
                                    str2.getClass();
                                    try {
                                        s7e s7eVar = new s7e();
                                        s7eVar.h(null, str2);
                                        u7eVar = s7eVar.e();
                                    } catch (IllegalArgumentException unused3) {
                                        u7eVar = null;
                                    }
                                    if (u7eVar == null) {
                                        break;
                                    }
                                    arrayList.add(u7eVar);
                                } else {
                                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                                    Iterator it3 = arrayList.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            String b2 = ((u7e) it3.next()).b();
                                            int V = StringsKt.V(6, b2, "/");
                                            if (V == -1) {
                                                break;
                                            }
                                            arrayList2.add(b2.substring(0, V));
                                        } else {
                                            int i2 = 1;
                                            if (CollectionsKt.w0(CollectionsKt.z0(arrayList2)).size() <= 1) {
                                                Regex regex = new Regex("seg-(\\d+)-f1-a1.ts");
                                                ArrayList arrayList3 = new ArrayList(v75.o(arrayList, 10));
                                                Iterator it4 = arrayList.iterator();
                                                while (true) {
                                                    if (!it4.hasNext()) {
                                                        if (!arrayList3.isEmpty()) {
                                                            Iterator it5 = arrayList3.iterator();
                                                            while (it5.hasNext()) {
                                                                int i3 = i2 + 1;
                                                                if (((Number) it5.next()).intValue() == i2) {
                                                                    i2 = i3;
                                                                }
                                                            }
                                                        }
                                                        ArrayList arrayList4 = new ArrayList();
                                                        Iterator<E> it6 = ydeVar.iterator();
                                                        while (it6.hasNext()) {
                                                            String str3 = ((uzd) it6.next()).g;
                                                            if (str3 != null) {
                                                                arrayList4.add(str3);
                                                            }
                                                        }
                                                        List w0 = CollectionsKt.w0(CollectionsKt.z0(arrayList4));
                                                        if (!(w0 instanceof Collection) || !w0.isEmpty()) {
                                                            Iterator it7 = w0.iterator();
                                                            while (it7.hasNext()) {
                                                                Uri N = ldg.N((String) it7.next());
                                                                N.getClass();
                                                                if (!e6bVar.H(N).c) {
                                                                    String uri4 = N.buildUpon().clearQuery().build().toString();
                                                                    uri4.getClass();
                                                                    if (!e6bVar.s(uri4).c) {
                                                                        return a0e.a;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        if (!ydeVar.isEmpty()) {
                                                            Iterator<E> it8 = ydeVar.iterator();
                                                            while (it8.hasNext()) {
                                                                String str4 = ((uzd) it8.next()).a;
                                                                str4.getClass();
                                                                Uri parse = Uri.parse(str4);
                                                                parse.getClass();
                                                                if (!e6bVar.H(parse).c) {
                                                                    return d0e.a;
                                                                }
                                                            }
                                                        }
                                                        return c0e.a;
                                                    }
                                                    String str5 = (String) CollectionsKt.Z(((u7e) it4.next()).c());
                                                    if (str5 == null || (d2 = regex.d(str5)) == null || (str = (String) CollectionsKt.S(d2.a(), 1)) == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
                                                        break;
                                                    }
                                                    arrayList3.add(intOrNull);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return a0e.c;
                    }
                }
                xzdVar = null;
                if (xzdVar != null) {
                }
            }
            return a0eVar;
        }
        h0eVar = null;
        if (h0eVar != null) {
        }
    }

    public static qbx M() {
        String str;
        ClassLoader classLoader = bcx.class.getClassLoader();
        if (qbx.class.equals(qbx.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!qbx.class.getPackage().equals(bcx.class.getPackage())) {
                xq0.x(qbx.class.getName());
                return null;
            }
            str = k5r.m(qbx.class.getPackage().getName(), ".BlazeGenerated", qbx.class.getSimpleName(), "Loader");
        }
        try {
            try {
                try {
                    try {
                        eta.q(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                        throw null;
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException(e2);
                    }
                } catch (NoSuchMethodException e3) {
                    throw new IllegalStateException(e3);
                }
            } catch (IllegalAccessException e4) {
                throw new IllegalStateException(e4);
            } catch (InstantiationException e5) {
                throw new IllegalStateException(e5);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new bcx[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e6) {
                        Logger.getLogger(kbx.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(qbx.class.getSimpleName()), (Throwable) e6);
                    }
                }
                if (arrayList.size() == 1) {
                    return (qbx) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (qbx) qbx.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e7) {
                    wvs.m(e7);
                    return null;
                } catch (NoSuchMethodException e8) {
                    wvs.m(e8);
                    return null;
                } catch (InvocationTargetException e9) {
                    wvs.m(e9);
                    return null;
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static final void a(final int i2, String str, final long j2, obh obhVar, Function0 function0, yci yciVar, hq5 hq5Var, int i3) {
        yci yciVar2;
        str.getClass();
        obhVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1840063001);
        int i4 = i3 | (oq5Var.d(i2) ? 4 : 2) | (oq5Var.f(str) ? 32 : 16) | (oq5Var.e(j2) ? 256 : 128) | (oq5Var.h(obhVar) ? 2048 : 1024) | (oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID) | 196608;
        if ((74899 & i4) == 74898 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            int i5 = i4 >> 3;
            vut.q(str, j2, obhVar, function0, ild.C(-1048683682, new pyc() { // from class: ob1
                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    cma cmaVar = (cma) obj;
                    hq5 hq5Var2 = (hq5) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= ((oq5) hq5Var2).c(cmaVar.a) ? 4 : 2;
                    }
                    if ((intValue & 19) == 18) {
                        oq5 oq5Var2 = (oq5) hq5Var2;
                        if (oq5Var2.z()) {
                            oq5Var2.S();
                            return Unit.a;
                        }
                    }
                    irf.r(a0g.E(i2, 0, hq5Var2), null, d.m(vci.a, cmaVar.a), null, null, 0.0f, new d43(j2, 9), hq5Var2, 48, 56);
                    return Unit.a;
                }
            }, oq5Var), oq5Var, (i5 & 7168) | 196608 | (i5 & 14) | (i5 & 112) | RemoteCameraConfig.Mic.BUFFER_SIZE | (i5 & 896) | 24576);
            yciVar2 = vci.a;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pb1(i2, str, j2, obhVar, function0, yciVar2, i3);
        }
    }

    public static final void b(final mg2 mg2Var, final float f2, yci yciVar, final float f3, hq5 hq5Var, final int i2) {
        yci yciVar2;
        final yci yciVar3;
        mg2Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1847355946);
        int i3 = i2 | (oq5Var.h(mg2Var) ? 4 : 2) | (oq5Var.c(f2) ? 32 : 16) | 384 | (oq5Var.g(true) ? 2048 : 1024) | (oq5Var.c(f3) ? 16384 : RemoteCameraConfig.Notification.ID);
        if ((i3 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            yciVar3 = yciVar;
        } else {
            oq5Var.U();
            if ((i2 & 1) == 0 || oq5Var.y()) {
                yciVar2 = vci.a;
            } else {
                oq5Var.S();
                yciVar2 = yciVar;
            }
            oq5Var.q();
            yci a2 = a.a(d.c(yciVar2, 1.0f), "avatar_icon");
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new tf2(6);
                oq5Var.k0(K);
            }
            c3x.c(mg2Var, true, ksw.D(nfp.a(a2, (Function1) K), rvf.M(R.string.profile_title, oq5Var), null), f2, f3, oq5Var, (i3 & 14) | ((i3 >> 6) & 112) | ((i3 << 6) & 7168) | (i3 & 57344));
            yciVar3 = yciVar2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2(f2, yciVar3, f3, i2) { // from class: pg2
                public final /* synthetic */ float b;
                public final /* synthetic */ yci c;
                public final /* synthetic */ float d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(1);
                    bcx.b(mg2.this, this.b, this.c, this.d, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        Function0 function02;
        yci yciVar2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-335273915);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
            yciVar2 = yciVar;
        } else {
            function02 = function0;
            yciVar2 = yciVar;
            c3x.k(R.drawable.ic_close_mid_24, function02, li6.b, rvf.M(R.string.close_content_description, oq5Var), yciVar2, oq5Var, ((i3 << 3) & 112) | 384 | ((i3 << 9) & 57344));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ni6(function02, yciVar2, i2, 0);
        }
    }

    public static final void d(Function0 function0, yci yciVar, boolean z, pyc pycVar, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar2;
        boolean z2;
        function0.getClass();
        pycVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(59826040);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        int i6 = i4 | 384;
        if ((i2 & 3072) == 0) {
            i6 |= oq5Var.h(pycVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i6 & 1, (i6 & 1171) != 1170)) {
            if (i5 != 0) {
                yciVar = vci.a;
            }
            yci yciVar3 = yciVar;
            q0k q0kVar = bl3.a;
            xee.q(function0, yciVar3, true, bl3.c(((dq0) oq5Var.j(eq0.a)).b.d, oq5Var, 5), ild.C(85472885, new u2(17, pycVar), oq5Var), oq5Var, (i6 & 14) | 805306368 | (i6 & 112) | (i6 & 896), 376);
            yciVar2 = yciVar3;
            z2 = true;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
            z2 = z;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu0(function0, yciVar2, z2, pycVar, i2, i3, 1);
        }
    }

    public static final void e(ww5 ww5Var, hq5 hq5Var, int i2) {
        boolean z;
        ww5Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(147065502);
        int i3 = (oq5Var.f(ww5Var) ? 4 : 2) | i2;
        if ((i3 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            mx5 mx5Var = (mx5) gld.O(ww5Var.e, oq5Var).getValue();
            ogp.g.e(mx5Var instanceof ex5, mx5Var instanceof fx5, null, oq5Var, 4096, 4);
            vm C = ghh.C(zs4.g(oq5Var), ogp.A(oq5Var));
            vci vciVar = vci.a;
            yci p1 = gut.p1(d.c(vciVar, 1.0f));
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, p1);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            kg5.c(ww5Var, oq5Var, i3 & 14);
            if (Intrinsics.d(mx5Var, fx5.a)) {
                oq5Var.Z(-1581193298);
                c3x.j(0, oq5Var);
                oq5Var.p(false);
            } else if (mx5Var instanceof lx5) {
                oq5Var.Z(-1581061672);
                ox6.h((lx5) mx5Var, ww5Var, C, null, oq5Var, (i3 << 3) & 112);
                oq5Var.p(false);
            } else {
                if (!Intrinsics.d(mx5Var, ex5.a)) {
                    throw vz1.i(oq5Var, -605196955, false);
                }
                oq5Var.Z(-1580789864);
                int i5 = ((i3 << 3) & 112) | 6;
                oq5Var.Z(444064080);
                nmj nmjVar = ww5Var.c;
                boolean z2 = (((i5 & 112) ^ 48) > 32 && oq5Var.f(ww5Var)) || (i5 & 48) == 32;
                Object K = oq5Var.K();
                if (z2 || K == gq5.a) {
                    K = new ti1(3, ww5Var);
                    oq5Var.k0(K);
                }
                z = true;
                jmj b2 = nmjVar.b((dmj) K, null, ww5Var.d, 1, oq5Var, 36400);
                oq5Var = oq5Var;
                oq5Var.p(false);
                ivf.g(b2, d.x(bfg.Q(d.c(androidx.compose.foundation.layout.a.l(vciVar, C), 1.0f), bfg.C(oq5Var), false, 14), b2c.f, 2), false, null, oq5Var, 0, 12);
                oq5Var.p(false);
                oq5Var.p(z);
            }
            z = true;
            oq5Var.p(z);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xw5(ww5Var, i2, 0);
        }
    }

    public static final void f(xia xiaVar, n8g n8gVar, hq5 hq5Var, int i2) {
        xiaVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(457218105);
        int i3 = (oq5Var.f(xiaVar) ? 4 : 2) | i2 | (oq5Var.f(n8gVar) ? 32 : 16);
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            etn.m(new qzm[0], ild.C(806112505, new eja(n8gVar, xiaVar, ywf.s(oq5Var), 1), oq5Var), oq5Var, 48);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kw5(xiaVar, n8gVar, i2, 21);
        }
    }

    public static final void g(Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        Function0 function02;
        yci yciVar2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(826791336);
        int i3 = (oq5Var.h(function0) ? 4 : 2) | i2 | (oq5Var.f(yciVar) ? 32 : 16);
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
            yciVar2 = yciVar;
        } else {
            function02 = function0;
            yciVar2 = yciVar;
            c3x.k(R.drawable.ic_edit_itogi_24_, function02, li6.c, rvf.M(R.string.decription_change_selection, oq5Var), yciVar2, oq5Var, ((i3 << 3) & 112) | 384 | ((i3 << 9) & 57344));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kx(function02, yciVar2, i2, 6);
        }
    }

    public static final void h(Function0 function0, Function0 function02, hq5 hq5Var, int i2) {
        int i3;
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-295357721);
        if ((i2 & 48) == 0) {
            i3 = (oq5Var.h(function02) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            up6.b(function0, ild.C(1626572591, new zk(18, function0), oq5Var), null, ild.C(-2019801935, new zk(19, function02), oq5Var), men.e, null, 0L, 0L, null, oq5Var, 224310, 964);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gva(function0, function02, i2, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [yci] */
    public static final void i(g2d g2dVar, hq5 hq5Var, int i2) {
        g2d g2dVar2;
        oq5 oq5Var;
        int i3;
        g2dVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1378895431);
        if (((i2 | (oq5Var2.h(g2dVar) ? 4 : 2)) & 3) == 2 && oq5Var2.z()) {
            oq5Var2.S();
            g2dVar2 = g2dVar;
            oq5Var = oq5Var2;
            i3 = 1;
        } else {
            float f2 = 24;
            q0k q0kVar = new q0k(f2, f2, f2, f2);
            vci vciVar = vci.a;
            yci l = androidx.compose.foundation.layout.a.l(vciVar, q0kVar);
            pzm pzmVar = sqv.a;
            yci z = gut.z(gut.r1(vnj.q(l, new wk0(15, q0kVar))));
            gz2 gz2Var = b2c.o;
            kx0 kx0Var = qx0.c;
            ta5 a2 = sa5.a(kx0Var, gz2Var, oq5Var2, 48);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H = vnj.H(oq5Var2, z);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var2, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var2, l2, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var4);
            wa5 wa5Var = wa5.a;
            yci Q = bfg.Q(wa5Var.b(1.0f, vciVar, true), bfg.C(oq5Var2), false, 14);
            ta5 a3 = sa5.a(kx0Var, gz2Var, oq5Var2, 48);
            int i5 = oq5Var2.P;
            androidx.compose.runtime.internal.a l3 = oq5Var2.l();
            yci H2 = vnj.H(oq5Var2, Q);
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a3, kb5Var);
            g0g.U(oq5Var2, l3, kb5Var2);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var2, i5, kb5Var3);
            }
            g0g.U(oq5Var2, H2, kb5Var4);
            u1g.l(oq5Var2, wa5Var.b(1.0f, vciVar, true));
            vci t = irv.h(oq5Var2) ? d.t(vciVar, 0.0f, 360, 1) : vciVar;
            boolean h2 = oq5Var2.h(g2dVar);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                aub aubVar = new aub(1, g2dVar, g2d.class, "onUrlClick", "onUrlClick(Ljava/lang/String;)V", 0, 6);
                oq5Var2.k0(aubVar);
                K = aubVar;
            }
            c3x.q(0, oq5Var2, t, (Function1) ((h9f) K));
            u1g.l(oq5Var2, wa5Var.b(1.0f, vciVar, true));
            oq5Var2.p(true);
            yci q = androidx.compose.foundation.layout.a.q(d.t(vciVar, 220, 0.0f, 2), 0.0f, 12, 0.0f, 0.0f, 13);
            String M = rvf.M(R.string.gdpr_welcome_button, oq5Var2);
            boolean h3 = oq5Var2.h(g2dVar);
            Object K2 = oq5Var2.K();
            if (h3 || K2 == kjnVar) {
                v2d v2dVar = new v2d(0, g2dVar, g2d.class, "onAcceptClick", "onAcceptClick()V", 0, 0);
                g2dVar2 = g2dVar;
                oq5Var2.k0(v2dVar);
                K2 = v2dVar;
            } else {
                g2dVar2 = g2dVar;
            }
            oq5Var = oq5Var2;
            hdg.o(M, (Function0) ((h9f) K2), q, 0.0f, oq5Var, 384, 8);
            i3 = 1;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new d2d(g2dVar2, i2, i3);
        }
    }

    public static final void j(boolean z, Function0 function0, wn5 wn5Var, hq5 hq5Var, int i2) {
        boolean z2;
        Function0 function02;
        wn5 wn5Var2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-21942680);
        int i3 = (oq5Var.g(z) ? 4 : 2) | i2 | (oq5Var.h(function0) ? 32 : 16);
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            z2 = z;
            function02 = function0;
            wn5Var2 = wn5Var;
        } else {
            WeakHashMap weakHashMap = rqv.w;
            float f2 = 0;
            z2 = z;
            function02 = function0;
            wn5Var2 = wn5Var;
            bfg.f(z2, function02, new q0k(f2, f2, f2, f2), p6g.n(z7l.h(oq5Var).f, oq5Var), false, wn5Var2, oq5Var, (i3 & 112) | (i3 & 14) | 384 | 196608, 16);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new oc1(z2, function02, wn5Var2, i2);
        }
    }

    public static final void k(bdf bdfVar, hq5 hq5Var, int i2) {
        bdfVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-668723301);
        int i3 = (oq5Var.h(bdfVar) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            pdf pdfVar = (pdf) szf.Q(bdfVar.e, oq5Var).getValue();
            int i4 = 3;
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            boolean h2 = oq5Var.h(bdfVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                v2d v2dVar = new v2d(0, bdfVar, bdf.class, "onBackClicked", "onBackClicked()V", 0, 14);
                oq5Var.k0(v2dVar);
                K = v2dVar;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean h3 = oq5Var.h(bdfVar);
            Object K2 = oq5Var.K();
            if (h3 || K2 == kjnVar) {
                v2d v2dVar2 = new v2d(0, bdfVar, bdf.class, "onSearchClicked", "onSearchClicked()V", 0, 16);
                oq5Var.k0(v2dVar2);
                K2 = v2dVar2;
            }
            Function0 function02 = (Function0) ((h9f) K2);
            boolean h4 = oq5Var.h(bdfVar);
            Object K3 = oq5Var.K();
            if (h4 || K3 == kjnVar) {
                v2d v2dVar3 = new v2d(0, bdfVar, bdf.class, "openSortBottomSheet", "openSortBottomSheet()V", 0, 18);
                oq5Var.k0(v2dVar3);
                K3 = v2dVar3;
            }
            kg5.g(R.string.kids_albums_and_podcasts_title, a2, function0, function02, (Function0) ((h9f) K3), ild.C(731160072, new vtb(i4, pdfVar, bdfVar, a2), oq5Var), oq5Var, 196608, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new nha(bdfVar, i2, 21);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(yci yciVar, fvf fvfVar, o0k o0kVar, boolean z, boolean z2, jic jicVar, boolean z3, qg0 qg0Var, gz2 gz2Var, ox0 ox0Var, hz2 hz2Var, mx0 mx0Var, Function1 function1, hq5 hq5Var, int i2, int i3, int i4) {
        int i5;
        gz2 gz2Var2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        yci yciVar2;
        oq5 oq5Var;
        fvf fvfVar2;
        ox0 ox0Var2;
        hz2 hz2Var2;
        mx0 mx0Var2;
        xmn r;
        int i13;
        kjn kjnVar;
        int i14;
        fvf fvfVar3;
        p9f p9fVar;
        yci yciVar3;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(924924659);
        if ((i2 & 6) == 0) {
            i5 = (oq5Var2.f(yciVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= oq5Var2.f(fvfVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= oq5Var2.f(o0kVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= oq5Var2.g(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= oq5Var2.g(z2) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i5 |= oq5Var2.f(jicVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((i2 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i5 |= oq5Var2.g(z3) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= oq5Var2.f(qg0Var) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        int i15 = i5 | 100663296;
        int i16 = i4 & RemoteCameraConfig.Mic.BUFFER_SIZE;
        if (i16 != 0) {
            i15 = i5 | 905969664;
        } else if ((i2 & 805306368) == 0) {
            gz2Var2 = gz2Var;
            i15 |= oq5Var2.f(gz2Var2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
            i6 = i4 & 1024;
            if (i6 == 0) {
                i7 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                i7 = i3 | (oq5Var2.f(ox0Var) ? 4 : 2);
            } else {
                i7 = i3;
            }
            i8 = i4 & 2048;
            if (i8 == 0) {
                i7 |= 48;
                i9 = i8;
            } else if ((i3 & 48) == 0) {
                i9 = i8;
                i7 |= oq5Var2.f(hz2Var) ? 32 : 16;
            } else {
                i9 = i8;
            }
            int i17 = i7;
            i10 = i4 & 4096;
            if (i10 == 0) {
                i11 = i17 | 384;
            } else if ((i3 & 384) == 0) {
                i11 = i17 | (oq5Var2.f(mx0Var) ? 256 : 128);
            } else {
                i11 = i17;
            }
            if ((i3 & 3072) == 0) {
                i11 |= oq5Var2.h(function1) ? 2048 : 1024;
            }
            i12 = i11;
            if (oq5Var2.P(i15 & 1, (i15 & 306783379) == 306783378 || (i12 & 1171) != 1170)) {
                yciVar2 = yciVar;
                oq5Var = oq5Var2;
                fvfVar2 = fvfVar;
                oq5Var.S();
                ox0Var2 = ox0Var;
                hz2Var2 = hz2Var;
                mx0Var2 = mx0Var;
            } else {
                gz2 gz2Var3 = i16 != 0 ? null : gz2Var2;
                ox0 ox0Var3 = i6 != 0 ? null : ox0Var;
                hz2 hz2Var3 = i9 != 0 ? null : hz2Var;
                mx0 mx0Var3 = i10 != 0 ? null : mx0Var;
                int i18 = (i15 >> 3) & 14;
                int i19 = i18 | ((i12 >> 6) & 112);
                aqi o0 = szf.o0(function1, oq5Var2);
                boolean z4 = (((i19 & 14) ^ 6) > 4 && oq5Var2.f(fvfVar)) || (i19 & 6) == 4;
                Object K = oq5Var2.K();
                kjn kjnVar2 = gq5.a;
                if (z4 || K == kjnVar2) {
                    atf atfVar = new atf();
                    atfVar.a = new u6k(Integer.MAX_VALUE);
                    atfVar.b = new u6k(Integer.MAX_VALUE);
                    rwd rwdVar = rwd.h;
                    i13 = i12;
                    K = new jk6(0, 4, sdr.class, szf.T(rwdVar, new t03(16, szf.T(rwdVar, new uv2(o0, 4)), fvfVar, atfVar)), Constants.KEY_VALUE, "getValue()Ljava/lang/Object;");
                    oq5Var2.k0(K);
                } else {
                    i13 = i12;
                }
                p9f p9fVar2 = (p9f) K;
                int i20 = i15 >> 9;
                int i21 = i18 | (i20 & 112);
                boolean z5 = ((((i21 & 112) ^ 48) > 32 && oq5Var2.g(z2)) || (i21 & 48) == 32) | ((((i21 & 14) ^ 6) > 4 && oq5Var2.f(fvfVar)) || (i21 & 6) == 4);
                Object K2 = oq5Var2.K();
                if (z5 || K2 == kjnVar2) {
                    K2 = new muf(fvfVar, z2, 1);
                    oq5Var2.k0(K2);
                }
                luf lufVar = (luf) K2;
                Object K3 = oq5Var2.K();
                if (K3 == kjnVar2) {
                    K3 = gld.R(g.a, oq5Var2);
                    oq5Var2.k0(K3);
                }
                mm6 mm6Var = (mm6) K3;
                uod uodVar = (uod) oq5Var2.j(es5.g);
                wfl wflVar = !((Boolean) oq5Var2.j(es5.v)).booleanValue() ? bhr.a : null;
                int i22 = i13 << 18;
                int i23 = (i15 & 65520) | (i20 & 458752) | (i20 & 3670016) | (i22 & 29360128) | (i22 & 234881024) | ((i13 << 27) & 1879048192);
                boolean f2 = ((((i23 & 3670016) ^ ScreenMirroringConfig.Video.BITRATE_1_5MB) > 1048576 && oq5Var2.f(gz2Var3)) || (i23 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 1048576) | ((((i23 & 112) ^ 48) > 32 && oq5Var2.f(fvfVar)) || (i23 & 48) == 32) | ((((i23 & 896) ^ 384) > 256 && oq5Var2.f(o0kVar)) || (i23 & 384) == 256) | ((((i23 & 7168) ^ 3072) > 2048 && oq5Var2.g(z)) || (i23 & 3072) == 2048) | ((((57344 & i23) ^ 24576) > 16384 && oq5Var2.g(z2)) || (i23 & 24576) == 16384) | ((((i23 & 29360128) ^ 12582912) > 8388608 && oq5Var2.f(hz2Var3)) || (i23 & 12582912) == 8388608) | ((((i23 & 234881024) ^ 100663296) > 67108864 && oq5Var2.f(mx0Var3)) || (i23 & 100663296) == 67108864) | ((((i23 & 1879048192) ^ 805306368) > 536870912 && oq5Var2.f(ox0Var3)) || (i23 & 805306368) == 536870912) | oq5Var2.f(uodVar) | oq5Var2.f(wflVar);
                Object K4 = oq5Var2.K();
                if (f2 || K4 == kjnVar2) {
                    kjnVar = kjnVar2;
                    i14 = 4;
                    wfl wflVar2 = wflVar;
                    oq5Var = oq5Var2;
                    mx0 mx0Var4 = mx0Var3;
                    K4 = new zuf(fvfVar, z2, o0kVar, z, p9fVar2, ox0Var3, mx0Var4, mm6Var, uodVar, wflVar2, gz2Var3, hz2Var3);
                    ox0Var2 = ox0Var3;
                    mx0Var2 = mx0Var4;
                    fvfVar3 = fvfVar;
                    p9fVar = p9fVar2;
                    oq5Var.k0(K4);
                } else {
                    mx0Var2 = mx0Var3;
                    oq5Var = oq5Var2;
                    kjnVar = kjnVar2;
                    i14 = 4;
                    ox0Var2 = ox0Var3;
                    fvfVar3 = fvfVar;
                    p9fVar = p9fVar2;
                }
                Function2 function2 = (Function2) K4;
                bxj bxjVar = z2 ? bxj.a : bxj.b;
                if (z3) {
                    oq5Var.Z(-1513147781);
                    int i24 = i18 | ((i15 >> 21) & 112);
                    boolean z6 = ((((i24 & 14) ^ 6) > i14 && oq5Var.f(fvfVar3)) || (i24 & 6) == i14) | (((i24 & 112) ^ 48) > 32 && oq5Var.d(0));
                    Object K5 = oq5Var.K();
                    if (z6 || K5 == kjnVar) {
                        K5 = new quf(fvfVar3);
                        oq5Var.k0(K5);
                    }
                    yciVar3 = androidx.compose.foundation.lazy.layout.a.a((quf) K5, fvfVar3.n, z, bxjVar);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-1512720880);
                    oq5Var.p(false);
                    yciVar3 = vci.a;
                }
                yciVar2 = yciVar;
                p9f p9fVar3 = p9fVar;
                yci f3 = androidx.compose.foundation.lazy.layout.a.b(yciVar2.f(fvfVar3.k).f(fvfVar3.l), p9fVar, lufVar, bxjVar, z3, z).f(yciVar3).f(fvfVar3.m.k);
                fvf fvfVar4 = fvfVar3;
                fvfVar2 = fvfVar4;
                n7w.t(p9fVar3, androidx.compose.foundation.a.n(f3, fvfVar4, bxjVar, z3, z, jicVar, fvfVar4.f, false, qg0Var, null), fvfVar2.o, function2, oq5Var, 0, 0);
                gz2Var2 = gz2Var3;
                hz2Var2 = hz2Var3;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new xuf(yciVar2, fvfVar2, o0kVar, z, z2, jicVar, z3, qg0Var, gz2Var2, ox0Var2, hz2Var2, mx0Var2, function1, i2, i3, i4);
                return;
            }
            return;
        }
        gz2Var2 = gz2Var;
        i6 = i4 & 1024;
        if (i6 == 0) {
        }
        i8 = i4 & 2048;
        if (i8 == 0) {
        }
        int i172 = i7;
        i10 = i4 & 4096;
        if (i10 == 0) {
        }
        if ((i3 & 3072) == 0) {
        }
        i12 = i11;
        if (oq5Var2.P(i15 & 1, (i15 & 306783379) == 306783378 || (i12 & 1171) != 1170)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void m(int i2, hq5 hq5Var, yci yciVar, Function0 function0, boolean z) {
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2122088749);
        int i3 = (oq5Var.g(z) ? 4 : 2) | i2 | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            c3x.k(z ? R.drawable.ic_sound_on_24 : R.drawable.ic_sound_off_24, function0, li6.c, rvf.M(z ? R.string.mute_description : R.string.unmute_description, oq5Var), yciVar, oq5Var, (i3 & 112) | 384 | ((i3 << 6) & 57344));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tm(z, function0, yciVar, i2, 3);
        }
    }

    public static final void n(dgv dgvVar, yci yciVar, boolean z, rev revVar, Function1 function1, Function1 function12, iev ievVar, sh4 sh4Var, Function1 function13, hq5 hq5Var, int i2) {
        int i3;
        boolean z2;
        rev revVar2;
        Function1 function14;
        int i4;
        rev revVar3;
        Function1 function15;
        boolean z3;
        dgvVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1331058923);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(dgvVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        int i5 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i5 = i3 | 1408;
        }
        if ((i2 & 24576) == 0) {
            i5 |= oq5Var.h(function1) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i6 = i5 | 196608;
        if ((1572864 & i2) == 0) {
            i6 |= oq5Var.h(ievVar) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i6 |= oq5Var.h(sh4Var) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i2) == 0) {
            i6 |= oq5Var.h(function13) ? 67108864 : 33554432;
        }
        if (oq5Var.P(i6 & 1, (38347923 & i6) != 38347922)) {
            oq5Var.U();
            int i7 = i2 & 1;
            Object obj = gq5.a;
            if (i7 == 0 || oq5Var.y()) {
                Object K = oq5Var.K();
                if (K == obj) {
                    K = gld.R(g.a, oq5Var);
                    oq5Var.k0(K);
                }
                mm6 mm6Var = (mm6) K;
                boolean f2 = oq5Var.f(mm6Var);
                Object K2 = oq5Var.K();
                if (f2 || K2 == obj) {
                    K2 = new rev(mm6Var);
                    oq5Var.k0(K2);
                }
                rev revVar4 = (rev) K2;
                int i8 = i6 & (-7169);
                Object K3 = oq5Var.K();
                if (K3 == obj) {
                    K3 = new u4(6);
                    oq5Var.k0(K3);
                }
                i4 = i8;
                revVar3 = revVar4;
                function15 = (Function1) K3;
                z3 = true;
            } else {
                oq5Var.S();
                z3 = z;
                revVar3 = revVar;
                i4 = i6 & (-7169);
                function15 = function12;
            }
            oq5Var.q();
            Object K4 = oq5Var.K();
            if (K4 == obj) {
                K4 = szf.g0(null);
                oq5Var.k0(K4);
            }
            aqi aqiVar = (aqi) K4;
            boolean z4 = z3 && ((Boolean) revVar3.b.getValue()).booleanValue();
            Object K5 = oq5Var.K();
            if (K5 == obj) {
                K5 = new jc(aqiVar, 0);
                oq5Var.k0(K5);
            }
            pd.c(48, 0, oq5Var, (Function0) K5, z4);
            WebView webView = (WebView) aqiVar.getValue();
            boolean f3 = oq5Var.f(revVar3);
            Object K6 = oq5Var.K();
            if (f3 || K6 == obj) {
                K6 = new l5(revVar3, aqiVar, null, 3);
                oq5Var.k0(K6);
            }
            gld.y(webView, revVar3, (Function2) K6, oq5Var);
            WebView webView2 = (WebView) aqiVar.getValue();
            boolean z5 = (i4 & 14) == 4;
            Object K7 = oq5Var.K();
            if (z5 || K7 == obj) {
                K7 = new l5(aqiVar, dgvVar, null, 4);
                oq5Var.k0(K7);
            }
            gld.y(webView2, dgvVar, (Function2) K7, oq5Var);
            Object o0 = szf.o0(function15, oq5Var);
            Object obj2 = (WebView) aqiVar.getValue();
            if (obj2 == null) {
                oq5Var.Z(1858195657);
            } else {
                oq5Var.Z(1858195658);
                boolean f4 = oq5Var.f(o0) | oq5Var.h(obj2);
                Object K8 = oq5Var.K();
                if (f4 || K8 == obj) {
                    K8 = new kc(0, obj2, o0);
                    oq5Var.k0(K8);
                }
                gld.k(obj2, (Function1) K8, oq5Var);
            }
            oq5Var.p(false);
            ievVar.a = dgvVar;
            revVar3.getClass();
            ievVar.b = revVar3;
            sh4Var.b = dgvVar;
            bg3.a(yciVar, null, false, ild.C(-419913089, new lc(function13, function1, sh4Var, ievVar, aqiVar, 0), oq5Var), oq5Var, ((i4 >> 3) & 14) | 3072, 6);
            function14 = function15;
            z2 = z3;
            revVar2 = revVar3;
        } else {
            oq5Var.S();
            z2 = z;
            revVar2 = revVar;
            function14 = function12;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mc(dgvVar, yciVar, z2, revVar2, function1, function14, ievVar, sh4Var, function13, i2);
        }
    }

    public static final void o(eqi eqiVar, xci xciVar) {
        eqi y = F(xciVar).y();
        int i2 = y.c - 1;
        Object[] objArr = y.a;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                eqiVar.d((xci) ((mpf) objArr[i2]).F.f);
                i2--;
            }
        }
    }

    public static final xci p(eqi eqiVar) {
        int i2;
        if (eqiVar == null || (i2 = eqiVar.c) == 0) {
            return null;
        }
        return (xci) eqiVar.m(i2 - 1);
    }

    public static final dyj q(sm8 sm8Var, boolean z, xzb xzbVar) {
        Float J;
        Float J2;
        szb szbVar = sm8Var.e;
        szb szbVar2 = sm8Var.b;
        szb szbVar3 = sm8Var.h;
        int ordinal = ((rm8) szbVar.a(xzbVar)).ordinal();
        r3 = null;
        Float valueOf = null;
        r3 = null;
        Float valueOf2 = null;
        if (ordinal == 1) {
            if (z) {
                if (szbVar3 != null) {
                    J = J(Double.valueOf(((Number) szbVar3.a(xzbVar)).doubleValue()));
                }
                J = null;
            } else {
                if (szbVar2 != null) {
                    J = J(Double.valueOf(((Number) szbVar2.a(xzbVar)).doubleValue()));
                }
                J = null;
            }
            if (z) {
                J2 = J(szbVar2 != null ? (Double) szbVar2.a(xzbVar) : null);
            } else {
                J2 = J(szbVar3 != null ? (Double) szbVar3.a(xzbVar) : null);
            }
            return new e1u(J != null ? J.floatValue() : -1.0f, J2 != null ? J2.floatValue() : 0.0f);
        }
        if (ordinal == 2) {
            if (z) {
                Double d2 = szbVar3 != null ? (Double) szbVar3.a(xzbVar) : null;
                if (d2 != null) {
                    float doubleValue = (float) d2.doubleValue();
                    valueOf2 = Float.valueOf(doubleValue >= 0.0f ? doubleValue : 0.0f);
                }
            } else {
                Double d3 = szbVar2 != null ? (Double) szbVar2.a(xzbVar) : null;
                if (d3 != null) {
                    float doubleValue2 = (float) d3.doubleValue();
                    valueOf2 = Float.valueOf(doubleValue2 >= 0.0f ? doubleValue2 : 0.0f);
                }
            }
            return new pso(valueOf2 != null ? valueOf2.floatValue() : 1.0f, 0.5f, 0.5f);
        }
        if (ordinal == 5) {
            return null;
        }
        if (z) {
            Double d4 = szbVar3 != null ? (Double) szbVar3.a(xzbVar) : null;
            if (d4 != null) {
                valueOf = Float.valueOf(yhn.c((float) d4.doubleValue(), 0.0f, 1.0f));
            }
        } else {
            Double d5 = szbVar2 != null ? (Double) szbVar2.a(xzbVar) : null;
            if (d5 != null) {
                valueOf = Float.valueOf(yhn.c((float) d5.doubleValue(), 0.0f, 1.0f));
            }
        }
        x3c x3cVar = new x3c(valueOf != null ? valueOf.floatValue() : 1.0f);
        x3cVar.a0(z ? 1 : 2);
        return x3cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final epf r(xci xciVar) {
        if ((xciVar.c & 2) != 0) {
            if (xciVar instanceof epf) {
                return (epf) xciVar;
            }
            if (xciVar instanceof cw7) {
                xci xciVar2 = ((cw7) xciVar).p;
                while (xciVar2 != 0) {
                    if (xciVar2 instanceof epf) {
                        return (epf) xciVar2;
                    }
                    xciVar2 = (!(xciVar2 instanceof cw7) || (xciVar2.c & 2) == 0) ? xciVar2.f : ((cw7) xciVar2).p;
                }
            }
        }
        return null;
    }

    public static void t(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vdn.X, i2, i3);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                v(context, k, "Theme.MaterialComponents");
            }
        }
        v(context, j, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void u(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vdn.X, i2, i3);
        boolean z = false;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            for (int i4 : iArr2) {
                if (obtainStyledAttributes2.getResourceId(i4, -1) == -1) {
                    obtainStyledAttributes2.recycle();
                    break;
                }
            }
            obtainStyledAttributes2.recycle();
            z = true;
            obtainStyledAttributes.recycle();
            if (z) {
                return;
            }
            xq0.x("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void v(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!obtainStyledAttributes.hasValue(i2)) {
                obtainStyledAttributes.recycle();
                xq0.x(hrg.q("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static final aqi w(pjc pjcVar, Object obj, nyf nyfVar, lyf lyfVar, CoroutineContext coroutineContext, hq5 hq5Var, int i2) {
        Object[] objArr = {pjcVar, nyfVar, lyfVar, coroutineContext};
        oq5 oq5Var = (oq5) hq5Var;
        boolean h2 = ((((i2 & 7168) ^ 3072) > 2048 && oq5Var.d(lyfVar.ordinal())) || (i2 & 3072) == 2048) | oq5Var.h(nyfVar) | oq5Var.h(coroutineContext) | oq5Var.h(pjcVar);
        Object K = oq5Var.K();
        if (h2 || K == gq5.a) {
            ov ovVar = new ov(nyfVar, lyfVar, coroutineContext, pjcVar, (Continuation) null, 20);
            oq5Var.k0(ovVar);
            K = ovVar;
        }
        return szf.m0(obj, objArr, (Function2) K, oq5Var);
    }

    public static final aqi x(vdr vdrVar, hq5 hq5Var, int i2) {
        dzf dzfVar = (dzf) ((oq5) hq5Var).j(ykg.a);
        lyf lyfVar = lyf.d;
        g gVar = g.a;
        Object value = vdrVar.getValue();
        nyf lifecycle = dzfVar.getLifecycle();
        int i3 = i2 & 14;
        int i4 = i2 << 3;
        return w(vdrVar, value, lifecycle, lyfVar, gVar, hq5Var, i3 | (i4 & 7168) | (i4 & 57344));
    }

    public static float[] y() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    }

    public static String z(int i2) {
        return dfi.c(i2, "activity with result code: ", " indicating not RESULT_OK");
    }

    public abstract int s(ksk kskVar);
}
