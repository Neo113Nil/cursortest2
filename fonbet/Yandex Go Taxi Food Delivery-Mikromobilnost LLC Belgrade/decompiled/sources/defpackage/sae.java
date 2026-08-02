package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.View;
import androidx.compose.foundation.gestures.snapping.b;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.dash.DashManifestStaleException;
import com.adjust.sdk.Constants;
import com.google.android.gms.tasks.Task;
import com.yandex.messaging.profile.d;
import com.yandex.payment.divkit.bind.view.a;
import com.yandex.payment.sdk.core.camerascanner.CardScanData;
import com.yandex.payment.sdk.core.camerascanner.CardScannerError;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.core.data.PaymentPollingResult;
import com.yandex.payment.sdk.ui.CardInput$State;
import com.yandex.xplat.payment.sdk.ButtonNameForAnalytics;
import com.yandex.xplat.payment.sdk.TextFieldNameForAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.TapAction$ModalAction$ModalType;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.TypedConfigsDto;

/* loaded from: classes5.dex */
public final class sae implements lge, ryj0, bx60, j7w0, h3v0, ju5, vs7, fbr, oyy, i33, a9b, r89 {
    public final /* synthetic */ int a;
    public Object b;

    public sae(ContentInfo contentInfo) {
        this.a = 2;
        contentInfo.getClass();
        this.b = rt7.A(contentInfo);
    }

    public static List A(pre preVar) {
        boolean z;
        if (preVar instanceof et) {
            et etVar = (et) preVar;
            return Collections.singletonList(new fz(etVar.e, etVar.f));
        }
        if (preVar instanceof zos0) {
            return Collections.singletonList(new fz(((zos0) preVar).e, null));
        }
        if (preVar instanceof c71) {
            c71 c71Var = (c71) preVar;
            String str = c71Var.k;
            r9x0 r9x0Var = c71Var.j;
            fz fzVar = r9x0Var != null ? new fz(r9x0Var, F(str)) : null;
            fws0 fws0Var = c71Var.i;
            return j73.A(new fz[]{fzVar, fws0Var != null ? D(fws0Var, F(str)) : null});
        }
        if (preVar instanceof sub) {
            sub subVar = (sub) preVar;
            r9x0 r9x0Var2 = subVar.k;
            return scc.h(r9x0Var2 != null ? new fz(r9x0Var2, F(subVar.l)) : null);
        }
        if (preVar instanceof sy8) {
            ArrayList<vx8> arrayList = ((sy8) preVar).b;
            ArrayList arrayList2 = new ArrayList();
            for (vx8 vx8Var : arrayList) {
                r9x0 r9x0Var3 = vx8Var.f;
                fz fzVar2 = r9x0Var3 != null ? new fz(r9x0Var3, vx8Var.g) : null;
                if (fzVar2 != null) {
                    arrayList2.add(fzVar2);
                }
            }
            return arrayList2;
        }
        if (preVar instanceof tbe) {
            tbe tbeVar = (tbe) preVar;
            String str2 = tbeVar.m;
            fws0 fws0Var2 = tbeVar.i;
            fz D = fws0Var2 != null ? D(fws0Var2, F(str2)) : null;
            fws0 fws0Var3 = tbeVar.j;
            return j73.A(new fz[]{D, fws0Var3 != null ? D(fws0Var3, F(str2)) : null});
        }
        if (preVar instanceof roj) {
            roj rojVar = (roj) preVar;
            r9x0 r9x0Var4 = rojVar.f;
            return scc.h(r9x0Var4 != null ? new fz(r9x0Var4, rojVar.g) : null);
        }
        if (preVar instanceof wnn) {
            ArrayList arrayList3 = ((wnn) preVar).b;
            ArrayList arrayList4 = new ArrayList();
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                ycc.r(A(((e8l0) it.next()).a), arrayList4);
            }
            return arrayList4;
        }
        if (preVar instanceof nxq) {
            nxq nxqVar = (nxq) preVar;
            String str3 = nxqVar.k;
            r9x0 r9x0Var5 = nxqVar.j;
            fz fzVar3 = r9x0Var5 != null ? new fz(r9x0Var5, F(str3)) : null;
            fws0 fws0Var4 = nxqVar.i;
            return j73.A(new fz[]{fzVar3, fws0Var4 != null ? D(fws0Var4, F(str3)) : null});
        }
        if (preVar instanceof obu) {
            obu obuVar = (obu) preVar;
            fws0 fws0Var5 = obuVar.f;
            fz D2 = fws0Var5 != null ? D(fws0Var5, null) : null;
            fws0 fws0Var6 = obuVar.g;
            return j73.A(new fz[]{D2, fws0Var6 != null ? D(fws0Var6, null) : null});
        }
        if (preVar instanceof mru) {
            ArrayList arrayList5 = ((mru) preVar).b;
            ArrayList arrayList6 = new ArrayList();
            Iterator it2 = arrayList5.iterator();
            while (it2.hasNext()) {
                ycc.r(A(((kru) it2.next()).b), arrayList6);
            }
            return arrayList6;
        }
        if (preVar instanceof yk40) {
            yk40 yk40Var = (yk40) preVar;
            x2s x2sVar = yk40Var.h;
            r9x0 r9x0Var6 = yk40Var.f;
            fz fzVar4 = r9x0Var6 != null ? new fz(r9x0Var6, x2sVar) : null;
            fws0 fws0Var7 = yk40Var.g;
            return j73.A(new fz[]{fzVar4, fws0Var7 != null ? D(fws0Var7, x2sVar) : null});
        }
        if (preVar instanceof cj60) {
            cj60 cj60Var = (cj60) preVar;
            return E(cj60Var.b, F(cj60Var.d));
        }
        if (preVar instanceof q6a0) {
            q6a0 q6a0Var = (q6a0) preVar;
            fws0 fws0Var8 = q6a0Var.e;
            return scc.h(fws0Var8 != null ? D(fws0Var8, F(q6a0Var.g)) : null);
        }
        if (preVar instanceof ymm0) {
            ArrayList<xmm0> arrayList7 = ((ymm0) preVar).c;
            ArrayList arrayList8 = new ArrayList();
            for (xmm0 xmm0Var : arrayList7) {
                ycc.r(E(xmm0Var.b, F(xmm0Var.g)), arrayList8);
            }
            return arrayList8;
        }
        if (preVar instanceof dkp0) {
            ArrayList<wjp0> arrayList9 = ((dkp0) preVar).b;
            ArrayList arrayList10 = new ArrayList();
            for (wjp0 wjp0Var : arrayList9) {
                r9x0 r9x0Var7 = wjp0Var.e;
                fz fzVar5 = r9x0Var7 != null ? new fz(r9x0Var7, wjp0Var.g) : null;
                if (fzVar5 != null) {
                    arrayList10.add(fzVar5);
                }
            }
            return arrayList10;
        }
        if (preVar instanceof q0f) {
            yye yyeVar = ((q0f) preVar).b;
            r9x0 r9x0Var8 = yyeVar.e;
            fz fzVar6 = r9x0Var8 != null ? new fz(r9x0Var8, null) : null;
            r9x0 r9x0Var9 = yyeVar.f;
            return j73.A(new fz[]{fzVar6, r9x0Var9 != null ? new fz(r9x0Var9, null) : null});
        }
        if (preVar instanceof v09) {
            v09 v09Var = (v09) preVar;
            r9x0 r9x0Var10 = v09Var.g;
            fz fzVar7 = r9x0Var10 != null ? new fz(r9x0Var10, null) : null;
            fws0 fws0Var9 = v09Var.f;
            return j73.A(new fz[]{fzVar7, fws0Var9 != null ? D(fws0Var9, null) : null});
        }
        boolean z2 = preVar instanceof q8q0;
        EmptyList emptyList = EmptyList.a;
        if (z2) {
            v7q0 v7q0Var = ((q8q0) preVar).b;
            if (v7q0Var != null) {
                x2s F = F(v7q0Var.d);
                ArrayList<o8q0> arrayList11 = v7q0Var.b;
                ArrayList arrayList12 = new ArrayList();
                for (o8q0 o8q0Var : arrayList11) {
                    ArrayList arrayList13 = new ArrayList();
                    r9x0 r9x0Var11 = o8q0Var.h;
                    if (r9x0Var11 != null) {
                        arrayList13.add(new fz(r9x0Var11, F));
                    }
                    r9x0 r9x0Var12 = o8q0Var.i;
                    if (r9x0Var12 != null) {
                        arrayList13.add(new fz(r9x0Var12, F));
                    }
                    m8q0 m8q0Var = o8q0Var.g;
                    if (m8q0Var != null) {
                        r9x0 r9x0Var13 = m8q0Var.e;
                        if (r9x0Var13 != null) {
                            arrayList13.add(new fz(r9x0Var13, F));
                        }
                    } else if (m8q0Var != null) {
                        w511.b();
                        return null;
                    }
                    ycc.r(arrayList13, arrayList12);
                }
                return arrayList12;
            }
        } else {
            if (preVar instanceof ylq0) {
                ylq0 ylq0Var = (ylq0) preVar;
                ArrayList arrayList14 = ylq0Var.c;
                ArrayList arrayList15 = new ArrayList();
                Iterator it3 = arrayList14.iterator();
                while (it3.hasNext()) {
                    r9x0 r9x0Var14 = ((xlq0) it3.next()).h;
                    fz fzVar8 = r9x0Var14 != null ? new fz(r9x0Var14, F(ylq0Var.f)) : null;
                    if (fzVar8 != null) {
                        arrayList15.add(fzVar8);
                    }
                }
                return arrayList15;
            }
            if (preVar instanceof eus0) {
                eus0 eus0Var = (eus0) preVar;
                return E(eus0Var.b, F(eus0Var.c));
            }
            if (preVar instanceof f6x0) {
                f6x0 f6x0Var = (f6x0) preVar;
                ArrayList arrayList16 = f6x0Var.c;
                ArrayList arrayList17 = new ArrayList();
                Iterator it4 = arrayList16.iterator();
                while (it4.hasNext()) {
                    r9x0 r9x0Var15 = ((y4x0) it4.next()).d;
                    fz fzVar9 = r9x0Var15 != null ? new fz(r9x0Var15, F(f6x0Var.e)) : null;
                    if (fzVar9 != null) {
                        arrayList17.add(fzVar9);
                    }
                }
                return arrayList17;
            }
            if (preVar instanceof y6x0) {
                ArrayList<f7x0> arrayList18 = ((y6x0) preVar).b;
                ArrayList arrayList19 = new ArrayList();
                for (f7x0 f7x0Var : arrayList18) {
                    r9x0 r9x0Var16 = f7x0Var.g;
                    fz fzVar10 = r9x0Var16 != null ? new fz(r9x0Var16, f7x0Var.h) : null;
                    if (fzVar10 != null) {
                        arrayList19.add(fzVar10);
                    }
                }
                return arrayList19;
            }
            if (preVar instanceof ksy0) {
                ksy0 ksy0Var = (ksy0) preVar;
                r9x0 r9x0Var17 = ksy0Var.f;
                return scc.h(r9x0Var17 != null ? new fz(r9x0Var17, F(ksy0Var.h)) : null);
            }
            if (preVar instanceof y0s0) {
                y0s0 y0s0Var = (y0s0) preVar;
                r9x0 r9x0Var18 = y0s0Var.c;
                return scc.h(r9x0Var18 != null ? new fz(r9x0Var18, F(y0s0Var.e)) : null);
            }
            if (preVar instanceof m1u) {
                ArrayList arrayList20 = ((m1u) preVar).c;
                ArrayList arrayList21 = new ArrayList();
                Iterator it5 = arrayList20.iterator();
                while (it5.hasNext()) {
                    ycc.r(A(((z0u) it5.next()).c), arrayList21);
                }
                return arrayList21;
            }
            if (!(preVar instanceof qr4) && !(preVar instanceof go6) && !(preVar instanceof yxe) && !(preVar instanceof tjj) && !(preVar instanceof frl) && !(preVar instanceof tdv) && !(preVar instanceof w0z) && !(preVar instanceof zh20) && !(preVar instanceof do60) && !(preVar instanceof ex90) && !(preVar instanceof hjf0) && !(preVar instanceof pkm0) && !(preVar instanceof kpy0) && !(preVar instanceof pd21) && !((z = preVar instanceof kg31)) && !(preVar instanceof iw0) && !(preVar instanceof fy41) && z) {
                ArrayList arrayList22 = ((kg31) preVar).b;
                ArrayList arrayList23 = new ArrayList();
                Iterator it6 = arrayList22.iterator();
                while (it6.hasNext()) {
                    ycc.r(A((pre) it6.next()), arrayList23);
                }
                return arrayList23;
            }
        }
        return emptyList;
    }

    public static fz D(fws0 fws0Var, x2s x2sVar) {
        r9x0 action;
        hz hzVar = fws0Var instanceof hz ? (hz) fws0Var : null;
        if (hzVar == null || (action = hzVar.getAction()) == null) {
            return null;
        }
        return new fz(action, x2sVar);
    }

    public static List E(xts0 xts0Var, x2s x2sVar) {
        r9x0 r9x0Var = xts0Var.g;
        fz fzVar = r9x0Var != null ? new fz(r9x0Var, x2sVar) : null;
        fws0 fws0Var = xts0Var.e;
        fz D = fws0Var != null ? D(fws0Var, x2sVar) : null;
        fws0 fws0Var2 = xts0Var.f;
        return j73.A(new fz[]{fzVar, D, fws0Var2 != null ? D(fws0Var2, x2sVar) : null});
    }

    public static x2s F(String str) {
        if (str != null) {
            return new x2s(str, null);
        }
        return null;
    }

    public static Intent r(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addFlags(SelfTester_JCP.IMITA);
        if (!jl40.l(uri.getScheme(), Constants.SCHEME)) {
            intent.addFlags(SelfTester_JCP.DECRYPT_CBC);
        }
        return intent;
    }

    public static fz y(pre preVar) {
        fz fzVar;
        Iterator it = A(preVar).iterator();
        do {
            fzVar = null;
            if (!it.hasNext()) {
                break;
            }
            fz fzVar2 = (fz) it.next();
            r9x0 r9x0Var = fzVar2.a;
            if (!(r9x0Var instanceof c9x0) || ((c9x0) r9x0Var).d != TapAction$ModalAction$ModalType.OVER_CAMERA) {
                if (r9x0Var instanceof y8x0) {
                    ArrayList<r9x0> arrayList = ((y8x0) r9x0Var).a;
                    if (!arrayList.isEmpty()) {
                        for (r9x0 r9x0Var2 : arrayList) {
                            if (!(r9x0Var2 instanceof c9x0) || ((c9x0) r9x0Var2).d != TapAction$ModalAction$ModalType.OVER_CAMERA) {
                            }
                        }
                    }
                }
            }
            fzVar = fzVar2;
            break;
        } while (fzVar == null);
        return fzVar;
    }

    public boolean C(pre preVar) {
        bq1 bq1Var = (bq1) this.b;
        TypedConfigsDto.ItemsDto a = ((p3s) bq1Var.a).a("delivery_ai_tools");
        aq1 a2 = a != null ? bq1Var.a(a) : null;
        return ((a2 != null ? a2.b : null) == null || y(preVar) == null) ? false : true;
    }

    @Override // defpackage.j7w0
    public void a(d6j0 d6j0Var) {
        if (d6j0Var != null) {
            ((ogn) this.b).b.accept(d6j0Var);
        }
    }

    @Override // defpackage.lge
    public ContentInfo b() {
        return (ContentInfo) this.b;
    }

    @Override // defpackage.r89
    public void c() {
        shb1.e(new ybf(22, this));
    }

    @Override // defpackage.a9b
    public void close() {
        this.b = null;
    }

    @Override // defpackage.oyy
    public void d(pyy pyyVar, long j, long j2, boolean z) {
        ((ogg) this.b).j((hg90) pyyVar, j2);
    }

    @Override // defpackage.lge
    public ClipData e() {
        ClipData clip;
        clip = ((ContentInfo) this.b).getClip();
        return clip;
    }

    @Override // defpackage.vs7
    public void f(CardScanData cardScanData) {
        a aVar = (a) this.b;
        CardInput$State cardInput$State = aVar.d;
        if (cardInput$State == CardInput$State.CARD_NUMBER || cardInput$State == CardInput$State.CARD_NUMBER_VALID) {
            qh8 qh8Var = aVar.q;
            if (qh8Var != null) {
                qh8Var.invoke(new yyv(TextFieldNameForAnalytics.SCANNER));
            }
            aVar.e.setExternalPreparedNumber(cardScanData.getPan());
        }
    }

    @Override // defpackage.h3v0
    public Task g(Object obj) {
        m6r0 m6r0Var = (m6r0) obj;
        com.google.firebase.crashlytics.internal.common.a aVar = ((q2f) this.b).x;
        return m6r0Var == null ? udq0.p(null) : udq0.U(Arrays.asList(com.google.firebase.crashlytics.internal.common.a.a(aVar), aVar.m.g(null, aVar.e.a)));
    }

    @Override // defpackage.lge
    public Bundle getExtras() {
        Bundle extras;
        extras = ((ContentInfo) this.b).getExtras();
        return extras;
    }

    @Override // defpackage.lge
    public int getFlags() {
        int flags;
        flags = ((ContentInfo) this.b).getFlags();
        return flags;
    }

    @Override // defpackage.lge
    public int getSource() {
        int source;
        source = ((ContentInfo) this.b).getSource();
        return source;
    }

    @Override // defpackage.vs7
    public void h(CardScannerError cardScannerError) {
        qh8 qh8Var = ((a) this.b).q;
        if (qh8Var != null) {
            qh8Var.invoke(new zyv(cardScannerError.name()));
        }
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        ((wke) ((jle) this.b).b).a.q((PaymentKitError) obj);
    }

    @Override // defpackage.j7w0
    public void j() {
        ((ogn) this.b).a.run();
    }

    @Override // defpackage.lge
    public Uri k() {
        Uri linkUri;
        linkUri = ((ContentInfo) this.b).getLinkUri();
        return linkUri;
    }

    @Override // defpackage.r89
    public void l(wx90 wx90Var) {
        shb1.e(new jhd(25, this, wx90Var));
    }

    @Override // defpackage.oyy
    public void m(pyy pyyVar, long j, long j2) {
        hg90 hg90Var = (hg90) pyyVar;
        ogg oggVar = (ogg) this.b;
        long j3 = hg90Var.a;
        npg npgVar = hg90Var.b;
        x7u0 x7u0Var = hg90Var.w;
        uwy uwyVar = new uwy(npgVar, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        oggVar.F.onLoadTaskConcluded(j3);
        oggVar.J.d(uwyVar, hg90Var.c);
        egg eggVar = (egg) hg90Var.y;
        egg eggVar2 = oggVar.c0;
        int i = 0;
        int periodCount = eggVar2 == null ? 0 : eggVar2.getPeriodCount();
        long j4 = eggVar.getPeriod(0).b;
        int i2 = 0;
        while (i2 < periodCount && oggVar.c0.getPeriod(i2).b < j4) {
            i2++;
        }
        if (eggVar.dynamic) {
            if (periodCount - i2 > eggVar.getPeriodCount()) {
                lk91.j("Loaded out of sync manifest");
            } else {
                long j5 = oggVar.i0;
                if (j5 == -9223372036854775807L || eggVar.publishTimeMs * 1000 > j5) {
                    oggVar.h0 = 0;
                } else {
                    lk91.j("Loaded stale dynamic manifest: " + eggVar.publishTimeMs + Extension.FIX_SPACE + oggVar.i0);
                }
            }
            int i3 = oggVar.h0;
            oggVar.h0 = i3 + 1;
            if (i3 < oggVar.F.getMinimumLoadableRetryCount(hg90Var.c)) {
                oggVar.W.postDelayed(oggVar.O, Math.min((oggVar.h0 - 1) * 1000, 5000));
                return;
            } else {
                oggVar.V = new DashManifestStaleException();
                return;
            }
        }
        oggVar.c0 = eggVar;
        oggVar.d0 = eggVar.dynamic & oggVar.d0;
        oggVar.e0 = j - j2;
        oggVar.f0 = j;
        oggVar.j0 += i2;
        synchronized (oggVar.M) {
            try {
                if (hg90Var.b.a == oggVar.a0) {
                    Uri uri = oggVar.c0.location;
                    if (uri == null) {
                        uri = hg90Var.w.c;
                    }
                    oggVar.a0 = uri;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        egg eggVar3 = oggVar.c0;
        if (!eggVar3.dynamic || oggVar.g0 != -9223372036854775807L) {
            oggVar.l(true);
            return;
        }
        kw21 kw21Var = eggVar3.utcTiming;
        if (kw21Var == null) {
            oggVar.i();
            return;
        }
        String str = kw21Var.a;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                oggVar.g0 = tw21.Z(kw21Var.b) - oggVar.f0;
                oggVar.l(true);
                return;
            } catch (ParserException e) {
                oggVar.k(e);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            mgg mggVar = new mgg();
            kpg kpgVar = oggVar.S;
            Uri parse = Uri.parse(kw21Var.b);
            mpg mpgVar = new mpg();
            mpgVar.a = parse;
            mpgVar.i = 1;
            oggVar.T.g(new hg90(kpgVar, mpgVar.a(), 5, mggVar), new ngg(i, oggVar), 1);
            return;
        }
        if (!Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
                oggVar.i();
                return;
            } else {
                oggVar.k(new IOException("Unsupported UTC timing scheme"));
                return;
            }
        }
        q501 q501Var = new q501(17);
        kpg kpgVar2 = oggVar.S;
        Uri parse2 = Uri.parse(kw21Var.b);
        mpg mpgVar2 = new mpg();
        mpgVar2.a = parse2;
        mpgVar2.i = 1;
        oggVar.T.g(new hg90(kpgVar2, mpgVar2.a(), 5, q501Var), new ngg(i, oggVar), 1);
    }

    @Override // defpackage.i33
    public Object n(iip0 iip0Var, Float f, Float f2, tls tlsVar, Continuation continuation) {
        Object a = b.a(iip0Var, f.floatValue(), uh6.a(0.0f, f2.floatValue(), 28), (gxg) this.b, tlsVar, (ContinuationImpl) continuation);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : (vi2) a;
    }

    @Override // defpackage.oyy
    public void o(pyy pyyVar, long j, long j2, int i) {
        uwy uwyVar;
        hg90 hg90Var = (hg90) pyyVar;
        ogg oggVar = (ogg) this.b;
        if (i == 0) {
            long j3 = hg90Var.a;
            uwyVar = new uwy(hg90Var.b);
        } else {
            long j4 = hg90Var.a;
            npg npgVar = hg90Var.b;
            x7u0 x7u0Var = hg90Var.w;
            uwyVar = new uwy(npgVar, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        }
        oggVar.J.h(uwyVar, hg90Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        return ((CoordinatorLayout) this.b).setWindowInsets(n751Var);
    }

    @Override // defpackage.vs7
    public void onCancel() {
        qh8 qh8Var = ((a) this.b).q;
        if (qh8Var != null) {
            qh8Var.invoke(new xyv(ButtonNameForAnalytics.CLOSE_SCANNER_BUTTON));
        }
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        int i;
        cle cleVar = ((jle) this.b).b;
        if (ile.a[((PaymentPollingResult) obj).ordinal()] == 1) {
            xry0 xry0Var = yry0.a;
            i = yry0.a.q;
        } else {
            xry0 xry0Var2 = yry0.a;
            i = yry0.a.c;
        }
        ((wke) cleVar).a.r(i);
    }

    @Override // defpackage.oyy
    public h0n p(pyy pyyVar, long j, long j2, IOException iOException, int i) {
        hg90 hg90Var = (hg90) pyyVar;
        ogg oggVar = (ogg) this.b;
        long j3 = hg90Var.a;
        npg npgVar = hg90Var.b;
        x7u0 x7u0Var = hg90Var.w;
        uwy uwyVar = new uwy(npgVar, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        int i2 = hg90Var.c;
        swy swyVar = new swy(iOException, i);
        twy twyVar = oggVar.F;
        long retryDelayMsFor = twyVar.getRetryDelayMsFor(swyVar);
        h0n h0nVar = retryDelayMsFor == -9223372036854775807L ? androidx.media3.exoplayer.upstream.a.f : new h0n(false, 0, retryDelayMsFor);
        boolean b = h0nVar.b();
        oggVar.J.g(uwyVar, i2, iOException, !b);
        if (!b) {
            twyVar.onLoadTaskConcluded(hg90Var.a);
        }
        return h0nVar;
    }

    @Override // defpackage.ju5
    public void q(ryj0 ryj0Var) {
        ((yv90) ((com.yandex.payment.divkit.bind.b) this.b).w).j.a(ryj0Var);
    }

    @Override // defpackage.r89
    public void s(anh anhVar) {
        shb1.e(new jhd(24, this, anhVar));
    }

    public x22 t() {
        return (x22) ((z8g) this.b).y.get();
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            default:
                return super.toString();
        }
    }

    public Context u() {
        Context context = ((z8g) this.b).a.a;
        q5z.i(context);
        return context;
    }

    public vse v() {
        return (vse) ((z8g) this.b).g.get();
    }

    @Override // defpackage.a9b
    public e1k w(s020 s020Var) {
        f0z0 f0z0Var = (f0z0) this.b;
        if (f0z0Var != null) {
            f0z0Var.invoke((com.yandex.messaging.internal.authorized.chat.notifications.b) ((m8g) s020Var).I.get());
        }
        return e1k.M1;
    }

    public LinkedHashMap x() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        me1 me1Var = (me1) this.b;
        for (String str : me1Var.a().keySet()) {
            linkedHashMap.put(str, new nj51(me1Var.b.getStringSet(str, new nj51(0).a)));
        }
        return linkedHashMap;
    }

    public d z() {
        return (d) ((z8g) this.b).h.get();
    }

    public /* synthetic */ sae(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public sae(q2f q2fVar, String str) {
        this.a = 9;
        this.b = q2fVar;
    }

    public /* synthetic */ sae(int i) {
        this.a = i;
    }
}
