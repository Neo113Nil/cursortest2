package vb;

import hd.g;
import org.fortheloss.st.JokerAndSevensApp;
import q3.l;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f implements xb.b {

    /* renamed from: g, reason: collision with root package name */
    public volatile g f7312g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f7313h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public final f8.c f7314i;

    public f(f8.c cVar) {
        this.f7314i = cVar;
    }

    @Override // xb.b
    public final Object c() {
        if (this.f7312g == null) {
            synchronized (this.f7313h) {
                try {
                    if (this.f7312g == null) {
                        this.f7312g = new g(new l((JokerAndSevensApp) this.f7314i.f2340h, false));
                    }
                } finally {
                }
            }
        }
        return this.f7312g;
    }
}
