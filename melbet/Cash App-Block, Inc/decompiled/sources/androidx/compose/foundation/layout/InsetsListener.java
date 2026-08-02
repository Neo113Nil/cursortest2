package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.internal.measurement.zzabh;
import java.util.List;

/* loaded from: classes.dex */
public final class InsetsListener extends zzabh implements Runnable, OnApplyWindowInsetsListener, View.OnAttachStateChangeListener {
    public final WindowInsetsHolder composeInsets;
    public boolean prepared;
    public boolean runningAnimation;
    public WindowInsetsCompat savedInsets;

    public InsetsListener(WindowInsetsHolder windowInsetsHolder) {
        super(!windowInsetsHolder.consumes ? 1 : 0);
        this.composeInsets = windowInsetsHolder;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.savedInsets = windowInsetsCompat;
        WindowInsetsHolder windowInsetsHolder = this.composeInsets;
        ValueInsets valueInsets = windowInsetsHolder.imeAnimationTarget;
        WindowInsetsCompat.Impl impl = windowInsetsCompat.mImpl;
        valueInsets.setValue$foundation_layout(SpacerKt.toInsetsValues(impl.getInsets(8)));
        if (this.prepared) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.runningAnimation) {
            windowInsetsHolder.imeAnimationSource.setValue$foundation_layout(SpacerKt.toInsetsValues(impl.getInsets(8)));
            WindowInsetsHolder.update$default(windowInsetsHolder, windowInsetsCompat);
        }
        return windowInsetsHolder.consumes ? WindowInsetsCompat.CONSUMED : windowInsetsCompat;
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    public final void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.prepared = false;
        this.runningAnimation = false;
        WindowInsetsCompat windowInsetsCompat = this.savedInsets;
        if (windowInsetsAnimationCompat.mImpl.getDurationMillis() > 0 && windowInsetsCompat != null) {
            WindowInsetsCompat.Impl impl = windowInsetsCompat.mImpl;
            WindowInsetsHolder windowInsetsHolder = this.composeInsets;
            windowInsetsHolder.imeAnimationSource.setValue$foundation_layout(SpacerKt.toInsetsValues(impl.getInsets(8)));
            windowInsetsHolder.imeAnimationTarget.setValue$foundation_layout(SpacerKt.toInsetsValues(impl.getInsets(8)));
            WindowInsetsHolder.update$default(windowInsetsHolder, windowInsetsCompat);
        }
        this.savedInsets = null;
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    public final void onPrepare(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.prepared = true;
        this.runningAnimation = true;
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    public final WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List list) {
        WindowInsetsHolder windowInsetsHolder = this.composeInsets;
        WindowInsetsHolder.update$default(windowInsetsHolder, windowInsetsCompat);
        return windowInsetsHolder.consumes ? WindowInsetsCompat.CONSUMED : windowInsetsCompat;
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    public final WorkLauncherImpl onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WorkLauncherImpl workLauncherImpl) {
        this.prepared = false;
        return workLauncherImpl;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.prepared) {
            this.prepared = false;
            this.runningAnimation = false;
            WindowInsetsCompat windowInsetsCompat = this.savedInsets;
            if (windowInsetsCompat != null) {
                WindowInsetsHolder windowInsetsHolder = this.composeInsets;
                windowInsetsHolder.imeAnimationSource.setValue$foundation_layout(SpacerKt.toInsetsValues(windowInsetsCompat.mImpl.getInsets(8)));
                WindowInsetsHolder.update$default(windowInsetsHolder, windowInsetsCompat);
                this.savedInsets = null;
            }
        }
    }
}
