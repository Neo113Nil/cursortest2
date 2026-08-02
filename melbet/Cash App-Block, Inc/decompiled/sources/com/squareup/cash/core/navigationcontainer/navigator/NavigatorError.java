package com.squareup.cash.core.navigationcontainer.navigator;

import app.cash.broadway.screen.Question;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.screens.Finish;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError;", "Lcom/squareup/cash/observability/types/ReportedError;", "RestoredWithStackAndNoFullScreen", "SavedWithNonEmptyQueue", "SavedWithStackAndNoFullScreen", "BackEventTimeoutNoTabs", "PausedGoTo", "PausedAskQuestion", "PausedGiveAnswer", "NothingToFinish", "Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError$BackEventTimeoutNoTabs;", "Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError$NothingToFinish;", "Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError$PausedAskQuestion;", "Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError$PausedGiveAnswer;", "Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError$PausedGoTo;", "Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError$RestoredWithStackAndNoFullScreen;", "Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError$SavedWithNonEmptyQueue;", "Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError$SavedWithStackAndNoFullScreen;", "navigator"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class NavigatorError extends ReportedError {
    public final Set features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Navigation.INSTANCE);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError$BackEventTimeoutNoTabs;", "Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError;", "navigator"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class BackEventTimeoutNoTabs extends NavigatorError {
        public final String message = "Timeout waiting for tab information while attempting to process system back event.";

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError$NothingToFinish;", "Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError;", "navigator"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class NothingToFinish extends NavigatorError {
        public final String message;
        public final Map metadata;

        public NothingToFinish(Finish finish, Screen screen) {
            finish.getClass();
            Object obj = finish.result;
            this.message = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Cannot handle Finish(", ") because there is nothing to finish.", obj);
            this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("Navigation", MapsKt__MapsKt.mapOf(new Pair("result", String.valueOf(obj)), new Pair("currentFullScreen", String.valueOf(screen))));
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final Map getMetadata() {
            return this.metadata;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError$PausedAskQuestion;", "Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError;", "navigator"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PausedAskQuestion extends NavigatorError {
        public final String message;
        public final Map metadata;

        public PausedAskQuestion(String str, Screen screen, Question question) {
            str.getClass();
            screen.getClass();
            question.getClass();
            this.message = re$$ExternalSyntheticOutline0.m(screen, "Paused presenter for ", " is attempting to ask a question.");
            this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("Navigation", MapsKt__MapsKt.mapOf(new Pair("initiatorStateKey", str), new Pair("initiatorScreen", screen), new Pair("question", question)));
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final Map getMetadata() {
            return this.metadata;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError$PausedGiveAnswer;", "Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError;", "navigator"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PausedGiveAnswer extends NavigatorError {
        public final String message;
        public final Map metadata;

        public PausedGiveAnswer(String str, Screen screen, String str2, Question question) {
            str.getClass();
            screen.getClass();
            this.message = re$$ExternalSyntheticOutline0.m(screen, "Paused presenter for ", " is attempting to give an answer.");
            this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("Navigation", MapsKt__MapsKt.mapOf(new Pair("initiatorStateKey", str), new Pair("initiatorScreen", screen), new Pair("questionId", str2), new Pair("question", question)));
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final Map getMetadata() {
            return this.metadata;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError$PausedGoTo;", "Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError;", "navigator"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PausedGoTo extends NavigatorError {
        public final String message;
        public final Map metadata;

        public PausedGoTo(Screen screen, Screen screen2, String str) {
            str.getClass();
            screen.getClass();
            screen2.getClass();
            this.message = re$$ExternalSyntheticOutline0.m(screen, "Paused presenter for ", " is attempting to navigate.");
            this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("Navigation", MapsKt__MapsKt.mapOf(new Pair("initiatorStateKey", str), new Pair("initiatorScreen", screen), new Pair("targetScreen", screen2)));
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        @Override // com.squareup.cash.observability.types.ReportedError
        public final Map getMetadata() {
            return this.metadata;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError$RestoredWithStackAndNoFullScreen;", "Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError;", "navigator"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RestoredWithStackAndNoFullScreen extends NavigatorError {
        public final String message;

        public RestoredWithStackAndNoFullScreen(String str) {
            str.getClass();
            this.message = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BetterNavigator(", str, ") was restored with items in the back stack and no full screen.");
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError$SavedWithNonEmptyQueue;", "Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError;", "navigator"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SavedWithNonEmptyQueue extends NavigatorError {
        public final String message;

        public SavedWithNonEmptyQueue(String str, String str2, String str3) {
            str.getClass();
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BetterNavigator(", str, ") is being saved with items in the goTo queue. Full screen is ", str2, ", back stack is ");
            m.append(str3);
            this.message = m.toString();
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError$SavedWithStackAndNoFullScreen;", "Lcom/squareup/cash/core/navigationcontainer/navigator/NavigatorError;", "navigator"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class SavedWithStackAndNoFullScreen extends NavigatorError {
        public final String message;

        public SavedWithStackAndNoFullScreen(String str) {
            str.getClass();
            this.message = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BetterNavigator(", str, ") is being saved with items in the back stack and a null full screen.");
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }
    }

    @Override // com.squareup.cash.observability.types.FeatureError
    public final Set getFeatures() {
        return this.features;
    }
}
