package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import defpackage.o10;
import defpackage.vt;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements o10 {
    @Override // defpackage.o10
    public final List GWasM1elztuh() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.o10
    public final Object Yi7zF1RB1(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: gs0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new hs0(applicationContext, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new vt(21);
    }
}
