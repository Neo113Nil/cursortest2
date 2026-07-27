package C2;

import com.google.android.gms.internal.ads.AbstractC3341iD;
import com.google.android.gms.internal.ads.EnumC3121e9;
import com.google.android.gms.internal.ads.InterfaceC3297hN;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class o implements InterfaceC3297hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f393a;

    /* renamed from: b, reason: collision with root package name */
    public final C0281n f394b;

    public /* synthetic */ o(C0281n c0281n, int i) {
        this.f393a = i;
        this.f394b = c0281n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.InterfaceC3511lN
    public final Object f() {
        char c9;
        switch (this.f393a) {
            case 0:
                String str = this.f394b.f392b;
                switch (str.hashCode()) {
                    case -1999289321:
                        if (str.equals("NATIVE")) {
                            c9 = 2;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case -1372958932:
                        if (str.equals("INTERSTITIAL")) {
                            c9 = 1;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 543046670:
                        if (str.equals("REWARDED")) {
                            c9 = 3;
                            break;
                        }
                        c9 = 65535;
                        break;
                    case 1951953708:
                        if (str.equals("BANNER")) {
                            c9 = 0;
                            break;
                        }
                        c9 = 65535;
                        break;
                    default:
                        c9 = 65535;
                        break;
                }
                return c9 != 0 ? c9 != 1 ? c9 != 2 ? c9 != 3 ? EnumC3121e9.AD_INITIATER_UNSPECIFIED : EnumC3121e9.REWARD_BASED_VIDEO_AD : EnumC3121e9.AD_LOADER : EnumC3121e9.INTERSTITIAL : EnumC3121e9.BANNER;
            case 1:
                String lowerCase = this.f394b.f392b.toLowerCase(Locale.ROOT);
                AbstractC3341iD.j(lowerCase);
                return lowerCase;
            default:
                C0281n c0281n = this.f394b;
                c0281n.getClass();
                HashSet hashSet = new HashSet();
                hashSet.add(c0281n.f392b.toLowerCase(Locale.ROOT));
                return hashSet;
        }
    }
}
