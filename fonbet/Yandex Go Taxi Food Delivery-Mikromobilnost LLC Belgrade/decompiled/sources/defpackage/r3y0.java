package defpackage;

import com.yandex.go.taxi.order.multi.tracking.TaxiOrderMultimodalRoutesView;

/* loaded from: classes14.dex */
public final /* synthetic */ class r3y0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ TaxiOrderMultimodalRoutesView b;

    public /* synthetic */ r3y0(TaxiOrderMultimodalRoutesView taxiOrderMultimodalRoutesView, int i) {
        this.a = i;
        this.b = taxiOrderMultimodalRoutesView;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 onAttachedToWindow$lambda$0;
        zy11 onAttachedToWindow$lambda$1;
        int i = this.a;
        TaxiOrderMultimodalRoutesView taxiOrderMultimodalRoutesView = this.b;
        switch (i) {
            case 0:
                onAttachedToWindow$lambda$0 = TaxiOrderMultimodalRoutesView.onAttachedToWindow$lambda$0(taxiOrderMultimodalRoutesView, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                return onAttachedToWindow$lambda$0;
            default:
                onAttachedToWindow$lambda$1 = TaxiOrderMultimodalRoutesView.onAttachedToWindow$lambda$1(taxiOrderMultimodalRoutesView, (fid) obj, ((Integer) obj2).intValue());
                return onAttachedToWindow$lambda$1;
        }
    }
}
