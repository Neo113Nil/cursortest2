package x5;

import android.content.Context;
import p6.i;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements y5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8364a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8365b;

    public /* synthetic */ d(int i10, Object obj) {
        this.f8364a = i10;
        this.f8365b = obj;
    }

    @Override // zb.a
    public final Object get() {
        switch (this.f8364a) {
            case 0:
                return new a5.c((Context) ((d) this.f8365b).f8365b, new i(), new m6.i(6));
            default:
                return this.f8365b;
        }
    }
}
