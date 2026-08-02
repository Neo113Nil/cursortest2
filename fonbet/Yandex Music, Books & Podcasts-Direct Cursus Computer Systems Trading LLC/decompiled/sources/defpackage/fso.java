package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class fso {
    public static final fso a;
    public static final fso b;
    public static final fso c;
    public static final fso d;
    public static final fso e;
    public static final /* synthetic */ fso[] f;

    static {
        fso fsoVar = new fso("TopBar", 0);
        a = fsoVar;
        fso fsoVar2 = new fso("MainContent", 1);
        b = fsoVar2;
        fso fsoVar3 = new fso("Snackbar", 2);
        c = fsoVar3;
        fso fsoVar4 = new fso("Fab", 3);
        d = fsoVar4;
        fso fsoVar5 = new fso("BottomBar", 4);
        e = fsoVar5;
        f = new fso[]{fsoVar, fsoVar2, fsoVar3, fsoVar4, fsoVar5};
    }

    public static fso valueOf(String str) {
        return (fso) Enum.valueOf(fso.class, str);
    }

    public static fso[] values() {
        return (fso[]) f.clone();
    }
}
