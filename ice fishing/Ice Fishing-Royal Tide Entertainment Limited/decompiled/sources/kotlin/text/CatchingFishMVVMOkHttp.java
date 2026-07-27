package kotlin.text;

/* loaded from: classes.dex */
public abstract class CatchingFishMVVMOkHttp {
    public static final ThreadLocal CatchingFishParcelableFAB = new ThreadLocal();

    public static CatchingFishReduxMockkView CatchingFishParcelableFAB() {
        ThreadLocal threadLocal = CatchingFishParcelableFAB;
        CatchingFishReduxMockkView catchingFishReduxMockkView = (CatchingFishReduxMockkView) threadLocal.get();
        if (catchingFishReduxMockkView != null) {
            return catchingFishReduxMockkView;
        }
        CatchingFishOkHttpStateFlow catchingFishOkHttpStateFlow = new CatchingFishOkHttpStateFlow(Thread.currentThread());
        threadLocal.set(catchingFishOkHttpStateFlow);
        return catchingFishOkHttpStateFlow;
    }
}
