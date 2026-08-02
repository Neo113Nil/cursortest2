package com.squareup.cash.payments.viewmodels;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PersonalizePaymentViewEvent$ElementEvent$TextSizeChanged implements PersonalizePaymentViewEvent {
    public final Element element;
    public final Size previousSize;
    public final Size size;

    public PersonalizePaymentViewEvent$ElementEvent$TextSizeChanged(Element element, Size size, Size size2) {
        element.getClass();
        this.element = element;
        this.size = size;
        this.previousSize = size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersonalizePaymentViewEvent$ElementEvent$TextSizeChanged)) {
            return false;
        }
        PersonalizePaymentViewEvent$ElementEvent$TextSizeChanged personalizePaymentViewEvent$ElementEvent$TextSizeChanged = (PersonalizePaymentViewEvent$ElementEvent$TextSizeChanged) obj;
        return Intrinsics.areEqual(this.element, personalizePaymentViewEvent$ElementEvent$TextSizeChanged.element) && this.size.equals(personalizePaymentViewEvent$ElementEvent$TextSizeChanged.size) && this.previousSize.equals(personalizePaymentViewEvent$ElementEvent$TextSizeChanged.previousSize);
    }

    public final int hashCode() {
        return this.previousSize.hashCode() + ((this.size.hashCode() + (this.element.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TextSizeChanged(element=" + this.element + ", size=" + this.size + ", previousSize=" + this.previousSize + ")";
    }
}
