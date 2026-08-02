package defpackage;

/* loaded from: classes7.dex */
public final class ro71 {
    public final boolean a;
    public final String b;
    public final v781 c;
    public final int d;
    public final byte[] e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r6.equals("cbc1") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ro71(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        char c = 0;
        int i4 = 1;
        if (!((i == 0) ^ (bArr2 == null))) {
            w511.q();
            throw null;
        }
        this.a = z;
        this.b = str;
        this.d = i;
        this.e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3049879:
                    if (str.equals("cenc")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3049895:
                    if (str.equals("cens")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    i4 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    nba1.e();
                    break;
            }
        }
        this.c = new v781(i4, i2, i3, bArr);
    }
}
