package com.squareup.cash.blockers.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class ReferralCodeViewEvent {

    /* loaded from: classes5.dex */
    public final class CodeInputChanged extends ReferralCodeViewEvent {
        public final CharSequence codeInput;

        public CodeInputChanged(CharSequence charSequence) {
            charSequence.getClass();
            this.codeInput = charSequence;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CodeInputChanged) && Intrinsics.areEqual(this.codeInput, ((CodeInputChanged) obj).codeInput);
        }

        public final int hashCode() {
            return this.codeInput.hashCode();
        }

        public final String toString() {
            return "CodeInputChanged(codeInput=" + ((Object) this.codeInput) + ")";
        }
    }

    /* loaded from: classes7.dex */
    public final class GoBack extends ReferralCodeViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return -1042264562;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    /* loaded from: classes5.dex */
    public final class SkipAction extends ReferralCodeViewEvent {
        public static final SkipAction INSTANCE = new SkipAction();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SkipAction);
        }

        public final int hashCode() {
            return -222672588;
        }

        public final String toString() {
            return "SkipAction";
        }
    }

    /* loaded from: classes5.dex */
    public final class SubmitAction extends ReferralCodeViewEvent {
        public final String code;

        public SubmitAction(String str) {
            str.getClass();
            this.code = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SubmitAction) && Intrinsics.areEqual(this.code, ((SubmitAction) obj).code);
        }

        public final int hashCode() {
            return this.code.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SubmitAction(code=", this.code, ")");
        }
    }
}
