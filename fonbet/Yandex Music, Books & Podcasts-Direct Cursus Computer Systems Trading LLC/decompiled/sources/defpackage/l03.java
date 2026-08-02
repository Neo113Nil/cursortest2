package defpackage;

/* loaded from: classes5.dex */
public final class l03 extends mi6 {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l03(int i) {
        super(dsj.c, 1);
        this.i = i;
        switch (i) {
            case 1:
                super(dsj.a, 1);
                break;
            case 2:
                super(dsj.b, 1);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.mi6
    public void b() {
        switch (this.i) {
            case 2:
                if (!me4.a(this.c)) {
                    throw new uxe(1007, "Received text is no valid utf8 string!");
                }
                return;
            default:
                super.b();
                return;
        }
    }
}
