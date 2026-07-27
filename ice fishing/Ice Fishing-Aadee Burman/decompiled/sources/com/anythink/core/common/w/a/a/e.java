package com.anythink.core.common.w.a.a;

import android.content.Context;
import com.anythink.core.common.h.ai;
import com.anythink.core.common.h.aj;
import com.anythink.core.common.w.a.c.a;
import com.anythink.core.d.l;
import java.util.List;

/* loaded from: classes.dex */
public class e implements com.anythink.core.common.w.a.b.e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17003a = "e";

    /* renamed from: b, reason: collision with root package name */
    private final String f17004b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.core.common.w.a.b.c f17005c;

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.core.common.w.a.b.d f17006d;

    /* renamed from: e, reason: collision with root package name */
    private long f17007e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17008f;

    public e(String str, com.anythink.core.common.w.a.b.c cVar, com.anythink.core.common.w.a.b.d dVar) {
        this.f17004b = str;
        this.f17005c = cVar;
        this.f17006d = dVar;
    }

    @Override // com.anythink.core.common.w.a.b.e
    public final void a(final Context context, final l lVar, final com.anythink.core.common.w.a.b.a aVar) {
        if (lVar == null) {
            aVar.a();
            return;
        }
        final ai by = lVar.by();
        boolean z3 = by == null || by.a();
        boolean z6 = by != null && by.a(this.f17007e);
        if (z3 || z6) {
            if (z3 && this.f17008f) {
                this.f17008f = false;
                d.a(this.f17004b);
            }
            aVar.a();
            return;
        }
        this.f17008f = true;
        this.f17007e = System.currentTimeMillis();
        com.anythink.core.common.w.a.b.c cVar = this.f17005c;
        if (cVar != null) {
            cVar.a(by);
        }
        final boolean c9 = by.c();
        if (!c9) {
            aVar.a();
        }
        com.anythink.core.common.v.b.b.a().c(new Runnable() { // from class: com.anythink.core.common.w.a.a.e.1
            @Override // java.lang.Runnable
            public final void run() {
                e.a(e.this, context, lVar, aVar, by).a(c9);
            }
        }, 13);
    }

    @Override // com.anythink.core.common.w.a.b.b
    public final void b() {
        this.f17008f = false;
        this.f17007e = 0L;
    }

    /* renamed from: com.anythink.core.common.w.a.a.e$2, reason: invalid class name */
    public class AnonymousClass2 implements a.InterfaceC0104a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ai f17015a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.w.a.b.a f17016b;

        public AnonymousClass2(ai aiVar, com.anythink.core.common.w.a.b.a aVar) {
            this.f17015a = aiVar;
            this.f17016b = aVar;
        }

        @Override // com.anythink.core.common.w.a.c.a.InterfaceC0104a
        public final void a(List<aj> list, boolean z3) {
            this.f17015a.a(list);
            com.anythink.core.common.w.a.b.a aVar = this.f17016b;
            if (aVar == null || !z3) {
                return;
            }
            aVar.a();
        }

        @Override // com.anythink.core.common.w.a.c.a.InterfaceC0104a
        public final void a(boolean z3) {
            com.anythink.core.common.w.a.b.a aVar = this.f17016b;
            if (aVar == null || !z3) {
                return;
            }
            aVar.a();
        }
    }

    private com.anythink.core.common.w.a.c.a a(Context context, l lVar, com.anythink.core.common.w.a.b.a aVar, ai aiVar) {
        com.anythink.core.common.w.a.c.a aVar2 = new com.anythink.core.common.w.a.c.a(context, lVar, aiVar, this.f17006d);
        aVar2.a(new AnonymousClass2(aiVar, aVar));
        return aVar2;
    }

    public static /* synthetic */ com.anythink.core.common.w.a.c.a a(e eVar, Context context, l lVar, com.anythink.core.common.w.a.b.a aVar, ai aiVar) {
        com.anythink.core.common.w.a.c.a aVar2 = new com.anythink.core.common.w.a.c.a(context, lVar, aiVar, eVar.f17006d);
        aVar2.a(eVar.new AnonymousClass2(aiVar, aVar));
        return aVar2;
    }
}
