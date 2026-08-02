package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import java.util.HashMap;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public abstract class oqh extends opn {
    public irh u;
    public final ImageButton v;
    public final MediaRouteVolumeSlider w;
    public final /* synthetic */ wqh x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqh(wqh wqhVar, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        super(view);
        int color;
        int color2;
        this.x = wqhVar;
        this.v = imageButton;
        this.w = mediaRouteVolumeSlider;
        Context context = wqhVar.n;
        Drawable w = y2x.w(context, R.drawable.mr_cast_mute_button);
        if (v3g.M(context)) {
            w.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
        }
        imageButton.setImageDrawable(w);
        if (v3g.M(context)) {
            color = context.getColor(R.color.mr_cast_progressbar_progress_and_thumb_light);
            color2 = context.getColor(R.color.mr_cast_progressbar_background_light);
        } else {
            color = context.getColor(R.color.mr_cast_progressbar_progress_and_thumb_dark);
            color2 = context.getColor(R.color.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.a(color, color2);
    }

    public final void t(irh irhVar) {
        this.u = irhVar;
        int i = irhVar.p;
        boolean z = i == 0;
        ImageButton imageButton = this.v;
        imageButton.setActivated(z);
        imageButton.setOnClickListener(new je(7, this));
        irh irhVar2 = this.u;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.w;
        mediaRouteVolumeSlider.setTag(irhVar2);
        mediaRouteVolumeSlider.setMax(irhVar.q);
        mediaRouteVolumeSlider.setProgress(i);
        mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.x.u);
    }

    public final void u(boolean z) {
        ImageButton imageButton = this.v;
        if (imageButton.isActivated() == z) {
            return;
        }
        imageButton.setActivated(z);
        HashMap hashMap = this.x.x;
        if (z) {
            hashMap.put(this.u.c, Integer.valueOf(this.w.getProgress()));
        } else {
            hashMap.remove(this.u.c);
        }
    }
}
