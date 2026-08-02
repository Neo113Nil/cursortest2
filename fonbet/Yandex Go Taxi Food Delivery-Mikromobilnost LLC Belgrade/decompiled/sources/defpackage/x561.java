package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.ybsdk.core.design.spoiler.SpoilerTextView;

/* loaded from: classes3.dex */
public final class x561 implements zo31 {
    public final LinearLayoutCompat a;
    public final AppCompatTextView b;
    public final SpoilerTextView c;

    public x561(LinearLayoutCompat linearLayoutCompat, AppCompatTextView appCompatTextView, SpoilerTextView spoilerTextView) {
        this.a = linearLayoutCompat;
        this.b = appCompatTextView;
        this.c = spoilerTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
