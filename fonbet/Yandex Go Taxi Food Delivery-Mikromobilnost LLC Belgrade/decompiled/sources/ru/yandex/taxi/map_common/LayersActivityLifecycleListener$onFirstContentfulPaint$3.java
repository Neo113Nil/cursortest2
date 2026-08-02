package ru.yandex.taxi.map_common;

import defpackage.a4e0;
import defpackage.ah00;
import defpackage.gh00;
import defpackage.hyx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pq00;
import defpackage.pzt0;
import defpackage.ql00;
import defpackage.tse;
import defpackage.wls;
import defpackage.ysd0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.layers.domain.z;
import ru.yandex.taxi.layers.presentation.f;
import ru.yandex.taxi.layers.presentation.i;
import ru.yandex.taxi.layers.presentation.mapnotification.d;
import ru.yandex.taxi.map_common.map.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map_common.LayersActivityLifecycleListener$onFirstContentfulPaint$3", f = "LayersActivityLifecycleListener.kt", l = {59}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class LayersActivityLifecycleListener$onFirstContentfulPaint$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayersActivityLifecycleListener$onFirstContentfulPaint$3(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LayersActivityLifecycleListener$onFirstContentfulPaint$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LayersActivityLifecycleListener$onFirstContentfulPaint$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
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
            pzt0 pzt0Var = this.this$0.f;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            if (((p) this.this$0.c.get()).isInitialized()) {
                ((p) this.this$0.c.get()).getValue().detachController();
            }
            ru.yandex.taxi.layers.b bVar = (ru.yandex.taxi.layers.b) this.this$0.d.get();
            hyx hyxVar = (hyx) bVar.d.get();
            Iterator it = ((Map) hyxVar.f.get()).entrySet().iterator();
            while (it.hasNext()) {
                ((b) ((ysd0) hyxVar.d.get())).b((Class) ((Map.Entry) it.next()).getKey());
            }
            Iterator it2 = ((Iterable) hyxVar.g.get()).iterator();
            while (it2.hasNext()) {
                ((pq00) it2.next()).a();
            }
            ql00 ql00Var = (ql00) hyxVar.b.get();
            ((gh00) ((ah00) ql00Var.b)).s(ql00Var.w);
            ql00Var.c.Cg();
            ((z) bVar.e.get()).e.b();
            f fVar = bVar.f;
            if (fVar != null) {
                ((gh00) ((ah00) fVar.b)).u(fVar.b0);
                fVar.c.Cg();
                fVar.K.b();
                fVar.x8();
            }
            a4e0 a4e0Var = bVar.g;
            if (a4e0Var != null) {
                ((gh00) ((ah00) a4e0Var.b)).u(a4e0Var.A);
                a4e0Var.c.Cg();
                a4e0Var.x.g(null);
            }
            i iVar = bVar.h;
            if (iVar != null) {
                ((gh00) ((ah00) iVar.b)).u(iVar.y);
                iVar.c.Cg();
            }
            d dVar = bVar.i;
            if (dVar != null) {
                pzt0 pzt0Var2 = dVar.e;
                if (pzt0Var2 != null) {
                    pzt0Var2.a(null);
                }
                dVar.c.b();
            }
            bVar.f = null;
            bVar.g = null;
            bVar.h = null;
            r0 r0Var = bVar.j;
            Boolean bool = Boolean.FALSE;
            r0Var.getClass();
            r0Var.m(null, bool);
            throw th;
        }
    }
}
