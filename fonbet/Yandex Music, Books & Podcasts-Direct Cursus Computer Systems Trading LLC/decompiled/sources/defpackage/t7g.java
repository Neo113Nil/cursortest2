package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.media.ynison.service.n;
import com.yandex.media.ynison.service.o;
import com.yandex.media.ynison.service.p;
import com.yandex.media.ynison.service.q;
import com.yandex.media.ynison.service.r;
import com.yandex.media.ynison.service.s;
import com.yandex.media.ynison.service.t;
import com.yandex.media.ynison.service.u;
import com.yandex.media.ynison.service.v;
import com.yandex.media.ynison.service.w;
import com.yandex.music.shared.phonoteka.synchronization.data.model.ArtistIdDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.TrackIdDto;
import com.yandex.music.shared.phonoteka.synchronization.data.model.VideoClipIdDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class t7g {
    public static volatile wge a;

    public static r A(int i, int i2, String str, String str2) {
        if (i2 == 0) {
            throw null;
        }
        lhl s = p.s();
        mhl l = q.l();
        l.d();
        q.g((q) l.b, str);
        if (str2 != null) {
            dlr h = dlr.h(str2);
            l.d();
            q.f((q) l.b, h);
        }
        s.d();
        p.i((p) s.b, (q) l.b());
        s.h(i2);
        return x(i, (p) s.b());
    }

    public static final aqi B(u7g u7gVar, boolean z, Function0 function0, dzf dzfVar, dcu dcuVar, hq5 hq5Var, int i, int i2) {
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-776958357);
        if ((i2 & 8) != 0) {
            dzfVar = (dzf) oq5Var.j(ykg.a);
        }
        if ((i2 & 16) != 0) {
            dcuVar = dcu.One;
        }
        kjn kjnVar = gq5.a;
        if (u7gVar == null || !z) {
            oq5Var.Z(-787283985);
            Object K = oq5Var.K();
            if (K == kjnVar) {
                K = szf.g0(lbu.a);
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            oq5Var.p(false);
            oq5Var.p(false);
            return aqiVar;
        }
        oq5Var.Z(-791513129);
        oq5Var.p(false);
        Object K2 = oq5Var.K();
        Object obj = K2;
        if (K2 == kjnVar) {
            paw pawVar = (paw) function0.invoke();
            pawVar.t(0.0f);
            oq5Var.k0(pawVar);
            obj = pawVar;
        }
        paw pawVar2 = (paw) obj;
        boolean h = oq5Var.h(pawVar2) | oq5Var.f(u7gVar) | oq5Var.h(dzfVar);
        Object K3 = oq5Var.K();
        if (h || K3 == kjnVar) {
            K3 = new zzq(14, pawVar2, u7gVar, dzfVar);
            oq5Var.k0(K3);
        }
        gld.j(pawVar2, u7gVar, (Function1) K3, oq5Var);
        boolean h2 = oq5Var.h(pawVar2);
        Object K4 = oq5Var.K();
        if (h2 || K4 == kjnVar) {
            K4 = new r3s(21, pawVar2);
            oq5Var.k0(K4);
        }
        gld.k(pawVar2, (Function1) K4, oq5Var);
        boolean h3 = ((((57344 & i) ^ 24576) > 16384 && oq5Var.d(dcuVar.ordinal())) || (i & 24576) == 16384) | oq5Var.h(pawVar2);
        Object K5 = oq5Var.K();
        if (h3 || K5 == kjnVar) {
            K5 = new l1p(dcuVar, pawVar2, (Continuation) null, 5);
            oq5Var.k0(K5);
        }
        aqi k0 = szf.k0(nbu.a, pawVar2, u7gVar, (Function2) K5, oq5Var, 6);
        oq5Var.p(false);
        return k0;
    }

    public static final aqi C(u7g u7gVar, boolean z, Function0 function0, dzf dzfVar, hq5 hq5Var, int i, int i2) {
        boolean z2;
        dcu dcuVar = dcu.One;
        function0.getClass();
        if ((i2 & 8) != 0) {
            dzfVar = (dzf) ((oq5) hq5Var).j(ykg.a);
        }
        dzf dzfVar2 = dzfVar;
        if (z) {
            oq5 oq5Var = (oq5) hq5Var;
            oq5Var.Z(854412506);
            qs5 qs5Var = AndroidCompositionLocals_androidKt.a;
            qs5Var.getClass();
            boolean J = asq.J((Configuration) oq5Var.j(qs5Var));
            oq5Var.p(false);
            z2 = J;
        } else {
            oq5 oq5Var2 = (oq5) hq5Var;
            oq5Var2.Z(716985147);
            oq5Var2.p(false);
            z2 = false;
        }
        return B(u7gVar, z2, function0, dzfVar2, dcuVar, hq5Var, i & 65422, 0);
    }

    public static a3i D(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            kac.f("Cannot read metadata.");
            return null;
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j2 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = duplicate.getInt();
                long j3 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j3 + j));
                    a3i a3iVar = new a3i();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    a3iVar.d = duplicate;
                    a3iVar.a = position;
                    int i6 = position - duplicate.getInt(position);
                    a3iVar.b = i6;
                    a3iVar.c = ((ByteBuffer) a3iVar.d).getShort(i6);
                    return a3iVar;
                }
            }
        }
        kac.f("Cannot read metadata.");
        return null;
    }

    public static final ArrayList E(Reader reader) {
        ArrayList arrayList = new ArrayList();
        p(reader, new w71(arrayList, 5));
        return arrayList;
    }

    public static final String F(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[RemoteCameraConfig.Notification.ID];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        return stringWriter2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0049, code lost:
    
        if (r9.d(r12) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final wdj G(bcj bcjVar, mqs mqsVar, int i, u0s u0sVar, jab jabVar, thj thjVar, hq5 hq5Var, int i2, int i3) {
        int i4;
        boolean z;
        boolean d;
        Object K;
        bcjVar.getClass();
        mqsVar.getClass();
        boolean z2 = (i3 & 32) == 0;
        oq5 oq5Var = (oq5) hq5Var;
        Object K2 = oq5Var.K();
        Object obj = gq5.a;
        if (K2 == obj) {
            K2 = gld.R(g.a, oq5Var);
            oq5Var.k0(K2);
        }
        mm6 mm6Var = (mm6) K2;
        Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
        dg2 dg2Var = mqsVar.k;
        boolean f = oq5Var.f(u0sVar);
        if (((i2 & 896) ^ 384) > 256) {
            i4 = i;
        } else {
            i4 = i;
        }
        if ((i2 & 384) != 256) {
            z = false;
            d = oq5Var.d(dg2Var.ordinal()) | f | z | oq5Var.f(jabVar) | oq5Var.f(mqsVar) | oq5Var.f(thjVar) | oq5Var.f(context) | ((((3670016 & i2) ^ ScreenMirroringConfig.Video.BITRATE_1_5MB) <= 1048576 && oq5Var.g(z2)) || (i2 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 1048576);
            K = oq5Var.K();
            if (!d || K == obj) {
                K = bcjVar.a(mqsVar, i4, u0sVar, jabVar, thjVar, context, mm6Var, z2);
                oq5Var.k0(K);
            }
            return (wdj) K;
        }
        z = true;
        d = oq5Var.d(dg2Var.ordinal()) | f | z | oq5Var.f(jabVar) | oq5Var.f(mqsVar) | oq5Var.f(thjVar) | oq5Var.f(context) | ((((3670016 & i2) ^ ScreenMirroringConfig.Video.BITRATE_1_5MB) <= 1048576 && oq5Var.g(z2)) || (i2 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 1048576);
        K = oq5Var.K();
        if (!d) {
        }
        K = bcjVar.a(mqsVar, i4, u0sVar, jabVar, thjVar, context, mm6Var, z2);
        oq5Var.k0(K);
        return (wdj) K;
    }

    public static final ArrayList H(List list) {
        String artistId;
        qc7 timestamp;
        Date date;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ArtistIdDto artistIdDto = (ArtistIdDto) it.next();
            zvr zvrVar = null;
            if (artistIdDto != null && (artistId = artistIdDto.getArtistId()) != null && (timestamp = artistIdDto.getTimestamp()) != null && (date = timestamp.b) != null) {
                zvrVar = new zvr(date, artistId);
            }
            if (zvrVar != null) {
                arrayList.add(zvrVar);
            }
        }
        return arrayList;
    }

    public static final ioe I(zne zneVar) {
        return new ioe(zneVar.a, zneVar.b, zneVar.c, zneVar.d);
    }

    public static final hyn J(nyn nynVar) {
        nynVar.getClass();
        int ordinal = nynVar.ordinal();
        if (ordinal == 0) {
            return hyn.f;
        }
        if (ordinal == 1) {
            return hyn.d;
        }
        if (ordinal == 2) {
            return hyn.e;
        }
        b6e.s();
        return null;
    }

    public static final nyn K(hyn hynVar) {
        int ordinal = hynVar.ordinal();
        if (ordinal == 0) {
            return nyn.b;
        }
        if (ordinal == 1) {
            return nyn.c;
        }
        if (ordinal == 2) {
            return nyn.a;
        }
        b6e.s();
        return null;
    }

    public static final kwr L(int i) {
        Object obj;
        rdb rdbVar = kwr.d;
        rdbVar.getClass();
        c7 c7Var = new c7(0, rdbVar);
        while (true) {
            if (!c7Var.hasNext()) {
                obj = null;
                break;
            }
            obj = c7Var.next();
            if (((kwr) obj).a == i) {
                break;
            }
        }
        return (kwr) obj;
    }

    public static final ArrayList M(List list) {
        String trackId;
        Date date;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TrackIdDto trackIdDto = (TrackIdDto) it.next();
            cyr cyrVar = null;
            if (trackIdDto != null && (trackId = trackIdDto.getTrackId()) != null) {
                rr5 A = q6k.A(trackId, trackIdDto.getAlbumId());
                qc7 timestamp = trackIdDto.getTimestamp();
                if (timestamp != null && (date = timestamp.b) != null) {
                    cyrVar = new cyr(A, date);
                }
            }
            if (cyrVar != null) {
                arrayList.add(cyrVar);
            }
        }
        return arrayList;
    }

    public static final ArrayList N(List list) {
        String videoClipId;
        qc7 timestamp;
        Date date;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VideoClipIdDto videoClipIdDto = (VideoClipIdDto) it.next();
            fyr fyrVar = null;
            if (videoClipIdDto != null && (videoClipId = videoClipIdDto.getVideoClipId()) != null && (timestamp = videoClipIdDto.getTimestamp()) != null && (date = timestamp.b) != null) {
                fyrVar = new fyr(date, videoClipId);
            }
            if (fyrVar != null) {
                arrayList.add(fyrVar);
            }
        }
        return arrayList;
    }

    public static w O(List list, int i, u uVar, String str, String str2) {
        dhl t = w.t();
        hhl q = v.q();
        q.d();
        v.f((v) q.b, list);
        q.d();
        v.h((v) q.b, i);
        q.d();
        v.g((v) q.b, uVar);
        dlr h = dlr.h(str);
        q.d();
        v.i((v) q.b, h);
        dlr h2 = dlr.h(str2);
        q.d();
        v.j((v) q.b, h2);
        t.d();
        w.h((w) t.b, (v) q.b());
        return (w) t.b();
    }

    public static w P(int i, String str, String str2, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        c5b c5bVar = c5b.a;
        khl m = u.m();
        m.d();
        u.f((u) m.b, arrayList);
        return O(c5bVar, i, (u) m.b(), str, str2);
    }

    public static w Q(String str, List list, List list2, int i, String str2, String str3) {
        str.getClass();
        list.getClass();
        list2.getClass();
        str2.getClass();
        str3.getClass();
        khl m = u.m();
        ohl i2 = s.i();
        i2.d();
        s.f((s) i2.b, str);
        m.d();
        u.h((u) m.b, (s) i2.b());
        boolean isEmpty = list.isEmpty();
        if (isEmpty) {
            nhl n = r.n();
            n.d();
            r.f((r) n.b, 0);
            t g = t.g();
            n.d();
            r.h((r) n.b, g);
            m.h((r) n.b());
        } else {
            if (isEmpty) {
                b6e.s();
                return null;
            }
            m.d();
            u.f((u) m.b, list);
        }
        return O(list2, i, (u) m.b(), str2, str3);
    }

    public static w R(int i, String str, String str2) {
        str2.getClass();
        c5b c5bVar = c5b.a;
        khl m = u.m();
        lhl s = p.s();
        s.h(1);
        m.h(x(0, (p) s.b()));
        return O(c5bVar, i, (u) m.b(), str, str2);
    }

    public static final w4f S(x3f x3fVar, Object obj, t9f t9fVar) {
        x3fVar.getClass();
        t9fVar.getClass();
        xqn xqnVar = new xqn();
        new x6f(x3fVar, new mmf(xqnVar, 1), 1).v(t9fVar, obj);
        Object obj2 = xqnVar.a;
        if (obj2 != null) {
            return (w4f) obj2;
        }
        Intrinsics.j(CameraService.RESULT);
        throw null;
    }

    public static final void a(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(850042571);
        if (i == 0 && oq5Var.z()) {
            oq5Var.S();
        } else {
            gae.b(a0g.E(R.drawable.ic_site_24, 0, oq5Var), null, null, ((dq0) oq5Var.j(eq0.a)).a.a, oq5Var, 48, 4);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rea(i, 27);
        }
    }

    public static final void b(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, r5h r5hVar, fvf fvfVar, o0k o0kVar, hq5 hq5Var, int i) {
        int i2;
        ArrayList arrayList4;
        oq5 oq5Var;
        r5hVar.getClass();
        fvfVar.getClass();
        o0kVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1717038944);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.h(arrayList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            arrayList4 = arrayList2;
            i2 |= oq5Var2.f(arrayList4) ? 32 : 16;
        } else {
            arrayList4 = arrayList2;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.h(arrayList3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.h(r5hVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var2.f(fvfVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var2.f(o0kVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i3 = i2;
        if (oq5Var2.P(i3 & 1, (74899 & i3) != 74898)) {
            vm C = ghh.C(o0kVar, a.c(0.0f, 0.0f, 0.0f, 16, 7));
            yci c = d.c(vci.a, 1.0f);
            boolean h = oq5Var2.h(arrayList) | oq5Var2.h(r5hVar) | oq5Var2.h(arrayList3) | ((i3 & 112) == 32);
            Object K = oq5Var2.K();
            if (h || K == gq5.a) {
                i50 i50Var = new i50(arrayList, arrayList3, arrayList4, r5hVar, 10);
                oq5Var2.k0(i50Var);
                K = i50Var;
            }
            oq5Var = oq5Var2;
            weo.f(c, fvfVar, C, null, null, null, false, null, (Function1) K, oq5Var, ((i3 >> 9) & 112) | 6, 504);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu0(arrayList, arrayList2, arrayList3, r5hVar, fvfVar, o0kVar, i, 8);
        }
    }

    public static final void c(final hg5 hg5Var, final rba rbaVar, final lzs lzsVar, final frs frsVar, final boolean z, final nxq nxqVar, final Function0 function0, final Function0 function02, final Function0 function03, final yci yciVar, c0g c0gVar, Function0 function04, final wn5 wn5Var, hq5 hq5Var, final int i, final int i2, final int i3) {
        int i4;
        boolean z2;
        Function0 function05;
        Function0 function06;
        Function0 function07;
        int i5;
        Function0 function08;
        wn5 wn5Var2;
        oq5 oq5Var;
        final c0g c0gVar2;
        final Function0 function09;
        rbaVar.getClass();
        lzsVar.getClass();
        frsVar.getClass();
        function0.getClass();
        function03.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-578650892);
        if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? oq5Var2.f(hg5Var) : oq5Var2.h(hg5Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= oq5Var2.d(rbaVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= oq5Var2.d(lzsVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= oq5Var2.d(frsVar.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i4 |= oq5Var2.g(z2) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            z2 = z;
        }
        if ((196608 & i) == 0) {
            i4 |= oq5Var2.d(nxqVar.ordinal()) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            function05 = function0;
            i4 |= oq5Var2.h(function05) ? 1048576 : 524288;
        } else {
            function05 = function0;
        }
        if ((12582912 & i) == 0) {
            function06 = function02;
            i4 |= oq5Var2.h(function06) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        } else {
            function06 = function02;
        }
        if ((100663296 & i) == 0) {
            function07 = function03;
            i4 |= oq5Var2.h(function07) ? 67108864 : 33554432;
        } else {
            function07 = function03;
        }
        if ((i & 805306368) == 0) {
            i4 |= oq5Var2.f(yciVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i6 = i3 & 1024;
        if (i6 != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i2 | (oq5Var2.d(c0gVar == null ? -1 : c0gVar.ordinal()) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i7 = i3 & 2048;
        if (i7 != 0) {
            i5 |= 48;
            function08 = function04;
        } else {
            function08 = function04;
            if ((i2 & 48) == 0) {
                i5 |= oq5Var2.h(function08) ? 32 : 16;
            }
        }
        if ((i2 & 384) == 0) {
            wn5Var2 = wn5Var;
            i5 |= oq5Var2.h(wn5Var2) ? 256 : 128;
        } else {
            wn5Var2 = wn5Var;
        }
        int i8 = i5;
        if ((i4 & 306783379) == 306783378 && (i8 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            c0gVar2 = c0gVar;
            oq5Var = oq5Var2;
            function09 = function08;
        } else {
            c0g c0gVar3 = i6 != 0 ? c0g.a : c0gVar;
            Function0 function010 = i7 != 0 ? null : function08;
            boolean a2 = frsVar.a();
            int i9 = i4 >> 3;
            oq5Var = oq5Var2;
            qgg.l(frsVar.b(), rbaVar, lzsVar, z2, a2, function05, function06, function07, wn5Var2, ild.C(-39696133, new wl3(hg5Var, a2, 2), oq5Var2), yciVar, nxqVar, c0gVar3, null, function010, null, 0L, 0L, null, null, false, oq5Var, 805306368 | (i4 & 112) | (i4 & 896) | (i9 & 7168) | (458752 & i9) | (3670016 & i9) | (i9 & 29360128) | ((i8 << 18) & 234881024), ((i4 >> 12) & 112) | ((i4 >> 27) & 14) | ((i8 << 6) & 896) | ((i8 << 9) & 57344), 0, 2072576);
            c0gVar2 = c0gVar3;
            function09 = function010;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: koi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(i | 1);
                    int R2 = rvf.R(i2);
                    t7g.c(hg5.this, rbaVar, lzsVar, frsVar, z, nxqVar, function0, function02, function03, yciVar, c0gVar2, function09, wn5Var, (hq5) obj, R, R2, i3);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(g6p g6pVar, tmb tmbVar, lvf lvfVar, boolean z, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1187393476);
        int i2 = i | (oq5Var.f(g6pVar) ? 4 : 2) | (oq5Var.h(tmbVar) ? 32 : 16) | (oq5Var.h(lvfVar) ? 256 : 128) | (oq5Var.g(z) ? 2048 : 1024) | 24576;
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            qu2 qu2Var = lvfVar.e().c;
            boolean d = Intrinsics.d(qu2Var, mfg.b);
            vci vciVar = vci.a;
            if (d) {
                oq5Var.Z(288682055);
                q7g.j(4, 384, 3, oq5Var, null, false);
                oq5Var.p(false);
            } else {
                boolean z2 = qu2Var instanceof lfg;
                kjn kjnVar = gq5.a;
                if (z2) {
                    oq5Var.Z(288820129);
                    hmj hmjVar = hmj.c;
                    yci q = a.q(d.d(vciVar, 1.0f), 0.0f, 40, 0.0f, 0.0f, 13);
                    boolean z3 = (i2 & 896) == 256 || oq5Var.h(lvfVar);
                    Object K = oq5Var.K();
                    if (z3 || K == kjnVar) {
                        K = new kti(lvfVar, 1);
                        oq5Var.k0(K);
                    }
                    rvf.j((Function1) K, tmbVar, q, 0, false, hmjVar, oq5Var, (i2 & 112) | 196672, 24);
                    oq5Var.p(false);
                } else {
                    if (!(qu2Var instanceof nfg)) {
                        throw vz1.i(oq5Var, -1376162295, false);
                    }
                    oq5Var.Z(289152883);
                    if (z) {
                        oq5Var.Z(289203072);
                        hmj hmjVar2 = hmj.c;
                        yci q2 = a.q(d.d(vciVar, 1.0f), 0.0f, 40, 0.0f, 0.0f, 13);
                        boolean z4 = (i2 & 14) == 4;
                        Object K2 = oq5Var.K();
                        if (z4 || K2 == kjnVar) {
                            K2 = new mjm(21, g6pVar);
                            oq5Var.k0(K2);
                        }
                        rvf.j((Function1) K2, tmbVar, q2, 0, false, hmjVar2, oq5Var, 196672 | (i2 & 112), 24);
                    } else {
                        oq5Var.Z(281969470);
                    }
                    oq5Var.p(false);
                    oq5Var.p(false);
                }
            }
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qr(g6pVar, tmbVar, lvfVar, z, yciVar2, i, 14);
        }
    }

    public static final void e(final Pair pair, final zrj zrjVar, final boolean z, final pjc pjcVar, final Function1 function1, final g6p g6pVar, final tmb tmbVar, final Function0 function0, final float f, yci yciVar, final Function0 function02, hq5 hq5Var, final int i) {
        yci yciVar2;
        boolean z2;
        boolean z3;
        function1.getClass();
        g6pVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-289322677);
        int i2 = i | (oq5Var.h(pair) ? 4 : 2) | (oq5Var.f(zrjVar) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128) | (oq5Var.h(pjcVar) ? 2048 : 1024) | (oq5Var.h(function1) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.f(g6pVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.h(tmbVar) ? 1048576 : 524288) | (oq5Var.h(function0) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | (oq5Var.c(f) ? 67108864 : 33554432) | 805306368;
        int i3 = oq5Var.h(function02) ? 4 : 2;
        if (oq5Var.P(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 3) == 2) ? false : true)) {
            lvf a2 = ovf.a(pjcVar, oq5Var);
            int i4 = lvf.f;
            oq5Var.Z(-818806170);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(null);
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = szf.g0(null);
                oq5Var.k0(K2);
            }
            aqi aqiVar2 = (aqi) K2;
            if ((!Intrinsics.d(aqiVar.getValue(), pair) || a2.e().b.a) && (Intrinsics.d(aqiVar.getValue(), pair) || a2.d() != 0)) {
                z2 = false;
                aqiVar2.setValue(a2);
                aqiVar.setValue(pair);
                oq5Var.p(false);
            } else {
                a2 = (lvf) aqiVar2.getValue();
                z2 = false;
                oq5Var.p(false);
            }
            if (a2 != null) {
                oq5Var.Z(788058069);
                int i5 = (i2 & 126) | ((i2 >> 15) & 896) | ((i3 << 9) & 7168) | 24576 | (458752 & (i2 << 3)) | 2097152;
                int i6 = i2 << 6;
                lvf lvfVar = a2;
                z3 = z2;
                f(pair, zrjVar, function0, function02, function1, lvfVar, g6pVar, tmbVar, z, f, oq5Var, i5 | (29360128 & i6) | 134217728 | (i6 & 234881024) | ((i2 << 21) & 1879048192), (i2 >> 24) & 14);
            } else {
                z3 = z2;
                oq5Var.Z(785079031);
            }
            oq5Var.p(z3);
            yciVar2 = vci.a;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            final yci yciVar3 = yciVar2;
            r.d = new Function2(zrjVar, z, pjcVar, function1, g6pVar, tmbVar, function0, f, yciVar3, function02, i) { // from class: c6p
                public final /* synthetic */ zrj b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ pjc d;
                public final /* synthetic */ Function1 e;
                public final /* synthetic */ g6p f;
                public final /* synthetic */ tmb g;
                public final /* synthetic */ Function0 h;
                public final /* synthetic */ float i;
                public final /* synthetic */ yci j;
                public final /* synthetic */ Function0 k;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(2097153);
                    t7g.e(Pair.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final Pair pair, final zrj zrjVar, final Function0 function0, final Function0 function02, final Function1 function1, final lvf lvfVar, final g6p g6pVar, final tmb tmbVar, final boolean z, final float f, hq5 hq5Var, final int i, final int i2) {
        int i3;
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1972624962);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(pair) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.f(zrjVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.h(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var.h(function02) ? 2048 : 1024;
        }
        int i5 = i & 24576;
        vci vciVar = vci.a;
        if (i5 == 0) {
            i3 |= oq5Var.f(vciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i3 |= oq5Var.h(function1) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((i & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i3 |= (i & 2097152) == 0 ? oq5Var.f(lvfVar) : oq5Var.h(lvfVar) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= (i & 16777216) == 0 ? oq5Var.f(g6pVar) : oq5Var.h(g6pVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((i & 100663296) == 0) {
            i3 |= (i & 134217728) == 0 ? oq5Var.f(tmbVar) : oq5Var.h(tmbVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= oq5Var.g(z) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (oq5Var.c(f) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (oq5Var.P(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            Object[] objArr = new Object[0];
            apo apoVar = fvf.w;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new e5o(20);
                oq5Var.k0(K);
            }
            fvf fvfVar = (fvf) o2g.g0(objArr, apoVar, (Function0) K, oq5Var, 0, 4);
            boolean f2 = oq5Var.f(fvfVar);
            Object K2 = oq5Var.K();
            Continuation continuation = null;
            if (f2 || K2 == kjnVar) {
                K2 = new aq5(fvfVar, continuation, 4);
                oq5Var.k0(K2);
            }
            gld.w(oq5Var, pair, (Function2) K2);
            qxo.b(fvfVar, oq5Var, 0);
            boolean z2 = (i3 & 896) == 256;
            Object K3 = oq5Var.K();
            if (z2 || K3 == kjnVar) {
                K3 = new g1j(16, function0);
                oq5Var.k0(K3);
            }
            ezf.d(fvfVar, (Function0) K3, oq5Var, 0);
            ezf.e(fvfVar, function02, null, oq5Var, (i3 >> 6) & 112);
            yci a2 = androidx.compose.ui.platform.a.a(vciVar, "search_screen_success");
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            vm C = ghh.C(ghh.C(a.c(0.0f, f, 0.0f, 0.0f, 13), zs4.g(oq5Var)), ogp.A(oq5Var));
            if (!(((double) 1.0f) > 0.0d)) {
                qme.a("invalid weight; must be greater than zero");
            }
            yci a4 = androidx.compose.ui.platform.a.a(new LayoutWeightElement(true, 1.0f), "search_screen_items");
            boolean z3 = ((i3 & 112) == 32) | ((458752 & i3) == 131072) | ((3670016 & i3) == 1048576 || ((i3 & 2097152) != 0 && oq5Var.h(lvfVar))) | ((29360128 & i3) == 8388608 || ((i3 & 16777216) != 0 && oq5Var.h(g6pVar))) | ((234881024 & i3) == 67108864 || ((i3 & 134217728) != 0 && oq5Var.h(tmbVar))) | ((i3 & 1879048192) == 536870912);
            Object K4 = oq5Var.K();
            if (z3 || K4 == kjnVar) {
                d6p d6pVar = new d6p(zrjVar, lvfVar, function1, g6pVar, tmbVar, z);
                oq5Var.k0(d6pVar);
                K4 = d6pVar;
            }
            weo.f(a4, fvfVar, C, null, null, null, false, null, (Function1) K4, oq5Var, 0, 504);
            oq5Var = oq5Var;
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: e6p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t7g.f(Pair.this, zrjVar, function0, function02, function1, lvfVar, g6pVar, tmbVar, z, f, (hq5) obj, rvf.R(i | 1), rvf.R(i2));
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(wwp wwpVar, Function1 function1, yci yciVar, hq5 hq5Var, int i) {
        wwp wwpVar2;
        oq5 oq5Var;
        wwpVar.getClass();
        function1.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-71354976);
        int i2 = i | (oq5Var2.h(wwpVar) ? 4 : 2) | (oq5Var2.h(function1) ? 32 : 16);
        if ((i2 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            wwpVar2 = wwpVar;
            oq5Var = oq5Var2;
        } else {
            xwp xwpVar = (xwp) szf.Q(wwpVar.d, oq5Var2).getValue();
            String str = xwpVar.a;
            String str2 = xwpVar.b;
            boolean z = xwpVar.c;
            boolean h = ((i2 & 112) == 32) | oq5Var2.h(wwpVar);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new xum(15, wwpVar, function1);
                oq5Var2.k0(K);
            }
            Function1 function12 = (Function1) K;
            boolean h2 = oq5Var2.h(wwpVar);
            Object K2 = oq5Var2.K();
            if (h2 || K2 == kjnVar) {
                qbp qbpVar = new qbp(0, wwpVar, wwp.class, "onDetailsClick", "onDetailsClick()V", 0, 19);
                wwpVar2 = wwpVar;
                oq5Var2.k0(qbpVar);
                K2 = qbpVar;
            } else {
                wwpVar2 = wwpVar;
            }
            Function0 function0 = (Function0) ((h9f) K2);
            boolean h3 = oq5Var2.h(wwpVar2);
            Object K3 = oq5Var2.K();
            if (h3 || K3 == kjnVar) {
                K3 = new ucm(27, wwpVar2);
                oq5Var2.k0(K3);
            }
            oq5Var = oq5Var2;
            s7g.i(str, str2, z, function12, function0, com.yandex.music.core.ui.compose.a.b(yciVar, null, 0L, 0.0f, null, (Function2) K3, 15), oq5Var, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t2n(wwpVar2, function1, yciVar, i, 11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(yci yciVar, Function0 function0, Function0 function02, Function0 function03, hq5 hq5Var, int i, int i2) {
        yci yciVar2;
        int i3;
        Function0 function04;
        int i4;
        Function0 function05;
        int i5;
        kb5 kb5Var;
        Function0 function06;
        Function0 function07;
        b bVar;
        kb5 kb5Var2;
        kb5 kb5Var3;
        yci yciVar3;
        kb5 kb5Var4;
        int i6;
        int i7;
        boolean z;
        Function0 function08;
        Function0 function09;
        Function0 function010;
        xmn r;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-861443109);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            yciVar2 = yciVar;
        } else if ((i & 6) == 0) {
            yciVar2 = yciVar;
            i3 = (oq5Var.f(yciVar2) ? 4 : 2) | i;
        } else {
            yciVar2 = yciVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(function0) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            function04 = function02;
            i3 |= oq5Var.h(function04) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function05 = function03;
                i3 |= oq5Var.h(function05) ? 2048 : 1024;
                if ((i3 & 1171) == 1170 || !oq5Var.z()) {
                    vci vciVar = vci.a;
                    yci yciVar4 = i8 != 0 ? vciVar : yciVar2;
                    Function0 function011 = i9 != 0 ? null : function04;
                    if (i4 != 0) {
                        function05 = null;
                    }
                    u7g.a(((ma5) oq5Var.j(pa5.a)).g(), oq5Var, 0);
                    float f = 4;
                    yci a2 = androidx.compose.ui.platform.a.a(a.q(d.d(yciVar4, 1.0f), f, f, f, 0.0f, 8), "top_bar_buttons");
                    iz2 iz2Var = b2c.b;
                    kfh d = ug3.d(iz2Var, false);
                    i5 = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, a2);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    kb5 kb5Var5 = wp5.f;
                    g0g.U(oq5Var, d, kb5Var5);
                    kb5 kb5Var6 = wp5.e;
                    g0g.U(oq5Var, l, kb5Var6);
                    kb5Var = wp5.g;
                    if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var, i5, kb5Var);
                    }
                    kb5 kb5Var7 = wp5.d;
                    g0g.U(oq5Var, H, kb5Var7);
                    b bVar2 = b.a;
                    if (function0 == null) {
                        oq5Var.Z(-1132872531);
                        i6 = 0;
                        oq5Var.p(false);
                        kb5Var3 = kb5Var5;
                        function06 = function05;
                        yciVar3 = yciVar4;
                        function07 = function011;
                        bVar = bVar2;
                        kb5Var2 = kb5Var6;
                        kb5Var4 = kb5Var;
                    } else {
                        oq5Var.Z(-1132872530);
                        function06 = function05;
                        function07 = function011;
                        bVar = bVar2;
                        kb5Var2 = kb5Var6;
                        kb5Var3 = kb5Var5;
                        yciVar3 = yciVar4;
                        kb5Var4 = kb5Var;
                        zsd.g(function0, androidx.compose.ui.platform.a.a(bVar2.a(vciVar, iz2Var), "top_bar_back"), 0, 0L, 0, oq5Var, 0, 28);
                        oq5Var = oq5Var;
                        i6 = 0;
                        oq5Var.p(false);
                    }
                    yci a3 = bVar.a(vciVar, b2c.d);
                    nho a4 = lho.a(qx0.a, b2c.k, oq5Var, i6);
                    i7 = oq5Var.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var.l();
                    yci H2 = vnj.H(oq5Var, a3);
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, a4, kb5Var3);
                    g0g.U(oq5Var, l2, kb5Var2);
                    if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                        ouj.x(i7, oq5Var, i7, kb5Var4);
                    }
                    g0g.U(oq5Var, H2, kb5Var7);
                    if (function07 == null) {
                        oq5Var.Z(1657854420);
                        z = false;
                        oq5Var.p(false);
                        function08 = function07;
                    } else {
                        z = false;
                        oq5Var.Z(1657854421);
                        Function0 function012 = function07;
                        a0g.o(48, 4, 0L, oq5Var, androidx.compose.ui.platform.a.a(vciVar, "top_bar_search"), function012);
                        function08 = function012;
                        oq5Var.p(false);
                    }
                    if (function06 == null) {
                        oq5Var.Z(1658050929);
                        oq5Var.p(z);
                        function09 = function06;
                    } else {
                        oq5Var.Z(1658050930);
                        function09 = function06;
                        zdg.g(48, 4, 0L, oq5Var, androidx.compose.ui.platform.a.a(vciVar, "top_bar_overflow"), function09);
                        oq5Var.p(z);
                    }
                    oq5Var.p(true);
                    oq5Var.p(true);
                    function010 = function08;
                    yciVar2 = yciVar3;
                } else {
                    oq5Var.S();
                    function010 = function04;
                    function09 = function05;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new hq(i, i2, yciVar2, function0, function010, function09);
                    return;
                }
                return;
            }
            function05 = function03;
            if ((i3 & 1171) == 1170) {
            }
            vci vciVar2 = vci.a;
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            u7g.a(((ma5) oq5Var.j(pa5.a)).g(), oq5Var, 0);
            float f2 = 4;
            yci a22 = androidx.compose.ui.platform.a.a(a.q(d.d(yciVar4, 1.0f), f2, f2, f2, 0.0f, 8), "top_bar_buttons");
            iz2 iz2Var2 = b2c.b;
            kfh d2 = ug3.d(iz2Var2, false);
            i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, a22);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
            }
            kb5 kb5Var52 = wp5.f;
            g0g.U(oq5Var, d2, kb5Var52);
            kb5 kb5Var62 = wp5.e;
            g0g.U(oq5Var, l3, kb5Var62);
            kb5Var = wp5.g;
            if (!oq5Var.O) {
            }
            ouj.x(i5, oq5Var, i5, kb5Var);
            kb5 kb5Var72 = wp5.d;
            g0g.U(oq5Var, H3, kb5Var72);
            b bVar22 = b.a;
            if (function0 == null) {
            }
            yci a32 = bVar.a(vciVar2, b2c.d);
            nho a42 = lho.a(qx0.a, b2c.k, oq5Var, i6);
            i7 = oq5Var.P;
            androidx.compose.runtime.internal.a l22 = oq5Var.l();
            yci H22 = vnj.H(oq5Var, a32);
            oq5Var.d0();
            if (oq5Var.O) {
            }
            g0g.U(oq5Var, a42, kb5Var3);
            g0g.U(oq5Var, l22, kb5Var2);
            if (!oq5Var.O) {
            }
            ouj.x(i7, oq5Var, i7, kb5Var4);
            g0g.U(oq5Var, H22, kb5Var72);
            if (function07 == null) {
            }
            if (function06 == null) {
            }
            oq5Var.p(true);
            oq5Var.p(true);
            function010 = function08;
            yciVar2 = yciVar3;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        function04 = function02;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function05 = function03;
        if ((i3 & 1171) == 1170) {
        }
        vci vciVar22 = vci.a;
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        u7g.a(((ma5) oq5Var.j(pa5.a)).g(), oq5Var, 0);
        float f22 = 4;
        yci a222 = androidx.compose.ui.platform.a.a(a.q(d.d(yciVar4, 1.0f), f22, f22, f22, 0.0f, 8), "top_bar_buttons");
        iz2 iz2Var22 = b2c.b;
        kfh d22 = ug3.d(iz2Var22, false);
        i5 = oq5Var.P;
        androidx.compose.runtime.internal.a l32 = oq5Var.l();
        yci H32 = vnj.H(oq5Var, a222);
        xp5.T.getClass();
        grb grbVar22 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        kb5 kb5Var522 = wp5.f;
        g0g.U(oq5Var, d22, kb5Var522);
        kb5 kb5Var622 = wp5.e;
        g0g.U(oq5Var, l32, kb5Var622);
        kb5Var = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i5, oq5Var, i5, kb5Var);
        kb5 kb5Var722 = wp5.d;
        g0g.U(oq5Var, H32, kb5Var722);
        b bVar222 = b.a;
        if (function0 == null) {
        }
        yci a322 = bVar.a(vciVar22, b2c.d);
        nho a422 = lho.a(qx0.a, b2c.k, oq5Var, i6);
        i7 = oq5Var.P;
        androidx.compose.runtime.internal.a l222 = oq5Var.l();
        yci H222 = vnj.H(oq5Var, a322);
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a422, kb5Var3);
        g0g.U(oq5Var, l222, kb5Var2);
        if (!oq5Var.O) {
        }
        ouj.x(i7, oq5Var, i7, kb5Var4);
        g0g.U(oq5Var, H222, kb5Var722);
        if (function07 == null) {
        }
        if (function06 == null) {
        }
        oq5Var.p(true);
        oq5Var.p(true);
        function010 = function08;
        yciVar2 = yciVar3;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
    
        if ((r31 & 4) != 0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(String str, boolean z, ges gesVar, hq5 hq5Var, int i, int i2) {
        String str2;
        int i3;
        ges gesVar2;
        long j;
        oq5 oq5Var;
        ges gesVar3;
        int i4;
        str.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-878511365);
        if ((i & 6) == 0) {
            str2 = str;
            i3 = (oq5Var2.f(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                gesVar2 = gesVar;
                if (oq5Var2.f(gesVar2)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                gesVar2 = gesVar;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            gesVar2 = gesVar;
        }
        if ((i3 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
            gesVar3 = gesVar2;
        } else {
            oq5Var2.U();
            if ((i & 1) == 0 || oq5Var2.y()) {
                if ((i2 & 4) != 0) {
                    h6g h6gVar = nu0.a;
                    h6g h6gVar2 = h6g.c;
                    gesVar2 = nu0.i();
                    i3 &= -897;
                }
                ges gesVar4 = gesVar2;
                oq5Var2.q();
                if (z) {
                    oq5Var2.Z(1859141316);
                    j = ((dq0) oq5Var2.j(eq0.a)).b.b;
                } else {
                    oq5Var2.Z(1859142435);
                    j = ((dq0) oq5Var2.j(eq0.a)).b.c;
                }
                oq5Var2.p(false);
                oq5Var = oq5Var2;
                xv7.j(str2, androidx.compose.ui.platform.a.a(d.d(vci.a, 1.0f), "track_subtitle"), j, 0L, 0L, 0, 0L, 2, false, 1, 0, null, gesVar4, oq5Var, (i3 & 14) | 48, ((i3 << 12) & 3670016) | 3120, 55288);
                gesVar3 = gesVar4;
            } else {
                oq5Var2.S();
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qu(str, z, gesVar3, i, i2, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(pbu pbuVar, yci yciVar, g40 g40Var, jd6 jd6Var, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        int i4;
        g40 g40Var2;
        int i5;
        jd6 jd6Var2;
        boolean z;
        g40 g40Var3;
        yci yciVar3;
        g40 g40Var4;
        xmn r;
        pbuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-215986662);
        if ((i & 6) == 0) {
            i3 = (oq5Var.f(pbuVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                g40Var2 = g40Var;
                i3 |= oq5Var.f(g40Var2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    jd6Var2 = jd6Var;
                    i3 |= oq5Var.f(jd6Var2) ? 2048 : 1024;
                    if ((i3 & 1171) == 1170 || !oq5Var.z()) {
                        yci yciVar4 = i6 == 0 ? vci.a : yciVar2;
                        g40 g40Var5 = i4 == 0 ? b2c.c : g40Var2;
                        jd6 jd6Var3 = i5 == 0 ? hd6.a : jd6Var2;
                        z = pbuVar instanceof obu;
                        sdr b = pk0.b(!z ? 1.0f : 0.0f, !z ? new act(100, 300, nya.d) : new a2r(), null, null, oq5Var, 0, 28);
                        if (z) {
                            g40Var3 = g40Var5;
                            jd6Var2 = jd6Var3;
                            if (!pbuVar.equals(lbu.a) && !pbuVar.equals(nbu.a) && !(pbuVar instanceof mbu)) {
                                throw vz1.i(oq5Var, -1404727042, false);
                            }
                            oq5Var.Z(-1404706402);
                            oq5Var.p(false);
                        } else {
                            oq5Var.Z(-596810098);
                            yci a2 = androidx.compose.ui.platform.a.a(yciVar4, "video_cover");
                            boolean f = oq5Var.f(b);
                            Object K = oq5Var.K();
                            kjn kjnVar = gq5.a;
                            if (f || K == kjnVar) {
                                K = new f6u(b, 2);
                                oq5Var.k0(K);
                            }
                            yci s = wyf.s(a2, (Function0) K);
                            g40Var3 = g40Var5;
                            jd6Var2 = jd6Var3;
                            y7g.f(((obu) pbuVar).a, s, g40Var3, jd6Var2, oq5Var, i3 & 8064, 0);
                            boolean z2 = (i3 & 14) == 4;
                            Object K2 = oq5Var.K();
                            if (z2 || K2 == kjnVar) {
                                K2 = new r3s(22, pbuVar);
                                oq5Var.k0(K2);
                            }
                            gld.k(pbuVar, (Function1) K2, oq5Var);
                            oq5Var.p(false);
                        }
                        yciVar3 = yciVar4;
                        g40Var4 = g40Var3;
                    } else {
                        oq5Var.S();
                        yciVar3 = yciVar2;
                        g40Var4 = g40Var2;
                    }
                    jd6 jd6Var4 = jd6Var2;
                    r = oq5Var.r();
                    if (r == null) {
                        r.d = new hq((Object) pbuVar, yciVar3, (Object) g40Var4, (Object) jd6Var4, i, i2, 23);
                        return;
                    }
                    return;
                }
                jd6Var2 = jd6Var;
                if ((i3 & 1171) == 1170) {
                }
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                z = pbuVar instanceof obu;
                sdr b2 = pk0.b(!z ? 1.0f : 0.0f, !z ? new act(100, 300, nya.d) : new a2r(), null, null, oq5Var, 0, 28);
                if (z) {
                }
                yciVar3 = yciVar4;
                g40Var4 = g40Var3;
                jd6 jd6Var42 = jd6Var2;
                r = oq5Var.r();
                if (r == null) {
                }
            }
            g40Var2 = g40Var;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            jd6Var2 = jd6Var;
            if ((i3 & 1171) == 1170) {
            }
            if (i6 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            z = pbuVar instanceof obu;
            sdr b22 = pk0.b(!z ? 1.0f : 0.0f, !z ? new act(100, 300, nya.d) : new a2r(), null, null, oq5Var, 0, 28);
            if (z) {
            }
            yciVar3 = yciVar4;
            g40Var4 = g40Var3;
            jd6 jd6Var422 = jd6Var2;
            r = oq5Var.r();
            if (r == null) {
            }
        }
        yciVar2 = yciVar;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        g40Var2 = g40Var;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        jd6Var2 = jd6Var;
        if ((i3 & 1171) == 1170) {
        }
        if (i6 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        z = pbuVar instanceof obu;
        sdr b222 = pk0.b(!z ? 1.0f : 0.0f, !z ? new act(100, 300, nya.d) : new a2r(), null, null, oq5Var, 0, 28);
        if (z) {
        }
        yciVar3 = yciVar4;
        g40Var4 = g40Var3;
        jd6 jd6Var4222 = jd6Var2;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(Function0 function0, yci yciVar, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        int i4;
        int i5;
        yci yciVar3;
        xmn r;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1052418570);
        if ((i & 6) == 0) {
            i3 = i | (oq5Var.h(function0) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 32 : 16;
            i4 = i3;
            if ((i4 & 19) == 18 || !oq5Var.z()) {
                vci vciVar = vci.a;
                yci yciVar4 = i6 == 0 ? vciVar : yciVar2;
                yci e = d.e(d.d(yciVar4, 1.0f), 472);
                ta5 a2 = sa5.a(qx0.e, b2c.o, oq5Var, 54);
                i5 = oq5Var.P;
                androidx.compose.runtime.internal.a l = oq5Var.l();
                yci H = vnj.H(oq5Var, e);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, a2, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                String M = rvf.M(R.string.wave_for_two_error_bottom_sheet_title, oq5Var);
                ges b = nu0.b();
                agr agrVar = eq0.a;
                xcs.b(M, null, ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, b, oq5Var, 0, 0, 65530);
                xcs.b(vz1.o(vciVar, 8, oq5Var, R.string.wave_for_two_error_bottom_sheet_subtitle, oq5Var), null, ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 0, 0, 65530);
                oq5Var = oq5Var;
                hdg.t(vz1.o(vciVar, 24, oq5Var, R.string.wave_for_two_error_bottom_sheet_button, oq5Var), function0, null, null, oq5Var, (i4 << 3) & 112, 12);
                oq5Var.p(true);
                yciVar3 = yciVar4;
            } else {
                oq5Var.S();
                yciVar3 = yciVar2;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new qtb(function0, yciVar3, i, i2, 3);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        i4 = i3;
        if ((i4 & 19) == 18) {
        }
        vci vciVar2 = vci.a;
        if (i6 == 0) {
        }
        yci e2 = d.e(d.d(yciVar4, 1.0f), 472);
        ta5 a22 = sa5.a(qx0.e, b2c.o, oq5Var, 54);
        i5 = oq5Var.P;
        androidx.compose.runtime.internal.a l2 = oq5Var.l();
        yci H2 = vnj.H(oq5Var, e2);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a22, wp5.f);
        g0g.U(oq5Var, l2, wp5.e);
        kb5 kb5Var2 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i5, oq5Var, i5, kb5Var2);
        g0g.U(oq5Var, H2, wp5.d);
        String M2 = rvf.M(R.string.wave_for_two_error_bottom_sheet_title, oq5Var);
        ges b2 = nu0.b();
        agr agrVar2 = eq0.a;
        xcs.b(M2, null, ((dq0) oq5Var.j(agrVar2)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, b2, oq5Var, 0, 0, 65530);
        xcs.b(vz1.o(vciVar2, 8, oq5Var, R.string.wave_for_two_error_bottom_sheet_subtitle, oq5Var), null, ((dq0) oq5Var.j(agrVar2)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 0, 0, 65530);
        oq5Var = oq5Var;
        hdg.t(vz1.o(vciVar2, 24, oq5Var, R.string.wave_for_two_error_bottom_sheet_button, oq5Var), function0, null, null, oq5Var, (i4 << 3) & 112, 12);
        oq5Var.p(true);
        yciVar3 = yciVar4;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void l(i4v i4vVar, q6v q6vVar, tmb tmbVar, p1v p1vVar, Function0 function0, hq5 hq5Var, int i) {
        oq5 oq5Var;
        tmbVar.getClass();
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1662473353);
        int i2 = i | (oq5Var2.h(i4vVar) ? 4 : 2) | (oq5Var2.f(q6vVar) ? 32 : 16) | (oq5Var2.h(tmbVar) ? 256 : 128) | (oq5Var2.h(p1vVar) ? 2048 : 1024) | (oq5Var2.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID);
        if ((i2 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            int i3 = i2 >> 3;
            int i4 = ((i2 << 12) & 57344) | (i3 & 7168) | (i3 & 14) | 64 | (i3 & 112) | (i3 & 896) | SQLiteDatabase.OPEN_NOMUTEX;
            int i5 = (i4 & 14) ^ 6;
            boolean h = ((i5 > 4 && oq5Var2.f(q6vVar)) || (i4 & 6) == 4) | oq5Var2.h(i4vVar);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new wes(27, q6vVar, i4vVar);
                oq5Var2.k0(K);
            }
            Function1 function1 = (Function1) K;
            oq5Var2.a0(419377738);
            kfu a2 = rpg.a(oq5Var2);
            if (a2 == null) {
                xq0.q("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            boolean z = true;
            bfu R = ngg.R(ern.a(p7v.class), a2, null, k5r.g(p7v.class, new p97(1), function1), a2 instanceof ssd ? ((ssd) a2).getDefaultViewModelCreationExtras() : gs6.b, oq5Var2);
            oq5Var = oq5Var2;
            oq5Var.p(false);
            p7v p7vVar = (p7v) R;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var = ((fs5) K2).a;
            rmb a3 = tmbVar.a(new jab(qkb.WordsInWave, 1, 1, 1), null);
            boolean f = ((i5 > 4 && oq5Var.f(q6vVar)) || (i4 & 6) == 4) | oq5Var.f(mm6Var) | ((((i4 & 112) ^ 48) > 32 && oq5Var.f(tmbVar)) || (i4 & 48) == 32) | ((((i4 & 896) ^ 384) > 256 && oq5Var.f(p1vVar)) || (i4 & 384) == 256);
            if ((((i4 & 7168) ^ 3072) <= 2048 || !oq5Var.f(function0)) && (i4 & 3072) != 2048) {
                z = false;
            }
            boolean z2 = f | z;
            Object K3 = oq5Var.K();
            if (z2 || K3 == kjnVar) {
                n7v n7vVar = new n7v(mm6Var, a3, p1vVar, p7vVar, (vdr) i4vVar.a.b, function0);
                oq5Var.k0(n7vVar);
                K3 = n7vVar;
            }
            v7g.k((n7v) K3, oq5Var, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pli(i4vVar, q6vVar, tmbVar, p1vVar, function0, i);
        }
    }

    public static final thj m(eul eulVar, int i) {
        String str = eulVar.f;
        str.getClass();
        return new thj(pkb.Playlist, str, i + 1, 1, "");
    }

    public static final thj n(cvl cvlVar) {
        cvlVar.getClass();
        return m(bfg.J(cvlVar), 0);
    }

    public static final dko o(boolean z) {
        return z ? new vtm(18) : new fs7(28);
    }

    public static final void p(Reader reader, Function1 function1) {
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, RemoteCameraConfig.Notification.ID);
        try {
            Iterator it = new n86(new wz0(3, bufferedReader)).iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            bufferedReader.close();
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        r3 = kotlin.text.StringsKt__StringsKt.split$default(r3, new java.lang.String[]{io.appmetrica.analytics.coreutils.internal.StringUtils.COMMA}, false, 0, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List q(String str) {
        List split$default;
        if (str != null) {
            if (StringsKt.U(str)) {
                str = null;
            }
            if (str != null && split$default != null) {
                return split$default;
            }
        }
        return c5b.a;
    }

    public static tpq r() {
        return (tpq) tpq.e.getValue();
    }

    public static final String t(Throwable th) {
        int i;
        th.getClass();
        StringWriter stringWriter = new StringWriter();
        far farVar = new far(stringWriter);
        int i2 = -1;
        Throwable th2 = th;
        while (th2 != null) {
            th2 = th2.getCause();
            i2++;
        }
        if (i2 >= 1) {
            i2 = 1;
        }
        Throwable th3 = th;
        while (true) {
            i = 0;
            if (th3 == null || i2 <= 0) {
                break;
            }
            farVar.println(th3.toString());
            StackTraceElement[] stackTrace = th3.getStackTrace();
            int min = Math.min(stackTrace.length, 4);
            while (i < min) {
                farVar.println("\tat " + stackTrace[i]);
                i++;
            }
            th3 = th3.getCause();
            i2--;
            farVar.print("Caused by: ");
        }
        while (true) {
            if ((th3 != null ? th3.getCause() : null) == null) {
                break;
            }
            i++;
            th3 = th3.getCause();
        }
        if (i != 0) {
            farVar.println(String.format(Locale.US, "... %d intermediate causes were omitted.", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
        }
        if (th3 != null) {
            th3.getCause();
            if (th != th3) {
                farVar.print("Caused by: ");
            }
            th3.printStackTrace(farVar);
        }
        String obj = stringWriter.toString();
        farVar.close();
        return obj;
    }

    public static p6g u(fpw fpwVar) {
        return fpwVar.a ? new dmw(true) : new emw(true);
    }

    public static final boolean v(hi3 hi3Var) {
        hi3 hi3Var2;
        int i;
        hi3Var.getClass();
        try {
            hi3Var2 = new hi3();
            long j = hi3Var.b;
            long j2 = 64;
            if (j <= 64) {
                j2 = j;
            }
            hi3Var.I(hi3Var2, 0L, j2);
        } catch (EOFException unused) {
        }
        for (i = 0; i < 16; i++) {
            if (hi3Var2.N()) {
                return true;
            }
            int H0 = hi3Var2.H0();
            if (Character.isISOControl(H0) && !Character.isWhitespace(H0)) {
                return false;
            }
        }
        return true;
    }

    public static spq w() {
        spq spqVar;
        if (((Boolean) tpq.f.getValue()).booleanValue()) {
            Boolean a2 = r().a().a("connectionErrorFallback");
            boolean booleanValue = a2 != null ? a2.booleanValue() : false;
            Boolean a3 = r().a().a("backendErrorFallback");
            boolean booleanValue2 = a3 != null ? a3.booleanValue() : false;
            Integer b = r().a().b("fallbackMaxStale");
            spqVar = new spq(booleanValue, booleanValue2, false, b != null ? b.intValue() : Integer.MAX_VALUE, r().a().b("connectTimeoutMs"), r().a().b("ioTimeoutMs"), null);
        } else {
            spqVar = null;
        }
        ssg.a(3, "SkeletonNetworkConfigExperiment", "Config: " + spqVar, null);
        return spqVar;
    }

    public static r x(int i, p pVar) {
        nhl n = r.n();
        n.d();
        r.f((r) n.b, i);
        n.d();
        r.g((r) n.b, pVar);
        return (r) n.b();
    }

    public static r y(int i, int i2, String str) {
        str.getClass();
        if (i2 == 0) {
            throw null;
        }
        lhl s = p.s();
        ihl i3 = n.i();
        i3.d();
        n.f((n) i3.b, str);
        s.d();
        p.f((p) s.b, (n) i3.b());
        s.h(i2);
        return x(i, (p) s.b());
    }

    public static r z(int i, int i2, String str) {
        str.getClass();
        if (i2 == 0) {
            throw null;
        }
        lhl s = p.s();
        jhl i3 = o.i();
        i3.d();
        o.f((o) i3.b, str);
        s.d();
        p.g((p) s.b, (o) i3.b());
        s.h(i2);
        return x(i, (p) s.b());
    }

    public abstract String s();
}
