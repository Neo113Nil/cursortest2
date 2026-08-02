package com.squareup.cash.activity.analytics;

/* loaded from: classes5.dex */
public interface ActivityAnalyticsService {

    public enum TapElement {
        AVATAR("avatar"),
        ROW("row"),
        ACTION_BUTTON("action_button");

        public final String label;

        TapElement(String str) {
            this.label = str;
        }
    }
}
