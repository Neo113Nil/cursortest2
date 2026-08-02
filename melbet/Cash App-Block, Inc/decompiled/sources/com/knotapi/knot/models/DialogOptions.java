package com.knotapi.knot.models;

import android.view.View;

/* loaded from: classes4.dex */
public class DialogOptions {
    View.OnClickListener closeButtonListener;
    String description;
    String primaryButton;
    View.OnClickListener primaryButtonListener;
    String secondaryButton;
    View.OnClickListener secondaryButtonListener;
    String showEditText;
    String title;
    String logoLink = this.logoLink;
    String logoLink = this.logoLink;

    public DialogOptions(String str, String str2, String str3, String str4, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, String str5) {
        this.title = str;
        this.description = str2;
        this.primaryButton = str3;
        this.secondaryButton = str4;
        this.primaryButtonListener = onClickListener;
        this.secondaryButtonListener = onClickListener2;
        this.closeButtonListener = onClickListener3;
        this.showEditText = str5;
    }

    public View.OnClickListener getCloseButtonListener() {
        return this.closeButtonListener;
    }

    public String getDescription() {
        return this.description;
    }

    public String getPrimaryButton() {
        return this.primaryButton;
    }

    public View.OnClickListener getPrimaryButtonListener() {
        return this.primaryButtonListener;
    }

    public String getSecondaryButton() {
        return this.secondaryButton;
    }

    public View.OnClickListener getSecondaryButtonListener() {
        return this.secondaryButtonListener;
    }

    public String getTitle() {
        return this.title;
    }

    public String isShowEditText() {
        return this.showEditText;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setPrimaryButton(String str) {
        this.primaryButton = str;
    }

    public void setPrimaryButtonListener(View.OnClickListener onClickListener) {
        this.primaryButtonListener = onClickListener;
    }

    public void setSecondaryButton(String str) {
        this.secondaryButton = str;
    }

    public void setSecondaryButtonListener(View.OnClickListener onClickListener) {
        this.secondaryButtonListener = onClickListener;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
