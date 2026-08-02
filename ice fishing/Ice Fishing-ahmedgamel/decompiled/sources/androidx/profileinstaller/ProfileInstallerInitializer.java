package androidx.profileinstaller;

import B0.b;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import c4.e;
import h.RunnableC4557m;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // B0.b
    public final Object create(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: r0.e
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j6) {
                ProfileInstallerInitializer.this.getClass();
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC4557m(applicationContext, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new e();
    }

    @Override // B0.b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
