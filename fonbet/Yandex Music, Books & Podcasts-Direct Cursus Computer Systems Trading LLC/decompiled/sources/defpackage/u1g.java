package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.a;
import com.airbnb.lottie.compose.LottieAnimationSizeElement;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.media.ynison.service.b0;
import com.yandex.media.ynison.service.i0;
import com.yandex.media.ynison.service.s0;
import com.yandex.media.ynison.service.w;
import com.yandex.music.shared.dto.VibeButtonDto;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.BuildConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class u1g {
    public static volatile Boolean a;

    public static final ArrayList A(List list, Collection collection) {
        list.getClass();
        collection.getClass();
        ArrayList arrayList = new ArrayList(list);
        arrayList.addAll(collection);
        return arrayList;
    }

    public static jhb B(k7k k7kVar) {
        jhb z = z(k7kVar);
        while (k7kVar.c() && (k7kVar.a() instanceof kms)) {
            lns d = k7kVar.d();
            jhb z2 = z(k7kVar);
            d.getClass();
            z = new zgb((wms) d, z, z2, k7kVar.b);
        }
        return z;
    }

    public static String C(qn3 qn3Var) {
        StringBuilder sb = new StringBuilder(qn3Var.size());
        for (int i = 0; i < qn3Var.size(); i++) {
            byte a2 = qn3Var.a(i);
            if (a2 == 34) {
                sb.append("\\\"");
            } else if (a2 == 39) {
                sb.append("\\'");
            } else if (a2 != 92) {
                switch (a2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a2 < 32 || a2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a2 >>> 6) & 3) + 48));
                            sb.append((char) (((a2 >>> 3) & 7) + 48));
                            sb.append((char) ((a2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a2);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static jhb D(k7k k7kVar) {
        String str = k7kVar.b;
        jhb v = v(k7kVar);
        while (k7kVar.c() && (k7kVar.a() instanceof qms)) {
            k7kVar.b();
            v = new zgb(qms.a, v, v(k7kVar), str);
        }
        if (!k7kVar.c() || !(k7kVar.a() instanceof zms)) {
            return v;
        }
        k7kVar.b();
        jhb D = D(k7kVar);
        if (k7kVar.c >= k7kVar.a.size() || !(k7kVar.a() instanceof yms)) {
            kac.h("':' expected in ternary-if-else expression", null);
            return null;
        }
        k7kVar.b();
        return new ehb(v, D, D(k7kVar), str);
    }

    public static jhb E(k7k k7kVar) {
        jhb V = V(k7kVar);
        while (k7kVar.c() && (k7kVar.a() instanceof oms)) {
            lns d = k7kVar.d();
            d.getClass();
            V = new zgb((wms) d, V, V(k7kVar), k7kVar.b);
        }
        return V;
    }

    public static final ArrayList F(Iterable iterable, Function1 function1) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean G(dpc dpcVar, lma lmaVar) {
        int ordinal = dpcVar.U0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                dpc z = ff7.z(dpcVar);
                if (z != null) {
                    return G(z, lmaVar) || H(dpcVar, z, 1, lmaVar);
                }
                xq0.q("ActiveParent must have a focusedChild");
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return dpcVar.T0().a ? ((Boolean) lmaVar.invoke(dpcVar)).booleanValue() : M(dpcVar, lmaVar);
                }
                b6e.s();
                return false;
            }
        }
        return M(dpcVar, lmaVar);
    }

    public static final boolean H(dpc dpcVar, dpc dpcVar2, int i, lma lmaVar) {
        if (O(dpcVar, dpcVar2, i, lmaVar)) {
            return true;
        }
        d51 d51Var = ((uoc) bcx.G(dpcVar).getFocusOwner()).h;
        d51Var.getClass();
        Boolean bool = (Boolean) ff7.M(dpcVar, i, new pe9(d51Var, ((uoc) bcx.G(dpcVar).getFocusOwner()).l, dpcVar, dpcVar2, i, lmaVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final jho I(ffh ffhVar) {
        Object n = ffhVar.n();
        if (n instanceof jho) {
            return (jho) n;
        }
        return null;
    }

    public static final float J(jho jhoVar) {
        if (jhoVar != null) {
            return jhoVar.a;
        }
        return 0.0f;
    }

    public static Integer K(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1118317585:
                return str.equals("REPEAT_ALL_AND_SHUFFLE") ? 3 : null;
            case -962896020:
                return str.equals("REPEAT_SINGLE") ? 2 : null;
            case 1645938909:
                return str.equals("REPEAT_ALL") ? 1 : null;
            case 1645952171:
                return str.equals("REPEAT_OFF") ? 0 : null;
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean L(dpc dpcVar, lma lmaVar) {
        dpc[] dpcVarArr = new dpc[16];
        if (!dpcVar.a.n) {
            sme.b("visitChildren called on an unattached node");
        }
        eqi eqiVar = new eqi(new xci[16]);
        xci xciVar = dpcVar.a;
        xci xciVar2 = xciVar.f;
        if (xciVar2 == null) {
            bcx.o(eqiVar, xciVar);
        } else {
            eqiVar.d(xciVar2);
        }
        int i = 0;
        while (true) {
            int i2 = eqiVar.c;
            if (i2 == 0) {
                break;
            }
            xci xciVar3 = (xci) eqiVar.m(i2 - 1);
            if ((xciVar3.d & 1024) == 0) {
                bcx.o(eqiVar, xciVar3);
            } else {
                while (true) {
                    if (xciVar3 == null) {
                        break;
                    }
                    if ((xciVar3.c & 1024) != 0) {
                        eqi eqiVar2 = null;
                        while (xciVar3 != null) {
                            if (xciVar3 instanceof dpc) {
                                dpc dpcVar2 = (dpc) xciVar3;
                                int i3 = i + 1;
                                if (dpcVarArr.length < i3) {
                                    int length = dpcVarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(dpcVarArr, 0, r10, 0, length);
                                    dpcVarArr = r10;
                                }
                                dpcVarArr[i] = dpcVar2;
                                i = i3;
                            } else if ((xciVar3.c & 1024) != 0 && (xciVar3 instanceof cw7)) {
                                int i4 = 0;
                                for (xci xciVar4 = ((cw7) xciVar3).p; xciVar4 != null; xciVar4 = xciVar4.f) {
                                    if ((xciVar4.c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            xciVar3 = xciVar4;
                                        } else {
                                            if (eqiVar2 == null) {
                                                eqiVar2 = new eqi(new xci[16]);
                                            }
                                            if (xciVar3 != null) {
                                                eqiVar2.d(xciVar3);
                                                xciVar3 = null;
                                            }
                                            eqiVar2.d(xciVar4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            xciVar3 = bcx.p(eqiVar2);
                        }
                    } else {
                        xciVar3 = xciVar3.f;
                    }
                }
            }
        }
        Arrays.sort(dpcVarArr, 0, i, C1318t.f);
        int i5 = i - 1;
        if (i5 < dpcVarArr.length) {
            while (i5 >= 0) {
                dpc dpcVar3 = dpcVarArr[i5];
                if (ff7.G(dpcVar3) && x(dpcVar3, lmaVar)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean M(dpc dpcVar, lma lmaVar) {
        dpc[] dpcVarArr = new dpc[16];
        if (!dpcVar.a.n) {
            sme.b("visitChildren called on an unattached node");
        }
        eqi eqiVar = new eqi(new xci[16]);
        xci xciVar = dpcVar.a;
        xci xciVar2 = xciVar.f;
        if (xciVar2 == null) {
            bcx.o(eqiVar, xciVar);
        } else {
            eqiVar.d(xciVar2);
        }
        int i = 0;
        while (true) {
            int i2 = eqiVar.c;
            if (i2 == 0) {
                break;
            }
            xci xciVar3 = (xci) eqiVar.m(i2 - 1);
            if ((xciVar3.d & 1024) == 0) {
                bcx.o(eqiVar, xciVar3);
            } else {
                while (true) {
                    if (xciVar3 == null) {
                        break;
                    }
                    if ((xciVar3.c & 1024) != 0) {
                        eqi eqiVar2 = null;
                        while (xciVar3 != null) {
                            if (xciVar3 instanceof dpc) {
                                dpc dpcVar2 = (dpc) xciVar3;
                                int i3 = i + 1;
                                if (dpcVarArr.length < i3) {
                                    int length = dpcVarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(dpcVarArr, 0, r10, 0, length);
                                    dpcVarArr = r10;
                                }
                                dpcVarArr[i] = dpcVar2;
                                i = i3;
                            } else if ((xciVar3.c & 1024) != 0 && (xciVar3 instanceof cw7)) {
                                int i4 = 0;
                                for (xci xciVar4 = ((cw7) xciVar3).p; xciVar4 != null; xciVar4 = xciVar4.f) {
                                    if ((xciVar4.c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            xciVar3 = xciVar4;
                                        } else {
                                            if (eqiVar2 == null) {
                                                eqiVar2 = new eqi(new xci[16]);
                                            }
                                            if (xciVar3 != null) {
                                                eqiVar2.d(xciVar3);
                                                xciVar3 = null;
                                            }
                                            eqiVar2.d(xciVar4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            xciVar3 = bcx.p(eqiVar2);
                        }
                    } else {
                        xciVar3 = xciVar3.f;
                    }
                }
            }
        }
        Arrays.sort(dpcVarArr, 0, i, C1318t.f);
        for (int i5 = 0; i5 < i; i5++) {
            dpc dpcVar3 = dpcVarArr[i5];
            if (ff7.G(dpcVar3) && G(dpcVar3, lmaVar)) {
                return true;
            }
        }
        return false;
    }

    public static final fk0 N(eqp eqpVar, msp mspVar, hq5 hq5Var, int i) {
        eqp eqpVar2;
        msp mspVar2;
        eqpVar.getClass();
        mspVar.getClass();
        long j = d85.m;
        long j2 = ((dq0) ((oq5) hq5Var).j(eq0.a)).c.c;
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        Object obj = gq5.a;
        if (K == obj) {
            K = bmq.a(j);
            oq5Var.k0(K);
        }
        fk0 fk0Var = (fk0) K;
        d85 d85Var = new d85(j2);
        boolean z = true;
        boolean h = ((((i & 14) ^ 6) > 4 && oq5Var.h(eqpVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && oq5Var.h(mspVar)) || (i & 48) == 32) | oq5Var.h(fk0Var) | ((((i & 7168) ^ 3072) > 2048 && oq5Var.e(j2)) || (i & 3072) == 2048);
        if ((((i & 896) ^ 384) <= 256 || !oq5Var.e(j)) && (i & 384) != 256) {
            z = false;
        }
        boolean z2 = h | z;
        Object K2 = oq5Var.K();
        if (z2 || K2 == obj) {
            eqpVar2 = eqpVar;
            mspVar2 = mspVar;
            K2 = new b88(eqpVar2, mspVar2, fk0Var, j2, j, (Continuation) null);
            oq5Var.k0(K2);
        } else {
            eqpVar2 = eqpVar;
            mspVar2 = mspVar;
        }
        gld.x(eqpVar2, mspVar2, d85Var, (Function2) K2, oq5Var);
        return fk0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x019b A[EDGE_INSN: B:151:0x019b->B:132:0x019b BREAK  A[LOOP:5: B:91:0x012c->B:146:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean O(dpc dpcVar, dpc dpcVar2, int i, lma lmaVar) {
        xci xciVar;
        mpf F;
        cr crVar;
        if (dpcVar.U0() != bpc.b) {
            xq0.q("This function should only be used within a parent that has focus.");
            return false;
        }
        dpc[] dpcVarArr = new dpc[16];
        if (!dpcVar.a.n) {
            sme.b("visitChildren called on an unattached node");
        }
        eqi eqiVar = new eqi(new xci[16]);
        xci xciVar2 = dpcVar.a;
        xci xciVar3 = xciVar2.f;
        if (xciVar3 == null) {
            bcx.o(eqiVar, xciVar2);
        } else {
            eqiVar.d(xciVar3);
        }
        int i2 = 0;
        while (true) {
            int i3 = eqiVar.c;
            xciVar = null;
            if (i3 == 0) {
                break;
            }
            xci xciVar4 = (xci) eqiVar.m(i3 - 1);
            if ((xciVar4.d & 1024) == 0) {
                bcx.o(eqiVar, xciVar4);
            } else {
                while (true) {
                    if (xciVar4 == null) {
                        break;
                    }
                    if ((xciVar4.c & 1024) != 0) {
                        eqi eqiVar2 = null;
                        while (xciVar4 != null) {
                            if (xciVar4 instanceof dpc) {
                                dpc dpcVar3 = (dpc) xciVar4;
                                int i4 = i2 + 1;
                                if (dpcVarArr.length < i4) {
                                    int length = dpcVarArr.length;
                                    ?? r11 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(dpcVarArr, 0, r11, 0, length);
                                    dpcVarArr = r11;
                                }
                                dpcVarArr[i2] = dpcVar3;
                                i2 = i4;
                            } else if ((xciVar4.c & 1024) != 0 && (xciVar4 instanceof cw7)) {
                                int i5 = 0;
                                for (xci xciVar5 = ((cw7) xciVar4).p; xciVar5 != null; xciVar5 = xciVar5.f) {
                                    if ((xciVar5.c & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            xciVar4 = xciVar5;
                                        } else {
                                            if (eqiVar2 == null) {
                                                eqiVar2 = new eqi(new xci[16]);
                                            }
                                            if (xciVar4 != null) {
                                                eqiVar2.d(xciVar4);
                                                xciVar4 = null;
                                            }
                                            eqiVar2.d(xciVar5);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            xciVar4 = bcx.p(eqiVar2);
                        }
                    } else {
                        xciVar4 = xciVar4.f;
                    }
                }
            }
        }
        Arrays.sort(dpcVarArr, 0, i2, C1318t.f);
        if (i != 1) {
            if (i != 2) {
                xq0.q("This function should only be used for 1-D focus search");
                return false;
            }
            IntRange m = yhn.m(0, i2);
            int i6 = m.a;
            int i7 = m.b;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        dpc dpcVar4 = dpcVarArr[i7];
                        if (ff7.G(dpcVar4) && x(dpcVar4, lmaVar)) {
                            break;
                        }
                    }
                    if (Intrinsics.d(dpcVarArr[i7], dpcVar2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
                return true;
            }
            if (i != 1) {
                if (!dpcVar.a.n) {
                }
                xci xciVar6 = dpcVar.a.e;
                F = bcx.F(dpcVar);
                loop5: while (true) {
                    if (F == null) {
                    }
                }
                if (xciVar != null) {
                }
            }
            return false;
        }
        IntRange m2 = yhn.m(0, i2);
        int i8 = m2.a;
        int i9 = m2.b;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    dpc dpcVar5 = dpcVarArr[i8];
                    if (ff7.G(dpcVar5) && G(dpcVar5, lmaVar)) {
                        break;
                    }
                }
                if (Intrinsics.d(dpcVarArr[i8], dpcVar2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
            return true;
        }
        if (i != 1 && dpcVar.T0().a) {
            if (!dpcVar.a.n) {
                sme.b("visitAncestors called on an unattached node");
            }
            xci xciVar62 = dpcVar.a.e;
            F = bcx.F(dpcVar);
            loop5: while (true) {
                if (F == null) {
                    break;
                }
                if ((((xci) F.F.f).d & 1024) != 0) {
                    while (xciVar62 != null) {
                        if ((xciVar62.c & 1024) != 0) {
                            xci xciVar7 = xciVar62;
                            eqi eqiVar3 = null;
                            while (xciVar7 != null) {
                                if (xciVar7 instanceof dpc) {
                                    xciVar = xciVar7;
                                    break loop5;
                                }
                                if ((xciVar7.c & 1024) != 0 && (xciVar7 instanceof cw7)) {
                                    int i10 = 0;
                                    for (xci xciVar8 = ((cw7) xciVar7).p; xciVar8 != null; xciVar8 = xciVar8.f) {
                                        if ((xciVar8.c & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                xciVar7 = xciVar8;
                                            } else {
                                                if (eqiVar3 == null) {
                                                    eqiVar3 = new eqi(new xci[16]);
                                                }
                                                if (xciVar7 != null) {
                                                    eqiVar3.d(xciVar7);
                                                    xciVar7 = null;
                                                }
                                                eqiVar3.d(xciVar8);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                xciVar7 = bcx.p(eqiVar3);
                            }
                        }
                        xciVar62 = xciVar62.e;
                    }
                }
                F = F.u();
                xciVar62 = (F == null || (crVar = F.F) == null) ? null : (i4s) crVar.e;
            }
            if (xciVar != null) {
                return ((Boolean) lmaVar.invoke(dpcVar)).booleanValue();
            }
        }
        return false;
    }

    public static jhb P(k7k k7kVar) {
        jhb E = E(k7kVar);
        while (k7kVar.c() && (k7kVar.a() instanceof vms)) {
            lns d = k7kVar.d();
            d.getClass();
            E = new zgb((wms) d, E, E(k7kVar), k7kVar.b);
        }
        return E;
    }

    public static final qo6 Q(elu eluVar) {
        eluVar.getClass();
        int ordinal = eluVar.ordinal();
        if (ordinal == 0) {
            return qo6.b;
        }
        if (ordinal == 1) {
            return qo6.e;
        }
        if (ordinal == 2) {
            return qo6.a;
        }
        if (ordinal == 3) {
            return qo6.d;
        }
        if (ordinal == 4) {
            return qo6.m;
        }
        b6e.s();
        return null;
    }

    public static final pyt R(z1p z1pVar) {
        if (z1pVar instanceof u1p) {
            u1p u1pVar = (u1p) z1pVar;
            oq oqVar = u1pVar.a;
            return new myt(new xc5(oqVar.a), new n3q(oqVar.b), u1pVar.b);
        }
        if (z1pVar instanceof y1p) {
            y1p y1pVar = (y1p) z1pVar;
            cvl cvlVar = y1pVar.a;
            return new nyt(new zc5(cvlVar.c.a, cvlVar.a), new n3q(cvlVar.b), y1pVar.b);
        }
        if (z1pVar instanceof v1p) {
            return new jyt(new yc5(((v1p) z1pVar).a.a));
        }
        if (z1pVar instanceof x1p) {
            cvl cvlVar2 = ((x1p) z1pVar).a;
            return new kyt(new zc5(cvlVar2.c.a, cvlVar2.a));
        }
        if (z1pVar.equals(w1p.c)) {
            return iyt.a;
        }
        if (z1pVar.equals(w1p.b)) {
            return hyt.a;
        }
        if (z1pVar.equals(w1p.d)) {
            return lyt.a;
        }
        if (z1pVar.equals(w1p.e)) {
            return oyt.a;
        }
        if (z1pVar.equals(w1p.a)) {
            return gyt.a;
        }
        b6e.s();
        return null;
    }

    public static final r1u S(VibeButtonDto vibeButtonDto) {
        String title = vibeButtonDto.getTitle();
        if (title == null) {
            return null;
        }
        return new r1u(title, vibeButtonDto.getHeader(), vibeButtonDto.getImgUrl(), vibeButtonDto.getBgImageUrl(), vibeButtonDto.getPosition(), vibeButtonDto.getSquareAgentAnimation());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object T(n7q n7qVar, slw slwVar, s0 s0Var, rgw rgwVar, cg6 cg6Var) {
        izk izkVar;
        int i;
        int K;
        rgw rgwVar2;
        Object z;
        s0 s0Var2;
        aow aowVar;
        i0 i0Var;
        i0 i0Var2;
        List list;
        n7q n7qVar2 = n7qVar;
        slw slwVar2 = slwVar;
        if (cg6Var instanceof izk) {
            izkVar = (izk) cg6Var;
            int i2 = izkVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                izkVar.p = i2 - Integer.MIN_VALUE;
                Object obj = izkVar.o;
                nm6 nm6Var = nm6.a;
                i = izkVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    if (n7qVar2.b() instanceof faq) {
                        ssg.a(2, null, "[ynison] awaiting for active queue", null);
                        return null;
                    }
                    euk eukVar = slwVar2.a;
                    K = euk.K(n7qVar2);
                    izkVar.j = n7qVar2;
                    izkVar.k = slwVar2;
                    izkVar.l = s0Var;
                    rgwVar2 = rgwVar;
                    izkVar.m = rgwVar2;
                    izkVar.n = K;
                    izkVar.p = 1;
                    z = wdg.z(n7qVar2, new cuk(), izkVar);
                    if (z == nm6Var) {
                        return nm6Var;
                    }
                    s0Var2 = s0Var;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i3 = izkVar.n;
                    rgw rgwVar3 = izkVar.m;
                    s0 s0Var3 = izkVar.l;
                    slw slwVar3 = izkVar.k;
                    n7q n7qVar3 = izkVar.j;
                    qgg.h0(obj);
                    K = i3;
                    n7qVar2 = n7qVar3;
                    z = obj;
                    rgwVar2 = rgwVar3;
                    s0Var2 = s0Var3;
                    slwVar2 = slwVar3;
                }
                aowVar = (aow) z;
                if (aowVar != null) {
                    return null;
                }
                fyu fyuVar = aowVar.c;
                boolean z2 = fyuVar instanceof eyu;
                dyu dyuVar = dyu.a;
                if (z2) {
                    List list2 = ((eyu) fyuVar).a;
                    meq k = i0.k();
                    k.h(list2);
                    i0Var = (i0) k.b();
                } else {
                    if (!Intrinsics.d(fyuVar, dyuVar) && fyuVar != null) {
                        b6e.s();
                        return null;
                    }
                    i0Var = null;
                }
                euk eukVar2 = slwVar2.a;
                n7qVar2.getClass();
                gxc gxcVar = (gxc) wdg.A(n7qVar2, klx.e);
                List list3 = aowVar.b;
                rgwVar2.getClass();
                if (rgw.b() && !list3.isEmpty()) {
                    K = yhn.e(K, u75.f(list3));
                }
                int i4 = K;
                w wVar = aowVar.a;
                b0 M = v7g.M(rvf.Q(v7g.x(n7qVar2)));
                if (i0Var == null) {
                    fyu fyuVar2 = (fyu) wdg.A(n7qVar2, l48.i);
                    fyuVar2.getClass();
                    if (fyuVar2 instanceof eyu) {
                        list = ((eyu) fyuVar2).a;
                    } else {
                        if (!fyuVar2.equals(dyuVar)) {
                            b6e.s();
                            return null;
                        }
                        list = null;
                    }
                    if (list == null) {
                        i0Var2 = null;
                        g9p g9pVar = aowVar.d;
                        return v7g.K(wVar, i4, list3, null, gxcVar.a, gxcVar.b, M, i0Var2, s0Var2, g9pVar != null ? o8g.Q(g9pVar) : null);
                    }
                    meq k2 = i0.k();
                    k2.h(list);
                    i0Var = (i0) k2.b();
                }
                i0Var2 = i0Var;
                g9p g9pVar2 = aowVar.d;
                if (g9pVar2 != null) {
                }
                return v7g.K(wVar, i4, list3, null, gxcVar.a, gxcVar.b, M, i0Var2, s0Var2, g9pVar2 != null ? o8g.Q(g9pVar2) : null);
            }
        }
        izkVar = new izk(cg6Var);
        Object obj2 = izkVar.o;
        nm6 nm6Var2 = nm6.a;
        i = izkVar.p;
        if (i != 0) {
        }
        aowVar = (aow) z;
        if (aowVar != null) {
        }
    }

    public static jhb U(k7k k7kVar) {
        jhb P = P(k7kVar);
        if (!k7kVar.c() || !(k7kVar.a() instanceof bns)) {
            return P;
        }
        lns d = k7kVar.d();
        jhb P2 = P(k7kVar);
        d.getClass();
        return new fhb((bns) d, P, P2, k7kVar.b);
    }

    public static jhb V(k7k k7kVar) {
        boolean c = k7kVar.c();
        String str = k7kVar.b;
        if (c && (k7kVar.a() instanceof fns)) {
            lns d = k7kVar.d();
            d.getClass();
            return new ghb((gns) d, V(k7kVar), str);
        }
        jhb y = y(k7kVar, null);
        while (k7kVar.c() && (k7kVar.a() instanceof xms)) {
            k7kVar.b();
            y = y(k7kVar, y);
        }
        if (!k7kVar.c() || !(k7kVar.a() instanceof sms)) {
            return y;
        }
        k7kVar.b();
        return new zgb(sms.a, y, V(k7kVar), str);
    }

    public static final String W(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (StringsKt.N("!#$&'\"()*+,/:;=?@[]{}% ", charAt)) {
                String num = Integer.toString(charAt, CharsKt.checkRadix(16));
                num.getClass();
                String upperCase = "%".concat(num).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                sb.append(upperCase);
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static final fyu X(fyu fyuVar, boolean z) {
        fyuVar.getClass();
        if (!z) {
            if (fyuVar instanceof eyu) {
                List list = ((eyu) fyuVar).a;
                return new eyu(CollectionsKt.h0(list, Integer.valueOf(list.size())));
            }
            if (!fyuVar.equals(dyu.a)) {
                b6e.s();
                return null;
            }
        }
        return fyuVar;
    }

    public static int Y(int i) {
        if (i == 90) {
            return 91;
        }
        if (i == 91) {
            return 92;
        }
        if (i == 93) {
            return 94;
        }
        if (i == 94) {
            return 95;
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                return 32;
            case 32:
                return 33;
            case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                return 34;
            case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                return 35;
            case 35:
                return 36;
            case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                return 44;
            case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                return 45;
            case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                return 46;
            case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                return 47;
            case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                return 48;
            case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                return 49;
            case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                return 50;
            case 50:
                return 51;
            case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                return 52;
            case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                return 53;
            case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                return 54;
            case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                return 55;
            case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                return 56;
            case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                return 57;
            case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case ScreenMirroringConfig.Video.FRAMERATE /* 60 */:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case SQLiteDatabase.OPEN_URI /* 64 */:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case RemoteCameraConfig.Camera.JPEG_QUALITY_70 /* 70 */:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            default:
                switch (i) {
                    case 96:
                        return 97;
                    case 97:
                        return 98;
                    case 98:
                        return 99;
                    case 99:
                        return 100;
                    case 100:
                        return 101;
                    case 101:
                        return 102;
                    case 102:
                        return 103;
                    case 103:
                        return 104;
                    case 104:
                        return 105;
                    case 105:
                        return 106;
                    case 106:
                        return 107;
                    case 107:
                        return 108;
                    case 108:
                        return 109;
                    case 109:
                        return 110;
                    case 110:
                        return 111;
                    case 111:
                        return 112;
                    case 112:
                        return 113;
                    case 113:
                        return 114;
                    case 114:
                        return 115;
                    case 115:
                        return BuildConfig.API_LEVEL;
                    case BuildConfig.API_LEVEL /* 116 */:
                        return 117;
                    case 117:
                        return 118;
                    case 118:
                        return 119;
                    case 119:
                        return 120;
                    case 120:
                        return 121;
                    case 121:
                        return 122;
                    default:
                        return 0;
                }
        }
    }

    public static final void a(Object obj, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(1451072229);
        rq1 rq1Var = rq1.u;
        iz2 iz2Var = b2c.f;
        x2i x2iVar = ild.j;
        cce cceVar = (cce) oq5Var.j(ukg.a);
        if (cceVar == null) {
            cceVar = hs4.C((Context) oq5Var.j(AndroidCompositionLocals_androidKt.b));
        }
        int i2 = i << 3;
        int i3 = (i & 112) | 520 | (i2 & 7168) | (i2 & 57344) | (i2 & 458752) | (i2 & 3670016) | (i2 & 29360128) | (i2 & 234881024) | (i2 & 1879048192);
        oq5Var.a0(2032051394);
        is1 is1Var = new is1(obj, x2iVar, cceVar);
        int i4 = i3 >> 3;
        h4a.a(is1Var, null, yciVar, rq1Var, null, iz2Var, hd6.b, 1.0f, null, 1, oq5Var, (i3 & 112) | (i4 & 896) | (i4 & 7168) | (i4 & 57344) | (i4 & 458752) | (i4 & 3670016) | (i4 & 29360128) | (i4 & 234881024) | ((((i >> 27) & 14) << 27) & 1879048192), 0);
        oq5Var.p(false);
        oq5Var.p(false);
    }

    public static final void b(int i, hq5 hq5Var, yci yciVar, Function0 function0, boolean z) {
        int i2;
        Function0 function02;
        int i3;
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1111939337);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            yci a2 = a.a(yciVar, "button");
            kfh d = ug3.d(b2c.b, false);
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
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            yci t = d.t(vci.a, mu0.j, 0.0f, 2);
            if (z) {
                i3 = -1076530660;
                i4 = R.string.widget_install_button_supported;
            } else {
                i3 = -1076528448;
                i4 = R.string.widget_install_button_not_supported;
            }
            String n = vz1.n(oq5Var, i3, i4, oq5Var, false);
            function02 = function0;
            hdg.b(n, function02, t, null, null, oq5Var, i2 & 112, 24);
            oq5Var.p(true);
        } else {
            function02 = function0;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new egs(z, function02, yciVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(Function0 function0, v1g v1gVar, w3g w3gVar, yci yciVar, boolean z, pyc pycVar, pyc pycVar2, Function0 function02, hq5 hq5Var, int i, int i2) {
        int i3;
        pyc pycVar3;
        int i4;
        pyc pycVar4;
        int i5;
        oq5 oq5Var;
        pyc pycVar5;
        pyc pycVar6;
        xmn r;
        function0.getClass();
        w3gVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1756439783);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? oq5Var2.f(v1gVar) : oq5Var2.h(v1gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var2.f(w3gVar) : oq5Var2.h(w3gVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var2.g(z) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            pycVar3 = pycVar;
            i3 |= oq5Var2.h(pycVar3) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
            } else if ((1572864 & i) == 0) {
                pycVar4 = pycVar2;
                i3 |= oq5Var2.h(pycVar4) ? 1048576 : 524288;
                if ((i & 12582912) == 0) {
                    i3 |= oq5Var2.h(function02) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                }
                i5 = i3;
                if (oq5Var2.P(i5 & 1, (4793491 & i5) != 4793490)) {
                    pycVar5 = i6 != 0 ? null : pycVar3;
                    if (i4 != 0) {
                        pycVar4 = null;
                    }
                    pyc pycVar7 = pycVar4;
                    oq5Var = oq5Var2;
                    j66.p(v1gVar.b, o5g.F(oq5Var2), a.a(yciVar, "playlist_grid_item"), function0, v1gVar.d, function02, pycVar5, ild.C(-484088281, new pu(z, pycVar7, v1gVar, w3gVar, 6), oq5Var2), oq5Var, ((i5 << 9) & 7168) | 12582912 | (458752 & (i5 >> 6)) | ((i5 << 3) & 3670016), 0);
                    pycVar6 = pycVar7;
                } else {
                    oq5Var = oq5Var2;
                    oq5Var.S();
                    pycVar5 = pycVar3;
                    pycVar6 = pycVar4;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new mgf(function0, v1gVar, w3gVar, yciVar, z, pycVar5, pycVar6, function02, i, i2);
                    return;
                }
                return;
            }
            pycVar4 = pycVar2;
            if ((i & 12582912) == 0) {
            }
            i5 = i3;
            if (oq5Var2.P(i5 & 1, (4793491 & i5) != 4793490)) {
            }
            r = oq5Var.r();
            if (r != null) {
            }
        }
        pycVar3 = pycVar;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        pycVar4 = pycVar2;
        if ((i & 12582912) == 0) {
        }
        i5 = i3;
        if (oq5Var2.P(i5 & 1, (4793491 & i5) != 4793490)) {
        }
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void d(ayg aygVar, Function0 function0, yci yciVar, boolean z, wwn wwnVar, dzg dzgVar, g40 g40Var, jd6 jd6Var, boolean z2, hq5 hq5Var, int i, int i2, int i3) {
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(382909894);
        boolean z3 = (i3 & 64) != 0 ? false : z;
        wwn wwnVar2 = (i3 & 128) != 0 ? wwn.a : wwnVar;
        dzg dzgVar2 = (i3 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? null : dzgVar;
        g40 g40Var2 = (i3 & 1024) != 0 ? b2c.f : g40Var;
        jd6 jd6Var2 = (i3 & 2048) != 0 ? hd6.b : jd6Var;
        boolean z4 = (i3 & 4096) != 0 ? true : z2;
        oq5Var.a0(185152185);
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = new czg();
            oq5Var.k0(K);
        }
        czg czgVar = (czg) K;
        oq5Var.p(false);
        oq5Var.a0(185152232);
        Object K2 = oq5Var.K();
        if (K2 == kjnVar) {
            K2 = new Matrix();
            oq5Var.k0(K2);
        }
        Matrix matrix = (Matrix) K2;
        oq5Var.p(false);
        oq5Var.a0(185152312);
        boolean f = oq5Var.f(aygVar);
        Object K3 = oq5Var.K();
        if (f || K3 == kjnVar) {
            K3 = szf.g0(null);
            oq5Var.k0(K3);
        }
        aqi aqiVar = (aqi) K3;
        oq5Var.p(false);
        oq5Var.a0(185152364);
        if (aygVar == null || aygVar.b() == 0.0f) {
            dzg dzgVar3 = dzgVar2;
            boolean z5 = z4;
            ug3.a(yciVar, oq5Var, (i >> 6) & 14);
            oq5Var.p(false);
            xmn r = oq5Var.r();
            if (r != null) {
                r.d = new rxg(aygVar, function0, yciVar, z3, wwnVar2, dzgVar3, g40Var2, jd6Var2, z5, i, i2, i3, 0);
                return;
            }
            return;
        }
        oq5Var.p(false);
        g40 g40Var3 = g40Var2;
        wwn wwnVar3 = wwnVar2;
        jd6 jd6Var3 = jd6Var2;
        Rect rect = aygVar.k;
        Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
        int width = rect.width();
        int height = rect.height();
        yciVar.getClass();
        yci f2 = yciVar.f(new LottieAnimationSizeElement(width, height));
        boolean z6 = z3;
        sxg sxgVar = new sxg(rect, jd6Var3, g40Var3, matrix, czgVar, z6, wwnVar3, aygVar, dzgVar2, z4, context, function0, aqiVar);
        dzg dzgVar4 = dzgVar2;
        boolean z7 = z4;
        ksw.j(0, oq5Var, f2, sxgVar);
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new rxg(aygVar, function0, yciVar, z6, wwnVar3, dzgVar4, g40Var3, jd6Var3, z7, i, i2, i3, 1);
        }
    }

    public static final void e(fvf fvfVar, o0k o0kVar, ArrayList arrayList, l9j l9jVar, hq5 hq5Var, int i) {
        int i2;
        fvfVar.getClass();
        o0kVar.getClass();
        l9jVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(321999712);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(fvfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(o0kVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(arrayList) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(l9jVar) ? 2048 : 1024;
        }
        int i3 = i2;
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            boolean booleanValue = ((Boolean) szf.Q(l9jVar.f, oq5Var).getValue()).booleanValue();
            boolean h = oq5Var.h(l9jVar);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                m9j m9jVar = new m9j(0, l9jVar, l9j.class, "onRefresh", "onRefresh()V", 0, 0);
                oq5Var.k0(m9jVar);
                K = m9jVar;
            }
            bfg.f(booleanValue, (Function0) ((h9f) K), o0kVar, null, false, ild.C(1556508640, new av5(fvfVar, arrayList, o0kVar, l9jVar, 22), oq5Var), oq5Var, ((i3 << 3) & 896) | 196608, 24);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(fvfVar, o0kVar, arrayList, l9jVar, i, 26);
        }
    }

    public static final void f(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1268147459);
        int i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            n7w.w(rvf.M(R.string.rup_block_title, oq5Var), nu0.d(), tah.b(new Pair(1, new fds(0.0f, 12, ((gtu) oq5Var.j(htu.a)).b, v7g.z(24)))), yciVar, 0, 0, oq5Var, (i2 << 9) & 7168, 48);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cxd(yciVar, i, 27);
        }
    }

    public static final void g(Function0 function0, ozl ozlVar, int i, u0s u0sVar, Function2 function2, rzl rzlVar, rzl rzlVar2, ryc rycVar, long j, hq5 hq5Var, int i2) {
        int i3;
        ozl ozlVar2;
        u0s u0sVar2;
        Function2 function22;
        rzl rzlVar3;
        rzl rzlVar4;
        ryc rycVar2;
        long j2;
        ozlVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(470060348);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            ozlVar2 = ozlVar;
            i3 |= oq5Var.f(ozlVar2) ? 32 : 16;
        } else {
            ozlVar2 = ozlVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            u0sVar2 = u0sVar;
            i3 |= oq5Var.h(u0sVar2) ? 2048 : 1024;
        } else {
            u0sVar2 = u0sVar;
        }
        if ((i2 & 24576) == 0) {
            function22 = function2;
            i3 |= oq5Var.h(function22) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            function22 = function2;
        }
        if ((196608 & i2) == 0) {
            rzlVar3 = rzlVar;
            i3 |= oq5Var.h(rzlVar3) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            rzlVar3 = rzlVar;
        }
        if ((1572864 & i2) == 0) {
            rzlVar4 = rzlVar2;
            i3 |= oq5Var.h(rzlVar4) ? 1048576 : 524288;
        } else {
            rzlVar4 = rzlVar2;
        }
        if ((12582912 & i2) == 0) {
            rycVar2 = rycVar;
            i3 |= oq5Var.h(rycVar2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        } else {
            rycVar2 = rycVar;
        }
        if ((100663296 & i2) == 0) {
            j2 = j;
            i3 |= oq5Var.e(j2) ? 67108864 : 33554432;
        } else {
            j2 = j;
        }
        if (oq5Var.P(i3 & 1, (38347923 & i3) != 38347922)) {
            boolean z = ((i3 & 896) == 256) | ((i3 & 14) == 4);
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new qo1(i, function0, 4);
                oq5Var.k0(K);
            }
            int i4 = (i3 & 29360128) | ((i3 >> 3) & 1022) | ((i3 >> 15) & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3);
            u0s u0sVar3 = u0sVar2;
            long j3 = j2;
            ozl ozlVar3 = ozlVar2;
            h(ozlVar3, i, u0sVar3, j3, function22, rzlVar3, rzlVar4, rycVar2, (Function1) K, oq5Var, i4);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fwl(function0, ozlVar, i, u0sVar, function2, rzlVar, rzlVar2, rycVar, j, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    public static final void h(ozl ozlVar, int i, u0s u0sVar, long j, Function2 function2, rzl rzlVar, rzl rzlVar2, ryc rycVar, Function1 function1, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        int i4;
        ?? r2;
        elu eluVar;
        klu kluVar;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-517183474);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.f(ozlVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.d(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.h(u0sVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.e(j) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var2.h(function2) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var2.h(rzlVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i2) == 0) {
            i3 |= oq5Var2.h(rzlVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= oq5Var2.h(rycVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= oq5Var2.h(function1) ? 67108864 : 33554432;
        }
        int i5 = i3;
        if (oq5Var2.P(i5 & 1, (i5 & 38347923) != 38347922)) {
            int i6 = i5 << 3;
            int i7 = ((i5 >> 6) & 14) | (i6 & 112) | (i6 & 896);
            int i8 = i5 >> 12;
            int i9 = i7 | (i8 & 7168);
            boolean f = ((((i9 & 896) ^ 384) > 256 && oq5Var2.d(i)) || (i9 & 384) == 256) | ((((i9 & 112) ^ 48) > 32 && oq5Var2.f(ozlVar)) || (i9 & 48) == 32) | oq5Var2.f(u0sVar);
            Object K = oq5Var2.K();
            if (f || K == gq5.a) {
                i4 = i8;
                r2 = 0;
                K = com.yandex.music.core.ui.compose.a.b(vci.a, null, 0L, 0.0f, null, new gvl(u0sVar, rycVar, ozlVar.b(i), szf.g0(null), 6), 15);
                oq5Var2.k0(K);
            } else {
                i4 = i8;
                r2 = 0;
            }
            yci yciVar = (yci) K;
            if (ozlVar instanceof mzl) {
                oq5Var2.Z(-1364309848);
                yci f2 = ((yci) function1.invoke(Boolean.TRUE)).f(yciVar);
                mzl mzlVar = (mzl) ozlVar;
                if (mzlVar instanceof jzl) {
                    oq5Var2.Z(-1364175401);
                    jzl jzlVar = (jzl) ozlVar;
                    n7w.d(jzlVar.a, (bg5) rzlVar.invoke(jzlVar.b, oq5Var2, Integer.valueOf(i4 & 112)), f2, oq5Var2, r2);
                    oq5Var2.p(r2);
                } else if (mzlVar instanceof kzl) {
                    oq5Var2.Z(-1363866703);
                    kzl kzlVar = (kzl) ozlVar;
                    vut.i(kzlVar.a, (bg5) rzlVar.invoke(kzlVar.b, oq5Var2, Integer.valueOf(i4 & 112)), f2, oq5Var2, r2);
                    oq5Var2.p(r2);
                } else {
                    if (!(mzlVar instanceof lzl)) {
                        throw vz1.i(oq5Var2, 1202918712, r2);
                    }
                    oq5Var2.Z(-1363543714);
                    lzl lzlVar = (lzl) ozlVar;
                    o5g.d(lzlVar.a, (wdj) rzlVar2.invoke(lzlVar.b, oq5Var2, Integer.valueOf((i5 >> 15) & 112)), f2, oq5Var2, r2);
                    oq5Var2.p(r2);
                }
                oq5Var2.p(r2);
                oq5Var = oq5Var2;
            } else {
                if (!(ozlVar instanceof nzl)) {
                    throw vz1.i(oq5Var2, 1202914445, r2);
                }
                oq5Var2.Z(-1363186594);
                owu owuVar = (owu) function2.invoke(oq5Var2, Integer.valueOf(i4 & 14));
                o1u o1uVar = ((nzl) ozlVar).b;
                lnu a2 = o1uVar.a(j);
                String str = o1uVar.g;
                if (str == null) {
                    kluVar = null;
                } else {
                    int ordinal = o1uVar.e.ordinal();
                    if (ordinal == 0 || ordinal == 1) {
                        eluVar = elu.b;
                    } else {
                        if (ordinal != 2) {
                            b6e.s();
                            return;
                        }
                        eluVar = elu.d;
                    }
                    kluVar = new klu(o1uVar.a, o1uVar.b, o1uVar.c, str, c3x.U(j != 16 ? j : oa5.a), eluVar);
                }
                oq5Var = oq5Var2;
                ldg.f(owuVar, a2, kluVar, ((yci) function1.invoke(Boolean.FALSE)).f(yciVar), oq5Var, 0);
                oq5Var.p(false);
            }
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new fwl(ozlVar, i, u0sVar, j, function2, rzlVar, rzlVar2, rycVar, function1, i2);
        }
    }

    public static final void i(final nkm nkmVar, Function0 function0, yci yciVar, wn5 wn5Var, hq5 hq5Var, int i) {
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-178089772);
        int i2 = i | (oq5Var.f(nkmVar) ? 4 : 2) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            final int i3 = 0;
            wn5 C = ild.C(1693897554, new Function2() { // from class: mkm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = i3;
                    vci vciVar = vci.a;
                    nkm nkmVar2 = nkmVar;
                    switch (i4) {
                        case 0:
                            hq5 hq5Var2 = (hq5) obj;
                            int intValue = ((Integer) obj2).intValue();
                            oq5 oq5Var2 = (oq5) hq5Var2;
                            if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                                kfh d = ug3.d(b2c.b, false);
                                int i5 = oq5Var2.P;
                                androidx.compose.runtime.internal.a l = oq5Var2.l();
                                yci H = vnj.H(oq5Var2, vciVar);
                                xp5.T.getClass();
                                grb grbVar = wp5.b;
                                oq5Var2.d0();
                                if (oq5Var2.O) {
                                    oq5Var2.k(grbVar);
                                } else {
                                    oq5Var2.n0();
                                }
                                g0g.U(oq5Var2, d, wp5.f);
                                g0g.U(oq5Var2, l, wp5.e);
                                kb5 kb5Var = wp5.g;
                                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                                    ouj.x(i5, oq5Var2, i5, kb5Var);
                                }
                                g0g.U(oq5Var2, H, wp5.d);
                                qo6 qo6Var = qo6.c;
                                e9g e9gVar = e9g.a;
                                float s = lsq.s(e9gVar);
                                String str = nkmVar2.a;
                                yci m = d.m(vciVar, s);
                                qo6 qo6Var2 = qo6.b;
                                tgo r = lsq.r(e9gVar, qo6Var2, oq5Var2, 54);
                                long j = d85.b;
                                irf.y(str, qo6Var, m, false, false, new d43(d85.b(j, 0.2f, 0.0f, 0.0f, 0.0f, 14), 24), null, r, oq5Var2, 48, 88);
                                ug3.a(androidx.compose.foundation.a.b(xp3.u(d.m(vciVar, s), lsq.r(e9gVar, qo6Var2, oq5Var2, 54)), d85.b(j, 0.2f, 0.0f, 0.0f, 0.0f, 14), vnj.i), oq5Var2, 0);
                                gae.b(a0g.E(R.drawable.ic_lock_mid_24, 0, oq5Var2), null, a.a(b.a.a(vciVar, b2c.h), "lock_icon"), d85.b(d85.f, 0.9f, 0.0f, 0.0f, 0.0f, 14), oq5Var2, 3120, 0);
                                oq5Var2.p(true);
                            } else {
                                oq5Var2.S();
                            }
                            break;
                        default:
                            hq5 hq5Var3 = (hq5) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            oq5 oq5Var3 = (oq5) hq5Var3;
                            if (oq5Var3.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                                yci d2 = d.d(vciVar, 1.0f);
                                ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var3, 0);
                                int i6 = oq5Var3.P;
                                androidx.compose.runtime.internal.a l2 = oq5Var3.l();
                                yci H2 = vnj.H(oq5Var3, d2);
                                xp5.T.getClass();
                                grb grbVar2 = wp5.b;
                                oq5Var3.d0();
                                if (oq5Var3.O) {
                                    oq5Var3.k(grbVar2);
                                } else {
                                    oq5Var3.n0();
                                }
                                g0g.U(oq5Var3, a2, wp5.f);
                                g0g.U(oq5Var3, l2, wp5.e);
                                kb5 kb5Var2 = wp5.g;
                                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i6))) {
                                    ouj.x(i6, oq5Var3, i6, kb5Var2);
                                }
                                g0g.U(oq5Var3, H2, wp5.d);
                                if (nkmVar2.b == null) {
                                    oq5Var3.Z(-2055725261);
                                } else {
                                    oq5Var3.Z(-2055725260);
                                    jzb jzbVar = nkmVar2.e;
                                    bg3.a(null, null, false, ild.C(-1741843141, new qt(nkmVar2, ox6.E(jzbVar, 0L, oq5Var3, 6), jzbVar != null, 11), oq5Var3), oq5Var3, 3072, 7);
                                }
                                oq5Var3.p(false);
                                float f = mu0.a;
                                u1g.l(oq5Var3, d.e(vciVar, f));
                                String str2 = nkmVar2.c;
                                ges i7 = nu0.i();
                                agr agrVar = eq0.a;
                                xv7.j(str2, d.d(a.a(vciVar, "artist_name"), 1.0f), ((dq0) oq5Var3.j(agrVar)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, i7, oq5Var3, 48, 3120, 55288);
                                oq5 oq5Var4 = oq5Var3;
                                String str3 = nkmVar2.d;
                                if (str3 == null) {
                                    oq5Var4.Z(-2054212709);
                                } else {
                                    oq5Var4.Z(-2054212708);
                                    u1g.l(oq5Var4, d.e(vciVar, f));
                                    xv7.j(str3, d.d(a.a(vciVar, "release_date_with_type"), 1.0f), ((dq0) oq5Var4.j(agrVar)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.i(), oq5Var4, 48, 3120, 55288);
                                    oq5Var4 = oq5Var4;
                                }
                                oq5Var4.p(false);
                                oq5Var4.p(true);
                            } else {
                                oq5Var3.S();
                            }
                            break;
                    }
                    return Unit.a;
                }
            }, oq5Var);
            final int i4 = 1;
            ngg.i(function0, yciVar, C, false, 0L, null, wn5Var, 0.0f, null, ild.C(1403141593, new Function2() { // from class: mkm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i4;
                    vci vciVar = vci.a;
                    nkm nkmVar2 = nkmVar;
                    switch (i42) {
                        case 0:
                            hq5 hq5Var2 = (hq5) obj;
                            int intValue = ((Integer) obj2).intValue();
                            oq5 oq5Var2 = (oq5) hq5Var2;
                            if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                                kfh d = ug3.d(b2c.b, false);
                                int i5 = oq5Var2.P;
                                androidx.compose.runtime.internal.a l = oq5Var2.l();
                                yci H = vnj.H(oq5Var2, vciVar);
                                xp5.T.getClass();
                                grb grbVar = wp5.b;
                                oq5Var2.d0();
                                if (oq5Var2.O) {
                                    oq5Var2.k(grbVar);
                                } else {
                                    oq5Var2.n0();
                                }
                                g0g.U(oq5Var2, d, wp5.f);
                                g0g.U(oq5Var2, l, wp5.e);
                                kb5 kb5Var = wp5.g;
                                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                                    ouj.x(i5, oq5Var2, i5, kb5Var);
                                }
                                g0g.U(oq5Var2, H, wp5.d);
                                qo6 qo6Var = qo6.c;
                                e9g e9gVar = e9g.a;
                                float s = lsq.s(e9gVar);
                                String str = nkmVar2.a;
                                yci m = d.m(vciVar, s);
                                qo6 qo6Var2 = qo6.b;
                                tgo r = lsq.r(e9gVar, qo6Var2, oq5Var2, 54);
                                long j = d85.b;
                                irf.y(str, qo6Var, m, false, false, new d43(d85.b(j, 0.2f, 0.0f, 0.0f, 0.0f, 14), 24), null, r, oq5Var2, 48, 88);
                                ug3.a(androidx.compose.foundation.a.b(xp3.u(d.m(vciVar, s), lsq.r(e9gVar, qo6Var2, oq5Var2, 54)), d85.b(j, 0.2f, 0.0f, 0.0f, 0.0f, 14), vnj.i), oq5Var2, 0);
                                gae.b(a0g.E(R.drawable.ic_lock_mid_24, 0, oq5Var2), null, a.a(b.a.a(vciVar, b2c.h), "lock_icon"), d85.b(d85.f, 0.9f, 0.0f, 0.0f, 0.0f, 14), oq5Var2, 3120, 0);
                                oq5Var2.p(true);
                            } else {
                                oq5Var2.S();
                            }
                            break;
                        default:
                            hq5 hq5Var3 = (hq5) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            oq5 oq5Var3 = (oq5) hq5Var3;
                            if (oq5Var3.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                                yci d2 = d.d(vciVar, 1.0f);
                                ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var3, 0);
                                int i6 = oq5Var3.P;
                                androidx.compose.runtime.internal.a l2 = oq5Var3.l();
                                yci H2 = vnj.H(oq5Var3, d2);
                                xp5.T.getClass();
                                grb grbVar2 = wp5.b;
                                oq5Var3.d0();
                                if (oq5Var3.O) {
                                    oq5Var3.k(grbVar2);
                                } else {
                                    oq5Var3.n0();
                                }
                                g0g.U(oq5Var3, a2, wp5.f);
                                g0g.U(oq5Var3, l2, wp5.e);
                                kb5 kb5Var2 = wp5.g;
                                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i6))) {
                                    ouj.x(i6, oq5Var3, i6, kb5Var2);
                                }
                                g0g.U(oq5Var3, H2, wp5.d);
                                if (nkmVar2.b == null) {
                                    oq5Var3.Z(-2055725261);
                                } else {
                                    oq5Var3.Z(-2055725260);
                                    jzb jzbVar = nkmVar2.e;
                                    bg3.a(null, null, false, ild.C(-1741843141, new qt(nkmVar2, ox6.E(jzbVar, 0L, oq5Var3, 6), jzbVar != null, 11), oq5Var3), oq5Var3, 3072, 7);
                                }
                                oq5Var3.p(false);
                                float f = mu0.a;
                                u1g.l(oq5Var3, d.e(vciVar, f));
                                String str2 = nkmVar2.c;
                                ges i7 = nu0.i();
                                agr agrVar = eq0.a;
                                xv7.j(str2, d.d(a.a(vciVar, "artist_name"), 1.0f), ((dq0) oq5Var3.j(agrVar)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, i7, oq5Var3, 48, 3120, 55288);
                                oq5 oq5Var4 = oq5Var3;
                                String str3 = nkmVar2.d;
                                if (str3 == null) {
                                    oq5Var4.Z(-2054212709);
                                } else {
                                    oq5Var4.Z(-2054212708);
                                    u1g.l(oq5Var4, d.e(vciVar, f));
                                    xv7.j(str3, d.d(a.a(vciVar, "release_date_with_type"), 1.0f), ((dq0) oq5Var4.j(agrVar)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.i(), oq5Var4, 48, 3120, 55288);
                                    oq5Var4 = oq5Var4;
                                }
                                oq5Var4.p(false);
                                oq5Var4.p(true);
                            } else {
                                oq5Var3.S();
                            }
                            break;
                    }
                    return Unit.a;
                }
            }, oq5Var), oq5Var, ((i2 >> 6) & 112) | 806882694, 432);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gvl(i, 11, nkmVar, function0, yciVar, wn5Var);
        }
    }

    public static final void j(uft uftVar, boolean z, Function1 function1, hq5 hq5Var, int i) {
        int i2;
        uftVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1279008868);
        if ((i & 6) == 0) {
            i2 = (oq5Var.d(uftVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(function1) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object K = oq5Var.K();
            if (z2 || K == gq5.a) {
                K = new r5n(function1, uftVar, 0);
                oq5Var.k0(K);
            }
            w1g.g(z, ild.C(-394171623, new s5n(uftVar, 0), oq5Var), ild.C(-1096767462, new s5n(uftVar, 1), oq5Var), ild.C(-1799363301, new k4m(3, z), oq5Var), androidx.compose.foundation.a.e(vci.a, false, null, null, (Function0) K, 7), oq5Var, ((i2 >> 3) & 14) | 3504);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yj(uftVar, z, function1, i, 5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0212, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r12.K(), java.lang.Integer.valueOf(r14)) == false) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(String str, Function1 function1, wn5 wn5Var, boolean z, Function0 function0, Function0 function02, yoc yocVar, Function1 function12, Function0 function03, hq5 hq5Var, int i) {
        wn5 wn5Var2;
        yoc yocVar2;
        String str2;
        Function1 function13;
        uoi uoiVar;
        int i2;
        kb5 kb5Var;
        aqi aqiVar;
        Function1 function14 = function12;
        str.getClass();
        function1.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1818673852);
        int i3 = i | (oq5Var.f(str) ? 4 : 2) | (oq5Var.h(function1) ? 32 : 16) | (oq5Var.g(z) ? 2048 : 1024) | (oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.h(function14) ? 67108864 : 33554432) | (oq5Var.h(function03) ? 536870912 : 268435456);
        if (oq5Var.P(i3 & 1, (306783379 & i3) != 306783378)) {
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = szf.g0(Boolean.FALSE);
                oq5Var.k0(K);
            }
            aqi aqiVar2 = (aqi) K;
            Object K2 = oq5Var.K();
            if (K2 == obj) {
                K2 = szf.g0(new ybs(str, 0L, 6));
                oq5Var.k0(K2);
            }
            aqi aqiVar3 = (aqi) K2;
            Object K3 = oq5Var.K();
            if (K3 == obj) {
                K3 = szf.g0(Boolean.FALSE);
                oq5Var.k0(K3);
            }
            aqi aqiVar4 = (aqi) K3;
            Object[] objArr = new Object[0];
            Object K4 = oq5Var.K();
            if (K4 == obj) {
                K4 = new e5o(15);
                oq5Var.k0(K4);
            }
            aqi aqiVar5 = (aqi) o2g.g0(objArr, null, (Function0) K4, oq5Var, 0, 6);
            boolean z2 = z && !((Boolean) aqiVar2.getValue()).booleanValue();
            Object K5 = oq5Var.K();
            if (K5 == obj) {
                K5 = vz1.h(oq5Var);
            }
            uoi uoiVar2 = (uoi) K5;
            boolean z3 = (1879048192 & i3) == 536870912;
            Object K6 = oq5Var.K();
            Continuation continuation = null;
            if (z3 || K6 == obj) {
                K6 = new kun(uoiVar2, function03, yocVar, continuation, 12);
                uoiVar = uoiVar2;
                oq5Var.k0(K6);
            } else {
                uoiVar = uoiVar2;
            }
            gld.w(oq5Var, uoiVar, (Function2) K6);
            int i4 = i3 & 14;
            boolean z4 = i4 == 4;
            Object K7 = oq5Var.K();
            if (z4 || K7 == obj) {
                i2 = i3;
                K7 = new seg(str, aqiVar3, (Continuation) null, 29);
                oq5Var.k0(K7);
            } else {
                i2 = i3;
            }
            gld.w(oq5Var, str, (Function2) K7);
            Boolean bool = (Boolean) aqiVar4.getValue();
            bool.getClass();
            Boolean bool2 = (Boolean) aqiVar5.getValue();
            bool2.getClass();
            boolean f = oq5Var.f(aqiVar5);
            Object K8 = oq5Var.K();
            if (f || K8 == obj) {
                K8 = new l1p(yocVar, aqiVar4, aqiVar5, null, 0);
                oq5Var.k0(K8);
            }
            gld.y(bool, bool2, (Function2) K8, oq5Var);
            vci vciVar = vci.a;
            float f2 = 40;
            uoi uoiVar3 = uoiVar;
            float f3 = 8;
            yci p = androidx.compose.foundation.layout.a.p(d.g(gut.p1(d.d(vciVar, 1.0f)), f2, 0.0f, 2), 2, f3, 16, f3);
            hz2 hz2Var = b2c.l;
            x2i x2iVar = qx0.a;
            nho a2 = lho.a(x2iVar, hz2Var, oq5Var, 48);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, p);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var2 = wp5.f;
            g0g.U(oq5Var, a2, kb5Var2);
            kb5 kb5Var3 = wp5.e;
            g0g.U(oq5Var, l, kb5Var3);
            kb5 kb5Var4 = wp5.g;
            if (oq5Var.O) {
                kb5Var = kb5Var3;
            } else {
                kb5Var = kb5Var3;
            }
            ouj.x(i5, oq5Var, i5, kb5Var4);
            kb5 kb5Var5 = wp5.d;
            g0g.U(oq5Var, H, kb5Var5);
            boolean z5 = (i2 & 57344) == 16384;
            Object K9 = oq5Var.K();
            if (z5 || K9 == obj) {
                K9 = new g1j(13, function0);
                oq5Var.k0(K9);
            }
            float f4 = 48;
            kb5 kb5Var6 = kb5Var;
            aae.a((Function0) K9, d.m(vciVar, f4), false, ild.C(-1804385468, new k4m(4, z2), oq5Var), oq5Var, 24624, 12);
            yci g = d.g(vciVar, f2, 0.0f, 2);
            agr agrVar = eq0.a;
            yci b = androidx.compose.foundation.a.b(g, ((dq0) oq5Var.j(agrVar)).c.c, ugo.a);
            nho a3 = lho.a(x2iVar, hz2Var, oq5Var, 48);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, b);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var2);
            g0g.U(oq5Var, l2, kb5Var6);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var4);
            }
            g0g.U(oq5Var, H2, kb5Var5);
            ybs ybsVar = (ybs) aqiVar3.getValue();
            rbf rbfVar = new rbf(rbf.f.a, Boolean.FALSE, 1, 3, Boolean.TRUE);
            f3r f3rVar = new f3r(((dq0) oq5Var.j(agrVar)).b.d);
            ges b2 = ges.b(nu0.j(), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, null, 0L, 0, 0L, null, null, 0, 0, 16711678);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            yocVar2 = yocVar;
            yci a4 = androidx.compose.ui.focus.a.a(a.a(d.g(new LayoutWeightElement(true, 1.0f), f4, 0.0f, 2), "search_input"), yocVar2);
            boolean z6 = (i2 & 234881024) == 67108864;
            Object K10 = oq5Var.K();
            if (z6 || K10 == obj) {
                function14 = function12;
                aqiVar = aqiVar3;
                K10 = new ti6(function14, aqiVar2, aqiVar, 2);
                oq5Var.k0(K10);
            } else {
                function14 = function12;
                aqiVar = aqiVar3;
            }
            yci b3 = androidx.compose.ui.focus.a.b(a4, (Function1) K10);
            Object K11 = oq5Var.K();
            if (K11 == obj) {
                K11 = new x80(aqiVar4, 21);
                oq5Var.k0(K11);
            }
            yci d = androidx.compose.ui.layout.a.d(b3, (Function1) K11);
            boolean z7 = (i4 == 4) | ((i2 & 112) == 32);
            Object K12 = oq5Var.K();
            if (z7 || K12 == obj) {
                str2 = str;
                function13 = function1;
                K12 = new p3e(20, str2, function13, aqiVar);
                oq5Var.k0(K12);
            } else {
                str2 = str;
                function13 = function1;
            }
            wn5Var2 = wn5Var;
            nv2.a(ybsVar, (Function1) K12, d, false, b2, rbfVar, null, true, 0, 0, null, null, uoiVar3, f3rVar, ild.C(963216351, new vtb(24, str2, function02, wn5Var2), oq5Var), oq5Var, 100663296, 199680, 7832);
            oq5Var = oq5Var;
            oq5Var.p(true);
            oq5Var.p(true);
        } else {
            wn5Var2 = wn5Var;
            yocVar2 = yocVar;
            str2 = str;
            function13 = function1;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k1p(str2, function13, wn5Var2, z, function0, function02, yocVar2, function14, function03, i);
        }
    }

    public static final void l(hq5 hq5Var, yci yciVar) {
        r30 r30Var = r30.m;
        oq5 oq5Var = (oq5) hq5Var;
        int i = oq5Var.P;
        yci H = vnj.H(hq5Var, yciVar);
        androidx.compose.runtime.internal.a l = oq5Var.l();
        xp5.T.getClass();
        grb grbVar = wp5.b;
        j5 j5Var = oq5Var.a;
        oq5Var.d0();
        if (oq5Var.O) {
            oq5Var.k(grbVar);
        } else {
            oq5Var.n0();
        }
        g0g.U(hq5Var, r30Var, wp5.f);
        g0g.U(hq5Var, l, wp5.e);
        g0g.U(hq5Var, H, wp5.d);
        kb5 kb5Var = wp5.g;
        if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
            ouj.x(i, oq5Var, i, kb5Var);
        }
        oq5Var.p(true);
    }

    public static final void m(por porVar, Function0 function0, Function0 function02, yci yciVar, hq5 hq5Var, int i) {
        porVar.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1592593224);
        int i2 = i | (oq5Var.f(porVar) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.h(function02) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            float f = 2;
            yci d = d.d(d.e(androidx.compose.foundation.layout.a.q(yciVar, 0.0f, 24, 0.0f, 0.0f, 13), (9 * f) + ff7.P(nu0.j().b.c, oq5Var) + f + ff7.P(nu0.i().b.c, oq5Var)), 1.0f);
            if (porVar instanceof nor) {
                oq5Var.Z(-1473709796);
                oq5Var.p(false);
            } else if (porVar instanceof oor) {
                oq5Var.Z(-1473708031);
                vor.a((oor) porVar, function0, d, oq5Var, i2 & 126);
                oq5Var.p(false);
            } else if (porVar instanceof mor) {
                oq5Var.Z(-1473702201);
                w1g.l(d, oq5Var, 0);
                oq5Var.p(false);
            } else {
                if (!(porVar instanceof lor)) {
                    throw vz1.i(oq5Var, -1473711247, false);
                }
                oq5Var.Z(1559996957);
                p1g.p(function02, androidx.compose.foundation.layout.a.q(yciVar, 0.0f, 16, 0.0f, 0.0f, 13), oq5Var, (i2 >> 6) & 14);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gvl(i, 27, porVar, function0, function02, yciVar);
        }
    }

    public static final void n(boolean z, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-944699729);
        if ((i & 6) == 0) {
            i2 = i | (oq5Var2.g(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (oq5Var2.P(i2 & 1, (i2 & 3) != 2)) {
            float f = 24;
            vci vciVar = vci.a;
            yci a2 = a.a(androidx.compose.foundation.layout.a.o(vciVar, f, 0.0f, 2), "title");
            String M = rvf.M(R.string.widget_install_title, oq5Var2);
            ges c = nu0.c();
            agr agrVar = eq0.a;
            xcs.b(M, a2, ((dq0) oq5Var2.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, c, oq5Var2, 48, 0, 65016);
            l(oq5Var2, d.e(vciVar, 12));
            yci a3 = a.a(androidx.compose.foundation.layout.a.o(vciVar, f, 0.0f, 2), "subtitle");
            if (z) {
                i3 = -1618322896;
                i4 = R.string.widget_install_subtitle_supported;
                z3 = false;
            } else {
                z3 = false;
                i3 = -1618320620;
                i4 = R.string.widget_install_subtitle_not_supported;
            }
            String n = vz1.n(oq5Var2, i3, i4, oq5Var2, z3);
            oq5Var = oq5Var2;
            z2 = z3;
            xcs.b(n, a3, ((dq0) oq5Var2.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 48, 0, 65016);
        } else {
            oq5Var = oq5Var2;
            z2 = false;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vf4(i, 8, z, z2);
        }
    }

    public static final void o(int i, long j, hq5 hq5Var, yci yciVar, Function0 function0) {
        int i2;
        yci yciVar2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1515917617);
        int i3 = (oq5Var.h(function0) ? 4 : 2) | i | 176;
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            oq5Var.U();
            if ((i & 1) == 0 || oq5Var.y()) {
                j = ((dq0) oq5Var.j(eq0.a)).a.a;
                i2 = i3 & (-897);
                yciVar2 = vci.a;
            } else {
                oq5Var.S();
                i2 = i3 & (-897);
                yciVar2 = yciVar;
            }
            oq5Var.q();
            aae.a(function0, a.a(yciVar2, "trailer_button"), false, ild.C(-383628083, new bu0(j, 10), oq5Var), oq5Var, (i2 & 14) | 24576, 12);
        }
        long j2 = j;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xt4(function0, yciVar2, j2, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x010a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r10.K(), java.lang.Integer.valueOf(r9)) == false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void p(Function0 function0, boolean z, onu onuVar, yci yciVar, Function1 function1, Function0 function02, hq5 hq5Var, int i, int i2) {
        int i3;
        Function1 function12;
        int i4;
        Object K;
        yci yciVar2;
        Function1 function13;
        boolean z2;
        Function0 function03;
        Function1 function14;
        xmn r;
        gz2 gz2Var = b2c.o;
        function0.getClass();
        onuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1844916652);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.d(onuVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            function12 = function1;
            i3 |= oq5Var.h(function12) ? 16384 : RemoteCameraConfig.Notification.ID;
            i4 = i3 | 196608;
            if ((74899 & i4) == 74898 || !oq5Var.z()) {
                Continuation continuation = null;
                if (i5 != 0) {
                    function12 = null;
                }
                K = oq5Var.K();
                if (K == gq5.a) {
                    K = new s2(28);
                    oq5Var.k0(K);
                }
                Function0 function04 = (Function0) K;
                vci vciVar = vci.a;
                int i6 = 1;
                if (function12 == null) {
                    float f = gvr.a;
                    yciVar2 = vciVar.f(new SuspendPointerInputElement(function12, null, null, new dur(new veo(function12, continuation, i6)), 6));
                } else {
                    yciVar2 = vciVar;
                }
                yci f2 = yciVar.f(yciVar2);
                ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                int i7 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, f2);
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
                if (oq5Var.O) {
                    function13 = function12;
                } else {
                    function13 = function12;
                }
                ouj.x(i7, oq5Var, i7, kb5Var3);
                kb5 kb5Var4 = wp5.d;
                g0g.U(oq5Var, H, kb5Var4);
                if (onuVar != onu.a) {
                    oq5Var.Z(1785763538);
                    HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(gz2Var);
                    if (1.0f <= 0.0d) {
                        qme.a("invalid weight; must be greater than zero");
                    }
                    yci f3 = horizontalAlignElement.f(new LayoutWeightElement(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f));
                    iz2 iz2Var = b2c.f;
                    kfh d = ug3.d(iz2Var, false);
                    int i8 = oq5Var.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var.l();
                    yci H2 = vnj.H(oq5Var, f3);
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, d, kb5Var);
                    g0g.U(oq5Var, l2, kb5Var2);
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                        ouj.x(i8, oq5Var, i8, kb5Var3);
                    }
                    g0g.U(oq5Var, H2, kb5Var4);
                    z2 = false;
                    f(androidx.compose.ui.graphics.a.a(b.a.a(vciVar, iz2Var), new p24(function04, 0.5f)), oq5Var, 0);
                    oq5Var.p(true);
                } else {
                    z2 = false;
                    oq5Var.Z(1783435128);
                }
                oq5Var.p(z2);
                a0g.x((i4 & 14) | ((i4 << 3) & 896), 0, oq5Var, androidx.compose.ui.graphics.a.a(new HorizontalAlignElement(gz2Var), new p24(function04, 0.7f)), rvf.M(R.string.listen, oq5Var), function0, z);
                oq5Var.p(true);
                function03 = function04;
                function14 = function13;
            } else {
                oq5Var.S();
                function03 = function02;
                function14 = function12;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new tp(function0, z, onuVar, yciVar, function14, function03, i, i2, 7);
                return;
            }
            return;
        }
        function12 = function1;
        i4 = i3 | 196608;
        if ((74899 & i4) == 74898) {
        }
        Continuation continuation2 = null;
        if (i5 != 0) {
        }
        K = oq5Var.K();
        if (K == gq5.a) {
        }
        Function0 function042 = (Function0) K;
        vci vciVar2 = vci.a;
        int i62 = 1;
        if (function12 == null) {
        }
        yci f22 = yciVar.f(yciVar2);
        ta5 a22 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
        int i72 = oq5Var.P;
        androidx.compose.runtime.internal.a l3 = oq5Var.l();
        yci H3 = vnj.H(oq5Var, f22);
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
        if (oq5Var.O) {
        }
        ouj.x(i72, oq5Var, i72, kb5Var32);
        kb5 kb5Var42 = wp5.d;
        g0g.U(oq5Var, H3, kb5Var42);
        if (onuVar != onu.a) {
        }
        oq5Var.p(z2);
        a0g.x((i4 & 14) | ((i4 << 3) & 896), 0, oq5Var, androidx.compose.ui.graphics.a.a(new HorizontalAlignElement(gz2Var), new p24(function042, 0.7f)), rvf.M(R.string.listen, oq5Var), function0, z);
        oq5Var.p(true);
        function03 = function042;
        function14 = function13;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void q(int i, hq5 hq5Var, yci yciVar, Function0 function0, Function0 function02) {
        Function0 function03;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1430523829);
        int i2 = (oq5Var.h(function0) ? 4 : 2) | i | (oq5Var.h(function02) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            function03 = function0;
        } else {
            function03 = function0;
            a0g.x((i2 & 14) | 384, 0, oq5Var, androidx.compose.ui.graphics.a.a(yciVar, new p24(function02, 0.7f)), rvf.M(R.string.listen, oq5Var), function03, false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i9m(function03, yciVar, function02, i);
        }
    }

    public static final void r(onu onuVar, yci yciVar, Function0 function0, hq5 hq5Var, int i) {
        onuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(669329009);
        if ((((oq5Var.d(onuVar.ordinal()) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16) | (oq5Var.h(function0) ? 256 : 128)) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (onuVar == onu.a) {
                oq5Var.Z(-1552444413);
                kfh d = ug3.d(b2c.b, false);
                int i2 = oq5Var.P;
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
                g0g.U(oq5Var, d, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                    ouj.x(i2, oq5Var, i2, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                f(androidx.compose.ui.graphics.a.a(b.a.a(vci.a, b2c.f), new p24(function0, 0.5f)), oq5Var, 0);
                oq5Var.p(true);
            } else {
                oq5Var.Z(-1555786895);
            }
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kws(i, 12, yciVar, onuVar, function0);
        }
    }

    public static final void s(List list, boolean z, q0v q0vVar, hq5 hq5Var, int i) {
        boolean z2;
        List list2 = list;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1057814083);
        int i2 = i | (oq5Var.f(list2) ? 4 : 2) | (oq5Var.g(z) ? 32 : 16) | (oq5Var.h(q0vVar) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            gz2 gz2Var = b2c.o;
            vci vciVar = vci.a;
            yci a2 = a.a(vciVar, "widget_onboarding_screen");
            ta5 a3 = sa5.a(qx0.c, gz2Var, oq5Var, 48);
            int i3 = oq5Var.P;
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            int i4 = i2 & 14;
            boolean z3 = i4 == 4;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z3 || K == kjnVar) {
                K = new zga(list2, 7);
                oq5Var.k0(K);
            }
            fp7 b = r3k.b(0, (Function0) K, oq5Var, 6, 2);
            float f = 28;
            l(oq5Var, d.e(vciVar, f));
            int i5 = (i2 >> 3) & 14;
            n(z, oq5Var, i5);
            l(oq5Var, d.e(vciVar, f));
            float f2 = 16;
            boolean z4 = false;
            fxf.e(b, a.a(vciVar, "carousel"), androidx.compose.foundation.layout.a.a(f2, 0.0f, 2), null, f2, 0L, 0L, ild.C(-679456940, new t31(24, list2), oq5Var), oq5Var, 12607920);
            l(oq5Var, d.e(vciVar, 20));
            boolean z5 = (i2 & 896) == 256;
            if (i4 == 4) {
                z4 = true;
            }
            boolean f3 = z5 | z4 | oq5Var.f(b);
            Object K2 = oq5Var.K();
            if (f3 || K2 == kjnVar) {
                list2 = list;
                K2 = new ftr(16, q0vVar, list2, b);
                oq5Var.k0(K2);
            } else {
                list2 = list;
            }
            z2 = z;
            b(i5 | 384, oq5Var, d.g(vciVar, 80, 0.0f, 2), (Function0) K2, z2);
            oq5Var.p(true);
        } else {
            z2 = z;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new smv(list2, z2, q0vVar, i, 1);
        }
    }

    public static final void t(List list, boolean z, q0v q0vVar, hq5 hq5Var, int i) {
        list.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(526382001);
        int i2 = (oq5Var.f(list) ? 4 : 2) | i | (oq5Var.g(z) ? 32 : 16) | (oq5Var.h(q0vVar) ? 256 : 128);
        if (!oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            oq5Var.S();
        } else if (c3x.L(oq5Var)) {
            oq5Var.Z(520897525);
            u(list, z, q0vVar, oq5Var, i2 & 1022);
            oq5Var.p(false);
        } else {
            oq5Var.Z(521089725);
            s(list, z, q0vVar, oq5Var, i2 & 1022);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new smv(list, z, q0vVar, i, 0);
        }
    }

    public static final void u(List list, boolean z, q0v q0vVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1029851109);
        int i2 = (oq5Var.f(list) ? 4 : 2) | i | (oq5Var.g(z) ? 32 : 16) | (oq5Var.h(q0vVar) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            bg3.a(d.d(vci.a, 1.0f), null, false, ild.C(1993135621, new qt(list, z, q0vVar, 15), oq5Var), oq5Var, 3078, 6);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new smv(list, z, q0vVar, i, 2);
        }
    }

    public static jhb v(k7k k7kVar) {
        jhb B = B(k7kVar);
        while (k7kVar.c() && (k7kVar.a() instanceof pms)) {
            k7kVar.b();
            B = new zgb(pms.a, B, B(k7kVar), k7kVar.b);
        }
        return B;
    }

    public static void w(String str, StringBuilder sb) {
        str.getClass();
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n') {
                sb.append("%0A");
            } else if (charAt == '\r') {
                sb.append("%0D");
            } else if (charAt == '\"') {
                sb.append("%22");
            } else {
                sb.append(charAt);
            }
        }
        sb.append('\"');
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean x(dpc dpcVar, lma lmaVar) {
        int ordinal = dpcVar.U0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                dpc z = ff7.z(dpcVar);
                if (z == null) {
                    xq0.q("ActiveParent must have a focusedChild");
                    return false;
                }
                int ordinal2 = z.U0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                b6e.s();
                                return false;
                            }
                            xq0.q("ActiveParent must have a focusedChild");
                            return false;
                        }
                    } else if (x(z, lmaVar) || H(dpcVar, z, 2, lmaVar) || (z.T0().a && ((Boolean) lmaVar.invoke(z)).booleanValue())) {
                        return true;
                    }
                }
                return H(dpcVar, z, 2, lmaVar);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    b6e.s();
                    return false;
                }
                if (!L(dpcVar, lmaVar)) {
                    if (!(dpcVar.T0().a ? ((Boolean) lmaVar.invoke(dpcVar)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return L(dpcVar, lmaVar);
    }

    public static jhb y(k7k k7kVar, jhb jhbVar) {
        boolean z = k7kVar.c >= k7kVar.a.size();
        String str = k7kVar.b;
        if (z) {
            kac.h("Expression expected", null);
            return null;
        }
        lns d = k7kVar.d();
        if (jhbVar != null && !(d instanceof wls)) {
            kac.h("Method expected after .", null);
            return null;
        }
        if (d instanceof ams) {
            return new hhb((ams) d, str);
        }
        if (d instanceof bms) {
            return new ihb(((bms) d).a, str);
        }
        if (d instanceof wls) {
            wls wlsVar = (wls) d;
            if (!(k7kVar.d() instanceof tls)) {
                kac.h("'(' expected after function call", null);
                return null;
            }
            ArrayList arrayList = new ArrayList();
            if (jhbVar != null) {
                arrayList.add(jhbVar);
            }
            while (!(k7kVar.a() instanceof uls)) {
                arrayList.add(D(k7kVar));
                if (k7kVar.a() instanceof vls) {
                    k7kVar.b();
                }
            }
            if (k7kVar.d() instanceof uls) {
                return jhbVar == null ? new ahb(wlsVar, arrayList, str) : new chb(wlsVar, arrayList, str);
            }
            kac.h("expected ')' after a function call", null);
            return null;
        }
        if (d instanceof tls) {
            jhb D = D(k7kVar);
            if (k7kVar.d() instanceof uls) {
                return D;
            }
            kac.h("')' expected after expression", null);
            return null;
        }
        if (!(d instanceof jns)) {
            kac.h("Expression expected", null);
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        while (k7kVar.c() && !(k7kVar.a() instanceof hns)) {
            if ((k7kVar.a() instanceof kns) || (k7kVar.a() instanceof ins)) {
                k7kVar.b();
            } else {
                arrayList2.add(D(k7kVar));
            }
        }
        if (k7kVar.d() instanceof hns) {
            return new dhb(str, arrayList2);
        }
        kac.h("expected ''' at end of a string template", null);
        return null;
    }

    public static jhb z(k7k k7kVar) {
        jhb U = U(k7kVar);
        while (k7kVar.c() && (k7kVar.a() instanceof hms)) {
            lns d = k7kVar.d();
            jhb U2 = U(k7kVar);
            d.getClass();
            U = new zgb((wms) d, U, U2, k7kVar.b);
        }
        return U;
    }
}
