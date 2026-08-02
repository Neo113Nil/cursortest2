package ru.yandex.taxi.plus.sdk.micro_widget.composite;

import defpackage.b2k;
import defpackage.dg20;
import defpackage.gf20;
import defpackage.iic0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.ljz0;
import defpackage.mf20;
import defpackage.moc0;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ooc0;
import defpackage.qoc0;
import defpackage.rcc;
import defpackage.sdd;
import defpackage.sf20;
import defpackage.sjh;
import defpackage.smw0;
import defpackage.soc0;
import defpackage.t61;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.tse;
import defpackage.u22;
import defpackage.uyj;
import defpackage.v41;
import defpackage.vwx0;
import defpackage.w511;
import defpackage.we20;
import defpackage.wls;
import defpackage.wwx0;
import defpackage.x1d0;
import defpackage.xe20;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.m0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.plus.sdk.micro_widget.composite.CompositeMicroWidgetsViewHolder$OnStateChangeListener$onViewAttachedToWindow$1", f = "CompositeMicroWidgetsViewHolder.kt", l = {HProv.PP_DHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class CompositeMicroWidgetsViewHolder$OnStateChangeListener$onViewAttachedToWindow$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.plus.sdk.micro_widget.composite.CompositeMicroWidgetsViewHolder$OnStateChangeListener$onViewAttachedToWindow$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            we20 we20Var = (we20) obj;
            b bVar = (b) this.receiver;
            wwx0 wwx0Var = bVar.c.u;
            qoc0 qoc0Var = we20Var.a;
            String d = qoc0Var.d();
            String str = we20Var.b;
            soc0 soc0Var = we20Var.c;
            Map f = soc0Var != null ? soc0Var.a : kotlin.collections.b.f();
            ooc0 f2 = qoc0Var.f();
            moc0 moc0Var = f2 instanceof moc0 ? (moc0) f2 : null;
            Integer valueOf = moc0Var != null ? Integer.valueOf(moc0Var.a) : null;
            bVar.g.getClass();
            ListBuilder a = rcc.a();
            Iterator it = qoc0Var.e().iterator();
            while (it.hasNext()) {
                for (dg20 dg20Var : ((gf20) it.next()).b) {
                    if (dg20Var instanceof sf20) {
                        a.add(ljz0.a((sf20) dg20Var));
                    } else {
                        if (!(dg20Var instanceof mf20)) {
                            w511.b();
                            return null;
                        }
                        ArrayList arrayList = ((mf20) dg20Var).d;
                        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(ljz0.a((sf20) it2.next()));
                        }
                        a.addAll(arrayList2);
                    }
                }
            }
            ListBuilder j = a.j();
            AtomicReference atomicReference = wwx0Var.d;
            vwx0 vwx0Var = (vwx0) atomicReference.get();
            vwx0 vwx0Var2 = new vwx0(d, str, f, j, valueOf);
            if (!jl40.l(vwx0Var, vwx0Var2) && smw0.B(atomicReference, vwx0Var, vwx0Var2)) {
                t61 t61Var = wwx0Var.c;
                String a2 = vwx0Var2.a();
                String c = vwx0Var2.c();
                String d2 = vwx0Var2.d();
                List<u22> e = vwx0Var2.e();
                iic0 iic0Var = wwx0Var.b;
                ArrayList arrayList3 = new ArrayList(tcc.n(e, 10));
                for (u22 u22Var : e) {
                    iic0Var.getClass();
                    MapBuilder mapBuilder = new MapBuilder();
                    mapBuilder.put("widget_id", u22Var.getId());
                    iic0.a(mapBuilder, u22Var.getAction());
                    iic0.b(mapBuilder, u22Var);
                    arrayList3.add(mapBuilder.j());
                }
                t61Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("notification_count", a2);
                if (c != null) {
                    hashMap.put("plaque_id", c);
                }
                if (d2 != null) {
                    hashMap.put(MetaDataField.SCREEN_FIELD, d2);
                }
                hashMap.put("widget_list", arrayList3);
                t61Var.a.a("UniversalPlaque.Shown", hashMap, 1, new HashMap());
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositeMicroWidgetsViewHolder$OnStateChangeListener$onViewAttachedToWindow$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CompositeMicroWidgetsViewHolder$OnStateChangeListener$onViewAttachedToWindow$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CompositeMicroWidgetsViewHolder$OnStateChangeListener$onViewAttachedToWindow$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            xe20 xe20Var = bVar.b;
            String str = bVar.a;
            tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.X(new f(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(kotlinx.coroutines.flow.e.t(new d(xe20Var.a.a())), xe20Var.f.d, xe20Var.i.a(), new MicroWidgetBadgeInteractor$plusBadgeModels$2(4, null))), xe20Var), new MicroWidgetBadgeInteractor$special$$inlined$flatMapLatest$1(xe20Var, null)));
            mth mthVar = new mth(xe20Var.g.a, 6);
            x1d0 x1d0Var = xe20Var.j;
            m0 m0Var = new m0(t, kotlinx.coroutines.flow.e.t(new m0(mthVar, new ru.yandex.taxi.plus.sdk.counter.b(x1d0Var.b.e, x1d0Var), new MicroWidgetBadgeInteractor$getCurrentTabletModel$1(xe20Var, str, null))), new MicroWidgetBadgeInteractor$getCurrentBadge$1(xe20Var, null));
            xe20Var.k.getClass();
            sjh sjhVar = uyj.a;
            b2k s = kotlinx.coroutines.flow.e.s(new jqr(kotlinx.coroutines.flow.e.F(m0Var, sjhVar), new AnonymousClass1(2, this.this$0, b.class, "reportPlaqueOrScreenChanged", "reportPlaqueOrScreenChanged(Lru/yandex/taxi/plus/sdk/micro_widget/composite/MicroWidgetBadgeInteractor$ShownBadgeModel;)V", 4), 3), new sdd(24));
            this.this$0.f.getClass();
            tpr F = kotlinx.coroutines.flow.e.F(s, sjhVar);
            v41 v41Var = new v41(5, this.this$0);
            this.label = 1;
            if (F.collect(v41Var, this) == coroutineSingletons) {
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
