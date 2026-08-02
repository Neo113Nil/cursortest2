package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class u7i {
    public static final u7i a;
    public static final u7i b;
    public static final u7i c;
    public static final /* synthetic */ u7i[] d;

    static {
        u7i u7iVar = new u7i("OLD", 0);
        a = u7iVar;
        u7i u7iVar2 = new u7i("ROW", 1);
        b = u7iVar2;
        u7i u7iVar3 = new u7i("GRID", 2);
        c = u7iVar3;
        d = new u7i[]{u7iVar, u7iVar2, u7iVar3};
    }

    public static u7i valueOf(String str) {
        return (u7i) Enum.valueOf(u7i.class, str);
    }

    public static u7i[] values() {
        return (u7i[]) d.clone();
    }
}
