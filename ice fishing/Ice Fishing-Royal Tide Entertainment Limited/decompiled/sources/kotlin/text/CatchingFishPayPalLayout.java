package kotlin.text;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* loaded from: classes.dex */
public abstract class CatchingFishPayPalLayout {
    public static final CatchingFishIntentCoroutine CatchingFishParcelableFAB;

    static {
        String str;
        int i = CatchingFishWidgetWidget.CatchingFishParcelableFAB;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = Arrays.asList(new CatchingFishDataStoreMockk()).iterator();
            CatchingFishFirebaseDagger.CatchingFishNavigation(it, "<this>");
            Iterator it2 = CatchingFishJUnitRedux.CatchingFishMutableLiveData(new CatchingFishMVIManifest(new CatchingFishReduxJUnit(it))).iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                if (it2.hasNext()) {
                    ((CatchingFishDataStoreMockk) obj).getClass();
                    do {
                        ((CatchingFishDataStoreMockk) it2.next()).getClass();
                    } while (it2.hasNext());
                }
            }
            if (((CatchingFishDataStoreMockk) obj) == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null) {
                throw new IllegalStateException("The main looper is not available");
            }
            CatchingFishParcelableFAB = new CatchingFishIntentCoroutine(CatchingFishToastFABJUnit.CatchingFishParcelableFAB(mainLooper));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
