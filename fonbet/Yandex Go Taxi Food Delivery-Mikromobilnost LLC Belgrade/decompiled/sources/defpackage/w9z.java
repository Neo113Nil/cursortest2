package defpackage;

import android.content.Context;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.vendor.google.location.a;
import com.ybsdk.core.vendor.huawei.location.HuaweiLocationProvider;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class w9z implements ybz {
    public final ybz a = d();
    public final /* synthetic */ b b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ AppAnalyticsReporter d;

    public w9z(b bVar, Context context, AppAnalyticsReporter appAnalyticsReporter) {
        this.b = bVar;
        this.c = context;
        this.d = appAnalyticsReporter;
    }

    @Override // defpackage.ybz
    public final Object a(Continuation continuation) {
        ybz ybzVar = this.a;
        if (ybzVar != null) {
            return ybzVar.a(continuation);
        }
        return null;
    }

    @Override // defpackage.ybz
    public final Object b(Continuation continuation) {
        ybz ybzVar = this.a;
        if (ybzVar != null) {
            return ybzVar.b(continuation);
        }
        return null;
    }

    @Override // defpackage.ybz
    public final boolean c() {
        ybz ybzVar = this.a;
        if (ybzVar != null) {
            return ybzVar.c();
        }
        return false;
    }

    public final ybz d() {
        AppAnalyticsReporter appAnalyticsReporter = this.d;
        Context context = this.c;
        boolean isEnabled = ((CommonFeatureFlag) this.b.d(wlp.M0).getData()).isEnabled();
        try {
            a aVar = new a(context, appAnalyticsReporter, isEnabled);
            if (!aVar.e()) {
                aVar = null;
            }
            if (aVar != null) {
                return aVar;
            }
            return null;
        } catch (Throwable unused) {
            i5z0.a.g("Failed to init GoogleLocationProvider", new Object[0]);
            try {
                return (ybz) new HuaweiLocationProvider(context, isEnabled, appAnalyticsReporter).getIfApiAvailableOrNull();
            } catch (Throwable unused2) {
                i5z0.a.g("Failed to init HuaweiLocationProvider", new Object[0]);
                return null;
            }
        }
    }
}
