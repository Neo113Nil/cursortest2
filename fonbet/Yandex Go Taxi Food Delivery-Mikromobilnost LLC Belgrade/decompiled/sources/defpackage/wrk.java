package defpackage;

import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.divs.gallery.DivGalleryItemLayout;
import com.yandex.div.core.view2.f;

/* loaded from: classes.dex */
public final class wrk extends kjk {
    public final DivGalleryItemLayout S;
    public final hgk T;

    public wrk(aw5 aw5Var, DivGalleryItemLayout divGalleryItemLayout, hgk hgkVar, f fVar) {
        super(divGalleryItemLayout, aw5Var, hgkVar, fVar);
        this.S = divGalleryItemLayout;
        this.T = hgkVar;
    }

    @Override // defpackage.kjk
    public final void W(aw5 aw5Var, m3k m3kVar, int i, b bVar) {
        super.W(aw5Var, m3kVar, i, bVar);
        this.S.setTag(ngh0.div_gallery_item_index, Integer.valueOf(i));
        this.T.a(aw5Var.a);
    }

    @Override // defpackage.kjk
    public final void X() {
        int i = wfx.a;
    }
}
