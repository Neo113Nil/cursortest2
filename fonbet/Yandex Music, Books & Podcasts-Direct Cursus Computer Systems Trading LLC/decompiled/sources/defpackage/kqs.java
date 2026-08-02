package defpackage;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class kqs implements Serializable {
    public static final euk b;
    public static final kqs c;
    public static final kqs d;
    public static final kqs e;
    public static final /* synthetic */ kqs[] f;
    public static final /* synthetic */ rdb g;
    public final String a;

    static {
        kqs kqsVar = new kqs("Own", 0, "OWN");
        c = kqsVar;
        kqs kqsVar2 = new kqs("Ugc", 1, "UGC");
        d = kqsVar2;
        kqs kqsVar3 = new kqs("OwnReplacedToUgc", 2, "OWN_REPLACED_TO_UGC");
        e = kqsVar3;
        kqs[] kqsVarArr = {kqsVar, kqsVar2, kqsVar3, new kqs("External", 3, "EXTERNAL")};
        f = kqsVarArr;
        g = new rdb(kqsVarArr);
        b = new euk();
    }

    public kqs(String str, int i, String str2) {
        this.a = str2;
    }

    public static kqs valueOf(String str) {
        return (kqs) Enum.valueOf(kqs.class, str);
    }

    public static kqs[] values() {
        return (kqs[]) f.clone();
    }
}
