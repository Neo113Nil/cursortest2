package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class shi implements f10 {
    public static final shi a;
    public static final shi b;
    public static final shi c;
    public static final shi d;
    public static final shi e;
    public static final shi f;
    public static final /* synthetic */ shi[] g;

    static {
        shi shiVar = new shi("Share", 0);
        a = shiVar;
        shi shiVar2 = new shi("MarkReadAll", 1);
        b = shiVar2;
        shi shiVar3 = new shi("MarkUnReadAll", 2);
        c = shiVar3;
        shi shiVar4 = new shi("PlayNext", 3);
        d = shiVar4;
        shi shiVar5 = new shi("AddToQueue", 4);
        e = shiVar5;
        shi shiVar6 = new shi("DevicePicker", 5);
        f = shiVar6;
        g = new shi[]{shiVar, shiVar2, shiVar3, shiVar4, shiVar5, shiVar6};
    }

    public static shi valueOf(String str) {
        return (shi) Enum.valueOf(shi.class, str);
    }

    public static shi[] values() {
        return (shi[]) g.clone();
    }
}
