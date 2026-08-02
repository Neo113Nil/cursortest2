package defpackage;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Magnifier;
import androidx.fragment.app.Fragment;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.yandex.go.address.models.Address;
import com.yandex.go.user_profile.ui.primary.c;
import com.yandex.payment.sdk.ui.preselect.PreselectActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.passes.widget.internal.a;
import com.ybsdk.feature.passes.widget.internal.b;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.domain.ContactSelectionStrategy;
import ru.yandex.taxi.settings.profile.rating.PassengerRatingInfoDialog;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes13.dex */
public final class v5c0 implements ca20, xcy, cl90, umf0, ybi0, rdq0 {
    public final /* synthetic */ int a;
    public Object b;

    public v5c0(im90 im90Var, um90 um90Var) {
        this.a = 17;
        p370 p370Var = um90Var.a;
        oy80 oy80Var = im90Var.a.a;
        this.b = new a((AppAnalyticsReporter) ((c5g) oy80Var.b).get(), (b) ((l180) oy80Var.c).get(), p370Var);
    }

    public x5g A(or4 or4Var) {
        bu0 bu0Var = (bu0) this.b;
        bu0Var.getClass();
        x5g x5gVar = new x5g();
        x5gVar.a = new w5g(bu0Var, 3);
        x5gVar.b = new w5g(bu0Var, 1);
        int i = 5;
        int i2 = 17;
        h1t h1tVar = new h1t(new w5g(bu0Var, i), i2);
        xdc xdcVar = wdc.a;
        int i3 = 6;
        tl3 tl3Var = new tl3(xdcVar, i3);
        int i4 = 7;
        w5g w5gVar = new w5g(bu0Var, i4);
        x5gVar.c = w5gVar;
        tgb0 tgb0Var = new tgb0(tl3Var, xdcVar, new y501(w5gVar, i4), 12);
        int i5 = 27;
        x5gVar.d = i5m.b(new cto(h1tVar, wsf0.a, tgb0Var, i5));
        k1w k1wVar = new k1w(x5gVar.a, i);
        w5g w5gVar2 = x5gVar.b;
        int i6 = 19;
        x5gVar.e = new p4((Object) new elo0(k1wVar, w5gVar2, i5), (xvf0) w5gVar2, i6);
        x5gVar.f = new lk(29, new w5g(bu0Var, 0));
        n3w a = n3w.a(or4Var);
        x5gVar.g = a;
        xvf0 b = i5m.b(new av4(x5gVar.b, x5gVar.d, x5gVar.e, x5gVar.f, a, 0));
        x5gVar.h = b;
        w5g w5gVar3 = new w5g(bu0Var, 8);
        w5g w5gVar4 = new w5g(bu0Var, i3);
        x5gVar.i = w5gVar4;
        w5g w5gVar5 = x5gVar.a;
        p4 p4Var = new p4((Object) w5gVar4, (xvf0) new p4((xvf0) w5gVar5, (xvf0) w5gVar3, i2), 18);
        w5g w5gVar6 = new w5g(bu0Var, 4);
        ywf ywfVar = new ywf(10, or4Var);
        peb pebVar = new peb(new w5g(bu0Var, 2), i3);
        nt0 nt0Var = new nt0(w5gVar5, b, w5gVar3, p4Var, w5gVar6, b, x5gVar.g, ywfVar, pebVar, new qh4(pebVar, x5gVar.c));
        x5gVar.j = nt0Var;
        x5gVar.k = i5m.b(nt0Var);
        x5gVar.l = i5m.b(new ze(x5gVar.i, x5gVar.j, i6));
        return x5gVar;
    }

    public eaf0 B(d0l0 d0l0Var, boolean z) {
        List a = d0l0Var.a();
        List list = a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            Address address = (Address) obj;
            zzs B = address.B();
            String uri = address.getUri();
            if (uri == null) {
                uri = "";
            }
            String str = uri;
            String c2 = address.c2();
            d5v0 d5v0Var = e5v0.Companion;
            int size = a.size();
            d5v0Var.getClass();
            arrayList.add(new e5v0(B, str, c2, d5v0.a(i, size), address.J1(), address.D1()));
            i = i2;
        }
        Address h = d0l0Var.h();
        if (h != null) {
            zzs d = ((com.yandex.go.route.interactor.b) this.b).d();
            if (d != null) {
                return new eaf0(d, h, arrayList, z, null, null, null, null, 224);
            }
            jst.e.s(new IllegalStateException("taxiPoint should not be null here"));
        }
        return null;
    }

    @Override // defpackage.rdq0
    public void B0() {
    }

    public int C(int i, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i2;
        int i3;
        rys rysVar = (rys) this.b;
        if (iArr.length == 0) {
            w511.q();
            return 0;
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i4 = 1;
            while (i4 < length && iArr[i4] == 0) {
                i4++;
            }
            if (i4 == length) {
                iArr2 = new int[]{0};
            } else {
                int i5 = length - i4;
                int[] iArr4 = new int[i5];
                System.arraycopy(iArr, i4, iArr4, 0, i5);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i];
        boolean z = true;
        for (int i6 = 0; i6 < i; i6++) {
            int i7 = rysVar.a[rysVar.g + i6];
            if (i7 == 0) {
                i3 = iArr2[iArr2.length - 1];
            } else {
                if (i7 == 1) {
                    i2 = 0;
                    for (int i8 : iArr2) {
                        rys rysVar2 = rys.h;
                        i2 ^= i8;
                    }
                } else {
                    i2 = iArr2[0];
                    int length2 = iArr2.length;
                    for (int i9 = 1; i9 < length2; i9++) {
                        i2 = rysVar.c(i7, i2) ^ iArr2[i9];
                    }
                }
                i3 = i2;
            }
            iArr5[(i - 1) - i6] = i3;
            if (i3 != 0) {
                z = false;
            }
        }
        if (z) {
            return 0;
        }
        sys sysVar = new sys(rysVar, iArr5);
        sys a = rysVar.a(i, 1);
        sys sysVar2 = rysVar.c;
        if (a.d() >= sysVar.d()) {
            a = sysVar;
            sysVar = a;
        }
        sys sysVar3 = rysVar.d;
        sys sysVar4 = a;
        sys sysVar5 = sysVar;
        sys sysVar6 = sysVar4;
        sys sysVar7 = sysVar2;
        while (sysVar6.d() * 2 >= i) {
            if (sysVar6.e()) {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
            int b = rysVar.b(sysVar6.c(sysVar6.d()));
            sys sysVar8 = sysVar2;
            while (sysVar5.d() >= sysVar6.d() && !sysVar5.e()) {
                int d = sysVar5.d() - sysVar6.d();
                int c = rysVar.c(sysVar5.c(sysVar5.d()), b);
                sysVar8 = sysVar8.a(rysVar.a(d, c));
                sysVar5 = sysVar5.a(sysVar6.h(d, c));
            }
            sys a2 = sysVar8.g(sysVar3).a(sysVar7);
            if (sysVar5.d() >= sysVar6.d()) {
                ak00.h("Division algorithm failed to reduce polynomial? r: ", sysVar5, ", rLast: ", sysVar6);
                return 0;
            }
            sys sysVar9 = sysVar5;
            sysVar5 = sysVar6;
            sysVar6 = sysVar9;
            sysVar7 = sysVar3;
            sysVar3 = a2;
        }
        int c2 = sysVar3.c(0);
        if (c2 == 0) {
            throw new ReedSolomonException("sigmaTilde(0) was zero");
        }
        int b2 = rysVar.b(c2);
        sys[] sysVarArr = {sysVar3.f(b2), sysVar6.f(b2)};
        sys sysVar10 = sysVarArr[0];
        sys sysVar11 = sysVarArr[1];
        int d2 = sysVar10.d();
        if (d2 == 1) {
            iArr3 = new int[]{sysVar10.c(1)};
        } else {
            int[] iArr6 = new int[d2];
            int i10 = 0;
            for (int i11 = 1; i11 < rysVar.e && i10 < d2; i11++) {
                if (sysVar10.b(i11) == 0) {
                    iArr6[i10] = rysVar.b(i11);
                    i10++;
                }
            }
            if (i10 != d2) {
                throw new ReedSolomonException("Error locator degree does not match number of roots");
            }
            iArr3 = iArr6;
        }
        int length3 = iArr3.length;
        int[] iArr7 = new int[length3];
        for (int i12 = 0; i12 < length3; i12++) {
            int b3 = rysVar.b(iArr3[i12]);
            int i13 = 1;
            for (int i14 = 0; i14 < length3; i14++) {
                if (i12 != i14) {
                    int c3 = rysVar.c(iArr3[i14], b3);
                    i13 = rysVar.c(i13, (c3 & 1) == 0 ? c3 | 1 : c3 & (-2));
                }
            }
            int c4 = rysVar.c(sysVar11.b(b3), rysVar.b(i13));
            iArr7[i12] = c4;
            if (rysVar.g != 0) {
                iArr7[i12] = rysVar.c(c4, b3);
            }
        }
        for (int i15 = 0; i15 < iArr3.length; i15++) {
            int length4 = iArr.length - 1;
            int i16 = iArr3[i15];
            if (i16 == 0) {
                w511.q();
                return 0;
            }
            int i17 = length4 - rysVar.b[i16];
            if (i17 < 0) {
                throw new ReedSolomonException("Bad error location");
            }
            iArr[i17] = iArr[i17] ^ iArr7[i15];
        }
        return iArr3.length;
    }

    public ArrayList D(t6 t6Var) {
        lcc lccVar;
        s6y s6yVar = (s6y) this.b;
        int i = kcc.a[s6yVar.o.ordinal()];
        if (i == 1) {
            lccVar = new lcc(t6Var.c, t6Var.d);
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            lccVar = new lcc(t6Var.a, t6Var.b);
        }
        ahp0 F = F(lccVar);
        float f = F.a;
        float f2 = F.b;
        int i2 = m3y.a[s6yVar.o.ordinal()];
        if (i2 == 1) {
            ArrayList H = H();
            ArrayList arrayList = new ArrayList();
            Iterator it = H.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                l0j0 l0j0Var = (l0j0) ((l3y) next);
                if (((int) (l0j0Var.b() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) >= f && ((int) (l0j0Var.b() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + ((int) (l0j0Var.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) <= f2) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
        if (i2 != 2) {
            w511.b();
            return null;
        }
        ArrayList H2 = H();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = H2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            l0j0 l0j0Var2 = (l0j0) ((l3y) next2);
            if (((int) (l0j0Var2.b() >> 32)) >= f && ((int) (l0j0Var2.b() >> 32)) + ((int) (l0j0Var2.c() >> 32)) <= f2) {
                arrayList2.add(next2);
            }
        }
        return arrayList2;
    }

    @Override // defpackage.xcy
    public ddy E() {
        return new ddy();
    }

    public ahp0 F(lcc lccVar) {
        long e;
        float f = lccVar.a;
        float f2 = lccVar.b;
        s6y s6yVar = (s6y) this.b;
        int i = m3y.a[s6yVar.o.ordinal()];
        if (i == 1) {
            e = s6yVar.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            e = s6yVar.e() >> 32;
        }
        return new ahp0(f, ((int) e) - f2);
    }

    public long G() {
        Magnifier magnifier = (Magnifier) this.b;
        return (magnifier.getWidth() << 32) | (magnifier.getHeight() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    public ArrayList H() {
        s6y s6yVar = (s6y) this.b;
        List list = s6yVar.k;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new l0j0((n6y) it.next(), s6yVar.o));
        }
        return arrayList;
    }

    @Override // defpackage.rdq0
    public void I(bgq0 bgq0Var) {
        odf0 odf0Var = (odf0) this.b;
        String str = bgq0Var.b;
        String str2 = bgq0Var.a;
        if (evu0.J(str2)) {
            str2 = str;
        }
        odf0Var.invoke(new nbj0(str, str2, ContactSelectionStrategy.FROM_PICKER));
    }

    public boolean J(CharSequence charSequence, Phonemetadata$PhoneNumberDesc phonemetadata$PhoneNumberDesc) {
        String a = phonemetadata$PhoneNumberDesc.a();
        if (a.length() != 0) {
            Matcher matcher = ((com.google.i18n.phonenumbers.internal.a) this.b).a(a).matcher(charSequence);
            return matcher.lookingAt() && matcher.matches();
        }
        return false;
    }

    public void K(String str, String str2) {
        ((njv) ((yiv) this.b)).getClass();
        xby.l(jst.e, g8e.o("InAppCalls.Sdk.Error.", str), null, null, str2, 6);
    }

    public void L(udj udjVar) {
        AlertDialog mainActionButton = new AlertDialog((Activity) ((da0) this.b).G).setTitle(udjVar.a).setMessage(udjVar.b).setMainActionButton(udjVar.d, udjVar.e, (String) null);
        String str = udjVar.c;
        if (str != null && !evu0.J(str)) {
            mainActionButton.setNegativeButton(str, udjVar.f);
        }
        mainActionButton.setDismissListener(udjVar.g).show();
    }

    @Override // defpackage.xcy
    public tc5 a() {
        return ((PreselectActivity) this.b).getActivityViewModel();
    }

    @Override // defpackage.xcy
    public Object b(Fragment fragment, Class cls) {
        return ((y8h) ((p7u) dpb1.c(fragment)).componentDispatcher()).b(xxk.class);
    }

    @Override // defpackage.ybi0
    public szd getConfig() {
        return (ug70) this.b;
    }

    @Override // defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        Object obj;
        switch (this.a) {
            case 3:
                oy80 oy80Var = (oy80) this.b;
                if (((aq80) oy80Var.c) != null) {
                    String str = x920Var.a;
                    obj = x920Var.b;
                    str.getClass();
                    switch (str) {
                        case "create":
                            Map map = (Map) obj;
                            try {
                                ((aq80) oy80Var.c).B(new yi6((String) map.get("viewType"), map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null, ((Integer) map.get("id")).intValue(), ((Integer) map.get("direction")).intValue()));
                                ((ba20) da20Var).success(null);
                                break;
                            } catch (IllegalStateException e) {
                                ((ba20) da20Var).error("error", Log.getStackTraceString(e), null);
                                return;
                            }
                        case "clearFocus":
                            int intValue = ((Integer) obj).intValue();
                            try {
                                qwc0 qwc0Var = (qwc0) ((dxc0) ((aq80) oy80Var.c).a).B.get(intValue);
                                if (qwc0Var == null) {
                                    nnm.q(intValue, "Clearing focus on an unknown view with id: ", "PlatformViewsController2");
                                } else {
                                    View view = qwc0Var.getView();
                                    if (view == null) {
                                        nnm.q(intValue, "Clearing focus on a null view with id: ", "PlatformViewsController2");
                                    } else {
                                        view.clearFocus();
                                    }
                                }
                                ((ba20) da20Var).success(null);
                                break;
                            } catch (IllegalStateException e2) {
                                ((ba20) da20Var).error("error", Log.getStackTraceString(e2), null);
                                return;
                            }
                        case "touch":
                            List list = (List) obj;
                            try {
                                ((aq80) oy80Var.c).D(new axc0(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                                ((ba20) da20Var).success(null);
                                break;
                            } catch (IllegalStateException e3) {
                                ((ba20) da20Var).error("error", Log.getStackTraceString(e3), null);
                                return;
                            }
                        case "setDirection":
                            Map map2 = (Map) obj;
                            int intValue2 = ((Integer) map2.get("id")).intValue();
                            int intValue3 = ((Integer) map2.get("direction")).intValue();
                            try {
                                qwc0 qwc0Var2 = (qwc0) ((dxc0) ((aq80) oy80Var.c).a).B.get(intValue2);
                                if (qwc0Var2 == null) {
                                    nnm.q(intValue2, "Setting direction to an unknown view with id: ", "PlatformViewsController2");
                                } else {
                                    View view2 = qwc0Var2.getView();
                                    if (view2 == null) {
                                        nnm.q(intValue2, "Setting direction to a null view with id: ", "PlatformViewsController2");
                                    } else {
                                        view2.setLayoutDirection(intValue3);
                                    }
                                }
                                ((ba20) da20Var).success(null);
                                break;
                            } catch (IllegalStateException e4) {
                                ((ba20) da20Var).error("error", Log.getStackTraceString(e4), null);
                                return;
                            }
                        case "isSurfaceControlEnabled":
                            FlutterJNI flutterJNI = ((dxc0) ((aq80) oy80Var.c).a).x;
                            ((ba20) da20Var).success(Boolean.valueOf(flutterJNI != null ? flutterJNI.IsSurfaceControlEnabled() : false));
                            break;
                        case "dispose":
                            try {
                                ((aq80) oy80Var.c).C(((Integer) ((Map) obj).get("id")).intValue());
                                ((ba20) da20Var).success(null);
                                break;
                            } catch (IllegalStateException e5) {
                                ((ba20) da20Var).error("error", Log.getStackTraceString(e5), null);
                                return;
                            }
                        default:
                            ((ba20) da20Var).notImplemented();
                            break;
                    }
                }
                break;
            default:
                bxj0 bxj0Var = (bxj0) this.b;
                String str2 = x920Var.a;
                Object obj2 = x920Var.b;
                str2.getClass();
                if (!str2.equals("get")) {
                    if (!str2.equals("put")) {
                        ((ba20) da20Var).notImplemented();
                        break;
                    } else {
                        bxj0Var.b = (byte[]) obj2;
                        ((ba20) da20Var).success(null);
                        break;
                    }
                } else {
                    bxj0Var.f = true;
                    if (!bxj0Var.e && bxj0Var.a) {
                        bxj0Var.d = (ba20) da20Var;
                        break;
                    } else {
                        ((ba20) da20Var).success(bxj0.a(bxj0Var.b));
                        break;
                    }
                }
        }
    }

    @Override // defpackage.xcy
    public void p(boolean z) {
    }

    @Override // defpackage.xcy
    public void t() {
        ((PreselectActivity) this.b).getBinding().f.setVisibility(8);
    }

    @Override // defpackage.cl90
    public void w() {
        c cVar = (c) this.b;
        el90 el90Var = cVar.L;
        Activity activity = cVar.F;
        el90Var.getClass();
        new PassengerRatingInfoDialog(activity, el90Var.c).show();
    }

    public rci0 z() {
        wxj d;
        kzo kzoVar = (kzo) this.b;
        coil.disk.a aVar = (coil.disk.a) kzoVar.x;
        synchronized (aVar) {
            kzoVar.o(true);
            d = aVar.d(((sxj) kzoVar.c).a);
        }
        if (d != null) {
            return new rci0(d);
        }
        return null;
    }

    public /* synthetic */ v5c0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ v5c0(aye0 aye0Var) {
        this.a = 20;
        this.b = (zzco) aye0Var.b;
    }

    public v5c0() {
        this.a = 23;
        this.b = new com.google.i18n.phonenumbers.internal.a();
    }

    public /* synthetic */ v5c0(int i) {
        this.a = i;
    }
}
