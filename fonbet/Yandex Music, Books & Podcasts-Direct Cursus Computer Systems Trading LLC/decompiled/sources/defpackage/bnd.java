package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.DeviceService;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.yandex.payment.sdk.ui.bind.BindGooglePayActivity;
import com.yandex.plus.paymentsdk.internal.method.card.a;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.common.media.context.h;

/* loaded from: classes5.dex */
public final class bnd implements i6s, zur, x7o, m1t, re6, gs3, lci, rct, wpd, l0c {
    public static final d3d c = new d3d(1);
    public static final ujl d = new ujl();
    public final /* synthetic */ int a;
    public Object b;

    public bnd(int i) {
        rzh rzhVar;
        this.a = i;
        switch (i) {
            case 7:
                this.b = new AtomicReference(null);
                break;
            case 11:
                char[] cArr = xut.a;
                this.b = new ArrayDeque(0);
                break;
            case 21:
                this.b = new d51(19);
                break;
            case 23:
                this.b = new LinkedHashMap();
                break;
            default:
                yym yymVar = yym.c;
                try {
                    rzhVar = (rzh) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    rzhVar = c;
                }
                rzh[] rzhVarArr = {d3d.b, rzhVar};
                x8h x8hVar = new x8h();
                x8hVar.a = rzhVarArr;
                Charset charset = use.a;
                this.b = x8hVar;
                break;
        }
    }

    @Override // defpackage.m1t
    public boolean C(mqs mqsVar, int i) {
        mqsVar.getClass();
        ((znk) this.b).getClass();
        mqsVar.getClass();
        return false;
    }

    @Override // defpackage.wpd
    public void D(Object obj) {
        cvl cvlVar = (cvl) obj;
        cvlVar.getClass();
        efa efaVar = ((rfa) this.b).b;
        efaVar.getClass();
        lwg G = g0g.G(cvlVar);
        y supportFragmentManager = efaVar.a.getSupportFragmentManager();
        szf.R(supportFragmentManager, vz1.f(supportFragmentManager, G), d.l());
    }

    @Override // defpackage.m1t
    public sbb E(uu5 uu5Var) {
        return ((znk) this.b).E(uu5Var);
    }

    @Override // defpackage.l0c
    public int F() {
        return ((ExtendedFloatingActionButton) this.b).getCollapsedPadding();
    }

    @Override // defpackage.rct
    public void H(qas qasVar) {
        ((se9) this.b).f(new sz9(qasVar));
    }

    @Override // defpackage.wpd
    public void J(Object obj) {
        cvl cvlVar = (cvl) obj;
        cvlVar.getClass();
        efa efaVar = ((rfa) this.b).b;
        efaVar.getClass();
        t tVar = efaVar.a;
        h l = d.l();
        int i = PlaylistScreenActivity.B0;
        tVar.startActivity(dxl.f(tVar, cvlVar, false, null, mxl.a, l));
    }

    @Override // defpackage.l0c
    public int a() {
        return ((ExtendedFloatingActionButton) this.b).getCollapsedSize();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String b(dsc dscVar) {
        String str;
        String o;
        String str2 = dscVar.d;
        String str3 = dscVar.b;
        if (!TextUtils.isEmpty(str2) && !"und".equals(str2)) {
            Locale forLanguageTag = Locale.forLanguageTag(str2);
            Locale locale = dvt.a >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
            str = forLanguageTag.getDisplayName(locale);
            if (!TextUtils.isEmpty(str)) {
                try {
                    int offsetByCodePoints = str.offsetByCodePoints(0, 1);
                    str = str.substring(0, offsetByCodePoints).toUpperCase(locale) + str.substring(offsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
                o = o(str, e(dscVar));
                if (TextUtils.isEmpty(o)) {
                    return o;
                }
                if (TextUtils.isEmpty(str3)) {
                    str3 = "";
                }
                return str3;
            }
        }
        str = "";
        o = o(str, e(dscVar));
        if (TextUtils.isEmpty(o)) {
        }
    }

    @Override // defpackage.l0c
    public int c() {
        return ((ExtendedFloatingActionButton) this.b).getCollapsedSize();
    }

    @Override // defpackage.rct
    public void d(Object obj) {
        Long l = (Long) obj;
        if (l != null) {
            ((se9) this.b).g(l.longValue());
        }
    }

    public String e(dsc dscVar) {
        Resources resources = (Resources) this.b;
        int i = dscVar.f;
        String string = (i & 2) != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i & 4) != 0) {
            string = o(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i & 8) != 0) {
            string = o(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i & 1088) != 0 ? o(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    @Override // defpackage.m1t
    public sbb g(int i, uu5 uu5Var) {
        ((znk) this.b).getClass();
        return null;
    }

    @Override // defpackage.m1t
    public boolean h() {
        return ((znk) this.b).h();
    }

    @Override // defpackage.l0c
    public int i() {
        return ((ExtendedFloatingActionButton) this.b).getCollapsedPadding();
    }

    @Override // defpackage.i6s
    public void j(Drawable drawable) {
        fs1 fs1Var = (fs1) this.b;
        fs1Var.m(new zr1(drawable != null ? fs1Var.l(drawable) : null));
    }

    public void k(byte b) {
        ((Parcel) this.b).writeByte(b);
    }

    public void l(float f) {
        ((Parcel) this.b).writeFloat(f);
    }

    @Override // defpackage.re6
    public void m(we6 we6Var) {
        ((zn4) this.b).i.f(vut.T(we6Var));
    }

    public void n(long j) {
        long b = kes.b(j);
        byte b2 = 0;
        if (!les.a(b, 0L)) {
            if (les.a(b, 4294967296L)) {
                b2 = 1;
            } else if (les.a(b, 8589934592L)) {
                b2 = 2;
            }
        }
        k(b2);
        if (les.a(kes.b(j), 0L)) {
            return;
        }
        l(kes.c(j));
    }

    public String o(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                str = TextUtils.isEmpty(str) ? str2 : ((Resources) this.b).getString(R.string.exo_item_list, str, str2);
            }
        }
        return str;
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 10:
                jnd jndVar = (jnd) obj;
                jndVar.getClass();
                Object obj2 = kib.a;
                BindGooglePayActivity bindGooglePayActivity = (BindGooglePayActivity) this.b;
                a a = kib.a(bindGooglePayActivity.l().b());
                if (a != null) {
                    a.a(imp.h);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r1f r1fVar = r1f.a;
                vtm k = su4.k("Получен GooglePay токен", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
                ci0 ci0Var = qjb.a;
                ci0Var.a = su4.g(1, ci0Var.a);
                k.u(qee.n() + ci0Var.a, "eventus_id");
                bindGooglePayActivity.u(su4.j(k, "event_name", "google_pay_token_received", "google_pay_token_received", k));
                bindGooglePayActivity.x(jndVar);
                bindGooglePayActivity.k();
                break;
            case 19:
                ((ggk) obj).getClass();
                sbp sbpVar = (sbp) this.b;
                sbpVar.t();
                sbpVar.L(R.string.paymentsdk_success_title);
                break;
            default:
                en enVar = (en) obj;
                enVar.getClass();
                e57.H((e57) this.b, enVar);
                break;
        }
    }

    public void r(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((ju2) this.b).a(0);
    }

    @Override // defpackage.gs3
    public Type s() {
        return (Type) this.b;
    }

    public synchronized void t(xcd xcdVar) {
        xcdVar.b = null;
        xcdVar.c = null;
        ((ArrayDeque) this.b).offer(xcdVar);
    }

    @Override // defpackage.m1t
    public Object v(mqs mqsVar, Continuation continuation) {
        return Boolean.FALSE;
    }

    @Override // defpackage.l0c
    public ViewGroup.LayoutParams w() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.b;
        return new ViewGroup.LayoutParams(extendedFloatingActionButton.getCollapsedSize(), extendedFloatingActionButton.getCollapsedSize());
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        yop yopVar;
        mgk H;
        switch (this.a) {
            case 10:
                bfk bfkVar = (bfk) obj;
                bfkVar.getClass();
                Object obj2 = kib.a;
                BindGooglePayActivity bindGooglePayActivity = (BindGooglePayActivity) this.b;
                a a = kib.a(bindGooglePayActivity.l().b());
                if (a != null) {
                    a.a(new qek(bfkVar));
                }
                String bfkVar2 = bfkVar.toString();
                String concat = "Не удалось получить GooglePay токен, ошибка: ".concat(bfkVar2);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r1f r1fVar = r1f.a;
                linkedHashMap.put("reason", new jkr(bfkVar2));
                linkedHashMap.put(DeviceService.KEY_DESC, new jkr(concat));
                vtm vtmVar = new vtm((Map) linkedHashMap);
                ci0 ci0Var = qjb.a;
                ci0Var.a = su4.g(1, ci0Var.a);
                vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
                bindGooglePayActivity.u(su4.j(vtmVar, "event_name", "google_pay_token_failed", "google_pay_token_failed", vtmVar));
                bindGooglePayActivity.w(bfkVar);
                bindGooglePayActivity.k();
                break;
            case 19:
                bfk bfkVar3 = (bfk) obj;
                bfkVar3.getClass();
                sbp sbpVar = (sbp) this.b;
                sbpVar.t();
                sbpVar.B(bfkVar3);
                break;
            default:
                bfk bfkVar4 = (bfk) obj;
                bfkVar4.getClass();
                yek yekVar = bfkVar4.f;
                yek yekVar2 = yek.f;
                e57 e57Var = (e57) this.b;
                if (yekVar != yekVar2) {
                    xdr xdrVar = e57Var.F;
                    tcp tcpVar = new tcp(bfkVar4);
                    xdrVar.getClass();
                    xdrVar.m(null, tcpVar);
                    break;
                } else {
                    g0c g0cVar = e57Var.l;
                    qne i0 = gut.i0();
                    x60 x60Var = (x60) g0cVar;
                    x60Var.getClass();
                    x60Var.a(i0);
                    sdk sdkVar = e57Var.o;
                    tdk tdkVar = sdkVar instanceof tdk ? (tdk) sdkVar : null;
                    if (tdkVar != null) {
                        rdk rdkVar = tdkVar.g;
                        if (rdkVar == null || (H = rdkVar.H()) == null) {
                            yopVar = null;
                        } else {
                            ogk ogkVar = H.a;
                            j03 j03Var = ogkVar.a;
                            yopVar = mif.a(j03Var.c, new xz2(j03Var, ogkVar.f, ogkVar.e, true), null, 5);
                            ogkVar.g = yopVar;
                        }
                        if (yopVar != null) {
                            mif.b(mif.b(yopVar, new o47(e57Var, 0), null, 5), lhb.x0, new sv4(9, e57Var, bfkVar4), 1);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        return new dm3(1, (d51) this.b);
    }

    @Override // defpackage.gs3
    public Object z(foj fojVar) {
        hm5 hm5Var = new hm5(fojVar);
        fojVar.D(new sld(19, hm5Var));
        return hm5Var;
    }

    @Override // defpackage.i6s
    public void f(Drawable drawable) {
    }

    @Override // defpackage.i6s
    public void p(Drawable drawable) {
    }

    public /* synthetic */ bnd(int i, boolean z) {
        this.a = i;
    }

    public bnd(Context context) {
        this.a = 0;
        context.getClass();
        this.b = new lmx(this);
        context.getApplicationContext();
    }

    public bnd(Resources resources) {
        this.a = 24;
        resources.getClass();
        this.b = resources;
    }

    public bnd(f7l f7lVar) {
        this.a = 13;
        f7lVar.getClass();
        this.b = new znk(f7lVar);
    }

    public bnd(jfu jfuVar, gfu gfuVar, is6 is6Var) {
        this.a = 2;
        jfuVar.getClass();
        gfuVar.getClass();
        is6Var.getClass();
        this.b = new bjt(jfuVar, gfuVar, is6Var);
    }

    public /* synthetic */ bnd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public bnd(qnq qnqVar, int i) {
        this.a = i;
        switch (i) {
            case 5:
                qnqVar.getClass();
                this.b = qnqVar;
                break;
            default:
                this.b = qnqVar.b;
                break;
        }
    }
}
