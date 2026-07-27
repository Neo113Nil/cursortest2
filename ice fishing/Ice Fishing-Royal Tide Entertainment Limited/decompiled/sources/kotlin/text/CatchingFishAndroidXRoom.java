package kotlin.text;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class CatchingFishAndroidXRoom implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public Runnable CatchingFishDaggerWebsocket;
    public final long CatchingFishReduxKtor = SystemClock.uptimeMillis() + 10000;
    public final /* synthetic */ ComponentActivity CatchingFishViewModelScope;
    public boolean CatchingFishWorkManager;

    public CatchingFishAndroidXRoom(ComponentActivity componentActivity) {
        this.CatchingFishViewModelScope = componentActivity;
    }

    public final void CatchingFishParcelableFAB(View view) {
        if (this.CatchingFishWorkManager) {
            return;
        }
        this.CatchingFishWorkManager = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(runnable, "runnable");
        this.CatchingFishDaggerWebsocket = runnable;
        View decorView = this.CatchingFishViewModelScope.getWindow().getDecorView();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(decorView, "getDecorView(...)");
        if (!this.CatchingFishWorkManager) {
            decorView.postOnAnimation(new CatchingFishMVPLayout(8, this));
        } else if (CatchingFishFirebaseDagger.CatchingFishOkHttp(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.CatchingFishDaggerWebsocket;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.CatchingFishReduxKtor) {
                this.CatchingFishWorkManager = false;
                this.CatchingFishViewModelScope.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.CatchingFishDaggerWebsocket = null;
        CatchingFishMVVMWebSocket catchingFishMVVMWebSocket = (CatchingFishMVVMWebSocket) this.CatchingFishViewModelScope.CatchingFishFragmentHandler.getValue();
        synchronized (catchingFishMVVMWebSocket.CatchingFishParcelableFAB) {
            z = catchingFishMVVMWebSocket.CatchingFishSnackbar;
        }
        if (z) {
            this.CatchingFishWorkManager = false;
            this.CatchingFishViewModelScope.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.CatchingFishViewModelScope.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
