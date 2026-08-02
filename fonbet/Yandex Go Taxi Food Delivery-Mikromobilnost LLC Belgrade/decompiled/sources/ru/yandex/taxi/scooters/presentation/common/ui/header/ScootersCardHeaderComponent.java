package ru.yandex.taxi.scooters.presentation.common.ui.header;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import com.yandex.payment.common.result.ResultType;
import defpackage.a0b1;
import defpackage.aki0;
import defpackage.bys;
import defpackage.c0n0;
import defpackage.c5n0;
import defpackage.d5n0;
import defpackage.evu0;
import defpackage.f3x;
import defpackage.g18;
import defpackage.g7e;
import defpackage.h7e;
import defpackage.i3y;
import defpackage.j3x;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.k7x0;
import defpackage.kok0;
import defpackage.kyh0;
import defpackage.lbb0;
import defpackage.lbm;
import defpackage.m7x0;
import defpackage.mrg0;
import defpackage.msg0;
import defpackage.nac;
import defpackage.pav;
import defpackage.q0h0;
import defpackage.q7p0;
import defpackage.qje;
import defpackage.r7p0;
import defpackage.rcc;
import defpackage.s3h0;
import defpackage.sls;
import defpackage.t4n0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tmm0;
import defpackage.u4n0;
import defpackage.uqu;
import defpackage.v4n0;
import defpackage.wls;
import defpackage.wro0;
import defpackage.wxs;
import defpackage.xng0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.scooters.experiments.ScootersCardV2;
import ru.yandex.taxi.scooters.experiments.t;
import ru.yandex.taxi.scooters.presentation.common.ui.header.ScootersCardHeaderComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0003{|}B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJW\u0010\u001a\u001a\u00020\u00182\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001dJ_\u0010,\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0018\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\b\b\u0003\u0010+\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u0018¢\u0006\u0004\b.\u0010\u001dJ\u000f\u0010/\u001a\u00020\u0018H\u0014¢\u0006\u0004\b/\u0010\u001dJ\u0019\u00100\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b0\u00101J'\u00104\u001a\b\u0012\u0004\u0012\u000203022\u0006\u0010$\u001a\u00020#2\b\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0018H\u0002¢\u0006\u0004\b6\u0010\u001dJ\u000f\u00108\u001a\u000207H\u0002¢\u0006\u0004\b8\u00109J\u001b\u0010<\u001a\u00020\u0018*\u0002072\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b?\u0010@J\u001b\u0010C\u001a\u00020\u0018*\u00020>2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010F\u001a\u00020EH\u0002¢\u0006\u0004\bF\u0010GJ\u001b\u0010J\u001a\u00020\u0018*\u00020E2\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bJ\u0010KR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010LR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010MR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010NR\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010OR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010PR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010QR\u001e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010RR\u001b\u0010X\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R#\u0010`\u001a\n\u0012\u0006\b\u0000\u0012\u0002030\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010U\u001a\u0004\b^\u0010_R\u0015\u0010d\u001a\u00020a8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0015\u0010f\u001a\u00020a8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u0010cR\u0015\u0010j\u001a\u00020g8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0015\u0010n\u001a\u00020k8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0015\u0010r\u001a\u00020o8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0015\u0010t\u001a\u00020o8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010qR\u0015\u0010x\u001a\u00020u8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0015\u0010z\u001a\u00020a8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\by\u0010c¨\u0006~"}, d2 = {"Lru/yandex/taxi/scooters/presentation/common/ui/header/ScootersCardHeaderComponent;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lpav;", "imageLoader", "Lk7x0;", "tagUrlFormatter", "Lc0n0;", "scootersBatteryViewFactory", "Lwro0;", "scootersRemainingChargeTextFactory", "Lru/yandex/taxi/scooters/experiments/ScootersCardV2$ChargeConfig;", "chargeConfig", "Lru/yandex/taxi/scooters/experiments/ScootersCardV2$a;", "batteryChargePercents", "Lkotlin/Function0;", "Lzy11;", "onInsuranceClick", "init", "(Lpav;Lk7x0;Lc0n0;Lwro0;Lru/yandex/taxi/scooters/experiments/ScootersCardV2$ChargeConfig;Lru/yandex/taxi/scooters/experiments/ScootersCardV2$a;Lsls;)V", "setDefaultAccessibilityFocus", "()V", ResultType.RESULT_TYPE_LOADING, "Lr7p0;", "vehicleNumber", "Lru/yandex/taxi/scooters/presentation/common/ui/header/ScootersCardHeaderComponent$AppearanceMode;", "appearanceMode", "Lq7p0;", "vehicleHealthState", "", "scooterImage", "Lkotlin/Function1;", "onRemoveListener", "Ld5n0;", "scootersInsurance", "vehicleTypeImageId", "success", "(Lr7p0;Lru/yandex/taxi/scooters/presentation/common/ui/header/ScootersCardHeaderComponent$AppearanceMode;Lq7p0;Ljava/lang/String;Ltls;Ld5n0;I)V", "error", "onDetachedFromWindow", "loadImage", "(Ljava/lang/String;)V", "", "", "createLabels", "(Lq7p0;Ld5n0;)Ljava/util/List;", "cancelImageLoading", "Landroid/widget/FrameLayout;", "createBatteryContainer", "()Landroid/widget/FrameLayout;", "Lt4n0;", "battery", "bindBattery", "(Landroid/widget/FrameLayout;Lt4n0;)V", "Lru/yandex/taxi/scooters/presentation/common/ui/header/ScootersCardHeaderComponent$RemainingChargePlateLabelView;", "createRemainingChargePlateLabelView", "()Lru/yandex/taxi/scooters/presentation/common/ui/header/ScootersCardHeaderComponent$RemainingChargePlateLabelView;", "Lv4n0;", "remainingChargePlate", "bindRemainingChargePlateLabel", "(Lru/yandex/taxi/scooters/presentation/common/ui/header/ScootersCardHeaderComponent$RemainingChargePlateLabelView;Lv4n0;)V", "Lru/yandex/taxi/scooters/presentation/common/ui/header/ScootersCardHeaderComponent$IconPlateLabelView;", "createIconPlateLabelView", "()Lru/yandex/taxi/scooters/presentation/common/ui/header/ScootersCardHeaderComponent$IconPlateLabelView;", "Lu4n0;", "iconPlate", "bindIconPlateLabel", "(Lru/yandex/taxi/scooters/presentation/common/ui/header/ScootersCardHeaderComponent$IconPlateLabelView;Lu4n0;)V", "Lpav;", "Lk7x0;", "Lru/yandex/taxi/scooters/experiments/ScootersCardV2$ChargeConfig;", "Lru/yandex/taxi/scooters/experiments/ScootersCardV2$a;", "Lc0n0;", "Lwro0;", "Lsls;", "Lc5n0;", "scootersCardHeaderComponents$delegate", "Li3y;", "getScootersCardHeaderComponents", "()Lc5n0;", "scootersCardHeaderComponents", "Lg18;", "imageLoadCancellable", "Lg18;", "Lbys;", "labelsAdapter$delegate", "getLabelsAdapter", "()Lbys;", "labelsAdapter", "Lcom/yandex/go/design/view/GoImageView;", "getImage", "()Lcom/yandex/go/design/view/GoImageView;", "image", "getRemove", "remove", "Lru/yandex/taxi/widget/RobotoTextView;", "getNumber", "()Lru/yandex/taxi/widget/RobotoTextView;", "number", "Landroidx/recyclerview/widget/RecyclerView;", "getLabelsRv", "()Landroidx/recyclerview/widget/RecyclerView;", "labelsRv", "Landroidx/constraintlayout/widget/Group;", "getShimmerGroup", "()Landroidx/constraintlayout/widget/Group;", "shimmerGroup", "getSuccessGroup", "successGroup", "Lru/yandex/taxi/widget/ShimmeringBar;", "getShimmerOfBattery", "()Lru/yandex/taxi/widget/ShimmeringBar;", "shimmerOfBattery", "getVehicleTypeImageView", "vehicleTypeImageView", "AppearanceMode", "RemainingChargePlateLabelView", "IconPlateLabelView", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersCardHeaderComponent extends GoConstraintLayout {
    private ScootersCardV2.a batteryChargePercents;
    private ScootersCardV2.ChargeConfig chargeConfig;
    private g18 imageLoadCancellable;
    private pav imageLoader;

    /* renamed from: labelsAdapter$delegate, reason: from kotlin metadata */
    private final i3y labelsAdapter;
    private sls onInsuranceClick;
    private c0n0 scootersBatteryViewFactory;

    /* renamed from: scootersCardHeaderComponents$delegate, reason: from kotlin metadata */
    private final i3y scootersCardHeaderComponents;
    private wro0 scootersRemainingChargeTextFactory;
    private k7x0 tagUrlFormatter;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/scooters/presentation/common/ui/header/ScootersCardHeaderComponent$AppearanceMode;", "", "AS_SINGLE", "AS_ONE_OF_MULTIPLE", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class AppearanceMode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ AppearanceMode[] $VALUES;
        public static final AppearanceMode AS_ONE_OF_MULTIPLE;
        public static final AppearanceMode AS_SINGLE;

        static {
            AppearanceMode appearanceMode = new AppearanceMode("AS_SINGLE", 0);
            AS_SINGLE = appearanceMode;
            AppearanceMode appearanceMode2 = new AppearanceMode("AS_ONE_OF_MULTIPLE", 1);
            AS_ONE_OF_MULTIPLE = appearanceMode2;
            AppearanceMode[] appearanceModeArr = {appearanceMode, appearanceMode2};
            $VALUES = appearanceModeArr;
            $ENTRIES = kotlin.enums.a.a(appearanceModeArr);
        }

        public static AppearanceMode valueOf(String str) {
            return (AppearanceMode) Enum.valueOf(AppearanceMode.class, str);
        }

        public static AppearanceMode[] values() {
            return (AppearanceMode[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/scooters/presentation/common/ui/header/ScootersCardHeaderComponent$IconPlateLabelView;", "Lcom/yandex/go/design/view/GoImageView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lu4n0;", "iconPlate", "Lzy11;", "applyChip", "(Lu4n0;)V", "bind", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lu4n0;", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class IconPlateLabelView extends GoImageView {
        private u4n0 iconPlate;

        public IconPlateLabelView(Context context) {
            super(context, null, 0, 6, null);
        }

        private final void applyChip(u4n0 iconPlate) {
            Drawable drawable;
            setBackgroundResource(s3h0.scooters_rounded_background_minor);
            if (iconPlate.c != null) {
                drawable = tje.y(q0h0.scooters_rounded_foreground_ripple, getContext());
            } else {
                drawable = null;
            }
            setForeground(drawable);
            setImageResource(iconPlate.a);
            setContentDescription(getContext().getString(iconPlate.b));
            c.z(iconPlate.c, this);
        }

        @Override // com.yandex.go.design.view.GoImageView, defpackage.nwy0
        public void applyTheme(ThemeType themeType) {
            super.applyTheme(themeType);
            u4n0 u4n0Var = this.iconPlate;
            if (u4n0Var != null) {
                applyChip(u4n0Var);
            }
        }

        public final void bind(u4n0 iconPlate) {
            this.iconPlate = iconPlate;
            applyChip(iconPlate);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/scooters/presentation/common/ui/header/ScootersCardHeaderComponent$RemainingChargePlateLabelView;", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "applyChipStyle", "()V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class RemainingChargePlateLabelView extends RobotoTextView {
        public RemainingChargePlateLabelView(Context context) {
            super(context, null, 0, 6, null);
        }

        public final void applyChipStyle() {
            setBackgroundResource(s3h0.scooters_rounded_background_minor);
            setTextColor(qje.t(xng0.textMinor, getContext()));
        }

        @Override // ru.yandex.taxi.widget.RobotoTextView, defpackage.nwy0
        public void applyTheme(ThemeType themeType) {
            super.applyTheme(themeType);
            applyChipStyle();
        }
    }

    public ScootersCardHeaderComponent(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ScootersCardV2.ChargeConfig.Companion.getClass();
        this.chargeConfig = ScootersCardV2.ChargeConfig.e;
        ScootersCardV2.a.Companion.getClass();
        this.batteryChargePercents = ScootersCardV2.a.c;
        kok0 kok0Var = new kok0(context, 3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.scootersCardHeaderComponents = kotlin.a.b(lazyThreadSafetyMode, kok0Var);
        this.labelsAdapter = kotlin.a.b(lazyThreadSafetyMode, new tmm0(11, this, context));
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
    }

    private final void bindBattery(FrameLayout frameLayout, t4n0 t4n0Var) {
        frameLayout.removeAllViews();
        c0n0 c0n0Var = this.scootersBatteryViewFactory;
        if (c0n0Var != null) {
            frameLayout.addView(c0n0Var.a(t4n0Var.b, t4n0Var.a, t4n0Var.c));
        }
    }

    private final void bindIconPlateLabel(IconPlateLabelView iconPlateLabelView, u4n0 u4n0Var) {
        iconPlateLabelView.bind(u4n0Var);
    }

    private final void bindRemainingChargePlateLabel(RemainingChargePlateLabelView remainingChargePlateLabelView, v4n0 v4n0Var) {
        remainingChargePlateLabelView.applyChipStyle();
        wro0 wro0Var = this.scootersRemainingChargeTextFactory;
        String a = wro0Var != null ? wro0Var.a(v4n0Var.a, v4n0Var.b) : null;
        if (a != null) {
            remainingChargePlateLabelView.setText(a);
            wro0 wro0Var2 = this.scootersRemainingChargeTextFactory;
            remainingChargePlateLabelView.setContentDescription(wro0Var2 != null ? wro0Var2.b(v4n0Var.a, a) : null);
        }
    }

    private final void cancelImageLoading() {
        g18 g18Var = this.imageLoadCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.imageLoadCancellable = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout createBatteryContainer() {
        GoFrameLayout goFrameLayout = new GoFrameLayout(getContext(), null, 0, 0, 14, null);
        goFrameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        return goFrameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IconPlateLabelView createIconPlateLabelView() {
        IconPlateLabelView iconPlateLabelView = new IconPlateLabelView(getContext());
        int r = tje.r(msg0.scooters_card_labels_height, iconPlateLabelView.getContext());
        iconPlateLabelView.setLayoutParams(new ConstraintLayout.LayoutParams(-2, r));
        setMinWidth(r);
        int u = tje.u(6, iconPlateLabelView.getContext());
        int u2 = tje.u(4, iconPlateLabelView.getContext());
        iconPlateLabelView.setPadding(u, u2, u, u2);
        return iconPlateLabelView;
    }

    private final List<Object> createLabels(q7p0 vehicleHealthState, d5n0 scootersInsurance) {
        ListBuilder a = rcc.a();
        t tVar = this.chargeConfig.a;
        if (tVar.getA()) {
            a.add(new t4n0(tVar, this.batteryChargePercents, vehicleHealthState));
        }
        jsq0 jsq0Var = this.chargeConfig.b;
        ArrayList arrayList = new ArrayList();
        Iterator it = jsq0Var.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ScootersCardV2.ChargeConfig.ValueOption valueOption = (ScootersCardV2.ChargeConfig.ValueOption) it.next();
            if (valueOption != null && valueOption != ScootersCardV2.ChargeConfig.ValueOption.NONE) {
                r4 = new v4n0(valueOption, vehicleHealthState);
            }
            if (r4 != null) {
                arrayList.add(r4);
            }
        }
        a.addAll(arrayList);
        if ((scootersInsurance != null ? scootersInsurance.a : null) == ScootersInsuranceType.FULL) {
            a.add(new u4n0(q0h0.scooters_card_v2_insurance_icon, kyh0.scooters_insurance_title, this.onInsuranceClick));
        }
        return a.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RemainingChargePlateLabelView createRemainingChargePlateLabelView() {
        RemainingChargePlateLabelView remainingChargePlateLabelView = new RemainingChargePlateLabelView(getContext());
        remainingChargePlateLabelView.setLayoutParams(new ConstraintLayout.LayoutParams(-2, tje.r(msg0.scooters_card_labels_height, remainingChargePlateLabelView.getContext())));
        remainingChargePlateLabelView.setGravity(17);
        int r = tje.r(mrg0.go_design_s_space, remainingChargePlateLabelView.getContext());
        int u = tje.u(2, remainingChargePlateLabelView.getContext());
        remainingChargePlateLabelView.setPadding(r, u, r, u);
        remainingChargePlateLabelView.setTextSize(tje.s(mrg0.component_text_size_body, remainingChargePlateLabelView.getContext()));
        return remainingChargePlateLabelView;
    }

    private final GoImageView getImage() {
        return getScootersCardHeaderComponents().p;
    }

    private final bys getLabelsAdapter() {
        return (bys) this.labelsAdapter.getValue();
    }

    private final RecyclerView getLabelsRv() {
        return getScootersCardHeaderComponents().s;
    }

    private final RobotoTextView getNumber() {
        return getScootersCardHeaderComponents().q;
    }

    private final GoImageView getRemove() {
        return getScootersCardHeaderComponents().t;
    }

    private final c5n0 getScootersCardHeaderComponents() {
        return (c5n0) this.scootersCardHeaderComponents.getValue();
    }

    private final Group getShimmerGroup() {
        return getScootersCardHeaderComponents().k;
    }

    private final ShimmeringBar getShimmerOfBattery() {
        return getScootersCardHeaderComponents().n;
    }

    private final Group getSuccessGroup() {
        return getScootersCardHeaderComponents().o;
    }

    private final GoImageView getVehicleTypeImageView() {
        return getScootersCardHeaderComponents().r;
    }

    public static void init$default(ScootersCardHeaderComponent scootersCardHeaderComponent, pav pavVar, k7x0 k7x0Var, c0n0 c0n0Var, wro0 wro0Var, ScootersCardV2.ChargeConfig chargeConfig, ScootersCardV2.a aVar, sls slsVar, int i, Object obj) {
        if ((i & 16) != 0) {
            ScootersCardV2.ChargeConfig.Companion.getClass();
            chargeConfig = ScootersCardV2.ChargeConfig.e;
        }
        ScootersCardV2.ChargeConfig chargeConfig2 = chargeConfig;
        if ((i & 32) != 0) {
            ScootersCardV2.a.Companion.getClass();
            aVar = ScootersCardV2.a.c;
        }
        scootersCardHeaderComponent.init(pavVar, k7x0Var, c0n0Var, wro0Var, chargeConfig2, aVar, (i & 64) != 0 ? null : slsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bys labelsAdapter_delegate$lambda$0(ScootersCardHeaderComponent scootersCardHeaderComponent, Context context) {
        scootersCardHeaderComponent.getScootersCardHeaderComponents().s.setItemAnimator(null);
        scootersCardHeaderComponent.getScootersCardHeaderComponents().s.addItemDecoration(new uqu(tje.u(6, scootersCardHeaderComponent.getContext())));
        RecyclerView recyclerView = scootersCardHeaderComponent.getScootersCardHeaderComponents().s;
        j3x j3xVar = new j3x();
        labelsAdapter_delegate$lambda$0$0(context, scootersCardHeaderComponent, j3xVar);
        LinearLayoutManager linearLayoutManager = j3xVar.b;
        if (linearLayoutManager == null) {
            linearLayoutManager = new LinearLayoutManager(recyclerView.getContext(), 1, false);
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        bys bysVar = new bys(new wxs(), j3xVar.a);
        recyclerView.setAdapter(bysVar);
        return bysVar;
    }

    private static final zy11 labelsAdapter_delegate$lambda$0$0(Context context, final ScootersCardHeaderComponent scootersCardHeaderComponent, j3x j3xVar) {
        final int i = 0;
        j3xVar.b = new LinearLayoutManager(context, 0, false);
        aki0.b(new f3x(t4n0.class, j3xVar, new ScootersCardHeaderComponent$labelsAdapter$2$1$1(0, scootersCardHeaderComponent, ScootersCardHeaderComponent.class, "createBatteryContainer", "createBatteryContainer()Landroid/widget/FrameLayout;", 0)), new lbb0(23, scootersCardHeaderComponent));
        aki0.b(new f3x(v4n0.class, j3xVar, new ScootersCardHeaderComponent$labelsAdapter$2$1$3(0, scootersCardHeaderComponent, ScootersCardHeaderComponent.class, "createRemainingChargePlateLabelView", "createRemainingChargePlateLabelView()Lru/yandex/taxi/scooters/presentation/common/ui/header/ScootersCardHeaderComponent$RemainingChargePlateLabelView;", 0)), new wls(scootersCardHeaderComponent) { // from class: ru.yandex.taxi.scooters.presentation.common.ui.header.a
            public final /* synthetic */ ScootersCardHeaderComponent b;

            {
                this.b = scootersCardHeaderComponent;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                zy11 labelsAdapter_delegate$lambda$0$0$1;
                zy11 labelsAdapter_delegate$lambda$0$0$2;
                switch (i) {
                    case 0:
                        labelsAdapter_delegate$lambda$0$0$1 = ScootersCardHeaderComponent.labelsAdapter_delegate$lambda$0$0$1(this.b, (ScootersCardHeaderComponent.RemainingChargePlateLabelView) obj, (v4n0) obj2);
                        return labelsAdapter_delegate$lambda$0$0$1;
                    default:
                        labelsAdapter_delegate$lambda$0$0$2 = ScootersCardHeaderComponent.labelsAdapter_delegate$lambda$0$0$2(this.b, (ScootersCardHeaderComponent.IconPlateLabelView) obj, (u4n0) obj2);
                        return labelsAdapter_delegate$lambda$0$0$2;
                }
            }
        });
        f3x f3xVar = new f3x(u4n0.class, j3xVar, new ScootersCardHeaderComponent$labelsAdapter$2$1$5(0, scootersCardHeaderComponent, ScootersCardHeaderComponent.class, "createIconPlateLabelView", "createIconPlateLabelView()Lru/yandex/taxi/scooters/presentation/common/ui/header/ScootersCardHeaderComponent$IconPlateLabelView;", 0));
        final int i2 = 1;
        aki0.b(f3xVar, new wls(scootersCardHeaderComponent) { // from class: ru.yandex.taxi.scooters.presentation.common.ui.header.a
            public final /* synthetic */ ScootersCardHeaderComponent b;

            {
                this.b = scootersCardHeaderComponent;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                zy11 labelsAdapter_delegate$lambda$0$0$1;
                zy11 labelsAdapter_delegate$lambda$0$0$2;
                switch (i2) {
                    case 0:
                        labelsAdapter_delegate$lambda$0$0$1 = ScootersCardHeaderComponent.labelsAdapter_delegate$lambda$0$0$1(this.b, (ScootersCardHeaderComponent.RemainingChargePlateLabelView) obj, (v4n0) obj2);
                        return labelsAdapter_delegate$lambda$0$0$1;
                    default:
                        labelsAdapter_delegate$lambda$0$0$2 = ScootersCardHeaderComponent.labelsAdapter_delegate$lambda$0$0$2(this.b, (ScootersCardHeaderComponent.IconPlateLabelView) obj, (u4n0) obj2);
                        return labelsAdapter_delegate$lambda$0$0$2;
                }
            }
        });
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 labelsAdapter_delegate$lambda$0$0$0(ScootersCardHeaderComponent scootersCardHeaderComponent, FrameLayout frameLayout, t4n0 t4n0Var) {
        scootersCardHeaderComponent.bindBattery(frameLayout, t4n0Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 labelsAdapter_delegate$lambda$0$0$1(ScootersCardHeaderComponent scootersCardHeaderComponent, RemainingChargePlateLabelView remainingChargePlateLabelView, v4n0 v4n0Var) {
        scootersCardHeaderComponent.bindRemainingChargePlateLabel(remainingChargePlateLabelView, v4n0Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 labelsAdapter_delegate$lambda$0$0$2(ScootersCardHeaderComponent scootersCardHeaderComponent, IconPlateLabelView iconPlateLabelView, u4n0 u4n0Var) {
        scootersCardHeaderComponent.bindIconPlateLabel(iconPlateLabelView, u4n0Var);
        return zy11.a;
    }

    private final void loadImage(String scooterImage) {
        String a;
        if (scooterImage == null || evu0.J(scooterImage)) {
            return;
        }
        GoImageView goImageView = getScootersCardHeaderComponents().p;
        pav pavVar = this.imageLoader;
        g18 g18Var = null;
        lbm a2 = pavVar != null ? pavVar.a(goImageView) : null;
        if (a2 != null) {
            k7x0 k7x0Var = this.tagUrlFormatter;
            if (k7x0Var == null || (a = ((m7x0) k7x0Var).a(scooterImage)) == null) {
                return;
            } else {
                g18Var = ((nac) a2).c(a);
            }
        }
        this.imageLoadCancellable = g18Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5n0 scootersCardHeaderComponents_delegate$lambda$0(Context context) {
        return new c5n0(context);
    }

    public static /* synthetic */ void success$default(ScootersCardHeaderComponent scootersCardHeaderComponent, r7p0 r7p0Var, AppearanceMode appearanceMode, q7p0 q7p0Var, String str, tls tlsVar, d5n0 d5n0Var, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = null;
        }
        if ((i2 & 16) != 0) {
            tlsVar = null;
        }
        if ((i2 & 32) != 0) {
            d5n0Var = null;
        }
        if ((i2 & 64) != 0) {
            i = 0;
        }
        scootersCardHeaderComponent.success(r7p0Var, appearanceMode, q7p0Var, str, tlsVar, d5n0Var, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 success$lambda$1(tls tlsVar, r7p0 r7p0Var) {
        if (tlsVar != null) {
            tlsVar.invoke(r7p0Var);
        }
        return zy11.a;
    }

    public final void error() {
        cancelImageLoading();
        setVisibility(8);
    }

    public final void init(pav imageLoader, k7x0 tagUrlFormatter, c0n0 scootersBatteryViewFactory, wro0 scootersRemainingChargeTextFactory, ScootersCardV2.ChargeConfig chargeConfig, ScootersCardV2.a batteryChargePercents, sls onInsuranceClick) {
        this.imageLoader = imageLoader;
        this.tagUrlFormatter = tagUrlFormatter;
        this.scootersBatteryViewFactory = scootersBatteryViewFactory;
        this.scootersRemainingChargeTextFactory = scootersRemainingChargeTextFactory;
        this.chargeConfig = chargeConfig;
        this.batteryChargePercents = batteryChargePercents;
        this.onInsuranceClick = onInsuranceClick;
        c5n0 scootersCardHeaderComponents = getScootersCardHeaderComponents();
        int i = scootersCardHeaderComponents.i;
        int i2 = scootersCardHeaderComponents.h;
        int i3 = scootersCardHeaderComponents.c;
        int i4 = scootersCardHeaderComponents.d;
        int i5 = scootersCardHeaderComponents.e;
        int i6 = scootersCardHeaderComponents.a;
        e eVar = new e();
        h7e h7eVar = new h7e(eVar, this);
        Guideline guideline = scootersCardHeaderComponents.j;
        int i7 = scootersCardHeaderComponents.g;
        int generateViewId = View.generateViewId();
        guideline.setId(generateViewId);
        guideline.setGuidelineBegin(i7);
        ViewGroup.LayoutParams layoutParams = guideline.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        int i8 = layoutParams2 != null ? layoutParams2.orientation : 1;
        e.b bVar = eVar.o(generateViewId).e;
        bVar.a = true;
        bVar.F = i8;
        eVar.o(generateViewId).e.e = i7;
        eVar.o(generateViewId).e.f = -1;
        eVar.o(generateViewId).e.g = -1.0f;
        addView(guideline);
        eVar.i(generateViewId, 6, 0, 6);
        int b = h7eVar.b(scootersCardHeaderComponents.l);
        int b2 = h7eVar.b(scootersCardHeaderComponents.n);
        int b3 = h7eVar.b(scootersCardHeaderComponents.m);
        h7eVar.e(b, 0);
        h7eVar.d(b, scootersCardHeaderComponents.b);
        eVar.w(b, 6, i7);
        eVar.w(b, 7, i7);
        eVar.w(b, 3, scootersCardHeaderComponents.f);
        eVar.o(b).e.x = 0.0f;
        h7eVar.c(b);
        eVar.i(b, 6, 0, 6);
        eVar.i(b, 3, 0, 3);
        eVar.o(b).e.e0 = 0.65f;
        h7eVar.e(b2, -2);
        h7eVar.d(b2, i6);
        eVar.x(b2, 8);
        eVar.w(b2, 3, i5);
        eVar.w(b2, 4, i5);
        eVar.i(b2, 4, 0, 4);
        eVar.i(b2, 7, b3, 6);
        eVar.o(b2).e.x = 0.0f;
        eVar.o(b2).e.W = 2;
        eVar.i(b2, 6, generateViewId, 6);
        eVar.i(b2, 3, b, 4);
        h7eVar.e(b3, 0);
        h7eVar.d(b3, i6);
        eVar.w(b3, 6, i4);
        eVar.w(b3, 3, i3);
        eVar.w(b3, 4, i5);
        eVar.o(b3).e.x = 0.0f;
        eVar.i(b3, 4, 0, 4);
        h7eVar.c(b3);
        eVar.i(b3, 6, b2, 7);
        eVar.i(b3, 3, b, 4);
        eVar.o(b3).e.e0 = 0.35f;
        eVar.o(b3).e.S = 0;
        h7eVar.a(scootersCardHeaderComponents.k, new g7e[]{new g7e(b), new g7e(b2), new g7e(b3)});
        int b4 = h7eVar.b(scootersCardHeaderComponents.p);
        int b5 = h7eVar.b(scootersCardHeaderComponents.q);
        int b6 = h7eVar.b(scootersCardHeaderComponents.r);
        h7eVar.e(b4, -2);
        h7eVar.d(b4, 0);
        eVar.i(b4, 4, 0, 4);
        h7eVar.c(b4);
        eVar.i(b4, 3, 0, 3);
        h7eVar.e(b5, -2);
        h7eVar.d(b5, -2);
        eVar.w(b5, 3, i4);
        eVar.w(b5, 7, i7);
        eVar.o(b5).e.x = 0.0f;
        h7eVar.c(b5);
        eVar.i(b5, 3, 0, 3);
        eVar.i(b5, 6, b6, 7);
        h7eVar.e(b6, i2);
        h7eVar.d(b6, i2);
        eVar.w(b6, 3, i4);
        eVar.x(b6, 8);
        eVar.i(b6, 6, generateViewId, 6);
        eVar.i(b6, 3, 0, 3);
        int b7 = h7eVar.b(scootersCardHeaderComponents.s);
        h7eVar.e(b7, 0);
        h7eVar.d(b7, i6);
        eVar.w(b7, 7, i7);
        eVar.w(b7, 3, i5);
        eVar.w(b7, 4, i5);
        eVar.i(b7, 4, 0, 4);
        h7eVar.c(b7);
        eVar.o(b7).e.x = 0.0f;
        eVar.o(b7).e.W = 2;
        eVar.i(b7, 6, generateViewId, 6);
        eVar.i(b7, 3, b5, 4);
        h7eVar.a(scootersCardHeaderComponents.o, new g7e[]{new g7e(b4), new g7e(b5), new g7e(b7)});
        int b8 = h7eVar.b(scootersCardHeaderComponents.t);
        h7eVar.e(b8, i);
        h7eVar.d(b8, i);
        eVar.w(b8, 7, i3);
        eVar.x(b8, 8);
        eVar.i(b8, 4, 0, 4);
        h7eVar.c(b8);
        eVar.i(b8, 3, 0, 3);
        eVar.b(this);
    }

    public final void loading() {
        cancelImageLoading();
        getScootersCardHeaderComponents().k.setVisibility(0);
        getScootersCardHeaderComponents().n.setVisibility(this.chargeConfig.a.getA() ? 0 : 8);
        getScootersCardHeaderComponents().r.setVisibility(8);
        getScootersCardHeaderComponents().o.setVisibility(8);
        setVisibility(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cancelImageLoading();
        this.onInsuranceClick = null;
    }

    public final void setDefaultAccessibilityFocus() {
        RobotoTextView robotoTextView = getScootersCardHeaderComponents().q;
        robotoTextView.setFocusable(true);
        robotoTextView.performAccessibilityAction(64, null);
        robotoTextView.sendAccessibilityEvent(32768);
    }

    public final void success(r7p0 vehicleNumber, AppearanceMode appearanceMode, q7p0 vehicleHealthState, String scooterImage, tls onRemoveListener, d5n0 scootersInsurance, int vehicleTypeImageId) {
        cancelImageLoading();
        boolean z = appearanceMode == AppearanceMode.AS_SINGLE;
        boolean z2 = appearanceMode == AppearanceMode.AS_ONE_OF_MULTIPLE;
        RecyclerView recyclerView = getScootersCardHeaderComponents().s;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getScootersCardHeaderComponents().s.getLayoutParams();
        marginLayoutParams.bottomMargin = tje.u(z2 ? 16 : 8, getContext());
        recyclerView.setLayoutParams(marginLayoutParams);
        getLabelsAdapter().submitList(createLabels(vehicleHealthState, scootersInsurance), null);
        getScootersCardHeaderComponents().p.setVisibility(z ? 0 : 8);
        getScootersCardHeaderComponents().t.setVisibility(z2 ? 0 : 8);
        if (z) {
            loadImage(scooterImage);
        } else {
            c.z(new tmm0(10, onRemoveListener, vehicleNumber), getScootersCardHeaderComponents().t);
        }
        if (vehicleTypeImageId == 0 || !z2) {
            getScootersCardHeaderComponents().r.setVisibility(8);
            getScootersCardHeaderComponents().r.setImageDrawable(null);
        } else {
            getScootersCardHeaderComponents().r.setVisibility(0);
            getScootersCardHeaderComponents().r.setImageResource(vehicleTypeImageId);
        }
        getScootersCardHeaderComponents().q.setText(vehicleNumber.a);
        getScootersCardHeaderComponents().q.setContentDescription(a0b1.b(getContext(), vehicleNumber.a));
        getScootersCardHeaderComponents().k.setVisibility(8);
        getScootersCardHeaderComponents().n.setVisibility(8);
        getScootersCardHeaderComponents().o.setVisibility(0);
        setVisibility(0);
    }

    public ScootersCardHeaderComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public ScootersCardHeaderComponent(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public ScootersCardHeaderComponent(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public /* synthetic */ ScootersCardHeaderComponent(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
