package q2;

import com.google.android.gms.internal.ads.C2684Nb;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;
import u2.C5107a;

/* renamed from: q2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4907p {

    /* renamed from: g, reason: collision with root package name */
    public static final C4907p f40108g = new C4907p();

    /* renamed from: a, reason: collision with root package name */
    public final u2.d f40109a;

    /* renamed from: b, reason: collision with root package name */
    public final C4903n f40110b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40111c;

    /* renamed from: d, reason: collision with root package name */
    public final C5107a f40112d;

    /* renamed from: e, reason: collision with root package name */
    public final Random f40113e;

    /* renamed from: f, reason: collision with root package name */
    public final String f40114f;

    public C4907p() {
        u2.d dVar = new u2.d();
        dVar.f41230a = -1.0f;
        C4903n c4903n = new C4903n(new C2684Nb("com.google.android.gms.ads.AdManagerCreatorImpl", 4), new C2684Nb("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl", 3), new C2684Nb("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl", 2), new C2684Nb("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl", 0), new C2684Nb("com.google.android.gms.ads.AdOverlayCreatorImpl", 1), new C2684Nb("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl", 5), 0);
        C5107a c5107a = new C5107a(0, 261710000, true, false);
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
        this.f40109a = dVar;
        this.f40110b = c4903n;
        this.f40111c = false;
        this.f40112d = c5107a;
        this.f40113e = random;
        this.f40114f = bigInteger;
    }

    public static void a() {
        f40108g.f40111c = false;
    }
}
