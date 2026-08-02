package defpackage;

/* loaded from: classes.dex */
public final class v9g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y9g b;

    public /* synthetic */ v9g(y9g y9gVar, int i) {
        this.a = i;
        this.b = y9gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nra nraVar = this.b.c;
                if (nraVar != null) {
                    nraVar.setListSelectionHidden(true);
                    nraVar.requestLayout();
                    break;
                }
                break;
            default:
                y9g y9gVar = this.b;
                nra nraVar2 = y9gVar.c;
                if (nraVar2 != null && nraVar2.isAttachedToWindow() && y9gVar.c.getCount() > y9gVar.c.getChildCount() && y9gVar.c.getChildCount() <= y9gVar.m) {
                    y9gVar.z.setInputMethodMode(2);
                    y9gVar.f();
                    break;
                }
                break;
        }
    }
}
