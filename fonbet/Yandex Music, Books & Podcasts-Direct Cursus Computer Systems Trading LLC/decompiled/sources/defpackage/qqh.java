package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class qqh extends oqh {
    public final /* synthetic */ uqh A;
    public final TextView y;
    public final int z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qqh(uqh uqhVar, View view) {
        super(r4, view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
        this.A = uqhVar;
        wqh wqhVar = uqhVar.m;
        this.y = (TextView) view.findViewById(R.id.mr_group_volume_route_name);
        Resources resources = wqhVar.n.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.mr_dynamic_volume_group_list_item_height, typedValue, true);
        this.z = (int) typedValue.getDimension(displayMetrics);
    }
}
