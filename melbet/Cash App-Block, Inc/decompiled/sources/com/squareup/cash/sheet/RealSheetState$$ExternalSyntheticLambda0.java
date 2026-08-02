package com.squareup.cash.sheet;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.cash.sqldelight.driver.android.AndroidCursor;
import app.cash.sqldelight.driver.android.AndroidStatement;
import bo.app.re$$ExternalSyntheticOutline0;
import com.fillr.browsersdk.model.FillrCartInformationExtraction$FillrCartProduct;
import com.squareup.cash.db.Session;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.mooncake.components.MooncakeEmptyView;
import com.squareup.cash.session.backend.DbSessionManagerKt;
import com.squareup.cash.shopping.db.ShopProductsSearchQueries$paginationToken$2;
import com.squareup.cash.shopping.viewmodels.RestrictedItemWarningSheetViewEvent$Close;
import com.squareup.cash.shopping.viewmodels.ShoppingWebViewEvent;
import com.squareup.util.android.Views;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class RealSheetState$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RealSheetState$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String valueOf;
        String valueOf2;
        String valueOf3;
        switch (this.$r8$classId) {
            case 0:
                return Float.valueOf(((Float) obj).floatValue() * 0.5f);
            case 1:
                Session session = (Session) obj;
                session.getClass();
                return DbSessionManagerKt.toSessionState(session);
            case 2:
                return Unit.INSTANCE;
            case 3:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.hideFromAccessibility(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            case 4:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 5:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 6:
                FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options = (FeatureFlag$EnabledDisabledFeatureFlag$Options) obj;
                featureFlag$EnabledDisabledFeatureFlag$Options.getClass();
                return Boolean.valueOf(featureFlag$EnabledDisabledFeatureFlag$Options.enabled());
            case 7:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("shopInfoDetails");
                return Unit.INSTANCE;
            case 8:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("productsResultsItem");
                return Unit.INSTANCE;
            case 9:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("productsResultsItem");
                return Unit.INSTANCE;
            case 10:
                ShopProductsSearchQueries$paginationToken$2 shopProductsSearchQueries$paginationToken$2 = ShopProductsSearchQueries$paginationToken$2.INSTANCE;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                return shopProductsSearchQueries$paginationToken$2.invoke(androidCursor.getString(0));
            case 11:
                return re$$ExternalSyntheticOutline0.m((AndroidCursor) obj, 0);
            case 12:
                Function1 function14 = (Function1) obj;
                function14.getClass();
                function14.invoke("productsResultsPaginationToken");
                return Unit.INSTANCE;
            case 13:
                Function1 function15 = (Function1) obj;
                function15.getClass();
                function15.invoke("productsResultsPaginationToken");
                return Unit.INSTANCE;
            case 14:
                Function1 function16 = (Function1) obj;
                function16.getClass();
                function16.invoke("productsResultsSection");
                return Unit.INSTANCE;
            case 15:
                Function1 function17 = (Function1) obj;
                function17.getClass();
                function17.invoke("productsResultsSection");
                return Unit.INSTANCE;
            case 16:
                return re$$ExternalSyntheticOutline0.m1431m((AndroidCursor) obj, 0);
            case 17:
                return re$$ExternalSyntheticOutline0.m1431m((AndroidCursor) obj, 0);
            case 18:
                Function1 function18 = (Function1) obj;
                function18.getClass();
                function18.invoke("shoppingRecentlyViewed");
                return Unit.INSTANCE;
            case 19:
                Function1 function19 = (Function1) obj;
                function19.getClass();
                function19.invoke("shoppingRecentlyViewed");
                return Unit.INSTANCE;
            case 20:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindLong(0, 9L);
                return Unit.INSTANCE;
            case 21:
                String str = ((FillrCartInformationExtraction$FillrCartProduct) obj).name;
                return str != null ? str : "";
            case 22:
                Integer num = ((FillrCartInformationExtraction$FillrCartProduct) obj).itemPrice;
                return (num == null || (valueOf = String.valueOf(num.intValue())) == null) ? "" : valueOf;
            case 23:
                Integer num2 = ((FillrCartInformationExtraction$FillrCartProduct) obj).lineTotal;
                return (num2 == null || (valueOf2 = String.valueOf(num2.intValue())) == null) ? "" : valueOf2;
            case 24:
                Integer num3 = ((FillrCartInformationExtraction$FillrCartProduct) obj).quantity;
                return (num3 == null || (valueOf3 = String.valueOf(num3.intValue())) == null) ? "" : valueOf3;
            case 25:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 26:
                ((RestrictedItemWarningSheetViewEvent$Close) obj).getClass();
                return Unit.INSTANCE;
            case 27:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 28:
                Context context = (Context) obj;
                context.getClass();
                MooncakeEmptyView mooncakeEmptyView = new MooncakeEmptyView(context, null);
                mooncakeEmptyView.setExtraHeight(Views.dip((View) mooncakeEmptyView, 112));
                return mooncakeEmptyView;
            default:
                ((ShoppingWebViewEvent) obj).getClass();
                return Unit.INSTANCE;
        }
    }
}
