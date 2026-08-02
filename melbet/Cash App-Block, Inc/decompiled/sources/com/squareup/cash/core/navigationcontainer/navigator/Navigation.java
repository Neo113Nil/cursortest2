package com.squareup.cash.core.navigationcontainer.navigator;

import app.cash.broadway.presenter.SavedState;
import app.cash.broadway.screen.Question;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface Navigation {

    public final class Reset implements Navigation {
        public static final Reset INSTANCE = new Reset();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Reset);
        }

        public final int hashCode() {
            return 8010698;
        }

        public final String toString() {
            return "Reset";
        }
    }

    public interface ScreenNavigation extends Navigation {

        /* loaded from: classes6.dex */
        public final class AskQuestion implements Navigation {
            public final Screen initiatorScreen;
            public final String initiatorStateKey;
            public final Question question;
            public final String questionId;
            public final Screen screen;

            public AskQuestion(Screen screen, String str, Question question, Screen screen2, String str2) {
                question.getClass();
                screen2.getClass();
                str2.getClass();
                this.screen = screen;
                this.questionId = str;
                this.question = question;
                this.initiatorScreen = screen2;
                this.initiatorStateKey = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AskQuestion)) {
                    return false;
                }
                AskQuestion askQuestion = (AskQuestion) obj;
                return this.screen.equals(askQuestion.screen) && this.questionId.equals(askQuestion.questionId) && Intrinsics.areEqual(this.question, askQuestion.question) && Intrinsics.areEqual(this.initiatorScreen, askQuestion.initiatorScreen) && Intrinsics.areEqual(this.initiatorStateKey, askQuestion.initiatorStateKey);
            }

            public final Screen getInitiatorScreen() {
                return this.initiatorScreen;
            }

            public final String getInitiatorStateKey() {
                return this.initiatorStateKey;
            }

            public final String getQuestionId() {
                return this.questionId;
            }

            public final Screen getScreen() {
                return this.screen;
            }

            public final int hashCode() {
                return this.initiatorStateKey.hashCode() + BalanceFeedKt$$ExternalSyntheticOutline0.m(this.initiatorScreen, (this.question.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.screen.hashCode() * 31, 31, this.questionId)) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AskQuestion(screen=");
                sb.append(this.screen);
                sb.append(", questionId=");
                sb.append(this.questionId);
                sb.append(", question=");
                sb.append(this.question);
                sb.append(", initiatorScreen=");
                sb.append(this.initiatorScreen);
                sb.append(", initiatorStateKey=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.initiatorStateKey, ")");
            }
        }

        /* loaded from: classes6.dex */
        public final class GiveAnswer implements Navigation {
            public final Object answerValue;
            public final Screen initiatorScreen;
            public final String initiatorStateKey;
            public final Question question;
            public final String questionId;

            public GiveAnswer(String str, Question question, Object obj, Screen screen, String str2) {
                obj.getClass();
                screen.getClass();
                str2.getClass();
                this.questionId = str;
                this.question = question;
                this.answerValue = obj;
                this.initiatorScreen = screen;
                this.initiatorStateKey = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GiveAnswer)) {
                    return false;
                }
                GiveAnswer giveAnswer = (GiveAnswer) obj;
                return this.questionId.equals(giveAnswer.questionId) && this.question.equals(giveAnswer.question) && Intrinsics.areEqual(this.answerValue, giveAnswer.answerValue) && Intrinsics.areEqual(this.initiatorScreen, giveAnswer.initiatorScreen) && Intrinsics.areEqual(this.initiatorStateKey, giveAnswer.initiatorStateKey);
            }

            public final Object getAnswerValue() {
                return this.answerValue;
            }

            public final Screen getInitiatorScreen() {
                return this.initiatorScreen;
            }

            public final String getInitiatorStateKey() {
                return this.initiatorStateKey;
            }

            public final Question getQuestion() {
                return this.question;
            }

            public final String getQuestionId() {
                return this.questionId;
            }

            public final int hashCode() {
                return this.initiatorStateKey.hashCode() + BalanceFeedKt$$ExternalSyntheticOutline0.m(this.initiatorScreen, (this.answerValue.hashCode() + ((this.question.hashCode() + (this.questionId.hashCode() * 31)) * 31)) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("GiveAnswer(questionId=");
                sb.append(this.questionId);
                sb.append(", question=");
                sb.append(this.question);
                sb.append(", answerValue=");
                sb.append(this.answerValue);
                sb.append(", initiatorScreen=");
                sb.append(this.initiatorScreen);
                sb.append(", initiatorStateKey=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.initiatorStateKey, ")");
            }
        }

        public final class GoTo implements ScreenNavigation {
            public final Screen initiatorScreen;
            public final String initiatorStateKey;
            public final boolean overridden;
            public final Screen targetScreen;

            public GoTo(Screen screen, Screen screen2, String str, boolean z) {
                screen.getClass();
                this.targetScreen = screen;
                this.initiatorScreen = screen2;
                this.initiatorStateKey = str;
                this.overridden = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof GoTo)) {
                    return false;
                }
                GoTo goTo = (GoTo) obj;
                return Intrinsics.areEqual(this.targetScreen, goTo.targetScreen) && Intrinsics.areEqual(this.initiatorScreen, goTo.initiatorScreen) && Intrinsics.areEqual(this.initiatorStateKey, goTo.initiatorStateKey) && this.overridden == goTo.overridden;
            }

            @Override // com.squareup.cash.core.navigationcontainer.navigator.Navigation.ScreenNavigation
            public final Screen getTargetScreen() {
                return this.targetScreen;
            }

            public final int hashCode() {
                int hashCode = this.targetScreen.hashCode() * 31;
                Screen screen = this.initiatorScreen;
                int hashCode2 = (hashCode + (screen == null ? 0 : screen.hashCode())) * 31;
                String str = this.initiatorStateKey;
                return Boolean.hashCode(this.overridden) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("GoTo(targetScreen=");
                sb.append(this.targetScreen);
                sb.append(", initiatorScreen=");
                sb.append(this.initiatorScreen);
                sb.append(", initiatorStateKey=");
                return re$$ExternalSyntheticOutline0.m(sb, this.initiatorStateKey, ", overridden=", this.overridden, ")");
            }
        }

        /* loaded from: classes6.dex */
        public final class ResetBefore implements Navigation {
            public final Screen ownerScreen;
            public final String ownerStateKey;
            public final String questionId;

            public ResetBefore(Screen screen, String str, String str2) {
                screen.getClass();
                str2.getClass();
                this.questionId = str;
                this.ownerScreen = screen;
                this.ownerStateKey = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ResetBefore)) {
                    return false;
                }
                ResetBefore resetBefore = (ResetBefore) obj;
                return this.questionId.equals(resetBefore.questionId) && Intrinsics.areEqual(this.ownerScreen, resetBefore.ownerScreen) && Intrinsics.areEqual(this.ownerStateKey, resetBefore.ownerStateKey);
            }

            public final Screen getOwnerScreen() {
                return this.ownerScreen;
            }

            public final String getOwnerStateKey() {
                return this.ownerStateKey;
            }

            public final String getQuestionId() {
                return this.questionId;
            }

            public final int hashCode() {
                return this.ownerStateKey.hashCode() + BalanceFeedKt$$ExternalSyntheticOutline0.m(this.ownerScreen, this.questionId.hashCode() * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ResetBefore(questionId=");
                sb.append(this.questionId);
                sb.append(", ownerScreen=");
                sb.append(this.ownerScreen);
                sb.append(", ownerStateKey=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.ownerStateKey, ")");
            }
        }

        public final class Restore implements ScreenNavigation {
            public final SavedState savedState;
            public final String stateKey;
            public final Screen targetScreen;

            public Restore(Screen screen, String str, SavedState savedState) {
                this.targetScreen = screen;
                this.stateKey = str;
                this.savedState = savedState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Restore)) {
                    return false;
                }
                Restore restore = (Restore) obj;
                return this.targetScreen.equals(restore.targetScreen) && this.stateKey.equals(restore.stateKey) && Intrinsics.areEqual(this.savedState, restore.savedState);
            }

            @Override // com.squareup.cash.core.navigationcontainer.navigator.Navigation.ScreenNavigation
            public final Screen getTargetScreen() {
                return this.targetScreen;
            }

            public final int hashCode() {
                int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.targetScreen.hashCode() * 31, 31, this.stateKey);
                SavedState savedState = this.savedState;
                return m + (savedState == null ? 0 : savedState.value.hashCode());
            }

            public final String toString() {
                return "Restore(targetScreen=" + this.targetScreen + ", stateKey=" + this.stateKey + ", savedState=" + this.savedState + ")";
            }
        }

        Screen getTargetScreen();
    }
}
