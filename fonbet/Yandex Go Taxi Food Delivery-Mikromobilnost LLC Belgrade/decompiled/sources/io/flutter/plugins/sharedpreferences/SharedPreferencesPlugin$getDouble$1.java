package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import defpackage.kme0;
import defpackage.l7;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getDouble$1", f = "SharedPreferencesPlugin.kt", l = {188}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SharedPreferencesPlugin$getDouble$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $key;
    final /* synthetic */ Ref$ObjectRef<Double> $value;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesPlugin$getDouble$1(String str, g gVar, Ref$ObjectRef ref$ObjectRef, Continuation continuation) {
        super(2, continuation);
        this.$key = str;
        this.this$0 = gVar;
        this.$value = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SharedPreferencesPlugin$getDouble$1(this.$key, this.this$0, this.$value, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedPreferencesPlugin$getDouble$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef<Double> ref$ObjectRef;
        T t;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            kme0 kme0Var = new kme0(this.$key);
            Context context = this.this$0.a;
            if (context == null) {
                context = null;
            }
            l7 l7Var = new l7(21, tpr0.a(context).getData(), kme0Var, this.this$0);
            Ref$ObjectRef<Double> ref$ObjectRef2 = this.$value;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = ref$ObjectRef2;
            this.label = 1;
            Object A = kotlinx.coroutines.flow.e.A(l7Var, this);
            if (A == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$ObjectRef = ref$ObjectRef2;
            t = A;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$ObjectRef = (Ref$ObjectRef) this.L$2;
            kotlin.b.b(obj);
            t = obj;
        }
        ref$ObjectRef.element = t;
        return zy11.a;
    }
}
