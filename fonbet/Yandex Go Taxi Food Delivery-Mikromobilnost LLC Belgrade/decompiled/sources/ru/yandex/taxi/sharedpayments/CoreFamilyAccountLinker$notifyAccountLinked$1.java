package ru.yandex.taxi.sharedpayments;

import com.yandex.go.account.api.family.SharedPaymentContext;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vnr0;
import defpackage.wls;
import defpackage.y9p;
import defpackage.zy11;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.Key.foreign.JCSP3DesKeyGenerator;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.sharedpayments.CoreFamilyAccountLinker$notifyAccountLinked$1", f = "CoreFamilyAccountLinker.kt", l = {JCSP3DesKeyGenerator.KEY_LEN_3DES_SUN}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class CoreFamilyAccountLinker$notifyAccountLinked$1 extends SuspendLambda implements wls {
    final /* synthetic */ SharedPaymentContext $context;
    final /* synthetic */ String $familyAccountId;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreFamilyAccountLinker$notifyAccountLinked$1(c cVar, String str, SharedPaymentContext sharedPaymentContext, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$familyAccountId = str;
        this.$context = sharedPaymentContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoreFamilyAccountLinker$notifyAccountLinked$1(this.this$0, this.$familyAccountId, this.$context, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CoreFamilyAccountLinker$notifyAccountLinked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[Catch: all -> 0x0089, TryCatch #4 {all -> 0x0089, blocks: (B:32:0x008b, B:17:0x0060, B:19:0x0074, B:20:0x0079), top: B:2:0x0005 }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons, ru.yandex.taxi.sharedpayments.c] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        SharedPaymentContext sharedPaymentContext;
        c cVar2;
        c cVar3;
        SharedPaymentContext sharedPaymentContext2;
        String value;
        ?? r0 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar4 = this.this$0;
                String str = this.$familyAccountId;
                SharedPaymentContext sharedPaymentContext3 = this.$context;
                try {
                    com.yandex.go.payments.shared.c cVar5 = cVar4.z;
                    this.L$0 = cVar4;
                    this.L$1 = sharedPaymentContext3;
                    this.L$2 = cVar4;
                    this.L$3 = sharedPaymentContext3;
                    this.L$4 = cVar4;
                    this.label = 1;
                    if (cVar5.a(str, this) == r0) {
                        return r0;
                    }
                    cVar3 = cVar4;
                    cVar = cVar3;
                    sharedPaymentContext = sharedPaymentContext3;
                    sharedPaymentContext2 = sharedPaymentContext;
                    cVar2 = cVar;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable unused) {
                    cVar = cVar4;
                    sharedPaymentContext = sharedPaymentContext3;
                    cVar2 = cVar;
                    y9p y9pVar = ((vnr0) cVar2.B).l;
                    value = sharedPaymentContext.getValue();
                    y9pVar.getClass();
                    HashMap hashMap = new HashMap();
                    if (value != null) {
                    }
                    y9pVar.a.a("FamilyAccount.ForceZalogin.Request.Failed", hashMap, 1, new HashMap());
                    c.a(cVar);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cVar = (c) this.L$4;
                sharedPaymentContext = (SharedPaymentContext) this.L$3;
                cVar2 = (c) this.L$2;
                sharedPaymentContext2 = (SharedPaymentContext) this.L$1;
                cVar3 = (c) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable unused2) {
                    y9p y9pVar2 = ((vnr0) cVar2.B).l;
                    value = sharedPaymentContext.getValue();
                    y9pVar2.getClass();
                    HashMap hashMap2 = new HashMap();
                    if (value != null) {
                        hashMap2.put("context", value);
                    }
                    y9pVar2.a.a("FamilyAccount.ForceZalogin.Request.Failed", hashMap2, 1, new HashMap());
                    c.a(cVar);
                    return zy11.a;
                }
            }
            ((vnr0) cVar3.B).x(sharedPaymentContext2);
            c.a(cVar);
            return zy11.a;
        } catch (Throwable th) {
            c.a(r0);
            throw th;
        }
    }
}
