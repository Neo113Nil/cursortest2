package com.yandex.passport.internal.ui.social.gimap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class i {
    public static final i a;
    public static final i b;
    public static final i c;
    public static final /* synthetic */ i[] d;

    static {
        i iVar = new i("CHECK_PROVIDER", 0);
        a = iVar;
        i iVar2 = new i("LOGIN", 1);
        b = iVar2;
        i iVar3 = new i("ERROR", 2);
        c = iVar3;
        d = new i[]{iVar, iVar2, iVar3};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) d.clone();
    }
}
