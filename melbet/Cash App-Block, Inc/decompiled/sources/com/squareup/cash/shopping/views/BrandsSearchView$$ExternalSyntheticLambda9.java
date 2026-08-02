package com.squareup.cash.shopping.views;

import android.view.View;
import com.squareup.util.android.Keyboards;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class BrandsSearchView$$ExternalSyntheticLambda9 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ View f$0;

    public /* synthetic */ BrandsSearchView$$ExternalSyntheticLambda9(View view, int i) {
        this.$r8$classId = i;
        this.f$0 = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        View view = this.f$0;
        switch (i) {
            case 0:
                Keyboards.hideKeyboard(view);
                break;
            case 1:
                Keyboards.hideKeyboard(view);
                view.clearFocus();
                break;
            default:
                Keyboards.hideKeyboard(view);
                break;
        }
        return Unit.INSTANCE;
    }
}
