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
    private static final String f17161a = "e";

    /* renamed from: b, reason: collision with root package name */
    private final String f17162b;

    /* renamed from: c, reason: collision with root package name */
    private final com.anythink.core.common.w.a.b.c f17163c;

    /* renamed from: d, reason: collision with root package name */
    private final com.anythink.core.common.w.a.b.d f17164d;

    /* renamed from: e, reason: collision with root package name */
    private long f17165e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17166f;

    public e(String str, com.anythink.core.common.w.a.b.c cVar, com.anythink.core.common.w.a.b.d dVar) {
        this.f17162b = str;
        this.f17163c = cVar;
        this.f17164d = dVar;
    }

    @Override // com.anythink.core.common.w.a.b.e
    public final void a(final Context context, final l lVar, final com.anythink.core.common.w.a.b.a aVar) {
        if (lVar == null) {
            aVar.a();
            return;
        }
        final ai by = lVar.by();
        boolean z8 = by == null || by.a();
        boolean z9 = by != null && by.a(this.f17165e);
        if (z8 || z9) {
            if (z8 && this.f17166f) {
                this.f17166f = false;
                d.a(this.f17162b);
            }
            aVar.a();
            return;
        }
        this.f17166f = true;
        this.f17165e = System.currentTimeMillis();
        com.anythink.core.common.w.a.b.c cVar = this.f17163c;
        if (cVar != null) {
            cVar.a(by);
        }
        final boolean c4 = by.c();
        if (!c4) {
            aVar.a();
        }
        com.anythink.core.common.v.b.b.a().c(new Runnable() { // from class: com.anythink.core.common.w.a.a.e.1
            @Override // java.lang.Runnable
            public final void run() {
                e.a(e.this, context, lVar, aVar, by).a(c4);
            }
        }, 13);
    }

    @Override // com.anythink.core.common.w.a.b.b
    public final void b() {
        this.f17166f = false;
        this.f17165e = 0L;
    }

    /* renamed from: com.anythink.core.common.w.a.a.e$2, reason: invalid class name */
    public class AnonymousClass2 implements a.InterfaceC0103a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ai f17173a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.anythink.core.common.w.a.b.a f17174b;

        public AnonymousClass2(ai aiVar, com.anythink.core.common.w.a.b.a aVar) {
            this.f17173a = aiVar;
            this.f17174b = aVar;
        }

        @Override // com.anythink.core.common.w.a.c.a.InterfaceC0103a
        public final void a(List<aj> list, boolean z8) {
            this.f17173a.a(list);
            com.anythink.core.common.w.a.b.a aVar = this.f17174b;
            if (aVar == null || !z8) {
                return;
            }
            aVar.a();
        }

        @Override // com.anythink.core.common.w.a.c.a.InterfaceC0103a
        public final void a(boolean z8) {
            com.anythink.core.common.w.a.b.a aVar = this.f17174b;
            if (aVar == null || !z8) {
                return;
            }
            aVar.a();
        }
    }

    private com.anythink.core.common.w.a.c.a a(Context context, l lVar, com.anythink.core.common.w.a.b.a aVar, ai aiVar) {
        com.anythink.core.common.w.a.c.a aVar2 = new com.anythink.core.common.w.a.c.a(context, lVar, aiVar, this.f17164d);
        aVar2.a(new AnonymousClass2(aiVar, aVar));
        return aVar2;
    }

    public static /* synthetic */ com.anythink.core.common.w.a.c.a a(e eVar, Context context, l lVar, com.anythink.core.common.w.a.b.a aVar, ai aiVar) {
        com.anythink.core.common.w.a.c.a aVar2 = new com.anythink.core.common.w.a.c.a(context, lVar, aiVar, eVar.f17164d);
        aVar2.a(eVar.new AnonymousClass2(aiVar, aVar));
        return aVar2;
    }
}
