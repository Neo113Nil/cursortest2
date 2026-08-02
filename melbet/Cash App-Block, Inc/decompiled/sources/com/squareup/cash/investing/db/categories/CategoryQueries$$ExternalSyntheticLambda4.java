package com.squareup.cash.investing.db.categories;

import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.common.SyncInvestmentCategory;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class CategoryQueries$$ExternalSyntheticLambda4 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CategoryQueries f$0;

    public /* synthetic */ CategoryQueries$$ExternalSyntheticLambda4(CategoryQueries categoryQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                CategoryQueries$categoryForToken$2 categoryQueries$categoryForToken$2 = CategoryQueries$categoryForToken$2.INSTANCE;
                break;
        }
        this.f$0 = categoryQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        CategoryQueries categoryQueries = this.f$0;
        switch (i) {
            case 0:
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                categoryQueries.categoryAdapter.getClass();
                String string2 = androidCursor.getString(0);
                string2.getClass();
                return new CategoryToken(string2);
            default:
                CategoryQueries$categoryForToken$2 categoryQueries$categoryForToken$2 = CategoryQueries$categoryForToken$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                Long m = re$$ExternalSyntheticOutline0.m(androidCursor2, 0);
                Category$Adapter category$Adapter = categoryQueries.categoryAdapter;
                category$Adapter.getClass();
                String string3 = androidCursor2.getString(1);
                string3.getClass();
                CategoryToken categoryToken = new CategoryToken(string3);
                String string4 = androidCursor2.getString(2);
                string4.getClass();
                String string5 = androidCursor2.getString(3);
                String string6 = androidCursor2.getString(4);
                String string7 = androidCursor2.getString(5);
                SyncInvestmentCategory.PrefixIcon prefixIcon = string7 != null ? (SyncInvestmentCategory.PrefixIcon) category$Adapter.prefix_iconAdapter.decode(string7) : null;
                String string8 = androidCursor2.getString(6);
                ?? bytes = androidCursor2.getBytes(7);
                return new CategoryForToken(m.longValue(), categoryToken, string4, string5, string6, prefixIcon, string8, bytes != 0 ? (Color) category$Adapter.category_colorAdapter.decode(bytes) : null, androidCursor2.getString(8), androidCursor2.getString(9), androidCursor2.getString(10), androidCursor2.getString(11));
        }
    }
}
