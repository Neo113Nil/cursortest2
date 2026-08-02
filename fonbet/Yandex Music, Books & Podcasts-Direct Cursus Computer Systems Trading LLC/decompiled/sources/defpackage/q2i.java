package defpackage;

/* loaded from: classes5.dex */
public final class q2i extends o2i {
    public final r2i e;

    public q2i(String str, boolean z, r2i r2iVar) {
        super(r2iVar, str, z);
        o2g.M(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        this.e = r2iVar;
    }

    @Override // defpackage.o2i
    public final Object a(byte[] bArr) {
        return this.e.A(bArr);
    }

    @Override // defpackage.o2i
    public final byte[] b(Object obj) {
        byte[] a = this.e.a(obj);
        o2g.O(a, "null marshaller.toAsciiString()");
        return a;
    }
}
