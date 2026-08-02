package ru.yandex.taxi.scooters.presentation.ontheway;

import defpackage.gjo;
import defpackage.iar;
import defpackage.jst;
import defpackage.mvg;
import defpackage.n6o;
import defpackage.nqm0;
import defpackage.ny61;
import defpackage.r9r;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zuo0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.scooters.data.model.Type;
import ru.yandex.taxi.scooters.domain.model.ScootersEvolvingFailedException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.ScootersOnTheWayPresenter$tryFinishOrder$1", f = "ScootersOnTheWayPresenter.kt", l = {314, 317}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersOnTheWayPresenter$tryFinishOrder$1 extends SuspendLambda implements wls {
    final /* synthetic */ sls $onComplete;
    final /* synthetic */ zuo0 $scootersSessionState;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersOnTheWayPresenter$tryFinishOrder$1(sls slsVar, zuo0 zuo0Var, Continuation continuation, f fVar) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$scootersSessionState = zuo0Var;
        this.$onComplete = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        f fVar = this.this$0;
        return new ScootersOnTheWayPresenter$tryFinishOrder$1(this.$onComplete, this.$scootersSessionState, continuation, fVar);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersOnTheWayPresenter$tryFinishOrder$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|2|(1:(1:(9:6|7|8|9|(2:10|(4:12|(1:14)(1:28)|15|(2:17|18)(1:27))(1:29))|(1:20)(1:26)|21|22|23)(2:35|36))(4:37|38|39|40))(5:52|53|54|(1:56)|44)|41|42|(7:45|9|(3:10|(0)(0)|27)|(0)(0)|21|22|23)|44|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00da, code lost:
    
        r13 = r0;
        r3 = r6;
        r5 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b6 A[Catch: all -> 0x002e, CancellationException -> 0x0120, TryCatch #1 {CancellationException -> 0x0120, blocks: (B:8:0x0029, B:9:0x00a6, B:10:0x00b0, B:12:0x00b6, B:14:0x00bf, B:15:0x00c5, B:21:0x00ce, B:39:0x0050, B:42:0x0087, B:54:0x0069), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca A[EDGE_INSN: B:29:0x00ca->B:19:0x00ca BREAK  A[LOOP:0: B:10:0x00b0->B:27:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        f fVar;
        sls slsVar;
        ScootersEvolvingFailedException scootersEvolvingFailedException;
        zuo0 zuo0Var;
        zuo0 zuo0Var2;
        sls slsVar2;
        f fVar2;
        zuo0 zuo0Var3;
        gjo gjoVar;
        f fVar3;
        sls slsVar3;
        zuo0 zuo0Var4;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj2 = null;
        boolean z = true;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                fVar = this.this$0;
                zuo0 zuo0Var5 = this.$scootersSessionState;
                slsVar = this.$onComplete;
                try {
                    nqm0 nqm0Var = fVar.I;
                    this.L$0 = fVar;
                    this.L$1 = zuo0Var5;
                    this.L$2 = slsVar;
                    this.L$3 = fVar;
                    this.L$4 = zuo0Var5;
                    this.L$5 = slsVar;
                    this.label = 1;
                    Object a = nqm0Var.a.a(zuo0Var5, this);
                    if (a != coroutineSingletons) {
                        zuo0Var2 = zuo0Var5;
                        slsVar2 = slsVar;
                        fVar2 = fVar;
                        obj = a;
                        zuo0Var3 = zuo0Var2;
                    }
                    return coroutineSingletons;
                } catch (Throwable th) {
                    scootersEvolvingFailedException = th;
                    zuo0Var = zuo0Var5;
                    if (scootersEvolvingFailedException instanceof ScootersEvolvingFailedException) {
                        ScootersEvolvingFailedException scootersEvolvingFailedException2 = scootersEvolvingFailedException;
                        fVar.Ug(zuo0Var, new n6o(scootersEvolvingFailedException2), slsVar);
                        xby.l(jst.e, "Scooters.Evolve: try finish " + scootersEvolvingFailedException2.getErrorCode(), null, scootersEvolvingFailedException2, "Error occurred when checking possibility to complete order with code " + scootersEvolvingFailedException2.getErrorCode(), 2);
                    }
                    return zy11.a;
                }
            }
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gjoVar = (gjo) this.L$6;
                slsVar = (sls) this.L$5;
                zuo0Var = (zuo0) this.L$4;
                fVar = (f) this.L$3;
                slsVar3 = (sls) this.L$2;
                zuo0Var4 = (zuo0) this.L$1;
                fVar3 = (f) this.L$0;
                try {
                    kotlin.b.b(obj);
                    it = gjoVar.b.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        r9r r9rVar = (r9r) next;
                        if ((r9rVar != null ? r9rVar.a() : null) == Type.NO_PHOTO) {
                            obj2 = next;
                            break;
                        }
                    }
                    if (obj2 == null) {
                        z = false;
                    }
                    fVar3.Ug(zuo0Var4, new iar(gjoVar.c.a, z), slsVar3);
                } catch (Throwable th2) {
                    scootersEvolvingFailedException = th2;
                    if (scootersEvolvingFailedException instanceof ScootersEvolvingFailedException) {
                    }
                    return zy11.a;
                }
                return zy11.a;
            }
            slsVar = (sls) this.L$5;
            zuo0 zuo0Var6 = (zuo0) this.L$4;
            f fVar4 = (f) this.L$3;
            sls slsVar4 = (sls) this.L$2;
            zuo0 zuo0Var7 = (zuo0) this.L$1;
            f fVar5 = (f) this.L$0;
            try {
                kotlin.b.b(obj);
                zuo0Var3 = zuo0Var6;
                fVar = fVar5;
                zuo0Var2 = zuo0Var7;
                slsVar2 = slsVar4;
                fVar2 = fVar4;
            } catch (Throwable th3) {
                scootersEvolvingFailedException = th3;
                zuo0Var = zuo0Var6;
                fVar = fVar4;
                if (scootersEvolvingFailedException instanceof ScootersEvolvingFailedException) {
                }
                return zy11.a;
            }
            gjo gjoVar2 = (gjo) obj;
            this.L$0 = fVar;
            this.L$1 = zuo0Var2;
            this.L$2 = slsVar2;
            this.L$3 = fVar2;
            this.L$4 = zuo0Var3;
            this.L$5 = slsVar;
            this.L$6 = gjoVar2;
            this.label = 2;
            if (f.Mg(fVar, this) != coroutineSingletons) {
                gjoVar = gjoVar2;
                fVar3 = fVar;
                zuo0Var = zuo0Var3;
                fVar = fVar2;
                slsVar3 = slsVar2;
                zuo0Var4 = zuo0Var2;
                it = gjoVar.b.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                if (obj2 == null) {
                }
                fVar3.Ug(zuo0Var4, new iar(gjoVar.c.a, z), slsVar3);
                return zy11.a;
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
