package defpackage;

import android.content.Context;
import android.net.Uri;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.pulse.metrics.o;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class x6s implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ x6s(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((k5m) l18.b.c(hag.I(k5m.class))).a();
            case 1:
                l18 l18Var = l18.b;
                bdt I = hag.I(Context.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                InputStream openRawResource = ((Context) qdcVar.C(I)).getResources().openRawResource(R.raw.tariff_paywall_default);
                openRawResource.getClass();
                return t7g.F(new BufferedReader(new InputStreamReader(openRawResource, Charsets.UTF_8), RemoteCameraConfig.Notification.ID));
            case 2:
                return kz2.c();
            case 3:
                jyr jyrVar = tes.e;
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(byb.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                return Boolean.valueOf(((tes) ((byb) qdcVar2.C(I2)).c(ern.a(tes.class))).h());
            case 4:
                return szf.g0(null);
            case 5:
                return DesugarTimeZone.getTimeZone("UTC");
            case 6:
                gbk[] gbkVarArr = gbk.a;
                return new bgs("yyyy-MM-dd'T'HH:mm:ssZZZZZ", null, 6);
            case 7:
                gbk[] gbkVarArr2 = gbk.a;
                return new bgs("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", null, 6);
            case 8:
                gbk[] gbkVarArr3 = gbk.a;
                return new bgs("yyyy-MM-dd", null, 6);
            case 9:
                return DesugarTimeZone.getTimeZone("UTC");
            case 10:
                return new wbb();
            case 11:
                return new yab();
            case 12:
                return new p0t();
            case 13:
                rdb rdbVar = css.l;
                ArrayList arrayList = new ArrayList();
                Iterator it = rdbVar.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((css) next).b()) {
                        arrayList.add(next);
                    }
                }
                return CollectionsKt.A0(arrayList);
            case 14:
                return Uri.EMPTY;
            case 15:
                return new gpj();
            case 16:
                return "TrackRotorApi";
            case 17:
                wqr n = a4g.n();
                dq7 dq7Var = ca8.a;
                return gld.e(e.c(n, mn7.d));
            case 18:
                return qld.m();
            case 19:
                return Unit.a;
            case 20:
                i5l i5lVar = l5t.a;
                return "developer error. tack navigation button should never appear";
            case 21:
                return Unit.a;
            case 22:
                return t8t.Companion.serializer();
            case 23:
                return v8t.Companion.serializer();
            case 24:
                return up6.q("flex.parser.transition.TransitionSettingsParser.TransitionSettingsSurrogate.Option.Interpolator", t8t.values(), new String[]{"linear", "easeIn", "easeOut", "easeInOut"}, new Annotation[][]{null, null, null, null});
            case 25:
                return up6.q("flex.parser.transition.TransitionSettingsParser.TransitionSettingsSurrogate.Option.Transition", v8t.values(), new String[]{"crossDissolve"}, new Annotation[][]{null});
            case 26:
                return Boolean.TRUE;
            case 27:
                try {
                    return CertificateFactory.getInstance("X.509");
                } catch (CertificateException unused) {
                    return null;
                }
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                float f = kct.a;
                return Float.valueOf(0.0f);
            default:
                float f2 = kct.a;
                return Float.valueOf(1.0f);
        }
    }
}
