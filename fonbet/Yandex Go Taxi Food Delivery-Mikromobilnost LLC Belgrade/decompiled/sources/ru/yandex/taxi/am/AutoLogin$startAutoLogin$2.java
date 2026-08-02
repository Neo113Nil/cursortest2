package ru.yandex.taxi.am;

import defpackage.g6u;
import defpackage.jst;
import defpackage.kj;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.AutoLogin$startAutoLogin$2", f = "AutoLogin.kt", l = {HProv.PP_ENUM_LOG, 139, 142, 143, 151}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AutoLogin$startAutoLogin$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ r this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.am.AutoLogin$startAutoLogin$2$1", f = "AutoLogin.kt", l = {HProv.PP_CONTAINER_STATUS, 147}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.am.AutoLogin$startAutoLogin$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ List<kj> $accounts;
        int label;
        final /* synthetic */ r this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List list, r rVar, Continuation continuation) {
            super(2, continuation);
            this.$accounts = list;
            this.this$0 = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$accounts, this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
        
            if (r5 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        
            if (r5 == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                int size = this.$accounts.size();
                r rVar = this.this$0;
                if (size != 0) {
                    if (size != 1) {
                        this.label = 2;
                        obj = r.c(rVar, this);
                    } else {
                        this.label = 1;
                        obj = r.a(rVar, this);
                    }
                    return coroutineSingletons;
                }
                rVar.g();
            } else if (i == 1) {
                kotlin.b.b(obj);
            } else {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoLogin$startAutoLogin$2(r rVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoLogin$startAutoLogin$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoLogin$startAutoLogin$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        if (defpackage.tje.k0(r1, r5, r8) != r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        if (r9.f(r8) == r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0047, code lost:
    
        if (r9 == r0) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Exception exc;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Exception e) {
            r rVar = this.this$0;
            this.L$0 = e;
            this.label = 5;
            if (rVar.f(this) != coroutineSingletons) {
                exc = e;
            }
        }
        if (i == 0) {
            kotlin.b.b(obj);
            r rVar2 = this.this$0;
            this.label = 1;
            obj = rVar2.e(this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                } else if (i == 3) {
                    kotlin.b.b(obj);
                    this.this$0.k.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1((List) obj, this.this$0, null);
                    this.L$0 = null;
                    this.label = 4;
                } else if (i == 4) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    exc = (Exception) this.L$0;
                    kotlin.b.b(obj);
                    jst.e.k(exc, "Error while get accounts for autologin");
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        r rVar3 = this.this$0;
        if (booleanValue) {
            ru.yandex.taxi.am.internal.d dVar = rVar3.i;
            this.label = 3;
            obj = dVar.h(this);
            if (obj == coroutineSingletons) {
            }
            this.this$0.k.getClass();
            sjh sjhVar2 = uyj.a;
            g6u g6uVar2 = o400.a;
            AnonymousClass1 anonymousClass12 = new AnonymousClass1((List) obj, this.this$0, null);
            this.L$0 = null;
            this.label = 4;
        } else {
            rVar3.s = false;
            r rVar4 = this.this$0;
            this.label = 2;
        }
        return coroutineSingletons;
    }
}
