package com.yandex.passport.internal.ui.domik;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class w {
    public static final w a;
    public static final w b;
    public static final w c;
    public static final w d;
    public static final w e;
    public static final /* synthetic */ w[] f;

    static {
        w wVar = new w("BIND_PHONE", 0);
        a = wVar;
        w wVar2 = new w("SOCIAL_REGISTRATION", 1);
        b = wVar2;
        w wVar3 = new w("LITE_REGISTRATION", 2);
        c = wVar3;
        w wVar4 = new w("FORCE_UPGRADE", 3);
        d = wVar4;
        w wVar5 = new w("SKIP_VERIFY", 4);
        e = wVar5;
        f = new w[]{wVar, wVar2, wVar3, wVar4, wVar5};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f.clone();
    }
}
