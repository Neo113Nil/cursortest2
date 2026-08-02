package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class jqs {
    public static final cuk a;
    public static final jqs b;
    public static final /* synthetic */ jqs[] c;
    public static final /* synthetic */ rdb d;

    static {
        jqs jqsVar = new jqs("SMART_PREVIEW", 0);
        b = jqsVar;
        jqs[] jqsVarArr = {jqsVar};
        c = jqsVarArr;
        d = new rdb(jqsVarArr);
        a = new cuk();
    }

    public static jqs valueOf(String str) {
        return (jqs) Enum.valueOf(jqs.class, str);
    }

    public static jqs[] values() {
        return (jqs[]) c.clone();
    }
}
