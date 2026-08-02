package L7;

import android.graphics.Path;
import android.graphics.PathMeasure;
import com.google.android.gms.internal.ads.AbstractC3066cl;
import com.google.android.gms.internal.ads.C3742pF;
import com.google.android.gms.internal.ads.WJ;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public final class b extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1787a;

    public /* synthetic */ b(int i) {
        this.f1787a = i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:16|(4:31|32|23|24)|18|19|20|(4:25|26|23|24)|22|23|24) */
    @Override // java.lang.ThreadLocal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initialValue() {
        SecureRandom secureRandom;
        Provider provider = null;
        switch (this.f1787a) {
            case 0:
                return new Random();
            case 1:
                return 0L;
            case 2:
                return ByteBuffer.allocate(32);
            case 3:
                try {
                    return (Cipher) WJ.f29138b.f29144a.b("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e9) {
                    throw new IllegalStateException(e9);
                }
            case 4:
                try {
                    Cipher cipher = (Cipher) WJ.f29138b.f29144a.b("AES/GCM-SIV/NoPadding");
                    if (C3742pF.b(cipher)) {
                        return cipher;
                    }
                    return null;
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            case 5:
                Provider h3 = AbstractC3066cl.h();
                if (h3 != null) {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", h3);
                    } catch (GeneralSecurityException unused) {
                    }
                    secureRandom.nextLong();
                    return secureRandom;
                }
                provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", new Class[0]).invoke(null, new Object[0]);
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
                try {
                    return (Cipher) WJ.f29138b.f29144a.b("AES/ECB/NoPadding");
                } catch (GeneralSecurityException e11) {
                    throw new IllegalStateException(e11);
                }
            case 7:
                try {
                    return (Cipher) WJ.f29138b.f29144a.b("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e12) {
                    throw new IllegalStateException(e12);
                }
            case 8:
                try {
                    return (Cipher) WJ.f29138b.f29144a.b("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e13) {
                    throw new IllegalStateException(e13);
                }
            case 9:
                return new PathMeasure();
            case 10:
                return new Path();
            case 11:
                return new Path();
            case 12:
                return new float[4];
            case 13:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(j8.d.f38495a);
                return simpleDateFormat;
            default:
                return new q6.e();
        }
    }
}
