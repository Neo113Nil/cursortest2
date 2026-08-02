package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.x0;
import com.google.android.flexbox.FlexboxLayout;
import com.yandex.messaging.ui.pollinfo.a;
import com.yandex.messaging.views.AnimatedProgressView;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class vwd0 extends x0 {
    public final k7d0 N;
    public final AnimatedProgressView O;
    public final TextView P;
    public final TextView Q;
    public final TextView R;
    public final i3y S;
    public final ArrayList T;
    public final ArrayList U;
    public TextView V;
    public int W;
    public final /* synthetic */ a Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwd0(a aVar, View view, k7d0 k7d0Var) {
        super(view);
        this.Z = aVar;
        this.N = k7d0Var;
        this.O = (AnimatedProgressView) view.findViewById(e9h0.poll_answer_vote_percent);
        this.P = (TextView) view.findViewById(e9h0.poll_answer_option_text);
        this.Q = (TextView) view.findViewById(e9h0.poll_answer_vote_stat_percent);
        this.R = (TextView) view.findViewById(e9h0.poll_answer_vote_stat_amount);
        this.S = kotlin.a.a(new j38(view, 2));
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.W = -1;
        view.setOnClickListener(new d5b0(13, this));
    }

    public final void W() {
        this.W = -1;
        ArrayList arrayList = this.U;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((x08) it.next()).cancel();
        }
        arrayList.clear();
        ((FlexboxLayout) this.S.getValue()).removeAllViews();
    }
}
