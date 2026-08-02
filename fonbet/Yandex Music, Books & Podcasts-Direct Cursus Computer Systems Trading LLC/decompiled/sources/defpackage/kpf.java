package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class kpf {
    public static final kpf a;
    public static final kpf b;
    public static final kpf c;
    public static final /* synthetic */ kpf[] d;

    static {
        kpf kpfVar = new kpf("InMeasureBlock", 0);
        a = kpfVar;
        kpf kpfVar2 = new kpf("InLayoutBlock", 1);
        b = kpfVar2;
        kpf kpfVar3 = new kpf("NotUsed", 2);
        c = kpfVar3;
        d = new kpf[]{kpfVar, kpfVar2, kpfVar3};
    }

    public static kpf valueOf(String str) {
        return (kpf) Enum.valueOf(kpf.class, str);
    }

    public static kpf[] values() {
        return (kpf[]) d.clone();
    }
}
