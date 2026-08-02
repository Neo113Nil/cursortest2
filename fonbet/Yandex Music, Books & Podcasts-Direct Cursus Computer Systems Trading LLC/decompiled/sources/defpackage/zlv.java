package defpackage;

/* loaded from: classes4.dex */
public final class zlv {
    public final fnb a;
    public final inv b;
    public final hnv c;
    public final inv d;
    public final nmb e;

    public zlv(fnb fnbVar, inv invVar, hnv hnvVar, inv invVar2) {
        fnbVar.getClass();
        this.a = fnbVar;
        this.b = invVar;
        this.c = hnvVar;
        this.d = invVar2;
        this.e = qld.m();
    }

    public static lmb a(qov qovVar) {
        int i = qovVar == null ? -1 : ylv.a[qovVar.ordinal()];
        if (i == -1) {
            return lmb.Unknown;
        }
        if (i == 1) {
            return lmb.Square;
        }
        if (i == 2) {
            return lmb.Rectangle;
        }
        if (i == 3) {
            return lmb.RectangleWithRecently;
        }
        b6e.s();
        return null;
    }
}
