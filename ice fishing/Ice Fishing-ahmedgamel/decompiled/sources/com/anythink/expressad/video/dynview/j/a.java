package com.anythink.expressad.video.dynview.j;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.m;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.h;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.z;
import com.anythink.expressad.video.dynview.f.e;
import com.anythink.expressad.video.dynview.g.a;
import com.anythink.expressad.video.dynview.widget.ATRotationView;
import com.anythink.expressad.video.dynview.widget.AnyThinkImageView;
import com.anythink.expressad.video.dynview.widget.AnyThinkLevelLayoutView;
import com.anythink.expressad.videocommon.view.RoundImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21231a = "DataEnergizeWrapper";

    /* renamed from: k, reason: collision with root package name */
    private static boolean f21232k = false;

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.expressad.video.dynview.i.c.b f21234c;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Bitmap> f21235d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f21236e;

    /* renamed from: f, reason: collision with root package name */
    private String f21237f = "#FFFFFFFF";

    /* renamed from: g, reason: collision with root package name */
    private String f21238g = "#60000000";

    /* renamed from: h, reason: collision with root package name */
    private String f21239h = "#FF5F5F5F";
    private String i = "#90ECECEC";

    /* renamed from: j, reason: collision with root package name */
    private volatile long f21240j = 0;

    /* renamed from: l, reason: collision with root package name */
    private com.anythink.expressad.video.dynview.i.c.a f21241l = null;

    /* renamed from: m, reason: collision with root package name */
    private boolean f21242m = false;

    /* renamed from: n, reason: collision with root package name */
    private int f21243n = 0;

    /* renamed from: b, reason: collision with root package name */
    public com.anythink.expressad.video.dynview.e.a f21233b = new com.anythink.expressad.video.dynview.e.a() { // from class: com.anythink.expressad.video.dynview.j.a.1
        @Override // com.anythink.expressad.video.dynview.e.a
        public final void a() {
            if (!a.this.f21242m || a.this.f21234c == null) {
                return;
            }
            a.this.f21234c.a(a.this.f21243n * 1000, a.this.f21241l);
            a.this.f21242m = false;
        }

        @Override // com.anythink.expressad.video.dynview.e.a
        public final void b() {
            if (a.this.f21234c != null) {
                a.this.f21234c.c();
                a.this.f21242m = true;
            }
        }

        @Override // com.anythink.expressad.video.dynview.e.a
        public final void c() {
            if (a.this.f21234c != null) {
                a.this.f21234c.c();
                a.this.f21242m = true;
            }
        }
    };

    /* renamed from: com.anythink.expressad.video.dynview.j.a$5, reason: invalid class name */
    public class AnonymousClass5 extends com.anythink.expressad.widget.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f21263a;

        public AnonymousClass5(Map map) {
            this.f21263a = map;
        }

        @Override // com.anythink.expressad.widget.a
        public final void a(View view) {
            if (a.this.f21236e) {
                return;
            }
            a.f(a.this);
            a.a(a.this, this.f21263a);
        }
    }

    public static /* synthetic */ boolean f(a aVar) {
        aVar.f21236e = true;
        return true;
    }

    public final void b(com.anythink.expressad.video.dynview.c cVar, View view, Map map, e eVar) {
        if (eVar == null) {
            return;
        }
        if (cVar == null) {
            eVar.a(com.anythink.expressad.video.dynview.c.b.NOT_FOUND_VIEWOPTION);
            return;
        }
        if (map != null && map.containsKey("is_dy_success")) {
            f21232k = ((Boolean) map.get("is_dy_success")).booleanValue();
        }
        f21232k = false;
        ImageView imageView = (ImageView) view.findViewById(a("anythink_reward_icon_riv"));
        TextView textView = (TextView) view.findViewById(a("anythink_reward_title_tv"));
        LinearLayout linearLayout = (LinearLayout) view.findViewById(a("anythink_reward_stars_mllv"));
        TextView textView2 = (TextView) view.findViewById(a("anythink_reward_click_tv"));
        ImageView imageView2 = (ImageView) view.findViewById(a("anythink_videoview_bg"));
        TextView textView3 = (TextView) view.findViewById(a("anythink_reward_desc_tv"));
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a("anythink_reward_bottom_layout"));
        ArrayList arrayList = new ArrayList();
        List<d> g4 = cVar.g();
        if (g4 == null || g4.size() <= 0) {
            eVar.a(com.anythink.expressad.video.dynview.c.b.CAMPAIGNEX_IS_NULL);
            return;
        }
        d dVar = g4.get(0);
        if (dVar == null) {
            eVar.a(com.anythink.expressad.video.dynview.c.b.CAMPAIGNEX_IS_NULL);
            return;
        }
        if (imageView != null) {
            ((RoundImageView) imageView).setBorderRadius(10);
            a(dVar.bl(), imageView);
        }
        if (textView != null) {
            textView.setText(dVar.bj());
        }
        if (textView3 != null) {
            textView3.setText(dVar.bk());
        }
        if (linearLayout != null) {
            double bf = dVar.bf();
            if (bf <= 0.0d) {
                bf = 5.0d;
            }
            ((AnyThinkLevelLayoutView) linearLayout).setRatingAndUser(bf, dVar.bg());
        }
        if (textView2 != null) {
            textView2.setText(dVar.dj);
        }
        int i = cVar.i();
        if (i == 102 || i == 202 || i == 302) {
            if (textView2 != null) {
                arrayList.add(textView2);
            }
        } else if (i == 802) {
            if (imageView != null) {
                arrayList.add(imageView);
            }
            if (textView2 != null) {
                arrayList.add(textView2);
            }
            a(imageView2, dVar.bm(), i);
        } else if (i != 902) {
            if (i != 904) {
                if (i == 5002010) {
                    if (cVar.k() && relativeLayout != null && relativeLayout.getVisibility() == 0) {
                        arrayList.add(relativeLayout);
                    } else {
                        if (imageView != null) {
                            arrayList.add(imageView);
                        }
                        if (textView2 != null) {
                            arrayList.add(textView2);
                        }
                    }
                }
            } else if (cVar.k()) {
                arrayList.add(view);
            }
        } else if (TextUtils.isEmpty(cVar.n()) || !cVar.n().equals("dsp") || !TextUtils.isEmpty(dVar.af())) {
            arrayList.add(view);
        }
        eVar.a(view, arrayList);
    }

    public final void c(com.anythink.expressad.video.dynview.c cVar, View view, final Map map, e eVar) {
        try {
            if (this.f21235d == null) {
                this.f21235d = new HashMap();
            }
            final List<d> g4 = cVar.g();
            if (view.getContext() == null) {
                eVar.a(com.anythink.expressad.video.dynview.c.b.NOT_FOUND_CONTEXT);
                return;
            }
            if (map != null && map.containsKey("is_dy_success")) {
                f21232k = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            f21232k = false;
            ListView listView = (ListView) view.findViewById(a("anythink_order_view_lv"));
            GridView gridView = (GridView) view.findViewById(a("anythink_order_view_h_lv"));
            ImageView imageView = (ImageView) view.findViewById(a("anythink_order_view_iv_close"));
            com.anythink.expressad.video.dynview.ordercamp.a.a aVar = new com.anythink.expressad.video.dynview.ordercamp.a.a(g4);
            if (cVar.e() == 1) {
                if (listView != null) {
                    try {
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) listView.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = -1;
                            float c9 = (cVar.c() - v.b(t.b().g(), 720.0f)) / 2.0f;
                            int b9 = v.b(t.b().g(), 10.0f);
                            int i = (int) c9;
                            layoutParams.setMargins(b9, i, b9, i);
                            listView.setLayoutParams(layoutParams);
                        }
                    } catch (Exception e9) {
                        e9.getMessage();
                    }
                    listView.setAdapter((ListAdapter) aVar);
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.anythink.expressad.video.dynview.j.a.7
                        @Override // android.widget.AdapterView.OnItemClickListener
                        public final void onItemClick(AdapterView<?> adapterView, View view2, int i6, long j6) {
                            a.a(a.this, map, g4, i6);
                        }
                    });
                }
            } else if (gridView != null) {
                int d2 = (int) cVar.d();
                int size = d2 / g4.size();
                int i6 = size / 9;
                int i9 = i6 / 2;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) gridView.getLayoutParams();
                layoutParams2.width = d2 - (i6 * 2);
                gridView.setLayoutParams(layoutParams2);
                gridView.setColumnWidth((size - i6) - (i9 / 2));
                gridView.setHorizontalSpacing(i9);
                gridView.setStretchMode(0);
                gridView.setNumColumns(g4.size());
                gridView.setAdapter((ListAdapter) aVar);
                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.anythink.expressad.video.dynview.j.a.8
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public final void onItemClick(AdapterView<?> adapterView, View view2, int i10, long j6) {
                        a.a(a.this, map, g4, i10);
                    }
                });
            }
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.dynview.j.a.9
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        a.b(a.this, map);
                    }
                });
            }
            if (eVar != null) {
                eVar.a(view, null);
            }
        } catch (Exception unused) {
            if (eVar != null) {
                eVar.a(com.anythink.expressad.video.dynview.c.b.NOT_FOUND_VIEWOPTION);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0279  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.anythink.expressad.video.dynview.c cVar, View view, final Map map, e eVar) {
        d dVar;
        d dVar2;
        d dVar3;
        int i;
        RoundImageView roundImageView;
        int i6;
        long parseLong;
        FrameLayout.LayoutParams layoutParams;
        if (this.f21235d == null) {
            this.f21235d = new HashMap();
        }
        final List<d> g4 = cVar.g();
        if (view == null) {
            eVar.a(com.anythink.expressad.video.dynview.c.b.NOT_FOUND_ROOTVIEW);
            return;
        }
        Context context = view.getContext();
        if (context == null) {
            eVar.a(com.anythink.expressad.video.dynview.c.b.NOT_FOUND_CONTEXT);
            return;
        }
        if (g4 == null || g4.size() <= 1) {
            dVar = null;
            dVar2 = null;
        } else {
            dVar = g4.get(0);
            dVar.a(1);
            dVar2 = g4.get(1);
            dVar2.a(2);
        }
        if (dVar == null && eVar != null) {
            eVar.a(com.anythink.expressad.video.dynview.c.b.CAMPAIGNEX_IS_NULL);
            return;
        }
        if (dVar2 == null && eVar != null) {
            eVar.a(com.anythink.expressad.video.dynview.c.b.CAMPAIGNEX_IS_NULL);
            return;
        }
        f21232k = false;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a("anythink_top_item_rl"));
        AnyThinkImageView anyThinkImageView = (AnyThinkImageView) view.findViewById(a("anythink_top_iv"));
        ATRotationView aTRotationView = (ATRotationView) view.findViewById(a("anythink_top_ration"));
        view.findViewById(a("anythink_top_icon_iv"));
        TextView textView = (TextView) view.findViewById(a("anythink_top_title_tv"));
        RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(a("anythink_bottom_item_rl"));
        ATRotationView aTRotationView2 = (ATRotationView) view.findViewById(a("anythink_bottom_ration"));
        AnyThinkImageView anyThinkImageView2 = (AnyThinkImageView) view.findViewById(a("anythink_bottom_iv"));
        RoundImageView roundImageView2 = (RoundImageView) view.findViewById(a("anythink_bottom_icon_iv"));
        d dVar4 = dVar2;
        TextView textView2 = (TextView) view.findViewById(a("anythink_bottom_title_tv"));
        view.findViewById(a("anythink_reward_choice_one_like_iv"));
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.dynview.j.a.3
                @Override // com.anythink.expressad.widget.a
                public final void a(View view2) {
                    if (a.this.f21236e) {
                        return;
                    }
                    a.f(a.this);
                    a.a(a.this, map, g4, 0);
                }
            });
        }
        if (anyThinkImageView != null) {
            anyThinkImageView.setCustomBorder(20, 20, 0, 0, 10, -16777216);
            a(dVar.bm(), anyThinkImageView, cVar, view);
            if (aTRotationView != null) {
                if (dVar.aG()) {
                    if (!TextUtils.isEmpty(dVar.bl())) {
                        ImageView imageView = new ImageView(cVar.a());
                        dVar3 = dVar;
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, v.b(cVar.a(), 200.0f)));
                        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        aTRotationView.addView(imageView);
                        a(dVar3.bl(), imageView);
                        aTRotationView.setWidthRatio(0.45f);
                        aTRotationView.setHeightRatio(0.9f);
                        aTRotationView.setAutoscroll(true);
                        i = 0;
                    } else {
                        dVar3 = dVar;
                        aTRotationView.setWidthRatio(1.0f);
                        aTRotationView.setHeightRatio(1.0f);
                        i = 0;
                        aTRotationView.setAutoscroll(false);
                    }
                } else {
                    dVar3 = dVar;
                    i = 0;
                    aTRotationView.setWidthRatio(1.0f);
                    aTRotationView.setHeightRatio(1.0f);
                    aTRotationView.setAutoscroll(false);
                }
                roundImageView = (RoundImageView) view.findViewById(a("anythink_top_icon_iv"));
                if (roundImageView != null) {
                    roundImageView.setType(i);
                    a(dVar3.bl(), roundImageView);
                }
                if (textView != null) {
                    if (!TextUtils.isEmpty(dVar3.bj())) {
                        textView.setText(dVar3.bj());
                    } else {
                        textView.setVisibility(8);
                    }
                }
                if (relativeLayout2 != null) {
                    relativeLayout2.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.dynview.j.a.4
                        @Override // com.anythink.expressad.widget.a
                        public final void a(View view2) {
                            if (a.this.f21236e) {
                                return;
                            }
                            a.f(a.this);
                            a.a(a.this, map, g4, 1);
                        }
                    });
                }
                if (anyThinkImageView2 != null) {
                    anyThinkImageView2.setCustomBorder(20, 20, 0, 0, 10, -16777216);
                    a(dVar4.bm(), anyThinkImageView2, cVar, view);
                    if (aTRotationView2 != null) {
                        if (dVar4.aG()) {
                            if (!TextUtils.isEmpty(dVar4.bl())) {
                                ImageView imageView2 = new ImageView(cVar.a());
                                imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, v.b(cVar.a(), 200.0f)));
                                imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                aTRotationView2.addView(imageView2);
                                a(dVar4.bl(), imageView2);
                                aTRotationView2.setWidthRatio(0.45f);
                                aTRotationView2.setHeightRatio(0.9f);
                                aTRotationView2.setAutoscroll(true);
                            } else {
                                aTRotationView2.setWidthRatio(1.0f);
                                aTRotationView2.setHeightRatio(1.0f);
                                i6 = 0;
                                aTRotationView2.setAutoscroll(false);
                            }
                        } else {
                            i6 = 0;
                            aTRotationView2.setWidthRatio(1.0f);
                            aTRotationView2.setHeightRatio(1.0f);
                            aTRotationView2.setAutoscroll(false);
                        }
                        if (roundImageView2 != null) {
                            roundImageView2.setType(i6);
                            a(dVar4.bl(), roundImageView2);
                        }
                        if (textView2 != null) {
                            textView2.setText(dVar4.bj());
                        }
                        String at = dVar3.at();
                        int e9 = cVar.e();
                        String a9 = z.a(at, com.anythink.expressad.foundation.g.g.a.b.f19426T);
                        z.a(at, com.anythink.expressad.foundation.g.g.a.b.f19427U);
                        parseLong = !TextUtils.isEmpty(a9) ? Long.parseLong(a9) : 0L;
                        if (parseLong != 0) {
                            if (map != null && map.containsKey("is_dy_success")) {
                                f21232k = ((Boolean) map.get("is_dy_success")).booleanValue();
                            }
                            f21232k = false;
                            TextView textView3 = (TextView) view.findViewById(a("anythink_choice_one_countdown_tv"));
                            if (textView3 != null) {
                                textView3.setTextSize(11.0f);
                                textView3.setTextColor(Color.parseColor(this.f21237f));
                                String str = this.f21238g;
                                GradientDrawable gradientDrawable = new GradientDrawable();
                                gradientDrawable.setColor(Color.parseColor(str));
                                gradientDrawable.setCornerRadius(v.b(textView3.getContext(), 12.0f));
                                gradientDrawable.setStroke(v.b(textView3.getContext(), 1.0f), Color.parseColor(str));
                                textView3.setBackgroundDrawable(gradientDrawable);
                                if (e9 == 2 && (layoutParams = (FrameLayout.LayoutParams) textView3.getLayoutParams()) != null) {
                                    int d2 = v.d(context);
                                    int b9 = v.b(context, 10.0f);
                                    layoutParams.setMargins(b9, b9, d2, b9);
                                }
                                textView3.setVisibility(0);
                                textView3.setOnClickListener(new AnonymousClass5(map));
                                this.f21241l = new AnonymousClass6(textView3, map);
                                com.anythink.expressad.video.dynview.i.c.b a10 = new com.anythink.expressad.video.dynview.i.c.b().a(parseLong * 1000).a().a(this.f21241l);
                                this.f21234c = a10;
                                a10.b();
                            }
                            ImageView imageView3 = (ImageView) view.findViewById(a("anythink_iv_link"));
                            if (dVar3.w() != null) {
                                dVar3.w().a("");
                            }
                            if (imageView3 != null) {
                                v.a(imageView3, dVar3, view.getContext(), true);
                            }
                        }
                        if (eVar != null) {
                            eVar.a(view, null);
                            return;
                        }
                        return;
                    }
                }
                i6 = 0;
                if (roundImageView2 != null) {
                }
                if (textView2 != null) {
                }
                String at2 = dVar3.at();
                int e92 = cVar.e();
                String a92 = z.a(at2, com.anythink.expressad.foundation.g.g.a.b.f19426T);
                z.a(at2, com.anythink.expressad.foundation.g.g.a.b.f19427U);
                if (!TextUtils.isEmpty(a92)) {
                }
                if (parseLong != 0) {
                }
                if (eVar != null) {
                }
            }
        }
        dVar3 = dVar;
        i = 0;
        roundImageView = (RoundImageView) view.findViewById(a("anythink_top_icon_iv"));
        if (roundImageView != null) {
        }
        if (textView != null) {
        }
        if (relativeLayout2 != null) {
        }
        if (anyThinkImageView2 != null) {
        }
        i6 = 0;
        if (roundImageView2 != null) {
        }
        if (textView2 != null) {
        }
        String at22 = dVar3.at();
        int e922 = cVar.e();
        String a922 = z.a(at22, com.anythink.expressad.foundation.g.g.a.b.f19426T);
        z.a(at22, com.anythink.expressad.foundation.g.g.a.b.f19427U);
        if (!TextUtils.isEmpty(a922)) {
        }
        if (parseLong != 0) {
        }
        if (eVar != null) {
        }
    }

    /* renamed from: com.anythink.expressad.video.dynview.j.a$10, reason: invalid class name */
    public class AnonymousClass10 implements com.anythink.expressad.foundation.g.d.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21245a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f21246b;

        public AnonymousClass10(int i, ImageView imageView) {
            this.f21245a = i;
            this.f21246b = imageView;
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(final Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                int a9 = k.a(this.f21246b.getContext(), "anythink_icon_play_bg", k.f19632c);
                this.f21246b.setBackgroundColor(Color.parseColor(a.this.f21239h));
                this.f21246b.setImageResource(a9);
                this.f21246b.setScaleType(ImageView.ScaleType.CENTER);
                return;
            }
            int i = this.f21245a;
            if (i != 501 && i != 802) {
                this.f21246b.setImageBitmap(bitmap);
            } else {
                com.anythink.expressad.foundation.g.i.a.b().execute(new Runnable() { // from class: com.anythink.expressad.video.dynview.j.a.10.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            final Bitmap a10 = h.a(bitmap);
                            AnonymousClass10.this.f21246b.post(new Runnable() { // from class: com.anythink.expressad.video.dynview.j.a.10.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AnonymousClass10.this.f21246b.setImageBitmap(a10);
                                }
                            });
                        } catch (Exception e9) {
                            e9.getMessage();
                        }
                    }
                });
            }
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
            try {
                int a9 = k.a(this.f21246b.getContext(), "anythink_icon_play_bg", k.f19632c);
                this.f21246b.setBackgroundColor(Color.parseColor(a.this.f21239h));
                this.f21246b.setImageResource(a9);
                this.f21246b.setScaleType(ImageView.ScaleType.CENTER);
            } catch (Exception e9) {
                e9.getMessage();
            }
        }
    }

    /* renamed from: com.anythink.expressad.video.dynview.j.a$6, reason: invalid class name */
    public class AnonymousClass6 implements com.anythink.expressad.video.dynview.i.c.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f21265a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f21266b;

        public AnonymousClass6(TextView textView, Map map) {
            this.f21265a = textView;
            this.f21266b = map;
        }

        @Override // com.anythink.expressad.video.dynview.i.c.a
        public final void a(long j6) {
            String str;
            a.this.f21243n = (int) (j6 / 1000);
            long j9 = a.this.f21243n;
            Context context = this.f21265a.getContext();
            String e9 = m.e(context);
            if (e9.startsWith(com.anythink.expressad.video.dynview.a.a.f21096S) || e9.startsWith(com.anythink.expressad.video.dynview.a.a.f21097T)) {
                str = j9 + " " + context.getString(k.a(context, "anythink_cm_video_auto_play_after", k.f19636g));
            } else if (e9.startsWith(com.anythink.expressad.video.dynview.a.a.f21098U)) {
                str = com.anythink.expressad.video.dynview.a.a.f21087I + j9 + " Sekunden";
            } else if (e9.startsWith(com.anythink.expressad.video.dynview.a.a.f21099V)) {
                str = j9 + com.anythink.expressad.video.dynview.a.a.J;
            } else if (e9.startsWith(com.anythink.expressad.video.dynview.a.a.f21100W)) {
                str = com.anythink.expressad.video.dynview.a.a.f21088K + j9 + " secondes";
            } else if (e9.startsWith(com.anythink.expressad.video.dynview.a.a.f21101X)) {
                str = " ثوان" + j9 + com.anythink.expressad.video.dynview.a.a.f21089L;
            } else if (e9.startsWith(com.anythink.expressad.video.dynview.a.a.Y)) {
                str = com.anythink.expressad.video.dynview.a.a.f21090M + j9 + " секунд";
            } else {
                str = com.anythink.expressad.video.dynview.a.a.f21086H + j9 + " s";
            }
            this.f21265a.setText(str);
            a.this.f21240j++;
        }

        @Override // com.anythink.expressad.video.dynview.i.c.a
        public final void a() {
            a.a(a.this, this.f21266b);
        }
    }

    private void b(Map map) {
        if (map != null) {
            try {
                if (map.containsKey(com.anythink.expressad.video.dynview.a.a.f21085G) && (map.get(com.anythink.expressad.video.dynview.a.a.f21085G) instanceof com.anythink.expressad.video.dynview.f.c)) {
                    ((com.anythink.expressad.video.dynview.f.c) map.get(com.anythink.expressad.video.dynview.a.a.f21085G)).a();
                    b();
                }
            } catch (Exception e9) {
                e9.getMessage();
            }
        }
    }

    private static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    private static void b(com.anythink.expressad.video.dynview.c cVar, View view) {
        a.C0136a a9 = com.anythink.expressad.video.dynview.g.a.a();
        a9.a(cVar.e()).a();
        if (cVar.e() != 2) {
            a9.a(cVar.d()).b(cVar.c());
        } else if (cVar.d() > cVar.c()) {
            a9.a(cVar.d()).b(cVar.c());
        } else {
            a9.a(cVar.c()).b(cVar.d());
        }
        if (view.getBackground() == null) {
            view.setBackgroundDrawable(a9.b());
        }
    }

    private void b() {
        com.anythink.expressad.video.dynview.i.a.a.a().b();
        com.anythink.expressad.video.dynview.i.c.b bVar = this.f21234c;
        if (bVar != null) {
            bVar.c();
            this.f21234c = null;
        }
        com.anythink.expressad.video.dynview.b.a.a().f21136a = null;
        if (this.f21233b != null) {
            this.f21233b = null;
        }
        Map<String, Bitmap> map = this.f21235d;
        if (map != null) {
            if (map.entrySet() != null) {
                try {
                    Iterator<Map.Entry<String, Bitmap>> it = this.f21235d.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, Bitmap> next = it.next();
                        if (next != null && next.getValue() != null && !next.getValue().isRecycled()) {
                            next.getValue().recycle();
                        }
                        it.remove();
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
            this.f21235d.clear();
        }
    }

    public static /* synthetic */ void b(a aVar, Map map) {
        if (map != null) {
            try {
                if (map.containsKey(com.anythink.expressad.video.dynview.a.a.f21085G) && (map.get(com.anythink.expressad.video.dynview.a.a.f21085G) instanceof com.anythink.expressad.video.dynview.f.c)) {
                    ((com.anythink.expressad.video.dynview.f.c) map.get(com.anythink.expressad.video.dynview.a.a.f21085G)).a();
                    aVar.b();
                }
            } catch (Exception e9) {
                e9.getMessage();
            }
        }
    }

    public final void a(com.anythink.expressad.video.dynview.c cVar, View view, e eVar) {
        if (eVar == null) {
            return;
        }
        if (cVar == null) {
            eVar.a(com.anythink.expressad.video.dynview.c.b.NOT_FOUND_VIEWOPTION);
            return;
        }
        try {
            ImageView imageView = (ImageView) view.findViewById(a("anythink_iv_adbanner_bg"));
            if (imageView != null) {
                imageView.setBackgroundColor(Color.parseColor(this.i));
            }
            ImageView imageView2 = (ImageView) view.findViewById(a("anythink_iv_adbanner"));
            if (imageView2 != null) {
                imageView2.setBackgroundColor(Color.parseColor(this.i));
            }
            eVar.a(view, new ArrayList());
        } catch (Exception e9) {
            e9.getMessage();
            eVar.a(com.anythink.expressad.video.dynview.c.b.NOT_FOUND_VIEWOPTION);
        }
    }

    private void a(String str, Context context, View view, int i, Map map, d dVar) {
        FrameLayout.LayoutParams layoutParams;
        String a9 = z.a(str, com.anythink.expressad.foundation.g.g.a.b.f19426T);
        z.a(str, com.anythink.expressad.foundation.g.g.a.b.f19427U);
        long parseLong = !TextUtils.isEmpty(a9) ? Long.parseLong(a9) : 0L;
        if (parseLong != 0) {
            if (map != null && map.containsKey("is_dy_success")) {
                f21232k = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            f21232k = false;
            TextView textView = (TextView) view.findViewById(a("anythink_choice_one_countdown_tv"));
            if (textView != null) {
                textView.setTextSize(11.0f);
                textView.setTextColor(Color.parseColor(this.f21237f));
                String str2 = this.f21238g;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(Color.parseColor(str2));
                gradientDrawable.setCornerRadius(v.b(textView.getContext(), 12.0f));
                gradientDrawable.setStroke(v.b(textView.getContext(), 1.0f), Color.parseColor(str2));
                textView.setBackgroundDrawable(gradientDrawable);
                if (i == 2 && (layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams()) != null) {
                    int d2 = v.d(context);
                    int b9 = v.b(context, 10.0f);
                    layoutParams.setMargins(b9, b9, d2, b9);
                }
                textView.setVisibility(0);
                textView.setOnClickListener(new AnonymousClass5(map));
                this.f21241l = new AnonymousClass6(textView, map);
                com.anythink.expressad.video.dynview.i.c.b a10 = new com.anythink.expressad.video.dynview.i.c.b().a(parseLong * 1000).a().a(this.f21241l);
                this.f21234c = a10;
                a10.b();
            }
            ImageView imageView = (ImageView) view.findViewById(a("anythink_iv_link"));
            if (dVar == null) {
                return;
            }
            if (dVar.w() != null) {
                dVar.w().a("");
            }
            if (imageView != null) {
                v.a(imageView, dVar, view.getContext(), true);
            }
        }
    }

    private void a(String str, ImageView imageView) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        a(imageView, str, -1);
    }

    private void a(ImageView imageView, String str, int i) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        com.anythink.expressad.foundation.g.d.b.a(imageView.getContext()).a(str, new AnonymousClass10(i, imageView));
    }

    private void a(final String str, final ImageView imageView, final com.anythink.expressad.video.dynview.c cVar, final View view) {
        com.anythink.expressad.foundation.g.d.b.a(imageView.getContext()).a(str, new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.video.dynview.j.a.2
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str2, String str3) {
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str2) {
                ImageView imageView2;
                if (bitmap == null || bitmap.isRecycled() || (imageView2 = imageView) == null) {
                    return;
                }
                imageView2.setImageBitmap(bitmap);
                if (a.this.f21235d != null) {
                    a.this.f21235d.put(s.a(str), bitmap);
                    a.a(a.this, cVar, view);
                }
            }
        });
        try {
            Bitmap a9 = a();
            if (a9 == null || a9.isRecycled()) {
                return;
            }
            b(cVar, view);
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    private static void a(ListView listView, com.anythink.expressad.video.dynview.c cVar) {
        if (listView == null || cVar == null) {
            return;
        }
        try {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) listView.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.height = -1;
            float c9 = (cVar.c() - v.b(t.b().g(), 720.0f)) / 2.0f;
            int b9 = v.b(t.b().g(), 10.0f);
            int i = (int) c9;
            layoutParams.setMargins(b9, i, b9, i);
            listView.setLayoutParams(layoutParams);
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    private void a(Map map) {
        if (map != null) {
            try {
                if (map.containsKey(com.anythink.expressad.video.dynview.a.a.f21084F) && (map.get(com.anythink.expressad.video.dynview.a.a.f21084F) instanceof com.anythink.expressad.video.dynview.f.d)) {
                    ((com.anythink.expressad.video.dynview.f.d) map.get(com.anythink.expressad.video.dynview.a.a.f21084F)).a();
                    b();
                }
            } catch (Exception e9) {
                e9.getMessage();
            }
        }
    }

    private void a(Map map, List<d> list, int i) {
        if (map == null || list == null || list.size() <= 1) {
            return;
        }
        if (map.containsKey(com.anythink.expressad.video.dynview.a.a.f21084F) && (map.get(com.anythink.expressad.video.dynview.a.a.f21084F) instanceof com.anythink.expressad.video.dynview.f.d)) {
            com.anythink.expressad.video.dynview.f.d dVar = (com.anythink.expressad.video.dynview.f.d) map.get(com.anythink.expressad.video.dynview.a.a.f21084F);
            if (dVar != null) {
                dVar.a(list.get(i));
            }
            b();
            return;
        }
        if (map.containsKey(com.anythink.expressad.video.dynview.a.a.f21085G) && (map.get(com.anythink.expressad.video.dynview.a.a.f21085G) instanceof com.anythink.expressad.video.dynview.f.c)) {
            com.anythink.expressad.video.dynview.f.c cVar = (com.anythink.expressad.video.dynview.f.c) map.get(com.anythink.expressad.video.dynview.a.a.f21085G);
            if (cVar != null) {
                cVar.a(list.get(i), i);
            }
            b();
        }
    }

    private void a(com.anythink.expressad.video.dynview.c cVar, View view) {
        Map<String, Bitmap> map = this.f21235d;
        if (map == null || map.size() <= 1) {
            return;
        }
        new com.anythink.expressad.video.dynview.h.b();
        Map<String, Bitmap> map2 = this.f21235d;
        if (view != null) {
            com.anythink.expressad.video.dynview.i.a.a.a().a(map2, cVar, view);
        }
    }

    private static int a(String str) {
        return k.a(t.b().g(), str, "id");
    }

    private Bitmap a() {
        Bitmap bitmap = null;
        try {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_4444);
            bitmap.eraseColor(Color.parseColor(this.i));
            return bitmap;
        } catch (Exception e9) {
            if (com.anythink.expressad.a.f17618a) {
                e9.printStackTrace();
            }
            return bitmap;
        }
    }

    public static /* synthetic */ void a(a aVar, Map map, List list, int i) {
        if (map == null || list == null || list.size() <= 1) {
            return;
        }
        if (map.containsKey(com.anythink.expressad.video.dynview.a.a.f21084F) && (map.get(com.anythink.expressad.video.dynview.a.a.f21084F) instanceof com.anythink.expressad.video.dynview.f.d)) {
            com.anythink.expressad.video.dynview.f.d dVar = (com.anythink.expressad.video.dynview.f.d) map.get(com.anythink.expressad.video.dynview.a.a.f21084F);
            if (dVar != null) {
                dVar.a((d) list.get(i));
            }
            aVar.b();
            return;
        }
        if (map.containsKey(com.anythink.expressad.video.dynview.a.a.f21085G) && (map.get(com.anythink.expressad.video.dynview.a.a.f21085G) instanceof com.anythink.expressad.video.dynview.f.c)) {
            com.anythink.expressad.video.dynview.f.c cVar = (com.anythink.expressad.video.dynview.f.c) map.get(com.anythink.expressad.video.dynview.a.a.f21085G);
            if (cVar != null) {
                cVar.a((d) list.get(i), i);
            }
            aVar.b();
        }
    }

    public static /* synthetic */ void a(a aVar, Map map) {
        if (map != null) {
            try {
                if (map.containsKey(com.anythink.expressad.video.dynview.a.a.f21084F) && (map.get(com.anythink.expressad.video.dynview.a.a.f21084F) instanceof com.anythink.expressad.video.dynview.f.d)) {
                    ((com.anythink.expressad.video.dynview.f.d) map.get(com.anythink.expressad.video.dynview.a.a.f21084F)).a();
                    aVar.b();
                }
            } catch (Exception e9) {
                e9.getMessage();
            }
        }
    }

    public static /* synthetic */ void a(a aVar, com.anythink.expressad.video.dynview.c cVar, View view) {
        Map<String, Bitmap> map = aVar.f21235d;
        if (map == null || map.size() <= 1) {
            return;
        }
        new com.anythink.expressad.video.dynview.h.b();
        Map<String, Bitmap> map2 = aVar.f21235d;
        if (view != null) {
            com.anythink.expressad.video.dynview.i.a.a.a().a(map2, cVar, view);
        }
    }
}
