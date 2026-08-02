package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class fel {
    public static final fel a;
    public static final fel b;
    public static final fel c;
    public static final /* synthetic */ fel[] d;

    static {
        fel felVar = new fel("CONCERT", 0);
        a = felVar;
        fel felVar2 = new fel("DONATION", 1);
        b = felVar2;
        fel felVar3 = new fel("COMMON", 2);
        c = felVar3;
        d = new fel[]{felVar, felVar2, felVar3};
    }

    public static fel valueOf(String str) {
        return (fel) Enum.valueOf(fel.class, str);
    }

    public static fel[] values() {
        return (fel[]) d.clone();
    }
}
