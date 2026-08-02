package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import com.yandex.messaging.internal.view.input.emojipanel.a;
import com.yandex.messaging.internal.view.stickers.AutoSpanGridLayoutManager;

/* loaded from: classes15.dex */
public final class rtn {
    public final View a;
    public tsn b;
    public u1n c;
    public final mtn d;
    public final AutoSpanGridLayoutManager e;
    public final n5x0 f;

    public rtn(Activity activity, SharedPreferences sharedPreferences, a aVar) {
        u1n a = v5a1.a(usn.a, usn.c);
        this.c = a;
        mtn mtnVar = new mtn(sharedPreferences, aVar, (ntn[]) a.b);
        this.d = mtnVar;
        AutoSpanGridLayoutManager autoSpanGridLayoutManager = new AutoSpanGridLayoutManager(activity, activity.getResources().getDimensionPixelSize(gvg0.emoji_view_size));
        this.e = autoSpanGridLayoutManager;
        autoSpanGridLayoutManager.T = true;
        autoSpanGridLayoutManager.h0 = new qtn(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity, 0, false);
        View inflate = LayoutInflater.from(activity).inflate(olh0.msg_v_emoji_panel_emoji_page, (ViewGroup) null);
        this.a = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(e9h0.emoji_viewpager);
        RecyclerView recyclerView2 = (RecyclerView) inflate.findViewById(e9h0.emoji_tab_layout);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(gvg0.emoji_panel_padding);
        recyclerView2.addItemDecoration(new u590(0, 0, 0, 0, 0, dimensionPixelSize, dimensionPixelSize, 63));
        recyclerView2.setLayoutManager(linearLayoutManager);
        b1 b1Var = (b1) recyclerView2.getItemAnimator();
        if (b1Var != null) {
            b1Var.g = false;
        }
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(mtnVar);
        recyclerView.setLayoutManager(autoSpanGridLayoutManager);
        this.f = new n5x0(recyclerView, recyclerView2, new jln(3, this));
        xsn xsnVar = new xsn();
        xsnVar.a = new mum(this);
        recyclerView2.setAdapter(xsnVar);
        ((ImageButton) inflate.findViewById(e9h0.backspace_button)).setOnClickListener(new cmi(17, this));
    }
}
