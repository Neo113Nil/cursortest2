package kotlin.text;

/* loaded from: classes.dex */
public abstract class CatchingFishContextFlux {
    public static final CatchingFishAsyncTaskBundle CatchingFishParcelableFAB;

    static {
        CatchingFishAsyncTaskBundle catchingFishAsyncTaskBundle = null;
        try {
            catchingFishAsyncTaskBundle = (CatchingFishAsyncTaskBundle) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (catchingFishAsyncTaskBundle == null) {
            catchingFishAsyncTaskBundle = new CatchingFishAsyncTaskBundle();
        }
        CatchingFishParcelableFAB = catchingFishAsyncTaskBundle;
    }

    public static CatchingFishAnimationIntent CatchingFishParcelableFAB(Class cls) {
        CatchingFishParcelableFAB.getClass();
        return new CatchingFishAnimationIntent(cls);
    }
}
