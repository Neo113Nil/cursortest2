package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import androidx.mediarouter.app.OverlayListView;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.KotlinVersion;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class zph extends ArrayAdapter {
    public final float a;
    public final /* synthetic */ aqh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zph(aqh aqhVar, Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.b = aqhVar;
        this.a = v3g.C(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z;
        aqh aqhVar = this.b;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, viewGroup, false);
        } else {
            aqh.m(aqhVar.Z, (LinearLayout) view.findViewById(R.id.volume_item_container));
            View findViewById = view.findViewById(R.id.mr_volume_item_icon);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            int i2 = aqhVar.Y;
            layoutParams.width = i2;
            layoutParams.height = i2;
            findViewById.setLayoutParams(layoutParams);
        }
        irh irhVar = (irh) getItem(i);
        if (irhVar != null) {
            boolean z2 = irhVar.g;
            TextView textView = (TextView) view.findViewById(R.id.mr_name);
            textView.setEnabled(z2);
            textView.setText(irhVar.d);
            MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
            Context context = viewGroup.getContext();
            OverlayListView overlayListView = aqhVar.E;
            int B = v3g.B(context, 0);
            int alpha = Color.alpha(B);
            int i3 = KotlinVersion.MAX_COMPONENT_VALUE;
            if (alpha != 255) {
                B = aa5.i(B, ((Integer) overlayListView.getTag()).intValue());
            }
            mediaRouteVolumeSlider.a(B, B);
            mediaRouteVolumeSlider.setTag(irhVar);
            aqhVar.x0.put(irhVar, mediaRouteVolumeSlider);
            mediaRouteVolumeSlider.b(!z2);
            mediaRouteVolumeSlider.setEnabled(z2);
            if (z2) {
                if (aqhVar.y) {
                    if (((!irhVar.e() || krh.h()) ? irhVar.o : 0) == 1) {
                        z = true;
                        if (z) {
                            mediaRouteVolumeSlider.setMax(100);
                            mediaRouteVolumeSlider.setProgress(100);
                            mediaRouteVolumeSlider.setEnabled(false);
                        } else {
                            mediaRouteVolumeSlider.setMax(irhVar.q);
                            mediaRouteVolumeSlider.setProgress(irhVar.p);
                            mediaRouteVolumeSlider.setOnSeekBarChangeListener(aqhVar.L);
                        }
                    }
                }
                z = false;
                if (z) {
                }
            }
            ImageView imageView = (ImageView) view.findViewById(R.id.mr_volume_item_icon);
            if (!z2) {
                i3 = (int) (this.a * 255.0f);
            }
            imageView.setAlpha(i3);
            ((LinearLayout) view.findViewById(R.id.volume_item_container)).setVisibility(aqhVar.J.contains(irhVar) ? 4 : 0);
            HashSet hashSet = aqhVar.H;
            if (hashSet != null && hashSet.contains(irhVar)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(0L);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                view.clearAnimation();
                view.startAnimation(alphaAnimation);
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return false;
    }
}
