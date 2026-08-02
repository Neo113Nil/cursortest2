package S0;

import D.x;
import a.AbstractC0426a;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.internal.ads.Wv;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import u.AbstractC5050e;
import z0.C5220i;

/* loaded from: classes.dex */
public final class b extends s.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2900d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(WorkDatabase workDatabase, int i) {
        super(workDatabase);
        this.f2900d = i;
    }

    @Override // s.j
    public final String l() {
        switch (this.f2900d) {
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

    public final void p(C5220i c5220i, Object obj) {
        int i;
        int i4;
        byte[] byteArray;
        switch (this.f2900d) {
            case 0:
                a aVar = (a) obj;
                c5220i.c(1, aVar.f2898a);
                String str = aVar.f2899b;
                if (str == null) {
                    c5220i.o(2);
                    return;
                } else {
                    c5220i.c(2, str);
                    return;
                }
            case 1:
                d dVar = (d) obj;
                c5220i.c(1, dVar.f2904a);
                c5220i.g(2, dVar.f2905b.longValue());
                return;
            case 2:
                String str2 = ((g) obj).f2912a;
                if (str2 == null) {
                    c5220i.o(1);
                } else {
                    c5220i.c(1, str2);
                }
                c5220i.g(2, r2.f2913b);
                c5220i.g(3, r2.f2914c);
                return;
            case 3:
                k kVar = (k) obj;
                String str3 = kVar.f2923a;
                if (str3 == null) {
                    c5220i.o(1);
                } else {
                    c5220i.c(1, str3);
                }
                c5220i.c(2, kVar.f2924b);
                return;
            case 4:
                m mVar = (m) obj;
                String str4 = mVar.f2928a;
                if (str4 == null) {
                    c5220i.o(1);
                } else {
                    c5220i.c(1, str4);
                }
                byte[] c9 = J0.g.c(mVar.f2929b);
                if (c9 == null) {
                    c5220i.o(2);
                    return;
                } else {
                    c5220i.h(2, c9);
                    return;
                }
            case 5:
                p pVar = (p) obj;
                String str5 = pVar.f2937a;
                int i6 = 1;
                if (str5 == null) {
                    c5220i.o(1);
                } else {
                    c5220i.c(1, str5);
                }
                c5220i.g(2, AbstractC0426a.o(pVar.f2938b));
                String str6 = pVar.f2939c;
                if (str6 == null) {
                    c5220i.o(3);
                } else {
                    c5220i.c(3, str6);
                }
                String str7 = pVar.f2940d;
                if (str7 == null) {
                    c5220i.o(4);
                } else {
                    c5220i.c(4, str7);
                }
                byte[] c10 = J0.g.c(pVar.f2941e);
                if (c10 == null) {
                    c5220i.o(5);
                } else {
                    c5220i.h(5, c10);
                }
                byte[] c11 = J0.g.c(pVar.f2942f);
                if (c11 == null) {
                    c5220i.o(6);
                } else {
                    c5220i.h(6, c11);
                }
                c5220i.g(7, pVar.f2943g);
                c5220i.g(8, pVar.f2944h);
                c5220i.g(9, pVar.i);
                c5220i.g(10, pVar.f2946k);
                int i9 = pVar.f2947l;
                Wv.n(i9, "backoffPolicy");
                int d9 = AbstractC5050e.d(i9);
                if (d9 == 0) {
                    i = 0;
                } else {
                    if (d9 != 1) {
                        throw new B0.c();
                    }
                    i = 1;
                }
                c5220i.g(11, i);
                c5220i.g(12, pVar.f2948m);
                c5220i.g(13, pVar.f2949n);
                c5220i.g(14, pVar.f2950o);
                c5220i.g(15, pVar.f2951p);
                c5220i.g(16, pVar.f2952q ? 1L : 0L);
                int i10 = pVar.f2953r;
                Wv.n(i10, "policy");
                int d10 = AbstractC5050e.d(i10);
                if (d10 == 0) {
                    i4 = 0;
                } else {
                    if (d10 != 1) {
                        throw new B0.c();
                    }
                    i4 = 1;
                }
                c5220i.g(17, i4);
                c5220i.g(18, pVar.f2954s);
                c5220i.g(19, pVar.f2955t);
                J0.d dVar2 = pVar.f2945j;
                if (dVar2 == null) {
                    c5220i.o(20);
                    c5220i.o(21);
                    c5220i.o(22);
                    c5220i.o(23);
                    c5220i.o(24);
                    c5220i.o(25);
                    c5220i.o(26);
                    c5220i.o(27);
                    return;
                }
                int i11 = dVar2.f1403a;
                Wv.n(i11, "networkType");
                int d11 = AbstractC5050e.d(i11);
                if (d11 == 0) {
                    i6 = 0;
                } else if (d11 != 1) {
                    if (d11 == 2) {
                        i6 = 2;
                    } else if (d11 == 3) {
                        i6 = 3;
                    } else if (d11 == 4) {
                        i6 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || i11 != 6) {
                            throw new IllegalArgumentException("Could not convert " + x.y(i11) + " to int");
                        }
                        i6 = 5;
                    }
                }
                c5220i.g(20, i6);
                c5220i.g(21, dVar2.f1404b ? 1L : 0L);
                c5220i.g(22, dVar2.f1405c ? 1L : 0L);
                c5220i.g(23, dVar2.f1406d ? 1L : 0L);
                c5220i.g(24, dVar2.f1407e ? 1L : 0L);
                c5220i.g(25, dVar2.f1408f);
                c5220i.g(26, dVar2.f1409g);
                Set<J0.c> triggers = dVar2.f1410h;
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
                                objectOutputStream.writeUTF(cVar.f1401a.toString());
                                objectOutputStream.writeBoolean(cVar.f1402b);
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
                            com.bumptech.glide.d.h(byteArrayOutputStream, th);
                            throw th2;
                        }
                    }
                }
                c5220i.h(27, byteArray);
                return;
            default:
                r rVar = (r) obj;
                String str8 = rVar.f2966a;
                if (str8 == null) {
                    c5220i.o(1);
                } else {
                    c5220i.c(1, str8);
                }
                c5220i.c(2, rVar.f2967b);
                return;
        }
    }

    public final void q(Object obj) {
        C5220i a9 = a();
        try {
            p(a9, obj);
            a9.f42220u.executeInsert();
        } finally {
            n(a9);
        }
    }
}
