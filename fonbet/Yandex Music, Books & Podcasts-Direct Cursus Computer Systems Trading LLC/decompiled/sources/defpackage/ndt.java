package defpackage;

/* loaded from: classes.dex */
public final class ndt implements odt {
    public final Object a;
    public final boolean b;

    public ndt(Object obj, boolean z) {
        this.a = obj;
        this.b = z;
    }

    @Override // defpackage.odt
    public final boolean d() {
        return this.b;
    }

    @Override // defpackage.sdr
    public final Object getValue() {
        return this.a;
    }
}
