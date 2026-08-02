package com.anythink.basead.j;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.IceFishing.LiveIceFishing.k;
import com.anythink.basead.ui.BaseATView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.ac;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    w f9890a;

    /* renamed from: b, reason: collision with root package name */
    x f9891b;

    /* renamed from: c, reason: collision with root package name */
    b f9892c;

    /* renamed from: d, reason: collision with root package name */
    a f9893d;

    /* renamed from: e, reason: collision with root package name */
    d f9894e;

    /* renamed from: f, reason: collision with root package name */
    float f9895f;

    /* renamed from: g, reason: collision with root package name */
    float f9896g;

    /* renamed from: m, reason: collision with root package name */
    private boolean f9901m;

    /* renamed from: n, reason: collision with root package name */
    private WeakReference<View> f9902n;

    /* renamed from: o, reason: collision with root package name */
    private List<WeakReference<View>> f9903o;

    /* renamed from: j, reason: collision with root package name */
    private final String f9898j = "e";

    /* renamed from: k, reason: collision with root package name */
    private boolean f9899k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f9900l = false;

    /* renamed from: h, reason: collision with root package name */
    boolean f9897h = false;
    boolean i = false;

    public e(w wVar, x xVar) {
        this.f9890a = wVar;
        this.f9891b = xVar;
        ac.a();
        boolean d9 = ac.d();
        this.f9901m = d9;
        if (d9) {
            return;
        }
        t.b().F();
    }

    public static /* synthetic */ boolean e(e eVar) {
        eVar.f9900l = true;
        return true;
    }

    private static boolean c() {
        return f.a().b();
    }

    public final void a(final int i, final View view) {
        if (this.f9899k || !this.f9901m || !f.a().b() || this.f9897h || this.i || TextUtils.isEmpty(this.f9890a.av())) {
            return;
        }
        t.b().b(new Runnable() { // from class: com.anythink.basead.j.e.1
            @Override // java.lang.Runnable
            public final void run() {
                e eVar;
                b bVar;
                View view2;
                View view3;
                e eVar2 = e.this;
                if (eVar2.f9897h || eVar2.i) {
                    return;
                }
                Context g9 = t.b().g();
                if (g9 == null) {
                    g9 = com.anythink.basead.c.a().f();
                }
                if (g9 == null && (view3 = view) != null && (g9 = view3.getContext()) != null) {
                    g9 = g9.getApplicationContext();
                }
                String unused = e.this.f9898j;
                int i4 = i;
                try {
                    switch (i4) {
                        case 112:
                            e eVar3 = e.this;
                            b bVar2 = eVar3.f9892c;
                            if (bVar2 != null) {
                                eVar3.i = true;
                                bVar2.b();
                                e.this.f9892c = null;
                                break;
                            }
                            break;
                        case 113:
                            e eVar4 = e.this;
                            d dVar = eVar4.f9894e;
                            if (dVar != null && eVar4.f9892c != null) {
                                dVar.j();
                                break;
                            }
                            break;
                        case 114:
                            if (!e.this.f9900l) {
                                e.e(e.this);
                                if (!e.this.a()) {
                                    boolean isEmpty = TextUtils.isEmpty(e.this.f9890a.E());
                                    boolean z6 = !isEmpty;
                                    e eVar5 = e.this;
                                    b bVar3 = eVar5.f9892c;
                                    if (bVar3 != null && eVar5.f9893d == null) {
                                        eVar5.f9893d = bVar3.c();
                                    }
                                    e eVar6 = e.this;
                                    a aVar = eVar6.f9893d;
                                    if (aVar != null) {
                                        aVar.a(z6);
                                        e.this.f9893d.a();
                                    } else {
                                        x xVar = eVar6.f9891b;
                                        String str = xVar != null ? xVar.f14944d : "";
                                        w wVar = eVar6.f9890a;
                                        r3 = wVar != null ? wVar.ao() : 0;
                                        String unused2 = e.this.f9898j;
                                        com.anythink.core.common.u.e.b("Omsdk Exception", "create omsdkAdEvent fail:is empty,requestId:" + str + ",offerResourceType:" + r3, t.b().r());
                                    }
                                    if (!isEmpty && (bVar = (eVar = e.this).f9892c) != null && eVar.f9894e == null) {
                                        eVar.f9894e = bVar.d();
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                            break;
                        default:
                            switch (i4) {
                                case BaseATView.a.f10590z /* 201 */:
                                    if (view != null) {
                                        if (!e.this.a()) {
                                            boolean z9 = !TextUtils.isEmpty(e.this.f9890a.E());
                                            e eVar7 = e.this;
                                            f a9 = f.a();
                                            e eVar8 = e.this;
                                            eVar7.f9892c = a9.a(g9, z9, eVar8.f9890a, eVar8.f9891b);
                                        } else if (!(view instanceof WebView) || g9 == null) {
                                            e.a(e.this, "2", "omsdkMeasureView is not webview");
                                        } else if (!TextUtils.isEmpty(e.this.f9890a.o())) {
                                            e eVar9 = e.this;
                                            f a10 = f.a();
                                            WebView webView = (WebView) view;
                                            e eVar10 = e.this;
                                            eVar9.f9892c = a10.a(g9, webView, eVar10.f9890a, eVar10.f9891b);
                                        }
                                        e eVar11 = e.this;
                                        b bVar4 = eVar11.f9892c;
                                        if (bVar4 == null) {
                                            eVar11.f9897h = true;
                                            break;
                                        } else {
                                            bVar4.a(view);
                                            if (e.this.f9902n != null && (view2 = (View) e.this.f9902n.get()) != null) {
                                                e.this.f9892c.b(view2);
                                            }
                                            if (e.this.f9903o != null && !e.this.f9903o.isEmpty()) {
                                                ArrayList arrayList = new ArrayList();
                                                while (r3 < e.this.f9903o.size()) {
                                                    View view4 = (View) ((WeakReference) e.this.f9903o.get(r3)).get();
                                                    if (view4 != null) {
                                                        arrayList.add(view4);
                                                    }
                                                    r3++;
                                                }
                                                e.this.f9892c.a(arrayList);
                                            }
                                            e.this.f9892c.a();
                                            break;
                                        }
                                    } else {
                                        e.a(e.this, "2", "omsdkMeasureView is empty");
                                        e.this.f9897h = true;
                                        break;
                                    }
                                    break;
                                case 202:
                                    e eVar12 = e.this;
                                    d dVar2 = eVar12.f9894e;
                                    if (dVar2 != null && eVar12.f9892c != null) {
                                        dVar2.a(eVar12.f9895f, eVar12.f9896g);
                                        break;
                                    }
                                    break;
                                case BaseATView.a.f10552B /* 203 */:
                                    e eVar13 = e.this;
                                    d dVar3 = eVar13.f9894e;
                                    if (dVar3 != null && eVar13.f9892c != null) {
                                        dVar3.a();
                                        break;
                                    }
                                    break;
                                case BaseATView.a.f10553C /* 204 */:
                                    e eVar14 = e.this;
                                    d dVar4 = eVar14.f9894e;
                                    if (dVar4 != null && eVar14.f9892c != null) {
                                        dVar4.b();
                                        break;
                                    }
                                    break;
                                case BaseATView.a.f10554D /* 205 */:
                                    e eVar15 = e.this;
                                    d dVar5 = eVar15.f9894e;
                                    if (dVar5 != null && eVar15.f9892c != null) {
                                        dVar5.c();
                                        break;
                                    }
                                    break;
                                case BaseATView.a.f10555E /* 206 */:
                                    e eVar16 = e.this;
                                    d dVar6 = eVar16.f9894e;
                                    if (dVar6 != null && eVar16.f9892c != null) {
                                        dVar6.d();
                                        break;
                                    }
                                    break;
                                case BaseATView.a.f10556F /* 207 */:
                                    e eVar17 = e.this;
                                    d dVar7 = eVar17.f9894e;
                                    if (dVar7 != null && eVar17.f9892c != null) {
                                        dVar7.e();
                                        break;
                                    }
                                    break;
                                case BaseATView.a.f10557G /* 208 */:
                                    e eVar18 = e.this;
                                    d dVar8 = eVar18.f9894e;
                                    if (dVar8 != null && eVar18.f9892c != null) {
                                        dVar8.f();
                                        break;
                                    }
                                    break;
                                case BaseATView.a.f10558H /* 209 */:
                                    e eVar19 = e.this;
                                    d dVar9 = eVar19.f9894e;
                                    if (dVar9 != null && eVar19.f9892c != null) {
                                        dVar9.g();
                                        break;
                                    }
                                    break;
                                case BaseATView.a.f10559I /* 210 */:
                                    e eVar20 = e.this;
                                    d dVar10 = eVar20.f9894e;
                                    if (dVar10 != null && eVar20.f9892c != null) {
                                        dVar10.h();
                                        break;
                                    }
                                    break;
                                case BaseATView.a.J /* 211 */:
                                    e eVar21 = e.this;
                                    d dVar11 = eVar21.f9894e;
                                    if (dVar11 != null && eVar21.f9892c != null) {
                                        dVar11.i();
                                        break;
                                    }
                                    break;
                                case BaseATView.a.f10560K /* 212 */:
                                    e eVar22 = e.this;
                                    d dVar12 = eVar22.f9894e;
                                    if (dVar12 != null && eVar22.f9892c != null) {
                                        dVar12.a(eVar22.f9896g);
                                        break;
                                    }
                                    break;
                            }
                    }
                } catch (Throwable th) {
                    if (t.b().F()) {
                        th.printStackTrace();
                    }
                    String unused3 = e.this.f9898j;
                    th.getMessage();
                    k.x("Omsdk Exception", "handle:" + i + " with throwable:" + th.getMessage());
                }
            }
        });
    }

    public final void b(View view) {
        if (view != null) {
            if (this.f9903o == null) {
                this.f9903o = new ArrayList();
            }
            this.f9903o.add(new WeakReference<>(view));
        }
    }

    public final void b() {
        this.f9899k = true;
    }

    private void a(String str, String str2) {
        String str3;
        if (!a()) {
            if (!TextUtils.isEmpty(this.f9890a.E())) {
                str3 = "3";
            } else {
                str3 = "2";
            }
        } else {
            str3 = "1";
        }
        com.anythink.core.common.u.e.a(this.f9891b, this.f9890a, f.a().c(), str3, false, str, str2);
    }

    public final boolean a() {
        return !com.anythink.basead.b.e.a(this.f9890a, this.f9891b) && this.f9890a.n();
    }

    public final void a(boolean z6) {
        if (z6) {
            this.f9896g = 0.0f;
        } else {
            this.f9896g = 1.0f;
        }
    }

    public final void a(long j6) {
        this.f9895f = j6;
    }

    public final void a(View view) {
        if (view != null) {
            this.f9902n = new WeakReference<>(view);
        }
    }

    public static /* synthetic */ void a(e eVar, String str, String str2) {
        String str3;
        if (!eVar.a()) {
            if (!TextUtils.isEmpty(eVar.f9890a.E())) {
                str3 = "3";
            } else {
                str3 = "2";
            }
        } else {
            str3 = "1";
        }
        com.anythink.core.common.u.e.a(eVar.f9891b, eVar.f9890a, f.a().c(), str3, false, str, str2);
    }
}
