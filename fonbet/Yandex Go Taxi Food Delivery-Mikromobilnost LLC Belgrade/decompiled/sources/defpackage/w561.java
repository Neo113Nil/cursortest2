package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.design.spoiler.SpoilerTextView;

/* loaded from: classes13.dex */
public final class w561 implements zo31 {
    public final ConstraintLayout a;
    public final RecyclerView b;
    public final View c;
    public final AppCompatTextView d;
    public final AppCompatTextView e;
    public final SpoilerTextView f;

    public w561(ConstraintLayout constraintLayout, RecyclerView recyclerView, View view, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, SpoilerTextView spoilerTextView) {
        this.a = constraintLayout;
        this.b = recyclerView;
        this.c = view;
        this.d = appCompatTextView;
        this.e = appCompatTextView2;
        this.f = spoilerTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
