package com.gamericefishpro.space.u6;

import android.os.Build;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.l6.x;
import com.gamericefishpro.space.s5.t;
import com.gamericefishpro.space.s5.w;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends w {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(t tVar, int i) {
        super(tVar);
        this.d = i;
    }

    @Override // com.gamericefishpro.space.s5.w
    public final String c() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public final void e(com.gamericefishpro.space.e6.j jVar, Object obj) throws Throwable {
        int i;
        int i2;
        byte[] byteArray;
        int i3 = 3;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                a aVar = (a) obj;
                String str = aVar.a;
                if (str == null) {
                    jVar.p(1);
                } else {
                    jVar.i(1, str);
                }
                String str2 = aVar.b;
                if (str2 == null) {
                    jVar.p(2);
                    return;
                } else {
                    jVar.i(2, str2);
                    return;
                }
            case 1:
                d dVar = (d) obj;
                jVar.i(1, dVar.a);
                jVar.a(2, dVar.b.longValue());
                return;
            case 2:
                g gVar = (g) obj;
                String str3 = gVar.a;
                if (str3 == null) {
                    jVar.p(1);
                } else {
                    jVar.i(1, str3);
                }
                jVar.a(2, gVar.b);
                jVar.a(3, gVar.c);
                return;
            case 3:
                k kVar = (k) obj;
                String str4 = kVar.a;
                if (str4 == null) {
                    jVar.p(1);
                } else {
                    jVar.i(1, str4);
                }
                String str5 = kVar.b;
                if (str5 == null) {
                    jVar.p(2);
                    return;
                } else {
                    jVar.i(2, str5);
                    return;
                }
            case 4:
                m mVar = (m) obj;
                String str6 = mVar.a;
                if (str6 == null) {
                    jVar.p(1);
                } else {
                    jVar.i(1, str6);
                }
                byte[] bArrC = com.gamericefishpro.space.l6.g.c(mVar.b);
                if (bArrC == null) {
                    jVar.p(2);
                    return;
                } else {
                    jVar.G(2, bArrC);
                    return;
                }
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                p pVar = (p) obj;
                String str7 = pVar.a;
                if (str7 == null) {
                    jVar.p(1);
                } else {
                    jVar.i(1, str7);
                }
                jVar.a(2, com.gamericefishpro.space.i.a.P(pVar.b));
                String str8 = pVar.c;
                if (str8 == null) {
                    jVar.p(3);
                } else {
                    jVar.i(3, str8);
                }
                String str9 = pVar.d;
                if (str9 == null) {
                    jVar.p(4);
                } else {
                    jVar.i(4, str9);
                }
                byte[] bArrC2 = com.gamericefishpro.space.l6.g.c(pVar.e);
                if (bArrC2 == null) {
                    jVar.p(5);
                } else {
                    jVar.G(5, bArrC2);
                }
                byte[] bArrC3 = com.gamericefishpro.space.l6.g.c(pVar.f);
                if (bArrC3 == null) {
                    jVar.p(6);
                } else {
                    jVar.G(6, bArrC3);
                }
                jVar.a(7, pVar.g);
                jVar.a(8, pVar.h);
                jVar.a(9, pVar.i);
                jVar.a(10, pVar.k);
                com.gamericefishpro.space.l6.a backoffPolicy = pVar.l;
                Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
                int iOrdinal = backoffPolicy.ordinal();
                if (iOrdinal == 0) {
                    i = 0;
                } else {
                    if (iOrdinal != 1) {
                        throw new com.gamericefishpro.space.oh.k();
                    }
                    i = 1;
                }
                jVar.a(11, i);
                jVar.a(12, pVar.m);
                jVar.a(13, pVar.n);
                jVar.a(14, pVar.o);
                jVar.a(15, pVar.p);
                jVar.a(16, pVar.q ? 1L : 0L);
                x policy = pVar.r;
                Intrinsics.checkNotNullParameter(policy, "policy");
                int iOrdinal2 = policy.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = 0;
                } else {
                    if (iOrdinal2 != 1) {
                        throw new com.gamericefishpro.space.oh.k();
                    }
                    i2 = 1;
                }
                jVar.a(17, i2);
                jVar.a(18, pVar.s);
                jVar.a(19, pVar.t);
                com.gamericefishpro.space.l6.e eVar = pVar.j;
                if (eVar == null) {
                    jVar.p(20);
                    jVar.p(21);
                    jVar.p(22);
                    jVar.p(23);
                    jVar.p(24);
                    jVar.p(25);
                    jVar.p(26);
                    jVar.p(27);
                    return;
                }
                com.gamericefishpro.space.l6.r networkType = eVar.a;
                Intrinsics.checkNotNullParameter(networkType, "networkType");
                int iOrdinal3 = networkType.ordinal();
                if (iOrdinal3 == 0) {
                    i3 = 0;
                } else if (iOrdinal3 == 1) {
                    i3 = 1;
                } else if (iOrdinal3 == 2) {
                    i3 = 2;
                } else if (iOrdinal3 != 3) {
                    if (iOrdinal3 == 4) {
                        i3 = 4;
                    } else {
                        if (Build.VERSION.SDK_INT < 30 || networkType != com.gamericefishpro.space.l6.r.y) {
                            throw new IllegalArgumentException("Could not convert " + networkType + " to int");
                        }
                        i3 = 5;
                    }
                }
                jVar.a(20, i3);
                jVar.a(21, eVar.b ? 1L : 0L);
                jVar.a(22, eVar.c ? 1L : 0L);
                jVar.a(23, eVar.d ? 1L : 0L);
                jVar.a(24, eVar.e ? 1L : 0L);
                jVar.a(25, eVar.f);
                jVar.a(26, eVar.g);
                Set<com.gamericefishpro.space.l6.d> triggers = eVar.h;
                Intrinsics.checkNotNullParameter(triggers, "triggers");
                if (triggers.isEmpty()) {
                    byteArray = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                        try {
                            objectOutputStream.writeInt(triggers.size());
                            for (com.gamericefishpro.space.l6.d dVar2 : triggers) {
                                objectOutputStream.writeUTF(dVar2.a.toString());
                                objectOutputStream.writeBoolean(dVar2.b);
                            }
                            Unit unit = Unit.a;
                            objectOutputStream.close();
                            byteArrayOutputStream.close();
                            byteArray = byteArrayOutputStream.toByteArray();
                            Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                y3.s(objectOutputStream, th);
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            y3.s(byteArrayOutputStream, th3);
                            throw th4;
                        }
                    }
                }
                if (byteArray == null) {
                    jVar.p(27);
                    return;
                } else {
                    jVar.G(27, byteArray);
                    return;
                }
            default:
                r rVar = (r) obj;
                String str10 = rVar.a;
                if (str10 == null) {
                    jVar.p(1);
                } else {
                    jVar.i(1, str10);
                }
                String str11 = rVar.b;
                if (str11 == null) {
                    jVar.p(2);
                    return;
                } else {
                    jVar.i(2, str11);
                    return;
                }
        }
    }

    public final void f(Object obj) {
        com.gamericefishpro.space.e6.j jVarA = a();
        try {
            e(jVarA, obj);
            jVarA.e.executeInsert();
        } finally {
            d(jVarA);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(t database) {
        super(database);
        this.d = 1;
        Intrinsics.checkNotNullParameter(database, "database");
    }
}
