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

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f445e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f446f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f447g;

    public /* synthetic */ g(int i2, Object obj, Object obj2) {
        this.f445e = i2;
        this.f446f = obj;
        this.f447g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f445e) {
            case 0:
                ((ProfileInstallerInitializer) this.f446f).getClass();
                (Build.VERSION.SDK_INT >= 28 ? l.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new h((Context) this.f447g, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            default:
                ((C0174s) this.f446f).b((Typeface) this.f447g);
                break;
        }
    }
}
