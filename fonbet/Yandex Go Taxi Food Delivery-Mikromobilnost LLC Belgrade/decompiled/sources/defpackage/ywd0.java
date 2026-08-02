package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.dsl.views.d;

/* loaded from: classes15.dex */
public final class ywd0 extends d {
    public final RecyclerView A;
    public final View B;
    public final ImageView C;
    public boolean w;
    public boolean x;
    public final View y;
    public final TextView z;

    public ywd0(Activity activity) {
        super(activity, olh0.msg_b_poll_info);
        this.y = this.c.a(e9h0.btn_back);
        this.z = (TextView) this.c.a(e9h0.screen_title);
        RecyclerView recyclerView = (RecyclerView) this.c.a(e9h0.poll_answers_recycler_view);
        this.A = recyclerView;
        this.B = this.c.a(e9h0.poll_answers_download_button);
        this.C = (ImageView) this.c.a(e9h0.poll_download_results_icon);
        recyclerView.addOnScrollListener(new xwd0(this));
    }
}
