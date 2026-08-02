package androidx.lifecycle;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.mlkit.vision.common.zzb;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class DispatchQueue implements ViewUtils.OnApplyWindowInsetsListener {
    public boolean finished;
    public boolean isDraining;
    public boolean paused;
    public final Object queue;

    public DispatchQueue() {
        this.paused = true;
        this.queue = new ArrayDeque();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0022 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:7:0x000b, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:17:0x0022, B:20:0x002a), top: B:6:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0021 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void drainQueue() {
        boolean z;
        ArrayDeque arrayDeque = (ArrayDeque) this.queue;
        if (this.isDraining) {
            return;
        }
        try {
            this.isDraining = true;
            while (!arrayDeque.isEmpty()) {
                if (!this.finished && this.paused) {
                    z = false;
                    if (z) {
                        break;
                    }
                    Runnable runnable = (Runnable) arrayDeque.poll();
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                z = true;
                if (z) {
                }
            }
        } finally {
            this.isDraining = false;
        }
    }

    @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat, ViewUtils.RelativePadding relativePadding) {
        if (this.paused) {
            relativePadding.bottom = windowInsetsCompat.getSystemWindowInsetBottom() + relativePadding.bottom;
        }
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(view);
        if (this.finished) {
            if (isLayoutRtl) {
                relativePadding.end = windowInsetsCompat.getSystemWindowInsetLeft() + relativePadding.end;
            } else {
                relativePadding.start = windowInsetsCompat.getSystemWindowInsetLeft() + relativePadding.start;
            }
        }
        if (this.isDraining) {
            if (isLayoutRtl) {
                relativePadding.start = windowInsetsCompat.getSystemWindowInsetRight() + relativePadding.start;
            } else {
                relativePadding.end = windowInsetsCompat.getSystemWindowInsetRight() + relativePadding.end;
            }
        }
        view.setPaddingRelative(relativePadding.start, relativePadding.top, relativePadding.end, relativePadding.bottom);
        ((zzb) this.queue).onApplyWindowInsets(view, windowInsetsCompat, relativePadding);
        return windowInsetsCompat;
    }

    public DispatchQueue(boolean z, boolean z2, boolean z3, zzb zzbVar) {
        this.paused = z;
        this.finished = z2;
        this.isDraining = z3;
        this.queue = zzbVar;
    }
}
