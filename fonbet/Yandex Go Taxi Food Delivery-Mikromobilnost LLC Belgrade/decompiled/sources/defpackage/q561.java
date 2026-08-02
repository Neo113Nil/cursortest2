package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.feature.savings.internal.screens.account.view.IncomeProgressView;
import com.ybsdk.feature.savings.internal.screens.account.view.SavingsIncomeProgressView;

/* loaded from: classes3.dex */
public final class q561 implements zo31 {
    public final SavingsIncomeProgressView a;
    public final SpoilerTextView b;
    public final AppCompatTextView c;
    public final AppCompatImageView d;
    public final AppCompatTextView e;
    public final AppCompatTextView f;
    public final IncomeProgressView g;
    public final RecyclerView h;
    public final AppCompatTextView i;
    public final AppCompatTextView j;

    public q561(SavingsIncomeProgressView savingsIncomeProgressView, SpoilerTextView spoilerTextView, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, IncomeProgressView incomeProgressView, RecyclerView recyclerView, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5) {
        this.a = savingsIncomeProgressView;
        this.b = spoilerTextView;
        this.c = appCompatTextView;
        this.d = appCompatImageView;
        this.e = appCompatTextView2;
        this.f = appCompatTextView3;
        this.g = incomeProgressView;
        this.h = recyclerView;
        this.i = appCompatTextView4;
        this.j = appCompatTextView5;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
