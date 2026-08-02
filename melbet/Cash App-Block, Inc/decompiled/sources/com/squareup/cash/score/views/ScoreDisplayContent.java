package com.squareup.cash.score.views;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes7.dex */
public interface ScoreDisplayContent {

    public final class AfterCelebrationScore implements ScoreDisplayContent {
        public static final AfterCelebrationScore INSTANCE = new AfterCelebrationScore();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AfterCelebrationScore);
        }

        public final int hashCode() {
            return 1767759313;
        }

        public final String toString() {
            return "AfterCelebrationScore";
        }
    }

    /* loaded from: classes6.dex */
    public final class Celebration implements ScoreDisplayContent {
        public final String text;

        public Celebration(String str) {
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Celebration) && this.text.equals(((Celebration) obj).text);
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Celebration(text=", this.text, ")");
        }
    }

    public final class Score implements ScoreDisplayContent {
        public static final Score INSTANCE = new Score();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Score);
        }

        public final int hashCode() {
            return 156556959;
        }

        public final String toString() {
            return "Score";
        }
    }
}
