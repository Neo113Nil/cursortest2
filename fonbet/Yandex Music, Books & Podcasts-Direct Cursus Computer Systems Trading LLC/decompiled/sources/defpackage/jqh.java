package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class jqh extends opn {
    public final View u;
    public final ImageView v;
    public final ProgressBar w;
    public final TextView x;
    public final /* synthetic */ kqh y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jqh(kqh kqhVar, View view) {
        super(view);
        this.y = kqhVar;
        this.u = view;
        this.v = (ImageView) view.findViewById(R.id.mr_picker_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_picker_route_progress_bar);
        this.w = progressBar;
        this.x = (TextView) view.findViewById(R.id.mr_picker_route_name);
        v3g.R(kqhVar.j.h, progressBar);
    }
}
