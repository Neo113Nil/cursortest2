package kotlin.text;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class CatchingFishBundleMVP extends AnimationSet implements Runnable {
    public final View CatchingFishDaggerWebsocket;
    public final ViewGroup CatchingFishReduxKtor;
    public boolean CatchingFishViewModelFAB;
    public boolean CatchingFishViewModelScope;
    public boolean CatchingFishWorkManager;

    public CatchingFishBundleMVP(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.CatchingFishViewModelFAB = true;
        this.CatchingFishReduxKtor = viewGroup;
        this.CatchingFishDaggerWebsocket = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.CatchingFishViewModelFAB = true;
        if (this.CatchingFishWorkManager) {
            return !this.CatchingFishViewModelScope;
        }
        if (!super.getTransformation(j, transformation)) {
            this.CatchingFishWorkManager = true;
            CatchingFishReduxMockkRealm.CatchingFishParcelableFAB(this.CatchingFishReduxKtor, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.CatchingFishWorkManager;
        ViewGroup viewGroup = this.CatchingFishReduxKtor;
        if (z || !this.CatchingFishViewModelFAB) {
            viewGroup.endViewTransition(this.CatchingFishDaggerWebsocket);
            this.CatchingFishViewModelScope = true;
        } else {
            this.CatchingFishViewModelFAB = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.CatchingFishViewModelFAB = true;
        if (this.CatchingFishWorkManager) {
            return !this.CatchingFishViewModelScope;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.CatchingFishWorkManager = true;
            CatchingFishReduxMockkRealm.CatchingFishParcelableFAB(this.CatchingFishReduxKtor, this);
        }
        return true;
    }
}
