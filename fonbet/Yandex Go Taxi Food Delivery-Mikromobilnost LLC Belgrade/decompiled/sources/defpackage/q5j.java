package defpackage;

import com.yandex.go.taxi.order.experiments.orderdetails.OrderDetailsDriverExperiment;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import com.yandex.go.taxi.order.models.api.objects.TaxiOrderAdditionalData;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$TaxiSearch;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class q5j {
    public final TaxiOrderAdditionalData a;
    public final OrderDetailsDriverExperiment b;
    public final Driver c;
    public final SearchInfoResponse$TaxiSearch d;

    public q5j(TaxiOrderAdditionalData taxiOrderAdditionalData, OrderDetailsDriverExperiment orderDetailsDriverExperiment, Driver driver, SearchInfoResponse$TaxiSearch searchInfoResponse$TaxiSearch) {
        this.a = taxiOrderAdditionalData;
        this.b = orderDetailsDriverExperiment;
        this.c = driver;
        this.d = searchInfoResponse$TaxiSearch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5j)) {
            return false;
        }
        q5j q5jVar = (q5j) obj;
        return this.a.equals(q5jVar.a) && jl40.l(this.b, q5jVar.b) && jl40.l(this.c, q5jVar.c) && jl40.l(this.d, q5jVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        SearchInfoResponse$TaxiSearch searchInfoResponse$TaxiSearch = this.d;
        return hashCode + (searchInfoResponse$TaxiSearch == null ? 0 : searchInfoResponse$TaxiSearch.hashCode());
    }

    public final String toString() {
        return "Dependencies(additionalData=" + this.a + ", experiment=" + this.b + ", driver=" + this.c + ", taxiSearchInfo=" + this.d + Extension.C_BRAKE;
    }
}
