package u2;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C3301ha;
import p2.C4835j;

/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5070a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile float f41249c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public static volatile long f41250d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f41251e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f41252a;

    /* renamed from: b, reason: collision with root package name */
    public float f41253b;

    public static float b(Context context) {
        C3301ha c3301ha = AbstractC3569ma.Jf;
        q2.r rVar = q2.r.f40207e;
        float f3 = 0.0f;
        if (!((Boolean) rVar.f40210c.a(c3301ha)).booleanValue()) {
            AudioManager audioManager = (AudioManager) context.getSystemService(com.anythink.basead.exoplayer.k.o.f8445b);
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
        C4835j c4835j = C4835j.f39733C;
        c4835j.f39745k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long intValue = ((Integer) rVar.f40210c.a(AbstractC3569ma.Kf)).intValue();
        if (f41249c != -1.0f && currentTimeMillis - f41250d < intValue) {
            return f41249c;
        }
        synchronized (f41251e) {
            try {
                c4835j.f39745k.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                if (f41249c != -1.0f && currentTimeMillis2 - f41250d < intValue) {
                    return f41249c;
                }
                AudioManager audioManager2 = (AudioManager) context.getSystemService(com.anythink.basead.exoplayer.k.o.f8445b);
                if (audioManager2 == null) {
                    f41249c = 0.0f;
                    f41250d = currentTimeMillis2;
                    return 0.0f;
                }
                int streamMaxVolume2 = audioManager2.getStreamMaxVolume(3);
                int streamVolume2 = audioManager2.getStreamVolume(3);
                if (streamMaxVolume2 != 0) {
                    f3 = streamVolume2 / streamMaxVolume2;
                }
                f41249c = f3;
                f41250d = currentTimeMillis2;
                return f41249c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized float a() {
        synchronized (this) {
            float f3 = this.f41253b;
            if (f3 >= 0.0f) {
                return f3;
            }
            return 1.0f;
        }
    }
}
