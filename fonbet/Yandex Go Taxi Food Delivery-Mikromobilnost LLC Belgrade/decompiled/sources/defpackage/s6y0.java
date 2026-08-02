package defpackage;

import com.yandex.go.taxi.order.ui.TaxiOrderTrackingBackButton;

/* loaded from: classes14.dex */
public final class s6y0 extends iq60 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ TaxiOrderTrackingBackButton b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s6y0(TaxiOrderTrackingBackButton taxiOrderTrackingBackButton) {
        super(r0);
        Float valueOf = Float.valueOf(0.5f);
        this.b = taxiOrderTrackingBackButton;
    }

    @Override // defpackage.iq60
    public final void afterChange(kgx kgxVar, Object obj, Object obj2) {
        int i = this.a;
        TaxiOrderTrackingBackButton taxiOrderTrackingBackButton = this.b;
        switch (i) {
            case 0:
                ((Number) obj2).floatValue();
                ((Number) obj).floatValue();
                taxiOrderTrackingBackButton.updateVisibility();
                break;
            default:
                ((Number) obj2).floatValue();
                ((Number) obj).floatValue();
                taxiOrderTrackingBackButton.updateVisibility();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6y0(Float f, TaxiOrderTrackingBackButton taxiOrderTrackingBackButton) {
        super(f);
        this.b = taxiOrderTrackingBackButton;
    }
}
