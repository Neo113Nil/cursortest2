package ru.yandex.taxi.preorder.tollroad;

import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import defpackage.cwd;
import defpackage.drz0;
import defpackage.erz0;
import defpackage.evu0;
import defpackage.ex1;
import defpackage.fef;
import defpackage.g92;
import defpackage.h3y;
import defpackage.hgx;
import defpackage.i3y;
import defpackage.in91;
import defpackage.is60;
import defpackage.jl40;
import defpackage.jst;
import defpackage.ktj0;
import defpackage.ltj0;
import defpackage.mqz0;
import defpackage.mtj0;
import defpackage.mtk0;
import defpackage.noz0;
import defpackage.npz0;
import defpackage.ntj0;
import defpackage.ny61;
import defpackage.opz0;
import defpackage.pex0;
import defpackage.qze0;
import defpackage.sls;
import defpackage.soz0;
import defpackage.tpr;
import defpackage.vrz0;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.wu1;
import defpackage.xdf;
import defpackage.yal0;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.preorder.tollroad.data.RoadRestriction;
import ru.yandex.taxi.preorder.tollroad.data.TollRoadDialogExperimentProvider$PaymentMode;
import ru.yandex.taxi.preorder.tollroad.data.TollRoadDialogExperimentProvider$RoadMode;

/* loaded from: classes6.dex */
public final class o {
    public final mqz0 a;
    public final ru.yandex.taxi.preorder.tollroad.data.e b;
    public final opz0 c;
    public final a d;
    public final wiq0 e;
    public final xdf f;
    public final h3y g;
    public final ru.yandex.taxi.widget.c h;
    public final i3y i = kotlin.a.a(new sls() { // from class: ru.yandex.taxi.preorder.tollroad.d
        @Override // defpackage.sls
        public final Object invoke() {
            return new TollRoadsDialogInteractor$template$2$1(o.this.c, opz0.class, "timeTemplate", "getTimeTemplate()Ljava/lang/String;", 0);
        }
    });

    public o(mqz0 mqz0Var, ru.yandex.taxi.preorder.tollroad.data.e eVar, opz0 opz0Var, a aVar, wiq0 wiq0Var, xdf xdfVar, h3y h3yVar, ru.yandex.taxi.widget.c cVar) {
        this.a = mqz0Var;
        this.b = eVar;
        this.c = opz0Var;
        this.d = aVar;
        this.e = wiq0Var;
        this.f = xdfVar;
        this.g = h3yVar;
        this.h = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(o oVar, ntj0 ntj0Var, drz0 drz0Var, List list, int i, RoadRestriction roadRestriction, boolean z, ContinuationImpl continuationImpl) {
        TollRoadsDialogInteractor$getFreewayRoadOption$1 tollRoadsDialogInteractor$getFreewayRoadOption$1;
        int i2;
        pex0 e;
        String str;
        boolean z2;
        String b;
        opz0 opz0Var = oVar.c;
        if (continuationImpl instanceof TollRoadsDialogInteractor$getFreewayRoadOption$1) {
            tollRoadsDialogInteractor$getFreewayRoadOption$1 = (TollRoadsDialogInteractor$getFreewayRoadOption$1) continuationImpl;
            int i3 = tollRoadsDialogInteractor$getFreewayRoadOption$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tollRoadsDialogInteractor$getFreewayRoadOption$1.label = i3 - Integer.MIN_VALUE;
                Object obj = tollRoadsDialogInteractor$getFreewayRoadOption$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = tollRoadsDialogInteractor$getFreewayRoadOption$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (in91.d((DrivingRoute) it.next())) {
                                e = e(ntj0Var, drz0Var, RoadType.FREE);
                                if (e == null || (str = e.e()) == null) {
                                    str = "";
                                }
                                tollRoadsDialogInteractor$getFreewayRoadOption$1.L$0 = ntj0Var;
                                tollRoadsDialogInteractor$getFreewayRoadOption$1.L$1 = null;
                                tollRoadsDialogInteractor$getFreewayRoadOption$1.L$2 = null;
                                tollRoadsDialogInteractor$getFreewayRoadOption$1.L$3 = roadRestriction;
                                tollRoadsDialogInteractor$getFreewayRoadOption$1.L$4 = e;
                                tollRoadsDialogInteractor$getFreewayRoadOption$1.L$5 = str;
                                tollRoadsDialogInteractor$getFreewayRoadOption$1.I$0 = i;
                                tollRoadsDialogInteractor$getFreewayRoadOption$1.Z$0 = z;
                                tollRoadsDialogInteractor$getFreewayRoadOption$1.label = 1;
                                obj = oVar.g(e, tollRoadsDialogInteractor$getFreewayRoadOption$1);
                                if (obj == obj2) {
                                    return obj2;
                                }
                            }
                        }
                    }
                    return null;
                }
                if (i2 != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = tollRoadsDialogInteractor$getFreewayRoadOption$1.Z$0;
                i = tollRoadsDialogInteractor$getFreewayRoadOption$1.I$0;
                String str2 = (String) tollRoadsDialogInteractor$getFreewayRoadOption$1.L$5;
                e = (pex0) tollRoadsDialogInteractor$getFreewayRoadOption$1.L$4;
                roadRestriction = (RoadRestriction) tollRoadsDialogInteractor$getFreewayRoadOption$1.L$3;
                ntj0 ntj0Var2 = (ntj0) tollRoadsDialogInteractor$getFreewayRoadOption$1.L$0;
                kotlin.b.b(obj);
                str = str2;
                ntj0Var = ntj0Var2;
                CharSequence charSequence = (CharSequence) obj;
                String f = f(e);
                mtk0 mtk0Var = new mtk0();
                mtk0Var.b = 0;
                mtk0Var.c = !z;
                ntj0Var.getClass();
                z2 = ntj0Var instanceof mtj0;
                if (z2) {
                    b = str.length() == 0 ? opz0Var.b(opz0Var.d().e.b.b.c) : opz0.f(opz0Var.b(opz0Var.d().e.b.b.a), str);
                } else {
                    b = opz0Var.b(opz0Var.d().e.b.b.c);
                }
                mtk0Var.d = b;
                mtk0Var.g = str;
                mtk0Var.i = charSequence;
                mtk0Var.h = f;
                mtk0Var.e = ((erz0) oVar.g.get()).a(i(ntj0Var, i), (String) ((hgx) oVar.i.getValue()).get());
                mtk0Var.j = z2;
                mtk0Var.k = roadRestriction != RoadRestriction.TOLL_ONLY;
                if (opz0Var.e()) {
                    mtk0Var.f = opz0Var.b(opz0Var.d().e.b.b.j);
                }
                return mtk0Var.a();
            }
        }
        tollRoadsDialogInteractor$getFreewayRoadOption$1 = new TollRoadsDialogInteractor$getFreewayRoadOption$1(oVar, continuationImpl);
        Object obj3 = tollRoadsDialogInteractor$getFreewayRoadOption$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = tollRoadsDialogInteractor$getFreewayRoadOption$1.label;
        if (i2 != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj3;
        String f2 = f(e);
        mtk0 mtk0Var2 = new mtk0();
        mtk0Var2.b = 0;
        mtk0Var2.c = !z;
        ntj0Var.getClass();
        z2 = ntj0Var instanceof mtj0;
        if (z2) {
        }
        mtk0Var2.d = b;
        mtk0Var2.g = str;
        mtk0Var2.i = charSequence2;
        mtk0Var2.h = f2;
        mtk0Var2.e = ((erz0) oVar.g.get()).a(i(ntj0Var, i), (String) ((hgx) oVar.i.getValue()).get());
        mtk0Var2.j = z2;
        mtk0Var2.k = roadRestriction != RoadRestriction.TOLL_ONLY;
        if (opz0Var.e()) {
        }
        return mtk0Var2.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(o oVar, ntj0 ntj0Var, drz0 drz0Var, int i, List list, boolean z, ContinuationImpl continuationImpl) {
        TollRoadsDialogInteractor$getTollRoadOption$1 tollRoadsDialogInteractor$getTollRoadOption$1;
        int i2;
        pex0 e;
        String str;
        int i3;
        boolean z2;
        Object g;
        String e2;
        boolean z3;
        String str2;
        String b;
        vrz0 vrz0Var;
        vrz0 vrz0Var2;
        vrz0 vrz0Var3;
        ntj0 ntj0Var2 = ntj0Var;
        opz0 opz0Var = oVar.c;
        xdf xdfVar = oVar.f;
        if (continuationImpl instanceof TollRoadsDialogInteractor$getTollRoadOption$1) {
            tollRoadsDialogInteractor$getTollRoadOption$1 = (TollRoadsDialogInteractor$getTollRoadOption$1) continuationImpl;
            int i4 = tollRoadsDialogInteractor$getTollRoadOption$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                tollRoadsDialogInteractor$getTollRoadOption$1.label = i4 - Integer.MIN_VALUE;
                Object obj = tollRoadsDialogInteractor$getTollRoadOption$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = tollRoadsDialogInteractor$getTollRoadOption$1.label;
                String str3 = null;
                String str4 = "";
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    if (!in91.c(list)) {
                        return null;
                    }
                    e = e(ntj0Var2, drz0Var, RoadType.TOLL);
                    str = (e == null || (e2 = e.e()) == null) ? "" : e2;
                    tollRoadsDialogInteractor$getTollRoadOption$1.L$0 = ntj0Var2;
                    tollRoadsDialogInteractor$getTollRoadOption$1.L$1 = null;
                    tollRoadsDialogInteractor$getTollRoadOption$1.L$2 = null;
                    tollRoadsDialogInteractor$getTollRoadOption$1.L$3 = e;
                    tollRoadsDialogInteractor$getTollRoadOption$1.L$4 = str;
                    i3 = i;
                    tollRoadsDialogInteractor$getTollRoadOption$1.I$0 = i3;
                    z2 = z;
                    tollRoadsDialogInteractor$getTollRoadOption$1.Z$0 = z2;
                    tollRoadsDialogInteractor$getTollRoadOption$1.label = 1;
                    g = oVar.g(e, tollRoadsDialogInteractor$getTollRoadOption$1);
                    if (g == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z4 = tollRoadsDialogInteractor$getTollRoadOption$1.Z$0;
                    int i5 = tollRoadsDialogInteractor$getTollRoadOption$1.I$0;
                    str = (String) tollRoadsDialogInteractor$getTollRoadOption$1.L$4;
                    e = (pex0) tollRoadsDialogInteractor$getTollRoadOption$1.L$3;
                    ntj0 ntj0Var3 = (ntj0) tollRoadsDialogInteractor$getTollRoadOption$1.L$0;
                    kotlin.b.b(obj);
                    z2 = z4;
                    ntj0Var2 = ntj0Var3;
                    g = obj;
                    i3 = i5;
                }
                CharSequence charSequence = (CharSequence) g;
                String f = f(e);
                mtk0 mtk0Var = new mtk0();
                mtk0Var.b = 1;
                mtk0Var.c = z2;
                ntj0Var2.getClass();
                mtk0Var.a = ntj0Var2 instanceof mtj0;
                z3 = ntj0Var2 instanceof ktj0;
                boolean z5 = false;
                if (z3) {
                    str2 = "";
                } else {
                    yal0 yal0Var = ((cwd) ((ktj0) ntj0Var2).b).b;
                    str2 = xdfVar.a(yal0Var != null ? yal0Var.g() : null, (yal0Var == null || (vrz0Var3 = yal0Var.j) == null) ? null : vrz0Var3.d, false, true);
                }
                opz0Var.getClass();
                if (str2.length() != 0) {
                    b = str.length() == 0 ? opz0Var.b(opz0Var.d().e.b.b.d) : opz0.f(opz0Var.b(opz0Var.d().e.b.b.h), str);
                } else {
                    b = str.length() == 0 ? opz0Var.b(opz0Var.d().e.b.b.d) : opz0.f(opz0Var.b(opz0Var.d().e.b.b.b), str);
                }
                mtk0Var.d = b;
                mtk0Var.g = str;
                mtk0Var.i = charSequence;
                mtk0Var.h = f;
                mtk0Var.e = ((erz0) oVar.g.get()).a(i(ntj0Var2, i3), (String) ((hgx) oVar.i.getValue()).get());
                mtk0Var.k = true;
                if (!opz0Var.e()) {
                    mtk0Var.f = opz0Var.b(opz0Var.d().e.b.b.i);
                } else if (z3) {
                    cwd cwdVar = (cwd) ((ktj0) ntj0Var2).b;
                    yal0 yal0Var2 = cwdVar.b;
                    fef g2 = yal0Var2 != null ? yal0Var2.g() : null;
                    if (yal0Var2 != null && (vrz0Var2 = yal0Var2.j) != null) {
                        str3 = vrz0Var2.d;
                    }
                    String a = xdfVar.a(g2, str3, false, true);
                    yal0 yal0Var3 = cwdVar.b;
                    if (yal0Var3 != null && (vrz0Var = yal0Var3.j) != null) {
                        z5 = vrz0Var.f;
                    }
                    if (a.length() > 0) {
                        str4 = opz0.f(z5 ? opz0Var.b(opz0Var.d().e.b.b.f) : opz0Var.b(opz0Var.d().e.b.b.g), a);
                    }
                    mtk0Var.f = str4;
                }
                return mtk0Var.a();
            }
        }
        tollRoadsDialogInteractor$getTollRoadOption$1 = new TollRoadsDialogInteractor$getTollRoadOption$1(oVar, continuationImpl);
        Object obj3 = tollRoadsDialogInteractor$getTollRoadOption$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = tollRoadsDialogInteractor$getTollRoadOption$1.label;
        String str32 = null;
        String str42 = "";
        if (i2 != 0) {
        }
        CharSequence charSequence2 = (CharSequence) g;
        String f2 = f(e);
        mtk0 mtk0Var2 = new mtk0();
        mtk0Var2.b = 1;
        mtk0Var2.c = z2;
        ntj0Var2.getClass();
        mtk0Var2.a = ntj0Var2 instanceof mtj0;
        z3 = ntj0Var2 instanceof ktj0;
        boolean z52 = false;
        if (z3) {
        }
        opz0Var.getClass();
        if (str2.length() != 0) {
        }
        mtk0Var2.d = b;
        mtk0Var2.g = str;
        mtk0Var2.i = charSequence2;
        mtk0Var2.h = f2;
        mtk0Var2.e = ((erz0) oVar.g.get()).a(i(ntj0Var2, i3), (String) ((hgx) oVar.i.getValue()).get());
        mtk0Var2.k = true;
        if (!opz0Var.e()) {
        }
        return mtk0Var2.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static pex0 e(ntj0 ntj0Var, drz0 drz0Var, RoadType roadType) {
        Object obj;
        pex0 pex0Var;
        Object obj2;
        pex0 a;
        pex0 pex0Var2 = null;
        if ((ntj0Var instanceof ltj0) || (ntj0Var instanceof mtj0)) {
            return null;
        }
        if (!(ntj0Var instanceof ktj0)) {
            w511.b();
            return null;
        }
        List list = ((cwd) ((ktj0) ntj0Var).b).c;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (jl40.l(((pex0) obj3).b, drz0Var.a.b)) {
                arrayList.add(obj3);
            }
        }
        RoadType roadType2 = drz0Var.b;
        pex0 pex0Var3 = drz0Var.a;
        is60 is60Var = roadType2 == roadType ? pex0Var3.J0.b : null;
        wu1 wu1Var = pex0Var3.O;
        String a2 = wu1Var != null ? wu1Var.a() : null;
        if (is60Var == null) {
            pex0Var = null;
        } else {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((pex0) obj).J0.b, is60Var)) {
                    break;
                }
            }
            pex0Var = (pex0) obj;
        }
        if (pex0Var != null) {
            return pex0Var;
        }
        if (is60Var != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ycc.r(((pex0) it2.next()).t0.a, arrayList2);
            }
            Iterator it3 = arrayList2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it3.next();
                if (jl40.l(((ex1) obj2).a().J0.b, is60Var)) {
                    break;
                }
            }
            ex1 ex1Var = (ex1) obj2;
            if (ex1Var != null) {
                a = ex1Var.a();
                if (a == null) {
                    return a;
                }
                if (a2 != null) {
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        pex0 c = ((pex0) it4.next()).t0.c(a2);
                        if (c != null) {
                            pex0Var2 = c;
                            break;
                        }
                    }
                }
                return pex0Var2 == null ? (pex0) kotlin.collections.a.R(arrayList) : pex0Var2;
            }
        }
        a = null;
        if (a == null) {
        }
    }

    public static String f(pex0 pex0Var) {
        List list;
        Object obj;
        String str;
        if (pex0Var == null || (list = pex0Var.S) == null) {
            return "";
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ServiceLevel.Branding) obj).c == ServiceLevel.Branding.Type.CASH_BACK) {
                break;
            }
        }
        ServiceLevel.Branding branding = (ServiceLevel.Branding) obj;
        return (branding == null || (str = branding.i) == null) ? "" : str;
    }

    public static int i(ntj0 ntj0Var, int i) {
        if (!(ntj0Var instanceof mtj0) && !(ntj0Var instanceof ltj0)) {
            if (!(ntj0Var instanceof ktj0)) {
                w511.b();
                return 0;
            }
            yal0 yal0Var = ((cwd) ((ktj0) ntj0Var).b).b;
            if (yal0Var != null) {
                return yal0Var.i;
            }
        }
        return i;
    }

    public final TollRoadDialogExperimentProvider$PaymentMode c(noz0 noz0Var) {
        Boolean bool = noz0Var.b;
        Boolean bool2 = noz0Var.b;
        String str = noz0Var.a;
        Boolean bool3 = Boolean.TRUE;
        if (jl40.l(bool, bool3) && str.length() > 0 && noz0Var.c.length() > 0 && this.c.e()) {
            return TollRoadDialogExperimentProvider$PaymentMode.AUTO_WITH_FEE_DISCOUNT;
        }
        if (jl40.l(bool2, bool3) && str.length() == 0) {
            return TollRoadDialogExperimentProvider$PaymentMode.AUTO;
        }
        if (jl40.l(bool2, bool3) && str.length() > 0) {
            return TollRoadDialogExperimentProvider$PaymentMode.AUTO_WITH_FEE;
        }
        Boolean bool4 = Boolean.FALSE;
        return (jl40.l(bool2, bool4) && str.length() == 0) ? TollRoadDialogExperimentProvider$PaymentMode.MANUAL : (!jl40.l(bool2, bool4) || str.length() <= 0) ? TollRoadDialogExperimentProvider$PaymentMode.UNKNOWN : TollRoadDialogExperimentProvider$PaymentMode.MANUAL_WITH_FEE;
    }

    public final String d() {
        String str;
        TollRoadDialogExperimentProvider$RoadMode tollRoadDialogExperimentProvider$RoadMode = this.a.a.c() ? TollRoadDialogExperimentProvider$RoadMode.SINGLE_ROAD : TollRoadDialogExperimentProvider$RoadMode.MULTIPLE_ROAD;
        opz0 opz0Var = this.c;
        soz0.k kVar = opz0Var.d().e;
        int i = npz0.a[tollRoadDialogExperimentProvider$RoadMode.ordinal()];
        if (i == 1) {
            str = kVar.a.a.a;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            str = kVar.b.a.a;
        }
        return opz0Var.b(str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(12:5|6|7|8|(1:(2:11|12)(2:27|28))(3:29|(3:31|(1:33)(1:43)|(3:35|(1:37)(1:42)|(2:39|(1:41))))|44)|13|14|(1:16)|17|(1:19)|20|(1:25)(2:22|23)))|49|6|7|8|(0)(0)|13|14|(0)|17|(0)|20|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b5, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0095, code lost:
    
        r2 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(pex0 pex0Var, ContinuationImpl continuationImpl) {
        TollRoadsDialogInteractor$getOriginalPrice$1 tollRoadsDialogInteractor$getOriginalPrice$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof TollRoadsDialogInteractor$getOriginalPrice$1) {
            tollRoadsDialogInteractor$getOriginalPrice$1 = (TollRoadsDialogInteractor$getOriginalPrice$1) continuationImpl;
            int i2 = tollRoadsDialogInteractor$getOriginalPrice$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tollRoadsDialogInteractor$getOriginalPrice$1.label = i2 - Integer.MIN_VALUE;
                TollRoadsDialogInteractor$getOriginalPrice$1 tollRoadsDialogInteractor$getOriginalPrice$12 = tollRoadsDialogInteractor$getOriginalPrice$1;
                Object obj = tollRoadsDialogInteractor$getOriginalPrice$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tollRoadsDialogInteractor$getOriginalPrice$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (pex0Var != null) {
                        qze0 qze0Var = pex0Var.m;
                        String str = qze0Var != null ? qze0Var.d : null;
                        if (str != null) {
                            String str2 = !evu0.J(str) ? str : null;
                            if (str2 != null) {
                                ru.yandex.taxi.widget.c cVar = this.h;
                                FormattedText formattedText = new FormattedText(Collections.singletonList(new FormattedText.h(str2, null, null, null, Collections.singletonList(new FormattedText.f(FormattedText.LineThroughStyle.DEFAULT, 2)), null, 2014)));
                                tollRoadsDialogInteractor$getOriginalPrice$12.L$0 = null;
                                tollRoadsDialogInteractor$getOriginalPrice$12.L$1 = null;
                                tollRoadsDialogInteractor$getOriginalPrice$12.label = 1;
                                obj = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, tollRoadsDialogInteractor$getOriginalPrice$12, 30);
                                if (obj == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                    }
                    return "";
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                Object failure = (CharSequence) obj;
                a = Result.a(failure);
                if (a != null) {
                    jst.e.k(a, "TollRoadsDialogInteractor");
                }
                CharSequence charSequence = (CharSequence) (failure instanceof Result.Failure ? null : failure);
                return charSequence != null ? "" : charSequence;
            }
        }
        tollRoadsDialogInteractor$getOriginalPrice$1 = new TollRoadsDialogInteractor$getOriginalPrice$1(this, continuationImpl);
        TollRoadsDialogInteractor$getOriginalPrice$1 tollRoadsDialogInteractor$getOriginalPrice$122 = tollRoadsDialogInteractor$getOriginalPrice$1;
        Object obj2 = tollRoadsDialogInteractor$getOriginalPrice$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tollRoadsDialogInteractor$getOriginalPrice$122.label;
        if (i != 0) {
        }
        Object failure2 = (CharSequence) obj2;
        a = Result.a(failure2);
        if (a != null) {
        }
        CharSequence charSequence2 = (CharSequence) (failure2 instanceof Result.Failure ? null : failure2);
        if (charSequence2 != null) {
        }
    }

    public final tpr h() {
        if (this.a.a.c()) {
            return new g92(2, EmptyList.a);
        }
        m0 a = this.d.a();
        tpr t = kotlinx.coroutines.flow.e.t(new h(((com.yandex.go.taxi.tariffs.internal.repository.k) this.e).j.b()));
        ru.yandex.taxi.preorder.tollroad.data.e eVar = this.b;
        return new f(kotlinx.coroutines.flow.e.m(a, t, new j(eVar.e, this), eVar.g, new TollRoadsDialogInteractor$roadOptionsFlow$3(this, null)));
    }
}
