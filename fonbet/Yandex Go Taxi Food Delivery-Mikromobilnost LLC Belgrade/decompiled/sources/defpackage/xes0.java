package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes10.dex */
public final class xes0 {
    public final Activity a;

    public xes0(Activity activity) {
        this.a = activity;
    }

    public final SimpleSpinnerModalView a() {
        ViewGroup viewGroup = (ViewGroup) this.a.findViewById(teh0.top_fullscreen_modal_views_container);
        SimpleSpinnerModalView.Companion.getClass();
        return yes0.c(viewGroup, false, false);
    }

    public final SimpleSpinnerModalView b(Runnable runnable) {
        ViewGroup viewGroup = (ViewGroup) this.a.findViewById(teh0.top_fullscreen_modal_views_container);
        SimpleSpinnerModalView.Companion.getClass();
        return yes0.d(viewGroup, new epo0(24, viewGroup, runnable));
    }
}
