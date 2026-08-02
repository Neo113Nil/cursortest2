package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class yml {
    public static final yml a;
    public static final yml b;
    public static final /* synthetic */ yml[] c;

    static {
        yml ymlVar = new yml("On", 0);
        a = ymlVar;
        yml ymlVar2 = new yml("Off", 1);
        b = ymlVar2;
        c = new yml[]{ymlVar, ymlVar2};
    }

    public static yml valueOf(String str) {
        return (yml) Enum.valueOf(yml.class, str);
    }

    public static yml[] values() {
        return (yml[]) c.clone();
    }
}
