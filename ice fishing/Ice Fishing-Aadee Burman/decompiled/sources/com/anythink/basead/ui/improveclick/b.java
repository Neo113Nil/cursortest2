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
    public static final int f11128a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f11129b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f11130c = 3;

    /* renamed from: l, reason: collision with root package name */
    private BaseAmbienceView f11131l;

    /* renamed from: m, reason: collision with root package name */
    private com.anythink.basead.ui.improveclick.ambience.a f11132m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f11133n;

    /* renamed from: o, reason: collision with root package name */
    private int f11134o;

    /* renamed from: p, reason: collision with root package name */
    private int f11135p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f11136q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f11137r;

    private boolean b() {
        int bv = this.f11140f.f14168o.bv();
        if (bv != 2) {
            if (bv != 3 || this.f11142h != 2) {
                return false;
            }
            com.anythink.basead.ui.improveclick.ambience.a aVar = new com.anythink.basead.ui.improveclick.ambience.a();
            this.f11132m = aVar;
            aVar.a(this.f11141g, this.f11134o);
            return true;
        }
        if (this.f11131l == null) {
            BubbleDropAnimView bubbleDropAnimView = new BubbleDropAnimView(this.f11138d);
            this.f11131l = bubbleDropAnimView;
            bubbleDropAnimView.initSetting(this.f11140f, this.f11144k);
            if (this.f11140f.f14168o.bv() == 2) {
                if (this.f11142h != 2) {
                    this.f11141g.addView(this.f11131l, -1, -1);
                } else if (this.f11141g.getParent() != null && (this.f11141g.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) this.f11141g.getParent()).addView(this.f11131l, -1, -1);
                }
            }
        }
        return true;
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a(Context context, w wVar, x xVar, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i, c.a aVar) {
        super.a(context, wVar, xVar, viewGroup, relativeLayout, view, i, aVar);
        this.f11133n = false;
        this.f11134o = 1;
        if (this.f11142h == 3) {
            this.f11134o = this.f11140f.f14168o.C();
        } else {
            this.f11134o = m.f(this.f11138d);
        }
        this.f11135p = 1;
        this.f11136q = false;
        this.f11137r = false;
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a(int i, Map<String, Object> map) {
        boolean z3 = true;
        switch (i) {
            case 110:
                BaseAmbienceView baseAmbienceView = this.f11131l;
                if (baseAmbienceView != null) {
                    baseAmbienceView.onResume();
                    break;
                }
                break;
            case 111:
                BaseAmbienceView baseAmbienceView2 = this.f11131l;
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
                Object obj2 = map.get(g.a.f11172g);
                if (obj != null && (obj instanceof Integer) && obj2 != null && (obj2 instanceof Integer)) {
                    int intValue = ((Integer) obj).intValue();
                    int intValue2 = ((Integer) obj2).intValue();
                    if (intValue != 5 && intValue != 6 && intValue != 7) {
                        int b9 = com.anythink.basead.ui.f.c.b(intValue, intValue2);
                        if (b9 != 0 && b9 != 1) {
                            if (b9 == 2) {
                                this.f11136q = true;
                                break;
                            }
                        } else {
                            this.f11137r = true;
                            break;
                        }
                    }
                }
                break;
            case 114:
                Object obj3 = map.get(g.a.f11170e);
                if (obj3 != null && (obj3 instanceof Integer)) {
                    this.f11135p = ((Integer) obj3).intValue();
                }
                int bv = this.f11140f.f14168o.bv();
                if (bv != 2) {
                    if (bv == 3 && this.f11142h == 2) {
                        com.anythink.basead.ui.improveclick.ambience.a aVar = new com.anythink.basead.ui.improveclick.ambience.a();
                        this.f11132m = aVar;
                        aVar.a(this.f11141g, this.f11134o);
                    } else {
                        z3 = false;
                    }
                } else if (this.f11131l == null) {
                    BubbleDropAnimView bubbleDropAnimView = new BubbleDropAnimView(this.f11138d);
                    this.f11131l = bubbleDropAnimView;
                    bubbleDropAnimView.initSetting(this.f11140f, this.f11144k);
                    if (this.f11140f.f14168o.bv() == 2) {
                        if (this.f11142h == 2) {
                            if (this.f11141g.getParent() != null && (this.f11141g.getParent() instanceof ViewGroup)) {
                                ((ViewGroup) this.f11141g.getParent()).addView(this.f11131l, -1, -1);
                            }
                        } else {
                            this.f11141g.addView(this.f11131l, -1, -1);
                        }
                    }
                }
                this.f11133n = z3;
                break;
        }
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a() {
        if (this.f11133n) {
            x xVar = this.f11140f;
            w wVar = this.f11139e;
            com.anythink.basead.b.e.a(xVar);
            com.anythink.core.common.u.e.a(xVar, wVar, this.f11134o, this.f11135p, this.f11140f.f14168o.bv() == 2 ? 3 : 4, this.f11136q, this.f11137r);
        }
        BaseAmbienceView baseAmbienceView = this.f11131l;
        if (baseAmbienceView != null) {
            baseAmbienceView.release();
            am.a(this.f11131l);
        }
    }
}
