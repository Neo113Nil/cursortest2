package defpackage;

import android.view.View;
import android.view.ViewGroupOverlay;
import android.widget.ImageView;
import androidx.transition.R;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;

/* loaded from: classes11.dex */
public final class yp31 extends TransitionListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ ViewGroupOverlay b;
    public final /* synthetic */ ImageView c;

    public yp31(View view, ViewGroupOverlay viewGroupOverlay, ImageView imageView) {
        this.a = view;
        this.b = viewGroupOverlay;
        this.c = imageView;
    }

    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        int i = R.id.save_overlay_view;
        View view = this.a;
        view.setTag(i, null);
        view.setVisibility(0);
        this.b.remove(this.c);
        transition.K(this);
    }

    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        this.b.remove(this.c);
    }

    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        ImageView imageView = this.c;
        if (imageView.getParent() == null) {
            this.b.add(imageView);
        }
    }

    @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.a.setVisibility(4);
    }
}
