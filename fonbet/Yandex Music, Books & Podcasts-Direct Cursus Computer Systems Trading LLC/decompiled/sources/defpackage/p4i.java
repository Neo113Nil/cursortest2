package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class p4i implements k4i, zyc {
    public final /* synthetic */ q4i a;

    public p4i(q4i q4iVar) {
        this.a = q4iVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof k4i) && (obj instanceof zyc)) {
            return getFunctionDelegate().equals(((zyc) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        return new ezc(1, 0, q4i.class, this.a, "onLogUploadComplete", "onLogUploadComplete(I)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
