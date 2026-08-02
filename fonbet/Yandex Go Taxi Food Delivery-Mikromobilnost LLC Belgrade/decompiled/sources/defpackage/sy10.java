package defpackage;

import android.text.Html;
import android.text.Spanned;

/* loaded from: classes15.dex */
public final /* synthetic */ class sy10 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy10 b;

    public /* synthetic */ sy10(uy10 uy10Var, int i) {
        this.a = i;
        this.b = uy10Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        uy10 uy10Var = this.b;
        CharSequence charSequence = (CharSequence) obj;
        switch (i) {
            case 0:
                if (!(charSequence instanceof Spanned)) {
                    break;
                } else {
                    break;
                }
            default:
                if (!(charSequence instanceof Spanned)) {
                    break;
                } else {
                    break;
                }
        }
        return Html.escapeHtml(charSequence);
    }
}
