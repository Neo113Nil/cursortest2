package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import com.yandex.go.payments.yangopay.ui.YangoPayWidgetView;
import com.yandex.go.payments.yangopay.ui.a;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public final /* synthetic */ class u431 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ u431(i3y i3yVar, hba0 hba0Var) {
        this.a = 26;
    }

    private final Object b(Object obj) {
        oll0 oll0Var = (oll0) obj;
        ull0 T0 = oll0Var.T0("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
        try {
            T0.q();
            int x = jx81.x(oll0Var);
            T0.close();
            return Integer.valueOf(x);
        } catch (Throwable th) {
            T0.close();
            throw th;
        }
    }

    private final Object d(Object obj) {
        return new q960();
    }

    private final Object e(Object obj) {
        return new r501(18);
    }

    private final Object f(Object obj) {
        return new a((YangoPayWidgetView) obj);
    }

    private final Object g(Object obj) {
        return Boolean.valueOf(!((ZoneTariffInfo) obj).s);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        int i;
        int i2;
        Integer valueOf;
        Boolean bool;
        int i3;
        Integer valueOf2;
        Boolean bool2;
        boolean z;
        int i4;
        int i5;
        Integer valueOf3;
        Boolean bool3;
        int i6 = this.a;
        zy11 zy11Var = zy11.a;
        switch (i6) {
            case 0:
                pj2 pj2Var = (pj2) obj;
                return new cjs0((Float.floatToRawIntBits(pj2Var.f()) << 32) | (Float.floatToRawIntBits(pj2Var.g()) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            case 1:
                wu60 wu60Var = (wu60) obj;
                return new pj2(Float.intBitsToFloat((int) (wu60Var.a >> 32)), Float.intBitsToFloat((int) (wu60Var.a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
            case 2:
                pj2 pj2Var2 = (pj2) obj;
                return new wu60((Float.floatToRawIntBits(pj2Var2.f()) << 32) | (Float.floatToRawIntBits(pj2Var2.g()) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            case 3:
                long j = ((z5w) obj).a;
                return new pj2((int) (j >> 32), (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            case 4:
                pj2 pj2Var3 = (pj2) obj;
                return new z5w((Math.round(pj2Var3.f()) << 32) | (Math.round(pj2Var3.g()) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            case 5:
                long j2 = ((k6w) obj).a;
                return new pj2((int) (j2 >> 32), (int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            case 6:
                pj2 pj2Var4 = (pj2) obj;
                int round = Math.round(pj2Var4.f());
                if (round < 0) {
                    round = 0;
                }
                return new k6w((round << 32) | ((Math.round(pj2Var4.g()) >= 0 ? r0 : 0) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            case 7:
                zii0 zii0Var = (zii0) obj;
                return new rj2(zii0Var.a, zii0Var.b, zii0Var.c, zii0Var.d);
            case 8:
                rj2 rj2Var = (rj2) obj;
                return new zii0(rj2Var.f(), rj2Var.g(), rj2Var.h(), rj2Var.i());
            case 9:
                return Float.valueOf(((oj2) obj).a);
            case 10:
                za31 za31Var = (za31) obj;
                List list = za31Var.b;
                ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Pair(za31Var.d, (mi31) it.next()));
                }
                return arrayList;
            case 11:
                Pair pair = (Pair) obj;
                return ((mi31) pair.getSecond()).d((String) pair.getFirst());
            case 12:
                acx acxVar = (acx) obj;
                acxVar.a = true;
                acxVar.b = false;
                return zy11Var;
            case 13:
                try {
                    ((oll0) obj).T0("DELETE FROM WorkProgress").q();
                    return zy11Var;
                } finally {
                }
            case 14:
                T0 = ((oll0) obj).T0("SELECT * FROM workspec WHERE state=1");
                try {
                    int r = eja1.r(T0, "id");
                    int r2 = eja1.r(T0, ClidProvider.STATE);
                    int r3 = eja1.r(T0, "worker_class_name");
                    int r4 = eja1.r(T0, "input_merger_class_name");
                    int r5 = eja1.r(T0, "input");
                    int r6 = eja1.r(T0, "output");
                    int r7 = eja1.r(T0, "initial_delay");
                    int r8 = eja1.r(T0, "interval_duration");
                    int r9 = eja1.r(T0, "flex_duration");
                    int r10 = eja1.r(T0, "run_attempt_count");
                    int r11 = eja1.r(T0, "backoff_policy");
                    int r12 = eja1.r(T0, "backoff_delay_duration");
                    int r13 = eja1.r(T0, "last_enqueue_time");
                    int r14 = eja1.r(T0, "minimum_retention_duration");
                    int r15 = eja1.r(T0, "schedule_requested_at");
                    int r16 = eja1.r(T0, "run_in_foreground");
                    int r17 = eja1.r(T0, "out_of_quota_policy");
                    int r18 = eja1.r(T0, "period_count");
                    int r19 = eja1.r(T0, "generation");
                    int r20 = eja1.r(T0, "next_schedule_time_override");
                    int r21 = eja1.r(T0, "next_schedule_time_override_generation");
                    int r22 = eja1.r(T0, DownloadService.KEY_STOP_REASON);
                    int r23 = eja1.r(T0, "trace_tag");
                    int r24 = eja1.r(T0, "backoff_on_system_interruptions");
                    int r25 = eja1.r(T0, "required_network_type");
                    int r26 = eja1.r(T0, "required_network_request");
                    int r27 = eja1.r(T0, "requires_charging");
                    int r28 = eja1.r(T0, "requires_device_idle");
                    int r29 = eja1.r(T0, "requires_battery_not_low");
                    int r30 = eja1.r(T0, "requires_storage_not_low");
                    int r31 = eja1.r(T0, "trigger_content_update_delay");
                    int r32 = eja1.r(T0, "trigger_max_content_delay");
                    int r33 = eja1.r(T0, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (T0.q()) {
                        String Y1 = T0.Y1(r);
                        int i7 = r14;
                        int i8 = r13;
                        WorkInfo$State s = gtq0.s((int) T0.getLong(r2));
                        String Y12 = T0.Y1(r3);
                        String Y13 = T0.Y1(r4);
                        byte[] blob = T0.getBlob(r5);
                        ong ongVar = ong.b;
                        ong l = bb1.l(blob);
                        ong l2 = bb1.l(T0.getBlob(r6));
                        long j3 = T0.getLong(r7);
                        long j4 = T0.getLong(r8);
                        long j5 = T0.getLong(r9);
                        int i9 = (int) T0.getLong(r10);
                        int i10 = r2;
                        int i11 = r;
                        BackoffPolicy p = gtq0.p((int) T0.getLong(r11));
                        long j6 = T0.getLong(r12);
                        long j7 = T0.getLong(i8);
                        long j8 = T0.getLong(i7);
                        int i12 = r15;
                        long j9 = T0.getLong(i12);
                        r15 = i12;
                        int i13 = r16;
                        boolean z2 = ((int) T0.getLong(i13)) != 0;
                        int i14 = r17;
                        OutOfQuotaPolicy r34 = gtq0.r((int) T0.getLong(i14));
                        r17 = i14;
                        int i15 = r18;
                        int i16 = (int) T0.getLong(i15);
                        r18 = i15;
                        int i17 = r19;
                        int i18 = (int) T0.getLong(i17);
                        int i19 = r20;
                        long j10 = T0.getLong(i19);
                        int i20 = r21;
                        int i21 = (int) T0.getLong(i20);
                        int i22 = r22;
                        int i23 = (int) T0.getLong(i22);
                        int i24 = r23;
                        String Y14 = T0.isNull(i24) ? null : T0.Y1(i24);
                        int i25 = r24;
                        if (T0.isNull(i25)) {
                            i = i21;
                            i2 = i22;
                            valueOf = null;
                        } else {
                            i = i21;
                            i2 = i22;
                            valueOf = Integer.valueOf((int) T0.getLong(i25));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        r24 = i25;
                        int i26 = r25;
                        NetworkType q = gtq0.q((int) T0.getLong(i26));
                        int i27 = r26;
                        jz50 U = gtq0.U(T0.getBlob(i27));
                        r25 = i26;
                        int i28 = r27;
                        boolean z3 = ((int) T0.getLong(i28)) != 0;
                        r27 = i28;
                        int i29 = r28;
                        boolean z4 = ((int) T0.getLong(i29)) != 0;
                        r28 = i29;
                        int i30 = r29;
                        boolean z5 = ((int) T0.getLong(i30)) != 0;
                        r29 = i30;
                        int i31 = r30;
                        int i32 = r31;
                        int i33 = r32;
                        r31 = i32;
                        int i34 = r33;
                        r33 = i34;
                        arrayList2.add(new fa51(Y1, s, Y12, Y13, l, l2, j3, j4, j5, new k8e(U, q, z3, z4, z5, ((int) T0.getLong(i31)) != 0, T0.getLong(i32), T0.getLong(i33), gtq0.d(T0.getBlob(i34))), i9, p, j6, j7, j8, j9, z2, r34, i16, i18, j10, i, i23, Y14, bool));
                        r32 = i33;
                        r30 = i31;
                        r14 = i7;
                        r2 = i10;
                        r = i11;
                        r16 = i13;
                        r19 = i17;
                        r20 = i19;
                        r21 = i20;
                        r22 = i2;
                        r23 = i24;
                        r26 = i27;
                        r13 = i8;
                    }
                    return arrayList2;
                } finally {
                }
            case 15:
                T0 = ((oll0) obj).T0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)");
                try {
                    ArrayList arrayList3 = new ArrayList();
                    while (T0.q()) {
                        arrayList3.add(T0.Y1(0));
                    }
                    return arrayList3;
                } finally {
                }
            case 16:
                T0 = ((oll0) obj).T0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
                try {
                    int r35 = eja1.r(T0, "id");
                    int r36 = eja1.r(T0, ClidProvider.STATE);
                    int r37 = eja1.r(T0, "worker_class_name");
                    int r38 = eja1.r(T0, "input_merger_class_name");
                    int r39 = eja1.r(T0, "input");
                    int r40 = eja1.r(T0, "output");
                    int r41 = eja1.r(T0, "initial_delay");
                    int r42 = eja1.r(T0, "interval_duration");
                    int r43 = eja1.r(T0, "flex_duration");
                    int r44 = eja1.r(T0, "run_attempt_count");
                    int r45 = eja1.r(T0, "backoff_policy");
                    int r46 = eja1.r(T0, "backoff_delay_duration");
                    int r47 = eja1.r(T0, "last_enqueue_time");
                    int r48 = eja1.r(T0, "minimum_retention_duration");
                    int r49 = eja1.r(T0, "schedule_requested_at");
                    int r50 = eja1.r(T0, "run_in_foreground");
                    int r51 = eja1.r(T0, "out_of_quota_policy");
                    int r52 = eja1.r(T0, "period_count");
                    int r53 = eja1.r(T0, "generation");
                    int r54 = eja1.r(T0, "next_schedule_time_override");
                    int r55 = eja1.r(T0, "next_schedule_time_override_generation");
                    int r56 = eja1.r(T0, DownloadService.KEY_STOP_REASON);
                    int r57 = eja1.r(T0, "trace_tag");
                    int r58 = eja1.r(T0, "backoff_on_system_interruptions");
                    int r59 = eja1.r(T0, "required_network_type");
                    int r60 = eja1.r(T0, "required_network_request");
                    int r61 = eja1.r(T0, "requires_charging");
                    int r62 = eja1.r(T0, "requires_device_idle");
                    int r63 = eja1.r(T0, "requires_battery_not_low");
                    int r64 = eja1.r(T0, "requires_storage_not_low");
                    int r65 = eja1.r(T0, "trigger_content_update_delay");
                    int r66 = eja1.r(T0, "trigger_max_content_delay");
                    int r67 = eja1.r(T0, "content_uri_triggers");
                    ArrayList arrayList4 = new ArrayList();
                    while (T0.q()) {
                        String Y15 = T0.Y1(r35);
                        int i35 = r48;
                        int i36 = r47;
                        WorkInfo$State s2 = gtq0.s((int) T0.getLong(r36));
                        String Y16 = T0.Y1(r37);
                        String Y17 = T0.Y1(r38);
                        byte[] blob2 = T0.getBlob(r39);
                        ong ongVar2 = ong.b;
                        ong l3 = bb1.l(blob2);
                        ong l4 = bb1.l(T0.getBlob(r40));
                        long j11 = T0.getLong(r41);
                        long j12 = T0.getLong(r42);
                        long j13 = T0.getLong(r43);
                        int i37 = (int) T0.getLong(r44);
                        int i38 = r36;
                        int i39 = r35;
                        BackoffPolicy p2 = gtq0.p((int) T0.getLong(r45));
                        long j14 = T0.getLong(r46);
                        long j15 = T0.getLong(i36);
                        long j16 = T0.getLong(i35);
                        int i40 = r49;
                        long j17 = T0.getLong(i40);
                        r49 = i40;
                        int i41 = r50;
                        boolean z6 = ((int) T0.getLong(i41)) != 0;
                        r50 = i41;
                        int i42 = r51;
                        OutOfQuotaPolicy r68 = gtq0.r((int) T0.getLong(i42));
                        r51 = i42;
                        int i43 = r52;
                        int i44 = (int) T0.getLong(i43);
                        r52 = i43;
                        int i45 = r53;
                        int i46 = (int) T0.getLong(i45);
                        long j18 = T0.getLong(r54);
                        int i47 = r55;
                        int i48 = (int) T0.getLong(i47);
                        r53 = i45;
                        r55 = i47;
                        int i49 = r56;
                        int i50 = (int) T0.getLong(i49);
                        int i51 = r57;
                        String Y18 = T0.isNull(i51) ? null : T0.Y1(i51);
                        int i52 = r58;
                        if (T0.isNull(i52)) {
                            i3 = i50;
                            r57 = i51;
                            valueOf2 = null;
                        } else {
                            i3 = i50;
                            r57 = i51;
                            valueOf2 = Integer.valueOf((int) T0.getLong(i52));
                        }
                        if (valueOf2 != null) {
                            bool2 = Boolean.valueOf(valueOf2.intValue() != 0);
                        } else {
                            bool2 = null;
                        }
                        r58 = i52;
                        r56 = i49;
                        int i53 = r59;
                        NetworkType q2 = gtq0.q((int) T0.getLong(i53));
                        int i54 = r60;
                        jz50 U2 = gtq0.U(T0.getBlob(i54));
                        r59 = i53;
                        int i55 = r61;
                        boolean z7 = ((int) T0.getLong(i55)) != 0;
                        r60 = i54;
                        r61 = i55;
                        int i56 = r62;
                        boolean z8 = ((int) T0.getLong(i56)) != 0;
                        r62 = i56;
                        int i57 = r63;
                        boolean z9 = ((int) T0.getLong(i57)) != 0;
                        int i58 = r64;
                        int i59 = r65;
                        int i60 = r66;
                        r63 = i57;
                        int i61 = r67;
                        r67 = i61;
                        arrayList4.add(new fa51(Y15, s2, Y16, Y17, l3, l4, j11, j12, j13, new k8e(U2, q2, z7, z8, z9, ((int) T0.getLong(i58)) != 0, T0.getLong(i59), T0.getLong(i60), gtq0.d(T0.getBlob(i61))), i37, p2, j14, j15, j16, j17, z6, r68, i44, i46, j18, i48, i3, Y18, bool2));
                        r64 = i58;
                        r65 = i59;
                        r66 = i60;
                        r47 = i36;
                        r48 = i35;
                        r35 = i39;
                        r36 = i38;
                    }
                    return arrayList4;
                } finally {
                }
            case 17:
                T0 = ((oll0) obj).T0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    if (T0.q()) {
                        if (((int) T0.getLong(0)) != 0) {
                            z = true;
                            T0.close();
                            return Boolean.valueOf(z);
                        }
                    }
                    z = false;
                    T0.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 18:
                T0 = ((oll0) obj).T0("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
                try {
                    T0.b(1, 200L);
                    int r69 = eja1.r(T0, "id");
                    int r70 = eja1.r(T0, ClidProvider.STATE);
                    int r71 = eja1.r(T0, "worker_class_name");
                    int r72 = eja1.r(T0, "input_merger_class_name");
                    int r73 = eja1.r(T0, "input");
                    int r74 = eja1.r(T0, "output");
                    int r75 = eja1.r(T0, "initial_delay");
                    int r76 = eja1.r(T0, "interval_duration");
                    int r77 = eja1.r(T0, "flex_duration");
                    int r78 = eja1.r(T0, "run_attempt_count");
                    int r79 = eja1.r(T0, "backoff_policy");
                    int r80 = eja1.r(T0, "backoff_delay_duration");
                    int r81 = eja1.r(T0, "last_enqueue_time");
                    int r82 = eja1.r(T0, "minimum_retention_duration");
                    int r83 = eja1.r(T0, "schedule_requested_at");
                    int r84 = eja1.r(T0, "run_in_foreground");
                    int r85 = eja1.r(T0, "out_of_quota_policy");
                    int r86 = eja1.r(T0, "period_count");
                    int r87 = eja1.r(T0, "generation");
                    int r88 = eja1.r(T0, "next_schedule_time_override");
                    int r89 = eja1.r(T0, "next_schedule_time_override_generation");
                    int r90 = eja1.r(T0, DownloadService.KEY_STOP_REASON);
                    int r91 = eja1.r(T0, "trace_tag");
                    int r92 = eja1.r(T0, "backoff_on_system_interruptions");
                    int r93 = eja1.r(T0, "required_network_type");
                    int r94 = eja1.r(T0, "required_network_request");
                    int r95 = eja1.r(T0, "requires_charging");
                    int r96 = eja1.r(T0, "requires_device_idle");
                    int r97 = eja1.r(T0, "requires_battery_not_low");
                    int r98 = eja1.r(T0, "requires_storage_not_low");
                    int r99 = eja1.r(T0, "trigger_content_update_delay");
                    int r100 = eja1.r(T0, "trigger_max_content_delay");
                    int r101 = eja1.r(T0, "content_uri_triggers");
                    ArrayList arrayList5 = new ArrayList();
                    while (T0.q()) {
                        String Y19 = T0.Y1(r69);
                        int i62 = r82;
                        ArrayList arrayList6 = arrayList5;
                        WorkInfo$State s3 = gtq0.s((int) T0.getLong(r70));
                        String Y110 = T0.Y1(r71);
                        String Y111 = T0.Y1(r72);
                        byte[] blob3 = T0.getBlob(r73);
                        ong ongVar3 = ong.b;
                        ong l5 = bb1.l(blob3);
                        ong l6 = bb1.l(T0.getBlob(r74));
                        long j19 = T0.getLong(r75);
                        long j20 = T0.getLong(r76);
                        long j21 = T0.getLong(r77);
                        int i63 = (int) T0.getLong(r78);
                        int i64 = r70;
                        int i65 = r69;
                        BackoffPolicy p3 = gtq0.p((int) T0.getLong(r79));
                        long j22 = T0.getLong(r80);
                        long j23 = T0.getLong(r81);
                        long j24 = T0.getLong(i62);
                        int i66 = r83;
                        long j25 = T0.getLong(i66);
                        int i67 = r84;
                        r83 = i66;
                        boolean z10 = ((int) T0.getLong(i67)) != 0;
                        int i68 = r71;
                        int i69 = r72;
                        int i70 = r85;
                        OutOfQuotaPolicy r102 = gtq0.r((int) T0.getLong(i70));
                        r85 = i70;
                        int i71 = r86;
                        int i72 = (int) T0.getLong(i71);
                        r86 = i71;
                        int i73 = r87;
                        int i74 = (int) T0.getLong(i73);
                        long j26 = T0.getLong(r88);
                        int i75 = r89;
                        int i76 = (int) T0.getLong(i75);
                        int i77 = r90;
                        int i78 = (int) T0.getLong(i77);
                        int i79 = r91;
                        String Y112 = T0.isNull(i79) ? null : T0.Y1(i79);
                        int i80 = r92;
                        if (T0.isNull(i80)) {
                            i4 = i76;
                            i5 = i77;
                            valueOf3 = null;
                        } else {
                            i4 = i76;
                            i5 = i77;
                            valueOf3 = Integer.valueOf((int) T0.getLong(i80));
                        }
                        if (valueOf3 != null) {
                            bool3 = Boolean.valueOf(valueOf3.intValue() != 0);
                        } else {
                            bool3 = null;
                        }
                        r92 = i80;
                        int i81 = r93;
                        NetworkType q3 = gtq0.q((int) T0.getLong(i81));
                        int i82 = r94;
                        jz50 U3 = gtq0.U(T0.getBlob(i82));
                        r93 = i81;
                        int i83 = r95;
                        boolean z11 = ((int) T0.getLong(i83)) != 0;
                        r95 = i83;
                        int i84 = r96;
                        boolean z12 = ((int) T0.getLong(i84)) != 0;
                        r96 = i84;
                        int i85 = r97;
                        boolean z13 = ((int) T0.getLong(i85)) != 0;
                        r97 = i85;
                        int i86 = r98;
                        int i87 = r99;
                        int i88 = r100;
                        r99 = i87;
                        int i89 = r101;
                        r101 = i89;
                        arrayList6.add(new fa51(Y19, s3, Y110, Y111, l5, l6, j19, j20, j21, new k8e(U3, q3, z11, z12, z13, ((int) T0.getLong(i86)) != 0, T0.getLong(i87), T0.getLong(i88), gtq0.d(T0.getBlob(i89))), i63, p3, j22, j23, j24, j25, z10, r102, i72, i74, j26, i4, i78, Y112, bool3));
                        r94 = i82;
                        r72 = i69;
                        r87 = i73;
                        r89 = i75;
                        r90 = i5;
                        r91 = i79;
                        r100 = i88;
                        r98 = i86;
                        r82 = i62;
                        r69 = i65;
                        r71 = i68;
                        r84 = i67;
                        arrayList5 = arrayList6;
                        r70 = i64;
                    }
                    return arrayList5;
                } finally {
                }
            case 19:
                return b(obj);
            case 20:
                return zy11Var;
            case 21:
                return new hj51();
            case 22:
                return xw91.x;
            case 23:
                return d(obj);
            case 24:
                return (Uri) obj;
            case 25:
                return e(obj);
            case 26:
                return f(obj);
            case 27:
                return g(obj);
            default:
                return ((ZoneTariffInfo) obj).e;
        }
    }

    public /* synthetic */ u431(int i) {
        this.a = i;
    }
}
