package defpackage;

@gsq0(with = b0t.class)
/* loaded from: classes9.dex */
public final class zzs {
    public static final uzs Companion = new uzs();
    public static final zzs f = new zzs(0.0d, 0.0d, 0, null, null, 28);
    public final double a;
    public final double b;
    public final int c;
    public final String d;
    public final Long e;

    public zzs(double d, double d2, int i, String str, Long l) {
        this.a = d;
        this.b = d2;
        this.c = i;
        this.d = str;
        this.e = l;
        if (Math.abs(d) > Double.MAX_VALUE || -90.0d > d || d > 90.0d || Math.abs(d2) > Double.MAX_VALUE || -180.0d > d2 || d2 > 180.0d) {
            vby vbyVar = xby.d;
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("GeoPoint is not valid");
            ke00 a = vbyVar.b.a();
            if (a == null || !a.b(15)) {
                return;
            }
            a.a(15, "GeoPoint:init", illegalArgumentException, toString(), vbyVar.a);
        }
    }

    public final boolean a(zzs zzsVar, double d) {
        if (this == zzsVar) {
            return true;
        }
        return zzsVar != null && Math.abs(this.a - zzsVar.a) < d && Math.abs(this.b - zzsVar.b) < d;
    }

    public final String b() {
        return this.b + "," + this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !zzs.class.equals(obj.getClass())) {
            return false;
        }
        zzs zzsVar = (zzs) obj;
        return Double.compare(zzsVar.a, this.a) == 0 && Double.compare(zzsVar.b, this.b) == 0 && zzsVar.c == this.c;
    }

    public final int hashCode() {
        double d = this.a;
        long doubleToLongBits = d == 0.0d ? 0L : Double.doubleToLongBits(d);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        double d2 = this.b;
        long doubleToLongBits2 = d2 != 0.0d ? Double.doubleToLongBits(d2) : 0L;
        return (((i * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2))) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "[lat=", ", lon=");
        u.append(this.b);
        u.append("] accuracy=");
        u.append(this.c);
        return u.toString();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ zzs(double r9, double r11, int r13, java.lang.String r14, java.lang.Long r15, int r16) {
        /*
            r8 = this;
            r0 = r16 & 4
            if (r0 == 0) goto L5
            r13 = 0
        L5:
            r5 = r13
            r13 = r16 & 8
            r0 = 0
            if (r13 == 0) goto Ld
            r6 = r0
            goto Le
        Ld:
            r6 = r14
        Le:
            r13 = r16 & 16
            if (r13 == 0) goto L17
            r7 = r0
            r1 = r9
            r3 = r11
            r0 = r8
            goto L1b
        L17:
            r7 = r15
            r0 = r8
            r1 = r9
            r3 = r11
        L1b:
            r0.<init>(r1, r3, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zzs.<init>(double, double, int, java.lang.String, java.lang.Long, int):void");
    }
}
