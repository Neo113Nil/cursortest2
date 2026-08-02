package defpackage;

/* loaded from: classes10.dex */
public final class z450 implements hs31 {
    public final /* synthetic */ int a;

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        switch (this.a) {
            case 0:
                return new a550();
            default:
                if (cls.equals(p960.class)) {
                    return new p960();
                }
                ny61.r("Unknown view model");
                return null;
        }
    }
}
