package kotlin.coroutines;

import com.gamericefishpro.space.r2.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static CoroutineContext.Element a(CoroutineContext.Element element, f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (Intrinsics.a(element.getKey(), key)) {
            return element;
        }
        return null;
    }

    public static CoroutineContext b(CoroutineContext.Element element, f key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return Intrinsics.a(element.getKey(), key) ? g.d : element;
    }

    public static CoroutineContext c(CoroutineContext.Element element, CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        return context == g.d ? element : (CoroutineContext) context.w(element, new u(20));
    }
}
