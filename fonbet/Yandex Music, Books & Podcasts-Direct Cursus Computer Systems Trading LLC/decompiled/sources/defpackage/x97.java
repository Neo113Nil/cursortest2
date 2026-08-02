package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.core.ui.compose.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;

/* loaded from: classes3.dex */
public abstract class x97 {
    public static final vj0 a = new vj0(5.0d, 0.45d);
    public static final wn5 b = new wn5(new go5(19), 1231265952, false);
    public static final wn5 c = new wn5(new go5(20), -1587453438, false);
    public static final wn5 d = new wn5(new fo5(29), 850651790, false);
    public static final wn5 e = new wn5(new po5(5), 865921730, false);
    public static final wn5 f = new wn5(new bp5(22), 189646643, false);
    public static final wn5 g = new wn5(new ap5(8), -483850267, false);
    public static final wn5 h = new wn5(new bp5(23), 1986077432, false);
    public static final ns9 i = new ns9(12);
    public static final ns9 j = new ns9(13);
    public static final ns9 k = new ns9(21);
    public static final i6c l;
    public static final i6c[] m;

    static {
        i6c i6cVar = new i6c("sms_code_autofill", 2L);
        i6c i6cVar2 = new i6c("sms_code_browser", 2L);
        i6c i6cVar3 = new i6c("sms_retrieve", 1L);
        l = i6cVar3;
        m = new i6c[]{i6cVar, i6cVar2, i6cVar3, new i6c("user_consent", 3L)};
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, uif] */
    public static final xw6 A(dpc dpcVar, int i2) {
        if (!dpcVar.q) {
            dpcVar.q = true;
            try {
                woc T0 = dpcVar.T0();
                qt3 qt3Var = new qt3(i2);
                up6.x(dpcVar);
                toc focusOwner = bcx.G(dpcVar).getFocusOwner();
                dpc dpcVar2 = ((uoc) focusOwner).l;
                T0.j.invoke(qt3Var);
                dpc dpcVar3 = ((uoc) focusOwner).l;
                if (qt3Var.b) {
                    yoc yocVar = yoc.b;
                    return xw6.b;
                }
                if (dpcVar2 != dpcVar3 && dpcVar3 != null) {
                    return yoc.d == yoc.c ? xw6.b : xw6.c;
                }
            } finally {
                dpcVar.q = false;
            }
        }
        return xw6.a;
    }

    public static final xw6 B(dpc dpcVar, int i2) {
        xci xciVar;
        cr crVar;
        int ordinal = dpcVar.U0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                dpc z = ff7.z(dpcVar);
                if (z != null) {
                    return z(z, i2);
                }
                xq0.x("ActiveParent with no focused child");
                return null;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    b6e.s();
                    return null;
                }
                if (!dpcVar.a.n) {
                    sme.b("visitAncestors called on an unattached node");
                }
                xci xciVar2 = dpcVar.a.e;
                mpf F = bcx.F(dpcVar);
                loop0: while (true) {
                    if (F == null) {
                        xciVar = null;
                        break;
                    }
                    if ((((xci) F.F.f).d & 1024) != 0) {
                        while (xciVar2 != null) {
                            if ((xciVar2.c & 1024) != 0) {
                                xciVar = xciVar2;
                                eqi eqiVar = null;
                                while (xciVar != null) {
                                    if (xciVar instanceof dpc) {
                                        break loop0;
                                    }
                                    if ((xciVar.c & 1024) != 0 && (xciVar instanceof cw7)) {
                                        int i3 = 0;
                                        for (xci xciVar3 = ((cw7) xciVar).p; xciVar3 != null; xciVar3 = xciVar3.f) {
                                            if ((xciVar3.c & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    xciVar = xciVar3;
                                                } else {
                                                    if (eqiVar == null) {
                                                        eqiVar = new eqi(new xci[16]);
                                                    }
                                                    if (xciVar != null) {
                                                        eqiVar.d(xciVar);
                                                        xciVar = null;
                                                    }
                                                    eqiVar.d(xciVar3);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    xciVar = bcx.p(eqiVar);
                                }
                            }
                            xciVar2 = xciVar2.e;
                        }
                    }
                    F = F.u();
                    xciVar2 = (F == null || (crVar = F.F) == null) ? null : (i4s) crVar.e;
                }
                dpc dpcVar2 = (dpc) xciVar;
                if (dpcVar2 == null) {
                    return xw6.a;
                }
                int ordinal2 = dpcVar2.U0().ordinal();
                if (ordinal2 == 0) {
                    return A(dpcVar2, i2);
                }
                if (ordinal2 == 1) {
                    return B(dpcVar2, i2);
                }
                if (ordinal2 == 2) {
                    return xw6.b;
                }
                if (ordinal2 != 3) {
                    b6e.s();
                    return null;
                }
                xw6 B = B(dpcVar2, i2);
                xw6 xw6Var = B != xw6.a ? B : null;
                return xw6Var == null ? A(dpcVar2, i2) : xw6Var;
            }
        }
        return xw6.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean C(dpc dpcVar) {
        eqi eqiVar;
        cr crVar;
        char c2;
        cr crVar2;
        uoc uocVar = (uoc) bcx.G(dpcVar).getFocusOwner();
        dpc dpcVar2 = uocVar.l;
        bpc U0 = dpcVar.U0();
        if (dpcVar2 == dpcVar) {
            dpcVar.S0(U0, U0);
            return true;
        }
        eqi eqiVar2 = null;
        int i2 = 0;
        if (dpcVar2 == null && !((Boolean) ((uoc) bcx.G(dpcVar).getFocusOwner()).a.invoke(null, null)).booleanValue()) {
            return false;
        }
        char c3 = 16;
        if (dpcVar2 != null) {
            eqiVar = new eqi(new dpc[16]);
            if (!dpcVar2.a.n) {
                sme.b("visitAncestors called on an unattached node");
            }
            xci xciVar = dpcVar2.a.e;
            mpf F = bcx.F(dpcVar2);
            while (F != null) {
                if ((((xci) F.F.f).d & 1024) != 0) {
                    while (xciVar != null) {
                        if ((xciVar.c & 1024) != 0) {
                            eqi eqiVar3 = eqiVar2;
                            xci xciVar2 = xciVar;
                            while (xciVar2 != null) {
                                if (xciVar2 instanceof dpc) {
                                    eqiVar.d((dpc) xciVar2);
                                } else if ((xciVar2.c & 1024) != 0 && (xciVar2 instanceof cw7)) {
                                    int i3 = 0;
                                    for (xci xciVar3 = ((cw7) xciVar2).p; xciVar3 != null; xciVar3 = xciVar3.f) {
                                        if ((xciVar3.c & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                xciVar2 = xciVar3;
                                            } else {
                                                if (eqiVar3 == null) {
                                                    eqiVar3 = new eqi(new xci[16]);
                                                }
                                                if (xciVar2 != null) {
                                                    eqiVar3.d(xciVar2);
                                                    xciVar2 = null;
                                                }
                                                eqiVar3.d(xciVar3);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                xciVar2 = bcx.p(eqiVar3);
                            }
                        }
                        xciVar = xciVar.e;
                        eqiVar2 = null;
                    }
                }
                F = F.u();
                xciVar = (F == null || (crVar2 = F.F) == null) ? null : (i4s) crVar2.e;
                eqiVar2 = null;
            }
        } else {
            eqiVar = null;
        }
        dpc[] dpcVarArr = new dpc[16];
        if (!dpcVar.a.n) {
            sme.b("visitAncestors called on an unattached node");
        }
        xci xciVar4 = dpcVar.a.e;
        mpf F2 = bcx.F(dpcVar);
        int i4 = 1;
        int i5 = 0;
        while (F2 != null) {
            if ((((xci) F2.F.f).d & 1024) != 0) {
                while (xciVar4 != null) {
                    if ((xciVar4.c & 1024) != 0) {
                        xci xciVar5 = xciVar4;
                        eqi eqiVar4 = null;
                        while (xciVar5 != null) {
                            if (xciVar5 instanceof dpc) {
                                dpc dpcVar3 = (dpc) xciVar5;
                                Boolean valueOf = eqiVar != null ? Boolean.valueOf(eqiVar.l(dpcVar3)) : null;
                                if (valueOf == null || !valueOf.booleanValue()) {
                                    int i6 = i5 + 1;
                                    if (dpcVarArr.length < i6) {
                                        int length = dpcVarArr.length;
                                        ?? r4 = new Object[Math.max(i6, length * 2)];
                                        System.arraycopy(dpcVarArr, i2, r4, i2, length);
                                        dpcVarArr = r4;
                                    }
                                    dpcVarArr[i5] = dpcVar3;
                                    i5 = i6;
                                }
                                if (dpcVar3 == dpcVar2) {
                                    i4 = i2;
                                }
                            } else if ((xciVar5.c & 1024) != 0 && (xciVar5 instanceof cw7)) {
                                int i7 = i2;
                                for (xci xciVar6 = ((cw7) xciVar5).p; xciVar6 != null; xciVar6 = xciVar6.f) {
                                    if ((xciVar6.c & 1024) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            xciVar5 = xciVar6;
                                        } else {
                                            if (eqiVar4 == null) {
                                                eqiVar4 = new eqi(new xci[16]);
                                            }
                                            if (xciVar5 != null) {
                                                eqiVar4.d(xciVar5);
                                                xciVar5 = null;
                                            }
                                            eqiVar4.d(xciVar6);
                                        }
                                    }
                                }
                                c2 = 16;
                                if (i7 == 1) {
                                    c3 = 16;
                                    i2 = 0;
                                }
                                xciVar5 = bcx.p(eqiVar4);
                                c3 = c2;
                                i2 = 0;
                            }
                            c2 = 16;
                            xciVar5 = bcx.p(eqiVar4);
                            c3 = c2;
                            i2 = 0;
                        }
                    }
                    xciVar4 = xciVar4.e;
                    c3 = c3;
                    i2 = 0;
                }
            }
            char c4 = c3;
            F2 = F2.u();
            xciVar4 = (F2 == null || (crVar = F2.F) == null) ? null : (i4s) crVar.e;
            c3 = c4;
            i2 = 0;
        }
        if (i4 == 0 || dpcVar2 == null || r(dpcVar2, false)) {
            neg.y(dpcVar, new ypb(2, dpcVar));
            int ordinal = dpcVar.U0().ordinal();
            if (ordinal == 1 || ordinal == 3) {
                ((uoc) bcx.G(dpcVar).getFocusOwner()).f(dpcVar);
            }
            if (eqiVar != null) {
                int i8 = eqiVar.c - 1;
                Object[] objArr = eqiVar.a;
                if (i8 < objArr.length) {
                    while (i8 >= 0) {
                        dpc dpcVar4 = (dpc) objArr[i8];
                        if (uocVar.l != dpcVar) {
                            break;
                        }
                        dpcVar4.S0(bpc.b, bpc.d);
                        i8--;
                    }
                }
            }
            int i9 = i5 - 1;
            if (i9 < dpcVarArr.length) {
                while (i9 >= 0) {
                    dpc dpcVar5 = dpcVarArr[i9];
                    if (uocVar.l != dpcVar) {
                        break;
                    }
                    dpcVar5.S0(dpcVar5 == dpcVar2 ? bpc.a : bpc.d, bpc.b);
                    i9--;
                }
            }
            if (uocVar.l == dpcVar) {
                dpcVar.S0(U0, bpc.a);
                if (uocVar.l != dpcVar) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public static final Object D(CoroutineContext coroutineContext, Function2 function2) {
        rib ribVar;
        CoroutineContext plus;
        long N0;
        Thread currentThread = Thread.currentThread();
        f fVar = d.t0;
        d dVar = (d) coroutineContext.get(fVar);
        if (dVar == null) {
            ribVar = rfs.a();
            CoroutineContext a2 = bm6.a(g.a, coroutineContext.plus(ribVar), true);
            plus = ve7.a() ? a2.plus(new hm6(ve7.c.incrementAndGet())) : a2;
            dq7 dq7Var = ca8.a;
            if (a2 != dq7Var && a2.get(fVar) == null) {
                plus = plus.plus(dq7Var);
            }
        } else {
            if (dVar instanceof rib) {
            }
            ribVar = (rib) rfs.a.get();
            CoroutineContext a3 = bm6.a(g.a, coroutineContext, true);
            plus = ve7.a() ? a3.plus(new hm6(ve7.c.incrementAndGet())) : a3;
            dq7 dq7Var2 = ca8.a;
            if (a3 != dq7Var2 && a3.get(fVar) == null) {
                plus = plus.plus(dq7Var2);
            }
        }
        j73 j73Var = new j73(plus, currentThread, ribVar);
        j73Var.o0(pm6.a, j73Var, function2);
        rib ribVar2 = j73Var.e;
        if (ribVar2 != null) {
            int i2 = rib.g;
            ribVar2.M0(false);
        }
        while (true) {
            if (ribVar2 != null) {
                try {
                    N0 = ribVar2.N0();
                } catch (Throwable th) {
                    if (ribVar2 != null) {
                        int i3 = rib.g;
                        ribVar2.J0(false);
                    }
                    throw th;
                }
            } else {
                N0 = Long.MAX_VALUE;
            }
            if (j73Var.X()) {
                break;
            }
            LockSupport.parkNanos(j73Var, N0);
            if (Thread.interrupted()) {
                j73Var.t(new InterruptedException());
            }
        }
        if (ribVar2 != null) {
            int i4 = rib.g;
            ribVar2.J0(false);
        }
        Object a4 = i3f.a(h3f.a.get(j73Var));
        sm5 sm5Var = a4 instanceof sm5 ? (sm5) a4 : null;
        if (sm5Var == null) {
            return a4;
        }
        throw sm5Var.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object F(Exception exc, Continuation continuation) {
        eif eifVar;
        int i2;
        if (continuation instanceof eif) {
            eifVar = (eif) continuation;
            int i3 = eifVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                eifVar.k = i3 - Integer.MIN_VALUE;
                Object obj = eifVar.j;
                nm6 nm6Var = nm6.a;
                i2 = eifVar.k;
                if (i2 == 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                eifVar.k = 1;
                ca8.a.F0(eifVar.getContext(), new pv7(eifVar, exc, false, 19));
                return nm6Var;
            }
        }
        eifVar = new eif(continuation);
        Object obj2 = eifVar.j;
        nm6 nm6Var2 = nm6.a;
        i2 = eifVar.k;
        if (i2 == 0) {
        }
    }

    public static final Pair[] G(Map map) {
        Iterator it = map.entrySet().iterator();
        int size = map.size();
        Pair[] pairArr = new Pair[size];
        for (int i2 = 0; i2 < size; i2++) {
            Map.Entry entry = (Map.Entry) it.next();
            pairArr[i2] = new Pair(entry.getKey(), entry.getValue());
        }
        return pairArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q27 H(List list, tc1 tc1Var, int i2, boolean z, String str, String str2, bm2 bm2Var, boolean z2, String str3, g0c g0cVar, Map map, int i3) {
        boolean z3;
        String str4;
        String str5;
        String str6;
        String str7;
        kcp kcpVar;
        String str8;
        String str9;
        String str10;
        String str11;
        c5c c5cVar;
        String w;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17 = (i3 & 128) != 0 ? null : str3;
        Map map2 = (i3 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 ? null : map;
        list.getClass();
        tc1Var.getClass();
        g0cVar.getClass();
        List<rfk> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (rfk rfkVar : list2) {
            rfkVar.getClass();
            arrayList.add(new kcp(rfkVar, false, false, null, null));
        }
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kcp kcpVar2 = (kcp) it.next();
            kcpVar2.getClass();
            rfk rfkVar2 = kcpVar2.a;
            boolean z4 = rfkVar2 instanceof ffk;
            hfk hfkVar = hfk.a;
            nfk nfkVar = nfk.a;
            ofk ofkVar = ofk.a;
            lfk lfkVar = lfk.a;
            kfk kfkVar = kfk.a;
            jfk jfkVar = jfk.a;
            ifk ifkVar = ifk.a;
            Iterator it2 = it;
            gfk gfkVar = gfk.a;
            if (z4) {
                okr[] okrVarArr = okr.a;
                str6 = "card";
            } else if (rfkVar2.equals(gfkVar)) {
                okr[] okrVarArr2 = okr.a;
                str6 = "cash";
            } else if (rfkVar2.equals(ifkVar)) {
                okr[] okrVarArr3 = okr.a;
                str6 = "google";
            } else if (rfkVar2.equals(jfkVar)) {
                okr[] okrVarArr4 = okr.a;
                str6 = "add_new_card";
            } else {
                if (rfkVar2.equals(kfkVar)) {
                    okr[] okrVarArr5 = okr.a;
                } else if (rfkVar2.equals(lfkVar)) {
                    okr[] okrVarArr6 = okr.a;
                } else {
                    z3 = z4;
                    if (rfkVar2 instanceof mfk) {
                        okr[] okrVarArr7 = okr.a;
                        str4 = "sbp_token";
                    } else if (rfkVar2.equals(ofkVar)) {
                        em2 em2Var = em2.SBERBANK;
                        str4 = "tinkoff";
                    } else if (rfkVar2 instanceof pfk) {
                        okr[] okrVarArr8 = okr.a;
                        str4 = "plus_card";
                    } else if (rfkVar2.equals(nfkVar)) {
                        okr[] okrVarArr9 = okr.a;
                        str4 = "split";
                    } else {
                        if (!rfkVar2.equals(hfkVar)) {
                            b6e.s();
                            return null;
                        }
                        okr[] okrVarArr10 = okr.a;
                        str4 = "challenge_polling";
                    }
                    str5 = str4;
                    String v = v(kcpVar2);
                    str7 = kcpVar2.e;
                    if (str7 != null) {
                        kcpVar = kcpVar2;
                        str10 = str7;
                        str8 = str17;
                    } else {
                        if (z3) {
                            kcpVar = kcpVar2;
                            ffk ffkVar = (ffk) rfkVar2;
                            ix3 ix3Var = ffkVar.b;
                            str8 = str17;
                            ix3 ix3Var2 = ix3Var == ix3.h ? null : ix3Var;
                            if (z2) {
                                ix3Var = null;
                            }
                            if (ix3Var != null) {
                                ix3Var2 = ix3Var;
                            }
                            if (ix3Var2 == null || (str11 = wxf.O(ix3Var2)) == null) {
                                str11 = "";
                            }
                            str9 = tc1Var.c(R.string.paymentsdk_prebuilt_card_list_item_number_format, new Object[]{str11, mlr.L(4, ffkVar.c)});
                        } else {
                            kcpVar = kcpVar2;
                            str8 = str17;
                            if (!(rfkVar2 instanceof mfk)) {
                                boolean z5 = rfkVar2 instanceof pfk;
                                int i4 = R.string.paymentsdk_non_new_sbp_title;
                                if (z5) {
                                    if (!z2) {
                                        u7w u7wVar = ((pfk) rfkVar2).c;
                                        i4 = u7wVar == u7w.a ? R.string.paymentsdk_prebuilt_yabank_pro_title : u7wVar == u7w.c ? R.string.paymentsdk_prebuilt_yabank_split_title : R.string.paymentsdk_prebuilt_yabank_title;
                                    }
                                    str9 = tc1Var.b(i4);
                                } else if (rfkVar2.equals(gfkVar)) {
                                    str9 = tc1Var.b(R.string.paymentsdk_prebuilt_cash_title);
                                } else if (rfkVar2.equals(ifkVar)) {
                                    str9 = tc1Var.b(R.string.paymentsdk_prebuilt_gpay_title);
                                } else if (rfkVar2.equals(jfkVar)) {
                                    str9 = tc1Var.b(R.string.paymentsdk_new_card);
                                } else if (rfkVar2.equals(lfkVar)) {
                                    if (!z2) {
                                        i4 = R.string.paymentsdk_new_sbp_title;
                                    }
                                    str9 = tc1Var.b(i4);
                                } else if (rfkVar2.equals(kfkVar)) {
                                    if (!z2) {
                                        i4 = R.string.paymentsdk_prebuilt_sbp_title;
                                    }
                                    str9 = tc1Var.b(i4);
                                } else if (rfkVar2.equals(ofkVar)) {
                                    str9 = "Tinkoff credit";
                                } else if (rfkVar2.equals(nfkVar)) {
                                    str9 = "Split";
                                } else {
                                    if (!rfkVar2.equals(hfkVar)) {
                                        b6e.s();
                                        return null;
                                    }
                                    str9 = "ChallengePollingMethod";
                                }
                            } else if (!qdq.y() ? (str9 = ((mfk) rfkVar2).c) == null : (str9 = ((mfk) rfkVar2).d) == null) {
                                str10 = "";
                            }
                        }
                        str10 = str9;
                    }
                    if (z3) {
                        c5c c5cVar2 = ((ffk) rfkVar2).e;
                        if (c5cVar2 != null) {
                            w = w(c5cVar2, tc1Var, g0cVar);
                            str12 = w;
                        }
                        str12 = null;
                    } else {
                        if (rfkVar2 instanceof lfk) {
                            w = tc1Var.b(z2 ? R.string.paymentsdk_non_new_sbp_subtitle : R.string.paymentsdk_new_sbp_subtitle);
                        } else if (rfkVar2 instanceof mfk) {
                            w = tc1Var.b(z2 ? R.string.paymentsdk_non_sbp_title : R.string.paymentsdk_sbp_subtitle);
                        } else {
                            if ((rfkVar2 instanceof pfk) && (c5cVar = ((pfk) rfkVar2).d) != null) {
                                w = w(c5cVar, tc1Var, g0cVar);
                            }
                            str12 = null;
                        }
                        str12 = w;
                    }
                    bm2 bm2Var2 = o8g.B(dag.y(kcpVar)) ? bm2Var : null;
                    String concat = "local-image://".concat(v(kcpVar));
                    boolean z6 = rfkVar2 instanceof mfk;
                    mfk mfkVar = z6 ? (mfk) rfkVar2 : null;
                    String str18 = mfkVar != null ? mfkVar.b : null;
                    String str19 = (!z3 ? !(!(rfkVar2 instanceof pfk) || ((pfk) rfkVar2).d == null) : ((ffk) rfkVar2).e != null) ? null : "local-image://family_symbol";
                    boolean z7 = !z3 ? !(rfkVar2 instanceof pfk) || ((pfk) rfkVar2).d == null : ((ffk) rfkVar2).e == null;
                    ffk ffkVar2 = z3 ? (ffk) rfkVar2 : null;
                    List list3 = ffkVar2 != null ? ffkVar2.f : null;
                    if (z3) {
                        str14 = ((ffk) rfkVar2).g;
                    } else if (z6) {
                        str14 = ((mfk) rfkVar2).g;
                    } else if (rfkVar2 instanceof pfk) {
                        str14 = ((pfk) rfkVar2).e;
                    } else {
                        str13 = null;
                        if (!z3) {
                            str16 = ((ffk) rfkVar2).i;
                        } else if (z6) {
                            str16 = ((mfk) rfkVar2).i;
                        } else if (rfkVar2 instanceof pfk) {
                            str16 = ((pfk) rfkVar2).g;
                        } else {
                            if (!(rfkVar2.equals(gfkVar) ? true : rfkVar2.equals(ifkVar) ? true : rfkVar2.equals(jfkVar) ? true : rfkVar2.equals(kfkVar) ? true : rfkVar2.equals(lfkVar) ? true : rfkVar2.equals(nfkVar) ? true : rfkVar2.equals(ofkVar)) && !rfkVar2.equals(hfkVar)) {
                                b6e.s();
                                return null;
                            }
                            str15 = null;
                            arrayList2.add(new p27(str5, v, str10, str12, concat, bm2Var2, str18, z7, str19, list3, str13, str15));
                            it = it2;
                            str17 = str8;
                        }
                        str15 = str16;
                        arrayList2.add(new p27(str5, v, str10, str12, concat, bm2Var2, str18, z7, str19, list3, str13, str15));
                        it = it2;
                        str17 = str8;
                    }
                    str13 = str14;
                    if (!z3) {
                    }
                    str15 = str16;
                    arrayList2.add(new p27(str5, v, str10, str12, concat, bm2Var2, str18, z7, str19, list3, str13, str15));
                    it = it2;
                    str17 = str8;
                }
                z3 = z4;
                str5 = "sbp";
                String v2 = v(kcpVar2);
                str7 = kcpVar2.e;
                if (str7 != null) {
                }
                if (z3) {
                }
                if (o8g.B(dag.y(kcpVar))) {
                }
                String concat2 = "local-image://".concat(v(kcpVar));
                boolean z62 = rfkVar2 instanceof mfk;
                if (z62) {
                }
                if (mfkVar != null) {
                }
                if (z3) {
                }
                if (z3) {
                }
                if (z3) {
                }
                if (ffkVar2 != null) {
                }
                if (z3) {
                }
                str13 = str14;
                if (!z3) {
                }
                str15 = str16;
                arrayList2.add(new p27(str5, v2, str10, str12, concat2, bm2Var2, str18, z7, str19, list3, str13, str15));
                it = it2;
                str17 = str8;
            }
            str5 = str6;
            z3 = z4;
            String v22 = v(kcpVar2);
            str7 = kcpVar2.e;
            if (str7 != null) {
            }
            if (z3) {
            }
            if (o8g.B(dag.y(kcpVar))) {
            }
            String concat22 = "local-image://".concat(v(kcpVar));
            boolean z622 = rfkVar2 instanceof mfk;
            if (z622) {
            }
            if (mfkVar != null) {
            }
            if (z3) {
            }
            if (z3) {
            }
            if (z3) {
            }
            if (ffkVar2 != null) {
            }
            if (z3) {
            }
            str13 = str14;
            if (!z3) {
            }
            str15 = str16;
            arrayList2.add(new p27(str5, v22, str10, str12, concat22, bm2Var2, str18, z7, str19, list3, str13, str15));
            it = it2;
            str17 = str8;
        }
        return new q27(arrayList2, i2, z, str, str2, str17, map2, null);
    }

    public static final Object V(CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
        Object a2;
        CoroutineContext context = continuation.getContext();
        CoroutineContext plus = !((Boolean) coroutineContext.fold(Boolean.FALSE, new fp5(12))).booleanValue() ? context.plus(coroutineContext) : bm6.a(context, coroutineContext, false);
        saf.K(plus);
        if (plus == context) {
            huo huoVar = new huo(continuation, plus);
            a2 = swf.l0(huoVar, true, huoVar, function2);
        } else {
            dg6 dg6Var = d.t0;
            if (Intrinsics.d(plus.get(dg6Var), context.get(dg6Var))) {
                kit kitVar = new kit(continuation, plus);
                CoroutineContext coroutineContext2 = kitVar.c;
                Object c2 = nfs.c(coroutineContext2, null);
                try {
                    Object l0 = swf.l0(kitVar, true, kitVar, function2);
                    nfs.a(coroutineContext2, c2);
                    a2 = l0;
                } catch (Throwable th) {
                    nfs.a(coroutineContext2, c2);
                    throw th;
                }
            } else {
                x98 x98Var = new x98(continuation, plus);
                n7w.c0(function2, x98Var, x98Var);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = x98.e;
                while (true) {
                    int i2 = atomicIntegerFieldUpdater.get(x98Var);
                    if (i2 != 0) {
                        if (i2 != 2) {
                            xq0.q("Already suspended");
                            return null;
                        }
                        a2 = i3f.a(h3f.a.get(x98Var));
                        if (a2 instanceof sm5) {
                            throw ((sm5) a2).a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(x98Var, 0, 1)) {
                        a2 = nm6.a;
                        break;
                    }
                }
            }
        }
        nm6 nm6Var = nm6.a;
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [int] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    public static final void a(final am amVar, yci yciVar, hq5 hq5Var, int i2) {
        vci vciVar;
        oq5 oq5Var;
        boolean z;
        oq5 oq5Var2;
        yci yciVar2;
        Function0 function0;
        oq5 oq5Var3;
        ?? r5;
        amVar.getClass();
        oq5 oq5Var4 = (oq5) hq5Var;
        oq5Var4.b0(-614833424);
        if (((((i2 & 6) == 0 ? (oq5Var4.h(amVar) ? 4 : 2) | i2 : i2) | 48) & 19) == 18 && oq5Var4.z()) {
            oq5Var4.S();
            yciVar2 = yciVar;
            r5 = 1;
            oq5Var3 = oq5Var4;
        } else {
            nm nmVar = (nm) gld.M(amVar.e, oq5Var4).getValue();
            boolean z2 = false;
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var4, 0);
            int i3 = oq5Var4.P;
            a l2 = oq5Var4.l();
            vci vciVar2 = vci.a;
            yci H = vnj.H(oq5Var4, vciVar2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var4.d0();
            if (oq5Var4.O) {
                oq5Var4.k(grbVar);
            } else {
                oq5Var4.n0();
            }
            g0g.U(oq5Var4, a2, wp5.f);
            g0g.U(oq5Var4, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var4, i3, kb5Var);
            }
            g0g.U(oq5Var4, H, wp5.d);
            String title = nmVar.getTitle();
            int i4 = 3;
            Object obj = gq5.a;
            if (title == null || (nmVar instanceof km)) {
                vciVar = vciVar2;
                oq5Var4.Z(-1851494020);
                oq5Var = oq5Var4;
            } else {
                oq5Var4.Z(-1849792399);
                if (nmVar.equals(km.a)) {
                    oq5Var4.Z(-1849702345);
                    oq5Var4.p(false);
                } else if (nmVar instanceof lm) {
                    oq5Var4.Z(-1849630921);
                    oq5Var4.p(false);
                } else {
                    if (!(nmVar instanceof mm)) {
                        throw vz1.i(oq5Var4, -475311769, false);
                    }
                    oq5Var4.Z(-1849551002);
                    boolean h2 = oq5Var4.h(amVar) | oq5Var4.h(nmVar);
                    Object K = oq5Var4.K();
                    if (h2 || K == obj) {
                        K = new hb(i4, amVar, nmVar);
                        oq5Var4.k0(K);
                    }
                    function0 = (Function0) K;
                    oq5Var4.p(false);
                    vciVar = vciVar2;
                    irf.h(title, null, null, null, function0, false, null, false, null, oq5Var4, 0, 494);
                    oq5Var = oq5Var4;
                }
                function0 = null;
                vciVar = vciVar2;
                irf.h(title, null, null, null, function0, false, null, false, null, oq5Var4, 0, 494);
                oq5Var = oq5Var4;
            }
            oq5Var.p(false);
            if (nmVar instanceof km) {
                oq5Var.Z(-475288822);
                oq5Var.p(false);
            } else if (nmVar instanceof lm) {
                oq5Var.Z(-1848978897);
                for (int i5 = 0; i5 < 3; i5++) {
                    wyf.i(true, null, null, false, oq5Var, 6, 14);
                }
                oq5Var.p(false);
            } else {
                if (!(nmVar instanceof mm)) {
                    throw vz1.i(oq5Var, -475287630, false);
                }
                oq5Var.Z(-1848647848);
                mm mmVar = (mm) nmVar;
                gjl gjlVar = mmVar.d;
                int i6 = 0;
                oq5 oq5Var5 = oq5Var;
                for (Object obj2 : mmVar.c) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        u75.n();
                        throw null;
                    }
                    final xl xlVar = (xl) obj2;
                    boolean f2 = oq5Var5.f(gjlVar) | oq5Var5.f(xlVar);
                    Object K2 = oq5Var5.K();
                    if (f2 || K2 == obj) {
                        qkl qklVar = gjlVar == null ? null : new qkl(gjlVar, new thj(pkb.Playlist, xlVar.c.e(), 1, i6 + 1, ""));
                        oq5Var5.k0(qklVar);
                        K2 = qklVar;
                    }
                    final qkl qklVar2 = (qkl) K2;
                    gjl gjlVar2 = gjlVar;
                    lwl lwlVar = xlVar.a;
                    long j2 = d85.m;
                    vci vciVar3 = vciVar;
                    yci D = ksw.D(vciVar3, rvf.M(R.string.playlist, oq5Var5), null);
                    ynn i8 = irv.i(oq5Var5);
                    boolean h3 = oq5Var5.h(amVar);
                    Object K3 = oq5Var5.K();
                    if (h3 || K3 == obj) {
                        K3 = new u2(6, amVar);
                        oq5Var5.k0(K3);
                    }
                    yci c2 = com.yandex.music.core.ui.compose.a.c(D, i8, qklVar2, (pyc) K3, 14);
                    boolean h4 = oq5Var5.h(amVar) | oq5Var5.h(xlVar) | oq5Var5.h(qklVar2);
                    Object K4 = oq5Var5.K();
                    if (h4 || K4 == obj) {
                        final int i9 = 0;
                        K4 = new Function0() { // from class: vl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i10 = i9;
                                qkl qklVar3 = qklVar2;
                                xl xlVar2 = xlVar;
                                am amVar2 = amVar;
                                switch (i10) {
                                    case 0:
                                        cvl cvlVar = xlVar2.c;
                                        amVar2.getClass();
                                        amVar2.a(wjb.PlayerScreen, qklVar3);
                                        osh oshVar = amVar2.b;
                                        int i11 = PlaylistScreenActivity.B0;
                                        Context context = (Context) oshVar.a;
                                        context.startActivity(dxl.i(context, cvlVar, null, 60));
                                        break;
                                    default:
                                        cvl cvlVar2 = xlVar2.c;
                                        amVar2.getClass();
                                        amVar2.a(wjb.PlayerScreen, qklVar3);
                                        szf.R((y) amVar2.b.b, new qvg(g0g.G(cvlVar2)), ru.yandex.music.common.media.context.d.j());
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var5.k0(K4);
                    }
                    Function0 function02 = (Function0) K4;
                    nm nmVar2 = nmVar;
                    Object obj3 = obj;
                    wn5 C = ild.C(1837591277, new wl(xlVar, amVar, nmVar2, qklVar2, 0), oq5Var5);
                    boolean h5 = oq5Var5.h(amVar) | oq5Var5.h(xlVar) | oq5Var5.h(qklVar2);
                    Object K5 = oq5Var5.K();
                    if (h5 || K5 == obj3) {
                        final int i10 = 1;
                        K5 = new Function0() { // from class: vl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i102 = i10;
                                qkl qklVar3 = qklVar2;
                                xl xlVar2 = xlVar;
                                am amVar2 = amVar;
                                switch (i102) {
                                    case 0:
                                        cvl cvlVar = xlVar2.c;
                                        amVar2.getClass();
                                        amVar2.a(wjb.PlayerScreen, qklVar3);
                                        osh oshVar = amVar2.b;
                                        int i11 = PlaylistScreenActivity.B0;
                                        Context context = (Context) oshVar.a;
                                        context.startActivity(dxl.i(context, cvlVar, null, 60));
                                        break;
                                    default:
                                        cvl cvlVar2 = xlVar2.c;
                                        amVar2.getClass();
                                        amVar2.a(wjb.PlayerScreen, qklVar3);
                                        szf.R((y) amVar2.b.b, new qvg(g0g.G(cvlVar2)), ru.yandex.music.common.media.context.d.j());
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var5.k0(K5);
                    }
                    obj = obj3;
                    oq5 oq5Var6 = oq5Var5;
                    vciVar = vciVar3;
                    wyf.h(lwlVar, function02, c2, j2, null, C, null, (Function0) K5, oq5Var6, 199680, 80);
                    gjlVar = gjlVar2;
                    nmVar = nmVar2;
                    oq5Var5 = oq5Var6;
                    i6 = i7;
                    z2 = false;
                }
                boolean z3 = z2;
                z = true;
                oq5Var5.p(z3);
                oq5Var2 = oq5Var5;
                oq5Var2.p(z);
                yciVar2 = vciVar;
                r5 = z;
                oq5Var3 = oq5Var2;
            }
            z = true;
            oq5Var2 = oq5Var;
            oq5Var2.p(z);
            yciVar2 = vciVar;
            r5 = z;
            oq5Var3 = oq5Var2;
        }
        xmn r = oq5Var3.r();
        if (r != null) {
            r.d = new z2(amVar, yciVar2, i2, (int) r5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0066  */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, yci yciVar, w4k w4kVar, Function0 function0, hq5 hq5Var, int i2, int i3) {
        String str2;
        int i4;
        w4k w4kVar2;
        Function0 function02;
        w4k w4kVar3;
        oq5 oq5Var;
        xmn r;
        vci vciVar;
        float f2;
        ?? r4;
        int i5;
        w4k w4kVar4;
        str.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1861215012);
        int i6 = 4;
        if ((i2 & 6) == 0) {
            str2 = str;
            i4 = (oq5Var2.f(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            w4kVar2 = w4kVar;
            i4 |= oq5Var2.h(w4kVar2) ? 256 : 128;
            if ((i2 & 3072) != 0) {
                function02 = function0;
                i4 |= oq5Var2.h(function02) ? 2048 : 1024;
            } else {
                function02 = function0;
            }
            if (oq5Var2.P(i4 & 1, (i4 & 1171) == 1170)) {
                oq5Var2.S();
                w4kVar3 = w4kVar2;
                oq5Var = oq5Var2;
            } else {
                w4k w4kVar5 = i7 != 0 ? null : w4kVar2;
                float f3 = 16;
                yci d2 = androidx.compose.foundation.layout.d.d(androidx.compose.foundation.layout.a.p(androidx.compose.foundation.a.e(yciVar, false, null, null, function02, 7), f3, f3, 8, f3), 1.0f);
                Object K = oq5Var2.K();
                if (K == gq5.a) {
                    K = new zs0(i6);
                    oq5Var2.k0(K);
                }
                yci b2 = nfp.b(d2, false, (Function1) K);
                nho a2 = lho.a(qx0.a, b2c.l, oq5Var2, 48);
                int i8 = oq5Var2.P;
                a l2 = oq5Var2.l();
                yci H = vnj.H(oq5Var2, b2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(oq5Var2, a2, wp5.f);
                g0g.U(oq5Var2, l2, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i8))) {
                    ouj.x(i8, oq5Var2, i8, kb5Var);
                }
                g0g.U(oq5Var2, H, wp5.d);
                vci vciVar2 = vci.a;
                if (w4kVar5 == null) {
                    oq5Var2.Z(1032963464);
                    oq5Var2.p(false);
                    w4kVar4 = w4kVar5;
                    r4 = 1;
                    i5 = 0;
                    f2 = 1.0f;
                    vciVar = vciVar2;
                } else {
                    oq5Var2.Z(1032963465);
                    vciVar = vciVar2;
                    f2 = 1.0f;
                    w4k w4kVar6 = w4kVar5;
                    r4 = 1;
                    i5 = 0;
                    gae.b(w4kVar6, null, androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 0.0f, f3, 0.0f, 11), ((dq0) oq5Var2.j(eq0.a)).a.a, oq5Var2, ((i4 >> 6) & 14) | 432, 0);
                    w4kVar4 = w4kVar6;
                    oq5Var2.p(false);
                }
                yci o = androidx.compose.foundation.layout.a.o(vciVar, 0.0f, 2, r4);
                if (f2 <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                yci a3 = androidx.compose.ui.platform.a.a(o.f(new LayoutWeightElement(r4, f2)), "arrow_row_title");
                ges j2 = nu0.j();
                agr agrVar = eq0.a;
                xcs.b(str2, a3, ((dq0) oq5Var2.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, j2, oq5Var2, i4 & 14, 3120, 55288);
                oq5 oq5Var3 = oq5Var2;
                gae.b(a0g.E(R.drawable.ic_arrow_mid_right_24, i5, oq5Var3), null, androidx.compose.ui.platform.a.a(wyf.R(androidx.compose.foundation.layout.d.m(vciVar, 24)), "arrow_row_icon"), ((dq0) oq5Var3.j(agrVar)).a.c, oq5Var3, 48, 0);
                oq5Var3.p(r4);
                w4kVar3 = w4kVar4;
                oq5Var = oq5Var3;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new hq((Object) str, yciVar, (Object) w4kVar3, (Object) function0, i2, i3, 1);
                return;
            }
            return;
        }
        w4kVar2 = w4kVar;
        if ((i2 & 3072) != 0) {
        }
        if (oq5Var2.P(i4 & 1, (i4 & 1171) == 1170)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void c(nii niiVar, ne1 ne1Var, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        niiVar.getClass();
        ne1Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(441117298);
        int i3 = i2 | (oq5Var.f(niiVar) ? 4 : 2) | (oq5Var.h(ne1Var) ? 32 : 16) | 384;
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            Object obj = (am1) szf.Q(ne1Var.h, oq5Var).getValue();
            boolean z = obj instanceof yl1;
            vci vciVar = vci.a;
            if (z) {
                oq5Var.Z(-1288028402);
                jf0.o(niiVar, ((yl1) obj).a, vciVar, oq5Var, (i3 & 14) | 3072);
                oq5Var.p(false);
            } else {
                if (!(obj instanceof zl1)) {
                    throw vz1.i(oq5Var, -1288030990, false);
                }
                oq5Var.Z(-1288021076);
                zl1 zl1Var = (zl1) obj;
                ArrayList arrayList = zl1Var.a;
                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((nk1) it.next()).a);
                }
                context.getClass();
                boolean f2 = oq5Var.f(context) | oq5Var.f(arrayList);
                Object K = oq5Var.K();
                Object obj2 = gq5.a;
                if (f2 || K == obj2) {
                    K = new hl1(context, ne1Var, arrayList);
                    oq5Var.k0(K);
                }
                hl1 hl1Var = (hl1) K;
                yci a2 = androidx.compose.ui.platform.a.a(vciVar, "artist_tracks_success_pager");
                boolean f3 = oq5Var.f(obj) | oq5Var.h(ne1Var);
                Object K2 = oq5Var.K();
                if (f3 || K2 == obj2) {
                    K2 = new ar(9, zl1Var, ne1Var);
                    oq5Var.k0(K2);
                }
                jf0.n(niiVar, arrayList2, hl1Var, a2, (pyc) K2, null, oq5Var, i3 & 14);
                oq5Var.p(false);
            }
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new sh1(niiVar, ne1Var, yciVar2, i2, 3);
        }
    }

    public static final void d(List list, u44 u44Var, hq5 hq5Var, int i2) {
        int i3;
        list.getClass();
        u44Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(346470546);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(u44Var) : oq5Var.h(u44Var) ? 32 : 16;
        }
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            pm0.a(null, ild.C(-1624925157, new sh1(15, list, u44Var, ywf.s(oq5Var)), oq5Var), oq5Var, 48, 1);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z2(list, u44Var, i2, 12);
        }
    }

    public static final void e(ys4 ys4Var, hq5 hq5Var, int i2) {
        aqi aqiVar;
        int i3;
        int i4;
        mm6 mm6Var;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(334332128);
        int i5 = i2 | (oq5Var.f(ys4Var) ? 4 : 2);
        if ((i5 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(null);
                oq5Var.k0(K);
            }
            aqi aqiVar2 = (aqi) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var2 = ((fs5) K2).a;
            vci vciVar = vci.a;
            yci c2 = androidx.compose.foundation.layout.d.c(vciVar, 1.0f);
            kfh d2 = ug3.d(b2c.b, false);
            int i6 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, c2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            w4k w4kVar = (w4k) aqiVar2.getValue();
            if (w4kVar == null) {
                oq5Var.Z(-986646422);
                oq5Var.p(false);
                aqiVar = aqiVar2;
                i3 = 0;
                i4 = i5;
                mm6Var = mm6Var2;
            } else {
                oq5Var.Z(-986646421);
                aqiVar = aqiVar2;
                i3 = 0;
                i4 = i5;
                mm6Var = mm6Var2;
                irf.r(w4kVar, null, androidx.compose.foundation.layout.d.c(vciVar, 1.0f), null, hd6.a, 0.0f, null, oq5Var, 25008, 104);
                oq5Var.p(false);
            }
            qs4 qs4Var = ys4Var.c;
            String str = qs4Var != null ? qs4Var.a : null;
            act S = weo.S(300, i3, null, 6);
            if ((i4 & 14) == 4) {
                i3 = 1;
            }
            Object K3 = oq5Var.K();
            if (i3 != 0 || K3 == kjnVar) {
                K3 = new v5(21, ys4Var);
                oq5Var.k0(K3);
            }
            ot0.l(str, (Function1) K3, null, S, "backgroundSlideCrossfade", false, ild.C(-1749914338, new ar(18, mm6Var, aqiVar), oq5Var), oq5Var, 1600512, 36);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ss4(ys4Var, i2);
        }
    }

    public static final long f(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void g(ugs ugsVar, hq5 hq5Var, int i2) {
        int i3;
        ugsVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1694867500);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(ugsVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        int i5 = 0;
        if (oq5Var.P(i4 & 1, (i4 & 19) != 18)) {
            int i6 = a54.a[ugsVar.getType().ordinal()];
            vci vciVar = vci.a;
            if (i6 == 1) {
                oq5Var.Z(-161979961);
                kfh d2 = ug3.d(b2c.b, false);
                int i7 = oq5Var.P;
                a l2 = oq5Var.l();
                yci H = vnj.H(oq5Var, vciVar);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, d2, wp5.f);
                g0g.U(oq5Var, l2, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var, i7, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                irf.y(ugsVar.getUrl(), ugsVar.getType(), androidx.compose.foundation.layout.d.c(b.c(vciVar, "cover", ugsVar.getUrl()), 1.0f), false, true, new d43(d85.b(d85.b, 0.2f, 0.0f, 0.0f, 0.0f, 14), 24), null, null, oq5Var, ((i4 << 15) & 3670016) | 24576, 136);
                gae.b(a0g.E(R.drawable.ic_lock_mid_24, 0, oq5Var), null, androidx.compose.foundation.layout.b.a.a(vciVar, b2c.h), d85.b(d85.f, 0.9f, 0.0f, 0.0f, 0.0f, 14), oq5Var, 3120, 0);
                oq5Var.p(true);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-161101235);
                irf.y(ugsVar.getUrl(), ugsVar.getType(), androidx.compose.foundation.layout.d.c(b.c(vciVar, "cover", ugsVar.getUrl()), 1.0f), false, true, null, null, null, oq5Var, ((i4 << 15) & 3670016) | 24576, 168);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z44(ugsVar, i2, i5);
        }
    }

    public static final void h(zwa zwaVar, yci yciVar, hq5 hq5Var, int i2) {
        boolean g2;
        boolean L;
        zwaVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1720548904);
        int i3 = (oq5Var.h(zwaVar) ? 4 : 2) | i2 | 48;
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (irv.h(oq5Var)) {
                oq5Var.Z(-732544862);
                oq5Var.p(false);
                g2 = true;
            } else {
                oq5Var.Z(114917622);
                g2 = irv.g(oq5Var);
                oq5Var.p(false);
            }
            if (g2) {
                oq5Var.Z(-732543808);
                oq5Var.p(false);
                L = true;
            } else {
                oq5Var.Z(114918707);
                L = c3x.L(oq5Var);
                oq5Var.p(false);
            }
            boolean h2 = oq5Var.h(zwaVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                K = new pua(zwaVar, 2);
                oq5Var.k0(K);
            }
            pd.c(0, 1, oq5Var, (Function0) K, false);
            vci vciVar = vci.a;
            if (L) {
                oq5Var.Z(-732368616);
                Object K2 = oq5Var.K();
                if (K2 == kjnVar) {
                    K2 = new rua(4);
                    oq5Var.k0(K2);
                }
                tua.a(zwaVar, nfp.b(vciVar, false, (Function1) K2), oq5Var, i3 & 14);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-732187793);
                hva.a(zwaVar, oq5Var, i3 & 126);
                oq5Var.p(false);
            }
            yciVar = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kw5(zwaVar, yciVar, i2, 24);
        }
    }

    public static final void i(heb hebVar, hq5 hq5Var, int i2) {
        hebVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(491175083);
        int i3 = (oq5Var.h(hebVar) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            keb kebVar = (keb) szf.Q(hebVar.i, oq5Var).getValue();
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            boolean h2 = oq5Var.h(hebVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                dda ddaVar = new dda(0, hebVar, heb.class, "onBackClicked", "onBackClicked()V", 0, 28);
                oq5Var.k0(ddaVar);
                K = ddaVar;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean h3 = oq5Var.h(hebVar);
            Object K2 = oq5Var.K();
            if (h3 || K2 == kjnVar) {
                dda ddaVar2 = new dda(0, hebVar, heb.class, "onSearchClicked", "onSearchClicked()V", 0, 29);
                oq5Var.k0(ddaVar2);
                K2 = ddaVar2;
            }
            Function0 function02 = (Function0) ((h9f) K2);
            boolean h4 = oq5Var.h(hebVar);
            Object K3 = oq5Var.K();
            if (h4 || K3 == kjnVar) {
                ceb cebVar = new ceb(0, hebVar, heb.class, "openSortBottomSheet", "openSortBottomSheet()V", 0, 0);
                oq5Var.k0(cebVar);
                K3 = cebVar;
            }
            kg5.g(R.string.downloaded_episodes, a2, function0, function02, (Function0) ((h9f) K3), ild.C(-1315566568, new xk(29, kebVar, hebVar, a2), oq5Var), oq5Var, 196608, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new nha(hebVar, i2, 9);
        }
    }

    public static final void j(final wn5 wn5Var, final List list, final yci yciVar, yci yciVar2, o0k o0kVar, float f2, float f3, fvf fvfVar, final Function2 function2, boolean z, boolean z2, int i2, final wn5 wn5Var2, hq5 hq5Var, final int i3) {
        int i4;
        final yci yciVar3;
        final o0k o0kVar2;
        final float f4;
        final float f5;
        final fvf fvfVar2;
        final boolean z3;
        final boolean z4;
        final int i5;
        fvf a2;
        yci yciVar4;
        int i6;
        int i7;
        o0k o0kVar3;
        float f6;
        boolean z5;
        boolean z6;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(194577981);
        if ((i3 & 6) == 0) {
            i4 = (oq5Var.h(wn5Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= (i3 & 64) == 0 ? oq5Var.f(list) : oq5Var.h(list) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        int i8 = i4 | 3072;
        if ((i3 & 24576) == 0) {
            i8 = i4 | 11264;
        }
        if ((196608 & i3) == 0) {
            i8 |= SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i9 = 1572864 | i8;
        if ((12582912 & i3) == 0) {
            i9 = 5767168 | i8;
        }
        if ((100663296 & i3) == 0) {
            i9 |= oq5Var.h(function2) ? 67108864 : 33554432;
        }
        int i10 = i9 | 805306368;
        if (oq5Var.P(i10 & 1, (306783379 & i10) != 306783378)) {
            oq5Var.U();
            if ((i3 & 1) == 0 || oq5Var.y()) {
                q0k q0kVar = vt0.c;
                float f7 = vt0.a;
                a2 = hvf.a(0, 0, oq5Var, 0, 3);
                yciVar4 = vci.a;
                i6 = i10 & (-29876225);
                i7 = 2;
                o0kVar3 = q0kVar;
                f6 = Float.NaN;
                f4 = f7;
                z5 = true;
                z6 = true;
            } else {
                oq5Var.S();
                yciVar4 = yciVar2;
                o0kVar3 = o0kVar;
                f4 = f2;
                f6 = f3;
                a2 = fvfVar;
                z6 = z;
                z5 = z2;
                i6 = i10 & (-29876225);
                i7 = i2;
            }
            oq5Var.q();
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(Boolean.FALSE);
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            int i11 = i6 >> 6;
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i12 = oq5Var.P;
            a l2 = oq5Var.l();
            int i13 = i7;
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            o0k o0kVar4 = o0kVar3;
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i12))) {
                ouj.x(i12, oq5Var, i12, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            Object obj = (Boolean) aqiVar.getValue();
            obj.getClass();
            wn5Var.invoke(obj, oq5Var, Integer.valueOf((i6 << 3) & 112));
            Function2 function22 = !z6 ? function2 : null;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new x80(aqiVar, 16);
                oq5Var.k0(K2);
            }
            o0kVar2 = o0kVar4;
            yci yciVar5 = yciVar4;
            fvf fvfVar3 = a2;
            up6.i(list, yciVar5, null, o0kVar2, f4, 0.0f, f6, fvfVar3, function22, (Function1) K2, z5, i13, wn5Var2, oq5Var, ((i6 >> 3) & 14) | 805306368 | (i11 & 112) | (3670016 & i6), 390, 36);
            oq5Var.p(true);
            yciVar3 = yciVar5;
            f5 = f6;
            fvfVar2 = fvfVar3;
            z4 = z5;
            i5 = i13;
            z3 = z6;
        } else {
            oq5Var.S();
            yciVar3 = yciVar2;
            o0kVar2 = o0kVar;
            f4 = f2;
            f5 = f3;
            fvfVar2 = fvfVar;
            z3 = z;
            z4 = z2;
            i5 = i2;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: gqd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int R = rvf.R(i3 | 1);
                    x97.j(wn5.this, list, yciVar, yciVar3, o0kVar2, f4, f5, fvfVar2, function2, z3, z4, i5, wn5Var2, (hq5) obj2, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final void k(Boolean bool, yci yciVar, hq5 hq5Var, int i2) {
        Boolean bool2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1627883365);
        int i3 = (oq5Var.f(bool) ? 4 : 2) | i2 | 48;
        int i4 = 0;
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            bool2 = bool;
        } else {
            Integer valueOf = Integer.valueOf(R.string.isStartFromCache);
            oq5Var.a0(-2115993395);
            qs5 qs5Var = r8g.a;
            iag iagVar = (iag) oq5Var.j(qs5Var);
            oq5Var.p(false);
            boolean z = iagVar.L;
            oq5Var.a0(-2115993395);
            iag iagVar2 = (iag) oq5Var.j(qs5Var);
            oq5Var.p(false);
            vci vciVar = vci.a;
            bool2 = bool;
            h4a.i(valueOf, bool2, vciVar, false, z, iagVar2.M, oq5Var, (i3 << 3) & 1008, 8);
            yciVar = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uye(bool2, yciVar, i2, i4);
        }
    }

    public static final void l(long j2, hq5 hq5Var, int i2) {
        long j3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-26356757);
        int i3 = 2;
        int i4 = (oq5Var.e(j2) ? 4 : 2) | i2;
        if (oq5Var.P(i4 & 1, (i4 & 3) != 2)) {
            j3 = j2;
            gae.b(a0g.E(R.drawable.ic_pin_small_16, 0, oq5Var), null, androidx.compose.ui.platform.a.a(androidx.compose.foundation.layout.d.m(vci.a, hag.E(16, 3, oq5Var)), "pin"), j3, oq5Var, ((i4 << 9) & 7168) | 48, 0);
        } else {
            j3 = j2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bu0(j3, i2, i3);
        }
    }

    public static final void m(vb vbVar, qfp qfpVar) {
        jfp jfpVar = qfpVar.d;
        tpi tpiVar = jfpVar.a;
        Object g2 = jfpVar.a.g(ufp.w);
        if (g2 == null) {
            g2 = null;
        }
        meo meoVar = (meo) g2;
        if (bf0.a(qfpVar)) {
            if (meoVar != null && meoVar.a == 8) {
                return;
            }
            Object g3 = tpiVar.g(hfp.x);
            if (g3 == null) {
                g3 = null;
            }
            sa saVar = (sa) g3;
            if (saVar != null) {
                vbVar.b(new qb(android.R.id.accessibilityActionPageUp, saVar.a));
            }
            Object g4 = tpiVar.g(hfp.z);
            if (g4 == null) {
                g4 = null;
            }
            sa saVar2 = (sa) g4;
            if (saVar2 != null) {
                vbVar.b(new qb(android.R.id.accessibilityActionPageDown, saVar2.a));
            }
            Object g5 = tpiVar.g(hfp.y);
            if (g5 == null) {
                g5 = null;
            }
            sa saVar3 = (sa) g5;
            if (saVar3 != null) {
                vbVar.b(new qb(android.R.id.accessibilityActionPageLeft, saVar3.a));
            }
            Object g6 = tpiVar.g(hfp.A);
            sa saVar4 = (sa) (g6 != null ? g6 : null);
            if (saVar4 != null) {
                vbVar.b(new qb(android.R.id.accessibilityActionPageRight, saVar4.a));
            }
        }
    }

    public static final thj n(h06 h06Var, int i2, int i3) {
        h06Var.getClass();
        String str = h06Var.a;
        str.getClass();
        return new thj(pkb.Concert, str, i2 + 1, i3 + 1, "");
    }

    public static final thj o(h06 h06Var, spd spdVar) {
        h06Var.getClass();
        spdVar.getClass();
        return n(h06Var, spdVar.a, spdVar.b);
    }

    public static ou7 p(mm6 mm6Var, CoroutineContext coroutineContext, pm6 pm6Var, Function2 function2, int i2) {
        if ((i2 & 1) != 0) {
            coroutineContext = g.a;
        }
        if ((i2 & 2) != 0) {
            pm6Var = pm6.a;
        }
        CoroutineContext b2 = bm6.b(mm6Var, coroutineContext);
        ou7 trfVar = pm6Var == pm6.b ? new trf(b2, function2) : new ou7(b2, true, true);
        trfVar.o0(pm6Var, trfVar, function2);
        return trfVar;
    }

    public static void q(String str, boolean z) {
        if (!z) {
            throw r7k.a(null, str);
        }
    }

    public static final boolean r(dpc dpcVar, boolean z) {
        int ordinal = dpcVar.U0().ordinal();
        if (ordinal == 0) {
            ((uoc) bcx.G(dpcVar).getFocusOwner()).f(null);
            dpcVar.S0(bpc.a, bpc.d);
            return true;
        }
        if (ordinal == 1) {
            dpc z2 = ff7.z(dpcVar);
            if (!(z2 != null ? r(z2, z) : true)) {
                return false;
            }
            dpcVar.S0(bpc.b, bpc.d);
            return true;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return true;
            }
            b6e.s();
            return false;
        }
        if (z) {
            ((uoc) bcx.G(dpcVar).getFocusOwner()).f(null);
            dpcVar.S0(bpc.c, bpc.d);
        }
        return z;
    }

    public static boolean t(File file) {
        File[] listFiles;
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                t(file2);
            }
        }
        return file.delete();
    }

    public static boolean u(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = u(file2) && z;
        }
        return z;
    }

    public static final String v(kcp kcpVar) {
        em2 em2Var;
        em2 em2Var2;
        kcpVar.getClass();
        rfk rfkVar = kcpVar.a;
        if (!(rfkVar instanceof ffk)) {
            if (!(rfkVar instanceof mfk)) {
                if (rfkVar instanceof kfk ? true : rfkVar instanceof lfk) {
                    okr[] okrVarArr = okr.a;
                    return "sbp";
                }
                if (rfkVar instanceof pfk) {
                    okr[] okrVarArr2 = okr.a;
                    return "plus_card";
                }
                em2 em2Var3 = em2.SBERBANK;
                return "unknown";
            }
            String str = ((mfk) rfkVar).b;
            str.getClass();
            em2[] values = em2.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    em2Var = null;
                    break;
                }
                em2Var = values[i2];
                if (em2Var.b.equals(str)) {
                    break;
                }
                i2++;
            }
            if (em2Var != null) {
                return em2Var.a;
            }
            em2 em2Var4 = em2.SBERBANK;
            return "unknown";
        }
        dm2 dm2Var = ((ffk) rfkVar).d;
        dm2Var.getClass();
        switch (dm2Var.ordinal()) {
            case 0:
                em2Var2 = em2.ALPHA_BANK;
                break;
            case 1:
                em2Var2 = em2.SBERBANK;
                break;
            case 2:
                em2Var2 = em2.TINKOFF;
                break;
            case 3:
                em2Var2 = em2.VTB;
                break;
            case 4:
                em2Var2 = em2.GAZPROM;
                break;
            case 5:
            case 9:
            case 10:
            default:
                em2Var2 = em2.UNKNOWN;
                break;
            case 6:
                em2Var2 = em2.OPEN_BANK;
                break;
            case 7:
                em2Var2 = em2.PROMSVYAZ;
                break;
            case 8:
                em2Var2 = em2.ROSBANK;
                break;
            case 11:
                em2Var2 = em2.UNICREDIT_BANK;
                break;
            case 12:
                em2Var2 = em2.RAIFFEISEN_BANK;
                break;
        }
        return em2Var2.a;
    }

    public static final String w(c5c c5cVar, tc1 tc1Var, g0c g0cVar) {
        d5c X = f8g.X(c5cVar.f);
        if (c5cVar.g) {
            return tc1Var.b(R.string.paymentsdk_prebuilt_family_pay_available_unlimit);
        }
        if (c5cVar.d() <= 0.0d) {
            return tc1Var.b(R.string.paymentsdk_prebuilt_family_pay_limit_reached);
        }
        double d2 = c5cVar.d();
        String str = c5cVar.e;
        tc1Var.getClass();
        str.getClass();
        g0cVar.getClass();
        String I = irf.I(tc1Var.a, d2, str, g0cVar);
        int i2 = X == null ? -1 : r27.a[X.ordinal()];
        if (i2 == -1) {
            return tc1Var.c(R.string.paymentsdk_prebuilt_family_pay_available_format, new Object[]{I});
        }
        if (i2 == 1) {
            return tc1Var.c(R.string.paymentsdk_prebuilt_family_pay_available_day_format, new Object[]{I});
        }
        if (i2 == 2) {
            return tc1Var.c(R.string.paymentsdk_prebuilt_family_pay_available_week_format, new Object[]{I});
        }
        if (i2 == 3) {
            return tc1Var.c(R.string.paymentsdk_prebuilt_family_pay_available_month_format, new Object[]{I});
        }
        b6e.s();
        return null;
    }

    public static final rar x(mm6 mm6Var, CoroutineContext coroutineContext, pm6 pm6Var, Function2 function2) {
        CoroutineContext b2 = bm6.b(mm6Var, coroutineContext);
        pm6Var.getClass();
        rar vvfVar = pm6Var == pm6.b ? new vvf(b2, function2) : new rar(b2, true, true);
        vvfVar.o0(pm6Var, vvfVar, function2);
        return vvfVar;
    }

    public static /* synthetic */ rar y(mm6 mm6Var, CoroutineContext coroutineContext, pm6 pm6Var, Function2 function2, int i2) {
        if ((i2 & 1) != 0) {
            coroutineContext = g.a;
        }
        if ((i2 & 2) != 0) {
            pm6Var = pm6.a;
        }
        return x(mm6Var, coroutineContext, pm6Var, function2);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.functions.Function1, uif] */
    public static final xw6 z(dpc dpcVar, int i2) {
        int ordinal = dpcVar.U0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                dpc z = ff7.z(dpcVar);
                if (z == null) {
                    xq0.x("ActiveParent with no focused child");
                    return null;
                }
                xw6 z2 = z(z, i2);
                xw6 xw6Var = xw6.a;
                xw6 xw6Var2 = z2 != xw6Var ? z2 : null;
                if (xw6Var2 != null) {
                    return xw6Var2;
                }
                if (dpcVar.p) {
                    return xw6Var;
                }
                dpcVar.p = true;
                try {
                    woc T0 = dpcVar.T0();
                    qt3 qt3Var = new qt3(i2);
                    up6.x(dpcVar);
                    toc focusOwner = bcx.G(dpcVar).getFocusOwner();
                    dpc dpcVar2 = ((uoc) focusOwner).l;
                    T0.k.invoke(qt3Var);
                    dpc dpcVar3 = ((uoc) focusOwner).l;
                    if (!qt3Var.b) {
                        return (dpcVar2 == dpcVar3 || dpcVar3 == null) ? xw6Var : yoc.d == yoc.c ? xw6.b : xw6.c;
                    }
                    yoc yocVar = yoc.b;
                    return xw6.b;
                } finally {
                    dpcVar.p = false;
                }
            }
            if (ordinal == 2) {
                return xw6.b;
            }
            if (ordinal != 3) {
                b6e.s();
                return null;
            }
        }
        return xw6.a;
    }

    public Object I(cb8 cb8Var, xzb xzbVar) {
        return s(cb8Var, xzbVar);
    }

    public Object J(db8 db8Var, xzb xzbVar) {
        return s(db8Var, xzbVar);
    }

    public Object K(eb8 eb8Var, xzb xzbVar) {
        return s(eb8Var, xzbVar);
    }

    public Object L(fb8 fb8Var, xzb xzbVar) {
        return s(fb8Var, xzbVar);
    }

    public Object M(gb8 gb8Var, xzb xzbVar) {
        return s(gb8Var, xzbVar);
    }

    public Object N(hb8 hb8Var, xzb xzbVar) {
        return s(hb8Var, xzbVar);
    }

    public Object O(kb8 kb8Var, xzb xzbVar) {
        return s(kb8Var, xzbVar);
    }

    public Object P(mb8 mb8Var, xzb xzbVar) {
        return s(mb8Var, xzbVar);
    }

    public Object Q(ob8 ob8Var, xzb xzbVar) {
        return s(ob8Var, xzbVar);
    }

    public Object R(qb8 qb8Var, xzb xzbVar) {
        return s(qb8Var, xzbVar);
    }

    public Object S(rb8 rb8Var, xzb xzbVar) {
        return s(rb8Var, xzbVar);
    }

    public Object T(sb8 sb8Var, xzb xzbVar) {
        return s(sb8Var, xzbVar);
    }

    public Object U(jc8 jc8Var, xzb xzbVar) {
        if (jc8Var instanceof rb8) {
            return S((rb8) jc8Var, xzbVar);
        }
        if (jc8Var instanceof hb8) {
            return N((hb8) jc8Var, xzbVar);
        }
        if (jc8Var instanceof fb8) {
            return L((fb8) jc8Var, xzbVar);
        }
        if (jc8Var instanceof mb8) {
            return P((mb8) jc8Var, xzbVar);
        }
        if (jc8Var instanceof cb8) {
            return I((cb8) jc8Var, xzbVar);
        }
        if (jc8Var instanceof gb8) {
            return M((gb8) jc8Var, xzbVar);
        }
        if (jc8Var instanceof eb8) {
            return K((eb8) jc8Var, xzbVar);
        }
        if (jc8Var instanceof kb8) {
            return O((kb8) jc8Var, xzbVar);
        }
        if (jc8Var instanceof qb8) {
            return R((qb8) jc8Var, xzbVar);
        }
        if (jc8Var instanceof ob8) {
            return Q((ob8) jc8Var, xzbVar);
        }
        if (jc8Var instanceof db8) {
            return J((db8) jc8Var, xzbVar);
        }
        if (jc8Var instanceof ib8) {
            return s((ib8) jc8Var, xzbVar);
        }
        if (jc8Var instanceof nb8) {
            return s((nb8) jc8Var, xzbVar);
        }
        if (jc8Var instanceof jb8) {
            return s((jb8) jc8Var, xzbVar);
        }
        if (jc8Var instanceof lb8) {
            return s((lb8) jc8Var, xzbVar);
        }
        if (jc8Var instanceof sb8) {
            return T((sb8) jc8Var, xzbVar);
        }
        if (jc8Var instanceof pb8) {
            return s((pb8) jc8Var, xzbVar);
        }
        b6e.s();
        return null;
    }

    public abstract Object s(jc8 jc8Var, xzb xzbVar);
}
