package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes3.dex */
public final class s561 implements zo31 {
    public final LinearLayoutCompat a;
    public final AppCompatTextView b;

    public s561(LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView) {
        this.a = linearLayoutCompat;
        this.b = appCompatTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
