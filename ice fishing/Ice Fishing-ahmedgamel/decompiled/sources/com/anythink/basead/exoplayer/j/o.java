package com.anythink.basead.exoplayer.j;

import android.content.Context;
import com.anythink.basead.exoplayer.j.h;

/* loaded from: classes.dex */
public final class o implements h.a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8187a;

    /* renamed from: b, reason: collision with root package name */
    private final aa<? super h> f8188b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a f8189c;

    public o(Context context, String str) {
        this(context, str, (aa<? super h>) null);
    }

    private n b() {
        return new n(this.f8187a, this.f8188b, this.f8189c.a());
    }

    @Override // com.anythink.basead.exoplayer.j.h.a
    public final /* synthetic */ h a() {
        return new n(this.f8187a, this.f8188b, this.f8189c.a());
    }

    private o(Context context, String str, aa<? super h> aaVar) {
        this(context, aaVar, new q(str, aaVar));
    }

    private o(Context context, aa<? super h> aaVar, h.a aVar) {
        this.f8187a = context.getApplicationContext();
        this.f8188b = aaVar;
        this.f8189c = aVar;
    }
}
