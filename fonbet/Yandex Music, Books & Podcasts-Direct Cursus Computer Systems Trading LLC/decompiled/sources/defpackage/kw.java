package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class kw {
    public static final kw a;
    public static final kw b;
    public static final kw c;
    public static final /* synthetic */ kw[] d;

    static {
        kw kwVar = new kw("NotPlaying", 0);
        a = kwVar;
        kw kwVar2 = new kw("Playing", 1);
        b = kwVar2;
        kw kwVar3 = new kw("Paused", 2);
        c = kwVar3;
        d = new kw[]{kwVar, kwVar2, kwVar3};
    }

    public static kw valueOf(String str) {
        return (kw) Enum.valueOf(kw.class, str);
    }

    public static kw[] values() {
        return (kw[]) d.clone();
    }
}
