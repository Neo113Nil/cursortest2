package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class rzo {
    public static final rzo a;
    public static final rzo b;
    public static final /* synthetic */ rzo[] c;

    static {
        rzo rzoVar = new rzo("All", 0);
        a = rzoVar;
        rzo rzoVar2 = new rzo("Music", 1);
        rzo rzoVar3 = new rzo("MusicAndNonMusic", 2);
        rzo rzoVar4 = new rzo("Track", 3);
        rzo rzoVar5 = new rzo("Artist", 4);
        b = rzoVar5;
        c = new rzo[]{rzoVar, rzoVar2, rzoVar3, rzoVar4, rzoVar5};
    }

    public static rzo valueOf(String str) {
        return (rzo) Enum.valueOf(rzo.class, str);
    }

    public static rzo[] values() {
        return (rzo[]) c.clone();
    }
}
