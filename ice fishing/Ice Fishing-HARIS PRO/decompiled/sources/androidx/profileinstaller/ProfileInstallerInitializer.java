package androidx.profileinstaller;

import S0.e;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import h.RunnableC0170k;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import n0.InterfaceC0309b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0309b {
    @Override // n0.InterfaceC0309b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // n0.InterfaceC0309b
    public final Object b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: i0.g
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                ProfileInstallerInitializer.this.getClass();
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0170k(applicationContext, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new e(26);
    }
}
