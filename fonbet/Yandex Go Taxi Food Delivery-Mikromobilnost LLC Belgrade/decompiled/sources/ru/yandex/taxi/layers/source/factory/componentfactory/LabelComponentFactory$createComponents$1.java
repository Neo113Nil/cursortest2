package ru.yandex.taxi.layers.source.factory.componentfactory;

import defpackage.an00;
import defpackage.f0k;
import defpackage.fkp;
import defpackage.hqx;
import defpackage.jmp;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vm00;
import defpackage.vpr;
import defpackage.wls;
import defpackage.ym00;
import defpackage.zlp;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lym00;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.source.factory.componentfactory.LabelComponentFactory$createComponents$1", f = "LabelComponentFactory.kt", l = {64, 65}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class LabelComponentFactory$createComponents$1 extends SuspendLambda implements wls {
    final /* synthetic */ an00 $context;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelComponentFactory$createComponents$1(x xVar, an00 an00Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = xVar;
        this.$context = an00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LabelComponentFactory$createComponents$1 labelComponentFactory$createComponents$1 = new LabelComponentFactory$createComponents$1(this.this$0, this.$context, continuation);
        labelComponentFactory$createComponents$1.L$0 = obj;
        return labelComponentFactory$createComponents$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LabelComponentFactory$createComponents$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009f, code lost:
    
        if (r0.emit(r15, r14) == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a1, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
    
        if (r15 != r1) goto L47;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        hqx hqxVar;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            x xVar = this.this$0;
            an00 an00Var = this.$context;
            fkp fkpVar = an00Var.a;
            vm00 vm00Var = an00Var.b;
            this.L$0 = vprVar;
            this.label = 1;
            xVar.getClass();
            jmp jmpVar = fkpVar.b;
            if (jmpVar != null && (hqxVar = jmpVar.a) != null) {
                String str = hqxVar.a;
                hqx hqxVar2 = (str == null || str.length() == 0 || hqxVar.b == null) ? null : hqxVar;
                if (hqxVar2 != null) {
                    zlp zlpVar = fkpVar.c;
                    zzs zzsVar = zlpVar != null ? zlpVar.a : null;
                    if (zzsVar == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    String str2 = fkpVar.a;
                    if (str2 == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    f0k f0kVar = fkpVar.b.j;
                    if (f0kVar == null) {
                        ny61.g("Required value was null.");
                        return null;
                    }
                    xVar.b.getClass();
                    obj = tje.k0(uyj.a, new LabelComponentFactory$prepareLabel$2(zzsVar, hqxVar2, xVar, f0kVar, str2, vm00Var, null), this);
                    if (obj != coroutineSingletons) {
                        obj = (ym00) obj;
                    }
                }
            }
            obj = null;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        ym00 ym00Var = (ym00) obj;
        if (ym00Var != null) {
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
        }
        return zy11.a;
    }
}
