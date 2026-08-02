package com.squareup.cash.profile.viewmodels;

import com.squareup.cash.payments.presenters.UtilsKt$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ContactMethodSectionViewModel implements NotificationSectionViewModel {
    public final ContactMethodType emailAliases;
    public final UtilsKt$$ExternalSyntheticLambda0 onEvent;
    public final ContactMethodType phoneAliases;
    public final String title;

    public ContactMethodSectionViewModel(ContactMethodType contactMethodType, ContactMethodType contactMethodType2, String str, UtilsKt$$ExternalSyntheticLambda0 utilsKt$$ExternalSyntheticLambda0) {
        str.getClass();
        this.phoneAliases = contactMethodType;
        this.emailAliases = contactMethodType2;
        this.title = str;
        this.onEvent = utilsKt$$ExternalSyntheticLambda0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContactMethodSectionViewModel) {
            ContactMethodSectionViewModel contactMethodSectionViewModel = (ContactMethodSectionViewModel) obj;
            return this.phoneAliases.equals(contactMethodSectionViewModel.phoneAliases) && this.emailAliases.equals(contactMethodSectionViewModel.emailAliases) && Intrinsics.areEqual(this.title, contactMethodSectionViewModel.title) && this.onEvent == contactMethodSectionViewModel.onEvent;
        }
        return false;
    }

    public final int hashCode() {
        return this.onEvent.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.emailAliases.hashCode() + (this.phoneAliases.hashCode() * 31)) * 31, 31, this.title);
    }

    public final String toString() {
        return "ContactMethodSectionViewModel(phoneAliases=" + this.phoneAliases + ", emailAliases=" + this.emailAliases + ", title=" + this.title + ", onEvent=" + this.onEvent + ")";
    }
}
