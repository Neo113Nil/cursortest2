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
    protected static final String f11883b = "key_has_endcard_improve";

    /* renamed from: c, reason: collision with root package name */
    ViewGroup f11885c;

    /* renamed from: d, reason: collision with root package name */
    w f11886d;

    /* renamed from: e, reason: collision with root package name */
    x f11887e;

    /* renamed from: f, reason: collision with root package name */
    private int f11888f;

    /* renamed from: g, reason: collision with root package name */
    private List<c> f11889g;
    private boolean i;

    /* renamed from: a, reason: collision with root package name */
    private final String f11884a = getClass().getSimpleName();

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Object> f11890h = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:151:0x00bd, code lost:
    
        if (r14.f14954o.bw() == 2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x00c7, code lost:
    
        if (r14.f14954o.bx() == 2) goto L54;
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
        int i4;
        int i6;
        int i9;
        w wVar2;
        int i10;
        int i11;
        x xVar2;
        int i12;
        ViewGroup viewGroup2;
        int i13;
        int i14;
        ArrayList arrayList;
        RelativeLayout relativeLayout;
        int i15;
        View view;
        int i16;
        int i17 = 0;
        this.i = false;
        this.f11885c = viewGroup;
        this.f11886d = wVar;
        this.f11887e = xVar;
        this.f11888f = i;
        if (this.f11886d.c()) {
            i4 = 64;
        } else {
            int i18 = this.f11888f;
            if (i18 != 100) {
                switch (i18) {
                    case 1:
                    case 2:
                        if (c(i18)) {
                            i6 = 16;
                            y yVar = this.f11887e.f14954o;
                            i6 = (!yVar.ah() || yVar.ai() || yVar.aj()) ? i6 | 4 : i6;
                            i9 = this.f11888f;
                            if ((i9 != 1 || i9 == 2 || i9 == 3 || i9 == 5 || i9 == 6) && com.anythink.basead.b.e.a(this.f11887e)) {
                                wVar2 = this.f11886d;
                                x xVar3 = this.f11887e;
                                if (wVar2 == null && xVar3 != null) {
                                    String valueOf = String.valueOf(xVar3.f14949j);
                                    valueOf.getClass();
                                    i4 = 64;
                                    if (valueOf.equals("4") && (wVar2 instanceof bj)) {
                                        boolean z6 = 1 == ((bj) wVar2).aJ();
                                        if (xVar3.f14954o.C() == 1) {
                                            if (!z6) {
                                                break;
                                            }
                                            if (z6) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    i4 = 64;
                                }
                                i6 |= 1;
                            } else {
                                i4 = 64;
                            }
                            i10 = this.f11888f;
                            if ((i10 != 1 || i10 == 3) && this.f11887e.f14954o.s() == 1 && com.anythink.core.common.v.g.a().b(b.d.i)) {
                                i6 |= 2;
                            }
                            i6 = this.f11887e.f14954o.au() == 1 ? i6 | 8 : i6;
                            x xVar4 = this.f11887e;
                            i11 = xVar4.f14949j;
                            if (i11 == 1) {
                                boolean z9 = i11 == 1 && (xVar4.f14954o.au() != 1 || TextUtils.isEmpty(this.f11887e.f14954o.aw())) && this.f11887e.f14954o.br() != 1;
                                if (z9 && this.f11887e.f14954o.br() == 2) {
                                    z9 = q.b() ? com.anythink.core.common.v.g.a().b(b.d.f12915o) : com.anythink.core.common.v.g.a().b(b.d.f12914n);
                                }
                                if (z9) {
                                    i6 |= 32;
                                }
                            }
                            if (!(this.f11887e.f14954o.bv() == 1 && ((i12 = (xVar2 = this.f11887e).f14949j) == 3 ? !(xVar2.f14954o.bv() != 2 ? !(this.f11887e.f14954o.bv() == 3 && this.f11888f == 2 && this.f11887e.f14954o.at() != 1) : com.anythink.basead.b.e.a(this.f11887e) || ((TextUtils.isEmpty(this.f11886d.H()) && TextUtils.isEmpty(this.f11886d.G())) || !com.anythink.core.common.v.g.a().b(b.d.f12903b))) : !(i12 != 4 || xVar2.f14954o.bv() != 2 || com.anythink.basead.b.e.a(this.f11887e) || ((TextUtils.isEmpty(this.f11886d.H()) && TextUtils.isEmpty(this.f11886d.G())) || !com.anythink.core.common.v.g.a().b(b.d.f12903b)))))) {
                                i17 = i6 | 64;
                                break;
                            } else {
                                i17 = i6;
                                break;
                            }
                        }
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        i6 = 0;
                        y yVar2 = this.f11887e.f14954o;
                        if (yVar2.ah()) {
                            break;
                        }
                        i9 = this.f11888f;
                        if (i9 != 1) {
                        }
                        wVar2 = this.f11886d;
                        x xVar32 = this.f11887e;
                        if (wVar2 == null) {
                        }
                        i4 = 64;
                        i6 |= 1;
                        i10 = this.f11888f;
                        if (i10 != 1) {
                        }
                        i6 |= 2;
                        if (this.f11887e.f14954o.au() == 1) {
                        }
                        x xVar42 = this.f11887e;
                        i11 = xVar42.f14949j;
                        if (i11 == 1) {
                        }
                        if (this.f11887e.f14954o.bv() == 1) {
                            break;
                        }
                        if (!(this.f11887e.f14954o.bv() == 1 && ((i12 = (xVar2 = this.f11887e).f14949j) == 3 ? !(xVar2.f14954o.bv() != 2 ? !(this.f11887e.f14954o.bv() == 3 && this.f11888f == 2 && this.f11887e.f14954o.at() != 1) : com.anythink.basead.b.e.a(this.f11887e) || ((TextUtils.isEmpty(this.f11886d.H()) && TextUtils.isEmpty(this.f11886d.G())) || !com.anythink.core.common.v.g.a().b(b.d.f12903b))) : !(i12 != 4 || xVar2.f14954o.bv() != 2 || com.anythink.basead.b.e.a(this.f11887e) || ((TextUtils.isEmpty(this.f11886d.H()) && TextUtils.isEmpty(this.f11886d.G())) || !com.anythink.core.common.v.g.a().b(b.d.f12903b)))))) {
                        }
                        break;
                    default:
                        i4 = 64;
                        i17 = 0;
                        break;
                }
            } else {
                i4 = 64;
                if (com.anythink.basead.b.e.a(this.f11887e)) {
                    i17 = 1;
                }
                i17 = 0;
            }
        }
        Context context = this.f11885c.getContext();
        int i19 = this.f11888f;
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
        if ((i17 & 16) == 16) {
            d dVar = new d();
            i13 = 32;
            i14 = 8;
            arrayList = arrayList2;
            relativeLayout = relativeLayout2;
            i15 = 1;
            view = findViewById;
            i16 = 2;
            dVar.a(viewGroup2.getContext(), wVar, xVar, viewGroup2, relativeLayout, view, i19, aVar);
            arrayList.add(dVar);
        } else {
            i13 = 32;
            i14 = 8;
            arrayList = arrayList2;
            relativeLayout = relativeLayout2;
            i15 = 1;
            view = findViewById;
            i16 = 2;
        }
        if ((i17 & 1) == i15) {
            j jVar = new j();
            jVar.a(viewGroup2.getContext(), wVar, xVar, viewGroup2, relativeLayout, view, i19, aVar);
            arrayList.add(jVar);
        }
        if ((i17 & 2) == i16) {
            e eVar = new e();
            eVar.a(viewGroup2.getContext(), wVar, xVar, viewGroup2, relativeLayout, view, i19, aVar);
            arrayList.add(eVar);
        }
        if ((i17 & 4) == 4) {
            k kVar = new k();
            kVar.a(viewGroup2.getContext(), wVar, xVar, viewGroup2, relativeLayout, view, i19, aVar);
            arrayList.add(kVar);
        }
        if (relativeLayout != null && (i17 & 8) == i14) {
            f fVar = new f();
            fVar.a(viewGroup2.getContext(), wVar, xVar, viewGroup2, relativeLayout, view, i19, aVar);
            arrayList.add(fVar);
        }
        if (relativeLayout != null && (i17 & 32) == i13) {
            h hVar = new h();
            hVar.a(viewGroup2.getContext(), wVar, xVar, viewGroup2, relativeLayout, view, i19, aVar);
            arrayList.add(hVar);
        }
        if ((i17 & 64) == i4) {
            b bVar = new b();
            bVar.a(viewGroup2.getContext(), wVar, xVar, viewGroup2, relativeLayout, view, i19, aVar);
            arrayList.add(bVar);
        }
        this.f11889g = arrayList;
        this.i = c(this.f11888f);
        final k c9 = c();
        if (c9 != null) {
            viewGroup.post(new Runnable() { // from class: com.anythink.basead.ui.improveclick.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    BaseSpecialNoteView baseSpecialNoteView;
                    ViewGroup.LayoutParams a9 = a.this.a();
                    if (c9 == null || a.this.a() == null || (baseSpecialNoteView = c9.f12043a) == null) {
                        return;
                    }
                    baseSpecialNoteView.setLayoutParams(a9);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final int i) {
        List<c> list = this.f11889g;
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
        Map<String, Object> map = this.f11890h;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put(f11883b, Boolean.valueOf(this.i));
        Iterator<c> it = this.f11889g.iterator();
        while (it.hasNext()) {
            it.next().a(i, hashMap);
        }
    }

    private k c() {
        List<c> list = this.f11889g;
        if (list == null || list.size() <= 0) {
            return null;
        }
        for (c cVar : this.f11889g) {
            if (cVar instanceof k) {
                return (k) cVar;
            }
        }
        return null;
    }

    private d d() {
        List<c> list = this.f11889g;
        if (list == null || list.size() <= 0) {
            return null;
        }
        for (c cVar : this.f11889g) {
            if (cVar instanceof d) {
                return (d) cVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0089, code lost:
    
        if (r7.f14954o.bw() == 2) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0093, code lost:
    
        if (r7.f14954o.bx() == 2) goto L52;
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
        int i4;
        w wVar;
        x xVar;
        String valueOf;
        int i6;
        int i9;
        x xVar2;
        int i10;
        boolean z6 = true;
        if (this.f11886d.c()) {
            return 0;
        }
        int i11 = this.f11888f;
        if (i11 != 100) {
            switch (i11) {
                case 1:
                case 2:
                    if (c(i11)) {
                        i = 16;
                        yVar = this.f11887e.f14954o;
                        if (!yVar.ah() || yVar.ai() || yVar.aj()) {
                            i |= 4;
                        }
                        i4 = this.f11888f;
                        if ((i4 != 1 || i4 == 2 || i4 == 3 || i4 == 5 || i4 == 6) && com.anythink.basead.b.e.a(this.f11887e)) {
                            wVar = this.f11886d;
                            xVar = this.f11887e;
                            if (wVar != null && xVar != null) {
                                valueOf = String.valueOf(xVar.f14949j);
                                valueOf.getClass();
                                if (valueOf.equals("4") && (wVar instanceof bj)) {
                                    boolean z9 = 1 != ((bj) wVar).aJ();
                                    if (xVar.f14954o.C() == 1) {
                                        if (!z9) {
                                            break;
                                        }
                                        if (z9) {
                                            break;
                                        }
                                    }
                                }
                            }
                            i |= 1;
                        }
                        i6 = this.f11888f;
                        if ((i6 != 1 || i6 == 3) && this.f11887e.f14954o.s() == 1 && com.anythink.core.common.v.g.a().b(b.d.i)) {
                            i |= 2;
                        }
                        if (this.f11887e.f14954o.au() == 1) {
                            i |= 8;
                        }
                        x xVar3 = this.f11887e;
                        i9 = xVar3.f14949j;
                        if (i9 == 1) {
                            boolean z10 = i9 == 1 && (xVar3.f14954o.au() != 1 || TextUtils.isEmpty(this.f11887e.f14954o.aw())) && this.f11887e.f14954o.br() != 1;
                            if (z10 && this.f11887e.f14954o.br() == 2) {
                                z10 = q.b() ? com.anythink.core.common.v.g.a().b(b.d.f12915o) : com.anythink.core.common.v.g.a().b(b.d.f12914n);
                            }
                            if (z10) {
                                i |= 32;
                            }
                        }
                        if (this.f11887e.f14954o.bv() != 1 || ((i10 = (xVar2 = this.f11887e).f14949j) == 3 ? xVar2.f14954o.bv() != 2 ? this.f11887e.f14954o.bv() != 3 || this.f11888f != 2 || this.f11887e.f14954o.at() == 1 : com.anythink.basead.b.e.a(this.f11887e) || ((TextUtils.isEmpty(this.f11886d.H()) && TextUtils.isEmpty(this.f11886d.G())) || !com.anythink.core.common.v.g.a().b(b.d.f12903b)) : i10 != 4 || xVar2.f14954o.bv() != 2 || com.anythink.basead.b.e.a(this.f11887e) || ((TextUtils.isEmpty(this.f11886d.H()) && TextUtils.isEmpty(this.f11886d.G())) || !com.anythink.core.common.v.g.a().b(b.d.f12903b)))) {
                            z6 = false;
                        }
                        return !z6 ? i | 64 : i;
                    }
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    i = 0;
                    yVar = this.f11887e.f14954o;
                    if (!yVar.ah()) {
                        break;
                    }
                    i |= 4;
                    i4 = this.f11888f;
                    if (i4 != 1) {
                    }
                    wVar = this.f11886d;
                    xVar = this.f11887e;
                    if (wVar != null) {
                        valueOf = String.valueOf(xVar.f14949j);
                        valueOf.getClass();
                        if (valueOf.equals("4")) {
                            if (1 != ((bj) wVar).aJ()) {
                            }
                            if (xVar.f14954o.C() == 1) {
                            }
                            break;
                        }
                    }
                    i |= 1;
                    i6 = this.f11888f;
                    if (i6 != 1) {
                    }
                    i |= 2;
                    if (this.f11887e.f14954o.au() == 1) {
                    }
                    x xVar32 = this.f11887e;
                    i9 = xVar32.f14949j;
                    if (i9 == 1) {
                    }
                    if (this.f11887e.f14954o.bv() != 1) {
                        break;
                    }
                    z6 = false;
                    if (!z6) {
                    }
                    break;
            }
        } else if (com.anythink.basead.b.e.a(this.f11887e)) {
            return 1;
        }
        return 0;
    }

    private boolean f() {
        y yVar = this.f11887e.f14954o;
        return yVar.ah() || yVar.ai() || yVar.aj();
    }

    private boolean g() {
        return this.f11887e.f14954o.s() == 1 && com.anythink.core.common.v.g.a().b(b.d.i);
    }

    private boolean h() {
        if (com.anythink.basead.b.e.a(this.f11887e)) {
            w wVar = this.f11886d;
            x xVar = this.f11887e;
            if (wVar != null && xVar != null) {
                String valueOf = String.valueOf(xVar.f14949j);
                valueOf.getClass();
                if (valueOf.equals("4") && (wVar instanceof bj)) {
                    boolean z6 = 1 == ((bj) wVar).aJ();
                    if (xVar.f14954o.C() != 1 || ((z6 || xVar.f14954o.bw() != 2) && (!z6 || xVar.f14954o.bx() != 2))) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    private boolean i() {
        return this.f11887e.f14954o.au() == 1;
    }

    private boolean j() {
        x xVar = this.f11887e;
        boolean z6 = xVar.f14949j == 1 && (xVar.f14954o.au() != 1 || TextUtils.isEmpty(this.f11887e.f14954o.aw())) && this.f11887e.f14954o.br() != 1;
        return (z6 && this.f11887e.f14954o.br() == 2) ? q.b() ? com.anythink.core.common.v.g.a().b(b.d.f12915o) : com.anythink.core.common.v.g.a().b(b.d.f12914n) : z6;
    }

    private boolean k() {
        if (this.f11887e.f14954o.bv() != 1) {
            x xVar = this.f11887e;
            int i = xVar.f14949j;
            if (i != 3) {
                if (i == 4 && xVar.f14954o.bv() == 2 && !com.anythink.basead.b.e.a(this.f11887e)) {
                    return !(TextUtils.isEmpty(this.f11886d.H()) && TextUtils.isEmpty(this.f11886d.G())) && com.anythink.core.common.v.g.a().b(b.d.f12903b);
                }
                return false;
            }
            if (xVar.f14954o.bv() == 2) {
                if (com.anythink.basead.b.e.a(this.f11887e)) {
                    return false;
                }
                return !(TextUtils.isEmpty(this.f11886d.H()) && TextUtils.isEmpty(this.f11886d.G())) && com.anythink.core.common.v.g.a().b(b.d.f12903b);
            }
            if (this.f11887e.f14954o.bv() == 3 && this.f11888f == 2 && this.f11887e.f14954o.at() != 1) {
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
        if ((i == 103 || i == 118) && !this.i && !com.anythink.basead.b.e.e(this.f11886d, this.f11887e)) {
            com.anythink.core.common.u.e.a(this.f11886d, this.f11887e, com.anythink.basead.b.e.a(this.f11887e, this.f11885c.getContext()));
        }
        b(i);
    }

    private boolean c(int i) {
        if (i == 2) {
            return this.f11887e.f14954o.aQ() == 5;
        }
        if (i != 1) {
            return false;
        }
        int aQ = this.f11887e.f14954o.aQ();
        if (aQ != 2 && aQ != 3 && aQ != 4) {
            return aQ == 5;
        }
        boolean e9 = com.anythink.basead.b.e.e(this.f11886d, this.f11887e);
        boolean z6 = !e9;
        if (this.f11887e.f14954o.aQ() == 4 && !e9) {
            if (TextUtils.isEmpty(this.f11887e.f14954o.bb())) {
                z6 = false;
            } else {
                z6 = com.anythink.core.common.res.d.a(this.f11885c.getContext()).b(3, o.a(this.f11887e.f14954o.bb()));
                this.f11887e.f14954o.bb();
            }
        }
        if (z6) {
            if (this.f11887e.f14954o.aQ() == 3) {
                z6 = com.anythink.core.common.v.g.a().b(b.d.f12902a);
            }
            if (this.f11887e.f14954o.aQ() == 2) {
                z6 = com.anythink.core.common.v.g.a().b(b.d.i);
            }
            if (this.f11887e.f14954o.aQ() == 4) {
                z6 = com.anythink.core.common.v.g.a().b(b.d.f12916p);
            }
        }
        if (z6 && TextUtils.equals(String.valueOf(this.f11887e.f14949j), "1") && TextUtils.isEmpty(this.f11886d.E())) {
            if (this.f11887e.f14954o.ap() == 1) {
                z6 = false;
            }
            if (this.f11887e.f14954o.aq() == 1) {
                return false;
            }
        }
        return z6;
    }

    public final void a(Map<String, Object> map) {
        if (map != null) {
            this.f11890h.putAll(map);
        }
    }

    public final void a(d.a aVar) {
        d dVar;
        com.anythink.basead.ui.c.a aVar2;
        List<c> list = this.f11889g;
        if (list != null && list.size() > 0) {
            for (c cVar : this.f11889g) {
                if (cVar instanceof d) {
                    dVar = (d) cVar;
                    break;
                }
            }
        }
        dVar = null;
        if (dVar == null || (aVar2 = dVar.f11935m) == null) {
            return;
        }
        aVar2.a(aVar);
    }

    public final Map<String, Object> b() {
        return this.f11890h;
    }
}
