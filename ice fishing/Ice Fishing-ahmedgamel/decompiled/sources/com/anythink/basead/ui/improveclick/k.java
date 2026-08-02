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
    BaseSpecialNoteView f12043a;

    /* renamed from: b, reason: collision with root package name */
    private long f12044b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12045c = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f12046l = false;

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a(Context context, w wVar, x xVar, ViewGroup viewGroup, RelativeLayout relativeLayout, View view, int i, c.a aVar) {
        y yVar;
        super.a(context, wVar, xVar, viewGroup, relativeLayout, view, i, aVar);
        int i4 = this.f11928h;
        if (i4 == 4 || i4 == 5 || i4 == 6) {
            this.f12043a = new SimpleSpecialNoteView(this.f11924d);
        } else {
            this.f12043a = new ScreenSpecialNoteView(this.f11924d);
        }
        x xVar2 = this.f11926f;
        if (xVar2 == null || !String.valueOf(xVar2.f14949j).equals("4") || (yVar = this.f11926f.f14954o) == null) {
            return;
        }
        this.f12044b = yVar.x();
    }

    @Override // com.anythink.basead.ui.improveclick.c
    public final void a(int i, Map<String, Object> map) {
        if (i == 102) {
            this.f12046l = true;
            return;
        }
        if (i == 103) {
            if (!c.a(map) && com.anythink.basead.b.e.a(this.f11925e, this.f11926f)) {
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
                    this.f12045c = true;
                    break;
                case 114:
                    if (com.anythink.basead.b.e.a(this.f11925e, this.f11926f)) {
                        if (this.f11928h != 1) {
                            a(6);
                            return;
                        } else {
                            if (this.f12046l) {
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
        BaseSpecialNoteView baseSpecialNoteView = this.f12043a;
        if (baseSpecialNoteView != null) {
            baseSpecialNoteView.release();
        }
    }

    private void a(int i) {
        long ak;
        long al;
        k kVar;
        int i4;
        if (this.f11925e.c() || this.f12045c || this.f12043a == null) {
            return;
        }
        if (i != 5) {
            if (i != 6) {
                if (i != 7 || !this.f11926f.f14954o.aj()) {
                    return;
                }
                ak = this.f11926f.f14954o.am();
                al = this.f11926f.f14954o.an();
            } else {
                if (!this.f11926f.f14954o.ai()) {
                    return;
                }
                ak = this.f11926f.f14954o.ak();
                al = this.f11926f.f14954o.al();
            }
        } else {
            if (!this.f11926f.f14954o.ah()) {
                return;
            }
            ak = this.f11926f.f14954o.ak();
            al = this.f11926f.f14954o.al();
        }
        long j6 = this.f12044b;
        long j9 = 0;
        if (j6 > 0 && j6 < ak + al + 1000) {
            if (al + 1000 >= j6) {
                al = j6 - 1000;
                kVar = this;
                i4 = i;
                kVar.a(i4, j9, al);
            }
            ak = (j6 - al) - 1000;
        }
        kVar = this;
        i4 = i;
        j9 = ak;
        kVar.a(i4, j9, al);
    }

    private void a(final int i, final long j6, final long j9) {
        if (j6 >= 0 && j9 >= 0) {
            t.b().b(new Runnable() { // from class: com.anythink.basead.ui.improveclick.k.1
                @Override // java.lang.Runnable
                public final void run() {
                    BaseSpecialNoteView baseSpecialNoteView = k.this.f12043a;
                    if (baseSpecialNoteView != null) {
                        if (baseSpecialNoteView.getParent() == null) {
                            k kVar = k.this;
                            kVar.f12043a.initSetting(kVar.f11927g, i, new BaseSpecialNoteView.a() { // from class: com.anythink.basead.ui.improveclick.k.1.1
                                @Override // com.anythink.basead.ui.specialnote.BaseSpecialNoteView.a
                                public final void a(int i4) {
                                    c.a aVar = k.this.f11930k;
                                    if (aVar != null) {
                                        aVar.a(i4, 4);
                                    }
                                }
                            }, j6, j9);
                            k kVar2 = k.this;
                            kVar2.f11927g.addView(kVar2.f12043a);
                            return;
                        }
                        if (i == 7) {
                            k kVar3 = k.this;
                            if (!com.anythink.basead.b.e.a(kVar3.f11925e, kVar3.f11926f) || k.this.f12043a.hasBeenShow()) {
                                return;
                            }
                            k.this.f12043a.pause();
                            k.this.f12043a.reset(i, j6, j9);
                            k.this.f12043a.resume();
                        }
                    }
                }
            });
        }
    }

    private void a(ViewGroup.LayoutParams layoutParams) {
        BaseSpecialNoteView baseSpecialNoteView = this.f12043a;
        if (baseSpecialNoteView != null) {
            baseSpecialNoteView.setLayoutParams(layoutParams);
        }
    }

    public final void a(long j6) {
        x xVar = this.f11926f;
        if (xVar == null || TextUtils.equals(String.valueOf(xVar.f14949j), "4")) {
            return;
        }
        this.f12044b = j6;
    }
}
