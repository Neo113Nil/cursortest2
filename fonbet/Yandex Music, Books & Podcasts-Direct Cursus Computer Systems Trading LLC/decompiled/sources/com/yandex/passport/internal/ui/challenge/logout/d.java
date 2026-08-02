package com.yandex.passport.internal.ui.challenge.logout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {
    public static final d0 a;
    public static final d b;
    public static final d c;
    public static final /* synthetic */ d[] d;

    static {
        d dVar = new d("DROP_CLIENT_TOKEN", 0);
        b = dVar;
        d dVar2 = new d("DROP_X_TOKEN", 1);
        c = dVar2;
        d = new d[]{dVar, dVar2};
        a = new d0();
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) d.clone();
    }
}
