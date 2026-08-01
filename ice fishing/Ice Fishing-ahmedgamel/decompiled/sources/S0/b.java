package S0;

import D.y;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import com.icefishing.icefishingbigwin.AbstractC4404f;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import u.AbstractC5049e;
import z0.C5253i;

/* loaded from: classes.dex */
public final class b extends s.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2773d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(WorkDatabase workDatabase, int i) {
        super(workDatabase);
        this.f2773d = i;
    }

    @Override // s.j
    public final String l() {
        switch (this.f2773d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
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

    public final void p(C5253i c5253i, Object obj) {
        int i;
        int i6;
        byte[] byteArray;
        switch (this.f2773d) {
            case 0:
                a aVar = (a) obj;
                c5253i.c(1, aVar.f2771a);
                String str = aVar.f2772b;
                if (str == null) {
                    c5253i.o(2);
                    return;
                } else {
                    c5253i.c(2, str);
                    return;
                }
            case 1:
                d dVar = (d) obj;
                c5253i.c(1, dVar.f2777a);
                c5253i.g(2, dVar.f2778b.longValue());
                return;
            case 2:
                String str2 = ((g) obj).f2783a;
                if (str2 == null) {
                    c5253i.o(1);
                } else {
                    c5253i.c(1, str2);
                }
                c5253i.g(2, r2.f2784b);
                c5253i.g(3, r2.f2785c);
                return;
            case 3:
                k kVar = (k) obj;
                String str3 = kVar.f2794a;
                if (str3 == null) {
                    c5253i.o(1);
                } else {
                    c5253i.c(1, str3);
                }
                c5253i.c(2, kVar.f2795b);
                return;
            case 4:
                m mVar = (m) obj;
                String str4 = mVar.f2799a;
                if (str4 == null) {
                    c5253i.o(1);
                } else {
                    c5253i.c(1, str4);
                }
                byte[] c9 = J0.h.c(mVar.f2800b);
                if (c9 == null) {
                    c5253i.o(2);
                    return;
                } else {
                    c5253i.h(2, c9);
                    return;
                }
            case 5:
                p pVar = (p) obj;
                String str5 = pVar.f2808a;
                int i9 = 1;
                if (str5 == null) {
                    c5253i.o(1);
                } else {
                    c5253i.c(1, str5);
                }
                c5253i.g(2, com.bumptech.glide.f.A(pVar.f2809b));
                String str6 = pVar.f2810c;
                if (str6 == null) {
                    c5253i.o(3);
                } else {
                    c5253i.c(3, str6);
                }
                String str7 = pVar.f2811d;
                if (str7 == null) {
                    c5253i.o(4);
                } else {
                    c5253i.c(4, str7);
                }
                byte[] c10 = J0.h.c(pVar.f2812e);
                if (c10 == null) {
                    c5253i.o(5);
                } else {
                    c5253i.h(5, c10);
                }
                byte[] c11 = J0.h.c(pVar.f2813f);
                if (c11 == null) {
                    c5253i.o(6);
                } else {
                    c5253i.h(6, c11);
                }
                c5253i.g(7, pVar.f2814g);
                c5253i.g(8, pVar.f2815h);
                c5253i.g(9, pVar.i);
                c5253i.g(10, pVar.f2817k);
                int i10 = pVar.f2818l;
                AbstractC4404f.l(i10, "backoffPolicy");
                int d2 = AbstractC5049e.d(i10);
                if (d2 == 0) {
                    i = 0;
                } else {
                    if (d2 != 1) {
                        throw new B0.c();
                    }
                    i = 1;
                }
                c5253i.g(11, i);
                c5253i.g(12, pVar.f2819m);
                c5253i.g(13, pVar.f2820n);
                c5253i.g(14, pVar.f2821o);
                c5253i.g(15, pVar.f2822p);
                c5253i.g(16, pVar.f2823q ? 1L : 0L);
                int i11 = pVar.f2824r;
                AbstractC4404f.l(i11, "policy");
                int d9 = AbstractC5049e.d(i11);
                if (d9 == 0) {
                    i6 = 0;
                } else {
                    if (d9 != 1) {
                        throw new B0.c();
                    }
                    i6 = 1;
                }
                c5253i.g(17, i6);
                c5253i.g(18, pVar.f2825s);
                c5253i.g(19, pVar.f2826t);
                J0.d dVar2 = pVar.f2816j;
                if (dVar2 == null) {
                    c5253i.o(20);
                    c5253i.o(21);
                    c5253i.o(22);
                    c5253i.o(23);
                    c5253i.o(24);
                    c5253i.o(25);
                    c5253i.o(26);
                    c5253i.o(27);
                    return;
                }
                int i12 = dVar2.f1374a;
                AbstractC4404f.l(i12, "networkType");
                int d10 = AbstractC5049e.d(i12);
                if (d10 == 0) {
                    i9 = 0;
                } else if (d10 != 1) {
                    if (d10 == 2) {
                        i9 = 2;
                    } else if (d10 == 3) {
                        i9 = 3;
                    } else if (d10 == 4) {
                        i9 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || i12 != 6) {
                            throw new IllegalArgumentException("Could not convert " + y.y(i12) + " to int");
                        }
                        i9 = 5;
                    }
                }
                c5253i.g(20, i9);
                c5253i.g(21, dVar2.f1375b ? 1L : 0L);
                c5253i.g(22, dVar2.f1376c ? 1L : 0L);
                c5253i.g(23, dVar2.f1377d ? 1L : 0L);
                c5253i.g(24, dVar2.f1378e ? 1L : 0L);
                c5253i.g(25, dVar2.f1379f);
                c5253i.g(26, dVar2.f1380g);
                Set<J0.c> triggers = dVar2.f1381h;
                kotlin.jvm.internal.h.e(triggers, "triggers");
                if (triggers.isEmpty()) {
                    byteArray = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            objectOutputStream.writeInt(triggers.size());
                            for (J0.c cVar : triggers) {
                                objectOutputStream.writeUTF(cVar.f1372a.toString());
                                objectOutputStream.writeBoolean(cVar.f1373b);
                            }
                            objectOutputStream.close();
                            byteArrayOutputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                            kotlin.jvm.internal.h.d(byteArray, "outputStream.toByteArray()");
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            com.bumptech.glide.d.c(byteArrayOutputStream, th);
                            throw th2;
                        }
                    }
                }
                c5253i.h(27, byteArray);
                return;
            default:
                r rVar = (r) obj;
                String str8 = rVar.f2837a;
                if (str8 == null) {
                    c5253i.o(1);
                } else {
                    c5253i.c(1, str8);
                }
                c5253i.c(2, rVar.f2838b);
                return;
        }
    }

    public final void q(Object obj) {
        C5253i a9 = a();
        try {
            p(a9, obj);
            a9.f42249u.executeInsert();
        } finally {
            n(a9);
        }
    }
}
