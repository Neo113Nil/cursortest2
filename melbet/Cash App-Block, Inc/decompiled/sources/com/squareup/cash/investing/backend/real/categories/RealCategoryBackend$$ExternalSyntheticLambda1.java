package com.squareup.cash.investing.backend.real.categories;

import com.squareup.cash.investing.backend.api.data.Category;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import com.squareup.util.cash.ColorsKt;
import kotlin.jvm.functions.Function9;

/* loaded from: classes6.dex */
public final /* synthetic */ class RealCategoryBackend$$ExternalSyntheticLambda1 implements Function9 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RealCategoryBackend$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        Color color;
        Color color2;
        Color color3;
        int i = this.$r8$classId;
        long longValue = ((Long) obj).longValue();
        CategoryToken categoryToken = (CategoryToken) obj2;
        String str = (String) obj3;
        String str2 = (String) obj4;
        switch (i) {
            case 0:
                Color color4 = (Color) obj5;
                String str3 = (String) obj6;
                String str4 = (String) obj7;
                SyncInvestmentCategory.PrefixIcon prefixIcon = (SyncInvestmentCategory.PrefixIcon) obj8;
                String str5 = (String) obj9;
                categoryToken.getClass();
                str.getClass();
                if (color4 == null) {
                    color = str5 != null ? ColorsKt.toColor(str5) : null;
                } else {
                    color = color4;
                }
                return new Category(longValue, categoryToken, str, str2, color, str3, str4, prefixIcon);
            case 1:
                Color color5 = (Color) obj5;
                String str6 = (String) obj6;
                String str7 = (String) obj7;
                SyncInvestmentCategory.PrefixIcon prefixIcon2 = (SyncInvestmentCategory.PrefixIcon) obj8;
                String str8 = (String) obj9;
                categoryToken.getClass();
                str.getClass();
                if (color5 == null) {
                    color2 = str8 != null ? ColorsKt.toColor(str8) : null;
                } else {
                    color2 = color5;
                }
                return new Category(longValue, categoryToken, str, str2, color2, str6, str7, prefixIcon2);
            default:
                Color color6 = (Color) obj5;
                String str9 = (String) obj6;
                String str10 = (String) obj7;
                SyncInvestmentCategory.PrefixIcon prefixIcon3 = (SyncInvestmentCategory.PrefixIcon) obj8;
                String str11 = (String) obj9;
                categoryToken.getClass();
                str.getClass();
                if (color6 == null) {
                    color3 = str11 != null ? ColorsKt.toColor(str11) : null;
                } else {
                    color3 = color6;
                }
                return new Category(longValue, categoryToken, str, str2, color3, str9, str10, prefixIcon3);
        }
    }
}
