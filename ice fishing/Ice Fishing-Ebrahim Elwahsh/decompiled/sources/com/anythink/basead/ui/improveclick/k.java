package com.anythink.basead.ui.improveclick;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.basead.ui.specialnote.BaseSpecialNoteView;
import com.anythink.basead.ui.specialnote.ScreenSpecialNoteView;
import com.anythink.basead.ui.specialnote.SimpleSpecialNoteView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import java.util.Map;

/* loaded from: classes.dex */
public final class k extends c {

    /* renamed from: a, reason: collision with root package name */
    BaseSpecialNoteView f11414a;

    /* renamed from: b, reason: collision with root package name */
    private long f11415b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11416c = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f11417l = false;

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a(Context context, w wVar, x xVar, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i, c.a aVar) {
        y yVar;
        super.a(context, wVar, xVar, viewGroup, relativeLayout, view, i, aVar);
        int i4 = this.f11299h;
        if (i4 == 4 || i4 == 5 || i4 == 6) {
            this.f11414a = new SimpleSpecialNoteView(this.f11295d);
        } else {
            this.f11414a = new ScreenSpecialNoteView(this.f11295d);
        }
        x xVar2 = this.f11297f;
        if (xVar2 == null || !String.valueOf(xVar2.f14320j).equals("4") || (yVar = this.f11297f.f14325o) == null) {
            return;
        }
        this.f11415b = yVar.x();
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a(int i, Map<String, Object> map) {
        if (i == 102) {
            this.f11417l = true;
            return;
        }
        if (i == 103) {
            if (!c.a(map) && com.anythink.basead.b.e.a(this.f11296e, this.f11297f)) {
                a(7);
                return;
            }
            return;
        }
        if (i != 119) {
            switch (i) {
                case 112:
                    break;
                case 113:
                    this.f11416c = true;
                    break;
                case 114:
                    if (com.anythink.basead.b.e.a(this.f11296e, this.f11297f)) {
                        if (this.f11299h != 1) {
                            a(6);
                            return;
                        } else {
                            if (this.f11417l) {
                                return;
                            }
                            a(6);
                            return;
                        }
                    }
                    a(5);
                    return;
                default:
                    return;
            }
            a();
            return;
        }
        a();
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a() {
        BaseSpecialNoteView baseSpecialNoteView = this.f11414a;
        if (baseSpecialNoteView != null) {
            baseSpecialNoteView.release();
        }
    }

    private void a(int i) {
        long ak;
        long al;
        k kVar;
        int i4;
        if (this.f11296e.c() || this.f11416c || this.f11414a == null) {
            return;
        }
        if (i != 5) {
            if (i != 6) {
                if (i != 7 || !this.f11297f.f14325o.aj()) {
                    return;
                }
                ak = this.f11297f.f14325o.am();
                al = this.f11297f.f14325o.an();
            } else {
                if (!this.f11297f.f14325o.ai()) {
                    return;
                }
                ak = this.f11297f.f14325o.ak();
                al = this.f11297f.f14325o.al();
            }
        } else {
            if (!this.f11297f.f14325o.ah()) {
                return;
            }
            ak = this.f11297f.f14325o.ak();
            al = this.f11297f.f14325o.al();
        }
        long j9 = this.f11415b;
        long j10 = 0;
        if (j9 > 0 && j9 < ak + al + 1000) {
            if (al + 1000 >= j9) {
                al = j9 - 1000;
                kVar = this;
                i4 = i;
                kVar.a(i4, j10, al);
            }
            ak = (j9 - al) - 1000;
        }
        kVar = this;
        i4 = i;
        j10 = ak;
        kVar.a(i4, j10, al);
    }

    private void a(final int i, final long j9, final long j10) {
        if (j9 >= 0 && j10 >= 0) {
            t.b().b(new Runnable() { // from class: com.anythink.basead.ui.improveclick.k.1
                @Override // java.lang.Runnable
                public final void run() {
                    BaseSpecialNoteView baseSpecialNoteView = k.this.f11414a;
                    if (baseSpecialNoteView != null) {
                        if (baseSpecialNoteView.getParent() == null) {
                            k kVar = k.this;
                            kVar.f11414a.initSetting(kVar.f11298g, i, new BaseSpecialNoteView.a() { // from class: com.anythink.basead.ui.improveclick.k.1.1
                                @Override // com.anythink.basead.ui.specialnote.BaseSpecialNoteView.a
                                public final void a(int i4) {
                                    c.a aVar = k.this.f11301k;
                                    if (aVar != null) {
                                        aVar.a(i4, 4);
                                    }
                                }
                            }, j9, j10);
                            k kVar2 = k.this;
                            kVar2.f11298g.addView(kVar2.f11414a);
                            return;
                        }
                        if (i == 7) {
                            k kVar3 = k.this;
                            if (!com.anythink.basead.b.e.a(kVar3.f11296e, kVar3.f11297f) || k.this.f11414a.hasBeenShow()) {
                                return;
                            }
                            k.this.f11414a.pause();
                            k.this.f11414a.reset(i, j9, j10);
                            k.this.f11414a.resume();
                        }
                    }
                }
            });
        }
    }

    private void a(ViewGroup.LayoutParams layoutParams) {
        BaseSpecialNoteView baseSpecialNoteView = this.f11414a;
        if (baseSpecialNoteView != null) {
            baseSpecialNoteView.setLayoutParams(layoutParams);
        }
    }

    public final void a(long j9) {
        x xVar = this.f11297f;
        if (xVar == null || TextUtils.equals(String.valueOf(xVar.f14320j), "4")) {
            return;
        }
        this.f11415b = j9;
    }
}
