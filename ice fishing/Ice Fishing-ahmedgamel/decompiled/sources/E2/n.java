package E2;

import com.google.android.gms.internal.ads.AbstractC3364iD;
import com.google.android.gms.internal.ads.EnumC3144e9;
import com.google.android.gms.internal.ads.InterfaceC3320hN;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class n implements InterfaceC3320hN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f852a;

    /* renamed from: b, reason: collision with root package name */
    public final n4.c f853b;

    public /* synthetic */ n(n4.c cVar, int i) {
        this.f852a = i;
        this.f853b = cVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.InterfaceC3534lN
    public final Object f() {
        char c9;
        switch (this.f852a) {
            case 0:
                String str = (String) this.f853b.f39658u;
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
                return c9 != 0 ? c9 != 1 ? c9 != 2 ? c9 != 3 ? EnumC3144e9.AD_INITIATER_UNSPECIFIED : EnumC3144e9.REWARD_BASED_VIDEO_AD : EnumC3144e9.AD_LOADER : EnumC3144e9.INTERSTITIAL : EnumC3144e9.BANNER;
            case 1:
                String lowerCase = ((String) this.f853b.f39658u).toLowerCase(Locale.ROOT);
                AbstractC3364iD.j(lowerCase);
                return lowerCase;
            default:
                n4.c cVar = this.f853b;
                cVar.getClass();
                HashSet hashSet = new HashSet();
                hashSet.add(((String) cVar.f39658u).toLowerCase(Locale.ROOT));
                return hashSet;
        }
    }
}
