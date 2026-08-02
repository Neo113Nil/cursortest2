package w2;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C3324ha;
import r2.C4906k;

/* renamed from: w2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5141a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile float f41639c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public static volatile long f41640d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f41641e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f41642a;

    /* renamed from: b, reason: collision with root package name */
    public float f41643b;

    public static float b(Context context) {
        C3324ha c3324ha = AbstractC3592ma.Jf;
        s2.r rVar = s2.r.f40506e;
        float f2 = 0.0f;
        if (!((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
            AudioManager audioManager = (AudioManager) context.getSystemService(com.anythink.basead.exoplayer.k.o.f9231b);
            if (audioManager == null) {
                return 0.0f;
            }
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            if (streamMaxVolume == 0) {
                return 0.0f;
            }
            return streamVolume / streamMaxVolume;
        }
        C4906k c4906k = C4906k.f40186C;
        c4906k.f40198k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long intValue = ((Integer) rVar.f40509c.a(AbstractC3592ma.Kf)).intValue();
        if (f41639c != -1.0f && currentTimeMillis - f41640d < intValue) {
            return f41639c;
        }
        synchronized (f41641e) {
            try {
                c4906k.f40198k.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                if (f41639c != -1.0f && currentTimeMillis2 - f41640d < intValue) {
                    return f41639c;
                }
                AudioManager audioManager2 = (AudioManager) context.getSystemService(com.anythink.basead.exoplayer.k.o.f9231b);
                if (audioManager2 == null) {
                    f41639c = 0.0f;
                    f41640d = currentTimeMillis2;
                    return 0.0f;
                }
                int streamMaxVolume2 = audioManager2.getStreamMaxVolume(3);
                int streamVolume2 = audioManager2.getStreamVolume(3);
                if (streamMaxVolume2 != 0) {
                    f2 = streamVolume2 / streamMaxVolume2;
                }
                f41639c = f2;
                f41640d = currentTimeMillis2;
                return f41639c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized float a() {
        synchronized (this) {
            float f2 = this.f41643b;
            if (f2 >= 0.0f) {
                return f2;
            }
            return 1.0f;
        }
    }
}
