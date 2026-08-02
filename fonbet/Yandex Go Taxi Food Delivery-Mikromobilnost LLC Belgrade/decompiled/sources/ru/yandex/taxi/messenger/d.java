package ru.yandex.taxi.messenger;

import com.yandex.messenger.websdk.api.Notification;
import defpackage.evu0;
import defpackage.ew2;
import defpackage.gw00;
import defpackage.ny61;
import defpackage.o6v;
import defpackage.vh60;
import defpackage.vpr;
import defpackage.yb20;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes9.dex */
public final class d implements vpr {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MessengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$safeCollectIn$2$2$1 messengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$safeCollectIn$2$2$1;
        int i;
        yb20 yb20Var;
        String str;
        String str2;
        if (continuation instanceof MessengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$safeCollectIn$2$2$1) {
            messengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$safeCollectIn$2$2$1 = (MessengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$safeCollectIn$2$2$1) continuation;
            int i2 = messengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$safeCollectIn$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                messengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$safeCollectIn$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = messengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$safeCollectIn$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = messengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$safeCollectIn$2$2$1.label;
                e eVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = (Pair) obj;
                    boolean booleanValue = ((Boolean) pair.getFirst()).booleanValue();
                    yb20Var = (yb20) pair.getSecond();
                    messengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$safeCollectIn$2$2$1.L$0 = null;
                    messengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$safeCollectIn$2$2$1.L$1 = null;
                    messengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$safeCollectIn$2$2$1.L$2 = yb20Var;
                    messengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$safeCollectIn$2$2$1.Z$0 = booleanValue;
                    messengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$safeCollectIn$2$2$1.label = 1;
                    if (e.d(eVar, booleanValue, messengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$safeCollectIn$2$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yb20Var = (yb20) messengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$safeCollectIn$2$2$1.L$2;
                    kotlin.b.b(obj2);
                }
                Notification notification = (Notification) eVar.a.b.getValue();
                str = yb20Var.b;
                if (str == null) {
                    str = "";
                }
                vh60 vh60Var = (vh60) notification;
                ew2 ew2Var = vh60Var.d;
                o6v o6vVar = vh60Var.c;
                str2 = o6vVar.c;
                if (!str.equals(str2)) {
                    if (evu0.J(str)) {
                        ew2Var.c("wm_push_set_device_id_error", gw00.e(new Pair(CRLReasonCodeExtension.REASON, "empty new deviceId")));
                    } else {
                        if (str2 != null) {
                            ew2Var.c("wm_push_set_device_id_error", gw00.e(new Pair(CRLReasonCodeExtension.REASON, "current device id not equal with new one")));
                        }
                        o6vVar.c = str;
                        o6vVar.a.edit().putString("DEVICE_ID_KEY", str).apply();
                    }
                }
                return zy11.a;
            }
        }
        messengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$safeCollectIn$2$2$1 = new MessengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$safeCollectIn$2$2$1(this, continuation);
        Object obj22 = messengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$safeCollectIn$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = messengerWebSdkParamsSupplier$onFirstContentfulPaint$1$1$invokeSuspend$$inlined$safeCollectIn$2$2$1.label;
        e eVar2 = this.a;
        if (i != 0) {
        }
        Notification notification2 = (Notification) eVar2.a.b.getValue();
        str = yb20Var.b;
        if (str == null) {
        }
        vh60 vh60Var2 = (vh60) notification2;
        ew2 ew2Var2 = vh60Var2.d;
        o6v o6vVar2 = vh60Var2.c;
        str2 = o6vVar2.c;
        if (!str.equals(str2)) {
        }
        return zy11.a;
    }
}
