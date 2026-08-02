package D0;

import E2.M;
import O.A0;
import O.InterfaceC0350u;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.IceFishing.LiveIceFishing.DetailsActivity;
import com.IceFishing.LiveIceFishing.IntroActivity;
import com.IceFishing.LiveIceFishing.MainActivity;
import com.IceFishing.LiveIceFishing.SplashActivity;
import com.IceFishing.LiveIceFishing.StartActivity;
import com.IceFishing.LiveIceFishing.adscode.ApplinkActivity;
import com.anythink.core.common.n.b.InterfaceC0566b;
import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.ah;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements P1.i, J3.E, T3.e, InterfaceC0350u, InterfaceC0566b {

    /* renamed from: u, reason: collision with root package name */
    public static final n f471u = new n(0);

    /* renamed from: v, reason: collision with root package name */
    public static final n f472v = new n(1);

    /* renamed from: w, reason: collision with root package name */
    public static final n f473w = new n(2);

    /* renamed from: x, reason: collision with root package name */
    public static final n f474x = new n(3);

    /* renamed from: y, reason: collision with root package name */
    public static final n f475y = new n(4);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f476n;

    public /* synthetic */ n(int i) {
        this.f476n = i;
    }

    @Override // com.anythink.core.common.n.b.InterfaceC0566b
    public ad authenticate(ah ahVar, af afVar) {
        ad a9;
        a9 = InterfaceC0566b.a(ahVar, afVar);
        return a9;
    }

    @Override // T3.e
    public Object c(M m9) {
        Y1.e lambda$getComponents$0;
        Y1.e lambda$getComponents$1;
        Y1.e lambda$getComponents$2;
        switch (this.f476n) {
            case 15:
                return (ScheduledExecutorService) ExecutorsRegistrar.f36950a.get();
            case 16:
                return (ScheduledExecutorService) ExecutorsRegistrar.f36952c.get();
            case 17:
                return (ScheduledExecutorService) ExecutorsRegistrar.f36951b.get();
            case 18:
                T3.n nVar = ExecutorsRegistrar.f36950a;
                return U3.j.f3325n;
            case 19:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(m9);
                return lambda$getComponents$0;
            case 20:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(m9);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(m9);
                return lambda$getComponents$2;
        }
    }

    @Override // P1.i
    public Object get() {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT == 34) {
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
            config = Bitmap.Config.HARDWARE;
            Bitmap copy = createBitmap.copy(config, false);
            createBitmap.recycle();
            r2 = copy == null;
            if (Log.isLoggable("GainmapWorkaroundCalc", 2)) {
                Log.v("GainmapWorkaroundCalc", "calculateNeedsGainmapDecodeWorkaround=" + r2);
            }
            if (copy != null) {
                copy.recycle();
            }
        }
        return Boolean.valueOf(r2);
    }

    @Override // O.InterfaceC0350u
    public A0 p(View view, A0 a02) {
        switch (this.f476n) {
            case 22:
                int i = ApplinkActivity.f6390u;
                G.e f2 = a02.f2115a.f(7);
                view.setPadding(f2.f1031a, f2.f1032b, f2.f1033c, f2.f1034d);
                break;
            case 23:
            default:
                int i4 = StartActivity.f6381z;
                G.e f9 = a02.f2115a.f(7);
                view.setPadding(f9.f1031a, f9.f1032b, f9.f1033c, f9.f1034d);
                break;
            case 24:
                int i6 = DetailsActivity.f5876x;
                G.e f10 = a02.f2115a.f(7);
                view.setPadding(f10.f1031a, f10.f1032b, f10.f1033c, f10.f1034d);
                break;
            case 25:
                int i9 = IntroActivity.f6264y;
                G.e f11 = a02.f2115a.f(7);
                view.setPadding(f11.f1031a, f11.f1032b, f11.f1033c, f11.f1034d);
                break;
            case 26:
                int i10 = MainActivity.f6299V0;
                G.e f12 = a02.f2115a.f(7);
                view.setPadding(f12.f1031a, f12.f1032b, f12.f1033c, f12.f1034d);
                break;
            case 27:
                int i11 = SplashActivity.f6375A;
                G.e f13 = a02.f2115a.f(7);
                view.setPadding(f13.f1031a, f13.f1032b, f13.f1033c, f13.f1034d);
                break;
        }
        return a02;
    }
}
