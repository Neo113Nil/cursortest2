package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class fn {
    public static final /* synthetic */ defpackage.fn[] P05cfTpS5W5L;
    public static final defpackage.fn QiMR8OkAhezm;
    public static final defpackage.fn WDYagTQQm9ns;
    public static final defpackage.fn oh71FJcDz6S2;

    static {
        defpackage.fn fnVar = new defpackage.fn("None", 0);
        WDYagTQQm9ns = fnVar;
        defpackage.fn fnVar2 = new defpackage.fn("Cancelled", 1);
        oh71FJcDz6S2 = fnVar2;
        defpackage.fn fnVar3 = new defpackage.fn("Redirected", 2);
        QiMR8OkAhezm = fnVar3;
        P05cfTpS5W5L = new defpackage.fn[]{fnVar, fnVar2, fnVar3, new defpackage.fn("RedirectCancelled", 3)};
    }

    public static defpackage.fn valueOf(java.lang.String str) {
        return (defpackage.fn) java.lang.Enum.valueOf(defpackage.fn.class, str);
    }

    public static defpackage.fn[] values() {
        return (defpackage.fn[]) P05cfTpS5W5L.clone();
    }
}
