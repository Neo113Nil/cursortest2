package com.squareup.cash.moneybot.viewmodels.textinput;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface MoneybotTextInputViewEvent {

    public final class ContinueTapped implements MoneybotTextInputViewEvent {
        public final String text;

        public ContinueTapped(String str) {
            str.getClass();
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContinueTapped) && Intrinsics.areEqual(this.text, ((ContinueTapped) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ContinueTapped(text=", this.text, ")");
        }
    }

    public final class Dismissed implements MoneybotTextInputViewEvent {
        public static final Dismissed INSTANCE = new Dismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismissed);
        }

        public final int hashCode() {
            return -1761396075;
        }

        public final String toString() {
            return "Dismissed";
        }
    }
}
