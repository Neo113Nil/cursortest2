package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.foundation.gestures.e;
import androidx.compose.foundation.pager.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.navigator.driving.DrivingModeNotification;
import com.yandex.go.navigator.gas_stations.overview.GasStationCardView;
import com.yandex.go.navigator.gas_stations.overview.GasStationsOverviewView;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;
import com.ybsdk.screens.initial.deeplink.c;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import java.io.IOException;

/* loaded from: classes3.dex */
public final /* synthetic */ class txk implements wls {
    public final /* synthetic */ int a;

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        zy11 adapter$lambda$0$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        boolean z = false;
        switch (i) {
            case 0:
                String str = (String) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (jl40.l(str, "light")) {
                    z = true;
                } else if (!jl40.l(str, "dark")) {
                    if (str != null) {
                        c.e(SdkUri$QueryParam.CONTROL.getParamValue(), str);
                    }
                    z = booleanValue;
                }
                return Boolean.valueOf(z);
            case 1:
                String str2 = (String) obj;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                if (jl40.l(str2, "light")) {
                    z = true;
                } else if (!jl40.l(str2, "dark")) {
                    if (str2 != null) {
                        c.e(SdkUri$QueryParam.CONTROL.getParamValue(), str2);
                    }
                    z = booleanValue2;
                }
                return Boolean.valueOf(z);
            case 2:
                View inflate = ((LayoutInflater) obj).inflate(fnh0.ybsdk_item_div_kit_skeleton, (ViewGroup) obj2, false);
                if (inflate != null) {
                    return new c261((DivSkeletonsView) inflate);
                }
                ny61.t("rootView");
                return null;
            case 3:
                ((Integer) obj2).getClass();
                tl91.a((fid) obj, vng.O(1));
                return zy11Var;
            case 4:
                ((Integer) obj).intValue();
                return Integer.valueOf(((z8m) obj2).e);
            case 5:
                DrivingModeNotification drivingModeNotification = (DrivingModeNotification) obj;
                DrivingModeNotification drivingModeNotification2 = (DrivingModeNotification) obj2;
                return Boolean.valueOf(jl40.l(drivingModeNotification != null ? drivingModeNotification.getNotificationId() : null, drivingModeNotification2 != null ? drivingModeNotification2.getNotificationId() : null));
            case 6:
                d dVar = ((ppm) obj2).a;
                return scc.g(Integer.valueOf(dVar.k()), Integer.valueOf(dVar.o()));
            case 7:
                return ((qrm) obj2).a.d();
            case 8:
                ((Integer) obj2).getClass();
                yrm.a(null, (fid) obj, vng.O(55));
                return zy11Var;
            case 9:
                return ((e) obj2).g.getValue();
            case 10:
                ((Integer) obj2).getClass();
                r5a1.a((fid) obj, vng.O(1));
                return zy11Var;
            case 11:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.e0(1503684980);
                    btsVar.t(false);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 12:
                return (qdo) ((sbx) obj).b(qdo.Companion.serializer(), (String) obj2);
            case 13:
                return (tdo) ((sbx) obj).b(tdo.Companion.serializer(), (String) obj2);
            case 14:
                return (wdo) ((sbx) obj).b(wdo.Companion.serializer(), (String) obj2);
            case 15:
                return (zdo) ((sbx) obj).b(zdo.Companion.serializer(), (String) obj2);
            case 16:
                return (ceo) ((sbx) obj).b(ceo.Companion.serializer(), (String) obj2);
            case 17:
                return (feo) ((sbx) obj).b(feo.Companion.serializer(), (String) obj2);
            case 18:
                return (ieo) ((sbx) obj).b(ieo.Companion.serializer(), (String) obj2);
            case 19:
                return zy11Var;
            case 20:
                ((Integer) obj2).getClass();
                dha1.c((fid) obj, vng.O(1));
                return zy11Var;
            case 21:
                View inflate2 = ((LayoutInflater) obj).inflate(loh0.ybsdk_item_feed_list_empty, (ViewGroup) obj2, false);
                int i2 = ach0.listEmptyDescription;
                if (((TextView) cma1.O(i2, inflate2)) != null) {
                    i2 = ach0.listEmptyImage;
                    if (((ImageView) cma1.O(i2, inflate2)) != null) {
                        i2 = ach0.listEmptyTitle;
                        if (((TextView) cma1.O(i2, inflate2)) != null) {
                            return new l7n((ConstraintLayout) inflate2, 6);
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
                return null;
            case 22:
                View inflate3 = ((LayoutInflater) obj).inflate(loh0.ybsdk_item_feed_list_entry_shimmer, (ViewGroup) obj2, false);
                int i3 = ach0.amountSkeleton;
                if (((SkeletonView) cma1.O(i3, inflate3)) != null) {
                    i3 = ach0.iconSkeleton;
                    if (((SkeletonView) cma1.O(i3, inflate3)) != null) {
                        i3 = ach0.titleSkeleton;
                        if (((SkeletonView) cma1.O(i3, inflate3)) != null) {
                            return new wz51((ShimmerFrameLayout) inflate3, 9);
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i3)));
                return null;
            case 23:
                View inflate4 = ((LayoutInflater) obj).inflate(loh0.ybsdk_item_feed_list_title_shimmer, (ViewGroup) obj2, false);
                int i4 = ach0.headerSkeleton;
                if (((SkeletonView) cma1.O(i4, inflate4)) != null) {
                    return new wz51((ShimmerFrameLayout) inflate4, 10);
                }
                ny61.t("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i4)));
                return null;
            case 24:
                throw ((IOException) obj2);
            case 25:
                return Boolean.valueOf(((fnx0) obj).a((fnx0) obj2));
            case 26:
                return Boolean.valueOf(((fnx0) obj).a((fnx0) obj2));
            case 27:
                return u161.o((LayoutInflater) obj, (ViewGroup) obj2);
            case 28:
                adapter$lambda$0$0 = GasStationsOverviewView.adapter$lambda$0$0((GasStationCardView) obj, (pts) obj2);
                return adapter$lambda$0$0;
            default:
                return Boolean.valueOf(!jl40.l(((q2x) obj).b, ((q2x) obj2).b));
        }
    }

    public /* synthetic */ txk(int i, int i2) {
        this.a = i2;
    }

    public /* synthetic */ txk(int i, Object obj) {
        this.a = i;
    }

    public /* synthetic */ txk(int i) {
        this.a = i;
    }
}
