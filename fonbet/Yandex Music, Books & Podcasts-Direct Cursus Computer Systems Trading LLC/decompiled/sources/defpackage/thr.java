package defpackage;

import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class thr {
    public static final hil a;
    public static final List b;
    public static final thr c;
    public static final thr d;
    public static final /* synthetic */ thr[] e;

    static {
        thr thrVar = new thr("EXTERNAL", 0);
        c = thrVar;
        thr thrVar2 = new thr("SDCARD", 1);
        d = thrVar2;
        e = new thr[]{thrVar, thrVar2};
        a = new hil();
        b = u75.h(thrVar, thrVar2);
    }

    public static thr valueOf(String str) {
        return (thr) Enum.valueOf(thr.class, str);
    }

    public static thr[] values() {
        return (thr[]) e.clone();
    }
}
