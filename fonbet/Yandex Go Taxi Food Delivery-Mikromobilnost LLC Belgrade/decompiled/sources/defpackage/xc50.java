package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.b;
import com.yandex.go.navigator.domain.balloon.DirectionSignView;
import com.yandex.go.navigator.domain.balloon.NextStreetTextView;
import com.yandex.mapkit.directions.driving.DirectionSign;
import com.yandex.mapkit.navigation.automotive.layer.Balloon;
import com.yandex.mapkit.navigation.automotive.layer.ManoeuvreWithLaneSignBalloon;
import com.yandex.mapkit.styling.automotivenavigation.DayNightRes;
import com.yandex.mapkit.styling.automotivenavigation.R;
import java.util.WeakHashMap;
import java.util.regex.Pattern;

/* loaded from: classes12.dex */
public final class xc50 implements yo4 {
    public final Context a;
    public final View b;
    public final View c;
    public final View d;
    public final vo4 e;
    public final DayNightRes f;
    public final DayNightRes g;

    public xc50(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context).inflate(fuh0.navigator_styling_automotive_layout_jointballoon_vertical_left, (ViewGroup) null);
        this.c = LayoutInflater.from(context).inflate(fuh0.navigator_styling_automotive_layout_jointballoon_vertical_right, (ViewGroup) null);
        this.d = LayoutInflater.from(context).inflate(fuh0.navigator_styling_automotive_layout_jointballoon_compact, (ViewGroup) null);
        Resources resources = context.getResources();
        this.e = new vo4(resources.getDimension(qtg0.mapkit_automotive_size_route_summary_balloon_corner_leg), resources.getDimension(qtg0.mapkit_automotive_size_route_summary_balloon_corner_leg_innerpart), resources.getDimension(qtg0.mapkit_automotive_width_route_summary_balloon_center_leg), resources.getDimension(qtg0.mapkit_automotive_height_route_summary_balloon_center_leg), resources.getDimension(qtg0.mapkit_automotive_offset_route_summary_balloon_leg), resources.getDimension(qtg0.mapkit_automotive_corner_radius_route_summary_balloon), resources.getDimension(qtg0.leg_thickness_contextballoon));
        this.f = new DayNightRes(context.getColor(R.color.mapkit_styling_automotive_balloon_background_day), context.getColor(R.color.mapkit_styling_automotive_balloon_background_night));
        this.g = new DayNightRes(context.getColor(R.color.mapkit_styling_automotive_balloon_text_day), context.getColor(R.color.mapkit_styling_automotive_balloon_text_night));
    }

    @Override // defpackage.yo4
    public final xo4 a(Balloon balloon, float f, boolean z) {
        ManoeuvreWithLaneSignBalloon manoeuvreWithLaneSign = balloon.getManoeuvreWithLaneSign();
        View view = null;
        if (manoeuvreWithLaneSign == null) {
            ny61.g("Required value was null.");
            return null;
        }
        View view2 = this.b;
        c(view2, manoeuvreWithLaneSign, z);
        View view3 = this.c;
        c(view3, manoeuvreWithLaneSign, z);
        b(view2);
        b(view3);
        int size = manoeuvreWithLaneSign.getLaneSign().getLanes().size();
        Context context = this.a;
        if (size <= context.getResources().getInteger(R.integer.mapkit_styling_automotive_max_lanes_compact_layout)) {
            view = this.d;
            c(view, manoeuvreWithLaneSign, z);
            int i = R.id.text_jointballoon_nextstreet;
            WeakHashMap weakHashMap = b.a;
            NextStreetTextView nextStreetTextView = (NextStreetTextView) ((View) rp31.d(view, i));
            LinearLayout linearLayout = (LinearLayout) ((View) rp31.d(view, R.id.lanes_container));
            DirectionSignView directionSignView = (DirectionSignView) ((View) rp31.d(view, R.id.roadsign_container));
            View view4 = (View) rp31.d(view, R.id.distance_container);
            int measuredWidth = view4.getMeasuredWidth() + linearLayout.getMeasuredWidth();
            nextStreetTextView.setMaximumWidth(Math.max(Math.round(context.getResources().getDimension(R.dimen.mapkit_styling_automotive_maxwidth_nextstreet)), measuredWidth));
            directionSignView.setMaxWidth(Math.max(Math.round(context.getResources().getDimension(R.dimen.mapkit_styling_automotive_directionsign_maxwidth)), measuredWidth));
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
        vo4 vo4Var = this.e;
        float e = ddb1.e(context);
        pas0 pas0Var = new pas0(this.b, this.c, view, vo4Var, f, e);
        pas0Var.i.setColor(this.f.get(z));
        return pas0Var;
    }

    public final void b(View view) {
        int i = R.id.text_jointballoon_nextstreet;
        WeakHashMap weakHashMap = b.a;
        NextStreetTextView nextStreetTextView = (NextStreetTextView) ((View) rp31.d(view, i));
        LinearLayout linearLayout = (LinearLayout) ((View) rp31.d(view, R.id.lanes_container));
        DirectionSignView directionSignView = (DirectionSignView) ((View) rp31.d(view, R.id.roadsign_container));
        Context context = this.a;
        nextStreetTextView.setMaximumWidth(Math.max(Math.round(context.getResources().getDimension(R.dimen.mapkit_styling_automotive_maxwidth_nextstreet)), linearLayout.getMeasuredWidth()));
        directionSignView.setMaxWidth(Math.max(Math.round(context.getResources().getDimension(R.dimen.mapkit_styling_automotive_directionsign_maxwidth)), linearLayout.getMeasuredWidth()));
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public final void c(View view, ManoeuvreWithLaneSignBalloon manoeuvreWithLaneSignBalloon, boolean z) {
        int i = R.drawable.mapkit_styling_automotive_contextballoon_background;
        Context context = this.a;
        Drawable y = tje.y(i, context);
        y.setTint(this.f.get(z));
        view.setBackground(y);
        int i2 = this.g.get(z);
        int i3 = R.id.text_jointballoon_nextstreet;
        WeakHashMap weakHashMap = b.a;
        NextStreetTextView nextStreetTextView = (NextStreetTextView) ((View) rp31.d(view, i3));
        String nextRoadName = manoeuvreWithLaneSignBalloon.getManoeuvre().getNextRoadName();
        DirectionSign directionSign = manoeuvreWithLaneSignBalloon.getDirectionSign();
        Pattern pattern = zo4.a;
        if (nextRoadName == null || directionSign != null) {
            nextStreetTextView.setVisibility(8);
        } else {
            nextStreetTextView.setVisibility(0);
            nextStreetTextView.setText(nextRoadName);
            nextStreetTextView.setMaximumLines(2);
        }
        nextStreetTextView.setTextColor(i2);
        AppCompatTextView appCompatTextView = (AppCompatTextView) ((View) rp31.d(view, R.id.text_balloon_distance));
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) ((View) rp31.d(view, R.id.text_balloon_metrics));
        zo4.a(appCompatTextView, appCompatTextView2, manoeuvreWithLaneSignBalloon.getManoeuvre().getDistance().getText());
        appCompatTextView.setTextColor(i2);
        appCompatTextView2.setTextColor(i2);
        DirectionSignView directionSignView = (DirectionSignView) ((View) rp31.d(view, R.id.roadsign_container));
        DirectionSign directionSign2 = manoeuvreWithLaneSignBalloon.getDirectionSign();
        if (directionSign2 != null) {
            directionSignView.setVisibility(0);
            directionSignView.setItems(directionSign2.getItems());
        } else {
            directionSignView.setVisibility(8);
        }
        new jrx(context, lrx.a(manoeuvreWithLaneSignBalloon.getLaneSign()), (LinearLayout) ((View) rp31.d(view, R.id.lanes_container)), i2).a();
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
