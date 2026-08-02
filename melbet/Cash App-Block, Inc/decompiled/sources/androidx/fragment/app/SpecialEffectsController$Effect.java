package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.activity.BackEventCompat;
import androidx.fragment.app.DefaultSpecialEffectsController;

/* loaded from: classes3.dex */
public abstract class SpecialEffectsController$Effect {
    public boolean isCancelled;
    public boolean isStarted;

    public boolean isSeekingSupported() {
        return this instanceof DefaultSpecialEffectsController.AnimatorEffect;
    }

    public abstract void onCancel(ViewGroup viewGroup);

    public abstract void onCommit(ViewGroup viewGroup);

    public void onProgress(BackEventCompat backEventCompat, ViewGroup viewGroup) {
        backEventCompat.getClass();
        viewGroup.getClass();
    }

    public void onStart(ViewGroup viewGroup) {
        viewGroup.getClass();
    }
}
