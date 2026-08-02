package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f5l {
    public static final f5l a;
    public static final f5l b;
    public static final f5l c;
    public static final /* synthetic */ f5l[] d;

    static {
        f5l f5lVar = new f5l("NotAvailable", 0);
        a = f5lVar;
        f5l f5lVar2 = new f5l("Disabled", 1);
        b = f5lVar2;
        f5l f5lVar3 = new f5l("Enabled", 2);
        c = f5lVar3;
        d = new f5l[]{f5lVar, f5lVar2, f5lVar3};
    }

    public static f5l valueOf(String str) {
        return (f5l) Enum.valueOf(f5l.class, str);
    }

    public static f5l[] values() {
        return (f5l[]) d.clone();
    }
}
