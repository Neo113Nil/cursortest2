package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.gson.JsonObject;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxyWithFreeRequestParams;
import ru.yandex.video.m3.ott.data.dto.drm.DrmRequestParams;

/* loaded from: classes.dex */
public abstract class sk3 {
    public static final byte[] a = new byte[0];
    public static final wn5 b = new wn5(new go5(15), 603862108, false);
    public static final wn5 c = new wn5(new lo5(24), -562124911, false);
    public static final wn5 d = new wn5(new lo5(25), 1109561576, false);
    public static final wn5 e = new wn5(new zo5(29), -463053697, false);
    public static final wn5 f = new wn5(new ap5(5), -2104904337, false);
    public static final uw8 g;
    public static final StackTraceElement[] h;
    public static dhc i;

    static {
        new wn5(new bp5(0), -617691518, false);
        new wn5(new bp5(1), 960800189, false);
        new wn5(new bp5(2), 614031408, false);
        new wn5(new bp5(3), 808375119, false);
        g = new uw8(15);
        h = new StackTraceElement[0];
        i = new y9w(21);
    }

    public static int A(int i2, byte[] bArr, int i3, int i4, kkt kktVar, wx0 wx0Var) {
        if ((i2 >>> 3) == 0) {
            throw new aye("Protocol message contained an invalid tag (zero).");
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int E = E(bArr, i3, wx0Var);
            kktVar.c(i2, Long.valueOf(wx0Var.b));
            return E;
        }
        if (i5 == 1) {
            kktVar.c(i2, Long.valueOf(u(i3, bArr)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int C = C(bArr, i3, wx0Var);
            int i6 = wx0Var.a;
            if (i6 < 0) {
                throw aye.c();
            }
            if (i6 > bArr.length - C) {
                throw aye.e();
            }
            if (i6 == 0) {
                kktVar.c(i2, mn3.b);
            } else {
                kktVar.c(i2, mn3.n(bArr, C, i6));
            }
            return C + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw new aye("Protocol message contained an invalid tag (zero).");
            }
            kktVar.c(i2, Integer.valueOf(t(i3, bArr)));
            return i3 + 4;
        }
        kkt b2 = kkt.b();
        int i7 = (i2 & (-8)) | 4;
        int i8 = 0;
        while (true) {
            if (i3 >= i4) {
                break;
            }
            int C2 = C(bArr, i3, wx0Var);
            int i9 = wx0Var.a;
            if (i9 == i7) {
                i8 = i9;
                i3 = C2;
                break;
            }
            i3 = A(i9, bArr, C2, i4, b2, wx0Var);
            i8 = i9;
        }
        if (i3 > i4 || i8 != i7) {
            throw aye.d();
        }
        kktVar.c(i2, b2);
        return i3;
    }

    public static int B(int i2, byte[] bArr, int i3, wx0 wx0Var) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            wx0Var.a = i4 | (b2 << 7);
            return i5;
        }
        int i6 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            wx0Var.a = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & Byte.MAX_VALUE) << 14);
        int i9 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            wx0Var.a = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & Byte.MAX_VALUE) << 21);
        int i11 = i3 + 4;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            wx0Var.a = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                wx0Var.a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static int C(byte[] bArr, int i2, wx0 wx0Var) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return B(b2, bArr, i3, wx0Var);
        }
        wx0Var.a = b2;
        return i3;
    }

    public static int D(int i2, byte[] bArr, int i3, int i4, qse qseVar, wx0 wx0Var) {
        hpe hpeVar = (hpe) qseVar;
        int C = C(bArr, i3, wx0Var);
        hpeVar.g(wx0Var.a);
        while (C < i4) {
            int C2 = C(bArr, C, wx0Var);
            if (i2 != wx0Var.a) {
                break;
            }
            C = C(bArr, C2, wx0Var);
            hpeVar.g(wx0Var.a);
        }
        return C;
    }

    public static int E(byte[] bArr, int i2, wx0 wx0Var) {
        int i3 = i2 + 1;
        long j = bArr[i2];
        if (j >= 0) {
            wx0Var.b = j;
            return i3;
        }
        int i4 = i2 + 2;
        byte b2 = bArr[i3];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            i5 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i5;
            b2 = bArr[i4];
            i4 = i6;
        }
        wx0Var.b = j2;
        return i4;
    }

    public static int F(xsb[] xsbVarArr, int i2) {
        for (int i3 = 0; i3 < xsbVarArr.length; i3++) {
            xsb xsbVar = xsbVarArr[i3];
            if (xsbVar != null) {
                xvs xvsVar = xsbVar.a;
                if (xvsVar.a >= 1 && l5i.i(xvsVar.d[0].n) == i2) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static qsn G(myc mycVar, List list) {
        tde u = yde.u();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Bundle bundle = (Bundle) list.get(i2);
            bundle.getClass();
            u.a(mycVar.apply(bundle));
        }
        return u.f();
    }

    public static qsn H(xsb[] xsbVarArr) {
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        Object v;
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 1;
            if (i7 >= xsbVarArr.length) {
                break;
            }
            xsb xsbVar = xsbVarArr[i7];
            if (xsbVar == null || xsbVar.b.length <= 1) {
                arrayList.add(null);
            } else {
                tde u = yde.u();
                u.a(new z7w(0L, 0L));
                arrayList.add(u);
            }
            i7++;
        }
        int length = xsbVarArr.length;
        long[][] jArr = new long[length][];
        for (int i8 = 0; i8 < xsbVarArr.length; i8++) {
            xsb xsbVar2 = xsbVarArr[i8];
            if (xsbVar2 == null) {
                jArr[i8] = new long[0];
            } else {
                int[] iArr2 = xsbVar2.b;
                jArr[i8] = new long[iArr2.length];
                for (int i9 = 0; i9 < iArr2.length; i9++) {
                    long j = xsbVar2.a.d[iArr2[i9]].j;
                    long[] jArr2 = jArr[i8];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i9] = j;
                }
                Arrays.sort(jArr[i8]);
            }
        }
        int[] iArr3 = new int[length];
        long[] jArr3 = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            long[] jArr4 = jArr[i10];
            jArr3[i10] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        int F = F(xsbVarArr, 2);
        int F2 = F(xsbVarArr, 1);
        if (F == -1 || F2 == -1) {
            p(arrayList, jArr3);
            hld.w(2, "expectedValuesPerKey");
            TreeMap treeMap = new TreeMap(dxi.a);
            xgi xgiVar = new xgi();
            ygi ygiVar = new ygi(treeMap);
            ygiVar.f = xgiVar;
            int i11 = 0;
            while (i11 < length) {
                long[] jArr5 = jArr[i11];
                if (jArr5.length <= i2) {
                    i4 = i6;
                    i5 = i2;
                    iArr = iArr3;
                } else {
                    int length2 = jArr5.length;
                    double[] dArr = new double[length2];
                    int i12 = i6;
                    while (true) {
                        long[] jArr6 = jArr[i11];
                        i4 = i6;
                        double d2 = 0.0d;
                        if (i12 >= jArr6.length) {
                            break;
                        }
                        int i13 = i2;
                        int[] iArr4 = iArr3;
                        long j2 = jArr6[i12];
                        if (j2 != -1) {
                            d2 = Math.log(j2);
                        }
                        dArr[i12] = d2;
                        i12++;
                        i2 = i13;
                        i6 = i4;
                        iArr3 = iArr4;
                    }
                    int i14 = i2;
                    iArr = iArr3;
                    int i15 = length2 - 1;
                    double d3 = dArr[i15] - dArr[i4];
                    int i16 = i4;
                    while (i16 < i15) {
                        double d4 = dArr[i16];
                        i16++;
                        ygiVar.h(Double.valueOf(d3 == 0.0d ? 1.0d : (((d4 + dArr[i16]) * 0.5d) - dArr[i4]) / d3), Integer.valueOf(i11));
                        i14 = i14;
                    }
                    i5 = i14;
                }
                i11++;
                i6 = i4;
                iArr3 = iArr;
                i2 = i5;
            }
            i3 = i6;
            int[] iArr5 = iArr3;
            yde v2 = yde.v(ygiVar.g());
            for (int i17 = i3; i17 < v2.size(); i17++) {
                int intValue = ((Integer) v2.get(i17)).intValue();
                int i18 = iArr5[intValue] + 1;
                iArr5[intValue] = i18;
                jArr3[intValue] = jArr[intValue][i18];
                p(arrayList, jArr3);
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            xvs xvsVar = xsbVarArr[F].a;
            for (int i19 = 0; i19 < xvsVar.a; i19++) {
                arrayList2.add(xvsVar.d[i19]);
            }
            Collections.sort(arrayList2, new mj(0));
            for (int i20 = 0; i20 < jArr[F].length; i20++) {
                jArr3[F] = ((dsc) arrayList2.get(i20)).j;
                if (i20 != 0) {
                    long[] jArr7 = jArr[F2];
                    jArr3[F2] = jArr7[jArr7.length - 1];
                    p(arrayList, jArr3);
                } else {
                    int i21 = 0;
                    while (true) {
                        long[] jArr8 = jArr[F2];
                        if (i21 < jArr8.length) {
                            jArr3[F2] = jArr8[i21];
                            p(arrayList, jArr3);
                            i21++;
                        }
                    }
                }
            }
            i3 = 0;
        }
        for (int i22 = i3; i22 < xsbVarArr.length; i22++) {
            if (arrayList.get(i22) != null) {
                jArr3[i22] = jArr3[i22] * 2;
            }
        }
        p(arrayList, jArr3);
        tde u2 = yde.u();
        for (int i23 = i3; i23 < arrayList.size(); i23++) {
            tde tdeVar = (tde) arrayList.get(i23);
            if (tdeVar == null) {
                v = qsn.e;
            } else {
                ArrayList arrayList3 = new ArrayList(tdeVar.f());
                Collections.sort(arrayList3, new mj(1));
                v = yde.v(arrayList3);
            }
            if (tdeVar == null) {
                v = qsn.e;
            }
            u2.a(v);
        }
        return u2.f();
    }

    public static final Object I(Class cls) {
        bdt I = hag.I(cls);
        qdc qdcVar = l18.b.a;
        qdcVar.getClass();
        return qdcVar.C(I);
    }

    public static final void J(a0c a0cVar, dx8 dx8Var, xzb xzbVar, Function1 function1) {
        if (dx8Var != null) {
            lj9 lj9Var = dx8Var.b;
            a0cVar.i(lj9Var.a.c(xzbVar, function1));
            P(a0cVar, lj9Var.b, xzbVar, function1);
            R(a0cVar, lj9Var.c, xzbVar, function1);
        }
    }

    public static final void K(a0c a0cVar, ix8 ix8Var, xzb xzbVar, Function1 function1) {
        if (ix8Var == null) {
            return;
        }
        szb szbVar = ix8Var.b;
        a0cVar.i(ix8Var.f.c(xzbVar, function1));
        a0cVar.i(ix8Var.a.c(xzbVar, function1));
        szb szbVar2 = ix8Var.e;
        if (szbVar2 == null && szbVar == null) {
            a0cVar.i(ix8Var.c.c(xzbVar, function1));
            a0cVar.i(ix8Var.d.c(xzbVar, function1));
        } else {
            a0cVar.i(szbVar2 != null ? szbVar2.c(xzbVar, function1) : null);
            a0cVar.i(szbVar != null ? szbVar.c(xzbVar, function1) : null);
        }
    }

    public static final void L(a0c a0cVar, jz8 jz8Var, xzb xzbVar, Function1 function1) {
        if (jz8Var == null) {
            return;
        }
        a0cVar.i(jz8Var.b.c(xzbVar, function1));
        a0cVar.i(jz8Var.a.c(xzbVar, function1));
    }

    public static final void M(a0c a0cVar, xd9 xd9Var, xzb xzbVar, ep8 ep8Var) {
        if (xd9Var != null) {
            if (xd9Var instanceof vd9) {
                yd9 yd9Var = ((vd9) xd9Var).b;
                a0cVar.i(yd9Var.b.c(xzbVar, ep8Var));
                a0cVar.i(yd9Var.a.c(xzbVar, ep8Var));
            } else if (xd9Var instanceof wd9) {
                a0cVar.i(((wd9) xd9Var).b.a.c(xzbVar, ep8Var));
            }
        }
    }

    public static final void N(a0c a0cVar, rf9 rf9Var, xzb xzbVar, Function1 function1) {
        if (rf9Var != null) {
            if (rf9Var instanceof pf9) {
                ag9 ag9Var = ((pf9) rf9Var).b;
                a0cVar.i(ag9Var.a.c(xzbVar, function1));
                a0cVar.i(ag9Var.b.c(xzbVar, function1));
            } else if (rf9Var instanceof qf9) {
                a0cVar.i(((qf9) rf9Var).b.a.c(xzbVar, function1));
            }
        }
    }

    public static final void O(a0c a0cVar, qh9 qh9Var, xzb xzbVar, Function1 function1) {
        if (qh9Var == null) {
            return;
        }
        szb szbVar = qh9Var.a;
        a0cVar.i(szbVar != null ? szbVar.c(xzbVar, function1) : null);
        L(a0cVar, qh9Var.b, xzbVar, function1);
        L(a0cVar, qh9Var.d, xzbVar, function1);
        L(a0cVar, qh9Var.c, xzbVar, function1);
        R(a0cVar, qh9Var.e, xzbVar, function1);
    }

    public static final void P(a0c a0cVar, kj9 kj9Var, xzb xzbVar, Function1 function1) {
        if (kj9Var != null) {
            if (kj9Var instanceof jj9) {
                O(a0cVar, ((jj9) kj9Var).b, xzbVar, function1);
                return;
            }
            if (kj9Var instanceof ij9) {
                zq8 zq8Var = ((ij9) kj9Var).b;
                szb szbVar = zq8Var.a;
                a0cVar.i(szbVar != null ? szbVar.c(xzbVar, function1) : null);
                L(a0cVar, zq8Var.b, xzbVar, function1);
                R(a0cVar, zq8Var.c, xzbVar, function1);
            }
        }
    }

    public static final void Q(a0c a0cVar, bk9 bk9Var, xzb xzbVar, Function1 function1) {
        szb szbVar;
        szb szbVar2;
        szb szbVar3;
        szb szbVar4;
        szb szbVar5;
        szb szbVar6;
        szb szbVar7;
        szb szbVar8;
        if (bk9Var != null) {
            if (bk9Var instanceof yj9) {
                jz8 jz8Var = ((yj9) bk9Var).b;
                a0cVar.i(jz8Var.b.c(xzbVar, function1));
                a0cVar.i(jz8Var.a.c(xzbVar, function1));
                return;
            }
            ja8 ja8Var = null;
            if (bk9Var instanceof zj9) {
                a99 a99Var = ((zj9) bk9Var).b;
                szb szbVar9 = a99Var.c;
                kk9 kk9Var = a99Var.a;
                kk9 kk9Var2 = a99Var.b;
                a0cVar.i(szbVar9 != null ? szbVar9.c(xzbVar, function1) : null);
                a0cVar.i((kk9Var2 == null || (szbVar8 = kk9Var2.b) == null) ? null : szbVar8.c(xzbVar, function1));
                a0cVar.i((kk9Var2 == null || (szbVar7 = kk9Var2.a) == null) ? null : szbVar7.c(xzbVar, function1));
                a0cVar.i((kk9Var == null || (szbVar6 = kk9Var.b) == null) ? null : szbVar6.c(xzbVar, function1));
                if (kk9Var != null && (szbVar5 = kk9Var.a) != null) {
                    ja8Var = szbVar5.c(xzbVar, function1);
                }
                a0cVar.i(ja8Var);
                return;
            }
            if (bk9Var instanceof ak9) {
                x1a x1aVar = ((ak9) bk9Var).b;
                szb szbVar10 = x1aVar.a;
                kk9 kk9Var3 = x1aVar.b;
                kk9 kk9Var4 = x1aVar.c;
                a0cVar.i(szbVar10 != null ? szbVar10.c(xzbVar, function1) : null);
                a0cVar.i((kk9Var4 == null || (szbVar4 = kk9Var4.b) == null) ? null : szbVar4.c(xzbVar, function1));
                a0cVar.i((kk9Var4 == null || (szbVar3 = kk9Var4.a) == null) ? null : szbVar3.c(xzbVar, function1));
                a0cVar.i((kk9Var3 == null || (szbVar2 = kk9Var3.b) == null) ? null : szbVar2.c(xzbVar, function1));
                if (kk9Var3 != null && (szbVar = kk9Var3.a) != null) {
                    ja8Var = szbVar.c(xzbVar, function1);
                }
                a0cVar.i(ja8Var);
            }
        }
    }

    public static final void R(a0c a0cVar, ln9 ln9Var, xzb xzbVar, Function1 function1) {
        if (ln9Var == null) {
            return;
        }
        a0cVar.i(ln9Var.a.c(xzbVar, function1));
        a0cVar.i(ln9Var.d.c(xzbVar, function1));
        a0cVar.i(ln9Var.c.c(xzbVar, function1));
    }

    public static final Object S(CoroutineContext coroutineContext, Function0 function0, cg6 cg6Var) {
        return x97.V(coroutineContext, new bxe(function0, null, 0), cg6Var);
    }

    public static final void T(gc8 gc8Var, rv8 rv8Var, dw8 dw8Var, dzf dzfVar, boolean z) {
        Context baseContext;
        gc8Var.getClass();
        dzfVar.getClass();
        gc8Var.M(rv8Var, dw8Var);
        gc8Var.N("is_dark_theme", String.valueOf(z));
        xqn xqnVar = new xqn();
        int i2 = 0;
        gc8Var.addOnAttachStateChangeListener(new u0a(i2, new vd(16, xqnVar, dzfVar, gc8Var), new t0a(xqnVar, i2), gc8Var));
        Context context = gc8Var.getContext();
        vb8 vb8Var = context instanceof vb8 ? (vb8) context : null;
        U(gc8Var, (vb8Var == null || (baseContext = vb8Var.getBaseContext()) == null) ? zne.e : qdq.u(baseContext));
    }

    public static final void U(gc8 gc8Var, zne zneVar) {
        Context context = gc8Var.getContext();
        context.getClass();
        int m = qdq.m(context);
        Context context2 = gc8Var.getContext();
        context2.getClass();
        int b2 = eeh.b(qdq.l(context2) / context2.getResources().getDisplayMetrics().density);
        Context context3 = gc8Var.getContext();
        context3.getClass();
        int s = qdq.s(context3);
        Context context4 = gc8Var.getContext();
        context4.getClass();
        int b3 = eeh.b(qdq.n(context4) / context4.getResources().getDisplayMetrics().density);
        Integer valueOf = Integer.valueOf(zneVar.b);
        DisplayMetrics displayMetrics = gc8Var.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        int b4 = eeh.b(sb.w(valueOf, displayMetrics));
        Integer valueOf2 = Integer.valueOf(zneVar.d);
        DisplayMetrics displayMetrics2 = gc8Var.getResources().getDisplayMetrics();
        displayMetrics2.getClass();
        int b5 = eeh.b(sb.w(valueOf2, displayMetrics2));
        Integer valueOf3 = Integer.valueOf(zneVar.a);
        DisplayMetrics displayMetrics3 = gc8Var.getResources().getDisplayMetrics();
        displayMetrics3.getClass();
        int b6 = eeh.b(sb.w(valueOf3, displayMetrics3));
        Integer valueOf4 = Integer.valueOf(zneVar.c);
        DisplayMetrics displayMetrics4 = gc8Var.getResources().getDisplayMetrics();
        displayMetrics4.getClass();
        int b7 = eeh.b(sb.w(valueOf4, displayMetrics4));
        JsonObject jsonObject = new JsonObject();
        jsonObject.s(Integer.valueOf(m), CameraProperty.WIDTH);
        jsonObject.s(Integer.valueOf(b2), CameraProperty.HEIGHT);
        jsonObject.s(Integer.valueOf(s), "status_bar_height");
        jsonObject.s(Integer.valueOf(b3), "navigation_bar_height");
        jsonObject.s(Integer.valueOf(b4), "padding_top");
        jsonObject.s(Integer.valueOf(b5), "padding_bottom");
        jsonObject.s(Integer.valueOf(b6), "padding_left");
        jsonObject.s(Integer.valueOf(b7), "padding_right");
        String jsonElement = jsonObject.toString();
        jsonElement.getClass();
        gc8Var.N("screen_params", jsonElement);
    }

    public static final void V(y yVar, cvo cvoVar, sai saiVar, String str, pu0 pu0Var, zhs zhsVar, wn5 wn5Var) {
        yVar.getClass();
        cvoVar.getClass();
        saiVar.getClass();
        str.getClass();
        pu0Var.getClass();
        e3s.X(cvoVar, yVar, str, saiVar, zhsVar, new wn5(new pw6(pu0Var, wn5Var, saiVar, 0), 1082746054, true), 16);
    }

    public static ArrayList X(Collection collection, myc mycVar) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) mycVar.apply(it.next()));
        }
        return arrayList;
    }

    public static final ArrayList Y(List list) {
        list.getClass();
        List<Pair> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (Pair pair : list2) {
            arrayList.add(new Pair(Float.valueOf(((Number) pair.a).floatValue()), new d85(c3x.f(((Number) pair.b).intValue()))));
        }
        return arrayList;
    }

    public static final tx3 Z(g24 g24Var) {
        g24Var.getClass();
        return new tx3(g24Var.d, g24Var.a);
    }

    public static final void a(fvf fvfVar, yci yciVar, q0k q0kVar, wn5 wn5Var, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1894517301);
        int i3 = (oq5Var.f(fvfVar) ? 4 : 2) | i2;
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(0);
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new ov6(0.5f, 0.0f, 1.0f, 1.0f);
                oq5Var.k0(K2);
            }
            ov6 ov6Var = (ov6) K2;
            Object K3 = oq5Var.K();
            if (K3 == kjnVar) {
                K3 = new x80(aqiVar, 0);
                oq5Var.k0(K3);
            }
            yci p1 = gut.p1(a.l(androidx.compose.ui.layout.a.f(yciVar, (Function1) K3), q0kVar));
            boolean z = (i3 & 14) == 4;
            Object K4 = oq5Var.K();
            if (z || K4 == kjnVar) {
                K4 = new g3(5, fvfVar, ov6Var, aqiVar);
                oq5Var.k0(K4);
            }
            yci i4 = a.i(p1, (Function1) K4);
            kfh d2 = ug3.d(b2c.b, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, i4);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            wn5Var.invoke(b.a, oq5Var, 54);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wl(i2, 7, fvfVar, yciVar, q0kVar, wn5Var);
        }
    }

    public static final vdr a0(mm6 mm6Var, pjc pjcVar) {
        pjcVar.getClass();
        mm6Var.getClass();
        wdg.E();
        gm5 j = hld.j();
        Continuation continuation = null;
        x97.y(mm6Var, dm6.b(), null, new dmc(pjcVar, j, continuation, 1), 2);
        return (vdr) x97.D(g.a, new unc(j, continuation, 0));
    }

    public static final void b(Function0 function0, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(620129125);
        int i4 = (oq5Var.h(function0) ? 4 : 2) | i2;
        if ((i4 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
            i3 = 3;
        } else {
            gz2 gz2Var = b2c.o;
            vci vciVar = vci.a;
            yci a2 = androidx.compose.ui.platform.a.a(d.d(a.o(vciVar, 16, 0.0f, 2), 1.0f), "preSave_bottom_sheet");
            ta5 a3 = sa5.a(qx0.c, gz2Var, oq5Var, 48);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            String o = vz1.o(vciVar, 44, oq5Var, R.string.pre_save_bottom_sheet_title, oq5Var);
            ges c2 = nu0.c();
            agr agrVar = eq0.a;
            xv7.j(o, androidx.compose.ui.platform.a.a(vciVar, "preSave_bottom_sheet_title"), ((dq0) oq5Var.j(agrVar)).b.a, 0L, 0L, 3, 0L, 0, false, 0, 0, null, c2, oq5Var, 48, 0, 65272);
            xv7.j(vz1.o(vciVar, 8, oq5Var, R.string.pre_save_bottom_sheet_description, oq5Var), androidx.compose.ui.platform.a.a(vciVar, "preSave_bottom_sheet_description"), ((dq0) oq5Var.j(agrVar)).b.a, 0L, 0L, 3, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 48, 0, 65272);
            i3 = 3;
            hdg.o(vz1.o(vciVar, 24, oq5Var, R.string.pre_save_bottom_sheet_button, oq5Var), function0, androidx.compose.ui.platform.a.a(vciVar, "preSave_bottom_sheet_button"), 0.0f, oq5Var, ((i4 << 3) & 112) | 384, 8);
            u1g.l(oq5Var, d.e(vciVar, 33));
            WeakHashMap weakHashMap = rqv.w;
            u1g.l(oq5Var, s7g.F(z7l.h(oq5Var).e));
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new zk(function0, i2, i3);
        }
    }

    public static final dgr b0(egr egrVar, List list) {
        egrVar.getClass();
        list.getClass();
        Map map = egrVar.f;
        StationId stationId = egrVar.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ArrayList<j7o> arrayList2 = ((i7o) ((Map.Entry) it.next()).getValue()).b;
            ArrayList arrayList3 = new ArrayList(v75.o(arrayList2, 10));
            for (j7o j7oVar : arrayList2) {
                arrayList3.add(new Pair(j7oVar.a, j7oVar.c));
            }
            z75.t(arrayList, arrayList3);
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (list.contains(((Pair) next).b)) {
                arrayList4.add(next);
            }
        }
        Pair q = v75.q(arrayList4);
        List list2 = (List) q.a;
        return new dgr(stationId, CollectionsKt.g0(t75.c(stationId.toString()), (List) q.b), CollectionsKt.X(CollectionsKt.g0((!stationId.equals(StationId.f("user:onyourwave")) || list2.isEmpty()) ? t75.c(egrVar.b) : c5b.a, list2), " • ", null, null, null, 62), egrVar.d);
    }

    public static final void c(final boolean z, final long j, final long j2, final Function0 function0, final yci yciVar, final wn5 wn5Var, final Function0 function02, hq5 hq5Var, final int i2) {
        boolean z2;
        int i3;
        oq5 oq5Var;
        boolean z3;
        yciVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1290310807);
        if ((i2 & 6) == 0) {
            z2 = z;
            i3 = (oq5Var2.g(z2) ? 4 : 2) | i2;
        } else {
            z2 = z;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.e(j) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.e(j2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.h(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var2.h(wn5Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i2) == 0) {
            i3 |= oq5Var2.h(function02) ? 1048576 : 524288;
        }
        int i4 = i3;
        if ((i4 & 599187) == 599186 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            Object K = oq5Var2.K();
            if (K == gq5.a) {
                K = vz1.h(oq5Var2);
            }
            uoi uoiVar = (uoi) K;
            oq5Var2.Z(1256876270);
            yci b2 = androidx.compose.foundation.a.b(yciVar, j2, vnj.i);
            if (function0 == null) {
                oq5Var = oq5Var2;
                z3 = false;
            } else {
                oq5Var = oq5Var2;
                z3 = false;
                b2 = b2.f(androidx.compose.foundation.a.f(vci.a, uoiVar, eeo.a(0.0f, 3, j, false), z2, null, irf.S(function02, oq5Var2, (i4 >> 18) & 14), null, function0, 184));
            }
            oq5Var.p(z3);
            kfh d2 = ug3.d(b2c.b, true);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, b2);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            eta.l((i4 >> 15) & 14, wn5Var, oq5Var, true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: st2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sk3.c(z, j, j2, function0, yciVar, wn5Var, function02, (hq5) obj, rvf.R(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static void c0(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static final void d(ip4 ip4Var, yci yciVar, hq5 hq5Var, int i2) {
        ip4Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2132506623);
        int i3 = (oq5Var.f(ip4Var) ? 4 : 2) | i2 | 48;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            ynn i4 = irv.i(oq5Var);
            jht jhtVar = (jht) gld.M(ip4Var.d, oq5Var).getValue();
            wn5 C = ild.C(-1692875379, new ar(17, ip4Var, i4), oq5Var);
            vci vciVar = vci.a;
            tt0.g(jhtVar, vciVar, null, "carouselCrossfade", C, oq5Var, 27696, 4);
            yciVar = vciVar;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new m32(ip4Var, yciVar, i2, 20);
        }
    }

    public static final void e(int i2, hq5 hq5Var, yci yciVar, boolean z) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1856052756);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i4 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ges j = nu0.j();
            float p = w1g.p(nu0.j(), 0, oq5Var, 0, 2) + w1g.p(nu0.d(), 0, oq5Var, 0, 2) + w1g.p(j, 0, oq5Var, 0, 2) + 12;
            vci vciVar = vci.a;
            ivf.k(i4 & 14, 0, oq5Var, xp3.u(a.d(d.e(vciVar, p), 0.82f), o5g.F(oq5Var)), z);
            yciVar = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yt(z, yciVar, i2, 9);
        }
    }

    public static final void f(int i2, hq5 hq5Var, yci yciVar, boolean z) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(555708509);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i4 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (irv.g(oq5Var)) {
                oq5Var.Z(-1986600911);
                l(z, oq5Var, i4 & 126);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-1986479825);
                j(z, oq5Var, i4 & 126);
                oq5Var.p(false);
            }
            yciVar = vci.a;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yt(z, yciVar, i2, 6);
        }
    }

    public static final void g(int i2, hq5 hq5Var, yci yciVar, boolean z) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-877674137);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
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
            int i5 = i3 & 14;
            n(i5, oq5Var, null, z);
            vci vciVar = vci.a;
            u1g.l(oq5Var, d.e(vciVar, 16));
            ivf.k(i5, 0, oq5Var, xp3.u(d.e(d.d(vciVar, 1.0f), 46), ugo.a), z);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yt(z, yciVar, i2, 7);
        }
    }

    public static final DrmProxyWithFreeRequestParams h(String str, String str2, Map map, Function1 function1) {
        function1.getClass();
        vqa vqaVar = new vqa();
        function1.invoke(vqaVar);
        DrmRequestParams drmRequestParams = vqaVar.a;
        if (drmRequestParams == null) {
            DrmRequestParams.Companion.getClass();
            drmRequestParams = DrmRequestParams.DUMMY;
        }
        return new DrmProxyWithFreeRequestParams(str, str2, drmRequestParams, map, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0067  */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(wn5 wn5Var, wn5 wn5Var2, Function2 function2, yci yciVar, Function0 function0, String str, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar2;
        int i5;
        Function0 function02;
        int i6;
        String str2;
        Function0 function03;
        Object K;
        int i7;
        int i8;
        ?? r0;
        yci yciVar3;
        String str3;
        Function0 function04;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1247276068);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.h(wn5Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.h(wn5Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.h(function2) ? 256 : 128;
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var.f(yciVar2) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                function02 = function0;
                i4 |= oq5Var.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID;
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((196608 & i2) == 0) {
                    str2 = str;
                    i4 |= oq5Var.f(str2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                    if ((74899 & i4) == 74898 || !oq5Var.z()) {
                        vci vciVar = vci.a;
                        if (i9 != 0) {
                            yciVar2 = vciVar;
                        }
                        function03 = i5 == 0 ? null : function02;
                        String str4 = i6 == 0 ? null : str2;
                        hz2 hz2Var = b2c.l;
                        K = oq5Var.K();
                        if (K == gq5.a) {
                            K = new rua(29);
                            oq5Var.k0(K);
                        }
                        yci b2 = nfp.b(yciVar2, true, (Function1) K);
                        if (function03 != null) {
                            b2 = b2.f(androidx.compose.foundation.a.e(vciVar, false, str4, null, function03, 5));
                        }
                        yci n = a.n(b2, 16, 8);
                        nho a2 = lho.a(qx0.a, hz2Var, oq5Var, 48);
                        i7 = oq5Var.P;
                        androidx.compose.runtime.internal.a l = oq5Var.l();
                        yci H = vnj.H(oq5Var, n);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var.d0();
                        if (oq5Var.O) {
                            oq5Var.n0();
                        } else {
                            oq5Var.k(grbVar);
                        }
                        kb5 kb5Var = wp5.f;
                        g0g.U(oq5Var, a2, kb5Var);
                        kb5 kb5Var2 = wp5.e;
                        g0g.U(oq5Var, l, kb5Var2);
                        kb5 kb5Var3 = wp5.g;
                        if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                            ouj.x(i7, oq5Var, i7, kb5Var3);
                        }
                        kb5 kb5Var4 = wp5.d;
                        g0g.U(oq5Var, H, kb5Var4);
                        wn5Var.invoke(oq5Var, Integer.valueOf(i4 & 14));
                        int i10 = i4;
                        if (1.0f <= 0.0d) {
                            qme.a("invalid weight; must be greater than zero");
                        }
                        yci q = a.q(new LayoutWeightElement(true, 1.0f), 12, 0.0f, 0.0f, 0.0f, 14);
                        ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                        i8 = oq5Var.P;
                        androidx.compose.runtime.internal.a l2 = oq5Var.l();
                        yci H2 = vnj.H(oq5Var, q);
                        oq5Var.d0();
                        if (oq5Var.O) {
                            oq5Var.n0();
                        } else {
                            oq5Var.k(grbVar);
                        }
                        g0g.U(oq5Var, a3, kb5Var);
                        g0g.U(oq5Var, l2, kb5Var2);
                        if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                            ouj.x(i8, oq5Var, i8, kb5Var3);
                        }
                        g0g.U(oq5Var, H2, kb5Var4);
                        wn5Var2.invoke(oq5Var, Integer.valueOf((i10 >> 3) & 14));
                        if (function2 == null) {
                            oq5Var.Z(78893875);
                            u1g.l(oq5Var, d.e(vciVar, mu0.a));
                            function2.invoke(oq5Var, Integer.valueOf((i10 >> 6) & 14));
                            r0 = 0;
                        } else {
                            r0 = 0;
                            oq5Var.Z(76810520);
                        }
                        oq5Var.p(r0);
                        oq5Var.p(true);
                        if (function03 == null) {
                            oq5Var.Z(1592594178);
                            gae.b(a0g.E(R.drawable.ic_arrow_mid_right_24, r0, oq5Var), null, androidx.compose.ui.platform.a.a(wyf.R(d.m(vciVar, 24)), "bottom_sheet_header_arrow"), ((dq0) oq5Var.j(eq0.a)).a.c, oq5Var, 48, 0);
                        } else {
                            oq5Var.Z(1590317538);
                        }
                        oq5Var.p(r0);
                        oq5Var.p(true);
                        yciVar3 = yciVar2;
                        str3 = str4;
                        function04 = function03;
                    } else {
                        oq5Var.S();
                        yciVar3 = yciVar2;
                        function04 = function02;
                        str3 = str2;
                    }
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new fd1(wn5Var, wn5Var2, function2, yciVar3, function04, str3, i2, i3);
                        return;
                    }
                    return;
                }
                str2 = str;
                if ((74899 & i4) == 74898) {
                }
                vci vciVar2 = vci.a;
                if (i9 != 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                hz2 hz2Var2 = b2c.l;
                K = oq5Var.K();
                if (K == gq5.a) {
                }
                yci b22 = nfp.b(yciVar2, true, (Function1) K);
                if (function03 != null) {
                }
                yci n2 = a.n(b22, 16, 8);
                nho a22 = lho.a(qx0.a, hz2Var2, oq5Var, 48);
                i7 = oq5Var.P;
                androidx.compose.runtime.internal.a l3 = oq5Var.l();
                yci H3 = vnj.H(oq5Var, n2);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                }
                kb5 kb5Var5 = wp5.f;
                g0g.U(oq5Var, a22, kb5Var5);
                kb5 kb5Var22 = wp5.e;
                g0g.U(oq5Var, l3, kb5Var22);
                kb5 kb5Var32 = wp5.g;
                if (!oq5Var.O) {
                }
                ouj.x(i7, oq5Var, i7, kb5Var32);
                kb5 kb5Var42 = wp5.d;
                g0g.U(oq5Var, H3, kb5Var42);
                wn5Var.invoke(oq5Var, Integer.valueOf(i4 & 14));
                int i102 = i4;
                if (1.0f <= 0.0d) {
                }
                yci q2 = a.q(new LayoutWeightElement(true, 1.0f), 12, 0.0f, 0.0f, 0.0f, 14);
                ta5 a32 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                i8 = oq5Var.P;
                androidx.compose.runtime.internal.a l22 = oq5Var.l();
                yci H22 = vnj.H(oq5Var, q2);
                oq5Var.d0();
                if (oq5Var.O) {
                }
                g0g.U(oq5Var, a32, kb5Var5);
                g0g.U(oq5Var, l22, kb5Var22);
                if (!oq5Var.O) {
                }
                ouj.x(i8, oq5Var, i8, kb5Var32);
                g0g.U(oq5Var, H22, kb5Var42);
                wn5Var2.invoke(oq5Var, Integer.valueOf((i102 >> 3) & 14));
                if (function2 == null) {
                }
                oq5Var.p(r0);
                oq5Var.p(true);
                if (function03 == null) {
                }
                oq5Var.p(r0);
                oq5Var.p(true);
                yciVar3 = yciVar2;
                str3 = str4;
                function04 = function03;
                r = oq5Var.r();
                if (r == null) {
                }
            }
            function02 = function0;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            str2 = str;
            if ((74899 & i4) == 74898) {
            }
            vci vciVar22 = vci.a;
            if (i9 != 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            hz2 hz2Var22 = b2c.l;
            K = oq5Var.K();
            if (K == gq5.a) {
            }
            yci b222 = nfp.b(yciVar2, true, (Function1) K);
            if (function03 != null) {
            }
            yci n22 = a.n(b222, 16, 8);
            nho a222 = lho.a(qx0.a, hz2Var22, oq5Var, 48);
            i7 = oq5Var.P;
            androidx.compose.runtime.internal.a l32 = oq5Var.l();
            yci H32 = vnj.H(oq5Var, n22);
            xp5.T.getClass();
            grb grbVar22 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
            }
            kb5 kb5Var52 = wp5.f;
            g0g.U(oq5Var, a222, kb5Var52);
            kb5 kb5Var222 = wp5.e;
            g0g.U(oq5Var, l32, kb5Var222);
            kb5 kb5Var322 = wp5.g;
            if (!oq5Var.O) {
            }
            ouj.x(i7, oq5Var, i7, kb5Var322);
            kb5 kb5Var422 = wp5.d;
            g0g.U(oq5Var, H32, kb5Var422);
            wn5Var.invoke(oq5Var, Integer.valueOf(i4 & 14));
            int i1022 = i4;
            if (1.0f <= 0.0d) {
            }
            yci q22 = a.q(new LayoutWeightElement(true, 1.0f), 12, 0.0f, 0.0f, 0.0f, 14);
            ta5 a322 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            i8 = oq5Var.P;
            androidx.compose.runtime.internal.a l222 = oq5Var.l();
            yci H222 = vnj.H(oq5Var, q22);
            oq5Var.d0();
            if (oq5Var.O) {
            }
            g0g.U(oq5Var, a322, kb5Var52);
            g0g.U(oq5Var, l222, kb5Var222);
            if (!oq5Var.O) {
            }
            ouj.x(i8, oq5Var, i8, kb5Var322);
            g0g.U(oq5Var, H222, kb5Var422);
            wn5Var2.invoke(oq5Var, Integer.valueOf((i1022 >> 3) & 14));
            if (function2 == null) {
            }
            oq5Var.p(r0);
            oq5Var.p(true);
            if (function03 == null) {
            }
            oq5Var.p(r0);
            oq5Var.p(true);
            yciVar3 = yciVar2;
            str3 = str4;
            function04 = function03;
            r = oq5Var.r();
            if (r == null) {
            }
        }
        yciVar2 = yciVar;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function02 = function0;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        str2 = str;
        if ((74899 & i4) == 74898) {
        }
        vci vciVar222 = vci.a;
        if (i9 != 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        hz2 hz2Var222 = b2c.l;
        K = oq5Var.K();
        if (K == gq5.a) {
        }
        yci b2222 = nfp.b(yciVar2, true, (Function1) K);
        if (function03 != null) {
        }
        yci n222 = a.n(b2222, 16, 8);
        nho a2222 = lho.a(qx0.a, hz2Var222, oq5Var, 48);
        i7 = oq5Var.P;
        androidx.compose.runtime.internal.a l322 = oq5Var.l();
        yci H322 = vnj.H(oq5Var, n222);
        xp5.T.getClass();
        grb grbVar222 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        kb5 kb5Var522 = wp5.f;
        g0g.U(oq5Var, a2222, kb5Var522);
        kb5 kb5Var2222 = wp5.e;
        g0g.U(oq5Var, l322, kb5Var2222);
        kb5 kb5Var3222 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i7, oq5Var, i7, kb5Var3222);
        kb5 kb5Var4222 = wp5.d;
        g0g.U(oq5Var, H322, kb5Var4222);
        wn5Var.invoke(oq5Var, Integer.valueOf(i4 & 14));
        int i10222 = i4;
        if (1.0f <= 0.0d) {
        }
        yci q222 = a.q(new LayoutWeightElement(true, 1.0f), 12, 0.0f, 0.0f, 0.0f, 14);
        ta5 a3222 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
        i8 = oq5Var.P;
        androidx.compose.runtime.internal.a l2222 = oq5Var.l();
        yci H2222 = vnj.H(oq5Var, q222);
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a3222, kb5Var522);
        g0g.U(oq5Var, l2222, kb5Var2222);
        if (!oq5Var.O) {
        }
        ouj.x(i8, oq5Var, i8, kb5Var3222);
        g0g.U(oq5Var, H2222, kb5Var4222);
        wn5Var2.invoke(oq5Var, Integer.valueOf((i10222 >> 3) & 14));
        if (function2 == null) {
        }
        oq5Var.p(r0);
        oq5Var.p(true);
        if (function03 == null) {
        }
        oq5Var.p(r0);
        oq5Var.p(true);
        yciVar3 = yciVar2;
        str3 = str4;
        function04 = function03;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void j(boolean z, hq5 hq5Var, int i2) {
        int i3;
        bs4 bs4Var = bs4.d;
        gz2 gz2Var = b2c.n;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(859724110);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i2 & 48;
        vci vciVar = vci.a;
        if (i4 == 0) {
            i3 |= oq5Var.f(vciVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else if (irv.h(oq5Var)) {
            oq5Var.Z(1151116138);
            qs5 qs5Var = AndroidCompositionLocals_androidKt.a;
            cma cmaVar = new cma(((Configuration) oq5Var.j(qs5Var)).screenWidthDp * 0.5f);
            cma cmaVar2 = new cma(((Configuration) oq5Var.j(qs5Var)).screenHeightDp * 0.6f);
            if (cmaVar.compareTo(cmaVar2) > 0) {
                cmaVar = cmaVar2;
            }
            yci c2 = d.c(vciVar, 1.0f);
            ta5 a2 = sa5.a(qx0.c, gz2Var, oq5Var, 0);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c2);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            ivf.k(i3 & 14, 0, oq5Var, xp3.u(a.d(xp3.u(d.r(vciVar, cmaVar.a), bs4Var), 0.83f).f(new HorizontalAlignElement(b2c.o)), o5g.F(oq5Var)), z);
            u1g.l(oq5Var, d.e(vciVar, 26));
            oq5Var.p(true);
            oq5Var.p(false);
        } else {
            oq5Var.Z(1151728016);
            ta5 a3 = sa5.a(qx0.c, gz2Var, oq5Var, 0);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, vciVar);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar2);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var2 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var2);
            }
            g0g.U(oq5Var, H2, wp5.d);
            ivf.k((i3 & 14) | 48, 0, oq5Var, d.d(a.d(xp3.u(a.o(vciVar, 16, 0.0f, 2), bs4Var), 0.83f), 1.0f), z);
            u1g.l(oq5Var, d.e(vciVar, 26));
            oq5Var.p(true);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vf4(i2, 1, z);
        }
    }

    public static final void k(dgf dgfVar, hq5 hq5Var, int i2) {
        dgfVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(498280163);
        if ((((oq5Var.h(dgfVar) ? 4 : 2) | i2) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            aqi O = gld.O(dgfVar.b, oq5Var);
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            yci u = xp3.u(a.q(a.o(androidx.compose.ui.platform.a.a(vci.a, "kids_tab_visibility_informer"), 16, 0.0f, 2), 0.0f, 0.0f, 0.0f, 4, 7), o5g.C(oq5Var));
            agr agrVar = eq0.a;
            yci b2 = androidx.compose.foundation.a.b(u, c3x.D(((dq0) oq5Var.j(agrVar)).c.c, ((dq0) oq5Var.j(agrVar)).c.b), vnj.i);
            boolean h2 = oq5Var.h(dgfVar) | oq5Var.h(context);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                K = new zya(26, dgfVar, context);
                oq5Var.k0(K);
            }
            yci e2 = androidx.compose.foundation.a.e(b2, false, null, null, (Function0) K, 7);
            kfh d2 = ug3.d(b2c.b, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, e2);
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
            lg3.y((jgf) O.getValue(), null, oq5Var, 0);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new nha(dgfVar, i2, 26);
        }
    }

    public static final void l(boolean z, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1012900883);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i2 & 48;
        vci vciVar = vci.a;
        if (i4 == 0) {
            i3 |= oq5Var.f(vciVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            float f2 = 32;
            g(i3 & 14, oq5Var, a.q(a.o(vciVar, 128, 0.0f, 2), 0.0f, f2, 0.0f, f2, 5), z);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vf4(i2, 2, z);
        }
    }

    public static final void m(int i2, long j, long j2, hq5 hq5Var, yci yciVar) {
        int i3;
        wn5 wn5Var = ghh.a;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1705577614);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.e(j) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.e(j2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.h(wn5Var) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci e2 = d.e(yciVar, ff7.P(j2, oq5Var));
            kfh d2 = ug3.d(b2c.e, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, e2);
            xp5.T.getClass();
            Function0 function0 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(function0);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            wn5Var.invoke(d.d(d.e(xp3.u(vci.a, ugo.a), ff7.P(j, oq5Var)), 1.0f), oq5Var, Integer.valueOf((i3 >> 6) & 112));
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new km0(j, j2, yciVar, i2);
        }
    }

    public static final void n(int i2, hq5 hq5Var, yci yciVar, boolean z) {
        int i3;
        yci yciVar2;
        boolean z2 = z;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-636658906);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.g(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i4 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            nho a2 = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yciVar2 = vci.a;
            yci H = vnj.H(oq5Var, yciVar2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            int i6 = i4 & 14;
            e(i6, oq5Var, null, z2);
            u1g.l(oq5Var, d.r(yciVar2, 16));
            ta5 a3 = sa5.a(qx0.e, b2c.n, oq5Var, 6);
            int i7 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, yciVar2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            int i8 = i6 | 48;
            ivf.l(z2, d.r(yciVar2, 160), nu0.d(), oq5Var, i8, 0);
            u1g.l(oq5Var, d.e(yciVar2, 4));
            z2 = z;
            ivf.l(z2, d.r(yciVar2, 95), nu0.j(), oq5Var, i8, 0);
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yt(z2, yciVar2, i2, 8);
        }
    }

    public static final void o(int i2, hq5 hq5Var, yci yciVar, boolean z) {
        boolean z2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2061932177);
        int i3 = (oq5Var.g(z) ? 4 : 2) | i2 | 48;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
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
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            int i5 = i3 & 14;
            ivf.k(i5, 0, oq5Var, xp3.u(a.d(vciVar, 1.7727273f), o5g.E(oq5Var)), z);
            u1g.l(oq5Var, d.e(vciVar, 8));
            z2 = z;
            ivf.l(z2, d.r(vciVar, 100), nu0.j(), oq5Var, i5 | 48, 0);
            u1g.l(oq5Var, d.e(vciVar, 2));
            ivf.l(z2, null, nu0.i(), oq5Var, i5, 2);
            oq5Var.p(true);
            yciVar = vciVar;
        } else {
            z2 = z;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q10(z2, yciVar, i2, 4);
        }
    }

    public static void p(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            tde tdeVar = (tde) arrayList.get(i2);
            if (tdeVar != null) {
                tdeVar.a(new z7w(j, jArr[i2]));
            }
        }
    }

    public static final afn q(ArrayList arrayList) {
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        return y9w.N((Pair[]) Arrays.copyOf(pairArr, pairArr.length), 0.0f, 14);
    }

    public static final Integer r(int i2) {
        return new Integer(i2);
    }

    public static int s(byte[] bArr, int i2, wx0 wx0Var) {
        int C = C(bArr, i2, wx0Var);
        int i3 = wx0Var.a;
        if (i3 < 0) {
            throw aye.c();
        }
        if (i3 > bArr.length - C) {
            throw aye.e();
        }
        if (i3 == 0) {
            wx0Var.c = mn3.b;
            return C;
        }
        wx0Var.c = mn3.n(bArr, C, i3);
        return C + i3;
    }

    public static int t(int i2, byte[] bArr) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static long u(int i2, byte[] bArr) {
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    public static int v(vto vtoVar, byte[] bArr, int i2, int i3, int i4, wx0 wx0Var) {
        e eVar = (e) vtoVar;
        Object c2 = eVar.c();
        int E = eVar.E(c2, bArr, i2, i3, i4, wx0Var);
        eVar.a(c2);
        wx0Var.c = c2;
        return E;
    }

    public static int w(vto vtoVar, byte[] bArr, int i2, int i3, wx0 wx0Var) {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = B(i5, bArr, i4, wx0Var);
            i5 = wx0Var.a;
        }
        int i6 = i4;
        if (i5 < 0 || i5 > i3 - i6) {
            throw aye.e();
        }
        Object c2 = vtoVar.c();
        int i7 = i6 + i5;
        vtoVar.i(c2, bArr, i6, i7, wx0Var);
        vtoVar.a(c2);
        wx0Var.c = c2;
        return i7;
    }

    public static int x(vto vtoVar, int i2, byte[] bArr, int i3, int i4, qse qseVar, wx0 wx0Var) {
        int w = w(vtoVar, bArr, i3, i4, wx0Var);
        qseVar.add(wx0Var.c);
        while (w < i4) {
            int C = C(bArr, w, wx0Var);
            if (i2 != wx0Var.a) {
                break;
            }
            w = w(vtoVar, bArr, C, i4, wx0Var);
            qseVar.add(wx0Var.c);
        }
        return w;
    }

    public static int y(byte[] bArr, int i2, wx0 wx0Var) {
        int C = C(bArr, i2, wx0Var);
        int i3 = wx0Var.a;
        if (i3 < 0) {
            throw aye.c();
        }
        if (i3 == 0) {
            wx0Var.c = "";
            return C;
        }
        wx0Var.c = new String(bArr, C, i3, tse.a);
        return C + i3;
    }

    public static int z(byte[] bArr, int i2, wx0 wx0Var) {
        int C = C(bArr, i2, wx0Var);
        int i3 = wx0Var.a;
        if (i3 < 0) {
            throw aye.c();
        }
        if (i3 == 0) {
            wx0Var.c = "";
            return C;
        }
        wx0Var.c = mut.a.w(bArr, C, i3);
        return C + i3;
    }
}
