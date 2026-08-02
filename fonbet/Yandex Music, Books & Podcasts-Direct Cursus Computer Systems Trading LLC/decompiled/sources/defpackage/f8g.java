package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.Log;
import android.view.View;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.ZIndexElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.a;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.passport.sloth.ui.dependencies.m;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.e;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData$UgcLiveStatus;

/* loaded from: classes3.dex */
public abstract class f8g {
    public static boolean A() {
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        l18Var.a.getClass();
        return !((hrq) ((byb) r0.C(I)).b(hrq.class)).h();
    }

    public static void B(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new wp3(k5r.i(i, "Overread allowed size end="), parcel);
        }
    }

    public static ybu D(List list, q9u q9uVar) {
        IntRange intRange;
        int i = 0;
        if (q9uVar instanceof p9u) {
            int i2 = ((p9u) q9uVar).a;
            Integer valueOf = Integer.valueOf(i2);
            if (list != null) {
                intRange = u75.f(list);
            } else {
                IntRange.e.getClass();
                intRange = IntRange.f;
            }
            int i3 = intRange.a;
            if (i2 <= intRange.b && i3 <= i2) {
                r1 = valueOf;
            }
            if (r1 != null) {
                i = r1.intValue();
            }
        } else if (q9uVar instanceof o9u) {
            if (list != null) {
                Iterator it = list.iterator();
                int i4 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i4 = -1;
                        break;
                    }
                    if (Intrinsics.d(((y1u) it.next()).a.a, ((o9u) q9uVar).a)) {
                        break;
                    }
                    i4++;
                }
                r1 = i4 >= 0 ? Integer.valueOf(i4) : null;
                if (r1 != null) {
                    i = r1.intValue();
                }
            }
        } else if (q9uVar != null) {
            b6e.s();
            return null;
        }
        return new ybu(list, i);
    }

    public static p7m E() {
        return (p7m) p7m.e.getValue();
    }

    public static final int F(n7q n7qVar) {
        n7qVar.getClass();
        return ((Number) wdg.A(n7qVar, ogp.j)).intValue();
    }

    public static int G(String str) {
        str.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            bytes.getClass();
            return ByteBuffer.wrap(messageDigest.digest(bytes)).order(ByteOrder.LITTLE_ENDIAN).getInt();
        } catch (NoSuchAlgorithmException e) {
            wvs.m(e);
            return 0;
        }
    }

    public static brs H(mqs mqsVar, gj gjVar, zus zusVar, e6v e6vVar, ovs ovsVar, ve veVar, Context context, y yVar, kxi kxiVar, PlaybackScope playbackScope, Function0 function0, cvl cvlVar) {
        mqsVar.getClass();
        zusVar.getClass();
        context.getClass();
        yVar.getClass();
        kxiVar.getClass();
        playbackScope.getClass();
        cus cusVar = new cus();
        nnk D = nnk.D();
        m mVar = new m(playbackScope, function0, context, yVar, null, 48);
        l18 l18Var = l18.b;
        bdt I = hag.I(e.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        String a = playbackScope.h().a();
        ekb[] ekbVarArr = ekb.a;
        pkb pkbVar = pkb.Audiobook;
        String str = mqsVar.a;
        dkb dkbVar = dkb.Longtap;
        qdc qdcVar2 = new qdc(kxiVar, str);
        jtc jtcVar = new jtc();
        jtcVar.a = qdcVar2;
        jtcVar.b = btf.b(new v1e(12, jtcVar));
        int ordinal = veVar.b.ordinal();
        if (ordinal == 0) {
            D.getClass();
            return new tf4(mqsVar, gjVar, zusVar, mVar, context, cusVar, D, veVar.a, ovsVar, e6vVar, a, kxiVar, jtcVar, 0);
        }
        if (ordinal == 1) {
            D.getClass();
            return new tf4(mqsVar, gjVar, zusVar, mVar, context, cusVar, D, veVar.a, ovsVar, e6vVar, a, kxiVar, jtcVar, 1);
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                D.getClass();
                return new tf4(mqsVar, gjVar, zusVar, mVar, context, cusVar, D, veVar.a, ovsVar, e6vVar, a, kxiVar, jtcVar, 2);
            }
            if (ordinal == 4) {
                D.getClass();
                return new brs(mqsVar, gjVar, zusVar, mVar, context, cusVar, D, veVar.a, ovsVar, e6vVar, a, kxiVar, jtcVar);
            }
            b6e.s();
            return null;
        }
        if (cvlVar == null) {
            xq0.q("PlaylistHeader must be initialized for ActionManagerType == PLAYLIST_TRACK_LIST");
            return null;
        }
        if (ivf.I(cvlVar)) {
            D.getClass();
            return new k1m(cvlVar, mqsVar, gjVar, zusVar, mVar, context, cusVar, D, veVar.a, ovsVar, e6vVar, a, kxiVar, jtcVar);
        }
        D.getClass();
        return new brs(mqsVar, gjVar, zusVar, mVar, context, cusVar, D, veVar.a, ovsVar, e6vVar, a, kxiVar, jtcVar);
    }

    public static final mn0 J(String str, hq5 hq5Var) {
        int i;
        int i2;
        int i3;
        str.getClass();
        long j = ((dq0) ((oq5) hq5Var).j(eq0.a)).b.d;
        SpannableString spannableString = new SpannableString(str);
        Object obj = null;
        int i4 = 0;
        if (Build.VERSION.SDK_INT >= 28) {
            Linkify.addLinks(spannableString, 3);
        } else {
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
            for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
                spannableString.removeSpan(uRLSpanArr[length]);
            }
            ArrayList arrayList = new ArrayList();
            nt0.C(arrayList, spannableString, hbk.a, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter);
            nt0.C(arrayList, spannableString, hbk.b, new String[]{"mailto:"}, null);
            for (URLSpan uRLSpan : (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
                g8g g8gVar = new g8g();
                g8gVar.a = uRLSpan;
                g8gVar.c = spannableString.getSpanStart(uRLSpan);
                g8gVar.d = spannableString.getSpanEnd(uRLSpan);
                arrayList.add(g8gVar);
            }
            Collections.sort(arrayList, nt0.s);
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size - 1) {
                g8g g8gVar2 = (g8g) arrayList.get(i5);
                int i6 = i5 + 1;
                g8g g8gVar3 = (g8g) arrayList.get(i6);
                int i7 = g8gVar2.c;
                int i8 = g8gVar3.c;
                if (i7 <= i8 && (i = g8gVar2.d) > i8) {
                    int i9 = g8gVar3.d;
                    int i10 = (i9 > i && (i2 = i - i7) <= (i3 = i9 - i8)) ? i2 < i3 ? i5 : -1 : i6;
                    if (i10 != -1) {
                        URLSpan uRLSpan2 = ((g8g) arrayList.get(i10)).a;
                        if (uRLSpan2 != null) {
                            spannableString.removeSpan(uRLSpan2);
                        }
                        arrayList.remove(i10);
                        size--;
                    }
                }
                i5 = i6;
            }
            if (arrayList.size() != 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    g8g g8gVar4 = (g8g) it.next();
                    if (g8gVar4.a == null) {
                        spannableString.setSpan(new URLSpan(g8gVar4.b), g8gVar4.c, g8gVar4.d, 33);
                    }
                }
            }
        }
        kn0 kn0Var = new kn0();
        kn0Var.c(spannableString);
        URLSpan[] uRLSpanArr2 = (URLSpan[]) spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        uRLSpanArr2.getClass();
        int length2 = uRLSpanArr2.length;
        while (i4 < length2) {
            URLSpan uRLSpan3 = uRLSpanArr2[i4];
            int spanStart = spannableString.getSpanStart(uRLSpan3);
            int spanEnd = spannableString.getSpanEnd(uRLSpan3);
            kn0 kn0Var2 = kn0Var;
            int i11 = length2;
            kn0Var2.a(new c4r(j, 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, aas.c, (otp) null, 61438), spanStart, spanEnd);
            String url = uRLSpan3.getURL();
            url.getClass();
            kn0Var2.c.add(new jn0(new o7g(url, null, 6), spanStart, spanEnd, 8));
            i4++;
            kn0Var = kn0Var2;
            obj = null;
            uRLSpanArr2 = uRLSpanArr2;
            length2 = i11;
            spannableString = spannableString;
        }
        return kn0Var.h();
    }

    public static fg5 K(mm6 mm6Var, lf5 lf5Var, mqs mqsVar, Context context, ag5 ag5Var) {
        lf5Var.getClass();
        mqsVar.getClass();
        context.getClass();
        return new fg5(lf5Var, mqsVar, false, mm6Var, context, ag5Var);
    }

    public static boolean M(Parcel parcel, int i) {
        i0(i, 4, parcel);
        return parcel.readInt() != 0;
    }

    public static Boolean N(Parcel parcel, int i) {
        int V = V(parcel, i);
        if (V == 0) {
            return null;
        }
        h0(V, 4, parcel);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static double O(Parcel parcel, int i) {
        i0(i, 8, parcel);
        return parcel.readDouble();
    }

    public static float P(Parcel parcel, int i) {
        i0(i, 4, parcel);
        return parcel.readFloat();
    }

    public static IBinder Q(Parcel parcel, int i) {
        int V = V(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (V == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + V);
        return readStrongBinder;
    }

    public static int R(Parcel parcel, int i) {
        i0(i, 4, parcel);
        return parcel.readInt();
    }

    public static Integer S(Parcel parcel, int i) {
        int V = V(parcel, i);
        if (V == 0) {
            return null;
        }
        h0(V, 4, parcel);
        return Integer.valueOf(parcel.readInt());
    }

    public static long T(Parcel parcel, int i) {
        i0(i, 8, parcel);
        return parcel.readLong();
    }

    public static long U(d7k d7kVar, int i, int i2) {
        d7kVar.H(i);
        if (d7kVar.a() < 5) {
            return -9223372036854775807L;
        }
        int h = d7kVar.h();
        if ((8388608 & h) != 0 || ((2096896 & h) >> 8) != i2 || (h & 32) == 0 || d7kVar.v() < 7 || d7kVar.a() < 7 || (d7kVar.v() & 16) != 16) {
            return -9223372036854775807L;
        }
        d7kVar.f(new byte[6], 0, 6);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }

    public static int V(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void W(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + V(parcel, i));
    }

    public static final d5c X(String str) {
        str.getClass();
        String lowerCase = str.toLowerCase();
        lowerCase.getClass();
        d5c d5cVar = d5c.day;
        if (Intrinsics.d(lowerCase, "day")) {
            return d5cVar;
        }
        d5c d5cVar2 = d5c.month;
        if (Intrinsics.d(lowerCase, "month")) {
            return d5cVar2;
        }
        d5c d5cVar3 = d5c.week;
        if (Intrinsics.d(lowerCase, "week")) {
            return d5cVar3;
        }
        return null;
    }

    public static final CharSequence Y(int i, hq5 hq5Var) {
        CharSequence text = ((Context) ((oq5) hq5Var).j(AndroidCompositionLocals_androidKt.b)).getResources().getText(i);
        text.getClass();
        return text;
    }

    public static final unb Z(nyn nynVar) {
        int ordinal = nynVar.ordinal();
        if (ordinal == 0) {
            return unb.Off;
        }
        if (ordinal == 1) {
            return unb.One;
        }
        if (ordinal == 2) {
            return unb.All;
        }
        b6e.s();
        return null;
    }

    public static final void a(lti ltiVar, tmb tmbVar, hq5 hq5Var, int i) {
        tmb tmbVar2;
        oti otiVar;
        lti ltiVar2 = ltiVar;
        ltiVar2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(968240498);
        int i2 = (oq5Var.f(ltiVar2) ? 4 : 2) | i | (oq5Var.h(tmbVar) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            oti otiVar2 = (oti) szf.Q(ltiVar2.b, oq5Var).getValue();
            boolean booleanValue = ((Boolean) szf.Q(ltiVar2.c, oq5Var).getValue()).booleanValue();
            fvf a = hvf.a(0, 0, oq5Var, 0, 3);
            ogp.g.e(false, otiVar2 instanceof mti, null, oq5Var, 4096, 5);
            String title = otiVar2.getTitle();
            vm C = ghh.C(zs4.g(oq5Var), ogp.A(oq5Var));
            boolean z = (i2 & 14) == 4;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                otiVar = otiVar2;
                K = new k5h(0, ltiVar2, lti.class, "onBackClick", "onBackClick()V", 0, 21);
                oq5Var.k0(K);
            } else {
                otiVar = otiVar2;
            }
            tmbVar2 = tmbVar;
            ltiVar2 = ltiVar;
            xp3.d(title, a, null, C, (Function0) ((h9f) K), null, false, false, null, null, null, ild.C(-967395928, new zv5(otiVar, a, booleanValue, ltiVar, tmbVar2), oq5Var), oq5Var, 0, 48, 2020);
            oq5Var = oq5Var;
        } else {
            tmbVar2 = tmbVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new m2g(ltiVar2, tmbVar2, i, 17);
        }
    }

    public static final long a0(long j) {
        cqf cqfVar = cqf.a;
        return ia6.a(ga6.k(j), ga6.i(j), ga6.j(j), ga6.h(j));
    }

    public static final void b(ja0 ja0Var, hq5 hq5Var, int i) {
        ja0Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(707646463);
        int i2 = (oq5Var.f(ja0Var) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = gld.R(g.a, oq5Var);
                oq5Var.k0(K);
            }
            mm6 mm6Var = (mm6) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                K2 = Boolean.valueOf(((rlm) ((byb) qdcVar.C(I)).c(ern.a(rlm.class))).h());
                oq5Var.k0(K2);
            }
            boolean booleanValue = ((Boolean) K2).booleanValue();
            boolean z = ja0Var.h.getValue() == lf3.b;
            if (booleanValue) {
                oq5Var.Z(1796681036);
                boolean h = oq5Var.h(mm6Var) | ((i2 & 14) == 4);
                Object K3 = oq5Var.K();
                if (h || K3 == kjnVar) {
                    K3 = new en0(ja0Var, mm6Var, null);
                    oq5Var.k0(K3);
                }
                q5g.f(z, (Function2) K3, oq5Var, 0);
                oq5Var.p(false);
            } else {
                oq5Var.Z(1797514657);
                boolean h2 = oq5Var.h(mm6Var) | ((i2 & 14) == 4);
                Object K4 = oq5Var.K();
                if (h2 || K4 == kjnVar) {
                    K4 = new iik(10, mm6Var, ja0Var);
                    oq5Var.k0(K4);
                }
                pd.c(0, 0, oq5Var, (Function0) K4, z);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cc4(ja0Var, i, 2);
        }
    }

    public static final String b0(String str) {
        str.getClass();
        try {
            Charset forName = Charset.forName("UTF-8");
            forName.getClass();
            byte[] bytes = str.getBytes(forName);
            bytes.getClass();
            return c0(bytes);
        } catch (UnsupportedEncodingException e) {
            wvs.m(e);
            return null;
        }
    }

    public static final void c(Function0 function0, kv4 kv4Var, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-796549945);
        int i2 = i | (oq5Var.h(function0) ? 4 : 2) | (oq5Var.h(kv4Var) ? 32 : 16) | 384;
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            String M = rvf.M(R.string.has_notification, oq5Var);
            float f = 48;
            vci vciVar = vci.a;
            aae.a(function0, a.a(d.q(vciVar, f, f, 0.0f, 0.0f, 12), "button_profile"), false, ild.C(973124451, new wcj(23, kv4Var, M), oq5Var), oq5Var, (i2 & 14) | 24576, 12);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q6h(function0, kv4Var, yciVar2, i, 27);
        }
    }

    public static final String c0(byte[] bArr) {
        bArr.getClass();
        bArr.getClass();
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            digest.getClass();
            char[] cArr = wct.f;
            char[] cArr2 = new char[digest.length << 1];
            int i = 0;
            for (byte b : digest) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b & 240) >>> 4];
                i += 2;
                cArr2[i2] = cArr[b & 15];
            }
            return new String(cArr2);
        } catch (NoSuchAlgorithmException e) {
            wvs.m(e);
            return null;
        }
    }

    public static final void d(v3h v3hVar, Function1 function1, Function0 function0, boolean z, Function0 function02, yci yciVar, o0k o0kVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        mn0 mn0Var = v3hVar.a;
        function1.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(981250089);
        int i2 = i | (oq5Var2.f(v3hVar) ? 4 : 2) | (oq5Var2.h(function0) ? 256 : 128) | (oq5Var2.g(z) ? 2048 : 1024) | (oq5Var2.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var2.f(o0kVar) ? 1048576 : 524288);
        if ((599187 & i2) == 599186 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            boolean f = oq5Var2.f(mn0Var);
            Object K = oq5Var2.K();
            Object obj = gq5.a;
            if (f || K == obj) {
                K = new two(0);
                oq5Var2.k0(K);
            }
            two twoVar = (two) K;
            uoi uoiVar = twoVar.c;
            boolean f2 = oq5Var2.f(twoVar);
            Object K2 = oq5Var2.K();
            Continuation continuation = null;
            if (f2 || K2 == obj) {
                K2 = new v0r(twoVar, function1, continuation, 9);
                oq5Var2.k0(K2);
            }
            gld.w(oq5Var2, uoiVar, (Function2) K2);
            boolean z2 = (i2 & 57344) == 16384;
            Object K3 = oq5Var2.K();
            if (z2 || K3 == obj) {
                K3 = new om0(function02, continuation, 4);
                oq5Var2.k0(K3);
            }
            gld.w(oq5Var2, v3hVar, (Function2) K3);
            xit xitVar = new xit(o0kVar, androidx.compose.foundation.layout.a.a(0.0f, t2h.a, 1));
            long j = ((dq0) oq5Var2.j(eq0.a)).b.a;
            ges j2 = nu0.j();
            oq5Var = oq5Var2;
            yci o = androidx.compose.foundation.layout.a.o(yciVar, v0k.a, 0.0f, 2);
            Object K4 = oq5Var.K();
            if (K4 == obj) {
                K4 = vz1.h(oq5Var);
            }
            xcs.c(mn0Var, androidx.compose.foundation.layout.a.l(bfg.Q(androidx.compose.foundation.a.d(o, (uoi) K4, null, !z, null, null, function0, 24), twoVar, false, 14), xitVar), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, j2, oq5Var, 0, 0, 131064);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k26(v3hVar, function1, function0, z, function02, yciVar, o0kVar, i, 4);
        }
    }

    public static final String d0(rr4 rr4Var) {
        StringBuilder sb = new StringBuilder("id=");
        int i = rr4Var.a;
        p1g p1gVar = (p1g) rr4Var.b;
        sb.append(i);
        sb.append(StringUtil.SPACE);
        if (rr4Var instanceof bjh) {
            bjh bjhVar = (bjh) rr4Var;
            if (bjhVar instanceof yih) {
                sb.append("Configured cause=");
                if (p1gVar instanceof djh) {
                    sb.append("Configure configuration=");
                    sb.append(e0((rdk) ((djh) p1gVar).a.b));
                } else {
                    sb.append("Unexpected state transition");
                }
            } else if (bjhVar instanceof ajh) {
                sb.append("Uninitialized cause=");
                if (p1gVar instanceof ejh) {
                    sb.append("Create codecName=");
                    ejh ejhVar = (ejh) p1gVar;
                    sb.append(ejhVar.a);
                    sb.append(" type=");
                    sb.append(ejhVar.b);
                } else if (p1gVar instanceof ujh) {
                    sb.append("Stop");
                } else if (p1gVar instanceof pjh) {
                    sb.append("Reset");
                } else {
                    sb.append("Unexpected state transition");
                }
            } else if (bjhVar instanceof zih) {
                sb.append("Error codecName=");
                zih zihVar = (zih) rr4Var;
                sb.append(zihVar.c);
                sb.append(", configuration=");
                sb.append(e0((rdk) zihVar.d.b));
                sb.append(", cause=");
                p1g p1gVar2 = zihVar.e;
                if (p1gVar2 instanceof ejh) {
                    sb.append("Create");
                } else if (p1gVar2 instanceof djh) {
                    sb.append("Configure");
                } else if (p1gVar2 instanceof tjh) {
                    sb.append("Start");
                } else if (p1gVar2 instanceof ujh) {
                    sb.append("Stop");
                } else if (p1gVar2 instanceof pjh) {
                    sb.append("Reset");
                } else if (p1gVar2 instanceof jjh) {
                    sb.append("Flush");
                } else if (p1gVar2 instanceof njh) {
                    sb.append("Release");
                } else if (p1gVar2 instanceof ijh) {
                    sb.append("Error ");
                    sb.append(Log.getStackTraceString(((ijh) p1gVar2).a));
                } else if (p1gVar2 instanceof fjh) {
                    sb.append("DequeueInputBuffer");
                } else if (p1gVar2 instanceof ljh) {
                    sb.append("QueueInputBufferEos");
                } else if (p1gVar2 instanceof mjh) {
                    sb.append("QueueSecureInputBuffer");
                } else if (p1gVar2 instanceof kjh) {
                    sb.append("QueueInputBuffer");
                } else if (p1gVar2 instanceof gjh) {
                    sb.append("DequeueOutputBuffer");
                } else if (p1gVar2 instanceof ojh) {
                    sb.append("ReleaseOutputBuffer");
                } else if (p1gVar2 instanceof qjh) {
                    sb.append("SetOutputSurface isValid=");
                    sb.append(((qjh) p1gVar2).a);
                } else if (p1gVar2 instanceof hjh) {
                    sb.append("DetachOutputSurface");
                } else if (p1gVar2 instanceof rjh) {
                    sb.append("SetParameters params=");
                    sb.append(((rjh) p1gVar2).a.toString());
                } else if (p1gVar2 instanceof sjh) {
                    sb.append("SetVideoScalingMode mode=");
                    int i2 = ((sjh) p1gVar2).a;
                    sb.append(i2 != 1 ? i2 != 2 ? "UNKNOWN" : "SCALE_TO_FIT_WITH_CROPPING" : "SCALE_TO_FIT");
                } else if (p1gVar2 instanceof cjh) {
                    sb.append("Failed to set async callback.");
                }
                sb.append(" inputFormat=");
                sb.append(zihVar.f);
                sb.append(" outputFormat=");
                sb.append(zihVar.g);
            }
        } else if (rr4Var instanceof wih) {
            wih wihVar = (wih) rr4Var;
            if (wihVar instanceof uih) {
                sb.append("Flushed cause=");
                if (p1gVar instanceof jjh) {
                    sb.append("Flush");
                } else if (p1gVar instanceof tjh) {
                    sb.append("Start");
                } else {
                    sb.append("Unexpected state transition");
                }
            } else if (wihVar instanceof vih) {
                sb.append("Running ");
                if (p1gVar instanceof tjh) {
                    sb.append("Start");
                } else if (p1gVar instanceof fjh) {
                    sb.append("DequeueInputBuffer");
                } else {
                    sb.append("Unexpected state transition");
                }
            } else if (wihVar instanceof tih) {
                sb.append("EndOfStream ");
                if (p1gVar instanceof ljh) {
                    sb.append("QueueInputBufferEos");
                } else {
                    sb.append("Unexpected state transition");
                }
            }
        } else if (rr4Var instanceof xih) {
            sb.append(" Released codecName=");
            sb.append(((xih) rr4Var).c);
        }
        return sb.toString();
    }

    public static final void e(wpu wpuVar, Function0 function0, hq5 hq5Var, int i) {
        int i2;
        Object obj;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(837565250);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var.f(wpuVar) : oq5Var.h(wpuVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        int i3 = i & 384;
        vci vciVar = vci.a;
        if (i3 == 0) {
            i2 |= oq5Var.f(vciVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (wpuVar.a) {
                oq5Var.Z(-1853384743);
                obj = pm0.f(oq5Var);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-1853339700);
                Object K = oq5Var.K();
                if (K == gq5.a) {
                    K = tlm.h(1.0f, oq5Var);
                }
                obj = (poi) K;
                oq5Var.p(false);
            }
            s7g.k(up6.g, up6.h, up6.i, ild.C(-1102454255, new k0r(26, obj, function0), oq5Var), vciVar, false, up6.k, oq5Var, ((i2 << 6) & 57344) | 12586422, 96);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new npu(wpuVar, function0, i);
        }
    }

    public static final String e0(rdk rdkVar) {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        rdkVar.getClass();
        StringBuilder sb = new StringBuilder("Configuration(format=");
        sb.append(((dsc) rdkVar.d).toString());
        sb.append(", mediaFormat=");
        sb.append((MediaFormat) rdkVar.c);
        sb.append(", codecName=");
        mih mihVar = (mih) rdkVar.b;
        sb.append(mihVar.a);
        sb.append(", mimeType=");
        sb.append(mihVar.b);
        sb.append(", codecMimeType=");
        sb.append(mihVar.c);
        sb.append(", adaptive=");
        sb.append(mihVar.e);
        sb.append(", secure=");
        sb.append(mihVar.g);
        sb.append(", hardwareAccelerated=");
        sb.append(mihVar.h);
        sb.append(", maxSupportedInstances=");
        return f1d.i(sb, (dvt.a < 23 || (codecCapabilities = mihVar.d) == null) ? -1 : codecCapabilities.getMaxSupportedInstances(), ")");
    }

    public static final void f(int i, boolean z, Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        long j;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1213680437);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            w4k E = a0g.E(i, i3 & 14, oq5Var);
            agr agrVar = eq0.a;
            long j2 = ((dq0) oq5Var.j(agrVar)).c.c;
            if (z) {
                oq5Var.Z(1884214866);
                j = ((dq0) oq5Var.j(agrVar)).a.a;
            } else {
                oq5Var.Z(1884215924);
                j = ((dq0) oq5Var.j(agrVar)).a.c;
            }
            oq5Var.p(false);
            boolean z2 = (i3 & 112) == 32;
            Object K = oq5Var.K();
            if (z2 || K == gq5.a) {
                K = new i32(14, z);
                oq5Var.k0(K);
            }
            xv.q(E, j2, j, function0, nfp.b(yciVar, false, (Function1) K), false, false, oq5Var, ((i3 << 6) & 57344) | 3072);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qu(function0, z, yciVar, i, i2);
        }
    }

    public static int f0(Parcel parcel) {
        int readInt = parcel.readInt();
        int V = V(parcel, readInt);
        char c = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new wp3("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i = V + dataPosition;
        if (i < dataPosition || i > parcel.dataSize()) {
            throw new wp3(f1d.e(dataPosition, i, "Size read is invalid start=", " end="), parcel);
        }
        return i;
    }

    public static final void g(long j, geh gehVar, psv psvVar, lyv lyvVar, rxv rxvVar, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        boolean z;
        aqi aqiVar;
        yci yciVar2;
        gehVar.getClass();
        psvVar.getClass();
        lyvVar.getClass();
        rxvVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1153710904);
        if ((i & 6) == 0) {
            i2 = (oq5Var.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(gehVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(psvVar) : oq5Var.h(psvVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(lyvVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.f(rxvVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.h(function0) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var.f(yciVar) ? 1048576 : 524288;
        }
        if ((599187 & i2) == 599186 && oq5Var.z()) {
            oq5Var.S();
        } else {
            aqi O = gld.O(psvVar.a, oq5Var);
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = szf.g0(Boolean.FALSE);
                oq5Var.k0(K);
            }
            aqi aqiVar2 = (aqi) K;
            View view = (View) oq5Var.j(AndroidCompositionLocals_androidKt.f);
            boolean f = oq5Var.f((zsv) O.getValue());
            Object K2 = oq5Var.K();
            if (f || K2 == obj) {
                K2 = szf.g0(lyvVar.d.get(gehVar));
                oq5Var.k0(K2);
            }
            aqi aqiVar3 = (aqi) K2;
            oq5Var.Z(-614574281);
            boolean f2 = oq5Var.f(aqiVar3) | ((i2 & 14) == 4);
            Object K3 = oq5Var.K();
            if (f2 || K3 == obj) {
                K3 = new j8a(j, aqiVar3, 6);
                oq5Var.k0(K3);
            }
            yci yciVar3 = vci.a;
            yci i3 = androidx.compose.foundation.layout.a.i(yciVar3, (Function1) K3);
            boolean h = ((i2 & 896) == 256 || ((i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 && oq5Var.h(psvVar))) | oq5Var.h(view);
            Object K4 = oq5Var.K();
            if (h || K4 == obj) {
                K4 = new hav(6, view, psvVar);
                oq5Var.k0(K4);
            }
            Function0 function02 = (Function0) K4;
            boolean f3 = oq5Var.f(O);
            Object K5 = oq5Var.K();
            if (f3 || K5 == obj) {
                K5 = new tiv(O, 2);
                oq5Var.k0(K5);
            }
            Function0 function03 = (Function0) K5;
            boolean f4 = oq5Var.f(O);
            Object K6 = oq5Var.K();
            if (f4 || K6 == obj) {
                K6 = new tiv(O, 3);
                oq5Var.k0(K6);
            }
            yci D = vq1.D(i3, function02, function03, (Function0) K6, 0.9f, null, oq5Var, 24576, 112);
            oq5 oq5Var2 = oq5Var;
            zsv zsvVar = (zsv) O.getValue();
            zsvVar.getClass();
            if (zsvVar instanceof ysv) {
                z = false;
            } else if (!(zsvVar instanceof xsv)) {
                b6e.s();
                return;
            } else {
                wsv wsvVar = ((xsv) zsvVar).b;
                qsv qsvVar = wsvVar instanceof qsv ? (qsv) wsvVar : null;
                z = (qsvVar != null ? qsvVar.c : null) instanceof hsv;
            }
            if (z) {
                function0.invoke();
                Object K7 = oq5Var2.K();
                if (K7 == obj) {
                    K7 = new tiv(aqiVar2, 4);
                    oq5Var2.k0(K7);
                }
                Function0 function04 = (Function0) K7;
                aqiVar = O;
                yciVar2 = D;
                wje s = fgq.s(fgq.D("infinite transition", oq5Var2, 0), 1.0f, 0.8f, weo.C(new act(300, 1000, nya.d), jyn.b, 0L, 4), "artist card infinite scaling animation", oq5Var2, 29112, 0);
                oq5Var2 = oq5Var2;
                Object[] objArr = new Object[0];
                Object K8 = oq5Var2.K();
                if (K8 == obj) {
                    K8 = new h8v(22);
                    oq5Var2.k0(K8);
                }
                aqi aqiVar4 = (aqi) o2g.g0(objArr, null, (Function0) K8, oq5Var2, 0, 6);
                Boolean valueOf = Boolean.valueOf(((Number) s.d.getValue()).floatValue() == 1.0f);
                boolean f5 = oq5Var2.f(aqiVar4);
                Object K9 = oq5Var2.K();
                if (f5 || K9 == obj) {
                    K9 = new n6p(function04, aqiVar4, null, 26);
                    oq5Var2.k0(K9);
                }
                gld.w(oq5Var2, valueOf, (Function2) K9);
                float floatValue = ((Number) s.d.getValue()).floatValue();
                yciVar3 = gdg.L(yciVar3, floatValue, floatValue);
            } else {
                aqiVar = O;
                yciVar2 = D;
            }
            yci f6 = yciVar2.f(yciVar3);
            oq5Var2.p(false);
            yci f7 = f6.f(yciVar);
            zsv zsvVar2 = (zsv) aqiVar.getValue();
            Object K10 = oq5Var2.K();
            if (K10 == obj) {
                K10 = new ulv(14);
                oq5Var2.k0(K10);
            }
            Function1 function1 = (Function1) K10;
            Object K11 = oq5Var2.K();
            if (K11 == obj) {
                K11 = new jiv(3);
                oq5Var2.k0(K11);
            }
            oq5 oq5Var3 = oq5Var2;
            ixf.p(zsvVar2, f7, null, function1, (Function2) K11, ild.C(122649420, new ln1(psvVar, gehVar, rxvVar, aqiVar2), oq5Var2), oq5Var3, 224256, 4);
            oq5Var = oq5Var3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x4j(j, gehVar, psvVar, lyvVar, rxvVar, function0, yciVar, i);
        }
    }

    public static final yci g0(yci yciVar, float f) {
        return yciVar.f(new ZIndexElement(f));
    }

    public static final void h(xsv xsvVar, Function0 function0, Function0 function02, Function0 function03, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        Function0 function04;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(833734408);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(xsvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function04 = function02;
            i2 |= oq5Var.h(function04) ? 256 : 128;
        } else {
            function04 = function02;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(function03) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            wsv wsvVar = xsvVar.b;
            wsv wsvVar2 = xsvVar.b;
            ktv ktvVar = xsvVar.a;
            d8t e = i8t.e(wsvVar, "Change mode transition", oq5Var, 48, 0);
            oct octVar = azt.a;
            wsv wsvVar3 = (wsv) e.c();
            oq5Var.Z(-2108677268);
            float f = 0.1f;
            float f2 = wsvVar3 instanceof tsv ? 0.2f : ((wsvVar3 instanceof qsv) && (((qsv) wsvVar3).c instanceof isv)) ? 0.1f : 1.0f;
            oq5Var.p(false);
            Float valueOf = Float.valueOf(f2);
            wsv wsvVar4 = (wsv) e.d.getValue();
            oq5Var.Z(-2108677268);
            if (wsvVar4 instanceof tsv) {
                f = 0.2f;
            } else if (!(wsvVar4 instanceof qsv) || !(((qsv) wsvVar4).c instanceof isv)) {
                f = 1.0f;
            }
            oq5Var.p(false);
            Float valueOf2 = Float.valueOf(f);
            e.f().getClass();
            oq5Var.Z(799320736);
            int E = h4a.E(e);
            int i3 = i2;
            ov6 ov6Var = lya.c;
            act S = weo.S(E, 0, ov6Var, 2);
            oq5Var.p(false);
            z7t c = i8t.c(e, valueOf, valueOf2, S, octVar, oq5Var, 196608);
            oq5Var.W(-1940103682, ktvVar.b);
            boolean f3 = oq5Var.f(c);
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (f3 || K == obj) {
                K = new f6u(c, 27);
                oq5Var.k0(K);
            }
            yci s = wyf.s(yciVar, (Function0) K);
            kfh d = ug3.d(b2c.f, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, s);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            i(wsvVar2, ktvVar.d, ktvVar.g, function04, function03, oq5Var, (i3 << 3) & 64512);
            yci a = b.a.a(vci.a, b2c.i);
            act S2 = weo.S(h4a.E(e), 0, ov6Var, 2);
            Object K2 = oq5Var.K();
            if (K2 == obj) {
                K2 = new ulv(13);
                oq5Var.k0(K2);
            }
            ot0.l(wsvVar2, (Function1) K2, a, S2, null, false, ild.C(232333663, new f0g(6, function0), oq5Var), oq5Var, 1572912, 48);
            oq5Var = oq5Var;
            oq5Var.p(true);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x9v(xsvVar, function0, function02, function03, yciVar, i);
        }
    }

    public static void h0(int i, int i2, Parcel parcel) {
        if (i == i2) {
            return;
        }
        throw new wp3(su4.o(dfi.l("Expected size ", i2, i, " got ", " (0x"), Integer.toHexString(i), ")"), parcel);
    }

    public static final void i(wsv wsvVar, String str, String str2, Function0 function0, Function0 function02, hq5 hq5Var, int i) {
        int i2;
        String str3;
        String str4;
        Function0 function03;
        Function0 function04;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(526887767);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(wsvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            function04 = function02;
            function03 = function0;
            str4 = str2;
            str3 = str;
        } else {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new gtv();
                oq5Var.k0(K);
            }
            gtv gtvVar = (gtv) K;
            if ((wsvVar instanceof qsv) || (wsvVar instanceof usv)) {
                gtvVar.a.setValue(Boolean.FALSE);
                gtvVar.b.h(1.0f);
            } else if (wsvVar instanceof rsv) {
                gtvVar.a.setValue(Boolean.TRUE);
                gtvVar.b.h(2.2f);
            } else if (!(wsvVar instanceof tsv)) {
                b6e.s();
                return;
            }
            vci vciVar = vci.a;
            yci c = d.c(vciVar, 1.0f);
            yci m = d.m(vciVar, 72);
            int i3 = i2 >> 3;
            int i4 = i2 << 6;
            lsq.l(str, str2, gtvVar, c, m, function0, function02, oq5Var, (i3 & 112) | (i3 & 14) | 28032 | (458752 & i4) | (i4 & 3670016));
            str3 = str;
            str4 = str2;
            function03 = function0;
            function04 = function02;
            if (wsvVar instanceof rsv) {
                oq5Var.Z(-1590896054);
                j(((rsv) wsvVar).c, oq5Var, 0);
            } else {
                oq5Var.Z(-1601257525);
            }
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x9v(wsvVar, str3, str4, function03, function04, i);
        }
    }

    public static void i0(int i, int i2, Parcel parcel) {
        int V = V(parcel, i);
        if (V == i2) {
            return;
        }
        throw new wp3(su4.o(dfi.l("Expected size ", i2, V, " got ", " (0x"), Integer.toHexString(V), ")"), parcel);
    }

    public static final void j(osv osvVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1293627725);
        if ((((oq5Var2.f(osvVar) ? 4 : 2) | i) & 3) == 2 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else if (osvVar instanceof nsv) {
            oq5Var2.Z(278170653);
            String str = ((nsv) osvVar).d;
            oq5Var = oq5Var2;
            aqi B = t7g.B(str != null ? new ibu(str) : null, true, ((d3w) oq5Var2.j(e3w.a)).l, null, dcu.All, oq5Var, 24624, 8);
            pbu pbuVar = (pbu) B.getValue();
            boolean d = Intrinsics.d(pbuVar, nbu.a);
            vci vciVar = vci.a;
            if (d) {
                oq5Var.Z(-1930677604);
                neg.q(oq5Var).invoke(d.c(vciVar, 1.0f), oq5Var, 6);
                oq5Var.p(false);
            } else if (pbuVar instanceof obu) {
                oq5Var.Z(-1930673704);
                t7g.j((pbu) B.getValue(), d.c(vciVar, 1.0f), null, null, oq5Var, 48, 12);
                oq5Var = oq5Var;
                oq5Var.p(false);
            } else {
                if (!Intrinsics.d(pbuVar, lbu.a) && !(pbuVar instanceof mbu)) {
                    throw vz1.i(oq5Var, -1930679245, false);
                }
                oq5Var.Z(-1930666921);
                oq5Var.p(false);
            }
            oq5Var.p(false);
        } else {
            oq5Var = oq5Var2;
            if (!osvVar.equals(msv.a)) {
                throw vz1.i(oq5Var, -1930691548, false);
            }
            oq5Var.Z(-1930664553);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ksv(osvVar, i, 1);
        }
    }

    public static byr l(int i) {
        if (i == 0) {
            return ayr.b;
        }
        if (i == 1) {
            return wxr.b;
        }
        if (i == 2) {
            return xxr.b;
        }
        if ((i & 3) == 3) {
            return new zxr(i);
        }
        if (i == 4) {
            return yxr.b;
        }
        xq0.x(k5r.i(i, "state not found for code: "));
        return null;
    }

    public static long m(long j, cqf cqfVar) {
        cqf cqfVar2 = cqf.a;
        return ia6.a(cqfVar == cqfVar2 ? ga6.k(j) : ga6.j(j), cqfVar == cqfVar2 ? ga6.i(j) : ga6.h(j), cqfVar == cqfVar2 ? ga6.j(j) : ga6.k(j), cqfVar == cqfVar2 ? ga6.h(j) : ga6.i(j));
    }

    public static final String n(cdj cdjVar) {
        cdjVar.getClass();
        if (Intrinsics.d(cdjVar, adj.a)) {
            return "playing";
        }
        if (Intrinsics.d(cdjVar, ycj.a)) {
            return UgcLiveVideoData$UgcLiveStatus.FINISHED;
        }
        if (cdjVar instanceof zcj) {
            return "not started";
        }
        if (cdjVar instanceof bdj) {
            return "started";
        }
        b6e.s();
        return null;
    }

    public static long o(int i, long j) {
        return ia6.a(0, ga6.i(j), (i & 4) != 0 ? ga6.j(j) : 0, ga6.h(j));
    }

    public static Bundle p(Parcel parcel, int i) {
        int V = V(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (V == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + V);
        return readBundle;
    }

    public static byte[] q(Parcel parcel, int i) {
        int V = V(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (V == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + V);
        return createByteArray;
    }

    public static int[] r(Parcel parcel, int i) {
        int V = V(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (V == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + V);
        return createIntArray;
    }

    public static ArrayList s(Parcel parcel, int i) {
        int V = V(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (V == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + V);
        return arrayList;
    }

    public static long[] t(Parcel parcel, int i) {
        int V = V(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (V == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + V);
        return createLongArray;
    }

    public static Parcelable u(Parcel parcel, int i, Parcelable.Creator creator) {
        int V = V(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (V == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + V);
        return parcelable;
    }

    public static String v(Parcel parcel, int i) {
        int V = V(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (V == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + V);
        return readString;
    }

    public static String[] w(Parcel parcel, int i) {
        int V = V(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (V == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + V);
        return createStringArray;
    }

    public static ArrayList x(Parcel parcel, int i) {
        int V = V(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (V == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + V);
        return createStringArrayList;
    }

    public static Object[] y(Parcel parcel, int i, Parcelable.Creator creator) {
        int V = V(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (V == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + V);
        return createTypedArray;
    }

    public static ArrayList z(Parcel parcel, int i, Parcelable.Creator creator) {
        int V = V(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (V == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + V);
        return createTypedArrayList;
    }

    public abstract f8g C(Executor executor);

    public abstract f8g I(List list);

    public abstract f8g L(Executor executor);

    public abstract t7h k();
}
