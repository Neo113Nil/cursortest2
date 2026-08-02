package com.squareup.cash.card.onboarding.views.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import com.squareup.cash.card.onboarding.PerspectiveView;
import com.squareup.cash.card.onboarding.StyledCardView;

/* loaded from: classes6.dex */
public final class CardStylePerspectiveViewBinding implements ViewBinding {
    public final ImageView bottomCard;
    public final FrameLayout cardContainer;
    public final ImageView nfcView;
    public final PerspectiveView perspectiveView;
    public final View rootView;
    public final StyledCardView styledCardView;

    public CardStylePerspectiveViewBinding(View view, ImageView imageView, FrameLayout frameLayout, ImageView imageView2, PerspectiveView perspectiveView, StyledCardView styledCardView) {
        this.rootView = view;
        this.bottomCard = imageView;
        this.cardContainer = frameLayout;
        this.nfcView = imageView2;
        this.perspectiveView = perspectiveView;
        this.styledCardView = styledCardView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.rootView;
    }
}
