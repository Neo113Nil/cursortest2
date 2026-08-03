package hd;

import android.content.Context;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import rd.d0;
import vd.q;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class h implements yb.c {

    /* renamed from: a, reason: collision with root package name */
    public final g f2893a;

    /* renamed from: b, reason: collision with root package name */
    public final i f2894b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2895c;

    public h(g gVar, i iVar, int i10) {
        this.f2893a = gVar;
        this.f2894b = iVar;
        this.f2895c = i10;
    }

    @Override // zb.a
    public final Object get() {
        g gVar = this.f2893a;
        int i10 = this.f2895c;
        switch (i10) {
            case 0:
                return new sd.k((id.i) gVar.f2891e.get());
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return new d0((id.i) gVar.f2891e.get());
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return new td.f((id.i) gVar.f2891e.get());
            case 3:
                return new be.a((md.a) gVar.f2892f.get());
            case 4:
                return new ud.i();
            case 5:
                return new q((id.i) gVar.f2891e.get());
            case 6:
                g gVar2 = this.f2894b.f2896a;
                ld.b bVar = new ld.b((md.a) gVar2.f2892f.get());
                Context context = gVar2.f2887a.f5771a;
                return new yd.a(new a5.c(bVar, new ld.b(context), new ld.b(context)));
            case 7:
                return new zd.f((id.i) gVar.f2891e.get());
            default:
                throw new AssertionError(i10);
        }
    }
}
