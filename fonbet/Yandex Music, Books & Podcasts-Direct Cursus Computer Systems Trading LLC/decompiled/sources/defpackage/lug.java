package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class lug {
    public static final lug a;
    public static final lug b;
    public static final lug c;
    public static final /* synthetic */ lug[] d;

    static {
        lug lugVar = new lug("Success", 0);
        a = lugVar;
        lug lugVar2 = new lug("Fail", 1);
        b = lugVar2;
        lug lugVar3 = new lug("Cancel", 2);
        c = lugVar3;
        d = new lug[]{lugVar, lugVar2, lugVar3};
    }

    public static lug valueOf(String str) {
        return (lug) Enum.valueOf(lug.class, str);
    }

    public static lug[] values() {
        return (lug[]) d.clone();
    }
}
