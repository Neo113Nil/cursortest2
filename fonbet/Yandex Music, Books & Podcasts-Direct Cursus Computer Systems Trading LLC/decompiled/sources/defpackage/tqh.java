package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class tqh extends oqh {
    public final ProgressBar A;
    public final TextView B;
    public final RelativeLayout C;
    public final CheckBox D;
    public final float E;
    public final int F;
    public final je G;
    public final /* synthetic */ uqh H;
    public final View y;
    public final ImageView z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tqh(uqh uqhVar, View view) {
        super(r4, view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
        this.H = uqhVar;
        wqh wqhVar = uqhVar.m;
        this.G = new je(9, this);
        this.y = view;
        this.z = (ImageView) view.findViewById(R.id.mr_cast_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_route_progress_bar);
        this.A = progressBar;
        this.B = (TextView) view.findViewById(R.id.mr_cast_route_name);
        this.C = (RelativeLayout) view.findViewById(R.id.mr_cast_volume_layout);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.mr_cast_checkbox);
        this.D = checkBox;
        Context context = wqhVar.n;
        Drawable w = y2x.w(context, R.drawable.mr_cast_checkbox);
        if (v3g.M(context)) {
            w.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
        }
        checkBox.setButtonDrawable(w);
        v3g.R(context, progressBar);
        this.E = v3g.C(context);
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.mr_dynamic_dialog_row_height, typedValue, true);
        this.F = (int) typedValue.getDimension(displayMetrics);
    }

    public final boolean v(irh irhVar) {
        if (!irhVar.g()) {
            g8c b = this.H.m.i.b(irhVar);
            if (b == null) {
                return false;
            }
            xqh xqhVar = (xqh) b.a;
            if ((xqhVar != null ? xqhVar.b : 1) != 3) {
                return false;
            }
        }
        return true;
    }

    public final void w(boolean z, boolean z2) {
        CheckBox checkBox = this.D;
        checkBox.setEnabled(false);
        this.y.setEnabled(false);
        checkBox.setChecked(z);
        if (z) {
            this.z.setVisibility(4);
            this.A.setVisibility(0);
        }
        if (z2) {
            this.H.u(z ? this.F : 0, this.C);
        }
    }
}
