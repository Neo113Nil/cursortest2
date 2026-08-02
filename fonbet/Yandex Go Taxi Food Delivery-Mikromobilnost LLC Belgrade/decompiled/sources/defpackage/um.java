package defpackage;

import androidx.appcompat.widget.AppCompatImageView;
import ru.yandex.taxi.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class um extends vm {
    public final RobotoTextView R;
    public final /* synthetic */ wm S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um(wm wmVar, rm rmVar) {
        super(rmVar);
        this.S = wmVar;
        this.R = (RobotoTextView) rmVar.d;
    }

    @Override // defpackage.vm
    public final void W(r8i0 r8i0Var, s8i0 s8i0Var) {
        this.P.setVisibility(8);
        AppCompatImageView appCompatImageView = this.Q;
        appCompatImageView.setVisibility(0);
        String str = r8i0Var.d;
        String str2 = r8i0Var.g;
        if (str.length() > 0) {
            c cVar = this.S.a;
            String str3 = r8i0Var.d;
            nac nacVar = (nac) cVar.a.a(appCompatImageView);
            nacVar.e(n4h0.achievement_unselected_fallback);
            nacVar.b(new obv(str3, null, 6, 0));
        }
        this.O.setText(r8i0Var.b);
        RobotoTextView robotoTextView = this.R;
        robotoTextView.setText(str2);
        robotoTextView.setVisibility(str2.length() > 0 ? 0 : 8);
    }
}
