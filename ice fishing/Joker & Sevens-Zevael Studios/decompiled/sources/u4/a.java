package u4;

import android.os.Build;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import pc.j;
import v4.e;
import x4.p;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6688f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(e eVar, int i10) {
        super(eVar);
        this.f6688f = i10;
    }

    @Override // u4.b
    public final boolean a(p pVar) {
        switch (this.f6688f) {
            case 0:
                j.e(pVar, "workSpec");
                return pVar.f8331j.f5197b;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                j.e(pVar, "workSpec");
                return pVar.f8331j.f5199d;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                j.e(pVar, "workSpec");
                return pVar.f8331j.f5196a == 2;
            case 3:
                j.e(pVar, "workSpec");
                int i10 = pVar.f8331j.f5196a;
                return i10 == 3 || (Build.VERSION.SDK_INT >= 30 && i10 == 6);
            default:
                j.e(pVar, "workSpec");
                return pVar.f8331j.f5200e;
        }
    }

    @Override // u4.b
    public final boolean b(Object obj) {
        boolean booleanValue;
        switch (this.f6688f) {
            case 0:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                t4.a aVar = (t4.a) obj;
                j.e(aVar, "value");
                return (aVar.f6518a && aVar.f6519b) ? false : true;
            case 3:
                t4.a aVar2 = (t4.a) obj;
                j.e(aVar2, "value");
                return !aVar2.f6518a || aVar2.f6520c;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !booleanValue;
    }
}
