package com.squareup.cash.checks;

/* loaded from: classes6.dex */
public abstract class VerifyCheckDepositViewEvent {

    public final class CaptureCheckImage extends VerifyCheckDepositViewEvent {
        public final Face face;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Face {
            public static final /* synthetic */ Face[] $VALUES;
            public static final Face BACK;
            public static final Face FRONT;

            static {
                Face face = new Face("FRONT", 0);
                FRONT = face;
                Face face2 = new Face("BACK", 1);
                BACK = face2;
                $VALUES = new Face[]{face, face2};
            }

            public static Face valueOf(String str) {
                return (Face) Enum.valueOf(Face.class, str);
            }

            public static Face[] values() {
                return (Face[]) $VALUES.clone();
            }
        }

        public CaptureCheckImage(Face face) {
            this.face = face;
        }
    }

    public final class Exit extends VerifyCheckDepositViewEvent {
        public static final Exit INSTANCE = new Exit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Exit);
        }

        public final int hashCode() {
            return -322614121;
        }

        public final String toString() {
            return "Exit";
        }
    }

    public final class GoBack extends VerifyCheckDepositViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return -746755288;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class Submit extends VerifyCheckDepositViewEvent {
        public static final Submit INSTANCE = new Submit();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Submit);
        }

        public final int hashCode() {
            return -396699311;
        }

        public final String toString() {
            return "Submit";
        }
    }
}
