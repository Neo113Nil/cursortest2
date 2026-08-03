package n5;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Iterator;
import m0.k0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5059a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m5.c f5060b;

    public /* synthetic */ b(m5.c cVar, int i10) {
        this.f5059a = i10;
        this.f5060b = cVar;
    }

    @Override // m0.k0
    public final void a() {
        i5.a aVar;
        switch (this.f5059a) {
            case 0:
                Iterator it = this.f5060b.f4885h.values().iterator();
                while (it.hasNext()) {
                    c.a((m5.c) it.next());
                }
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                m5.c cVar = this.f5060b;
                m5.c cVar2 = cVar.f4880c;
                if (cVar2 != null && (aVar = cVar2.f4885h) != null) {
                    break;
                }
                break;
            default:
                d.d(this.f5060b);
                break;
        }
    }
}
