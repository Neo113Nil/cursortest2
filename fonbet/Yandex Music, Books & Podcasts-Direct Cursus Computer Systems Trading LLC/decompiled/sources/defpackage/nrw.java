package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class nrw {
    public static final nrw a;
    public static final nrw b;
    public static final nrw c;
    public static final /* synthetic */ nrw[] d;

    static {
        nrw nrwVar = new nrw("INITIAL", 0);
        a = nrwVar;
        nrw nrwVar2 = new nrw("IMPORTANT", 1);
        b = nrwVar2;
        nrw nrwVar3 = new nrw("REGULAR", 2);
        c = nrwVar3;
        d = new nrw[]{nrwVar, nrwVar2, nrwVar3};
    }

    public static nrw valueOf(String str) {
        return (nrw) Enum.valueOf(nrw.class, str);
    }

    public static nrw[] values() {
        return (nrw[]) d.clone();
    }
}
