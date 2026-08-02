package defpackage;

import com.objsys.asn1j.runtime.Asn1GeneralizedTime;
import com.yandex.mapkit.road_events_layer.RoadEvent;
import com.yandex.plus.webview.api.contract.message.WebViewMessagesHandler;
import java.security.KeyManagementException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.ASN.CertificateExtensions.PrivateKeyUsagePeriod;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.eatskit.c;
import ru.yandex.taxi.eatskit.d;

/* loaded from: classes6.dex */
public abstract class xz4 implements eup0 {
    public Object a;
    public Object b;

    public xz4(int i, Object obj) {
        switch (i) {
            case 10:
                r0 c = bvf0.c(obj);
                this.a = c;
                this.b = e.d(c);
                break;
            default:
                this.a = obj;
                this.b = a.b(LazyThreadSafetyMode.NONE, new b7p0(1, this));
                break;
        }
    }

    @Override // defpackage.eup0
    public Object a() {
        return (zx01) this.b;
    }

    public void c(PrivateKeyUsagePeriod privateKeyUsagePeriod) {
        if (privateKeyUsagePeriod != null) {
            JCPLogger.fine("Private key usage period extension found in the " + d() + Extension.DOT_CHAR);
            Asn1GeneralizedTime asn1GeneralizedTime = privateKeyUsagePeriod.notBefore;
            if (asn1GeneralizedTime != null) {
                try {
                    this.a = asn1GeneralizedTime.getTime().getTime();
                } catch (Exception e) {
                    throw new KeyManagementException("Invalid notBefore date format in the " + d() + "'s private key usage period extension.", e);
                }
            }
            Asn1GeneralizedTime asn1GeneralizedTime2 = privateKeyUsagePeriod.notAfter;
            if (asn1GeneralizedTime2 != null) {
                try {
                    this.b = asn1GeneralizedTime2.getTime().getTime();
                } catch (Exception e2) {
                    throw new KeyManagementException("Invalid notAfter date format in the " + d() + "'s private key usage period extension.", e2);
                }
            }
            if (((Date) this.b) == null) {
                if (((Date) this.a) == null) {
                    throw new KeyManagementException("Invalid before_time and after_time in the " + d() + "'s private key usage period extension.");
                }
                JCPLogger.fine("after_time will be = (before_time + 15 months).");
                Calendar calendar = Calendar.getInstance();
                calendar.setTime((Date) this.a);
                calendar.add(2, 15);
                this.b = calendar.getTime();
            }
        }
    }

    public abstract String d();

    public WebViewMessagesHandler e() {
        return new WebViewMessagesHandler(new a201(pw80.Companion.serializer(), (sbx) ((i3y) this.b).getValue()), (jse) this.a);
    }

    public com.yandex.plus.webview.api.contract.message.a f() {
        return new com.yandex.plus.webview.api.contract.message.a(new a441(gov.Companion.serializer(), (sbx) ((i3y) this.b).getValue()), (jse) this.a);
    }

    public void g(String str, Object... objArr) {
        cen cenVar = (cen) this.a;
        String str2 = (String) this.b;
        List d0 = j73.d0(objArr);
        switch (cenVar.a) {
            case 0:
                ((c) cenVar.b).d(str, str2, d0);
                break;
            default:
                ((d) cenVar.b).d(str, str2, d0);
                break;
        }
    }

    public Object h() {
        return ((gci0) this.b).a.getValue();
    }

    public svp0 i() {
        return (svp0) ((i3y) this.b).getValue();
    }

    public abstract svp0 j(Object obj);

    public void k(tls tlsVar, String str) {
        i d = ((j) ((lx4) this.a)).d(str);
        tlsVar.invoke(d);
        d.d("source", ((wbc0) this.b).a().a());
        d.m();
    }

    public void l(Object obj) {
        ((r0) this.a).l(obj);
    }

    public void onRoadEventPlacemarkTap(RoadEvent roadEvent) {
        l(roadEvent);
    }

    public /* synthetic */ xz4(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public xz4(jse jseVar) {
        this.a = jseVar;
        this.b = a.a(new tt4(17));
    }

    public xz4(zx01 zx01Var) {
        this.a = zx01Var;
        this.b = zx01Var;
    }
}
