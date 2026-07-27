package S0;

import D.y;
import a.AbstractC0415a;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.ads.CL;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import u.AbstractC5088e;
import z0.C5266i;

/* loaded from: classes.dex */
public final class b extends s.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2884d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(WorkDatabase workDatabase, int i) {
        super(workDatabase);
        this.f2884d = i;
    }

    @Override // s.j
    public final String l() {
        switch (this.f2884d) {
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

    public final void p(C5266i c5266i, Object obj) {
        int i;
        int i4;
        byte[] byteArray;
        switch (this.f2884d) {
            case 0:
                a aVar = (a) obj;
                c5266i.c(1, aVar.f2882a);
                String str = aVar.f2883b;
                if (str == null) {
                    c5266i.o(2);
                    return;
                } else {
                    c5266i.c(2, str);
                    return;
                }
            case 1:
                d dVar = (d) obj;
                c5266i.c(1, dVar.f2888a);
                c5266i.h(2, dVar.f2889b.longValue());
                return;
            case 2:
                String str2 = ((g) obj).f2896a;
                if (str2 == null) {
                    c5266i.o(1);
                } else {
                    c5266i.c(1, str2);
                }
                c5266i.h(2, r2.f2897b);
                c5266i.h(3, r2.f2898c);
                return;
            case 3:
                k kVar = (k) obj;
                String str3 = kVar.f2907a;
                if (str3 == null) {
                    c5266i.o(1);
                } else {
                    c5266i.c(1, str3);
                }
                c5266i.c(2, kVar.f2908b);
                return;
            case 4:
                m mVar = (m) obj;
                String str4 = mVar.f2912a;
                if (str4 == null) {
                    c5266i.o(1);
                } else {
                    c5266i.c(1, str4);
                }
                byte[] c4 = J0.h.c(mVar.f2913b);
                if (c4 == null) {
                    c5266i.o(2);
                    return;
                } else {
                    c5266i.l(2, c4);
                    return;
                }
            case 5:
                p pVar = (p) obj;
                String str5 = pVar.f2920a;
                int i9 = 1;
                if (str5 == null) {
                    c5266i.o(1);
                } else {
                    c5266i.c(1, str5);
                }
                c5266i.h(2, W2.e.q(pVar.f2921b));
                String str6 = pVar.f2922c;
                if (str6 == null) {
                    c5266i.o(3);
                } else {
                    c5266i.c(3, str6);
                }
                String str7 = pVar.f2923d;
                if (str7 == null) {
                    c5266i.o(4);
                } else {
                    c5266i.c(4, str7);
                }
                byte[] c9 = J0.h.c(pVar.f2924e);
                if (c9 == null) {
                    c5266i.o(5);
                } else {
                    c5266i.l(5, c9);
                }
                byte[] c10 = J0.h.c(pVar.f2925f);
                if (c10 == null) {
                    c5266i.o(6);
                } else {
                    c5266i.l(6, c10);
                }
                c5266i.h(7, pVar.f2926g);
                c5266i.h(8, pVar.f2927h);
                c5266i.h(9, pVar.i);
                c5266i.h(10, pVar.f2929k);
                int i10 = pVar.f2930l;
                CL.o(i10, "backoffPolicy");
                int d2 = AbstractC5088e.d(i10);
                if (d2 == 0) {
                    i = 0;
                } else {
                    if (d2 != 1) {
                        throw new B0.c();
                    }
                    i = 1;
                }
                c5266i.h(11, i);
                c5266i.h(12, pVar.f2931m);
                c5266i.h(13, pVar.f2932n);
                c5266i.h(14, pVar.f2933o);
                c5266i.h(15, pVar.f2934p);
                c5266i.h(16, pVar.f2935q ? 1L : 0L);
                int i11 = pVar.f2936r;
                CL.o(i11, "policy");
                int d3 = AbstractC5088e.d(i11);
                if (d3 == 0) {
                    i4 = 0;
                } else {
                    if (d3 != 1) {
                        throw new B0.c();
                    }
                    i4 = 1;
                }
                c5266i.h(17, i4);
                c5266i.h(18, pVar.f2937s);
                c5266i.h(19, pVar.f2938t);
                J0.d dVar2 = pVar.f2928j;
                if (dVar2 == null) {
                    c5266i.o(20);
                    c5266i.o(21);
                    c5266i.o(22);
                    c5266i.o(23);
                    c5266i.o(24);
                    c5266i.o(25);
                    c5266i.o(26);
                    c5266i.o(27);
                    return;
                }
                int i12 = dVar2.f1299a;
                CL.o(i12, "networkType");
                int d9 = AbstractC5088e.d(i12);
                if (d9 == 0) {
                    i9 = 0;
                } else if (d9 != 1) {
                    if (d9 == 2) {
                        i9 = 2;
                    } else if (d9 == 3) {
                        i9 = 3;
                    } else if (d9 == 4) {
                        i9 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || i12 != 6) {
                            throw new IllegalArgumentException("Could not convert " + y.s(i12) + " to int");
                        }
                        i9 = 5;
                    }
                }
                c5266i.h(20, i9);
                c5266i.h(21, dVar2.f1300b ? 1L : 0L);
                c5266i.h(22, dVar2.f1301c ? 1L : 0L);
                c5266i.h(23, dVar2.f1302d ? 1L : 0L);
                c5266i.h(24, dVar2.f1303e ? 1L : 0L);
                c5266i.h(25, dVar2.f1304f);
                c5266i.h(26, dVar2.f1305g);
                Set<J0.c> triggers = dVar2.f1306h;
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
                                objectOutputStream.writeUTF(cVar.f1297a.toString());
                                objectOutputStream.writeBoolean(cVar.f1298b);
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
                            AbstractC0415a.h(byteArrayOutputStream, th);
                            throw th2;
                        }
                    }
                }
                c5266i.l(27, byteArray);
                return;
            default:
                r rVar = (r) obj;
                String str8 = rVar.f2949a;
                if (str8 == null) {
                    c5266i.o(1);
                } else {
                    c5266i.c(1, str8);
                }
                c5266i.c(2, rVar.f2950b);
                return;
        }
    }

    public final void q(Object obj) {
        C5266i a9 = a();
        try {
            p(a9, obj);
            a9.f42131u.executeInsert();
        } finally {
            n(a9);
        }
    }
}
