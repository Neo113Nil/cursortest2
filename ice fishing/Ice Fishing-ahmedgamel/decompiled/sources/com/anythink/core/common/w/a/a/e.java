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
    private static final String f17790a = "e";

    /* renamed from: b, reason: collision with root package name */
    private final String f17791b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.core.common.w.a.b.c f17792c;

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.core.common.w.a.b.d f17793d;

    /* renamed from: e, reason: collision with root package name */
    private long f17794e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17795f;

    public e(String str, com.anythink.core.common.w.a.b.c cVar, com.anythink.core.common.w.a.b.d dVar) {
        this.f17791b = str;
        this.f17792c = cVar;
        this.f17793d = dVar;
    }

    @Override // com.anythink.core.common.w.a.b.e
    public final void a(final Context context, final l lVar, final com.anythink.core.common.w.a.b.a aVar) {
        if (lVar == null) {
            aVar.a();
            return;
        }
        final ai by = lVar.by();
        boolean z6 = by == null || by.a();
        boolean z9 = by != null && by.a(this.f17794e);
        if (z6 || z9) {
            if (z6 && this.f17795f) {
                this.f17795f = false;
                d.a(this.f17791b);
            }
            aVar.a();
            return;
        }
        this.f17795f = true;
        this.f17794e = System.currentTimeMillis();
        com.anythink.core.common.w.a.b.c cVar = this.f17792c;
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
        this.f17795f = false;
        this.f17794e = 0L;
    }

    /* renamed from: com.anythink.core.common.w.a.a.e$2, reason: invalid class name */
    public class AnonymousClass2 implements a.InterfaceC0104a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ai f17802a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.w.a.b.a f17803b;

        public AnonymousClass2(ai aiVar, com.anythink.core.common.w.a.b.a aVar) {
            this.f17802a = aiVar;
            this.f17803b = aVar;
        }

        @Override // com.anythink.core.common.w.a.c.a.InterfaceC0104a
        public final void a(List<aj> list, boolean z6) {
            this.f17802a.a(list);
            com.anythink.core.common.w.a.b.a aVar = this.f17803b;
            if (aVar == null || !z6) {
                return;
            }
            aVar.a();
        }

        @Override // com.anythink.core.common.w.a.c.a.InterfaceC0104a
        public final void a(boolean z6) {
            com.anythink.core.common.w.a.b.a aVar = this.f17803b;
            if (aVar == null || !z6) {
                return;
            }
            aVar.a();
        }
    }

    private com.anythink.core.common.w.a.c.a a(Context context, l lVar, com.anythink.core.common.w.a.b.a aVar, ai aiVar) {
        com.anythink.core.common.w.a.c.a aVar2 = new com.anythink.core.common.w.a.c.a(context, lVar, aiVar, this.f17793d);
        aVar2.a(new AnonymousClass2(aiVar, aVar));
        return aVar2;
    }

    public static /* synthetic */ com.anythink.core.common.w.a.c.a a(e eVar, Context context, l lVar, com.anythink.core.common.w.a.b.a aVar, ai aiVar) {
        com.anythink.core.common.w.a.c.a aVar2 = new com.anythink.core.common.w.a.c.a(context, lVar, aiVar, eVar.f17793d);
        aVar2.a(eVar.new AnonymousClass2(aiVar, aVar));
        return aVar2;
    }
}
