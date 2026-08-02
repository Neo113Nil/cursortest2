package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class nlh implements ycg {
    public final /* synthetic */ int a;
    public final /* synthetic */ hzk b;

    public /* synthetic */ nlh(int i, hzk hzkVar) {
        this.a = i;
        this.b = hzkVar;
    }

    @Override // defpackage.ycg
    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((f8l) obj).O(this.b);
                break;
            case 1:
                ((f8l) obj).L(this.b);
                break;
            case 2:
                ((f8l) obj).O(this.b);
                break;
            default:
                ((f8l) obj).L(this.b);
                break;
        }
    }
}
