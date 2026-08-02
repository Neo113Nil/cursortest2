package defpackage;

/* loaded from: classes15.dex */
public final /* synthetic */ class w2b0 implements tls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String w;

    public /* synthetic */ w2b0(String str, String str2, byte[] bArr) {
        this.c = str;
        this.w = str2;
        this.b = bArr;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        int i = this.a;
        String str = this.w;
        String str2 = this.c;
        byte[] bArr = this.b;
        oll0 oll0Var = (oll0) obj;
        switch (i) {
            case 0:
                T0 = oll0Var.T0("INSERT INTO persistent_queue (prefix, key, value) VALUES(?, ?, ?)");
                try {
                    T0.g1(1, str2);
                    T0.g1(2, str);
                    T0.m(3, bArr);
                    T0.q();
                    long t = jx81.t(oll0Var);
                    T0.close();
                    return Long.valueOf(t);
                } finally {
                }
            default:
                T0 = oll0Var.T0("UPDATE persistent_queue SET value = ? WHERE prefix = ? AND key = ?");
                try {
                    T0.m(1, bArr);
                    T0.g1(2, str2);
                    T0.g1(3, str);
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } finally {
                }
        }
    }

    public /* synthetic */ w2b0(byte[] bArr, String str, String str2) {
        this.b = bArr;
        this.c = str;
        this.w = str2;
    }
}
