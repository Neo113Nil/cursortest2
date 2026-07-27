package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class CatchingFishFABDatabinding implements CatchingFishToastBundle {
    public static final CatchingFishManifestRealm CatchingFishFragmentHandler;
    public static final CatchingFishManifestRealm CatchingFishLayout;
    public final HashMap CatchingFishDaggerWebsocket;
    public final HashMap CatchingFishReduxKtor;
    public boolean CatchingFishViewModelScope;
    public final CatchingFishCoroutineBundle CatchingFishWorkManager;
    public static final CatchingFishCoroutineBundle CatchingFishViewModelFAB = new CatchingFishCoroutineBundle(0);
    public static final CatchingFishContextCardView CatchingFishCloudMessaging = new CatchingFishContextCardView();

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.text.CatchingFishManifestRealm] */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.text.CatchingFishManifestRealm] */
    static {
        final int i = 0;
        CatchingFishLayout = new CatchingFishContextRealmMVI() { // from class: kotlin.text.CatchingFishManifestRealm
            @Override // kotlin.text.CatchingFishViewKtor
            public final void CatchingFishParcelableFAB(Object obj, Object obj2) {
                switch (i) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((CatchingFishManifestGlide) obj2).CatchingFishParcelableFAB((String) obj);
                        break;
                    default:
                        ((CatchingFishManifestGlide) obj2).CatchingFishSnackbar(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        CatchingFishFragmentHandler = new CatchingFishContextRealmMVI() { // from class: kotlin.text.CatchingFishManifestRealm
            @Override // kotlin.text.CatchingFishViewKtor
            public final void CatchingFishParcelableFAB(Object obj, Object obj2) {
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        ((CatchingFishManifestGlide) obj2).CatchingFishParcelableFAB((String) obj);
                        break;
                    default:
                        ((CatchingFishManifestGlide) obj2).CatchingFishSnackbar(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public CatchingFishFABDatabinding() {
        HashMap hashMap = new HashMap();
        this.CatchingFishReduxKtor = hashMap;
        HashMap hashMap2 = new HashMap();
        this.CatchingFishDaggerWebsocket = hashMap2;
        this.CatchingFishWorkManager = CatchingFishViewModelFAB;
        this.CatchingFishViewModelScope = false;
        hashMap2.put(String.class, CatchingFishLayout);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, CatchingFishFragmentHandler);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, CatchingFishCloudMessaging);
        hashMap.remove(Date.class);
    }

    public final CatchingFishToastBundle CatchingFishParcelableFAB(Class cls, CatchingFishMVPStripeAPI catchingFishMVPStripeAPI) {
        this.CatchingFishReduxKtor.put(cls, catchingFishMVPStripeAPI);
        this.CatchingFishDaggerWebsocket.remove(cls);
        return this;
    }
}
