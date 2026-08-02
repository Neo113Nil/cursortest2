package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class mmk {
    public static final mmk a;
    public static final mmk b;
    public static final mmk c;
    public static final /* synthetic */ mmk[] d;

    static {
        mmk mmkVar = new mmk("SHOW", 0);
        a = mmkVar;
        mmk mmkVar2 = new mmk("SHOW_IF_NOT_AUTHORIZED", 1);
        b = mmkVar2;
        mmk mmkVar3 = new mmk("SHOW_IF_HAS_NO_EMAIL", 2);
        c = mmkVar3;
        d = new mmk[]{mmkVar, mmkVar2, mmkVar3, new mmk("HIDE", 3)};
    }

    public static mmk valueOf(String str) {
        return (mmk) Enum.valueOf(mmk.class, str);
    }

    public static mmk[] values() {
        return (mmk[]) d.clone();
    }
}
