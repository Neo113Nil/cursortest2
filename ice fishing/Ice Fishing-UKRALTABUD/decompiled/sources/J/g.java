package J;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import h.C0174s;
import java.util.Random;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f439f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f440g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f441h;

    public /* synthetic */ g(int i2, Object obj, Object obj2) {
        this.f439f = i2;
        this.f440g = obj;
        this.f441h = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f439f) {
            case 0:
                ((ProfileInstallerInitializer) this.f440g).getClass();
                (Build.VERSION.SDK_INT >= 28 ? l.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new h((Context) this.f441h, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            default:
                ((C0174s) this.f440g).b((Typeface) this.f441h);
                break;
        }
    }
}
