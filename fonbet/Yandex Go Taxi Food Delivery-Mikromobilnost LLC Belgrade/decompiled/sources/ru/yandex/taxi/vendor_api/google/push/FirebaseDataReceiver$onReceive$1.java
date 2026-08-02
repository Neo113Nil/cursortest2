package ru.yandex.taxi.vendor_api.google.push;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import defpackage.hst;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8x;
import defpackage.tse;
import defpackage.w631;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.vendor_api.google.push.FirebaseDataReceiver$onReceive$1", f = "FirebaseDataReceiver.kt", l = {46}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class FirebaseDataReceiver$onReceive$1 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    final /* synthetic */ Intent $intent;
    final /* synthetic */ BroadcastReceiver.PendingResult $pendingResult;
    int label;
    final /* synthetic */ FirebaseDataReceiver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseDataReceiver$onReceive$1(Intent intent, Context context, FirebaseDataReceiver firebaseDataReceiver, BroadcastReceiver.PendingResult pendingResult, Continuation continuation) {
        super(2, continuation);
        this.$intent = intent;
        this.$context = context;
        this.this$0 = firebaseDataReceiver;
        this.$pendingResult = pendingResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FirebaseDataReceiver$onReceive$1(this.$intent, this.$context, this.this$0, this.$pendingResult, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FirebaseDataReceiver$onReceive$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    b.b(obj);
                    s8x s8xVar = w631.a;
                    this.label = 1;
                    if (w631.a.u0(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                this.$intent.setComponent(new ComponentName(this.$context, (Class<?>) FirebaseInstanceIdReceiver.class));
                if (this.this$0.isOrderedBroadcast()) {
                    jst.e.getClass();
                    this.$context.sendOrderedBroadcast(this.$intent, null);
                } else {
                    jst.e.getClass();
                    this.$context.sendBroadcast(this.$intent);
                }
            } catch (Exception e) {
                hst hstVar = jst.e;
                String message = e.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                xby.l(hstVar, "FCM.broadcast_forward_failed", null, null, message, 6);
            }
            this.$pendingResult.finish();
            return zy11.a;
        } catch (Throwable th) {
            this.$pendingResult.finish();
            throw th;
        }
    }
}
