package com.squareup.cash.fidesmo.api;

/* loaded from: classes6.dex */
public enum FidesmoAnimationLocationOverride {
    DEFAULT("Default"),
    /* JADX INFO: Fake field, exist only in values array */
    CENTER("Center"),
    /* JADX INFO: Fake field, exist only in values array */
    BOTTOM("Bottom"),
    /* JADX INFO: Fake field, exist only in values array */
    LEFT_HANDED("Left handed"),
    /* JADX INFO: Fake field, exist only in values array */
    FALL_THROUGH("Fall through");

    public final String displayName;

    FidesmoAnimationLocationOverride(String str) {
        this.displayName = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.displayName;
    }
}
