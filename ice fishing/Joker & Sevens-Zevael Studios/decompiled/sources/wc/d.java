package wc;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Iterator;
import s.e0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7716a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7717b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7718c;

    public /* synthetic */ d(int i10, Object obj, oc.c cVar) {
        this.f7716a = i10;
        this.f7717b = obj;
        this.f7718c = cVar;
    }

    @Override // wc.e
    public final Iterator iterator() {
        switch (this.f7716a) {
            case 0:
                return new c(this);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new e0(this);
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return new j(this);
            default:
                return new xc.b(this);
        }
    }

    public d(CharSequence charSequence, a1.g gVar) {
        this.f7716a = 3;
        pc.j.e(charSequence, "input");
        this.f7717b = charSequence;
        this.f7718c = gVar;
    }
}
