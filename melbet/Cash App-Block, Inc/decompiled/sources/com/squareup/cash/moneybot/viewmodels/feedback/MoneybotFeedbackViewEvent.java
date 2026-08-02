package com.squareup.cash.moneybot.viewmodels.feedback;

import com.squareup.cash.moneybot.screens.MoneybotFeedbackOption;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface MoneybotFeedbackViewEvent {

    public final class CommentChanged implements MoneybotFeedbackViewEvent {
        public final String text;

        public CommentChanged(String str) {
            str.getClass();
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CommentChanged) && Intrinsics.areEqual(this.text, ((CommentChanged) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CommentChanged(text=", this.text, ")");
        }
    }

    public final class Dismissed implements MoneybotFeedbackViewEvent {
        public static final Dismissed INSTANCE = new Dismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismissed);
        }

        public final int hashCode() {
            return -26428859;
        }

        public final String toString() {
            return "Dismissed";
        }
    }

    public final class LearnMoreTapped implements MoneybotFeedbackViewEvent {
        public static final LearnMoreTapped INSTANCE = new LearnMoreTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LearnMoreTapped);
        }

        public final int hashCode() {
            return 333722689;
        }

        public final String toString() {
            return "LearnMoreTapped";
        }
    }

    public final class OptionSelected implements MoneybotFeedbackViewEvent {
        public final MoneybotFeedbackOption option;

        public OptionSelected(MoneybotFeedbackOption moneybotFeedbackOption) {
            moneybotFeedbackOption.getClass();
            this.option = moneybotFeedbackOption;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OptionSelected) && Intrinsics.areEqual(this.option, ((OptionSelected) obj).option);
        }

        public final int hashCode() {
            return this.option.hashCode();
        }

        public final String toString() {
            return "OptionSelected(option=" + this.option + ")";
        }
    }

    public final class SubmitTapped implements MoneybotFeedbackViewEvent {
        public static final SubmitTapped INSTANCE = new SubmitTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SubmitTapped);
        }

        public final int hashCode() {
            return -472925784;
        }

        public final String toString() {
            return "SubmitTapped";
        }
    }
}
