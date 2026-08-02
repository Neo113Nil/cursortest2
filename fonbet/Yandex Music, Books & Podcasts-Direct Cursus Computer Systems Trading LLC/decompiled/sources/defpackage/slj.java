package defpackage;

/* loaded from: classes4.dex */
public final class slj implements ulj {
    public final String a;
    public final olj b;
    public final String c;
    public final String d;
    public final int[] e;

    public slj(String str, olj oljVar, String str2, String str3, int[] iArr, int i) {
        oljVar = (i & 2) != 0 ? null : oljVar;
        str2 = (i & 4) != 0 ? null : str2;
        str3 = (i & 8) != 0 ? null : str3;
        iArr = (i & 16) != 0 ? null : iArr;
        this.a = str;
        this.b = oljVar;
        this.c = str2;
        this.d = str3;
        this.e = iArr;
    }
}
