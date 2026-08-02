package com.squareup.cash.moneybot.viewmodels.staticpicker;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface MoneybotStaticPickerViewEvent {

    public final class ContinueTapped implements MoneybotStaticPickerViewEvent {
        public static final ContinueTapped INSTANCE = new ContinueTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ContinueTapped);
        }

        public final int hashCode() {
            return 719221879;
        }

        public final String toString() {
            return "ContinueTapped";
        }
    }

    public final class Dismissed implements MoneybotStaticPickerViewEvent {
        public static final Dismissed INSTANCE = new Dismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismissed);
        }

        public final int hashCode() {
            return 1890208709;
        }

        public final String toString() {
            return "Dismissed";
        }
    }

    public final class OptionTapped implements MoneybotStaticPickerViewEvent {
        public final String value;

        public OptionTapped(String str) {
            str.getClass();
            this.value = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OptionTapped) && Intrinsics.areEqual(this.value, ((OptionTapped) obj).value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OptionTapped(value=", this.value, ")");
        }
    }
}
