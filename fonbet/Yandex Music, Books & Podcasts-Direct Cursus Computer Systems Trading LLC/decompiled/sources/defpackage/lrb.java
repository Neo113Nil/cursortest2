package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class lrb implements ycg, ua6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hoh b;

    public /* synthetic */ lrb(hoh hohVar, int i) {
        this.a = i;
        this.b = hohVar;
    }

    @Override // defpackage.ua6
    public void accept(Object obj) {
        ((lrl) obj).Q(this.b);
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((f8l) obj).P(this.b);
                break;
            default:
                ((f8l) obj).v(this.b);
                break;
        }
    }
}
