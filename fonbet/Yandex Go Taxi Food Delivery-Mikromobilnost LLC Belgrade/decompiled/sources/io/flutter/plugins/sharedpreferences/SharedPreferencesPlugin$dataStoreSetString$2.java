package io.flutter.plugins.sharedpreferences;

import defpackage.ez40;
import defpackage.kme0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lez40;", "preferences", "Lzy11;", "<anonymous>", "(Lez40;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$dataStoreSetString$2", f = "SharedPreferencesPlugin.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SharedPreferencesPlugin$dataStoreSetString$2 extends SuspendLambda implements wls {
    final /* synthetic */ kme0 $stringKey;
    final /* synthetic */ String $value;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesPlugin$dataStoreSetString$2(kme0 kme0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.$stringKey = kme0Var;
        this.$value = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SharedPreferencesPlugin$dataStoreSetString$2 sharedPreferencesPlugin$dataStoreSetString$2 = new SharedPreferencesPlugin$dataStoreSetString$2(this.$stringKey, this.$value, continuation);
        sharedPreferencesPlugin$dataStoreSetString$2.L$0 = obj;
        return sharedPreferencesPlugin$dataStoreSetString$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SharedPreferencesPlugin$dataStoreSetString$2 sharedPreferencesPlugin$dataStoreSetString$2 = (SharedPreferencesPlugin$dataStoreSetString$2) create((ez40) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        sharedPreferencesPlugin$dataStoreSetString$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ez40 ez40Var = (ez40) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ez40Var.g(this.$stringKey, this.$value);
        return zy11.a;
    }
}
