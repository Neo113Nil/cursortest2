package defpackage;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class iqs implements Serializable {
    public static final itk b;
    public static final iqs c;
    public static final iqs d;
    public static final /* synthetic */ iqs[] e;
    public static final /* synthetic */ rdb f;
    public final String a;

    static {
        iqs iqsVar = new iqs("FULL", 0, "full");
        c = iqsVar;
        iqs iqsVar2 = new iqs("TRAILER", 1, "trailer");
        d = iqsVar2;
        iqs[] iqsVarArr = {iqsVar, iqsVar2};
        e = iqsVarArr;
        f = new rdb(iqsVarArr);
        b = new itk();
    }

    public iqs(String str, int i, String str2) {
        this.a = str2;
    }

    public static iqs valueOf(String str) {
        return (iqs) Enum.valueOf(iqs.class, str);
    }

    public static iqs[] values() {
        return (iqs[]) e.clone();
    }
}
