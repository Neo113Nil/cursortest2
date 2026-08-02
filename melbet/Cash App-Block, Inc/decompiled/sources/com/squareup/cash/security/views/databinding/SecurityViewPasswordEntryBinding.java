package com.squareup.cash.security.views.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textfield.TextInputLayout;
import com.squareup.cash.mooncake.components.MooncakeCheckbox;
import com.squareup.cash.mooncake.components.MooncakeEditText;
import com.squareup.cash.mooncake.components.MooncakeLargeText;
import com.squareup.cash.mooncake.components.MooncakeMediumText;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.components.MooncakeToolbar;
import com.withpersona.sdk2.inquiry.shared.ui.PersonaMaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;

/* loaded from: classes7.dex */
public final class SecurityViewPasswordEntryBinding implements ViewBinding {
    public final /* synthetic */ int $r8$classId = 0;
    public final View rootView;
    public final Button securityViewBiometricsCheckbox;
    public final View securityViewDivider;
    public final View securityViewForgotPasswordText;
    public final View securityViewHelpButton;
    public final View securityViewPasswordActionButton;
    public final TextView securityViewPasswordDetailText;
    public final View securityViewPasswordEditText;
    public final TextView securityViewPasswordHeader;

    public SecurityViewPasswordEntryBinding(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, PersonaMaterialButton personaMaterialButton, TextInputLayout textInputLayout, TextView textView, TextInputLayout textInputLayout2, TextView textView2, Pi2NavigationBar pi2NavigationBar, TextView textView3) {
        this.rootView = coordinatorLayout;
        this.securityViewDivider = linearLayout;
        this.securityViewBiometricsCheckbox = personaMaterialButton;
        this.securityViewForgotPasswordText = textInputLayout;
        this.securityViewHelpButton = textView;
        this.securityViewPasswordActionButton = textInputLayout2;
        this.securityViewPasswordDetailText = textView2;
        this.securityViewPasswordEditText = pi2NavigationBar;
        this.securityViewPasswordHeader = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.$r8$classId) {
            case 0:
                return this.rootView;
            default:
                return (CoordinatorLayout) this.rootView;
        }
    }

    public SecurityViewPasswordEntryBinding(View view, MooncakeCheckbox mooncakeCheckbox, View view2, AppCompatCheckBox appCompatCheckBox, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, MooncakePillButton mooncakePillButton, MooncakeToolbar mooncakeToolbar, MooncakeMediumText mooncakeMediumText, MooncakeEditText mooncakeEditText, MooncakeLargeText mooncakeLargeText) {
        this.rootView = view;
        this.securityViewBiometricsCheckbox = mooncakeCheckbox;
        this.securityViewDivider = view2;
        this.securityViewForgotPasswordText = appCompatTextView;
        this.securityViewHelpButton = appCompatImageView;
        this.securityViewPasswordActionButton = mooncakePillButton;
        this.securityViewPasswordDetailText = mooncakeMediumText;
        this.securityViewPasswordEditText = mooncakeEditText;
        this.securityViewPasswordHeader = mooncakeLargeText;
    }
}
