package com.anythink.expressad.video.dynview.ordercamp.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.g.d.c;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.video.dynview.h.b;
import com.anythink.expressad.video.dynview.widget.ATRotationView;
import com.anythink.expressad.video.dynview.widget.AnyThinkImageView;
import com.anythink.expressad.video.dynview.widget.AnyThinkLevelLayoutView;
import com.anythink.expressad.video.dynview.widget.AnyThinkTextView;
import com.anythink.expressad.videocommon.view.RoundImageView;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21304a = "template_config.json";

    /* renamed from: b, reason: collision with root package name */
    private static final String f21305b = "OrderCampAdapter";

    /* renamed from: f, reason: collision with root package name */
    private static final String f21306f = "anythink_lv_item_rl";

    /* renamed from: g, reason: collision with root package name */
    private static final String f21307g = "anythink_lv_iv";

    /* renamed from: h, reason: collision with root package name */
    private static final String f21308h = "anythink_lv_icon_iv";
    private static final String i = "anythink_lv_title_tv";

    /* renamed from: j, reason: collision with root package name */
    private static final String f21309j = "anythink_lv_tv_install";

    /* renamed from: k, reason: collision with root package name */
    private static final String f21310k = "anythink_lv_sv_starlevel";

    /* renamed from: l, reason: collision with root package name */
    private static final String f21311l = "anythink_lv_sv_heat_level";

    /* renamed from: m, reason: collision with root package name */
    private static final String f21312m = "anythink_lv_ration";

    /* renamed from: n, reason: collision with root package name */
    private static final String f21313n = "anythink_lv_desc_tv";

    /* renamed from: o, reason: collision with root package name */
    private static final String f21314o = "anythink_iv_flag";

    /* renamed from: p, reason: collision with root package name */
    private static final String f21315p = "anythink_order_viewed_tv";

    /* renamed from: q, reason: collision with root package name */
    private static final String f21316q = "anythink_order_layout_item";

    /* renamed from: r, reason: collision with root package name */
    private static final String f21317r = "anythink_lv_iv_burl";

    /* renamed from: s, reason: collision with root package name */
    private static final String f21318s = "501";

    /* renamed from: t, reason: collision with root package name */
    private static final String f21319t = "\\.xml";

    /* renamed from: u, reason: collision with root package name */
    private static final String f21320u = "\\/xml";

    /* renamed from: v, reason: collision with root package name */
    private static final String f21321v = "_item.xml";

    /* renamed from: c, reason: collision with root package name */
    private boolean f21322c = false;

    /* renamed from: d, reason: collision with root package name */
    private C0139a f21323d;

    /* renamed from: e, reason: collision with root package name */
    private List<d> f21324e;

    /* renamed from: com.anythink.expressad.video.dynview.ordercamp.a.a$2, reason: invalid class name */
    public class AnonymousClass2 implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f21328a;

        public AnonymousClass2(Context context) {
            this.f21328a = context;
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            try {
                int b9 = v.b(this.f21328a, 12.0f);
                a.this.f21323d.f21338j.getLayoutParams().height = b9;
                a.this.f21323d.f21338j.getLayoutParams().width = (int) (b9 * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight()));
                a.this.f21323d.f21338j.setImageBitmap(bitmap);
                a.this.f21323d.f21338j.setBackgroundColor(1426063360);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.anythink.expressad.video.dynview.ordercamp.a.a$a, reason: collision with other inner class name */
    public static class C0139a {

        /* renamed from: a, reason: collision with root package name */
        RelativeLayout f21330a;

        /* renamed from: b, reason: collision with root package name */
        ATRotationView f21331b;

        /* renamed from: c, reason: collision with root package name */
        AnyThinkImageView f21332c;

        /* renamed from: d, reason: collision with root package name */
        RoundImageView f21333d;

        /* renamed from: e, reason: collision with root package name */
        TextView f21334e;

        /* renamed from: f, reason: collision with root package name */
        TextView f21335f;

        /* renamed from: g, reason: collision with root package name */
        TextView f21336g;

        /* renamed from: h, reason: collision with root package name */
        TextView f21337h;
        AnyThinkLevelLayoutView i;

        /* renamed from: j, reason: collision with root package name */
        ImageView f21338j;
    }

    public a(List<d> list) {
        this.f21324e = list;
    }

    private View b() {
        View inflate = LayoutInflater.from(t.b().g()).inflate(k.a(t.b().g().getApplicationContext(), f21316q, "layout"), (ViewGroup) null);
        C0139a c0139a = new C0139a();
        this.f21323d = c0139a;
        c0139a.f21332c = (AnyThinkImageView) inflate.findViewById(b(f21307g));
        this.f21323d.f21333d = (RoundImageView) inflate.findViewById(b(f21308h));
        this.f21323d.i = (AnyThinkLevelLayoutView) inflate.findViewById(b(f21310k));
        this.f21323d.f21331b = (ATRotationView) inflate.findViewById(b(f21312m));
        inflate.setTag(this.f21323d);
        return inflate;
    }

    private static int c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    private int d(String str) {
        return this.f21322c ? c(str) : b(str);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List<d> list = this.f21324e;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return this.f21324e.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i6) {
        List<d> list = this.f21324e;
        if (list != null) {
            return list.get(i6);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i6) {
        return i6;
    }

    @Override // android.widget.Adapter
    public final View getView(int i6, View view, ViewGroup viewGroup) {
        try {
            if (view == null) {
                View inflate = LayoutInflater.from(t.b().g()).inflate(k.a(t.b().g().getApplicationContext(), f21316q, "layout"), (ViewGroup) null);
                C0139a c0139a = new C0139a();
                this.f21323d = c0139a;
                c0139a.f21332c = (AnyThinkImageView) inflate.findViewById(b(f21307g));
                this.f21323d.f21333d = (RoundImageView) inflate.findViewById(b(f21308h));
                this.f21323d.i = (AnyThinkLevelLayoutView) inflate.findViewById(b(f21310k));
                this.f21323d.f21331b = (ATRotationView) inflate.findViewById(b(f21312m));
                inflate.setTag(this.f21323d);
                view = inflate;
            } else {
                this.f21323d = (C0139a) view.getTag();
            }
            this.f21323d.f21330a = (RelativeLayout) view.findViewById(d(f21306f));
            this.f21323d.f21334e = (TextView) view.findViewById(d(i));
            this.f21323d.f21336g = (TextView) view.findViewById(d(f21309j));
            this.f21323d.f21335f = (TextView) view.findViewById(d(f21313n));
            this.f21323d.f21338j = (ImageView) view.findViewById(d(f21314o));
            this.f21323d.f21337h = (TextView) view.findViewById(d(f21315p));
            List<d> list = this.f21324e;
            if (list != null && this.f21323d != null && list.size() != 0) {
                AnyThinkImageView anyThinkImageView = this.f21323d.f21332c;
                if (anyThinkImageView != null) {
                    a(anyThinkImageView, this.f21324e.get(i6).bm(), false);
                }
                RoundImageView roundImageView = this.f21323d.f21333d;
                if (roundImageView != null) {
                    roundImageView.setBorderRadius(25);
                    a(this.f21323d.f21333d, this.f21324e.get(i6).bl(), true);
                }
                double bf = this.f21324e.get(i6).bf();
                if (bf <= 0.0d) {
                    bf = 5.0d;
                }
                AnyThinkLevelLayoutView anyThinkLevelLayoutView = this.f21323d.i;
                if (anyThinkLevelLayoutView != null) {
                    anyThinkLevelLayoutView.setRatingAndUser(bf, this.f21324e.get(i6).bg());
                    this.f21323d.i.setOrientation(0);
                }
                ATRotationView aTRotationView = this.f21323d.f21331b;
                if (aTRotationView != null) {
                    aTRotationView.setWidthRatio(1.0f);
                    this.f21323d.f21331b.setHeightRatio(1.0f);
                    this.f21323d.f21331b.setAutoscroll(false);
                }
                AnyThinkImageView anyThinkImageView2 = this.f21323d.f21332c;
                if (anyThinkImageView2 != null) {
                    anyThinkImageView2.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
                }
            }
            if (this.f21323d != null) {
                d dVar = this.f21324e.get(i6);
                if (this.f21323d.f21334e != null) {
                    this.f21323d.f21334e.setText(dVar.bj());
                }
                if (this.f21323d.f21335f != null) {
                    this.f21323d.f21335f.setText(dVar.bk());
                }
                TextView textView = this.f21323d.f21336g;
                if (textView != null) {
                    String str = dVar.dj;
                    if (textView instanceof AnyThinkTextView) {
                        new b();
                        ((AnyThinkTextView) this.f21323d.f21336g).setObjectAnimator(b.c(this.f21323d.f21336g));
                    }
                    this.f21323d.f21336g.setText(str);
                }
                if (this.f21323d.f21338j != null) {
                    try {
                        Locale.getDefault().getLanguage();
                        Context g4 = t.b().g();
                        v.a(this.f21323d.f21338j, dVar, t.b().g(), false);
                        com.anythink.expressad.foundation.g.d.b.a(g4).a(dVar.aH(), new AnonymousClass2(g4));
                    } catch (Exception e9) {
                        e9.getMessage();
                    }
                }
                if (this.f21323d.f21337h != null) {
                    try {
                        this.f21323d.f21337h.setText(t.b().g().getResources().getString(k.a(t.b().g(), "anythink_reward_viewed_text_str", k.f19636g)));
                        this.f21323d.f21337h.setVisibility(0);
                    } catch (Exception e10) {
                        e10.getMessage();
                    }
                }
            }
        } catch (Exception e11) {
            e11.getMessage();
        }
        return view;
    }

    private void a(int i6) {
        List<d> list = this.f21324e;
        if (list == null || this.f21323d == null || list.size() == 0) {
            return;
        }
        AnyThinkImageView anyThinkImageView = this.f21323d.f21332c;
        if (anyThinkImageView != null) {
            a(anyThinkImageView, this.f21324e.get(i6).bm(), false);
        }
        RoundImageView roundImageView = this.f21323d.f21333d;
        if (roundImageView != null) {
            roundImageView.setBorderRadius(25);
            a(this.f21323d.f21333d, this.f21324e.get(i6).bl(), true);
        }
        double bf = this.f21324e.get(i6).bf();
        if (bf <= 0.0d) {
            bf = 5.0d;
        }
        AnyThinkLevelLayoutView anyThinkLevelLayoutView = this.f21323d.i;
        if (anyThinkLevelLayoutView != null) {
            anyThinkLevelLayoutView.setRatingAndUser(bf, this.f21324e.get(i6).bg());
            this.f21323d.i.setOrientation(0);
        }
        ATRotationView aTRotationView = this.f21323d.f21331b;
        if (aTRotationView != null) {
            aTRotationView.setWidthRatio(1.0f);
            this.f21323d.f21331b.setHeightRatio(1.0f);
            this.f21323d.f21331b.setAutoscroll(false);
        }
        AnyThinkImageView anyThinkImageView2 = this.f21323d.f21332c;
        if (anyThinkImageView2 != null) {
            anyThinkImageView2.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
        }
    }

    private static int b(String str) {
        return k.a(t.b().g().getApplicationContext(), str, "id");
    }

    private void b(int i6) {
        if (this.f21323d != null) {
            d dVar = this.f21324e.get(i6);
            if (this.f21323d.f21334e != null) {
                this.f21323d.f21334e.setText(dVar.bj());
            }
            if (this.f21323d.f21335f != null) {
                this.f21323d.f21335f.setText(dVar.bk());
            }
            TextView textView = this.f21323d.f21336g;
            if (textView != null) {
                String str = dVar.dj;
                if (textView instanceof AnyThinkTextView) {
                    new b();
                    ((AnyThinkTextView) this.f21323d.f21336g).setObjectAnimator(b.c(this.f21323d.f21336g));
                }
                this.f21323d.f21336g.setText(str);
            }
            if (this.f21323d.f21338j != null) {
                try {
                    Locale.getDefault().getLanguage();
                    Context g4 = t.b().g();
                    v.a(this.f21323d.f21338j, dVar, t.b().g(), false);
                    com.anythink.expressad.foundation.g.d.b.a(g4).a(dVar.aH(), new AnonymousClass2(g4));
                } catch (Exception e9) {
                    e9.getMessage();
                }
            }
            if (this.f21323d.f21337h != null) {
                try {
                    this.f21323d.f21337h.setText(t.b().g().getResources().getString(k.a(t.b().g(), "anythink_reward_viewed_text_str", k.f19636g)));
                    this.f21323d.f21337h.setVisibility(0);
                } catch (Exception e10) {
                    e10.getMessage();
                }
            }
        }
    }

    private void a(View view) {
        this.f21323d.f21330a = (RelativeLayout) view.findViewById(d(f21306f));
        this.f21323d.f21334e = (TextView) view.findViewById(d(i));
        this.f21323d.f21336g = (TextView) view.findViewById(d(f21309j));
        this.f21323d.f21335f = (TextView) view.findViewById(d(f21313n));
        this.f21323d.f21338j = (ImageView) view.findViewById(d(f21314o));
        this.f21323d.f21337h = (TextView) view.findViewById(d(f21315p));
    }

    private void a(final ImageView imageView, String str, final boolean z3) {
        if (imageView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            com.anythink.expressad.foundation.g.d.b.a(imageView.getContext()).a(str, new c() { // from class: com.anythink.expressad.video.dynview.ordercamp.a.a.1
                @Override // com.anythink.expressad.foundation.g.d.c
                public final void a(Bitmap bitmap, String str2) {
                    try {
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        imageView.setImageBitmap(bitmap);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }

                @Override // com.anythink.expressad.foundation.g.d.c
                public final void a(String str2, String str3) {
                    if (z3) {
                        imageView.setVisibility(8);
                    }
                }
            });
        } else if (z3) {
            imageView.setVisibility(8);
        }
    }

    private static int a(String str) {
        return k.a(t.b().g().getApplicationContext(), str, "layout");
    }

    private View a() {
        View inflate = LayoutInflater.from(t.b().g()).inflate(k.a(t.b().g().getApplicationContext(), f21316q, "layout"), (ViewGroup) null);
        C0139a c0139a = new C0139a();
        this.f21323d = c0139a;
        c0139a.f21332c = (AnyThinkImageView) inflate.findViewById(b(f21307g));
        this.f21323d.f21333d = (RoundImageView) inflate.findViewById(b(f21308h));
        this.f21323d.i = (AnyThinkLevelLayoutView) inflate.findViewById(b(f21310k));
        this.f21323d.f21331b = (ATRotationView) inflate.findViewById(b(f21312m));
        inflate.setTag(this.f21323d);
        return inflate;
    }
}
