package ru.yandex.taxi.map_common;

import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import defpackage.au50;
import defpackage.cey;
import defpackage.es00;
import defpackage.gh00;
import defpackage.jeh0;
import defpackage.kgx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qeh0;
import defpackage.tse;
import defpackage.ut7;
import defpackage.wls;
import defpackage.yof0;
import defpackage.zy11;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.map_common.c;
import ru.yandex.taxi.map_common.map.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map_common.TaxiMapViewInitializerListener$onInitialized$3", f = "TaxiMapViewInitializerListener.kt", l = {120}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class TaxiMapViewInitializerListener$onInitialized$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiMapViewInitializerListener$onInitialized$3(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiMapViewInitializerListener$onInitialized$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiMapViewInitializerListener$onInitialized$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        final int i2 = 0;
        final int i3 = 1;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                final c cVar = this.this$0;
                cey.a(cVar.i, Lifecycle.Event.ON_RESUME, new Runnable() { // from class: twx0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = i2;
                        c cVar2 = cVar;
                        switch (i4) {
                            case 0:
                                lx4 lx4Var = cVar2.n;
                                ((j) lx4Var).m.n.add(cVar2.o.e());
                                break;
                            default:
                                lx4 lx4Var2 = cVar2.n;
                                ((j) lx4Var2).m.n.remove(cVar2.o.e());
                                break;
                        }
                    }
                });
                final c cVar2 = this.this$0;
                cey.a(cVar2.i, Lifecycle.Event.ON_PAUSE, new Runnable() { // from class: twx0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = i3;
                        c cVar22 = cVar2;
                        switch (i4) {
                            case 0:
                                lx4 lx4Var = cVar22.n;
                                ((j) lx4Var).m.n.add(cVar22.o.e());
                                break;
                            default:
                                lx4 lx4Var2 = cVar22.n;
                                ((j) lx4Var2).m.n.remove(cVar22.o.e());
                                break;
                        }
                    }
                });
                this.label = 1;
                if (kotlinx.coroutines.a.d(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            ((ru.yandex.taxi.map_common.style.a) this.this$0.d.get()).c.b();
            gh00 gh00Var = (gh00) this.this$0.g.get();
            gh00Var.getClass();
            new e(gh00Var);
            gh00Var.i.d();
            ut7 ut7Var = gh00Var.g;
            au50 au50Var = ut7Var.c;
            kgx[] kgxVarArr = ut7.d;
            au50Var.setValue(ut7Var, kgxVarArr[1], null);
            ut7Var.b.setValue(ut7Var, kgxVarArr[0], null);
            gh00Var.a.a = null;
            gh00Var.f.c();
            es00 es00Var = gh00Var.e;
            au50 au50Var2 = es00Var.b;
            kgx[] kgxVarArr2 = es00.f;
            au50Var2.setValue(es00Var, kgxVarArr2[1], null);
            es00Var.a.setValue(es00Var, kgxVarArr2[0], null);
            gh00Var.b = null;
            gh00Var.d.setValue(gh00Var, gh00.j[0], null);
            yof0 yof0Var = (yof0) this.this$0.m.get();
            ViewGroup viewGroup = (ViewGroup) this.this$0.k.findViewById(qeh0.view_on_map_container);
            yof0Var.getClass();
            viewGroup.removeView(viewGroup.findViewById(jeh0.promo_over_map_view));
            throw th;
        }
    }
}
