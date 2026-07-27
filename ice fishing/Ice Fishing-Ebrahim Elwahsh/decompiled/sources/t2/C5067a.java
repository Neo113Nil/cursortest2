package t2;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C3151ea;

/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5067a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile float f40870c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public static volatile long f40871d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f40872e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f40873a;

    /* renamed from: b, reason: collision with root package name */
    public float f40874b;

    public static float b(Context context) {
        C3151ea c3151ea = AbstractC3368ia.Df;
        q2.r rVar = q2.r.f40116e;
        float f6 = 0.0f;
        if (!((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            AudioManager audioManager = (AudioManager) context.getSystemService(com.anythink.basead.exoplayer.k.o.f8602b);
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
        p2.j jVar = p2.j.f39798C;
        jVar.f39810k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long intValue = ((Integer) rVar.f40119c.a(AbstractC3368ia.Ef)).intValue();
        if (f40870c != -1.0f && currentTimeMillis - f40871d < intValue) {
            return f40870c;
        }
        synchronized (f40872e) {
            try {
                jVar.f39810k.getClass();
                long currentTimeMillis2 = System.currentTimeMillis();
                if (f40870c != -1.0f && currentTimeMillis2 - f40871d < intValue) {
                    return f40870c;
                }
                AudioManager audioManager2 = (AudioManager) context.getSystemService(com.anythink.basead.exoplayer.k.o.f8602b);
                if (audioManager2 == null) {
                    f40870c = 0.0f;
                    f40871d = currentTimeMillis2;
                    return 0.0f;
                }
                int streamMaxVolume2 = audioManager2.getStreamMaxVolume(3);
                int streamVolume2 = audioManager2.getStreamVolume(3);
                if (streamMaxVolume2 != 0) {
                    f6 = streamVolume2 / streamMaxVolume2;
                }
                f40870c = f6;
                f40871d = currentTimeMillis2;
                return f40870c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized float a() {
        synchronized (this) {
            float f6 = this.f40874b;
            if (f6 >= 0.0f) {
                return f6;
            }
            return 1.0f;
        }
    }
}
