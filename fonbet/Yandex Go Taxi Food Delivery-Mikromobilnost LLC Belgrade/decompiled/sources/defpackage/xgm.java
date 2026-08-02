package defpackage;

import com.yandex.mobile.drive.sdk.full.DriveSummaryCardCollapseSource;
import com.yandex.mobile.drive.sdk.full.DriveSummaryCardExpansionSource;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lxgm;", "Ll050;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface xgm extends l050 {
    void G1(boolean z);

    void Ha(dem demVar);

    void collapse();

    void expand();

    boolean isCollapsed();

    void k5();

    void notifySummaryCollapsed(DriveSummaryCardCollapseSource driveSummaryCardCollapseSource);

    void notifySummaryExpanded(DriveSummaryCardExpansionSource driveSummaryCardExpansionSource);

    void pg(boolean z);

    void z5(boolean z);
}
