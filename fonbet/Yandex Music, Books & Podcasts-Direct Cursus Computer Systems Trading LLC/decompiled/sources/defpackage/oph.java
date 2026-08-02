package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class oph extends gr0 {
    public final krh f;
    public final gk4 g;
    public crh h;
    public ArrayList i;
    public TextView j;
    public TextView k;
    public RelativeLayout l;
    public TextView m;
    public TextView n;
    public LinearLayout o;
    public Button p;
    public ProgressBar q;
    public ListView r;
    public nph s;
    public final l83 t;
    public boolean u;
    public long v;
    public final tt1 w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oph(Context context) {
        super(r2, r0 == 0 ? v3g.H(r2) : r0);
        ContextThemeWrapper y = v3g.y(context, false);
        int K = v3g.K(y, R.attr.mediaRouteTheme);
        this.h = crh.c;
        this.w = new tt1(8, this);
        this.f = krh.d(getContext());
        this.g = new gk4(2, this);
        this.t = new l83(11, this);
    }

    @Override // defpackage.gr0, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            getContext().unregisterReceiver(this.t);
        } catch (IllegalArgumentException unused) {
        }
        super.dismiss();
    }

    public final void e(List list) {
        this.v = SystemClock.uptimeMillis();
        this.i.clear();
        this.i.addAll(list);
        this.s.notifyDataSetChanged();
        tt1 tt1Var = this.w;
        tt1Var.removeMessages(3);
        tt1Var.removeMessages(2);
        if (!list.isEmpty()) {
            h(1);
        } else {
            h(0);
            tt1Var.sendMessageDelayed(tt1Var.obtainMessage(2), 5000L);
        }
    }

    public final void f() {
        if (this.u) {
            this.f.getClass();
            ArrayList arrayList = new ArrayList(krh.f());
            int size = arrayList.size();
            while (true) {
                int i = size - 1;
                if (size <= 0) {
                    break;
                }
                irh irhVar = (irh) arrayList.get(i);
                if (irhVar.d() || !irhVar.g || !irhVar.h(this.h)) {
                    arrayList.remove(i);
                }
                size = i;
            }
            Collections.sort(arrayList, C1318t.i);
            if (SystemClock.uptimeMillis() - this.v >= 300) {
                e(arrayList);
                return;
            }
            tt1 tt1Var = this.w;
            tt1Var.removeMessages(1);
            tt1Var.sendMessageAtTime(tt1Var.obtainMessage(1, arrayList), this.v + 300);
        }
    }

    public final void g(crh crhVar) {
        if (crhVar == null) {
            xq0.x("selector must not be null");
            return;
        }
        if (this.h.equals(crhVar)) {
            return;
        }
        this.h = crhVar;
        if (this.u) {
            krh krhVar = this.f;
            gk4 gk4Var = this.g;
            krhVar.i(gk4Var);
            krhVar.a(crhVar, gk4Var, 1);
        }
        f();
    }

    public final void h(int i) {
        if (i == 0) {
            setTitle(R.string.mr_chooser_title);
            this.r.setVisibility(8);
            this.k.setVisibility(0);
            this.q.setVisibility(0);
            this.o.setVisibility(8);
            this.p.setVisibility(8);
            this.n.setVisibility(8);
            this.l.setVisibility(8);
            return;
        }
        if (i == 1) {
            setTitle(R.string.mr_chooser_title);
            this.r.setVisibility(0);
            this.k.setVisibility(8);
            this.q.setVisibility(8);
            this.o.setVisibility(8);
            this.p.setVisibility(8);
            this.n.setVisibility(8);
            this.l.setVisibility(8);
            return;
        }
        if (i == 2) {
            setTitle(R.string.mr_chooser_title);
            this.r.setVisibility(8);
            this.k.setVisibility(8);
            this.q.setVisibility(0);
            this.o.setVisibility(8);
            this.p.setVisibility(8);
            this.n.setVisibility(4);
            this.l.setVisibility(0);
            return;
        }
        if (i != 3) {
            return;
        }
        setTitle(R.string.mr_chooser_zero_routes_found_title);
        this.r.setVisibility(8);
        this.k.setVisibility(8);
        this.q.setVisibility(8);
        this.o.setVisibility(0);
        this.p.setVisibility(0);
        this.n.setVisibility(0);
        this.l.setVisibility(0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.u = true;
        this.f.a(this.h, this.g, 1);
        f();
        tt1 tt1Var = this.w;
        tt1Var.removeMessages(2);
        tt1Var.removeMessages(3);
        tt1Var.removeMessages(1);
        tt1Var.sendMessageDelayed(tt1Var.obtainMessage(2), 5000L);
    }

    @Override // defpackage.gr0, defpackage.ln5, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String string;
        boolean z;
        super.onCreate(bundle);
        setContentView(R.layout.mr_chooser_dialog);
        this.i = new ArrayList();
        this.s = new nph(getContext(), this.i);
        this.j = (TextView) findViewById(R.id.mr_chooser_title);
        this.k = (TextView) findViewById(R.id.mr_chooser_searching);
        this.l = (RelativeLayout) findViewById(R.id.mr_chooser_wifi_warning_container);
        this.m = (TextView) findViewById(R.id.mr_chooser_wifi_warning_description);
        this.n = (TextView) findViewById(R.id.mr_chooser_wifi_learn_more);
        this.o = (LinearLayout) findViewById(R.id.mr_chooser_ok_button_container);
        this.p = (Button) findViewById(R.id.mr_chooser_ok_button);
        this.q = (ProgressBar) findViewById(R.id.mr_chooser_search_progress_bar);
        Context context = getContext();
        boolean z2 = false;
        if (bg3.m == null) {
            if (!bg3.M(context)) {
                PackageManager packageManager = context.getPackageManager();
                if (bg3.q == null) {
                    bg3.q = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                }
                if (!bg3.q.booleanValue() && !bg3.K(context) && !bg3.N(context)) {
                    z = true;
                    bg3.m = Boolean.valueOf(z);
                }
            }
            z = false;
            bg3.m = Boolean.valueOf(z);
        }
        if (!bg3.m.booleanValue()) {
            if (bg3.o == null) {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (Build.VERSION.SDK_INT >= 30 && sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                    z2 = true;
                }
                bg3.o = Boolean.valueOf(z2);
            }
            if (!bg3.o.booleanValue()) {
                if (bg3.M(context) || bg3.L(context.getResources())) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tablet);
                } else if (bg3.N(context)) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_tv);
                } else {
                    PackageManager packageManager2 = context.getPackageManager();
                    if (bg3.q == null) {
                        bg3.q = Boolean.valueOf(packageManager2.hasSystemFeature("android.hardware.type.watch"));
                    }
                    string = bg3.q.booleanValue() ? context.getString(R.string.mr_chooser_wifi_warning_description_watch) : bg3.K(context) ? context.getString(R.string.mr_chooser_wifi_warning_description_car) : context.getString(R.string.mr_chooser_wifi_warning_description_unknown);
                }
                this.m.setText(string);
                this.n.setMovementMethod(LinkMovementMethod.getInstance());
                this.p.setOnClickListener(new ol(24, this));
                ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
                this.r = listView;
                listView.setAdapter((ListAdapter) this.s);
                this.r.setOnItemClickListener(this.s);
                this.r.setEmptyView(findViewById(android.R.id.empty));
                getWindow().setLayout(o2g.a0(getContext()), -2);
                getContext().registerReceiver(this.t, new IntentFilter("android.intent.action.SCREEN_OFF"));
            }
        }
        string = context.getString(R.string.mr_chooser_wifi_warning_description_phone);
        this.m.setText(string);
        this.n.setMovementMethod(LinkMovementMethod.getInstance());
        this.p.setOnClickListener(new ol(24, this));
        ListView listView2 = (ListView) findViewById(R.id.mr_chooser_list);
        this.r = listView2;
        listView2.setAdapter((ListAdapter) this.s);
        this.r.setOnItemClickListener(this.s);
        this.r.setEmptyView(findViewById(android.R.id.empty));
        getWindow().setLayout(o2g.a0(getContext()), -2);
        getContext().registerReceiver(this.t, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.u = false;
        this.f.i(this.g);
        tt1 tt1Var = this.w;
        tt1Var.removeMessages(1);
        tt1Var.removeMessages(2);
        tt1Var.removeMessages(3);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.gr0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.j.setText(charSequence);
    }

    @Override // defpackage.gr0, android.app.Dialog
    public final void setTitle(int i) {
        this.j.setText(i);
    }
}
