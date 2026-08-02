package ru.yandex.taxi.styling;

import android.os.Looper;
import defpackage.e430;
import defpackage.i2t0;
import defpackage.mvg;
import defpackage.mz40;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.q2t0;
import defpackage.sy2;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le430;", "it", "Lzy11;", "<anonymous>", "(Le430;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.styling.StyleScreenRepositoryImpl$modeStyleFlow$2", f = "StyleScreenRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class StyleScreenRepositoryImpl$modeStyleFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyleScreenRepositoryImpl$modeStyleFlow$2(g gVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StyleScreenRepositoryImpl$modeStyleFlow$2 styleScreenRepositoryImpl$modeStyleFlow$2 = new StyleScreenRepositoryImpl$modeStyleFlow$2(this.this$0, continuation);
        styleScreenRepositoryImpl$modeStyleFlow$2.L$0 = obj;
        return styleScreenRepositoryImpl$modeStyleFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        StyleScreenRepositoryImpl$modeStyleFlow$2 styleScreenRepositoryImpl$modeStyleFlow$2 = (StyleScreenRepositoryImpl$modeStyleFlow$2) create((e430) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        styleScreenRepositoryImpl$modeStyleFlow$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mz40 C;
        e430 e430Var = (e430) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.f.l(e430Var);
        String str = e430Var.c;
        oz40 oz40Var = sy2.e;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            oz40Var.setValue(str);
        } else {
            i2t0 j = q2t0.j();
            mz40 mz40Var = j instanceof mz40 ? (mz40) j : null;
            if (mz40Var == null || (C = mz40Var.C(null, null)) == null) {
                ny61.r("Cannot create a mutable snapshot of an read-only snapshot");
                return null;
            }
            try {
                i2t0 j2 = C.j();
                try {
                    oz40Var.setValue(str);
                    C.w().g();
                } finally {
                    i2t0.q(j2);
                }
            } finally {
            }
        }
        return zy11.a;
    }
}
