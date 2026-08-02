package yads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService;
import com.monetization.ads.core.identifiers.ad.huawei.a;
import defpackage.cu71;
import defpackage.gi81;
import defpackage.lt71;
import defpackage.mx71;
import defpackage.s421;
import defpackage.vc71;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.TimeUnit;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class rc extends SuspendLambda implements wls {
    public final /* synthetic */ gi81 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(gi81 gi81Var, Continuation continuation) {
        super(2, continuation);
        this.b = gi81Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new rc(this.b, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new rc(this.b, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ResolveInfo resolveInfo;
        vc71 vc71Var;
        OpenDeviceIdentifierService openDeviceIdentifierService;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        b.b(obj);
        s421 s421Var = this.b.c;
        ((mx71) s421Var.w).getClass();
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        lt71 lt71Var = (lt71) s421Var.b;
        Context context = (Context) s421Var.x;
        lt71Var.getClass();
        try {
            resolveInfo = context.getPackageManager().resolveService(intent, 0);
        } catch (Throwable unused) {
            resolveInfo = null;
        }
        if (resolveInfo == null) {
            return null;
        }
        try {
            a aVar = new a();
            if (!context.bindService(intent, aVar, 1)) {
                return null;
            }
            ((cu71) s421Var.c).getClass();
            try {
                openDeviceIdentifierService = (OpenDeviceIdentifierService) aVar.a.poll(5L, TimeUnit.SECONDS);
            } catch (Exception unused2) {
            }
            if (openDeviceIdentifierService != null) {
                String oaid = openDeviceIdentifierService.getOaid();
                boolean oaidTrackLimited = openDeviceIdentifierService.getOaidTrackLimited();
                if (oaid != null) {
                    vc71Var = new vc71(oaid, oaidTrackLimited);
                    context.unbindService(aVar);
                    return vc71Var;
                }
            }
            vc71Var = null;
            context.unbindService(aVar);
            return vc71Var;
        } catch (Throwable unused3) {
            return null;
        }
    }
}
