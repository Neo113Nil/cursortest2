package ru.yandex.taxi.summary.requirements.list.recycler;

import com.yandex.go.summary.analytics.SummaryAnalytics$RequirementRedirectSource;
import com.yandex.go.summary.analytics.SummaryAnalytics$RequirementTappedSource;
import com.yandex.go.summary.analytics.SummaryAnalytics$UnsupportedRequirementSource;
import defpackage.bxi0;
import defpackage.ejj0;
import defpackage.evu0;
import defpackage.ey8;
import defpackage.f580;
import defpackage.fnx0;
import defpackage.gmw0;
import defpackage.hxx;
import defpackage.iev0;
import defpackage.jst;
import defpackage.m950;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.ox8;
import defpackage.pep0;
import defpackage.px8;
import defpackage.qx8;
import defpackage.sx8;
import defpackage.t450;
import defpackage.tse;
import defpackage.tx8;
import defpackage.ux8;
import defpackage.w040;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.wls;
import defpackage.wud;
import defpackage.xby;
import defpackage.yjj0;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.requirements.analytics.RequirementRemoveSource;
import ru.yandex.taxi.requirements.interactor.x;
import ru.yandex.taxi.summary.requirements.list.interactors.h0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.requirements.list.recycler.RequirementItemsExternalDelegate$onCarouselItemClick$1", f = "RequirementItemsExternalDelegate.kt", l = {53}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RequirementItemsExternalDelegate$onCarouselItemClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ ey8 $item;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequirementItemsExternalDelegate$onCarouselItemClick$1(i iVar, ey8 ey8Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$item = ey8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RequirementItemsExternalDelegate$onCarouselItemClick$1(this.this$0, this.$item, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequirementItemsExternalDelegate$onCarouselItemClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0207 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0208 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons;
        zy11 zy11Var;
        Object obj2;
        ejj0 ejj0Var;
        String str;
        boolean z;
        mi31 mi31Var;
        List list;
        ejj0 ejj0Var2;
        mi31 mi31Var2;
        boolean z2;
        mi31 mi31Var3;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var2;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        w040 w040Var = this.this$0.d;
        iev0 iev0Var = (iev0) w040Var.h;
        ey8 ey8Var = this.$item;
        this.label = 1;
        h0 h0Var = (h0) w040Var.d;
        wiq0 wiq0Var = (wiq0) w040Var.a;
        ux8 ux8Var = ey8Var.a;
        int i2 = ey8Var.b;
        if (ux8Var instanceof ox8) {
            ox8 ox8Var = (ox8) ux8Var;
            fnx0 n = ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).n();
            if (n != null && (mi31Var3 = n.a) != null) {
                iev0Var.a(ox8Var.a, SummaryAnalytics$RequirementRedirectSource.Carousel, ox8Var.f, new t450(i2), mi31Var3.f, mi31Var3.b, mi31Var3.g);
            }
            obj2 = h0Var.b(ox8Var.a, this, false);
        } else if (ux8Var instanceof qx8) {
            qx8 qx8Var = (qx8) ux8Var;
            fnx0 n2 = ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).n();
            mi31 mi31Var4 = n2 != null ? n2.a : null;
            if (mi31Var4 != null) {
                z2 = false;
                iev0Var.b(qx8Var.k(), SummaryAnalytics$RequirementTappedSource.Carousel, qx8Var.isSelected(), null, new t450(i2), mi31Var4.f, mi31Var4.b, mi31Var4.g);
            } else {
                z2 = false;
            }
            obj2 = h0Var.b(qx8Var.a, this, z2);
        } else {
            if (!(ux8Var instanceof tx8)) {
                if (ux8Var instanceof px8) {
                    px8 px8Var = (px8) ux8Var;
                    x xVar = (x) w040Var.g;
                    gmw0 gmw0Var = px8Var.g;
                    int i3 = px8Var.h;
                    boolean z3 = px8Var.d;
                    List c = xVar.c(gmw0Var);
                    fnx0 n3 = ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).n();
                    mi31 mi31Var5 = n3 != null ? n3.a : null;
                    ejj0 ejj0Var3 = z3 ? (ejj0) kotlin.collections.a.S(i3, c) : null;
                    if (ejj0Var3 != null) {
                        ejj0Var = ejj0Var3;
                        str = ejj0Var3.a;
                    } else {
                        ejj0Var = ejj0Var3;
                        str = null;
                    }
                    if (mi31Var5 != null) {
                        zy11Var = zy11Var2;
                        coroutineSingletons = coroutineSingletons2;
                        ejj0Var2 = ejj0Var;
                        list = c;
                        z = z3;
                        mi31Var = mi31Var5;
                        iev0Var.b(px8Var.k(), SummaryAnalytics$RequirementTappedSource.Carousel, px8Var.isSelected(), str, new t450(i2), mi31Var5.f, mi31Var5.b, mi31Var5.g);
                    } else {
                        coroutineSingletons = coroutineSingletons2;
                        zy11Var = zy11Var2;
                        z = z3;
                        mi31Var = mi31Var5;
                        list = c;
                        ejj0Var2 = ejj0Var;
                    }
                    if (z) {
                        if (ejj0Var2 != null) {
                            xVar.a(gmw0Var, kotlin.collections.a.j0(list, ejj0Var2));
                        }
                    } else if (mi31Var == null) {
                        xby.l(jst.e, "Summary:Requirement:OptionSelection:Modal:Show", null, null, "Selected tariff is null", 6);
                    } else {
                        ((pep0) ((oep0) w040Var.f)).f((m950) ((yvf0) w040Var.e).get(), new wud(mi31Var, gmw0Var, list, i3), hxx.a);
                    }
                } else {
                    coroutineSingletons = coroutineSingletons2;
                    zy11Var = zy11Var2;
                    if (!(ux8Var instanceof sx8)) {
                        w511.b();
                        return null;
                    }
                    sx8 sx8Var = (sx8) ux8Var;
                    String str2 = sx8Var.a;
                    fnx0 n4 = ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).n();
                    mi31 mi31Var6 = n4 != null ? n4.a : null;
                    if (mi31Var6 != null) {
                        iev0Var.d(sx8Var.a, SummaryAnalytics$UnsupportedRequirementSource.Carousel, sx8Var.d, new t450(i2), mi31Var6.f, mi31Var6.b, mi31Var6.g);
                    }
                    List<String> list2 = sx8Var.d;
                    List singletonList = Collections.singletonList("");
                    if (list2 == null || list2.isEmpty()) {
                        list2 = singletonList;
                    }
                    for (String str3 : list2) {
                        ((f580) w040Var.b).e(str2, (str3 == null || evu0.J(str3)) ? EmptyList.a : Collections.singletonList(str3), RequirementRemoveSource.LIST, null);
                        bxi0 bxi0Var = (bxi0) w040Var.c;
                        String str4 = mi31Var6 != null ? mi31Var6.f : null;
                        String str5 = mi31Var6 != null ? mi31Var6.b : null;
                        if (str5 == null) {
                            str5 = "";
                        }
                        ((yjj0) bxi0Var).a(str2, str3, str4, str5);
                    }
                }
                obj2 = zy11Var;
                coroutineSingletons2 = coroutineSingletons;
                return obj2 != coroutineSingletons2 ? coroutineSingletons2 : zy11Var;
            }
            tx8 tx8Var = (tx8) ux8Var;
            fnx0 n5 = ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).n();
            if (n5 != null && (mi31Var2 = n5.a) != null) {
                iev0Var.c(tx8Var.a, tx8Var.d, mi31Var2.f, mi31Var2.b, i2, mi31Var2.g);
            }
            obj2 = h0Var.b(tx8Var.b, this, false);
        }
        zy11Var = zy11Var2;
        if (obj2 != coroutineSingletons2) {
        }
    }
}
