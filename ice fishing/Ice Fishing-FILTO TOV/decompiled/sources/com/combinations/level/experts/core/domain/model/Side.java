package com.combinations.level.experts.core.domain.model;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class Side {
    public static final int ALL = 15;
    public static final int DOWN = 4;
    public static final int LEFT = 8;
    public static final int RIGHT = 2;
    public static final int UP = 1;
    public static final Side INSTANCE = new Side();
    private static final int[] entries = {1, 2, 4, 8};
    public static final int $stable = 8;

    private Side() {
    }

    public final int dx(int i) {
        if (i != 2) {
            return i != 8 ? 0 : -1;
        }
        return 1;
    }

    public final int dy(int i) {
        if (i != 1) {
            return i != 4 ? 0 : 1;
        }
        return -1;
    }

    public final int[] getEntries() {
        return entries;
    }

    public final int opposite(int i) {
        if (i == 1) {
            return 4;
        }
        if (i != 2) {
            return i != 4 ? 2 : 1;
        }
        return 8;
    }
}
