package ru.yandex.taxi.messenger;

import androidx.lifecycle.Lifecycle;
import com.yandex.messenger.websdk.api.WebMessenger;
import defpackage.g5g0;
import defpackage.g8e;
import defpackage.i120;
import defpackage.jm3;
import defpackage.jy60;
import defpackage.kb20;
import defpackage.lx4;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.k;

/* loaded from: classes9.dex */
public final class e implements jy60 {
    public final WebMessenger a;
    public final MessengerWebSdkParamsSupplier$MessengerType b;
    public final tse c;
    public final Lifecycle d;
    public final lx4 e;
    public final kb20 f;
    public final g5g0 g;
    public final ru.yandex.taxi.am.token.a h;
    public final k i;
    public final i120 j;

    public e(WebMessenger webMessenger, MessengerWebSdkParamsSupplier$MessengerType messengerWebSdkParamsSupplier$MessengerType, tse tseVar, Lifecycle lifecycle, lx4 lx4Var, kb20 kb20Var, g5g0 g5g0Var, ru.yandex.taxi.am.token.a aVar, k kVar, i120 i120Var) {
        this.a = webMessenger;
        this.b = messengerWebSdkParamsSupplier$MessengerType;
        this.c = tseVar;
        this.d = lifecycle;
        this.e = lx4Var;
        this.f = kb20Var;
        this.g = g5g0Var;
        this.h = aVar;
        this.i = kVar;
        this.j = i120Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(e eVar, boolean z, ContinuationImpl continuationImpl) {
        MessengerWebSdkParamsSupplier$updateAuthorization$1 messengerWebSdkParamsSupplier$updateAuthorization$1;
        int i;
        Object d;
        String str;
        WebMessenger webMessenger = eVar.a;
        if (continuationImpl instanceof MessengerWebSdkParamsSupplier$updateAuthorization$1) {
            messengerWebSdkParamsSupplier$updateAuthorization$1 = (MessengerWebSdkParamsSupplier$updateAuthorization$1) continuationImpl;
            int i2 = messengerWebSdkParamsSupplier$updateAuthorization$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                messengerWebSdkParamsSupplier$updateAuthorization$1.label = i2 - Integer.MIN_VALUE;
                Object obj = messengerWebSdkParamsSupplier$updateAuthorization$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = messengerWebSdkParamsSupplier$updateAuthorization$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!z) {
                        ((jm3) webMessenger.a()).b();
                        return zy11.a;
                    }
                    ru.yandex.taxi.am.token.a aVar = eVar.h;
                    messengerWebSdkParamsSupplier$updateAuthorization$1.Z$0 = z;
                    messengerWebSdkParamsSupplier$updateAuthorization$1.label = 1;
                    d = aVar.d(false, messengerWebSdkParamsSupplier$updateAuthorization$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                }
                str = (String) (d instanceof Result.Failure ? null : d);
                if (str == null) {
                    ((jm3) webMessenger.a()).c(str);
                } else {
                    ((jm3) webMessenger.a()).b();
                }
                return zy11.a;
            }
        }
        messengerWebSdkParamsSupplier$updateAuthorization$1 = new MessengerWebSdkParamsSupplier$updateAuthorization$1(eVar, continuationImpl);
        Object obj2 = messengerWebSdkParamsSupplier$updateAuthorization$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = messengerWebSdkParamsSupplier$updateAuthorization$1.label;
        if (i != 0) {
        }
        str = (String) (d instanceof Result.Failure ? null : d);
        if (str == null) {
        }
        return zy11.a;
    }

    @Override // defpackage.s150
    public final String getName() {
        return g8e.o("MessengerWebSdkParamsSupplier", this.b.name());
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.c, null, null, new MessengerWebSdkParamsSupplier$onFirstContentfulPaint$1(null, this), 3);
    }
}
