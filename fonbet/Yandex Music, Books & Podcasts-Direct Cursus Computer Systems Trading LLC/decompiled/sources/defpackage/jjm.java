package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class jjm {
    public static final quk b;
    public static final jjm c;
    public static final jjm d;
    public static final /* synthetic */ jjm[] e;
    public static final /* synthetic */ rdb f;
    public final String a;

    static {
        jjm jjmVar = new jjm("COMMON", 0, "ordinal");
        c = jjmVar;
        jjm jjmVar2 = new jjm("COMPILATION", 1, "compilation");
        jjm jjmVar3 = new jjm("SINGLE", 2, "single");
        d = jjmVar3;
        jjm[] jjmVarArr = {jjmVar, jjmVar2, jjmVar3, new jjm("PODCAST", 3, "podcast"), new jjm("ASMR", 4, "asmr"), new jjm("NOISE", 5, "noise"), new jjm("RADIO_RECORD", 6, "radio-record"), new jjm("FAIRY_TALE", 7, "fairy-tale"), new jjm("AUDIOBOOK", 8, "audiobook")};
        e = jjmVarArr;
        f = new rdb(jjmVarArr);
        b = new quk();
    }

    public jjm(String str, int i, String str2) {
        this.a = str2;
    }

    public static jjm valueOf(String str) {
        return (jjm) Enum.valueOf(jjm.class, str);
    }

    public static jjm[] values() {
        return (jjm[]) e.clone();
    }
}
