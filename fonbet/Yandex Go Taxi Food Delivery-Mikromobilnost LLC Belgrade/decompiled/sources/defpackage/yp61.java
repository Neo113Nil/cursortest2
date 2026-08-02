package defpackage;

import android.content.Context;
import android.view.TextureView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.ArrayList;
import kotlin.collections.a;
import yads.ab3;
import yads.de3;
import yads.e52;
import yads.eq0;
import yads.ih3;
import yads.og3;
import yads.t52;
import yads.za3;

/* loaded from: classes7.dex */
public final class yp61 extends ia71 {
    public final d881 c;
    public final ci61 d;
    public final uio0 e;
    public final hn71 f;
    public final tk81 g;
    public hv81 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp61(v981 v981Var, t52 t52Var, i630 i630Var, fe81 fe81Var, d881 d881Var, bl61 bl61Var, fl61 fl61Var, ml71 ml71Var, nr41 nr41Var, v881 v881Var, ak81 ak81Var) {
        super(t52Var);
        ci61 ci61Var = new ci61();
        this.c = d881Var;
        this.d = ci61Var;
        this.e = new uio0(t52Var.getContext(), this, i630Var, fe81Var, v981Var, d881Var, bl61Var, fl61Var, ml71Var, v881Var, ak81Var);
        ((n291) v981Var).getClass();
        this.f = new hn71(new ww71());
        this.g = (tk81) nr41Var.b;
        bl61Var.a.add(ci61Var);
    }

    @Override // defpackage.ia71
    public final void a(View view) {
        t52 t52Var = (t52) view;
        uio0 uio0Var = this.e;
        pzf pzfVar = (pzf) uio0Var.e;
        if (pzfVar != null) {
            s421 s421Var = (s421) pzfVar.b;
            if (s421Var != null) {
                hlx0 hlx0Var = (hlx0) s421Var.c;
                switch (hlx0Var.a) {
                    case 15:
                        sbm0 sbm0Var = (sbm0) hlx0Var.x;
                        ((kzo) sbm0Var.h).b();
                        ((bc71) sbm0Var.b).a.f();
                        ((eq71) hlx0Var.b).g();
                        break;
                    default:
                        ((kzo) hlx0Var.w).b();
                        eq71 eq71Var = (eq71) hlx0Var.b;
                        eq71Var.f();
                        eq71Var.g();
                        break;
                }
                x071 x071Var = t52Var.c.b;
                if (x071Var != null) {
                    CheckBox muteControl = x071Var.getMuteControl();
                    if (muteControl != null) {
                        muteControl.setOnClickListener(null);
                        muteControl.setVisibility(8);
                    }
                    ProgressBar videoProgress = x071Var.getVideoProgress();
                    if (videoProgress != null) {
                        videoProgress.setProgress(0);
                        videoProgress.setVisibility(8);
                    }
                    TextView countDownProgress = x071Var.getCountDownProgress();
                    if (countDownProgress != null) {
                        countDownProgress.setText("");
                        countDownProgress.setVisibility(8);
                    }
                }
            }
            bc71 bc71Var = (bc71) pzfVar.i;
            bc71Var.getClass();
            TextureView textureView = t52Var.b;
            bc71Var.a.c(null);
            textureView.setVisibility(8);
            t52Var.c.setVisibility(8);
            t52Var.a.setVisibility(8);
        }
        vuz vuzVar = (vuz) uio0Var.f;
        if (vuzVar != null) {
            ((ml71) uio0Var.c).a.remove(vuzVar);
            uio0Var.f = null;
        }
        t52Var.setOnAttachStateChangeListener(null);
        t52Var.setVisibility(8);
        t52Var.setOnClickListener(null);
        t52Var.setOnTouchListener(null);
        t52Var.setSelected(false);
    }

    @Override // defpackage.ia71
    public final void b(uy71 uy71Var, pj71 pj71Var, Object obj) {
        t52 t52Var;
        il81 il81Var = (il81) obj;
        t52 t52Var2 = (t52) d();
        if (t52Var2 != null) {
            pj71Var.m(t52Var2, uy71Var);
            if (il81Var == null || this.h == null) {
                return;
            }
            i581 i581Var = (i581) a.P(il81Var.a);
            pj71Var.o(uy71Var, new hn71(10, t52Var2, i581Var.a));
            uio0 uio0Var = this.e;
            ((tv71) uio0Var.b).getClass();
            int i = i581Var.d.c;
            t52Var2.setAspectRatio(i != 0 ? r5.b / i : 1.7777778f);
            pzf pzfVar = (pzf) uio0Var.e;
            if (pzfVar == null || (t52Var = (t52) ((yp61) pzfVar.f).d()) == null) {
                return;
            }
            t52Var.setClickable(false);
        }
    }

    @Override // defpackage.ia71
    public final /* bridge */ /* synthetic */ boolean c(View view, Object obj) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.ia71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(View view, Object obj) {
        bzd0 bzd0Var;
        ot71 ot71Var;
        tk81 tk81Var;
        d881 d881Var;
        hp61 hp61Var;
        yy71 yy71Var;
        eq71 eq71Var;
        cu81 cu81Var;
        t52 t52Var = (t52) view;
        il81 il81Var = (il81) obj;
        i581 i581Var = (i581) a.P(il81Var.a);
        hn71 hn71Var = this.f;
        Context context = t52Var.getContext();
        de3 de3Var = de3.e;
        hn71Var.getClass();
        sl81 sl81Var = new sl81(context);
        q191 q191Var = new q191(context);
        te71 te71Var = new te71();
        uk61 uk61Var = new uk61(i581Var.a, sl81Var, q191Var);
        ArrayList arrayList = te71Var.a;
        arrayList.add(uk61Var);
        bs81 bs81Var = i581Var.b;
        arrayList.add(new wh61(bs81Var, sl81Var));
        kx71 kx71Var = (kx71) hn71Var.c;
        k781 k781Var = i581Var.a;
        kx71Var.getClass();
        int i = k781Var.B;
        mf1 mf1Var = k781Var.z;
        hi81 hi81Var = null;
        if (mf1Var != null) {
            ab3 c = kx71Var.a.c(mf1Var.b);
            if (c != null) {
                float f = c.c;
                if (za3.c == c.b) {
                    f = (long) ((f / 100.0f) * i);
                }
                bzd0Var = new bzd0((long) Math.min(f, i), 6);
                ot71Var = !((ww71) hn71Var.b).a.a(context) ? new ot71(context, de3Var, bzd0Var, bs81Var.G) : null;
                if (ot71Var != null) {
                    arrayList.add(ot71Var);
                }
                hv81 hv81Var = new hv81(te71Var);
                this.h = hv81Var;
                this.d.a = hv81Var;
                tk81Var = this.g;
                Context context2 = t52Var.getContext();
                d881Var = this.c;
                tk81Var.getClass();
                String str = i581Var.e;
                boolean a = b9a1.a(context2, eq0.c);
                e52[] e52VarArr = e52.b;
                if ("first_video_preloading_strategy".equals(d881Var.s) || !a) {
                    hp61Var = tk81Var.b;
                    synchronized (hp61Var.d) {
                        qu71 qu71Var = hp61Var.b;
                        if (qu71Var.c.containsKey(str) && (yy71Var = (yy71) qu71Var.b.getValue()) != null) {
                            yy71Var.c++;
                            yy71Var.a.obtainMessage(3, 1, 0, str).sendToTarget();
                        }
                    }
                } else {
                    hp61 hp61Var2 = tk81Var.c;
                    synchronized (hp61Var2.d) {
                        try {
                            qu71 qu71Var2 = hp61Var2.b;
                            yy71 yy71Var2 = (yy71) qu71Var2.b.getValue();
                            if (yy71Var2 != null) {
                                yy71Var2.c++;
                                yy71Var2.a.obtainMessage(7, str).sendToTarget();
                            }
                            qu71Var2.c.remove(str);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                uio0 uio0Var = this.e;
                rr41 rr41Var = (rr41) uio0Var.d;
                i581 i581Var2 = (i581) a.P(il81Var.a);
                eq71 eq71Var2 = (eq71) ((ya71) ((i971) rr41Var.c).b).a.get(i581Var2);
                if (eq71Var2 == null || eq71Var2.j) {
                    s421 s421Var = (s421) rr41Var.b;
                    uio0 uio0Var2 = new uio0((Context) s421Var.x, (fe81) s421Var.b, (v981) s421Var.c, (d881) s421Var.w);
                    wb81 wb81Var = (wb81) uio0Var2.d;
                    gg81 gg81Var = (gg81) uio0Var2.e;
                    ai81 ai81Var = gg81Var != null ? gg81Var.N0 : null;
                    wb81Var.getClass();
                    if (ai81Var != null) {
                        Integer num = ai81Var.a;
                        int intValue = num != null ? num.intValue() : 50000;
                        Integer num2 = ai81Var.b;
                        int intValue2 = num2 != null ? num2.intValue() : 50000;
                        Integer num3 = ai81Var.c;
                        int intValue3 = num3 != null ? num3.intValue() : 2500;
                        Integer num4 = ai81Var.d;
                        int intValue4 = num4 != null ? num4.intValue() : 5000;
                        hi81.a(intValue3, 0, "bufferForPlaybackMs", "0");
                        hi81.a(intValue4, 0, "bufferForPlaybackAfterRebufferMs", "0");
                        hi81.a(intValue, intValue3, "minBufferMs", "bufferForPlaybackMs");
                        hi81.a(intValue, intValue4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
                        hi81.a(intValue2, intValue, "maxBufferMs", "minBufferMs");
                        Integer num5 = ai81Var.e;
                        hi81Var = new hi81(new xi71(), intValue, intValue2, intValue3, intValue4, num5 != null ? num5.intValue() : -1, true);
                    }
                    wm61 wm61Var = new wm61((Context) uio0Var2.f);
                    ks71 ks71Var = new ks71((Context) uio0Var2.f);
                    ks71Var.c = true;
                    boolean z = wm61Var.q;
                    if (z) {
                        ny61.k();
                        return;
                    }
                    wm61Var.c = new tm61(1, ks71Var);
                    if (hi81Var != null) {
                        if (z) {
                            ny61.k();
                            return;
                        }
                        wm61Var.f = new tm61(0, hi81Var);
                    }
                    if (z) {
                        ny61.k();
                        return;
                    }
                    wm61Var.q = true;
                    eq71 eq71Var3 = new eq71(new ek71(wm61Var), new vr((Context) uio0Var2.f, 17), new cf71((Context) uio0Var2.f, (fe81) uio0Var2.c, (v981) uio0Var2.a, (d881) uio0Var2.b));
                    ((ya71) ((i971) rr41Var.c).b).a.put(i581Var2, eq71Var3);
                    eq71Var = eq71Var3;
                } else {
                    eq71Var = eq71Var2;
                }
                Context context3 = t52Var.getContext();
                sbm0 sbm0Var = (sbm0) uio0Var.a;
                pzf pzfVar = new pzf(context3, (d881) sbm0Var.f, (v981) sbm0Var.e, eq71Var, il81Var, (i630) sbm0Var.c, (yp61) sbm0Var.b, new ip71((fe81) sbm0Var.d, (d881) sbm0Var.f), hv81Var, (bl61) sbm0Var.g, (fl61) sbm0Var.a, (v881) sbm0Var.h, (ak81) sbm0Var.i);
                uio0Var.e = pzfVar;
                rr41 rr41Var2 = (rr41) pzfVar.c;
                i630 i630Var = (i630) pzfVar.e;
                rr41Var2.getClass();
                Double d = (Double) i630Var.e;
                ((bc71) rr41Var2.c).a.a((float) (d != null ? d.doubleValue() : 0.0d));
                ih3 ih3Var = (ih3) i630Var.d;
                eq71 eq71Var4 = (eq71) rr41Var2.b;
                if (!eq71Var4.j) {
                    y671 y671Var = eq71Var4.e;
                    y671Var.x = ih3Var;
                    y671Var.c();
                }
                bc71 bc71Var = (bc71) pzfVar.i;
                bc71Var.getClass();
                TextureView textureView = t52Var.b;
                bc71Var.a.c(textureView);
                textureView.setVisibility(0);
                t52Var.c.setVisibility(0);
                t52Var.a.setVisibility(0);
                og3 og3Var = t52Var.a;
                hn71 hn71Var2 = (hn71) pzfVar.d;
                hn71Var2.getClass();
                ImageView imageView = og3Var.b;
                ProgressBar progressBar = og3Var.a;
                if (imageView == null || (cu81Var = ((il81) hn71Var2.b).c) == null) {
                    progressBar.setVisibility(0);
                } else {
                    ((no6) hn71Var2.c).a(cu81Var, new ss71(imageView, progressBar));
                }
                pzfVar.a((s421) pzfVar.k);
                vuz vuzVar = new vuz();
                uio0Var.f = vuzVar;
                ((ml71) uio0Var.c).a.add(vuzVar);
                t52Var.setOnAttachStateChangeListener(new ux71(eq71Var, t52Var));
                return;
            }
        }
        bzd0Var = null;
        if (!((ww71) hn71Var.b).a.a(context)) {
        }
        if (ot71Var != null) {
        }
        hv81 hv81Var2 = new hv81(te71Var);
        this.h = hv81Var2;
        this.d.a = hv81Var2;
        tk81Var = this.g;
        Context context22 = t52Var.getContext();
        d881Var = this.c;
        tk81Var.getClass();
        String str2 = i581Var.e;
        boolean a2 = b9a1.a(context22, eq0.c);
        e52[] e52VarArr2 = e52.b;
        if ("first_video_preloading_strategy".equals(d881Var.s)) {
        }
        hp61Var = tk81Var.b;
        synchronized (hp61Var.d) {
        }
    }
}
