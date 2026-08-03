package x4;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import bc.a0;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import u.l0;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends b4.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8289d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(WorkDatabase workDatabase, int i10) {
        super(workDatabase);
        this.f8289d = i10;
    }

    @Override // b4.q
    public final String c() {
        switch (this.f8289d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public final void e(i4.i iVar, Object obj) {
        int i10;
        int i11;
        byte[] byteArray;
        switch (this.f8289d) {
            case 0:
                a aVar = (a) obj;
                iVar.c(aVar.f8287a, 1);
                String str = aVar.f8288b;
                if (str == null) {
                    iVar.h(2);
                    return;
                } else {
                    iVar.c(str, 2);
                    return;
                }
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                d dVar = (d) obj;
                iVar.c(dVar.f8292a, 1);
                iVar.n(2, dVar.f8293b.longValue());
                return;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                String str2 = ((g) obj).f8299a;
                if (str2 == null) {
                    iVar.h(1);
                } else {
                    iVar.c(str2, 1);
                }
                iVar.n(2, r2.f8300b);
                iVar.n(3, r2.f8301c);
                return;
            case 3:
                k kVar = (k) obj;
                String str3 = kVar.f8309a;
                if (str3 == null) {
                    iVar.h(1);
                } else {
                    iVar.c(str3, 1);
                }
                iVar.c(kVar.f8310b, 2);
                return;
            case 4:
                m mVar = (m) obj;
                String str4 = mVar.f8314a;
                if (str4 == null) {
                    iVar.h(1);
                } else {
                    iVar.c(str4, 1);
                }
                byte[] c3 = o4.e.c(mVar.f8315b);
                if (c3 == null) {
                    iVar.h(2);
                    return;
                } else {
                    iVar.p(2, c3);
                    return;
                }
            case 5:
                p pVar = (p) obj;
                String str5 = pVar.f8322a;
                int i12 = 1;
                if (str5 == null) {
                    iVar.h(1);
                } else {
                    iVar.c(str5, 1);
                }
                iVar.n(2, l0.r(pVar.f8323b));
                String str6 = pVar.f8324c;
                if (str6 == null) {
                    iVar.h(3);
                } else {
                    iVar.c(str6, 3);
                }
                String str7 = pVar.f8325d;
                if (str7 == null) {
                    iVar.h(4);
                } else {
                    iVar.c(str7, 4);
                }
                byte[] c7 = o4.e.c(pVar.f8326e);
                if (c7 == null) {
                    iVar.h(5);
                } else {
                    iVar.p(5, c7);
                }
                byte[] c10 = o4.e.c(pVar.f8327f);
                if (c10 == null) {
                    iVar.h(6);
                } else {
                    iVar.p(6, c10);
                }
                iVar.n(7, pVar.f8328g);
                iVar.n(8, pVar.f8329h);
                iVar.n(9, pVar.f8330i);
                iVar.n(10, pVar.f8332k);
                int i13 = pVar.f8333l;
                a4.d.t("backoffPolicy", i13);
                int d10 = v.f.d(i13);
                if (d10 == 0) {
                    i10 = 0;
                } else {
                    if (d10 != 1) {
                        throw new ac.d();
                    }
                    i10 = 1;
                }
                iVar.n(11, i10);
                iVar.n(12, pVar.f8334m);
                iVar.n(13, pVar.f8335n);
                iVar.n(14, pVar.f8336o);
                iVar.n(15, pVar.f8337p);
                iVar.n(16, pVar.f8338q ? 1L : 0L);
                int i14 = pVar.f8339r;
                a4.d.t("policy", i14);
                int d11 = v.f.d(i14);
                if (d11 == 0) {
                    i11 = 0;
                } else {
                    if (d11 != 1) {
                        throw new ac.d();
                    }
                    i11 = 1;
                }
                iVar.n(17, i11);
                iVar.n(18, pVar.f8340s);
                iVar.n(19, pVar.f8341t);
                o4.d dVar2 = pVar.f8331j;
                if (dVar2 == null) {
                    iVar.h(20);
                    iVar.h(21);
                    iVar.h(22);
                    iVar.h(23);
                    iVar.h(24);
                    iVar.h(25);
                    iVar.h(26);
                    iVar.h(27);
                    return;
                }
                int i15 = dVar2.f5196a;
                a4.d.t("networkType", i15);
                int d12 = v.f.d(i15);
                if (d12 == 0) {
                    i12 = 0;
                } else if (d12 != 1) {
                    if (d12 == 2) {
                        i12 = 2;
                    } else if (d12 == 3) {
                        i12 = 3;
                    } else if (d12 == 4) {
                        i12 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || i15 != 6) {
                            throw new IllegalArgumentException("Could not convert " + a4.d.v(i15) + " to int");
                        }
                        i12 = 5;
                    }
                }
                iVar.n(20, i12);
                iVar.n(21, dVar2.f5197b ? 1L : 0L);
                iVar.n(22, dVar2.f5198c ? 1L : 0L);
                iVar.n(23, dVar2.f5199d ? 1L : 0L);
                iVar.n(24, dVar2.f5200e ? 1L : 0L);
                iVar.n(25, dVar2.f5201f);
                iVar.n(26, dVar2.f5202g);
                Set<o4.c> set = dVar2.f5203h;
                pc.j.e(set, "triggers");
                if (set.isEmpty()) {
                    byteArray = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            objectOutputStream.writeInt(set.size());
                            for (o4.c cVar : set) {
                                objectOutputStream.writeUTF(cVar.f5193a.toString());
                                objectOutputStream.writeBoolean(cVar.f5194b);
                            }
                            objectOutputStream.close();
                            byteArrayOutputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                            pc.j.d(byteArray, "outputStream.toByteArray()");
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            a0.f(byteArrayOutputStream, th);
                            throw th2;
                        }
                    }
                }
                iVar.p(27, byteArray);
                return;
            default:
                r rVar = (r) obj;
                String str8 = rVar.f8353a;
                if (str8 == null) {
                    iVar.h(1);
                } else {
                    iVar.c(str8, 1);
                }
                iVar.c(rVar.f8354b, 2);
                return;
        }
    }

    public final void f(Object obj) {
        i4.i a6 = a();
        try {
            e(a6, obj);
            a6.f3194h.executeInsert();
        } finally {
            d(a6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(WorkDatabase workDatabase) {
        super(workDatabase);
        this.f8289d = 1;
        pc.j.e(workDatabase, "database");
    }
}
