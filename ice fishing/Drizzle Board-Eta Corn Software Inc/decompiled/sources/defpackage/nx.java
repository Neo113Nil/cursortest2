package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.kolosta.rejin.jilosa.presentation.ui.PairShelfFragment;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class nx implements TextWatcher {
    public final /* synthetic */ PairShelfFragment NCTxEWno;

    public nx(PairShelfFragment pairShelfFragment) {
        this.NCTxEWno = pairShelfFragment;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String obj = charSequence != null ? charSequence.toString() : null;
        if (obj == null) {
            obj = "";
        }
        List list = PairShelfFragment.f7oeun2L;
        PairShelfFragment pairShelfFragment = this.NCTxEWno;
        sj sjVar = pairShelfFragment.pP9Y2m6O;
        sjVar.getClass();
        sjVar.gjV1z5T1.setVisibility(obj.length() > 0 ? 0 : 8);
        x90 x90Var = pairShelfFragment.nSmgoSB5().NCTxEWno;
        x90Var.getClass();
        x90Var.eVhOlqcC(null, obj);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
