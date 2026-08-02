package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.b;
import com.yandex.go.navigator.domain.balloon.DirectionSignView;
import com.yandex.go.navigator.domain.balloon.NextStreetTextView;
import com.yandex.mapkit.directions.driving.DirectionSign;
import com.yandex.mapkit.navigation.automotive.layer.Balloon;
import com.yandex.mapkit.navigation.automotive.layer.ManoeuvreBalloon;
import com.yandex.mapkit.styling.automotivenavigation.R;
import java.util.WeakHashMap;
import java.util.regex.Pattern;

/* loaded from: classes12.dex */
public final class wc50 extends qis0 {
    public final Context a;
    public final View b;
    public final vo4 c;
    public final i6z0 d;
    public final i6z0 e;

    public wc50(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context).inflate(fuh0.navigator_layout_manoeuvre_balloon, (ViewGroup) null);
        Resources resources = context.getResources();
        this.c = new vo4(resources.getDimension(qtg0.mapkit_automotive_size_route_summary_balloon_corner_leg), resources.getDimension(qtg0.mapkit_automotive_size_route_summary_balloon_corner_leg_innerpart), resources.getDimension(qtg0.mapkit_automotive_width_route_summary_balloon_center_leg), resources.getDimension(qtg0.mapkit_automotive_height_route_summary_balloon_center_leg), resources.getDimension(qtg0.mapkit_automotive_offset_route_summary_balloon_leg), resources.getDimension(qtg0.mapkit_automotive_corner_radius_route_summary_balloon), resources.getDimension(qtg0.leg_thickness_contextballoon));
        this.d = new i6z0(context.getColor(vog0.mapkit_automotive_balloon_background_day), context.getColor(vog0.mapkit_automotive_balloon_background_night), 9);
        this.e = new i6z0(context.getColor(vog0.mapkit_automotive_balloon_text_day), context.getColor(vog0.mapkit_automotive_balloon_text_night), 9);
    }

    @Override // defpackage.qis0
    public final View b(Balloon balloon, boolean z) {
        Integer valueOf;
        ManoeuvreBalloon manoeuvre = balloon.getManoeuvre();
        if (manoeuvre == null) {
            ny61.g("Required value was null.");
            return null;
        }
        DirectionSign directionSign = manoeuvre.getDirectionSign();
        int a = this.e.a(z);
        int i = R.id.text_nextstreet;
        WeakHashMap weakHashMap = b.a;
        View view = this.b;
        NextStreetTextView nextStreetTextView = (NextStreetTextView) ((View) rp31.d(view, i));
        String nextRoadName = manoeuvre.getManoeuvre().getNextRoadName();
        Pattern pattern = zo4.a;
        if (nextRoadName == null || directionSign != null) {
            nextStreetTextView.setVisibility(8);
        } else {
            nextStreetTextView.setVisibility(0);
            nextStreetTextView.setText(nextRoadName);
            nextStreetTextView.setMaximumLines(2);
        }
        Context context = this.a;
        nextStreetTextView.setMaximumWidth(m810.b(context.getResources().getDimension(R.dimen.mapkit_styling_automotive_maxwidth_nextstreet)));
        nextStreetTextView.setTextColor(a);
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.text_balloon_distance);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(R.id.text_balloon_metrics);
        zo4.a(appCompatTextView, appCompatTextView2, manoeuvre.getManoeuvre().getDistance().getText());
        appCompatTextView.setTextColor(a);
        appCompatTextView2.setTextColor(a);
        switch (vc50.a[manoeuvre.getManoeuvre().getAction().ordinal()]) {
            case 1:
                valueOf = Integer.valueOf(v2h0.mapkit_automotive_context_ra_forward);
                break;
            case 2:
                valueOf = Integer.valueOf(v2h0.mapkit_automotive_context_ra_take_left);
                break;
            case 3:
                valueOf = Integer.valueOf(v2h0.mapkit_automotive_context_ra_take_right);
                break;
            case 4:
                valueOf = Integer.valueOf(v2h0.mapkit_automotive_context_ra_turn_left);
                break;
            case 5:
                valueOf = Integer.valueOf(v2h0.mapkit_automotive_context_ra_turn_right);
                break;
            case 6:
                valueOf = Integer.valueOf(v2h0.mapkit_automotive_context_ra_hard_turn_left);
                break;
            case 7:
                valueOf = Integer.valueOf(v2h0.mapkit_automotive_context_ra_hard_turn_right);
                break;
            case 8:
                valueOf = Integer.valueOf(v2h0.mapkit_automotive_context_ra_take_left);
                break;
            case 9:
                valueOf = Integer.valueOf(v2h0.mapkit_automotive_context_ra_take_right);
                break;
            case 10:
                valueOf = Integer.valueOf(v2h0.mapkit_automotive_context_ra_turn_back_left);
                break;
            case 11:
                valueOf = Integer.valueOf(v2h0.mapkit_automotive_context_ra_turn_back_right);
                break;
            case 12:
                valueOf = Integer.valueOf(v2h0.mapkit_automotive_context_ra_in_circular_movement);
                break;
            case 13:
                valueOf = Integer.valueOf(v2h0.mapkit_automotive_context_ra_out_circular_movement);
                break;
            case 14:
                valueOf = Integer.valueOf(v2h0.mapkit_automotive_context_ra_boardferry);
                break;
            case 15:
                valueOf = Integer.valueOf(v2h0.mapkit_automotive_context_ra_boardferry);
                break;
            case 16:
                valueOf = Integer.valueOf(v2h0.mapkit_automotive_context_ra_exit_left);
                break;
            case 17:
                valueOf = Integer.valueOf(v2h0.mapkit_automotive_context_ra_exit_right);
                break;
            case 18:
                valueOf = Integer.valueOf(v2h0.mapkit_automotive_context_ra_finish);
                break;
            case 19:
            case 20:
                valueOf = null;
                break;
            default:
                w511.b();
                return null;
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.image_manoeuvre_balloon_manoeuvre);
        if (valueOf != null) {
            Drawable y = tje.y(valueOf.intValue(), context);
            y.setTint(a);
            appCompatImageView.setVisibility(0);
            appCompatImageView.setImageDrawable(y);
        } else {
            appCompatImageView.setVisibility(8);
        }
        DirectionSignView directionSignView = (DirectionSignView) ((View) rp31.d(view, R.id.roadsign_container));
        if (directionSign != null) {
            directionSignView.setVisibility(0);
            directionSignView.setItems(directionSign.getItems());
        } else {
            directionSignView.setVisibility(8);
        }
        Resources resources = context.getResources();
        int i2 = v2h0.mapkit_automotive_contextballoon_background;
        ThreadLocal threadLocal = wuj0.a;
        Drawable drawable = resources.getDrawable(i2, null);
        if (drawable != null) {
            drawable.setTint(this.d.a(z));
            view.setBackground(drawable);
        }
        return view;
    }

    @Override // defpackage.qis0
    public final vo4 c() {
        return this.c;
    }

    @Override // defpackage.qis0
    public final int d(Balloon balloon, boolean z) {
        return this.d.b;
    }

    @Override // defpackage.qis0
    public final int e(Balloon balloon, boolean z) {
        return this.d.c;
    }

    @Override // defpackage.qis0
    public final rgr0 f() {
        return null;
    }
}
