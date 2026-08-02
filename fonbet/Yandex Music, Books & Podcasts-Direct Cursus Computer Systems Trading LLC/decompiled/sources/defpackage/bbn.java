package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class bbn {
    public static final bbn a;
    public static final bbn b;
    public static final bbn c;
    public static final bbn d;
    public static final bbn e;
    public static final bbn f;
    public static final /* synthetic */ bbn[] g;

    static {
        bbn bbnVar = new bbn("NONE", 0);
        a = bbnVar;
        bbn bbnVar2 = new bbn("LOCAL_ONLY", 1);
        b = bbnVar2;
        bbn bbnVar3 = new bbn("YNISON_ONLY", 2);
        c = bbnVar3;
        bbn bbnVar4 = new bbn("LOCAL_THEN_YNISON", 3);
        d = bbnVar4;
        bbn bbnVar5 = new bbn("LOCAL_IF_SINGLE_DEVICE_THEN_YNISON", 4);
        e = bbnVar5;
        bbn bbnVar6 = new bbn("YNISON_THEN_LOCAL", 5);
        f = bbnVar6;
        g = new bbn[]{bbnVar, bbnVar2, bbnVar3, bbnVar4, bbnVar5, bbnVar6};
    }

    public static bbn valueOf(String str) {
        return (bbn) Enum.valueOf(bbn.class, str);
    }

    public static bbn[] values() {
        return (bbn[]) g.clone();
    }
}
