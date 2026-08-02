package ru.yandex.taxi.personalstate.domain;

import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.zone.model.Zone;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.amc;
import defpackage.bvf0;
import defpackage.c4r0;
import defpackage.c8r;
import defpackage.dqe0;
import defpackage.e6b0;
import defpackage.f6b0;
import defpackage.ffx;
import defpackage.fnx0;
import defpackage.gnx0;
import defpackage.h3y;
import defpackage.j6b0;
import defpackage.j73;
import defpackage.jst;
import defpackage.mi31;
import defpackage.mo40;
import defpackage.n6b0;
import defpackage.ni31;
import defpackage.np40;
import defpackage.ny61;
import defpackage.o0m0;
import defpackage.pex0;
import defpackage.pzt0;
import defpackage.q7b0;
import defpackage.qoh;
import defpackage.r7b0;
import defpackage.s7b0;
import defpackage.s8o;
import defpackage.tpr;
import defpackage.urw;
import defpackage.w3j0;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.personalstate.api.interactor.SavePersonalStateNotifier$SavePersonalStateReason;
import ru.yandex.taxi.requirements.repository.RequirementsChangedNotifier;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes9.dex */
public final class o {
    public static final Set y = j73.f0(new SelectionOrigin[]{SelectionOrigin.TRAP_ONLY_FALLBACK, SelectionOrigin.PREORDER_CONTROLLER, SelectionOrigin.ACTION, SelectionOrigin.DEEPLINK, SelectionOrigin.REDIRECT, SelectionOrigin.DELIVERY_CANCEL, SelectionOrigin.UNSUPPORTED_REQUIREMENTS, SelectionOrigin.FORCE_TARIFF_SWITCH_INTERCITY_DASHBOARD, SelectionOrigin.USER, SelectionOrigin.DUE_TIMETABLE, SelectionOrigin.MAIN, SelectionOrigin.PROMOTION});
    public final ru.yandex.taxi.personalstate.domain.interactor.i a;
    public final dqe0 b;
    public final ru.yandex.taxi.personalstate.data.remote.a c;
    public final com.yandex.go.zone.repository.o d;
    public final com.yandex.go.taxi.tariffs.repository.g e;
    public final mo40 f;
    public final s7b0 g;
    public final h3y h;
    public final wiq0 i;
    public final q7b0 j;
    public final o0m0 k;
    public final RequirementsChangedNotifier l;
    public final ru.yandex.taxi.launch.c m;
    public final amc n;
    public final c8r o;
    public final com.yandex.go.taxi.tariffs.interactor.b p;
    public final ru.yandex.taxi.am.m q;
    public final f6b0 r;
    public final r0 s;
    public final r0 t;
    public final n0 u;
    public final n0 v;
    public final r0 w;
    public final r0 x;

    public o(ru.yandex.taxi.personalstate.domain.interactor.i iVar, dqe0 dqe0Var, ru.yandex.taxi.personalstate.data.remote.a aVar, com.yandex.go.zone.repository.o oVar, com.yandex.go.taxi.tariffs.repository.g gVar, mo40 mo40Var, s7b0 s7b0Var, h3y h3yVar, wiq0 wiq0Var, q7b0 q7b0Var, o0m0 o0m0Var, RequirementsChangedNotifier requirementsChangedNotifier, ru.yandex.taxi.launch.c cVar, amc amcVar, c8r c8rVar, com.yandex.go.taxi.tariffs.interactor.b bVar, ru.yandex.taxi.am.m mVar, f6b0 f6b0Var) {
        this.a = iVar;
        this.b = dqe0Var;
        this.c = aVar;
        this.d = oVar;
        this.e = gVar;
        this.f = mo40Var;
        this.g = s7b0Var;
        this.h = h3yVar;
        this.i = wiq0Var;
        this.j = q7b0Var;
        this.k = o0m0Var;
        this.l = requirementsChangedNotifier;
        this.m = cVar;
        this.n = amcVar;
        this.o = c8rVar;
        this.p = bVar;
        this.q = mVar;
        this.r = f6b0Var;
        r0 c = bvf0.c(n6b0.a);
        this.s = c;
        r0 c2 = bvf0.c(Boolean.FALSE);
        this.t = c2;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.u = ffx.b(0, 1, bufferOverflow);
        this.v = ffx.b(0, 1, bufferOverflow);
        this.w = c2;
        this.x = c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (r8.d.a(r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r6 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        if (r6 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(o oVar, ContinuationImpl continuationImpl) {
        PersonalStateProvider$dropPersonalStateLastRequestInfo$1 personalStateProvider$dropPersonalStateLastRequestInfo$1;
        int i;
        oVar.getClass();
        if (continuationImpl instanceof PersonalStateProvider$dropPersonalStateLastRequestInfo$1) {
            personalStateProvider$dropPersonalStateLastRequestInfo$1 = (PersonalStateProvider$dropPersonalStateLastRequestInfo$1) continuationImpl;
            int i2 = personalStateProvider$dropPersonalStateLastRequestInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                personalStateProvider$dropPersonalStateLastRequestInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = personalStateProvider$dropPersonalStateLastRequestInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = personalStateProvider$dropPersonalStateLastRequestInfo$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0 r0Var = oVar.s;
                    personalStateProvider$dropPersonalStateLastRequestInfo$1.label = 1;
                    r0Var.emit(n6b0.a, personalStateProvider$dropPersonalStateLastRequestInfo$1);
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        jst.e.getClass();
                        return zy11Var;
                    }
                    kotlin.b.b(obj);
                    ru.yandex.taxi.personalstate.domain.interactor.i iVar = oVar.a;
                    personalStateProvider$dropPersonalStateLastRequestInfo$1.label = 3;
                    qoh qohVar = iVar.j;
                    if (qohVar != null) {
                        qohVar.a(null);
                    }
                }
                r0 r0Var2 = oVar.t;
                Boolean bool = Boolean.FALSE;
                personalStateProvider$dropPersonalStateLastRequestInfo$1.label = 2;
                r0Var2.emit(bool, personalStateProvider$dropPersonalStateLastRequestInfo$1);
            }
        }
        personalStateProvider$dropPersonalStateLastRequestInfo$1 = new PersonalStateProvider$dropPersonalStateLastRequestInfo$1(oVar, continuationImpl);
        Object obj2 = personalStateProvider$dropPersonalStateLastRequestInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalStateProvider$dropPersonalStateLastRequestInfo$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        r0 r0Var22 = oVar.t;
        Boolean bool2 = Boolean.FALSE;
        personalStateProvider$dropPersonalStateLastRequestInfo$1.label = 2;
        r0Var22.emit(bool2, personalStateProvider$dropPersonalStateLastRequestInfo$1);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(13:19|20|21|(1:23)(1:48)|24|(1:47)(1:28)|(1:30)(1:46)|(1:45)(1:34)|(1:36)(1:44)|37|(2:41|(1:43))|13|14)|12|13|14))|53|6|7|(0)(0)|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c4, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c5, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b9, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ba, code lost:
    
        defpackage.jst.e.k(r9, "Error setting fallback tariff personal state");
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(o oVar, ContinuationImpl continuationImpl) {
        PersonalStateProvider$handleErrorPersonalState$1 personalStateProvider$handleErrorPersonalState$1;
        int i;
        mi31 b;
        pzt0 a;
        pex0 pex0Var;
        pex0 pex0Var2;
        oVar.getClass();
        if (continuationImpl instanceof PersonalStateProvider$handleErrorPersonalState$1) {
            personalStateProvider$handleErrorPersonalState$1 = (PersonalStateProvider$handleErrorPersonalState$1) continuationImpl;
            int i2 = personalStateProvider$handleErrorPersonalState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                personalStateProvider$handleErrorPersonalState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = personalStateProvider$handleErrorPersonalState$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = personalStateProvider$handleErrorPersonalState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fnx0 n = ((com.yandex.go.taxi.tariffs.internal.repository.k) oVar.i).n();
                    c8r c8rVar = oVar.o;
                    if (n != null) {
                        b = c8r.b(c8rVar, n.c.b, n.d, null, 4);
                    } else {
                        urw urwVar = c8rVar.b;
                        List list = ((com.yandex.go.taxi.tariffs.internal.repository.k) c8rVar.a).j().a;
                        urwVar.getClass();
                        b = urw.b(list);
                    }
                    oVar.c.b((n == null || (pex0Var2 = n.c) == null) ? null : pex0Var2.b, n != null ? n.d : null, (b == null || (pex0Var = b.a) == null) ? null : pex0Var.b, b != null ? b.b : null);
                    if (b != null && (a = ((c4r0) oVar.h.get()).a(new gnx0(new fnx0(b, SelectionOrigin.PERSONALSTATE), true))) != null) {
                        personalStateProvider$handleErrorPersonalState$1.L$0 = null;
                        personalStateProvider$handleErrorPersonalState$1.L$1 = null;
                        personalStateProvider$handleErrorPersonalState$1.label = 1;
                        obj = a.u0(personalStateProvider$handleErrorPersonalState$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
        }
        personalStateProvider$handleErrorPersonalState$1 = new PersonalStateProvider$handleErrorPersonalState$1(oVar, continuationImpl);
        Object obj2 = personalStateProvider$handleErrorPersonalState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalStateProvider$handleErrorPersonalState$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(o oVar, j6b0 j6b0Var, ContinuationImpl continuationImpl) {
        PersonalStateProvider$handleLoadedPersonalState$1 personalStateProvider$handleLoadedPersonalState$1;
        int i;
        zy11 zy11Var;
        pex0 pex0Var;
        h3y h3yVar = oVar.h;
        wiq0 wiq0Var = oVar.i;
        try {
            if (continuationImpl instanceof PersonalStateProvider$handleLoadedPersonalState$1) {
                personalStateProvider$handleLoadedPersonalState$1 = (PersonalStateProvider$handleLoadedPersonalState$1) continuationImpl;
                int i2 = personalStateProvider$handleLoadedPersonalState$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    personalStateProvider$handleLoadedPersonalState$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = personalStateProvider$handleLoadedPersonalState$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = personalStateProvider$handleLoadedPersonalState$1.label;
                    zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        r7b0 a = oVar.g.a(j6b0Var);
                        gnx0 gnx0Var = a.a;
                        if (gnx0Var != null) {
                            ru.yandex.taxi.personalstate.data.remote.a aVar = oVar.c;
                            fnx0 n = ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).n();
                            String str = (n == null || (pex0Var = n.c) == null) ? null : pex0Var.b;
                            fnx0 n2 = ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).n();
                            String str2 = n2 != null ? n2.d : null;
                            fnx0 fnx0Var = gnx0Var.a;
                            aVar.b(str, str2, fnx0Var.c.b, fnx0Var.d);
                            oVar.e.e(a.b);
                            oVar.f.a(a.e);
                            Iterator it = a.c.iterator();
                            while (it.hasNext()) {
                                ni31 ni31Var = (ni31) it.next();
                                ((c4r0) h3yVar.get()).a.j.e.put(ni31Var.b, ni31Var.a);
                            }
                            pzt0 a2 = ((c4r0) h3yVar.get()).a(gnx0Var);
                            if (a2 != null) {
                                personalStateProvider$handleLoadedPersonalState$1.L$0 = null;
                                personalStateProvider$handleLoadedPersonalState$1.L$1 = null;
                                personalStateProvider$handleLoadedPersonalState$1.L$2 = null;
                                personalStateProvider$handleLoadedPersonalState$1.L$3 = null;
                                personalStateProvider$handleLoadedPersonalState$1.label = 1;
                                obj = a2.u0(personalStateProvider$handleLoadedPersonalState$1);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                        return zy11Var;
                    }
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
            }
            if (i != 0) {
            }
            return zy11Var;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Error setting tariff personal state");
            return zy11Var;
        }
        personalStateProvider$handleLoadedPersonalState$1 = new PersonalStateProvider$handleLoadedPersonalState$1(oVar, continuationImpl);
        Object obj2 = personalStateProvider$handleLoadedPersonalState$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalStateProvider$handleLoadedPersonalState$1.label;
        zy11Var = zy11.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|(1:(1:(1:(1:(5:13|14|15|16|(3:18|(2:22|23)|20)(5:24|25|26|(8:28|29|30|31|32|33|34|(5:36|37|38|16|(0)(0)))|20))(2:60|61))(2:62|52))(6:63|64|37|38|16|(0)(0)))(10:65|66|29|30|31|32|33|34|(0)|20))(2:67|68)))|83|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:28|29|30|31|32|33|34|(5:36|37|38|16|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a6, code lost:
    
        r12 = r11;
        r5 = r18;
        r15 = r19;
        r8 = r21;
        r14 = r22;
        r13 = r23;
        r2 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0225, code lost:
    
        if (kotlinx.coroutines.flow.e.x(r5, r8, r2) != r3) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01b4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01b5, code lost:
    
        r12 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00bb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r0v13, types: [T] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x019c -> B:16:0x01a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0230 -> B:15:0x0231). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0225 -> B:14:0x0228). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(o oVar, Zone zone, pex0 pex0Var, boolean z, SavePersonalStateNotifier$SavePersonalStateReason savePersonalStateNotifier$SavePersonalStateReason, SelectionOrigin selectionOrigin, ContinuationImpl continuationImpl) {
        PersonalStateProvider$patchPersonalState$1 personalStateProvider$patchPersonalState$1;
        int i;
        Zone zone2;
        pex0 pex0Var2;
        SavePersonalStateNotifier$SavePersonalStateReason savePersonalStateNotifier$SavePersonalStateReason2;
        String str;
        Ref$ObjectRef ref$ObjectRef;
        boolean z2;
        int i2;
        pex0 pex0Var3;
        SavePersonalStateNotifier$SavePersonalStateReason savePersonalStateNotifier$SavePersonalStateReason3;
        String str2;
        Ref$ObjectRef ref$ObjectRef2;
        boolean z3;
        Ref$ObjectRef ref$ObjectRef3;
        ?? r0;
        PersonalStateProvider$patchPersonalState$1 personalStateProvider$patchPersonalState$12;
        Zone zone3;
        boolean z4;
        SavePersonalStateNotifier$SavePersonalStateReason savePersonalStateNotifier$SavePersonalStateReason4;
        int i3;
        Object b;
        pex0 pex0Var4;
        r0 r0Var;
        PersonalStateProvider$patchPersonalState$2$1 personalStateProvider$patchPersonalState$2$1;
        String str3;
        oVar.getClass();
        try {
            if (continuationImpl instanceof PersonalStateProvider$patchPersonalState$1) {
                personalStateProvider$patchPersonalState$1 = (PersonalStateProvider$patchPersonalState$1) continuationImpl;
                int i4 = personalStateProvider$patchPersonalState$1.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    personalStateProvider$patchPersonalState$1.label = i4 - Integer.MIN_VALUE;
                    Object obj = personalStateProvider$patchPersonalState$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = personalStateProvider$patchPersonalState$1.label;
                    ?? r5 = 4;
                    int i5 = 3;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        oVar.r.getClass();
                        switch (e6b0.a[savePersonalStateNotifier$SavePersonalStateReason.ordinal()]) {
                            case 1:
                                str3 = "multiclass_selection";
                                z4 = z;
                                savePersonalStateNotifier$SavePersonalStateReason4 = savePersonalStateNotifier$SavePersonalStateReason;
                                str2 = str3;
                                personalStateProvider$patchPersonalState$12 = personalStateProvider$patchPersonalState$1;
                                ref$ObjectRef2 = new Ref$ObjectRef();
                                i3 = 0;
                                zone3 = zone;
                                pex0Var4 = pex0Var;
                                r0Var = oVar.s;
                                personalStateProvider$patchPersonalState$2$1 = new PersonalStateProvider$patchPersonalState$2$1();
                                personalStateProvider$patchPersonalState$12.L$0 = zone3;
                                personalStateProvider$patchPersonalState$12.L$1 = pex0Var4;
                                personalStateProvider$patchPersonalState$12.L$2 = savePersonalStateNotifier$SavePersonalStateReason4;
                                personalStateProvider$patchPersonalState$12.L$3 = null;
                                personalStateProvider$patchPersonalState$12.L$4 = str2;
                                personalStateProvider$patchPersonalState$12.L$5 = ref$ObjectRef2;
                                personalStateProvider$patchPersonalState$12.L$6 = null;
                                personalStateProvider$patchPersonalState$12.L$7 = null;
                                personalStateProvider$patchPersonalState$12.Z$0 = z4;
                                personalStateProvider$patchPersonalState$12.I$0 = i3;
                                personalStateProvider$patchPersonalState$12.label = 1;
                                if (kotlinx.coroutines.flow.e.x(r0Var, personalStateProvider$patchPersonalState$2$1, personalStateProvider$patchPersonalState$12) != obj2) {
                                }
                                return obj2;
                            case 2:
                                if (selectionOrigin != null) {
                                    switch (e6b0.b[selectionOrigin.ordinal()]) {
                                        case 1:
                                        case 2:
                                        case 3:
                                            str3 = "selector_tap";
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                            str3 = "redirect";
                                            break;
                                        case 8:
                                            str3 = "promotion_redirect";
                                            break;
                                    }
                                    z4 = z;
                                    savePersonalStateNotifier$SavePersonalStateReason4 = savePersonalStateNotifier$SavePersonalStateReason;
                                    str2 = str3;
                                    personalStateProvider$patchPersonalState$12 = personalStateProvider$patchPersonalState$1;
                                    ref$ObjectRef2 = new Ref$ObjectRef();
                                    i3 = 0;
                                    zone3 = zone;
                                    pex0Var4 = pex0Var;
                                    r0Var = oVar.s;
                                    personalStateProvider$patchPersonalState$2$1 = new PersonalStateProvider$patchPersonalState$2$1();
                                    personalStateProvider$patchPersonalState$12.L$0 = zone3;
                                    personalStateProvider$patchPersonalState$12.L$1 = pex0Var4;
                                    personalStateProvider$patchPersonalState$12.L$2 = savePersonalStateNotifier$SavePersonalStateReason4;
                                    personalStateProvider$patchPersonalState$12.L$3 = null;
                                    personalStateProvider$patchPersonalState$12.L$4 = str2;
                                    personalStateProvider$patchPersonalState$12.L$5 = ref$ObjectRef2;
                                    personalStateProvider$patchPersonalState$12.L$6 = null;
                                    personalStateProvider$patchPersonalState$12.L$7 = null;
                                    personalStateProvider$patchPersonalState$12.Z$0 = z4;
                                    personalStateProvider$patchPersonalState$12.I$0 = i3;
                                    personalStateProvider$patchPersonalState$12.label = 1;
                                    if (kotlinx.coroutines.flow.e.x(r0Var, personalStateProvider$patchPersonalState$2$1, personalStateProvider$patchPersonalState$12) != obj2) {
                                    }
                                    return obj2;
                                }
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                str3 = null;
                                z4 = z;
                                savePersonalStateNotifier$SavePersonalStateReason4 = savePersonalStateNotifier$SavePersonalStateReason;
                                str2 = str3;
                                personalStateProvider$patchPersonalState$12 = personalStateProvider$patchPersonalState$1;
                                ref$ObjectRef2 = new Ref$ObjectRef();
                                i3 = 0;
                                zone3 = zone;
                                pex0Var4 = pex0Var;
                                r0Var = oVar.s;
                                personalStateProvider$patchPersonalState$2$1 = new PersonalStateProvider$patchPersonalState$2$1();
                                personalStateProvider$patchPersonalState$12.L$0 = zone3;
                                personalStateProvider$patchPersonalState$12.L$1 = pex0Var4;
                                personalStateProvider$patchPersonalState$12.L$2 = savePersonalStateNotifier$SavePersonalStateReason4;
                                personalStateProvider$patchPersonalState$12.L$3 = null;
                                personalStateProvider$patchPersonalState$12.L$4 = str2;
                                personalStateProvider$patchPersonalState$12.L$5 = ref$ObjectRef2;
                                personalStateProvider$patchPersonalState$12.L$6 = null;
                                personalStateProvider$patchPersonalState$12.L$7 = null;
                                personalStateProvider$patchPersonalState$12.Z$0 = z4;
                                personalStateProvider$patchPersonalState$12.I$0 = i3;
                                personalStateProvider$patchPersonalState$12.label = 1;
                                if (kotlinx.coroutines.flow.e.x(r0Var, personalStateProvider$patchPersonalState$2$1, personalStateProvider$patchPersonalState$12) != obj2) {
                                }
                                return obj2;
                            default:
                                w511.b();
                                return null;
                        }
                    } else {
                        if (i == 1) {
                            i = personalStateProvider$patchPersonalState$1.I$0;
                            z3 = personalStateProvider$patchPersonalState$1.Z$0;
                            ref$ObjectRef2 = (Ref$ObjectRef) personalStateProvider$patchPersonalState$1.L$5;
                            str2 = (String) personalStateProvider$patchPersonalState$1.L$4;
                            savePersonalStateNotifier$SavePersonalStateReason3 = (SavePersonalStateNotifier$SavePersonalStateReason) personalStateProvider$patchPersonalState$1.L$2;
                            pex0Var3 = (pex0) personalStateProvider$patchPersonalState$1.L$1;
                            Zone zone4 = (Zone) personalStateProvider$patchPersonalState$1.L$0;
                            kotlin.b.b(obj);
                            r5 = zone4;
                            ref$ObjectRef3 = ref$ObjectRef2;
                            Preorder preorder = oVar.b.a;
                            ru.yandex.taxi.personalstate.domain.interactor.i iVar = oVar.a;
                            String d = preorder.d();
                            String str4 = preorder.V;
                            personalStateProvider$patchPersonalState$1.L$0 = r5;
                            personalStateProvider$patchPersonalState$1.L$1 = pex0Var3;
                            personalStateProvider$patchPersonalState$1.L$2 = savePersonalStateNotifier$SavePersonalStateReason3;
                            personalStateProvider$patchPersonalState$1.L$3 = null;
                            personalStateProvider$patchPersonalState$1.L$4 = str2;
                            personalStateProvider$patchPersonalState$1.L$5 = ref$ObjectRef3;
                            personalStateProvider$patchPersonalState$1.L$6 = null;
                            personalStateProvider$patchPersonalState$1.L$7 = ref$ObjectRef3;
                            personalStateProvider$patchPersonalState$1.Z$0 = z3;
                            personalStateProvider$patchPersonalState$1.I$0 = i;
                            personalStateProvider$patchPersonalState$1.label = 2;
                            PersonalStateProvider$patchPersonalState$1 personalStateProvider$patchPersonalState$13 = personalStateProvider$patchPersonalState$1;
                            Zone zone5 = r5;
                            boolean z5 = z3;
                            String str5 = str2;
                            SavePersonalStateNotifier$SavePersonalStateReason savePersonalStateNotifier$SavePersonalStateReason5 = savePersonalStateNotifier$SavePersonalStateReason3;
                            pex0 pex0Var5 = pex0Var3;
                            b = iVar.b(d, zone5, pex0Var5, str4, z5, savePersonalStateNotifier$SavePersonalStateReason5, str5, personalStateProvider$patchPersonalState$13);
                            if (b != obj2) {
                            }
                            return obj2;
                        }
                        if (i == 2) {
                            i = personalStateProvider$patchPersonalState$1.I$0;
                            z3 = personalStateProvider$patchPersonalState$1.Z$0;
                            ref$ObjectRef3 = (Ref$ObjectRef) personalStateProvider$patchPersonalState$1.L$7;
                            ref$ObjectRef2 = (Ref$ObjectRef) personalStateProvider$patchPersonalState$1.L$5;
                            str2 = (String) personalStateProvider$patchPersonalState$1.L$4;
                            savePersonalStateNotifier$SavePersonalStateReason3 = (SavePersonalStateNotifier$SavePersonalStateReason) personalStateProvider$patchPersonalState$1.L$2;
                            pex0Var3 = (pex0) personalStateProvider$patchPersonalState$1.L$1;
                            Zone zone6 = (Zone) personalStateProvider$patchPersonalState$1.L$0;
                            kotlin.b.b(obj);
                            r0 = obj;
                            r5 = zone6;
                            ref$ObjectRef3.element = r0;
                            personalStateProvider$patchPersonalState$12 = personalStateProvider$patchPersonalState$1;
                            zone3 = r5;
                            z4 = z3;
                            savePersonalStateNotifier$SavePersonalStateReason4 = savePersonalStateNotifier$SavePersonalStateReason3;
                            i3 = 0;
                            pex0Var4 = pex0Var3;
                            if (i3 != 0) {
                            }
                        } else {
                            if (i != 3) {
                                if (i != 4) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                z2 = personalStateProvider$patchPersonalState$1.Z$0;
                                ref$ObjectRef = (Ref$ObjectRef) personalStateProvider$patchPersonalState$1.L$5;
                                str = (String) personalStateProvider$patchPersonalState$1.L$4;
                                savePersonalStateNotifier$SavePersonalStateReason2 = (SavePersonalStateNotifier$SavePersonalStateReason) personalStateProvider$patchPersonalState$1.L$2;
                                pex0Var2 = (pex0) personalStateProvider$patchPersonalState$1.L$1;
                                zone2 = (Zone) personalStateProvider$patchPersonalState$1.L$0;
                                kotlin.b.b(obj);
                                z3 = z2;
                                int i6 = 1;
                                Zone zone7 = zone2;
                                pex0Var3 = pex0Var2;
                                savePersonalStateNotifier$SavePersonalStateReason3 = savePersonalStateNotifier$SavePersonalStateReason2;
                                str2 = str;
                                ref$ObjectRef2 = ref$ObjectRef;
                                personalStateProvider$patchPersonalState$12 = personalStateProvider$patchPersonalState$1;
                                zone3 = zone7;
                                z4 = z3;
                                savePersonalStateNotifier$SavePersonalStateReason4 = savePersonalStateNotifier$SavePersonalStateReason3;
                                i3 = i6;
                                pex0Var4 = pex0Var3;
                                if (i3 != 0) {
                                    obj2 = ref$ObjectRef2.element;
                                    if (obj2 == null) {
                                        ny61.g("Required value was null.");
                                        return null;
                                    }
                                    return obj2;
                                }
                                i5 = 3;
                                try {
                                } catch (Throwable th) {
                                    th = th;
                                    pex0Var3 = pex0Var4;
                                    i = i3;
                                    savePersonalStateNotifier$SavePersonalStateReason3 = savePersonalStateNotifier$SavePersonalStateReason4;
                                    z3 = z4;
                                    r5 = zone3;
                                    personalStateProvider$patchPersonalState$1 = personalStateProvider$patchPersonalState$12;
                                    Integer M = s8o.M(th);
                                    if (M != null && M.intValue() == 409) {
                                        n0 n0Var = oVar.v;
                                        zy11 zy11Var = zy11.a;
                                        personalStateProvider$patchPersonalState$1.L$0 = r5;
                                        personalStateProvider$patchPersonalState$1.L$1 = pex0Var3;
                                        personalStateProvider$patchPersonalState$1.L$2 = savePersonalStateNotifier$SavePersonalStateReason3;
                                        personalStateProvider$patchPersonalState$1.L$3 = null;
                                        personalStateProvider$patchPersonalState$1.L$4 = str2;
                                        personalStateProvider$patchPersonalState$1.L$5 = ref$ObjectRef2;
                                        personalStateProvider$patchPersonalState$1.L$6 = null;
                                        personalStateProvider$patchPersonalState$1.L$7 = null;
                                        personalStateProvider$patchPersonalState$1.Z$0 = z3;
                                        personalStateProvider$patchPersonalState$1.I$0 = i;
                                        personalStateProvider$patchPersonalState$1.label = i5;
                                        if (n0Var.emit(zy11Var, personalStateProvider$patchPersonalState$1) != obj2) {
                                            i2 = i;
                                            z2 = z3;
                                            ref$ObjectRef = ref$ObjectRef2;
                                            str = str2;
                                            savePersonalStateNotifier$SavePersonalStateReason2 = savePersonalStateNotifier$SavePersonalStateReason3;
                                            pex0Var2 = pex0Var3;
                                            zone2 = r5;
                                            r0 r0Var2 = oVar.s;
                                            PersonalStateProvider$patchPersonalState$3$1 personalStateProvider$patchPersonalState$3$1 = new PersonalStateProvider$patchPersonalState$3$1();
                                            personalStateProvider$patchPersonalState$1.L$0 = zone2;
                                            personalStateProvider$patchPersonalState$1.L$1 = pex0Var2;
                                            personalStateProvider$patchPersonalState$1.L$2 = savePersonalStateNotifier$SavePersonalStateReason2;
                                            personalStateProvider$patchPersonalState$1.L$3 = null;
                                            personalStateProvider$patchPersonalState$1.L$4 = str;
                                            personalStateProvider$patchPersonalState$1.L$5 = ref$ObjectRef;
                                            personalStateProvider$patchPersonalState$1.L$6 = null;
                                            personalStateProvider$patchPersonalState$1.L$7 = null;
                                            personalStateProvider$patchPersonalState$1.Z$0 = z2;
                                            personalStateProvider$patchPersonalState$1.I$0 = i2;
                                            personalStateProvider$patchPersonalState$1.label = 4;
                                        }
                                        return obj2;
                                    }
                                    i6 = 0;
                                    zone7 = r5;
                                    personalStateProvider$patchPersonalState$12 = personalStateProvider$patchPersonalState$1;
                                    zone3 = zone7;
                                    z4 = z3;
                                    savePersonalStateNotifier$SavePersonalStateReason4 = savePersonalStateNotifier$SavePersonalStateReason3;
                                    i3 = i6;
                                    pex0Var4 = pex0Var3;
                                    if (i3 != 0) {
                                    }
                                }
                                r0Var = oVar.s;
                                personalStateProvider$patchPersonalState$2$1 = new PersonalStateProvider$patchPersonalState$2$1();
                                personalStateProvider$patchPersonalState$12.L$0 = zone3;
                                personalStateProvider$patchPersonalState$12.L$1 = pex0Var4;
                                personalStateProvider$patchPersonalState$12.L$2 = savePersonalStateNotifier$SavePersonalStateReason4;
                                personalStateProvider$patchPersonalState$12.L$3 = null;
                                personalStateProvider$patchPersonalState$12.L$4 = str2;
                                personalStateProvider$patchPersonalState$12.L$5 = ref$ObjectRef2;
                                personalStateProvider$patchPersonalState$12.L$6 = null;
                                personalStateProvider$patchPersonalState$12.L$7 = null;
                                personalStateProvider$patchPersonalState$12.Z$0 = z4;
                                personalStateProvider$patchPersonalState$12.I$0 = i3;
                                personalStateProvider$patchPersonalState$12.label = 1;
                                if (kotlinx.coroutines.flow.e.x(r0Var, personalStateProvider$patchPersonalState$2$1, personalStateProvider$patchPersonalState$12) != obj2) {
                                    pex0Var3 = pex0Var4;
                                    i = i3;
                                    savePersonalStateNotifier$SavePersonalStateReason3 = savePersonalStateNotifier$SavePersonalStateReason4;
                                    z3 = z4;
                                    r5 = zone3;
                                    personalStateProvider$patchPersonalState$1 = personalStateProvider$patchPersonalState$12;
                                    ref$ObjectRef3 = ref$ObjectRef2;
                                    Preorder preorder2 = oVar.b.a;
                                    ru.yandex.taxi.personalstate.domain.interactor.i iVar2 = oVar.a;
                                    String d2 = preorder2.d();
                                    String str42 = preorder2.V;
                                    personalStateProvider$patchPersonalState$1.L$0 = r5;
                                    personalStateProvider$patchPersonalState$1.L$1 = pex0Var3;
                                    personalStateProvider$patchPersonalState$1.L$2 = savePersonalStateNotifier$SavePersonalStateReason3;
                                    personalStateProvider$patchPersonalState$1.L$3 = null;
                                    personalStateProvider$patchPersonalState$1.L$4 = str2;
                                    personalStateProvider$patchPersonalState$1.L$5 = ref$ObjectRef3;
                                    personalStateProvider$patchPersonalState$1.L$6 = null;
                                    personalStateProvider$patchPersonalState$1.L$7 = ref$ObjectRef3;
                                    personalStateProvider$patchPersonalState$1.Z$0 = z3;
                                    personalStateProvider$patchPersonalState$1.I$0 = i;
                                    personalStateProvider$patchPersonalState$1.label = 2;
                                    PersonalStateProvider$patchPersonalState$1 personalStateProvider$patchPersonalState$132 = personalStateProvider$patchPersonalState$1;
                                    Zone zone52 = r5;
                                    boolean z52 = z3;
                                    String str52 = str2;
                                    SavePersonalStateNotifier$SavePersonalStateReason savePersonalStateNotifier$SavePersonalStateReason52 = savePersonalStateNotifier$SavePersonalStateReason3;
                                    pex0 pex0Var52 = pex0Var3;
                                    b = iVar2.b(d2, zone52, pex0Var52, str42, z52, savePersonalStateNotifier$SavePersonalStateReason52, str52, personalStateProvider$patchPersonalState$132);
                                    if (b != obj2) {
                                        ref$ObjectRef2 = ref$ObjectRef3;
                                        r5 = zone52;
                                        pex0Var3 = pex0Var52;
                                        z3 = z52;
                                        savePersonalStateNotifier$SavePersonalStateReason3 = savePersonalStateNotifier$SavePersonalStateReason52;
                                        str2 = str52;
                                        personalStateProvider$patchPersonalState$1 = personalStateProvider$patchPersonalState$132;
                                        r0 = b;
                                        ref$ObjectRef3.element = r0;
                                        personalStateProvider$patchPersonalState$12 = personalStateProvider$patchPersonalState$1;
                                        zone3 = r5;
                                        z4 = z3;
                                        savePersonalStateNotifier$SavePersonalStateReason4 = savePersonalStateNotifier$SavePersonalStateReason3;
                                        i3 = 0;
                                        pex0Var4 = pex0Var3;
                                        if (i3 != 0) {
                                        }
                                    }
                                }
                                return obj2;
                            }
                            int i7 = personalStateProvider$patchPersonalState$1.I$0;
                            boolean z6 = personalStateProvider$patchPersonalState$1.Z$0;
                            Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) personalStateProvider$patchPersonalState$1.L$5;
                            String str6 = (String) personalStateProvider$patchPersonalState$1.L$4;
                            SavePersonalStateNotifier$SavePersonalStateReason savePersonalStateNotifier$SavePersonalStateReason6 = (SavePersonalStateNotifier$SavePersonalStateReason) personalStateProvider$patchPersonalState$1.L$2;
                            pex0 pex0Var6 = (pex0) personalStateProvider$patchPersonalState$1.L$1;
                            Zone zone8 = (Zone) personalStateProvider$patchPersonalState$1.L$0;
                            kotlin.b.b(obj);
                            i2 = i7;
                            z2 = z6;
                            ref$ObjectRef = ref$ObjectRef4;
                            str = str6;
                            savePersonalStateNotifier$SavePersonalStateReason2 = savePersonalStateNotifier$SavePersonalStateReason6;
                            pex0Var2 = pex0Var6;
                            zone2 = zone8;
                            r0 r0Var22 = oVar.s;
                            PersonalStateProvider$patchPersonalState$3$1 personalStateProvider$patchPersonalState$3$12 = new PersonalStateProvider$patchPersonalState$3$1();
                            personalStateProvider$patchPersonalState$1.L$0 = zone2;
                            personalStateProvider$patchPersonalState$1.L$1 = pex0Var2;
                            personalStateProvider$patchPersonalState$1.L$2 = savePersonalStateNotifier$SavePersonalStateReason2;
                            personalStateProvider$patchPersonalState$1.L$3 = null;
                            personalStateProvider$patchPersonalState$1.L$4 = str;
                            personalStateProvider$patchPersonalState$1.L$5 = ref$ObjectRef;
                            personalStateProvider$patchPersonalState$1.L$6 = null;
                            personalStateProvider$patchPersonalState$1.L$7 = null;
                            personalStateProvider$patchPersonalState$1.Z$0 = z2;
                            personalStateProvider$patchPersonalState$1.I$0 = i2;
                            personalStateProvider$patchPersonalState$1.label = 4;
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } catch (CancellationException e) {
            throw e;
        }
        personalStateProvider$patchPersonalState$1 = new PersonalStateProvider$patchPersonalState$1(oVar, continuationImpl);
        Object obj3 = personalStateProvider$patchPersonalState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalStateProvider$patchPersonalState$1.label;
        ?? r52 = 4;
        int i52 = 3;
    }

    public static final void e(o oVar, w3j0 w3j0Var, j6b0 j6b0Var) {
        np40 np40Var = j6b0Var.d;
        boolean z = false;
        if (np40Var != null && np40Var.b) {
            z = true;
        }
        String str = z ? "multiclass" : null;
        if (str == null) {
            str = j6b0Var.a;
        }
        w3j0Var.d(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
        np40 np40Var2 = j6b0Var.d;
        String str2 = z ? np40Var2 != null ? np40Var2.c : null : null;
        if (str2 == null) {
            str2 = j6b0Var.e;
        }
        w3j0Var.a.put("vertical", str2);
    }

    public final tpr f() {
        return kotlinx.coroutines.flow.e.t(new m0(this.m.b(), com.yandex.go.coroutines.b.d(this.q.f, new PersonalStateProvider$authorizedWithTokenLaunchInfoIdFlow$$inlined$start$1(null, this)), new PersonalStateProvider$authorizedWithTokenLaunchInfoIdFlow$2(3, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        PersonalStateProvider$onCreatedLifecycle$1 personalStateProvider$onCreatedLifecycle$1;
        int i;
        if (continuationImpl instanceof PersonalStateProvider$onCreatedLifecycle$1) {
            personalStateProvider$onCreatedLifecycle$1 = (PersonalStateProvider$onCreatedLifecycle$1) continuationImpl;
            int i2 = personalStateProvider$onCreatedLifecycle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                personalStateProvider$onCreatedLifecycle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = personalStateProvider$onCreatedLifecycle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = personalStateProvider$onCreatedLifecycle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PersonalStateProvider$onCreatedLifecycle$2 personalStateProvider$onCreatedLifecycle$2 = new PersonalStateProvider$onCreatedLifecycle$2(null, this);
                    personalStateProvider$onCreatedLifecycle$1.label = 1;
                    if (bvf0.n(personalStateProvider$onCreatedLifecycle$2, personalStateProvider$onCreatedLifecycle$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        personalStateProvider$onCreatedLifecycle$1 = new PersonalStateProvider$onCreatedLifecycle$1(this, continuationImpl);
        Object obj2 = personalStateProvider$onCreatedLifecycle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalStateProvider$onCreatedLifecycle$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        PersonalStateProvider$onResumedLifecycle$1 personalStateProvider$onResumedLifecycle$1;
        int i;
        if (continuationImpl instanceof PersonalStateProvider$onResumedLifecycle$1) {
            personalStateProvider$onResumedLifecycle$1 = (PersonalStateProvider$onResumedLifecycle$1) continuationImpl;
            int i2 = personalStateProvider$onResumedLifecycle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                personalStateProvider$onResumedLifecycle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = personalStateProvider$onResumedLifecycle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = personalStateProvider$onResumedLifecycle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PersonalStateProvider$onResumedLifecycle$2 personalStateProvider$onResumedLifecycle$2 = new PersonalStateProvider$onResumedLifecycle$2(null, this);
                    personalStateProvider$onResumedLifecycle$1.label = 1;
                    if (bvf0.n(personalStateProvider$onResumedLifecycle$2, personalStateProvider$onResumedLifecycle$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        personalStateProvider$onResumedLifecycle$1 = new PersonalStateProvider$onResumedLifecycle$1(this, continuationImpl);
        Object obj2 = personalStateProvider$onResumedLifecycle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = personalStateProvider$onResumedLifecycle$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
