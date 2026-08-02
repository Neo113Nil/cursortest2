package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.directions.driving.Flags;
import com.yandex.mapkit.directions.driving.Summary;
import com.yandex.mapkit.directions.driving.Weight;
import com.yandex.mapkit.navigation.automotive.layer.Balloon;
import com.yandex.mapkit.navigation.automotive.layer.RouteSummaryBalloon;
import com.yandex.mapkit.styling.automotivenavigation.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.a;
import ru.yandex.taxi.TimeUnitsVisibility;
import ru.yandex.taxi.utils.ForegroundColorSpanFix;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class ve50 extends qis0 {
    public final Context a;
    public final zuj0 b;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final vo4 h;
    public final rgr0 i;
    public final i6z0 j;
    public final i6z0 k;
    public final i3y c = a.a(new d240(16, this));
    public final i6z0 l = new i6z0(v2h0.mapkit_automotive_overview_route_flags_fallback_day, v2h0.mapkit_automotive_overview_route_flags_fallback_night, 9);

    public ve50(zuj0 zuj0Var, Context context) {
        this.a = context;
        this.b = zuj0Var;
        this.d = context.getString(R.string.mapkit_styling_automotive_alternative_plus_sign);
        this.e = context.getString(R.string.mapkit_styling_automotive_alternative_minus_sign);
        this.f = context.getString(R.string.mapkit_styling_automotive_alternative_same_time_text1);
        this.g = context.getString(R.string.mapkit_styling_automotive_alternative_same_time_text2);
        this.j = new i6z0(context.getColor(vog0.mapkit_automotive_balloon_background_day), context.getColor(vog0.mapkit_automotive_balloon_background_night), 9);
        this.k = new i6z0(context.getColor(mqg0.component_gray_600), context.getColor(mqg0.component_gray_600), 9);
        Resources resources = context.getResources();
        this.h = new vo4(resources.getDimension(qtg0.mapkit_automotive_size_route_summary_balloon_corner_leg), resources.getDimension(qtg0.mapkit_automotive_size_route_summary_balloon_corner_leg_innerpart), resources.getDimension(qtg0.mapkit_automotive_width_route_summary_balloon_center_leg), resources.getDimension(qtg0.mapkit_automotive_height_route_summary_balloon_center_leg), resources.getDimension(qtg0.mapkit_automotive_offset_route_summary_balloon_leg), resources.getDimension(qtg0.mapkit_automotive_corner_radius_route_summary_balloon), resources.getDimension(qtg0.leg_thickness_contextballoon));
        this.i = new rgr0(context.getColor(R.color.mapkit_styling_automotive_route_summary_balloon_shadow), resources.getDimension(R.dimen.mapkit_styling_automotive_radius_route_summary_balloon_shadow), new PointF(resources.getDimension(R.dimen.mapkit_styling_automotive_offset_x_route_summary_balloon_shadow), resources.getDimension(R.dimen.mapkit_styling_automotive_offset_y_route_summary_balloon_shadow)));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0195  */
    @Override // defpackage.qis0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View b(Balloon balloon, boolean z) {
        Weight relativeWeight;
        LocalizedValue timeWithTraffic;
        double d;
        double d2;
        String str;
        String j;
        String str2;
        RouteSummaryBalloon routeSummary = balloon.getRouteSummary();
        i3y i3yVar = this.c;
        if (routeSummary == null) {
            return ((rc50) i3yVar.getValue()).a;
        }
        boolean contains = routeSummary.getTags().contains("green");
        RouteSummaryBalloon routeSummary2 = balloon.getRouteSummary();
        boolean z2 = true;
        boolean z3 = routeSummary2 != null && routeSummary2.getRelativeWeight() == null;
        double value = (z3 || (relativeWeight = routeSummary.getRelativeWeight()) == null || (timeWithTraffic = relativeWeight.getTimeWithTraffic()) == null) ? 0.0d : timeWithTraffic.getValue();
        RobotoTextView robotoTextView = ((rc50) i3yVar.getValue()).b;
        ArrayList arrayList = new ArrayList();
        Flags flags = routeSummary.getSummary().getFlags();
        if (!flags.getBlocked() && !flags.getFutureBlocked()) {
            z2 = false;
        }
        g(R.drawable.mapkit_styling_automotive_overview_route_flags_blocked, arrayList, z2);
        g(R.drawable.mapkit_styling_automotive_overview_route_flags_has_checkpoints, arrayList, flags.getHasCheckpoints());
        g(R.drawable.mapkit_styling_automotive_overview_route_flags_ferry, arrayList, flags.getHasFerries());
        g(this.l.a(z), arrayList, flags.getHasTolls());
        g(R.drawable.mapkit_styling_automotive_overview_route_flags_badroad, arrayList, flags.getHasRuggedRoads());
        g(R.drawable.mapkit_styling_automotive_overview_route_flags_badtraffic, arrayList, flags.getDeadJam());
        g(v2h0.ic_green_route_white, arrayList, routeSummary.getTags().contains("green"));
        g(R.drawable.mapkit_styling_automotive_overview_route_flags_parking, arrayList, flags.getForParking());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        zuj0 zuj0Var = this.b;
        String str3 = "";
        if (!z3) {
            d = 60.0d;
            Weight relativeWeight2 = routeSummary.getRelativeWeight();
            if (relativeWeight2 == null) {
                d2 = 0.0d;
                j = "";
            } else {
                double value2 = relativeWeight2.getTimeWithTraffic().getValue();
                if (Math.abs(value2) <= 60.0d) {
                    j = g8e.p(this.f, " ", this.g);
                } else {
                    if (value2 < 0.0d) {
                        d2 = 0.0d;
                        str = this.e;
                    } else {
                        d2 = 0.0d;
                        str = this.d;
                    }
                    j = b64.j(str, qpb1.c(zuj0Var, timeUnit.toMillis((long) value2), TimeUnitsVisibility.TWO_TIME_UNITS));
                }
            }
            Context context = this.a;
            int color = (!z3 || Math.abs(value) <= d) ? context.getColor(mqg0.component_white) : value < d2 ? context.getColor(mqg0.component_green_high) : context.getColor(mqg0.component_cinnaban_light);
            if (!z3) {
                str3 = contains ? g8e.p(hua1.d(zuj0Var, routeSummary.getSummary().getWeight().getDistance().getValue()), " · ", ((avj0) zuj0Var).h(kyh0.navigator_avoid_traffic)) : hua1.d(zuj0Var, routeSummary.getSummary().getWeight().getDistance().getValue());
            } else if (contains) {
                str3 = ((avj0) zuj0Var).h(kyh0.navigator_avoid_traffic);
            }
            str2 = str3;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    spannableStringBuilder.append((CharSequence) it.next());
                }
                spannableStringBuilder.append((CharSequence) " ");
            }
            spannableStringBuilder.append(j, new ForegroundColorSpanFix(color), 33);
            if (str2.length() > 0) {
                spannableStringBuilder.append('\n');
                spannableStringBuilder.append(str2, new ForegroundColorSpanFix(context.getColor(mqg0.component_white_alpha50)), 33);
            }
            robotoTextView.setText(spannableStringBuilder);
            robotoTextView.setMovementMethod(LinkMovementMethod.getInstance());
            return ((rc50) i3yVar.getValue()).a;
        }
        Summary summary = routeSummary.getSummary();
        d = 60.0d;
        j = qpb1.c(zuj0Var, timeUnit.toMillis((long) summary.getWeight().getTimeWithTraffic().getValue()), TimeUnitsVisibility.TWO_TIME_UNITS);
        if (summary.getFlags().getDeadJam()) {
            j = g8e.o("~", j);
        }
        d2 = 0.0d;
        Context context2 = this.a;
        if (z3) {
        }
        if (!z3) {
        }
        str2 = str3;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (!arrayList.isEmpty()) {
        }
        spannableStringBuilder2.append(j, new ForegroundColorSpanFix(color), 33);
        if (str2.length() > 0) {
        }
        robotoTextView.setText(spannableStringBuilder2);
        robotoTextView.setMovementMethod(LinkMovementMethod.getInstance());
        return ((rc50) i3yVar.getValue()).a;
    }

    @Override // defpackage.qis0
    public final vo4 c() {
        return this.h;
    }

    @Override // defpackage.qis0
    public final int d(Balloon balloon, boolean z) {
        RouteSummaryBalloon routeSummary = balloon.getRouteSummary();
        return ((routeSummary != null && routeSummary.getRelativeWeight() == null) ? this.j : this.k).a(z);
    }

    @Override // defpackage.qis0
    public final int e(Balloon balloon, boolean z) {
        RouteSummaryBalloon routeSummary = balloon.getRouteSummary();
        return ((routeSummary != null && routeSummary.getRelativeWeight() == null) ? this.j : this.k).a(z);
    }

    @Override // defpackage.qis0
    public final rgr0 f() {
        return this.i;
    }

    public final void g(int i, ArrayList arrayList, boolean z) {
        if (!z || arrayList.size() >= 2) {
            return;
        }
        Integer valueOf = Integer.valueOf(i);
        Context context = this.a;
        arrayList.add(crb1.f(context, valueOf, Integer.valueOf(tje.u(20, context)), 8));
    }
}
