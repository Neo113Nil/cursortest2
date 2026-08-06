package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ny {
    public static final defpackage.ny WDYagTQQm9ns;
    public static final /* synthetic */ defpackage.ny[] oh71FJcDz6S2;

    /* JADX INFO: Fake field, exist only in values array */
    defpackage.ny EF0;

    static {
        defpackage.ny nyVar = new defpackage.ny("Visible", 0);
        defpackage.ny nyVar2 = new defpackage.ny("Clip", 1);
        WDYagTQQm9ns = nyVar2;
        oh71FJcDz6S2 = new defpackage.ny[]{nyVar, nyVar2, new defpackage.ny("ExpandIndicator", 2), new defpackage.ny("ExpandOrCollapseIndicator", 3)};
    }

    public static defpackage.ny valueOf(java.lang.String str) {
        return (defpackage.ny) java.lang.Enum.valueOf(defpackage.ny.class, str);
    }

    public static defpackage.ny[] values() {
        return (defpackage.ny[]) oh71FJcDz6S2.clone();
    }
}
