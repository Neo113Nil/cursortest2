package defpackage;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.Constants;
import com.adjust.sdk.OnAttributionChangedListener;
import com.apollographql.apollo3.exception.JsonDataException;
import com.google.android.gms.tasks.Task;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.locationinternal.impl.A2;
import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.model.PushNotification;
import io.appmetrica.analytics.push.notification.ExtraBundleProvider;
import io.appmetrica.analytics.push.notification.NotificationValueProvider;
import java.io.EOFException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import ru.yandex.taxi.analytics.c;
import ru.yandex.taxi.analytics.f;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes.dex */
public final /* synthetic */ class xfo implements FunctionWithThrowable, OnAttributionChangedListener, wx60, f2f0, rix, NotificationValueProvider, ExtraBundleProvider, pb7 {
    public static final xfo b = new xfo(0);
    public final /* synthetic */ int a;

    public /* synthetic */ xfo(int i) {
        this.a = i;
    }

    public static /* synthetic */ void c(int i, int i2) {
        throw new EOFException("DEF length " + i + ((Object) " object truncated by ") + i2);
    }

    public static /* synthetic */ void d(int i, int i2, Object obj, String str) {
        throw new IOException(str + i + obj + i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(int i, Object obj, Object obj2, Object obj3, String str) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static /* synthetic */ void f(Fragment fragment, String str) {
        throw new IllegalStateException(str + ((Object) fragment.toString()) + ((Object) " is already attached to a FragmentManager."));
    }

    public static /* synthetic */ void g(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void h(String str) {
        throw new ClassCastException(str);
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2) {
        throw new JsonDataException(str + obj + ((Object) " at path ") + obj2);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3) {
        throw new SerializationException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void k(StringBuilder sb, int i) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void l(Throwable th) {
        throw new IllegalArgumentException("encoding error in getInstance: " + ((Object) th.toString()));
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    @Override // defpackage.rix
    public lhx a(yuf0 yuf0Var) {
        int i = 8;
        switch (this.a) {
            case 12:
                if (!((String) yuf0Var.a).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    ny61.g("Wrong type URL in call to AesCmacParameters.parseParameters");
                    return null;
                }
                try {
                    ef1 E = ef1.E((ByteString) yuf0Var.c, oyo.b());
                    if (E.C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    mrj mrjVar = new mrj();
                    mrjVar.z(E.A().size());
                    mrjVar.F(E.B().z());
                    mrjVar.G(sf1.a((OutputPrefixType) yuf0Var.e));
                    nf1 b2 = mrjVar.b();
                    mrj mrjVar2 = new mrj(i);
                    mrjVar2.B(b2);
                    mrjVar2.w(new va90(u77.a(E.A().j())));
                    mrjVar2.x((Integer) yuf0Var.f);
                    return mrjVar2.a();
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
                    kbs.v("Parsing AesCmacKey failed");
                    return null;
                }
            case 13:
                if (!((String) yuf0Var.a).equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    ny61.g("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                    return null;
                }
                try {
                    vf1 E2 = vf1.E((ByteString) yuf0Var.c, oyo.b());
                    if (E2.C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    bc bcVar = new bc();
                    bcVar.j(E2.A().B().size());
                    bcVar.l(E2.B().B().size());
                    bcVar.m(E2.B().C().B());
                    bcVar.k(eg1.a(E2.B().C().A()));
                    bcVar.o(eg1.b((OutputPrefixType) yuf0Var.e));
                    cg1 a = bcVar.a();
                    m2v m2vVar = new m2v(12);
                    m2vVar.H(a);
                    m2vVar.B(new va90(u77.a(E2.A().B().j())));
                    m2vVar.C(new va90(u77.a(E2.B().B().j())));
                    m2vVar.D((Integer) yuf0Var.f);
                    return m2vVar.c();
                } catch (InvalidProtocolBufferException unused2) {
                    kbs.v("Parsing AesCtrHmacAeadKey failed");
                    return null;
                }
            case 14:
                if (!((String) yuf0Var.a).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    ny61.g("Wrong type URL in call to AesEaxParameters.parseParameters");
                    return null;
                }
                try {
                    wg1 E3 = wg1.E((ByteString) yuf0Var.c, oyo.b());
                    if (E3.C() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    m2v m2vVar2 = new m2v(13);
                    m2vVar2.F(E3.A().size());
                    m2vVar2.E(E3.B().z());
                    m2vVar2.I();
                    m2vVar2.J(gh1.a((OutputPrefixType) yuf0Var.e));
                    bh1 d = m2vVar2.d();
                    mrj mrjVar3 = new mrj(10);
                    mrjVar3.C(d);
                    mrjVar3.y(new va90(u77.a(E3.A().j())));
                    mrjVar3.x((Integer) yuf0Var.f);
                    return mrjVar3.c();
                } catch (InvalidProtocolBufferException unused3) {
                    kbs.v("Parsing AesEaxcKey failed");
                    return null;
                }
            case 15:
                if (!((String) yuf0Var.a).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    ny61.g("Wrong type URL in call to AesGcmParameters.parseParameters");
                    return null;
                }
                try {
                    kh1 C = kh1.C((ByteString) yuf0Var.c, oyo.b());
                    if (C.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    int size = C.z().size();
                    if (size != 16 && size != 24 && size != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
                    }
                    qh1 qh1Var = new qh1(size, 12, 16, sh1.a((OutputPrefixType) yuf0Var.e));
                    nfh nfhVar = new nfh();
                    nfhVar.b = null;
                    nfhVar.c = null;
                    nfhVar.a = qh1Var;
                    nfhVar.b = new va90(u77.a(C.z().j()));
                    nfhVar.c = (Integer) yuf0Var.f;
                    return nfhVar.g();
                } catch (InvalidProtocolBufferException unused4) {
                    kbs.v("Parsing AesGcmKey failed");
                    return null;
                }
            case 16:
                if (!((String) yuf0Var.a).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    ny61.g("Wrong type URL in call to AesGcmSivParameters.parseParameters");
                    return null;
                }
                try {
                    wh1 C2 = wh1.C((ByteString) yuf0Var.c, oyo.b());
                    if (C2.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ymu ymuVar = new ymu(8);
                    ymuVar.D(C2.z().size());
                    ymuVar.I(di1.a((OutputPrefixType) yuf0Var.e));
                    bi1 j = ymuVar.j();
                    mrj mrjVar4 = new mrj(11);
                    mrjVar4.D(j);
                    mrjVar4.y(new va90(u77.a(C2.z().j())));
                    mrjVar4.x((Integer) yuf0Var.f);
                    return mrjVar4.d();
                } catch (InvalidProtocolBufferException unused5) {
                    kbs.v("Parsing AesGcmSivKey failed");
                    return null;
                }
            case 17:
                if (!((String) yuf0Var.a).equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    ny61.g("Wrong type URL in call to AesSivParameters.parseParameters");
                    return null;
                }
                try {
                    hi1 C3 = hi1.C((ByteString) yuf0Var.c, oyo.b());
                    if (C3.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    int size2 = C3.z().size();
                    if (size2 != 32 && size2 != 48 && size2 != 64) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(size2)));
                    }
                    OutputPrefixType outputPrefixType = (OutputPrefixType) yuf0Var.e;
                    Map map = oi1.f;
                    if (!map.containsKey(outputPrefixType)) {
                        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + outputPrefixType.b());
                    }
                    mi1 mi1Var = (mi1) map.get(outputPrefixType);
                    if (mi1Var == null) {
                        throw new GeneralSecurityException("Variant is not set");
                    }
                    ni1 ni1Var = new ni1(size2, mi1Var);
                    am2 am2Var = new am2();
                    am2Var.b = null;
                    am2Var.c = null;
                    am2Var.a = ni1Var;
                    am2Var.b = new va90(u77.a(C3.z().j()));
                    am2Var.c = (Integer) yuf0Var.f;
                    return am2Var.b();
                } catch (InvalidProtocolBufferException unused6) {
                    kbs.v("Parsing AesSivKey failed");
                    return null;
                }
            default:
                if (!((String) yuf0Var.a).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    ny61.g("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
                    return null;
                }
                try {
                    v79 C4 = v79.C((ByteString) yuf0Var.c, oyo.b());
                    if (C4.A() == 0) {
                        return w79.a(c89.a((OutputPrefixType) yuf0Var.e), new va90(u77.a(C4.z().j())), (Integer) yuf0Var.f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (InvalidProtocolBufferException unused7) {
                    kbs.v("Parsing ChaCha20Poly1305Key failed");
                    return null;
                }
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public Object mo489apply(Object obj) {
        WifiManager wifiManager = (WifiManager) obj;
        switch (this.a) {
            case 2:
                return A2.c(wifiManager);
            case 3:
                return A2.b(wifiManager);
            default:
                return A2.a(wifiManager);
        }
    }

    @Override // defpackage.f2f0
    public Object b(lhx lhxVar) {
        return new xsb();
    }

    @Override // defpackage.pb7
    public String buildCacheKey(npg npgVar) {
        String str = npgVar.h;
        return str != null ? str : npgVar.a.toString();
    }

    @Override // io.appmetrica.analytics.push.notification.NotificationValueProvider
    public Object get(PushMessage pushMessage) {
        switch (this.a) {
            case 22:
                PushNotification notification = pushMessage.getNotification();
                String channelId = notification != null ? notification.getChannelId() : null;
                if (channelId != null && !evu0.J(channelId)) {
                    return channelId;
                }
                xby.l(jst.e, "AppMetricaPush", null, null, g8e.o("channelId is null or blank for notificationId: ", pushMessage.getNotificationId()), 6);
                return "default";
            default:
                return Integer.valueOf(xk60.n);
        }
    }

    @Override // io.appmetrica.analytics.push.notification.ExtraBundleProvider
    public Bundle getExtraBundle(PushMessage pushMessage) {
        Bundle bundle = new Bundle(2);
        bundle.putSerializable("deeplink_source", DeeplinkSource.PUSH);
        bundle.putCharSequence("KEY_OPEN_REASON", Constants.PUSH);
        return bundle;
    }

    @Override // com.adjust.sdk.OnAttributionChangedListener
    public void onAttributionChanged(AdjustAttribution adjustAttribution) {
        c.a(adjustAttribution);
    }

    @Override // defpackage.wx60
    public void onComplete(Task task) {
        f.a(task);
    }
}
