package com.google.firebase.encoders.proto;

/* loaded from: classes4.dex */
public @interface Protobuf {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class IntEncoding {
        public static final /* synthetic */ IntEncoding[] $VALUES;
        public static final IntEncoding DEFAULT;

        static {
            IntEncoding intEncoding = new IntEncoding("DEFAULT", 0);
            DEFAULT = intEncoding;
            $VALUES = new IntEncoding[]{intEncoding, new IntEncoding("SIGNED", 1), new IntEncoding("FIXED", 2)};
        }

        public static IntEncoding valueOf(String str) {
            return (IntEncoding) Enum.valueOf(IntEncoding.class, str);
        }

        public static IntEncoding[] values() {
            return (IntEncoding[]) $VALUES.clone();
        }
    }

    IntEncoding intEncoding() default IntEncoding.DEFAULT;

    int tag();
}
