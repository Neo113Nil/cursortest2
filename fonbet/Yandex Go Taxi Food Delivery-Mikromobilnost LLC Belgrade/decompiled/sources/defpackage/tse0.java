package defpackage;

import android.os.Parcel;
import androidx.camera.core.impl.SurfaceConfig$ConfigSize;
import androidx.camera.core.impl.SurfaceConfig$ConfigType;
import com.yandex.dsl.views.layouts.constraint.ConstraintSetBuilder;
import com.yandex.dsl.views.layouts.constraint.d;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Pair;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class tse0 {
    public static void A(StringBuilder sb, String str, String str2, Boolean bool, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(bool);
        sb.append(str3);
    }

    public static /* synthetic */ void B(AtomicReference atomicReference, r041 r041Var) {
        while (!atomicReference.compareAndSet(null, r041Var) && atomicReference.get() == null) {
        }
    }

    public static /* synthetic */ boolean C(AtomicReference atomicReference, HashMap hashMap) {
        while (!atomicReference.compareAndSet(null, hashMap)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean D(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2) {
        xw91 xw91Var = xw91.G;
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, xw91Var, obj2)) {
            if (atomicReferenceFieldUpdater.get(obj) != xw91Var) {
                return false;
            }
        }
        return true;
    }

    public static int a(x2s x2sVar, int i, int i2) {
        return (x2sVar.hashCode() + i) * i2;
    }

    public static int b(ety0 ety0Var, int i, int i2) {
        return (ety0Var.hashCode() + i) * i2;
    }

    public static int c(Money money, int i, int i2) {
        return (money.hashCode() + i) * i2;
    }

    public static int d(ThemedParameter themedParameter, int i, int i2) {
        return (themedParameter.hashCode() + i) * i2;
    }

    public static c36 e(long j, int i, bts btsVar, boolean z) {
        c36 c36Var = new c36(j, i);
        btsVar.t(z);
        return c36Var;
    }

    public static m7e f(ConstraintSetBuilder.Side side, ConstraintSetBuilder.Side side2, d dVar, int i) {
        return dVar.a(new Pair(side, side2), i);
    }

    public static uq90 g(float f, float f2, float f3, float f4) {
        uq90 uq90Var = new uq90();
        uq90Var.j(f, f2);
        uq90Var.h(f3, f4);
        return uq90Var;
    }

    public static ymw0 h(SurfaceConfig$ConfigType surfaceConfig$ConfigType, SurfaceConfig$ConfigSize surfaceConfig$ConfigSize, ymw0 ymw0Var, ArrayList arrayList, ymw0 ymw0Var2) {
        ymw0Var.a(anw0.a(surfaceConfig$ConfigType, surfaceConfig$ConfigSize));
        arrayList.add(ymw0Var2);
        return new ymw0();
    }

    public static ymw0 i(ArrayList arrayList, ymw0 ymw0Var) {
        arrayList.add(ymw0Var);
        return new ymw0();
    }

    public static String j(String str, String str2, String str3, StringBuilder sb, List list) {
        sb.append(str);
        sb.append(str2);
        sb.append(list);
        sb.append(str3);
        return sb.toString();
    }

    public static String k(String str, String str2, List list) {
        return str + list + str2;
    }

    public static String l(StringBuilder sb, String str, String str2, Object obj, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(obj);
        sb.append(str3);
        return sb.toString();
    }

    public static String m(StringBuilder sb, FormattedText formattedText, String str) {
        sb.append(formattedText);
        sb.append(str);
        return sb.toString();
    }

    public static HashMap n(y9p y9pVar) {
        y9pVar.getClass();
        return new HashMap();
    }

    public static HashMap o(ppl0 ppl0Var) {
        ppl0Var.getClass();
        return new HashMap();
    }

    public static HashMap p(qxm0 qxm0Var) {
        qxm0Var.getClass();
        return new HashMap();
    }

    public static HashMap q(xcv0 xcv0Var) {
        xcv0Var.getClass();
        return new HashMap();
    }

    public static HashMap r(String str, HashMap hashMap, String str2) {
        hashMap.put(str, str2);
        return new HashMap();
    }

    public static void s(bts btsVar, int i, c530 c530Var, float f, bts btsVar2) {
        btsVar.e0(i);
        oeb1.c(btsVar2, ljs0.e(c530Var, f));
    }

    public static void t(bts btsVar, boolean z, boolean z2, boolean z3) {
        btsVar.t(z);
        btsVar.t(z2);
        btsVar.t(z3);
    }

    public static void u(uq90 uq90Var, float f, float f2, float f3, float f4) {
        uq90Var.h(f, f2);
        uq90Var.h(f3, f4);
        uq90Var.c();
    }

    public static void v(Parcel parcel, int i, Integer num) {
        parcel.writeInt(i);
        parcel.writeInt(num.intValue());
    }

    public static void w(Integer num, String str, String str2, String str3, StringBuilder sb) {
        sb.append(num);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static void x(String str, String str2, String str3, StringBuilder sb, List list) {
        sb.append(str);
        sb.append(str2);
        sb.append(list);
        sb.append(str3);
    }

    public static void y(String str, String str2, String str3, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(str2);
        sb.append(z);
        sb.append(str3);
    }

    public static void z(StringBuilder sb, int i, String str, boolean z, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(z);
        sb.append(str2);
    }
}
