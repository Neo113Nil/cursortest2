package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class yxo {
    public static final yxo a;
    public static final yxo b;
    public static final /* synthetic */ yxo[] c;

    static {
        yxo yxoVar = new yxo("BACKWARD", 0);
        a = yxoVar;
        yxo yxoVar2 = new yxo("FORWARD", 1);
        b = yxoVar2;
        c = new yxo[]{yxoVar, yxoVar2};
    }

    public static yxo valueOf(String str) {
        return (yxo) Enum.valueOf(yxo.class, str);
    }

    public static yxo[] values() {
        return (yxo[]) c.clone();
    }
}
