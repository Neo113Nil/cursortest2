package defpackage;

import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uft {
    public static final dml a;
    public static final Set b;
    public static final uft c;
    public static final uft d;
    public static final uft e;
    public static final uft f;
    public static final /* synthetic */ uft[] g;

    static {
        uft uftVar = new uft("LOSSLESS", 0);
        c = uftVar;
        uft uftVar2 = new uft("HIGH", 1);
        d = uftVar2;
        uft uftVar3 = new uft("LOW", 2);
        e = uftVar3;
        uft uftVar4 = new uft("AUTO", 3);
        f = uftVar4;
        g = new uft[]{uftVar, uftVar2, uftVar3, uftVar4};
        a = new dml();
        b = xz0.Y(new uft[]{uftVar4, uftVar, uftVar2, uftVar3});
    }

    public static uft valueOf(String str) {
        return (uft) Enum.valueOf(uft.class, str);
    }

    public static uft[] values() {
        return (uft[]) g.clone();
    }
}
