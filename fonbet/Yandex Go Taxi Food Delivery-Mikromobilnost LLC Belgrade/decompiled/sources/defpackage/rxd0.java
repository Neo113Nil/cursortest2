package defpackage;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.dsl.views.d;
import com.yandex.messaging.views.AnimatedProgressView;

/* loaded from: classes15.dex */
public final class rxd0 extends d {
    public final TextView A;
    public final TextView B;
    public final RecyclerView C;
    public final View w;
    public final TextView x;
    public final AnimatedProgressView y;
    public final TextView z;

    public rxd0(Activity activity) {
        super(activity, olh0.msg_b_poll_option_info);
        this.w = this.c.a(e9h0.btn_back);
        this.x = (TextView) this.c.a(e9h0.screen_title);
        this.y = (AnimatedProgressView) this.c.a(e9h0.poll_option_progress);
        this.z = (TextView) this.c.a(e9h0.poll_option_text);
        this.A = (TextView) this.c.a(e9h0.poll_vote_stat_percent);
        this.B = (TextView) this.c.a(e9h0.poll_vote_stat_amount);
        this.C = (RecyclerView) this.c.a(e9h0.poll_option_voters);
    }
}
