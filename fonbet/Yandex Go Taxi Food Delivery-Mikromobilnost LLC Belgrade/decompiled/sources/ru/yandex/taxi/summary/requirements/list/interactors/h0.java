package ru.yandex.taxi.summary.requirements.list.interactors;

import com.yandex.go.due.api.analytics.model.DueAnalyticDisplayContext;
import com.yandex.go.requirements.comment.api.summary.data.models.CommentViewSource;
import com.yandex.go.zone.dto.objects.TariffInfoGroupDefinition;
import com.yandex.go.zone.model.Zone;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.b580;
import defpackage.b8r;
import defpackage.d82;
import defpackage.dfj0;
import defpackage.dp01;
import defpackage.dqe0;
import defpackage.e9w;
import defpackage.f580;
import defpackage.fbj0;
import defpackage.hxx;
import defpackage.jbn;
import defpackage.jl40;
import defpackage.jmw0;
import defpackage.joj0;
import defpackage.m950;
import defpackage.mi31;
import defpackage.nnm;
import defpackage.npj0;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.ogu0;
import defpackage.p6g;
import defpackage.pep0;
import defpackage.pex0;
import defpackage.pw1;
import defpackage.q6c0;
import defpackage.qtb1;
import defpackage.qv70;
import defpackage.qvm;
import defpackage.roj0;
import defpackage.sgt0;
import defpackage.soj0;
import defpackage.tej0;
import defpackage.tot0;
import defpackage.txe;
import defpackage.upj0;
import defpackage.vpj0;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.wiy0;
import defpackage.x4e;
import defpackage.x8;
import defpackage.xcv0;
import defpackage.xmw;
import defpackage.ynm0;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.intercity.analytics.IntercityPhoneSelectOrigin;
import ru.yandex.taxi.orderforanother.model.FormedFrom;
import ru.yandex.taxi.summary.requirements.list.models.RequirementType;

/* loaded from: classes6.dex */
public final class h0 {
    public final roj0 a;
    public final joj0 b;
    public final npj0 c;
    public final y d;
    public final o e;
    public final k0 f;
    public final ru.yandex.taxi.preorder.summary.tariffpage.requirements.a g;
    public final yvf0 h;
    public final dfj0 i;
    public final ru.yandex.taxi.summary.requirements.list.router.a j;
    public final wiq0 k;
    public final q6c0 l;
    public final u0 m;
    public final oep0 n;
    public final yvf0 o;
    public final a p;

    public h0(roj0 roj0Var, joj0 joj0Var, npj0 npj0Var, y yVar, o oVar, k0 k0Var, ru.yandex.taxi.preorder.summary.tariffpage.requirements.a aVar, yvf0 yvf0Var, dfj0 dfj0Var, ru.yandex.taxi.summary.requirements.list.router.a aVar2, wiq0 wiq0Var, q6c0 q6c0Var, u0 u0Var, oep0 oep0Var, p6g p6gVar, a aVar3) {
        this.a = roj0Var;
        this.b = joj0Var;
        this.c = npj0Var;
        this.d = yVar;
        this.e = oVar;
        this.f = k0Var;
        this.g = aVar;
        this.h = yvf0Var;
        this.i = dfj0Var;
        this.j = aVar2;
        this.k = wiq0Var;
        this.l = q6c0Var;
        this.m = u0Var;
        this.n = oep0Var;
        this.o = p6gVar;
        this.p = aVar3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0094, code lost:
    
        if (a(r8, r1) == r2) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(fbj0 fbj0Var, Continuation continuation) {
        RequirementsRoutingInteractor$handleRequirementActions$1 requirementsRoutingInteractor$handleRequirementActions$1;
        int i;
        Iterable iterable;
        Object obj;
        soj0 a;
        Object obj2 = zy11.a;
        if (continuation instanceof RequirementsRoutingInteractor$handleRequirementActions$1) {
            requirementsRoutingInteractor$handleRequirementActions$1 = (RequirementsRoutingInteractor$handleRequirementActions$1) continuation;
            int i2 = requirementsRoutingInteractor$handleRequirementActions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementsRoutingInteractor$handleRequirementActions$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = requirementsRoutingInteractor$handleRequirementActions$1.result;
                Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementsRoutingInteractor$handleRequirementActions$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    if (fbj0Var.b) {
                        pex0 a2 = this.a.a();
                        if (a2 == null || (iterable = a2.f) == null) {
                            iterable = EmptyList.a;
                        }
                        Iterator it = iterable.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (((TariffInfoGroupDefinition) obj).b.contains(fbj0Var.a)) {
                                break;
                            }
                        }
                        TariffInfoGroupDefinition tariffInfoGroupDefinition = (TariffInfoGroupDefinition) obj;
                        if (tariffInfoGroupDefinition != null) {
                            fbj0 fbj0Var2 = new fbj0(tariffInfoGroupDefinition.a, fbj0Var.b, fbj0Var.c);
                            requirementsRoutingInteractor$handleRequirementActions$1.L$0 = fbj0Var;
                            requirementsRoutingInteractor$handleRequirementActions$1.L$1 = null;
                            requirementsRoutingInteractor$handleRequirementActions$1.label = 1;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj3);
                        return obj3;
                    }
                    fbj0Var = (fbj0) requirementsRoutingInteractor$handleRequirementActions$1.L$0;
                    kotlin.b.b(obj3);
                }
                a = this.f.a(fbj0Var.a, fbj0Var.c);
                if (a != null) {
                    String str = fbj0Var.a;
                    requirementsRoutingInteractor$handleRequirementActions$1.L$0 = null;
                    requirementsRoutingInteractor$handleRequirementActions$1.L$1 = null;
                    requirementsRoutingInteractor$handleRequirementActions$1.label = 2;
                    ru.yandex.taxi.preorder.summary.tariffpage.requirements.a aVar = this.g;
                    upj0 upj0Var = a.a;
                    TariffInfoGroupDefinition tariffInfoGroupDefinition2 = a.d;
                    if (upj0Var != null) {
                        aVar.c(upj0Var, !a.b);
                    } else {
                        jmw0 jmw0Var = a.c;
                        if (jmw0Var != null) {
                            q6c0 q6c0Var = this.l;
                            f580 f580Var = (f580) q6c0Var.b;
                            String name = jmw0Var.getName();
                            String b = ((roj0) q6c0Var.w).b();
                            xcv0 xcv0Var = f580Var.c;
                            String str2 = f580Var.a.a.V;
                            HashMap m = nnm.m(xcv0Var, "requirement", name);
                            if (str2 != null) {
                                m.put("vertical_id", str2);
                            }
                            if (b != null) {
                                m.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, b);
                            }
                            xcv0Var.a.a("Summary.Requirement.Details.CardShown", m, 1, new HashMap());
                            aVar.b(jmw0Var);
                        } else if (tariffInfoGroupDefinition2 != null) {
                            ((pep0) this.n).f((m950) this.h.get(), new tot0(tariffInfoGroupDefinition2), hxx.a);
                        } else {
                            tej0 tej0Var = a.e;
                            if (tej0Var != null) {
                                obj2 = this.j.a(tej0Var, str, requirementsRoutingInteractor$handleRequirementActions$1);
                            }
                        }
                    }
                    if (obj2 == obj4) {
                        return obj4;
                    }
                }
                return obj2;
            }
        }
        requirementsRoutingInteractor$handleRequirementActions$1 = new RequirementsRoutingInteractor$handleRequirementActions$1(this, continuation);
        Object obj32 = requirementsRoutingInteractor$handleRequirementActions$1.result;
        Object obj42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementsRoutingInteractor$handleRequirementActions$1.label;
        if (i != 0) {
        }
        a = this.f.a(fbj0Var.a, fbj0Var.c);
        if (a != null) {
        }
        return obj2;
    }

    public final Object b(String str, ContinuationImpl continuationImpl, boolean z) {
        Object a;
        return (k0.c(this.f, str, null, z, 2) == null || (a = a(new fbj0(str, 2), continuationImpl)) != CoroutineSingletons.COROUTINE_SUSPENDED) ? zy11.a : a;
    }

    public final void c(RequirementType requirementType) {
        RequirementsDueStateInteractor$DueSelectType requirementsDueStateInteractor$DueSelectType;
        Zone c;
        pex0 pex0Var;
        int i = vpj0.a[requirementType.ordinal()];
        q6c0 q6c0Var = this.l;
        ru.yandex.taxi.preorder.summary.tariffpage.requirements.a aVar = this.g;
        switch (i) {
            case 1:
                f580 f580Var = (f580) q6c0Var.b;
                String b = ((roj0) q6c0Var.w).b();
                xcv0 xcv0Var = f580Var.c;
                String g = f580Var.g();
                xcv0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("summary_state", g);
                hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, b);
                xcv0Var.a.a("Summary.Requirements.Comments", hashMap, 2, new HashMap());
                aVar.a(CommentViewSource.TARIFF_CARD);
                break;
            case 2:
                this.i.a(new txe(this.k));
                break;
            case 3:
                q6c0Var.P();
                aVar.a.b.a();
                break;
            case 4:
                sgt0 sgt0Var = aVar.a;
                qv70 qv70Var = sgt0Var.a;
                qv70Var.getClass();
                qv70Var.a.a("OrderForAnother.RequirementOption", new HashMap(), 1, new HashMap());
                sgt0Var.d.i(FormedFrom.REQUIREMENTS);
                ((ru.yandex.taxi.orderforanother.router.a) sgt0Var.c).b(new d82(1), new d82(1));
                break;
            case 5:
                y yVar = this.d;
                dqe0 dqe0Var = yVar.b;
                String b2 = yVar.a.b();
                int[] a = yVar.c.a();
                ynm0 ynm0Var = yVar.e;
                mi31 d = b8r.d(ynm0Var.d, b2, null, 6);
                if (((d == null || (pex0Var = d.a) == null || !pex0Var.K0) ? ynm0Var.b(b2) : ynm0Var.a(pex0Var)) || a.length != 1 || ((c = dqe0Var.c()) != null && c.e)) {
                    yVar.f.c.a.a("Summary.Requirements.preorder", x4e.p(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, b2), 1, new HashMap());
                    requirementsDueStateInteractor$DueSelectType = RequirementsDueStateInteractor$DueSelectType.SELECTABLE;
                } else {
                    yVar.d.d(a[0], dqe0Var.d());
                    requirementsDueStateInteractor$DueSelectType = RequirementsDueStateInteractor$DueSelectType.ONLY_VARIANT;
                }
                if (requirementsDueStateInteractor$DueSelectType == RequirementsDueStateInteractor$DueSelectType.SELECTABLE) {
                    aVar.getClass();
                    ((pep0) aVar.k).f(new pw1(3, new ogu0(13, aVar), aVar.f), new qvm(DueAnalyticDisplayContext.REQUIREMENTS), hxx.a);
                    break;
                }
                break;
            case 6:
                ((xmw) aVar.a.e.get()).T(IntercityPhoneSelectOrigin.TARIFF_CARD);
                break;
            case 7:
                String str = ((dp01) this.m.d()).c.d().d;
                if (str != null && str.length() != 0) {
                    ((pep0) aVar.k).f((m950) aVar.h.get(), zy11.a, hxx.a);
                    break;
                }
                break;
            case 8:
                this.p.e.g();
                ((pep0) this.n).f((m950) this.o.get(), new wiy0(), hxx.a);
                break;
            default:
                w511.b();
                break;
        }
    }

    public final void d(RequirementType requirementType) {
        Object obj = null;
        switch (vpj0.a[requirementType.ordinal()]) {
            case 1:
            case 2:
            case 8:
                break;
            case 3:
                this.l.P();
                joj0 joj0Var = this.b;
                String b = joj0Var.b.b();
                ru.yandex.taxi.preorder.extraphone.e eVar = joj0Var.c;
                if (eVar.c(b).b.length() > 0) {
                    eVar.c.remove(b);
                    eVar.d.g(zy11.a);
                    break;
                }
                break;
            case 4:
                ru.yandex.taxi.orderforanother.repository.a aVar = this.c.b;
                aVar.g();
                aVar.f();
                break;
            case 5:
                y yVar = this.d;
                String c = ((jbn) yVar.l).c();
                Iterator it = yVar.b.a.x.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (jl40.l(((b580) next).a, c)) {
                            obj = next;
                        }
                    }
                }
                b580 b580Var = (b580) obj;
                if (b580Var != null) {
                    yVar.b.a.x = kotlin.collections.a.j0(yVar.b.a.x, b580Var);
                }
                yVar.d.a(qtb1.D);
                break;
            case 6:
                ((e9w) this.e.a).c(null);
                break;
            case 7:
                u0 u0Var = this.m;
                if (((Boolean) ((dp01) u0Var.d()).b().g.a.getValue()).booleanValue()) {
                    String str = ((dp01) u0Var.d()).c.d().d;
                    if (str != null) {
                        x8 x8Var = (x8) u0Var.e;
                        x8Var.d(str);
                        x8Var.a();
                    }
                    ((dp01) u0Var.d()).a();
                    u0Var.b.f();
                    break;
                }
                break;
            default:
                w511.b();
                break;
        }
    }
}
