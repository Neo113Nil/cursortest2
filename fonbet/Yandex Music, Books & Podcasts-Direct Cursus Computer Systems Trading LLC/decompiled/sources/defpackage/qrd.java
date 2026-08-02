package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class qrd {
    public final azs a;
    public final boolean b;
    public final boolean c;
    public final v94 f;
    public byte[] g;
    public int h;
    public int i;
    public long j;
    public long l;
    public long p;
    public long q;
    public boolean r;
    public boolean s;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public prd m = new prd();
    public prd n = new prd();
    public boolean k = false;
    public boolean o = false;

    public qrd(azs azsVar, boolean z, boolean z2) {
        this.a = azsVar;
        this.b = z;
        this.c = z2;
        byte[] bArr = new byte[128];
        this.g = bArr;
        this.f = new v94(bArr, 0, 0);
        prd prdVar = this.n;
        prdVar.b = false;
        prdVar.a = false;
    }
}
