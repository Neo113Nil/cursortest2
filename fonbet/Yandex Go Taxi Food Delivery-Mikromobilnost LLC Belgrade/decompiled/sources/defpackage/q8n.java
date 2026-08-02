package defpackage;

/* loaded from: classes10.dex */
public final class q8n {
    public static final q8n c = new q8n(0, 0);
    public static final q8n d = new q8n(1, 8);
    public static final q8n e = new q8n(3, 10);
    public static final q8n f = new q8n(4, 10);
    public static final q8n g = new q8n(5, 10);
    public static final q8n h = new q8n(6, 10);
    public static final q8n i = new q8n(6, 8);
    public final int a;
    public final int b;

    public q8n(int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    public final boolean a() {
        return b() && this.a != 1 && this.b == 10;
    }

    public final boolean b() {
        int i2 = this.a;
        return (i2 == 0 || i2 == 2 || this.b == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q8n) {
            q8n q8nVar = (q8n) obj;
            if (this.a == q8nVar.a && this.b == q8nVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DynamicRange@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{encoding=");
        switch (this.a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb.append(str);
        sb.append(", bitDepth=");
        return oyr.m(this.b, "}", sb);
    }
}
