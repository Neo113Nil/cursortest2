package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.widgets.common.LoadableInput;

/* loaded from: classes3.dex */
public final class v161 implements zo31 {
    public final ConstraintLayout a;
    public final LoadableInput b;
    public final View c;
    public final AppCompatTextView d;
    public final AppCompatTextView e;
    public final LoadableInput f;
    public final View g;
    public final AppCompatTextView h;
    public final AppCompatTextView i;

    public v161(ConstraintLayout constraintLayout, LoadableInput loadableInput, View view, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, LoadableInput loadableInput2, View view2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4) {
        this.a = constraintLayout;
        this.b = loadableInput;
        this.c = view;
        this.d = appCompatTextView;
        this.e = appCompatTextView2;
        this.f = loadableInput2;
        this.g = view2;
        this.h = appCompatTextView3;
        this.i = appCompatTextView4;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }

    public final ConstraintLayout o() {
        return this.a;
    }
}
