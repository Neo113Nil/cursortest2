package q2;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.C2753Rb;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;
import v2.C5110a;

/* renamed from: q2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4900p {

    /* renamed from: g, reason: collision with root package name */
    public static final C4900p f40199g = new C4900p();

    /* renamed from: a, reason: collision with root package name */
    public final v2.d f40200a;

    /* renamed from: b, reason: collision with root package name */
    public final C4896n f40201b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40202c;

    /* renamed from: d, reason: collision with root package name */
    public final C5110a f40203d;

    /* renamed from: e, reason: collision with root package name */
    public final Random f40204e;

    /* renamed from: f, reason: collision with root package name */
    public final String f40205f;

    public C4900p() {
        v2.d dVar = new v2.d();
        C4896n c4896n = new C4896n(new C2753Rb("com.google.android.gms.ads.AdManagerCreatorImpl", 4), new C2753Rb("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl", 3), new C2753Rb("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl", 2), new C2753Rb("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl", 0), new C2753Rb("com.google.android.gms.ads.AdOverlayCreatorImpl", 1), new C2753Rb("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl", 5), 0);
        C5110a c5110a = new C5110a(0, ModuleDescriptor.MODULE_VERSION, true, false);
        Random random = new Random();
        UUID randomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                bigInteger = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        this.f40200a = dVar;
        this.f40201b = c4896n;
        this.f40202c = false;
        this.f40203d = c5110a;
        this.f40204e = random;
        this.f40205f = bigInteger;
    }

    public static void a() {
        f40199g.f40202c = false;
    }
}
