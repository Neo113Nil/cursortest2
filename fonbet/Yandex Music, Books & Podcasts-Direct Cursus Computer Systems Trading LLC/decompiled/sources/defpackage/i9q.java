package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class i9q {
    public static final i9q a;
    public static final i9q b;
    public static final i9q c;
    public static final /* synthetic */ i9q[] d;

    static {
        i9q i9qVar = new i9q("Regular", 0);
        a = i9qVar;
        i9q i9qVar2 = new i9q("Error", 1);
        b = i9qVar2;
        i9q i9qVar3 = new i9q("Offline", 2);
        c = i9qVar3;
        d = new i9q[]{i9qVar, i9qVar2, i9qVar3};
    }

    public static i9q valueOf(String str) {
        return (i9q) Enum.valueOf(i9q.class, str);
    }

    public static i9q[] values() {
        return (i9q[]) d.clone();
    }
}
