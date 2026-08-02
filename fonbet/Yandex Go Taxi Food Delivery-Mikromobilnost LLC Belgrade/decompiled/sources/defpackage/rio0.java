package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.scooters.photocontrol.camera_ui.photo_result.c;
import defpackage.tje;
import defpackage.zy11;

/* loaded from: classes13.dex */
public final class rio0 implements tio0 {
    public final /* synthetic */ c a;

    public rio0(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.tio0
    public final void B() {
        c cVar = this.a;
        cVar.j().k.setVisibility(8);
        cVar.j().d.setVisibility(0);
    }

    @Override // defpackage.tio0
    public final void B6(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5) {
        if (charSequence3.length() <= 0) {
            charSequence3 = null;
        }
        final c cVar = this.a;
        if (charSequence3 == null) {
            charSequence3 = cVar.j().c.getText();
        }
        cVar.p = charSequence3;
        cVar.j().c.setText(cVar.p);
        if (charSequence.length() <= 0) {
            charSequence = null;
        }
        if (charSequence != null) {
            cVar.j().f.setText(charSequence);
        }
        if (charSequence2.length() <= 0) {
            charSequence2 = null;
        }
        if (charSequence2 != null) {
            cVar.j().e.setText(charSequence2);
        }
        if (charSequence4.length() <= 0) {
            charSequence4 = null;
        }
        if (charSequence4 != null) {
            cVar.j().l.setText(charSequence4);
        }
        if (charSequence5 != null) {
            cVar.j().g.setVisibility(0);
            cVar.j().g.setText(charSequence5);
            ru.yandex.taxi.design.utils.c.z(new sls() { // from class: com.yandex.go.scooters.photocontrol.camera_ui.photo_result.b
                @Override // defpackage.sls
                public final Object invoke() {
                    d dVar = c.this.n;
                    tje.N(dVar.Jg(), null, null, new ScootersPhotocontrolPhotoResultPresenter$onLinkClicked$1(dVar, null), 3);
                    return zy11.a;
                }
            }, cVar.j().g);
        }
    }

    @Override // defpackage.tio0
    public final void If() {
        this.a.c();
    }

    @Override // defpackage.tio0
    public final void L8() {
        c cVar = this.a;
        cVar.j().c.setText(cVar.p);
        cVar.j().l.setEnabled(true);
        cVar.j().c.setEnabled(true);
        cVar.j().c.finishProgress();
    }

    @Override // defpackage.tio0
    public final void N(Drawable drawable) {
        this.a.j().m.setImageDrawable(drawable);
    }

    @Override // defpackage.tio0
    public final void X4() {
        this.a.g();
    }

    @Override // defpackage.tio0
    public final void j9() {
        c cVar = this.a;
        cVar.j().c.setText(cVar.k.getString(kyh0.scooters_photocontrol_in_progress));
        cVar.j().l.setEnabled(false);
        cVar.j().c.setEnabled(false);
        cVar.j().c.startProgress();
    }
}
