package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import ru.yandex.video.m3.netperf.PerfEventDto;

/* loaded from: classes6.dex */
public final class hkk implements p3d {
    public static final hkk a;
    private static final /* synthetic */ j5m descriptor;

    static {
        hkk hkkVar = new hkk();
        a = hkkVar;
        j5m j5mVar = new j5m("ru.yandex.video.m3.netperf.PerfEventDto", hkkVar, 22);
        j5mVar.k("name", false);
        j5mVar.k("nextHopProtocol", false);
        j5mVar.k("startTime", false);
        j5mVar.k("domainLookupStart", false);
        j5mVar.k("domainLookupEnd", false);
        j5mVar.k("fetchStart", false);
        j5mVar.k("connectStart", false);
        j5mVar.k("secureConnectionStart", false);
        j5mVar.k("connectEnd", false);
        j5mVar.k("requestStart", false);
        j5mVar.k("responseStart", false);
        j5mVar.k("responseEnd", false);
        j5mVar.k("duration", false);
        j5mVar.k("transferSize", false);
        j5mVar.k("decodedBodySize", false);
        j5mVar.k("entryType", true);
        j5mVar.k("initiatorType", true);
        j5mVar.k("workerStart", true);
        j5mVar.k("redirectStart", true);
        j5mVar.k("redirectEnd", true);
        j5mVar.k("serverTiming", true);
        j5mVar.k("workerTiming", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        mvg mvgVar = mvg.a;
        lpe lpeVar = lpe.a;
        return new t9f[]{tkrVar, tkrVar, mvgVar, mvgVar, mvgVar, mvgVar, mvgVar, mvgVar, mvgVar, mvgVar, mvgVar, mvgVar, mvgVar, mvgVar, mvgVar, tkrVar, tkrVar, mvgVar, mvgVar, mvgVar, lpeVar, lpeVar};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        npe npeVar;
        npe npeVar2;
        String str;
        long j;
        long j2;
        long j3;
        String str2;
        String str3;
        long j4;
        long j5;
        String str4;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        int i2;
        int i3;
        eg7Var.getClass();
        j5m j5mVar = descriptor;
        tq5 c = eg7Var.c(j5mVar);
        int i4 = 6;
        int i5 = 3;
        int i6 = 2;
        if (c.m()) {
            String g = c.g(j5mVar, 0);
            String g2 = c.g(j5mVar, 1);
            long q = c.q(j5mVar, 2);
            long q2 = c.q(j5mVar, 3);
            long q3 = c.q(j5mVar, 4);
            long q4 = c.q(j5mVar, 5);
            long q5 = c.q(j5mVar, 6);
            long q6 = c.q(j5mVar, 7);
            long q7 = c.q(j5mVar, 8);
            long q8 = c.q(j5mVar, 9);
            long q9 = c.q(j5mVar, 10);
            long q10 = c.q(j5mVar, 11);
            long q11 = c.q(j5mVar, 12);
            long q12 = c.q(j5mVar, 13);
            long q13 = c.q(j5mVar, 14);
            String g3 = c.g(j5mVar, 15);
            String g4 = c.g(j5mVar, 16);
            long q14 = c.q(j5mVar, 17);
            long q15 = c.q(j5mVar, 18);
            long q16 = c.q(j5mVar, 19);
            lpe lpeVar = lpe.a;
            npe npeVar3 = (npe) c.z(j5mVar, 20, lpeVar, null);
            npeVar = (npe) c.z(j5mVar, 21, lpeVar, null);
            i = 4194303;
            j2 = q3;
            j3 = q7;
            str4 = g2;
            str2 = g3;
            str3 = g4;
            j4 = q10;
            j5 = q8;
            npeVar2 = npeVar3;
            j6 = q15;
            str = g;
            j7 = q14;
            j8 = q12;
            j9 = q;
            j10 = q2;
            j11 = q4;
            j12 = q6;
            j13 = q9;
            j14 = q11;
            j15 = q13;
            j16 = q16;
            j = q5;
        } else {
            String str5 = null;
            long j17 = 0;
            boolean z = true;
            int i7 = 0;
            long j18 = 0;
            long j19 = 0;
            long j20 = 0;
            long j21 = 0;
            long j22 = 0;
            long j23 = 0;
            long j24 = 0;
            long j25 = 0;
            long j26 = 0;
            long j27 = 0;
            long j28 = 0;
            long j29 = 0;
            long j30 = 0;
            long j31 = 0;
            long j32 = 0;
            npe npeVar4 = null;
            npe npeVar5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            while (z) {
                int w = c.w(j5mVar);
                switch (w) {
                    case -1:
                        z = false;
                        i5 = 3;
                        i6 = 2;
                    case 0:
                        i7 |= 1;
                        str6 = c.g(j5mVar, 0);
                        i4 = 6;
                        i5 = 3;
                        i6 = 2;
                    case 1:
                        str5 = c.g(j5mVar, 1);
                        i7 |= 2;
                        i4 = 6;
                        i5 = 3;
                        i6 = 2;
                    case 2:
                        int i8 = i6;
                        j25 = c.q(j5mVar, i8);
                        i7 |= 4;
                        i6 = i8;
                        i4 = 6;
                        i5 = 3;
                    case 3:
                        int i9 = i5;
                        j26 = c.q(j5mVar, i9);
                        i7 |= 8;
                        i5 = i9;
                        i4 = 6;
                        i6 = 2;
                    case 4:
                        j18 = c.q(j5mVar, 4);
                        i7 |= 16;
                        i5 = 3;
                        i6 = 2;
                    case 5:
                        j27 = c.q(j5mVar, 5);
                        i7 |= 32;
                        i5 = 3;
                        i6 = 2;
                    case 6:
                        j17 = c.q(j5mVar, i4);
                        i7 |= 64;
                        i5 = 3;
                        i6 = 2;
                    case 7:
                        j28 = c.q(j5mVar, 7);
                        i7 |= 128;
                        i5 = 3;
                        i6 = 2;
                    case 8:
                        j19 = c.q(j5mVar, 8);
                        i7 |= 256;
                        i5 = 3;
                        i6 = 2;
                    case 9:
                        j21 = c.q(j5mVar, 9);
                        i7 |= RemoteCameraConfig.Mic.BUFFER_SIZE;
                        i5 = 3;
                        i6 = 2;
                    case 10:
                        j29 = c.q(j5mVar, 10);
                        i7 |= 1024;
                        i5 = 3;
                        i6 = 2;
                    case 11:
                        j20 = c.q(j5mVar, 11);
                        i7 |= 2048;
                        i5 = 3;
                        i6 = 2;
                    case 12:
                        j30 = c.q(j5mVar, 12);
                        i7 |= 4096;
                        i5 = 3;
                        i6 = 2;
                    case 13:
                        j24 = c.q(j5mVar, 13);
                        i7 |= RemoteCameraConfig.Notification.ID;
                        i5 = 3;
                        i6 = 2;
                    case 14:
                        j31 = c.q(j5mVar, 14);
                        i7 |= 16384;
                        i5 = 3;
                        i6 = 2;
                    case 15:
                        str7 = c.g(j5mVar, 15);
                        i2 = SQLiteDatabase.OPEN_NOMUTEX;
                        i7 |= i2;
                        i5 = 3;
                        i6 = 2;
                    case 16:
                        str8 = c.g(j5mVar, 16);
                        i2 = SQLiteDatabase.OPEN_FULLMUTEX;
                        i7 |= i2;
                        i5 = 3;
                        i6 = 2;
                    case 17:
                        j23 = c.q(j5mVar, 17);
                        i2 = SQLiteDatabase.OPEN_SHAREDCACHE;
                        i7 |= i2;
                        i5 = 3;
                        i6 = 2;
                    case 18:
                        j22 = c.q(j5mVar, 18);
                        i2 = SQLiteDatabase.OPEN_PRIVATECACHE;
                        i7 |= i2;
                        i5 = 3;
                        i6 = 2;
                    case 19:
                        j32 = c.q(j5mVar, 19);
                        i7 |= 524288;
                        i5 = 3;
                        i6 = 2;
                    case 20:
                        npeVar5 = (npe) c.z(j5mVar, 20, lpe.a, npeVar5);
                        i3 = 1048576;
                        i7 |= i3;
                        i5 = 3;
                        i6 = 2;
                    case 21:
                        npeVar4 = (npe) c.z(j5mVar, 21, lpe.a, npeVar4);
                        i3 = 2097152;
                        i7 |= i3;
                        i5 = 3;
                        i6 = 2;
                    default:
                        l1j.g(w);
                        return null;
                }
            }
            i = i7;
            npeVar = npeVar4;
            npeVar2 = npeVar5;
            str = str6;
            j = j17;
            j2 = j18;
            j3 = j19;
            str2 = str7;
            str3 = str8;
            j4 = j20;
            j5 = j21;
            str4 = str5;
            j6 = j22;
            j7 = j23;
            j8 = j24;
            j9 = j25;
            j10 = j26;
            j11 = j27;
            j12 = j28;
            j13 = j29;
            j14 = j30;
            j15 = j31;
            j16 = j32;
        }
        c.b(j5mVar);
        return new PerfEventDto(i, str, str4, j9, j10, j2, j11, j, j12, j3, j5, j13, j4, j14, j8, j15, str2, str3, j7, j6, j16, npeVar2, npeVar, (xhp) null);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        PerfEventDto perfEventDto = (PerfEventDto) obj;
        l6bVar.getClass();
        perfEventDto.getClass();
        j5m j5mVar = descriptor;
        wq5 c = l6bVar.c(j5mVar);
        PerfEventDto.write$Self$common_internal_internalRelease(perfEventDto, c, j5mVar);
        c.b(j5mVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
