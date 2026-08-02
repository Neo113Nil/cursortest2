package defpackage;

import android.os.Trace;
import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusOwnerImpl$modifier$1;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.uoc;
import defpackage.xci;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class uoc implements toc {
    public final le0 a;
    public final m5 b;
    public final zy c;
    public final zy d;
    public final me0 e;
    public final dpc f = new dpc(2, 6, null);
    public final roc g;
    public final d51 h;
    public final FocusOwnerImpl$modifier$1 i;
    public zoi j;
    public final gpi k;
    public dpc l;

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.focus.FocusOwnerImpl$modifier$1] */
    public uoc(m5 m5Var, le0 le0Var, m5 m5Var2, zy zyVar, zy zyVar2, me0 me0Var) {
        this.a = le0Var;
        this.b = m5Var2;
        this.c = zyVar;
        this.d = zyVar2;
        this.e = me0Var;
        int i = 0;
        int i2 = 1;
        this.g = new roc(m5Var, new ceb(i, this, uoc.class, "invalidateOwnerFocusState", "invalidateOwnerFocusState()V", 0, 27), new jk6(i, i2, uoc.class, this, "rootState", "getRootState()Landroidx/compose/ui/focus/FocusState;"), new me0(i, i2, uoc.class, this, "activeFocusTargetNode", "getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;"));
        d51 d51Var = new d51(23);
        vso.b();
        this.h = d51Var;
        this.i = new edi() { // from class: androidx.compose.ui.focus.FocusOwnerImpl$modifier$1
            @Override // defpackage.edi
            public final xci e() {
                return uoc.this.f;
            }

            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return uoc.this.f.hashCode();
            }

            @Override // defpackage.edi
            public final /* bridge */ /* synthetic */ void j(xci xciVar) {
            }
        };
        this.k = new gpi(1);
    }

    public final boolean a(boolean z) {
        cr crVar;
        dpc dpcVar = this.l;
        if (dpcVar != null) {
            f(null);
            dpcVar.S0(bpc.a, bpc.d);
            if (!dpcVar.a.n) {
                sme.b("visitAncestors called on an unattached node");
            }
            xci xciVar = dpcVar.a.e;
            mpf F = bcx.F(dpcVar);
            while (F != null) {
                if ((((xci) F.F.f).d & 1024) != 0) {
                    while (xciVar != null) {
                        if ((xciVar.c & 1024) != 0) {
                            eqi eqiVar = null;
                            xci xciVar2 = xciVar;
                            while (xciVar2 != null) {
                                if (xciVar2 instanceof dpc) {
                                    ((dpc) xciVar2).S0(bpc.b, bpc.d);
                                } else if ((xciVar2.c & 1024) != 0 && (xciVar2 instanceof cw7)) {
                                    int i = 0;
                                    for (xci xciVar3 = ((cw7) xciVar2).p; xciVar3 != null; xciVar3 = xciVar3.f) {
                                        if ((xciVar3.c & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                xciVar2 = xciVar3;
                                            } else {
                                                if (eqiVar == null) {
                                                    eqiVar = new eqi(new xci[16]);
                                                }
                                                if (xciVar2 != null) {
                                                    eqiVar.d(xciVar2);
                                                    xciVar2 = null;
                                                }
                                                eqiVar.d(xciVar3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                xciVar2 = bcx.p(eqiVar);
                            }
                        }
                        xciVar = xciVar.e;
                    }
                }
                F = F.u();
                xciVar = (F == null || (crVar = F.F) == null) ? null : (i4s) crVar.e;
            }
        }
        return true;
    }

    public final boolean b(int i, boolean z, boolean z2) {
        boolean z3 = true;
        if (z) {
            a(z);
        } else {
            int ordinal = x97.z(this.f, i).ordinal();
            if (ordinal == 0) {
                a(z);
            } else {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    b6e.s();
                    return false;
                }
                z3 = false;
            }
        }
        if (z3 && z2) {
            this.c.invoke();
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r8 == null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0172 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x001c, B:13:0x0026, B:16:0x0032, B:18:0x0038, B:19:0x003d, B:21:0x0045, B:23:0x004a, B:25:0x0050, B:29:0x0056, B:34:0x0172, B:36:0x0178, B:37:0x017b, B:39:0x0186, B:42:0x0194, B:46:0x019e, B:81:0x01a4, B:82:0x01a9, B:75:0x01e3, B:48:0x01ad, B:50:0x01b3, B:52:0x01b7, B:54:0x01bf, B:56:0x01c5, B:62:0x01cd, B:64:0x01d6, B:65:0x01da, B:60:0x01dd, B:84:0x01e8, B:87:0x01eb, B:89:0x01f1, B:96:0x01f5, B:101:0x01fe, B:103:0x0206, B:111:0x021d, B:112:0x022b, B:114:0x022f, B:153:0x0233, B:148:0x0289, B:116:0x023f, B:118:0x0248, B:120:0x024c, B:122:0x0253, B:124:0x0259, B:126:0x025d, B:129:0x0260, B:131:0x0266, B:132:0x026d, B:134:0x0275, B:135:0x027a, B:137:0x0280, B:128:0x0283, B:159:0x0294, B:163:0x02a4, B:164:0x02b2, B:166:0x02b6, B:205:0x02ba, B:200:0x0310, B:168:0x02c6, B:170:0x02cf, B:172:0x02d3, B:174:0x02da, B:176:0x02e0, B:178:0x02e4, B:181:0x02e7, B:183:0x02ed, B:184:0x02f4, B:186:0x02fc, B:187:0x0301, B:189:0x0307, B:180:0x030a, B:212:0x031d, B:214:0x0324, B:227:0x005e, B:229:0x0064, B:230:0x0067, B:232:0x006f, B:235:0x007d, B:239:0x0087, B:274:0x00dc, B:276:0x00e0, B:241:0x008c, B:243:0x0092, B:245:0x0096, B:247:0x009e, B:249:0x00a4, B:255:0x00ac, B:257:0x00b5, B:258:0x00b9, B:253:0x00bc, B:264:0x00c2, B:278:0x00c7, B:281:0x00ca, B:283:0x00d0, B:290:0x00d4, B:295:0x00e6, B:297:0x00ec, B:298:0x00ef, B:300:0x00f9, B:303:0x0107, B:307:0x0111, B:342:0x0166, B:344:0x016a, B:309:0x0116, B:311:0x011c, B:313:0x0120, B:315:0x0128, B:317:0x012e, B:323:0x0136, B:325:0x013f, B:326:0x0143, B:321:0x0146, B:332:0x014c, B:347:0x0151, B:350:0x0154, B:352:0x015a, B:359:0x015e), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(KeyEvent keyEvent, Function0 function0) {
        sv7 sv7Var;
        xci xciVar;
        cr crVar;
        sv7 sv7Var2;
        cr crVar2;
        int size;
        cr crVar3;
        dpc dpcVar = this.f;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.g.f) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!g(keyEvent)) {
                return false;
            }
            dpc x = ff7.x(dpcVar);
            if (x != null) {
                if (!x.a.n) {
                    sme.b("visitLocalDescendants called on an unattached node");
                }
                xci xciVar2 = x.a;
                if ((xciVar2.d & 9216) != 0) {
                    xciVar = null;
                    for (xci xciVar3 = xciVar2.f; xciVar3 != null; xciVar3 = xciVar3.f) {
                        int i = xciVar3.c;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            xciVar = xciVar3;
                        }
                    }
                } else {
                    xciVar = null;
                }
            }
            if (x != null) {
                if (!x.a.n) {
                    sme.b("visitAncestors called on an unattached node");
                }
                xci xciVar4 = x.a;
                mpf F = bcx.F(x);
                loop11: while (true) {
                    if (F == null) {
                        sv7Var2 = null;
                        break;
                    }
                    if ((((xci) F.F.f).d & RemoteCameraConfig.Notification.ID) != 0) {
                        while (xciVar4 != null) {
                            if ((xciVar4.c & RemoteCameraConfig.Notification.ID) != 0) {
                                eqi eqiVar = null;
                                xci xciVar5 = xciVar4;
                                while (xciVar5 != null) {
                                    if (xciVar5 instanceof waf) {
                                        sv7Var2 = xciVar5;
                                        break loop11;
                                    }
                                    if ((xciVar5.c & RemoteCameraConfig.Notification.ID) != 0 && (xciVar5 instanceof cw7)) {
                                        xci xciVar6 = ((cw7) xciVar5).p;
                                        int i2 = 0;
                                        xciVar5 = xciVar5;
                                        eqiVar = eqiVar;
                                        while (xciVar6 != null) {
                                            if ((xciVar6.c & RemoteCameraConfig.Notification.ID) != 0) {
                                                i2++;
                                                eqiVar = eqiVar;
                                                if (i2 == 1) {
                                                    xciVar5 = xciVar6;
                                                } else {
                                                    if (eqiVar == null) {
                                                        eqiVar = new eqi(new xci[16]);
                                                    }
                                                    if (xciVar5 != null) {
                                                        eqiVar.d(xciVar5);
                                                        xciVar5 = null;
                                                    }
                                                    eqiVar.d(xciVar6);
                                                }
                                            }
                                            xciVar6 = xciVar6.f;
                                            xciVar5 = xciVar5;
                                            eqiVar = eqiVar;
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    xciVar5 = bcx.p(eqiVar);
                                }
                            }
                            xciVar4 = xciVar4.e;
                        }
                    }
                    F = F.u();
                    xciVar4 = (F == null || (crVar2 = F.F) == null) ? null : (i4s) crVar2.e;
                }
                sv7 sv7Var3 = (waf) sv7Var2;
                if (sv7Var3 != null) {
                    xciVar = ((xci) sv7Var3).a;
                    if (xciVar != null) {
                        if (!xciVar.a.n) {
                            sme.b("visitAncestors called on an unattached node");
                        }
                        xci xciVar7 = xciVar.a.e;
                        mpf F2 = bcx.F(xciVar);
                        ArrayList arrayList = null;
                        while (F2 != null) {
                            if ((((xci) F2.F.f).d & RemoteCameraConfig.Notification.ID) != 0) {
                                while (xciVar7 != null) {
                                    if ((xciVar7.c & RemoteCameraConfig.Notification.ID) != 0) {
                                        xci xciVar8 = xciVar7;
                                        eqi eqiVar2 = null;
                                        while (xciVar8 != null) {
                                            if (xciVar8 instanceof waf) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(xciVar8);
                                            } else if ((xciVar8.c & RemoteCameraConfig.Notification.ID) != 0 && (xciVar8 instanceof cw7)) {
                                                int i3 = 0;
                                                for (xci xciVar9 = ((cw7) xciVar8).p; xciVar9 != null; xciVar9 = xciVar9.f) {
                                                    if ((xciVar9.c & RemoteCameraConfig.Notification.ID) != 0) {
                                                        i3++;
                                                        if (i3 == 1) {
                                                            xciVar8 = xciVar9;
                                                        } else {
                                                            if (eqiVar2 == null) {
                                                                eqiVar2 = new eqi(new xci[16]);
                                                            }
                                                            if (xciVar8 != null) {
                                                                eqiVar2.d(xciVar8);
                                                                xciVar8 = null;
                                                            }
                                                            eqiVar2.d(xciVar9);
                                                        }
                                                    }
                                                }
                                                if (i3 == 1) {
                                                }
                                            }
                                            xciVar8 = bcx.p(eqiVar2);
                                        }
                                    }
                                    xciVar7 = xciVar7.e;
                                }
                            }
                            F2 = F2.u();
                            xciVar7 = (F2 == null || (crVar3 = F2.F) == null) ? null : (i4s) crVar3.e;
                        }
                        if (arrayList != null && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i4 = size - 1;
                                if (((waf) arrayList.get(size)).Q(keyEvent)) {
                                    return true;
                                }
                                if (i4 < 0) {
                                    break;
                                }
                                size = i4;
                            }
                        }
                        xci xciVar10 = xciVar.a;
                        xqn xqnVar = new xqn();
                        xqn xqnVar2 = new xqn();
                        xqnVar2.a = xciVar10;
                        while (true) {
                            Object obj = xqnVar2.a;
                            if (obj != null) {
                                if (obj instanceof waf) {
                                    if (((waf) obj).Q(keyEvent)) {
                                        return true;
                                    }
                                } else if ((((xci) obj).c & RemoteCameraConfig.Notification.ID) != 0 && (obj instanceof cw7)) {
                                    int i5 = 0;
                                    for (xci xciVar11 = ((cw7) obj).p; xciVar11 != null; xciVar11 = xciVar11.f) {
                                        if ((xciVar11.c & RemoteCameraConfig.Notification.ID) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                xqnVar2.a = xciVar11;
                                            } else {
                                                eqi eqiVar3 = (eqi) xqnVar.a;
                                                if (eqiVar3 == null) {
                                                    eqiVar3 = new eqi(new xci[16]);
                                                }
                                                xqnVar.a = eqiVar3;
                                                xci xciVar12 = (xci) xqnVar2.a;
                                                if (xciVar12 != null) {
                                                    eqiVar3.d(xciVar12);
                                                    xqnVar2.a = null;
                                                }
                                                eqi eqiVar4 = (eqi) xqnVar.a;
                                                if (eqiVar4 != null) {
                                                    eqiVar4.d(xciVar11);
                                                }
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                xqnVar2.a = bcx.p((eqi) xqnVar.a);
                            } else {
                                if (((Boolean) function0.invoke()).booleanValue()) {
                                    return true;
                                }
                                xci xciVar13 = xciVar.a;
                                xqn xqnVar3 = new xqn();
                                xqn xqnVar4 = new xqn();
                                xqnVar4.a = xciVar13;
                                while (true) {
                                    Object obj2 = xqnVar4.a;
                                    if (obj2 != null) {
                                        if (obj2 instanceof waf) {
                                            if (((waf) obj2).Y(keyEvent)) {
                                                return true;
                                            }
                                        } else if ((((xci) obj2).c & RemoteCameraConfig.Notification.ID) != 0 && (obj2 instanceof cw7)) {
                                            int i6 = 0;
                                            for (xci xciVar14 = ((cw7) obj2).p; xciVar14 != null; xciVar14 = xciVar14.f) {
                                                if ((xciVar14.c & RemoteCameraConfig.Notification.ID) != 0) {
                                                    i6++;
                                                    if (i6 == 1) {
                                                        xqnVar4.a = xciVar14;
                                                    } else {
                                                        eqi eqiVar5 = (eqi) xqnVar3.a;
                                                        if (eqiVar5 == null) {
                                                            eqiVar5 = new eqi(new xci[16]);
                                                        }
                                                        xqnVar3.a = eqiVar5;
                                                        xci xciVar15 = (xci) xqnVar4.a;
                                                        if (xciVar15 != null) {
                                                            eqiVar5.d(xciVar15);
                                                            xqnVar4.a = null;
                                                        }
                                                        eqi eqiVar6 = (eqi) xqnVar3.a;
                                                        if (eqiVar6 != null) {
                                                            eqiVar6.d(xciVar14);
                                                        }
                                                    }
                                                }
                                            }
                                            if (i6 == 1) {
                                            }
                                        }
                                        xqnVar4.a = bcx.p((eqi) xqnVar3.a);
                                    } else if (arrayList != null) {
                                        int size2 = arrayList.size();
                                        for (int i7 = 0; i7 < size2; i7++) {
                                            if (((waf) arrayList.get(i7)).Y(keyEvent)) {
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            if (!dpcVar.a.n) {
                sme.b("visitAncestors called on an unattached node");
            }
            xci xciVar16 = dpcVar.a.e;
            mpf F3 = bcx.F(dpcVar);
            loop15: while (true) {
                if (F3 == null) {
                    sv7Var = null;
                    break;
                }
                if ((((xci) F3.F.f).d & RemoteCameraConfig.Notification.ID) != 0) {
                    while (xciVar16 != null) {
                        if ((xciVar16.c & RemoteCameraConfig.Notification.ID) != 0) {
                            xci xciVar17 = xciVar16;
                            eqi eqiVar7 = null;
                            while (xciVar17 != null) {
                                if (xciVar17 instanceof waf) {
                                    sv7Var = xciVar17;
                                    break loop15;
                                }
                                if ((xciVar17.c & RemoteCameraConfig.Notification.ID) != 0 && (xciVar17 instanceof cw7)) {
                                    xci xciVar18 = ((cw7) xciVar17).p;
                                    int i8 = 0;
                                    xciVar17 = xciVar17;
                                    eqiVar7 = eqiVar7;
                                    while (xciVar18 != null) {
                                        if ((xciVar18.c & RemoteCameraConfig.Notification.ID) != 0) {
                                            i8++;
                                            eqiVar7 = eqiVar7;
                                            if (i8 == 1) {
                                                xciVar17 = xciVar18;
                                            } else {
                                                if (eqiVar7 == null) {
                                                    eqiVar7 = new eqi(new xci[16]);
                                                }
                                                if (xciVar17 != null) {
                                                    eqiVar7.d(xciVar17);
                                                    xciVar17 = null;
                                                }
                                                eqiVar7.d(xciVar18);
                                            }
                                        }
                                        xciVar18 = xciVar18.f;
                                        xciVar17 = xciVar17;
                                        eqiVar7 = eqiVar7;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                xciVar17 = bcx.p(eqiVar7);
                            }
                        }
                        xciVar16 = xciVar16.e;
                    }
                }
                F3 = F3.u();
                xciVar16 = (F3 == null || (crVar = F3.F) == null) ? null : (i4s) crVar.e;
            }
            sv7 sv7Var4 = (waf) sv7Var;
            xciVar = sv7Var4 != null ? ((xci) sv7Var4).a : null;
            if (xciVar != null) {
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13, types: [i4s] */
    /* JADX WARN: Type inference failed for: r3v7, types: [xci] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [xci] */
    /* JADX WARN: Type inference failed for: r5v12, types: [dpc] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [xci] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r6v12, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r6v18, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [eqi] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [eqi] */
    public final Boolean d(int i, ynn ynnVar, Function1 function1) {
        Boolean bool;
        boolean x;
        Boolean bool2;
        cr crVar;
        dpc dpcVar = this.f;
        dpc x2 = ff7.x(dpcVar);
        int i2 = 4;
        me0 me0Var = this.e;
        if (x2 != null) {
            xof xofVar = (xof) me0Var.get();
            bool = null;
            woc T0 = x2.T0();
            yoc yocVar = T0.h;
            yoc yocVar2 = T0.i;
            if (i == 1) {
                yocVar = T0.b;
            } else if (i == 2) {
                yocVar = T0.c;
            } else if (i == 5) {
                yocVar = T0.d;
            } else if (i == 6) {
                yocVar = T0.e;
            } else if (i == 3) {
                int ordinal = xofVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    yocVar = yocVar2;
                }
                if (yocVar == yoc.b) {
                    yocVar = null;
                }
                if (yocVar == null) {
                    yocVar = T0.f;
                }
            } else if (i == 4) {
                int ordinal2 = xofVar.ordinal();
                if (ordinal2 == 0) {
                    yocVar = yocVar2;
                } else if (ordinal2 != 1) {
                    b6e.s();
                    return null;
                }
                if (yocVar == yoc.b) {
                    yocVar = null;
                }
                if (yocVar == null) {
                    yocVar = T0.g;
                }
            } else {
                if (i != 7 && i != 8) {
                    xq0.q("invalid FocusDirection");
                    return null;
                }
                qt3 qt3Var = new qt3(i);
                up6.x(x2);
                uoc uocVar = (uoc) bcx.G(x2).getFocusOwner();
                dpc dpcVar2 = uocVar.l;
                if (i == 7) {
                    T0.j.invoke(qt3Var);
                } else {
                    T0.k.invoke(qt3Var);
                }
                yocVar = qt3Var.b ? yoc.c : dpcVar2 != uocVar.l ? yoc.d : yoc.b;
            }
            if (!Intrinsics.d(yocVar, yoc.c)) {
                if (Intrinsics.d(yocVar, yoc.d)) {
                    dpc x3 = ff7.x(dpcVar);
                    if (x3 != null) {
                        return (Boolean) function1.invoke(x3);
                    }
                } else if (!Intrinsics.d(yocVar, yoc.b)) {
                    return Boolean.valueOf(yocVar.a(function1));
                }
            }
            return bool;
        }
        bool = null;
        x2 = null;
        xof xofVar2 = (xof) me0Var.get();
        lma lmaVar = new lma(x2, this, function1);
        if (i == 1 || i == 2) {
            if (i == 1) {
                x = u1g.G(dpcVar, lmaVar);
            } else {
                if (i != 2) {
                    xq0.q("This function should only be used for 1-D focus search");
                    return null;
                }
                x = u1g.x(dpcVar, lmaVar);
            }
            return Boolean.valueOf(x);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return c9g.Z(i, lmaVar, dpcVar, ynnVar);
        }
        if (i == 7) {
            int ordinal3 = xofVar2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 != 1) {
                    b6e.s();
                    return null;
                }
                i2 = 3;
            }
            dpc x4 = ff7.x(dpcVar);
            if (x4 != null) {
                return c9g.Z(i2, lmaVar, x4, ynnVar);
            }
            return bool;
        }
        if (i != 8) {
            e7o.i(loc.a(i), "Focus search invoked with invalid FocusDirection ");
            return null;
        }
        dpc x5 = ff7.x(dpcVar);
        boolean z = false;
        if (x5 != null) {
            if (!x5.a.n) {
                sme.b("visitAncestors called on an unattached node");
            }
            ?? r3 = x5.a.e;
            mpf F = bcx.F(x5);
            loop0: while (F != null) {
                if ((((xci) F.F.f).d & 1024) != 0) {
                    for (xci xciVar = r3; xciVar != null; xciVar = xciVar.e) {
                        if ((xciVar.c & 1024) != 0) {
                            cw7 cw7Var = xciVar;
                            ?? r6 = bool;
                            while (cw7Var != 0) {
                                if (cw7Var instanceof dpc) {
                                    ?? r5 = (dpc) cw7Var;
                                    if (r5.T0().a) {
                                        bool2 = r5;
                                        break loop0;
                                    }
                                } else if ((cw7Var.c & 1024) != 0 && (cw7Var instanceof cw7)) {
                                    xci xciVar2 = cw7Var.p;
                                    int i3 = 0;
                                    cw7Var = cw7Var;
                                    r6 = r6;
                                    while (xciVar2 != null) {
                                        if ((xciVar2.c & 1024) != 0) {
                                            i3++;
                                            r6 = r6;
                                            if (i3 == 1) {
                                                cw7Var = xciVar2;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new eqi(new xci[16]);
                                                }
                                                if (cw7Var != 0) {
                                                    r6.d(cw7Var);
                                                    cw7Var = bool;
                                                }
                                                r6.d(xciVar2);
                                            }
                                        }
                                        xciVar2 = xciVar2.f;
                                        cw7Var = cw7Var;
                                        r6 = r6;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                cw7Var = bcx.p(r6);
                            }
                        }
                    }
                }
                F = F.u();
                r3 = (F == null || (crVar = F.F) == null) ? bool : (i4s) crVar.e;
            }
        }
        bool2 = bool;
        if (bool2 != null && !bool2.equals(dpcVar)) {
            z = ((Boolean) lmaVar.invoke(bool2)).booleanValue();
        }
        return Boolean.valueOf(z);
    }

    public final boolean e(int i) {
        xqn xqnVar = new xqn();
        xqnVar.a = Boolean.FALSE;
        this.h.getClass();
        dpc dpcVar = this.l;
        Boolean d = d(i, (ynn) this.d.invoke(), new wk8(xqnVar, i, 2));
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.d(d, bool) || dpcVar == this.l) {
            if (d != null && xqnVar.a != null) {
                if (!d.equals(bool) || !Intrinsics.d(xqnVar.a, bool)) {
                    if (i != 1 && i != 2) {
                        if (((Boolean) this.b.invoke(new loc(i))).booleanValue()) {
                        }
                    } else if (b(i, false, false)) {
                        Boolean d2 = d(i, null, new re0(i, 3));
                        if (d2 != null ? d2.booleanValue() : false) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void f(dpc dpcVar) {
        mpf F;
        jfp w;
        mpf F2;
        jfp w2;
        dpc dpcVar2 = this.l;
        this.l = dpcVar;
        gpi gpiVar = this.k;
        Object[] objArr = gpiVar.a;
        int i = gpiVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            sd0 sd0Var = (sd0) ((soc) objArr[i2]);
            sd0Var.getClass();
            if (dpcVar2 != null && (F2 = bcx.F(dpcVar2)) != null && (w2 = F2.w()) != null && w2.a.b(hfp.g)) {
                sd0Var.a.i(sd0Var.c, F2.b);
            }
            if (dpcVar != null && (F = bcx.F(dpcVar)) != null && (w = F.w()) != null && w.a.b(hfp.g)) {
                int i3 = F.b;
                sd0Var.d.a.f0(i3, new rd0(sd0Var, i3));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x034b, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x034d, code lost:
    
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009b, code lost:
    
        r36 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
    
        if (((r9 & ((~r9) << 6)) & (-9187201950435737472L)) == r36) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
    
        r3 = r4.b(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        if (r4.e != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
    
        if (((r4.a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        r3 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c8, code lost:
    
        if (r3 <= r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ca, code lost:
    
        r13 = r4.d;
        r8 = defpackage.net.b;
        r15 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e3, code lost:
    
        if (java.lang.Long.compare((r13 * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e5, code lost:
    
        r3 = r4.a;
        r8 = r4.c;
        r9 = r4.b;
        r10 = (r8 + 7) >> 3;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f1, code lost:
    
        if (r13 >= r10) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f3, code lost:
    
        r14 = r5;
        r5 = r3[r13] & (-9187201950435737472L);
        r3[r13] = (-72340172838076674L) & ((~r5) + (r5 >>> 7));
        r13 = r13 + 1;
        r5 = r14;
        r15 = r15;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0113, code lost:
    
        r32 = r6;
        r22 = r15;
        r5 = defpackage.xz0.C(r3);
        r6 = r5 - 1;
        r3[r6] = (r3[r6] & 72057594037927935L) | (-72057594037927936L);
        r3[r5] = r3[0];
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0134, code lost:
    
        if (r5 == r8) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0136, code lost:
    
        r6 = r5 >> 3;
        r10 = (r5 & 7) << 3;
        r13 = (r3[r6] >> r10) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0143, code lost:
    
        if (r13 != r22) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014a, code lost:
    
        if (r13 == 254) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x014d, code lost:
    
        r13 = java.lang.Long.hashCode(r9[r5]) * r31;
        r14 = (r13 ^ (r13 << 16)) >>> 7;
        r15 = r4.b(r14);
        r14 = r14 & r8;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016c, code lost:
    
        if ((((r15 - r14) & r8) / 8) != (((r5 - r14) & r8) / 8)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x016e, code lost:
    
        r3[r6] = (r3[r6] & (~(255 << r10))) | ((r13 & 127) << r10);
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018c, code lost:
    
        r7 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x018f, code lost:
    
        r7 = r5;
        r5 = r15 >> 3;
        r34 = r3[r5];
        r6 = (r15 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01a0, code lost:
    
        if (((r34 >> r6) & 255) != r22) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01a2, code lost:
    
        r3[r5] = (r34 & (~(255 << r6))) | ((r13 & 127) << r6);
        r3[r6] = (r3[r6] & (~(255 << r10))) | (r22 << r10);
        r9[r15] = r9[r7];
        r9[r7] = r36;
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01e1, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01c6, code lost:
    
        r3[r5] = ((r13 & 127) << r6) | (r34 & (~(255 << r6)));
        r5 = r9[r15];
        r9[r15] = r9[r7];
        r9[r7] = r5;
        r5 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0145, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01ef, code lost:
    
        r33 = r7;
        r4.e = defpackage.vso.a(r4.c) - r4.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x027f, code lost:
    
        r3 = r4.b(r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0283, code lost:
    
        r32 = r3;
        r4.d++;
        r3 = r4.e;
        r5 = r4.a;
        r6 = r32 >> 3;
        r7 = r5[r6];
        r9 = (r32 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x029d, code lost:
    
        if (((r7 >> r9) & 255) != r22) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x029f, code lost:
    
        r21 = r33 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02a1, code lost:
    
        r4.e = r3 - r21;
        r3 = r4.c;
        r7 = (r7 & (~(255 << r9))) | (r11 << r9);
        r5[r6] = r7;
        r5[(((r32 - 7) & r3) + (r3 & 7)) >> 3] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0200, code lost:
    
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0202, code lost:
    
        r32 = r6;
        r33 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x020a, code lost:
    
        r3 = defpackage.vso.c(r4.c);
        r5 = r4.a;
        r6 = r4.b;
        r7 = r4.c;
        r4.c(r3);
        r3 = r4.a;
        r8 = r4.b;
        r9 = r4.c;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0221, code lost:
    
        if (r10 >= r7) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0230, code lost:
    
        if (((r5[r10 >> 3] >> ((r10 & 7) << 3)) & 255) >= r22) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0232, code lost:
    
        r13 = r6[r10];
        r15 = java.lang.Long.hashCode(r13) * r31;
        r15 = r15 ^ (r15 << 16);
        r16 = r3;
        r3 = r4.b(r15 >>> 7);
        r17 = r5;
        r18 = r6;
        r5 = r15 & 127;
        r15 = r3 >> 3;
        r19 = (r3 & 7) << 3;
        r5 = (r16[r15] & (~(255 << r19))) | (r5 << r19);
        r16[r15] = r5;
        r16[(((r3 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r3] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0276, code lost:
    
        r10 = r10 + 1;
        r3 = r16;
        r5 = r17;
        r6 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0270, code lost:
    
        r16 = r3;
        r17 = r5;
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0207, code lost:
    
        r22 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c0, code lost:
    
        r33 = true;
        r22 = 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(KeyEvent keyEvent) {
        int i;
        long j;
        boolean z;
        int i2;
        long R = saf.R(keyEvent);
        int U = saf.U(keyEvent);
        int i3 = -862048943;
        long j2 = 0;
        int i4 = 8;
        int i5 = 0;
        boolean z2 = true;
        if (U == 2) {
            zoi zoiVar = this.j;
            if (zoiVar == null) {
                zoiVar = new zoi(3);
                this.j = zoiVar;
            }
            zoi zoiVar2 = zoiVar;
            int hashCode = Long.hashCode(R) * (-862048943);
            int i6 = hashCode ^ (hashCode << 16);
            int i7 = i6 >>> 7;
            int i8 = i6 & 127;
            int i9 = zoiVar2.c;
            int i10 = i7 & i9;
            int i11 = 0;
            loop0: while (true) {
                long[] jArr = zoiVar2.a;
                int i12 = i10 >> 3;
                int i13 = i3;
                int i14 = (i10 & 7) << 3;
                long j3 = (jArr[i12] >>> i14) | ((jArr[i12 + 1] << (64 - i14)) & ((-i14) >> 63));
                long j4 = i8;
                long j5 = j3 ^ (j4 * 72340172838076673L);
                long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
                while (true) {
                    if (j6 == j2) {
                        break;
                    }
                    i2 = (i10 + (Long.numberOfTrailingZeros(j6) >> 3)) & i9;
                    long j7 = j2;
                    if (zoiVar2.b[i2] == R) {
                        z = true;
                        break loop0;
                    }
                    j6 &= j6 - 1;
                    j2 = j7;
                }
                i11 += 8;
                i10 = (i10 + i11) & i9;
                i4 = i4;
                i3 = i13;
                j2 = j;
            }
            zoiVar2.b[i2] = R;
            return z;
        }
        if (U != 1) {
            return true;
        }
        zoi zoiVar3 = this.j;
        if (zoiVar3 == null || !zoiVar3.a(R)) {
            return false;
        }
        zoi zoiVar4 = this.j;
        if (zoiVar4 != null) {
            int hashCode2 = Long.hashCode(R) * (-862048943);
            int i15 = hashCode2 ^ (hashCode2 << 16);
            int i16 = i15 & 127;
            int i17 = zoiVar4.c;
            int i18 = i15 >>> 7;
            loop5: while (true) {
                int i19 = i18 & i17;
                long[] jArr2 = zoiVar4.a;
                int i20 = i19 >> 3;
                int i21 = (i19 & 7) << 3;
                long j8 = ((jArr2[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr2[i20] >>> i21);
                long j9 = (i16 * 72340172838076673L) ^ j8;
                long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j10 == 0) {
                        break;
                    }
                    i = ((Long.numberOfTrailingZeros(j10) >> 3) + i19) & i17;
                    if (zoiVar4.b[i] == R) {
                        break loop5;
                    }
                    j10 &= j10 - 1;
                }
                i5 += 8;
                i18 = i19 + i5;
            }
            if (i >= 0) {
                zoiVar4.d--;
                long[] jArr3 = zoiVar4.a;
                int i22 = zoiVar4.c;
                int i23 = i >> 3;
                int i24 = (i & 7) << 3;
                long j11 = (jArr3[i23] & (~(255 << i24))) | (254 << i24);
                jArr3[i23] = j11;
                jArr3[(((i - 7) & i22) + (i22 & 7)) >> 3] = j11;
                return true;
            }
        }
        return true;
    }
}
