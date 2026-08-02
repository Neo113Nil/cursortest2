package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class pqh extends opn {
    public final /* synthetic */ uqh A;
    public final View u;
    public final ImageView v;
    public final ProgressBar w;
    public final TextView x;
    public final float y;
    public irh z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqh(uqh uqhVar, View view) {
        super(view);
        this.A = uqhVar;
        this.u = view;
        this.v = (ImageView) view.findViewById(R.id.mr_cast_group_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_group_progress_bar);
        this.w = progressBar;
        this.x = (TextView) view.findViewById(R.id.mr_cast_group_name);
        wqh wqhVar = uqhVar.m;
        this.y = v3g.C(wqhVar.n);
        v3g.R(wqhVar.n, progressBar);
    }
}
