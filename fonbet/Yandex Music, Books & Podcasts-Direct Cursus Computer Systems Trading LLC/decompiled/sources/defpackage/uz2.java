package defpackage;

/* loaded from: classes.dex */
public final class uz2 {
    public int a;
    public String b;

    public static tzb a() {
        tzb tzbVar = new tzb();
        tzbVar.a = "";
        return tzbVar;
    }

    public final String toString() {
        int i = this.a;
        int i2 = l8x.a;
        u7x u7xVar = a7x.c;
        Integer valueOf = Integer.valueOf(i);
        return hrg.r("Response Code: ", (!u7xVar.containsKey(valueOf) ? a7x.RESPONSE_CODE_UNSPECIFIED : (a7x) u7xVar.get(valueOf)).toString(), ", Debug Message: ", this.b);
    }
}
