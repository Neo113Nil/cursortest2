package r7;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Map;
import s7.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements p7.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6094a;

    @Override // p7.a
    public final void a(Object obj, Object obj2) {
        switch (this.f6094a) {
            case 0:
                throw new p7.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                Map.Entry entry = (Map.Entry) obj;
                p7.e eVar = (p7.e) obj2;
                eVar.a(f.f6460g, entry.getKey());
                eVar.a(f.f6461h, entry.getValue());
                return;
            default:
                throw new p7.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
