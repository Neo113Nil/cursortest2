package defpackage;

import com.yandex.mapkit.directions.driving.Action;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class vc50 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Action.values().length];
        try {
            iArr[Action.STRAIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Action.SLIGHT_LEFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Action.SLIGHT_RIGHT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Action.LEFT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Action.RIGHT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Action.HARD_LEFT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[Action.HARD_RIGHT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[Action.FORK_LEFT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[Action.FORK_RIGHT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[Action.UTURN_LEFT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[Action.UTURN_RIGHT.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[Action.ENTER_ROUNDABOUT.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[Action.LEAVE_ROUNDABOUT.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[Action.BOARD_FERRY.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[Action.LEAVE_FERRY.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[Action.EXIT_LEFT.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[Action.EXIT_RIGHT.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[Action.FINISH.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[Action.UNKNOWN.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[Action.WAYPOINT.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        a = iArr;
    }
}
