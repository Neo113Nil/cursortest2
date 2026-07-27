package kotlin.text;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishRealmHiltHilt {
    public float CatchingFishCloudMessaging;
    public final CatchingFishOkHttpDagger CatchingFishCoroutine;
    public boolean CatchingFishEspressoTesting;
    public CatchingFishHandlerMVI CatchingFishFragmentHandler;
    public final CatchingFishXMLLayoutGlide CatchingFishReduxKtor;
    public final float CatchingFishViewModelScope;
    public static final CatchingFishMockkDataStore CatchingFishOkHttp = new CatchingFishMockkDataStore(1);
    public static final CatchingFishMockkDataStore CatchingFishUnitTesting = new CatchingFishMockkDataStore(2);
    public static final CatchingFishMockkDataStore CatchingFishAnimationMockk = new CatchingFishMockkDataStore(3);
    public static final CatchingFishMockkDataStore CatchingFishStateLiveData = new CatchingFishMockkDataStore(4);
    public static final CatchingFishMockkDataStore CatchingFishRoomDatabase = new CatchingFishMockkDataStore(5);
    public static final CatchingFishMockkDataStore CatchingFishNavigation = new CatchingFishMockkDataStore(0);
    public float CatchingFishParcelableFAB = 0.0f;
    public float CatchingFishSnackbar = Float.MAX_VALUE;
    public boolean CatchingFishDaggerWebsocket = false;
    public long CatchingFishWorkManager = 0;
    public final ArrayList CatchingFishViewModelFAB = new ArrayList();
    public final ArrayList CatchingFishLayout = new ArrayList();

    public CatchingFishRealmHiltHilt(CatchingFishOkHttpDagger catchingFishOkHttpDagger, CatchingFishXMLLayoutGlide catchingFishXMLLayoutGlide) {
        this.CatchingFishCoroutine = catchingFishOkHttpDagger;
        this.CatchingFishReduxKtor = catchingFishXMLLayoutGlide;
        if (catchingFishXMLLayoutGlide == CatchingFishAnimationMockk || catchingFishXMLLayoutGlide == CatchingFishStateLiveData || catchingFishXMLLayoutGlide == CatchingFishRoomDatabase) {
            this.CatchingFishViewModelScope = 0.1f;
        } else if (catchingFishXMLLayoutGlide == CatchingFishNavigation) {
            this.CatchingFishViewModelScope = 0.00390625f;
        } else if (catchingFishXMLLayoutGlide == CatchingFishOkHttp || catchingFishXMLLayoutGlide == CatchingFishUnitTesting) {
            this.CatchingFishViewModelScope = 0.002f;
        } else {
            this.CatchingFishViewModelScope = 1.0f;
        }
        this.CatchingFishFragmentHandler = null;
        this.CatchingFishCloudMessaging = Float.MAX_VALUE;
        this.CatchingFishEspressoTesting = false;
    }

    public static CatchingFishReduxDataStore CatchingFishSnackbar() {
        ThreadLocal threadLocal = CatchingFishReduxDataStore.CatchingFishLayout;
        if (threadLocal.get() == null) {
            threadLocal.set(new CatchingFishReduxDataStore(new CatchingFishBundleGlide(5)));
        }
        return (CatchingFishReduxDataStore) threadLocal.get();
    }

    public final void CatchingFishCoroutine(float f) {
        this.CatchingFishReduxKtor.CatchingFishDagger(this.CatchingFishCoroutine, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.CatchingFishLayout;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                arrayList.get(i).getClass();
                throw new ClassCastException();
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.text.CatchingFishAnimationMoshi] */
    public final void CatchingFishParcelableFAB(float f) {
        float durationScale;
        if (this.CatchingFishDaggerWebsocket) {
            this.CatchingFishCloudMessaging = f;
            return;
        }
        if (this.CatchingFishFragmentHandler == null) {
            this.CatchingFishFragmentHandler = new CatchingFishHandlerMVI(f);
        }
        CatchingFishHandlerMVI catchingFishHandlerMVI = this.CatchingFishFragmentHandler;
        double d = f;
        catchingFishHandlerMVI.CatchingFishLayout = d;
        double d2 = (float) d;
        if (d2 > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d2 < -3.4028235E38f) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double abs = Math.abs(this.CatchingFishViewModelScope * 0.75f);
        catchingFishHandlerMVI.CatchingFishReduxKtor = abs;
        catchingFishHandlerMVI.CatchingFishDaggerWebsocket = abs * 62.5d;
        CatchingFishBundleGlide catchingFishBundleGlide = CatchingFishSnackbar().CatchingFishDaggerWebsocket;
        catchingFishBundleGlide.getClass();
        if (Thread.currentThread() != ((Looper) catchingFishBundleGlide.CatchingFishWorkManager).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.CatchingFishDaggerWebsocket;
        if (z || z) {
            return;
        }
        this.CatchingFishDaggerWebsocket = true;
        float CatchingFishCoroutineFlow = this.CatchingFishReduxKtor.CatchingFishCoroutineFlow(this.CatchingFishCoroutine);
        this.CatchingFishSnackbar = CatchingFishCoroutineFlow;
        if (CatchingFishCoroutineFlow > Float.MAX_VALUE || CatchingFishCoroutineFlow < -3.4028235E38f) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        CatchingFishReduxDataStore CatchingFishSnackbar = CatchingFishSnackbar();
        ArrayList arrayList = CatchingFishSnackbar.CatchingFishSnackbar;
        if (arrayList.size() == 0) {
            ((Choreographer) CatchingFishSnackbar.CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket).postFrameCallback(new CatchingFishMotionLayoutFAB(CatchingFishSnackbar.CatchingFishReduxKtor));
            if (Build.VERSION.SDK_INT >= 33) {
                durationScale = ValueAnimator.getDurationScale();
                CatchingFishSnackbar.CatchingFishViewModelScope = durationScale;
                if (CatchingFishSnackbar.CatchingFishViewModelFAB == null) {
                    CatchingFishSnackbar.CatchingFishViewModelFAB = new CatchingFishBundleGlide(CatchingFishSnackbar);
                }
                final CatchingFishBundleGlide catchingFishBundleGlide2 = CatchingFishSnackbar.CatchingFishViewModelFAB;
                if (((CatchingFishAnimationMoshi) catchingFishBundleGlide2.CatchingFishDaggerWebsocket) == null) {
                    ?? r1 = new ValueAnimator.DurationScaleChangeListener() { // from class: kotlin.text.CatchingFishAnimationMoshi
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f2) {
                            ((CatchingFishReduxDataStore) CatchingFishBundleGlide.this.CatchingFishWorkManager).CatchingFishViewModelScope = f2;
                        }
                    };
                    catchingFishBundleGlide2.CatchingFishDaggerWebsocket = r1;
                    ValueAnimator.registerDurationScaleChangeListener(r1);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void CatchingFishReduxKtor() {
        if (this.CatchingFishFragmentHandler.CatchingFishSnackbar <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        CatchingFishBundleGlide catchingFishBundleGlide = CatchingFishSnackbar().CatchingFishDaggerWebsocket;
        catchingFishBundleGlide.getClass();
        if (Thread.currentThread() != ((Looper) catchingFishBundleGlide.CatchingFishWorkManager).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.CatchingFishDaggerWebsocket) {
            this.CatchingFishEspressoTesting = true;
        }
    }
}
