package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes3.dex */
public final class t561 implements zo31 {
    public final LinearLayoutCompat a;
    public final LinearLayoutCompat b;
    public final AppCompatTextView c;

    public t561(LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, AppCompatTextView appCompatTextView) {
        this.a = linearLayoutCompat;
        this.b = linearLayoutCompat2;
        this.c = appCompatTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
