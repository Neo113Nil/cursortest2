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
    private static final String f17773a = "b";

    /* renamed from: b, reason: collision with root package name */
    private final String f17774b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.core.common.w.a.b.c f17775c;

    /* renamed from: d, reason: collision with root package name */
    private final c f17776d = new c();

    /* renamed from: e, reason: collision with root package name */
    private j f17777e;

    /* renamed from: com.anythink.core.common.w.a.a.b$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f17780a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f17781b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f17782c;

        public AnonymousClass2(n nVar, boolean z6, String str) {
            this.f17780a = nVar;
            this.f17781b = z6;
            this.f17782c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f17780a.ac(this.f17781b ? 1 : 2);
            this.f17780a.A(this.f17782c);
            com.anythink.core.common.u.c.a(t.b().g()).a(3, this.f17780a);
        }
    }

    public b(String str, com.anythink.core.common.w.a.b.c cVar) {
        this.f17774b = str;
        this.f17775c = cVar;
        try {
            this.f17777e = j.a(t.b().g());
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.common.w.a.b.d
    public final void b(String str) {
        j jVar = this.f17777e;
        if (jVar != null) {
            jVar.b(str);
        }
    }

    @Override // com.anythink.core.common.w.a.b.d
    public final am a(String str) {
        j jVar = this.f17777e;
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
        com.anythink.core.common.w.a.b.c cVar2 = this.f17775c;
        ai a9 = cVar2 != null ? cVar2.a() : null;
        if (a9 == null || a9.a() || alVar == null || !alVar.b().equals(this.f17774b)) {
            return;
        }
        if (alVar.d() == a.b.f17772c && (i = alVar.i()) != null) {
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
        if (a9.b() && (cVar = this.f17776d) != null) {
            cVar.a(alVar, akVar, a9);
        }
        com.anythink.core.common.v.b.b.a().c(new Runnable() { // from class: com.anythink.core.common.w.a.a.b.1
            @Override // java.lang.Runnable
            public final void run() {
                if (b.this.f17777e != null) {
                    b.this.f17777e.a(alVar);
                }
            }
        }, 13);
    }

    @Override // com.anythink.core.common.w.a.b.b
    public final void b() {
        c cVar = this.f17776d;
        if (cVar != null) {
            cVar.a();
        }
    }

    private void a(al alVar, ai aiVar) {
        n i;
        String str;
        if (alVar == null || alVar.d() != a.b.f17772c || (i = alVar.i()) == null) {
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
