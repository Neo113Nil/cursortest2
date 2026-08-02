package defpackage;

import java.util.Locale;

/* loaded from: classes5.dex */
public final class beh extends IllegalStateException {
    private static final long serialVersionUID = -6024911025449780478L;
    public final xnb a;

    public beh() {
        xnb xnbVar = new xnb(this);
        this.a = xnbVar;
        xnbVar.b.add(jqg.ILLEGAL_STATE);
        xnbVar.c.add(vq2.D(new Object[0]));
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        xnb xnbVar = this.a;
        xnbVar.getClass();
        return xnbVar.a(Locale.getDefault());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        xnb xnbVar = this.a;
        xnbVar.getClass();
        return xnbVar.a(Locale.US);
    }
}
