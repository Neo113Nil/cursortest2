package androidx.lifecycle.compose;

import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.lifecycle.LifecycleOwner;
import androidx.room.InvalidationTracker$$ExternalSyntheticLambda0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Deprecated;
import kotlin.Result;

/* loaded from: classes.dex */
public abstract class LocalLifecycleOwnerKt {
    public static final ProvidableCompositionLocal LocalLifecycleOwner;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002d, code lost:
    
        r1 = r1.invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        if ((r1 instanceof androidx.compose.runtime.ProvidableCompositionLocal) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        r1 = (androidx.compose.runtime.ProvidableCompositionLocal) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r1 = null;
     */
    static {
        Object failure;
        try {
            Result.Companion companion = Result.Companion;
            ClassLoader classLoader = LifecycleOwner.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
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
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        Result.Companion companion3 = Result.Companion;
        ProvidableCompositionLocal providableCompositionLocal = (ProvidableCompositionLocal) (failure instanceof Result.Failure ? null : failure);
        if (providableCompositionLocal == null) {
            providableCompositionLocal = new StaticProvidableCompositionLocal(new InvalidationTracker$$ExternalSyntheticLambda0(20));
        }
        LocalLifecycleOwner = providableCompositionLocal;
    }
}
