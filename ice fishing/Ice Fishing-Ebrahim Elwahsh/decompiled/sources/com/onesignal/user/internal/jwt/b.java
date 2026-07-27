package com.onesignal.user.internal.jwt;

import kotlin.jvm.internal.e;
import y7.InterfaceC5255a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ InterfaceC5255a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final a Companion;
    public static final b UNKNOWN = new b("UNKNOWN", 0);
    public static final b NOT_REQUIRED = new b("NOT_REQUIRED", 1);
    public static final b REQUIRED = new b("REQUIRED", 2);

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        public final b fromBoolean(Boolean bool) {
            if (bool == null) {
                return b.UNKNOWN;
            }
            if (bool.equals(Boolean.FALSE)) {
                return b.NOT_REQUIRED;
            }
            if (bool.equals(Boolean.TRUE)) {
                return b.REQUIRED;
            }
            throw new B0.c();
        }

        private a() {
        }
    }

    private static final /* synthetic */ b[] $values() {
        return new b[]{UNKNOWN, NOT_REQUIRED, REQUIRED};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = W2.e.d($values);
        Companion = new a(null);
    }

    private b(String str, int i) {
    }

    public static InterfaceC5255a getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
