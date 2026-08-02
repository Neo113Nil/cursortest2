package com.miteksystems.misnap.workflow.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.ui.ButtonWithLoadingIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaTextInputLayout;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;

/* loaded from: classes9.dex */
public final class o implements ViewBinding {
    public final /* synthetic */ int $r8$classId;
    public final View a;
    public final View c;

    public o(ConstraintLayout constraintLayout, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4) {
        this.$r8$classId = 5;
        this.a = constraintLayout;
        this.c = textInputLayout2;
    }

    public static o a(View view) {
        int i = R.id.progressIndicator;
        if (((CircularProgressIndicator) ViewBindings.findChildViewById(view, R.id.progressIndicator)) != null) {
            i = R.id.progressIndicatorLabel;
            MaterialTextView materialTextView = (MaterialTextView) ViewBindings.findChildViewById(view, R.id.progressIndicatorLabel);
            if (materialTextView != null) {
                return new o((ConstraintLayout) view, materialTextView, 0);
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static o inflate(LayoutInflater layoutInflater, ButtonWithLoadingIndicator buttonWithLoadingIndicator) {
        layoutInflater.inflate(R.layout.pi2_ui_button_with_loading_indicator, buttonWithLoadingIndicator);
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(buttonWithLoadingIndicator, R.id.progress_bar);
        if (progressBar != null) {
            return new o(buttonWithLoadingIndicator, progressBar, 2);
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(buttonWithLoadingIndicator.getResources().getResourceName(R.id.progress_bar)));
        return null;
    }

    public static o inflate$1(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.pi2_ui_image_view, (ViewGroup) null, false);
        if (inflate != null) {
            ImageView imageView = (ImageView) inflate;
            return new o(imageView, imageView, 4);
        }
        a$$ExternalSyntheticBUOutline0.m$2("rootView");
        return null;
    }

    public static o inflate$2(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.pi2_ui_list_select, (ViewGroup) null, false);
        PersonaTextInputLayout personaTextInputLayout = (PersonaTextInputLayout) inflate;
        if (((AutoCompleteTextView) ViewBindings.findChildViewById(inflate, R.id.textview_input_select)) != null) {
            return new o(personaTextInputLayout, personaTextInputLayout, 6);
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.textview_input_select)));
        return null;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        int i = this.$r8$classId;
        View view = this.a;
        switch (i) {
            case 0:
                return (ConstraintLayout) view;
            case 1:
                return (FrameLayout) view;
            case 2:
                return (ButtonWithLoadingIndicator) view;
            case 3:
                return (ThemeableLottieAnimationView) view;
            case 4:
                return (ImageView) view;
            case 5:
                return (ConstraintLayout) view;
            default:
                return (PersonaTextInputLayout) view;
        }
    }

    public /* synthetic */ o(View view, View view2, int i) {
        this.$r8$classId = i;
        this.a = view;
        this.c = view2;
    }

    public static o inflate(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.pi2_ui_image_lottie, (ViewGroup) null, false);
        if (inflate != null) {
            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) inflate;
            return new o(themeableLottieAnimationView, themeableLottieAnimationView, 3);
        }
        a$$ExternalSyntheticBUOutline0.m$2("rootView");
        return null;
    }
}
