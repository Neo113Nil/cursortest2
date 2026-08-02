package s2;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.C2773Rb;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;
import x2.C5189a;

/* renamed from: s2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4949p {

    /* renamed from: g, reason: collision with root package name */
    public static final C4949p f40498g = new C4949p();

    /* renamed from: a, reason: collision with root package name */
    public final x2.d f40499a;

    /* renamed from: b, reason: collision with root package name */
    public final C4945n f40500b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40501c;

    /* renamed from: d, reason: collision with root package name */
    public final C5189a f40502d;

    /* renamed from: e, reason: collision with root package name */
    public final Random f40503e;

    /* renamed from: f, reason: collision with root package name */
    public final String f40504f;

    public C4949p() {
        x2.d dVar = new x2.d();
        C4945n c4945n = new C4945n(new C2773Rb("com.google.android.gms.ads.AdManagerCreatorImpl", 4), new C2773Rb("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl", 3), new C2773Rb("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl", 2), new C2773Rb("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl", 0), new C2773Rb("com.google.android.gms.ads.AdOverlayCreatorImpl", 1), new C2773Rb("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl", 5), 0);
        C5189a c5189a = new C5189a(0, ModuleDescriptor.MODULE_VERSION, true, false);
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
        this.f40499a = dVar;
        this.f40500b = c4945n;
        this.f40501c = false;
        this.f40502d = c5189a;
        this.f40503e = random;
        this.f40504f = bigInteger;
    }

    public static void a() {
        f40498g.f40501c = false;
    }
}
