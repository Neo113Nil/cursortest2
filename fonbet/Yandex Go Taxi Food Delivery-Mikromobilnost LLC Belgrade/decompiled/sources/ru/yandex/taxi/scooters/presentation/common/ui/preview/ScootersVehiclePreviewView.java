package ru.yandex.taxi.scooters.presentation.common.ui.preview;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.yandex.go.design.view.GoView;
import com.yandex.payment.common.result.ResultType;
import defpackage.c0n0;
import defpackage.cma1;
import defpackage.epo0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.ofh0;
import defpackage.prh0;
import defpackage.q7p0;
import defpackage.r7p0;
import defpackage.sls;
import defpackage.t7p0;
import defpackage.tje;
import defpackage.tls;
import defpackage.u7p0;
import defpackage.v3n0;
import defpackage.v7p0;
import defpackage.w7p0;
import defpackage.wro0;
import defpackage.x7p0;
import defpackage.xw31;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.scooters.experiments.ScootersCardV2;
import ru.yandex.taxi.scooters.experiments.t;
import ru.yandex.taxi.scooters.presentation.common.ui.preview.ScootersVehiclePreviewView;
import ru.yandex.taxi.widget.MaskedShimmeringBar;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001:\u0002\u001d<B#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J!\u0010#\u001a\u00020\u000b2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b0!¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\u000b2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b0!¢\u0006\u0004\b%\u0010$J!\u0010&\u001a\u00020\u000b2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b0!¢\u0006\u0004\b&\u0010$J\u001b\u0010(\u001a\u00020\u000b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0'¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.JO\u0010/\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b/\u00100J[\u00106\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u00101\u001a\u00020*2\u0006\u00102\u001a\u00020*2\b\u00103\u001a\u0004\u0018\u00010*2\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b6\u00107J'\u0010:\u001a\u00020\u000b2\u0006\u00108\u001a\u00020*2\u0006\u00109\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\u000b2\b\u0010=\u001a\u0004\u0018\u00010<¢\u0006\u0004\b>\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010@R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR$\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR$\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010FR$\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010FR\u001e\u0010I\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006K"}, d2 = {"Lru/yandex/taxi/scooters/presentation/common/ui/preview/ScootersVehiclePreviewView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Lc0n0;", "scootersBatteryViewFactory", "Lwro0;", "scootersRemainingChargeTextFactory", "<init>", "(Landroid/content/Context;Lc0n0;Lwro0;)V", "Landroidx/constraintlayout/widget/Group;", "Lzy11;", "makeGroupVisible", "(Landroidx/constraintlayout/widget/Group;)V", "Lru/yandex/taxi/scooters/experiments/t;", "appearanceOptions", "Lru/yandex/taxi/scooters/experiments/ScootersCardV2$a;", "batteryChargePercents", "Lq7p0;", "vehicleHealthState", "bindChargeView", "(Lru/yandex/taxi/scooters/experiments/t;Lru/yandex/taxi/scooters/experiments/ScootersCardV2$a;Lq7p0;)V", "Lru/yandex/taxi/scooters/experiments/ScootersCardV2$ChargeConfig;", "chargeConfig", "bindRemainingChargePlate", "(Lru/yandex/taxi/scooters/experiments/ScootersCardV2$ChargeConfig;Lq7p0;)V", "Lr7p0;", "number", "", "Lv7p0;", "actions", "bindActions", "(Lr7p0;Ljava/util/List;)V", "Lkotlin/Function1;", "listener", "setOnAddListener", "(Ltls;)V", "setOnSwapListener", "setOnNearestScooterClickListener", "Lkotlin/Function0;", "setOnAlternativeOfferClickListener", "(Lsls;)V", "", "Landroid/graphics/drawable/Drawable;", "mainImage", ResultType.RESULT_TYPE_LOADING, "(Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)V", "success", "(Lr7p0;Landroid/graphics/drawable/Drawable;Lru/yandex/taxi/scooters/experiments/ScootersCardV2$ChargeConfig;Lru/yandex/taxi/scooters/experiments/t;Lru/yandex/taxi/scooters/experiments/ScootersCardV2$a;Lq7p0;Ljava/util/List;)V", "price", "buttonTitle", "buttonSubtitle", "Landroid/graphics/drawable/BitmapDrawable;", "buttonIcon", "alternativeOffer", "(Lr7p0;Landroid/graphics/drawable/Drawable;Lru/yandex/taxi/scooters/experiments/t;Lru/yandex/taxi/scooters/experiments/ScootersCardV2$a;Lq7p0;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/drawable/BitmapDrawable;)V", "title", "subtitle", "error", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/drawable/Drawable;)V", "Lw7p0;", "alternativeScooter", "nearestScooter", "(Lw7p0;)V", "Lc0n0;", "Lwro0;", "Lx7p0;", "binding", "Lx7p0;", "addListener", "Ltls;", "swapListener", "scooterSuggestListener", "alternativeOfferListener", "Lsls;", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class ScootersVehiclePreviewView extends ConstraintLayout {
    private tls addListener;
    private sls alternativeOfferListener;
    private final x7p0 binding;
    private tls scooterSuggestListener;
    private final c0n0 scootersBatteryViewFactory;
    private final wro0 scootersRemainingChargeTextFactory;
    private tls swapListener;

    public ScootersVehiclePreviewView(Context context, c0n0 c0n0Var, wro0 wro0Var) {
        super(context);
        this.scootersBatteryViewFactory = c0n0Var;
        this.scootersRemainingChargeTextFactory = wro0Var;
        LayoutInflater.from(context).inflate(prh0.scooters_vehicle_preview_view, this);
        int i = ofh0.add;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, this);
        if (buttonComponent != null) {
            i = ofh0.barrier_for_image;
            if (((Barrier) cma1.O(i, this)) != null) {
                i = ofh0.charge_view;
                FrameLayout frameLayout = (FrameLayout) cma1.O(i, this);
                if (frameLayout != null) {
                    i = ofh0.error_group;
                    Group group = (Group) cma1.O(i, this);
                    if (group != null) {
                        i = ofh0.error_text;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
                        if (robotoTextView != null) {
                            i = ofh0.image;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, this);
                            if (appCompatImageView != null) {
                                i = ofh0.loading_group;
                                Group group2 = (Group) cma1.O(i, this);
                                if (group2 != null) {
                                    i = ofh0.nearest_scooter;
                                    ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i, this);
                                    if (listItemComponent != null) {
                                        i = ofh0.offer_button;
                                        ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i, this);
                                        if (listItemComponent2 != null) {
                                            i = ofh0.plate;
                                            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, this);
                                            if (robotoTextView2 != null) {
                                                i = ofh0.plus;
                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i, this);
                                                if (appCompatImageView2 != null) {
                                                    i = ofh0.price;
                                                    RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i, this);
                                                    if (robotoTextView3 != null) {
                                                        i = ofh0.shimmer_of_battery;
                                                        if (((MaskedShimmeringBar) cma1.O(i, this)) != null) {
                                                            i = ofh0.shimmer_of_plate;
                                                            if (((ShimmeringBar) cma1.O(i, this)) != null) {
                                                                i = ofh0.success_group;
                                                                Group group3 = (Group) cma1.O(i, this);
                                                                if (group3 != null) {
                                                                    i = ofh0.swap;
                                                                    ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i, this);
                                                                    if (buttonComponent2 != null) {
                                                                        i = ofh0.title;
                                                                        RobotoTextView robotoTextView4 = (RobotoTextView) cma1.O(i, this);
                                                                        if (robotoTextView4 != null) {
                                                                            this.binding = new x7p0(this, buttonComponent, frameLayout, group, robotoTextView, appCompatImageView, group2, listItemComponent, listItemComponent2, robotoTextView2, appCompatImageView2, robotoTextView3, group3, buttonComponent2, robotoTextView4);
                                                                            setMinWidth(tje.u(236, getContext()));
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void alternativeOffer$lambda$0(ScootersVehiclePreviewView scootersVehiclePreviewView) {
        sls slsVar = scootersVehiclePreviewView.alternativeOfferListener;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    private final void bindActions(final r7p0 number, List<? extends v7p0> actions) {
        this.binding.b.setVisibility(8);
        this.binding.k.setVisibility(8);
        this.binding.n.setVisibility(8);
        for (v7p0 v7p0Var : actions) {
            boolean z = v7p0Var instanceof t7p0;
            final int i = 0;
            if (z && actions.size() == 2) {
                this.binding.b.setText((CharSequence) null);
                this.binding.b.setVisibility(0);
                this.binding.k.setVisibility(0);
                ButtonComponent buttonComponent = this.binding.b;
                int u = tje.u(48, getContext());
                int u2 = tje.u(48, getContext());
                Rect rect = xw31.a;
                c.D(u, u2, buttonComponent);
            } else if (z) {
                this.binding.b.setText(v7p0Var.a);
                this.binding.b.setVisibility(0);
                this.binding.k.setVisibility(0);
                ButtonComponent buttonComponent2 = this.binding.b;
                int u3 = tje.u(48, getContext());
                Rect rect2 = xw31.a;
                c.D(0, u3, buttonComponent2);
            } else if (v7p0Var instanceof u7p0) {
                this.binding.n.setText(v7p0Var.a);
                this.binding.n.setVisibility(0);
                this.binding.n.setDebounceClickListener(new Runnable(this) { // from class: s7p0
                    public final /* synthetic */ ScootersVehiclePreviewView b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = i;
                        r7p0 r7p0Var = number;
                        ScootersVehiclePreviewView scootersVehiclePreviewView = this.b;
                        switch (i2) {
                            case 0:
                                ScootersVehiclePreviewView.bindActions$lambda$0$0(scootersVehiclePreviewView, r7p0Var);
                                break;
                            default:
                                ScootersVehiclePreviewView.bindActions$lambda$0$1(scootersVehiclePreviewView, r7p0Var);
                                break;
                        }
                    }
                });
            }
            final int i2 = 1;
            this.binding.b.setDebounceClickListener(new Runnable(this) { // from class: s7p0
                public final /* synthetic */ ScootersVehiclePreviewView b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i2;
                    r7p0 r7p0Var = number;
                    ScootersVehiclePreviewView scootersVehiclePreviewView = this.b;
                    switch (i22) {
                        case 0:
                            ScootersVehiclePreviewView.bindActions$lambda$0$0(scootersVehiclePreviewView, r7p0Var);
                            break;
                        default:
                            ScootersVehiclePreviewView.bindActions$lambda$0$1(scootersVehiclePreviewView, r7p0Var);
                            break;
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindActions$lambda$0$0(ScootersVehiclePreviewView scootersVehiclePreviewView, r7p0 r7p0Var) {
        tls tlsVar = scootersVehiclePreviewView.swapListener;
        if (tlsVar != null) {
            tlsVar.invoke(r7p0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindActions$lambda$0$1(ScootersVehiclePreviewView scootersVehiclePreviewView, r7p0 r7p0Var) {
        tls tlsVar = scootersVehiclePreviewView.addListener;
        if (tlsVar != null) {
            tlsVar.invoke(r7p0Var);
        }
    }

    private final void bindChargeView(t appearanceOptions, ScootersCardV2.a batteryChargePercents, q7p0 vehicleHealthState) {
        if (vehicleHealthState != null) {
            View a = this.scootersBatteryViewFactory.a(appearanceOptions, batteryChargePercents, vehicleHealthState);
            this.binding.c.removeAllViews();
            this.binding.c.addView(a);
            return;
        }
        this.binding.c.removeAllViews();
        FrameLayout frameLayout = this.binding.c;
        GoView goView = new GoView(getContext(), null, 0, 0, 14, null);
        goView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        frameLayout.addView(goView);
    }

    private final void bindRemainingChargePlate(ScootersCardV2.ChargeConfig chargeConfig, q7p0 vehicleHealthState) {
        ScootersCardV2.ChargeConfig.ValueOption b = chargeConfig.a.getB();
        ScootersCardV2.ChargeConfig.ValueOption valueOption = ScootersCardV2.ChargeConfig.ValueOption.TIME;
        if (b == valueOption) {
            valueOption = ScootersCardV2.ChargeConfig.ValueOption.DISTANCE;
        }
        if (vehicleHealthState == null) {
            this.binding.j.setVisibility(8);
            return;
        }
        String a = this.scootersRemainingChargeTextFactory.a(valueOption, vehicleHealthState);
        int length = a.length();
        x7p0 x7p0Var = this.binding;
        if (length == 0) {
            x7p0Var.j.setVisibility(8);
            return;
        }
        x7p0Var.j.setText(a);
        this.binding.j.setContentDescription(this.scootersRemainingChargeTextFactory.b(valueOption, a));
        this.binding.j.setVisibility(0);
    }

    private final void makeGroupVisible(Group group) {
        Group group2 = this.binding.d;
        group2.setVisibility(jl40.l(group, group2) ? 0 : 8);
        Group group3 = this.binding.g;
        group3.setVisibility(jl40.l(group, group3) ? 0 : 8);
        Group group4 = this.binding.m;
        group4.setVisibility(jl40.l(group, group4) ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nearestScooter$lambda$0(ScootersVehiclePreviewView scootersVehiclePreviewView, w7p0 w7p0Var) {
        tls tlsVar = scootersVehiclePreviewView.scooterSuggestListener;
        if (tlsVar != null) {
            tlsVar.invoke(w7p0Var.a);
        }
    }

    public final void alternativeOffer(r7p0 number, Drawable mainImage, t appearanceOptions, ScootersCardV2.a batteryChargePercents, q7p0 vehicleHealthState, CharSequence price, CharSequence buttonTitle, CharSequence buttonSubtitle, BitmapDrawable buttonIcon) {
        this.binding.o.setText(number.a);
        this.binding.f.setImageDrawable(mainImage);
        makeGroupVisible(this.binding.m);
        bindChargeView(appearanceOptions, batteryChargePercents, vehicleHealthState);
        this.binding.j.setVisibility(8);
        this.binding.l.setText(price);
        this.binding.l.setVisibility(0);
        this.binding.b.setVisibility(8);
        this.binding.k.setVisibility(8);
        this.binding.n.setVisibility(8);
        this.binding.i.setTitle(buttonTitle);
        this.binding.i.setSubtitle(buttonSubtitle);
        this.binding.i.setTrailCompanionImage(buttonIcon);
        this.binding.i.setTrailCompanionImageSize(tje.u(32, getContext()), tje.u(48, getContext()));
        this.binding.i.setDebounceClickListener(new v3n0(25, this));
        this.binding.i.setVisibility(0);
    }

    public final void error(CharSequence title, CharSequence subtitle, Drawable mainImage) {
        makeGroupVisible(this.binding.d);
        this.binding.o.setText(title);
        this.binding.e.setText(subtitle);
        this.binding.h.setVisibility(8);
        this.binding.f.setImageDrawable(mainImage);
    }

    public final void loading(CharSequence number, Drawable mainImage) {
        this.binding.o.setText(number);
        this.binding.f.setImageDrawable(mainImage);
        makeGroupVisible(this.binding.g);
    }

    public final void nearestScooter(w7p0 alternativeScooter) {
        if (alternativeScooter == null) {
            return;
        }
        this.binding.h.setTitle(kyh0.scooters_preview_nearest_scooter);
        this.binding.h.setLeadImage(alternativeScooter.b);
        this.binding.h.setSubtitle(alternativeScooter.c);
        this.binding.h.setDebounceClickListener(new epo0(5, this, alternativeScooter));
        this.binding.h.setVisibility(0);
    }

    public final void setOnAddListener(tls listener) {
        this.addListener = listener;
    }

    public final void setOnAlternativeOfferClickListener(sls listener) {
        this.alternativeOfferListener = listener;
    }

    public final void setOnNearestScooterClickListener(tls listener) {
        this.scooterSuggestListener = listener;
    }

    public final void setOnSwapListener(tls listener) {
        this.swapListener = listener;
    }

    public final void success(r7p0 number, Drawable mainImage, ScootersCardV2.ChargeConfig chargeConfig, t appearanceOptions, ScootersCardV2.a batteryChargePercents, q7p0 vehicleHealthState, List<? extends v7p0> actions) {
        this.binding.o.setText(number.a);
        this.binding.f.setImageDrawable(mainImage);
        makeGroupVisible(this.binding.m);
        bindChargeView(appearanceOptions, batteryChargePercents, vehicleHealthState);
        bindRemainingChargePlate(chargeConfig, vehicleHealthState);
        bindActions(number, actions);
        this.binding.l.setVisibility(8);
        this.binding.i.setVisibility(8);
    }
}
