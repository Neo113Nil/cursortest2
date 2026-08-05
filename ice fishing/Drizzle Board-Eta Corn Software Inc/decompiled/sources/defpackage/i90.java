package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class i90 {
    public static final k00 MdtA4re8;
    public static final /* synthetic */ bg P7K7Inc8;
    public static final /* synthetic */ i90[] VgvYg0wo;
    public static final i90 wxUZMvaN;
    public final String NCTxEWno;

    static {
        i90 i90Var = new i90(0, "PREP_TIME", "prep_time");
        wxUZMvaN = i90Var;
        i90[] i90VarArr = {i90Var, new i90(1, "INTENSITY", "intensity"), new i90(2, "STEP_COUNT", "step_count")};
        VgvYg0wo = i90VarArr;
        P7K7Inc8 = new bg(i90VarArr);
        MdtA4re8 = new k00(6);
    }

    public i90(int i, String str, String str2) {
        this.NCTxEWno = str2;
    }

    public static i90 valueOf(String str) {
        return (i90) Enum.valueOf(i90.class, str);
    }

    public static i90[] values() {
        return (i90[]) VgvYg0wo.clone();
    }
}
