package com.anythink.core.common.w.a.a;

import android.text.TextUtils;
import com.anythink.core.common.d.t;
import com.anythink.core.common.e.j;
import com.anythink.core.common.h.ai;
import com.anythink.core.common.h.ak;
import com.anythink.core.common.h.al;
import com.anythink.core.common.h.am;
import com.anythink.core.common.h.n;
import com.anythink.core.common.w.a.a;
import java.util.Map;

/* loaded from: classes.dex */
public class b implements com.anythink.core.common.w.a.b.d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16986a = "b";

    /* renamed from: b, reason: collision with root package name */
    private final String f16987b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.core.common.w.a.b.c f16988c;

    /* renamed from: d, reason: collision with root package name */
    private final c f16989d = new c();

    /* renamed from: e, reason: collision with root package name */
    private j f16990e;

    /* renamed from: com.anythink.core.common.w.a.a.b$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f16993a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f16994b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f16995c;

        public AnonymousClass2(n nVar, boolean z3, String str) {
            this.f16993a = nVar;
            this.f16994b = z3;
            this.f16995c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f16993a.ac(this.f16994b ? 1 : 2);
            this.f16993a.A(this.f16995c);
            com.anythink.core.common.u.c.a(t.b().g()).a(3, this.f16993a);
        }
    }

    public b(String str, com.anythink.core.common.w.a.b.c cVar) {
        this.f16987b = str;
        this.f16988c = cVar;
        try {
            this.f16990e = j.a(t.b().g());
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.common.w.a.b.d
    public final void b(String str) {
        j jVar = this.f16990e;
        if (jVar != null) {
            jVar.b(str);
        }
    }

    @Override // com.anythink.core.common.w.a.b.d
    public final am a(String str) {
        j jVar = this.f16990e;
        if (jVar != null) {
            return jVar.a(str);
        }
        return null;
    }

    @Override // com.anythink.core.common.w.a.b.d
    public final void a(final al alVar) {
        c cVar;
        n i;
        String str;
        com.anythink.core.common.w.a.b.c cVar2 = this.f16988c;
        ai a9 = cVar2 != null ? cVar2.a() : null;
        if (a9 == null || a9.a() || alVar == null || !alVar.b().equals(this.f16987b)) {
            return;
        }
        if (alVar.d() == a.b.f16985c && (i = alVar.i()) != null) {
            if (a9.e() != null) {
                str = com.anythink.core.common.w.a.d.a.a(alVar.e(), a9.e().get(Integer.valueOf(alVar.c())));
            } else {
                str = "";
            }
            boolean j6 = alVar.j();
            if (!TextUtils.isEmpty(str)) {
                com.anythink.core.common.v.b.b.a().a(new AnonymousClass2(i, j6, str));
            }
        }
        Map<Integer, ak> e9 = a9.e();
        ak akVar = e9 != null ? e9.get(Integer.valueOf(alVar.c())) : null;
        if (akVar == null) {
            alVar.a();
            alVar.c();
            return;
        }
        alVar.a(akVar.b());
        if (a9.b() && (cVar = this.f16989d) != null) {
            cVar.a(alVar, akVar, a9);
        }
        com.anythink.core.common.v.b.b.a().c(new Runnable() { // from class: com.anythink.core.common.w.a.a.b.1
            @Override // java.lang.Runnable
            public final void run() {
                if (b.this.f16990e != null) {
                    b.this.f16990e.a(alVar);
                }
            }
        }, 13);
    }

    @Override // com.anythink.core.common.w.a.b.b
    public final void b() {
        c cVar = this.f16989d;
        if (cVar != null) {
            cVar.a();
        }
    }

    private void a(al alVar, ai aiVar) {
        n i;
        String str;
        if (alVar == null || alVar.d() != a.b.f16985c || (i = alVar.i()) == null) {
            return;
        }
        if (aiVar != null && aiVar.e() != null) {
            str = com.anythink.core.common.w.a.d.a.a(alVar.e(), aiVar.e().get(Integer.valueOf(alVar.c())));
        } else {
            str = "";
        }
        boolean j6 = alVar.j();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.anythink.core.common.v.b.b.a().a(new AnonymousClass2(i, j6, str));
    }
}
