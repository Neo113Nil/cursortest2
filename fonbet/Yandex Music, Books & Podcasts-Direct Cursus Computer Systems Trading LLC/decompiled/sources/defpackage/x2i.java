package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import androidx.fragment.app.y;
import com.yandex.music.shared.fmradio.api.commands.StartFmRadioQueueCommand;
import com.yandex.music.shared.generative.api.commands.StartGenerativeQueueCommand;
import com.yandex.music.shared.radio.api.commands.StartVideoClipRadioQueueCommand;
import com.yandex.music.shared.relay.queue.api.commands.StartRelayQueueCommand;
import com.yandex.music.shared.wave.api.StartWaveQueueCommand;
import com.yandex.music.shared.ynison.api.queue.StartYnisonQueueCommand;
import j$.time.ZonedDateTime;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.data.audio.WarningContent;

/* loaded from: classes.dex */
public final class x2i implements u6c, p7q, mof, rek, w2q, mx0, en3, fy1, c0o, dac, jyd, uyp, osg {
    public static boolean b;
    public static final x2i c = new x2i(0);
    public static final x2i d = new x2i(1);
    public static final x2i e = new x2i(2);
    public static final x2i f = new x2i(4);
    public static final x2i g = new x2i(5);
    public static final x2i h = new x2i(6);
    public static final x2i i = new x2i(7);
    public static final x2i j = new x2i(8);
    public static final x2i k = new x2i(9);
    public static final x2i l = new x2i(10);
    public static final x2i m = new x2i(11);
    public static final x2i n = new x2i(12);
    public final /* synthetic */ int a;

    public x2i(efo efoVar) {
        this.a = 28;
        new ReentrantLock();
        new Handler(Looper.getMainLooper());
        new HashSet();
        new AtomicBoolean(false);
        new tuh(28, this);
    }

    public static final void S() {
        String str;
        x2i x2iVar = c;
        Set set = bp6.a;
        if (set.contains(x2i.class)) {
            return;
        }
        try {
            if (set.contains(x2iVar)) {
                return;
            }
            try {
                n8c f2 = q8c.f(j3c.c(), false);
                if (f2 == null || (str = f2.j) == null) {
                    return;
                }
                try {
                    h3i.a().clear();
                    u7g.C(new JSONObject(str));
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                bp6.a(x2iVar, th);
            }
        } catch (Throwable th2) {
            bp6.a(x2i.class, th2);
        }
    }

    public static final void T(cib cibVar, String str) {
        Pattern pattern = uoj.f;
        cibVar.C("Failed to decode body. ".concat(str));
    }

    public static u8n U(wsu wsuVar, int i2, Long l2) {
        jzs jzsVar = (jzs) wsuVar.a.get(i2);
        izs izsVar = jzsVar.g;
        if (Intrinsics.d(izsVar, hzs.a) || (izsVar instanceof b6v)) {
            return new re5(new sfm(new gnf(wsuVar, null, 0)), i2, jzsVar.a, wsuVar.d instanceof seq, l2 != null ? l2.longValue() : 0L);
        }
        if (izsVar instanceof e6v) {
            return new ggr(jzsVar);
        }
        b6e.s();
        return null;
    }

    public static lt V() {
        WarningContent warningContent = WarningContent.EXPLICIT;
        gd6 gd6Var = new gd6(t75.c(new hs5(gs5.d, "1")), t75.c(h94.f), true);
        warningContent.getClass();
        return new lt("123", Album$AlbumType.COMMON, "Спец. альбом", warningContent, new u9b("avatars.yandex.net/get-music-content/10103188/b0fc313e.a.26709117-2/%%", "#079F65", null), gd6Var);
    }

    public static h06 W(int i2, String str, String str2) {
        String str3 = (i2 & 1) != 0 ? "1" : str;
        String concat = (i2 & 2) != 0 ? "Concert ".concat(str3) : str2;
        ru5 ru5Var = new ru5("unspecified");
        ZonedDateTime parse = ZonedDateTime.parse("2025-06-17T12:00:00+03:00");
        parse.getClass();
        return new h06(str3, concat, 1, "Moscow", "Luzhniki Arena", parse, "18+", "stub", "https://avatars.yandex.net/get-music-content/9837405/427d593a.p.5007577/1000x1000", -65536, "Со скидончиком", 15, ru5Var);
    }

    public static uoj X(l3o l3oVar, boolean z, boolean z2) {
        o3o o3oVar = l3oVar.g;
        if (o3oVar == null) {
            xq0.x("Can't create body writer for response with no body.");
            return null;
        }
        ij3 z3 = o3oVar.z();
        if (z3 == null) {
            kac.f("No source in response body.");
            return null;
        }
        z3.request(Long.MAX_VALUE);
        hi3 s = z3.s();
        twh o = o3oVar.o();
        String a = l3oVar.f.a("Content-Encoding");
        if (a == null) {
            a = null;
        }
        return new uoj(s, o, a, z, z2);
    }

    public static oq4 Y(String str) {
        Object obj;
        rdb rdbVar = oq4.m;
        rdbVar.getClass();
        c7 c7Var = new c7(0, rdbVar);
        while (true) {
            if (!c7Var.hasNext()) {
                obj = null;
                break;
            }
            obj = c7Var.next();
            if (((oq4) obj).a.equalsIgnoreCase(str)) {
                break;
            }
        }
        oq4 oq4Var = (oq4) obj;
        return oq4Var == null ? oq4.k : oq4Var;
    }

    public static void a0(y yVar, pu0 pu0Var, teb tebVar) {
        tka tkaVar = new tka(18);
        yVar.getClass();
        pu0Var.getClass();
        sai saiVar = new sai(false);
        yfx yfxVar = new yfx(23, saiVar, tkaVar);
        cvo cvoVar = cvo.i;
        fxf.Q(yVar, o6m.b(wjb.BottomsheetScreen, null, 6), saiVar, null, pu0Var, null, new wn5(new jv(6, tebVar, yfxVar), 1355457294, true), 20);
    }

    @Override // defpackage.uyp
    public Object A(StartRelayQueueCommand startRelayQueueCommand) {
        startRelayQueueCommand.getClass();
        throw new uej("there is no relay queue in the app");
    }

    @Override // defpackage.uyp
    public Object C(StartGenerativeQueueCommand startGenerativeQueueCommand) {
        startGenerativeQueueCommand.getClass();
        return null;
    }

    @Override // defpackage.jyd
    public long G() {
        return 5000L;
    }

    @Override // defpackage.uyp
    public Object I(StartVideoClipRadioQueueCommand startVideoClipRadioQueueCommand) {
        startVideoClipRadioQueueCommand.getClass();
        return null;
    }

    @Override // defpackage.dac
    public Object K(File file) {
        return new FileInputStream(file);
    }

    @Override // defpackage.u6c
    public void L(boolean z) {
        if (z) {
            ConcurrentHashMap concurrentHashMap = oci.a;
            if (bp6.a.contains(oci.class)) {
                return;
            }
            try {
                try {
                    j3c.d().execute(q.m);
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                bp6.a(oci.class, th);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.mof
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object N(xod xodVar, Continuation continuation) {
        nof nofVar;
        int i2;
        ImageReader imageReader;
        if (continuation instanceof nof) {
            nofVar = (nof) continuation;
            int i3 = nofVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nofVar.m = i3 - Integer.MIN_VALUE;
                Object obj = nofVar.k;
                nm6 nm6Var = nm6.a;
                i2 = nofVar.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    long j2 = xodVar.u;
                    Looper myLooper = Looper.myLooper();
                    if (myLooper == null) {
                        myLooper = Looper.getMainLooper();
                    }
                    ImageReader newInstance = ImageReader.newInstance((int) (j2 >> 32), (int) (j2 & 4294967295L), 1, 1);
                    try {
                        nofVar.j = newInstance;
                        nofVar.m = 1;
                        zt3 zt3Var = new zt3(1, qxe.b(nofVar));
                        zt3Var.s();
                        newInstance.setOnImageAvailableListener(new oof(zt3Var), ild.t(myLooper));
                        Surface surface = newInstance.getSurface();
                        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                        try {
                            lockHardwareCanvas.drawColor(c3x.U(d85.b), PorterDuff.Mode.CLEAR);
                            Canvas canvas = vd0.a;
                            ud0 ud0Var = new ud0();
                            ud0Var.a = lockHardwareCanvas;
                            xodVar.c(ud0Var, null);
                            surface.unlockCanvasAndPost(lockHardwareCanvas);
                            obj = zt3Var.q();
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                            imageReader = newInstance;
                        } catch (Throwable th) {
                            surface.unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        imageReader = newInstance;
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    imageReader = nofVar.j;
                    try {
                        qgg.h0(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            i4w.w(imageReader, th);
                            throw th4;
                        }
                    }
                }
                Bitmap z = saf.z((Image) obj);
                i4w.w(imageReader, null);
                return z;
            }
        }
        nofVar = new nof(this, (cg6) continuation);
        Object obj2 = nofVar.k;
        nm6 nm6Var2 = nm6.a;
        i2 = nofVar.m;
        if (i2 != 0) {
        }
        Bitmap z2 = saf.z((Image) obj2);
        i4w.w(imageReader, null);
        return z2;
    }

    public void Q(p7s p7sVar, l3n l3nVar, hq5 hq5Var, int i2) {
        Boolean bool;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2075892126);
        int i3 = (oq5Var.f(p7sVar) ? 4 : 2) | i2 | (oq5Var.f(l3nVar) ? 32 : 16);
        boolean z = true;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            qzm[] qzmVarArr = new qzm[0];
            if (l3nVar != null && (bool = l3nVar.e) != null) {
                z = bool.booleanValue();
            }
            pd.b(qzmVarArr, z, ild.C(471910041, new v2n(p7sVar, l3nVar, 3), oq5Var), oq5Var, 384, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new n3n(this, p7sVar, l3nVar, i2, 1);
        }
    }

    public void R(p7s p7sVar, l3n l3nVar, hq5 hq5Var, int i2) {
        Boolean bool;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1102125191);
        int i3 = (oq5Var.f(p7sVar) ? 4 : 2) | i2 | (oq5Var.f(l3nVar) ? 32 : 16);
        boolean z = true;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            qzm[] qzmVarArr = new qzm[0];
            if (l3nVar != null && (bool = l3nVar.e) != null) {
                z = bool.booleanValue();
            }
            pd.b(qzmVarArr, z, ild.C(-209159248, new v2n(p7sVar, l3nVar, 2), oq5Var), oq5Var, 384, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new n3n(this, p7sVar, l3nVar, i2, 0);
        }
    }

    public sk2 Z(Context context) {
        sk2 sk2Var;
        context.getClass();
        sk2 sk2Var2 = sk2.c;
        if (sk2Var2 != null) {
            return sk2Var2;
        }
        synchronized (this) {
            sk2Var = sk2.c;
            if (sk2Var == null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("ru.yandex.video.player.impl.bandwidth.pref", 0);
                sharedPreferences.getClass();
                sk2Var = new sk2(sharedPreferences, 0);
                sk2.c = sk2Var;
            }
        }
        return sk2Var;
    }

    @Override // defpackage.dac
    public Class a() {
        return InputStream.class;
    }

    @Override // defpackage.en3
    public byte[] b(byte[] bArr, int i2, int i3) {
        return Arrays.copyOfRange(bArr, i2, i3 + i2);
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        switch (this.a) {
            case 9:
                focVar.getClass();
                return null;
            default:
                focVar.getClass();
                return cyk.b;
        }
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        switch (this.a) {
            case 9:
                faqVar.getClass();
                return q7g.I(faqVar.e());
            default:
                faqVar.getClass();
                return cyk.c;
        }
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        switch (this.a) {
            case 9:
                jzsVar.getClass();
                return jzsVar.g;
            default:
                jzsVar.getClass();
                return cyk.b;
        }
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        switch (this.a) {
            case 9:
                m1qVar.getClass();
                return null;
            default:
                m1qVar.getClass();
                return cyk.d;
        }
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        switch (this.a) {
            case 9:
                i5uVar.getClass();
                return null;
            default:
                i5uVar.getClass();
                return cyk.b;
        }
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        switch (this.a) {
            case 9:
                k4dVar.getClass();
                return null;
            default:
                k4dVar.getClass();
                return cyk.b;
        }
    }

    @Override // defpackage.dac, defpackage.c8q
    public void l(Object obj) {
        ((InputStream) obj).close();
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        switch (this.a) {
            case 2:
                iocVar.getClass();
                break;
            default:
                iocVar.getClass();
                break;
        }
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        switch (this.a) {
            case 2:
                szuVar.getClass();
                HashSet hashSet = szuVar.o;
                boolean z = true;
                if (hashSet.size() == 1) {
                    Object P = CollectionsKt.P(hashSet);
                    dd5 dd5Var = P instanceof dd5 ? (dd5) P : null;
                    if (dd5Var instanceof xc5) {
                        z = szuVar.l.h;
                    } else if (!(dd5Var instanceof yc5) && !(dd5Var instanceof bd5) && !(dd5Var instanceof cd5) && dd5Var != null) {
                        b6e.s();
                        return null;
                    }
                }
                return Boolean.valueOf(z);
            default:
                szuVar.getClass();
                return Boolean.TRUE;
        }
    }

    @Override // defpackage.uyp
    public Object p(StartYnisonQueueCommand startYnisonQueueCommand) {
        startYnisonQueueCommand.getClass();
        return null;
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        switch (this.a) {
            case 2:
                y4dVar.getClass();
                break;
            default:
                y4dVar.getClass();
                break;
        }
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        switch (this.a) {
            case 2:
                maqVar.getClass();
                break;
            default:
                maqVar.getClass();
                break;
        }
        return Boolean.FALSE;
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        switch (this.a) {
            case 2:
                t1qVar.getClass();
                break;
            default:
                t1qVar.getClass();
                break;
        }
        return Boolean.FALSE;
    }

    public String toString() {
        switch (this.a) {
            case 14:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        switch (this.a) {
            case 2:
                u7uVar.getClass();
                break;
            default:
                u7uVar.getClass();
                break;
        }
        return Boolean.FALSE;
    }

    @Override // defpackage.uyp
    public Object v(StartFmRadioQueueCommand startFmRadioQueueCommand) {
        startFmRadioQueueCommand.getClass();
        return null;
    }

    @Override // defpackage.mx0
    public void w(jx7 jx7Var, int i2, int[] iArr, xof xofVar, int[] iArr2) {
        if (xofVar == xof.a) {
            qx0.b(iArr, iArr2, false);
        } else {
            qx0.c(i2, iArr, iArr2, true);
        }
    }

    @Override // defpackage.uyp
    public Object x(StartWaveQueueCommand startWaveQueueCommand) {
        startWaveQueueCommand.getClass();
        xsu xsuVar = startWaveQueueCommand.getStartRequest().a;
        if (!(xsuVar instanceof wsu)) {
            if (Intrinsics.d(xsuVar, rsu.a)) {
                return new ggr(null);
            }
            if (xsuVar instanceof qsu) {
                return new ggr(null);
            }
            b6e.s();
            return null;
        }
        wsu wsuVar = (wsu) xsuVar;
        vsu vsuVar = wsuVar.c;
        if (vsuVar instanceof ssu) {
            ssu ssuVar = (ssu) vsuVar;
            return U(wsuVar, ssuVar.a, ssuVar.c);
        }
        if (vsuVar instanceof tsu) {
            return U(wsuVar, wsuVar.a.size() - 1, null);
        }
        if (Intrinsics.d(vsuVar, usu.a)) {
            return new ggr(null);
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.jyd
    public String z() {
        return "Overflow.Any.TotalDuration";
    }

    @Override // defpackage.osg
    public void F(String str) {
    }

    @Override // defpackage.osg
    public void H(String str) {
    }

    public /* synthetic */ x2i(int i2) {
        this.a = i2;
    }

    @Override // defpackage.osg
    public void D(String str, Exception exc) {
    }
}
