package com.google.android.gms.dynamite;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidUiDispatcher;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.measurement.zzabt;
import com.google.android.gms.internal.measurement.zzlf;
import com.google.android.gms.internal.measurement.zzvy;
import com.google.android.gms.internal.measurement.zzwq;
import com.google.crypto.tink.internal.ConscryptUtil;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.WeakHashMap;
import okhttp3.internal._UtilJvmKt;

/* loaded from: classes.dex */
public final class zze extends ThreadLocal {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zze(int i) {
        this.$r8$classId = i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:8|(4:10|11|12|13)|16|17|18|(4:21|22|12|13)|20|12|13) */
    @Override // java.lang.ThreadLocal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initialValue() {
        SecureRandom secureRandom;
        Provider provider = null;
        switch (this.$r8$classId) {
            case 0:
                return 0L;
            case 1:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, Handler.createAsync(myLooper));
                    return androidUiDispatcher.plus(androidUiDispatcher.frameClock);
                }
                a$$ExternalSyntheticBUOutline0.m$1("no Looper on this thread");
                return null;
            case 2:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                return simpleDateFormat;
            case 3:
                zzabt zzabtVar = new zzabt();
                zzabtVar.zzb = 0;
                return zzabtVar;
            case 4:
                zzlf.zza(Thread.currentThread());
                zzwq zzwqVar = new zzwq();
                zzwqVar.zza = false;
                zzwqVar.zzb = null;
                Thread currentThread = Thread.currentThread();
                WeakHashMap weakHashMap = zzvy.zze;
                synchronized (weakHashMap) {
                    weakHashMap.put(currentThread, zzwqVar);
                }
                return zzwqVar;
            case 5:
                Provider providerOrNull = ConscryptUtil.providerOrNull();
                if (providerOrNull != null) {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", providerOrNull);
                    } catch (GeneralSecurityException unused) {
                    }
                    secureRandom.nextLong();
                    return secureRandom;
                }
                provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                if (provider != null) {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                    } catch (GeneralSecurityException unused2) {
                    }
                    secureRandom.nextLong();
                    return secureRandom;
                }
                secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case 6:
                return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZZZ", Locale.US);
            default:
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat2.setLenient(false);
                simpleDateFormat2.setTimeZone(_UtilJvmKt.UTC);
                return simpleDateFormat2;
        }
    }
}
