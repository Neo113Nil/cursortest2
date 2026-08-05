package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class oi extends AnimationSet implements Runnable {
    public final View MdtA4re8;
    public final ViewGroup NCTxEWno;
    public boolean P7K7Inc8;
    public boolean VgvYg0wo;
    public boolean wxUZMvaN;

    public oi(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.P7K7Inc8 = true;
        this.NCTxEWno = viewGroup;
        this.MdtA4re8 = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.P7K7Inc8 = true;
        if (this.wxUZMvaN) {
            return !this.VgvYg0wo;
        }
        if (!super.getTransformation(j, transformation)) {
            this.wxUZMvaN = true;
            ex.qoPGr6Ce(this.NCTxEWno, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.wxUZMvaN;
        ViewGroup viewGroup = this.NCTxEWno;
        if (z || !this.P7K7Inc8) {
            viewGroup.endViewTransition(this.MdtA4re8);
            this.VgvYg0wo = true;
        } else {
            this.P7K7Inc8 = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.P7K7Inc8 = true;
        if (this.wxUZMvaN) {
            return !this.VgvYg0wo;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.wxUZMvaN = true;
            ex.qoPGr6Ce(this.NCTxEWno, this);
        }
        return true;
    }
}
