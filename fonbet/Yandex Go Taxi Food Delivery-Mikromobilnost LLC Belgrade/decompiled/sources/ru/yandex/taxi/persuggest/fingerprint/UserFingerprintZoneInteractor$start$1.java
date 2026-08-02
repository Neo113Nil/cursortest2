package ru.yandex.taxi.persuggest.fingerprint;

import defpackage.g721;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.nlt;
import defpackage.nm21;
import defpackage.ny61;
import defpackage.olt;
import defpackage.qm21;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.experiments.u;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.persuggest.fingerprint.UserFingerprintZoneInteractor$start$1", f = "UserFingerprintZoneInteractor.kt", l = {34, 35, 36, 47}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class UserFingerprintZoneInteractor$start$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lqm21;", "experiment", "Lnlt;", "gnssParams", "Lkotlin/Pair;", "", "<anonymous>", "(Lqm21;Lnlt;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.persuggest.fingerprint.UserFingerprintZoneInteractor$start$1$1", f = "UserFingerprintZoneInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.persuggest.fingerprint.UserFingerprintZoneInteractor$start$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (Continuation) obj3);
            anonymousClass1.L$0 = (qm21) obj;
            anonymousClass1.L$1 = (nlt) obj2;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            qm21 qm21Var = (qm21) this.L$0;
            nlt nltVar = (nlt) this.L$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            qm21.Companion.getClass();
            return new Pair(Boolean.valueOf(!jl40.l(qm21Var, qm21.d) && qm21Var.b), Boolean.valueOf(nltVar.getB()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserFingerprintZoneInteractor$start$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserFingerprintZoneInteractor$start$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserFingerprintZoneInteractor$start$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a7, code lost:
    
        if (r4.collect(r8, r7) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a9, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (ru.yandex.taxi.persuggest.fingerprint.c.a(r7, r3, r1, r8) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r8 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r8 == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        nm21 nm21Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            u uVar = this.this$0.a;
            this.label = 1;
            obj = uVar.a(this);
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else if (i == 2) {
            nm21Var = (nm21) this.L$0;
            kotlin.b.b(obj);
            c cVar = this.this$0;
            boolean z = nm21Var.a;
            boolean z2 = ((nlt) obj).b;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        } else {
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
            m0 m0Var = new m0(this.this$0.a.a.a(), this.this$0.b.a.a(), new AnonymousClass1(3, null));
            g721 g721Var = new g721(7, this.this$0);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 4;
        }
        nm21Var = (nm21) obj;
        olt oltVar = this.this$0.b;
        this.L$0 = nm21Var;
        this.label = 2;
        obj = oltVar.a.b(this);
    }
}
