package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class paj {
    public static final paj a;
    public static final paj b;
    public static final paj c;
    public static final paj d;
    public static final paj e;
    public static final paj f;
    public static final paj g;
    public static final paj h;
    public static final /* synthetic */ paj[] i;

    static {
        paj pajVar = new paj("ALL", 0);
        a = pajVar;
        paj pajVar2 = new paj("PODCAST", 1);
        b = pajVar2;
        paj pajVar3 = new paj("AUDIOBOOK", 2);
        c = pajVar3;
        paj pajVar4 = new paj("AUDIOBOOK_WITHOUT_KIDS", 3);
        paj pajVar5 = new paj("FOR_KIDS", 4);
        d = pajVar5;
        paj pajVar6 = new paj("FOR_KIDS_PODCAST", 5);
        e = pajVar6;
        paj pajVar7 = new paj("FOR_KIDS_ALBUM", 6);
        f = pajVar7;
        paj pajVar8 = new paj("FOR_KIDS_AUDIOBOOK", 7);
        g = pajVar8;
        paj pajVar9 = new paj("FOR_KIDS_SPOKEN", 8);
        h = pajVar9;
        i = new paj[]{pajVar, pajVar2, pajVar3, pajVar4, pajVar5, pajVar6, pajVar7, pajVar8, pajVar9};
    }

    public static paj valueOf(String str) {
        return (paj) Enum.valueOf(paj.class, str);
    }

    public static paj[] values() {
        return (paj[]) i.clone();
    }
}
