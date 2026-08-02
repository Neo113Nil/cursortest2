package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Looper;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.p;
import androidx.lifecycle.y;
import com.google.gson.Strictness;
import com.yandex.attachments.view.ZoomableImageView;
import com.yandex.go.superapp.order.multi.old.provider.g;
import com.yandex.go.taxi.order.OrderCancelProcessingObserver;
import com.yandex.go.taxi.order.api.ChangeOrderApi;
import com.yandex.messaging.chat.attachments.d;
import com.yandex.messaging.domain.e;
import com.yandex.messaging.domain.personal.a;
import com.yandex.messaging.domain.personal.organization.employee.b;
import com.yandex.messaging.domain.statuses.c;
import com.yandex.messaging.internal.authorized.j;
import com.yandex.messaging.internal.n;
import com.yandex.messaging.internal.view.custom.ProgressIndicator;
import com.yandex.messaging.internal.view.timeline.MessageImageLoader$GifCompressStrategy;
import com.yandex.messaging.internal.view.timeline.MessageImageLoader$GifLoadingStrategy;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import kotlin.LazyThreadSafetyMode;
import okhttp3.OkHttpClient;
import ru.rt.ebs.cryptosdk.core.instructions.controllers.IInstructionsController;
import ru.rt.ebs.cryptosdk.core.instructions.di.IInstructionsComponent;
import ru.rt.ebs.cryptosdk.core.storage.file.IFileManager;
import ru.rt.ebs.cryptosdk.core.storage.keystore.IKeyStorage;
import ru.rt.ebs.cryptosdk.core.verification.esia.controllers.IEsiaController;
import ru.rt.ebs.cryptosdk.core.verification.esia.di.IEsiaComponent;
import ru.yandex.taxi.TaxiApplication;
import ru.yandex.taxi.preorder.tollroad.o;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes15.dex */
public final class q4g implements IEsiaComponent, wni, IInstructionsComponent {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object w;
    public Object x;
    public Object y;

    public q4g(z8g z8gVar, p8g p8gVar, d8g d8gVar, e8g e8gVar, ViewGroup viewGroup) {
        this.a = 2;
        this.b = z8gVar;
        this.c = p8gVar;
        this.w = d8gVar;
        this.x = e8gVar;
        n3w a = n3w.a(viewGroup);
        gk10 gk10Var = z8gVar.k0;
        xvf0 xvf0Var = z8gVar.f;
        vu vuVar = new vu(a, gk10Var, xvf0Var, 3);
        int i = 20;
        f380 f380Var = new f380(new vm80(z8gVar.g, p8gVar.k2, 8), i);
        eqh eqhVar = p8gVar.H;
        dby0 dby0Var = p8gVar.x;
        wrh wrhVar = new wrh(xvf0Var, eqhVar, dby0Var, 28);
        mwq mwqVar = p8gVar.W;
        h420 h420Var = z8gVar.e;
        f9t f9tVar = new f9t(mwqVar, h420Var, 4);
        xvf0 xvf0Var2 = p8gVar.L0;
        a4t a4tVar = p8gVar.B1;
        prq prqVar = new prq((v7p) f9tVar, (v7p) a4tVar, xvf0Var, xvf0Var2, (xvf0) h420Var, 16);
        ibz0 ibz0Var = new ibz0(p8gVar.C, xvf0Var, i);
        lu9 lu9Var = new lu9(z8gVar.y, 25);
        zo0 zo0Var = new zo0(p8gVar.o3, p8gVar.p3, p8gVar.M0, new f9t(dby0Var, xvf0Var, 10), xvf0Var, c4c.a, 20);
        xvf0 xvf0Var3 = p8gVar.g2;
        xvf0 xvf0Var4 = e8gVar.o;
        this.y = new g3b(d8gVar.e, p8gVar.U, vuVar, xvf0Var4, e8gVar.t, f380Var, a4tVar, p8gVar.a2, wrhVar, prqVar, ibz0Var, f9tVar, p8gVar.E0, xvf0Var3, p8gVar.f2, lu9Var, p8gVar.R0, zo0Var, new mu7(xvf0Var3, xvf0Var4, 19), h420Var);
    }

    public static mdu p(dxt dxtVar) {
        if (dxtVar == null) {
            return null;
        }
        Integer S = q5z.S(dxtVar.a);
        Integer S2 = q5z.S(dxtVar.b);
        if (S == null || S2 == null) {
            return null;
        }
        return new mdu(S.intValue(), S2.intValue(), dxtVar.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r6.getRunCount() == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Bidi a(int i) {
        Bidi bidi;
        Layout layout = (Layout) this.b;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) this.w;
        boolean[] zArr = (boolean[]) this.x;
        if (zArr[i]) {
            return (Bidi) arrayList2.get(i);
        }
        int intValue = i == 0 ? 0 : ((Number) arrayList.get(i - 1)).intValue();
        int intValue2 = ((Number) arrayList.get(i)).intValue();
        int i2 = intValue2 - intValue;
        char[] cArr = (char[]) this.y;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), intValue, intValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(j(i))) == -1 ? 1 : 0);
        }
        bidi = null;
        arrayList2.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.y;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.y = cArr2;
        return bidi;
    }

    public void b(br7 br7Var, br7 br7Var2, enw0 enw0Var, enw0 enw0Var2, Map.Entry entry) {
        enw0 enw0Var3 = (enw0) entry.getValue();
        Objects.toString(enw0Var3);
        sgb1.g(3, "DualSurfaceProcessorNode");
        s84 s84Var = new s84(enw0Var.g.f(), ((zum) entry.getKey()).a().a(), enw0Var.c ? br7Var : null, ((zum) entry.getKey()).a().c(), ((zum) entry.getKey()).a().g());
        s84 s84Var2 = new s84(enw0Var2.g.f(), ((zum) entry.getKey()).b().a(), enw0Var2.c ? br7Var2 : null, ((zum) entry.getKey()).b().c(), ((zum) entry.getKey()).b().g());
        int b = ((zum) entry.getKey()).a().b();
        enw0Var3.getClass();
        tob1.b();
        enw0Var3.b();
        d6z.y("Consumer can only be linked once.", !enw0Var3.j);
        enw0Var3.j = true;
        dnw0 dnw0Var = enw0Var3.l;
        ni91.a(ni91.n(dnw0Var.c(), new gw70(enw0Var3, dnw0Var, b, s84Var, s84Var2), geb1.f()), new xjg(27, this, enw0Var3), geb1.f());
    }

    public e c() {
        z8g z8gVar = (z8g) this.b;
        kse kseVar = (kse) z8gVar.f.get();
        p8g p8gVar = (p8g) this.c;
        p4t a = p8gVar.a();
        b bVar = new b((kse) p8gVar.b.f.get(), p8gVar.p(), (a) p8gVar.M0.get());
        lqo lqoVar = z8gVar.a.d;
        q5z.i(lqoVar);
        return new e(kseVar, a, bVar, lqoVar);
    }

    public com.yandex.messaging.domain.statuses.e d() {
        p8g p8gVar = (p8g) this.c;
        pdt f = p8gVar.f();
        c cVar = new c((kse) p8gVar.b.f.get(), (a) p8gVar.M0.get(), p8gVar.b(), p8gVar.f());
        a aVar = (a) p8gVar.M0.get();
        j p = p8gVar.p();
        z8g z8gVar = (z8g) this.b;
        return new com.yandex.messaging.domain.statuses.e(f, cVar, aVar, new rft((kse) z8gVar.f.get(), p), (kse) z8gVar.f.get(), new w3c());
    }

    public float e(int i, boolean z) {
        Layout layout = (Layout) this.b;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public float f(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        Layout layout = (Layout) this.b;
        if (!z2) {
            return e(i, z);
        }
        int b = wcb1.b(layout, i, z2);
        int lineStart = layout.getLineStart(b);
        int lineEnd = layout.getLineEnd(b);
        if (i != lineStart && i != lineEnd) {
            return e(i, z);
        }
        if (i == 0 || i == layout.getText().length()) {
            return e(i, z);
        }
        int i4 = i(i, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(j(i4))) == -1;
        int l = l(lineEnd, lineStart);
        int j = j(i4);
        int i5 = lineStart - j;
        int i6 = l - j;
        Bidi a = a(i4);
        Bidi createLineBidi = a != null ? a.createLineBidi(i5, i6) : null;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == isRtlCharAt) {
                z3 = !z3;
            }
            return i == lineStart ? z3 : !z3 ? layout.getLineLeft(b) : layout.getLineRight(b);
        }
        int runCount = createLineBidi.getRunCount();
        h0y[] h0yVarArr = new h0y[runCount];
        for (int i7 = 0; i7 < runCount; i7++) {
            h0yVarArr[i7] = new h0y(createLineBidi.getRunStart(i7) + lineStart, createLineBidi.getRunLimit(i7) + lineStart, createLineBidi.getRunLevel(i7) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i8 = 0; i8 < runCount2; i8++) {
            bArr[i8] = (byte) createLineBidi.getRunLevel(i8);
        }
        Bidi.reorderVisually(bArr, 0, h0yVarArr, 0, runCount);
        if (i == lineStart) {
            int i9 = 0;
            while (true) {
                if (i9 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (h0yVarArr[i9].a == i) {
                    i3 = i9;
                    break;
                }
                i9++;
            }
            boolean z4 = (z || z3 == h0yVarArr[i3].c) ? !z3 : z3;
            return (i3 == 0 && z4) ? layout.getLineLeft(b) : (i3 != runCount - 1 || z4) ? z4 ? layout.getPrimaryHorizontal(h0yVarArr[i3 - 1].a) : layout.getPrimaryHorizontal(h0yVarArr[i3 + 1].a) : layout.getLineRight(b);
        }
        int l2 = i > l ? l(i, lineStart) : i;
        int i10 = 0;
        while (true) {
            if (i10 >= runCount) {
                i2 = -1;
                break;
            }
            if (h0yVarArr[i10].b == l2) {
                i2 = i10;
                break;
            }
            i10++;
        }
        boolean z5 = (z || z3 == h0yVarArr[i2].c) ? z3 : !z3;
        return (i2 == 0 && z5) ? layout.getLineLeft(b) : (i2 != runCount - 1 || z5) ? z5 ? layout.getPrimaryHorizontal(h0yVarArr[i2 - 1].b) : layout.getPrimaryHorizontal(h0yVarArr[i2 + 1].b) : layout.getLineRight(b);
    }

    public n8t g() {
        v3k0 v3k0Var;
        FragmentActivity fragmentActivity = ((d8g) this.w).a;
        p8g p8gVar = (p8g) this.c;
        n nVar = new n((k020) p8gVar.H.get(), (com.yandex.messaging.internal.authorized.chat.b) p8gVar.C.get(), (kse) p8gVar.b.f.get());
        z8g z8gVar = p8gVar.b;
        Context context = z8gVar.a.a;
        q5z.i(context);
        uu10 uu10Var = new uu10();
        Context context2 = z8gVar.a.a;
        q5z.i(context2);
        kcy0 kcy0Var = new kcy0(context2, p8gVar.a(), (yef0) p8gVar.Z.get());
        Context context3 = z8gVar.a.a;
        q5z.i(context3);
        c9t c9tVar = new c9t(context, uu10Var, kcy0Var, new n421(context3, (q0k) p8gVar.G0.get()), (kse) z8gVar.f.get());
        tmt0 o = p8gVar.o();
        kse kseVar = (kse) ((z8g) this.b).f.get();
        p8g p8gVar2 = ((e8g) this.x).c;
        lqo lqoVar = p8gVar2.b.a.d;
        q5z.i(lqoVar);
        if (lqoVar.a(tz10.D)) {
            new qoy0();
            v3k0Var = new v3k0();
        } else {
            v3k0Var = new v3k0();
        }
        return new n8t(fragmentActivity, nVar, c9tVar, o, kseVar, v3k0Var, p8gVar.d());
    }

    @Override // ru.rt.ebs.cryptosdk.core.verification.esia.di.IEsiaComponent
    public IEsiaController getEsiaController() {
        ibo iboVar = (ibo) this.y;
        if (iboVar != null) {
            return iboVar;
        }
        qwu j = ((boj0) this.b).j(d70.d);
        IKeyStorage memoryKeyStorage = ((hwo0) this.c).memoryKeyStorage(((mpe) this.x).l);
        ((an8) this.w).getContext();
        ibo iboVar2 = new ibo(new qbo(new h9e(1, j), memoryKeyStorage));
        this.y = iboVar2;
        return iboVar2;
    }

    @Override // ru.rt.ebs.cryptosdk.core.instructions.di.IInstructionsComponent
    public IInstructionsController getInstructionsController() {
        u3u u3uVar;
        mpe mpeVar = (mpe) this.x;
        hwo0 hwo0Var = (hwo0) this.c;
        boj0 boj0Var = (boj0) this.b;
        m4w m4wVar = (m4w) this.y;
        if (m4wVar != null) {
            return m4wVar;
        }
        qwu j = boj0Var.j(k4w.a);
        u3u u3uVar2 = (u3u) boj0Var.y;
        if (u3uVar2 == null) {
            v3u v3uVar = new v3u();
            Strictness strictness = Strictness.LENIENT;
            Objects.requireNonNull(strictness);
            v3uVar.k = strictness;
            u3u u3uVar3 = new u3u(v3uVar);
            boj0Var.y = u3uVar3;
            u3uVar = u3uVar3;
        } else {
            u3uVar = u3uVar2;
        }
        IKeyStorage prefsKeyStorage = hwo0Var.prefsKeyStorage(mpeVar.f);
        IFileManager fileManager = hwo0Var.getFileManager();
        l4w l4wVar = new l4w(mpeVar.g, mpeVar.h);
        m4w m4wVar2 = new m4w(new p4w(new h9e(1, j), u3uVar, prefsKeyStorage, fileManager, l4wVar), new zcf(), ((an8) this.w).getSdkDispatchers());
        this.y = m4wVar2;
        return m4wVar2;
    }

    public p9t h() {
        p8g p8gVar = (p8g) this.c;
        ibt ibtVar = new ibt((kse) p8gVar.b.f.get(), (com.yandex.messaging.internal.authorized.chat.b) p8gVar.C.get());
        oeb oebVar = new oeb((at2) p8gVar.z.get());
        j p = p8gVar.p();
        z8g z8gVar = (z8g) this.b;
        return new p9t(ibtVar, new com.yandex.messaging.chat.c(oebVar, new rft((kse) z8gVar.f.get(), p), (kse) z8gVar.f.get()), (kse) z8gVar.f.get());
    }

    public int i(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.c;
        int d = scc.d(arrayList, Integer.valueOf(i));
        int i2 = d < 0 ? -(d + 1) : d + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public int j(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.c).get(i - 1)).intValue();
    }

    public boolean k() {
        String string;
        FragmentActivity fragmentActivity = (FragmentActivity) this.b;
        int applicationEnabledSetting = fragmentActivity.getPackageManager().getApplicationEnabledSetting("com.android.providers.downloads");
        if (applicationEnabledSetting == 0 || applicationEnabledSetting == 1) {
            return false;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:com.android.providers.downloads"));
        if (intent.resolveActivity(fragmentActivity.getPackageManager()) != null) {
            string = fragmentActivity.getString(qyh0.download_manager_disabled_can_show_app_info);
        } else {
            try {
                PackageManager packageManager = fragmentActivity.getPackageManager();
                string = fragmentActivity.getString(qyh0.download_manager_disabled_can_not_show_app_info, packageManager.getApplicationLabel(packageManager.getApplicationInfo("com.android.providers.downloads", 0)).toString());
            } catch (Exception unused) {
                string = fragmentActivity.getString(qyh0.download_manager_disabled_can_show_app_info);
            }
        }
        new AlertDialog.Builder(fragmentActivity).setMessage(string).setPositiveButton(qyh0.download_manager_disabled_show_settings_button, new p97(5, this)).create().show();
        return true;
    }

    public int l(int i, int i2) {
        while (i > i2) {
            char charAt = ((Layout) this.b).getText().charAt(i - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((jl40.q(charAt, 8192) < 0 || jl40.q(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    @Override // defpackage.wni
    public ComposeView m(uni uniVar, vni vniVar) {
        ComposeView composeView = new ComposeView((Context) this.b, null, 0, 6, null);
        composeView.setContent(new androidx.compose.runtime.internal.a(-1743388966, new e6r(this, (w5r) uniVar, (q9i) vniVar, 0), true));
        return composeView;
    }

    public com.yandex.go.taxi.order.controller.a n() {
        zzf zzfVar = (zzf) ((h6r) this.b);
        zzfVar.getClass();
        p s = eja1.s(y.A);
        tt2 a = zzfVar.a();
        q5z.h(a);
        o2y0 o2y0Var = (o2y0) this.c;
        TaxiApplication taxiApplication = zzfVar.a;
        com.yandex.go.taxi.order.network.b bVar = (com.yandex.go.taxi.order.network.b) zzfVar.qh.get();
        q5z.h(bVar);
        ga9 ga9Var = new ga9((fn21) zzfVar.a0.get(), (jtq0) zzfVar.a1.get());
        h hVar = (h) zzfVar.a0.get();
        q5z.h(hVar);
        ysg ysgVar = (ysg) zzfVar.I2.get();
        q5z.h(ysgVar);
        com.yandex.go.taxi.order.y yVar = (com.yandex.go.taxi.order.y) zzfVar.r6.get();
        q5z.h(yVar);
        com.yandex.go.zone.interactors.b n = zzfVar.n();
        fvt fvtVar = (fvt) zzfVar.Z8.get();
        q5z.h(fvtVar);
        ci70 ci70Var = (ci70) zzfVar.Ma.get();
        q5z.h(ci70Var);
        t41 t41Var = (t41) zzfVar.F2.get();
        q5z.h(t41Var);
        OrderCancelProcessingObserver orderCancelProcessingObserver = (OrderCancelProcessingObserver) zzfVar.Dh.get();
        q5z.h(orderCancelProcessingObserver);
        qw7 qw7Var = (qw7) zzfVar.Ih.get();
        q5z.h(qw7Var);
        pav pavVar = (pav) zzfVar.p3.get();
        q5z.h(pavVar);
        jgv x = zzfVar.x();
        ChangeOrderApi changeOrderApi = (ChangeOrderApi) zzfVar.V4.get();
        q5z.h(changeOrderApi);
        ru.yandex.taxi.translations.interactor.a aVar = new ru.yandex.taxi.translations.interactor.a((on2) zzfVar.w0.get(), (tt2) zzfVar.n.get(), (oz01) zzfVar.la.get());
        wnt wntVar = (wnt) zzfVar.q.get();
        q5z.h(wntVar);
        hvq hvqVar = (hvq) zzfVar.B7.get();
        q5z.h(hvqVar);
        uw40 uw40Var = (uw40) zzfVar.L2.get();
        q5z.h(uw40Var);
        g gVar = (g) zzfVar.e6.get();
        q5z.h(gVar);
        ri1 ri1Var = (ri1) zzfVar.Tg.get();
        q5z.h(ri1Var);
        cda0 cda0Var = (cda0) zzfVar.j1.get();
        q5z.h(cda0Var);
        tt2 a2 = zzfVar.a();
        q5z.h(a2);
        b20 b20Var = new b20(a2);
        tt2 a3 = zzfVar.a();
        q5z.h(a3);
        b20 b20Var2 = new b20(a3);
        ci70 ci70Var2 = (ci70) zzfVar.Ma.get();
        q5z.h(ci70Var2);
        com.yandex.go.taxi.tariffs.repository.g gVar2 = (com.yandex.go.taxi.tariffs.repository.g) zzfVar.Lh.get();
        q5z.h(gVar2);
        cq40 Z0 = zzf.Z0();
        rqo rqoVar = (rqo) zzfVar.C.get();
        q5z.h(rqoVar);
        ijj0 ijj0Var = new ijj0(gVar2, Z0, new hct(new dxf0(new gmx0(rqoVar))));
        h3y a4 = i5m.a((dx9) this.x);
        h3y a5 = i5m.a((f4g) this.y);
        sl50 sl50Var = (sl50) zzfVar.Mh.get();
        q5z.h(sl50Var);
        return new com.yandex.go.taxi.order.controller.a(s, a, o2y0Var, taxiApplication, bVar, ga9Var, hVar, ysgVar, yVar, n, fvtVar, ci70Var, t41Var, orderCancelProcessingObserver, qw7Var, pavVar, x, changeOrderApi, aVar, wntVar, hvqVar, uw40Var, gVar, ri1Var, cda0Var, b20Var, b20Var2, ci70Var2, ijj0Var, a4, a5, sl50Var, (qrj0) this.w);
    }

    public jwf o() {
        ViewGroup viewGroup = (ViewGroup) this.b;
        z8g z8gVar = (z8g) this.c;
        x22 x22Var = (x22) z8gVar.y.get();
        h8g h8gVar = (h8g) this.y;
        sfl0 sfl0Var = (sfl0) h8gVar.w.get();
        p8g p8gVar = (p8g) this.w;
        jn3 jn3Var = (jn3) p8gVar.X.get();
        g420 g420Var = z8gVar.a;
        lqo lqoVar = g420Var.d;
        q5z.i(lqoVar);
        apq0 apq0Var = (apq0) p8gVar.T.get();
        vv10 vv10Var = new vv10((x22) z8gVar.y.get());
        a1r a1rVar = (a1r) p8gVar.T0.get();
        e190 e190Var = (e190) h8gVar.K2.get();
        ult0 ult0Var = (ult0) p8gVar.q2.get();
        dmt0 dmt0Var = (dmt0) p8gVar.O1.get();
        ooy0 ooy0Var = (ooy0) h8gVar.L2.get();
        q0k q0kVar = (q0k) p8gVar.G0.get();
        xzq xzqVar = (xzq) z8gVar.C0.get();
        tmt0 o = p8gVar.o();
        h3y a = i5m.a(p8gVar.j0);
        arg argVar = (arg) h8gVar.M2.get();
        vse vseVar = (vse) z8gVar.g.get();
        ht10 ht10Var = new ht10(0, (Looper) z8gVar.d.get(), p8gVar.p());
        r6e r6eVar = (r6e) z8gVar.w0.get();
        q5z.i(g420Var.a);
        z8g z8gVar2 = p8gVar.b;
        Context context = z8gVar2.a.a;
        q5z.i(context);
        kcy0 kcy0Var = new kcy0(context, p8gVar.a(), (yef0) p8gVar.Z.get());
        d dVar = (d) p8gVar.D.get();
        com.yandex.messaging.ui.yadisk.a aVar = (com.yandex.messaging.ui.yadisk.a) h8gVar.N2.get();
        oyq oyqVar = (oyq) z8gVar.U.get();
        h3y a2 = i5m.a(p8gVar.r2);
        h3y a3 = i5m.a(p8gVar.s2);
        zx6 zx6Var = new zx6((xxd0) p8gVar.m1.get(), (kse) z8gVar.f.get());
        FragmentActivity fragmentActivity = ((d8g) this.x).a;
        zxd0 zxd0Var = new zxd0(new ayd0(fragmentActivity), fragmentActivity, (q0k) p8gVar.G0.get());
        ubt ubtVar = (ubt) h8gVar.O2.get();
        tyc0 tyc0Var = (tyc0) h8gVar.P.get();
        va3 va3Var = (va3) h8gVar.P2.get();
        tzk viewController = ((hkk) h8gVar.l0.get()).getViewController();
        q5z.i(viewController);
        Context context2 = z8gVar2.a.a;
        q5z.i(context2);
        n421 n421Var = new n421(context2, (q0k) p8gVar.G0.get());
        o421 o421Var = (o421) p8gVar.F1.get();
        ow10 ow10Var = (ow10) h8gVar.R2.get();
        Context context3 = g420Var.a;
        q5z.i(context3);
        j420 j420Var = new j420(context3);
        z8g z8gVar3 = h8gVar.b;
        s320 s320Var = (s320) z8gVar3.g0.get();
        p8g p8gVar2 = h8gVar.c;
        zg10 zg10Var = new zg10(s320Var, (com.yandex.messaging.internal.backendconfig.a) p8gVar2.t0.get());
        zg10 zg10Var2 = new zg10((s320) z8gVar3.g0.get(), (com.yandex.messaging.internal.backendconfig.a) p8gVar2.t0.get());
        jln jlnVar = new jln(18, (oyq) z8gVar.U.get());
        q5z.i(g420Var.d);
        u1n u1nVar = new u1n(19, zg10Var2, jlnVar);
        Context context4 = z8gVar3.a.a;
        q5z.i(context4);
        kb kbVar = new kb(context4, 9);
        sm1 sm1Var = new sm1((x22) z8gVar2.y.get());
        kse kseVar = (kse) z8gVar.f.get();
        i5m.a(p8gVar.u2);
        return new jwf(viewGroup, x22Var, sfl0Var, jn3Var, lqoVar, apq0Var, vv10Var, a1rVar, e190Var, ult0Var, dmt0Var, ooy0Var, q0kVar, xzqVar, o, a, argVar, vseVar, ht10Var, r6eVar, kcy0Var, dVar, aVar, oyqVar, a2, a3, zx6Var, zxd0Var, ubtVar, tyc0Var, va3Var, viewController, n421Var, o421Var, ow10Var, j420Var, zg10Var, u1nVar, kbVar, sm1Var, kseVar, i5m.a(p8gVar.J1), p8gVar.c(), i5m.a(p8gVar.f3));
    }

    public teh q() {
        itc itcVar = (itc) this.b;
        ru.yandex.taxi.preorder.tollroad.data.e eVar = (ru.yandex.taxi.preorder.tollroad.data.e) itcVar.c;
        q5z.h(eVar);
        o r = r();
        ptx ptxVar = (ptx) itcVar.j;
        q5z.h(ptxVar);
        pho phoVar = (pho) itcVar.r;
        q5z.h(phoVar);
        return new teh(eVar, r, ptxVar, new x770(phoVar));
    }

    public o r() {
        itc itcVar = (itc) this.b;
        mqz0 mqz0Var = (mqz0) itcVar.d;
        q5z.h(mqz0Var);
        ru.yandex.taxi.preorder.tollroad.data.e eVar = (ru.yandex.taxi.preorder.tollroad.data.e) itcVar.c;
        q5z.h(eVar);
        opz0 opz0Var = (opz0) ((xvf0) this.c).get();
        ru.yandex.taxi.preorder.tollroad.a aVar = (ru.yandex.taxi.preorder.tollroad.a) itcVar.n;
        q5z.h(aVar);
        wiq0 wiq0Var = (wiq0) itcVar.h;
        q5z.h(wiq0Var);
        xdf xdfVar = (xdf) itcVar.o;
        q5z.h(xdfVar);
        h3y a = i5m.a((ebg) this.w);
        ru.yandex.taxi.widget.c cVar = (ru.yandex.taxi.widget.c) itcVar.q;
        q5z.h(cVar);
        return new o(mqz0Var, eVar, opz0Var, aVar, wiq0Var, xdfVar, a, cVar);
    }

    @Override // ru.rt.ebs.cryptosdk.core.common.entities.models.IComponent
    public void release() {
        switch (this.a) {
            case 17:
                ((hwo0) this.c).removeStorage(((mpe) this.x).l);
                this.y = null;
                break;
            default:
                this.y = null;
                break;
        }
    }

    public h3y s() {
        return i5m.a((xvf0) this.y);
    }

    public /* synthetic */ q4g(Object obj, boj0 boj0Var, hwo0 hwo0Var, an8 an8Var, mpe mpeVar, int i) {
        this.a = i;
        this.b = boj0Var;
        this.c = hwo0Var;
        this.w = an8Var;
        this.x = mpeVar;
    }

    public /* synthetic */ q4g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
        this.x = obj4;
        this.y = obj5;
    }

    public q4g(zuj0 zuj0Var) {
        this.a = 20;
        this.b = zuj0Var;
        final int i = 0;
        sls slsVar = new sls(this) { // from class: ozt
            public final /* synthetic */ q4g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int a;
                int i2 = i;
                q4g q4gVar = this.b;
                switch (i2) {
                    case 0:
                        a = ((avj0) ((zuj0) q4gVar.b)).a(mqg0.black);
                        break;
                    case 1:
                        a = ((avj0) ((zuj0) q4gVar.b)).a(mqg0.transparent);
                        break;
                    case 2:
                        int intValue = ((Number) ((i3y) q4gVar.c).getValue()).intValue();
                        a = Color.argb((int) (Color.alpha(intValue) * 0.45f), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
                        break;
                    default:
                        int intValue2 = ((Number) ((i3y) q4gVar.c).getValue()).intValue();
                        a = Color.argb((int) (Color.alpha(intValue2) * 0.9f), Color.red(intValue2), Color.green(intValue2), Color.blue(intValue2));
                        break;
                }
                return Integer.valueOf(a);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = kotlin.a.b(lazyThreadSafetyMode, slsVar);
        final int i2 = 1;
        this.w = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ozt
            public final /* synthetic */ q4g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int a;
                int i22 = i2;
                q4g q4gVar = this.b;
                switch (i22) {
                    case 0:
                        a = ((avj0) ((zuj0) q4gVar.b)).a(mqg0.black);
                        break;
                    case 1:
                        a = ((avj0) ((zuj0) q4gVar.b)).a(mqg0.transparent);
                        break;
                    case 2:
                        int intValue = ((Number) ((i3y) q4gVar.c).getValue()).intValue();
                        a = Color.argb((int) (Color.alpha(intValue) * 0.45f), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
                        break;
                    default:
                        int intValue2 = ((Number) ((i3y) q4gVar.c).getValue()).intValue();
                        a = Color.argb((int) (Color.alpha(intValue2) * 0.9f), Color.red(intValue2), Color.green(intValue2), Color.blue(intValue2));
                        break;
                }
                return Integer.valueOf(a);
            }
        });
        final int i3 = 2;
        this.x = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ozt
            public final /* synthetic */ q4g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int a;
                int i22 = i3;
                q4g q4gVar = this.b;
                switch (i22) {
                    case 0:
                        a = ((avj0) ((zuj0) q4gVar.b)).a(mqg0.black);
                        break;
                    case 1:
                        a = ((avj0) ((zuj0) q4gVar.b)).a(mqg0.transparent);
                        break;
                    case 2:
                        int intValue = ((Number) ((i3y) q4gVar.c).getValue()).intValue();
                        a = Color.argb((int) (Color.alpha(intValue) * 0.45f), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
                        break;
                    default:
                        int intValue2 = ((Number) ((i3y) q4gVar.c).getValue()).intValue();
                        a = Color.argb((int) (Color.alpha(intValue2) * 0.9f), Color.red(intValue2), Color.green(intValue2), Color.blue(intValue2));
                        break;
                }
                return Integer.valueOf(a);
            }
        });
        final int i4 = 3;
        this.y = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: ozt
            public final /* synthetic */ q4g b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int a;
                int i22 = i4;
                q4g q4gVar = this.b;
                switch (i22) {
                    case 0:
                        a = ((avj0) ((zuj0) q4gVar.b)).a(mqg0.black);
                        break;
                    case 1:
                        a = ((avj0) ((zuj0) q4gVar.b)).a(mqg0.transparent);
                        break;
                    case 2:
                        int intValue = ((Number) ((i3y) q4gVar.c).getValue()).intValue();
                        a = Color.argb((int) (Color.alpha(intValue) * 0.45f), Color.red(intValue), Color.green(intValue), Color.blue(intValue));
                        break;
                    default:
                        int intValue2 = ((Number) ((i3y) q4gVar.c).getValue()).intValue();
                        a = Color.argb((int) (Color.alpha(intValue2) * 0.9f), Color.red(intValue2), Color.green(intValue2), Color.blue(intValue2));
                        break;
                }
                return Integer.valueOf(a);
            }
        });
    }

    public q4g(Context context, k3c k3cVar, tj60 tj60Var, ci70 ci70Var, o2y0 o2y0Var) {
        this.a = 12;
        this.b = context;
        this.w = k3cVar;
        this.x = tj60Var;
        this.y = ci70Var;
        this.c = o2y0Var;
    }

    public q4g(FragmentActivity fragmentActivity, ew2 ew2Var, rl3 rl3Var, OkHttpClient okHttpClient) {
        this.a = 11;
        this.b = fragmentActivity;
        this.c = ew2Var;
        this.w = rl3Var;
        this.x = okHttpClient;
        this.y = kotlin.a.a(new bxl(4, this));
    }

    public q4g(Layout layout) {
        this.a = 23;
        this.b = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int G = evu0.G(((Layout) this.b).getText(), '\n', i, 4);
            i = G < 0 ? ((Layout) this.b).getText().length() : G + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < ((Layout) this.b).getText().length());
        this.c = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.w = arrayList2;
        this.x = new boolean[((ArrayList) this.c).size()];
        ((ArrayList) this.c).size();
    }

    public q4g(bhv bhvVar, View view) {
        this.a = 21;
        this.y = bhvVar;
        this.b = view;
        ZoomableImageView zoomableImageView = (ZoomableImageView) view.findViewById(e9h0.image_view);
        this.c = (TextView) view.findViewById(e9h0.error_text_view);
        ProgressIndicator progressIndicator = (ProgressIndicator) view.findViewById(e9h0.progress_indicator);
        this.w = progressIndicator;
        this.x = new mt10(zoomableImageView, progressIndicator, bhvVar.g, bhvVar.h, null, MessageImageLoader$GifLoadingStrategy.ALL, MessageImageLoader$GifCompressStrategy.IMAGE_VIEWER, 1680);
        zoomableImageView.setOnClickListener(new zgv(0, bhvVar));
        zoomableImageView.setZoomCallback(bhvVar);
    }

    public q4g(itc itcVar, tqz0 tqz0Var) {
        this.a = 4;
        this.b = itcVar;
        this.c = dhs0.a(new w7y0(new ebg(itcVar, 0), 29));
        this.w = new ebg(itcVar, 2);
        this.x = i5m.b(new jzi0(11, new ebg(itcVar, 1)));
        this.y = new ebg(itcVar, 3);
    }

    public q4g(h6r h6rVar, o2y0 o2y0Var, qrj0 qrj0Var) {
        this.a = 0;
        this.b = h6rVar;
        this.c = o2y0Var;
        this.w = qrj0Var;
        f4g f4gVar = new f4g(h6rVar, 22);
        this.x = new dx9(new mt70(f4gVar, 1), new mt70(f4gVar, 0), 13);
        this.y = new f4g(h6rVar, 23);
    }

    public q4g(br7 br7Var, br7 br7Var2, DualSurfaceProcessor dualSurfaceProcessor) {
        this.a = 13;
        this.c = br7Var;
        this.w = br7Var2;
        this.b = dualSurfaceProcessor;
    }

    public q4g(z8g z8gVar, p8g p8gVar, d8g d8gVar, e8g e8gVar) {
        this.a = 1;
        this.b = z8gVar;
        this.c = p8gVar;
        this.w = d8gVar;
        this.x = e8gVar;
    }

    public q4g(z8g z8gVar, p8g p8gVar, d8g d8gVar, h8g h8gVar, ViewGroup viewGroup) {
        this.a = 3;
        this.c = z8gVar;
        this.w = p8gVar;
        this.x = d8gVar;
        this.y = h8gVar;
        this.b = viewGroup;
    }

    public q4g(int i) {
        this.a = i;
        switch (i) {
            case 15:
                this.b = new int[10];
                this.c = new int[10];
                this.w = new int[10];
                this.x = new int[10];
                this.y = new int[10];
                break;
        }
    }
}
