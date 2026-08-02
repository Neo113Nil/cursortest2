package defpackage;

import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import com.yandex.xplat.payment.sdk.MerchantAddress;
import com.yandex.xplat.payment.sdk.MerchantInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.d;

/* loaded from: classes2.dex */
public final /* synthetic */ class ws00 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ ws00(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        wj00 wj00Var;
        ArrayList o0;
        int i = this.a;
        MerchantAddress merchantAddress = null;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                b bVar = (b) obj;
                d dVar = bVar instanceof d ? (d) bVar : null;
                return String.valueOf(dVar != null ? qcx.g(dVar) : null);
            case 1:
                it00 it00Var = it00.b;
                return null;
            case 2:
                it00 it00Var2 = it00.b;
                return null;
            case 3:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 4:
                return new pbv((String) obj, (ccv) null, rev.e, (dcv) null, (vfv) null, 58);
            case 5:
                ((Integer) obj).getClass();
                return Boolean.TRUE;
            case 6:
                xby.d.h("MasstransitCheckout", "Error while loading masstransit checkout order", (Throwable) obj);
                return zy11Var;
            case 7:
                xby.d.h("MasstransitCheckout", "Error while masstransit checkout trip checkout", (Throwable) obj);
                return zy11Var;
            case 8:
                xby.d.h("MasstransitCheckout", "Error while masstransit checkout trip copy", (Throwable) obj);
                return zy11Var;
            case 9:
                xby.d.h("MasstransitCheckout", "Error while loading masstransit checkout trip", (Throwable) obj);
                return zy11Var;
            case 10:
                xby.d.h("MasstransitCheckout", "Error while init masstransit checkout trip", (Throwable) obj);
                return zy11Var;
            case 11:
                xby.d.h("MasstransitCheckout", "Error while masstransit checkout search", (Throwable) obj);
                return zy11Var;
            case 12:
                xby.d.h("MasstransitCheckout", "Error while masstransit checkout search", (Throwable) obj);
                return zy11Var;
            case 13:
                xby.d.h("MasstransitCheckout", "Error while updating masstransit checkout trip", (Throwable) obj);
                return zy11Var;
            case 14:
                xby.d.j((Throwable) obj);
                return zy11Var;
            case 15:
                return ((sl) obj).a;
            case 16:
                return new pbv((dcv) null, (dcv) null, (tev) rev.n, (vfv) h2b1.G, (String) obj, false);
            case 17:
                return new pbv((String) obj, (ccv) null, rev.k, (dcv) null, (vfv) null, 58);
            case 18:
                return new pbv((dcv) new ccv(txg0.ybsdk_ic_yb_placeholder), (dcv) new ccv(txg0.ybsdk_ic_yb_placeholder), (tev) rev.p, (vfv) h2b1.G, (String) obj, false);
            case 19:
                return new pbv((String) obj, (ccv) null, rev.p, (dcv) null, (vfv) null, 58);
            case 20:
                wj00 b = ((y3x) obj).b();
                return new MerchantAddress(b.p("city"), b.p("country"), b.p("home"), b.p("street"), b.p("zip"));
            case 21:
                wj00 b2 = ((y3x) obj).b();
                String p = b2.p("name");
                String p2 = b2.p("schedule_text");
                String p3 = b2.p("ogrn");
                y3x d = b2.d("legal_address");
                if (d == null || (wj00Var = d.a()) == null) {
                    wj00Var = null;
                }
                if (wj00Var != null) {
                    MerchantAddress.Companion.getClass();
                    merchantAddress = (MerchantAddress) mbb1.d(wj00Var, new ws00(20)).d();
                }
                return new MerchantInfo(p, p2, p3, merchantAddress);
            case 22:
                return ((ro10) obj).b;
            case 23:
                return ((ro10) obj).b;
            case 24:
                gq10 gq10Var = (gq10) obj;
                List list = gq10Var.c;
                u8j0 u8j0Var = (u8j0) a.b0(list);
                if ((u8j0Var instanceof s8j0) || (u8j0Var instanceof t8j0)) {
                    o0 = a.o0(a.K(list), new t8j0());
                } else {
                    if (!(u8j0Var instanceof r8j0) && u8j0Var != null) {
                        w511.b();
                        return null;
                    }
                    o0 = a.o0(list, new t8j0());
                }
                return gq10.a(gq10Var, null, null, o0, null, 11);
            case 25:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 26:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 27:
                ull0 T0 = ((oll0) obj).T0("\n        SELECT phoneId, userId, shownName, phone\n        FROM (\n            SELECT -- remote contacts\n                remotes_phone_id AS phoneId,\n                user_id AS userId,\n                COALESCE(remotes_contact_name, display_name) AS shownName,\n                locals_phone AS phone\n            FROM remote_contacts\n                INNER JOIN users ON user_id = remotes_user_id\n                LEFT JOIN local_contacts ON locals_phone_id = remotes_phone_id\n                    AND locals_deleted = 0\n\n            WHERE remotes_deleted = 0 AND deleted != 1\n\n            UNION ALL\n\n            SELECT phoneId, userId, shownName, phone -- 'invites'\n            FROM (\n                SELECT\n                    locals_last_time_contacted,\n                    locals_phone_id AS phoneId,\n                    NULL AS userId,\n                    locals_display_name AS shownName,\n                    locals_phone AS phone\n                FROM local_contacts\n                WHERE locals_phone_id IS NOT NULL\n                    AND locals_display_name IS NOT NULL\n                    AND locals_deleted = 0\n                    AND locals_phone_id NOT IN (SELECT remotes_phone_id FROM remote_contacts WHERE remotes_deleted = 0)\n                ORDER BY locals_last_time_contacted DESC\n            )\n        )\n        GROUP BY phoneId\n        ORDER BY shownName\n        LIMIT 6000\n    ");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        arrayList.add(new peb0(T0.Y1(0), T0.isNull(1) ? null : T0.Y1(1), T0.Y1(2), T0.isNull(3) ? null : T0.Y1(3)));
                    }
                    return arrayList;
                } finally {
                    T0.close();
                }
            case 28:
                return j73.v((ReducedUserInfo[]) obj);
            default:
                return ((ReducedUserInfo) obj).userId;
        }
    }
}
