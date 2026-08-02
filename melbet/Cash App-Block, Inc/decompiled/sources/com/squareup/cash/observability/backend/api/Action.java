package com.squareup.cash.observability.backend.api;

import java.util.Map;

/* loaded from: classes6.dex */
public interface Action {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public final class Type {
        public static final /* synthetic */ Type[] $VALUES;
        public static final Type CUSTOM;

        /* JADX INFO: Fake field, exist only in values array */
        Type EF0;

        static {
            Type type2 = new Type("TAP", 0);
            Type type3 = new Type("SCROLL", 1);
            Type type4 = new Type("SWIPE", 2);
            Type type5 = new Type("BACK", 3);
            Type type6 = new Type("CUSTOM", 4);
            CUSTOM = type6;
            $VALUES = new Type[]{type2, type3, type4, type5, type6};
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    Map getAttributes();

    String getName();

    Type getType();
}
