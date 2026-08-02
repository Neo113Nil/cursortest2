package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class nef {
    public static final nef a;
    public static final nef b;
    public static final nef c;
    public static final /* synthetic */ nef[] d;

    static {
        nef nefVar = new nef("ADDED_DATE", 0);
        a = nefVar;
        nef nefVar2 = new nef("UPDATE_DATE", 1);
        b = nefVar2;
        nef nefVar3 = new nef("ALPHABET", 2);
        c = nefVar3;
        d = new nef[]{nefVar, nefVar2, nefVar3};
    }

    public static nef valueOf(String str) {
        return (nef) Enum.valueOf(nef.class, str);
    }

    public static nef[] values() {
        return (nef[]) d.clone();
    }
}
