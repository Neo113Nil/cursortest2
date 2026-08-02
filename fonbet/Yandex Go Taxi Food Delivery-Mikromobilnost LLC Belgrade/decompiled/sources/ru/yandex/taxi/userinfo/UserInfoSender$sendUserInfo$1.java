package ru.yandex.taxi.userinfo;

import defpackage.ceu0;
import defpackage.cmt;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.un21;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.userinfo.UserInfoSender$sendUserInfo$1", f = "UserInfoSender.kt", l = {52, 53}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class UserInfoSender$sendUserInfo$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $launchId;
    final /* synthetic */ String $taxiDeviceId;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInfoSender$sendUserInfo$1(a aVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$launchId = str;
        this.$taxiDeviceId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserInfoSender$sendUserInfo$1(this.this$0, this.$launchId, this.$taxiDeviceId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserInfoSender$sendUserInfo$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
    
        if (ru.yandex.taxi.network.api.a.a(r7, r1, r6) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Can't send user info: completely failed");
        }
        if (i == 0) {
            b.b(obj);
            aVar = this.this$0;
            String str = this.$launchId;
            String str2 = this.$taxiDeviceId;
            this.L$0 = aVar;
            this.label = 1;
            obj = a.a(aVar, str, str2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11.a;
            }
            aVar = (a) this.L$0;
            b.b(obj);
        }
        Pair pair = (Pair) obj;
        cmt<zy11> a = aVar.g.a((String) pair.f(), (un21) pair.c());
        ceu0 ceu0Var = new ceu0(19);
        this.L$0 = null;
        this.label = 2;
    }
}
