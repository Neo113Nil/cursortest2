package ru.yandex.taxi.layers.source.factory.componentfactory;

import defpackage.an00;
import defpackage.fkp;
import defpackage.hxu0;
import defpackage.jmp;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vm00;
import defpackage.vpr;
import defpackage.wls;
import defpackage.ym00;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lym00;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.source.factory.componentfactory.BodyComponentFactory$createComponents$1", f = "BodyComponentFactory.kt", l = {64, 65}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BodyComponentFactory$createComponents$1 extends SuspendLambda implements wls {
    final /* synthetic */ an00 $context;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BodyComponentFactory$createComponents$1(an00 an00Var, m mVar, Continuation continuation) {
        super(2, continuation);
        this.$context = an00Var;
        this.this$0 = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BodyComponentFactory$createComponents$1 bodyComponentFactory$createComponents$1 = new BodyComponentFactory$createComponents$1(this.$context, this.this$0, continuation);
        bodyComponentFactory$createComponents$1.L$0 = obj;
        return bodyComponentFactory$createComponents$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BodyComponentFactory$createComponents$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0050, code lost:
    
        if ((r7 != null ? r7.d : null) != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        if (r10 == r1) goto L34;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            an00 an00Var = this.$context;
            fkp fkpVar = an00Var.a;
            jmp jmpVar = fkpVar.b;
            if ((jmpVar != null ? jmpVar.b : null) != null) {
                hxu0 hxu0Var = jmpVar.b.b;
                if ((hxu0Var != null ? hxu0Var.a : null) == null) {
                    if ((hxu0Var != null ? hxu0Var.c : null) == null) {
                    }
                }
                m mVar = this.this$0;
                vm00 vm00Var = an00Var.b;
                this.L$0 = vprVar;
                this.label = 1;
                mVar.b.getClass();
                obj = tje.k0(uyj.a, new BodyComponentFactory$createMapObjectComponent$2(mVar, fkpVar, vm00Var, null), this);
            }
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        kotlin.b.b(obj);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        return vprVar.emit((ym00) obj, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
