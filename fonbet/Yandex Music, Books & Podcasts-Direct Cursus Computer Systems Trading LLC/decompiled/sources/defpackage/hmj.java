package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class hmj {
    public static final hmj a;
    public static final hmj b;
    public static final hmj c;
    public static final hmj d;
    public static final /* synthetic */ hmj[] e;

    static {
        hmj hmjVar = new hmj("REGULAR", 0);
        a = hmjVar;
        hmj hmjVar2 = new hmj("COLLECTION", 1);
        b = hmjVar2;
        hmj hmjVar3 = new hmj("SEARCH", 2);
        c = hmjVar3;
        hmj hmjVar4 = new hmj("PROFILE", 3);
        d = hmjVar4;
        e = new hmj[]{hmjVar, hmjVar2, hmjVar3, hmjVar4};
    }

    public static hmj valueOf(String str) {
        return (hmj) Enum.valueOf(hmj.class, str);
    }

    public static hmj[] values() {
        return (hmj[]) e.clone();
    }
}
