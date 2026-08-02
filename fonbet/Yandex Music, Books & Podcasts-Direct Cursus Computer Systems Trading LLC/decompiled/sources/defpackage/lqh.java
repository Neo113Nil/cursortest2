package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class lqh extends gr0 {
    public final krh f;
    public final gk4 g;
    public final Context h;
    public crh i;
    public ArrayList j;
    public kqh k;
    public RecyclerView l;
    public boolean m;
    public irh n;
    public final long o;
    public long p;
    public final tt1 q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lqh(Context context) {
        super(r3, r0 == 0 ? v3g.H(r3) : r0);
        ContextThemeWrapper y = v3g.y(context, false);
        int K = v3g.K(y, R.attr.mediaRouteTheme);
        this.i = crh.c;
        this.q = new tt1(9, this);
        Context context2 = getContext();
        this.f = krh.d(context2);
        this.g = new gk4(4, this);
        this.h = context2;
        this.o = context2.getResources().getInteger(R.integer.mr_update_routes_delay_ms);
    }

    public final void e() {
        if (this.n == null && this.m) {
            this.f.getClass();
            ArrayList arrayList = new ArrayList(krh.f());
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                irh irhVar = (irh) arrayList.get(i);
                if (irhVar.d() || !irhVar.g || !irhVar.h(this.i)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, C1318t.j);
            long uptimeMillis = SystemClock.uptimeMillis() - this.p;
            long j = this.o;
            if (uptimeMillis < j) {
                tt1 tt1Var = this.q;
                tt1Var.removeMessages(1);
                tt1Var.sendMessageAtTime(tt1Var.obtainMessage(1, arrayList), this.p + j);
            } else {
                this.p = SystemClock.uptimeMillis();
                this.j.clear();
                this.j.addAll(arrayList);
                this.k.u();
            }
        }
    }

    public final void f(crh crhVar) {
        if (crhVar == null) {
            xq0.x("selector must not be null");
            return;
        }
        if (this.i.equals(crhVar)) {
            return;
        }
        this.i = crhVar;
        if (this.m) {
            krh krhVar = this.f;
            gk4 gk4Var = this.g;
            krhVar.i(gk4Var);
            krhVar.a(crhVar, gk4Var, 1);
        }
        e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = true;
        this.f.a(this.i, this.g, 1);
        e();
    }

    @Override // defpackage.gr0, defpackage.ln5, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_picker_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.h;
        decorView.setBackgroundColor(context.getColor(v3g.M(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        this.j = new ArrayList();
        ((ImageButton) findViewById(R.id.mr_picker_close_button)).setOnClickListener(new je(6, this));
        this.k = new kqh(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.l = recyclerView;
        recyclerView.setAdapter(this.k);
        this.l.setLayoutManager(new LinearLayoutManager(context));
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : o2g.a0(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m = false;
        this.f.i(this.g);
        this.q.removeMessages(1);
    }
}
