package ru.yandex.taxi.startup.launch;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.owx;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lowx;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.startup.launch.LaunchInteractor$request$2", f = "LaunchInteractor.kt", l = {32, 38, 41}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class LaunchInteractor$request$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $from;
    final /* synthetic */ String $id;
    final /* synthetic */ boolean $retryOnError;
    final /* synthetic */ String $token;
    Object L$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchInteractor$request$2(i iVar, String str, String str2, String str3, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$from = str;
        this.$id = str2;
        this.$token = str3;
        this.$retryOnError = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LaunchInteractor$request$2(this.this$0, this.$from, this.$id, this.$token, this.$retryOnError, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LaunchInteractor$request$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r14 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (defpackage.jl40.l(r12.$from, "AuthHelper") == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        r12.this$0.b.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ad, code lost:
    
        return new kotlin.Result(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (r13.e.emit(defpackage.exx.a(r0), r12) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
    
        if (defpackage.jl40.l(r12.$from, "AuthHelper") == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d A[Catch: all -> 0x0097, TRY_LEAVE, TryCatch #4 {all -> 0x0097, blocks: (B:24:0x0079, B:26:0x007d), top: B:23:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LaunchInteractor$request$2 launchInteractor$request$2;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            try {
            } catch (Throwable th2) {
                th = th2;
                launchInteractor$request$2 = this;
                try {
                    if (!(th instanceof CancellationException)) {
                        ru.yandex.taxi.startup.launch.response.e eVar = launchInteractor$request$2.this$0.d;
                        launchInteractor$request$2.L$0 = th;
                        launchInteractor$request$2.label = 3;
                        try {
                        } catch (Throwable th3) {
                            th = th3;
                            if (jl40.l(launchInteractor$request$2.$from, "AuthHelper")) {
                                throw th;
                            }
                            launchInteractor$request$2.this$0.b.i();
                            throw th;
                        }
                    }
                    obj = new Result.Failure(th);
                } catch (Throwable th4) {
                    th = th4;
                    if (jl40.l(launchInteractor$request$2.$from, "AuthHelper")) {
                    }
                }
            }
            if (i == 1) {
                kotlin.b.b(obj);
                launchInteractor$request$2 = this;
            } else if (i == 2) {
                kotlin.b.b(obj);
                launchInteractor$request$2 = this;
            } else {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = (Throwable) this.L$0;
                try {
                    kotlin.b.b(obj);
                    launchInteractor$request$2 = this;
                    obj = new Result.Failure(th);
                } catch (Throwable th5) {
                    th = th5;
                    launchInteractor$request$2 = this;
                    if (jl40.l(launchInteractor$request$2.$from, "AuthHelper")) {
                    }
                }
            }
        } else {
            kotlin.b.b(obj);
            try {
                l lVar = this.this$0.a;
                String str = this.$from;
                String str2 = this.$id;
                String str3 = this.$token;
                boolean z = this.$retryOnError;
                this.label = 1;
                launchInteractor$request$2 = this;
                try {
                    obj = lVar.b(str, str2, str3, z, launchInteractor$request$2);
                } catch (Throwable th6) {
                    th = th6;
                    if (!(th instanceof CancellationException)) {
                    }
                    obj = new Result.Failure(th);
                }
            } catch (Throwable th7) {
                th = th7;
                launchInteractor$request$2 = this;
                if (!(th instanceof CancellationException)) {
                }
                obj = new Result.Failure(th);
            }
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        ru.yandex.taxi.startup.launch.response.e eVar2 = launchInteractor$request$2.this$0.d;
        launchInteractor$request$2.L$0 = null;
        launchInteractor$request$2.label = 2;
        obj = eVar2.b((owx) obj, launchInteractor$request$2);
    }
}
