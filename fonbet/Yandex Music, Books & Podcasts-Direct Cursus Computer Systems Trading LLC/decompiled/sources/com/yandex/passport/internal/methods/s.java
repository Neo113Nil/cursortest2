package com.yandex.passport.internal.methods;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class s {
    public static final s a;
    public static final /* synthetic */ s[] b;

    static {
        s sVar = new s("COMPOSE_MANAGING_DEVICES_SCREEN", 0);
        a = sVar;
        b = new s[]{sVar};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) b.clone();
    }
}
