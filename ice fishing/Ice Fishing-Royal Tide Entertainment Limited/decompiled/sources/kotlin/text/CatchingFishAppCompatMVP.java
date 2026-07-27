package kotlin.text;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class CatchingFishAppCompatMVP {
    public static final List CatchingFishParcelableFAB;

    static {
        try {
            Iterator it = Arrays.asList(new CatchingFishGsonStripeAPI()).iterator();
            CatchingFishFirebaseDagger.CatchingFishNavigation(it, "<this>");
            CatchingFishParcelableFAB = CatchingFishJUnitRedux.CatchingFishMutableLiveData(new CatchingFishMVIManifest(new CatchingFishReduxJUnit(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
