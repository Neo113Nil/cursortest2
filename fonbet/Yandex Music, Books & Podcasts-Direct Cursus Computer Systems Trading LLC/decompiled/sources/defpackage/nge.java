package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class nge {
    public static final nge a;
    public static final nge b;
    public static final nge c;
    public static final /* synthetic */ nge[] d;

    static {
        nge ngeVar = new nge("SUCCESS", 0);
        a = ngeVar;
        nge ngeVar2 = new nge("RESTORING", 1);
        b = ngeVar2;
        nge ngeVar3 = new nge("ERROR", 2);
        c = ngeVar3;
        d = new nge[]{ngeVar, ngeVar2, ngeVar3};
    }

    public static nge valueOf(String str) {
        return (nge) Enum.valueOf(nge.class, str);
    }

    public static nge[] values() {
        return (nge[]) d.clone();
    }
}
