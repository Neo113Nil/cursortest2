package defpackage;

import android.graphics.RectF;
import android.media.CamcorderProfile;
import androidx.compose.ui.unit.LayoutDirection;
import com.adjust.sdk.Constants;
import com.yandex.go.yb.domain.c;
import com.yandex.payment.sdk.core.data.BoundCard;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.datasource.bind.a;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.network.retryPolicy.RetryTimeoutException;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.ErrorView$State$PrimaryButtonGravity;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Result;
import ru.yandex.taxi.am.e;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.am.j;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes8.dex */
public final class r501 implements s501, u031, ww01, vyn, t8m, h43, k43, ryj0, am7, or8, tbu, z4c, sko, ofs, w7p, g8p, pdr {
    public static final r501 b = new r501(0);
    public static final r501 c = new r501(1);
    public static final /* synthetic */ r501 w = new r501(4);
    public final /* synthetic */ int a;

    public r501(x22 x22Var) {
        this.a = 28;
    }

    public static kao a(Throwable th, Text text, Text text2, Text text3, Text text4, ErrorView$State$PrimaryButtonGravity errorView$State$PrimaryButtonGravity, ColorModel colorModel, ColorModel colorModel2, ColorModel colorModel3, ColorModel colorModel4, rbv rbvVar, Text text5, String str, int i) {
        String str2;
        String supportUrl;
        Throwable th2 = (i & 1) != 0 ? null : th;
        Text text6 = (i & 4) != 0 ? null : text;
        Text text7 = (i & 8) != 0 ? null : text2;
        Text text8 = (i & 16) != 0 ? null : text3;
        Text text9 = (i & 32) != 0 ? null : text4;
        ErrorView$State$PrimaryButtonGravity errorView$State$PrimaryButtonGravity2 = (i & 64) != 0 ? ErrorView$State$PrimaryButtonGravity.BOTTOM : errorView$State$PrimaryButtonGravity;
        ColorModel colorModel5 = (i & 128) != 0 ? null : colorModel;
        ColorModel colorModel6 = (i & 256) != 0 ? null : colorModel2;
        ColorModel colorModel7 = (i & 512) != 0 ? null : colorModel3;
        ColorModel colorModel8 = (i & 1024) != 0 ? null : colorModel4;
        rbv rbvVar2 = (i & 2048) != 0 ? null : rbvVar;
        Text text10 = (i & 4096) != 0 ? null : text5;
        boolean z = (i & 8192) == 0;
        boolean z2 = (i & 16384) == 0;
        String str3 = (i & 32768) != 0 ? null : str;
        Text.Resource resource = gao.a;
        mzz0 mzz0Var = th2 instanceof mzz0 ? (mzz0) th2 : null;
        if (mzz0Var == null || (str2 = mzz0Var.getTraceId()) == null) {
            str2 = null;
        }
        Text f = gao.f(th2, text6);
        Text b2 = gao.b(th2, text7);
        Text.Resource resource2 = gao.c;
        boolean z3 = th2 instanceof IOException;
        if (z3 || (th2 instanceof RetryTimeoutException.Network)) {
            text8 = gao.f;
        } else if (!(th2 instanceof FailDataException) ? text8 == null : text8 == null) {
            text8 = resource2;
        }
        boolean z4 = th2 instanceof FailDataException;
        if (z4 && (supportUrl = ((FailDataException) th2).getSupportUrl()) != null && supportUrl.length() != 0) {
            text9 = gao.n;
        }
        Text text11 = text9;
        if (z3 || (th2 instanceof RetryTimeoutException.Network)) {
            rbvVar2 = new nbv(sxg0.ybsdk_ic_network_error_screen, null);
        } else if (z4) {
            wx21 icon = ((FailDataException) th2).getIcon();
            if (icon == null || (rbvVar2 = fob1.c((String) icon.b, (String) icon.a, new l0o(5))) == null) {
                rbvVar2 = new nbv(sxg0.ybsdk_ic_common_error_screen, null);
            }
        } else if (rbvVar2 == null) {
            rbvVar2 = new nbv(sxg0.ybsdk_ic_common_error_screen, null);
        }
        return new kao(th2, str2, f, b2, text8, text11, errorView$State$PrimaryButtonGravity2, colorModel5, colorModel6, colorModel7, colorModel8, rbvVar2, text10, z, z2, str3);
    }

    public static znh l() {
        return new znh();
    }

    public static String n(StringBuilder sb) {
        int length = sb.length();
        if (length == 0) {
            ny61.r("StringBuilder must not be empty");
            return null;
        }
        int charAt = (sb.charAt(0) << 18) + ((length >= 2 ? sb.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? sb.charAt(2) : (char) 0) << 6) + (length >= 4 ? sb.charAt(3) : (char) 0);
        char c2 = (char) ((charAt >> 16) & 255);
        char c3 = (char) ((charAt >> 8) & 255);
        char c4 = (char) (charAt & 255);
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c2);
        if (length >= 2) {
            sb2.append(c3);
        }
        if (length >= 3) {
            sb2.append(c4);
        }
        return sb2.toString();
    }

    public static c o(jj3 jj3Var, e eVar, g gVar, j jVar) {
        return new c(jj3Var, eVar, gVar, jVar);
    }

    public static svj p(svj svjVar, String str) {
        return str == null ? svjVar : str.equals("places_feed") ? xuj.b : str.equals(TariffOrderFlow.ORDER_FLOW_TAXI_KEY) ? qvj.b : str.equals("advert") ? cuj.b : str.equals("poi_order_feed") ? bvj.b : str.equals("poi_order_detail") ? avj.b : str.equals("poi_transport_main") ? cvj.b : str.equals("poi_transport_summary") ? dvj.b : str.equals("navigator") ? suj.b : str.equals("poi_navigator") ? uuj.b : str.equals("navigator_suggest") ? vuj.b : str.equals("navigator_gas_stations") ? tuj.b : str.equals("shortcut") ? gvj.b : str.equals(Constants.DEEPLINK) ? fuj.b : str.equals("discovery") ? kuj.b : str.equals("main_places_search_pin") ? ruj.b : str.equals("main_places_search_list") ? puj.b : str.equals("main_places_search_org") ? quj.b : str.equals("main_places_map_pin") ? ouj.b : str.equals("main_places_map_list") ? nuj.b : str.equals("main_places_map_discovery") ? muj.b : str.equals("delivery_search") ? juj.b : str.equals("delivery_places_map_pin") ? iuj.b : str.equals("delivery_places_map_list") ? huj.b : str.equals("ConfirmCard") ? duj.b : str.equals("Push") ? evj.b : str.equals("Tracker") ? rvj.b : str.equals("OrderHistory") ? wuj.b : str.equals("search_look_all_places_map_list") ? kvj.b : str.equals("search_look_all_places_map_pin") ? lvj.b : str.equals("search_chain_places_map_list") ? ivj.b : str.equals("search_chain_places_map_pin") ? jvj.b : str.equals("search_rubric_places_map_list") ? mvj.b : str.equals("search_rubric_places_map_pin") ? nvj.b : str.equals("search_shaiba_places_map_list") ? ovj.b : str.equals("search_shaiba_places_map_pin") ? pvj.b : new euj(str);
    }

    @Override // defpackage.ww01, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public Object mo489apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.h43, defpackage.k43
    public float b() {
        return 0.0f;
    }

    @Override // defpackage.z4c
    public void c(String str) {
    }

    @Override // defpackage.z4c
    public void close() {
    }

    @Override // defpackage.w7p
    public Object create() {
        return new ArrayList();
    }

    @Override // defpackage.pdr
    public rdr d(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float d = ry01.d(f5, f7, f2, f3, f, true);
        float f8 = d / f5;
        float f9 = d / f7;
        return new rdr(f8, f9, f4 * f8, d, f6 * f9, d);
    }

    @Override // defpackage.z4c
    public void e() {
    }

    @Override // defpackage.g8p
    public i8p f(float f, float f2, float f3) {
        float b2 = g8e.b(f3, f2, 0.35f, f2);
        return new i8p(sy01.e(f2, b2, f, 255, 0), sy01.e(b2, f3, f, 0, 255), false);
    }

    @Override // defpackage.am7
    public CamcorderProfile g(int i, int i2) {
        return CamcorderProfile.get(i, i2);
    }

    @Override // defpackage.tbu
    public String getServiceName() {
        return "chargers";
    }

    @Override // defpackage.pdr
    public boolean h(rdr rdrVar) {
        return rdrVar.c > rdrVar.e;
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        a.k.g(new Result(new Result.Failure((PaymentKitError) obj)));
    }

    @Override // defpackage.am7
    public boolean j(int i, int i2) {
        return CamcorderProfile.hasProfile(i, i2);
    }

    @Override // defpackage.or8
    public void k(ye0 ye0Var) {
    }

    @Override // defpackage.k43
    public void m(fwi fwiVar, int i, int[] iArr, int[] iArr2) {
        lr20.e(i, iArr, iArr2, false);
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        a.k.g(new Result((BoundCard) obj));
    }

    @Override // defpackage.pdr
    public void r(RectF rectF, float f, rdr rdrVar) {
        float abs = (Math.abs(rdrVar.e - rdrVar.c) / 2.0f) * f;
        rectF.left += abs;
        rectF.right -= abs;
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return "Arrangement#SpaceEvenly";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.h43
    public void u(fwi fwiVar, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        if (layoutDirection == LayoutDirection.Ltr) {
            lr20.e(i, iArr, iArr2, false);
        } else {
            lr20.e(i, iArr, iArr2, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
    
        if (r9 <= 2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0058, code lost:
    
        defpackage.l1b1.c(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x005b, code lost:
    
        throw null;
     */
    @Override // defpackage.vyn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v(azn aznVar) {
        boolean z = true;
        switch (this.a) {
            case 5:
                String str = aznVar.a;
                int i = aznVar.d;
                int length = str.length();
                int i2 = i;
                while (i2 < length && l1b1.d(str.charAt(i2))) {
                    i2++;
                }
                if (i2 - i >= 2) {
                    char charAt = str.charAt(aznVar.d);
                    char charAt2 = str.charAt(aznVar.d + 1);
                    if (l1b1.d(charAt) && l1b1.d(charAt2)) {
                        aznVar.d((char) ((charAt2 - '0') + ((charAt - '0') * 10) + 130));
                        aznVar.d += 2;
                        return;
                    } else {
                        throw new IllegalArgumentException("not digits: " + charAt + charAt2);
                    }
                }
                char a = aznVar.a();
                int k = l1b1.k(aznVar.d, 0, str);
                if (k == 0) {
                    if (!l1b1.e(a)) {
                        aznVar.d((char) (a + 1));
                        aznVar.d++;
                        return;
                    } else {
                        aznVar.d((char) 235);
                        aznVar.d((char) (a - 127));
                        aznVar.d++;
                        return;
                    }
                }
                if (k == 1) {
                    aznVar.d((char) 230);
                    aznVar.e = 1;
                    return;
                }
                if (k == 2) {
                    aznVar.d((char) 239);
                    aznVar.e = 2;
                    return;
                }
                if (k == 3) {
                    aznVar.d((char) 238);
                    aznVar.e = 3;
                    return;
                } else if (k == 4) {
                    aznVar.d((char) 240);
                    aznVar.e = 4;
                    return;
                } else if (k != 5) {
                    ny61.r(oyr.i(k, "Illegal mode: "));
                    return;
                } else {
                    aznVar.d((char) 231);
                    aznVar.e = 5;
                    return;
                }
            default:
                String str2 = aznVar.a;
                StringBuilder sb = aznVar.c;
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    if (aznVar.b()) {
                        char a2 = aznVar.a();
                        if (a2 >= ' ' && a2 <= '?') {
                            sb2.append(a2);
                        } else if (a2 >= '@' && a2 <= '^') {
                            sb2.append((char) (a2 - '@'));
                        }
                        aznVar.d++;
                        if (sb2.length() >= 4) {
                            sb.append(n(sb2));
                            sb2.delete(0, 4);
                            if (l1b1.k(aznVar.d, 4, str2) != 4) {
                                aznVar.e = 0;
                            }
                        }
                    }
                }
                sb2.append((char) 31);
                try {
                    int length2 = sb2.length();
                    if (length2 == 0) {
                        return;
                    }
                    if (length2 == 1) {
                        aznVar.c(sb.length());
                        int length3 = aznVar.f.b - sb.length();
                        int length4 = (str2.length() - aznVar.g) - aznVar.d;
                        if (length4 > length3) {
                            aznVar.c(sb.length() + 1);
                            length3 = aznVar.f.b - sb.length();
                        }
                        if (length4 <= length3) {
                        }
                    }
                    if (length2 > 4) {
                        throw new IllegalStateException("Count must not exceed 4");
                    }
                    int i3 = length2 - 1;
                    String n = n(sb2);
                    if (aznVar.b() || i3 > 2) {
                        z = false;
                    }
                    if (i3 <= 2) {
                        aznVar.c(sb.length() + i3);
                        if (aznVar.f.b - sb.length() >= 3) {
                            aznVar.c(sb.length() + n.length());
                            z = false;
                        }
                    }
                    if (z) {
                        aznVar.f = null;
                        aznVar.d -= i3;
                    } else {
                        sb.append(n);
                    }
                    return;
                } finally {
                    aznVar.e = 0;
                }
        }
    }

    public /* synthetic */ r501(int i, Object obj, Object obj2) {
        this.a = i;
    }

    public /* synthetic */ r501(int i) {
        this.a = i;
    }
}
