package F0;

import N.i;
import Q1.A;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.yandex.varioqub.config.OnFetchCompleteListener;
import com.yandex.varioqub.config.impl.B;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.billing.impl.j;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.idsync.impl.n;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import io.appmetrica.analytics.impl.C0329cd;
import io.appmetrica.analytics.impl.C0461hg;
import io.appmetrica.analytics.impl.C0486ig;
import io.appmetrica.analytics.impl.Db;
import io.appmetrica.analytics.impl.InterfaceC0745sg;
import io.appmetrica.analytics.impl.L0;
import io.appmetrica.analytics.impl.V;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.ArrayList;
import java.util.Random;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f582a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f583b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f584c;

    public /* synthetic */ c(int i2, Object obj, Object obj2) {
        this.f582a = i2;
        this.f583b = obj;
        this.f584c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f582a) {
            case 0:
                B.a((B) this.f583b, (OnFetchCompleteListener) this.f584c);
                break;
            case 1:
                j.a((j) this.f583b, (ProductInfo) this.f584c);
                break;
            case 2:
                n.a((n) this.f583b, (RequestConfig) this.f584c);
                break;
            case 3:
                ((ProfileInstallerInitializer) this.f583b).getClass();
                (Build.VERSION.SDK_INT >= 28 ? i.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new N.f((Context) this.f584c, 0), new Random().nextInt(Math.max(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 1)) + 5000);
                break;
            case 4:
                Db.a((Db) this.f583b, (V) this.f584c);
                break;
            case 5:
                L0.a((L0) this.f583b, (PluginErrorDetails) this.f584c);
                break;
            case 6:
                C0329cd.a((C0329cd) this.f583b, (ArrayList) this.f584c);
                break;
            case 7:
                C0461hg.a((C0486ig) this.f583b, (InterfaceC0745sg) this.f584c);
                break;
            case 8:
                C0486ig.b((InterfaceC0745sg) this.f583b, (Throwable) this.f584c);
                break;
            default:
                ((A) this.f583b).b((Typeface) this.f584c);
                break;
        }
    }
}
