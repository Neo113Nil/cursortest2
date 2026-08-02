package ru.yandex.taxi.surge.dialog;

import defpackage.a0b;
import defpackage.cyt;
import defpackage.eru;
import defpackage.g0b;
import defpackage.hhs0;
import defpackage.htw0;
import defpackage.itw0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.jtw0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o2j;
import defpackage.qge;
import defpackage.qit0;
import defpackage.rge;
import defpackage.tse;
import defpackage.tsw0;
import defpackage.vxt;
import defpackage.w511;
import defpackage.wls;
import defpackage.xfe;
import defpackage.xsw0;
import defpackage.zow0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.dialog.SurgeInfoPresenter$attachView$1", f = "SurgeInfoPresenter.kt", l = {157}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeInfoPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ tsw0 $mvpView;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ xsw0 this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.surge.dialog.SurgeInfoPresenter$attachView$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            Map a;
            String str;
            String str2;
            jtw0 jtw0Var = (jtw0) obj;
            xsw0 xsw0Var = (xsw0) this.receiver;
            xsw0Var.getClass();
            if (!jl40.l(jtw0Var, itw0.a)) {
                if (!(jtw0Var instanceof htw0)) {
                    w511.b();
                    return null;
                }
                List<qge> list = ((htw0) jtw0Var).a;
                ArrayList arrayList = new ArrayList();
                for (qge qgeVar : list) {
                    xsw0Var.D.getClass();
                    if (qgeVar instanceof cyt) {
                        a = kotlin.collections.b.l(new Pair("name", "gradient_component"));
                        vxt vxtVar = ((cyt) qgeVar).f;
                        if (vxtVar != null) {
                            Integer num = vxtVar.a;
                            if (num != null) {
                                a.put("free_cars", Integer.valueOf(num.intValue()));
                            }
                            Integer num2 = vxtVar.b;
                            if (num2 != null) {
                                a.put("total_cars", Integer.valueOf(num2.intValue()));
                            }
                            Integer num3 = vxtVar.c;
                            if (num3 != null) {
                                a.put("orders", Integer.valueOf(num3.intValue()));
                            }
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (vxtVar != null && (str2 = vxtVar.d) != null) {
                            linkedHashMap.put("first_color", str2);
                        }
                        if (vxtVar != null && (str = vxtVar.e) != null) {
                            linkedHashMap.put("second_color", str);
                        }
                        if (!linkedHashMap.isEmpty()) {
                            a.put("gradient_colors", linkedHashMap);
                        }
                    } else {
                        a = qgeVar instanceof g0b ? rge.a("chart") : qgeVar instanceof a0b ? rge.a("chart_error") : qgeVar instanceof xfe ? rge.a(((xfe) qgeVar).c) : qgeVar instanceof eru ? rge.a("horizontal_scroll_shortcuts") : qgeVar instanceof o2j ? rge.a("detailed_price") : null;
                    }
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                hhs0 hhs0Var = xsw0Var.E;
                zow0 zow0Var = (zow0) hhs0Var.b;
                String str3 = (String) hhs0Var.c;
                zow0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("sections", arrayList);
                hashMap.put("open_reason", str3);
                zow0Var.a.a("SurgeCard.ContentLoaded", hashMap, 1, new HashMap());
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeInfoPresenter$attachView$1(xsw0 xsw0Var, tsw0 tsw0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = xsw0Var;
        this.$mvpView = tsw0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SurgeInfoPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgeInfoPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            xsw0 xsw0Var = this.this$0;
            jqr jqrVar = new jqr(xsw0Var.x.c(xsw0Var.F, xsw0Var.A), new AnonymousClass1(2, this.this$0, xsw0.class, "onStateChanged", "onStateChanged(Lru/yandex/taxi/surge/dialog/SurgeInfoState;)V", 4), 3);
            tsw0 tsw0Var = this.$mvpView;
            o oVar = new o(jqrVar, new SurgeInfoPresenter$attachView$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            qit0 qit0Var = new qit0(26, tsw0Var);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(qit0Var, this) == coroutineSingletons) {
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
