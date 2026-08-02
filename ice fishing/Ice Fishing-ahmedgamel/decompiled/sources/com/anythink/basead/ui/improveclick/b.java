package com.anythink.basead.ui.improveclick;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.ui.improveclick.ambience.BaseAmbienceView;
import com.anythink.basead.ui.improveclick.ambience.BubbleDropAnimView;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.basead.ui.improveclick.g;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.m;
import java.util.Map;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f11914a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f11915b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f11916c = 3;

    /* renamed from: l, reason: collision with root package name */
    private BaseAmbienceView f11917l;

    /* renamed from: m, reason: collision with root package name */
    private com.anythink.basead.ui.improveclick.ambience.a f11918m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f11919n;

    /* renamed from: o, reason: collision with root package name */
    private int f11920o;

    /* renamed from: p, reason: collision with root package name */
    private int f11921p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f11922q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f11923r;

    private boolean b() {
        int bv = this.f11926f.f14954o.bv();
        if (bv != 2) {
            if (bv != 3 || this.f11928h != 2) {
                return false;
            }
            com.anythink.basead.ui.improveclick.ambience.a aVar = new com.anythink.basead.ui.improveclick.ambience.a();
            this.f11918m = aVar;
            aVar.a(this.f11927g, this.f11920o);
            return true;
        }
        if (this.f11917l == null) {
            BubbleDropAnimView bubbleDropAnimView = new BubbleDropAnimView(this.f11924d);
            this.f11917l = bubbleDropAnimView;
            bubbleDropAnimView.initSetting(this.f11926f, this.f11930k);
            if (this.f11926f.f14954o.bv() == 2) {
                if (this.f11928h != 2) {
                    this.f11927g.addView(this.f11917l, -1, -1);
                } else if (this.f11927g.getParent() != null && (this.f11927g.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) this.f11927g.getParent()).addView(this.f11917l, -1, -1);
                }
            }
        }
        return true;
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a(Context context, w wVar, x xVar, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i, c.a aVar) {
        super.a(context, wVar, xVar, viewGroup, relativeLayout, view, i, aVar);
        this.f11919n = false;
        this.f11920o = 1;
        if (this.f11928h == 3) {
            this.f11920o = this.f11926f.f14954o.C();
        } else {
            this.f11920o = m.f(this.f11924d);
        }
        this.f11921p = 1;
        this.f11922q = false;
        this.f11923r = false;
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a(int i, Map<String, Object> map) {
        boolean z6 = true;
        switch (i) {
            case 110:
                BaseAmbienceView baseAmbienceView = this.f11917l;
                if (baseAmbienceView != null) {
                    baseAmbienceView.onResume();
                    break;
                }
                break;
            case 111:
                BaseAmbienceView baseAmbienceView2 = this.f11917l;
                if (baseAmbienceView2 != null) {
                    baseAmbienceView2.onPause();
                    break;
                }
                break;
            case 112:
            case 115:
                a();
                break;
            case 113:
                Object obj = map.get("click_type");
                Object obj2 = map.get(g.a.f11958g);
                if (obj != null && (obj instanceof Integer) && obj2 != null && (obj2 instanceof Integer)) {
                    int intValue = ((Integer) obj).intValue();
                    int intValue2 = ((Integer) obj2).intValue();
                    if (intValue != 5 && intValue != 6 && intValue != 7) {
                        int b9 = com.anythink.basead.ui.f.c.b(intValue, intValue2);
                        if (b9 != 0 && b9 != 1) {
                            if (b9 == 2) {
                                this.f11922q = true;
                                break;
                            }
                        } else {
                            this.f11923r = true;
                            break;
                        }
                    }
                }
                break;
            case 114:
                Object obj3 = map.get(g.a.f11956e);
                if (obj3 != null && (obj3 instanceof Integer)) {
                    this.f11921p = ((Integer) obj3).intValue();
                }
                int bv = this.f11926f.f14954o.bv();
                if (bv != 2) {
                    if (bv == 3 && this.f11928h == 2) {
                        com.anythink.basead.ui.improveclick.ambience.a aVar = new com.anythink.basead.ui.improveclick.ambience.a();
                        this.f11918m = aVar;
                        aVar.a(this.f11927g, this.f11920o);
                    } else {
                        z6 = false;
                    }
                } else if (this.f11917l == null) {
                    BubbleDropAnimView bubbleDropAnimView = new BubbleDropAnimView(this.f11924d);
                    this.f11917l = bubbleDropAnimView;
                    bubbleDropAnimView.initSetting(this.f11926f, this.f11930k);
                    if (this.f11926f.f14954o.bv() == 2) {
                        if (this.f11928h == 2) {
                            if (this.f11927g.getParent() != null && (this.f11927g.getParent() instanceof ViewGroup)) {
                                ((ViewGroup) this.f11927g.getParent()).addView(this.f11917l, -1, -1);
                            }
                        } else {
                            this.f11927g.addView(this.f11917l, -1, -1);
                        }
                    }
                }
                this.f11919n = z6;
                break;
        }
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a() {
        if (this.f11919n) {
            x xVar = this.f11926f;
            w wVar = this.f11925e;
            com.anythink.basead.b.e.a(xVar);
            com.anythink.core.common.u.e.a(xVar, wVar, this.f11920o, this.f11921p, this.f11926f.f14954o.bv() == 2 ? 3 : 4, this.f11922q, this.f11923r);
        }
        BaseAmbienceView baseAmbienceView = this.f11917l;
        if (baseAmbienceView != null) {
            baseAmbienceView.release();
            am.a(this.f11917l);
        }
    }
}
