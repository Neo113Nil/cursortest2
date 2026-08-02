package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l7l {
    public static final l7l a;
    public static final l7l b;
    public static final l7l c;
    public static final /* synthetic */ l7l[] d;

    static {
        l7l l7lVar = new l7l("Idle", 0);
        a = l7lVar;
        l7l l7lVar2 = new l7l("PreparingQueue", 1);
        b = l7lVar2;
        l7l l7lVar3 = new l7l("Ready", 2);
        c = l7lVar3;
        d = new l7l[]{l7lVar, l7lVar2, l7lVar3};
    }

    public static l7l valueOf(String str) {
        return (l7l) Enum.valueOf(l7l.class, str);
    }

    public static l7l[] values() {
        return (l7l[]) d.clone();
    }
}
