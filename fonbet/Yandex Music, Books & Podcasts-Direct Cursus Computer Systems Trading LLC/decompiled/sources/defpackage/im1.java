package defpackage;

import kotlin.text.c;

/* loaded from: classes6.dex */
public final class im1 extends ou2 {
    public static final jyr i = btf.b(new pa1(19));
    private static final long serialVersionUID = 31848203571818042L;
    public final euo g = euo.d;
    public final aqt h = new aqt(wjb.ArtistScreen);

    @Override // defpackage.ypt
    public final cqt T() {
        return this.h;
    }

    public final int b() {
        String str = this.b;
        return (str == null || !c.v(str, "https", false)) ? 0 : 1;
    }

    @Override // defpackage.ypt
    public final euo getType() {
        return this.g;
    }
}
