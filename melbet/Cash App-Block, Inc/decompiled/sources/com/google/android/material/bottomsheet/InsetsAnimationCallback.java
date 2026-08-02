package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.internal.measurement.zzabh;
import com.google.android.material.animation.AnimationUtils;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class InsetsAnimationCallback extends zzabh {
    public int startTranslationY;
    public int startY;
    public final int[] tmpLocation;
    public final View view;

    public InsetsAnimationCallback(View view) {
        super(0);
        this.tmpLocation = new int[2];
        this.view = view;
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    public final void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.view.setTranslationY(RecyclerView.DECELERATION_RATE);
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    public final void onPrepare(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        View view = this.view;
        int[] iArr = this.tmpLocation;
        view.getLocationOnScreen(iArr);
        this.startY = iArr[1];
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    public final WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((WindowInsetsAnimationCompat) it.next()).mImpl.getTypeMask() & 8) != 0) {
                this.view.setTranslationY(AnimationUtils.lerp(this.startTranslationY, 0, r0.mImpl.getInterpolatedFraction()));
                break;
            }
        }
        return windowInsetsCompat;
    }

    @Override // com.google.android.gms.internal.measurement.zzabh
    public final WorkLauncherImpl onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WorkLauncherImpl workLauncherImpl) {
        View view = this.view;
        int[] iArr = this.tmpLocation;
        view.getLocationOnScreen(iArr);
        int i = this.startY - iArr[1];
        this.startTranslationY = i;
        view.setTranslationY(i);
        return workLauncherImpl;
    }
}
