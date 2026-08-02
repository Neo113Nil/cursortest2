package ru.yandex.taxi.intercity;

import defpackage.bc;
import defpackage.e2g;
import defpackage.i5m;
import defpackage.mvg;
import defpackage.n3w;
import defpackage.n6o0;
import defpackage.ny61;
import defpackage.pmw;
import defpackage.rut;
import defpackage.snw;
import defpackage.tnw;
import defpackage.tse;
import defpackage.unw;
import defpackage.vu;
import defpackage.w3i;
import defpackage.w511;
import defpackage.wls;
import defpackage.wvq;
import defpackage.xvf0;
import defpackage.zow;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.intercity.IntercityRouterImpl$onLaunch$1", f = "IntercityRouterImpl.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class IntercityRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ zow $payload;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityRouterImpl$onLaunch$1(zow zowVar, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$payload = zowVar;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IntercityRouterImpl$onLaunch$1(this.$payload, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IntercityRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        tnw tnwVar;
        bc bcVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            unw unwVar = this.$payload.a;
            if (unwVar instanceof tnw) {
                tnwVar = (tnw) unwVar;
                b bVar = this.this$0;
                boolean z = this.$payload.b;
                bVar.getClass();
                String str = tnwVar.b;
                bcVar = bVar.I;
                if (bcVar == null) {
                    w3i w3iVar = bVar.D;
                    w3iVar.getClass();
                    str.getClass();
                    bc bcVar2 = new bc();
                    bcVar2.a = new e2g(w3iVar, 2);
                    int i3 = 12;
                    bcVar2.b = i5m.b(new rut(new e2g(w3iVar, 4), new e2g(w3iVar, 7), i3));
                    bcVar2.c = new e2g(w3iVar, 5);
                    bcVar2.w = new e2g(w3iVar, i2);
                    bcVar2.x = i5m.b(new wvq((xvf0) bcVar2.a, (xvf0) bcVar2.b, (xvf0) new vu((e2g) bcVar2.c, (e2g) bcVar2.w, n3w.a(str), i3), (xvf0) new e2g(w3iVar, 0), (xvf0) new n6o0(new e2g(w3iVar, 3), 18), (xvf0) new e2g(w3iVar, 6), 12, false));
                    bVar.I = bcVar2;
                    bcVar = bcVar2;
                }
                bVar.D((pmw) ((xvf0) bcVar.x).get(), tnwVar, new a(z, bVar));
                return zy11.a;
            }
            if (!(unwVar instanceof snw)) {
                w511.b();
                return null;
            }
            this.L$0 = null;
            this.label = 1;
            a = this.this$0.F.a((snw) unwVar, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = obj;
        }
        tnwVar = (tnw) a;
        b bVar2 = this.this$0;
        boolean z2 = this.$payload.b;
        bVar2.getClass();
        String str2 = tnwVar.b;
        bcVar = bVar2.I;
        if (bcVar == null) {
        }
        bVar2.D((pmw) ((xvf0) bcVar.x).get(), tnwVar, new a(z2, bVar2));
        return zy11.a;
    }
}
