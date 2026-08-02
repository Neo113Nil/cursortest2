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
    public static final String f22091a = "template_config.json";

    /* renamed from: b, reason: collision with root package name */
    private static final String f22092b = "OrderCampAdapter";

    /* renamed from: f, reason: collision with root package name */
    private static final String f22093f = "anythink_lv_item_rl";

    /* renamed from: g, reason: collision with root package name */
    private static final String f22094g = "anythink_lv_iv";

    /* renamed from: h, reason: collision with root package name */
    private static final String f22095h = "anythink_lv_icon_iv";
    private static final String i = "anythink_lv_title_tv";

    /* renamed from: j, reason: collision with root package name */
    private static final String f22096j = "anythink_lv_tv_install";

    /* renamed from: k, reason: collision with root package name */
    private static final String f22097k = "anythink_lv_sv_starlevel";

    /* renamed from: l, reason: collision with root package name */
    private static final String f22098l = "anythink_lv_sv_heat_level";

    /* renamed from: m, reason: collision with root package name */
    private static final String f22099m = "anythink_lv_ration";

    /* renamed from: n, reason: collision with root package name */
    private static final String f22100n = "anythink_lv_desc_tv";

    /* renamed from: o, reason: collision with root package name */
    private static final String f22101o = "anythink_iv_flag";

    /* renamed from: p, reason: collision with root package name */
    private static final String f22102p = "anythink_order_viewed_tv";

    /* renamed from: q, reason: collision with root package name */
    private static final String f22103q = "anythink_order_layout_item";

    /* renamed from: r, reason: collision with root package name */
    private static final String f22104r = "anythink_lv_iv_burl";

    /* renamed from: s, reason: collision with root package name */
    private static final String f22105s = "501";

    /* renamed from: t, reason: collision with root package name */
    private static final String f22106t = "\\.xml";

    /* renamed from: u, reason: collision with root package name */
    private static final String f22107u = "\\/xml";

    /* renamed from: v, reason: collision with root package name */
    private static final String f22108v = "_item.xml";

    /* renamed from: c, reason: collision with root package name */
    private boolean f22109c = false;

    /* renamed from: d, reason: collision with root package name */
    private C0139a f22110d;

    /* renamed from: e, reason: collision with root package name */
    private List<d> f22111e;

    /* renamed from: com.anythink.expressad.video.dynview.ordercamp.a.a$2, reason: invalid class name */
    public class AnonymousClass2 implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f22115a;

        public AnonymousClass2(Context context) {
            this.f22115a = context;
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
                int b9 = v.b(this.f22115a, 12.0f);
                a.this.f22110d.f22125j.getLayoutParams().height = b9;
                a.this.f22110d.f22125j.getLayoutParams().width = (int) (b9 * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight()));
                a.this.f22110d.f22125j.setImageBitmap(bitmap);
                a.this.f22110d.f22125j.setBackgroundColor(1426063360);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.anythink.expressad.video.dynview.ordercamp.a.a$a, reason: collision with other inner class name */
    public static class C0139a {

        /* renamed from: a, reason: collision with root package name */
        RelativeLayout f22117a;

        /* renamed from: b, reason: collision with root package name */
        ATRotationView f22118b;

        /* renamed from: c, reason: collision with root package name */
        AnyThinkImageView f22119c;

        /* renamed from: d, reason: collision with root package name */
        RoundImageView f22120d;

        /* renamed from: e, reason: collision with root package name */
        TextView f22121e;

        /* renamed from: f, reason: collision with root package name */
        TextView f22122f;

        /* renamed from: g, reason: collision with root package name */
        TextView f22123g;

        /* renamed from: h, reason: collision with root package name */
        TextView f22124h;
        AnyThinkLevelLayoutView i;

        /* renamed from: j, reason: collision with root package name */
        ImageView f22125j;
    }

    public a(List<d> list) {
        this.f22111e = list;
    }

    private View b() {
        View inflate = LayoutInflater.from(t.b().g()).inflate(k.a(t.b().g().getApplicationContext(), f22103q, "layout"), (ViewGroup) null);
        C0139a c0139a = new C0139a();
        this.f22110d = c0139a;
        c0139a.f22119c = (AnyThinkImageView) inflate.findViewById(b(f22094g));
        this.f22110d.f22120d = (RoundImageView) inflate.findViewById(b(f22095h));
        this.f22110d.i = (AnyThinkLevelLayoutView) inflate.findViewById(b(f22097k));
        this.f22110d.f22118b = (ATRotationView) inflate.findViewById(b(f22099m));
        inflate.setTag(this.f22110d);
        return inflate;
    }

    private static int c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    private int d(String str) {
        return this.f22109c ? c(str) : b(str);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List<d> list = this.f22111e;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return this.f22111e.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i4) {
        List<d> list = this.f22111e;
        if (list != null) {
            return list.get(i4);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        try {
            if (view == null) {
                View inflate = LayoutInflater.from(t.b().g()).inflate(k.a(t.b().g().getApplicationContext(), f22103q, "layout"), (ViewGroup) null);
                C0139a c0139a = new C0139a();
                this.f22110d = c0139a;
                c0139a.f22119c = (AnyThinkImageView) inflate.findViewById(b(f22094g));
                this.f22110d.f22120d = (RoundImageView) inflate.findViewById(b(f22095h));
                this.f22110d.i = (AnyThinkLevelLayoutView) inflate.findViewById(b(f22097k));
                this.f22110d.f22118b = (ATRotationView) inflate.findViewById(b(f22099m));
                inflate.setTag(this.f22110d);
                view = inflate;
            } else {
                this.f22110d = (C0139a) view.getTag();
            }
            this.f22110d.f22117a = (RelativeLayout) view.findViewById(d(f22093f));
            this.f22110d.f22121e = (TextView) view.findViewById(d(i));
            this.f22110d.f22123g = (TextView) view.findViewById(d(f22096j));
            this.f22110d.f22122f = (TextView) view.findViewById(d(f22100n));
            this.f22110d.f22125j = (ImageView) view.findViewById(d(f22101o));
            this.f22110d.f22124h = (TextView) view.findViewById(d(f22102p));
            List<d> list = this.f22111e;
            if (list != null && this.f22110d != null && list.size() != 0) {
                AnyThinkImageView anyThinkImageView = this.f22110d.f22119c;
                if (anyThinkImageView != null) {
                    a(anyThinkImageView, this.f22111e.get(i4).bm(), false);
                }
                RoundImageView roundImageView = this.f22110d.f22120d;
                if (roundImageView != null) {
                    roundImageView.setBorderRadius(25);
                    a(this.f22110d.f22120d, this.f22111e.get(i4).bl(), true);
                }
                double bf = this.f22111e.get(i4).bf();
                if (bf <= 0.0d) {
                    bf = 5.0d;
                }
                AnyThinkLevelLayoutView anyThinkLevelLayoutView = this.f22110d.i;
                if (anyThinkLevelLayoutView != null) {
                    anyThinkLevelLayoutView.setRatingAndUser(bf, this.f22111e.get(i4).bg());
                    this.f22110d.i.setOrientation(0);
                }
                ATRotationView aTRotationView = this.f22110d.f22118b;
                if (aTRotationView != null) {
                    aTRotationView.setWidthRatio(1.0f);
                    this.f22110d.f22118b.setHeightRatio(1.0f);
                    this.f22110d.f22118b.setAutoscroll(false);
                }
                AnyThinkImageView anyThinkImageView2 = this.f22110d.f22119c;
                if (anyThinkImageView2 != null) {
                    anyThinkImageView2.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
                }
            }
            if (this.f22110d != null) {
                d dVar = this.f22111e.get(i4);
                if (this.f22110d.f22121e != null) {
                    this.f22110d.f22121e.setText(dVar.bj());
                }
                if (this.f22110d.f22122f != null) {
                    this.f22110d.f22122f.setText(dVar.bk());
                }
                TextView textView = this.f22110d.f22123g;
                if (textView != null) {
                    String str = dVar.dj;
                    if (textView instanceof AnyThinkTextView) {
                        new b();
                        ((AnyThinkTextView) this.f22110d.f22123g).setObjectAnimator(b.c(this.f22110d.f22123g));
                    }
                    this.f22110d.f22123g.setText(str);
                }
                if (this.f22110d.f22125j != null) {
                    try {
                        Locale.getDefault().getLanguage();
                        Context g9 = t.b().g();
                        v.a(this.f22110d.f22125j, dVar, t.b().g(), false);
                        com.anythink.expressad.foundation.g.d.b.a(g9).a(dVar.aH(), new AnonymousClass2(g9));
                    } catch (Exception e9) {
                        e9.getMessage();
                    }
                }
                if (this.f22110d.f22124h != null) {
                    try {
                        this.f22110d.f22124h.setText(t.b().g().getResources().getString(k.a(t.b().g(), "anythink_reward_viewed_text_str", k.f20423g)));
                        this.f22110d.f22124h.setVisibility(0);
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

    private void a(int i4) {
        List<d> list = this.f22111e;
        if (list == null || this.f22110d == null || list.size() == 0) {
            return;
        }
        AnyThinkImageView anyThinkImageView = this.f22110d.f22119c;
        if (anyThinkImageView != null) {
            a(anyThinkImageView, this.f22111e.get(i4).bm(), false);
        }
        RoundImageView roundImageView = this.f22110d.f22120d;
        if (roundImageView != null) {
            roundImageView.setBorderRadius(25);
            a(this.f22110d.f22120d, this.f22111e.get(i4).bl(), true);
        }
        double bf = this.f22111e.get(i4).bf();
        if (bf <= 0.0d) {
            bf = 5.0d;
        }
        AnyThinkLevelLayoutView anyThinkLevelLayoutView = this.f22110d.i;
        if (anyThinkLevelLayoutView != null) {
            anyThinkLevelLayoutView.setRatingAndUser(bf, this.f22111e.get(i4).bg());
            this.f22110d.i.setOrientation(0);
        }
        ATRotationView aTRotationView = this.f22110d.f22118b;
        if (aTRotationView != null) {
            aTRotationView.setWidthRatio(1.0f);
            this.f22110d.f22118b.setHeightRatio(1.0f);
            this.f22110d.f22118b.setAutoscroll(false);
        }
        AnyThinkImageView anyThinkImageView2 = this.f22110d.f22119c;
        if (anyThinkImageView2 != null) {
            anyThinkImageView2.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
        }
    }

    private static int b(String str) {
        return k.a(t.b().g().getApplicationContext(), str, "id");
    }

    private void b(int i4) {
        if (this.f22110d != null) {
            d dVar = this.f22111e.get(i4);
            if (this.f22110d.f22121e != null) {
                this.f22110d.f22121e.setText(dVar.bj());
            }
            if (this.f22110d.f22122f != null) {
                this.f22110d.f22122f.setText(dVar.bk());
            }
            TextView textView = this.f22110d.f22123g;
            if (textView != null) {
                String str = dVar.dj;
                if (textView instanceof AnyThinkTextView) {
                    new b();
                    ((AnyThinkTextView) this.f22110d.f22123g).setObjectAnimator(b.c(this.f22110d.f22123g));
                }
                this.f22110d.f22123g.setText(str);
            }
            if (this.f22110d.f22125j != null) {
                try {
                    Locale.getDefault().getLanguage();
                    Context g9 = t.b().g();
                    v.a(this.f22110d.f22125j, dVar, t.b().g(), false);
                    com.anythink.expressad.foundation.g.d.b.a(g9).a(dVar.aH(), new AnonymousClass2(g9));
                } catch (Exception e9) {
                    e9.getMessage();
                }
            }
            if (this.f22110d.f22124h != null) {
                try {
                    this.f22110d.f22124h.setText(t.b().g().getResources().getString(k.a(t.b().g(), "anythink_reward_viewed_text_str", k.f20423g)));
                    this.f22110d.f22124h.setVisibility(0);
                } catch (Exception e10) {
                    e10.getMessage();
                }
            }
        }
    }

    private void a(View view) {
        this.f22110d.f22117a = (RelativeLayout) view.findViewById(d(f22093f));
        this.f22110d.f22121e = (TextView) view.findViewById(d(i));
        this.f22110d.f22123g = (TextView) view.findViewById(d(f22096j));
        this.f22110d.f22122f = (TextView) view.findViewById(d(f22100n));
        this.f22110d.f22125j = (ImageView) view.findViewById(d(f22101o));
        this.f22110d.f22124h = (TextView) view.findViewById(d(f22102p));
    }

    private void a(final ImageView imageView, String str, final boolean z6) {
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
                    if (z6) {
                        imageView.setVisibility(8);
                    }
                }
            });
        } else if (z6) {
            imageView.setVisibility(8);
        }
    }

    private static int a(String str) {
        return k.a(t.b().g().getApplicationContext(), str, "layout");
    }

    private View a() {
        View inflate = LayoutInflater.from(t.b().g()).inflate(k.a(t.b().g().getApplicationContext(), f22103q, "layout"), (ViewGroup) null);
        C0139a c0139a = new C0139a();
        this.f22110d = c0139a;
        c0139a.f22119c = (AnyThinkImageView) inflate.findViewById(b(f22094g));
        this.f22110d.f22120d = (RoundImageView) inflate.findViewById(b(f22095h));
        this.f22110d.i = (AnyThinkLevelLayoutView) inflate.findViewById(b(f22097k));
        this.f22110d.f22118b = (ATRotationView) inflate.findViewById(b(f22099m));
        inflate.setTag(this.f22110d);
        return inflate;
    }
}
