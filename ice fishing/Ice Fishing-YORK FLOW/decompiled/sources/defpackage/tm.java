package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class tm {
    public static final /* synthetic */ defpackage.tm[] P05cfTpS5W5L;
    public static final defpackage.tm QiMR8OkAhezm;
    public static final defpackage.tm WDYagTQQm9ns;
    public static final defpackage.tm oh71FJcDz6S2;

    static {
        defpackage.tm tmVar = new defpackage.tm("COROUTINE_SUSPENDED", 0);
        WDYagTQQm9ns = tmVar;
        defpackage.tm tmVar2 = new defpackage.tm("UNDECIDED", 1);
        oh71FJcDz6S2 = tmVar2;
        defpackage.tm tmVar3 = new defpackage.tm("RESUMED", 2);
        QiMR8OkAhezm = tmVar3;
        P05cfTpS5W5L = new defpackage.tm[]{tmVar, tmVar2, tmVar3};
    }

    public static defpackage.tm valueOf(java.lang.String str) {
        return (defpackage.tm) java.lang.Enum.valueOf(defpackage.tm.class, str);
    }

    public static defpackage.tm[] values() {
        return (defpackage.tm[]) P05cfTpS5W5L.clone();
    }
}
