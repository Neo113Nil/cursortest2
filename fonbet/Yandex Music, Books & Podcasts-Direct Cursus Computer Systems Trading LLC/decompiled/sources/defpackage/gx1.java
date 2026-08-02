package defpackage;

import android.media.AudioManager;
import android.os.Build;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public abstract class gx1 {
    public static final eq4 a = new eq4(0.0d, 1.0d);
    public static final AtomicReference b = new AtomicReference(null);

    public static final int a(AudioManager audioManager) {
        audioManager.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            return audioManager.getStreamMinVolume(3);
        }
        return 0;
    }

    public static final gq4 b(AudioManager audioManager) {
        audioManager.getClass();
        AtomicReference atomicReference = b;
        gq4 gq4Var = (gq4) atomicReference.get();
        if (gq4Var != null) {
            return gq4Var;
        }
        double a2 = a(audioManager);
        double streamMaxVolume = audioManager.getStreamMaxVolume(3);
        eq4 eq4Var = streamMaxVolume <= a2 ? new eq4(0.0d, 0.0d) : new eq4(a2, streamMaxVolume);
        atomicReference.set(eq4Var);
        return eq4Var;
    }
}
