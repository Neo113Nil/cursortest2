package app.cash.local.views.map;

import android.view.View;
import app.cash.local.viewmodels.wallet.BrandCollectionEvent;
import app.cash.local.viewmodels.wallet.BrandCollectionMapViewEvent;
import com.squareup.cash.investing.primitives.FilterToken;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewEvent;
import com.squareup.util.android.Keyboards;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class BrandCollectionSheetViewKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ View f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ BrandCollectionSheetViewKt$$ExternalSyntheticLambda0(View view, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = view;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        View view = this.f$0;
        switch (i) {
            case 0:
                BrandCollectionMapViewEvent brandCollectionMapViewEvent = (BrandCollectionMapViewEvent) obj;
                brandCollectionMapViewEvent.getClass();
                if (brandCollectionMapViewEvent instanceof BrandCollectionEvent.LocationRowClicked) {
                    Keyboards.hideKeyboard(view);
                }
                function1.invoke(brandCollectionMapViewEvent);
                break;
            default:
                FilterToken filterToken = (FilterToken) obj;
                filterToken.getClass();
                Keyboards.hideKeyboard(view);
                function1.invoke(new InvestingSearchViewEvent.FilterSelected(filterToken));
                break;
        }
        return Unit.INSTANCE;
    }
}
