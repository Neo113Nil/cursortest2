package com.anythink.expressad.video.dynview.j;

import android.content.Context;
import android.view.View;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.video.dynview.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22089a = "ViewOptionWrapper";

    /* renamed from: b, reason: collision with root package name */
    private static final String f22090b = "template_";

    public static com.anythink.expressad.video.dynview.c a(Context context, List<d> list) {
        int i;
        int i4;
        if (list == null) {
            return null;
        }
        try {
            float f2 = v.f(t.b().g());
            float e9 = v.e(t.b().g());
            ArrayList arrayList = new ArrayList();
            int i6 = 0;
            if (list.size() <= 0 || list.get(0) == null) {
                i = 1;
                i4 = 0;
            } else {
                d dVar = list.get(0);
                i = (dVar == null || dVar.N() == null) ? 1 : dVar.N().c();
                i4 = list.get(0).au();
                list.get(0).as();
                i6 = list.get(0).k();
            }
            String str = com.anythink.expressad.video.dynview.a.a.f21898j;
            if (i != 1) {
                if (i == 2) {
                    str = com.anythink.expressad.video.dynview.a.a.i;
                } else if (com.anythink.expressad.video.dynview.i.c.a(context)) {
                    str = com.anythink.expressad.video.dynview.a.a.i;
                    i = 2;
                } else {
                    i = 1;
                }
            }
            return new c.a().a(context).a(str).a(1).a(e9).b(f2).a(list).b(i).b(arrayList).e(i6).d(i4).a();
        } catch (Exception e10) {
            e10.getMessage();
            return null;
        }
    }

    public static com.anythink.expressad.video.dynview.c b(View view, d dVar) {
        if (dVar == null) {
            return null;
        }
        try {
            com.anythink.expressad.videocommon.e.d a9 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), dVar.L(), false);
            int h3 = a9 != null ? a9.h() : 0;
            ArrayList arrayList = new ArrayList();
            arrayList.add(dVar);
            return new c.a().a(com.anythink.expressad.video.dynview.a.a.f21897h).a(3).a(arrayList).a(view.getContext()).a(view).c(h3).b(n.c(view.getContext())).a();
        } catch (Exception e9) {
            e9.getMessage();
            return null;
        }
    }

    public static com.anythink.expressad.video.dynview.c b(Context context, List<d> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    float f2 = v.f(t.b().g());
                    float e9 = v.e(t.b().g());
                    ArrayList arrayList = new ArrayList();
                    int k9 = list.get(0).k();
                    int au = list.get(0).au();
                    list.get(0).as();
                    int c9 = n.c(context);
                    return new c.a().a(c9 == 1 ? com.anythink.expressad.video.dynview.a.a.f21899k : com.anythink.expressad.video.dynview.a.a.f21900l).a(5).a(context).a(e9).b(f2).a(list).b(c9).b(arrayList).e(k9).d(au).a();
                }
            } catch (Exception e10) {
                e10.getMessage();
            }
        }
        return null;
    }

    public static com.anythink.expressad.video.dynview.c a(View view, d dVar) {
        int i;
        String str;
        if (dVar == null) {
            return null;
        }
        try {
            String str2 = "";
            ArrayList arrayList = new ArrayList();
            String L2 = dVar.L();
            if (dVar.N() != null) {
                i = dVar.N().b();
                str2 = dVar.N().e();
            } else {
                i = 0;
            }
            int a9 = v.a(str2, "ia_tp", -5);
            String str3 = "anythink_reward_layer_floor";
            if (i == 0 || i == 102 || i == 202) {
                str = "anythink_reward_layer_floor";
            } else {
                str = "anythink_reward_layer_floor_".concat(String.valueOf(i));
            }
            if (k.a(view.getContext(), str, "layout") > 0) {
                str3 = str;
            }
            boolean a10 = com.anythink.expressad.video.dynview.i.c.a(str2);
            String a11 = com.anythink.expressad.video.dynview.i.c.a(str2, com.anythink.expressad.video.dynview.a.a.ao);
            com.anythink.expressad.videocommon.e.d a12 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.c().f(), L2, false);
            int h3 = a12 != null ? a12.h() : 0;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(dVar);
            return new c.a().a(str3).a(2).a(arrayList2).a(view.getContext()).a(view).c(h3).f(a9).b(n.c(view.getContext())).d(i).a(a10).c(a11).b(arrayList).e(dVar.k()).a();
        } catch (Exception e9) {
            e9.getMessage();
            return null;
        }
    }

    public static com.anythink.expressad.video.dynview.c a(Context context, d dVar, int i, String str) {
        String str2;
        String str3;
        String valueOf;
        if (dVar == null) {
            return null;
        }
        try {
            long s9 = dVar.s();
            int c9 = n.c(context);
            int a9 = v.a(dVar.J(), "n_logo", 1);
            if (s9 == 1302) {
                if (c9 == 1) {
                    str3 = "anythink_reward_end_card_layout_portrait_";
                    valueOf = String.valueOf(s9);
                } else {
                    str3 = "anythink_reward_end_card_layout_landscape_";
                    valueOf = String.valueOf(s9);
                }
                str2 = str3.concat(valueOf);
            } else {
                str2 = c9 == 1 ? com.anythink.expressad.video.dynview.a.a.f21891b : com.anythink.expressad.video.dynview.a.a.f21890a;
            }
            return new c.a().a(str2).a(4).a(context).b(n.c(context)).b(new ArrayList()).e(dVar.k()).d(i).b(str).g(a9).a();
        } catch (Exception e9) {
            e9.getMessage();
            return null;
        }
    }
}
