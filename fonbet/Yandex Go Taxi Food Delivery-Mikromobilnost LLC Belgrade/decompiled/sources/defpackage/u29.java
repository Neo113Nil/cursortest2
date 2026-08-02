package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.cashback.impl.dto.responses.CashbackCategoryResponse;
import com.ybsdk.feature.cashback.impl.entities.types.CategoryID;

/* loaded from: classes3.dex */
public abstract class u29 {
    public static final t29 a(CashbackCategoryResponse cashbackCategoryResponse) {
        String m398constructorimpl = CategoryID.m398constructorimpl(cashbackCategoryResponse.getCategoryId());
        Text.Constant i = g8e.i(Text.Companion, cashbackCategoryResponse.getTitle());
        Text.Constant constant = new Text.Constant(cashbackCategoryResponse.getSubtitle());
        rbv f = job1.f(qxy0.c(cashbackCategoryResponse.getThemedImage(), cashbackCategoryResponse.getImage()), new jv8(3));
        if (f == null) {
            f = new nbv(ayg0.ybsdk_cashback_item_placeholder, null);
        }
        return new t29(m398constructorimpl, i, constant, f, cashbackCategoryResponse.getPercent(), cashbackCategoryResponse.getSelectionType());
    }
}
