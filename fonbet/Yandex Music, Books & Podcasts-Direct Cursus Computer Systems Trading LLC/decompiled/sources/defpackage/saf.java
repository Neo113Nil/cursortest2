package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Shader;
import android.media.Image;
import android.os.Build;
import android.view.KeyEvent;
import androidx.compose.animation.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.material.MinimumInteractiveModifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.a;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.shared.player.download2.GetFileInfoException;
import com.yandex.music.shared.player.download2.InternalDownloadException;
import com.yandex.music.shared.player.download2.InternalTrackContentSourcesException;
import com.yandex.music.shared.player.download2.TrackContentSourceException;
import com.yandex.music.shared.skeleton.data.core.api.block.model.BlockAnalyticsDataDto;
import com.yandex.music.shared.wave.data.network.request.FeedbackEventDto;
import com.yandex.music.shared.wave.data.network.request.FeedbackRequestDto;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.data.audio.WarningContent;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes.dex */
public abstract class saf {
    public static final wn5 a;
    public static final wn5 i;
    public static final wn5 b = new wn5(new jo5(0), 1418354842, false);
    public static final wn5 c = new wn5(new io5(5), 500877966, false);
    public static final wn5 d = new wn5(new ro5(6), 1025086478, false);
    public static final wn5 e = new wn5(new ap5(17), 1724311647, false);
    public static final wn5 f = new wn5(new ap5(18), 2147435227, false);
    public static final wn5 g = new wn5(new rz3(21), 506286331, false);
    public static final wn5 h = new wn5(new ap5(19), -887297484, false);
    public static final f48 j = new f48(4);
    public static final f48 k = new f48(5);
    public static final byte[] l = {112, 114, 111, 0};
    public static final byte[] m = {112, 114, 109, 0};

    static {
        int i2 = 20;
        a = new wn5(new t83(i2), -654220458, false);
        i = new wn5(new ap5(i2), 711402672, false);
    }

    public static final long A(PointF pointF) {
        float f2 = pointF.x;
        float f3 = pointF.y;
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
    }

    public static final void B(CoroutineContext coroutineContext, CancellationException cancellationException) {
        r2f r2fVar = (r2f) coroutineContext.get(o6c.l);
        if (r2fVar != null) {
            r2fVar.g(cancellationException);
        }
    }

    public static final Object C(r2f r2fVar, Continuation continuation) {
        r2fVar.g(null);
        Object j0 = r2fVar.j0(continuation);
        return j0 == nm6.a ? j0 : Unit.a;
    }

    public static final void D(CoroutineContext coroutineContext, CancellationException cancellationException) {
        Sequence a2;
        r2f r2fVar = (r2f) coroutineContext.get(o6c.l);
        if (r2fVar == null || (a2 = r2fVar.a()) == null) {
            return;
        }
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            ((r2f) it.next()).g(cancellationException);
        }
    }

    public static void E(r2f r2fVar) {
        Iterator it = r2fVar.a().iterator();
        while (it.hasNext()) {
            ((r2f) it.next()).g(null);
        }
    }

    public static void F(long j2, d7k d7kVar, azs[] azsVarArr) {
        int i2;
        while (true) {
            if (d7kVar.a() <= 1) {
                return;
            }
            int i3 = 0;
            while (true) {
                if (d7kVar.a() == 0) {
                    i2 = -1;
                    break;
                }
                int v = d7kVar.v();
                i3 += v;
                if (v != 255) {
                    i2 = i3;
                    break;
                }
            }
            int i4 = 0;
            while (true) {
                if (d7kVar.a() == 0) {
                    i4 = -1;
                    break;
                }
                int v2 = d7kVar.v();
                i4 += v2;
                if (v2 != 255) {
                    break;
                }
            }
            int i5 = d7kVar.b + i4;
            if (i4 == -1 || i4 > d7kVar.a()) {
                vq1.n0("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i5 = d7kVar.c;
            } else if (i2 == 4 && i4 >= 8) {
                int v3 = d7kVar.v();
                int B = d7kVar.B();
                int h2 = B == 49 ? d7kVar.h() : 0;
                int v4 = d7kVar.v();
                if (B == 47) {
                    d7kVar.I(1);
                }
                boolean z = v3 == 181 && (B == 49 || B == 47) && v4 == 3;
                if (B == 49) {
                    z &= h2 == 1195456820;
                }
                if (z) {
                    G(j2, d7kVar, azsVarArr);
                }
            }
            d7kVar.H(i5);
        }
    }

    public static void G(long j2, d7k d7kVar, azs[] azsVarArr) {
        int v = d7kVar.v();
        if ((v & 64) != 0) {
            d7kVar.I(1);
            int i2 = (v & 31) * 3;
            int i3 = d7kVar.b;
            for (azs azsVar : azsVarArr) {
                d7kVar.H(i3);
                azsVar.b(d7kVar, i2, 0);
                vq1.A(j2 != -9223372036854775807L);
                azsVar.a(j2, 1, i2, 0, null);
            }
        }
    }

    public static rab H(oq oqVar, boolean z) {
        String str;
        l18 l18Var = l18.b;
        String str2 = oqVar.b;
        String L = xp3.L(oqVar.n, c5b.a);
        if (z) {
            bdt I = hag.I(skr.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            skr skrVar = (skr) qdcVar.C(I);
            Album$AlbumType d2 = oqVar.d();
            Album$AlbumType album$AlbumType = Album$AlbumType.SINGLE;
            str = oqVar.i;
            if (d2 == album$AlbumType) {
                str = ouj.o(str, " · ", skrVar.c(R.string.album_type_single));
            } else if (str == null) {
                str = "";
            }
        } else if (oqVar.d() == Album$AlbumType.SINGLE) {
            bdt I2 = hag.I(skr.class);
            qdc qdcVar2 = l18Var.a;
            qdcVar2.getClass();
            str = ((skr) qdcVar2.C(I2)).c(R.string.album_type_single);
        } else {
            str = null;
        }
        return new rab(str2, L, str, vz1.w(oqVar.D.a), oqVar.i(), oqVar.g == WarningContent.EXPLICIT, oqVar.B);
    }

    public static rab I(o20 o20Var) {
        o20Var.getClass();
        lt ltVar = o20Var.a;
        u9b u9bVar = ltVar.e;
        String e2 = u9bVar != null ? u9bVar.e(wct.s(), WebPath$Storage.AVATARS) : null;
        if (e2 == null) {
            e2 = "";
        }
        return new rab(ltVar.c, CollectionsKt.X(o20Var.b, null, null, null, new u4(18), 31), null, e2, ltVar.g, ltVar.d == WarningContent.EXPLICIT, o20Var.c);
    }

    public static byte[] J(fio[] fioVarArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (fio fioVar : fioVarArr) {
            i3 += ((((fioVar.i * 2) + 7) & (-8)) / 8) + (fioVar.f * 2) + P(bArr, (String) fioVar.b, (String) fioVar.c).getBytes(StandardCharsets.UTF_8).length + 16 + fioVar.h;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, irf.j)) {
            int length = fioVarArr.length;
            while (i2 < length) {
                fio fioVar2 = fioVarArr[i2];
                v0(byteArrayOutputStream, fioVar2, P(bArr, (String) fioVar2.b, (String) fioVar2.c));
                u0(byteArrayOutputStream, fioVar2);
                i2++;
            }
        } else {
            for (fio fioVar3 : fioVarArr) {
                v0(byteArrayOutputStream, fioVar3, P(bArr, (String) fioVar3.b, (String) fioVar3.c));
            }
            int length2 = fioVarArr.length;
            while (i2 < length2) {
                u0(byteArrayOutputStream, fioVarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static final void K(CoroutineContext coroutineContext) {
        r2f r2fVar = (r2f) coroutineContext.get(o6c.l);
        if (r2fVar != null && !r2fVar.b()) {
            throw r2fVar.D();
        }
    }

    public static final String L(Date date) {
        date.getClass();
        tn tnVar = (tn) swf.H().d.getValue();
        tnVar.getClass();
        Calendar.getInstance().setTimeInMillis(System.currentTimeMillis());
        Calendar.getInstance().setTime(date);
        String replace = tnVar.a.r(date).replace(' ', (char) 160);
        replace.getClass();
        return replace;
    }

    public static String M(long j2) {
        l18 l18Var = l18.b;
        bdt I = hag.I(skr.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        skr skrVar = (skr) qdcVar.C(I);
        long j3 = j2 / 60000;
        if (j3 <= 45) {
            return String.format("%d %s", Arrays.copyOf(new Object[]{Long.valueOf(j3), skrVar.a(R.plurals.number_of_minutes, (int) j3)}, 2));
        }
        double c2 = eeh.c(j3 / 30.0d) * 0.5d;
        return String.format("%s %s", Arrays.copyOf(new Object[]{new DecimalFormat("#.#").format(c2), skrVar.a(R.plurals.number_of_hours, (int) (c2 + 0.5d))}, 2));
    }

    public static final String N(long j2) {
        long j3 = j2 / 1000;
        long j4 = (j3 / 60) + (((int) j3) % 60 >= 30 ? 1 : 0);
        l18 l18Var = l18.b;
        bdt I = hag.I(skr.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        skr skrVar = (skr) qdcVar.C(I);
        if (j4 < 60) {
            int i2 = (int) j4;
            return skrVar.b(R.plurals.number_of_minutes_rtl_support, i2, Integer.valueOf(i2));
        }
        int i3 = (int) ((j4 / 60) + (((int) j4) % 60 >= 30 ? 1 : 0));
        return skrVar.b(R.plurals.number_of_hours_rtl_support, i3, Integer.valueOf(i3));
    }

    public static final dzn O(ews ewsVar, dxb dxbVar, vgb vgbVar, agb agbVar, InternalDownloadException internalDownloadException, String str, String str2) {
        pq4 pq4Var;
        pq4 pq4Var2;
        be6 be6Var;
        return new dzn(str2, vgbVar, agbVar, ewsVar != null ? ewsVar.a : null, (ewsVar == null || (be6Var = ewsVar.b) == null) ? null : asq.S(be6Var), (ewsVar == null || (pq4Var2 = ewsVar.c) == null) ? null : pq4Var2.a.a, (ewsVar == null || (pq4Var = ewsVar.c) == null) ? null : Integer.valueOf(pq4Var.b), dxbVar != null ? dxbVar.a : null, str);
    }

    public static String P(byte[] bArr, String str, String str2) {
        byte[] bArr2 = irf.k;
        byte[] bArr3 = irf.l;
        Object obj = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? StringUtils.PROCESS_POSTFIX_DELIMITER : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "!");
            }
            if (StringUtils.PROCESS_POSTFIX_DELIMITER.equals(obj)) {
                return str2.replace("!", StringUtils.PROCESS_POSTFIX_DELIMITER);
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(StringUtils.PROCESS_POSTFIX_DELIMITER)) {
                if ("!".equals(obj)) {
                    return str2.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "!");
                }
                if (StringUtils.PROCESS_POSTFIX_DELIMITER.equals(obj)) {
                    return str2.replace("!", StringUtils.PROCESS_POSTFIX_DELIMITER);
                }
            } else if (!str2.endsWith(".apk")) {
                return su4.o(dfi.k(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? StringUtils.PROCESS_POSTFIX_DELIMITER : "!", str2);
            }
        }
        return str2;
    }

    public static final r2f Q(CoroutineContext coroutineContext) {
        r2f r2fVar = (r2f) coroutineContext.get(o6c.l);
        if (r2fVar != null) {
            return r2fVar;
        }
        b6e.l(coroutineContext, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final long R(KeyEvent keyEvent) {
        return y2x.h(keyEvent.getKeyCode());
    }

    public static final int S(ogi ogiVar, long j2, aeu aeuVar) {
        float g2 = aeuVar != null ? aeuVar.g() : 0.0f;
        int i2 = (int) (4294967295L & j2);
        int f2 = ogiVar.f(Float.intBitsToFloat(i2));
        if (Float.intBitsToFloat(i2) < ogiVar.h(f2) - g2 || Float.intBitsToFloat(i2) > ogiVar.c(f2) + g2) {
            return -1;
        }
        int i3 = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i3) < (-g2) || Float.intBitsToFloat(i3) > ogiVar.d + g2) {
            return -1;
        }
        return f2;
    }

    public static final long T(axf axfVar, ynn ynnVar, int i2) {
        e7o e7oVar = bs4.l;
        dds d2 = axfVar.d();
        ogi ogiVar = d2 != null ? d2.a.b : null;
        wof c2 = axfVar.c();
        return (ogiVar == null || c2 == null) ? rds.b : ogiVar.j(ynnVar.l(c2.x(0L)), i2, e7oVar);
    }

    public static final int U(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final gzn V(ews ewsVar, dxb dxbVar, InternalDownloadException internalDownloadException, agb agbVar) {
        pq4 pq4Var;
        pq4 pq4Var2;
        be6 be6Var;
        String str;
        pq4 pq4Var3;
        pq4 pq4Var4;
        be6 be6Var2;
        pq4 pq4Var5;
        pq4 pq4Var6;
        be6 be6Var3;
        pq4 pq4Var7;
        pq4 pq4Var8;
        be6 be6Var4;
        pq4 pq4Var9;
        pq4 pq4Var10;
        be6 be6Var5;
        pq4 pq4Var11;
        pq4 pq4Var12;
        be6 be6Var6;
        pq4 pq4Var13;
        pq4 pq4Var14;
        be6 be6Var7;
        pq4 pq4Var15;
        pq4 pq4Var16;
        be6 be6Var8;
        pq4 pq4Var17;
        pq4 pq4Var18;
        be6 be6Var9;
        pq4 pq4Var19;
        pq4 pq4Var20;
        be6 be6Var10;
        if (agbVar == null) {
            InternalTrackContentSourcesException internalTrackContentSourcesException = internalDownloadException instanceof InternalTrackContentSourcesException ? (InternalTrackContentSourcesException) internalDownloadException : null;
            agbVar = internalTrackContentSourcesException instanceof GetFileInfoException ? agb.GetFileInfo : internalTrackContentSourcesException instanceof TrackContentSourceException ? agb.TrackContentSources : agb.Source;
        }
        agb agbVar2 = agbVar;
        if (internalDownloadException instanceof ste) {
            ste steVar = (ste) internalDownloadException;
            if (steVar instanceof tte) {
                vgb vgbVar = vgb.Network;
                String str2 = ewsVar != null ? ewsVar.a : null;
                String S = (ewsVar == null || (be6Var10 = ewsVar.b) == null) ? null : asq.S(be6Var10);
                Integer valueOf = (ewsVar == null || (pq4Var20 = ewsVar.c) == null) ? null : Integer.valueOf(pq4Var20.b);
                String str3 = dxbVar != null ? dxbVar.a : null;
                if (ewsVar != null && (pq4Var19 = ewsVar.c) != null) {
                    r0 = pq4Var19.a.a;
                }
                return new dzn("NetworkNotAllowed", agbVar2, str2, S, r0, valueOf, str3, vzi.NetworkNotAllowed, (String) null);
            }
            if (steVar instanceof yte) {
                vgb vgbVar2 = vgb.Network;
                String str4 = ewsVar != null ? ewsVar.a : null;
                String S2 = (ewsVar == null || (be6Var9 = ewsVar.b) == null) ? null : asq.S(be6Var9);
                Integer valueOf2 = (ewsVar == null || (pq4Var18 = ewsVar.c) == null) ? null : Integer.valueOf(pq4Var18.b);
                String str5 = dxbVar != null ? dxbVar.a : null;
                if (ewsVar != null && (pq4Var17 = ewsVar.c) != null) {
                    r0 = pq4Var17.a.a;
                }
                return new dzn("SocketTimeout", agbVar2, str4, S2, r0, valueOf2, str5, vzi.SocketTimeout, (String) null);
            }
            if (steVar instanceof wte) {
                vgb vgbVar3 = vgb.Network;
                String str6 = ewsVar != null ? ewsVar.a : null;
                String S3 = (ewsVar == null || (be6Var8 = ewsVar.b) == null) ? null : asq.S(be6Var8);
                Integer valueOf3 = (ewsVar == null || (pq4Var16 = ewsVar.c) == null) ? null : Integer.valueOf(pq4Var16.b);
                String str7 = dxbVar != null ? dxbVar.a : null;
                if (ewsVar != null && (pq4Var15 = ewsVar.c) != null) {
                    r0 = pq4Var15.a.a;
                }
                return new dzn("ResponseBad", agbVar2, str6, S3, r0, valueOf3, str7, vzi.ResponseBad, (String) null);
            }
            if (steVar instanceof xte) {
                vgb vgbVar4 = vgb.Network;
                String str8 = ewsVar != null ? ewsVar.a : null;
                String S4 = (ewsVar == null || (be6Var7 = ewsVar.b) == null) ? null : asq.S(be6Var7);
                Integer valueOf4 = (ewsVar == null || (pq4Var14 = ewsVar.c) == null) ? null : Integer.valueOf(pq4Var14.b);
                String str9 = dxbVar != null ? dxbVar.a : null;
                if (ewsVar != null && (pq4Var13 = ewsVar.c) != null) {
                    r0 = pq4Var13.a.a;
                }
                return new dzn("ResponseCode", agbVar2, str8, S4, r0, valueOf4, str9, vzi.ResponseCode, String.valueOf(((xte) steVar).a));
            }
            if (!(steVar instanceof due)) {
                b6e.s();
                return null;
            }
            String simpleName = ((due) steVar).a.getClass().getSimpleName();
            vgb vgbVar5 = vgb.Network;
            String str10 = ewsVar != null ? ewsVar.a : null;
            String S5 = (ewsVar == null || (be6Var6 = ewsVar.b) == null) ? null : asq.S(be6Var6);
            Integer valueOf5 = (ewsVar == null || (pq4Var12 = ewsVar.c) == null) ? null : Integer.valueOf(pq4Var12.b);
            String str11 = dxbVar != null ? dxbVar.a : null;
            if (ewsVar != null && (pq4Var11 = ewsVar.c) != null) {
                r0 = pq4Var11.a.a;
            }
            return new dzn(simpleName, agbVar2, str10, S5, r0, valueOf5, str11, vzi.UnknownNetworkFail, (String) null);
        }
        if (internalDownloadException instanceof zte) {
            zte zteVar = (zte) internalDownloadException;
            if (zteVar instanceof ute) {
                vgb vgbVar6 = vgb.Network;
                return new dzn("NotEnoughSpace", agbVar2, ewsVar != null ? ewsVar.a : null, (ewsVar == null || (be6Var5 = ewsVar.b) == null) ? null : asq.S(be6Var5), jhr.NotEnoughSpace, (ewsVar == null || (pq4Var10 = ewsVar.c) == null) ? null : pq4Var10.a.a, (ewsVar == null || (pq4Var9 = ewsVar.c) == null) ? null : Integer.valueOf(pq4Var9.b), dxbVar != null ? dxbVar.a : null, (String) null);
            }
            if (zteVar instanceof aue) {
                vgb vgbVar7 = vgb.Network;
                return new dzn("StorageUnavailableLegacyFormat", agbVar2, ewsVar != null ? ewsVar.a : null, (ewsVar == null || (be6Var4 = ewsVar.b) == null) ? null : asq.S(be6Var4), jhr.StorageUnavailable, (ewsVar == null || (pq4Var8 = ewsVar.c) == null) ? null : pq4Var8.a.a, (ewsVar == null || (pq4Var7 = ewsVar.c) == null) ? null : Integer.valueOf(pq4Var7.b), dxbVar != null ? dxbVar.a : null, (String) null);
            }
            if (!(zteVar instanceof eue)) {
                b6e.s();
                return null;
            }
            IOException iOException = ((eue) zteVar).a;
            String simpleName2 = iOException.getClass().getSimpleName();
            vgb vgbVar8 = vgb.Network;
            return new dzn(simpleName2, agbVar2, ewsVar != null ? ewsVar.a : null, (ewsVar == null || (be6Var3 = ewsVar.b) == null) ? null : asq.S(be6Var3), jhr.UnknownStorageFail, (ewsVar == null || (pq4Var6 = ewsVar.c) == null) ? null : pq4Var6.a.a, (ewsVar == null || (pq4Var5 = ewsVar.c) == null) ? null : Integer.valueOf(pq4Var5.b), dxbVar != null ? dxbVar.a : null, asq.U(iOException));
        }
        if (!(internalDownloadException instanceof pte)) {
            if (internalDownloadException instanceof qte) {
                return O(ewsVar, dxbVar, vgb.Corrupted, agbVar2, internalDownloadException, ((qte) internalDownloadException).a, "Corrupted");
            }
            if (internalDownloadException instanceof rte) {
                return O(ewsVar, dxbVar, vgb.Corrupted, agbVar2, internalDownloadException, ((rte) internalDownloadException).a, "CorruptedFileHeader");
            }
            if (internalDownloadException instanceof vte) {
                return O(ewsVar, dxbVar, vgb.Unknown, agb.Renderer, internalDownloadException, ((vte) internalDownloadException).a, "RendererDecodeFailed");
            }
            if (internalDownloadException instanceof cue) {
                IOException iOException2 = ((cue) internalDownloadException).a;
                iOException2.getClass();
                return new ezn(iOException2.getClass().getSimpleName(), vgb.UnknownIo, agbVar2, ewsVar != null ? ewsVar.a : null, (ewsVar == null || (be6Var = ewsVar.b) == null) ? null : asq.S(be6Var), (ewsVar == null || (pq4Var2 = ewsVar.c) == null) ? null : pq4Var2.a.a, (ewsVar == null || (pq4Var = ewsVar.c) == null) ? null : Integer.valueOf(pq4Var.b), dxbVar != null ? dxbVar.a : null, iOException2.getClass().getName(), asq.U(iOException2));
            }
            if (internalDownloadException instanceof ats) {
                IllegalStateException illegalStateException = ((ats) internalDownloadException).a;
                return t0(ewsVar, dxbVar, agbVar2, illegalStateException, "IllegalStateException", illegalStateException.getClass().getName());
            }
            b6e.s();
            return null;
        }
        vgb vgbVar9 = vgb.Network;
        pte pteVar = (pte) internalDownloadException;
        bb6 bb6Var = pteVar.a;
        String str12 = pteVar.b;
        bb6Var.getClass();
        str12.getClass();
        String name = pte.class.getName();
        String str13 = ewsVar != null ? ewsVar.a : null;
        String S6 = (ewsVar == null || (be6Var2 = ewsVar.b) == null) ? null : asq.S(be6Var2);
        String str14 = (ewsVar == null || (pq4Var4 = ewsVar.c) == null) ? null : pq4Var4.a.a;
        Integer valueOf6 = (ewsVar == null || (pq4Var3 = ewsVar.c) == null) ? null : Integer.valueOf(pq4Var3.b);
        String str15 = dxbVar != null ? dxbVar.a : null;
        int i2 = pzn.a[bb6Var.ordinal()];
        if (i2 == -1) {
            ssg.a(5, "reportUtils", "Null value on container, change to unknown", null);
            str = "unknown";
        } else if (i2 == 1) {
            str = "raw";
        } else if (i2 == 2) {
            str = "hls";
        } else {
            if (i2 != 3) {
                b6e.s();
                return null;
            }
            str = "encraw";
        }
        return new dzn(name, agbVar2, str13, S6, str, str12, str14, valueOf6, str15);
    }

    public static final qa8 W(r2f r2fVar, boolean z, y2f y2fVar) {
        if (r2fVar instanceof h3f) {
            return ((h3f) r2fVar).S(z, y2fVar);
        }
        return r2fVar.Y(y2fVar.k(), z, new aub(1, y2fVar, y2f.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 23));
    }

    public static final boolean X(CoroutineContext coroutineContext) {
        r2f r2fVar = (r2f) coroutineContext.get(o6c.l);
        if (r2fVar != null) {
            return r2fVar.b();
        }
        return true;
    }

    public static final boolean Y(i3b i3bVar) {
        String str = null;
        lfp lfpVar = (lfp) i3bVar.a.a(null, kb5.B0);
        ifp ifpVar = lfpVar != null ? lfpVar.a : null;
        if (ifpVar != null) {
            Object obj = ifpVar.a.get(wdp.i);
            if (obj == null) {
                obj = null;
            }
            List list = (List) obj;
            if (list != null) {
                str = (String) list.get(0);
            }
        }
        return str == null || str.length() == 0;
    }

    public static final boolean Z(int i2) {
        int type = Character.getType(i2);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final void a(u51 u51Var, ArrayList arrayList, final sp1 sp1Var, final nii niiVar, final gjl gjlVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2132652214);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(u51Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(arrayList) : oq5Var.h(arrayList) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(sp1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(niiVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.h(gjlVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if (((i3 | 196608) & 74899) == 74898 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            final float f2 = ((cma) oq5Var.j(lkg.b)).a;
            Pair pair = new Pair(u51Var, arrayList);
            vci vciVar = vci.a;
            tt0.g(pair, b.a(vciVar, null, 3), null, null, ild.C(325416739, new pyc() { // from class: lp1
                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Pair pair2 = (Pair) obj;
                    ((Integer) obj3).getClass();
                    pair2.getClass();
                    final u51 u51Var2 = (u51) pair2.a;
                    final List list = (List) pair2.b;
                    yci a2 = a.a(vci.a, "concerts_horizontal_pager");
                    int size = list.size();
                    oq5 oq5Var2 = (oq5) ((hq5) obj2);
                    o0k o0kVar = (o0k) oq5Var2.j(lkg.a);
                    float f3 = f2;
                    final gjl gjlVar2 = gjlVar;
                    final sp1 sp1Var2 = sp1Var;
                    jf0.m(niiVar, size, 2, 3, ild.C(-288058885, new tyc() { // from class: mp1
                        @Override // defpackage.tyc
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i4;
                            qkl qklVar;
                            int intValue = ((Integer) obj4).intValue();
                            int intValue2 = ((Integer) obj5).intValue();
                            int intValue3 = ((Integer) obj6).intValue();
                            hq5 hq5Var2 = (hq5) obj7;
                            int intValue4 = ((Integer) obj8).intValue();
                            if ((intValue4 & 6) == 0) {
                                i4 = (((oq5) hq5Var2).d(intValue) ? 4 : 2) | intValue4;
                            } else {
                                i4 = intValue4;
                            }
                            if ((intValue4 & 48) == 0) {
                                i4 |= ((oq5) hq5Var2).d(intValue2) ? 32 : 16;
                            }
                            if ((intValue4 & 384) == 0) {
                                i4 |= ((oq5) hq5Var2).d(intValue3) ? 256 : 128;
                            }
                            if ((i4 & 1171) == 1170) {
                                oq5 oq5Var3 = (oq5) hq5Var2;
                                if (oq5Var3.z()) {
                                    oq5Var3.S();
                                    return Unit.a;
                                }
                            }
                            List list2 = list;
                            pp1 pp1Var = (pp1) list2.get(intValue);
                            int size2 = list2.size();
                            oq5 oq5Var4 = (oq5) hq5Var2;
                            gjl gjlVar3 = gjlVar2;
                            boolean d2 = oq5Var4.d(size2) | oq5Var4.f(gjlVar3) | oq5Var4.f(pp1Var) | ((i4 & 112) == 32);
                            boolean z = (i4 & 896) == 256;
                            u51 u51Var3 = u51Var2;
                            boolean f4 = d2 | z | oq5Var4.f(u51Var3);
                            Object K = oq5Var4.K();
                            kjn kjnVar = gq5.a;
                            if (f4 || K == kjnVar) {
                                if (gjlVar3 == null) {
                                    qklVar = null;
                                } else {
                                    pkb pkbVar = pkb.Concert;
                                    String str = pp1Var.b.a;
                                    str.getClass();
                                    qklVar = new qkl(gjlVar3, new thj(pkbVar, str, intValue2 + 1, intValue3 + 1, ""));
                                }
                                K = qklVar;
                                oq5Var4.k0(K);
                            }
                            qkl qklVar2 = (qkl) K;
                            ynn i5 = irv.i(oq5Var4);
                            sp1 sp1Var3 = sp1Var2;
                            boolean h2 = oq5Var4.h(sp1Var3);
                            Object K2 = oq5Var4.K();
                            if (h2 || K2 == kjnVar) {
                                K2 = new u2(14, sp1Var3);
                                oq5Var4.k0(K2);
                            }
                            saf.i(pp1Var, u51Var3, qklVar2, sp1Var3, com.yandex.music.core.ui.compose.a.c(vci.a, i5, qklVar2, (pyc) K2, 14), oq5Var4, 8);
                            return Unit.a;
                        }
                    }, oq5Var2), a2, o0kVar, f3 * 2, f3, oq5Var2, 224640, 256);
                    return Unit.a;
                }
            }, oq5Var), oq5Var, 24576, 12);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu0(u51Var, arrayList, sp1Var, niiVar, gjlVar, yciVar2, i2, 2);
        }
    }

    public static final boolean a0(int i2) {
        return Character.isWhitespace(i2) || i2 == 160;
    }

    public static final void b(String str, String str2, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        String str3;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-653063905);
        int i3 = i2 | (oq5Var2.f(str) ? 4 : 2) | (oq5Var2.f(str2) ? 32 : 16);
        if ((i3 & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
            str3 = str2;
        } else {
            vci vciVar = vci.a;
            if (str == null) {
                oq5Var2.Z(775138959);
            } else {
                oq5Var2.Z(775138960);
                ltg.e(qo6.d, str, xp3.u(d.m(vciVar, 32), ugo.a), null, null, null, null, null, oq5Var2, 6, 248);
            }
            oq5Var2.p(false);
            u1g.l(oq5Var2, d.r(vciVar, 8));
            oq5Var = oq5Var2;
            str3 = str2;
            xv7.j(str3, neg.k(), 0L, 0L, 0L, 0, 0L, 2, false, 1, 0, null, null, oq5Var, (i3 >> 3) & 14, 3120, 120828);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kp1(str, str3, i2);
        }
    }

    public static final boolean b0(int i2) {
        int type;
        return (!a0(i2) || (type = Character.getType(i2)) == 14 || type == 13 || i2 == 10) ? false : true;
    }

    public static final void c(zp1 zp1Var, nii niiVar, sp1 sp1Var, hq5 hq5Var, int i2) {
        int i3;
        boolean z;
        ArrayList arrayList = zp1Var.b;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1509461991);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(zp1Var) : oq5Var.h(zp1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(niiVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(sp1Var) ? 256 : 128;
        }
        int i4 = i3;
        if ((i4 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, vci.a);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            int i6 = i4 & 14;
            boolean z2 = i6 == 4 || ((i4 & 8) != 0 && oq5Var.f(zp1Var));
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z2 || K == kjnVar) {
                K = szf.g0(CollectionsKt.Q(arrayList));
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            tt0.g(zp1Var, null, null, null, ild.C(-272392154, new ar(11, aqiVar, sp1Var), oq5Var), oq5Var, 24584 | i6, 14);
            u51 u51Var = ((op1) aqiVar.getValue()).b;
            ArrayList arrayList2 = ((op1) aqiVar.getValue()).c;
            boolean f2 = oq5Var.f((op1) aqiVar.getValue()) | (i6 == 4 || ((i4 & 8) != 0 && oq5Var.f(zp1Var)));
            Object K2 = oq5Var.K();
            if (f2 || K2 == kjnVar) {
                vtm vtmVar = zp1Var.c;
                if (vtmVar != null) {
                    int indexOf = arrayList.indexOf(aqiVar.getValue());
                    pkl pklVar = (pkl) vtmVar.a;
                    int size = ((op1) aqiVar.getValue()).c.size();
                    u51 u51Var2 = ((op1) aqiVar.getValue()).b;
                    sp1Var.getClass();
                    String str = u51Var2.b;
                    str.getClass();
                    z = true;
                    K2 = new gjl(pklVar, size, new fcc("artist_name", str, indexOf + 1));
                } else {
                    z = true;
                    K2 = null;
                }
                oq5Var.k0(K2);
            } else {
                z = true;
            }
            a(u51Var, arrayList2, sp1Var, niiVar, (gjl) K2, null, oq5Var, (i4 & 896) | 64 | ((i4 << 6) & 7168));
            oq5Var = oq5Var;
            oq5Var.p(z);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b3(zp1Var, niiVar, sp1Var, i2, 15);
        }
    }

    public static final float c0(long j2) {
        msa msaVar = nsa.b;
        return (float) nsa.r(yd5.N(j2, ssa.MILLISECONDS), ssa.SECONDS);
    }

    public static final void d(aq1 aq1Var, nii niiVar, sp1 sp1Var, hq5 hq5Var, int i2) {
        int i3;
        kjn kjnVar;
        j4x j4xVar;
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(866269314);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(aq1Var) : oq5Var.h(aq1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(niiVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(sp1Var) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, vci.a);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            String str = aq1Var.a;
            j4x j4xVar2 = aq1Var.d;
            kjn kjnVar2 = gq5.a;
            if (str == null) {
                oq5Var.Z(-369745293);
                oq5Var.p(false);
                i4 = i3;
                j4xVar = j4xVar2;
                kjnVar = kjnVar2;
            } else {
                oq5Var.Z(-369745292);
                o0k o0kVar = (o0k) oq5Var.j(lkg.a);
                boolean h2 = ((i3 & 14) == 4 || ((i3 & 8) != 0 && oq5Var.h(aq1Var))) | oq5Var.h(sp1Var);
                Object K = oq5Var.K();
                if (h2 || K == kjnVar2) {
                    K = new ap1(1, sp1Var, aq1Var);
                    oq5Var.k0(K);
                }
                kjnVar = kjnVar2;
                j4xVar = j4xVar2;
                i4 = i3;
                irf.h(str, null, null, o0kVar, (Function0) K, false, null, false, null, oq5Var, 0, 486);
                oq5Var.p(false);
            }
            u51 u51Var = aq1Var.b;
            ArrayList arrayList = aq1Var.c;
            boolean f2 = oq5Var.f(j4xVar);
            Object K2 = oq5Var.K();
            if (f2 || K2 == kjnVar) {
                K2 = j4xVar != null ? new gjl((pkl) j4xVar.c, j4xVar.b, (fcc) null) : null;
                oq5Var.k0(K2);
            }
            int i6 = i4;
            a(u51Var, arrayList, sp1Var, niiVar, (gjl) K2, null, oq5Var, (i6 & 896) | 64 | ((i6 << 6) & 7168));
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new b3(aq1Var, niiVar, sp1Var, i2, 16);
        }
    }

    public static final Object d0(a7f a7fVar) {
        int peek = a7fVar.peek();
        int D = ouj.D(peek);
        if (D == 0) {
            ArrayList n = tlm.n(a7fVar);
            while (a7fVar.hasNext()) {
                n.add(d0(a7fVar));
            }
            a7fVar.l();
            return n;
        }
        if (D == 2) {
            a7fVar.j();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (a7fVar.hasNext()) {
                linkedHashMap.put(a7fVar.L(), d0(a7fVar));
            }
            a7fVar.p();
            return linkedHashMap;
        }
        switch (D) {
            case 5:
                break;
            case 6:
            case 7:
                try {
                    try {
                        try {
                            break;
                        } catch (Exception unused) {
                            return Double.valueOf(a7fVar.nextDouble());
                        }
                    } catch (Exception unused2) {
                        return a7fVar.y0();
                    }
                } catch (Exception unused3) {
                    return Long.valueOf(a7fVar.nextLong());
                }
            case 8:
                break;
            case 9:
                a7fVar.u0();
                break;
            default:
                e7o.f("unknown token ".concat(f1d.v(peek)));
                break;
        }
        return null;
    }

    public static final void e(tv4 tv4Var, hq5 hq5Var, int i2) {
        int i3;
        fvf fvfVar;
        int i4;
        cw4 cw4Var;
        tv4Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-290055681);
        int i5 = (oq5Var.h(tv4Var) ? 4 : 2) | i2;
        if (oq5Var.P(i5 & 1, (i5 & 3) != 2)) {
            cw4 cw4Var2 = (cw4) szf.Q(tv4Var.b.k, oq5Var).getValue();
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            ogp.g.e(false, cw4Var2 instanceof aw4, null, oq5Var, 4096, 5);
            String M = rvf.M(R.string.artists, oq5Var);
            boolean h2 = oq5Var.h(tv4Var);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                fvfVar = a2;
                i4 = 1;
                cw4Var = cw4Var2;
                ub4 ub4Var = new ub4(0, tv4Var, tv4.class, "onBackClicked", "onBackClicked()V", 0, 15);
                oq5Var.k0(ub4Var);
                K = ub4Var;
            } else {
                cw4Var = cw4Var2;
                fvfVar = a2;
                i4 = 1;
            }
            i3 = i4;
            xp3.d(M, fvfVar, null, ghh.C(zs4.g(oq5Var), ogp.A(oq5Var)), (Function0) ((h9f) K), ild.C(1914961857, new u2(23, tv4Var), oq5Var), false, false, null, null, null, ild.C(843935753, new xk(19, cw4Var, tv4Var, fvfVar), oq5Var), oq5Var, 196608, 48, 1988);
            oq5Var = oq5Var;
        } else {
            i3 = 1;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kv4(tv4Var, i2, i3);
        }
    }

    public static int[] e0(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) n7w.a0(2, byteArrayInputStream);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static final void f(sp1 sp1Var, nii niiVar, hq5 hq5Var, int i2) {
        int i3;
        sp1Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1135429257);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(sp1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(niiVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            bq1 bq1Var = (bq1) gld.O(sp1Var.d, oq5Var).getValue();
            if (Intrinsics.d(bq1Var, yp1.a)) {
                oq5Var.Z(1589709801);
                oq5Var.p(false);
            } else if (bq1Var instanceof zp1) {
                oq5Var.Z(1589792633);
                c((zp1) bq1Var, niiVar, sp1Var, oq5Var, ((i3 << 6) & 896) | (i3 & 112));
                oq5Var.p(false);
            } else {
                if (!(bq1Var instanceof aq1)) {
                    throw vz1.i(oq5Var, -225815361, false);
                }
                oq5Var.Z(1590043578);
                d((aq1) bq1Var, niiVar, sp1Var, oq5Var, ((i3 << 6) & 896) | (i3 & 112));
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z2(sp1Var, niiVar, i2, 7);
        }
    }

    public static fio[] f0(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, fio[] fioVarArr) {
        byte[] bArr3 = irf.m;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, irf.n)) {
                xq0.q("Unsupported meta version");
                return null;
            }
            int a0 = (int) n7w.a0(2, fileInputStream);
            byte[] Z = n7w.Z(fileInputStream, (int) n7w.a0(4, fileInputStream), (int) n7w.a0(4, fileInputStream));
            if (fileInputStream.read() > 0) {
                xq0.q("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Z);
            try {
                fio[] h0 = h0(byteArrayInputStream, bArr2, a0, fioVarArr);
                byteArrayInputStream.close();
                return h0;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(irf.h, bArr2)) {
            xq0.q("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            xq0.q("Unsupported meta version");
            return null;
        }
        int a02 = (int) n7w.a0(1, fileInputStream);
        byte[] Z2 = n7w.Z(fileInputStream, (int) n7w.a0(4, fileInputStream), (int) n7w.a0(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            xq0.q("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(Z2);
        try {
            fio[] g0 = g0(byteArrayInputStream2, a02, fioVarArr);
            byteArrayInputStream2.close();
            return g0;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static final void g(int i2, wn5 wn5Var, hq5 hq5Var, yci yciVar, Function0 function0) {
        int i3;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-280685216);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(wn5Var) ? 256 : 128;
        }
        int i4 = i3;
        if ((i4 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = vz1.h(oq5Var);
            }
            uoi uoiVar = (uoi) K;
            agr agrVar = yre.a;
            yci d2 = androidx.compose.foundation.a.d(yciVar.f(MinimumInteractiveModifier.a), uoiVar, eeo.a(0.0f, 6, 0L, true), false, null, new meo(0), function0, 12);
            int i5 = ((i4 << 3) & 7168) | 48;
            kfh d3 = ug3.d(b2c.f, false);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, d2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d3, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            wn5Var.invoke(androidx.compose.foundation.layout.b.a, oq5Var, Integer.valueOf(((i5 >> 6) & 112) | 6));
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vl3(function0, yciVar, wn5Var, i2);
        }
    }

    public static fio[] g0(ByteArrayInputStream byteArrayInputStream, int i2, fio[] fioVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new fio[0];
        }
        if (i2 != fioVarArr.length) {
            xq0.q("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int a0 = (int) n7w.a0(2, byteArrayInputStream);
            iArr[i3] = (int) n7w.a0(2, byteArrayInputStream);
            strArr[i3] = new String(n7w.Y(a0, byteArrayInputStream), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            fio fioVar = fioVarArr[i4];
            if (!((String) fioVar.c).equals(strArr[i4])) {
                xq0.q("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            fioVar.f = i5;
            fioVar.d = e0(byteArrayInputStream, i5);
        }
        return fioVarArr;
    }

    public static final void h(Function1 function1, z84 z84Var, drh drhVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        drh drhVar2;
        boolean z;
        long j2;
        int i4;
        function1.getClass();
        drhVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2075502698);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(function1) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(z84Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            drhVar2 = drhVar;
            i3 |= oq5Var.f(drhVar2) ? 256 : 128;
        } else {
            drhVar2 = drhVar;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        int i5 = i3;
        if ((i5 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            int i6 = 0;
            if (z84Var instanceof w84) {
                z = true;
            } else if (z84Var instanceof x84) {
                z = false;
            } else {
                if (!(z84Var instanceof a94)) {
                    b6e.s();
                    return;
                }
                z = ((a94) z84Var).a;
            }
            if (z) {
                oq5Var.Z(-1693259618);
                j2 = ((dq0) oq5Var.j(eq0.a)).a.h;
            } else {
                oq5Var.Z(-1693258529);
                j2 = ((dq0) oq5Var.j(eq0.a)).a.c;
            }
            oq5Var.p(false);
            long j3 = j2;
            boolean z2 = z84Var instanceof y84;
            kjn kjnVar = gq5.a;
            if (z2) {
                oq5Var.Z(-951315519);
                y84 y84Var = (y84) z84Var;
                if (y84Var instanceof x84) {
                    i4 = R.drawable.ic_cast_24;
                } else {
                    if (!(y84Var instanceof w84)) {
                        b6e.s();
                        return;
                    }
                    i4 = ((w84) y84Var).a;
                }
                boolean z3 = (i5 & 14) == 4;
                Object K = oq5Var.K();
                if (z3 || K == kjnVar) {
                    K = new pl3(i6, function1);
                    oq5Var.k0(K);
                }
                hld.h(i4, i5 & 7168, j3, oq5Var, yciVar, (Function0) K);
                oq5Var.p(false);
            } else {
                if (!(z84Var instanceof a94)) {
                    throw vz1.i(oq5Var, -1693257316, false);
                }
                oq5Var.Z(-951055181);
                boolean e2 = oq5Var.e(j3) | ((i5 & 14) == 4) | ((i5 & 896) == 256);
                Object K2 = oq5Var.K();
                if (e2 || K2 == kjnVar) {
                    ql3 ql3Var = new ql3(0, j3, drhVar2, function1);
                    oq5Var.k0(ql3Var);
                    K2 = ql3Var;
                }
                androidx.compose.ui.viewinterop.a.a((i5 >> 6) & 112, 4, oq5Var, yciVar, (Function1) K2, null);
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(function1, z84Var, false, drhVar, yciVar, i2, 15);
        }
    }

    public static fio[] h0(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, fio[] fioVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new fio[0];
        }
        if (i2 != fioVarArr.length) {
            xq0.q("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            n7w.a0(2, byteArrayInputStream);
            String str = new String(n7w.Y((int) n7w.a0(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
            long a0 = n7w.a0(4, byteArrayInputStream);
            int a02 = (int) n7w.a0(2, byteArrayInputStream);
            fio fioVar = null;
            if (fioVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER);
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i4 = 0;
                while (true) {
                    if (i4 >= fioVarArr.length) {
                        break;
                    }
                    if (((String) fioVarArr[i4].c).equals(substring)) {
                        fioVar = fioVarArr[i4];
                        break;
                    }
                    i4++;
                }
            }
            if (fioVar == null) {
                xq0.q("Missing profile key: ".concat(str));
                return null;
            }
            fioVar.j = a0;
            int[] e0 = e0(byteArrayInputStream, a02);
            if (Arrays.equals(bArr, irf.l)) {
                fioVar.f = a02;
                fioVar.d = e0;
            }
        }
        return fioVarArr;
    }

    public static final void i(pp1 pp1Var, u51 u51Var, qkl qklVar, sp1 sp1Var, yci yciVar, hq5 hq5Var, int i2) {
        pp1 pp1Var2;
        sp1 sp1Var2;
        qkl qklVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-157078227);
        int i3 = i2 | (oq5Var.h(pp1Var) ? 4 : 2) | (oq5Var.h(u51Var) ? 32 : 16) | (oq5Var.h(qklVar) ? 256 : 128) | (oq5Var.h(sp1Var) ? 2048 : 1024) | (oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if ((i3 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            pp1Var2 = pp1Var;
        } else {
            pw5 pw5Var = pp1Var.a;
            String str = pw5Var.a;
            ru5 ru5Var = pw5Var.b;
            String str2 = pw5Var.c;
            String str3 = pw5Var.d;
            String str4 = pw5Var.e;
            String str5 = pw5Var.f;
            String str6 = pw5Var.g;
            String str7 = pw5Var.h;
            String str8 = pw5Var.i;
            String str9 = pw5Var.j;
            Integer num = pw5Var.m;
            String str10 = pw5Var.n;
            String str11 = pw5Var.o;
            str.getClass();
            ru5Var.getClass();
            str4.getClass();
            str5.getClass();
            str6.getClass();
            str8.getClass();
            str9.getClass();
            str10.getClass();
            pw5 pw5Var2 = new pw5(str, ru5Var, str2, str3, str4, str5, str6, str7, str8, str9, null, null, num, str10, str11);
            boolean z = sp1Var.c;
            float f2 = 0;
            q0k q0kVar = new q0k(f2, f2, f2, f2);
            yci q = androidx.compose.foundation.layout.a.q(yciVar, 0.0f, 16, 0.0f, 0.0f, 13);
            wn5 C = ild.C(-674924056, new ar(10, sp1Var, pp1Var), oq5Var);
            int i4 = i3 & 14;
            boolean z2 = true;
            boolean h2 = oq5Var.h(sp1Var) | (i4 == 4 || oq5Var.h(pp1Var)) | oq5Var.h(u51Var) | oq5Var.h(qklVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                ye yeVar = new ye(sp1Var, pp1Var, u51Var, qklVar, 5);
                pp1Var2 = pp1Var;
                sp1Var2 = sp1Var;
                qklVar2 = qklVar;
                oq5Var.k0(yeVar);
                K = yeVar;
            } else {
                pp1Var2 = pp1Var;
                qklVar2 = qklVar;
                sp1Var2 = sp1Var;
            }
            Function0 function0 = (Function0) K;
            boolean h3 = oq5Var.h(sp1Var2);
            if (i4 != 4 && !oq5Var.h(pp1Var2)) {
                z2 = false;
            }
            boolean h4 = h3 | z2 | oq5Var.h(qklVar2);
            Object K2 = oq5Var.K();
            if (h4 || K2 == kjnVar) {
                K2 = new vd(6, sp1Var2, pp1Var2, qklVar2);
                oq5Var.k0(K2);
            }
            u2x.e(pw5Var2, C, function0, (Function0) K2, q, z, null, false, q0kVar, oq5Var, 113246256, 64);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new bj(pp1Var2, u51Var, qklVar, sp1Var, yciVar, i2, 4);
        }
    }

    public static fio[] i0(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, irf.i)) {
            xq0.q("Unsupported version");
            return null;
        }
        int a0 = (int) n7w.a0(1, fileInputStream);
        byte[] Z = n7w.Z(fileInputStream, (int) n7w.a0(4, fileInputStream), (int) n7w.a0(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            xq0.q("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Z);
        try {
            fio[] j0 = j0(byteArrayInputStream, str, a0);
            byteArrayInputStream.close();
            return j0;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x015e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r14.K(), java.lang.Integer.valueOf(r12)) == false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [ogp] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [int] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(z88 z88Var, tmb tmbVar, hq5 hq5Var, int i2) {
        z88 z88Var2;
        tmb tmbVar2;
        int i3;
        int i4;
        gz2 gz2Var;
        boolean z;
        l98 l98Var;
        ?? r12;
        fp7 fp7Var;
        boolean z2;
        boolean z3;
        z88Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(918822907);
        int i5 = i2 | (oq5Var.h(z88Var) ? 4 : 2) | (oq5Var.h(tmbVar) ? 32 : 16);
        if (oq5Var.P(i5 & 1, (i5 & 19) != 18)) {
            xdr xdrVar = z88Var.g;
            xdr xdrVar2 = z88Var.h;
            l98 l98Var2 = (l98) gld.M(xdrVar, oq5Var).getValue();
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = gld.R(g.a, oq5Var);
                oq5Var.k0(K);
            }
            final mm6 mm6Var = (mm6) K;
            fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            fvf a3 = hvf.a(0, 0, oq5Var, 0, 3);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = k5r.h(0, oq5Var);
            }
            u6k u6kVar = (u6k) K2;
            List h2 = u75.h(a2, a3);
            u6kVar.getClass();
            h2.getClass();
            boolean f2 = oq5Var.f(h2);
            Object K3 = oq5Var.K();
            if (f2 || K3 == kjnVar) {
                K3 = new u2s(u6kVar, h2);
                oq5Var.k0(K3);
            }
            ek B = yd5.B((u2s) K3, oq5Var);
            wxi L = zc4.L(B, false, oq5Var, 2);
            vci vciVar = vci.a;
            yci a4 = androidx.compose.ui.input.nestedscroll.a.a(vciVar, L, null);
            Object K4 = oq5Var.K();
            if (K4 == kjnVar) {
                i3 = i5;
                K4 = new bv7(10);
                oq5Var.k0(K4);
            } else {
                i3 = i5;
            }
            final fp7 b2 = r3k.b(0, (Function0) K4, oq5Var, 390, 2);
            boolean f3 = oq5Var.f(b2);
            Object K5 = oq5Var.K();
            if (f3 || K5 == kjnVar) {
                i4 = 1;
                K5 = new s25(b2, i4);
                oq5Var.k0(K5);
            } else {
                i4 = 1;
            }
            eno s0 = szf.s0((Function0) K5);
            Object K6 = oq5Var.K();
            if (K6 == kjnVar) {
                K6 = new u58(i4, u6kVar);
                oq5Var.k0(K6);
            }
            ox6.B(s0, mm6Var, (rjc) K6);
            ogp.g.e(l98Var2 instanceof i98, l98Var2 instanceof j98, null, oq5Var, 4096, 4);
            kx0 kx0Var = qx0.c;
            gz2 gz2Var2 = b2c.n;
            ta5 a5 = sa5.a(kx0Var, gz2Var2, oq5Var, 0);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, a4);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a5, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l2, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O) {
                gz2Var = gz2Var2;
            } else {
                gz2Var = gz2Var2;
            }
            ouj.x(i6, oq5Var, i6, kb5Var3);
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            gz2 gz2Var3 = gz2Var;
            yd5.b(B, rvf.M(R.string.my_dislikes, oq5Var), mp0.a(oq5Var), null, null, ild.C(-1450458913, new kv4(20, z88Var), oq5Var), 0L, oq5Var, 196608, 88);
            oq5Var = oq5Var;
            if (Intrinsics.d(l98Var2, j98.a)) {
                oq5Var.Z(59436047);
                n0s t = ltg.t(l98Var2);
                boolean h3 = oq5Var.h(mm6Var) | oq5Var.f(b2);
                Object K7 = oq5Var.K();
                if (h3 || K7 == kjnVar) {
                    r12 = 0;
                    final ?? r122 = 0 == true ? 1 : 0;
                    K7 = new Function1() { // from class: y88
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i7 = r122;
                            int intValue = ((Integer) obj).intValue();
                            switch (i7) {
                                case 0:
                                    x97.y(mm6Var, null, null, new l71(b2, intValue, null, 2), 3);
                                    break;
                                default:
                                    x97.y(mm6Var, null, null, new l71(b2, intValue, null, 3), 3);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var.k0(K7);
                } else {
                    r12 = 0;
                }
                ghh.d(t, b2, (Function1) K7, oq5Var, r12);
                boolean booleanValue = ((Boolean) gld.M(xdrVar2, oq5Var).getValue()).booleanValue();
                boolean h4 = oq5Var.h(z88Var);
                Object K8 = oq5Var.K();
                if (h4 || K8 == kjnVar) {
                    fp7Var = b2;
                    z2 = r12;
                    z3 = true;
                    ej6 ej6Var = new ej6(0, z88Var, z88.class, "onRefresh", "onRefresh()V", 0, 25);
                    oq5Var.k0(ej6Var);
                    K8 = ej6Var;
                } else {
                    fp7Var = b2;
                    z2 = r12;
                    z3 = true;
                }
                bfg.f(booleanValue, (Function0) ((h9f) K8), null, null, false, ild.C(-1217588275, new kv4(21, fp7Var), oq5Var), oq5Var, 196608, 28);
                oq5Var = oq5Var;
                oq5Var.p(z2);
                tmbVar2 = tmbVar;
                z88Var2 = z88Var;
                z = z3;
            } else {
                final int i7 = 1;
                if (l98Var2 instanceof k98) {
                    oq5Var.Z(60391839);
                    yci a6 = a.a(vciVar, "dislikes_screen_success");
                    ta5 a7 = sa5.a(kx0Var, gz2Var3, oq5Var, 0);
                    int i8 = oq5Var.P;
                    androidx.compose.runtime.internal.a l3 = oq5Var.l();
                    yci H2 = vnj.H(oq5Var, a6);
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, a7, kb5Var);
                    g0g.U(oq5Var, l3, kb5Var2);
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                        ouj.x(i8, oq5Var, i8, kb5Var3);
                    }
                    g0g.U(oq5Var, H2, kb5Var4);
                    n0s t2 = ltg.t(l98Var2);
                    boolean h5 = oq5Var.h(mm6Var) | oq5Var.f(b2);
                    Object K9 = oq5Var.K();
                    if (h5 || K9 == kjnVar) {
                        K9 = new Function1() { // from class: y88
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                int i72 = i7;
                                int intValue = ((Integer) obj).intValue();
                                switch (i72) {
                                    case 0:
                                        x97.y(mm6Var, null, null, new l71(b2, intValue, null, 2), 3);
                                        break;
                                    default:
                                        x97.y(mm6Var, null, null, new l71(b2, intValue, null, 3), 3);
                                        break;
                                }
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(K9);
                    }
                    ghh.d(t2, b2, (Function1) K9, oq5Var, 0);
                    boolean booleanValue2 = ((Boolean) gld.M(xdrVar2, oq5Var).getValue()).booleanValue();
                    boolean h6 = oq5Var.h(z88Var);
                    Object K10 = oq5Var.K();
                    if (h6 || K10 == kjnVar) {
                        l98Var = l98Var2;
                        ej6 ej6Var2 = new ej6(0, z88Var, z88.class, "onRefresh", "onRefresh()V", 0, 26);
                        oq5Var.k0(ej6Var2);
                        K10 = ej6Var2;
                    } else {
                        l98Var = l98Var2;
                    }
                    bfg.f(booleanValue2, (Function0) ((h9f) K10), null, null, false, ild.C(1295798158, new bj((k98) l98Var, b2, a2, z88Var, a3, 15), oq5Var), oq5Var, 196608, 28);
                    oq5Var = oq5Var;
                    oq5Var.p(true);
                    oq5Var.p(false);
                    tmbVar2 = tmbVar;
                    z88Var2 = z88Var;
                    z = true;
                } else {
                    if (!Intrinsics.d(l98Var2, i98.a)) {
                        throw vz1.i(oq5Var, -829366056, false);
                    }
                    oq5Var.Z(62452130);
                    yci c2 = d.c(androidx.compose.foundation.layout.a.l(vciVar, ghh.C(zs4.g(oq5Var), ogp.A(oq5Var))), 1.0f);
                    kfh d2 = ug3.d(b2c.b, false);
                    int i9 = oq5Var.P;
                    androidx.compose.runtime.internal.a l4 = oq5Var.l();
                    yci H3 = vnj.H(oq5Var, c2);
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, d2, kb5Var);
                    g0g.U(oq5Var, l4, kb5Var2);
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i9))) {
                        ouj.x(i9, oq5Var, i9, kb5Var3);
                    }
                    g0g.U(oq5Var, H3, kb5Var4);
                    yci Q = bfg.Q(androidx.compose.foundation.layout.b.a.a(vciVar, b2c.f), bfg.C(oq5Var), false, 14);
                    boolean h7 = oq5Var.h(z88Var);
                    Object K11 = oq5Var.K();
                    if (h7 || K11 == kjnVar) {
                        K11 = new x88(z88Var, 2);
                        oq5Var.k0(K11);
                    }
                    z88Var2 = z88Var;
                    z = true;
                    tmbVar2 = tmbVar;
                    rvf.j((Function1) K11, tmbVar2, Q, 0, true, null, oq5Var, 24640 | (i3 & 112), 40);
                    oq5Var.p(true);
                    oq5Var.p(false);
                }
            }
            oq5Var.p(z);
        } else {
            z88Var2 = z88Var;
            tmbVar2 = tmbVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kw5(z88Var2, tmbVar2, i2, 13);
        }
    }

    public static fio[] j0(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new fio[0];
        }
        fio[] fioVarArr = new fio[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int a0 = (int) n7w.a0(2, byteArrayInputStream);
            int a02 = (int) n7w.a0(2, byteArrayInputStream);
            fioVarArr[i4] = new fio(str, new String(n7w.Y(a0, byteArrayInputStream), StandardCharsets.UTF_8), n7w.a0(4, byteArrayInputStream), a02, (int) n7w.a0(4, byteArrayInputStream), (int) n7w.a0(4, byteArrayInputStream), new int[a02], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            fio fioVar = fioVarArr[i5];
            int available = byteArrayInputStream.available();
            int i6 = fioVar.h;
            int i7 = fioVar.i;
            TreeMap treeMap = (TreeMap) fioVar.e;
            int i8 = available - i6;
            int i9 = i3;
            while (byteArrayInputStream.available() > i8) {
                i9 += (int) n7w.a0(2, byteArrayInputStream);
                treeMap.put(Integer.valueOf(i9), 1);
                int a03 = (int) n7w.a0(2, byteArrayInputStream);
                while (a03 > 0) {
                    n7w.a0(2, byteArrayInputStream);
                    int a04 = (int) n7w.a0(1, byteArrayInputStream);
                    if (a04 != 6 && a04 != 7) {
                        while (a04 > 0) {
                            n7w.a0(1, byteArrayInputStream);
                            int i10 = i3;
                            int i11 = i5;
                            for (int a05 = (int) n7w.a0(1, byteArrayInputStream); a05 > 0; a05--) {
                                n7w.a0(2, byteArrayInputStream);
                            }
                            a04--;
                            i3 = i10;
                            i5 = i11;
                        }
                    }
                    a03--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i12 = i3;
            int i13 = i5;
            if (byteArrayInputStream.available() != i8) {
                xq0.q("Read too much data during profile line parse");
                return null;
            }
            fioVar.d = e0(byteArrayInputStream, fioVar.f);
            BitSet valueOf = BitSet.valueOf(n7w.Y((((i7 * 2) + 7) & (-8)) / 8, byteArrayInputStream));
            for (int i14 = i12; i14 < i7; i14++) {
                int i15 = valueOf.get(i14) ? 2 : i12;
                if (valueOf.get(i14 + i7)) {
                    i15 |= 4;
                }
                if (i15 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i14));
                    if (num == null) {
                        num = Integer.valueOf(i12);
                    }
                    treeMap.put(Integer.valueOf(i14), Integer.valueOf(i15 | num.intValue()));
                }
            }
            i5 = i13 + 1;
            i3 = i12;
        }
        return fioVarArr;
    }

    public static final void k(b61 b61Var, hq5 hq5Var, int i2) {
        b61Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1946912550);
        if ((((oq5Var.h(b61Var) ? 4 : 2) | i2) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            iz2 iz2Var = b2c.f;
            float f2 = 0;
            yci p = androidx.compose.foundation.layout.a.p(d.d(vci.a, 1.0f), f2, 14, f2, 6);
            kfh d2 = ug3.d(iz2Var, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, p);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            tt0.g((e61) gld.O(b61Var.d, oq5Var).getValue(), null, weo.S(0, 0, nya.d, 3), "donation_informer_state", ild.C(-660518021, new tt5(8, b61Var), oq5Var), oq5Var, 27648, 2);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kv4(b61Var, i2, 24);
        }
    }

    public static final rce k0(Object obj, hq5 hq5Var) {
        rce rceVar = obj instanceof rce ? (rce) obj : null;
        oq5 oq5Var = (oq5) hq5Var;
        if (rceVar != null) {
            oq5Var.Z(-638824067);
            oq5Var.p(false);
            return rceVar;
        }
        oq5Var.Z(-638821556);
        pce pceVar = new pce((Context) oq5Var.j(AndroidCompositionLocals_androidKt.b));
        pceVar.c = obj;
        rce a2 = pceVar.a();
        oq5Var.p(false);
        return a2;
    }

    public static final void l(ebm ebmVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(505069043);
        int i3 = (oq5Var.h(ebmVar) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            vci vciVar = vci.a;
            yci d2 = d.d(vciVar, 1.0f);
            agr agrVar = eq0.a;
            float f2 = 16;
            yci q = androidx.compose.foundation.layout.a.q(androidx.compose.foundation.a.b(d2, ((dq0) oq5Var.j(agrVar)).c.c, o5g.G(oq5Var)), 0.0f, f2, 0.0f, f2, 5);
            nho a2 = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, q);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            yci q2 = androidx.compose.foundation.layout.a.q(vciVar, f2, 0.0f, 0.0f, 0.0f, 14);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            xcs.b(rvf.M(R.string.easy_login_profile_button_description, oq5Var), vz1.g(1.0f, q2, true), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(5), 0L, 2, false, 3, 0, null, nu0.j(), oq5Var, 0, 3120, 54776);
            hdg.t(rvf.M(R.string.easy_login_profile_button_title, oq5Var), ebmVar, androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, f2, 0.0f, 11), nu0.i(), oq5Var, ((i3 << 3) & 112) | 384, 0);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new xya(ebmVar, i2);
        }
    }

    public static final Shader.TileMode l0(int i2) {
        return i2 == 0 ? Shader.TileMode.CLAMP : i2 == 1 ? Shader.TileMode.REPEAT : i2 == 2 ? Shader.TileMode.MIRROR : i2 == 3 ? Build.VERSION.SDK_INT >= 31 ? rf0.m() : Shader.TileMode.CLAMP : Shader.TileMode.CLAMP;
    }

    public static final void m(src srcVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(786907565);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(srcVar) : oq5Var.h(srcVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            float f2 = 16;
            n(srcVar, androidx.compose.foundation.layout.a.p(d.d(yciVar, 1.0f), f2, 12, f2, 20), oq5Var, i3 & 14);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new trc(srcVar, yciVar, i2, 1);
        }
    }

    public static final c01 m0(q51 q51Var) {
        q51Var.getClass();
        String str = q51Var.a;
        String str2 = q51Var.b;
        a01 a01Var = new a01(q51Var.j, q51Var.i, -1, 0);
        String str3 = q51Var.h;
        WebPath$Storage webPath$Storage = WebPath$Storage.AVATARS;
        CoverPath x = men.x(str3, webPath$Storage);
        CoverPath x2 = men.x(q51Var.o, webPath$Storage);
        List B = q7g.B(q51Var.l);
        B.getClass();
        c01 c01Var = new c01(str, str2, false, q51Var.m, null, 0, a01Var, x, x2, B, q7g.P(q51Var.n), false, 37356);
        tfs tfsVar = wc7.a;
        c01Var.r = wc7.a.b(q51Var.f);
        return c01Var;
    }

    public static final void n(src srcVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        String str;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1586808583);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(srcVar) : oq5Var.h(srcVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            agr agrVar = eq0.a;
            float f2 = 8;
            yci a2 = a.a(androidx.compose.foundation.layout.a.m(androidx.compose.foundation.a.b(yciVar, ((dq0) oq5Var.j(agrVar)).c.c, ugo.b(f2, f2, f2, f2)), 10), "foreign_agent_block");
            nho a3 = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
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
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            ges j2 = nu0.j();
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = szf.g0(j2);
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            yci d2 = d.d(vci.a, 1.0f);
            ges gesVar = (ges) aqiVar.getValue();
            long j3 = ((dq0) oq5Var.j(agrVar)).b.a;
            if (srcVar instanceof wrc) {
                oq5Var.Z(853433709);
                str = rvf.M(((wrc) srcVar).a, oq5Var);
                oq5Var.p(false);
            } else {
                if (!(srcVar instanceof urc)) {
                    throw vz1.i(oq5Var, 853431932, false);
                }
                oq5Var.Z(853436018);
                oq5Var.p(false);
                str = ((urc) srcVar).a;
            }
            o9s o9sVar = new o9s(3);
            boolean f3 = oq5Var.f(j2);
            Object K2 = oq5Var.K();
            if (f3 || K2 == obj) {
                K2 = new lz5(j2, aqiVar, 2);
                oq5Var.k0(K2);
            }
            xcs.b(str, d2, j3, 0L, null, 0L, null, o9sVar, 0L, 0, false, 0, 0, (Function1) K2, gesVar, oq5Var, 48, 0, 32248);
            oq5Var = oq5Var;
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new trc(srcVar, yciVar, i2, 0);
        }
    }

    public static final p43 n0(BlockAnalyticsDataDto blockAnalyticsDataDto) {
        blockAnalyticsDataDto.getClass();
        String requestId = blockAnalyticsDataDto.getRequestId();
        if (requestId == null) {
            return null;
        }
        return new p43(requestId);
    }

    public static final void o(hce hceVar, ukd ukdVar, int i2, l85 l85Var, hq5 hq5Var, int i3, int i4) {
        int i5;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(491792371);
        if ((i3 & 6) == 0) {
            int i6 = i3 & 8;
            i5 = (oq5Var.f(hceVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= oq5Var.f(null) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= oq5Var.f(ukdVar) ? 256 : 128;
        }
        int i7 = i4 & 8;
        if (i7 != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i5 |= oq5Var.d(i2) ? 2048 : 1024;
        }
        int i8 = i4 & 16;
        if (i8 != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            int i9 = 32768 & i3;
            i5 |= oq5Var.f(l85Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i5 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (i7 != 0) {
                i2 = 1;
            }
            if (i8 != 0) {
                l85Var = null;
            }
            oq5Var.a0(135631275);
            oq5Var.p(false);
            tbe tbeVar = tbe.a;
            oq5Var.a0(-1115894518);
            oq5Var.a0(1886828752);
            if (!(oq5Var.a instanceof mw0)) {
                lxe.v();
                throw null;
            }
            oq5Var.X();
            if (oq5Var.O) {
                oq5Var.k(new ypb(tbeVar));
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, hceVar, kb5.x0);
            g0g.U(oq5Var, ukdVar, kb5.y0);
            g0g.U(oq5Var, new id6(i2), kb5.z0);
            g0g.U(oq5Var, l85Var, kb5.A0);
            oq5Var.p(true);
            oq5Var.p(false);
            oq5Var.p(false);
        }
        int i10 = i2;
        l85 l85Var2 = l85Var;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vbe(hceVar, ukdVar, i10, l85Var2, i3, i4);
        }
    }

    public static final jzb o0(gd6 gd6Var) {
        gd6Var.getClass();
        h1b h1bVar = jzb.b;
        List list = gd6Var.b;
        List list2 = gd6Var.a;
        h1bVar.getClass();
        return h1b.K(list, list2);
    }

    public static w2f p() {
        return new w2f(null);
    }

    public static final FeedbackRequestDto p0(r7c r7cVar) {
        tc7 sc7Var;
        FeedbackEventDto feedbackEventDto;
        String str;
        r7cVar.getClass();
        Date timestamp = r7cVar.getTimestamp();
        jyr b2 = btf.b(new x6s(6));
        jyr b3 = btf.b(new x6s(7));
        jyr b4 = btf.b(new x6s(8));
        lm4 a2 = ern.a(rc7.class);
        if (a2.equals(ern.a(qc7.class))) {
            sc7Var = new qc7(timestamp, ((bgs) b2.getValue()).a(timestamp));
        } else if (a2.equals(ern.a(rc7.class))) {
            sc7Var = new rc7(timestamp, ((bgs) b3.getValue()).a(timestamp));
        } else {
            if (!a2.equals(ern.a(sc7.class))) {
                xq0.x("Add this type to method");
                return null;
            }
            sc7Var = new sc7(timestamp, ((bgs) b4.getValue()).a(timestamp));
        }
        rc7 rc7Var = (rc7) sc7Var;
        boolean z = r7cVar instanceof wmp;
        if (z) {
            feedbackEventDto = new FeedbackEventDto("radioStarted", rc7Var, null, null, null, ((wmp) r7cVar).b);
        } else if (r7cVar instanceof p1t) {
            feedbackEventDto = new FeedbackEventDto("trackStarted", rc7Var, ((p1t) r7cVar).c.a, null, null, null);
        } else {
            if (r7cVar instanceof svs) {
                svs svsVar = (svs) r7cVar;
                String str2 = svsVar.c.a;
                float c0 = c0(svsVar.d);
                feedbackEventDto = new FeedbackEventDto("trackFinished", rc7Var, str2, Float.valueOf(c0 >= 0.1f ? c0 : 0.1f), Float.valueOf(c0(svsVar.e)), null);
            } else if (r7cVar instanceof crq) {
                crq crqVar = (crq) r7cVar;
                String str3 = crqVar.c.a;
                float c02 = c0(crqVar.d);
                feedbackEventDto = new FeedbackEventDto("skip", rc7Var, str3, Float.valueOf(c02 >= 0.1f ? c02 : 0.1f), null, null);
            } else if (r7cVar instanceof k88) {
                k88 k88Var = (k88) r7cVar;
                String str4 = k88Var.c.a;
                float c03 = c0(k88Var.d);
                feedbackEventDto = new FeedbackEventDto("dislike", rc7Var, str4, Float.valueOf(c03 >= 0.1f ? c03 : 0.1f), null, null);
            } else if (r7cVar instanceof xzf) {
                feedbackEventDto = new FeedbackEventDto("like", rc7Var, ((xzf) r7cVar).c.a, null, null, null);
            } else if (r7cVar instanceof jit) {
                feedbackEventDto = new FeedbackEventDto("undislike", rc7Var, ((jit) r7cVar).c.a, null, null, null);
            } else {
                if (!(r7cVar instanceof vkt)) {
                    b6e.s();
                    return null;
                }
                feedbackEventDto = new FeedbackEventDto("unlike", rc7Var, ((vkt) r7cVar).c.a, null, null, null);
            }
        }
        if (z) {
            str = null;
        } else if (r7cVar instanceof p1t) {
            str = ((p1t) r7cVar).d;
        } else if (r7cVar instanceof svs) {
            str = ((svs) r7cVar).f;
        } else if (r7cVar instanceof crq) {
            str = ((crq) r7cVar).e;
        } else if (r7cVar instanceof k88) {
            str = ((k88) r7cVar).e;
        } else if (r7cVar instanceof xzf) {
            str = ((xzf) r7cVar).d;
        } else if (r7cVar instanceof jit) {
            str = ((jit) r7cVar).d;
        } else {
            if (!(r7cVar instanceof vkt)) {
                b6e.s();
                return null;
            }
            str = ((vkt) r7cVar).d;
        }
        return new FeedbackRequestDto(feedbackEventDto, str, r7cVar.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d7, code lost:
    
        if ((r28 & 32) != 0) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void q(boolean z, Function0 function0, yci yciVar, yci yciVar2, long j2, long j3, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar3;
        int i5;
        yci yciVar4;
        long j4;
        long j5;
        oq5 oq5Var;
        long j6;
        long j7;
        yci yciVar5;
        xmn r;
        int i6;
        int i7;
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1754858632);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var2.g(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var2.h(function0) ? 32 : 16;
        }
        int i8 = i3 & 4;
        if (i8 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            yciVar3 = yciVar;
            i4 |= oq5Var2.f(yciVar3) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                yciVar4 = yciVar2;
                i4 |= oq5Var2.f(yciVar4) ? 2048 : 1024;
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        j4 = j2;
                        if (oq5Var2.e(j4)) {
                            i7 = 16384;
                            i4 |= i7;
                        }
                    } else {
                        j4 = j2;
                    }
                    i7 = RemoteCameraConfig.Notification.ID;
                    i4 |= i7;
                } else {
                    j4 = j2;
                }
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        j5 = j3;
                        if (oq5Var2.e(j5)) {
                            i6 = SQLiteDatabase.OPEN_SHAREDCACHE;
                            i4 |= i6;
                        }
                    } else {
                        j5 = j3;
                    }
                    i6 = SQLiteDatabase.OPEN_FULLMUTEX;
                    i4 |= i6;
                } else {
                    j5 = j3;
                }
                if ((74899 & i4) == 74898 || !oq5Var2.z()) {
                    oq5Var2.U();
                    if ((i2 & 1) != 0 || oq5Var2.y()) {
                        vci vciVar = vci.a;
                        if (i8 != 0) {
                            yciVar3 = vciVar;
                        }
                        if (i5 != 0) {
                            yciVar4 = vciVar;
                        }
                        if ((i3 & 16) != 0) {
                            j4 = ((dq0) oq5Var2.j(eq0.a)).a.a;
                            i4 &= -57345;
                        }
                        if ((i3 & 32) != 0) {
                            j5 = ((dq0) oq5Var2.j(eq0.a)).a.a;
                            i4 &= -458753;
                        }
                        yci yciVar6 = yciVar4;
                        long j8 = j5;
                        int i9 = i4;
                        yci yciVar7 = yciVar3;
                        long j9 = j4;
                        oq5Var2.q();
                        aae.a(function0, com.yandex.music.core.ui.compose.b.c(a.a(ksw.D(yciVar7, rvf.M(R.string.menu_element_like, oq5Var2), rvf.M(z ? R.string.accessibility_uncheck_action : R.string.accessibility_check_action, oq5Var2)), "like_button"), "is_liked", Boolean.valueOf(z)), false, ild.C(1202760724, new rl3(z, yciVar6, j9, j8, 0), oq5Var2), oq5Var2, ((i9 >> 3) & 14) | 24576, 12);
                        oq5Var = oq5Var2;
                        j6 = j8;
                        j7 = j9;
                        yciVar3 = yciVar7;
                        yciVar5 = yciVar6;
                    } else {
                        oq5Var2.S();
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                    }
                } else {
                    oq5Var2.S();
                    yciVar5 = yciVar4;
                    j7 = j4;
                    oq5Var = oq5Var2;
                    j6 = j5;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new sl3(z, function0, yciVar3, yciVar5, j7, j6, i2, i3, 0);
                    return;
                }
                return;
            }
            yciVar4 = yciVar2;
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            if ((74899 & i4) == 74898) {
            }
            oq5Var2.U();
            if ((i2 & 1) != 0) {
            }
            vci vciVar2 = vci.a;
            if (i8 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if ((i3 & 32) != 0) {
            }
            yci yciVar62 = yciVar4;
            long j82 = j5;
            int i92 = i4;
            yci yciVar72 = yciVar3;
            long j92 = j4;
            oq5Var2.q();
            aae.a(function0, com.yandex.music.core.ui.compose.b.c(a.a(ksw.D(yciVar72, rvf.M(R.string.menu_element_like, oq5Var2), rvf.M(z ? R.string.accessibility_uncheck_action : R.string.accessibility_check_action, oq5Var2)), "like_button"), "is_liked", Boolean.valueOf(z)), false, ild.C(1202760724, new rl3(z, yciVar62, j92, j82, 0), oq5Var2), oq5Var2, ((i92 >> 3) & 14) | 24576, 12);
            oq5Var = oq5Var2;
            j6 = j82;
            j7 = j92;
            yciVar3 = yciVar72;
            yciVar5 = yciVar62;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar3 = yciVar;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        yciVar4 = yciVar2;
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        if ((74899 & i4) == 74898) {
        }
        oq5Var2.U();
        if ((i2 & 1) != 0) {
        }
        vci vciVar22 = vci.a;
        if (i8 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
        }
        yci yciVar622 = yciVar4;
        long j822 = j5;
        int i922 = i4;
        yci yciVar722 = yciVar3;
        long j922 = j4;
        oq5Var2.q();
        aae.a(function0, com.yandex.music.core.ui.compose.b.c(a.a(ksw.D(yciVar722, rvf.M(R.string.menu_element_like, oq5Var2), rvf.M(z ? R.string.accessibility_uncheck_action : R.string.accessibility_check_action, oq5Var2)), "like_button"), "is_liked", Boolean.valueOf(z)), false, ild.C(1202760724, new rl3(z, yciVar622, j922, j822, 0), oq5Var2), oq5Var2, ((i922 >> 3) & 14) | 24576, 12);
        oq5Var = oq5Var2;
        j6 = j822;
        j7 = j922;
        yciVar3 = yciVar722;
        yciVar5 = yciVar622;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final String q0(long j2) {
        msa msaVar = nsa.b;
        return r0(yd5.N(j2, ssa.MILLISECONDS));
    }

    public static final void r(boolean z, Function0 function0, yci yciVar, long j2, hq5 hq5Var, int i2) {
        int i3;
        long j3;
        long j4;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-412756081);
        int i4 = i2 | (oq5Var.g(z) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128) | 1024;
        if ((i4 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            j4 = j2;
        } else {
            oq5Var.U();
            if ((i2 & 1) == 0 || oq5Var.y()) {
                i3 = i4 & (-7169);
                j3 = ((dq0) oq5Var.j(eq0.a)).a.a;
            } else {
                oq5Var.S();
                i3 = i4 & (-7169);
                j3 = j2;
            }
            oq5Var.q();
            int i5 = i3 >> 3;
            aae.a(function0, yciVar, false, ild.C(-946044301, new tl3(0, j3, z), oq5Var), oq5Var, (i5 & 14) | 24576 | (i5 & 112), 12);
            j4 = j3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ul3(z, function0, yciVar, j4, i2);
        }
    }

    public static final String r0(long j2) {
        l18 l18Var = l18.b;
        bdt I = hag.I(skr.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        skr skrVar = (skr) qdcVar.C(I);
        msa msaVar = nsa.b;
        long s = nsa.s(j2, ssa.HOURS);
        int g2 = nsa.g(j2);
        int i2 = nsa.i(j2);
        nsa.h(j2);
        StringBuilder sb = new StringBuilder();
        if (s > 0) {
            sb.append(s + StringUtil.SPACE + skrVar.a(R.plurals.number_of_hours, (int) s) + StringUtil.SPACE);
        }
        if (g2 > 0) {
            sb.append(g2 + StringUtil.SPACE + skrVar.a(R.plurals.number_of_minutes, g2));
        }
        if (i2 > 0 || sb.length() == 0) {
            sb.append(i2 + StringUtil.SPACE + skrVar.a(R.plurals.number_of_seconds, i2));
        }
        return sb.toString();
    }

    public static final void s(final Object obj, final String str, final yci yciVar, final Function1 function1, final Function1 function12, final g40 g40Var, final jd6 jd6Var, final float f2, final m85 m85Var, final int i2, final wn5 wn5Var, hq5 hq5Var, final int i3) {
        int i4;
        String str2;
        yci yciVar2;
        Function1 function13;
        g40 g40Var2;
        jd6 jd6Var2;
        float f3;
        m85 m85Var2;
        int i5;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-417259721);
        if ((i3 & 6) == 0) {
            i4 = (oq5Var.h(obj) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            str2 = str;
            i4 |= oq5Var.f(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i3 & 384) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var.f(yciVar2) ? 256 : 128;
        } else {
            yciVar2 = yciVar;
        }
        if ((i3 & 3072) == 0) {
            function13 = function1;
            i4 |= oq5Var.h(function13) ? 2048 : 1024;
        } else {
            function13 = function1;
        }
        if ((i3 & 24576) == 0) {
            i4 |= oq5Var.h(function12) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i3) == 0) {
            g40Var2 = g40Var;
            i4 |= oq5Var.f(g40Var2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            g40Var2 = g40Var;
        }
        if ((1572864 & i3) == 0) {
            jd6Var2 = jd6Var;
            i4 |= oq5Var.f(jd6Var2) ? 1048576 : 524288;
        } else {
            jd6Var2 = jd6Var;
        }
        if ((12582912 & i3) == 0) {
            f3 = f2;
            i4 |= oq5Var.c(f3) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        } else {
            f3 = f2;
        }
        if ((100663296 & i3) == 0) {
            m85Var2 = m85Var;
            i4 |= oq5Var.f(m85Var2) ? 67108864 : 33554432;
        } else {
            m85Var2 = m85Var;
        }
        if ((805306368 & i3) == 0) {
            i5 = i2;
            i4 |= oq5Var.d(i5) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        } else {
            i5 = i2;
        }
        if ((306783379 & i4) == 306783378 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i3 & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            agr agrVar = t8r.a;
            q8r q8rVar = (q8r) oq5Var.j(agrVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new y4k();
                oq5Var.k0(K);
            }
            y4k y4kVar = (y4k) K;
            y4kVar.getClass();
            q8rVar.getClass();
            y4kVar.b = q8rVar;
            y4kVar.a = k0(obj, oq5Var);
            y4kVar.c = function12;
            cce b2 = ((q8r) oq5Var.j(agrVar)).b();
            boolean h2 = oq5Var.h(y4kVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new mt4(1, y4kVar, y4k.class, "onState", "onState(Lcoil/compose/AsyncImagePainter$State;)V", 0, 11);
                oq5Var.k0(K2);
            }
            int i6 = i4 << 3;
            bzf.n(obj, str2, b2, yciVar2, function13, (Function1) ((h9f) K2), g40Var2, jd6Var2, f3, m85Var2, i5, wn5Var, oq5Var, (i6 & 1879048192) | (i4 & 126) | (i6 & 7168) | (57344 & i6) | (3670016 & i6) | (29360128 & i6) | (234881024 & i6), ((i4 >> 27) & 14) | 48);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: mp5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    saf.s(obj, str, yciVar, function1, function12, g40Var, jd6Var, f2, m85Var, i2, wn5Var, (hq5) obj2, rvf.R(i3 | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Finally extract failed */
    public static boolean s0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, fio[] fioVarArr) {
        long j2;
        int length;
        byte[] bArr2 = irf.l;
        byte[] bArr3 = irf.k;
        byte[] bArr4 = irf.h;
        int i2 = 0;
        if (Arrays.equals(bArr, bArr4)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                n7w.g0(byteArrayOutputStream2, fioVarArr.length);
                int i3 = 2;
                int i4 = 2;
                for (fio fioVar : fioVarArr) {
                    n7w.f0(byteArrayOutputStream2, fioVar.g, 4);
                    n7w.f0(byteArrayOutputStream2, fioVar.j, 4);
                    n7w.f0(byteArrayOutputStream2, fioVar.i, 4);
                    String P = P(bArr4, (String) fioVar.b, (String) fioVar.c);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = P.getBytes(charset).length;
                    n7w.g0(byteArrayOutputStream2, length2);
                    i4 = i4 + 14 + length2;
                    byteArrayOutputStream2.write(P.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i4 != byteArray.length) {
                    throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray.length);
                }
                e6w e6wVar = new e6w(1, false, byteArray);
                byteArrayOutputStream2.close();
                arrayList.add(e6wVar);
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i5 = 0;
                int i6 = 0;
                while (i5 < fioVarArr.length) {
                    try {
                        fio fioVar2 = fioVarArr[i5];
                        n7w.g0(byteArrayOutputStream3, i5);
                        n7w.g0(byteArrayOutputStream3, fioVar2.f);
                        i6 = i6 + 4 + (fioVar2.f * i3);
                        int[] iArr = (int[]) fioVar2.d;
                        int length3 = iArr.length;
                        int i7 = i2;
                        int i8 = i3;
                        int i9 = i7;
                        while (i9 < length3) {
                            int i10 = iArr[i9];
                            n7w.g0(byteArrayOutputStream3, i10 - i7);
                            i9++;
                            i7 = i10;
                        }
                        i5++;
                        i3 = i8;
                        i2 = 0;
                    } catch (Throwable th) {
                    }
                }
                byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                if (i6 != byteArray2.length) {
                    throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray2.length);
                }
                e6w e6wVar2 = new e6w(3, true, byteArray2);
                byteArrayOutputStream3.close();
                arrayList.add(e6wVar2);
                byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i11 = 0;
                int i12 = 0;
                while (i11 < fioVarArr.length) {
                    try {
                        fio fioVar3 = fioVarArr[i11];
                        Iterator it = ((TreeMap) fioVar3.e).entrySet().iterator();
                        int i13 = 0;
                        while (it.hasNext()) {
                            i13 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                        }
                        ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            w0(byteArrayOutputStream4, i13, fioVar3);
                            byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            byteArrayOutputStream4 = new ByteArrayOutputStream();
                            try {
                                x0(byteArrayOutputStream4, fioVar3);
                                byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                n7w.g0(byteArrayOutputStream3, i11);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i14 = i12 + 6;
                                int i15 = i11;
                                n7w.f0(byteArrayOutputStream3, length4, 4);
                                n7w.g0(byteArrayOutputStream3, i13);
                                byteArrayOutputStream3.write(byteArray3);
                                byteArrayOutputStream3.write(byteArray4);
                                i12 = i14 + length4;
                                i11 = i15 + 1;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                        try {
                            byteArrayOutputStream3.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
                byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                if (i12 != byteArray5.length) {
                    throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
                }
                e6w e6wVar3 = new e6w(4, true, byteArray5);
                byteArrayOutputStream3.close();
                arrayList.add(e6wVar3);
                long j3 = 4;
                long size = j3 + j3 + 4 + (arrayList.size() * 16);
                n7w.f0(byteArrayOutputStream, arrayList.size(), 4);
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    e6w e6wVar4 = (e6w) arrayList.get(i16);
                    int i17 = e6wVar4.a;
                    byte[] bArr5 = e6wVar4.b;
                    if (i17 == 1) {
                        j2 = 0;
                    } else if (i17 == 2) {
                        j2 = 1;
                    } else if (i17 == 3) {
                        j2 = 2;
                    } else if (i17 == 4) {
                        j2 = 3;
                    } else {
                        if (i17 != 5) {
                            throw null;
                        }
                        j2 = 4;
                    }
                    n7w.f0(byteArrayOutputStream, j2, 4);
                    n7w.f0(byteArrayOutputStream, size, 4);
                    if (e6wVar4.c) {
                        long length5 = bArr5.length;
                        byte[] D = n7w.D(bArr5);
                        arrayList2.add(D);
                        n7w.f0(byteArrayOutputStream, D.length, 4);
                        n7w.f0(byteArrayOutputStream, length5, 4);
                        length = D.length;
                    } else {
                        arrayList2.add(bArr5);
                        n7w.f0(byteArrayOutputStream, bArr5.length, 4);
                        n7w.f0(byteArrayOutputStream, 0L, 4);
                        length = bArr5.length;
                    }
                    size += length;
                }
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    byteArrayOutputStream.write((byte[]) arrayList2.get(i18));
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } else {
            byte[] bArr6 = irf.i;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] J = J(fioVarArr, bArr6);
                n7w.f0(byteArrayOutputStream, fioVarArr.length, 1);
                n7w.f0(byteArrayOutputStream, J.length, 4);
                byte[] D2 = n7w.D(J);
                n7w.f0(byteArrayOutputStream, D2.length, 4);
                byteArrayOutputStream.write(D2);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                n7w.f0(byteArrayOutputStream, fioVarArr.length, 1);
                for (fio fioVar4 : fioVarArr) {
                    int size2 = ((TreeMap) fioVar4.e).size() * 4;
                    String P2 = P(bArr3, (String) fioVar4.b, (String) fioVar4.c);
                    Charset charset2 = StandardCharsets.UTF_8;
                    n7w.g0(byteArrayOutputStream, P2.getBytes(charset2).length);
                    n7w.g0(byteArrayOutputStream, ((int[]) fioVar4.d).length);
                    n7w.f0(byteArrayOutputStream, size2, 4);
                    n7w.f0(byteArrayOutputStream, fioVar4.g, 4);
                    byteArrayOutputStream.write(P2.getBytes(charset2));
                    Iterator it2 = ((TreeMap) fioVar4.e).keySet().iterator();
                    while (it2.hasNext()) {
                        n7w.g0(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                        n7w.g0(byteArrayOutputStream, 0);
                    }
                    for (int i19 : (int[]) fioVar4.d) {
                        n7w.g0(byteArrayOutputStream, i19);
                    }
                }
            } else {
                byte[] bArr7 = irf.j;
                if (Arrays.equals(bArr, bArr7)) {
                    byte[] J2 = J(fioVarArr, bArr7);
                    n7w.f0(byteArrayOutputStream, fioVarArr.length, 1);
                    n7w.f0(byteArrayOutputStream, J2.length, 4);
                    byte[] D3 = n7w.D(J2);
                    n7w.f0(byteArrayOutputStream, D3.length, 4);
                    byteArrayOutputStream.write(D3);
                    return true;
                }
                if (!Arrays.equals(bArr, bArr2)) {
                    return false;
                }
                n7w.g0(byteArrayOutputStream, fioVarArr.length);
                for (fio fioVar5 : fioVarArr) {
                    String str = (String) fioVar5.b;
                    TreeMap treeMap = (TreeMap) fioVar5.e;
                    String P3 = P(bArr2, str, (String) fioVar5.c);
                    Charset charset3 = StandardCharsets.UTF_8;
                    n7w.g0(byteArrayOutputStream, P3.getBytes(charset3).length);
                    n7w.g0(byteArrayOutputStream, treeMap.size());
                    n7w.g0(byteArrayOutputStream, ((int[]) fioVar5.d).length);
                    n7w.f0(byteArrayOutputStream, fioVar5.g, 4);
                    byteArrayOutputStream.write(P3.getBytes(charset3));
                    Iterator it3 = treeMap.keySet().iterator();
                    while (it3.hasNext()) {
                        n7w.g0(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                    }
                    for (int i20 : (int[]) fioVar5.d) {
                        n7w.g0(byteArrayOutputStream, i20);
                    }
                }
            }
        }
        return true;
    }

    public static final void t(final Object obj, final yci yciVar, final ryc rycVar, final ryc rycVar2, final ryc rycVar3, final g40 g40Var, final jd6 jd6Var, final float f2, final int i2, hq5 hq5Var, final int i3, final int i4) {
        int i5;
        yci yciVar2;
        ryc rycVar4;
        ryc rycVar5;
        int i6;
        int i7;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2071346407);
        if ((i3 & 6) == 0) {
            i5 = (oq5Var.h(obj) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= oq5Var.f(null) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            yciVar2 = yciVar;
            i5 |= oq5Var.f(yciVar2) ? 256 : 128;
        } else {
            yciVar2 = yciVar;
        }
        if ((i3 & 3072) == 0) {
            rycVar4 = rycVar;
            i5 |= oq5Var.h(rycVar4) ? 2048 : 1024;
        } else {
            rycVar4 = rycVar;
        }
        if ((i3 & 24576) == 0) {
            rycVar5 = rycVar2;
            i5 |= oq5Var.h(rycVar5) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            rycVar5 = rycVar2;
        }
        if ((i3 & 196608) == 0) {
            i5 |= oq5Var.h(rycVar3) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((i3 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i5 |= oq5Var.h(null) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= oq5Var.h(null) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= oq5Var.h(null) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= oq5Var.f(g40Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (oq5Var.f(jd6Var) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= oq5Var.c(f2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= oq5Var.f(null) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i7 = i2;
            i6 |= oq5Var.d(i7) ? 2048 : 1024;
        } else {
            i7 = i2;
        }
        int i8 = i6;
        if ((306783379 & i5) == 306783378 && (i8 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i3 & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            agr agrVar = t8r.a;
            q8r q8rVar = (q8r) oq5Var.j(agrVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new y4k();
                oq5Var.k0(K);
            }
            y4k y4kVar = (y4k) K;
            y4kVar.getClass();
            q8rVar.getClass();
            y4kVar.b = q8rVar;
            y4kVar.a = k0(obj, oq5Var);
            cce b2 = ((q8r) oq5Var.j(agrVar)).b();
            boolean h2 = oq5Var.h(y4kVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new mt4(1, y4kVar, y4k.class, "onLoading", "onLoading(Lcoil/compose/AsyncImagePainter$State$Loading;)V", 0, 8);
                oq5Var.k0(K2);
            }
            Function1 function1 = (Function1) ((h9f) K2);
            boolean h3 = oq5Var.h(y4kVar);
            Object K3 = oq5Var.K();
            if (h3 || K3 == kjnVar) {
                K3 = new mt4(1, y4kVar, y4k.class, "onSuccess", "onSuccess(Lcoil/compose/AsyncImagePainter$State$Success;)V", 0, 9);
                oq5Var.k0(K3);
            }
            Function1 function12 = (Function1) ((h9f) K3);
            boolean h4 = oq5Var.h(y4kVar);
            Object K4 = oq5Var.K();
            if (h4 || K4 == kjnVar) {
                K4 = new mt4(1, y4kVar, y4k.class, "onError", "onError(Lcoil/compose/AsyncImagePainter$State$Error;)V", 0, 10);
                oq5Var.k0(K4);
            }
            int i9 = i5 << 3;
            int i10 = (i5 & 126) | (i9 & 7168) | (i9 & 57344) | (i9 & 458752) | (i9 & 3670016);
            int i11 = (i5 >> 27) & 14;
            int i12 = i8 << 3;
            bzf.l(obj, b2, yciVar2, rycVar4, rycVar5, rycVar3, function1, function12, (Function1) ((h9f) K4), g40Var, jd6Var, f2, i7, oq5Var, i10, i11 | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: kp5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    saf.t(obj, yciVar, rycVar, rycVar2, rycVar3, g40Var, jd6Var, f2, i2, (hq5) obj2, rvf.R(i3 | 1), rvf.R(i4));
                    return Unit.a;
                }
            };
        }
    }

    public static final ezn t0(ews ewsVar, dxb dxbVar, agb agbVar, RuntimeException runtimeException, String str, String str2) {
        pq4 pq4Var;
        pq4 pq4Var2;
        be6 be6Var;
        runtimeException.getClass();
        return new ezn(str, vgb.Unknown, agbVar, ewsVar != null ? ewsVar.a : null, (ewsVar == null || (be6Var = ewsVar.b) == null) ? null : asq.S(be6Var), (ewsVar == null || (pq4Var2 = ewsVar.c) == null) ? null : pq4Var2.a.a, (ewsVar == null || (pq4Var = ewsVar.c) == null) ? null : Integer.valueOf(pq4Var.b), dxbVar != null ? dxbVar.a : null, str2, asq.U(runtimeException));
    }

    public static final void u(Object obj, String str, yci yciVar, Function1 function1, Function1 function12, g40 g40Var, jd6 jd6Var, float f2, m85 m85Var, int i2, hq5 hq5Var, int i3) {
        int i4;
        String str2;
        yci yciVar2;
        Function1 function13;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-997642667);
        if ((i3 & 6) == 0) {
            i4 = (oq5Var.h(obj) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            str2 = str;
            i4 |= oq5Var.f(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i3 & 384) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var.f(yciVar2) ? 256 : 128;
        } else {
            yciVar2 = yciVar;
        }
        if ((i3 & 3072) == 0) {
            function13 = function1;
            i4 |= oq5Var.h(function13) ? 2048 : 1024;
        } else {
            function13 = function1;
        }
        if ((i3 & 24576) == 0) {
            i4 |= oq5Var.h(function12) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i3) == 0) {
            i4 |= oq5Var.f(g40Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i3) == 0) {
            i4 |= oq5Var.f(jd6Var) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= oq5Var.c(f2) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i3) == 0) {
            i4 |= oq5Var.f(m85Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i4 |= oq5Var.d(i2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((306783379 & i4) == 306783378 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i3 & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            agr agrVar = t8r.a;
            q8r q8rVar = (q8r) oq5Var.j(agrVar);
            Object K = oq5Var.K();
            int i5 = i4;
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new y4k();
                oq5Var.k0(K);
            }
            y4k y4kVar = (y4k) K;
            y4kVar.getClass();
            q8rVar.getClass();
            y4kVar.b = q8rVar;
            y4kVar.a = k0(obj, oq5Var);
            y4kVar.c = function12;
            cce b2 = ((q8r) oq5Var.j(agrVar)).b();
            boolean h2 = oq5Var.h(y4kVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new mt4(1, y4kVar, y4k.class, "onState", "onState(Lcoil/compose/AsyncImagePainter$State;)V", 0, 15);
                oq5Var.k0(K2);
            }
            int i6 = i5 << 3;
            h4a.b(obj, str2, b2, yciVar2, function13, (Function1) ((h9f) K2), g40Var, jd6Var, f2, m85Var, i2, oq5Var, (i6 & 1879048192) | (i5 & 126) | (i6 & 7168) | (57344 & i6) | (3670016 & i6) | (29360128 & i6) | (234881024 & i6), (i5 >> 27) & 14);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lp5(obj, str, yciVar, function1, function12, g40Var, jd6Var, f2, m85Var, i2, i3);
        }
    }

    public static void u0(ByteArrayOutputStream byteArrayOutputStream, fio fioVar) {
        x0(byteArrayOutputStream, fioVar);
        int i2 = fioVar.i;
        int[] iArr = (int[]) fioVar.d;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            n7w.g0(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : ((TreeMap) fioVar.e).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i6 = intValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i7 = intValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final void v(Object obj, String str, yci yciVar, w4k w4kVar, w4k w4kVar2, w4k w4kVar3, g40 g40Var, jd6 jd6Var, float f2, int i2, hq5 hq5Var, int i3, int i4) {
        int i5;
        String str2;
        yci yciVar2;
        w4k w4kVar4;
        w4k w4kVar5;
        int i6;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1135824267);
        if ((i3 & 6) == 0) {
            i5 = (oq5Var.h(obj) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            str2 = str;
            i5 |= oq5Var.f(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i3 & 384) == 0) {
            yciVar2 = yciVar;
            i5 |= oq5Var.f(yciVar2) ? 256 : 128;
        } else {
            yciVar2 = yciVar;
        }
        if ((i3 & 3072) == 0) {
            w4kVar4 = w4kVar;
            i5 |= oq5Var.h(w4kVar4) ? 2048 : 1024;
        } else {
            w4kVar4 = w4kVar;
        }
        if ((i3 & 24576) == 0) {
            w4kVar5 = w4kVar2;
            i5 |= oq5Var.h(w4kVar5) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            w4kVar5 = w4kVar2;
        }
        if ((i3 & 196608) == 0) {
            i5 |= oq5Var.h(w4kVar3) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((i3 & ScreenMirroringConfig.Video.BITRATE_1_5MB) == 0) {
            i5 |= oq5Var.h(null) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i5 |= oq5Var.h(null) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= oq5Var.h(null) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= oq5Var.f(g40Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (oq5Var.f(jd6Var) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= oq5Var.c(f2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= oq5Var.f(null) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= oq5Var.d(i2) ? 2048 : 1024;
        }
        int i7 = i6;
        if ((306783379 & i5) == 306783378 && (i7 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i3 & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            q8r q8rVar = (q8r) oq5Var.j(t8r.a);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new y4k();
                oq5Var.k0(K);
            }
            y4k y4kVar = (y4k) K;
            y4kVar.getClass();
            q8rVar.getClass();
            y4kVar.b = q8rVar;
            y4kVar.a = k0(obj, oq5Var);
            cce b2 = q8rVar.b();
            boolean h2 = oq5Var.h(y4kVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new mt4(1, y4kVar, y4k.class, "onLoading", "onLoading(Lcoil/compose/AsyncImagePainter$State$Loading;)V", 0, 12);
                oq5Var.k0(K2);
            }
            Function1 function1 = (Function1) ((h9f) K2);
            boolean h3 = oq5Var.h(y4kVar);
            Object K3 = oq5Var.K();
            if (h3 || K3 == kjnVar) {
                K3 = new mt4(1, y4kVar, y4k.class, "onSuccess", "onSuccess(Lcoil/compose/AsyncImagePainter$State$Success;)V", 0, 13);
                oq5Var.k0(K3);
            }
            Function1 function12 = (Function1) ((h9f) K3);
            boolean h4 = oq5Var.h(y4kVar);
            Object K4 = oq5Var.K();
            if (h4 || K4 == kjnVar) {
                K4 = new mt4(1, y4kVar, y4k.class, "onError", "onError(Lcoil/compose/AsyncImagePainter$State$Error;)V", 0, 14);
                oq5Var.k0(K4);
            }
            Function1 function13 = (Function1) ((h9f) K4);
            int i8 = i5 << 3;
            int i9 = (i8 & 3670016) | (i8 & 7168) | (i5 & 126) | (i8 & 57344) | (i8 & 458752);
            int i10 = (i5 >> 27) & 14;
            int i11 = i7 << 3;
            h4a.c(obj, str2, b2, yciVar2, w4kVar4, w4kVar5, w4kVar3, function1, function12, function13, g40Var, jd6Var, f2, i2, oq5Var, i9, i10 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i11));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new np5(obj, str, yciVar, w4kVar, w4kVar2, w4kVar3, g40Var, jd6Var, f2, i2, i3, i4);
        }
    }

    public static void v0(ByteArrayOutputStream byteArrayOutputStream, fio fioVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        n7w.g0(byteArrayOutputStream, str.getBytes(charset).length);
        n7w.g0(byteArrayOutputStream, fioVar.f);
        n7w.f0(byteArrayOutputStream, fioVar.h, 4);
        n7w.f0(byteArrayOutputStream, fioVar.g, 4);
        n7w.f0(byteArrayOutputStream, fioVar.i, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static final int w(axf axfVar, long j2, aeu aeuVar) {
        long x;
        int S;
        dds d2 = axfVar.d();
        if (d2 != null) {
            ogi ogiVar = d2.a.b;
            wof c2 = axfVar.c();
            if (c2 != null && (S = S(ogiVar, (x = c2.x(j2)), aeuVar)) != -1) {
                return ogiVar.i(enj.a(0.0f, (ogiVar.c(S) + ogiVar.h(S)) / 2.0f, 1, x));
            }
        }
        return -1;
    }

    public static void w0(ByteArrayOutputStream byteArrayOutputStream, int i2, fio fioVar) {
        int i3 = fioVar.i;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : ((TreeMap) fioVar.e).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & intValue2) == i5) {
                        int i6 = (i4 * i3) + intValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final long x(axf axfVar, ynn ynnVar, ynn ynnVar2, int i2) {
        long T = T(axfVar, ynnVar, i2);
        if (rds.b(T)) {
            return rds.b;
        }
        long T2 = T(axfVar, ynnVar2, i2);
        if (rds.b(T2)) {
            return rds.b;
        }
        int i3 = (int) (T >> 32);
        int i4 = (int) (T2 & 4294967295L);
        return y5g.P(Math.min(i3, i3), Math.max(i4, i4));
    }

    public static void x0(ByteArrayOutputStream byteArrayOutputStream, fio fioVar) {
        int i2 = 0;
        for (Map.Entry entry : ((TreeMap) fioVar.e).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                n7w.g0(byteArrayOutputStream, intValue - i2);
                n7w.g0(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    public static final boolean y(cds cdsVar, int i2) {
        ogi ogiVar = cdsVar.b;
        int e2 = ogiVar.e(i2);
        return i2 == cdsVar.e(e2) || i2 == ogiVar.d(e2, false) ? cdsVar.f(i2) != cdsVar.a(i2) : cdsVar.a(i2) != cdsVar.a(i2 - 1);
    }

    public static final Bitmap z(Image image) {
        Image.Plane[] planes = image.getPlanes();
        planes.getClass();
        Image.Plane plane = planes[0];
        int height = image.getHeight() * image.getWidth();
        int[] iArr = new int[height];
        plane.getBuffer().asIntBuffer().get(iArr);
        for (int i2 = 0; i2 < height; i2++) {
            int i3 = iArr[i2];
            iArr[i2] = c3x.U(c3x.g(i3 & KotlinVersion.MAX_COMPONENT_VALUE, (i3 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE, (i3 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE, (i3 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE));
        }
        return Bitmap.createBitmap(iArr, image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
    }
}
