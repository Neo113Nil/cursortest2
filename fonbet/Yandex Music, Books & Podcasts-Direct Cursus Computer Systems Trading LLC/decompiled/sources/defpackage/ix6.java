package defpackage;

import android.animation.AnimatorSet;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.CertificateFactory;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.common.media.context.h;
import ru.yandex.video.m3.data.PlaybackParameters;

/* loaded from: classes.dex */
public class ix6 implements igs, fyh, n7a, pm5, hih, sx3, xhu, oah, gs3, aqr, x7o, c8k, rct, wpd {
    public static final String[] c = {"_data"};
    public static final /* synthetic */ int d = 0;
    public final /* synthetic */ int a;
    public Object b;

    public ix6(String[] strArr) {
        this.a = 21;
        try {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, new char[0]);
            for (String str : strArr) {
                keyStore.setEntry("smthsmth", new KeyStore.TrustedCertificateEntry(CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(str.getBytes()))), null);
            }
            this.b = keyStore;
        } catch (Exception e) {
            xq0.w(e);
            throw null;
        }
    }

    public static Uri g(Bundle bundle, String str) {
        if (bp6.a.contains(ix6.class)) {
            return null;
        }
        try {
            return zc4.E(bundle, str);
        } catch (Throwable th) {
            bp6.a(ix6.class, th);
            return null;
        }
    }

    @Override // defpackage.wpd
    public void D(Object obj) {
        oq oqVar = (oq) obj;
        oqVar.getClass();
        tea teaVar = (tea) this.b;
        teaVar.getClass();
        kea keaVar = teaVar.b;
        keaVar.getClass();
        lwg C = g0g.C(oqVar, null);
        y supportFragmentManager = keaVar.a.getSupportFragmentManager();
        szf.R(supportFragmentManager, vz1.f(supportFragmentManager, C), d.k());
    }

    @Override // defpackage.rct
    public void H(qas qasVar) {
        ((qo9) this.b).setOnCheckedChangeListener(qasVar);
    }

    @Override // defpackage.wpd
    public void J(Object obj) {
        oq oqVar = (oq) obj;
        oqVar.getClass();
        tea teaVar = (tea) this.b;
        teaVar.getClass();
        kea keaVar = teaVar.b;
        keaVar.getClass();
        h k = d.k();
        t tVar = keaVar.a;
        tVar.startActivity(quj.U(tVar, new uq(oqVar, k.b(oqVar).a(), null, qq.a, 92), k));
    }

    @Override // defpackage.sx3
    public void a(rx3 rx3Var) {
        ((z03) this.b).k.l(rx3Var);
    }

    @Override // defpackage.hih
    public void b() {
        zrb zrbVar = ((ho7) this.b).C0;
        if (zrbVar != null) {
            zrbVar.a();
        }
    }

    public byte[] c(f3s f3sVar) {
        byte[] bArr;
        f3sVar.getClass();
        int i = f3sVar.b;
        byte[] bArr2 = new byte[i];
        k6j k6jVar = f3sVar.a;
        if (k6jVar.equals(t5b.r)) {
            byte[] bArr3 = new byte[4];
            byte b = (byte) (bArr3[0] | 32);
            bArr3[0] = b;
            bArr3[0] = (byte) (b | 8);
            bArr = Arrays.copyOf(bArr3, 4);
        } else if (k6jVar.equals(t5b.l)) {
            cn6 cn6Var = cn6.a;
            bArr = quj.N(uwf.v(String.valueOf(250), i * 2, '0'));
        } else if (k6jVar.equals(t5b.j)) {
            bArr = quj.N(uwf.v(String.valueOf(yv6.E0.a), i * 2, '0'));
        } else if (k6jVar.equals(t5b.h)) {
            bArr = quj.N(new SimpleDateFormat("yyMMdd").format(new Date()));
        } else if (k6jVar.equals(t5b.i)) {
            p6t[] p6tVarArr = p6t.a;
            bArr = new byte[]{(byte) 0};
        } else if (k6jVar.equals(t5b.k)) {
            bArr = quj.N("00");
        } else if (k6jVar.equals(t5b.n)) {
            bArr = new byte[]{34};
        } else if (k6jVar.equals(t5b.m)) {
            bArr = new byte[]{-32, -96, 0};
        } else if (k6jVar.equals(t5b.q)) {
            bArr = new byte[]{-114, 0, -80, 80, 5};
        } else if (k6jVar.equals(t5b.u)) {
            bArr = quj.N("7345123215904501");
        } else {
            if (k6jVar.equals(t5b.o)) {
                ((SecureRandom) this.b).nextBytes(bArr2);
            }
            bArr = null;
        }
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
        }
        return bArr2;
    }

    @Override // defpackage.rct
    public void d(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            ((qo9) this.b).setChecked(bool.booleanValue());
        }
    }

    @Override // defpackage.fyh
    public void e(hxh hxhVar, boolean z) {
        dr0 dr0Var;
        er0 er0Var = (er0) this.b;
        hxh k = hxhVar.k();
        int i = 0;
        boolean z2 = k != hxhVar;
        if (z2) {
            hxhVar = k;
        }
        dr0[] dr0VarArr = er0Var.X;
        int length = dr0VarArr != null ? dr0VarArr.length : 0;
        while (true) {
            if (i < length) {
                dr0Var = dr0VarArr[i];
                if (dr0Var != null && dr0Var.h == hxhVar) {
                    break;
                } else {
                    i++;
                }
            } else {
                dr0Var = null;
                break;
            }
        }
        if (dr0Var != null) {
            if (!z2) {
                er0Var.w(dr0Var, z);
            } else {
                er0Var.u(dr0Var.a, dr0Var, k);
                er0Var.w(dr0Var, true);
            }
        }
    }

    public LinkedHashMap f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        sk2 sk2Var = (sk2) this.b;
        for (String str : sk2Var.a().keySet()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            str.getClass();
            Set<String> stringSet = sk2Var.a.getStringSet(str, linkedHashSet);
            stringSet.getClass();
            linkedHashMap.put(str, new s7w(stringSet));
        }
        return linkedHashMap;
    }

    @Override // defpackage.xhu
    public kqv h(View view, kqv kqvVar, weg wegVar) {
        boolean z;
        BottomAppBar bottomAppBar = (BottomAppBar) this.b;
        if (bottomAppBar.P0) {
            bottomAppBar.V0 = kqvVar.a();
        }
        boolean z2 = false;
        if (bottomAppBar.Q0) {
            z = bottomAppBar.X0 != kqvVar.b();
            bottomAppBar.X0 = kqvVar.b();
        } else {
            z = false;
        }
        if (bottomAppBar.R0) {
            boolean z3 = bottomAppBar.W0 != kqvVar.c();
            bottomAppBar.W0 = kqvVar.c();
            z2 = z3;
        }
        if (!z && !z2) {
            return kqvVar;
        }
        AnimatorSet animatorSet = bottomAppBar.G0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = bottomAppBar.F0;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        bottomAppBar.I();
        bottomAppBar.H();
        return kqvVar;
    }

    @Override // defpackage.aqr
    public Task l(Object obj) {
        bpp bppVar = (bpp) obj;
        gp6 gp6Var = ((ep6) this.b).e;
        if (bppVar != null) {
            return ywf.O(Arrays.asList(gp6.a(gp6Var), gp6Var.m.s(null, (vq6) gp6Var.e.a)));
        }
        Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
        return ywf.w(null);
    }

    @Override // defpackage.oah
    public Object n(Map map, InputStream inputStream) {
        Object ag7Var;
        g8k g8kVar = (g8k) ((uvg) this.b).n(map, inputStream);
        if (g8kVar instanceof f8k) {
            ag7Var = new bg7((f8k) g8kVar);
        } else {
            if (!(g8kVar instanceof e8k)) {
                b6e.s();
                return null;
            }
            ag7Var = new ag7((e8k) g8kVar);
        }
        if (ag7Var instanceof bg7) {
            return ((bg7) ag7Var).a;
        }
        if (ag7Var instanceof ag7) {
            return ((ag7) ag7Var).a;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.c8k
    public Object o(Uri uri, kb7 kb7Var) {
        icc iccVar = (icc) ((c8k) this.b).o(uri, kb7Var);
        ArrayList arrayList = new ArrayList(v75.o(c5b.a, 10));
        b5b.a.getClass();
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        icc iccVar2 = arrayList != null ? (icc) iccVar.a(arrayList) : null;
        return iccVar2 == null ? iccVar : iccVar2;
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        dro droVar = (dro) obj;
        droVar.getClass();
        ((c27) this.b).H(StringsKt.s0(droVar.a));
    }

    @Override // defpackage.igs
    public Cursor q(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        return ((ContentResolver) this.b).query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, c, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
    }

    @Override // defpackage.pm5
    public void r(Exception exc) {
        switch (this.a) {
            case 7:
                ((nr1) this.b).i(exc);
                break;
            default:
                dt1 dt1Var = (dt1) this.b;
                dt1Var.d(null);
                dt1Var.close();
                break;
        }
    }

    @Override // defpackage.gs3
    public Type s() {
        return (Type) this.b;
    }

    @Override // defpackage.hih
    public void t() {
        zrb zrbVar = ((ho7) this.b).C0;
        if (zrbVar != null) {
            zrbVar.a();
        }
    }

    @Override // defpackage.n7a
    public void v(m7a m7aVar) {
        m7aVar.getClass();
        oa1 oa1Var = ((hb1) this.b).a;
        String str = m7aVar.a;
        jyr jyrVar = y7a.a;
        y7a.a(oa1Var.a, str, false);
    }

    @Override // defpackage.fyh
    public boolean w(hxh hxhVar) {
        Window.Callback callback;
        er0 er0Var = (er0) this.b;
        if (hxhVar != hxhVar.k() || !er0Var.G || (callback = er0Var.l.getCallback()) == null || er0Var.x0) {
            return true;
        }
        callback.onMenuOpened(108, hxhVar);
        return true;
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        ((bfk) obj).getClass();
        c27 c27Var = (c27) this.b;
        CountDownTimer countDownTimer = c27Var.y;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        c27Var.y = null;
        voi voiVar = c27Var.o;
        c27Var.m.getClass();
        voiVar.m(new w17(R.string.paymentsdk_challenger_try_again));
    }

    @Override // defpackage.gs3
    public Object z(foj fojVar) {
        hm5 hm5Var = new hm5(fojVar);
        fojVar.D(new efo(17, hm5Var));
        return hm5Var;
    }

    @Override // defpackage.n7a
    public void m(u51 u51Var) {
    }

    public /* synthetic */ ix6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public ix6(Map map) {
        this.a = 25;
        map.getClass();
        this.b = map;
    }

    public ix6(mef mefVar, jnb jnbVar) {
        this.a = 17;
        mefVar.getClass();
        this.b = new vni(jnbVar);
    }

    public ix6() {
        this.a = 29;
        this.b = new SecureRandom();
    }

    public /* synthetic */ ix6(int i) {
        this.a = i;
    }

    public ix6(f1o f1oVar, uvg uvgVar, p5a p5aVar) {
        this.a = 14;
        this.b = uvgVar;
    }

    public ix6(Bundle bundle, String str) {
        this.a = 0;
        str.getClass();
        this.b = zc4.E(bundle == null ? new Bundle() : bundle, str);
    }

    public ix6(a2t a2tVar) {
        this.a = 6;
        a2tVar.getClass();
        this.b = a2tVar;
    }

    public ix6(ep6 ep6Var, String str) {
        this.a = 20;
        this.b = ep6Var;
    }

    public ix6(c8k c8kVar, h1b h1bVar, Uri uri, PlaybackParameters playbackParameters) {
        this.a = 24;
        this.b = c8kVar;
    }
}
