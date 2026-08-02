package ru.yandex.taxi.new_history;

import defpackage.dl1;
import defpackage.evu0;
import defpackage.gym;
import defpackage.k7w0;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.t1b0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Optional;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.new_history.NewHistoryRouterImpl$onLaunch$1", f = "NewHistoryRouterImpl.kt", l = {59, 60}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class NewHistoryRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    final /* synthetic */ Optional<String> $payload;
    Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewHistoryRouterImpl$onLaunch$1(a aVar, Optional optional, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$payload = optional;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NewHistoryRouterImpl$onLaunch$1(this.this$0, this.$payload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NewHistoryRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0033, code lost:
    
        if (r14 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        boolean z;
        String str;
        zy11 zy11Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            gym gymVar = this.this$0.H;
            this.label = 1;
            obj = ((t1b0) gymVar.a).b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z2 = this.Z$0;
                aVar = (a) this.L$0;
                b.b(obj);
                z = z2;
                aVar.I = (String) obj;
                str = this.this$0.I;
                zy11Var = zy11.a;
                if (str != null || evu0.J(str)) {
                    this.this$0.r(new qu(9));
                    return zy11Var;
                }
                int i2 = z ? 7 : 3;
                a aVar2 = this.this$0;
                m950 m950Var = (m950) aVar2.E.get();
                a aVar3 = this.this$0;
                String str2 = aVar3.I;
                if (str2 == null) {
                    str2 = "";
                }
                aVar2.A(m950Var, new k7w0(str2, true, false, aVar3.K, null, null, i2, z, aVar3.L, 1047664), new dl1(24, this.this$0));
                a aVar4 = this.this$0;
                aVar4.F.a.add(aVar4.J);
                return zy11Var;
            }
            b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        aVar = this.this$0;
        Optional<String> optional = this.$payload;
        this.L$0 = aVar;
        this.Z$0 = booleanValue;
        this.label = 2;
        Object P = a.P(aVar, optional, booleanValue, this);
        if (P != coroutineSingletons) {
            z = booleanValue;
            obj = P;
            aVar.I = (String) obj;
            str = this.this$0.I;
            zy11Var = zy11.a;
            if (str != null) {
            }
            this.this$0.r(new qu(9));
            return zy11Var;
        }
        return coroutineSingletons;
    }
}
