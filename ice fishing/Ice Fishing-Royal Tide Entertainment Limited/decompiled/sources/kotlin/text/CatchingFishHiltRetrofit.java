package kotlin.text;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public abstract class CatchingFishHiltRetrofit {
    public int CatchingFishDaggerWebsocket;
    public int CatchingFishReduxKtor;
    public Object CatchingFishViewModelScope;
    public int CatchingFishWorkManager;

    public CatchingFishHiltRetrofit() {
        if (CatchingFishMoshiGson.CatchingFishSnackbar == null) {
            CatchingFishMoshiGson.CatchingFishSnackbar = new CatchingFishMoshiGson();
        }
    }

    public abstract Object CatchingFishCoroutine(View view);

    public void CatchingFishDaggerWebsocket() {
        while (true) {
            int i = this.CatchingFishReduxKtor;
            CatchingFishToastView catchingFishToastView = (CatchingFishToastView) this.CatchingFishViewModelScope;
            if (i >= catchingFishToastView.CatchingFishLayout || catchingFishToastView.CatchingFishWorkManager[i] >= 0) {
                return;
            } else {
                this.CatchingFishReduxKtor = i + 1;
            }
        }
    }

    public int CatchingFishParcelableFAB(int i) {
        if (i < this.CatchingFishWorkManager) {
            return ((ByteBuffer) this.CatchingFishViewModelScope).getShort(this.CatchingFishDaggerWebsocket + i);
        }
        return 0;
    }

    public abstract void CatchingFishReduxKtor(View view, Object obj);

    public void CatchingFishSnackbar() {
        if (((CatchingFishToastView) this.CatchingFishViewModelScope).CatchingFishCloudMessaging != this.CatchingFishWorkManager) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract boolean CatchingFishViewModelScope(Object obj, Object obj2);

    public void CatchingFishWorkManager(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.CatchingFishDaggerWebsocket) {
            CatchingFishReduxKtor(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.CatchingFishDaggerWebsocket) {
            tag = CatchingFishCoroutine(view);
        } else {
            tag = view.getTag(this.CatchingFishReduxKtor);
            if (!((Class) this.CatchingFishViewModelScope).isInstance(tag)) {
                tag = null;
            }
        }
        if (CatchingFishViewModelScope(tag, obj)) {
            View.AccessibilityDelegate CatchingFishReduxKtor = CatchingFishFABCameraX.CatchingFishReduxKtor(view);
            CatchingFishAndroidX catchingFishAndroidX = CatchingFishReduxKtor == null ? null : CatchingFishReduxKtor instanceof CatchingFishAppCompat ? ((CatchingFishAppCompat) CatchingFishReduxKtor).CatchingFishParcelableFAB : new CatchingFishAndroidX(CatchingFishReduxKtor);
            if (catchingFishAndroidX == null) {
                catchingFishAndroidX = new CatchingFishAndroidX();
            }
            CatchingFishFABCameraX.CatchingFishOkHttp(view, catchingFishAndroidX);
            view.setTag(this.CatchingFishReduxKtor, obj);
            CatchingFishFABCameraX.CatchingFishViewModelFAB(view, this.CatchingFishWorkManager);
        }
    }

    public boolean hasNext() {
        return this.CatchingFishReduxKtor < ((CatchingFishToastView) this.CatchingFishViewModelScope).CatchingFishLayout;
    }

    public void remove() {
        CatchingFishToastView catchingFishToastView = (CatchingFishToastView) this.CatchingFishViewModelScope;
        CatchingFishSnackbar();
        if (this.CatchingFishDaggerWebsocket == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        catchingFishToastView.CatchingFishSnackbar();
        catchingFishToastView.CatchingFishCloudMessaging(this.CatchingFishDaggerWebsocket);
        this.CatchingFishDaggerWebsocket = -1;
        this.CatchingFishWorkManager = catchingFishToastView.CatchingFishCloudMessaging;
    }
}
