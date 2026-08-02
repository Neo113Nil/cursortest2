package com.squareup.cash.score.applets.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.lending.CashCreditScoreEntryPointData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface ScoreAppletTileViewModel {

    public final class Failure implements ScoreAppletTileViewModel {
        public final Exception cause;
        public final String title;

        public Failure(String str, Exception exc) {
            str.getClass();
            this.title = str;
            this.cause = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) obj;
            return Intrinsics.areEqual(this.title, failure.title) && this.cause.equals(failure.cause);
        }

        public final int hashCode() {
            return this.cause.hashCode() + (this.title.hashCode() * 31);
        }

        public final String toString() {
            return "Failure(title=" + this.title + ", cause=" + this.cause + ")";
        }
    }

    public final class Installed implements ScoreAppletTileViewModel {
        public final CashCreditScoreEntryPointData.Action action;
        public final List graphItems;
        public final String scoreText;
        public final Subtitle subtitle;
        public final String title;

        public final class Subtitle {
            public final String accessibilityDescription;
            public final String brief;
            public final String emphasis;

            public Subtitle(String str, String str2, String str3) {
                this.emphasis = str;
                this.brief = str2;
                this.accessibilityDescription = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Subtitle)) {
                    return false;
                }
                Subtitle subtitle = (Subtitle) obj;
                return Intrinsics.areEqual(this.emphasis, subtitle.emphasis) && Intrinsics.areEqual(this.brief, subtitle.brief) && Intrinsics.areEqual(this.accessibilityDescription, subtitle.accessibilityDescription);
            }

            public final int hashCode() {
                String str = this.emphasis;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.brief;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.accessibilityDescription;
                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Subtitle(emphasis=", this.emphasis, ", brief=", this.brief, ", accessibilityDescription="), this.accessibilityDescription, ")");
            }
        }

        public Installed(String str, String str2, Subtitle subtitle, List list, CashCreditScoreEntryPointData.Action action) {
            str.getClass();
            str2.getClass();
            list.getClass();
            action.getClass();
            this.title = str;
            this.scoreText = str2;
            this.subtitle = subtitle;
            this.graphItems = list;
            this.action = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Installed)) {
                return false;
            }
            Installed installed = (Installed) obj;
            return Intrinsics.areEqual(this.title, installed.title) && Intrinsics.areEqual(this.scoreText, installed.scoreText) && this.subtitle.equals(installed.subtitle) && Intrinsics.areEqual(this.graphItems, installed.graphItems) && Intrinsics.areEqual(this.action, installed.action);
        }

        public final int hashCode() {
            return this.action.hashCode() + Recorder$$ExternalSyntheticOutline2.m((this.subtitle.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.scoreText)) * 31, 31, this.graphItems);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Installed(title=", this.title, ", scoreText=", this.scoreText, ", subtitle=");
            m.append(this.subtitle);
            m.append(", graphItems=");
            m.append(this.graphItems);
            m.append(", action=");
            m.append(this.action);
            m.append(")");
            return m.toString();
        }
    }

    public final class Loading implements ScoreAppletTileViewModel {
        public final String title;

        public Loading(String str) {
            str.getClass();
            this.title = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && Intrinsics.areEqual(this.title, ((Loading) obj).title);
        }

        public final int hashCode() {
            return this.title.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loading(title=", this.title, ")");
        }
    }

    /* loaded from: classes6.dex */
    public final class Uninstalled implements ScoreAppletTileViewModel {
        public final CashCreditScoreEntryPointData.Action action;
        public final String subtitle;
        public final String title;

        public Uninstalled(String str, String str2, CashCreditScoreEntryPointData.Action action) {
            str.getClass();
            action.getClass();
            this.title = str;
            this.subtitle = str2;
            this.action = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Uninstalled)) {
                return false;
            }
            Uninstalled uninstalled = (Uninstalled) obj;
            return Intrinsics.areEqual(this.title, uninstalled.title) && this.subtitle.equals(uninstalled.subtitle) && Intrinsics.areEqual(this.action, uninstalled.action);
        }

        public final int hashCode() {
            return this.action.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Uninstalled(title=", this.title, ", subtitle=", this.subtitle, ", action=");
            m.append(this.action);
            m.append(")");
            return m.toString();
        }
    }
}
