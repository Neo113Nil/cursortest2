package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class avm {
    public static final avm a;
    public static final avm b;
    public static final avm c;
    public static final /* synthetic */ avm[] d;

    static {
        avm avmVar = new avm("Collapsed", 0);
        a = avmVar;
        avm avmVar2 = new avm("Expanding", 1);
        b = avmVar2;
        avm avmVar3 = new avm("AlmostFullExpanded", 2);
        c = avmVar3;
        d = new avm[]{avmVar, avmVar2, avmVar3};
    }

    public static avm valueOf(String str) {
        return (avm) Enum.valueOf(avm.class, str);
    }

    public static avm[] values() {
        return (avm[]) d.clone();
    }
}
