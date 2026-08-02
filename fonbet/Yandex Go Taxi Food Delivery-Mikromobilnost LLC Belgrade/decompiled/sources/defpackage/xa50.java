package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.yandex.mapkit.directions.driving.Flags;
import com.yandex.mapkit.directions.driving.Weight;
import com.yandex.mapkit.navigation.automotive.layer.AlternativeBalloon;
import com.yandex.mapkit.navigation.automotive.layer.Balloon;
import com.yandex.mapkit.styling.automotivenavigation.DayNightRes;
import com.yandex.mapkit.styling.automotivenavigation.R;
import com.yandex.runtime.i18n.I18nManagerFactory;
import kotlin.a;
import ru.yandex.taxi.utils.ForegroundColorSpanFix;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes12.dex */
public final class xa50 extends qis0 {
    public final Context a;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final vo4 g;
    public final rgr0 h;
    public final DayNightRes i;
    public final i3y b = a.a(new d240(11, this));
    public final i6z0 j = new i6z0(v2h0.mapkit_automotive_overview_route_flags_fallback_day, v2h0.mapkit_automotive_overview_route_flags_fallback_night, 9);

    public xa50(Context context) {
        this.a = context;
        this.c = context.getString(R.string.mapkit_styling_automotive_alternative_plus_sign);
        this.d = context.getString(R.string.mapkit_styling_automotive_alternative_minus_sign);
        this.e = context.getString(R.string.mapkit_styling_automotive_alternative_same_time_text1);
        this.f = context.getString(R.string.mapkit_styling_automotive_alternative_same_time_text2);
        this.g = new vo4(context.getResources().getDimension(qtg0.mapkit_automotive_size_route_summary_balloon_corner_leg), context.getResources().getDimension(qtg0.mapkit_automotive_size_route_summary_balloon_corner_leg_innerpart), context.getResources().getDimension(qtg0.mapkit_automotive_width_route_summary_balloon_center_leg), context.getResources().getDimension(qtg0.mapkit_automotive_height_route_summary_balloon_center_leg), context.getResources().getDimension(qtg0.mapkit_automotive_offset_route_summary_balloon_leg), context.getResources().getDimension(qtg0.mapkit_automotive_corner_radius_route_summary_balloon), context.getResources().getDimension(qtg0.leg_thickness_contextballoon));
        this.h = new rgr0(context.getColor(R.color.mapkit_styling_automotive_alternative_balloon_shadow), context.getResources().getDimension(R.dimen.mapkit_styling_automotive_radius_alternative_balloon_shadow), new PointF());
        this.i = new DayNightRes(context.getColor(mqg0.component_gray_600), context.getColor(mqg0.component_gray_600));
    }

    @Override // defpackage.qis0
    public final View b(Balloon balloon, boolean z) {
        String j;
        AlternativeBalloon alternative = balloon.getAlternative();
        Weight relativeWeight = alternative.getRelativeWeight();
        i3y i3yVar = this.b;
        RobotoTextView robotoTextView = ((rc50) i3yVar.getValue()).b;
        double value = relativeWeight.getTimeWithTraffic().getValue();
        double value2 = alternative.getRelativeWeight().getTimeWithTraffic().getValue();
        if (Math.abs(value2) <= 120.0d) {
            j = g8e.p(this.e, " ", this.f);
        } else {
            j = b64.j(value2 < 0.0d ? this.d : this.c, I18nManagerFactory.getI18nManagerInstance().localizeDuration(Math.abs((int) value2)));
        }
        int color = this.a.getColor(Math.abs(value) <= 120.0d ? mqg0.component_white : value < 0.0d ? mqg0.component_green_high : mqg0.component_cinnaban_light);
        Flags flags = alternative.getSummary().getFlags();
        SpannableStringBuilder g = flags.getHasCheckpoints() ? g(R.drawable.mapkit_styling_automotive_alternativeballoon_checkpoint) : flags.getHasTolls() ? g(this.j.a(z)) : flags.getHasRuggedRoads() ? g(R.drawable.mapkit_styling_automotive_alternativeballoon_icon_bad_road) : null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (g != null) {
            spannableStringBuilder.append((CharSequence) g);
            spannableStringBuilder.append((CharSequence) " ");
        }
        spannableStringBuilder.append(j, new ForegroundColorSpanFix(color), 33);
        robotoTextView.setText(spannableStringBuilder);
        robotoTextView.setMovementMethod(LinkMovementMethod.getInstance());
        return ((rc50) i3yVar.getValue()).a;
    }

    @Override // defpackage.qis0
    public final vo4 c() {
        return this.g;
    }

    @Override // defpackage.qis0
    public final int d(Balloon balloon, boolean z) {
        return this.i.getDayId();
    }

    @Override // defpackage.qis0
    public final int e(Balloon balloon, boolean z) {
        return this.i.getNightId();
    }

    @Override // defpackage.qis0
    public final rgr0 f() {
        return this.h;
    }

    public final SpannableStringBuilder g(int i) {
        Integer valueOf = Integer.valueOf(i);
        Context context = this.a;
        return crb1.f(context, valueOf, Integer.valueOf(tje.u(20, context)), 8);
    }
}
