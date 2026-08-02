package defpackage;

/* loaded from: classes7.dex */
public final class qx71 implements mse {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ qx71(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.fse
    public final Object fold(Object obj, wls wlsVar) {
        switch (this.a) {
        }
        return wlsVar.invoke(obj, this);
    }

    @Override // defpackage.fse
    public final dse get(ese eseVar) {
        switch (this.a) {
        }
        return ffx.H(this, eseVar);
    }

    @Override // defpackage.dse
    public final ese getKey() {
        int i = this.a;
        return lse.a;
    }

    @Override // defpackage.mse
    public final void handleException(fse fseVar, Throwable th) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                try {
                    String message = th.getMessage();
                    if (message == null) {
                        message = "Unknown";
                    }
                    ((ge71) obj).d(message, th);
                    break;
                } catch (Throwable unused) {
                    return;
                }
            default:
                th.getClass();
                ((fo71) obj).b(so61.u);
                break;
        }
    }

    @Override // defpackage.fse
    public final fse minusKey(ese eseVar) {
        switch (this.a) {
        }
        return ffx.Y(this, eseVar);
    }

    @Override // defpackage.fse
    public final fse plus(fse fseVar) {
        switch (this.a) {
        }
        return cvw.U(this, fseVar);
    }
}
