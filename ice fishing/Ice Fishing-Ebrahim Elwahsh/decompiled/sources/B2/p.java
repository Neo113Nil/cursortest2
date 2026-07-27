package B2;

import com.google.android.gms.internal.ads.AbstractC3137eE;
import com.google.android.gms.internal.ads.EnumC2969b9;
import com.google.android.gms.internal.ads.InterfaceC4063vN;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class p implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f290a;

    /* renamed from: b, reason: collision with root package name */
    public final o f291b;

    public /* synthetic */ p(o oVar, int i) {
        this.f290a = i;
        this.f291b = oVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        char c4;
        switch (this.f290a) {
            case 0:
                String str = this.f291b.f289a;
                switch (str.hashCode()) {
                    case -1999289321:
                        if (str.equals("NATIVE")) {
                            c4 = 2;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case -1372958932:
                        if (str.equals("INTERSTITIAL")) {
                            c4 = 1;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 543046670:
                        if (str.equals("REWARDED")) {
                            c4 = 3;
                            break;
                        }
                        c4 = 65535;
                        break;
                    case 1951953708:
                        if (str.equals("BANNER")) {
                            c4 = 0;
                            break;
                        }
                        c4 = 65535;
                        break;
                    default:
                        c4 = 65535;
                        break;
                }
                return c4 != 0 ? c4 != 1 ? c4 != 2 ? c4 != 3 ? EnumC2969b9.AD_INITIATER_UNSPECIFIED : EnumC2969b9.REWARD_BASED_VIDEO_AD : EnumC2969b9.AD_LOADER : EnumC2969b9.INTERSTITIAL : EnumC2969b9.BANNER;
            case 1:
                String lowerCase = this.f291b.f289a.toLowerCase(Locale.ROOT);
                AbstractC3137eE.h(lowerCase);
                return lowerCase;
            default:
                o oVar = this.f291b;
                oVar.getClass();
                HashSet hashSet = new HashSet();
                hashSet.add(oVar.f289a.toLowerCase(Locale.ROOT));
                return hashSet;
        }
    }
}
