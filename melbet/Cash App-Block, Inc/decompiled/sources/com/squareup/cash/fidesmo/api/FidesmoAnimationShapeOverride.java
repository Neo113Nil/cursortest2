package com.squareup.cash.fidesmo.api;

/* loaded from: classes6.dex */
public enum FidesmoAnimationShapeOverride {
    DEFAULT("Default"),
    /* JADX INFO: Fake field, exist only in values array */
    STAR("Star"),
    /* JADX INFO: Fake field, exist only in values array */
    HEART("Heart"),
    /* JADX INFO: Fake field, exist only in values array */
    MINI_CARD("Mini-card");

    public final String displayName;

    FidesmoAnimationShapeOverride(String str) {
        this.displayName = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.displayName;
    }
}
