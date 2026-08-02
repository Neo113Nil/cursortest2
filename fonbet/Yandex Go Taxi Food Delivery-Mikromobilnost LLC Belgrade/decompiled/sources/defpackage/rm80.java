package defpackage;

import com.yandex.go.places.analytics.generated.DiscoveryAnalytics$OrganizationListFiltersCardCloseReason;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.FiltersAndSortingResponseDto;
import com.yandex.go.places.impl.data.repositories.organizations.b;
import com.yandex.go.places.impl.domain.interactors.a;

/* loaded from: classes13.dex */
public final class rm80 extends ad5 {
    public final a A;
    public final xx20 B;
    public final fl10 C;
    public final jio x;
    public final hit y;
    public final um80 z;

    public rm80(jio jioVar, hit hitVar, um80 um80Var, a aVar, xx20 xx20Var, fl10 fl10Var) {
        super(pm80.class);
        this.x = jioVar;
        this.y = hitVar;
        this.z = um80Var;
        this.A = aVar;
        this.B = xx20Var;
        this.C = fl10Var;
    }

    public final void Kg(DiscoveryAnalytics$OrganizationListFiltersCardCloseReason discoveryAnalytics$OrganizationListFiltersCardCloseReason) {
        b bVar = this.z.a.b;
        bVar.c((FiltersAndSortingResponseDto) bVar.e.getValue());
        this.x.a(discoveryAnalytics$OrganizationListFiltersCardCloseReason);
    }
}
