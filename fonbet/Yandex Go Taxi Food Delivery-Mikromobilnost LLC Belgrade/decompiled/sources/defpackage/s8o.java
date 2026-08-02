package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.graphics.ImageDecoder;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.view.View;
import androidx.concurrent.futures.b;
import com.yandex.go.mob.HostMobSupportedApiNames;
import com.yandex.passport.api.i;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.sls;
import flex.engine.document.DocumentExtKt$createAnimatorListener$1;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.annotation.Annotation;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.JsonEncodingException;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.modules.a;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.am.GoAccountType;
import ru.yandex.taxi.network.api.models.GoApiHttpException;
import ru.yandex.taxi.network.api.models.GoApiOtherException;
import ru.yandex.taxi.persuggest.domain.model.CoordinateProvider$Source;
import ru.yandex.video.m3.ott.data.net.impl.ConcurrencyArbiterApiImpl;

/* loaded from: classes9.dex */
public abstract class s8o {
    public static final Object a = new Object();
    public static final char[] b = {MoneyInputEditView.DEFAULT_VALUE, '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final h1q0 c = new h1q0(0);
    public static Boolean d;
    public static Boolean e;
    public static Boolean f;
    public static Boolean g;

    public static final boolean A(Throwable th) {
        return th instanceof GoApiOtherException ? jx81.B(((GoApiOtherException) th).getOriginal()) : jx81.B(th);
    }

    public static final boolean B(Throwable th) {
        if (!(th instanceof GoApiOtherException)) {
            return (th instanceof UnknownHostException) || (th instanceof ConnectException);
        }
        Throwable original = ((GoApiOtherException) th).getOriginal();
        return (original instanceof UnknownHostException) || (original instanceof ConnectException);
    }

    public static final boolean C(Throwable th) {
        return th instanceof GoApiHttpException ? ((GoApiHttpException) th).getCode() == 404 : jx81.A(404, th);
    }

    public static boolean D(byte b2) {
        return b2 > -65;
    }

    public static final boolean E(Throwable th) {
        if (th instanceof GoApiHttpException) {
            return ((GoApiHttpException) th).getCode() / 100 == 5;
        }
        return (th instanceof HttpException ? ((HttpException) th).a() : 0) / 100 == 5;
    }

    public static boolean F(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (d == null) {
            d = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return d.booleanValue();
    }

    public static boolean G(Context context) {
        F(context);
        if (e == null) {
            e = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return e.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    public static final kc70 H(final xw91 xw91Var, final String str, dsq0 dsq0Var, final sls slsVar) {
        zy11 zy11Var = zy11.a;
        final dy40 dy40Var = new dy40(ec70.b);
        final b bVar = new b();
        bVar.c = new hsj0();
        gl7 gl7Var = new gl7(bVar);
        bVar.b = gl7Var;
        bVar.a = x4e.class;
        try {
            dsq0Var.execute(new Runnable() { // from class: lc70
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = str;
                    sls slsVar2 = slsVar;
                    dy40 dy40Var2 = dy40Var;
                    b bVar2 = bVar;
                    xw91.this.getClass();
                    boolean a2 = jzz0.a();
                    if (a2) {
                        try {
                            Trace.beginSection(ffx.f0(str2));
                        } finally {
                            if (a2) {
                                Trace.endSection();
                            }
                        }
                    }
                    try {
                        slsVar2.invoke();
                        yb70 yb70Var = ec70.a;
                        dy40Var2.m(yb70Var);
                        bVar2.b(yb70Var);
                    } catch (Throwable th) {
                        dy40Var2.m(new xb70(th));
                        bVar2.d(th);
                    }
                }
            });
            bVar.a = zy11Var;
        } catch (Exception e2) {
            gl7Var.a(e2);
        }
        return new kc70(gl7Var);
    }

    public static final Long I(Throwable th) {
        if (th instanceof GoApiHttpException) {
            return wwg.C(((GoApiHttpException) th).getHeaders());
        }
        return null;
    }

    public static final iq20 J(ur20 ur20Var, HostMobSupportedApiNames hostMobSupportedApiNames, String str) {
        return (iq20) ur20Var.e(str, hostMobSupportedApiNames.getApiName()).b.get(vng.b(str, hostMobSupportedApiNames.getApiName()).b);
    }

    public static final lq20 K(ur20 ur20Var, HostMobSupportedApiNames hostMobSupportedApiNames, String str) {
        pr20 pr20Var;
        iq20 iq20Var = (iq20) ur20Var.e(str, hostMobSupportedApiNames.getApiName()).b.get(vng.b(str, hostMobSupportedApiNames.getApiName()).b);
        if (iq20Var == null) {
            jst.e.s(new IllegalStateException(oyr.p("The ", hostMobSupportedApiNames.getApiName().a, " api-name is not integrated with MOB!")));
        }
        if (iq20Var == null || (pr20Var = iq20Var.a) == null) {
            return null;
        }
        return pr20Var.a;
    }

    public static final String L(BufferedInputStream bufferedInputStream) {
        if (bufferedInputStream == null) {
            return null;
        }
        try {
            bufferedInputStream.mark(0);
            String x0 = cma1.x0(new InputStreamReader(bufferedInputStream, uza.a));
            bufferedInputStream.reset();
            return x0;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Integer M(Throwable th) {
        if (th instanceof GoApiHttpException) {
            return Integer.valueOf(((GoApiHttpException) th).getCode());
        }
        if (th instanceof HttpException) {
            return Integer.valueOf(((HttpException) th).a());
        }
        return null;
    }

    public static final BufferedInputStream N(Throwable th) {
        Response response;
        rvj0 rvj0Var;
        InputStream byteStream;
        if (th instanceof GoApiHttpException) {
            return ((GoApiHttpException) th).getBody();
        }
        if (!(th instanceof HttpException) || (response = ((HttpException) th).a) == null || (rvj0Var = response.c) == null || (byteStream = rvj0Var.byteStream()) == null) {
            return null;
        }
        return byteStream instanceof BufferedInputStream ? (BufferedInputStream) byteStream : new BufferedInputStream(byteStream, 8192);
    }

    public static final oeu O(Throwable th) {
        if (th instanceof GoApiHttpException) {
            return ((GoApiHttpException) th).getHeaders();
        }
        if (!(th instanceof HttpException)) {
            return null;
        }
        Response response = ((HttpException) th).a;
        return new oeu(response != null ? response.a.y.e() : kotlin.collections.b.f());
    }

    public static final f6w P(zii0 zii0Var) {
        return new f6w(Math.round(zii0Var.a), Math.round(zii0Var.b), Math.round(zii0Var.c), Math.round(zii0Var.d));
    }

    public static final void Q(a aVar) {
        aVar.i(qoi0.a(kq90.class), qoi0.a(d3q0.class), d3q0.Companion.serializer(), false);
    }

    public static final void R(View view, j2m0 j2m0Var) {
        view.setTag(ich0.view_tree_saved_state_registry_owner, j2m0Var);
    }

    public static final void S(dez dezVar, dez dezVar2) {
        if (dezVar.a().d == null) {
            zjr a2 = dezVar.a();
            a2.getClass();
            a2.d = UUID.randomUUID().toString();
        }
        dezVar2.a().d = dezVar.a().d;
    }

    public static void T(ywl ywlVar, View view, cy01 cy01Var) {
        wwl wwlVar;
        vwl vwlVar;
        ay01 a2;
        bgc bgcVar = new bgc(12);
        if (ywlVar == null || (wwlVar = ywlVar.f) == null || (vwlVar = wwlVar.a) == null || (a2 = cy01Var.a(vwlVar.a())) == null) {
            return;
        }
        a2.h(view, vwlVar, h(bgcVar));
    }

    public static final void U(String str, kotlinx.serialization.json.b bVar) {
        StringBuilder x = unr0.x("Class with serial name ", str, " cannot be serialized polymorphically because it is represented as ");
        x.append(qoi0.a(bVar.getClass()).d());
        x.append('.');
        throw new JsonEncodingException(x.toString(), str, "Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
    }

    public static final ImageDecoder.Source V(xev xevVar, lg70 lg70Var, boolean z) {
        oq90 K0;
        if (xevVar.getFileSystem() == r1r.a && (K0 = xevVar.K0()) != null) {
            return ImageDecoder.createSource(K0.toFile());
        }
        vev metadata = xevVar.getMetadata();
        if (metadata instanceof f93) {
            return ImageDecoder.createSource(lg70Var.a.getAssets(), ((f93) metadata).a);
        }
        if (metadata instanceof ahe) {
            try {
                AssetFileDescriptor assetFileDescriptor = ((ahe) metadata).a;
                Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), OsConstants.SEEK_SET);
                return ImageDecoder.createSource(new s2f(3, assetFileDescriptor));
            } catch (ErrnoException unused) {
                return null;
            }
        }
        if (metadata instanceof luj0) {
            luj0 luj0Var = (luj0) metadata;
            if (jl40.l(luj0Var.a, lg70Var.a.getPackageName())) {
                return ImageDecoder.createSource(lg70Var.a.getResources(), luj0Var.b);
            }
        }
        if (!(metadata instanceof c77)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !z || ((c77) metadata).a.isDirect()) {
            return ImageDecoder.createSource(((c77) metadata).a);
        }
        return null;
    }

    public static final Object W(dez dezVar, Object obj) {
        if (!(obj instanceof dez)) {
            return obj;
        }
        dez dezVar2 = (dez) obj;
        S(dezVar, dezVar2);
        return dezVar2;
    }

    public static void X(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ny61.t(oyr.p("null value in entry: ", str.toString(), "=null"));
    }

    public static final f6w a(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        return new f6w(i, i2, ((int) (j2 >> 32)) + i, ((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + i2);
    }

    public static final void b(sbx sbxVar, KSerializer kSerializer, KSerializer kSerializer2, String str) {
        SerialDescriptor descriptor = kSerializer2.getDescriptor();
        ddx.e(sbxVar, descriptor);
        if (uh6.f(descriptor).contains(str)) {
            String h = kSerializer.getDescriptor().h();
            String h2 = kSerializer2.getDescriptor().h();
            throw new JsonEncodingException(oyr.t(b64.v("Class '", h2, "' cannot be serialized ", (sbxVar.a.m == ClassDiscriminatorMode.ALL_JSON_OBJECTS && jl40.l(h, h2)) ? "in ALL_JSON_OBJECTS class discriminator mode" : unr0.l('\'', "as base class '", h), " because it has property name that conflicts with JSON class discriminator '"), str, "'."), h2, "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation.");
        }
    }

    public static final kj c(i iVar) {
        GoAccountType goAccountType;
        switch (hl.a[iVar.getAccountType().ordinal()]) {
            case 1:
            case 2:
                String nativeDefaultEmail = iVar.getNativeDefaultEmail();
                if (nativeDefaultEmail != null && !evu0.J(nativeDefaultEmail)) {
                    goAccountType = GoAccountType.Yandex;
                    break;
                } else {
                    gtq0.F("Mapping", "Passport account of type: " + iVar.getAccountType() + " without email", new IllegalStateException());
                    goAccountType = GoAccountType.None;
                    break;
                }
                break;
            case 3:
                goAccountType = GoAccountType.Lite;
                break;
            case 4:
                goAccountType = GoAccountType.Social;
                break;
            case 5:
                goAccountType = GoAccountType.Phonish;
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                gtq0.F("Mapping", "Passport account with unsupported type: " + iVar.getAccountType(), new IllegalStateException());
                goAccountType = GoAccountType.None;
                break;
            default:
                w511.b();
                return null;
        }
        return new kj(iVar.getUid().getValue(), iVar.getPrimaryDisplayName(), goAccountType, iVar.getHasPlus(), iVar.getFirstName(), iVar.getLastName(), iVar.getNativeDefaultEmail(), iVar.getAvatarUrl(), iVar.isAvatarEmpty(), iVar.isYandexoid(), iVar.getYandexoidLogin(), iVar.isBetaTester());
    }

    public static final Bundle d(Pair[] pairArr) {
        return wwg.g((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    public static final void e(jl40 jl40Var) {
        if (jl40Var instanceof fsq0) {
            ny61.r("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (jl40Var instanceof h2f0) {
            ny61.r("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (jl40Var instanceof s5e0) {
            ny61.r("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String f(sbx sbxVar, SerialDescriptor serialDescriptor) {
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof bcx) {
                return ((bcx) annotation).discriminator();
            }
        }
        return sbxVar.a.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final yne g(Location location, CoordinateProvider$Source coordinateProvider$Source, Map map) {
        CoordinateProvider$Source coordinateProvider$Source2;
        String provider;
        CoordinateProvider$Source coordinateProvider$Source3;
        long currentTimeMillis = System.currentTimeMillis() - ((SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) / 1000000);
        double altitude = location.getAltitude();
        boolean z = location.hasAltitude() && Double.compare(0.0d, altitude) != 0;
        if (coordinateProvider$Source == CoordinateProvider$Source.LBS && (provider = location.getProvider()) != null) {
            int hashCode = provider.hashCode();
            if (hashCode != -1109041353) {
                if (hashCode != -636437211) {
                    if (hashCode == -20545295 && provider.equals("lbs-gsm")) {
                        coordinateProvider$Source3 = CoordinateProvider$Source.LBS_GSM;
                        coordinateProvider$Source2 = coordinateProvider$Source3;
                    }
                } else if (provider.equals("lbs-wifi")) {
                    coordinateProvider$Source3 = CoordinateProvider$Source.LBS_WIFI;
                    coordinateProvider$Source2 = coordinateProvider$Source3;
                }
            } else if (provider.equals("lbs-ip")) {
                coordinateProvider$Source3 = CoordinateProvider$Source.LBS_IP;
                coordinateProvider$Source2 = coordinateProvider$Source3;
            }
            int speed = (int) location.getSpeed();
            int accuracy = (int) location.getAccuracy();
            zzs.Companion.getClass();
            zzs b2 = uzs.b(location);
            Date date = new Date(currentTimeMillis);
            Integer num = null;
            Double valueOf = !z ? Double.valueOf(altitude) : null;
            if (z) {
                int verticalAccuracyMeters = (int) location.getVerticalAccuracyMeters();
                if (location.hasVerticalAccuracy()) {
                    num = Integer.valueOf(verticalAccuracyMeters);
                }
            }
            return new yne(speed, accuracy, coordinateProvider$Source2, b2, date, valueOf, map, num);
        }
        coordinateProvider$Source2 = coordinateProvider$Source;
        int speed2 = (int) location.getSpeed();
        int accuracy2 = (int) location.getAccuracy();
        zzs.Companion.getClass();
        zzs b22 = uzs.b(location);
        Date date2 = new Date(currentTimeMillis);
        Integer num2 = null;
        if (!z) {
        }
        if (z) {
        }
        return new yne(speed2, accuracy2, coordinateProvider$Source2, b22, date2, valueOf, map, num2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [flex.engine.document.DocumentExtKt$createAnimatorListener$1] */
    public static DocumentExtKt$createAnimatorListener$1 h(final sls slsVar) {
        final sls slsVar2 = null;
        return new Animator.AnimatorListener() { // from class: flex.engine.document.DocumentExtKt$createAnimatorListener$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                sls slsVar3 = slsVar2;
                if (slsVar3 != null) {
                    slsVar3.invoke();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                sls slsVar3 = slsVar;
                if (slsVar3 != null) {
                    slsVar3.invoke();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                sls slsVar3 = slsVar2;
                if (slsVar3 != null) {
                    slsVar3.invoke();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                sls slsVar3 = sls.this;
                if (slsVar3 != null) {
                    slsVar3.invoke();
                }
            }
        };
    }

    public static byte[] i(String str) {
        if (str.length() % 2 != 0) {
            ny61.g("Expected a string of even length");
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int digit = Character.digit(str.charAt(i2), 16);
            int digit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                ny61.g("input is not hexadecimal");
                return null;
            }
            bArr[i] = (byte) ((digit * 16) + digit2);
        }
        return bArr;
    }

    public static String j(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            int i = b2 & 255;
            sb.append("0123456789abcdef".charAt(i / 16));
            sb.append("0123456789abcdef".charAt(i % 16));
        }
        return sb.toString();
    }

    public static final void k(sbx sbxVar, xrw xrwVar, KSerializer kSerializer, Object obj) {
        new vru0(sbxVar.a.e ? new mid(xrwVar, sbxVar) : new eid(xrwVar), sbxVar, WriteMode.OBJ, new vcx[WriteMode.a().size()]).j(obj, kSerializer);
    }

    public static final j2m0 l(View view) {
        while (view != null) {
            Object tag = view.getTag(ich0.view_tree_saved_state_registry_owner);
            j2m0 j2m0Var = tag instanceof j2m0 ? (j2m0) tag : null;
            if (j2m0Var != null) {
                return j2m0Var;
            }
            Object p = qke.p(view);
            view = p instanceof View ? (View) p : null;
        }
        return null;
    }

    public static final int m(kdc kdcVar, Context context) {
        if (kdcVar instanceof bdc) {
            return qje.t(((bdc) kdcVar).a, context);
        }
        if (kdcVar instanceof cdc) {
            return ((cdc) kdcVar).a;
        }
        if (kdcVar instanceof edc) {
            int i = mfc.a[qje.X(context).ordinal()];
            if (i == 1) {
                return ((edc) kdcVar).a;
            }
            if (i == 2) {
                return ((edc) kdcVar).b;
            }
            w511.b();
            return 0;
        }
        if (kdcVar instanceof gdc) {
            ColorStateList m = qke.m(((gdc) kdcVar).a, context);
            if (m != null) {
                return m.getDefaultColor();
            }
            return 0;
        }
        if (kdcVar instanceof hdc) {
            return ((hdc) kdcVar).a.getDefaultColor();
        }
        w511.b();
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final uvo n(View view) {
        if (view instanceof uvo) {
            return (uvo) view;
        }
        Object tag = view.getTag(ngh0.div_releasable_list);
        pnt0 pnt0Var = tag instanceof pnt0 ? (pnt0) tag : null;
        if (pnt0Var == null) {
            pnt0Var = new pnt0(r2);
            view.setTag(ngh0.div_releasable_list, pnt0Var);
        }
        Object b2 = pnt0Var.b(0);
        r2 = b2 instanceof uvo ? (uvo) b2 : null;
        if (r2 != null) {
            return r2;
        }
        vvo vvoVar = new vvo();
        pnt0Var.d(0, vvoVar);
        return vvoVar;
    }

    public static final Object o(gev gevVar, uh uhVar) {
        Object obj = gevVar.t.a.get(uhVar);
        if (obj != null) {
            return obj;
        }
        Object obj2 = gevVar.v.n.a.get(uhVar);
        return obj2 == null ? uhVar.a : obj2;
    }

    public static final Object p(lg70 lg70Var, uh uhVar) {
        Object obj = lg70Var.i.a.get(uhVar);
        return obj == null ? uhVar.a : obj;
    }

    public static final String q() {
        TimeZone timeZone = TimeZone.getDefault();
        return String.valueOf(timeZone.getOffset(Calendar.getInstance(timeZone).getTimeInMillis()) / 1000);
    }

    public static final boolean r(Intent intent) {
        return s(intent) && jl40.l(intent.getStringExtra("SHORTCUT_ACTION"), "SHORTCUT_ACTION_ADD");
    }

    public static final boolean s(Intent intent) {
        return intent.hasExtra("SHORTCUT_ACTION") && intent.hasExtra("SHORTCUT_TARGET");
    }

    public static final boolean t(Throwable th) {
        return th instanceof GoApiHttpException ? ((GoApiHttpException) th).getCode() == 401 : jx81.A(401, th);
    }

    public static final boolean u(Throwable th) {
        if (th instanceof GoApiHttpException) {
            return ((GoApiHttpException) th).getCode() / 100 == 4;
        }
        return (th instanceof HttpException ? ((HttpException) th).a() : 0) / 100 == 4;
    }

    public static final boolean v(Intent intent) {
        return s(intent) && jl40.l(intent.getStringExtra("SHORTCUT_ACTION"), "SHORTCUT_ACTION_SET_DESTINATION");
    }

    public static final boolean w(Throwable th) {
        return th instanceof GoApiHttpException ? ((GoApiHttpException) th).getCode() == 403 : jx81.A(403, th);
    }

    public static final boolean x(Throwable th) {
        return (th instanceof GoApiHttpException) || (th instanceof HttpException);
    }

    public static final boolean y(Exception exc) {
        return exc instanceof GoApiHttpException ? ((GoApiHttpException) exc).getCode() == 418 : jx81.A(ConcurrencyArbiterApiImpl.RESPONSE_CODE_418, exc);
    }

    public static final boolean z(Throwable th) {
        return th instanceof GoApiOtherException ? jx81.D(((GoApiOtherException) th).getOriginal()) : jx81.D(th);
    }
}
