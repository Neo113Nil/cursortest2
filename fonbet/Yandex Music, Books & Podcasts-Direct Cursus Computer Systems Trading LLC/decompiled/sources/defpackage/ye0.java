package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.view.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class ye0 extends a {
    public static final roi P;
    public boolean A;
    public ve0 B;
    public soi C;
    public final toi D;
    public final qoi E;
    public final qoi F;
    public final String G;
    public final String H;
    public final yks I;
    public final soi J;
    public rfp K;
    public boolean L;
    public final he0 M;
    public final ArrayList N;
    public final xe0 O;
    public final AndroidComposeView d;
    public int e = Integer.MIN_VALUE;
    public final xe0 f = new xe0(this, 0);
    public final AccessibilityManager g;
    public long h;
    public final te0 i;
    public final gb j;
    public List k;
    public final Handler l;
    public final ue0 m;
    public int n;
    public int o;
    public vb p;
    public vb q;
    public boolean r;
    public final soi s;
    public final soi t;
    public final q4r u;
    public final q4r v;
    public int w;
    public Integer x;
    public final cz0 y;
    public final zi3 z;

    static {
        int[] iArr = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        roi roiVar = spe.a;
        roi roiVar2 = new roi(32);
        int i = roiVar2.b;
        if (i < 0) {
            e7o.o("");
            return;
        }
        int i2 = i + 32;
        roiVar2.b(i2);
        int[] iArr2 = roiVar2.a;
        int i3 = roiVar2.b;
        if (i != i3) {
            uz0.e(i2, i, i3, iArr2, iArr2);
        }
        uz0.h(i, 0, 12, iArr, iArr2);
        roiVar2.b += 32;
        P = roiVar2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [te0] */
    public ye0(AndroidComposeView androidComposeView) {
        this.d = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        systemService.getClass();
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.g = accessibilityManager;
        this.h = 100L;
        this.i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: te0
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                ye0 ye0Var = ye0.this;
                ye0Var.k = z ? ye0Var.g.getEnabledAccessibilityServiceList(-1) : c5b.a;
            }
        };
        this.j = new gb(1, this);
        this.k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.l = new Handler(Looper.getMainLooper());
        this.m = new ue0(this, 0);
        this.n = Integer.MIN_VALUE;
        this.o = Integer.MIN_VALUE;
        this.s = new soi();
        this.t = new soi();
        this.u = new q4r(0);
        this.v = new q4r(0);
        this.w = -1;
        this.y = new cz0(0);
        this.z = men.g(1, 6, null);
        this.A = true;
        soi soiVar = vpe.a;
        soiVar.getClass();
        this.C = soiVar;
        this.D = new toi();
        this.E = new qoi();
        this.F = new qoi();
        this.G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.I = new yks(3);
        this.J = new soi();
        this.K = new rfp(androidComposeView.getSemanticsOwner().a(), soiVar);
        androidComposeView.addOnAttachStateChangeListener(new jb(2, this));
        int i = 1;
        this.M = new he0(i, this);
        this.N = new ArrayList();
        this.O = new xe0(this, i);
    }

    public static /* synthetic */ void D(ye0 ye0Var, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        ye0Var.C(i, i2, num, null);
    }

    public static CharSequence K(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                CharSequence subSequence = charSequence.subSequence(0, i);
                subSequence.getClass();
                return subSequence;
            }
        }
        return charSequence;
    }

    public static String t(qfp qfpVar) {
        mn0 mn0Var;
        if (qfpVar != null) {
            jfp jfpVar = qfpVar.d;
            tpi tpiVar = jfpVar.a;
            xfp xfpVar = ufp.a;
            if (tpiVar.c(xfpVar)) {
                return lag.b((List) jfpVar.g(xfpVar), StringUtils.COMMA, null, 62);
            }
            xfp xfpVar2 = ufp.D;
            if (tpiVar.c(xfpVar2)) {
                Object g = tpiVar.g(xfpVar2);
                if (g == null) {
                    g = null;
                }
                mn0 mn0Var2 = (mn0) g;
                if (mn0Var2 != null) {
                    return mn0Var2.b;
                }
            } else {
                Object g2 = tpiVar.g(ufp.z);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                if (list != null && (mn0Var = (mn0) CollectionsKt.firstOrNull(list)) != null) {
                    return mn0Var.b;
                }
            }
        }
        return null;
    }

    public static final boolean w(cwo cwoVar, float f) {
        Function0 function0 = cwoVar.a;
        if (f >= 0.0f || ((Number) function0.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) function0.invoke()).floatValue() < ((Number) cwoVar.b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean x(cwo cwoVar) {
        Function0 function0 = cwoVar.a;
        boolean z = cwoVar.c;
        if (((Number) function0.invoke()).floatValue() <= 0.0f || z) {
            return ((Number) function0.invoke()).floatValue() < ((Number) cwoVar.b.invoke()).floatValue() && z;
        }
        return true;
    }

    public static final boolean y(cwo cwoVar) {
        Function0 function0 = cwoVar.a;
        boolean z = cwoVar.c;
        if (((Number) function0.invoke()).floatValue() >= ((Number) cwoVar.b.invoke()).floatValue() || z) {
            return ((Number) function0.invoke()).floatValue() > 0.0f && z;
        }
        return true;
    }

    public final void A(qfp qfpVar, rfp rfpVar) {
        int[] iArr = gqe.a;
        toi toiVar = new toi();
        List h = qfp.h(4, qfpVar);
        mpf mpfVar = qfpVar.c;
        int size = h.size();
        for (int i = 0; i < size; i++) {
            qfp qfpVar2 = (qfp) h.get(i);
            upe s = s();
            int i2 = qfpVar2.g;
            if (s.a(i2)) {
                if (!rfpVar.b.b(i2)) {
                    v(mpfVar);
                    return;
                }
                toiVar.a(i2);
            }
        }
        toi toiVar2 = rfpVar.b;
        int[] iArr2 = toiVar2.b;
        long[] jArr = toiVar2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128 && !toiVar.b(iArr2[(i3 << 3) + i5])) {
                            v(mpfVar);
                            return;
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List h2 = qfp.h(4, qfpVar);
        int size2 = h2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            qfp qfpVar3 = (qfp) h2.get(i6);
            if (s().a(qfpVar3.g)) {
                Object b = this.J.b(qfpVar3.g);
                b.getClass();
                A(qfpVar3, (rfp) b);
            }
        }
    }

    public final boolean B(AccessibilityEvent accessibilityEvent) {
        if (!u()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.r = true;
        }
        try {
            return ((Boolean) this.f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.r = false;
        }
    }

    public final boolean C(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !u()) {
            return false;
        }
        AccessibilityEvent o = o(i, i2);
        if (num != null) {
            o.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            o.setContentDescription(lag.b(list, StringUtils.COMMA, null, 62));
        }
        return B(o);
    }

    public final void E(int i, int i2, String str) {
        AccessibilityEvent o = o(z(i), 32);
        o.setContentChangeTypes(i2);
        if (str != null) {
            o.getText().add(str);
        }
        B(o);
    }

    public final void F(int i) {
        ve0 ve0Var = this.B;
        if (ve0Var != null) {
            qfp qfpVar = ve0Var.a;
            if (i != qfpVar.g) {
                return;
            }
            if (SystemClock.uptimeMillis() - ve0Var.f <= 1000) {
                AccessibilityEvent o = o(z(qfpVar.g), SQLiteDatabase.OPEN_SHAREDCACHE);
                o.setFromIndex(ve0Var.d);
                o.setToIndex(ve0Var.e);
                o.setAction(ve0Var.b);
                o.setMovementGranularity(ve0Var.c);
                o.getText().add(t(qfpVar));
                B(o);
            }
        }
        this.B = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x04f5, code lost:
    
        if (r1.containsAll(r4) != false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x04f8, code lost:
    
        r37 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0508, code lost:
    
        if (r1.isEmpty() == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0536, code lost:
    
        if (r5 != null) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x053b, code lost:
    
        if (r5 == null) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0540, code lost:
    
        if (r1 != false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0108, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r1, r13) != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(upe upeVar) {
        Integer num;
        ArrayList arrayList;
        int[] iArr;
        long[] jArr;
        Integer num2;
        int i;
        int i2;
        Integer num3;
        ArrayList arrayList2;
        int[] iArr2;
        long[] jArr2;
        int i3;
        int i4;
        int i5;
        Integer num4;
        jfp jfpVar;
        qfp qfpVar;
        int i6;
        boolean z;
        boolean z2;
        tpi tpiVar;
        mpf mpfVar;
        int i7;
        jfp jfpVar2;
        Integer num5;
        ArrayList arrayList3;
        long j;
        int i8;
        mpf mpfVar2;
        Integer num6;
        int i9;
        tpi tpiVar2;
        int i10;
        boolean z3;
        boolean z4;
        int i11;
        String str;
        Integer num7;
        int i12;
        int i13;
        int i14;
        Integer num8;
        AccessibilityEvent p;
        mpf mpfVar3;
        Object obj;
        upe upeVar2 = upeVar;
        Integer num9 = 64;
        ArrayList arrayList4 = this.N;
        ArrayList arrayList5 = new ArrayList(arrayList4);
        arrayList4.clear();
        int[] iArr3 = upeVar2.b;
        long[] jArr3 = upeVar2.a;
        int i15 = 2;
        int length = jArr3.length - 2;
        int i16 = 0;
        Integer num10 = 0;
        if (length < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j2 = jArr3[i17];
            int i18 = i15;
            int i19 = length;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i20 = 8;
                int i21 = 8 - ((~(i17 - i19)) >>> 31);
                long j3 = j2;
                int i22 = i16;
                while (i22 < i21) {
                    if ((j3 & 255) < 128) {
                        int i23 = iArr3[(i17 << 3) + i22];
                        rfp rfpVar = (rfp) this.J.b(i23);
                        if (rfpVar != null) {
                            jfp jfpVar3 = rfpVar.a;
                            tpi tpiVar3 = jfpVar3.a;
                            sfp sfpVar = (sfp) upeVar2.b(i23);
                            int i24 = i20;
                            qfp qfpVar2 = sfpVar != null ? sfpVar.a : null;
                            if (qfpVar2 == null) {
                                throw ouj.f("no value for specified key");
                            }
                            mpf mpfVar4 = qfpVar2.c;
                            jfp jfpVar4 = qfpVar2.d;
                            iArr2 = iArr3;
                            int i25 = qfpVar2.g;
                            jArr2 = jArr3;
                            tpi tpiVar4 = jfpVar4.a;
                            i5 = i17;
                            Object[] objArr = tpiVar4.b;
                            Object[] objArr2 = tpiVar4.c;
                            long[] jArr4 = tpiVar4.a;
                            i2 = i22;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                mpf mpfVar5 = mpfVar4;
                                i4 = i21;
                                int i26 = 0;
                                z = false;
                                while (true) {
                                    long j4 = jArr4[i26];
                                    qfpVar = qfpVar2;
                                    int i27 = i26;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i28 = 8 - ((~(i27 - length2)) >>> 31);
                                        int i29 = 0;
                                        while (i29 < i28) {
                                            if ((j4 & 255) < 128) {
                                                int i30 = (i27 << 3) + i29;
                                                Object obj2 = objArr[i30];
                                                int i31 = length2;
                                                Object obj3 = objArr2[i30];
                                                jfpVar2 = jfpVar3;
                                                xfp xfpVar = (xfp) obj2;
                                                j = j4;
                                                xfp xfpVar2 = ufp.s;
                                                if (Intrinsics.d(xfpVar, xfpVar2) || Intrinsics.d(xfpVar, ufp.t)) {
                                                    qwo d0 = bkp.d0(arrayList5, i23);
                                                    if (d0 != null) {
                                                        z3 = false;
                                                    } else {
                                                        d0 = new qwo(arrayList4, i23);
                                                        z3 = true;
                                                    }
                                                    arrayList4.add(d0);
                                                } else {
                                                    z3 = false;
                                                }
                                                if (!z3) {
                                                    Object g = tpiVar3.g(xfpVar);
                                                    if (g == null) {
                                                        g = null;
                                                    }
                                                }
                                                xfp xfpVar3 = ufp.d;
                                                if (Intrinsics.d(xfpVar, xfpVar3)) {
                                                    obj3.getClass();
                                                    String str2 = (String) obj3;
                                                    if (tpiVar3.c(xfpVar3)) {
                                                        E(i23, i24, str2);
                                                    }
                                                } else {
                                                    if (Intrinsics.d(xfpVar, ufp.b) ? true : Intrinsics.d(xfpVar, ufp.H)) {
                                                        D(this, z(i23), 2048, num9, 8);
                                                        D(this, z(i23), 2048, num10, 8);
                                                    } else {
                                                        arrayList3 = arrayList5;
                                                        if (Intrinsics.d(xfpVar, ufp.c)) {
                                                            D(this, z(i23), 2048, num9, 8);
                                                            D(this, z(i23), 2048, num10, 8);
                                                            num6 = num10;
                                                            tpiVar2 = tpiVar3;
                                                            num5 = num9;
                                                            i8 = i29;
                                                            mpfVar2 = mpfVar5;
                                                            i10 = i31;
                                                        } else {
                                                            xfp xfpVar4 = ufp.G;
                                                            if (Intrinsics.d(xfpVar, xfpVar4)) {
                                                                Object g2 = tpiVar4.g(ufp.w);
                                                                if (g2 == null) {
                                                                    g2 = null;
                                                                }
                                                                meo meoVar = (meo) g2;
                                                                if (meoVar != null && meoVar.a == 4) {
                                                                    Object g3 = tpiVar4.g(xfpVar4);
                                                                    if (g3 == null) {
                                                                        g3 = null;
                                                                    }
                                                                    if (Intrinsics.d(g3, Boolean.TRUE)) {
                                                                        AccessibilityEvent o = o(z(i23), 4);
                                                                        mpf mpfVar6 = mpfVar5;
                                                                        qfp qfpVar3 = new qfp(qfpVar.a, true, mpfVar6, jfpVar4);
                                                                        Object g4 = qfpVar3.i().a.g(ufp.a);
                                                                        if (g4 == null) {
                                                                            g4 = null;
                                                                        }
                                                                        List list = (List) g4;
                                                                        mpfVar3 = mpfVar6;
                                                                        String b = list != null ? lag.b(list, StringUtils.COMMA, null, 62) : null;
                                                                        Object g5 = qfpVar3.i().a.g(ufp.z);
                                                                        if (g5 == null) {
                                                                            g5 = null;
                                                                        }
                                                                        List list2 = (List) g5;
                                                                        i8 = i29;
                                                                        obj = null;
                                                                        String b2 = list2 != null ? lag.b(list2, StringUtils.COMMA, null, 62) : null;
                                                                        if (b != null) {
                                                                            o.setContentDescription(b);
                                                                        }
                                                                        if (b2 != null) {
                                                                            o.getText().add(b2);
                                                                        }
                                                                        B(o);
                                                                    } else {
                                                                        i8 = i29;
                                                                        mpfVar3 = mpfVar5;
                                                                        obj = null;
                                                                        D(this, z(i23), 2048, num10, 8);
                                                                    }
                                                                } else {
                                                                    i8 = i29;
                                                                    mpfVar3 = mpfVar5;
                                                                    obj = null;
                                                                    D(this, z(i23), 2048, num9, 8);
                                                                    D(this, z(i23), 2048, num10, 8);
                                                                }
                                                                num6 = num10;
                                                                tpiVar2 = tpiVar3;
                                                                num5 = num9;
                                                                i10 = i31;
                                                                mpfVar2 = mpfVar3;
                                                            } else {
                                                                i8 = i29;
                                                                mpfVar2 = mpfVar5;
                                                                if (Intrinsics.d(xfpVar, ufp.a)) {
                                                                    int z5 = z(i23);
                                                                    obj3.getClass();
                                                                    C(z5, 2048, 4, (List) obj3);
                                                                    num6 = num10;
                                                                    tpiVar2 = tpiVar3;
                                                                    num5 = num9;
                                                                    i10 = i31;
                                                                } else {
                                                                    xfp xfpVar5 = ufp.D;
                                                                    String str3 = "";
                                                                    if (Intrinsics.d(xfpVar, xfpVar5)) {
                                                                        if (tpiVar4.c(hfp.j)) {
                                                                            Object g6 = tpiVar3.g(xfpVar5);
                                                                            if (g6 == null) {
                                                                                g6 = null;
                                                                            }
                                                                            mn0 mn0Var = (mn0) g6;
                                                                            if (mn0Var == null) {
                                                                                mn0Var = "";
                                                                            }
                                                                            Object g7 = tpiVar4.g(xfpVar5);
                                                                            if (g7 == null) {
                                                                                g7 = null;
                                                                            }
                                                                            CharSequence charSequence = (mn0) g7;
                                                                            if (charSequence == null) {
                                                                                charSequence = "";
                                                                            }
                                                                            CharSequence K = K(charSequence);
                                                                            int length3 = mn0Var.length();
                                                                            int length4 = charSequence.length();
                                                                            Integer num11 = num10;
                                                                            int i32 = length3 > length4 ? length4 : length3;
                                                                            num5 = num9;
                                                                            int i33 = 0;
                                                                            while (true) {
                                                                                i12 = i32;
                                                                                if (i33 >= i32) {
                                                                                    i13 = length3;
                                                                                    break;
                                                                                }
                                                                                i13 = length3;
                                                                                if (mn0Var.charAt(i33) != charSequence.charAt(i33)) {
                                                                                    break;
                                                                                }
                                                                                i33++;
                                                                                i32 = i12;
                                                                                length3 = i13;
                                                                            }
                                                                            int i34 = 0;
                                                                            while (true) {
                                                                                if (i34 >= i12 - i33) {
                                                                                    i14 = i34;
                                                                                    break;
                                                                                }
                                                                                i14 = i34;
                                                                                if (mn0Var.charAt((i13 - 1) - i34) != charSequence.charAt((length4 - 1) - i14)) {
                                                                                    break;
                                                                                } else {
                                                                                    i34 = i14 + 1;
                                                                                }
                                                                            }
                                                                            int i35 = (i13 - i14) - i33;
                                                                            int i36 = (length4 - i14) - i33;
                                                                            xfp xfpVar6 = ufp.I;
                                                                            boolean c = tpiVar3.c(xfpVar6);
                                                                            boolean c2 = tpiVar4.c(xfpVar6);
                                                                            boolean c3 = tpiVar3.c(ufp.D);
                                                                            boolean z6 = c3 && !c && c2;
                                                                            boolean z7 = c3 && c && !c2;
                                                                            if (z6 || z7) {
                                                                                i9 = i23;
                                                                                tpiVar2 = tpiVar3;
                                                                                num8 = num11;
                                                                                p = p(z(i23), num8, num11, Integer.valueOf(length4), K);
                                                                            } else {
                                                                                AccessibilityEvent o2 = o(z(i23), 16);
                                                                                o2.setFromIndex(i33);
                                                                                o2.setRemovedCount(i35);
                                                                                o2.setAddedCount(i36);
                                                                                o2.setBeforeText(mn0Var);
                                                                                o2.getText().add(K);
                                                                                p = o2;
                                                                                i9 = i23;
                                                                                tpiVar2 = tpiVar3;
                                                                                num8 = num11;
                                                                            }
                                                                            p.setClassName("android.widget.EditText");
                                                                            B(p);
                                                                            if (z6 || z7) {
                                                                                long j5 = ((rds) jfpVar4.g(ufp.E)).a;
                                                                                num7 = num8;
                                                                                p.setFromIndex((int) (j5 >> 32));
                                                                                p.setToIndex((int) (j5 & 4294967295L));
                                                                                B(p);
                                                                            } else {
                                                                                num6 = num8;
                                                                                i10 = i31;
                                                                            }
                                                                        } else {
                                                                            num7 = num10;
                                                                            tpiVar2 = tpiVar3;
                                                                            num5 = num9;
                                                                            i9 = i23;
                                                                            D(this, z(i9), 2048, Integer.valueOf(i18), 8);
                                                                        }
                                                                        i10 = i31;
                                                                        num6 = num7;
                                                                    } else {
                                                                        Integer num12 = num10;
                                                                        tpiVar2 = tpiVar3;
                                                                        num5 = num9;
                                                                        i9 = i23;
                                                                        xfp xfpVar7 = ufp.E;
                                                                        if (Intrinsics.d(xfpVar, xfpVar7)) {
                                                                            Object g8 = tpiVar4.g(xfpVar5);
                                                                            if (g8 == null) {
                                                                                g8 = null;
                                                                            }
                                                                            mn0 mn0Var2 = (mn0) g8;
                                                                            if (mn0Var2 != null && (str = mn0Var2.b) != null) {
                                                                                str3 = str;
                                                                            }
                                                                            long j6 = ((rds) jfpVar4.g(xfpVar7)).a;
                                                                            num6 = num12;
                                                                            B(p(z(i9), Integer.valueOf((int) (j6 >> 32)), Integer.valueOf((int) (j6 & 4294967295L)), Integer.valueOf(str3.length()), K(str3)));
                                                                            F(i25);
                                                                            i10 = i31;
                                                                        } else {
                                                                            i10 = i31;
                                                                            num6 = num12;
                                                                            if (Intrinsics.d(xfpVar, xfpVar2) ? true : Intrinsics.d(xfpVar, ufp.t)) {
                                                                                v(mpfVar2);
                                                                                qwo d02 = bkp.d0(arrayList4, i9);
                                                                                d02.getClass();
                                                                                Object g9 = tpiVar4.g(xfpVar2);
                                                                                if (g9 == null) {
                                                                                    g9 = null;
                                                                                }
                                                                                d02.e = (cwo) g9;
                                                                                Object g10 = tpiVar4.g(ufp.t);
                                                                                if (g10 == null) {
                                                                                    g10 = null;
                                                                                }
                                                                                d02.f = (cwo) g10;
                                                                                if (d02.b.contains(d02)) {
                                                                                    this.d.getSnapshotObserver().a(d02, this.O, new ha0(5, d02, this));
                                                                                }
                                                                            } else if (Intrinsics.d(xfpVar, ufp.k)) {
                                                                                obj3.getClass();
                                                                                if (((Boolean) obj3).booleanValue()) {
                                                                                    i11 = 8;
                                                                                    B(o(z(i25), 8));
                                                                                } else {
                                                                                    i11 = 8;
                                                                                }
                                                                                D(this, z(i25), 2048, num6, i11);
                                                                            } else {
                                                                                xfp xfpVar8 = hfp.w;
                                                                                if (Intrinsics.d(xfpVar, xfpVar8)) {
                                                                                    List list3 = (List) jfpVar4.g(xfpVar8);
                                                                                    Object g11 = tpiVar2.g(xfpVar8);
                                                                                    if (g11 == null) {
                                                                                        g11 = null;
                                                                                    }
                                                                                    List list4 = (List) g11;
                                                                                    if (list4 != null) {
                                                                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                                        int size = list3.size();
                                                                                        int i37 = 0;
                                                                                        while (i37 < size) {
                                                                                            linkedHashSet.add(((nw6) list3.get(i37)).a);
                                                                                            i37++;
                                                                                            list3 = list3;
                                                                                        }
                                                                                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                                        int size2 = list4.size();
                                                                                        int i38 = 0;
                                                                                        while (i38 < size2) {
                                                                                            linkedHashSet2.add(((nw6) list4.get(i38)).a);
                                                                                            i38++;
                                                                                            list4 = list4;
                                                                                        }
                                                                                        if (linkedHashSet.containsAll(linkedHashSet2)) {
                                                                                        }
                                                                                    }
                                                                                    z = true;
                                                                                } else {
                                                                                    if (obj3 instanceof sa) {
                                                                                        sa saVar = (sa) obj3;
                                                                                        Object g12 = tpiVar2.g(xfpVar);
                                                                                        if (g12 == null) {
                                                                                            g12 = null;
                                                                                        }
                                                                                        Comparator[] comparatorArr = bf0.a;
                                                                                        if (saVar != g12) {
                                                                                            if (g12 instanceof sa) {
                                                                                                String str4 = saVar.a;
                                                                                                sa saVar2 = (sa) g12;
                                                                                                syc sycVar = saVar2.b;
                                                                                                if (Intrinsics.d(str4, saVar2.a)) {
                                                                                                    syc sycVar2 = saVar.b;
                                                                                                    if (sycVar2 == null) {
                                                                                                    }
                                                                                                    if (sycVar2 != null) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            z4 = false;
                                                                                        }
                                                                                        z4 = true;
                                                                                    }
                                                                                    z = true;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        i9 = i23;
                                                    }
                                                }
                                                tpiVar2 = tpiVar3;
                                                num5 = num9;
                                                arrayList3 = arrayList5;
                                                i8 = i29;
                                                mpfVar2 = mpfVar5;
                                                num6 = num10;
                                                i9 = i23;
                                                i10 = i31;
                                            } else {
                                                jfpVar2 = jfpVar3;
                                                num5 = num9;
                                                arrayList3 = arrayList5;
                                                j = j4;
                                                i8 = i29;
                                                mpfVar2 = mpfVar5;
                                                num6 = num10;
                                                i9 = i23;
                                                tpiVar2 = tpiVar3;
                                                i10 = length2;
                                            }
                                            i24 = 8;
                                            i23 = i9;
                                            tpiVar3 = tpiVar2;
                                            mpfVar5 = mpfVar2;
                                            jfpVar3 = jfpVar2;
                                            j4 = j >> 8;
                                            num9 = num5;
                                            i29 = i8 + 1;
                                            length2 = i10;
                                            num10 = num6;
                                            arrayList5 = arrayList3;
                                        }
                                        jfpVar = jfpVar3;
                                        tpiVar = tpiVar3;
                                        num3 = num9;
                                        arrayList2 = arrayList5;
                                        mpfVar = mpfVar5;
                                        num4 = num10;
                                        i6 = i23;
                                        i7 = length2;
                                        if (i28 != i24) {
                                            break;
                                        }
                                    } else {
                                        jfpVar = jfpVar3;
                                        tpiVar = tpiVar3;
                                        num3 = num9;
                                        arrayList2 = arrayList5;
                                        mpfVar = mpfVar5;
                                        num4 = num10;
                                        i6 = i23;
                                        i7 = length2;
                                    }
                                    if (i27 == i7) {
                                        break;
                                    }
                                    i23 = i6;
                                    tpiVar3 = tpiVar;
                                    mpfVar5 = mpfVar;
                                    qfpVar2 = qfpVar;
                                    jfpVar3 = jfpVar;
                                    num9 = num3;
                                    i24 = 8;
                                    i26 = i27 + 1;
                                    length2 = i7;
                                    num10 = num4;
                                    arrayList5 = arrayList2;
                                }
                            } else {
                                jfpVar = jfpVar3;
                                num3 = num9;
                                arrayList2 = arrayList5;
                                i4 = i21;
                                qfpVar = qfpVar2;
                                num4 = num10;
                                i6 = i23;
                                z = false;
                            }
                            if (!z) {
                                Comparator[] comparatorArr2 = bf0.a;
                                Iterator it = jfpVar.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z2 = false;
                                        break;
                                    } else {
                                        if (!qfpVar.i().a.c((xfp) ((Map.Entry) it.next()).getKey())) {
                                            z2 = true;
                                            break;
                                        }
                                    }
                                }
                                z = z2;
                            }
                            if (z) {
                                i3 = 8;
                                D(this, z(i6), 2048, num4, 8);
                            } else {
                                i3 = 8;
                            }
                            j3 >>= i3;
                            i22 = i2 + 1;
                            upeVar2 = upeVar;
                            i20 = i3;
                            num10 = num4;
                            iArr3 = iArr2;
                            jArr3 = jArr2;
                            i17 = i5;
                            i21 = i4;
                            arrayList5 = arrayList2;
                            num9 = num3;
                        }
                    }
                    i2 = i22;
                    num3 = num9;
                    arrayList2 = arrayList5;
                    iArr2 = iArr3;
                    jArr2 = jArr3;
                    i3 = i20;
                    i4 = i21;
                    i5 = i17;
                    num4 = num10;
                    j3 >>= i3;
                    i22 = i2 + 1;
                    upeVar2 = upeVar;
                    i20 = i3;
                    num10 = num4;
                    iArr3 = iArr2;
                    jArr3 = jArr2;
                    i17 = i5;
                    i21 = i4;
                    arrayList5 = arrayList2;
                    num9 = num3;
                }
                num = num9;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                int i39 = i17;
                num2 = num10;
                if (i21 != i20) {
                    return;
                } else {
                    i = i39;
                }
            } else {
                num = num9;
                arrayList = arrayList5;
                iArr = iArr3;
                jArr = jArr3;
                num2 = num10;
                i = i17;
            }
            if (i == i19) {
                return;
            }
            i17 = i + 1;
            upeVar2 = upeVar;
            length = i19;
            num10 = num2;
            i15 = i18;
            iArr3 = iArr;
            jArr3 = jArr;
            arrayList5 = arrayList;
            num9 = num;
            i16 = 0;
        }
    }

    public final void H(mpf mpfVar, toi toiVar) {
        jfp w;
        if (mpfVar.G() && !this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(mpfVar)) {
            mpf mpfVar2 = null;
            if (!mpfVar.F.M(8)) {
                mpfVar = mpfVar.u();
                while (true) {
                    if (mpfVar == null) {
                        mpfVar = null;
                        break;
                    } else if (mpfVar.F.M(8)) {
                        break;
                    } else {
                        mpfVar = mpfVar.u();
                    }
                }
            }
            if (mpfVar == null || (w = mpfVar.w()) == null) {
                return;
            }
            if (!w.c) {
                mpf u = mpfVar.u();
                while (true) {
                    if (u != null) {
                        jfp w2 = u.w();
                        if (w2 != null && w2.c) {
                            mpfVar2 = u;
                            break;
                        }
                        u = u.u();
                    } else {
                        break;
                    }
                }
                if (mpfVar2 != null) {
                    mpfVar = mpfVar2;
                }
            }
            int i = mpfVar.b;
            if (toiVar.a(i)) {
                D(this, z(i), 2048, 1, 8);
            }
        }
    }

    public final void I(mpf mpfVar) {
        if (mpfVar.G() && !this.d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(mpfVar)) {
            int i = mpfVar.b;
            cwo cwoVar = (cwo) this.s.b(i);
            cwo cwoVar2 = (cwo) this.t.b(i);
            if (cwoVar == null && cwoVar2 == null) {
                return;
            }
            AccessibilityEvent o = o(i, 4096);
            if (cwoVar != null) {
                o.setScrollX((int) ((Number) cwoVar.a.invoke()).floatValue());
                o.setMaxScrollX((int) ((Number) cwoVar.b.invoke()).floatValue());
            }
            if (cwoVar2 != null) {
                o.setScrollY((int) ((Number) cwoVar2.a.invoke()).floatValue());
                o.setMaxScrollY((int) ((Number) cwoVar2.b.invoke()).floatValue());
            }
            B(o);
        }
    }

    public final boolean J(qfp qfpVar, int i, int i2, boolean z) {
        String t;
        jfp jfpVar = qfpVar.d;
        int i3 = qfpVar.g;
        xfp xfpVar = hfp.i;
        if (jfpVar.a.c(xfpVar) && bf0.a(qfpVar)) {
            pyc pycVar = (pyc) ((sa) qfpVar.d.g(xfpVar)).b;
            if (pycVar != null) {
                return ((Boolean) pycVar.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.w) && (t = t(qfpVar)) != null) {
            if (i < 0 || i != i2 || i2 > t.length()) {
                i = -1;
            }
            this.w = i;
            boolean z2 = t.length() > 0;
            B(p(z(i3), z2 ? Integer.valueOf(this.w) : null, z2 ? Integer.valueOf(this.w) : null, z2 ? Integer.valueOf(t.length()) : null, t));
            F(i3);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L() {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        int i2;
        int i3;
        char c2;
        toi toiVar = new toi();
        toi toiVar2 = this.D;
        int[] iArr = toiVar2.b;
        long[] jArr3 = toiVar2.a;
        int length = jArr3.length - 2;
        soi soiVar = this.J;
        int i4 = 8;
        if (length >= 0) {
            int i5 = 0;
            j = 128;
            j2 = 255;
            while (true) {
                long j5 = jArr3[i5];
                char c3 = 7;
                j3 = -9187201950435737472L;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j5 & 255) < 128) {
                            int i8 = iArr[(i5 << 3) + i7];
                            c2 = c3;
                            sfp sfpVar = (sfp) s().b(i8);
                            qfp qfpVar = sfpVar != null ? sfpVar.a : null;
                            if (qfpVar != null) {
                                if (qfpVar.d.a.c(ufp.d)) {
                                }
                            }
                            toiVar.a(i8);
                            rfp rfpVar = (rfp) soiVar.b(i8);
                            if (rfpVar != null) {
                                Object g = rfpVar.a.a.g(ufp.d);
                                r23 = g != 0 ? g : null;
                            }
                            E(i8, 32, r23);
                        } else {
                            c2 = c3;
                        }
                        j5 >>= 8;
                        i7++;
                        c3 = c2;
                    }
                    c = c3;
                    if (i6 != 8) {
                        break;
                    }
                } else {
                    c = 7;
                }
                if (i5 == length) {
                    break;
                } else {
                    i5++;
                }
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
        }
        int[] iArr2 = toiVar.b;
        long[] jArr4 = toiVar.a;
        int length2 = jArr4.length - 2;
        if (length2 >= 0) {
            int i9 = 0;
            while (true) {
                long j6 = jArr4[i9];
                if ((((~j6) << c) & j6 & j3) != j3) {
                    int i10 = 8 - ((~(i9 - length2)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j6 & j2) < j) {
                            int i12 = iArr2[(i9 << 3) + i11];
                            int hashCode = Integer.hashCode(i12) * (-862048943);
                            int i13 = hashCode ^ (hashCode << 16);
                            int i14 = i13 & 127;
                            int i15 = toiVar2.c;
                            int i16 = (i13 >>> 7) & i15;
                            i = i4;
                            int i17 = 0;
                            while (true) {
                                long[] jArr5 = toiVar2.a;
                                int i18 = i16 >> 3;
                                jArr2 = jArr4;
                                int i19 = (i16 & 7) << 3;
                                j4 = j6;
                                long j7 = (jArr5[i18] >>> i19) | ((jArr5[i18 + 1] << (64 - i19)) & ((-i19) >> 63));
                                int i20 = i15;
                                long j8 = (i14 * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & j3;
                                while (true) {
                                    if (j9 == 0) {
                                        break;
                                    }
                                    i3 = (i16 + (Long.numberOfTrailingZeros(j9) >> 3)) & i20;
                                    int i21 = i20;
                                    if (toiVar2.b[i3] == i12) {
                                        break;
                                    }
                                    j9 &= j9 - 1;
                                    i20 = i21;
                                }
                                i17 += 8;
                                i16 = (i16 + i17) & i2;
                                jArr4 = jArr2;
                                i15 = i2;
                                j6 = j4;
                            }
                            int i22 = i3;
                            if (i22 >= 0) {
                                toiVar2.f(i22);
                            }
                        } else {
                            jArr2 = jArr4;
                            j4 = j6;
                            i = i4;
                        }
                        j6 = j4 >> i;
                        i11++;
                        i4 = i;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    if (i10 != i4) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                }
                if (i9 == length2) {
                    break;
                }
                i9++;
                jArr4 = jArr;
                i4 = 8;
            }
        }
        soiVar.c();
        upe s = s();
        int[] iArr3 = s.b;
        Object[] objArr = s.c;
        long[] jArr6 = s.a;
        int length3 = jArr6.length - 2;
        if (length3 >= 0) {
            int i23 = 0;
            while (true) {
                long j10 = jArr6[i23];
                if ((((~j10) << c) & j10 & j3) != j3) {
                    int i24 = 8 - ((~(i23 - length3)) >>> 31);
                    for (int i25 = 0; i25 < i24; i25++) {
                        if ((j10 & j2) < j) {
                            int i26 = (i23 << 3) + i25;
                            int i27 = iArr3[i26];
                            qfp qfpVar2 = ((sfp) objArr[i26]).a;
                            jfp jfpVar = qfpVar2.d;
                            xfp xfpVar = ufp.d;
                            if (jfpVar.a.c(xfpVar) && toiVar2.a(i27)) {
                                E(i27, 16, (String) qfpVar2.d.g(xfpVar));
                            }
                            soiVar.h(i27, new rfp(qfpVar2, s()));
                        }
                        j10 >>= 8;
                    }
                    if (i24 != 8) {
                        break;
                    }
                }
                if (i23 == length3) {
                    break;
                } else {
                    i23++;
                }
            }
        }
        this.K = new rfp(this.d.getSemanticsOwner().a(), s());
    }

    @Override // androidx.core.view.a
    public final jzi b(View view) {
        return this.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(int i, vb vbVar, String str, Bundle bundle) {
        qfp qfpVar;
        int i2;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = vbVar.a;
        sfp sfpVar = (sfp) s().b(i);
        if (sfpVar == null || (qfpVar = sfpVar.a) == null) {
            return;
        }
        jfp jfpVar = qfpVar.d;
        tpi tpiVar = jfpVar.a;
        String t = t(qfpVar);
        if (Intrinsics.d(str, this.G)) {
            int d = this.E.d(i);
            if (d != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d);
                return;
            }
            return;
        }
        if (Intrinsics.d(str, this.H)) {
            int d2 = this.F.d(i);
            if (d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d2);
                return;
            }
            return;
        }
        f8j f8jVar = null;
        if (!tpiVar.c(hfp.a) || bundle == null || !Intrinsics.d(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            xfp xfpVar = ufp.x;
            if (!tpiVar.c(xfpVar) || bundle == null || !Intrinsics.d(str, "androidx.compose.ui.semantics.testTag")) {
                if (Intrinsics.d(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, qfpVar.g);
                    return;
                }
                return;
            } else {
                Object g = tpiVar.g(xfpVar);
                String str2 = (String) (g == null ? null : g);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i3 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i4 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i4 > 0 && i3 >= 0) {
            if (i3 < (t != null ? t.length() : Integer.MAX_VALUE)) {
                cds i0 = bkp.i0(jfpVar);
                if (i0 == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                int i5 = 0;
                while (i5 < i4) {
                    int i6 = i3 + i5;
                    if (i6 >= i0.a.a.b.length()) {
                        arrayList.add(f8jVar);
                        i2 = i5;
                    } else {
                        ynn b = i0.b(i6);
                        f8j c = qfpVar.c();
                        long j = 0;
                        if (c != null) {
                            if (!c.b1().n) {
                                c = f8jVar;
                            }
                            if (c != null) {
                                j = c.S(0L);
                            }
                        }
                        ynn l = b.l(j);
                        ynn e = qfpVar.e();
                        if ((l.j(e) ? l.h(e) : f8jVar) != 0) {
                            AndroidComposeView androidComposeView = this.d;
                            long t2 = androidComposeView.t((Float.floatToRawIntBits(r11.b) & 4294967295L) | (Float.floatToRawIntBits(r11.a) << 32));
                            i2 = i5;
                            long t3 = androidComposeView.t((Float.floatToRawIntBits(r11.d) & 4294967295L) | (Float.floatToRawIntBits(r11.c) << 32));
                            rectF = new RectF(Float.intBitsToFloat((int) (t2 >> 32)), Float.intBitsToFloat((int) (t2 & 4294967295L)), Float.intBitsToFloat((int) (t3 >> 32)), Float.intBitsToFloat((int) (t3 & 4294967295L)));
                        } else {
                            i2 = i5;
                            rectF = null;
                        }
                        arrayList.add(rectF);
                    }
                    i5 = i2 + 1;
                    f8jVar = null;
                }
                accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    public final Rect k(sfp sfpVar) {
        Rect rect = sfpVar.b;
        float f = rect.left;
        float f2 = rect.top;
        long floatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        AndroidComposeView androidComposeView = this.d;
        long t = androidComposeView.t(floatToRawIntBits);
        float f3 = rect.right;
        float f4 = rect.bottom;
        long t2 = androidComposeView.t((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        return new Rect((int) Math.floor(Float.intBitsToFloat((int) (t >> 32))), (int) Math.floor(Float.intBitsToFloat((int) (t & 4294967295L))), (int) Math.ceil(Float.intBitsToFloat((int) (t2 >> 32))), (int) Math.ceil(Float.intBitsToFloat((int) (t2 & 4294967295L))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f9, code lost:
    
        if (defpackage.y2x.o(r5, r2) == r3) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x0030, B:15:0x005e, B:21:0x0074, B:23:0x007c, B:26:0x0087, B:28:0x008d, B:30:0x009c, B:32:0x00a4, B:33:0x00c0, B:35:0x00cf, B:36:0x00dd, B:46:0x0047), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00f9 -> B:14:0x00fc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(cg6 cg6Var) {
        we0 we0Var;
        int i;
        ye0 ye0Var;
        toi toiVar;
        si3 si3Var;
        toi toiVar2;
        si3 si3Var2;
        Object c;
        try {
            if (cg6Var instanceof we0) {
                we0Var = (we0) cg6Var;
                int i2 = we0Var.o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    we0Var.o = i2 - Integer.MIN_VALUE;
                    Object obj = we0Var.m;
                    nm6 nm6Var = nm6.a;
                    i = we0Var.o;
                    int i3 = 1;
                    if (i != 0) {
                        qgg.h0(obj);
                        try {
                            toiVar = new toi();
                            zi3 zi3Var = this.z;
                            zi3Var.getClass();
                            si3Var = new si3(zi3Var);
                            ye0Var = this;
                            we0Var.j = ye0Var;
                            we0Var.k = toiVar;
                            we0Var.l = si3Var;
                            we0Var.o = i3;
                            c = si3Var.c(we0Var);
                            if (c != nm6Var) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            ye0Var = this;
                            ye0Var.y.clear();
                            throw th;
                        }
                    } else if (i == 1) {
                        si3Var2 = we0Var.l;
                        toiVar2 = we0Var.k;
                        ye0Var = we0Var.j;
                        qgg.h0(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        si3Var2 = we0Var.l;
                        toiVar2 = we0Var.k;
                        ye0Var = we0Var.j;
                        qgg.h0(obj);
                        char c2 = 2;
                        int i4 = 1;
                        toiVar = toiVar2;
                        i3 = i4;
                        si3Var = si3Var2;
                        we0Var.j = ye0Var;
                        we0Var.k = toiVar;
                        we0Var.l = si3Var;
                        we0Var.o = i3;
                        c = si3Var.c(we0Var);
                        if (c != nm6Var) {
                            return nm6Var;
                        }
                        si3 si3Var3 = si3Var;
                        toiVar2 = toiVar;
                        obj = c;
                        si3Var2 = si3Var3;
                        if (((Boolean) obj).booleanValue()) {
                            ye0Var.y.clear();
                            return Unit.a;
                        }
                        si3Var2.d();
                        boolean u = ye0Var.u();
                        cz0 cz0Var = ye0Var.y;
                        if (u) {
                            int i5 = cz0Var.c;
                            for (int i6 = 0; i6 < i5; i6++) {
                                mpf mpfVar = (mpf) cz0Var.b[i6];
                                ye0Var.H(mpfVar, toiVar2);
                                ye0Var.I(mpfVar);
                            }
                            toiVar2.d = 0;
                            long[] jArr = toiVar2.a;
                            if (jArr != vso.a) {
                                uz0.n(jArr, -9187201950435737472L);
                                long[] jArr2 = toiVar2.a;
                                int i7 = toiVar2.c;
                                int i8 = i7 >> 3;
                                long j = 255 << ((i7 & 7) << 3);
                                jArr2[i8] = ((~j) & jArr2[i8]) | j;
                            }
                            toiVar2.e = vso.a(toiVar2.c) - toiVar2.d;
                            if (ye0Var.L) {
                                i4 = 1;
                            } else {
                                i4 = 1;
                                ye0Var.L = true;
                                ye0Var.l.post(ye0Var.M);
                            }
                        } else {
                            i4 = i3;
                        }
                        cz0Var.clear();
                        ye0Var.s.c();
                        ye0Var.t.c();
                        long j2 = ye0Var.h;
                        we0Var.j = ye0Var;
                        we0Var.k = toiVar2;
                        we0Var.l = si3Var2;
                        c2 = 2;
                        we0Var.o = 2;
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        we0Var = new we0(this, cg6Var);
        Object obj2 = we0Var.m;
        nm6 nm6Var2 = nm6.a;
        i = we0Var.o;
        int i32 = 1;
    }

    public final boolean m(int i, long j, boolean z) {
        xfp xfpVar;
        int i2;
        if (!Intrinsics.d(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        upe s = s();
        if (enj.c(j, 9205357640488583168L) || (((9223372034707292159L & j) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (z) {
            xfpVar = ufp.t;
        } else {
            if (z) {
                b6e.s();
                return false;
            }
            xfpVar = ufp.s;
        }
        Object[] objArr = s.c;
        long[] jArr = s.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j2 & 255) < 128) {
                        sfp sfpVar = (sfp) objArr[(i3 << 3) + i6];
                        if (uwf.F(sfpVar.b).a(j)) {
                            Object g = sfpVar.a.d.a.g(xfpVar);
                            if (g == null) {
                                g = null;
                            }
                            cwo cwoVar = (cwo) g;
                            if (cwoVar != null) {
                                boolean z3 = cwoVar.c;
                                i2 = i4;
                                int i7 = z3 ? -i : i;
                                if (i == 0 && z3) {
                                    i7 = -1;
                                }
                                Function0 function0 = cwoVar.a;
                                if (i7 < 0) {
                                    if (((Number) function0.invoke()).floatValue() <= 0.0f) {
                                    }
                                    z2 = true;
                                } else {
                                    if (((Number) function0.invoke()).floatValue() >= ((Number) cwoVar.b.invoke()).floatValue()) {
                                    }
                                    z2 = true;
                                }
                            }
                        }
                        i2 = i4;
                    } else {
                        i2 = i4;
                    }
                    j2 >>= i2;
                    i6++;
                    i4 = i2;
                }
                if (i5 != i4) {
                    return z2;
                }
            }
            if (i3 == length) {
                return z2;
            }
            i3++;
        }
    }

    public final void n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (u()) {
                A(this.d.getSemanticsOwner().a(), this.K);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                G(s());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    L();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent o(int i, int i2) {
        sfp sfpVar;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.d;
        obtain.setPackageName(androidComposeView.getContext().getPackageName());
        obtain.setSource(androidComposeView, i);
        if (u() && (sfpVar = (sfp) s().b(i)) != null) {
            obtain.setPassword(sfpVar.a.d.a.c(ufp.I));
        }
        return obtain;
    }

    public final AccessibilityEvent p(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent o = o(i, RemoteCameraConfig.Notification.ID);
        if (num != null) {
            o.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            o.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            o.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            o.getText().add(charSequence);
        }
        return o;
    }

    public final int q(qfp qfpVar) {
        jfp jfpVar = qfpVar.d;
        if (!jfpVar.a.c(ufp.a)) {
            xfp xfpVar = ufp.E;
            if (jfpVar.a.c(xfpVar)) {
                return (int) (((rds) jfpVar.g(xfpVar)).a & 4294967295L);
            }
        }
        return this.w;
    }

    public final int r(qfp qfpVar) {
        jfp jfpVar = qfpVar.d;
        if (!jfpVar.a.c(ufp.a)) {
            xfp xfpVar = ufp.E;
            if (jfpVar.a.c(xfpVar)) {
                return (int) (((rds) jfpVar.g(xfpVar)).a >> 32);
            }
        }
        return this.w;
    }

    public final upe s() {
        if (this.A) {
            this.A = false;
            AndroidComposeView androidComposeView = this.d;
            this.C = bkp.e0(androidComposeView.getSemanticsOwner());
            if (u()) {
                soi soiVar = this.C;
                Resources resources = androidComposeView.getContext().getResources();
                Comparator[] comparatorArr = bf0.a;
                qoi qoiVar = this.E;
                qoiVar.a();
                qoi qoiVar2 = this.F;
                qoiVar2.a();
                sfp sfpVar = (sfp) soiVar.b(-1);
                qfp qfpVar = sfpVar != null ? sfpVar.a : null;
                qfpVar.getClass();
                ArrayList h = bf0.h(bf0.f(qfpVar), t75.c(qfpVar), soiVar, resources);
                int i = 1;
                int size = h.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((qfp) h.get(i - 1)).g;
                        int i3 = ((qfp) h.get(i)).g;
                        qoiVar.f(i2, i3);
                        qoiVar2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.C;
    }

    public final boolean u() {
        return this.g.isEnabled() && !this.k.isEmpty();
    }

    public final void v(mpf mpfVar) {
        if (this.y.add(mpfVar)) {
            this.z.c(Unit.a);
        }
    }

    public final int z(int i) {
        if (i == this.d.getSemanticsOwner().a().g) {
            return -1;
        }
        return i;
    }
}
