package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Looper;
import androidx.compose.animation.c;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.squareup.moshi.internal.Util$ParameterizedTypeImpl;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public abstract class wdg {
    public static final Object A(n7q n7qVar, p7q p7qVar) {
        n7qVar.getClass();
        p7qVar.getClass();
        if (n7qVar instanceof u7u) {
            return p7qVar.u((u7u) n7qVar);
        }
        if (n7qVar instanceof szu) {
            return p7qVar.n((szu) n7qVar);
        }
        if (n7qVar instanceof ioc) {
            return p7qVar.m((ioc) n7qVar);
        }
        if (n7qVar instanceof y4d) {
            return p7qVar.q((y4d) n7qVar);
        }
        if (n7qVar instanceof t1q) {
            return p7qVar.t((t1q) n7qVar);
        }
        if (n7qVar instanceof maq) {
            return p7qVar.q0((maq) n7qVar);
        }
        kac.j(n7qVar, "Developer Error. Unexpected class for visit ");
        return null;
    }

    public static final void B(eak eakVar, hq4 hq4Var, fq4 fq4Var, long j, float f, float f2) {
        float f3 = fq4Var.a;
        float f4 = fq4Var.b;
        if (T(hq4Var)) {
            return;
        }
        float floatValue = Float.valueOf(f4).floatValue() - Float.valueOf(f3).floatValue();
        float c = yhn.c((((Number) hq4Var.g()).floatValue() - Float.valueOf(f3).floatValue()) / floatValue, 0.0f, 1.0f);
        float c2 = yhn.c((Float.valueOf(f4).floatValue() - ((Number) hq4Var.m()).floatValue()) / floatValue, 0.0f, 1.0f);
        float f5 = c * 180.0f;
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i) - f2;
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i2) - f2;
        float intBitsToFloat3 = Float.intBitsToFloat(i) + f2;
        float intBitsToFloat4 = Float.intBitsToFloat(i2) + f2;
        float f6 = f + f5;
        float f7 = (180.0f - (c2 * 180.0f)) - f5;
        nh0 nh0Var = (nh0) eakVar;
        nh0Var.getClass();
        if (nh0Var.b == null) {
            nh0Var.b = new RectF();
        }
        RectF rectF = nh0Var.b;
        rectF.getClass();
        rectF.set(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4);
        Path path = nh0Var.a;
        RectF rectF2 = nh0Var.b;
        rectF2.getClass();
        path.arcTo(rectF2, f6, f7, false);
    }

    public static final fq4 C(fq4 fq4Var, fq4 fq4Var2) {
        float f = fq4Var.b;
        float f2 = fq4Var2.a;
        float f3 = fq4Var.a;
        float floatValue = Float.valueOf(f3).floatValue();
        float f4 = fq4Var2.b;
        if (floatValue >= Float.valueOf(f4).floatValue() || Float.valueOf(f2).floatValue() >= Float.valueOf(f).floatValue()) {
            return null;
        }
        float floatValue2 = Float.valueOf(f3).floatValue();
        float floatValue3 = Float.valueOf(f2).floatValue();
        if (floatValue2 < floatValue3) {
            floatValue2 = floatValue3;
        }
        float floatValue4 = Float.valueOf(f).floatValue();
        float floatValue5 = Float.valueOf(f4).floatValue();
        if (floatValue4 > floatValue5) {
            floatValue4 = floatValue5;
        }
        return new fq4(floatValue2, floatValue4);
    }

    public static final void D(eak eakVar, hq4 hq4Var, fq4 fq4Var, float f, float f2, float f3, float f4) {
        float f5 = fq4Var.b;
        float f6 = fq4Var.a;
        if (T(hq4Var)) {
            return;
        }
        float f7 = f3 - f;
        float f8 = f4 - f2;
        float floatValue = (((Number) hq4Var.g()).floatValue() - Float.valueOf(f6).floatValue()) / (Float.valueOf(f5).floatValue() - Float.valueOf(f6).floatValue());
        float floatValue2 = (((Number) hq4Var.m()).floatValue() - Float.valueOf(f5).floatValue()) / (Float.valueOf(f5).floatValue() - Float.valueOf(f6).floatValue());
        nh0 nh0Var = (nh0) eakVar;
        nh0Var.f((floatValue * f7) + f, (floatValue * f8) + f2);
        nh0Var.e((f7 * floatValue2) + f3, (floatValue2 * f8) + f4);
    }

    public static final void E() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        ssg.a(7, null, "Should be called from main thread", new IllegalStateException("Should be called from main thread"));
    }

    public static ood F(String str, ja jaVar, String str2) {
        String str3;
        if (str == null) {
            return null;
        }
        String str4 = ood.j;
        ood S = h1b.S(jaVar, String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1)), null, null);
        Bundle bundle = S.d;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("tree", str);
        Context b = j3c.b();
        try {
            str3 = b.getPackageManager().getPackageInfo(b.getPackageName(), 0).versionName;
            str3.getClass();
        } catch (PackageManager.NameNotFoundException unused) {
            str3 = "";
        }
        bundle.putString("app_version", str3);
        bundle.putString("platform", ConstantDeviceInfo.APP_PLATFORM);
        bundle.putString("request_type", "app_indexing");
        bundle.putString("device_session_id", ds4.a());
        S.d = bundle;
        reu reuVar = reu.a;
        HashSet hashSet = j3c.a;
        synchronized (hashSet) {
        }
        synchronized (hashSet) {
        }
        S.f = reuVar;
        return S;
    }

    public static final String G(String str) {
        str.getClass();
        return "https://music.yandex.ru/multivibe/" + str;
    }

    public static void H(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    public static Type I(Type type) {
        if (!Collection.class.isAssignableFrom(Collection.class)) {
            e7o.e();
            return null;
        }
        Type e = avt.e(type, Collection.class, avt.c(type, Collection.class, Collection.class), new LinkedHashSet());
        if (e instanceof WildcardType) {
            e = ((WildcardType) e).getUpperBounds()[0];
        }
        return e instanceof ParameterizedType ? ((ParameterizedType) e).getActualTypeArguments()[0] : Object.class;
    }

    public static aqi J() {
        return new x6k(Unit.a, wvo.e);
    }

    public static boolean L(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? L(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return L(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof Util$ParameterizedTypeImpl ? ((Util$ParameterizedTypeImpl) parameterizedType).c : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof Util$ParameterizedTypeImpl ? ((Util$ParameterizedTypeImpl) parameterizedType2).c : parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return L(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return L(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static oav M(int i) {
        return new oav(k5r.i(i, "id_"), k5r.i(i, "Tab "), u75.h(ldg.u("1"), ldg.u("2"), ldg.u("3")));
    }

    public static final Object O(jfp jfpVar, xfp xfpVar) {
        Object g = jfpVar.a.g(xfpVar);
        if (g == null) {
            return null;
        }
        return g;
    }

    public static Class P(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) P(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return P(((WildcardType) type).getUpperBounds()[0]);
        }
        wvs.i("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    public static boolean S(byte[] bArr, lur lurVar) {
        lur lurVar2;
        lurVar.getClass();
        lur.b.getClass();
        if (bArr != null && bArr.length >= 2) {
            lur[] values = lur.values();
            int length = values.length;
            for (int i = 0; i < length; i++) {
                lurVar2 = values[i];
                byte[] bArr2 = lurVar2.a;
                if ((bArr2.length == 1 && bArr[bArr.length - 2] == bArr2[0]) || (bArr[bArr.length - 2] == bArr2[0] && bArr[bArr.length - 1] == bArr2[1])) {
                    break;
                }
            }
        }
        lurVar2 = null;
        return lurVar2 == lurVar;
    }

    public static final boolean T(hq4 hq4Var) {
        return ((Number) hq4Var.m()).floatValue() <= ((Number) hq4Var.g()).floatValue();
    }

    public static final Double U(double d, gq4 gq4Var, gq4 gq4Var2) {
        if (((Number) gq4Var.g()).doubleValue() >= ((Number) gq4Var.m()).doubleValue()) {
            return null;
        }
        double doubleValue = (((Number) gq4Var2.m()).doubleValue() - ((Number) gq4Var2.g()).doubleValue()) / (((Number) gq4Var.m()).doubleValue() - ((Number) gq4Var.g()).doubleValue());
        return Double.valueOf(Double.parseDouble(String.format(Locale.ENGLISH, "%.4f", Arrays.copyOf(new Object[]{Double.valueOf(((((Number) yhn.h(Double.valueOf(d), gq4Var)).doubleValue() - ((Number) gq4Var.g()).doubleValue()) * doubleValue) + ((Number) gq4Var2.g()).doubleValue())}, 1))));
    }

    public static final yci V(yci yciVar, float f, float f2) {
        yciVar.getClass();
        return vnj.r(yciVar, "com.yandex.music.screen.player.ui.components.marquee", new Object[0], new mbh(f, f2, 0));
    }

    public static final zmg X(xdh xdhVar, TimeMark timeMark) {
        xdhVar.getClass();
        timeMark.getClass();
        String str = (String) xdhVar.a;
        c0p c0pVar = (c0p) xdhVar.c;
        apo apoVar = (apo) xdhVar.b;
        p0p p0pVar = (p0p) apoVar.c;
        String str2 = (String) apoVar.b;
        t1p t1pVar = (t1p) xdhVar.d;
        return new zmg(str, c0pVar, p0pVar, str2, t1pVar != null ? t1pVar.name() : null, nsa.f(timeMark.a()));
    }

    public static final ilb Y(hlb hlbVar) {
        hlbVar.getClass();
        int ordinal = hlbVar.ordinal();
        if (ordinal == 0) {
            return ilb.Fullscreen;
        }
        if (ordinal == 1) {
            return ilb.Sheet;
        }
        if (ordinal == 2) {
            return ilb.Tooltip;
        }
        if (ordinal == 3) {
            return ilb.ContextMenu;
        }
        if (ordinal == 4) {
            return ilb.Popup;
        }
        if (ordinal == 5) {
            return ilb.Bar;
        }
        b6e.s();
        return null;
    }

    public static final void a(w4k w4kVar, o6g o6gVar, yci yciVar, String str, hq5 hq5Var, int i) {
        w4kVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(153882228);
        int i2 = i | (oq5Var.h(w4kVar) ? 4 : 2) | (oq5Var.f(o6gVar) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128) | (oq5Var.f(str) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            iz2 iz2Var = b2c.e;
            yci r = d.r(yciVar, 40);
            kfh d = ug3.d(iz2Var, false);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, r);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            d43 d43Var = new d43(((dq0) oq5Var.j(eq0.a)).a.a, 5);
            yci m = d.m(vci.a, 32);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new coi(8);
                oq5Var.k0(K);
            }
            yci a = androidx.compose.ui.graphics.a.a(m, (Function1) K);
            boolean z = (i2 & 112) == 32;
            Object K2 = oq5Var.K();
            if (z || K2 == kjnVar) {
                K2 = new g83(o6gVar, 13);
                oq5Var.k0(K2);
            }
            irf.r(w4kVar, str, androidx.compose.ui.draw.a.b(a, (Function1) K2), null, hd6.b, 0.0f, d43Var, oq5Var, (i2 & 14) | 24576 | ((i2 >> 6) & 112), 40);
            oq5Var.p(true);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new av5(i, 19, w4kVar, o6gVar, yciVar, str);
        }
    }

    public static void a0(int i, String str) {
        if (i >= 0) {
            return;
        }
        l1j.h(i, str, " cannot be negative but was: ");
    }

    public static final void b(final float f, yci yciVar, boolean z, final float f2, final vyj vyjVar, hq5 hq5Var, int i) {
        final boolean z2;
        boolean z3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-380716992);
        int i2 = i | (oq5Var.c(f) ? 4 : 2) | (oq5Var.f(yciVar) ? 32 : 16) | 384 | (oq5Var.f(vyjVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            z3 = z;
        } else {
            oq5Var.U();
            boolean z4 = true;
            if ((i & 1) == 0 || oq5Var.y()) {
                z2 = true;
            } else {
                oq5Var.S();
                z2 = z;
            }
            oq5Var.q();
            double d = f;
            if (0.0d > d || d > 1.0d) {
                xq0.q("Only progress between 0.0 and 1.0 is allowed.");
                return;
            }
            yci C = dag.C(androidx.compose.foundation.layout.a.m(yciVar, f2 / 2), f);
            boolean z5 = (i2 & 14) == 4;
            if ((((57344 & i2) ^ 24576) <= 16384 || !oq5Var.f(vyjVar)) && (i2 & 24576) != 16384) {
                z4 = false;
            }
            boolean z6 = z5 | z4;
            Object K = oq5Var.K();
            if (z6 || K == gq5.a) {
                K = new Function1() { // from class: wyj
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        np3 np3Var = (np3) obj;
                        np3Var.getClass();
                        float d2 = nmq.d(np3Var.a.e());
                        float b = nmq.b(np3Var.a.e());
                        if (b > d2) {
                            dfi.r("Unsupported aspect ratio height is greater than width {w:" + d2 + ",h:" + b + "}", "OvalProgressIndicator");
                            b = d2;
                        }
                        float density = np3Var.getDensity() * f2;
                        vfh vfhVar = new vfh(d2, b, new amr(density, 0.0f, 0, 0, 30));
                        fq4 fq4Var = new fq4(0.0f, 1.0f);
                        n8g b2 = t75.b();
                        fq4 C2 = wdg.C(fq4Var, vfhVar.e);
                        if (C2 != null && !wdg.T(C2)) {
                            b2.add(new zr3(vfhVar.j, C2));
                        }
                        fq4 C3 = wdg.C(fq4Var, vfhVar.f);
                        if (C3 != null && !wdg.T(C3)) {
                            b2.add(new zr3(vfhVar.k, C3));
                        }
                        fq4 C4 = wdg.C(fq4Var, vfhVar.g);
                        if (C4 != null && !wdg.T(C4)) {
                            b2.add(new zr3(vfhVar.l, C4));
                        }
                        fq4 C5 = wdg.C(fq4Var, vfhVar.h);
                        if (C5 != null && !wdg.T(C5)) {
                            b2.add(new zr3(vfhVar.m, C5));
                        }
                        fq4 C6 = wdg.C(fq4Var, vfhVar.i);
                        if (C6 != null && !wdg.T(C6)) {
                            b2.add(new zr3(vfhVar.n, C6));
                        }
                        final n8g a = t75.a(b2);
                        final amr amrVar = new amr(density, 0.0f, 1, 1, 18);
                        final boolean z7 = z2;
                        final vyj vyjVar2 = vyjVar;
                        final float f3 = f;
                        return np3Var.a(new Function1() { // from class: yyj
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                float f4;
                                jpa jpaVar = (jpa) obj2;
                                jpaVar.getClass();
                                nh0 a2 = ph0.a();
                                List<zr3> list = a;
                                Iterator it = list.iterator();
                                while (true) {
                                    boolean hasNext = it.hasNext();
                                    f4 = f3;
                                    if (!hasNext) {
                                        break;
                                    }
                                    zr3 zr3Var = (zr3) it.next();
                                    Function2 function2 = zr3Var.a;
                                    fq4 fq4Var2 = zr3Var.b;
                                    float f5 = fq4Var2.b;
                                    if (f4 < Float.valueOf(fq4Var2.a).floatValue()) {
                                        function2.invoke(a2, fq4Var2);
                                    } else if (f4 <= Float.valueOf(f5).floatValue()) {
                                        function2.invoke(a2, new fq4(f4, Float.valueOf(f5).floatValue()));
                                    }
                                }
                                boolean z8 = z7;
                                vyj vyjVar3 = vyjVar2;
                                long j = z8 ? vyjVar3.b : vyjVar3.d;
                                amr amrVar2 = amrVar;
                                jpa.x0(jpaVar, a2, j, 0.0f, amrVar2, 52);
                                nh0 a3 = ph0.a();
                                for (zr3 zr3Var2 : list) {
                                    Function2 function22 = zr3Var2.a;
                                    fq4 fq4Var3 = zr3Var2.b;
                                    float f6 = fq4Var3.a;
                                    if (f4 > Float.valueOf(fq4Var3.b).floatValue()) {
                                        function22.invoke(a3, fq4Var3);
                                    } else if (f4 >= Float.valueOf(f6).floatValue()) {
                                        function22.invoke(a3, new fq4(Float.valueOf(f6).floatValue(), f4));
                                    }
                                }
                                jpa.x0(jpaVar, a3, z8 ? vyjVar3.a : vyjVar3.c, 0.0f, amrVar2, 52);
                                return Unit.a;
                            }
                        });
                    }
                };
                oq5Var.k0(K);
            }
            u1g.l(oq5Var, androidx.compose.ui.draw.a.b(C, (Function1) K));
            z3 = z2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xyj(f, yciVar, z3, f2, vyjVar, i);
        }
    }

    public static final void c(rmk rmkVar, Function0 function0, yci yciVar, Function0 function02, hq5 hq5Var, int i) {
        int i2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1418145852);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var.f(rmkVar) : oq5Var.h(rmkVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(function02) ? 2048 : 1024;
        }
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 << 6;
            j66.p(rmkVar.c, o5g.F(oq5Var), androidx.compose.ui.platform.a.a(yciVar, "playlist_grid_item"), function0, qo6.e, function02, null, ild.C(-1911069870, new tik(1, rmkVar), oq5Var), oq5Var, (i3 & 7168) | 12607488 | (i3 & 458752), 64);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(i, 29, rmkVar, function0, yciVar, function02);
        }
    }

    public static final void d(qzl qzlVar, tvd tvdVar, boolean z, boolean z2, boolean z3, nab nabVar, thj thjVar, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        Function0 function02;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1153588291);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var2.f(qzlVar) : oq5Var2.h(qzlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(tvdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.g(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.g(z3) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.h(nabVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var2.h(thjVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= oq5Var2.h(function0) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 67108864 : 33554432;
        }
        if (oq5Var2.P(i2 & 1, (38347923 & i2) != 38347922)) {
            function02 = function0;
            wn5 C = ild.C(1451552810, new gsl(qzlVar, nabVar, thjVar, function0, z3, z2, z, tvdVar), oq5Var2);
            yci s = wyf.s(yciVar, function02);
            Object K = oq5Var2.K();
            if (K == gq5.a) {
                K = szf.U(new nr(tvdVar, 24));
                oq5Var2.k0(K);
            }
            oq5Var = oq5Var2;
            p9b.a(C, s, ((Boolean) ((sdr) K).getValue()).booleanValue(), oq5Var, 6, 0);
        } else {
            function02 = function0;
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fsl(qzlVar, tvdVar, z, z2, z3, nabVar, thjVar, function02, yciVar, i);
        }
    }

    public static final void e(qzl qzlVar, boolean z, boolean z2, boolean z3, tvd tvdVar, nab nabVar, thj thjVar, yci yciVar, hq5 hq5Var, int i) {
        qzlVar.getClass();
        tvdVar.getClass();
        nabVar.getClass();
        thjVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2008263351);
        int i2 = i | (oq5Var.f(qzlVar) ? 4 : 2) | (oq5Var.g(z) ? 32 : 16) | (oq5Var.g(z2) ? 256 : 128) | (oq5Var.g(z3) ? 2048 : 1024) | (oq5Var.f(tvdVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(nabVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.h(thjVar) ? 1048576 : 524288) | (oq5Var.f(yciVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE);
        if (oq5Var.P(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean z4 = (i2 & 57344) == 16384;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z4 || K == kjnVar) {
                K = new nr(tvdVar, 23);
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = szf.U(new g1j(7, function0));
                oq5Var.k0(K2);
            }
            if (((Boolean) ((sdr) K2).getValue()).booleanValue()) {
                oq5Var.Z(721397946);
                int i3 = i2 << 3;
                d(qzlVar, tvdVar, z, z3, z2, nabVar, thjVar, function0, yciVar, oq5Var, (i2 & 3670016) | (57344 & (i2 << 6)) | (i2 & 14) | ((i2 >> 9) & 112) | (i3 & 896) | (i2 & 7168) | (458752 & i2) | (234881024 & i3));
            } else {
                oq5Var.Z(719758201);
            }
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gsl(qzlVar, z, z2, z3, tvdVar, nabVar, thjVar, yciVar, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x043e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(dam damVar, thj thjVar, gvl gvlVar, rbm rbmVar, hq5 hq5Var, int i) {
        dam damVar2;
        oq5 oq5Var;
        float f;
        kjn kjnVar;
        boolean z;
        u0s u0sVar;
        kjn kjnVar2;
        oq5 oq5Var2;
        Unit unit;
        tvd tvdVar;
        aqi aqiVar;
        kjn kjnVar3;
        int i2;
        jx7 jx7Var;
        boolean h;
        Object ga3Var;
        jx7 jx7Var2;
        aqi aqiVar2;
        boolean z2;
        int i3;
        zbm zbmVar;
        fvf fvfVar;
        ea2 ea2Var;
        eoe eoeVar;
        Object K;
        oq5 oq5Var3;
        boolean f2;
        Object K2;
        int i4;
        Object K3;
        yci a;
        vm C;
        tvd tvdVar2;
        boolean f3;
        Object lbmVar;
        kjn kjnVar4;
        fvf fvfVar2;
        yci yciVar;
        int i5;
        vm vmVar;
        boolean z3;
        oq5 oq5Var4;
        tvd tvdVar3;
        boolean z4;
        Object K4;
        boolean z5;
        Object K5;
        boolean z6;
        Object K6;
        String str;
        iz2 iz2Var = b2c.b;
        rbmVar.getClass();
        oq5 oq5Var5 = (oq5) hq5Var;
        oq5Var5.b0(-1240159755);
        int i6 = 4;
        int i7 = i | (oq5Var5.f(damVar) ? 4 : 2) | (oq5Var5.h(thjVar) ? 32 : 16) | (oq5Var5.h(gvlVar) ? 256 : 128) | (oq5Var5.f(rbmVar) ? 2048 : 1024);
        if (oq5Var5.P(i7 & 1, (i7 & 1171) != 1170)) {
            fvf a2 = hvf.a(0, 0, oq5Var5, 0, 3);
            float f4 = edo.b;
            tvd X = zwf.X(a2, oq5Var5, 6);
            WeakHashMap weakHashMap = rqv.w;
            eoe n = p6g.n(z7l.h(oq5Var5).f, oq5Var5);
            boolean c = oq5Var5.c(f4) | oq5Var5.f(n);
            Object K7 = oq5Var5.K();
            kjn kjnVar5 = gq5.a;
            if (c || K7 == kjnVar5) {
                K7 = new mv(n, i6);
                oq5Var5.k0(K7);
            }
            ea2 v = u2x.v(a2, (Function1) K7, oq5Var5);
            kfh d = ug3.d(iz2Var, false);
            int i8 = oq5Var5.P;
            a l = oq5Var5.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var5, vciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var5.d0();
            if (oq5Var5.O) {
                oq5Var5.k(grbVar);
            } else {
                oq5Var5.n0();
            }
            g0g.U(oq5Var5, d, wp5.f);
            g0g.U(oq5Var5, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var5.O || !Intrinsics.d(oq5Var5.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var5, i8, kb5Var);
            }
            g0g.U(oq5Var5, H, wp5.d);
            pjc pjcVar = (pjc) rbmVar.a.o;
            int i9 = i7 & 7168;
            boolean z7 = i9 == 2048;
            Object K8 = oq5Var5.K();
            if (z7 || K8 == kjnVar5) {
                f = f4;
                kjnVar = kjnVar5;
                ebm ebmVar = new ebm(0, rbmVar, rbm.class, "onConfirmRemoveDownloadedTracksClicked", "onConfirmRemoveDownloadedTracksClicked()V", 0, 2);
                oq5Var5.k0(ebmVar);
                K8 = ebmVar;
            } else {
                f = f4;
                kjnVar = kjnVar5;
            }
            y5g.j(pjcVar, (Function0) ((h9f) K8), oq5Var5, 0);
            Object[] objArr = new Object[0];
            int i10 = i7 & 14;
            boolean z8 = i10 == 4;
            Object K9 = oq5Var5.K();
            if (z8 || K9 == kjnVar) {
                K9 = new ril(21, damVar);
                oq5Var5.k0(K9);
            }
            kjn kjnVar6 = kjnVar;
            aqi aqiVar3 = (aqi) o2g.g0(objArr, null, (Function0) K9, oq5Var5, 0, 6);
            zbm zbmVar2 = (zbm) gvlVar.invoke(oq5Var5, Integer.valueOf((i7 >> 6) & 14));
            List a3 = zbmVar2.a(((jcj) aqiVar3.getValue()).a);
            if (!a3.isEmpty()) {
                Iterator it = a3.iterator();
                while (it.hasNext()) {
                    if (((cbm) it.next()) instanceof bbm) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                jcj jcjVar = (jcj) aqiVar3.getValue();
                jcjVar.getClass();
                int ordinal = jcjVar.a.ordinal();
                if (ordinal == 0) {
                    str = "details";
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return;
                    }
                    str = "episodes";
                }
                u0sVar = vq1.s(jcjVar, str);
            } else {
                u0sVar = null;
            }
            Unit unit2 = Unit.a;
            boolean z9 = z;
            boolean g = oq5Var5.g(z) | oq5Var5.h(u0sVar) | (i9 == 2048);
            Object K10 = oq5Var5.K();
            if (g) {
                kjnVar2 = kjnVar6;
            } else {
                kjnVar2 = kjnVar6;
                if (K10 != kjnVar2) {
                    oq5Var2 = oq5Var5;
                    unit = unit2;
                    kjnVar3 = kjnVar2;
                    tvdVar = X;
                    aqiVar = aqiVar3;
                    i2 = 2048;
                    gld.w(oq5Var2, unit, (Function2) K10);
                    jx7Var = (jx7) oq5Var2.j(es5.h);
                    h = oq5Var2.h(zbmVar2) | oq5Var2.f(a2) | oq5Var2.f(v) | (i9 != i2) | oq5Var2.f(aqiVar) | oq5Var2.f(jx7Var) | oq5Var2.c(f) | oq5Var2.f(n);
                    Object K11 = oq5Var2.K();
                    if (!h || K11 == kjnVar3) {
                        jx7Var2 = jx7Var;
                        aqiVar2 = aqiVar;
                        z2 = true;
                        i3 = i10;
                        ga3Var = new ga3(zbmVar2, a2, rbmVar, v, jx7Var2, aqiVar2, n, (Continuation) null);
                        zbmVar = zbmVar2;
                        fvfVar = a2;
                        ea2Var = v;
                        eoeVar = n;
                        oq5Var2.k0(ga3Var);
                    } else {
                        jx7Var2 = jx7Var;
                        ea2Var = v;
                        aqiVar2 = aqiVar;
                        z2 = true;
                        zbmVar = zbmVar2;
                        eoeVar = n;
                        i3 = i10;
                        ga3Var = K11;
                        fvfVar = a2;
                    }
                    gld.w(oq5Var2, unit, (Function2) ga3Var);
                    zbm zbmVar3 = zbmVar;
                    Object[] objArr2 = new Object[0];
                    K = oq5Var2.K();
                    if (K == kjnVar3) {
                        K = new hvl(18);
                        oq5Var2.k0(K);
                    }
                    Function0 function0 = (Function0) K;
                    u0s u0sVar2 = u0sVar;
                    jx7 jx7Var3 = jx7Var2;
                    Continuation continuation = null;
                    oq5Var3 = oq5Var2;
                    aqi aqiVar4 = aqiVar2;
                    poi poiVar = (poi) o2g.g0(objArr2, null, function0, oq5Var3, 0, 6);
                    f2 = oq5Var3.f(poiVar);
                    K2 = oq5Var3.K();
                    if (!f2 || K2 == kjnVar3) {
                        K2 = new qv(poiVar, continuation, 3);
                        oq5Var3.k0(K2);
                    }
                    gld.w(oq5Var3, unit, (Function2) K2);
                    yci a4 = androidx.compose.ui.platform.a.a(d.c(vciVar, 1.0f), "nonmusic_screen_success");
                    kfh d2 = ug3.d(iz2Var, false);
                    i4 = oq5Var3.P;
                    a l2 = oq5Var3.l();
                    yci H2 = vnj.H(oq5Var3, a4);
                    xp5.T.getClass();
                    grb grbVar2 = wp5.b;
                    oq5Var3.d0();
                    if (oq5Var3.O) {
                        oq5Var3.n0();
                    } else {
                        oq5Var3.k(grbVar2);
                    }
                    g0g.U(oq5Var3, d2, wp5.f);
                    g0g.U(oq5Var3, l2, wp5.e);
                    kb5 kb5Var2 = wp5.g;
                    if (!oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i4))) {
                        ouj.x(i4, oq5Var3, i4, kb5Var2);
                    }
                    g0g.U(oq5Var3, H2, wp5.d);
                    K3 = oq5Var3.K();
                    if (K3 == kjnVar3) {
                        K3 = gld.R(g.a, oq5Var3);
                        oq5Var3.k0(K3);
                    }
                    mm6 mm6Var = (mm6) K3;
                    a = androidx.compose.ui.platform.a.a(d.c(vciVar, 1.0f), "lazy_column");
                    C = ghh.C(ghh.C(androidx.compose.foundation.layout.a.c(0.0f, 0.0f, 0.0f, 16, 7), zs4.g(oq5Var3)), ogp.A(oq5Var3));
                    boolean h2 = oq5Var3.h(zbmVar3) | oq5Var3.f(aqiVar4);
                    tvdVar2 = tvdVar;
                    f3 = h2 | oq5Var3.f(tvdVar2) | (i3 == 4 ? false : z2) | (i9 == 2048 ? false : z2) | oq5Var3.h(u0sVar2) | oq5Var3.h(thjVar) | oq5Var3.h(mm6Var) | oq5Var3.f(jx7Var3) | oq5Var3.c(f) | oq5Var3.f(eoeVar) | oq5Var3.f(fvfVar) | oq5Var3.f(poiVar);
                    Object K12 = oq5Var3.K();
                    if (!f3 || K12 == kjnVar3) {
                        kjnVar4 = kjnVar3;
                        fvfVar2 = fvfVar;
                        yciVar = a;
                        i5 = i9;
                        vmVar = C;
                        z3 = z2;
                        eoe eoeVar2 = eoeVar;
                        oq5Var4 = oq5Var3;
                        lbmVar = new lbm(zbmVar3, fvfVar2, eoeVar2, aqiVar4, tvdVar2, damVar, rbmVar, u0sVar2, mm6Var, jx7Var3, thjVar, poiVar);
                        tvdVar3 = tvdVar2;
                        oq5Var4.k0(lbmVar);
                    } else {
                        lbmVar = K12;
                        oq5Var4 = oq5Var3;
                        tvdVar3 = tvdVar2;
                        kjnVar4 = kjnVar3;
                        fvfVar2 = fvfVar;
                        yciVar = a;
                        vmVar = C;
                        z3 = z2;
                        i5 = i9;
                    }
                    oq5 oq5Var6 = oq5Var4;
                    damVar2 = damVar;
                    weo.f(yciVar, fvfVar2, vmVar, null, null, ea2Var, false, null, (Function1) lbmVar, oq5Var6, 6, 440);
                    oq5Var6.p(z3);
                    String str2 = damVar2.a.a;
                    z4 = i5 == 2048 ? false : z3;
                    K4 = oq5Var6.K();
                    kjn kjnVar7 = kjnVar4;
                    if (!z4 || K4 == kjnVar7) {
                        ebm ebmVar2 = new ebm(0, rbmVar, rbm.class, "onBackClick", "onBackClick()V", 0, 3);
                        oq5Var6.k0(ebmVar2);
                        K4 = ebmVar2;
                    }
                    Function0 function02 = (Function0) ((h9f) K4);
                    z5 = i5 == 2048 ? false : z3;
                    K5 = oq5Var6.K();
                    if (!z5 || K5 == kjnVar7) {
                        ebm ebmVar3 = new ebm(0, rbmVar, rbm.class, "onSearchClick", "onSearchClick()V", 0, 4);
                        oq5Var6.k0(ebmVar3);
                        K5 = ebmVar3;
                    }
                    Function0 function03 = (Function0) ((h9f) K5);
                    z6 = i5 == 2048 ? false : z3;
                    K6 = oq5Var6.K();
                    if (!z6 || K6 == kjnVar7) {
                        K6 = new ebm(0, rbmVar, rbm.class, "onOverflowClick", "onOverflowClick()V", 0, 5);
                        oq5Var6.k0(K6);
                    }
                    edo.c(tvdVar3, str2, null, function02, function03, (Function0) ((h9f) K6), edo.b, oq5Var6, 0, 4);
                    oq5Var = oq5Var6;
                    oq5Var.p(z3);
                }
            }
            oq5Var2 = oq5Var5;
            unit = unit2;
            tvdVar = X;
            aqiVar = aqiVar3;
            kjnVar3 = kjnVar2;
            i2 = 2048;
            K10 = new cg1(z9, u0sVar, rbmVar, (Continuation) null, 16);
            oq5Var2.k0(K10);
            gld.w(oq5Var2, unit, (Function2) K10);
            jx7Var = (jx7) oq5Var2.j(es5.h);
            h = oq5Var2.h(zbmVar2) | oq5Var2.f(a2) | oq5Var2.f(v) | (i9 != i2) | oq5Var2.f(aqiVar) | oq5Var2.f(jx7Var) | oq5Var2.c(f) | oq5Var2.f(n);
            Object K112 = oq5Var2.K();
            if (h) {
            }
            jx7Var2 = jx7Var;
            aqiVar2 = aqiVar;
            z2 = true;
            i3 = i10;
            ga3Var = new ga3(zbmVar2, a2, rbmVar, v, jx7Var2, aqiVar2, n, (Continuation) null);
            zbmVar = zbmVar2;
            fvfVar = a2;
            ea2Var = v;
            eoeVar = n;
            oq5Var2.k0(ga3Var);
            gld.w(oq5Var2, unit, (Function2) ga3Var);
            zbm zbmVar32 = zbmVar;
            Object[] objArr22 = new Object[0];
            K = oq5Var2.K();
            if (K == kjnVar3) {
            }
            Function0 function04 = (Function0) K;
            u0s u0sVar22 = u0sVar;
            jx7 jx7Var32 = jx7Var2;
            Continuation continuation2 = null;
            oq5Var3 = oq5Var2;
            aqi aqiVar42 = aqiVar2;
            poi poiVar2 = (poi) o2g.g0(objArr22, null, function04, oq5Var3, 0, 6);
            f2 = oq5Var3.f(poiVar2);
            K2 = oq5Var3.K();
            if (!f2) {
            }
            K2 = new qv(poiVar2, continuation2, 3);
            oq5Var3.k0(K2);
            gld.w(oq5Var3, unit, (Function2) K2);
            yci a42 = androidx.compose.ui.platform.a.a(d.c(vciVar, 1.0f), "nonmusic_screen_success");
            kfh d22 = ug3.d(iz2Var, false);
            i4 = oq5Var3.P;
            a l22 = oq5Var3.l();
            yci H22 = vnj.H(oq5Var3, a42);
            xp5.T.getClass();
            grb grbVar22 = wp5.b;
            oq5Var3.d0();
            if (oq5Var3.O) {
            }
            g0g.U(oq5Var3, d22, wp5.f);
            g0g.U(oq5Var3, l22, wp5.e);
            kb5 kb5Var22 = wp5.g;
            if (!oq5Var3.O) {
            }
            ouj.x(i4, oq5Var3, i4, kb5Var22);
            g0g.U(oq5Var3, H22, wp5.d);
            K3 = oq5Var3.K();
            if (K3 == kjnVar3) {
            }
            mm6 mm6Var2 = (mm6) K3;
            a = androidx.compose.ui.platform.a.a(d.c(vciVar, 1.0f), "lazy_column");
            C = ghh.C(ghh.C(androidx.compose.foundation.layout.a.c(0.0f, 0.0f, 0.0f, 16, 7), zs4.g(oq5Var3)), ogp.A(oq5Var3));
            boolean h22 = oq5Var3.h(zbmVar32) | oq5Var3.f(aqiVar42);
            tvdVar2 = tvdVar;
            f3 = h22 | oq5Var3.f(tvdVar2) | (i3 == 4 ? false : z2) | (i9 == 2048 ? false : z2) | oq5Var3.h(u0sVar22) | oq5Var3.h(thjVar) | oq5Var3.h(mm6Var2) | oq5Var3.f(jx7Var32) | oq5Var3.c(f) | oq5Var3.f(eoeVar) | oq5Var3.f(fvfVar) | oq5Var3.f(poiVar2);
            Object K122 = oq5Var3.K();
            if (f3) {
            }
            kjnVar4 = kjnVar3;
            fvfVar2 = fvfVar;
            yciVar = a;
            i5 = i9;
            vmVar = C;
            z3 = z2;
            eoe eoeVar22 = eoeVar;
            oq5Var4 = oq5Var3;
            lbmVar = new lbm(zbmVar32, fvfVar2, eoeVar22, aqiVar42, tvdVar2, damVar, rbmVar, u0sVar22, mm6Var2, jx7Var32, thjVar, poiVar2);
            tvdVar3 = tvdVar2;
            oq5Var4.k0(lbmVar);
            oq5 oq5Var62 = oq5Var4;
            damVar2 = damVar;
            weo.f(yciVar, fvfVar2, vmVar, null, null, ea2Var, false, null, (Function1) lbmVar, oq5Var62, 6, 440);
            oq5Var62.p(z3);
            String str22 = damVar2.a.a;
            if (i5 == 2048) {
            }
            K4 = oq5Var62.K();
            kjn kjnVar72 = kjnVar4;
            if (!z4) {
            }
            ebm ebmVar22 = new ebm(0, rbmVar, rbm.class, "onBackClick", "onBackClick()V", 0, 3);
            oq5Var62.k0(ebmVar22);
            K4 = ebmVar22;
            Function0 function022 = (Function0) ((h9f) K4);
            if (i5 == 2048) {
            }
            K5 = oq5Var62.K();
            if (!z5) {
            }
            ebm ebmVar32 = new ebm(0, rbmVar, rbm.class, "onSearchClick", "onSearchClick()V", 0, 4);
            oq5Var62.k0(ebmVar32);
            K5 = ebmVar32;
            Function0 function032 = (Function0) ((h9f) K5);
            if (i5 == 2048) {
            }
            K6 = oq5Var62.K();
            if (!z6) {
            }
            K6 = new ebm(0, rbmVar, rbm.class, "onOverflowClick", "onOverflowClick()V", 0, 5);
            oq5Var62.k0(K6);
            edo.c(tvdVar3, str22, null, function022, function032, (Function0) ((h9f) K6), edo.b, oq5Var62, 0, 4);
            oq5Var = oq5Var62;
            oq5Var.p(z3);
        } else {
            damVar2 = damVar;
            oq5Var = oq5Var5;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gvl(i, 10, damVar2, thjVar, gvlVar, rbmVar);
        }
    }

    public static final void g(String str, um0 um0Var, yci yciVar, hq5 hq5Var, int i) {
        um0 um0Var2;
        String str2;
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1116264757);
        int i2 = (oq5Var.f(str) ? 4 : 2) | i | (oq5Var.d(um0Var.ordinal()) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            str2 = str;
            um0Var2 = um0Var;
        } else {
            vm0 b = fn0.b(0, 0.0f, um0Var, oq5Var, ((i2 << 3) & 896) | 6, 2);
            um0Var2 = um0Var;
            itq itqVar = itq.d;
            yci g = d.g(yciVar, 0.0f, gwq.c, 1);
            boolean f = oq5Var.f(b);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                K = new xtb(b, 25);
                oq5Var.k0(K);
            }
            str2 = str;
            ocg.e(str2, itqVar, wyf.s(g, (Function0) K), null, oq5Var, (i2 & 14) | 48, 8);
            oq5Var = oq5Var;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q6h(str2, um0Var2, yciVar, i, 28);
        }
    }

    public static final void h(Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-619152194);
        if ((((oq5Var.h(function0) ? 4 : 2) | i | 48) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            pm0.a(null, ild.C(1058678357, new xtp(function0), oq5Var), oq5Var, 48, 1);
            yciVar = vci.a;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kx(function0, yciVar, i, 12);
        }
    }

    public static final void i(int i, hq5 hq5Var, yci yciVar, String str, boolean z) {
        int i2;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1044268510);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= oq5Var.g(z) ? 256 : 128;
        }
        boolean z2 = true;
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            if (str == null) {
                oq5Var.Z(1355183201);
            } else {
                oq5Var.Z(-1480303835);
                z2 = ((Boolean) oq5Var.j(koe.a)).booleanValue();
            }
            oq5Var.p(false);
            yciVar2 = vci.a;
            if (z2) {
                oq5Var.Z(1355233060);
                k((i3 >> 3) & 126, 0, oq5Var, yciVar2, z);
                oq5Var.p(false);
            } else {
                oq5Var.Z(1355359571);
                w1g.j(str, null, yciVar2, null, null, null, hd6.a, 0.0f, null, 0, ild.C(-1179082086, new xu0(26, z), oq5Var), oq5Var, (i3 & 14) | 1572912 | ((i3 << 3) & 896), 952);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ihe(str, yciVar2, z, i);
        }
    }

    public static final void j(List list, yci yciVar, boolean z, hq5 hq5Var, int i) {
        yci yciVar2;
        List list2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1492882264);
        int i2 = i | (oq5Var.f(list) ? 4 : 2) | 48 | (oq5Var.g(z) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            if (list.size() == 1) {
                list2 = list;
            } else {
                ArrayList arrayList = new ArrayList(2);
                for (int i3 = 0; i3 < 2; i3++) {
                    arrayList.add((String) CollectionsKt.S(list, i3));
                }
                list2 = arrayList;
            }
            wn5 C = ild.C(1632963702, new xu0(25, z), oq5Var);
            vci vciVar = vci.a;
            xee.b(list2, 36, 24, vciVar, 0.0f, null, C, oq5Var, 1576368, 48);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new oc1(list, yciVar2, z, i, 22);
        }
    }

    public static final void k(int i, int i2, hq5 hq5Var, yci yciVar, boolean z) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-266589449);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.g(z) ? 32 : 16;
        }
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                yciVar = vci.a;
            }
            if (z) {
                oq5Var.Z(1505582134);
                pm0.c(yciVar, oq5Var, i3 & 14);
                oq5Var.p(false);
            } else {
                if (z) {
                    throw vz1.i(oq5Var, 1505580798, false);
                }
                oq5Var.Z(1505583737);
                ug3.a(androidx.compose.foundation.a.b(yciVar, ((dq0) oq5Var.j(eq0.a)).c.c, vnj.i), oq5Var, 0);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        yci yciVar2 = yciVar;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new n10(yciVar2, z, i, i2, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(List list, int i, boolean z, boolean z2, Function1 function1, yci yciVar, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar2;
        oq5 oq5Var;
        yci yciVar3;
        xmn r;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(820805507);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var2.f(list) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var2.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var2.g(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var2.g(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= oq5Var2.h(function1) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i5 = i3 & 32;
        if (i5 != 0) {
            i4 |= 196608;
        } else if ((196608 & i2) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var2.f(yciVar2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            if (oq5Var2.P(i4 & 1, (74899 & i4) == 74898)) {
                oq5Var = oq5Var2;
                oq5Var.S();
                yciVar3 = yciVar2;
            } else {
                yci yciVar4 = i5 != 0 ? vci.a : yciVar2;
                iz2 iz2Var = irv.h(oq5Var2) ? b2c.f : b2c.e;
                Object K = oq5Var2.K();
                kjn kjnVar = gq5.a;
                if (K == kjnVar) {
                    K = szf.g0(Boolean.FALSE);
                    oq5Var2.k0(K);
                }
                aqi aqiVar = (aqi) K;
                Unit unit = Unit.a;
                Object K2 = oq5Var2.K();
                if (K2 == kjnVar) {
                    K2 = new yvi(aqiVar, null, 1);
                    oq5Var2.k0(K2);
                }
                gld.w(oq5Var2, unit, (Function2) K2);
                oq5Var = oq5Var2;
                vxo.a(i, iz2Var, d.g(d.d(yciVar4, 1.0f), 60, 0.0f, 2), d85.m, 0L, 16, ox6.e, ox6.f, false, false, ild.C(994980531, new en6(list, i, function1, aqiVar, z, z2), oq5Var2), oq5Var, ((i4 >> 3) & 14) | 14355456, 784);
                yciVar3 = yciVar4;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new jxq(list, i, z, z2, function1, yciVar3, i2, i3);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if (oq5Var2.P(i4 & 1, (74899 & i4) == 74898)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void m(o2s o2sVar, Function1 function1, yci yciVar, hq5 hq5Var, int i) {
        boolean z;
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1405762569);
        int i2 = (oq5Var.f(o2sVar) ? 4 : 2) | i | (oq5Var.h(function1) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            a3s a3sVar = (a3s) szf.Q(o2sVar.b, oq5Var).getValue();
            if (a3sVar instanceof y2s) {
                z = ((y2s) a3sVar).b;
            } else {
                if (!(a3sVar instanceof z2s)) {
                    b6e.s();
                    return;
                }
                z = false;
            }
            List c = a3sVar.c();
            int intValue = ((Number) szf.Q(o2sVar.c, oq5Var).getValue()).intValue();
            boolean z2 = a3sVar instanceof y2s;
            yci yciVar2 = vci.a;
            if (z) {
                oq5Var.Z(1976890575);
                Object K = oq5Var.K();
                if (K == gq5.a) {
                    K = new csr(14);
                    oq5Var.k0(K);
                }
                yciVar2 = nfp.a(yciVar2, (Function1) K);
            } else {
                oq5Var.Z(1976891519);
            }
            oq5Var.p(false);
            l(c, intValue, z2, z, function1, yciVar.f(yciVar2), oq5Var, (i2 << 9) & 57344, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yjq(o2sVar, function1, yciVar, i, 1);
        }
    }

    public static final void n(xbb xbbVar, swu swuVar, yci yciVar, Function0 function0, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-851713070);
        int i2 = i | (oq5Var.h(xbbVar) ? 4 : 2) | (oq5Var.h(swuVar) ? 32 : 16) | 384 | (oq5Var.h(function0) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            xp3.f(xbbVar, swuVar, function0, oq5Var, (i2 & 14) | 8 | (i2 & 112) | 384 | (i2 & 7168), 0);
            yciVar2 = vci.a;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mqr(i, 4, xbbVar, swuVar, yciVar2, function0);
        }
    }

    public static final void o(xbb xbbVar, mqs mqsVar, yci yciVar, Function0 function0, hq5 hq5Var, int i) {
        wn5 wn5Var;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(222297323);
        int i2 = 4;
        int i3 = i | (oq5Var.h(xbbVar) ? 4 : 2) | (oq5Var.h(mqsVar) ? 32 : 16) | 384 | (oq5Var.h(function0) ? 2048 : 1024);
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            String str = xbbVar.c;
            if (str == null) {
                oq5Var.Z(-378568960);
                oq5Var.p(false);
                wn5Var = null;
            } else {
                oq5Var.Z(-378568959);
                wn5 C = ild.C(-1426753661, new k0r(19, mqsVar, str), oq5Var);
                oq5Var.p(false);
                wn5Var = C;
            }
            String M = rvf.M(R.string.dialog_action_move_to_album, oq5Var);
            vci vciVar = vci.a;
            sk3.i(ild.C(2083815721, new aa1(xbbVar, i2), oq5Var), ild.C(-1028918840, new k0r(20, xbbVar, mqsVar), oq5Var), wn5Var, androidx.compose.foundation.a.k(vciVar, true, null), function0, M, oq5Var, ((i3 << 3) & 57344) | 54, 0);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mqr(i, 3, xbbVar, mqsVar, yciVar2, function0);
        }
    }

    public static final void p(hsu hsuVar, nru nruVar, sai saiVar, Function1 function1, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        vci vciVar;
        yci yciVar2;
        saiVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-629140782);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(hsuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(nruVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(saiVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(function1) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((i3 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            a l = oq5Var.l();
            vci vciVar2 = vci.a;
            yci H = vnj.H(oq5Var, vciVar2);
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
            u1g.l(oq5Var, d.e(vciVar2, 24));
            boolean z = hsuVar instanceof gsu;
            kjn kjnVar = gq5.a;
            if (z) {
                oq5Var.Z(767373518);
                boolean h = ((i3 & 7168) == 2048) | oq5Var.h(hsuVar);
                Object K = oq5Var.K();
                if (h || K == kjnVar) {
                    K = new xes(22, function1, hsuVar);
                    oq5Var.k0(K);
                }
                vciVar = vciVar2;
                ldg.h(R.drawable.ic_rename_24, R.string.wave_for_two_rename_title, (Function0) K, null, oq5Var, 0);
            } else {
                vciVar = vciVar2;
                oq5Var.Z(766367258);
            }
            oq5Var.p(false);
            boolean h2 = oq5Var.h(nruVar) | oq5Var.h(hsuVar) | ((i3 & 896) == 256);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new ftr(8, nruVar, hsuVar, saiVar);
                oq5Var.k0(K2);
            }
            ldg.h(R.drawable.ic_trash_24, R.string.wave_for_two_leave_wave, (Function0) K2, null, oq5Var, 0);
            eta.p(vciVar, 16, oq5Var, true);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu(i, 28, hsuVar, nruVar, saiVar, function1, yciVar2);
        }
    }

    public static final void q(boolean z, lwv lwvVar, fvf fvfVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1008540505);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var.f(lwvVar) : oq5Var.h(lwvVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(fvfVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ov6 ov6Var = lya.c;
            act S = weo.S(0, 0, ov6Var, 3);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new jwv(1);
                oq5Var.k0(K);
            }
            e9b a = c.l(S, (Function1) K).a(c.e(weo.S(0, 0, ov6Var, 3), 2));
            act S2 = weo.S(0, 0, ov6Var, 3);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new ulv(28);
                oq5Var.k0(K2);
            }
            etn.f(z, null, a, c.n(S2, (Function1) K2).a(c.f(weo.S(0, 0, ov6Var, 3), 2)), "header bar visibility animation", ild.C(196043825, new f6p(20, lwvVar, fvfVar), oq5Var), oq5Var, (i2 & 14) | 221184, 2);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yj(z, lwvVar, fvfVar, i, 10);
        }
    }

    public static final void r(lwv lwvVar, fvf fvfVar, hq5 hq5Var, int i) {
        float f;
        lwv lwvVar2;
        fvf fvfVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(437538959);
        int i2 = (oq5Var.f(lwvVar) ? 4 : 2) | i | (oq5Var.f(fvfVar) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            fvfVar2 = fvfVar;
            lwvVar2 = lwvVar;
        } else {
            aqi O = gld.O(lwvVar.c, oq5Var);
            int ordinal = ((swv) O.getValue()).ordinal();
            if (ordinal == 0) {
                f = 30.0f;
            } else if (ordinal == 1) {
                f = 108.0f;
            } else if (ordinal == 2) {
                f = 188.0f;
            } else {
                if (ordinal != 3) {
                    b6e.s();
                    return;
                }
                f = 228.0f;
            }
            sdr b = pk0.b(f, weo.S(0, 0, lya.c, 3), "header background gradient animation", null, oq5Var, 3072, 20);
            kfh d = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var, vciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, d, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            ug3.a(d.e(gut.p1(androidx.compose.foundation.a.a(d.d(vciVar, 1.0f), y9w.U((Pair[]) Arrays.copyOf(new Pair[]{new Pair(Float.valueOf(0.0f), new d85(c3x.f(0))), new Pair(Float.valueOf(0.35f), new d85(c3x.h(2348810240L))), new Pair(Float.valueOf(0.52f), new d85(c3x.h(3808428032L))), new Pair(Float.valueOf(0.82f), new d85(c3x.h(4227858432L)))}, 4), 8))), ((Number) b.getValue()).floatValue()), oq5Var, 0);
            yci q = androidx.compose.foundation.layout.a.q(gut.z(gut.a0(gut.p1(d.d(vciVar, 1.0f)))), 0.0f, 20, 0.0f, 0.0f, 13);
            ta5 a = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            int i4 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, q);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            s(((swv) O.getValue()) == swv.c || ((swv) O.getValue()) == swv.d, oq5Var, 0);
            lwvVar2 = lwvVar;
            fvfVar2 = fvfVar;
            q(((swv) O.getValue()) == swv.b || ((swv) O.getValue()) == swv.d, lwvVar2, fvfVar2, oq5Var, (i2 << 3) & 1008);
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new u0v(lwvVar2, fvfVar2, i, 13);
        }
    }

    public static final void s(boolean z, hq5 hq5Var, int i) {
        boolean z2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1801097684);
        int i2 = (oq5Var.g(z) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
            z2 = z;
        } else {
            z2 = z;
            etn.f(z2, null, c.d(15).a(c.e(null, 3)), c.j().a(c.f(null, 3)), "header text visibility animation", wct.e, oq5Var, (i2 & 14) | 224640, 2);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k4m(i, 13, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(lwv lwvVar, fvf fvfVar, yci yciVar, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        Object K;
        kjn kjnVar;
        Object K2;
        xmn r;
        lwvVar.getClass();
        fvfVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1191995468);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? oq5Var.f(lwvVar) : oq5Var.h(lwvVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.f(fvfVar) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 256 : 128;
            if ((i3 & 147) == 146 || !oq5Var.z()) {
                yci yciVar3 = i4 == 0 ? vci.a : yciVar2;
                Object value = gld.O(lwvVar.b, oq5Var).getValue();
                K = oq5Var.K();
                kjnVar = gq5.a;
                if (K == kjnVar) {
                    K = new ulv(27);
                    oq5Var.k0(K);
                }
                Function1 function1 = (Function1) K;
                iz2 iz2Var = b2c.c;
                K2 = oq5Var.K();
                if (K2 == kjnVar) {
                    K2 = new jwv(0);
                    oq5Var.k0(K2);
                }
                androidx.compose.animation.a.b(value, yciVar3, function1, iz2Var, "header mode animation", (Function1) K2, ild.C(670594532, new jv(26, lwvVar, fvfVar), oq5Var), oq5Var, ((i3 >> 3) & 112) | 1797504, 0);
                yciVar2 = yciVar3;
            } else {
                oq5Var.S();
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new o4p(lwvVar, fvfVar, yciVar2, i, i2, 17);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i3 & 147) == 146) {
        }
        if (i4 == 0) {
        }
        Object value2 = gld.O(lwvVar.b, oq5Var).getValue();
        K = oq5Var.K();
        kjnVar = gq5.a;
        if (K == kjnVar) {
        }
        Function1 function12 = (Function1) K;
        iz2 iz2Var2 = b2c.c;
        K2 = oq5Var.K();
        if (K2 == kjnVar) {
        }
        androidx.compose.animation.a.b(value2, yciVar3, function12, iz2Var2, "header mode animation", (Function1) K2, ild.C(670594532, new jv(26, lwvVar, fvfVar), oq5Var), oq5Var, ((i3 >> 3) & 112) | 1797504, 0);
        yciVar2 = yciVar3;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void u(lwv lwvVar, fvf fvfVar, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(535142131);
        int i2 = i | (oq5Var.f(lwvVar) ? 4 : 2) | (oq5Var.f(fvfVar) ? 32 : 16);
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            yci d = d.d(yciVar2, 1.0f);
            kfh d2 = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
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
            int i4 = i2 & 14;
            w(lwvVar, fvfVar, oq5Var, i2 & 126);
            boolean z = i4 == 4;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                vtu vtuVar = new vtu(0, lwvVar, lwv.class, "onSearchClick", "onSearchClick()V", 0, 16);
                oq5Var.k0(vtuVar);
                K = vtuVar;
            }
            x((Function0) ((h9f) K), b.a.a(androidx.compose.foundation.layout.a.o(vci.a, 16, 0.0f, 2), b2c.g), oq5Var, 0);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kws(lwvVar, fvfVar, yciVar2, i, 18);
        }
    }

    public static final void v(lwv lwvVar, fvf fvfVar, hq5 hq5Var, int i) {
        fvf fvfVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-652261443);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? oq5Var.f(lwvVar) : oq5Var.h(lwvVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(fvfVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            fvfVar2 = fvfVar;
        } else {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(c5b.a);
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var = ((fs5) K2).a;
            owv owvVar = (owv) gld.O(lwvVar.a, oq5Var).getValue();
            boolean z = false;
            Continuation continuation = null;
            if (owvVar instanceof nwv) {
                fvfVar.getClass();
                x97.y(mm6Var, null, null, new aq5(fvfVar, continuation, 0), 3);
                ArrayList arrayList = new ArrayList(10);
                for (int i3 = 0; i3 < 10; i3++) {
                    arrayList.add(null);
                }
                aqiVar.setValue(arrayList);
            } else if (!(owvVar instanceof mwv)) {
                b6e.s();
                return;
            } else {
                aqiVar.setValue(((mwv) owvVar).a);
                fvfVar.getClass();
                x97.y(mm6Var, null, null, new aq5(fvfVar, continuation, 1), 3);
            }
            q0k c = androidx.compose.foundation.layout.a.c(16, 0.0f, 96, 0.0f, 10);
            nx0 g = qx0.g(8);
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && oq5Var.h(lwvVar))) {
                z = true;
            }
            Object K3 = oq5Var.K();
            if (z || K3 == kjnVar) {
                K3 = new itv(1, aqiVar, lwvVar);
                oq5Var.k0(K3);
            }
            fvfVar2 = fvfVar;
            weo.h(null, fvfVar2, c, g, null, null, false, (Function1) K3, oq5Var, (i2 & 112) | 24960, 233);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new iwv(lwvVar, fvfVar2, i, 1);
        }
    }

    public static final void w(lwv lwvVar, fvf fvfVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2072461203);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var.f(lwvVar) : oq5Var.h(lwvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(fvfVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci d = d.d(vci.a, 1.0f);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new ulv(29);
                oq5Var.k0(K);
            }
            yci c = androidx.compose.ui.draw.a.c(androidx.compose.ui.graphics.a.a(d, (Function1) K), new vp(8, 76));
            kfh d2 = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c);
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
            v(lwvVar, fvfVar, oq5Var, i2 & 126);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new iwv(lwvVar, fvfVar, i, 0);
        }
    }

    public static final void x(Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1759722661);
        int i2 = 16;
        int i3 = (oq5Var.h(function0) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16);
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci m = d.m(xp3.u(yciVar, ugo.a), 40);
            agr agrVar = eq0.a;
            long j = ((dq0) oq5Var.j(agrVar)).c.b;
            jzk jzkVar = vnj.i;
            yci b = androidx.compose.foundation.a.b(androidx.compose.foundation.a.b(m, j, jzkVar), ((dq0) oq5Var.j(agrVar)).d.e, jzkVar);
            boolean z = (i3 & 14) == 4;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new gct(21, function0);
                oq5Var.k0(K);
            }
            yci e = androidx.compose.foundation.a.e(b, false, null, null, (Function0) K, 7);
            kfh d = ug3.d(b2c.f, false);
            int i4 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, e);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            neg.o(oq5Var);
            w4k E = a0g.E(R.drawable.ic_search_24, 0, oq5Var);
            neg.s(oq5Var);
            gae.b(E, rvf.M(R.string.search, oq5Var), d.m(vci.a, 16), ((dq0) oq5Var.j(agrVar)).a.a, oq5Var, 384, 0);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kx(function0, yciVar, i, i2);
        }
    }

    public static final void y(lwv lwvVar, hq5 hq5Var, int i) {
        vci vciVar;
        kjn kjnVar;
        vci vciVar2;
        jzk jzkVar;
        agr agrVar;
        boolean z;
        tgo tgoVar;
        float f;
        aqi aqiVar;
        lwv lwvVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2092307608);
        int i2 = (oq5Var.f(lwvVar) ? 4 : 2) | i;
        int i3 = 28;
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
            lwvVar2 = lwvVar;
        } else {
            aqi O = gld.O(lwvVar.d, oq5Var);
            int i4 = i2 & 14;
            boolean z2 = i4 == 4;
            Object K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (z2 || K == kjnVar2) {
                K = new jvu(i3, lwvVar);
                oq5Var.k0(K);
            }
            pd.c(0, 1, oq5Var, (Function0) K, false);
            vci vciVar3 = vci.a;
            yci q = androidx.compose.foundation.layout.a.q(gut.p1(d.d(vciVar3, 1.0f)), 0.0f, 20, 0.0f, 0.0f, 13);
            nho a = lho.a(qx0.g, b2c.m, oq5Var, 54);
            int i5 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, q);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            neg.n(oq5Var);
            boolean z3 = i4 == 4;
            Object K2 = oq5Var.K();
            if (z3 || K2 == kjnVar2) {
                vciVar = vciVar3;
                kjnVar = kjnVar2;
                vtu vtuVar = new vtu(0, lwvVar, lwv.class, "onBackClick", "onBackClick()V", 0, 17);
                oq5Var.k0(vtuVar);
                K2 = vtuVar;
            } else {
                vciVar = vciVar3;
                kjnVar = kjnVar2;
            }
            float f2 = 16;
            yci q2 = androidx.compose.foundation.layout.a.q(vciVar, f2, 0.0f, 0.0f, 0.0f, 14);
            vci vciVar4 = vciVar;
            tgo tgoVar2 = ugo.a;
            float f3 = 40;
            yci m = d.m(xp3.u(q2, tgoVar2), f3);
            oq5Var.Z(799978531);
            agr agrVar2 = eq0.a;
            long j = ((dq0) oq5Var.j(agrVar2)).c.b;
            jzk jzkVar2 = vnj.i;
            kjn kjnVar3 = kjnVar;
            yci b = androidx.compose.foundation.a.b(androidx.compose.foundation.a.b(vciVar4, j, jzkVar2), ((dq0) oq5Var.j(agrVar2)).d.e, jzkVar2);
            oq5Var.p(false);
            yci f4 = m.f(b);
            neg.s(oq5Var);
            neg.o(oq5Var);
            zsd.g((Function0) ((h9f) K2), f4, R.string.go_back, 0L, R.drawable.ic_arrow_android_back_24, oq5Var, 0, 8);
            boolean z4 = i4 == 4;
            Object K3 = oq5Var.K();
            if (z4 || K3 == kjnVar3) {
                vciVar2 = vciVar4;
                jzkVar = jzkVar2;
                agrVar = agrVar2;
                z = true;
                tgoVar = tgoVar2;
                f = f3;
                aqiVar = O;
                K3 = new vtu(0, lwvVar, lwv.class, "onMuteToggleClick", "onMuteToggleClick()V", 0, 18);
                lwvVar2 = lwvVar;
                oq5Var.k0(K3);
            } else {
                vciVar2 = vciVar4;
                tgoVar = tgoVar2;
                f = f3;
                agrVar = agrVar2;
                jzkVar = jzkVar2;
                aqiVar = O;
                z = true;
                lwvVar2 = lwvVar;
            }
            yci m2 = d.m(xp3.u(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 0.0f, f2, 0.0f, 11), tgoVar), f);
            oq5Var.Z(800742371);
            yci b2 = androidx.compose.foundation.a.b(androidx.compose.foundation.a.b(vciVar2, ((dq0) oq5Var.j(agrVar)).c.b, jzkVar), ((dq0) oq5Var.j(agrVar)).d.e, jzkVar);
            oq5Var.p(false);
            aae.a((Function0) ((h9f) K3), m2.f(b2), false, ild.C(-1873995112, new wd1(aqiVar, 5), oq5Var), oq5Var, 24576, 12);
            oq5Var.p(z);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new f5r(lwvVar2, i, 28);
        }
    }

    public static final Object z(n7q n7qVar, o7q o7qVar, cg6 cg6Var) {
        if (n7qVar instanceof u7u) {
            return o7qVar.u((u7u) n7qVar);
        }
        if (n7qVar instanceof szu) {
            return o7qVar.n((szu) n7qVar);
        }
        if (n7qVar instanceof ioc) {
            return o7qVar.m((ioc) n7qVar);
        }
        if (n7qVar instanceof y4d) {
            return o7qVar.q((y4d) n7qVar);
        }
        if (n7qVar instanceof t1q) {
            return o7qVar.t((t1q) n7qVar);
        }
        if (n7qVar instanceof maq) {
            return o7qVar.c();
        }
        kac.j(n7qVar, "Developer Error. Unexpected class for visit ");
        return null;
    }

    public abstract zdg K(ime imeVar);

    public abstract zc4 N();

    public abstract ScheduledExecutorService Q();

    public abstract vq6 R();

    public abstract void W();

    public abstract void Z(r76 r76Var, aeg aegVar);
}
