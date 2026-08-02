package defpackage;

/* loaded from: classes5.dex */
public final class l2i extends o2i {
    public final m2i e;

    public l2i(String str, m2i m2iVar) {
        super(m2iVar, str, false);
        o2g.M(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        o2g.O(m2iVar, "marshaller");
        this.e = m2iVar;
    }

    @Override // defpackage.o2i
    public final Object a(byte[] bArr) {
        return this.e.o(new String(bArr, pe4.a));
    }

    @Override // defpackage.o2i
    public final byte[] b(Object obj) {
        String a = this.e.a(obj);
        o2g.O(a, "null marshaller.toAsciiString()");
        return a.getBytes(pe4.a);
    }
}
