package com.anythink.basead.ui.improveclick;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.basead.ui.improveclick.d;
import com.anythink.basead.ui.specialnote.BaseSpecialNoteView;
import com.anythink.core.common.a.b;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.o;
import com.anythink.core.common.v.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    protected static final String f11097b = "key_has_endcard_improve";

    /* renamed from: c, reason: collision with root package name */
    ViewGroup f11099c;

    /* renamed from: d, reason: collision with root package name */
    w f11100d;

    /* renamed from: e, reason: collision with root package name */
    x f11101e;

    /* renamed from: f, reason: collision with root package name */
    private int f11102f;

    /* renamed from: g, reason: collision with root package name */
    private List<c> f11103g;
    private boolean i;

    /* renamed from: a, reason: collision with root package name */
    private final String f11098a = getClass().getSimpleName();

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Object> f11104h = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:151:0x00bd, code lost:
    
        if (r14.f14168o.bw() == 2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x00c7, code lost:
    
        if (r14.f14168o.bx() == 2) goto L54;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(ViewGroup viewGroup, w wVar, x xVar, int i, c.a aVar) {
        int i6;
        int i9;
        int i10;
        w wVar2;
        int i11;
        int i12;
        x xVar2;
        int i13;
        ViewGroup viewGroup2;
        int i14;
        int i15;
        ArrayList arrayList;
        RelativeLayout relativeLayout;
        int i16;
        View view;
        int i17;
        int i18 = 0;
        this.i = false;
        this.f11099c = viewGroup;
        this.f11100d = wVar;
        this.f11101e = xVar;
        this.f11102f = i;
        if (this.f11100d.c()) {
            i6 = 64;
        } else {
            int i19 = this.f11102f;
            if (i19 != 100) {
                switch (i19) {
                    case 1:
                    case 2:
                        if (c(i19)) {
                            i9 = 16;
                            y yVar = this.f11101e.f14168o;
                            i9 = (!yVar.ah() || yVar.ai() || yVar.aj()) ? i9 | 4 : i9;
                            i10 = this.f11102f;
                            if ((i10 != 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) && com.anythink.basead.b.e.a(this.f11101e)) {
                                wVar2 = this.f11100d;
                                x xVar3 = this.f11101e;
                                if (wVar2 == null && xVar3 != null) {
                                    String valueOf = String.valueOf(xVar3.f14163j);
                                    valueOf.getClass();
                                    i6 = 64;
                                    if (valueOf.equals("4") && (wVar2 instanceof bj)) {
                                        boolean z3 = 1 == ((bj) wVar2).aJ();
                                        if (xVar3.f14168o.C() == 1) {
                                            if (!z3) {
                                                break;
                                            }
                                            if (z3) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    i6 = 64;
                                }
                                i9 |= 1;
                            } else {
                                i6 = 64;
                            }
                            i11 = this.f11102f;
                            if ((i11 != 1 || i11 == 3) && this.f11101e.f14168o.s() == 1 && com.anythink.core.common.v.g.a().b(b.d.i)) {
                                i9 |= 2;
                            }
                            i9 = this.f11101e.f14168o.au() == 1 ? i9 | 8 : i9;
                            x xVar4 = this.f11101e;
                            i12 = xVar4.f14163j;
                            if (i12 == 1) {
                                boolean z6 = i12 == 1 && (xVar4.f14168o.au() != 1 || TextUtils.isEmpty(this.f11101e.f14168o.aw())) && this.f11101e.f14168o.br() != 1;
                                if (z6 && this.f11101e.f14168o.br() == 2) {
                                    z6 = q.b() ? com.anythink.core.common.v.g.a().b(b.d.f12129o) : com.anythink.core.common.v.g.a().b(b.d.f12128n);
                                }
                                if (z6) {
                                    i9 |= 32;
                                }
                            }
                            if (!(this.f11101e.f14168o.bv() == 1 && ((i13 = (xVar2 = this.f11101e).f14163j) == 3 ? !(xVar2.f14168o.bv() != 2 ? !(this.f11101e.f14168o.bv() == 3 && this.f11102f == 2 && this.f11101e.f14168o.at() != 1) : com.anythink.basead.b.e.a(this.f11101e) || ((TextUtils.isEmpty(this.f11100d.H()) && TextUtils.isEmpty(this.f11100d.G())) || !com.anythink.core.common.v.g.a().b(b.d.f12117b))) : !(i13 != 4 || xVar2.f14168o.bv() != 2 || com.anythink.basead.b.e.a(this.f11101e) || ((TextUtils.isEmpty(this.f11100d.H()) && TextUtils.isEmpty(this.f11100d.G())) || !com.anythink.core.common.v.g.a().b(b.d.f12117b)))))) {
                                i18 = i9 | 64;
                                break;
                            } else {
                                i18 = i9;
                                break;
                            }
                        }
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        i9 = 0;
                        y yVar2 = this.f11101e.f14168o;
                        if (yVar2.ah()) {
                            break;
                        }
                        i10 = this.f11102f;
                        if (i10 != 1) {
                        }
                        wVar2 = this.f11100d;
                        x xVar32 = this.f11101e;
                        if (wVar2 == null) {
                        }
                        i6 = 64;
                        i9 |= 1;
                        i11 = this.f11102f;
                        if (i11 != 1) {
                        }
                        i9 |= 2;
                        if (this.f11101e.f14168o.au() == 1) {
                        }
                        x xVar42 = this.f11101e;
                        i12 = xVar42.f14163j;
                        if (i12 == 1) {
                        }
                        if (this.f11101e.f14168o.bv() == 1) {
                            break;
                        }
                        if (!(this.f11101e.f14168o.bv() == 1 && ((i13 = (xVar2 = this.f11101e).f14163j) == 3 ? !(xVar2.f14168o.bv() != 2 ? !(this.f11101e.f14168o.bv() == 3 && this.f11102f == 2 && this.f11101e.f14168o.at() != 1) : com.anythink.basead.b.e.a(this.f11101e) || ((TextUtils.isEmpty(this.f11100d.H()) && TextUtils.isEmpty(this.f11100d.G())) || !com.anythink.core.common.v.g.a().b(b.d.f12117b))) : !(i13 != 4 || xVar2.f14168o.bv() != 2 || com.anythink.basead.b.e.a(this.f11101e) || ((TextUtils.isEmpty(this.f11100d.H()) && TextUtils.isEmpty(this.f11100d.G())) || !com.anythink.core.common.v.g.a().b(b.d.f12117b)))))) {
                        }
                        break;
                    default:
                        i6 = 64;
                        i18 = 0;
                        break;
                }
            } else {
                i6 = 64;
                if (com.anythink.basead.b.e.a(this.f11101e)) {
                    i18 = 1;
                }
                i18 = 0;
            }
        }
        Context context = this.f11099c.getContext();
        int i20 = this.f11102f;
        ArrayList arrayList2 = new ArrayList();
        RelativeLayout relativeLayout2 = (RelativeLayout) viewGroup.findViewById(q.a(context, "myoffer_guide2click_container", "id"));
        View findViewById = viewGroup.findViewById(q.a(context, "myoffer_guide2click_mask", "id"));
        View findViewById2 = viewGroup.findViewById(q.a(viewGroup.getContext(), "myoffer_rl_root", "id"));
        if (findViewById2 == null || !(findViewById2 instanceof ViewGroup)) {
            View findViewById3 = viewGroup.findViewById(q.a(viewGroup.getContext(), "myoffer_splash_root", "id"));
            viewGroup2 = (findViewById3 == null || !(findViewById3 instanceof ViewGroup)) ? viewGroup : (ViewGroup) findViewById3;
        } else {
            viewGroup2 = (ViewGroup) findViewById2;
        }
        if ((i18 & 16) == 16) {
            d dVar = new d();
            i14 = 32;
            i15 = 8;
            arrayList = arrayList2;
            relativeLayout = relativeLayout2;
            i16 = 1;
            view = findViewById;
            i17 = 2;
            dVar.a(viewGroup2.getContext(), wVar, xVar, viewGroup2, relativeLayout, view, i20, aVar);
            arrayList.add(dVar);
        } else {
            i14 = 32;
            i15 = 8;
            arrayList = arrayList2;
            relativeLayout = relativeLayout2;
            i16 = 1;
            view = findViewById;
            i17 = 2;
        }
        if ((i18 & 1) == i16) {
            j jVar = new j();
            jVar.a(viewGroup2.getContext(), wVar, xVar, viewGroup2, relativeLayout, view, i20, aVar);
            arrayList.add(jVar);
        }
        if ((i18 & 2) == i17) {
            e eVar = new e();
            eVar.a(viewGroup2.getContext(), wVar, xVar, viewGroup2, relativeLayout, view, i20, aVar);
            arrayList.add(eVar);
        }
        if ((i18 & 4) == 4) {
            k kVar = new k();
            kVar.a(viewGroup2.getContext(), wVar, xVar, viewGroup2, relativeLayout, view, i20, aVar);
            arrayList.add(kVar);
        }
        if (relativeLayout != null && (i18 & 8) == i15) {
            f fVar = new f();
            fVar.a(viewGroup2.getContext(), wVar, xVar, viewGroup2, relativeLayout, view, i20, aVar);
            arrayList.add(fVar);
        }
        if (relativeLayout != null && (i18 & 32) == i14) {
            h hVar = new h();
            hVar.a(viewGroup2.getContext(), wVar, xVar, viewGroup2, relativeLayout, view, i20, aVar);
            arrayList.add(hVar);
        }
        if ((i18 & 64) == i6) {
            b bVar = new b();
            bVar.a(viewGroup2.getContext(), wVar, xVar, viewGroup2, relativeLayout, view, i20, aVar);
            arrayList.add(bVar);
        }
        this.f11103g = arrayList;
        this.i = c(this.f11102f);
        final k c9 = c();
        if (c9 != null) {
            viewGroup.post(new Runnable() { // from class: com.anythink.basead.ui.improveclick.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    BaseSpecialNoteView baseSpecialNoteView;
                    ViewGroup.LayoutParams a9 = a.this.a();
                    if (c9 == null || a.this.a() == null || (baseSpecialNoteView = c9.f11257a) == null) {
                        return;
                    }
                    baseSpecialNoteView.setLayoutParams(a9);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i) {
        List<c> list = this.f11103g;
        if (list == null || list.size() <= 0) {
            return;
        }
        com.anythink.core.common.v.b.b.a();
        if (!com.anythink.core.common.v.b.b.b()) {
            t.b().b(new Runnable() { // from class: com.anythink.basead.ui.improveclick.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.b(i);
                }
            });
            return;
        }
        HashMap hashMap = new HashMap();
        Map<String, Object> map = this.f11104h;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put(f11097b, Boolean.valueOf(this.i));
        Iterator<c> it = this.f11103g.iterator();
        while (it.hasNext()) {
            it.next().a(i, hashMap);
        }
    }

    private k c() {
        List<c> list = this.f11103g;
        if (list == null || list.size() <= 0) {
            return null;
        }
        for (c cVar : this.f11103g) {
            if (cVar instanceof k) {
                return (k) cVar;
            }
        }
        return null;
    }

    private d d() {
        List<c> list = this.f11103g;
        if (list == null || list.size() <= 0) {
            return null;
        }
        for (c cVar : this.f11103g) {
            if (cVar instanceof d) {
                return (d) cVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0089, code lost:
    
        if (r7.f14168o.bw() == 2) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0093, code lost:
    
        if (r7.f14168o.bx() == 2) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int e() {
        int i;
        y yVar;
        int i6;
        w wVar;
        x xVar;
        String valueOf;
        int i9;
        int i10;
        x xVar2;
        int i11;
        boolean z3 = true;
        if (this.f11100d.c()) {
            return 0;
        }
        int i12 = this.f11102f;
        if (i12 != 100) {
            switch (i12) {
                case 1:
                case 2:
                    if (c(i12)) {
                        i = 16;
                        yVar = this.f11101e.f14168o;
                        if (!yVar.ah() || yVar.ai() || yVar.aj()) {
                            i |= 4;
                        }
                        i6 = this.f11102f;
                        if ((i6 != 1 || i6 == 2 || i6 == 3 || i6 == 5 || i6 == 6) && com.anythink.basead.b.e.a(this.f11101e)) {
                            wVar = this.f11100d;
                            xVar = this.f11101e;
                            if (wVar != null && xVar != null) {
                                valueOf = String.valueOf(xVar.f14163j);
                                valueOf.getClass();
                                if (valueOf.equals("4") && (wVar instanceof bj)) {
                                    boolean z6 = 1 != ((bj) wVar).aJ();
                                    if (xVar.f14168o.C() == 1) {
                                        if (!z6) {
                                            break;
                                        }
                                        if (z6) {
                                            break;
                                        }
                                    }
                                }
                            }
                            i |= 1;
                        }
                        i9 = this.f11102f;
                        if ((i9 != 1 || i9 == 3) && this.f11101e.f14168o.s() == 1 && com.anythink.core.common.v.g.a().b(b.d.i)) {
                            i |= 2;
                        }
                        if (this.f11101e.f14168o.au() == 1) {
                            i |= 8;
                        }
                        x xVar3 = this.f11101e;
                        i10 = xVar3.f14163j;
                        if (i10 == 1) {
                            boolean z9 = i10 == 1 && (xVar3.f14168o.au() != 1 || TextUtils.isEmpty(this.f11101e.f14168o.aw())) && this.f11101e.f14168o.br() != 1;
                            if (z9 && this.f11101e.f14168o.br() == 2) {
                                z9 = q.b() ? com.anythink.core.common.v.g.a().b(b.d.f12129o) : com.anythink.core.common.v.g.a().b(b.d.f12128n);
                            }
                            if (z9) {
                                i |= 32;
                            }
                        }
                        if (this.f11101e.f14168o.bv() != 1 || ((i11 = (xVar2 = this.f11101e).f14163j) == 3 ? xVar2.f14168o.bv() != 2 ? this.f11101e.f14168o.bv() != 3 || this.f11102f != 2 || this.f11101e.f14168o.at() == 1 : com.anythink.basead.b.e.a(this.f11101e) || ((TextUtils.isEmpty(this.f11100d.H()) && TextUtils.isEmpty(this.f11100d.G())) || !com.anythink.core.common.v.g.a().b(b.d.f12117b)) : i11 != 4 || xVar2.f14168o.bv() != 2 || com.anythink.basead.b.e.a(this.f11101e) || ((TextUtils.isEmpty(this.f11100d.H()) && TextUtils.isEmpty(this.f11100d.G())) || !com.anythink.core.common.v.g.a().b(b.d.f12117b)))) {
                            z3 = false;
                        }
                        return !z3 ? i | 64 : i;
                    }
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    i = 0;
                    yVar = this.f11101e.f14168o;
                    if (!yVar.ah()) {
                        break;
                    }
                    i |= 4;
                    i6 = this.f11102f;
                    if (i6 != 1) {
                    }
                    wVar = this.f11100d;
                    xVar = this.f11101e;
                    if (wVar != null) {
                        valueOf = String.valueOf(xVar.f14163j);
                        valueOf.getClass();
                        if (valueOf.equals("4")) {
                            if (1 != ((bj) wVar).aJ()) {
                            }
                            if (xVar.f14168o.C() == 1) {
                            }
                            break;
                        }
                    }
                    i |= 1;
                    i9 = this.f11102f;
                    if (i9 != 1) {
                    }
                    i |= 2;
                    if (this.f11101e.f14168o.au() == 1) {
                    }
                    x xVar32 = this.f11101e;
                    i10 = xVar32.f14163j;
                    if (i10 == 1) {
                    }
                    if (this.f11101e.f14168o.bv() != 1) {
                        break;
                    }
                    z3 = false;
                    if (!z3) {
                    }
                    break;
            }
        } else if (com.anythink.basead.b.e.a(this.f11101e)) {
            return 1;
        }
        return 0;
    }

    private boolean f() {
        y yVar = this.f11101e.f14168o;
        return yVar.ah() || yVar.ai() || yVar.aj();
    }

    private boolean g() {
        return this.f11101e.f14168o.s() == 1 && com.anythink.core.common.v.g.a().b(b.d.i);
    }

    private boolean h() {
        if (com.anythink.basead.b.e.a(this.f11101e)) {
            w wVar = this.f11100d;
            x xVar = this.f11101e;
            if (wVar != null && xVar != null) {
                String valueOf = String.valueOf(xVar.f14163j);
                valueOf.getClass();
                if (valueOf.equals("4") && (wVar instanceof bj)) {
                    boolean z3 = 1 == ((bj) wVar).aJ();
                    if (xVar.f14168o.C() != 1 || ((z3 || xVar.f14168o.bw() != 2) && (!z3 || xVar.f14168o.bx() != 2))) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    private boolean i() {
        return this.f11101e.f14168o.au() == 1;
    }

    private boolean j() {
        x xVar = this.f11101e;
        boolean z3 = xVar.f14163j == 1 && (xVar.f14168o.au() != 1 || TextUtils.isEmpty(this.f11101e.f14168o.aw())) && this.f11101e.f14168o.br() != 1;
        return (z3 && this.f11101e.f14168o.br() == 2) ? q.b() ? com.anythink.core.common.v.g.a().b(b.d.f12129o) : com.anythink.core.common.v.g.a().b(b.d.f12128n) : z3;
    }

    private boolean k() {
        if (this.f11101e.f14168o.bv() != 1) {
            x xVar = this.f11101e;
            int i = xVar.f14163j;
            if (i != 3) {
                if (i == 4 && xVar.f14168o.bv() == 2 && !com.anythink.basead.b.e.a(this.f11101e)) {
                    return !(TextUtils.isEmpty(this.f11100d.H()) && TextUtils.isEmpty(this.f11100d.G())) && com.anythink.core.common.v.g.a().b(b.d.f12117b);
                }
                return false;
            }
            if (xVar.f14168o.bv() == 2) {
                if (com.anythink.basead.b.e.a(this.f11101e)) {
                    return false;
                }
                return !(TextUtils.isEmpty(this.f11100d.H()) && TextUtils.isEmpty(this.f11100d.G())) && com.anythink.core.common.v.g.a().b(b.d.f12117b);
            }
            if (this.f11101e.f14168o.bv() == 3 && this.f11102f == 2 && this.f11101e.f14168o.at() != 1) {
                return true;
            }
        }
        return false;
    }

    public abstract ViewGroup.LayoutParams a();

    public final void a(long j6) {
        k c9 = c();
        if (c9 != null) {
            c9.a(j6);
        }
    }

    public final void a(int i) {
        if ((i == 103 || i == 118) && !this.i && !com.anythink.basead.b.e.e(this.f11100d, this.f11101e)) {
            com.anythink.core.common.u.e.a(this.f11100d, this.f11101e, com.anythink.basead.b.e.a(this.f11101e, this.f11099c.getContext()));
        }
        b(i);
    }

    private boolean c(int i) {
        if (i == 2) {
            return this.f11101e.f14168o.aQ() == 5;
        }
        if (i != 1) {
            return false;
        }
        int aQ = this.f11101e.f14168o.aQ();
        if (aQ != 2 && aQ != 3 && aQ != 4) {
            return aQ == 5;
        }
        boolean e9 = com.anythink.basead.b.e.e(this.f11100d, this.f11101e);
        boolean z3 = !e9;
        if (this.f11101e.f14168o.aQ() == 4 && !e9) {
            if (TextUtils.isEmpty(this.f11101e.f14168o.bb())) {
                z3 = false;
            } else {
                z3 = com.anythink.core.common.res.d.a(this.f11099c.getContext()).b(3, o.a(this.f11101e.f14168o.bb()));
                this.f11101e.f14168o.bb();
            }
        }
        if (z3) {
            if (this.f11101e.f14168o.aQ() == 3) {
                z3 = com.anythink.core.common.v.g.a().b(b.d.f12116a);
            }
            if (this.f11101e.f14168o.aQ() == 2) {
                z3 = com.anythink.core.common.v.g.a().b(b.d.i);
            }
            if (this.f11101e.f14168o.aQ() == 4) {
                z3 = com.anythink.core.common.v.g.a().b(b.d.f12130p);
            }
        }
        if (z3 && TextUtils.equals(String.valueOf(this.f11101e.f14163j), "1") && TextUtils.isEmpty(this.f11100d.E())) {
            if (this.f11101e.f14168o.ap() == 1) {
                z3 = false;
            }
            if (this.f11101e.f14168o.aq() == 1) {
                return false;
            }
        }
        return z3;
    }

    public final void a(Map<String, Object> map) {
        if (map != null) {
            this.f11104h.putAll(map);
        }
    }

    public final void a(d.a aVar) {
        d dVar;
        com.anythink.basead.ui.c.a aVar2;
        List<c> list = this.f11103g;
        if (list != null && list.size() > 0) {
            for (c cVar : this.f11103g) {
                if (cVar instanceof d) {
                    dVar = (d) cVar;
                    break;
                }
            }
        }
        dVar = null;
        if (dVar == null || (aVar2 = dVar.f11149m) == null) {
            return;
        }
        aVar2.a(aVar);
    }

    public final Map<String, Object> b() {
        return this.f11104h;
    }
}
