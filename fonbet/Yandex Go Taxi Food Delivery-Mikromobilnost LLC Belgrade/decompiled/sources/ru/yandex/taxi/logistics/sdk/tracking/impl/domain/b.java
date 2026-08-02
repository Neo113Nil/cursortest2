package ru.yandex.taxi.logistics.sdk.tracking.impl.domain;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import defpackage.fza0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.qej;
import defpackage.rzh0;
import defpackage.uzh0;
import defpackage.vej;
import defpackage.w511;
import defpackage.wej;
import defpackage.xej;
import defpackage.yej;
import defpackage.zej;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes5.dex */
public final class b {
    public final Context a;
    public final com.yandex.delivery.utils.dialogmanager.impl.b b;
    public final fza0 c;

    public b(Context context, com.yandex.delivery.utils.dialogmanager.impl.b bVar, fza0 fza0Var) {
        this.a = context;
        this.b = bVar;
        this.c = fza0Var;
    }

    public final void a(String str) {
        Intent intent = new Intent("android.intent.action.CALL", Uri.parse("tel:".concat(str)));
        Context context = this.a;
        if (!(context instanceof Activity)) {
            intent.setFlags(SelfTester_JCP.IMITA);
        }
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
            Log.e("ExternalRouter", "Failed to start activity for uri " + intent.getDataString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        DefaultCallInteractor$showPermissionDeniedForeverDialog$1 defaultCallInteractor$showPermissionDeniedForeverDialog$1;
        int i;
        zej zejVar;
        if (continuationImpl instanceof DefaultCallInteractor$showPermissionDeniedForeverDialog$1) {
            defaultCallInteractor$showPermissionDeniedForeverDialog$1 = (DefaultCallInteractor$showPermissionDeniedForeverDialog$1) continuationImpl;
            int i2 = defaultCallInteractor$showPermissionDeniedForeverDialog$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultCallInteractor$showPermissionDeniedForeverDialog$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultCallInteractor$showPermissionDeniedForeverDialog$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultCallInteractor$showPermissionDeniedForeverDialog$1.label;
                Context context = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    qej qejVar = new qej(null, context.getString(uzh0.delivery_phone_calls_permission_dialog_title), context.getString(rzh0.delivery_settings_button), context.getString(rzh0.logistics_cancel_button), null, false, null, null, 241);
                    defaultCallInteractor$showPermissionDeniedForeverDialog$1.L$0 = null;
                    defaultCallInteractor$showPermissionDeniedForeverDialog$1.label = 1;
                    obj = this.b.a(qejVar, defaultCallInteractor$showPermissionDeniedForeverDialog$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                zejVar = (zej) obj;
                if (!jl40.l(zejVar, yej.a)) {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", context.getPackageName(), null));
                    if (intent.resolveActivity(context.getPackageManager()) != null) {
                        try {
                            context.startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
                            intent.toString();
                        }
                    }
                } else if (!jl40.l(zejVar, vej.a) && !jl40.l(zejVar, wej.a) && !jl40.l(zejVar, xej.a)) {
                    w511.b();
                    return null;
                }
                return zy11.a;
            }
        }
        defaultCallInteractor$showPermissionDeniedForeverDialog$1 = new DefaultCallInteractor$showPermissionDeniedForeverDialog$1(this, continuationImpl);
        Object obj2 = defaultCallInteractor$showPermissionDeniedForeverDialog$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultCallInteractor$showPermissionDeniedForeverDialog$1.label;
        Context context2 = this.a;
        if (i != 0) {
        }
        zejVar = (zej) obj2;
        if (!jl40.l(zejVar, yej.a)) {
        }
        return zy11.a;
    }
}
