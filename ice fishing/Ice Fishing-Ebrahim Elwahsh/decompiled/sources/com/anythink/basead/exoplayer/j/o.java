package com.anythink.basead.exoplayer.j;

import android.content.Context;
import com.anythink.basead.exoplayer.j.h;

/* loaded from: classes.dex */
public final class o implements h.a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8344a;

    /* renamed from: b, reason: collision with root package name */
    private final aa<? super h> f8345b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a f8346c;

    public o(Context context, String str) {
        this(context, str, (aa<? super h>) null);
    }

    private n b() {
        return new n(this.f8344a, this.f8345b, this.f8346c.a());
    }

    @Override // com.anythink.basead.exoplayer.j.h.a
    public final /* synthetic */ h a() {
        return new n(this.f8344a, this.f8345b, this.f8346c.a());
    }

    private o(Context context, String str, aa<? super h> aaVar) {
        this(context, aaVar, new q(str, aaVar));
    }

    private o(Context context, aa<? super h> aaVar, h.a aVar) {
        this.f8344a = context.getApplicationContext();
        this.f8345b = aaVar;
        this.f8346c = aVar;
    }
}
