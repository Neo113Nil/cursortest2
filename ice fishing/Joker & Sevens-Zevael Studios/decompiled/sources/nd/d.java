package nd;

import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements oc.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5087g;

    public /* synthetic */ d(int i10) {
        this.f5087g = i10;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // oc.c
    public final Object invoke(Object obj) {
        switch (this.f5087g) {
            case 0:
                return new l((Long) obj);
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                oc.c cVar = (oc.c) obj;
                pc.j.e(cVar, "emit");
                cVar.invoke("power_ups");
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                oc.c cVar2 = (oc.c) obj;
                pc.j.e(cVar2, "emit");
                cVar2.invoke("player_data");
                break;
            case 3:
                oc.c cVar3 = (oc.c) obj;
                pc.j.e(cVar3, "emit");
                cVar3.invoke("power_ups");
                break;
            case 4:
                oc.c cVar4 = (oc.c) obj;
                pc.j.e(cVar4, "emit");
                cVar4.invoke("stored_uuid");
                break;
            case 5:
                g5.a aVar = (g5.a) obj;
                pc.j.e(aVar, "cursor");
                return new l(aVar.a(0));
            case 6:
                oc.c cVar5 = (oc.c) obj;
                pc.j.e(cVar5, "emit");
                cVar5.invoke("player_data");
                break;
            case 7:
                oc.c cVar6 = (oc.c) obj;
                pc.j.e(cVar6, "emit");
                cVar6.invoke("power_ups");
                break;
            case 8:
                oc.c cVar7 = (oc.c) obj;
                pc.j.e(cVar7, "emit");
                cVar7.invoke("player_data");
                break;
            case 9:
                oc.c cVar8 = (oc.c) obj;
                pc.j.e(cVar8, "emit");
                cVar8.invoke("high_scores");
                break;
            case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                return new v0.d((Map) obj);
            case 11:
                return obj;
            case 12:
                synchronized (w0.m.f7580c) {
                    ?? r22 = w0.m.f7586i;
                    int size = r22.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((oc.c) r22.get(i10)).invoke(obj);
                    }
                    break;
                }
            default:
                d dVar = w0.m.f7578a;
                break;
        }
        return ac.o.f277a;
    }
}
