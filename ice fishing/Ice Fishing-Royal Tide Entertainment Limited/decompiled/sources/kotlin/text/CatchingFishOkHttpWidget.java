package kotlin.text;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class CatchingFishOkHttpWidget {
    public static final CatchingFishStripeAPILayout CatchingFishParcelableFAB;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        if ((r1 instanceof kotlin.text.CatchingFishStripeAPILayout) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        r1 = (kotlin.text.CatchingFishStripeAPILayout) r1;
     */
    static {
        Object CatchingFishViewModelFAB;
        try {
            ClassLoader classLoader = CatchingFishJUnitLiveData.class.getClassLoader();
            CatchingFishFirebaseDagger.CatchingFishAnimationMockk(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(annotations, "getAnnotations(...)");
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (annotations[i] instanceof CatchingFishRetrofitKtor) {
                    break;
                } else {
                    i++;
                }
            }
            CatchingFishViewModelFAB = null;
        } catch (Throwable th) {
            CatchingFishViewModelFAB = CatchingFishDaggerBiometric.CatchingFishViewModelFAB(th);
        }
        CatchingFishStripeAPILayout catchingFishStripeAPILayout = (CatchingFishStripeAPILayout) (CatchingFishViewModelFAB instanceof CatchingFishLiveDataToolbar ? null : CatchingFishViewModelFAB);
        if (catchingFishStripeAPILayout == null) {
            catchingFishStripeAPILayout = new CatchingFishReduxDagger(new CatchingFishMotionLayout(5));
        }
        CatchingFishParcelableFAB = catchingFishStripeAPILayout;
    }
}
