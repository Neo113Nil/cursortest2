package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.plaid.internal.c1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC0110c1 {
    public static final EnumC0110c1 BACKEND_DETERMINES;
    public static final EnumC0110c1 DISABLED;
    public static final EnumC0110c1 ENABLED;
    public static final /* synthetic */ EnumC0110c1[] a;
    public static final /* synthetic */ EnumEntries b;

    /* renamed from: com.plaid.internal.c1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0110c1.values().length];
            try {
                iArr[EnumC0110c1.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0110c1.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0110c1.BACKEND_DETERMINES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    static {
        EnumC0110c1 enumC0110c1 = new EnumC0110c1("ENABLED", 0);
        ENABLED = enumC0110c1;
        EnumC0110c1 enumC0110c12 = new EnumC0110c1("DISABLED", 1);
        DISABLED = enumC0110c12;
        EnumC0110c1 enumC0110c13 = new EnumC0110c1("BACKEND_DETERMINES", 2);
        BACKEND_DETERMINES = enumC0110c13;
        EnumC0110c1[] enumC0110c1Arr = {enumC0110c1, enumC0110c12, enumC0110c13};
        a = enumC0110c1Arr;
        b = new EnumEntriesList(enumC0110c1Arr);
    }

    public EnumC0110c1(String str, int i) {
    }

    public static EnumEntries getEntries() {
        return b;
    }

    public static EnumC0110c1 valueOf(String str) {
        return (EnumC0110c1) Enum.valueOf(EnumC0110c1.class, str);
    }

    public static EnumC0110c1[] values() {
        return (EnumC0110c1[]) a.clone();
    }

    public final boolean isSet() {
        return this != BACKEND_DETERMINES;
    }

    public final boolean toBoolean() {
        int i = a.a[ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        if (i != 3) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return false;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Cannot convert BACKEND_DETERMINES to boolean");
        return false;
    }
}
