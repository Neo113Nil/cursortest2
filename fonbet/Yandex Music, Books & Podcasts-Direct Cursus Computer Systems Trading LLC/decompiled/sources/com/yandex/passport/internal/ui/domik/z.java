package com.yandex.passport.internal.ui.domik;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class z {
    public static final z a;
    public static final z b;
    public static final z c;
    public static final /* synthetic */ z[] d;

    static {
        z zVar = new z("REGISTRATION", 0);
        a = zVar;
        z zVar2 = new z("REGISTRATION_ACCOUNT_NOT_FOUND", 1);
        b = zVar2;
        z zVar3 = new z("LOGIN_RESTORE", 2);
        c = zVar3;
        d = new z[]{zVar, zVar2, zVar3};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) d.clone();
    }
}
