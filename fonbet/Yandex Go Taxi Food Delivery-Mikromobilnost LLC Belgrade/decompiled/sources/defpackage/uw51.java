package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.measurement.zzbk;
import com.lightside.visum.layouts.constraint.ConstraintSetBuilder;
import com.lightside.visum.layouts.constraint.c;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.logger.a;
import com.yandex.passport.common.url.b;
import com.ybsdk.core.utils.text.Text;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import yads.lo1;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class uw51 {
    public static /* synthetic */ void A(i7a1 i7a1Var) {
        if (i7a1Var == null) {
            return;
        }
        ny61.u();
    }

    public static /* synthetic */ boolean B(AtomicReference atomicReference, a091 a091Var) {
        while (!atomicReference.compareAndSet(null, a091Var)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static lxq C(int i, hzk hzkVar) {
        pf91 pf91Var = new pf91();
        pf91Var.a = i;
        hzkVar.v(pf91Var.a());
        return hzkVar.b();
    }

    public static lxq D(int i, hzk hzkVar) {
        nr91 nr91Var = new nr91();
        nr91Var.a = i;
        hzkVar.v(nr91Var.a());
        return hzkVar.b();
    }

    public static int a(Uid uid, int i, int i2) {
        return (uid.hashCode() + i) * i2;
    }

    public static int b(Text.Resource resource, int i, int i2) {
        return (resource.hashCode() + i) * i2;
    }

    public static int c(lo1 lo1Var, b281 b281Var, float f) {
        Context context = lo1Var.getContext();
        b281Var.getClass();
        return b281.a(context, f);
    }

    public static n7e d(ConstraintSetBuilder.Side side, ConstraintSetBuilder.Side side2, c cVar, int i) {
        return cVar.a(new Pair(side, side2), i);
    }

    public static lxq e(int i, hzk hzkVar) {
        pb91 pb91Var = new pb91();
        pb91Var.a = i;
        hzkVar.v(pb91Var.a());
        return hzkVar.b();
    }

    public static IObjectWrapper f(Parcel parcel) {
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return asInterface;
    }

    public static Object g(zzbk zzbkVar, int i, ArrayList arrayList, int i2) {
        cwa1.e(i, zzbkVar.name(), arrayList);
        return arrayList.get(i2);
    }

    public static String h(int i, String str) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        return sb.toString();
    }

    public static String i(StringBuilder sb, float f, String str) {
        sb.append(f);
        sb.append(str);
        return sb.toString();
    }

    public static String j(StringBuilder sb, Uid uid, char c) {
        sb.append(uid);
        sb.append(c);
        return sb.toString();
    }

    public static String k(StringBuilder sb, Class cls) {
        sb.append(qoi0.a(cls));
        return sb.toString().toString();
    }

    public static HashMap l(Class cls, p491 p491Var) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, p491Var);
        return hashMap;
    }

    public static HashMap m(Class cls, lb91 lb91Var) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, lb91Var);
        return hashMap;
    }

    public static HashMap n(Class cls, we91 we91Var) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, we91Var);
        return hashMap;
    }

    public static HashMap o(Class cls, lf91 lf91Var) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, lf91Var);
        return hashMap;
    }

    public static HashMap p(Class cls, vq91 vq91Var) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, vq91Var);
        return hashMap;
    }

    public static x491 q(HashMap hashMap) {
        Collections.unmodifiableMap(new HashMap(hashMap));
        return new x491();
    }

    public static pb91 r(HashMap hashMap) {
        Collections.unmodifiableMap(new HashMap(hashMap));
        return new pb91();
    }

    public static bf91 s(HashMap hashMap) {
        Collections.unmodifiableMap(new HashMap(hashMap));
        return new bf91();
    }

    public static pf91 t(HashMap hashMap) {
        Collections.unmodifiableMap(new HashMap(hashMap));
        return new pf91();
    }

    public static nr91 u(HashMap hashMap) {
        Collections.unmodifiableMap(new HashMap(hashMap));
        return new nr91();
    }

    public static void v(long j, String str, String str2, StringBuilder sb) {
        sb.append(j);
        sb.append(str);
        sb.append(str2);
    }

    public static void w(String str, String str2, LogLevel logLevel, String str3, int i) {
        a.c(logLevel, str3, str + str2, i);
    }

    public static void x(String str, String str2, String str3, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(z);
    }

    public static void y(StringBuilder sb, String str, String str2) {
        sb.append((Object) b.l(str));
        sb.append(str2);
    }

    public static void z(HashMap hashMap) {
        Collections.unmodifiableMap(new HashMap(hashMap));
    }
}
