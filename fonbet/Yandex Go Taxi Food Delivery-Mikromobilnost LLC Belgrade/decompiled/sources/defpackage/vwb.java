package defpackage;

import androidx.compose.ui.semantics.f;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final /* synthetic */ class vwb implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ CharSequence c;

    public /* synthetic */ vwb(CharSequence charSequence, CharSequence charSequence2, int i) {
        this.a = i;
        this.b = charSequence;
        this.c = charSequence2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.c;
        CharSequence charSequence = this.b;
        mnq0 mnq0Var = (mnq0) obj;
        switch (i) {
            case 0:
                if (charSequence == null) {
                    charSequence = "";
                }
                f.l(mnq0Var, ((Object) charSequence) + " " + (obj2 != null ? obj2 : ""));
                break;
            case 1:
                if (charSequence == null) {
                    charSequence = "";
                }
                f.l(mnq0Var, ((Object) charSequence) + " " + (obj2 != null ? obj2 : ""));
                break;
            case 2:
                if (charSequence == null) {
                    charSequence = "";
                }
                f.l(mnq0Var, ((Object) charSequence) + " " + (obj2 != null ? obj2 : ""));
                break;
            default:
                f.l(mnq0Var, ((Object) charSequence) + Extension.FIX_SPACE + (obj2 != null ? obj2 : ""));
                break;
        }
        return zy11Var;
    }
}
