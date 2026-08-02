package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import ru.yandex.music.R;
import ru.yandex.music.entry.EntryScreenActivity;

/* loaded from: classes3.dex */
public abstract class yd5 {
    public static final gs1 a = new gs1();
    public static final wn5 b = new wn5(new go5(18), 185334680, false);
    public static final wn5 c = new wn5(new ro5(0), -807520677, false);
    public static final wn5 d = new wn5(new rz3(17), -1160584629, false);
    public static final mb9 e = new mb9(4);
    public static final int[] f = {13, 15, 14};
    public static final i6c g;
    public static final i6c[] h;

    static {
        i6c i6cVar = new i6c("CLIENT_TELEMETRY", 1L);
        g = i6cVar;
        h = new i6c[]{i6cVar};
    }

    public static final long A(String str) {
        char charAt;
        int length = str.length();
        int i = (length <= 0 || !StringsKt.N("+-", str.charAt(0))) ? 0 : 1;
        if (length - i > 16) {
            int i2 = i;
            while (true) {
                if (i < length) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 != '0') {
                        if ('1' > charAt2 || charAt2 >= ':') {
                            break;
                        }
                    } else if (i2 == i) {
                        i2++;
                    }
                    i++;
                } else if (length - i2 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!c.v(str, "+", false) || length <= 1 || '0' > (charAt = str.charAt(1)) || charAt >= ':') ? Long.parseLong(str) : Long.parseLong(mlr.E(1, str));
    }

    public static final ek B(fu4 fu4Var, hq5 hq5Var) {
        fu4Var.getClass();
        boolean g2 = irv.g(hq5Var);
        boolean f2 = ((oq5) hq5Var).f(fu4Var);
        oq5 oq5Var = (oq5) hq5Var;
        boolean g3 = f2 | oq5Var.g(g2);
        Object K = oq5Var.K();
        if (g3 || K == gq5.a) {
            K = new ek(fu4Var, g2);
            oq5Var.k0(K);
        }
        return (ek) K;
    }

    public static final ek C(mxo mxoVar, hq5 hq5Var) {
        mxoVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        boolean f2 = oq5Var.f(mxoVar);
        Object K = oq5Var.K();
        if (f2 || K == gq5.a) {
            K = new lct(mxoVar);
            oq5Var.k0(K);
        }
        return B((lct) K, oq5Var);
    }

    public static final na0 D(float f2, final int i, boolean z, final int i2, boolean z2, oq5 oq5Var, int i3) {
        Object obj;
        final boolean z3;
        int i4;
        int i5;
        final float f3 = f2;
        int i6 = 0;
        final boolean z4 = (i3 & 16) != 0 ? false : z2;
        jx7 jx7Var = (jx7) oq5Var.j(es5.h);
        WeakHashMap weakHashMap = rqv.w;
        final int i7 = z7l.h(oq5Var).e.e().d;
        final int i8 = (i2 - i7) - i;
        final float n0 = ((i2 - jx7Var.n0(f3)) - i7) - i;
        Object K = oq5Var.K();
        Object obj2 = gq5.a;
        if (K == obj2) {
            K = new oa0(jx7Var, i6);
            oq5Var.k0(K);
        }
        final Function0 function0 = (Function0) K;
        oq5Var.Z(580247783);
        Object[] objArr = new Object[0];
        function0.getClass();
        j3 j3Var = new j3(9);
        ex exVar = new ex(3, function0);
        apo apoVar = bpo.a;
        apo apoVar2 = new apo(i6, j3Var, exVar);
        boolean g2 = oq5Var.g(z4) | oq5Var.d(i8) | oq5Var.c(n0) | oq5Var.d(i2) | oq5Var.g(z) | oq5Var.d(i7) | oq5Var.c(f3) | oq5Var.d(i);
        Object K2 = oq5Var.K();
        if (g2 || K2 == obj2) {
            z3 = z;
            obj = new Function0() { // from class: pa0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    na0 na0Var = new na0(lf3.c, Function0.this);
                    if (z4) {
                        na0Var.c(n0, i8, i2, z3, i7, f3, i);
                    }
                    return na0Var;
                }
            };
            i8 = i8;
            n0 = n0;
            i4 = i7;
            f3 = f3;
            i5 = i2;
            oq5Var.k0(obj);
        } else {
            i5 = i2;
            obj = K2;
            i4 = i7;
            z3 = z;
        }
        final float f4 = n0;
        final int i9 = i8;
        final na0 na0Var = (na0) o2g.g0(objArr, apoVar2, (Function0) obj, oq5Var, 0, 4);
        boolean d2 = oq5Var.d(i9) | oq5Var.f(na0Var) | oq5Var.c(f4) | oq5Var.d(i5) | oq5Var.g(z3) | oq5Var.d(i4) | oq5Var.c(f3) | oq5Var.d(i);
        Object K3 = oq5Var.K();
        if (d2 || K3 == obj2) {
            final boolean z5 = z3;
            final int i10 = i5;
            final int i11 = i4;
            Object obj3 = new Function0() { // from class: qa0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    na0Var.c(f4, i9, i10, z5, i11, f3, i);
                    return Unit.a;
                }
            };
            oq5Var.k0(obj3);
            K3 = obj3;
        }
        gld.D((Function0) K3, oq5Var);
        oq5Var.p(false);
        return na0Var;
    }

    public static final fs1 E(rce rceVar, cce cceVar, Function1 function1, Function1 function12, jd6 jd6Var, int i, x2i x2iVar, hq5 hq5Var, int i2, int i3) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(1645646697);
        if ((i3 & 64) != 0) {
            x2iVar = ild.j;
        }
        fs1 G = G(new is1(rceVar, x2iVar, cceVar), function1, function12, jd6Var, i, oq5Var);
        oq5Var.p(false);
        return G;
    }

    public static final fs1 F(Object obj, cce cceVar, oq5 oq5Var) {
        oq5Var.a0(-2020614074);
        fs1 G = G(new is1(obj, ild.j, cceVar), rq1.u, null, hd6.b, 1, oq5Var);
        oq5Var.p(false);
        return G;
    }

    public static final fs1 G(is1 is1Var, Function1 function1, Function1 function12, jd6 jd6Var, int i, hq5 hq5Var) {
        rce rceVar;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(952940650);
        Object obj = is1Var.a;
        cce cceVar = is1Var.c;
        xkn xknVar = zvt.b;
        oq5Var.a0(1087186730);
        boolean z = obj instanceof rce;
        Object obj2 = gq5.a;
        if (z) {
            rceVar = (rce) obj;
            oq5Var.p(false);
        } else {
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            oq5Var.a0(375474364);
            boolean f2 = oq5Var.f(context) | oq5Var.f(obj);
            Object K = oq5Var.K();
            if (f2 || K == obj2) {
                pce pceVar = new pce(context);
                pceVar.c = obj;
                K = pceVar.a();
                oq5Var.k0(K);
            }
            rceVar = (rce) K;
            oq5Var.p(false);
            oq5Var.p(false);
        }
        Object obj3 = rceVar.b;
        if (obj3 instanceof pce) {
            xq0.x("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
            return null;
        }
        if (obj3 instanceof yg0) {
            Q("ImageBitmap");
            throw null;
        }
        if (obj3 instanceof bde) {
            Q("ImageVector");
            throw null;
        }
        if (obj3 instanceof w4k) {
            Q("Painter");
            throw null;
        }
        if (rceVar.c != null) {
            xq0.x("request.target must be null.");
            return null;
        }
        oq5Var.a0(294038899);
        Object K2 = oq5Var.K();
        if (K2 == obj2) {
            K2 = new fs1(rceVar, cceVar);
            oq5Var.k0(K2);
        }
        fs1 fs1Var = (fs1) K2;
        oq5Var.p(false);
        fs1Var.l = function1;
        fs1Var.m = function12;
        fs1Var.n = jd6Var;
        fs1Var.o = i;
        fs1Var.p = ((Boolean) oq5Var.j(koe.a)).booleanValue();
        fs1Var.s.setValue(cceVar);
        fs1Var.r.setValue(rceVar);
        fs1Var.b();
        oq5Var.p(false);
        return fs1Var;
    }

    public static final boolean H(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !view.hasFocus()) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (view instanceof AndroidComposeView) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
        return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final yop I(String str, g0c g0cVar, Function0 function0) {
        g0cVar.getClass();
        Object obj = null;
        xdh xdhVar = new xdh((Object) 3, (Object) new ci0(up6.z(1000)), obj, obj);
        x0 x0Var = new x0(str, g0cVar);
        yop a2 = mif.a(new fpa(new qs6(x0Var, function0), new z28(g0cVar, 0), xdhVar).c(), lhb.z0, e27.z0, 1);
        mif.b(mif.b(a2, new w28(x0Var, 0), null, 5), lhb.x0, new w28(x0Var, 1), 1);
        return a2;
    }

    public static final void J(Context context, Intent intent) {
        intent.getClass();
        try {
            context.sendBroadcast(intent);
        } catch (SecurityException e2) {
            Assertions.throwOrSkip("sendBroadcastSafe", new FailedAssertionException("Failed to send broadcast " + intent.getAction() + ": " + e2, e2));
        }
    }

    public static final Integer K(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        return i == 2 ? 1 : null;
    }

    public static final long L(double d2, ssa ssaVar) {
        double a2 = tsa.a(d2, ssaVar, ssa.NANOSECONDS);
        if (Double.isNaN(a2)) {
            xq0.x("Duration value cannot be NaN.");
            return 0L;
        }
        long c2 = eeh.c(a2);
        return (-4611686018426999999L > c2 || c2 >= 4611686018427000000L) ? u(eeh.c(tsa.a(d2, ssaVar, ssa.MILLISECONDS))) : v(c2);
    }

    public static final long M(int i, ssa ssaVar) {
        if (ssaVar.compareTo(ssa.SECONDS) > 0) {
            return N(i, ssaVar);
        }
        long j = i;
        ssa ssaVar2 = ssa.NANOSECONDS;
        return v(TimeUnit.NANOSECONDS.convert(j, ssaVar.a));
    }

    public static final long N(long j, ssa ssaVar) {
        ssa ssaVar2 = ssa.NANOSECONDS;
        TimeUnit timeUnit = ssaVar.a;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) <= j && j <= convert) {
            return v(timeUnit2.convert(j, timeUnit));
        }
        ssa ssaVar3 = ssa.NANOSECONDS;
        return t(yhn.f(TimeUnit.MILLISECONDS.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
    }

    public static final loc O(int i) {
        if (i == 1) {
            return new loc(2);
        }
        if (i == 2) {
            return new loc(1);
        }
        if (i == 17) {
            return new loc(3);
        }
        if (i == 33) {
            return new loc(5);
        }
        if (i == 66) {
            return new loc(4);
        }
        if (i != 130) {
            return null;
        }
        return new loc(6);
    }

    public static final asj P(k8q k8qVar) {
        ArrayList arrayList;
        String str = k8qVar.a;
        String str2 = k8qVar.b;
        String str3 = k8qVar.c;
        List list = k8qVar.d;
        if (list != null) {
            List<h8q> list2 = list;
            arrayList = new ArrayList(v75.o(list2, 10));
            for (h8q h8qVar : list2) {
                arrayList.add(new n1p(h8qVar.a, new mht(h8qVar.b), h8qVar.c));
            }
        } else {
            arrayList = null;
        }
        j8q j8qVar = k8qVar.e;
        return new asj(str, str2, str3, arrayList, j8qVar != null ? new zrj(j8qVar.a) : null, k8qVar.f, k8qVar.g, k8qVar.h);
    }

    public static void Q(String str) {
        throw new IllegalArgumentException(hrg.r("Unsupported type: ", str, ". ", hrg.q("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    public static final void R(zc4 zc4Var, View view) {
        if (view instanceof c2a) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    zc4Var.x((c2a) view);
                    return;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    rj7.m();
                    return;
                } else {
                    R(zc4Var, childAt);
                    i = i2;
                }
            }
        } else if (view instanceof f09) {
            ViewGroup viewGroup2 = (ViewGroup) view;
            int i3 = 0;
            while (true) {
                if (!(i3 < viewGroup2.getChildCount())) {
                    zc4Var.x((f09) view);
                    return;
                }
                int i4 = i3 + 1;
                View childAt2 = viewGroup2.getChildAt(i3);
                if (childAt2 == null) {
                    rj7.m();
                    return;
                } else {
                    R(zc4Var, childAt2);
                    i3 = i4;
                }
            }
        } else if (view instanceof d29) {
            ViewGroup viewGroup3 = (ViewGroup) view;
            int i5 = 0;
            while (true) {
                if (!(i5 < viewGroup3.getChildCount())) {
                    zc4Var.x((d29) view);
                    return;
                }
                int i6 = i5 + 1;
                View childAt3 = viewGroup3.getChildAt(i5);
                if (childAt3 == null) {
                    rj7.m();
                    return;
                } else {
                    R(zc4Var, childAt3);
                    i5 = i6;
                }
            }
        } else if (view instanceof p89) {
            ViewGroup viewGroup4 = (ViewGroup) view;
            int i7 = 0;
            while (true) {
                if (!(i7 < viewGroup4.getChildCount())) {
                    zc4Var.x((p89) view);
                    return;
                }
                int i8 = i7 + 1;
                View childAt4 = viewGroup4.getChildAt(i7);
                if (childAt4 == null) {
                    rj7.m();
                    return;
                } else {
                    R(zc4Var, childAt4);
                    i7 = i8;
                }
            }
        } else if (view instanceof oc9) {
            ViewGroup viewGroup5 = (ViewGroup) view;
            int i9 = 0;
            while (true) {
                if (!(i9 < viewGroup5.getChildCount())) {
                    zc4Var.h0((oc9) view);
                    return;
                }
                int i10 = i9 + 1;
                View childAt5 = viewGroup5.getChildAt(i9);
                if (childAt5 == null) {
                    rj7.m();
                    return;
                } else {
                    R(zc4Var, childAt5);
                    i9 = i10;
                }
            }
        } else if (view instanceof hh9) {
            ViewGroup viewGroup6 = (ViewGroup) view;
            int i11 = 0;
            while (true) {
                if (!(i11 < viewGroup6.getChildCount())) {
                    zc4Var.i0((hh9) view);
                    return;
                }
                int i12 = i11 + 1;
                View childAt6 = viewGroup6.getChildAt(i11);
                if (childAt6 == null) {
                    rj7.m();
                    return;
                } else {
                    R(zc4Var, childAt6);
                    i11 = i12;
                }
            }
        } else if (view instanceof mm9) {
            ViewGroup viewGroup7 = (ViewGroup) view;
            int i13 = 0;
            while (true) {
                if (!(i13 < viewGroup7.getChildCount())) {
                    zc4Var.x((mm9) view);
                    return;
                }
                int i14 = i13 + 1;
                View childAt7 = viewGroup7.getChildAt(i13);
                if (childAt7 == null) {
                    rj7.m();
                    return;
                } else {
                    R(zc4Var, childAt7);
                    i13 = i14;
                }
            }
        } else if (view instanceof lp9) {
            ViewGroup viewGroup8 = (ViewGroup) view;
            int i15 = 0;
            while (true) {
                if (!(i15 < viewGroup8.getChildCount())) {
                    zc4Var.x((lp9) view);
                    return;
                }
                int i16 = i15 + 1;
                View childAt8 = viewGroup8.getChildAt(i15);
                if (childAt8 == null) {
                    rj7.m();
                    return;
                } else {
                    R(zc4Var, childAt8);
                    i15 = i16;
                }
            }
        } else {
            if (!(view instanceof kv8)) {
                if (view instanceof cj9) {
                    zc4Var.x((cj9) view);
                    return;
                }
                if (view instanceof v19) {
                    zc4Var.f0((v19) view);
                    return;
                }
                if (view instanceof i39) {
                    zc4Var.g0((i39) view);
                    return;
                }
                if (view instanceof d89) {
                    zc4Var.x((d89) view);
                    return;
                }
                if (view instanceof lb9) {
                    zc4Var.x((lb9) view);
                    return;
                }
                if (view instanceof wl9) {
                    zc4Var.x((wl9) view);
                    return;
                }
                if (view instanceof oi9) {
                    zc4Var.x((oi9) view);
                    return;
                }
                if (view instanceof l0a) {
                    zc4Var.j0((l0a) view);
                    return;
                }
                if (view instanceof qo9) {
                    zc4Var.x((qo9) view);
                    return;
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup9 = (ViewGroup) view;
                    int i17 = 0;
                    while (true) {
                        if (!(i17 < viewGroup9.getChildCount())) {
                            break;
                        }
                        int i18 = i17 + 1;
                        View childAt9 = viewGroup9.getChildAt(i17);
                        if (childAt9 == null) {
                            rj7.m();
                            return;
                        } else {
                            R(zc4Var, childAt9);
                            i17 = i18;
                        }
                    }
                }
                zc4Var.k0(view);
                return;
            }
            ViewGroup viewGroup10 = (ViewGroup) view;
            int i19 = 0;
            while (true) {
                if (!(i19 < viewGroup10.getChildCount())) {
                    zc4Var.e0((kv8) view);
                    return;
                }
                int i20 = i19 + 1;
                View childAt10 = viewGroup10.getChildAt(i19);
                if (childAt10 == null) {
                    rj7.m();
                    return;
                } else {
                    R(zc4Var, childAt10);
                    i19 = i20;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d6, code lost:
    
        if ((r32 & 64) != 0) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(ek ekVar, ik ikVar, n5g n5gVar, yci yciVar, pyc pycVar, Function2 function2, long j, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        long j2;
        boolean z;
        Object K;
        Function2 function22;
        yci yciVar3;
        long j3;
        xmn r;
        ekVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1164216901);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(ekVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? oq5Var.f(ikVar) : oq5Var.h(ikVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.f(n5gVar) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= oq5Var.h(pycVar) ? 16384 : RemoteCameraConfig.Notification.ID;
            }
            if ((196608 & i) == 0) {
                i3 |= oq5Var.h(function2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            }
            if ((1572864 & i) != 0) {
                j2 = j;
                i3 |= ((i2 & 64) == 0 && oq5Var.e(j2)) ? 1048576 : 524288;
            } else {
                j2 = j;
            }
            if ((599187 & i3) == 599186 || !oq5Var.z()) {
                oq5Var.U();
                if ((i & 1) != 0 || oq5Var.y()) {
                    if (i4 != 0) {
                        yciVar2 = vci.a;
                    }
                    if ((i2 & 64) != 0) {
                        j2 = ((dq0) oq5Var.j(eq0.a)).b.a;
                        i3 &= -3670017;
                    }
                    long j4 = j2;
                    yci yciVar4 = yciVar2;
                    oq5Var.q();
                    z = (i3 & 57344) != 16384;
                    K = oq5Var.K();
                    kjn kjnVar = gq5.a;
                    if (!z || K == kjnVar) {
                        wn5 wn5Var = new wn5(new wk0(8, new jfi(pycVar)), -434707029, true);
                        oq5Var.k0(wn5Var);
                        K = wn5Var;
                    }
                    pyc pycVar2 = (pyc) K;
                    if (function2 != null) {
                        oq5Var.Z(-1324340647);
                        oq5Var.p(false);
                        function22 = null;
                    } else {
                        oq5Var.Z(-1324340646);
                        boolean f2 = oq5Var.f(function2);
                        Object K2 = oq5Var.K();
                        if (f2 || K2 == kjnVar) {
                            K2 = a0g.C(function2);
                            oq5Var.k0(K2);
                        }
                        function22 = (Function2) K2;
                        oq5Var.p(false);
                    }
                    Function2 function23 = function22;
                    if (ekVar.a) {
                        oq5Var.Z(-1323685709);
                        int i5 = i3 << 6;
                        kct.c(ekVar.b, ild.C(22946400, new dk(ikVar, 1), oq5Var), ild.C(-535037663, new dk(ikVar, 2), oq5Var), pycVar2, n5gVar, yciVar4, function23, j4, oq5Var, (57344 & i5) | 432 | (i5 & 458752) | ((i3 << 3) & 29360128), 0);
                        yciVar4 = yciVar4;
                        j4 = j4;
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(-1324239338);
                        kct.a(ild.C(-1618053381, new dk(ikVar, 0), oq5Var), pycVar2, n5gVar, yciVar4, function23, new d85(svd.a(oq5Var)), j4, oq5Var, (i3 & 896) | 6 | (i3 & 7168) | (i3 & 3670016), 0);
                        oq5Var.p(false);
                    }
                    yciVar3 = yciVar4;
                    j3 = j4;
                } else {
                    oq5Var.S();
                }
            } else {
                oq5Var.S();
                yciVar3 = yciVar2;
                j3 = j2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new ck(ekVar, ikVar, n5gVar, yciVar3, pycVar, function2, j3, i, i2, 1);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) != 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        oq5Var.U();
        if ((i & 1) != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        long j42 = j2;
        yci yciVar42 = yciVar2;
        oq5Var.q();
        if ((i3 & 57344) != 16384) {
        }
        K = oq5Var.K();
        kjn kjnVar2 = gq5.a;
        if (!z) {
        }
        wn5 wn5Var2 = new wn5(new wk0(8, new jfi(pycVar)), -434707029, true);
        oq5Var.k0(wn5Var2);
        K = wn5Var2;
        pyc pycVar22 = (pyc) K;
        if (function2 != null) {
        }
        Function2 function232 = function22;
        if (ekVar.a) {
        }
        yciVar3 = yciVar42;
        j3 = j42;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(ek ekVar, String str, n5g n5gVar, yci yciVar, pyc pycVar, Function2 function2, long j, hq5 hq5Var, int i, int i2) {
        yci yciVar2;
        int i3;
        pyc pycVar2;
        int i4;
        int i5;
        yci yciVar3;
        long j2;
        oq5 oq5Var;
        pyc pycVar3;
        long j3;
        xmn r;
        str.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1917114039);
        int i6 = (oq5Var2.f(ekVar) ? 4 : 2) | i | (oq5Var2.f(str) ? 32 : 16) | (oq5Var2.f(n5gVar) ? 256 : 128);
        int i7 = i2 & 8;
        if (i7 != 0) {
            i6 |= 3072;
        } else if ((i & 3072) == 0) {
            yciVar2 = yciVar;
            i6 |= oq5Var2.f(yciVar2) ? 2048 : 1024;
            i3 = i2 & 16;
            if (i3 == 0) {
                i6 |= 24576;
            } else if ((i & 24576) == 0) {
                pycVar2 = pycVar;
                i6 |= oq5Var2.h(pycVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
                i4 = i6 | 524288;
                if ((599187 & i4) == 599186 || !oq5Var2.z()) {
                    oq5Var2.U();
                    if ((i & 1) != 0 || oq5Var2.y()) {
                        yci yciVar4 = i7 != 0 ? vci.a : yciVar2;
                        if (i3 != 0) {
                            pycVar2 = qld.a;
                        }
                        i5 = i4 & (-3670017);
                        yciVar3 = yciVar4;
                        j2 = ((dq0) oq5Var2.j(eq0.a)).b.a;
                    } else {
                        oq5Var2.S();
                        i5 = i4 & (-3670017);
                        j2 = j;
                        yciVar3 = yciVar2;
                    }
                    pyc pycVar4 = pycVar2;
                    oq5Var2.q();
                    oq5Var = oq5Var2;
                    a(ekVar, new hk(str), n5gVar, yciVar3, pycVar4, function2, j2, oq5Var, i5 & 4194190, 0);
                    yciVar2 = yciVar3;
                    pycVar3 = pycVar4;
                    j3 = j2;
                } else {
                    oq5Var2.S();
                    j3 = j;
                    oq5Var = oq5Var2;
                    pycVar3 = pycVar2;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new ck(ekVar, str, n5gVar, yciVar2, pycVar3, function2, j3, i, i2, 0);
                    return;
                }
                return;
            }
            pycVar2 = pycVar;
            i4 = i6 | 524288;
            if ((599187 & i4) == 599186) {
            }
            oq5Var2.U();
            if ((i & 1) != 0) {
            }
            if (i7 != 0) {
            }
            if (i3 != 0) {
            }
            i5 = i4 & (-3670017);
            yciVar3 = yciVar4;
            j2 = ((dq0) oq5Var2.j(eq0.a)).b.a;
            pyc pycVar42 = pycVar2;
            oq5Var2.q();
            oq5Var = oq5Var2;
            a(ekVar, new hk(str), n5gVar, yciVar3, pycVar42, function2, j2, oq5Var, i5 & 4194190, 0);
            yciVar2 = yciVar3;
            pycVar3 = pycVar42;
            j3 = j2;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        i3 = i2 & 16;
        if (i3 == 0) {
        }
        pycVar2 = pycVar;
        i4 = i6 | 524288;
        if ((599187 & i4) == 599186) {
        }
        oq5Var2.U();
        if ((i & 1) != 0) {
        }
        if (i7 != 0) {
        }
        if (i3 != 0) {
        }
        i5 = i4 & (-3670017);
        yciVar3 = yciVar4;
        j2 = ((dq0) oq5Var2.j(eq0.a)).b.a;
        pyc pycVar422 = pycVar2;
        oq5Var2.q();
        oq5Var = oq5Var2;
        a(ekVar, new hk(str), n5gVar, yciVar3, pycVar422, function2, j2, oq5Var, i5 & 4194190, 0);
        yciVar2 = yciVar3;
        pycVar3 = pycVar422;
        j3 = j2;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void c(ug1 ug1Var, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        ug1Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1210398107);
        if ((((oq5Var.h(ug1Var) ? 4 : 2) | i | 48) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            dh1 dh1Var = (dh1) szf.Q(ug1Var.getState(), oq5Var).getValue();
            yciVar2 = vci.a;
            yci d2 = d.d(a.a(yciVar2, "block_artist_release"), 1.0f);
            kfh d3 = ug3.d(b2c.b, false);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, d2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (dh1Var instanceof bh1) {
                oq5Var.Z(1252880056);
                d(0, oq5Var, null, ((bh1) dh1Var).a);
                oq5Var.p(false);
            } else {
                if (!(dh1Var instanceof ch1)) {
                    throw vz1.i(oq5Var, 1252878379, false);
                }
                oq5Var.Z(1252884693);
                ch1 ch1Var = (ch1) dh1Var;
                boolean h2 = oq5Var.h(ug1Var);
                Object K = oq5Var.K();
                kjn kjnVar = gq5.a;
                if (h2 || K == kjnVar) {
                    m5 m5Var = new m5(1, ug1Var, ug1.class, "onAlbumClick", "onAlbumClick(Lru/yandex/music/data/domainitem/AlbumDomainItem;)V", 0, 16);
                    oq5Var.k0(m5Var);
                    K = m5Var;
                }
                Function1 function1 = (Function1) ((h9f) K);
                boolean h3 = oq5Var.h(ug1Var) | oq5Var.f(dh1Var);
                Object K2 = oq5Var.K();
                if (h3 || K2 == kjnVar) {
                    K2 = new a3(20, ug1Var, ch1Var);
                    oq5Var.k0(K2);
                }
                e(ch1Var, function1, com.yandex.music.core.ui.compose.a.b(yciVar2, null, 0L, 0.0f, null, (Function2) K2, 15), oq5Var, 0);
                oq5Var.p(false);
            }
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z2(ug1Var, yciVar2, i, 6);
        }
    }

    public static final void d(int i, hq5 hq5Var, yci yciVar, boolean z) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1164146526);
        int i2 = (oq5Var.g(z) ? 4 : 2) | i | 48;
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            int i3 = i2 & 126;
            vci vciVar = vci.a;
            cb0.k(i3, oq5Var, vciVar, z);
            yciVar = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q10(z, yciVar, i, 2);
        }
    }

    public static final void e(ch1 ch1Var, Function1 function1, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(630169254);
        int i2 = (oq5Var.f(ch1Var) ? 4 : 2) | i | (oq5Var.h(function1) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            qtn qtnVar = ch1Var.b;
            yci a2 = a.a(yciVar, "artist_latest_release_item");
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new hb(22, function1, ch1Var);
                oq5Var.k0(K);
            }
            g0g.k(qtnVar, a2, (Function0) K, wdp.a, oq5Var, 3072, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x3(ch1Var, function1, yciVar, i, 29);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(yci yciVar, Function2 function2, final bci bciVar, mxo mxoVar, Function0 function0, boolean z, boolean z2, boolean z3, long j, long j2, float f2, final wn5 wn5Var, hq5 hq5Var, final int i, final int i2) {
        yci yciVar2;
        int i3;
        Function2 function22;
        int i4;
        mxo mxoVar2;
        int i5;
        Function0 function02;
        int i6;
        int i7;
        boolean z4;
        int i8;
        int i9;
        final yci yciVar3;
        boolean z5;
        long j3;
        long b2;
        boolean z6;
        Function0 function03;
        boolean z7;
        float f3;
        int i10;
        long j4;
        Object K;
        final long j5;
        final boolean z8;
        oq5 oq5Var;
        final boolean z9;
        final Function2 function23;
        final boolean z10;
        final float f4;
        final long j6;
        final mxo mxoVar3;
        final Function0 function04;
        xmn r;
        int i11;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-240768079);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
            yciVar2 = yciVar;
        } else if ((i & 6) == 0) {
            yciVar2 = yciVar;
            i3 = (oq5Var2.f(yciVar2) ? 4 : 2) | i;
        } else {
            yciVar2 = yciVar;
            i3 = i;
        }
        int i13 = i3 | 48;
        int i14 = i2 & 4;
        if (i14 != 0) {
            i13 = i3 | 432;
        } else if ((i & 384) == 0) {
            function22 = function2;
            i13 |= oq5Var2.h(function22) ? 256 : 128;
            if ((i & 3072) == 0) {
                i13 |= (i & 4096) == 0 ? oq5Var2.f(bciVar) : oq5Var2.h(bciVar) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i13 |= 24576;
            } else if ((i & 24576) == 0) {
                mxoVar2 = mxoVar;
                i13 |= oq5Var2.h(mxoVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i13 |= 196608;
                } else if ((i & 196608) == 0) {
                    function02 = function0;
                    i13 |= oq5Var2.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                    i6 = 1572864 | i13;
                    i7 = i2 & 128;
                    if (i7 == 0) {
                        i6 = 14155776 | i13;
                    } else if ((12582912 & i) == 0) {
                        z4 = z2;
                        i6 |= oq5Var2.g(z4) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                        i8 = i2 & 256;
                        if (i8 != 0) {
                            i6 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i9 = i12;
                            i6 |= oq5Var2.g(z3) ? 67108864 : 33554432;
                            if ((i & 805306368) == 0) {
                                if ((i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 && oq5Var2.e(j)) {
                                    i11 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
                                    i6 |= i11;
                                }
                                i11 = 268435456;
                                i6 |= i11;
                            }
                            if ((i6 & 306783379) == 306783378 || !oq5Var2.z()) {
                                oq5Var2.U();
                                two twoVar = null;
                                if ((i & 1) != 0 || oq5Var2.y()) {
                                    yciVar3 = i9 == 0 ? vci.a : yciVar2;
                                    if (i14 != 0) {
                                        function22 = null;
                                    }
                                    if (i4 != 0) {
                                        mxoVar2 = null;
                                    }
                                    if (i5 != 0) {
                                        function02 = null;
                                    }
                                    if (i7 != 0) {
                                        z4 = true;
                                    }
                                    z5 = i8 == 0 ? false : z3;
                                    if ((i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0) {
                                        j3 = ((dq0) oq5Var2.j(eq0.a)).c.b;
                                        i6 &= -1879048193;
                                    } else {
                                        j3 = j;
                                    }
                                    b2 = d85.b(d85.b, 0.7f, 0.0f, 0.0f, 0.0f, 14);
                                    z6 = true;
                                    function03 = function02;
                                    long j7 = j3;
                                    z7 = z4;
                                    f3 = kai.a;
                                    i10 = i6;
                                    j4 = j7;
                                } else {
                                    oq5Var2.S();
                                    if ((i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
                                        i6 &= -1879048193;
                                    }
                                    z6 = z;
                                    z5 = z3;
                                    b2 = j2;
                                    f3 = f2;
                                    yciVar3 = yciVar2;
                                    z7 = z4;
                                    function03 = function02;
                                    i10 = i6;
                                    j4 = j;
                                }
                                oq5Var2.q();
                                if (z6 || mxoVar2 != null) {
                                    oq5Var2.Z(-125678324);
                                } else {
                                    oq5Var2.Z(550134342);
                                    twoVar = bfg.C(oq5Var2);
                                }
                                oq5Var2.p(false);
                                K = oq5Var2.K();
                                if (K == gq5.a) {
                                    K = szf.g0(Boolean.TRUE);
                                    oq5Var2.k0(K);
                                }
                                final aqi aqiVar = (aqi) K;
                                boolean booleanValue = ((Boolean) aqiVar.getValue()).booleanValue();
                                mxo mxoVar4 = mxoVar2 != null ? twoVar : mxoVar2;
                                final Function2 function24 = function22;
                                final boolean z11 = z5;
                                final mxo mxoVar5 = mxoVar2;
                                final boolean z12 = z7;
                                final long j8 = j4;
                                final two twoVar2 = twoVar;
                                int i15 = i10;
                                wn5 C = ild.C(-1452281012, new pyc() { // from class: gv2
                                    @Override // defpackage.pyc
                                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                                        yci f5;
                                        hq5 hq5Var2 = (hq5) obj2;
                                        int intValue = ((Integer) obj3).intValue();
                                        ((ua5) obj).getClass();
                                        if ((intValue & 17) == 16) {
                                            oq5 oq5Var3 = (oq5) hq5Var2;
                                            if (oq5Var3.z()) {
                                                oq5Var3.S();
                                                return Unit.a;
                                            }
                                        }
                                        boolean z13 = z11;
                                        vci vciVar = vci.a;
                                        yci a2 = z13 ? b.a(vciVar, null, 3) : vciVar;
                                        kx0 kx0Var = qx0.c;
                                        gz2 gz2Var = b2c.n;
                                        ta5 a3 = sa5.a(kx0Var, gz2Var, hq5Var2, 0);
                                        oq5 oq5Var4 = (oq5) hq5Var2;
                                        int i16 = oq5Var4.P;
                                        androidx.compose.runtime.internal.a l = oq5Var4.l();
                                        yci H = vnj.H(hq5Var2, a2);
                                        xp5.T.getClass();
                                        grb grbVar = wp5.b;
                                        oq5Var4.d0();
                                        if (oq5Var4.O) {
                                            oq5Var4.k(grbVar);
                                        } else {
                                            oq5Var4.n0();
                                        }
                                        kb5 kb5Var = wp5.f;
                                        g0g.U(hq5Var2, a3, kb5Var);
                                        kb5 kb5Var2 = wp5.e;
                                        g0g.U(hq5Var2, l, kb5Var2);
                                        kb5 kb5Var3 = wp5.g;
                                        if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i16))) {
                                            ouj.x(i16, oq5Var4, i16, kb5Var3);
                                        }
                                        kb5 kb5Var4 = wp5.d;
                                        g0g.U(hq5Var2, H, kb5Var4);
                                        long j9 = d85.m;
                                        ot0.e(6, 0, j8, hq5Var2, d.d(vciVar, 1.0f), !d85.c(r4, j9));
                                        Function2 function25 = function24;
                                        if (function25 != null) {
                                            oq5Var4.Z(-2028248708);
                                            function25.invoke(hq5Var2, 0);
                                        } else {
                                            oq5Var4.Z(-2032021780);
                                        }
                                        oq5Var4.p(false);
                                        yci d2 = d.d(vciVar, 1.0f);
                                        two twoVar3 = twoVar2;
                                        if (twoVar3 != null) {
                                            d2 = d2.f(bfg.Q(vciVar, twoVar3, z12, 12));
                                        }
                                        Object K2 = oq5Var4.K();
                                        kjn kjnVar = gq5.a;
                                        if (K2 == kjnVar) {
                                            K2 = new x80(aqiVar, 4);
                                            oq5Var4.k0(K2);
                                        }
                                        Function1 function1 = (Function1) K2;
                                        d2.getClass();
                                        function1.getClass();
                                        Object K3 = oq5Var4.K();
                                        if (K3 == kjnVar) {
                                            K3 = tlm.f(gld.R(g.a, oq5Var4), oq5Var4);
                                        }
                                        mm6 mm6Var = ((fs5) K3).a;
                                        Unit unit = Unit.a;
                                        boolean h2 = oq5Var4.h(mm6Var);
                                        Object K4 = oq5Var4.K();
                                        if (h2 || K4 == kjnVar) {
                                            K4 = new akc(mm6Var, function1, (Continuation) null, 10);
                                            oq5Var4.k0(K4);
                                        }
                                        f5 = d2.f(new SuspendPointerInputElement(unit, null, null, new dur((Function2) K4), 6));
                                        ta5 a4 = sa5.a(kx0Var, gz2Var, hq5Var2, 0);
                                        int i17 = oq5Var4.P;
                                        androidx.compose.runtime.internal.a l2 = oq5Var4.l();
                                        yci H2 = vnj.H(hq5Var2, f5);
                                        oq5Var4.d0();
                                        if (oq5Var4.O) {
                                            oq5Var4.k(grbVar);
                                        } else {
                                            oq5Var4.n0();
                                        }
                                        g0g.U(hq5Var2, a4, kb5Var);
                                        g0g.U(hq5Var2, l2, kb5Var2);
                                        if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i17))) {
                                            ouj.x(i17, oq5Var4, i17, kb5Var3);
                                        }
                                        g0g.U(hq5Var2, H2, kb5Var4);
                                        wn5Var.invoke(wa5.a, hq5Var2, 6);
                                        if (mxoVar5 == null) {
                                            oq5Var4.Z(-1904113015);
                                            WeakHashMap weakHashMap = rqv.w;
                                            u1g.l(hq5Var2, s7g.F(z7l.h(hq5Var2).e));
                                        } else {
                                            oq5Var4.Z(-1908417086);
                                        }
                                        oq5Var4.p(false);
                                        oq5Var4.p(true);
                                        oq5Var4.p(true);
                                        return Unit.a;
                                    }
                                }, oq5Var2);
                                int i16 = i15 << 3;
                                int i17 = (i16 & 112) | RemoteCameraConfig.Mic.BUFFER_SIZE | ((i15 >> 3) & 896) | ((i15 >> 6) & 7168) | ((i15 >> 15) & 57344) | 196608 | (i16 & 234881024);
                                long j9 = b2;
                                rbi.a(mxoVar4, yciVar3, bciVar, function03, j8, j9, null, f3, z7, booleanValue, C, oq5Var2, i17);
                                j5 = j9;
                                z8 = z7;
                                oq5Var = oq5Var2;
                                z9 = z6;
                                function23 = function24;
                                z10 = z11;
                                f4 = f3;
                                j6 = j8;
                                mxoVar3 = mxoVar5;
                                function04 = function03;
                            } else {
                                oq5Var2.S();
                                z9 = z;
                                j6 = j;
                                yciVar3 = yciVar2;
                                function23 = function22;
                                z8 = z4;
                                mxoVar3 = mxoVar2;
                                function04 = function02;
                                oq5Var = oq5Var2;
                                z10 = z3;
                                j5 = j2;
                                f4 = f2;
                            }
                            r = oq5Var.r();
                            if (r == null) {
                                r.d = new Function2() { // from class: hv2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        int R = rvf.R(i | 1);
                                        yd5.f(yci.this, function23, bciVar, mxoVar3, function04, z9, z8, z10, j6, j5, f4, wn5Var, (hq5) obj, R, i2);
                                        return Unit.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        i9 = i12;
                        if ((i & 805306368) == 0) {
                        }
                        if ((i6 & 306783379) == 306783378) {
                        }
                        oq5Var2.U();
                        two twoVar3 = null;
                        if ((i & 1) != 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i14 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0) {
                        }
                        b2 = d85.b(d85.b, 0.7f, 0.0f, 0.0f, 0.0f, 14);
                        z6 = true;
                        function03 = function02;
                        long j72 = j3;
                        z7 = z4;
                        f3 = kai.a;
                        i10 = i6;
                        j4 = j72;
                        oq5Var2.q();
                        if (z6) {
                        }
                        oq5Var2.Z(-125678324);
                        oq5Var2.p(false);
                        K = oq5Var2.K();
                        if (K == gq5.a) {
                        }
                        final aqi aqiVar2 = (aqi) K;
                        boolean booleanValue2 = ((Boolean) aqiVar2.getValue()).booleanValue();
                        if (mxoVar2 != null) {
                        }
                        final Function2 function242 = function22;
                        final boolean z112 = z5;
                        final mxo mxoVar52 = mxoVar2;
                        final boolean z122 = z7;
                        final long j82 = j4;
                        final two twoVar22 = twoVar3;
                        int i152 = i10;
                        wn5 C2 = ild.C(-1452281012, new pyc() { // from class: gv2
                            @Override // defpackage.pyc
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                yci f5;
                                hq5 hq5Var2 = (hq5) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((ua5) obj).getClass();
                                if ((intValue & 17) == 16) {
                                    oq5 oq5Var3 = (oq5) hq5Var2;
                                    if (oq5Var3.z()) {
                                        oq5Var3.S();
                                        return Unit.a;
                                    }
                                }
                                boolean z13 = z112;
                                vci vciVar = vci.a;
                                yci a2 = z13 ? b.a(vciVar, null, 3) : vciVar;
                                kx0 kx0Var = qx0.c;
                                gz2 gz2Var = b2c.n;
                                ta5 a3 = sa5.a(kx0Var, gz2Var, hq5Var2, 0);
                                oq5 oq5Var4 = (oq5) hq5Var2;
                                int i162 = oq5Var4.P;
                                androidx.compose.runtime.internal.a l = oq5Var4.l();
                                yci H = vnj.H(hq5Var2, a2);
                                xp5.T.getClass();
                                grb grbVar = wp5.b;
                                oq5Var4.d0();
                                if (oq5Var4.O) {
                                    oq5Var4.k(grbVar);
                                } else {
                                    oq5Var4.n0();
                                }
                                kb5 kb5Var = wp5.f;
                                g0g.U(hq5Var2, a3, kb5Var);
                                kb5 kb5Var2 = wp5.e;
                                g0g.U(hq5Var2, l, kb5Var2);
                                kb5 kb5Var3 = wp5.g;
                                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i162))) {
                                    ouj.x(i162, oq5Var4, i162, kb5Var3);
                                }
                                kb5 kb5Var4 = wp5.d;
                                g0g.U(hq5Var2, H, kb5Var4);
                                long j92 = d85.m;
                                ot0.e(6, 0, j82, hq5Var2, d.d(vciVar, 1.0f), !d85.c(r4, j92));
                                Function2 function25 = function242;
                                if (function25 != null) {
                                    oq5Var4.Z(-2028248708);
                                    function25.invoke(hq5Var2, 0);
                                } else {
                                    oq5Var4.Z(-2032021780);
                                }
                                oq5Var4.p(false);
                                yci d2 = d.d(vciVar, 1.0f);
                                two twoVar32 = twoVar22;
                                if (twoVar32 != null) {
                                    d2 = d2.f(bfg.Q(vciVar, twoVar32, z122, 12));
                                }
                                Object K2 = oq5Var4.K();
                                kjn kjnVar = gq5.a;
                                if (K2 == kjnVar) {
                                    K2 = new x80(aqiVar2, 4);
                                    oq5Var4.k0(K2);
                                }
                                Function1 function1 = (Function1) K2;
                                d2.getClass();
                                function1.getClass();
                                Object K3 = oq5Var4.K();
                                if (K3 == kjnVar) {
                                    K3 = tlm.f(gld.R(g.a, oq5Var4), oq5Var4);
                                }
                                mm6 mm6Var = ((fs5) K3).a;
                                Unit unit = Unit.a;
                                boolean h2 = oq5Var4.h(mm6Var);
                                Object K4 = oq5Var4.K();
                                if (h2 || K4 == kjnVar) {
                                    K4 = new akc(mm6Var, function1, (Continuation) null, 10);
                                    oq5Var4.k0(K4);
                                }
                                f5 = d2.f(new SuspendPointerInputElement(unit, null, null, new dur((Function2) K4), 6));
                                ta5 a4 = sa5.a(kx0Var, gz2Var, hq5Var2, 0);
                                int i172 = oq5Var4.P;
                                androidx.compose.runtime.internal.a l2 = oq5Var4.l();
                                yci H2 = vnj.H(hq5Var2, f5);
                                oq5Var4.d0();
                                if (oq5Var4.O) {
                                    oq5Var4.k(grbVar);
                                } else {
                                    oq5Var4.n0();
                                }
                                g0g.U(hq5Var2, a4, kb5Var);
                                g0g.U(hq5Var2, l2, kb5Var2);
                                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i172))) {
                                    ouj.x(i172, oq5Var4, i172, kb5Var3);
                                }
                                g0g.U(hq5Var2, H2, kb5Var4);
                                wn5Var.invoke(wa5.a, hq5Var2, 6);
                                if (mxoVar52 == null) {
                                    oq5Var4.Z(-1904113015);
                                    WeakHashMap weakHashMap = rqv.w;
                                    u1g.l(hq5Var2, s7g.F(z7l.h(hq5Var2).e));
                                } else {
                                    oq5Var4.Z(-1908417086);
                                }
                                oq5Var4.p(false);
                                oq5Var4.p(true);
                                oq5Var4.p(true);
                                return Unit.a;
                            }
                        }, oq5Var2);
                        int i162 = i152 << 3;
                        int i172 = (i162 & 112) | RemoteCameraConfig.Mic.BUFFER_SIZE | ((i152 >> 3) & 896) | ((i152 >> 6) & 7168) | ((i152 >> 15) & 57344) | 196608 | (i162 & 234881024);
                        long j92 = b2;
                        rbi.a(mxoVar4, yciVar3, bciVar, function03, j82, j92, null, f3, z7, booleanValue2, C2, oq5Var2, i172);
                        j5 = j92;
                        z8 = z7;
                        oq5Var = oq5Var2;
                        z9 = z6;
                        function23 = function242;
                        z10 = z112;
                        f4 = f3;
                        j6 = j82;
                        mxoVar3 = mxoVar52;
                        function04 = function03;
                        r = oq5Var.r();
                        if (r == null) {
                        }
                    }
                    z4 = z2;
                    i8 = i2 & 256;
                    if (i8 != 0) {
                    }
                    i9 = i12;
                    if ((i & 805306368) == 0) {
                    }
                    if ((i6 & 306783379) == 306783378) {
                    }
                    oq5Var2.U();
                    two twoVar32 = null;
                    if ((i & 1) != 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0) {
                    }
                    b2 = d85.b(d85.b, 0.7f, 0.0f, 0.0f, 0.0f, 14);
                    z6 = true;
                    function03 = function02;
                    long j722 = j3;
                    z7 = z4;
                    f3 = kai.a;
                    i10 = i6;
                    j4 = j722;
                    oq5Var2.q();
                    if (z6) {
                    }
                    oq5Var2.Z(-125678324);
                    oq5Var2.p(false);
                    K = oq5Var2.K();
                    if (K == gq5.a) {
                    }
                    final aqi aqiVar22 = (aqi) K;
                    boolean booleanValue22 = ((Boolean) aqiVar22.getValue()).booleanValue();
                    if (mxoVar2 != null) {
                    }
                    final Function2 function2422 = function22;
                    final boolean z1122 = z5;
                    final mxo mxoVar522 = mxoVar2;
                    final boolean z1222 = z7;
                    final long j822 = j4;
                    final two twoVar222 = twoVar32;
                    int i1522 = i10;
                    wn5 C22 = ild.C(-1452281012, new pyc() { // from class: gv2
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            yci f5;
                            hq5 hq5Var2 = (hq5) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            ((ua5) obj).getClass();
                            if ((intValue & 17) == 16) {
                                oq5 oq5Var3 = (oq5) hq5Var2;
                                if (oq5Var3.z()) {
                                    oq5Var3.S();
                                    return Unit.a;
                                }
                            }
                            boolean z13 = z1122;
                            vci vciVar = vci.a;
                            yci a2 = z13 ? b.a(vciVar, null, 3) : vciVar;
                            kx0 kx0Var = qx0.c;
                            gz2 gz2Var = b2c.n;
                            ta5 a3 = sa5.a(kx0Var, gz2Var, hq5Var2, 0);
                            oq5 oq5Var4 = (oq5) hq5Var2;
                            int i1622 = oq5Var4.P;
                            androidx.compose.runtime.internal.a l = oq5Var4.l();
                            yci H = vnj.H(hq5Var2, a2);
                            xp5.T.getClass();
                            grb grbVar = wp5.b;
                            oq5Var4.d0();
                            if (oq5Var4.O) {
                                oq5Var4.k(grbVar);
                            } else {
                                oq5Var4.n0();
                            }
                            kb5 kb5Var = wp5.f;
                            g0g.U(hq5Var2, a3, kb5Var);
                            kb5 kb5Var2 = wp5.e;
                            g0g.U(hq5Var2, l, kb5Var2);
                            kb5 kb5Var3 = wp5.g;
                            if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i1622))) {
                                ouj.x(i1622, oq5Var4, i1622, kb5Var3);
                            }
                            kb5 kb5Var4 = wp5.d;
                            g0g.U(hq5Var2, H, kb5Var4);
                            long j922 = d85.m;
                            ot0.e(6, 0, j822, hq5Var2, d.d(vciVar, 1.0f), !d85.c(r4, j922));
                            Function2 function25 = function2422;
                            if (function25 != null) {
                                oq5Var4.Z(-2028248708);
                                function25.invoke(hq5Var2, 0);
                            } else {
                                oq5Var4.Z(-2032021780);
                            }
                            oq5Var4.p(false);
                            yci d2 = d.d(vciVar, 1.0f);
                            two twoVar322 = twoVar222;
                            if (twoVar322 != null) {
                                d2 = d2.f(bfg.Q(vciVar, twoVar322, z1222, 12));
                            }
                            Object K2 = oq5Var4.K();
                            kjn kjnVar = gq5.a;
                            if (K2 == kjnVar) {
                                K2 = new x80(aqiVar22, 4);
                                oq5Var4.k0(K2);
                            }
                            Function1 function1 = (Function1) K2;
                            d2.getClass();
                            function1.getClass();
                            Object K3 = oq5Var4.K();
                            if (K3 == kjnVar) {
                                K3 = tlm.f(gld.R(g.a, oq5Var4), oq5Var4);
                            }
                            mm6 mm6Var = ((fs5) K3).a;
                            Unit unit = Unit.a;
                            boolean h2 = oq5Var4.h(mm6Var);
                            Object K4 = oq5Var4.K();
                            if (h2 || K4 == kjnVar) {
                                K4 = new akc(mm6Var, function1, (Continuation) null, 10);
                                oq5Var4.k0(K4);
                            }
                            f5 = d2.f(new SuspendPointerInputElement(unit, null, null, new dur((Function2) K4), 6));
                            ta5 a4 = sa5.a(kx0Var, gz2Var, hq5Var2, 0);
                            int i1722 = oq5Var4.P;
                            androidx.compose.runtime.internal.a l2 = oq5Var4.l();
                            yci H2 = vnj.H(hq5Var2, f5);
                            oq5Var4.d0();
                            if (oq5Var4.O) {
                                oq5Var4.k(grbVar);
                            } else {
                                oq5Var4.n0();
                            }
                            g0g.U(hq5Var2, a4, kb5Var);
                            g0g.U(hq5Var2, l2, kb5Var2);
                            if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i1722))) {
                                ouj.x(i1722, oq5Var4, i1722, kb5Var3);
                            }
                            g0g.U(hq5Var2, H2, kb5Var4);
                            wn5Var.invoke(wa5.a, hq5Var2, 6);
                            if (mxoVar522 == null) {
                                oq5Var4.Z(-1904113015);
                                WeakHashMap weakHashMap = rqv.w;
                                u1g.l(hq5Var2, s7g.F(z7l.h(hq5Var2).e));
                            } else {
                                oq5Var4.Z(-1908417086);
                            }
                            oq5Var4.p(false);
                            oq5Var4.p(true);
                            oq5Var4.p(true);
                            return Unit.a;
                        }
                    }, oq5Var2);
                    int i1622 = i1522 << 3;
                    int i1722 = (i1622 & 112) | RemoteCameraConfig.Mic.BUFFER_SIZE | ((i1522 >> 3) & 896) | ((i1522 >> 6) & 7168) | ((i1522 >> 15) & 57344) | 196608 | (i1622 & 234881024);
                    long j922 = b2;
                    rbi.a(mxoVar4, yciVar3, bciVar, function03, j822, j922, null, f3, z7, booleanValue22, C22, oq5Var2, i1722);
                    j5 = j922;
                    z8 = z7;
                    oq5Var = oq5Var2;
                    z9 = z6;
                    function23 = function2422;
                    z10 = z1122;
                    f4 = f3;
                    j6 = j822;
                    mxoVar3 = mxoVar522;
                    function04 = function03;
                    r = oq5Var.r();
                    if (r == null) {
                    }
                }
                function02 = function0;
                i6 = 1572864 | i13;
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                z4 = z2;
                i8 = i2 & 256;
                if (i8 != 0) {
                }
                i9 = i12;
                if ((i & 805306368) == 0) {
                }
                if ((i6 & 306783379) == 306783378) {
                }
                oq5Var2.U();
                two twoVar322 = null;
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if (i14 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 == 0) {
                }
                if ((i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0) {
                }
                b2 = d85.b(d85.b, 0.7f, 0.0f, 0.0f, 0.0f, 14);
                z6 = true;
                function03 = function02;
                long j7222 = j3;
                z7 = z4;
                f3 = kai.a;
                i10 = i6;
                j4 = j7222;
                oq5Var2.q();
                if (z6) {
                }
                oq5Var2.Z(-125678324);
                oq5Var2.p(false);
                K = oq5Var2.K();
                if (K == gq5.a) {
                }
                final aqi aqiVar222 = (aqi) K;
                boolean booleanValue222 = ((Boolean) aqiVar222.getValue()).booleanValue();
                if (mxoVar2 != null) {
                }
                final Function2 function24222 = function22;
                final boolean z11222 = z5;
                final mxo mxoVar5222 = mxoVar2;
                final boolean z12222 = z7;
                final long j8222 = j4;
                final two twoVar2222 = twoVar322;
                int i15222 = i10;
                wn5 C222 = ild.C(-1452281012, new pyc() { // from class: gv2
                    @Override // defpackage.pyc
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        yci f5;
                        hq5 hq5Var2 = (hq5) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        ((ua5) obj).getClass();
                        if ((intValue & 17) == 16) {
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            if (oq5Var3.z()) {
                                oq5Var3.S();
                                return Unit.a;
                            }
                        }
                        boolean z13 = z11222;
                        vci vciVar = vci.a;
                        yci a2 = z13 ? b.a(vciVar, null, 3) : vciVar;
                        kx0 kx0Var = qx0.c;
                        gz2 gz2Var = b2c.n;
                        ta5 a3 = sa5.a(kx0Var, gz2Var, hq5Var2, 0);
                        oq5 oq5Var4 = (oq5) hq5Var2;
                        int i16222 = oq5Var4.P;
                        androidx.compose.runtime.internal.a l = oq5Var4.l();
                        yci H = vnj.H(hq5Var2, a2);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var4.d0();
                        if (oq5Var4.O) {
                            oq5Var4.k(grbVar);
                        } else {
                            oq5Var4.n0();
                        }
                        kb5 kb5Var = wp5.f;
                        g0g.U(hq5Var2, a3, kb5Var);
                        kb5 kb5Var2 = wp5.e;
                        g0g.U(hq5Var2, l, kb5Var2);
                        kb5 kb5Var3 = wp5.g;
                        if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i16222))) {
                            ouj.x(i16222, oq5Var4, i16222, kb5Var3);
                        }
                        kb5 kb5Var4 = wp5.d;
                        g0g.U(hq5Var2, H, kb5Var4);
                        long j9222 = d85.m;
                        ot0.e(6, 0, j8222, hq5Var2, d.d(vciVar, 1.0f), !d85.c(r4, j9222));
                        Function2 function25 = function24222;
                        if (function25 != null) {
                            oq5Var4.Z(-2028248708);
                            function25.invoke(hq5Var2, 0);
                        } else {
                            oq5Var4.Z(-2032021780);
                        }
                        oq5Var4.p(false);
                        yci d2 = d.d(vciVar, 1.0f);
                        two twoVar3222 = twoVar2222;
                        if (twoVar3222 != null) {
                            d2 = d2.f(bfg.Q(vciVar, twoVar3222, z12222, 12));
                        }
                        Object K2 = oq5Var4.K();
                        kjn kjnVar = gq5.a;
                        if (K2 == kjnVar) {
                            K2 = new x80(aqiVar222, 4);
                            oq5Var4.k0(K2);
                        }
                        Function1 function1 = (Function1) K2;
                        d2.getClass();
                        function1.getClass();
                        Object K3 = oq5Var4.K();
                        if (K3 == kjnVar) {
                            K3 = tlm.f(gld.R(g.a, oq5Var4), oq5Var4);
                        }
                        mm6 mm6Var = ((fs5) K3).a;
                        Unit unit = Unit.a;
                        boolean h2 = oq5Var4.h(mm6Var);
                        Object K4 = oq5Var4.K();
                        if (h2 || K4 == kjnVar) {
                            K4 = new akc(mm6Var, function1, (Continuation) null, 10);
                            oq5Var4.k0(K4);
                        }
                        f5 = d2.f(new SuspendPointerInputElement(unit, null, null, new dur((Function2) K4), 6));
                        ta5 a4 = sa5.a(kx0Var, gz2Var, hq5Var2, 0);
                        int i17222 = oq5Var4.P;
                        androidx.compose.runtime.internal.a l2 = oq5Var4.l();
                        yci H2 = vnj.H(hq5Var2, f5);
                        oq5Var4.d0();
                        if (oq5Var4.O) {
                            oq5Var4.k(grbVar);
                        } else {
                            oq5Var4.n0();
                        }
                        g0g.U(hq5Var2, a4, kb5Var);
                        g0g.U(hq5Var2, l2, kb5Var2);
                        if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i17222))) {
                            ouj.x(i17222, oq5Var4, i17222, kb5Var3);
                        }
                        g0g.U(hq5Var2, H2, kb5Var4);
                        wn5Var.invoke(wa5.a, hq5Var2, 6);
                        if (mxoVar5222 == null) {
                            oq5Var4.Z(-1904113015);
                            WeakHashMap weakHashMap = rqv.w;
                            u1g.l(hq5Var2, s7g.F(z7l.h(hq5Var2).e));
                        } else {
                            oq5Var4.Z(-1908417086);
                        }
                        oq5Var4.p(false);
                        oq5Var4.p(true);
                        oq5Var4.p(true);
                        return Unit.a;
                    }
                }, oq5Var2);
                int i16222 = i15222 << 3;
                int i17222 = (i16222 & 112) | RemoteCameraConfig.Mic.BUFFER_SIZE | ((i15222 >> 3) & 896) | ((i15222 >> 6) & 7168) | ((i15222 >> 15) & 57344) | 196608 | (i16222 & 234881024);
                long j9222 = b2;
                rbi.a(mxoVar4, yciVar3, bciVar, function03, j8222, j9222, null, f3, z7, booleanValue222, C222, oq5Var2, i17222);
                j5 = j9222;
                z8 = z7;
                oq5Var = oq5Var2;
                z9 = z6;
                function23 = function24222;
                z10 = z11222;
                f4 = f3;
                j6 = j8222;
                mxoVar3 = mxoVar5222;
                function04 = function03;
                r = oq5Var.r();
                if (r == null) {
                }
            }
            mxoVar2 = mxoVar;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function02 = function0;
            i6 = 1572864 | i13;
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            z4 = z2;
            i8 = i2 & 256;
            if (i8 != 0) {
            }
            i9 = i12;
            if ((i & 805306368) == 0) {
            }
            if ((i6 & 306783379) == 306783378) {
            }
            oq5Var2.U();
            two twoVar3222 = null;
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if (i14 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 == 0) {
            }
            if ((i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0) {
            }
            b2 = d85.b(d85.b, 0.7f, 0.0f, 0.0f, 0.0f, 14);
            z6 = true;
            function03 = function02;
            long j72222 = j3;
            z7 = z4;
            f3 = kai.a;
            i10 = i6;
            j4 = j72222;
            oq5Var2.q();
            if (z6) {
            }
            oq5Var2.Z(-125678324);
            oq5Var2.p(false);
            K = oq5Var2.K();
            if (K == gq5.a) {
            }
            final aqi aqiVar2222 = (aqi) K;
            boolean booleanValue2222 = ((Boolean) aqiVar2222.getValue()).booleanValue();
            if (mxoVar2 != null) {
            }
            final Function2 function242222 = function22;
            final boolean z112222 = z5;
            final mxo mxoVar52222 = mxoVar2;
            final boolean z122222 = z7;
            final long j82222 = j4;
            final two twoVar22222 = twoVar3222;
            int i152222 = i10;
            wn5 C2222 = ild.C(-1452281012, new pyc() { // from class: gv2
                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yci f5;
                    hq5 hq5Var2 = (hq5) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((ua5) obj).getClass();
                    if ((intValue & 17) == 16) {
                        oq5 oq5Var3 = (oq5) hq5Var2;
                        if (oq5Var3.z()) {
                            oq5Var3.S();
                            return Unit.a;
                        }
                    }
                    boolean z13 = z112222;
                    vci vciVar = vci.a;
                    yci a2 = z13 ? b.a(vciVar, null, 3) : vciVar;
                    kx0 kx0Var = qx0.c;
                    gz2 gz2Var = b2c.n;
                    ta5 a3 = sa5.a(kx0Var, gz2Var, hq5Var2, 0);
                    oq5 oq5Var4 = (oq5) hq5Var2;
                    int i162222 = oq5Var4.P;
                    androidx.compose.runtime.internal.a l = oq5Var4.l();
                    yci H = vnj.H(hq5Var2, a2);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var4.d0();
                    if (oq5Var4.O) {
                        oq5Var4.k(grbVar);
                    } else {
                        oq5Var4.n0();
                    }
                    kb5 kb5Var = wp5.f;
                    g0g.U(hq5Var2, a3, kb5Var);
                    kb5 kb5Var2 = wp5.e;
                    g0g.U(hq5Var2, l, kb5Var2);
                    kb5 kb5Var3 = wp5.g;
                    if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i162222))) {
                        ouj.x(i162222, oq5Var4, i162222, kb5Var3);
                    }
                    kb5 kb5Var4 = wp5.d;
                    g0g.U(hq5Var2, H, kb5Var4);
                    long j92222 = d85.m;
                    ot0.e(6, 0, j82222, hq5Var2, d.d(vciVar, 1.0f), !d85.c(r4, j92222));
                    Function2 function25 = function242222;
                    if (function25 != null) {
                        oq5Var4.Z(-2028248708);
                        function25.invoke(hq5Var2, 0);
                    } else {
                        oq5Var4.Z(-2032021780);
                    }
                    oq5Var4.p(false);
                    yci d2 = d.d(vciVar, 1.0f);
                    two twoVar32222 = twoVar22222;
                    if (twoVar32222 != null) {
                        d2 = d2.f(bfg.Q(vciVar, twoVar32222, z122222, 12));
                    }
                    Object K2 = oq5Var4.K();
                    kjn kjnVar = gq5.a;
                    if (K2 == kjnVar) {
                        K2 = new x80(aqiVar2222, 4);
                        oq5Var4.k0(K2);
                    }
                    Function1 function1 = (Function1) K2;
                    d2.getClass();
                    function1.getClass();
                    Object K3 = oq5Var4.K();
                    if (K3 == kjnVar) {
                        K3 = tlm.f(gld.R(g.a, oq5Var4), oq5Var4);
                    }
                    mm6 mm6Var = ((fs5) K3).a;
                    Unit unit = Unit.a;
                    boolean h2 = oq5Var4.h(mm6Var);
                    Object K4 = oq5Var4.K();
                    if (h2 || K4 == kjnVar) {
                        K4 = new akc(mm6Var, function1, (Continuation) null, 10);
                        oq5Var4.k0(K4);
                    }
                    f5 = d2.f(new SuspendPointerInputElement(unit, null, null, new dur((Function2) K4), 6));
                    ta5 a4 = sa5.a(kx0Var, gz2Var, hq5Var2, 0);
                    int i172222 = oq5Var4.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var4.l();
                    yci H2 = vnj.H(hq5Var2, f5);
                    oq5Var4.d0();
                    if (oq5Var4.O) {
                        oq5Var4.k(grbVar);
                    } else {
                        oq5Var4.n0();
                    }
                    g0g.U(hq5Var2, a4, kb5Var);
                    g0g.U(hq5Var2, l2, kb5Var2);
                    if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i172222))) {
                        ouj.x(i172222, oq5Var4, i172222, kb5Var3);
                    }
                    g0g.U(hq5Var2, H2, kb5Var4);
                    wn5Var.invoke(wa5.a, hq5Var2, 6);
                    if (mxoVar52222 == null) {
                        oq5Var4.Z(-1904113015);
                        WeakHashMap weakHashMap = rqv.w;
                        u1g.l(hq5Var2, s7g.F(z7l.h(hq5Var2).e));
                    } else {
                        oq5Var4.Z(-1908417086);
                    }
                    oq5Var4.p(false);
                    oq5Var4.p(true);
                    oq5Var4.p(true);
                    return Unit.a;
                }
            }, oq5Var2);
            int i162222 = i152222 << 3;
            int i172222 = (i162222 & 112) | RemoteCameraConfig.Mic.BUFFER_SIZE | ((i152222 >> 3) & 896) | ((i152222 >> 6) & 7168) | ((i152222 >> 15) & 57344) | 196608 | (i162222 & 234881024);
            long j92222 = b2;
            rbi.a(mxoVar4, yciVar3, bciVar, function03, j82222, j92222, null, f3, z7, booleanValue2222, C2222, oq5Var2, i172222);
            j5 = j92222;
            z8 = z7;
            oq5Var = oq5Var2;
            z9 = z6;
            function23 = function242222;
            z10 = z112222;
            f4 = f3;
            j6 = j82222;
            mxoVar3 = mxoVar52222;
            function04 = function03;
            r = oq5Var.r();
            if (r == null) {
            }
        }
        function22 = function2;
        if ((i & 3072) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        mxoVar2 = mxoVar;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function02 = function0;
        i6 = 1572864 | i13;
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        z4 = z2;
        i8 = i2 & 256;
        if (i8 != 0) {
        }
        i9 = i12;
        if ((i & 805306368) == 0) {
        }
        if ((i6 & 306783379) == 306783378) {
        }
        oq5Var2.U();
        two twoVar32222 = null;
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if (i14 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 == 0) {
        }
        if ((i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0) {
        }
        b2 = d85.b(d85.b, 0.7f, 0.0f, 0.0f, 0.0f, 14);
        z6 = true;
        function03 = function02;
        long j722222 = j3;
        z7 = z4;
        f3 = kai.a;
        i10 = i6;
        j4 = j722222;
        oq5Var2.q();
        if (z6) {
        }
        oq5Var2.Z(-125678324);
        oq5Var2.p(false);
        K = oq5Var2.K();
        if (K == gq5.a) {
        }
        final aqi aqiVar22222 = (aqi) K;
        boolean booleanValue22222 = ((Boolean) aqiVar22222.getValue()).booleanValue();
        if (mxoVar2 != null) {
        }
        final Function2 function2422222 = function22;
        final boolean z1122222 = z5;
        final mxo mxoVar522222 = mxoVar2;
        final boolean z1222222 = z7;
        final long j822222 = j4;
        final two twoVar222222 = twoVar32222;
        int i1522222 = i10;
        wn5 C22222 = ild.C(-1452281012, new pyc() { // from class: gv2
            @Override // defpackage.pyc
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                yci f5;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ua5) obj).getClass();
                if ((intValue & 17) == 16) {
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                boolean z13 = z1122222;
                vci vciVar = vci.a;
                yci a2 = z13 ? b.a(vciVar, null, 3) : vciVar;
                kx0 kx0Var = qx0.c;
                gz2 gz2Var = b2c.n;
                ta5 a3 = sa5.a(kx0Var, gz2Var, hq5Var2, 0);
                oq5 oq5Var4 = (oq5) hq5Var2;
                int i1622222 = oq5Var4.P;
                androidx.compose.runtime.internal.a l = oq5Var4.l();
                yci H = vnj.H(hq5Var2, a2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar);
                } else {
                    oq5Var4.n0();
                }
                kb5 kb5Var = wp5.f;
                g0g.U(hq5Var2, a3, kb5Var);
                kb5 kb5Var2 = wp5.e;
                g0g.U(hq5Var2, l, kb5Var2);
                kb5 kb5Var3 = wp5.g;
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i1622222))) {
                    ouj.x(i1622222, oq5Var4, i1622222, kb5Var3);
                }
                kb5 kb5Var4 = wp5.d;
                g0g.U(hq5Var2, H, kb5Var4);
                long j922222 = d85.m;
                ot0.e(6, 0, j822222, hq5Var2, d.d(vciVar, 1.0f), !d85.c(r4, j922222));
                Function2 function25 = function2422222;
                if (function25 != null) {
                    oq5Var4.Z(-2028248708);
                    function25.invoke(hq5Var2, 0);
                } else {
                    oq5Var4.Z(-2032021780);
                }
                oq5Var4.p(false);
                yci d2 = d.d(vciVar, 1.0f);
                two twoVar322222 = twoVar222222;
                if (twoVar322222 != null) {
                    d2 = d2.f(bfg.Q(vciVar, twoVar322222, z1222222, 12));
                }
                Object K2 = oq5Var4.K();
                kjn kjnVar = gq5.a;
                if (K2 == kjnVar) {
                    K2 = new x80(aqiVar22222, 4);
                    oq5Var4.k0(K2);
                }
                Function1 function1 = (Function1) K2;
                d2.getClass();
                function1.getClass();
                Object K3 = oq5Var4.K();
                if (K3 == kjnVar) {
                    K3 = tlm.f(gld.R(g.a, oq5Var4), oq5Var4);
                }
                mm6 mm6Var = ((fs5) K3).a;
                Unit unit = Unit.a;
                boolean h2 = oq5Var4.h(mm6Var);
                Object K4 = oq5Var4.K();
                if (h2 || K4 == kjnVar) {
                    K4 = new akc(mm6Var, function1, (Continuation) null, 10);
                    oq5Var4.k0(K4);
                }
                f5 = d2.f(new SuspendPointerInputElement(unit, null, null, new dur((Function2) K4), 6));
                ta5 a4 = sa5.a(kx0Var, gz2Var, hq5Var2, 0);
                int i1722222 = oq5Var4.P;
                androidx.compose.runtime.internal.a l2 = oq5Var4.l();
                yci H2 = vnj.H(hq5Var2, f5);
                oq5Var4.d0();
                if (oq5Var4.O) {
                    oq5Var4.k(grbVar);
                } else {
                    oq5Var4.n0();
                }
                g0g.U(hq5Var2, a4, kb5Var);
                g0g.U(hq5Var2, l2, kb5Var2);
                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i1722222))) {
                    ouj.x(i1722222, oq5Var4, i1722222, kb5Var3);
                }
                g0g.U(hq5Var2, H2, kb5Var4);
                wn5Var.invoke(wa5.a, hq5Var2, 6);
                if (mxoVar522222 == null) {
                    oq5Var4.Z(-1904113015);
                    WeakHashMap weakHashMap = rqv.w;
                    u1g.l(hq5Var2, s7g.F(z7l.h(hq5Var2).e));
                } else {
                    oq5Var4.Z(-1908417086);
                }
                oq5Var4.p(false);
                oq5Var4.p(true);
                oq5Var4.p(true);
                return Unit.a;
            }
        }, oq5Var2);
        int i1622222 = i1522222 << 3;
        int i1722222 = (i1622222 & 112) | RemoteCameraConfig.Mic.BUFFER_SIZE | ((i1522222 >> 3) & 896) | ((i1522222 >> 6) & 7168) | ((i1522222 >> 15) & 57344) | 196608 | (i1622222 & 234881024);
        long j922222 = b2;
        rbi.a(mxoVar4, yciVar3, bciVar, function03, j822222, j922222, null, f3, z7, booleanValue22222, C22222, oq5Var2, i1722222);
        j5 = j922222;
        z8 = z7;
        oq5Var = oq5Var2;
        z9 = z6;
        function23 = function2422222;
        z10 = z1122222;
        f4 = f3;
        j6 = j822222;
        mxoVar3 = mxoVar522222;
        function04 = function03;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void g(final p14 p14Var, final Function1 function1, final yci yciVar, final Function0 function0, final Function0 function02, final float f2, final float f3, boolean z, final wn5 wn5Var, hq5 hq5Var, final int i, final int i2) {
        int i3;
        Function1 function12;
        Function0 function03;
        Function0 function04;
        float f4;
        float f5;
        boolean z2;
        wn5 wn5Var2;
        xmn r;
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-242085157);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(p14Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function12 = function1;
            i3 |= oq5Var.h(function12) ? 32 : 16;
        } else {
            function12 = function1;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function03 = function0;
            i3 |= oq5Var.h(function03) ? 2048 : 1024;
        } else {
            function03 = function0;
        }
        if ((i & 24576) == 0) {
            function04 = function02;
            i3 |= oq5Var.h(function04) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            function04 = function02;
        }
        if ((196608 & i) == 0) {
            f4 = f2;
            i3 |= oq5Var.c(f4) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            f4 = f2;
        }
        if ((1572864 & i) == 0) {
            f5 = f3;
            i3 |= oq5Var.c(f5) ? 1048576 : 524288;
        } else {
            f5 = f3;
        }
        int i4 = i2 & 128;
        if (i4 != 0) {
            i3 |= 12582912;
        } else if ((12582912 & i) == 0) {
            z2 = z;
            i3 |= oq5Var.g(z2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
            if ((100663296 & i) != 0) {
                wn5Var2 = wn5Var;
                i3 |= oq5Var.h(wn5Var2) ? 67108864 : 33554432;
            } else {
                wn5Var2 = wn5Var;
            }
            if (oq5Var.P(i3 & 1, (38347923 & i3) == 38347922)) {
                oq5Var.S();
            } else {
                final boolean z3 = i4 != 0 ? true : z2;
                final Function1 function13 = function12;
                final Function0 function05 = function03;
                final Function0 function06 = function04;
                final float f6 = f4;
                final float f7 = f5;
                final wn5 wn5Var3 = wn5Var2;
                bg3.a(d.c(yciVar, 1.0f), null, false, ild.C(-1881073723, new pyc() { // from class: k24
                    /* JADX WARN: Code restructure failed: missing block: B:54:0x025c, code lost:
                    
                        if (kotlin.jvm.internal.Intrinsics.d(r2.K(), java.lang.Integer.valueOf(r1)) == false) goto L68;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:82:0x0363, code lost:
                    
                        if (r11 == r8) goto L105;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r12v21 */
                    /* JADX WARN: Type inference failed for: r12v22, types: [wn5] */
                    /* JADX WARN: Type inference failed for: r12v29 */
                    /* JADX WARN: Type inference failed for: r20v2, types: [kotlin.coroutines.Continuation] */
                    /* JADX WARN: Type inference failed for: r3v15 */
                    /* JADX WARN: Type inference failed for: r3v16, types: [wn5] */
                    /* JADX WARN: Type inference failed for: r3v38 */
                    @Override // defpackage.pyc
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a2o a2oVar;
                        b9r b9rVar;
                        float f8;
                        Object obj4;
                        aqi aqiVar;
                        a2o a2oVar2;
                        a2o a2oVar3;
                        whm whmVar;
                        boolean z4;
                        Object obj5;
                        boolean z5;
                        Object obj6;
                        boolean z6;
                        androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj;
                        hq5 hq5Var2 = (hq5) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        cVar.getClass();
                        long j = cVar.b;
                        int i5 = 4;
                        if ((intValue & 6) == 0) {
                            intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                        }
                        oq5 oq5Var2 = (oq5) hq5Var2;
                        if (!oq5Var2.P(intValue & 1, (intValue & 19) != 18)) {
                            oq5Var2.S();
                        } else {
                            if (ga6.l(j)) {
                                return Unit.a;
                            }
                            p14 p14Var2 = p14.this;
                            aqi o0 = szf.o0(p14Var2, oq5Var2);
                            Object K = oq5Var2.K();
                            kjn kjnVar = gq5.a;
                            Object obj7 = K;
                            if (K == kjnVar) {
                                x80 x80Var = new x80(o0, 8);
                                oq5Var2.k0(x80Var);
                                obj7 = x80Var;
                            }
                            Function1 function14 = (Function1) obj7;
                            b9r Q = weo.Q(0.0f, 0.0f, null, 7);
                            Object[] objArr = new Object[0];
                            Object K2 = oq5Var2.K();
                            Object obj8 = K2;
                            if (K2 == kjnVar) {
                                t83 t83Var = new t83(i5);
                                oq5Var2.k0(t83Var);
                                obj8 = t83Var;
                            }
                            Function2 function2 = (Function2) obj8;
                            wn5 wn5Var4 = wn5Var3;
                            boolean f9 = oq5Var2.f(wn5Var4) | oq5Var2.f(p14Var2);
                            Object K3 = oq5Var2.K();
                            if (f9 || K3 == kjnVar) {
                                a2oVar = null;
                                b9rVar = Q;
                                f8 = 0.0f;
                                i50 i50Var = new i50(b9rVar, function14, wn5Var4, p14Var2, 5);
                                oq5Var2.k0(i50Var);
                                obj4 = i50Var;
                            } else {
                                a2oVar = null;
                                b9rVar = Q;
                                f8 = 0.0f;
                                obj4 = K3;
                            }
                            apo apoVar = bpo.a;
                            apo apoVar2 = new apo(0, function2, (Function1) obj4);
                            boolean f10 = oq5Var2.f(wn5Var4) | oq5Var2.f(p14Var2);
                            Object K4 = oq5Var2.K();
                            Object obj9 = K4;
                            if (f10 || K4 == kjnVar) {
                                ye yeVar = new ye(b9rVar, function14, wn5Var4, p14Var2, 9);
                                oq5Var2.k0(yeVar);
                                obj9 = yeVar;
                            }
                            aqi f0 = o2g.f0(objArr, apoVar2, (Function0) obj9, oq5Var2);
                            float i6 = ga6.i(j);
                            Float valueOf = Float.valueOf(-i6);
                            whm whmVar2 = whm.c;
                            Pair pair = new Pair(valueOf, whmVar2);
                            Float valueOf2 = Float.valueOf(f8);
                            whm whmVar3 = whm.b;
                            Pair pair2 = new Pair(valueOf2, whmVar3);
                            Float valueOf3 = Float.valueOf(i6);
                            whm whmVar4 = whm.a;
                            b9r b9rVar2 = b9rVar;
                            Map e2 = uah.e(pair, pair2, new Pair(valueOf3, whmVar4));
                            Unit unit = Unit.a;
                            boolean f11 = oq5Var2.f(f0) | oq5Var2.f(o0) | oq5Var2.f(wn5Var4);
                            Object K5 = oq5Var2.K();
                            if (f11 || K5 == kjnVar) {
                                aqiVar = f0;
                                K5 = new ov(aqiVar, o0, wn5Var4, b9rVar2, function14, (Continuation) null, 7);
                                oq5Var2.k0(K5);
                            } else {
                                aqiVar = f0;
                            }
                            gld.w(oq5Var2, unit, (Function2) K5);
                            final m54 m54Var = (m54) aqiVar.getValue();
                            nvr nvrVar = m54Var.a;
                            pe6 pe6Var = m54Var.b;
                            bxj bxjVar = bxj.a;
                            Object K6 = oq5Var2.K();
                            Object obj10 = K6;
                            if (K6 == kjnVar) {
                                t83 t83Var2 = new t83(5);
                                oq5Var2.k0(t83Var2);
                                obj10 = t83Var2;
                            }
                            Function2 function22 = (Function2) obj10;
                            b9r b9rVar3 = hvr.a;
                            Set keySet = e2.keySet();
                            if (keySet.size() <= 1) {
                                a2oVar2 = a2oVar;
                            } else {
                                Set set = keySet;
                                Float a0 = CollectionsKt.a0(set);
                                a0.getClass();
                                float floatValue = a0.floatValue();
                                Float c0 = CollectionsKt.c0(set);
                                c0.getClass();
                                a2oVar2 = new a2o(floatValue - c0.floatValue());
                            }
                            jvr jvrVar = new jvr(e2, nvrVar, a2oVar2, function22, hvr.b, z3);
                            vci vciVar = vci.a;
                            yci q = vnj.q(vciVar, jvrVar);
                            boolean h2 = oq5Var2.h(m54Var) | oq5Var2.f(o0);
                            Function1 function15 = function13;
                            boolean f12 = h2 | oq5Var2.f(function15);
                            Object K7 = oq5Var2.K();
                            if (f12 || K7 == kjnVar) {
                                ?? r20 = a2oVar;
                                K7 = new k3(m54Var, function15, o0, (Continuation) r20, 27);
                                oq5Var2.k0(K7);
                                a2oVar3 = r20;
                            } else {
                                a2oVar3 = a2oVar;
                            }
                            gld.w(oq5Var2, m54Var, (Function2) K7);
                            boolean h3 = oq5Var2.h(m54Var);
                            Function0 function07 = function05;
                            boolean f13 = h3 | oq5Var2.f(function07);
                            Function0 function08 = function06;
                            boolean f14 = f13 | oq5Var2.f(function08) | oq5Var2.c(i6);
                            float f15 = f6;
                            boolean c2 = f14 | oq5Var2.c(f15);
                            float f16 = f7;
                            boolean c3 = c2 | oq5Var2.c(f16);
                            Object K8 = oq5Var2.K();
                            if (c3 || K8 == kjnVar) {
                                K8 = new x24(m54Var, function07, function08, i6, f15, f16);
                                oq5Var2.k0(K8);
                            }
                            kfh kfhVar = (kfh) K8;
                            int i7 = oq5Var2.P;
                            androidx.compose.runtime.internal.a l = oq5Var2.l();
                            yci H = vnj.H(oq5Var2, q);
                            xp5.T.getClass();
                            grb grbVar = wp5.b;
                            oq5Var2.d0();
                            if (oq5Var2.O) {
                                oq5Var2.k(grbVar);
                            } else {
                                oq5Var2.n0();
                            }
                            kb5 kb5Var = wp5.f;
                            g0g.U(oq5Var2, kfhVar, kb5Var);
                            kb5 kb5Var2 = wp5.e;
                            g0g.U(oq5Var2, l, kb5Var2);
                            kb5 kb5Var3 = wp5.g;
                            if (oq5Var2.O) {
                                whmVar = whmVar2;
                            } else {
                                whmVar = whmVar2;
                            }
                            ouj.x(i7, oq5Var2, i7, kb5Var3);
                            kb5 kb5Var4 = wp5.d;
                            g0g.U(oq5Var2, H, kb5Var4);
                            yci c4 = androidx.compose.ui.layout.a.c(vciVar, whmVar4);
                            boolean h4 = oq5Var2.h(m54Var);
                            Object K9 = oq5Var2.K();
                            if (h4 || K9 == kjnVar) {
                                z4 = false;
                                final boolean z7 = false ? 1 : 0;
                                Function1 function16 = new Function1() { // from class: r24
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj11) {
                                        jx7 jx7Var = (jx7) obj11;
                                        switch (z7) {
                                            case 0:
                                                jx7Var.getClass();
                                                return new wpe((eeh.b(((Number) m54Var.c.e()).floatValue()) << 32) | (0 & 4294967295L));
                                            default:
                                                jx7Var.getClass();
                                                return new wpe((eeh.b(((Number) m54Var.d.e()).floatValue()) << 32) | (0 & 4294967295L));
                                        }
                                    }
                                };
                                oq5Var2.k0(function16);
                                obj5 = function16;
                            } else {
                                z4 = false;
                                obj5 = K9;
                            }
                            yci c5 = com.yandex.music.core.ui.compose.b.c(androidx.compose.foundation.layout.a.i(c4, (Function1) obj5), "carousel_item_position", "left");
                            iz2 iz2Var = b2c.b;
                            kfh d2 = ug3.d(iz2Var, z4);
                            int i8 = oq5Var2.P;
                            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
                            yci H2 = vnj.H(oq5Var2, c5);
                            oq5Var2.d0();
                            if (oq5Var2.O) {
                                oq5Var2.k(grbVar);
                            } else {
                                oq5Var2.n0();
                            }
                            g0g.U(oq5Var2, d2, kb5Var);
                            g0g.U(oq5Var2, l2, kb5Var2);
                            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i8))) {
                                ouj.x(i8, oq5Var2, i8, kb5Var3);
                            }
                            g0g.U(oq5Var2, H2, kb5Var4);
                            nnk nnkVar = pe6Var.a;
                            ?? r3 = nnkVar != null ? (wn5) nnkVar.b : a2oVar3;
                            if (r3 == 0) {
                                oq5Var2.Z(19358737);
                                z5 = false;
                            } else {
                                z5 = false;
                                oq5Var2.Z(693361136);
                                r3.invoke(oq5Var2, 0);
                            }
                            oq5Var2.p(z5);
                            oq5Var2.p(true);
                            yci c6 = com.yandex.music.core.ui.compose.b.c(androidx.compose.ui.layout.a.c(vciVar, whmVar3), "carousel_item_position", "center");
                            kfh d3 = ug3.d(iz2Var, z5);
                            int i9 = oq5Var2.P;
                            androidx.compose.runtime.internal.a l3 = oq5Var2.l();
                            yci H3 = vnj.H(oq5Var2, c6);
                            oq5Var2.d0();
                            if (oq5Var2.O) {
                                oq5Var2.k(grbVar);
                            } else {
                                oq5Var2.n0();
                            }
                            g0g.U(oq5Var2, d3, kb5Var);
                            g0g.U(oq5Var2, l3, kb5Var2);
                            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i9))) {
                                ouj.x(i9, oq5Var2, i9, kb5Var3);
                            }
                            g0g.U(oq5Var2, H3, kb5Var4);
                            ((wn5) pe6Var.b.b).invoke(oq5Var2, 0);
                            final int i10 = 1;
                            oq5Var2.p(true);
                            yci c7 = androidx.compose.ui.layout.a.c(vciVar, whmVar);
                            boolean h5 = oq5Var2.h(m54Var);
                            Object K10 = oq5Var2.K();
                            if (!h5) {
                                obj6 = K10;
                            }
                            Function1 function17 = new Function1() { // from class: r24
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj11) {
                                    jx7 jx7Var = (jx7) obj11;
                                    switch (i10) {
                                        case 0:
                                            jx7Var.getClass();
                                            return new wpe((eeh.b(((Number) m54Var.c.e()).floatValue()) << 32) | (0 & 4294967295L));
                                        default:
                                            jx7Var.getClass();
                                            return new wpe((eeh.b(((Number) m54Var.d.e()).floatValue()) << 32) | (0 & 4294967295L));
                                    }
                                }
                            };
                            oq5Var2.k0(function17);
                            obj6 = function17;
                            yci c8 = com.yandex.music.core.ui.compose.b.c(androidx.compose.foundation.layout.a.i(c7, (Function1) obj6), "carousel_item_position", "right");
                            kfh d4 = ug3.d(iz2Var, false);
                            int i11 = oq5Var2.P;
                            androidx.compose.runtime.internal.a l4 = oq5Var2.l();
                            yci H4 = vnj.H(oq5Var2, c8);
                            oq5Var2.d0();
                            if (oq5Var2.O) {
                                oq5Var2.k(grbVar);
                            } else {
                                oq5Var2.n0();
                            }
                            g0g.U(oq5Var2, d4, kb5Var);
                            g0g.U(oq5Var2, l4, kb5Var2);
                            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i11))) {
                                ouj.x(i11, oq5Var2, i11, kb5Var3);
                            }
                            g0g.U(oq5Var2, H4, kb5Var4);
                            nnk nnkVar2 = pe6Var.c;
                            ?? r12 = nnkVar2 != null ? (wn5) nnkVar2.b : a2oVar3;
                            if (r12 == 0) {
                                oq5Var2.Z(1022788073);
                                z6 = false;
                            } else {
                                z6 = false;
                                oq5Var2.Z(448635160);
                                r12.invoke(oq5Var2, 0);
                            }
                            oq5Var2.p(z6);
                            oq5Var2.p(true);
                            oq5Var2.p(true);
                        }
                        return Unit.a;
                    }
                }, oq5Var), oq5Var, 3072, 6);
                z2 = z3;
            }
            r = oq5Var.r();
            if (r == null) {
                final boolean z4 = z2;
                r.d = new Function2() { // from class: n24
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        yd5.g(p14.this, function1, yciVar, function0, function02, f2, f3, z4, wn5Var, (hq5) obj, rvf.R(i | 1), i2);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        if ((100663296 & i) != 0) {
        }
        if (oq5Var.P(i3 & 1, (38347923 & i3) == 38347922)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void h(String str, t16 t16Var, boolean z, Function0 function0, yci yciVar, Function0 function02, wn5 wn5Var, hq5 hq5Var, int i) {
        wn5 wn5Var2;
        str.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1831263230);
        int i2 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(t16Var) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128) | (oq5Var.h(function0) ? 2048 : 1024) | (oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if ((599187 & i2) == 599186 && oq5Var.z()) {
            oq5Var.S();
            wn5Var2 = wn5Var;
        } else {
            u7g.a(((ma5) oq5Var.j(pa5.a)).g(), oq5Var, 0);
            wn5Var2 = wn5Var;
            q7g.r(((i2 >> 9) & 112) | 3078, 4, ild.C(-1773680536, new qr(z, t16Var, function0, str, function02), oq5Var), ild.C(506137518, new j26(wn5Var2, 0), oq5Var), oq5Var, yciVar, false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k26(str, t16Var, z, function0, yciVar, function02, wn5Var2, i);
        }
    }

    public static final void i(Function0 function0, yci yciVar, rxv rxvVar, Function1 function1, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1674732427);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(rxvVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var = ((fs5) K).a;
            int i3 = (i2 & 896) ^ 384;
            boolean z = (i3 > 256 && oq5Var.f(rxvVar)) || (i2 & 384) == 256;
            Object K2 = oq5Var.K();
            if (z || K2 == kjnVar) {
                K2 = new sk6();
                oq5Var.k0(K2);
            }
            sk6 sk6Var = (sk6) K2;
            int i4 = (i2 >> 6) & 14;
            int i5 = i2 >> 3;
            int i6 = (i5 & 896) | i4 | (i5 & 7168);
            rxvVar.getClass();
            sk6Var.getClass();
            function1.getClass();
            aqi o0 = szf.o0(wn5Var, oq5Var);
            boolean z2 = (((i6 & 14) ^ 6) > 4 && oq5Var.f(rxvVar)) || (i6 & 6) == 4;
            Object K3 = oq5Var.K();
            if (z2 || K3 == kjnVar) {
                rwd rwdVar = rwd.h;
                K3 = new jk6(0, 0, sdr.class, szf.T(rwdVar, new aw5(7, szf.T(rwdVar, new vd(15, sk6Var, o0, function1)), sk6Var)), Constants.KEY_VALUE, "getValue()Ljava/lang/Object;");
                oq5Var.k0(K3);
            }
            p9f p9fVar = (p9f) K3;
            boolean z3 = (i3 > 256 && oq5Var.f(rxvVar)) || (i2 & 384) == 256;
            Object K4 = oq5Var.K();
            if (z3 || K4 == kjnVar) {
                K4 = new euf(null);
                oq5Var.k0(K4);
            }
            euf eufVar = (euf) K4;
            boolean z4 = (i3 > 256 && oq5Var.f(rxvVar)) || (i2 & 384) == 256;
            Object K5 = oq5Var.K();
            if (z4 || K5 == kjnVar) {
                K5 = new qk6(rxvVar, eufVar, sk6Var, mm6Var);
                oq5Var.k0(K5);
            }
            qk6 qk6Var = (qk6) K5;
            int i7 = ((i2 << 9) & 7168) | i4;
            qk6Var.getClass();
            p9fVar.getClass();
            boolean z5 = (((i7 & 14) ^ 6) > 4 && oq5Var.f(rxvVar)) || (i7 & 6) == 4;
            Object K6 = oq5Var.K();
            if (z5 || K6 == kjnVar) {
                K6 = new av5(p9fVar, function0, rxvVar, qk6Var, 5);
                oq5Var.k0(K6);
            }
            Function2 function2 = (Function2) K6;
            Object K7 = oq5Var.K();
            if (K7 == kjnVar) {
                K7 = new g6d(rxvVar, mm6Var);
                oq5Var.k0(K7);
            }
            etn.l(es5.n.a(xof.a), ild.C(-302979381, new pr(yciVar, (g6d) K7, rxvVar, p9fVar, eufVar, function2), oq5Var), oq5Var, 56);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu(i, 10, function0, yciVar, rxvVar, function1, wn5Var);
        }
    }

    public static final void j(final int i, final yci yciVar, hz2 hz2Var, long j, long j2, final wn5 wn5Var, final wn5 wn5Var2, final wn5 wn5Var3, hq5 hq5Var, final int i2) {
        long b2;
        long j3;
        hz2 hz2Var2;
        final long j4;
        final long j5;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(744138488);
        if (((i2 | (oq5Var.d(i) ? 4 : 2) | (oq5Var.f(yciVar) ? 32 : 16) | 9216) & 4793491) == 4793490 && oq5Var.z()) {
            oq5Var.S();
            hz2Var2 = hz2Var;
            j4 = j;
            j5 = j2;
        } else {
            oq5Var.U();
            if ((i2 & 1) == 0 || oq5Var.y()) {
                ma5 ma5Var = (ma5) oq5Var.j(pa5.a);
                long d2 = ma5Var.g() ? ma5Var.d() : ma5Var.f();
                b2 = pa5.b(d2, oq5Var);
                j3 = d2;
            } else {
                oq5Var.S();
                j3 = j;
                b2 = j2;
            }
            oq5Var.q();
            hz2Var2 = hz2Var;
            q5g.k(nfp.b(yciVar, false, dpo.I), null, j3, b2, null, 0.0f, ild.C(-1808462796, new lx6(wn5Var3, hz2Var2, wn5Var2, wn5Var), oq5Var), oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 50);
            j4 = j3;
            j5 = b2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            final hz2 hz2Var3 = hz2Var2;
            r.d = new Function2(i, yciVar, hz2Var3, j4, j5, wn5Var, wn5Var2, wn5Var3, i2) { // from class: mx6
                public final /* synthetic */ int a;
                public final /* synthetic */ yci b;
                public final /* synthetic */ hz2 c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ wn5 f;
                public final /* synthetic */ wn5 g;
                public final /* synthetic */ wn5 h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(14352769);
                    yd5.j(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final void k(zgf zgfVar, hq5 hq5Var, int i) {
        fvf fvfVar;
        thf thfVar;
        zgfVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1207213908);
        int i2 = (oq5Var.h(zgfVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            thf thfVar2 = (thf) szf.Q(zgfVar.i, oq5Var).getValue();
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            ogp.g.e(false, thfVar2 instanceof phf, null, oq5Var, 4096, 5);
            yci a3 = a.a(vci.a, "collection_kids_tracks_screen");
            boolean booleanValue = ((Boolean) szf.Q(zgfVar.j, oq5Var).getValue()).booleanValue();
            boolean h2 = oq5Var.h(zgfVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                fvfVar = a2;
                thfVar = thfVar2;
                pef pefVar = new pef(0, zgfVar, zgf.class, "onRefresh", "onRefresh()V", 0, 4);
                oq5Var.k0(pefVar);
                K = pefVar;
            } else {
                thfVar = thfVar2;
                fvfVar = a2;
            }
            h9f h9fVar = (h9f) K;
            boolean h3 = oq5Var.h(zgfVar);
            Object K2 = oq5Var.K();
            if (h3 || K2 == kjnVar) {
                pef pefVar2 = new pef(0, zgfVar, zgf.class, "onBackClicked", "onBackClicked()V", 0, 6);
                oq5Var.k0(pefVar2);
                K2 = pefVar2;
            }
            h9f h9fVar2 = (h9f) K2;
            boolean h4 = oq5Var.h(zgfVar);
            Object K3 = oq5Var.K();
            if (h4 || K3 == kjnVar) {
                pef pefVar3 = new pef(0, zgfVar, zgf.class, "onSearchClicked", "onSearchClicked()V", 0, 8);
                oq5Var.k0(pefVar3);
                K3 = pefVar3;
            }
            h9f h9fVar3 = (h9f) K3;
            boolean h5 = oq5Var.h(zgfVar);
            Object K4 = oq5Var.K();
            if (h5 || K4 == kjnVar) {
                pef pefVar4 = new pef(0, zgfVar, zgf.class, "openSortBottomSheet", "openSortBottomSheet()V", 0, 9);
                oq5Var.k0(pefVar4);
                K4 = pefVar4;
            }
            xp3.g(R.string.kids_episode_title, fvfVar, booleanValue, (Function0) h9fVar, (Function0) h9fVar2, a3, (Function0) h9fVar3, (Function0) ((h9f) K4), ild.C(-617447472, new vtb(8, thfVar, zgfVar, fvfVar), oq5Var), oq5Var, 100859904, 0);
            oq5Var = oq5Var;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new nha(zgfVar, i, 28);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    public static final void l(String str, ges gesVar, float f2, Function0 function0, yci yciVar, String str2, hq5 hq5Var, int i, int i2) {
        String str3;
        int i3;
        int i4;
        String str4;
        ?? r2;
        oq5 oq5Var;
        String str5;
        oq5 oq5Var2;
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-1081857191);
        int i5 = i | (oq5Var3.f(str) ? 4 : 2) | (oq5Var3.f(gesVar) ? 32 : 16) | (oq5Var3.c(f2) ? 256 : 128) | (oq5Var3.h(function0) ? 2048 : 1024) | (oq5Var3.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 = i5 | 196608;
            str3 = str2;
        } else {
            str3 = str2;
            i3 = i5 | (oq5Var3.f(str3) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        }
        if ((74899 & i3) == 74898 && oq5Var3.z()) {
            oq5Var3.S();
            str5 = str3;
            oq5Var2 = oq5Var3;
        } else {
            if (i6 != 0) {
                str3 = null;
            }
            float f3 = 48;
            hz2 hz2Var = b2c.l;
            yci q = androidx.compose.foundation.layout.a.q(yciVar, (f2 / 2) + f3, 16, f3, 0.0f, 8);
            boolean z = (i3 & 7168) == 2048;
            Object K = oq5Var3.K();
            if (z || K == gq5.a) {
                K = new or(12, function0);
                oq5Var3.k0(K);
            }
            yci e2 = androidx.compose.foundation.a.e(q, false, null, null, (Function0) K, 7);
            nho a2 = lho.a(qx0.a, hz2Var, oq5Var3, 48);
            int i7 = oq5Var3.P;
            androidx.compose.runtime.internal.a l = oq5Var3.l();
            yci H = vnj.H(oq5Var3, e2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(grbVar);
            } else {
                oq5Var3.n0();
            }
            g0g.U(oq5Var3, a2, wp5.f);
            g0g.U(oq5Var3, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var3, i7, kb5Var);
            }
            g0g.U(oq5Var3, H, wp5.d);
            if (str3 != null) {
                oq5Var3.Z(155312365);
                String str6 = str3;
                i4 = 3670016;
                r2 = 0;
                xv7.j(str6, null, ((dq0) oq5Var3.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 0, false, 1, 0, null, gesVar, oq5Var3, (i3 >> 15) & 14, ((i3 << 15) & 3670016) | 3072, 57338);
                str4 = str6;
                oq5Var = oq5Var3;
            } else {
                i4 = 3670016;
                str4 = str3;
                r2 = 0;
                oq5Var3.Z(148552133);
                oq5Var = oq5Var3;
            }
            oq5Var.p(r2);
            agr agrVar = eq0.a;
            long j = ((dq0) oq5Var.j(agrVar)).b.a;
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            oq5 oq5Var4 = oq5Var;
            xv7.j(str, new LayoutWeightElement(r2, 1.0f), j, 0L, 0L, 0, 0L, 2, false, 1, 0, null, gesVar, oq5Var4, i3 & 14, ((i3 << 15) & i4) | 3120, 55288);
            oq5 oq5Var5 = oq5Var4;
            gae.b(a0g.E(R.drawable.ic_arrow_small_bottom_16, r2, oq5Var5), null, d.m(vci.a, f2), ((dq0) oq5Var5.j(agrVar)).b.a, oq5Var5, 48, 0);
            oq5Var5.p(true);
            str5 = str4;
            oq5Var2 = oq5Var5;
        }
        xmn r = oq5Var2.r();
        if (r != null) {
            r.d = new nm2(str, gesVar, f2, function0, yciVar, str5, i, i2);
        }
    }

    public static Object m(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final long n(String str) {
        ssa ssaVar;
        char charAt;
        int length = str.length();
        if (length == 0) {
            xq0.x("The string is empty");
            return 0L;
        }
        nsa.b.getClass();
        char charAt2 = str.charAt(0);
        int i = (charAt2 == '+' || charAt2 == '-') ? 1 : 0;
        boolean z = i > 0 && StringsKt.i0(str, '-');
        if (length <= i) {
            xq0.x("No components");
            return 0L;
        }
        if (str.charAt(i) != 'P') {
            e7o.e();
            return 0L;
        }
        int i2 = i + 1;
        if (i2 == length) {
            e7o.e();
            return 0L;
        }
        ssa ssaVar2 = null;
        long j = 0;
        boolean z2 = false;
        while (i2 < length) {
            if (str.charAt(i2) != 'T') {
                int i3 = i2;
                while (i3 < str.length() && (('0' <= (charAt = str.charAt(i3)) && charAt < ':') || StringsKt.N("+-.", charAt))) {
                    i3++;
                }
                String substring = str.substring(i2, i3);
                if (substring.length() == 0) {
                    e7o.e();
                    return 0L;
                }
                int length2 = substring.length() + i2;
                if (length2 < 0 || length2 >= str.length()) {
                    xq0.x("Missing unit for value ".concat(substring));
                    return 0L;
                }
                char charAt3 = str.charAt(length2);
                int i4 = length2 + 1;
                if (z2) {
                    if (charAt3 == 'H') {
                        ssaVar = ssa.HOURS;
                    } else if (charAt3 == 'M') {
                        ssaVar = ssa.MINUTES;
                    } else {
                        if (charAt3 != 'S') {
                            xla.e(charAt3, "Invalid duration ISO time unit: ");
                            return 0L;
                        }
                        ssaVar = ssa.SECONDS;
                    }
                } else {
                    if (charAt3 != 'D') {
                        xla.e(charAt3, "Invalid or unsupported duration ISO non-time unit: ");
                        return 0L;
                    }
                    ssaVar = ssa.DAYS;
                }
                if (ssaVar2 != null && ssaVar2.compareTo(ssaVar) <= 0) {
                    xq0.x("Unexpected order of duration components");
                    return 0L;
                }
                int S = StringsKt.S(substring, '.', 0, 6);
                j = (ssaVar != ssa.SECONDS || S <= 0) ? nsa.o(j, N(A(substring), ssaVar)) : nsa.o(nsa.o(j, N(A(substring.substring(0, S)), ssaVar)), L(Double.parseDouble(substring.substring(S)), ssaVar));
                ssaVar2 = ssaVar;
                i2 = i4;
            } else {
                if (z2 || (i2 = i2 + 1) == length) {
                    e7o.e();
                    return 0L;
                }
                z2 = true;
            }
        }
        return z ? nsa.u(j) : j;
    }

    public static final void o(cz0 cz0Var, int i) {
        cz0Var.a = new int[i];
        cz0Var.b = new Object[i];
    }

    public static final ynn p(View view, AndroidComposeView androidComposeView) {
        int[] iArr = men.i;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        androidComposeView.getLocationInWindow(iArr);
        float f2 = i - iArr[0];
        float f3 = i2 - iArr[1];
        return new ynn(f2, f3, view.getWidth() + f2, view.getHeight() + f3);
    }

    public static final void q(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                fob.a(th, th2);
            }
        }
    }

    public static final q1c r(a38 a38Var) {
        a38Var.getClass();
        String str = a38Var.a;
        String str2 = a38Var.c;
        if (str.equals("authorization_reject")) {
            return q1c.k;
        }
        if (str.equals("expired_card")) {
            return q1c.g;
        }
        if (str.equals("not_enough_funds")) {
            return q1c.j;
        }
        if (str.equals("fail_3ds") || (str.equals("error") && Intrinsics.d(a38Var.b, "technical_error") && Intrinsics.d(a38Var.d, "failed"))) {
            return q1c.f;
        }
        if (str.equals("invalid_processing_request")) {
            return q1c.h;
        }
        if (str.equals("limit_exceeded")) {
            return q1c.i;
        }
        if (str.equals("payment_timeout")) {
            return q1c.n;
        }
        if (str.equals("promocode_already_used")) {
            return q1c.o;
        }
        if (str.equals("restricted_card")) {
            return q1c.p;
        }
        if (str.equals("payment_gateway_technical_error")) {
            return q1c.m;
        }
        if (str.equals("transaction_not_permitted")) {
            return q1c.q;
        }
        if (str.equals("user_cancelled")) {
            return q1c.r;
        }
        if (str.equals("operation_cancelled")) {
            return q1c.l;
        }
        if (str.equals("need_to_unbind_sbp_token")) {
            return q1c.z;
        }
        if (str.equals("bindgin_sbp_token_duplicate")) {
            return q1c.A;
        }
        if (str.equals("too_many_cards") || (str2 != null && str2.equals("too_many_cards"))) {
            return q1c.u;
        }
        if (str.equals("failed")) {
            if (Intrinsics.d(str2, "verification failed, wrong_guess")) {
                return q1c.x;
            }
            if (str2 != null ? c.v(str2, "verification failed", false) : false) {
                return q1c.y;
            }
        }
        return q1c.a;
    }

    public static final void s(jpa jpaVar, xod xodVar) {
        xodVar.c(jpaVar.q0().s(), (xod) jpaVar.q0().c);
    }

    public static final long t(long j) {
        long j2 = (j << 1) + 1;
        msa msaVar = nsa.b;
        int i = qsa.a;
        return j2;
    }

    public static final long u(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? t(yhn.f(j, -4611686018427387903L, 4611686018427387903L)) : v(j * 1000000);
    }

    public static final long v(long j) {
        long j2 = j << 1;
        msa msaVar = nsa.b;
        int i = qsa.a;
        return j2;
    }

    public static final boolean w(r7w r7wVar) {
        r7wVar.getClass();
        return ((q1c) (r7wVar instanceof p1c ? ((p1c) r7wVar).a() : new dn9(q1c.a, r1c.a, (Integer) null, (String) null, r7wVar.getMessage())).b) == q1c.w;
    }

    public static final int x(cz0 cz0Var, Object obj, int i) {
        int i2 = cz0Var.c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int x = u2x.x(i2, i, cz0Var.a);
            if (x < 0 || Intrinsics.d(obj, cz0Var.b[x])) {
                return x;
            }
            int i3 = x + 1;
            while (i3 < i2 && cz0Var.a[i3] == i) {
                if (Intrinsics.d(obj, cz0Var.b[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = x - 1; i4 >= 0 && cz0Var.a[i4] == i; i4--) {
                if (Intrinsics.d(obj, cz0Var.b[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            xq0.i();
            return 0;
        }
    }

    public static Intent y(Context context, odb odbVar) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) EntryScreenActivity.class);
        intent.putExtra("entry_type", odbVar);
        if (odbVar instanceof ndb) {
            return intent;
        }
        if (odbVar instanceof mdb) {
            intent.setFlags(268468224);
            return intent;
        }
        b6e.s();
        return null;
    }

    public static final boolean z(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[11];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[14];
        float f17 = fArr[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (f23 * f24) + (((f21 * f26) + ((f20 * f27) + ((f18 * f29) - (f19 * f28)))) - (f22 * f25));
        if (f30 != 0.0f) {
            float f31 = 1.0f / f30;
            fArr2[0] = ((f9 * f27) + ((f7 * f29) - (f8 * f28))) * f31;
            fArr2[1] = (((f4 * f28) + ((-f3) * f29)) - (f5 * f27)) * f31;
            fArr2[2] = ((f17 * f21) + ((f15 * f23) - (f16 * f22))) * f31;
            fArr2[3] = (((f12 * f22) + ((-f11) * f23)) - (f13 * f21)) * f31;
            float f32 = -f6;
            fArr2[4] = (((f8 * f26) + (f32 * f29)) - (f9 * f25)) * f31;
            fArr2[5] = ((f5 * f25) + ((f29 * f2) - (f4 * f26))) * f31;
            float f33 = -f14;
            fArr2[6] = (((f16 * f20) + (f33 * f23)) - (f17 * f19)) * f31;
            fArr2[7] = ((f13 * f19) + ((f23 * f10) - (f12 * f20))) * f31;
            fArr2[8] = ((f9 * f24) + ((f6 * f28) - (f7 * f26))) * f31;
            fArr2[9] = (((f26 * f3) + ((-f2) * f28)) - (f5 * f24)) * f31;
            fArr2[10] = ((f17 * f18) + ((f14 * f22) - (f15 * f20))) * f31;
            fArr2[11] = (((f20 * f11) + ((-f10) * f22)) - (f13 * f18)) * f31;
            fArr2[12] = (((f7 * f25) + (f32 * f27)) - (f8 * f24)) * f31;
            fArr2[13] = ((f4 * f24) + ((f2 * f27) - (f3 * f25))) * f31;
            fArr2[14] = (((f15 * f19) + (f33 * f21)) - (f16 * f18)) * f31;
            fArr2[15] = ((f12 * f18) + ((f10 * f21) - (f11 * f19))) * f31;
        }
        return !(f30 == 0.0f);
    }
}
