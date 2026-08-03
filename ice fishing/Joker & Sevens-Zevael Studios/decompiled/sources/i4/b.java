package i4;

import ac.o;
import android.database.sqlite.SQLiteQuery;
import android.view.ViewStructure;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import m0.r;
import pc.j;
import pc.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends k implements oc.g {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3169g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3170h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, Object obj) {
        super(4);
        this.f3169g = i10;
        this.f3170h = obj;
    }

    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, java.util.List] */
    @Override // oc.g
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        switch (this.f3169g) {
            case 0:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                h4.f fVar = (h4.f) this.f3170h;
                j.b(sQLiteQuery);
                fVar.b(new h(sQLiteQuery));
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                String str = (String) obj;
                oc.e eVar = (oc.e) obj2;
                r rVar = (r) obj3;
                int intValue = ((Number) obj4).intValue();
                j.e(str, "suffixKey");
                j.e(eVar, "content");
                if ((intValue & 14) == 0) {
                    i10 = (rVar.f(str) ? 4 : 2) | intValue;
                } else {
                    i10 = intValue;
                }
                if ((intValue & 112) == 0) {
                    i10 |= rVar.h(eVar) ? 32 : 16;
                }
                if ((i10 & 731) == 146 && rVar.B()) {
                    rVar.S();
                } else {
                    ((u0.d) this.f3170h).d(str, eVar, rVar, Integer.valueOf(i10 & 126));
                }
                break;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                int intValue2 = ((Number) obj).intValue();
                int intValue3 = ((Number) obj2).intValue();
                ((ViewStructure) this.f3170h).setDimens(intValue2, intValue3, 0, 0, ((Number) obj3).intValue() - intValue2, ((Number) obj4).intValue() - intValue3);
                break;
            default:
                a0.c cVar = (a0.c) obj;
                int intValue4 = ((Number) obj2).intValue();
                r rVar2 = (r) obj3;
                int intValue5 = ((Number) obj4).intValue();
                if ((intValue5 & 6) == 0) {
                    i11 = (rVar2.f(cVar) ? 4 : 2) | intValue5;
                } else {
                    i11 = intValue5;
                }
                if ((intValue5 & 48) == 0) {
                    i11 |= rVar2.d(intValue4) ? 32 : 16;
                }
                if ((i11 & 147) == 146 && rVar2.B()) {
                    rVar2.S();
                } else {
                    zd.c cVar2 = (zd.c) this.f3170h.get(intValue4);
                    rVar2.X(-1580938620);
                    uc.e.c(intValue4 + 1, cVar2, rVar2, 0);
                    rVar2.q(false);
                }
                break;
        }
        return o.f277a;
    }
}
