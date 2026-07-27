package kotlin.text;

import android.os.Looper;
import android.view.Choreographer;
import com.android.installreferrer.api.InstallReferrerClient;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes.dex */
public final class CatchingFishKtorDatabinding extends ThreadLocal {
    public final /* synthetic */ int CatchingFishParcelableFAB;

    public /* synthetic */ CatchingFishKtorDatabinding(int i) {
        this.CatchingFishParcelableFAB = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                CatchingFishContextFragment catchingFishContextFragment = new CatchingFishContextFragment(choreographer, CatchingFishGsonCardView.CatchingFishUnitTesting(myLooper));
                return CatchingFishAdMobFAB.CatchingFishMutableLiveData(catchingFishContextFragment, catchingFishContextFragment.CatchingFishAnimationMockk);
            case 1:
                return new Random();
            case 2:
                return new CatchingFishServiceMVPFlux();
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(CatchingFishEspressoDagger.CatchingFishDaggerWebsocket);
                return simpleDateFormat;
        }
    }
}
