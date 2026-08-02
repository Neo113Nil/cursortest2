package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardBannerDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionTypeDto;

/* loaded from: classes14.dex */
public final /* synthetic */ class xhw implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntercityDashboardSectionTypeDto b;

    public /* synthetic */ xhw(IntercityDashboardSectionTypeDto intercityDashboardSectionTypeDto, int i) {
        this.a = i;
        this.b = intercityDashboardSectionTypeDto;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        IntercityDashboardSectionTypeDto intercityDashboardSectionTypeDto = this.b;
        IntercityDashboardBannerDto intercityDashboardBannerDto = (IntercityDashboardBannerDto) obj;
        switch (i) {
            case 0:
                return Boolean.valueOf(intercityDashboardBannerDto.e == intercityDashboardSectionTypeDto);
            default:
                return Boolean.valueOf(intercityDashboardBannerDto.e == intercityDashboardSectionTypeDto);
        }
    }
}
