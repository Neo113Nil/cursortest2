package com.combinations.level.experts.core.domain.model;

import defpackage.mr0;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class LevelResult {
    public static final int $stable = 0;
    private final int bestMoves;
    private final long bestTimeMs;
    private final int stars;

    public LevelResult(int i, int i2, long j) {
        this.stars = i;
        this.bestMoves = i2;
        this.bestTimeMs = j;
    }

    public static /* synthetic */ LevelResult copy$default(LevelResult levelResult, int i, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = levelResult.stars;
        }
        if ((i3 & 2) != 0) {
            i2 = levelResult.bestMoves;
        }
        if ((i3 & 4) != 0) {
            j = levelResult.bestTimeMs;
        }
        return levelResult.copy(i, i2, j);
    }

    public final int component1() {
        return this.stars;
    }

    public final int component2() {
        return this.bestMoves;
    }

    public final long component3() {
        return this.bestTimeMs;
    }

    public final LevelResult copy(int i, int i2, long j) {
        return new LevelResult(i, i2, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelResult)) {
            return false;
        }
        LevelResult levelResult = (LevelResult) obj;
        return this.stars == levelResult.stars && this.bestMoves == levelResult.bestMoves && this.bestTimeMs == levelResult.bestTimeMs;
    }

    public final int getBestMoves() {
        return this.bestMoves;
    }

    public final long getBestTimeMs() {
        return this.bestTimeMs;
    }

    public final int getStars() {
        return this.stars;
    }

    public int hashCode() {
        return Long.hashCode(this.bestTimeMs) + mr0.Yi7zF1RB1(this.bestMoves, Integer.hashCode(this.stars) * 31, 31);
    }

    public String toString() {
        return "LevelResult(stars=" + this.stars + ", bestMoves=" + this.bestMoves + ", bestTimeMs=" + this.bestTimeMs + ")";
    }
}
