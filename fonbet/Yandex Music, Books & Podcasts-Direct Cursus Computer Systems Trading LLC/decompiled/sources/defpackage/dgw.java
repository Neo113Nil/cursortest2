package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.media.ynison.service.a;
import com.yandex.media.ynison.service.b;
import com.yandex.media.ynison.service.c;
import com.yandex.media.ynison.service.d;
import com.yandex.media.ynison.service.s0;
import com.yandex.media.ynison.service.w0;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class dgw {
    public static final String j = f1d.g("YnisonShared:", "DeviceStateProvider");
    public final Context a;
    public final qrw b;
    public final kmw c;
    public final agw d;
    public final amw e;
    public final ndw f;
    public final jyr g;
    public final AtomicBoolean h = new AtomicBoolean(true);
    public final jyr i;

    public dgw(Context context, qrw qrwVar, kmw kmwVar, wfw wfwVar, biw biwVar, agw agwVar, cew cewVar, amw amwVar, ndw ndwVar) {
        this.a = context;
        this.b = qrwVar;
        this.c = kmwVar;
        this.d = agwVar;
        this.e = amwVar;
        this.f = ndwVar;
        final int i = 0;
        this.g = btf.b(new Function0(this) { // from class: cgw
            public final /* synthetic */ dgw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return l1b.c(this.b.a);
                    default:
                        dgw dgwVar = this.b;
                        w0 c = dgwVar.c();
                        String str = (String) dgwVar.d.b.getValue();
                        String E = avf.E(Build.MANUFACTURER + StringUtil.SPACE + Build.MODEL);
                        int j2 = c.j();
                        String i2 = c.i();
                        i2.getClass();
                        String appVersion = c.getAppVersion();
                        appVersion.getClass();
                        str.getClass();
                        l08 p = c.p();
                        p.d();
                        c.h((c) p.b, str);
                        p.d();
                        c.i((c) p.b, E);
                        p.d();
                        c.j((c) p.b, j2);
                        p.d();
                        c.f((c) p.b, i2);
                        p.d();
                        c.g((c) p.b, appVersion);
                        return (c) p.b();
                }
            }
        });
        final int i2 = 1;
        this.i = btf.b(new Function0(this) { // from class: cgw
            public final /* synthetic */ dgw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return l1b.c(this.b.a);
                    default:
                        dgw dgwVar = this.b;
                        w0 c = dgwVar.c();
                        String str = (String) dgwVar.d.b.getValue();
                        String E = avf.E(Build.MANUFACTURER + StringUtil.SPACE + Build.MODEL);
                        int j2 = c.j();
                        String i22 = c.i();
                        i22.getClass();
                        String appVersion = c.getAppVersion();
                        appVersion.getClass();
                        str.getClass();
                        l08 p = c.p();
                        p.d();
                        c.h((c) p.b, str);
                        p.d();
                        c.i((c) p.b, E);
                        p.d();
                        c.j((c) p.b, j2);
                        p.d();
                        c.f((c) p.b, i22);
                        p.d();
                        c.g((c) p.b, appVersion);
                        return (c) p.b();
                }
            }
        });
    }

    public final a a() {
        AudioManager d = d();
        eq4 eq4Var = gx1.a;
        d.getClass();
        Double U = wdg.U(d.getStreamVolume(3), gx1.b(d), gx1.a);
        gq4 b = gx1.b(d());
        double doubleValue = ((Number) b.m()).doubleValue() - ((Number) b.g()).doubleValue();
        if (U == null || doubleValue <= 0.0d) {
            osw oswVar = this.f.a;
            AudioManager d2 = d();
            d2.getClass();
            int streamVolume = d2.getStreamVolume(3);
            int a = gx1.a(d());
            AudioManager d3 = d();
            d3.getClass();
            int streamMaxVolume = d3.getStreamMaxVolume(3);
            oswVar.getClass();
            vdw[] vdwVarArr = vdw.a;
            oswVar.a("YNISON_ERROR_VOLUME_CONFIG", uah.e(new Pair("level", Integer.valueOf(streamVolume)), new Pair("min", Integer.valueOf(a)), new Pair("max", Integer.valueOf(streamMaxVolume))));
        }
        CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
        c cVar = (c) this.i.getValue();
        double doubleValue2 = U != null ? U.doubleValue() : 0.0d;
        qrw qrwVar = this.b;
        s0 a2 = qrwVar.a(qrwVar.a.b());
        k18 k = d.k();
        k.h(doubleValue2);
        k.d();
        d.f((d) k.b, a2);
        d dVar = (d) k.b();
        int i = 0;
        if (U != null) {
            if (doubleValue < 0.0d) {
                doubleValue = 0.0d;
            }
            if (!Double.isNaN(doubleValue)) {
                double d4 = 2;
                if (doubleValue > (0 * d4) + 0) {
                    if (doubleValue >= (1073741824 * d4) + Integer.MAX_VALUE) {
                        i = -1;
                    } else if (doubleValue <= 2.147483647E9d) {
                        i = (int) doubleValue;
                        get getVar = het.b;
                    } else {
                        get getVar2 = het.b;
                        i = ((int) (doubleValue - Integer.MAX_VALUE)) + Integer.MAX_VALUE;
                    }
                }
            }
        }
        d08 m = b.m();
        m.d();
        b.f((b) m.b);
        m.d();
        b.g((b) m.b);
        m.d();
        b.h((b) m.b, i);
        b bVar = (b) m.b();
        cVar.getClass();
        rz7 o = a.o();
        o.d();
        a.g((a) o.b, cVar);
        o.d();
        a.h((a) o.b);
        o.d();
        a.i((a) o.b, dVar);
        o.d();
        a.f((a) o.b, bVar);
        return (a) o.b();
    }

    public final String b() {
        return (String) this.d.b.getValue();
    }

    public final w0 c() {
        xdw xdwVar = xdw.a;
        String E = avf.E("Yandex Music");
        String E2 = avf.E("2026.07.4 #157gpr");
        bgw k = w0.k();
        k.d();
        w0.h((w0) k.b, 3);
        k.d();
        w0.f((w0) k.b, E);
        k.d();
        w0.g((w0) k.b, E2);
        return (w0) k.b();
    }

    public final AudioManager d() {
        return (AudioManager) this.g.getValue();
    }
}
