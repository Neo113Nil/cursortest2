package defpackage;

/* loaded from: classes5.dex */
public final class st implements nlm {
    public static final st b = new st(0);
    public static final st c = new st(1);
    public static final st d = new st(2);
    public static final st e = new st(3);
    public final /* synthetic */ int a;

    public /* synthetic */ st(int i) {
        this.a = i;
    }

    @Override // defpackage.nlm
    public final boolean apply(Object obj) {
        boolean apply;
        switch (this.a) {
            case 0:
                oq oqVar = (oq) obj;
                oqVar.getClass();
                return ((i4j) ((byb) l18.b.c(hag.I(byb.class))).b(i4j.class)).h() ? lxe.o(oqVar.h()) == null : true ^ oqVar.g().contains(h94.c);
            case 1:
                mqs mqsVar = (mqs) obj;
                mqsVar.getClass();
                return ((i4j) ((byb) l18.b.c(hag.I(byb.class))).b(i4j.class)).h() ? lxe.o(mqsVar.h()) == null : true ^ mqsVar.g().contains(h94.c);
            case 2:
                oq oqVar2 = (oq) obj;
                oqVar2.getClass();
                apply = f8w.a.apply(oqVar2);
                break;
            default:
                mqs mqsVar2 = (mqs) obj;
                mqsVar2.getClass();
                apply = n8w.a.apply(mqsVar2);
                break;
        }
        return !apply;
    }
}
