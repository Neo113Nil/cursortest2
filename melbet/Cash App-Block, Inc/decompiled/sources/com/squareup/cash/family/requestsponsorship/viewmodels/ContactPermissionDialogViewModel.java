package com.squareup.cash.family.requestsponsorship.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;

/* loaded from: classes6.dex */
public final class ContactPermissionDialogViewModel {
    public final String message;
    public final String primaryButtonText;
    public final String secondaryButtonText;
    public final String title;

    public ContactPermissionDialogViewModel(String str, String str2, String str3, String str4) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.title = str;
        this.message = str2;
        this.primaryButtonText = str3;
        this.secondaryButtonText = str4;
    }
}
