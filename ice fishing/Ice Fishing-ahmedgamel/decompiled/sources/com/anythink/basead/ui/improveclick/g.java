package com.anythink.basead.ui.improveclick;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.q;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f11944a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f11945b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f11946c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f11947d = 4;

    /* renamed from: e, reason: collision with root package name */
    public static final int f11948e = 8;

    /* renamed from: f, reason: collision with root package name */
    public static final int f11949f = 16;

    /* renamed from: g, reason: collision with root package name */
    public static final int f11950g = 32;

    /* renamed from: h, reason: collision with root package name */
    public static final int f11951h = 64;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f11952a = "screen_style";

        /* renamed from: b, reason: collision with root package name */
        public static final String f11953b = "shake_view_extra_container";

        /* renamed from: c, reason: collision with root package name */
        public static final String f11954c = "native_ad_event_listener";

        /* renamed from: d, reason: collision with root package name */
        public static final String f11955d = "video_length";

        /* renamed from: e, reason: collision with root package name */
        public static final String f11956e = "material_direction";

        /* renamed from: f, reason: collision with root package name */
        public static final String f11957f = "click_type";

        /* renamed from: g, reason: collision with root package name */
        public static final String f11958g = "click_area";

        /* renamed from: h, reason: collision with root package name */
        public static final String f11959h = "cta_text";
        public static final String i = "video_play_fail_message";

        /* renamed from: j, reason: collision with root package name */
        public static final String f11960j = "video_reset_player_view_type";

        /* renamed from: k, reason: collision with root package name */
        public static final String f11961k = "video_progress";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static List<c> a(int i, Context context, w wVar, x xVar, ViewGroup viewGroup, int i4, c.a aVar) {
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ArrayList arrayList = new ArrayList();
        RelativeLayout relativeLayout = (RelativeLayout) viewGroup.findViewById(q.a(context, "myoffer_guide2click_container", "id"));
        View findViewById = viewGroup.findViewById(q.a(context, "myoffer_guide2click_mask", "id"));
        View findViewById2 = viewGroup.findViewById(q.a(viewGroup.getContext(), "myoffer_rl_root", "id"));
        if (findViewById2 == null || !(findViewById2 instanceof ViewGroup)) {
            View findViewById3 = viewGroup.findViewById(q.a(viewGroup.getContext(), "myoffer_splash_root", "id"));
            if (findViewById3 == null || !(findViewById3 instanceof ViewGroup)) {
                viewGroup2 = viewGroup;
                if ((i & 16) == 16) {
                    d dVar = new d();
                    dVar.a(viewGroup2.getContext(), wVar, xVar, viewGroup2, relativeLayout, findViewById, i4, aVar);
                    arrayList.add(dVar);
                }
                if ((i & 1) == 1) {
                    j jVar = new j();
                    jVar.a(viewGroup2.getContext(), wVar, xVar, viewGroup2, relativeLayout, findViewById, i4, aVar);
                    arrayList.add(jVar);
                }
                if ((i & 2) == 2) {
                    e eVar = new e();
                    eVar.a(viewGroup2.getContext(), wVar, xVar, viewGroup2, relativeLayout, findViewById, i4, aVar);
                    arrayList.add(eVar);
                }
                if ((i & 4) == 4) {
                    k kVar = new k();
                    kVar.a(viewGroup2.getContext(), wVar, xVar, viewGroup2, relativeLayout, findViewById, i4, aVar);
                    arrayList.add(kVar);
                }
                if (relativeLayout != null && (i & 8) == 8) {
                    f fVar = new f();
                    fVar.a(viewGroup2.getContext(), wVar, xVar, viewGroup2, relativeLayout, findViewById, i4, aVar);
                    arrayList.add(fVar);
                }
                if (relativeLayout != null && (i & 32) == 32) {
                    h hVar = new h();
                    hVar.a(viewGroup2.getContext(), wVar, xVar, viewGroup2, relativeLayout, findViewById, i4, aVar);
                    arrayList.add(hVar);
                }
                if ((i & 64) == 64) {
                    b bVar = new b();
                    bVar.a(viewGroup2.getContext(), wVar, xVar, viewGroup2, relativeLayout, findViewById, i4, aVar);
                    arrayList.add(bVar);
                }
                return arrayList;
            }
            viewGroup3 = (ViewGroup) findViewById3;
        } else {
            viewGroup3 = (ViewGroup) findViewById2;
        }
        viewGroup2 = viewGroup3;
        if ((i & 16) == 16) {
        }
        if ((i & 1) == 1) {
        }
        if ((i & 2) == 2) {
        }
        if ((i & 4) == 4) {
        }
        if (relativeLayout != null) {
            f fVar2 = new f();
            fVar2.a(viewGroup2.getContext(), wVar, xVar, viewGroup2, relativeLayout, findViewById, i4, aVar);
            arrayList.add(fVar2);
        }
        if (relativeLayout != null) {
            h hVar2 = new h();
            hVar2.a(viewGroup2.getContext(), wVar, xVar, viewGroup2, relativeLayout, findViewById, i4, aVar);
            arrayList.add(hVar2);
        }
        if ((i & 64) == 64) {
        }
        return arrayList;
    }
}
