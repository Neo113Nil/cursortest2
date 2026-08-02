package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import io.appmetrica.analytics.AppMetricaYandex;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class wu0 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ Context k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wu0(Context context, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = context;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new wu0(this.k, continuation, 0);
            default:
                return new wu0(this.k, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((wu0) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        PackageInfo packageInfo;
        String str;
        int i = this.j;
        Context context = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                ou0.a.getClass();
                klx.Z(context);
                return Unit.a;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                try {
                    packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
                } catch (Exception unused) {
                    packageInfo = null;
                }
                if (packageInfo == null || (str = packageInfo.versionName) == null) {
                    str = "Unknown";
                }
                Pair pair = new Pair("app_version", str);
                String deviceId = AppMetricaYandex.getDeviceId(context);
                if (deviceId == null) {
                    deviceId = "Unknown";
                }
                Pair pair2 = new Pair("device_id", deviceId);
                String uuid = AppMetricaYandex.getUuid(context);
                return uah.e(pair, pair2, new Pair("uuid", uuid != null ? uuid : "Unknown"), new Pair("sdk", String.valueOf(Build.VERSION.SDK_INT)), new Pair("manufacturer", Build.MANUFACTURER), new Pair(CommonUrlParts.MODEL, Build.MODEL));
        }
    }
}
