package androidx.savedstate.compose;

import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.room.InvalidationTracker$$ExternalSyntheticLambda0;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Result;

/* loaded from: classes.dex */
public abstract class LocalSavedStateRegistryOwnerKt {
    public static final ProvidableCompositionLocal LocalSavedStateRegistryOwner;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        if ((r1 instanceof androidx.compose.runtime.ProvidableCompositionLocal) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        r1 = (androidx.compose.runtime.ProvidableCompositionLocal) r1;
     */
    static {
        Object failure;
        try {
            Result.Companion companion = Result.Companion;
            ClassLoader classLoader = SavedStateRegistryOwner.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (annotations[i] instanceof Deprecated) {
                    break;
                } else {
                    i++;
                }
            }
            failure = null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Result.Companion companion3 = Result.Companion;
        ProvidableCompositionLocal providableCompositionLocal = (ProvidableCompositionLocal) (failure instanceof Result.Failure ? null : failure);
        if (providableCompositionLocal == null) {
            providableCompositionLocal = new StaticProvidableCompositionLocal(new InvalidationTracker$$ExternalSyntheticLambda0(24));
        }
        LocalSavedStateRegistryOwner = providableCompositionLocal;
    }
}
