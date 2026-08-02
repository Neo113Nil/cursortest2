package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class uwh {
    public static final uwh a;
    public static final /* synthetic */ uwh[] b;

    static {
        uwh uwhVar = new uwh("BROWSABLE", 0);
        a = uwhVar;
        b = new uwh[]{uwhVar, new uwh("PLAYABLE", 1)};
    }

    public static uwh valueOf(String str) {
        return (uwh) Enum.valueOf(uwh.class, str);
    }

    public static uwh[] values() {
        return (uwh[]) b.clone();
    }
}
