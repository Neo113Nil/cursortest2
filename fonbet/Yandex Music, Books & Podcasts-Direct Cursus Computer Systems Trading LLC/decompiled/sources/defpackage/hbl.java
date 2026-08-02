package defpackage;

import android.view.View;
import android.widget.TextView;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class hbl extends opn {
    public final TextView u;
    public final View v;

    public hbl(View view) {
        super(view);
        if (dvt.a < 26) {
            view.setFocusable(true);
        }
        this.u = (TextView) view.findViewById(R.id.exo_text);
        this.v = view.findViewById(R.id.exo_check);
    }
}
