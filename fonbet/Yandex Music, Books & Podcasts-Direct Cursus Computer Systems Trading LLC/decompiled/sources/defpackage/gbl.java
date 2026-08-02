package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class gbl extends opn {
    public final TextView u;
    public final TextView v;
    public final ImageView w;
    public final /* synthetic */ nbl x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbl(nbl nblVar, View view) {
        super(view);
        this.x = nblVar;
        if (dvt.a < 26) {
            view.setFocusable(true);
        }
        this.u = (TextView) view.findViewById(R.id.exo_main_text);
        this.v = (TextView) view.findViewById(R.id.exo_sub_text);
        this.w = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new xal(1, this));
    }
}
