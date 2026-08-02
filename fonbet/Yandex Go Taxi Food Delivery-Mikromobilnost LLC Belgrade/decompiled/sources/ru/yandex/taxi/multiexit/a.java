package ru.yandex.taxi.multiexit;

import defpackage.ad5;
import defpackage.jr40;
import defpackage.mq40;
import defpackage.oq40;
import defpackage.pq40;
import defpackage.pwf0;
import defpackage.tje;
import defpackage.ud11;
import defpackage.vd11;
import defpackage.vmw0;
import defpackage.wq40;
import defpackage.zxf0;
import java.util.Iterator;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.widget.c;

/* loaded from: classes6.dex */
public final class a extends ad5 {
    public static final Object D = new Object();
    public vd11 A;
    public pq40 B;
    public ModalViewOrigin C;
    public final c x;
    public final vmw0 y;
    public final mq40 z;

    public a(c cVar, vmw0 vmw0Var, mq40 mq40Var) {
        super(oq40.class);
        this.x = cVar;
        this.y = vmw0Var;
        this.z = mq40Var;
        this.A = new ud11().b();
        this.B = (pq40) ((zxf0) pwf0.c(pq40.class));
        this.C = ModalViewOrigin.HOME;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.y.b(D);
    }

    public final void Kg(mq40 mq40Var) {
        FormattedText formattedText = mq40Var.d;
        if (formattedText != null) {
            tje.N(Jg(), null, null, new MultiexitAreaPickerPresenter$buildTitlesAndShow$1$1(this, formattedText, null), 3);
        }
        FormattedText formattedText2 = mq40Var.e;
        if (formattedText2 != null) {
            tje.N(Jg(), null, null, new MultiexitAreaPickerPresenter$buildTitlesAndShow$2$1(this, formattedText2, null), 3);
        }
        ud11 ud11Var = new ud11();
        for (jr40 jr40Var : mq40Var.a) {
            ud11 a = ud11Var.a(jr40Var);
            Iterator it = jr40Var.c.iterator();
            while (it.hasNext()) {
                a.a((wq40) it.next());
            }
        }
        this.A = ud11Var.b();
        ((oq40) Dg()).b7(this.A);
    }
}
