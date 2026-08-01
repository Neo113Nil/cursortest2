package B1;

import C2.N;
import O.A0;
import O.InterfaceC0345u;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.ah;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import com.icefishinggame.icefishinggamemultigames.DetailsActivity;
import com.icefishinggame.icefishinggamemultigames.IntroActivity;
import com.icefishinggame.icefishinggamemultigames.MainActivity;
import com.icefishinggame.icefishinggamemultigames.SplashActivity;
import com.icefishinggame.icefishinggamemultigames.StartActivity;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements N1.i, D0.n, H3.E, R3.e, com.anythink.core.common.n.b.b, com.anythink.core.common.n.b.q, InterfaceC0345u {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f161n;

    public /* synthetic */ x(int i) {
        this.f161n = i;
    }

    @Override // D0.n
    public void a(D0.m mVar, D0.o oVar) {
        switch (this.f161n) {
            case 1:
                mVar.f(oVar);
                break;
            case 2:
                mVar.d(oVar);
                break;
            case 3:
                mVar.c(oVar);
                break;
            case 4:
                mVar.b();
                break;
            default:
                mVar.e();
                break;
        }
    }

    @Override // com.anythink.core.common.n.b.b
    public ad authenticate(ah ahVar, af afVar) {
        ad a9;
        a9 = com.anythink.core.common.n.b.b.a(ahVar, afVar);
        return a9;
    }

    @Override // R3.e
    public Object b(N n9) {
        W1.e lambda$getComponents$0;
        W1.e lambda$getComponents$1;
        W1.e lambda$getComponents$2;
        switch (this.f161n) {
            case 14:
                return (ScheduledExecutorService) ExecutorsRegistrar.f36183a.get();
            case 15:
                return (ScheduledExecutorService) ExecutorsRegistrar.f36185c.get();
            case 16:
                return (ScheduledExecutorService) ExecutorsRegistrar.f36184b.get();
            case 17:
                R3.n nVar = ExecutorsRegistrar.f36183a;
                return S3.k.f2886n;
            case 18:
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(n9);
                return lambda$getComponents$2;
            case 19:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(n9);
                return lambda$getComponents$0;
            case 20:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(n9);
                return lambda$getComponents$1;
        }
    }

    @Override // N1.i
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

    @Override // com.anythink.core.common.n.b.q
    public List lookup(String str) {
        List a9;
        a9 = com.anythink.core.common.n.b.q.a(str);
        return a9;
    }

    @Override // O.InterfaceC0345u
    public A0 q(View view, A0 a02) {
        switch (this.f161n) {
            case 25:
                int i = DetailsActivity.f36383x;
                G.e f3 = a02.f2027a.f(7);
                view.setPadding(f3.f1005a, f3.f1006b, f3.f1007c, f3.f1008d);
                break;
            case 26:
                int i6 = IntroActivity.f36774y;
                G.e f9 = a02.f2027a.f(7);
                view.setPadding(f9.f1005a, f9.f1006b, f9.f1007c, f9.f1008d);
                break;
            case 27:
                int i9 = MainActivity.f36809a1;
                G.e f10 = a02.f2027a.f(7);
                view.setPadding(f10.f1005a, f10.f1006b, f10.f1007c, f10.f1008d);
                break;
            case 28:
                int i10 = SplashActivity.f36886A;
                G.e f11 = a02.f2027a.f(7);
                view.setPadding(f11.f1005a, f11.f1006b, f11.f1007c, f11.f1008d);
                break;
            default:
                int i11 = StartActivity.f36892z;
                G.e f12 = a02.f2027a.f(7);
                view.setPadding(f12.f1005a, f12.f1006b, f12.f1007c, f12.f1008d);
                break;
        }
        return a02;
    }
}
