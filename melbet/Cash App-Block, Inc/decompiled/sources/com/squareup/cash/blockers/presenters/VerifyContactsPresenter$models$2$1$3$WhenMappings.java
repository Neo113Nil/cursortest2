package com.squareup.cash.blockers.presenters;

import com.squareup.cash.data.contacts.ContactVerifier$Result;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class VerifyContactsPresenter$models$2$1$3$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ContactVerifier$Result.NotSuccessful.Status.values().length];
        try {
            ContactVerifier$Result.NotSuccessful.Status status = ContactVerifier$Result.NotSuccessful.Status.FAILURE;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            ContactVerifier$Result.NotSuccessful.Status status2 = ContactVerifier$Result.NotSuccessful.Status.FAILURE;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            ContactVerifier$Result.NotSuccessful.Status status3 = ContactVerifier$Result.NotSuccessful.Status.FAILURE;
            iArr[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
