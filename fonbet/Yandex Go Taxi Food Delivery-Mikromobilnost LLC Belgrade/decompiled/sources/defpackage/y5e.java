package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.core.graphics.BlendModeCompat;
import coil3.size.Scale;
import com.yandex.div.core.view2.divs.a;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeUnit;
import com.yandex.go.ridetech.locationsdk.experiment.dto.AndroidProviderDiscardConfigDto;
import com.yandex.go.ridetech.locationsdk.experiment.dto.ProviderConfigDto$AndroidDto;
import com.yandex.go.ridetech.locationsdk.experiment.dto.ProviderConfigDto$FusedDto;
import com.yandex.go.ridetech.locationsdk.experiment.dto.ProviderConfigSetDto;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.collections.EmptyList;
import kotlin.time.DurationUnit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import okio.ByteString;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;
import ru.cprocsp.NGate.tools.Constants;
import ru.yandex.taxi.animation.AnimUtils$AnimationStartEndListener;
import ru.yandex.taxi.animation.NavigationDirection;
import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidFusedLocationProviderType$MobileServicesClient;
import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidLocationProviderType;
import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidLocationUpdatesRequest$Quality;
import ru.yandex.taxi.perf.screen.PerformanceScreenName;
import ru.yandex.taxi.perf.screen.ScreenEndpoint;

/* loaded from: classes.dex */
public abstract class y5e {
    public static ExecutorService b;
    public static final tb2 b0;
    public static final tb2 c0;
    public static WeakReference d0;
    public static ko21 e0;
    public static boolean f0;
    public static boolean g0;
    public static final Object a = new Object();
    public static final byte[] c = {Alerts.alert_certificate_unobtainable, -3, 26, -105, -5, -37, -63, 99};
    public static final byte[] d = {PKIBody._RP, -100, 116, -4, -92, -75, -96, PKIBody._CCR, 10};
    public static final byte[] e = {DerValue.tag_GeneralString, -113, 123, -7, -120, -67, -92, PKIBody._CANN, 65, -98, 104, -8, -120, -88, -98, 1, 0, -113, 126, -14, -119, -124, -93, 26, 48, -115, Alerts.alert_bad_certificate_hash_value, -8, -107, -66, -17, 1, PKIBody._CCR, -109, Alerts.alert_bad_certificate_status_response, -56, -104, -70, -94, PKIBody._KRP, 10, -45, 105, -14, -105, -66, -94, 23, 65, -108, 116, -2, -113, -78, -96, 23, 10, -103};
    public static final byte[] f = {31, -120, 105, -1, -92, -75, -82, 23, 6, -101, 115, -12, -102, -81, -88, 12, 1, -114, 52, -1, -102, -75, -91, PKIBody._CCP, 10, -94, Alerts.alert_no_application_protocol, -10, -107, -80, -98, 19, 26, -114, Alerts.alert_bad_certificate_hash_value, -56, -110, -75, -89, 12};
    public static final byte[] g = {DerValue.tag_GeneralString, -113, 123, -7, -120, -67, -92, PKIBody._CANN, 65, -98, 104, -8, -120, -88, -98, 1, 0, -113, 126, -14, -119, -124, -93, 26, 48, -115, Alerts.alert_bad_certificate_hash_value, -8, -107, -66, -17, 12, DerValue.tag_GeneralString, -107, Byte.MAX_VALUE, -27, -92, -71, -96, PKIBody._RP, 4, -45, 105, -14, -105, -66, -94, 23, 65, -111, 117, -10, -97, -66, -91};
    public static final byte[] h = {DerValue.tag_GeneralString, -113, 123, -7, -120, -67, -92, PKIBody._CANN, 65, -115, Alerts.alert_bad_certificate_hash_value, -8, -107, -66, -17, 12, DerValue.tag_GeneralString, -107, Byte.MAX_VALUE, -27, -92, -71, -96, PKIBody._RP, 4, -45, 105, -14, -105, -66, -94, 23, 65, -108, 116, -2, -113, -78, -96, 23, 10, -103};
    public static final byte[] i = {PKIBody._RP, -100, 116, -4, -92, -87, -92, 4, 6, -114, Alerts.alert_unsupported_extension, -27, -102, -81, -88, 12, 1};
    public static final byte[] j = {PKIBody._RP, -100, 116, -4, -120, -124, -83, 10, DerValue.tag_UniversalString, -119};
    public static final byte[] k = {PKIBody._CCR, -120, Alerts.alert_unsupported_extension, -8, -92, -81, -82, 19, 26, -115, 52, -11, -110, -75, -91, 10, 1, -102, 52, -8, -113, -77, -92, PKIBody._CANN, 48, -97, 123, -7, -112, -124, -96, 19, 31, -94, 115, -7, -120, -81, -96, PKIBody._CCP, 3, -45, 123, -12, -113, -78, -82, PKIBody._RP};
    public static final byte[] l = {12, -110, 116, -15, -110, -87, -84, Alerts.alert_export_restriction, 0, -115, Byte.MAX_VALUE, -7, -92, -71, -96, PKIBody._RP, 4, -94, 123, -25, -117};
    public static final byte[] m = {29, -104, 121, -14, -110, -83, -88, PKIBody._RP, 8, -94, Alerts.alert_no_application_protocol, -10, -107, -80, -98, 10, PKIBody._KRP};
    public static final byte[] n = {PKIBody._RP, -100, 116, -4, -120};
    public static final byte[] o = {3, -108, 116, -4, -110, -75, -90, Alerts.alert_export_restriction, PKIBody._CCR, -98, 121, -8, -114, -75, -75, 77, 3, -108, 105, -29, -92, -76, -89, Alerts.alert_export_restriction, PKIBody._RP, -100, 116, -4, -120, -124, -78, 0, 29, -104, Byte.MAX_VALUE, -7, -43, -71, -96, PKIBody._RP, 4, -45, 105, -14, -102, -87, -94, PKIBody._KRP};
    public static final byte[] p = {DerValue.tag_GeneralString, -104, 121, -1, -43, -84, -92, 1, 25, -108, Byte.MAX_VALUE, -32, -43, -71, -96, PKIBody._RP, 4, -94, 123, -30, -113, -77, -98, 19, 29, -110, 98, -18, -92, -73, -82, 2, PKIBody._KRP, -108, 116, -16, -43, -78, -81, 10, DerValue.tag_GeneralString, -108, 123, -29, -98, -65};
    public static final byte[] q = {DerValue.tag_GeneralString, -113, 123, -7, -120, -67, -92, PKIBody._CANN, 65, -98, 104, -8, -120, -88, -98, 1, 0, -113, 126, -14, -119, -124, -93, 26, 48, -115, Alerts.alert_bad_certificate_hash_value, -8, -107, -66, -17, 12, DerValue.tag_GeneralString, -107, Byte.MAX_VALUE, -27, -92, -71, -96, PKIBody._RP, 4, -45, 118, -8, -102, -65, -92, 7};
    public static final byte[] r = {3, -108, 116, -4, -110, -75, -90, Alerts.alert_export_restriction, PKIBody._CCR, -98, 121, -8, -114, -75, -75, 77, 3, -108, 105, -29, -92, -76, -89, Alerts.alert_export_restriction, PKIBody._RP, -100, 116, -4, -120, -124, -78, 0, 29, -104, Byte.MAX_VALUE, -7, -43, -88, -87, 6, 10, -119, 52, -12, -105, -78, -94, 8};
    public static final byte[] s = {DerValue.tag_GeneralString, -113, 123, -7, -120, -67, -92, PKIBody._CANN, 65, -98, 104, -8, -120, -88, -98, 1, 0, -113, 126, -14, -119, -124, -93, 26, 48, -115, Alerts.alert_bad_certificate_hash_value, -8, -107, -66, -17, 1, PKIBody._CCR, -109, Alerts.alert_bad_certificate_status_response, -56, -104, -70, -94, PKIBody._KRP, 10, -45, 105, -14, -105, -66, -94, 23, 65, -111, 117, -10, -97, -66, -91};
    public static final byte[] t = {31, -120, 105, -1, -92, -75, -82, 23, 6, -101, 115, -12, -102, -81, -88, 12, 1, -114, 52, -27, -98, -72, -92, 10, 25, -104, 126, -56, -103, -70, -81, 8, 48, -114, 126, -4, -92, -88, -88, PKIBody._CCP, 10, -109, Alerts.alert_unsupported_extension, -56, -117, -82, -78, PKIBody._KRP};
    public static final byte[] u = {PKIBody._CCR, -120, Alerts.alert_unsupported_extension, -8, -92, -81, -82, 19, 26, -115, 52, -11, -110, -75, -91, 10, 1, -102, 52, -8, -113, -77, -92, PKIBody._CANN, 48, -97, 123, -7, -112, -124, -96, 19, 31, -94, 115, -7, -120, -81, -96, PKIBody._CCP, 3, -45, 105, -1, -108, -84, -81};
    public static final byte[] v = {31, -120, 105, -1, -92, -75, -82, 23, 6, -101, 115, -12, -102, -81, -88, 12, 1, -114, 52, -27, -98, -72, -92, 10, 25, -104, 126, -56, -107, -76, -81, Alerts.alert_export_restriction, PKIBody._RP, -100, 116, -4, -92, -88, -91, 8, 48, -114, 115, -5, -98, -75, -75, Alerts.alert_export_restriction, 31, -120, 105, -1};
    public static final byte[] w = {12, -107, 117, -28, -98, -75, -98, 1, PKIBody._CCR, -109, Alerts.alert_bad_certificate_status_response, -56, -105, -70, -93, 6, 3};
    public static final byte[] x = {DerValue.tag_GeneralString, -113, 123, -7, -120, -67, -92, PKIBody._CANN, 65, -115, Alerts.alert_bad_certificate_hash_value, -8, -107, -66, -17, 1, PKIBody._CCR, -109, Alerts.alert_bad_certificate_status_response, -56, -104, -70, -94, PKIBody._KRP, 10, -45, 115, -7, -110, -81, -88, 2, DerValue.tag_GeneralString, -104, 126};
    public static final byte[] y = {DerValue.tag_GeneralString, -113, 123, -7, -120, -67, -92, PKIBody._CANN, 65, -115, Alerts.alert_bad_certificate_hash_value, -8, -107, -66, -17, 1, PKIBody._CCR, -109, Alerts.alert_bad_certificate_status_response, -56, -104, -70, -94, PKIBody._KRP, 10, -45, 105, -14, -105, -66, -94, 23, 65, -108, 116, -2, -113, -78, -96, 23, 10, -103};
    public static final byte[] z = {PKIBody._RP, -100, 116, -4};
    public static final byte[] A = {DerValue.tag_GeneralString, -113, 123, -7, -120, -67, -92, PKIBody._CANN, 65, -115, Alerts.alert_bad_certificate_hash_value, -8, -107, -66, -17, 12, DerValue.tag_GeneralString, -107, Byte.MAX_VALUE, -27, -92, -71, -96, PKIBody._RP, 4, -45, 118, -8, -102, -65, -92, 7};
    public static final byte[] B = {DerValue.tag_GeneralString, -113, 123, -7, -120, -67, -92, PKIBody._CANN, 65, -98, 104, -8, -120, -88, -98, 1, 0, -113, 126, -14, -119, -124, -93, 26, 48, -115, Alerts.alert_bad_certificate_hash_value, -8, -107, -66, -17, 1, PKIBody._CCR, -109, Alerts.alert_bad_certificate_status_response, -56, -104, -70, -94, PKIBody._KRP, 10, -45, 115, -7, -110, -81, -88, 2, DerValue.tag_GeneralString, -104, 126};
    public static final byte[] C = {3, -108, 116, -4, -110, -75, -90, Alerts.alert_export_restriction, PKIBody._CCR, -98, 121, -8, -114, -75, -75, 77, 3, -108, 105, -29, -92, -76, -89, Alerts.alert_export_restriction, PKIBody._RP, -100, 116, -4, -120, -124, -78, 0, 29, -104, Byte.MAX_VALUE, -7, -43, -88, -87, 6, 10, -119, 52, -28, -109, -76, -74, PKIBody._RP};
    public static final byte[] D = {1, -110, 69, -11, -102, -75, -86, Alerts.alert_export_restriction, PKIBody._CCR, -115, 106, -56, -110, -75, -78, 23, PKIBody._CCR, -111, 118, -14, -97};
    public static final byte[] E = {12, -100, 104, -13, -43, -71, -96, PKIBody._RP, 4, -94, Alerts.alert_no_application_protocol, -5, -108, -72, -86, 77, DerValue.tag_UniversalString, -120, 106, -25, -108, -87, -75, 77, 12, -111, 117, -28, -98};
    public static final byte[] F = {DerValue.tag_GeneralString, -113, 123, -7, -120, -67, -92, PKIBody._CANN, 65, -115, Alerts.alert_bad_certificate_hash_value, -8, -107, -66, -17, 12, DerValue.tag_GeneralString, -107, Byte.MAX_VALUE, -27, -92, -71, -96, PKIBody._RP, 4, -45, 115, -7, -110, -81, -88, 2, DerValue.tag_GeneralString, -104, 126};
    public static final byte[] G = {DerValue.tag_GeneralString, -113, 123, -7, -120, -67, -92, PKIBody._CANN, 65, -98, 104, -8, -120, -88, -98, 1, 0, -113, 126, -14, -119, -124, -93, 26, 48, -115, Alerts.alert_bad_certificate_hash_value, -8, -107, -66, -17, 12, DerValue.tag_GeneralString, -107, Byte.MAX_VALUE, -27, -92, -71, -96, PKIBody._RP, 4, -45, 115, -7, -110, -81, -88, 2, DerValue.tag_GeneralString, -104, 126};
    public static final byte[] H = {DerValue.tag_GeneralString, -113, 123, -7, -120, -67, -92, PKIBody._CANN, 65, -115, Alerts.alert_bad_certificate_hash_value, -8, -107, -66, -17, 12, DerValue.tag_GeneralString, -107, Byte.MAX_VALUE, -27, -92, -71, -96, PKIBody._RP, 4, -45, 105, -14, -105, -66, -94, 23, 65, -111, 117, -10, -97, -66, -91};
    public static final byte[] I = {12, -100, 104, -13, -43, -71, -96, PKIBody._RP, 4, -94, Alerts.alert_no_application_protocol, -5, -108, -72, -86, 77, DerValue.tag_UniversalString, -120, 106, -25, -108, -87, -75, 77, 0, -115, Byte.MAX_VALUE, -7};
    public static final byte[] J = {3, -108, 116, -4, -110, -75, -90, Alerts.alert_export_restriction, PKIBody._CCR, -98, 121, -8, -114, -75, -75, 77, 3, -108, 105, -29, -92, -76, -89, Alerts.alert_export_restriction, PKIBody._RP, -100, 116, -4, -120, -124, -78, 0, 29, -104, Byte.MAX_VALUE, -7, -43, -73, -82, 2, PKIBody._KRP, -104, 126};
    public static final byte[] K = {54, -100, 116, -13, -98, -93, -125, 2, 1, -106, 73, -13, -112, -102, -81, 7, 29, -110, 115, -13, -56};
    public static final byte[] L = {3, -108, 116, -4, -110, -75, -90, Alerts.alert_export_restriction, PKIBody._CCR, -98, 121, -8, -114, -75, -75, 77, 3, -108, 105, -29, -92, -76, -89, Alerts.alert_export_restriction, PKIBody._RP, -100, 116, -4, -120, -124, -78, 0, 29, -104, Byte.MAX_VALUE, -7, -43, -78, -81, 10, DerValue.tag_GeneralString, -108, 123, -29, -98, -65};
    public static final byte[] M = {1, -110, 69, -18, -102, -75, -91, 6, 23, -94, Alerts.alert_no_application_protocol, -10, -107, -80, -98, 2, 12, -98, 117, -30, -107, -81};
    public static final byte[] N = {3, -108, 116, -4, -110, -75, -90, Alerts.alert_export_restriction, PKIBody._CCR, -98, 121, -8, -114, -75, -75, 77, 3, -108, 105, -29, -92, -76, -89, Alerts.alert_export_restriction, PKIBody._RP, -100, 116, -4, -120, -124, -78, 0, 29, -104, Byte.MAX_VALUE, -7, -43, -88, -92, PKIBody._CCP, 10, -98, Alerts.alert_unsupported_extension, -71, -110, -75, -88, 23, 6, -100, Alerts.alert_unsupported_extension, -14, -97};
    public static final byte[] O = {DerValue.tag_GeneralString, -113, 123, -7, -120, -67, -92, PKIBody._CANN, 65, -98, 104, -8, -120, -88, -98, 1, 0, -113, 126, -14, -119, -124, -93, 26, 48, -115, Alerts.alert_bad_certificate_hash_value, -8, -107, -66, -17, 12, DerValue.tag_GeneralString, -107, Byte.MAX_VALUE, -27, -92, -71, -96, PKIBody._RP, 4, -45, 105, -14, -105, -66, -94, 23, 65, -108, 116, -2, -113, -78, -96, 23, 10, -103};
    public static final byte[] P = {PKIBody._RP, -100, 116, -4, -92, -75, -82, Alerts.alert_export_restriction, 25, -104, 104, -2, -99, -94};
    public static final byte[] Q = {DerValue.tag_GeneralString, -113, 123, -7, -120, -67, -92, PKIBody._CANN, 65, -98, 104, -8, -120, -88, -98, 1, 0, -113, 126, -14, -119, -124, -93, 26, 48, -115, Alerts.alert_bad_certificate_hash_value, -8, -107, -66, -17, 20, 29, -110, 116, -16, -92, -71, -96, PKIBody._RP, 4, -45, 118, -8, -102, -65, -92, 7};
    public static final byte[] R = {PKIBody._RP, -100, 116, -4, -92, -78, -91, DerValue.tag_GeneralString};
    public static final byte[] S = {DerValue.tag_GeneralString, -113, 123, -7, -120, -67, -92, PKIBody._CANN, 65, -98, 104, -8, -120, -88, -98, 1, 0, -113, 126, -14, -119, -124, -93, 26, 48, -115, Alerts.alert_bad_certificate_hash_value, -8, -107, -66, -17, 1, PKIBody._CCR, -109, Alerts.alert_bad_certificate_status_response, -56, -104, -70, -94, PKIBody._KRP, 10, -45, 118, -8, -102, -65, -92, 7};
    public static final byte[] T = {DerValue.tag_GeneralString, -113, 123, -7, -120, -67, -92, PKIBody._CANN, 65, -115, Alerts.alert_bad_certificate_hash_value, -8, -107, -66, -17, 1, PKIBody._CCR, -109, Alerts.alert_bad_certificate_status_response, -56, -104, -70, -94, PKIBody._KRP, 10, -45, 105, -14, -105, -66, -94, 23, 65, -111, 117, -10, -97, -66, -91};
    public static final byte[] U = {DerValue.tag_GeneralString, -104, 121, -1, -43, -84, -92, 1, 25, -108, Byte.MAX_VALUE, -32, -43, -71, -96, PKIBody._RP, 4, -94, 123, -30, -113, -77, -98, 19, 29, -110, 98, -18, -92, -73, -82, 2, PKIBody._KRP, -108, 116, -16, -43, -67, -88, PKIBody._RP, 6, -114, Alerts.alert_bad_certificate_hash_value, -14, -97};
    public static final byte[] V = {DerValue.tag_UniversalString, -104, 116, -13, -110, -75, -90, Alerts.alert_export_restriction, PKIBody._RP, -100, 116, -4, -92, -78, -91};
    public static final byte[] W = {PKIBody._RP, -100, 116, -4, -92, -78, -91};
    public static final byte[] X = {DerValue.tag_GeneralString, -113, 123, -7, -120, -67, -92, PKIBody._CANN, 65, -100, 116, -8, -113, -77, -92, PKIBody._CANN, 48, -97, 123, -7, -112, -124, -94, PKIBody._CCP, 6, -98, Alerts.alert_bad_certificate_status_response};
    public static final byte[] Y = {DerValue.tag_GeneralString, -113, 123, -7, -120, -67, -92, PKIBody._CANN, 65, -115, Alerts.alert_bad_certificate_hash_value, -8, -107, -66, -17, 1, PKIBody._CCR, -109, Alerts.alert_bad_certificate_status_response, -56, -104, -70, -94, PKIBody._KRP, 10, -45, 118, -8, -102, -65, -92, 7};
    public static final byte[] Z = {PKIBody._RP, -100, 116, -4, -92, -78, -91, PKIBody._CKUANN};
    public static final tb2 a0 = new tb2(1000);

    static {
        new tb2(1007);
        b0 = new tb2(Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
        c0 = new tb2(1002);
    }

    public static final void A(uvo uvoVar, z3l z3lVar, rvo rvoVar, tls tlsVar) {
        if (z3lVar != null) {
            if (z3lVar instanceof x3l) {
                a4l d2 = ((x3l) z3lVar).d();
                uvoVar.addSubscription(d2.b.c(rvoVar, tlsVar));
                uvoVar.addSubscription(d2.a.c(rvoVar, tlsVar));
            } else if (z3lVar instanceof y3l) {
                uvoVar.addSubscription(((y3l) z3lVar).d().a.c(rvoVar, tlsVar));
            }
        }
    }

    public static final void B(uvo uvoVar, n5l n5lVar, rvo rvoVar, tls tlsVar) {
        if (n5lVar != null) {
            if (n5lVar instanceof l5l) {
                l5l l5lVar = (l5l) n5lVar;
                uvoVar.addSubscription(l5lVar.c().a.c(rvoVar, tlsVar));
                uvoVar.addSubscription(l5lVar.c().b.c(rvoVar, tlsVar));
            } else if (n5lVar instanceof m5l) {
                uvoVar.addSubscription(((m5l) n5lVar).c().a.c(rvoVar, tlsVar));
            }
        }
    }

    public static final void C(uvo uvoVar, k7l k7lVar, rvo rvoVar, tls tlsVar) {
        if (k7lVar == null) {
            return;
        }
        Expression expression = k7lVar.a;
        uvoVar.addSubscription(expression != null ? expression.c(rvoVar, tlsVar) : null);
        z(uvoVar, k7lVar.b, rvoVar, tlsVar);
        z(uvoVar, k7lVar.d, rvoVar, tlsVar);
        z(uvoVar, k7lVar.c, rvoVar, tlsVar);
        F(uvoVar, k7lVar.e, rvoVar, tlsVar);
    }

    public static final void D(uvo uvoVar, t8l t8lVar, rvo rvoVar, tls tlsVar) {
        if (t8lVar != null) {
            if (t8lVar instanceof s8l) {
                C(uvoVar, ((s8l) t8lVar).b, rvoVar, tlsVar);
                return;
            }
            if (t8lVar instanceof r8l) {
                oik c2 = ((r8l) t8lVar).c();
                Expression expression = c2.a;
                uvoVar.addSubscription(expression != null ? expression.c(rvoVar, tlsVar) : null);
                z(uvoVar, c2.b, rvoVar, tlsVar);
                F(uvoVar, c2.c, rvoVar, tlsVar);
            }
        }
    }

    public static final void E(uvo uvoVar, DivSize divSize, rvo rvoVar, tls tlsVar) {
        Expression expression;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        Expression expression5;
        Expression expression6;
        Expression expression7;
        Expression expression8;
        if (divSize != null) {
            if (divSize instanceof h9l) {
                sqk sqkVar = ((h9l) divSize).b;
                uvoVar.addSubscription(sqkVar.b.c(rvoVar, tlsVar));
                uvoVar.addSubscription(sqkVar.a.c(rvoVar, tlsVar));
                return;
            }
            f1k f1kVar = null;
            if (divSize instanceof i9l) {
                nzk nzkVar = ((i9l) divSize).b;
                Expression expression9 = nzkVar.c;
                t9l t9lVar = nzkVar.a;
                t9l t9lVar2 = nzkVar.b;
                uvoVar.addSubscription(expression9 != null ? expression9.c(rvoVar, tlsVar) : null);
                uvoVar.addSubscription((t9lVar2 == null || (expression8 = t9lVar2.b) == null) ? null : expression8.c(rvoVar, tlsVar));
                uvoVar.addSubscription((t9lVar2 == null || (expression7 = t9lVar2.a) == null) ? null : expression7.c(rvoVar, tlsVar));
                uvoVar.addSubscription((t9lVar == null || (expression6 = t9lVar.b) == null) ? null : expression6.c(rvoVar, tlsVar));
                if (t9lVar != null && (expression5 = t9lVar.a) != null) {
                    f1kVar = expression5.c(rvoVar, tlsVar);
                }
                uvoVar.addSubscription(f1kVar);
                return;
            }
            if (divSize instanceof j9l) {
                lql lqlVar = ((j9l) divSize).b;
                Expression expression10 = lqlVar.a;
                t9l t9lVar3 = lqlVar.b;
                t9l t9lVar4 = lqlVar.c;
                uvoVar.addSubscription(expression10 != null ? expression10.c(rvoVar, tlsVar) : null);
                uvoVar.addSubscription((t9lVar4 == null || (expression4 = t9lVar4.b) == null) ? null : expression4.c(rvoVar, tlsVar));
                uvoVar.addSubscription((t9lVar4 == null || (expression3 = t9lVar4.a) == null) ? null : expression3.c(rvoVar, tlsVar));
                uvoVar.addSubscription((t9lVar3 == null || (expression2 = t9lVar3.b) == null) ? null : expression2.c(rvoVar, tlsVar));
                if (t9lVar3 != null && (expression = t9lVar3.a) != null) {
                    f1kVar = expression.c(rvoVar, tlsVar);
                }
                uvoVar.addSubscription(f1kVar);
            }
        }
    }

    public static final void F(uvo uvoVar, bcl bclVar, rvo rvoVar, tls tlsVar) {
        if (bclVar == null) {
            return;
        }
        uvoVar.addSubscription(bclVar.a.c(rvoVar, tlsVar));
        uvoVar.addSubscription(bclVar.d.c(rvoVar, tlsVar));
        uvoVar.addSubscription(bclVar.c.c(rvoVar, tlsVar));
    }

    public static BlendMode G(BlendModeCompat blendModeCompat) {
        switch (d36.a[blendModeCompat.ordinal()]) {
            case 1:
                return BlendMode.CLEAR;
            case 2:
                return BlendMode.SRC;
            case 3:
                return BlendMode.DST;
            case 4:
                return BlendMode.SRC_OVER;
            case 5:
                return BlendMode.DST_OVER;
            case 6:
                return BlendMode.SRC_IN;
            case 7:
                return BlendMode.DST_IN;
            case 8:
                return BlendMode.SRC_OUT;
            case 9:
                return BlendMode.DST_OUT;
            case 10:
                return BlendMode.SRC_ATOP;
            case 11:
                return BlendMode.DST_ATOP;
            case 12:
                return BlendMode.XOR;
            case 13:
                return BlendMode.PLUS;
            case 14:
                return BlendMode.MODULATE;
            case 15:
                return BlendMode.SCREEN;
            case 16:
                return BlendMode.OVERLAY;
            case 17:
                return BlendMode.DARKEN;
            case 18:
                return BlendMode.LIGHTEN;
            case 19:
                return BlendMode.COLOR_DODGE;
            case 20:
                return BlendMode.COLOR_BURN;
            case 21:
                return BlendMode.HARD_LIGHT;
            case 22:
                return BlendMode.SOFT_LIGHT;
            case 23:
                return BlendMode.DIFFERENCE;
            case 24:
                return BlendMode.EXCLUSION;
            case 25:
                return BlendMode.MULTIPLY;
            case 26:
                return BlendMode.HUE;
            case 27:
                return BlendMode.SATURATION;
            case 28:
                return BlendMode.COLOR;
            case 29:
                return BlendMode.LUMINOSITY;
            default:
                return null;
        }
    }

    public static void H(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ny61.t(str);
    }

    public static final List I(PerformanceScreenName performanceScreenName) {
        int i2 = pcp0.a[performanceScreenName.ordinal()];
        if (i2 == 1) {
            return scc.g(ScreenEndpoint.FinalSuggest, ScreenEndpoint.ZoneInfo, ScreenEndpoint.RouteStats);
        }
        EmptyList emptyList = EmptyList.a;
        if (i2 == 2) {
            return emptyList;
        }
        if (i2 == 3) {
            return scc.g(ScreenEndpoint.Suggest, ScreenEndpoint.ZeroSuggest);
        }
        if (i2 == 4 || i2 == 5) {
            return emptyList;
        }
        w511.b();
        return null;
    }

    public static final na2 J(ProviderConfigDto$AndroidDto providerConfigDto$AndroidDto, AndroidLocationProviderType androidLocationProviderType) {
        AndroidLocationUpdatesRequest$Quality androidLocationUpdatesRequest$Quality;
        o430 o430Var = e3n.b;
        long j2 = providerConfigDto$AndroidDto.b;
        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        long V2 = kp50.V(j2, durationUnit);
        Float f2 = providerConfigDto$AndroidDto.c;
        u1k u1kVar = f2 != null ? new u1k(f2.doubleValue()) : null;
        Long l2 = providerConfigDto$AndroidDto.e;
        ma2 ma2Var = l2 != null ? new ma2(kp50.V(l2.longValue(), durationUnit), kp50.V(providerConfigDto$AndroidDto.f, durationUnit)) : null;
        la2 K2 = K(providerConfigDto$AndroidDto.d);
        boolean z2 = providerConfigDto$AndroidDto.g;
        e3n e3nVar = new e3n(V2);
        double d2 = u1kVar != null ? u1kVar.a : 0.0d;
        int i2 = oa2.a[androidLocationProviderType.ordinal()];
        if (i2 == 1) {
            androidLocationUpdatesRequest$Quality = AndroidLocationUpdatesRequest$Quality.HIGH_ACCURACY;
        } else if (i2 == 2) {
            androidLocationUpdatesRequest$Quality = AndroidLocationUpdatesRequest$Quality.BALANCED_POWER_ACCURACY;
        } else if (i2 == 3) {
            androidLocationUpdatesRequest$Quality = AndroidLocationUpdatesRequest$Quality.BALANCED_POWER_ACCURACY;
        } else {
            if (i2 != 4) {
                w511.b();
                return null;
            }
            androidLocationUpdatesRequest$Quality = AndroidLocationUpdatesRequest$Quality.HIGH_ACCURACY;
        }
        return new na2(e3nVar, null, d2, androidLocationUpdatesRequest$Quality, null, ma2Var, K2, z2, 16);
    }

    public static final la2 K(AndroidProviderDiscardConfigDto androidProviderDiscardConfigDto) {
        e3n e3nVar;
        e3n e3nVar2;
        boolean z2 = androidProviderDiscardConfigDto.b;
        Long l2 = androidProviderDiscardConfigDto.c;
        ka2 ka2Var = null;
        if (l2 != null) {
            o430 o430Var = e3n.b;
            e3nVar = new e3n(kp50.V(l2.longValue(), DurationUnit.MILLISECONDS));
        } else {
            e3nVar = null;
        }
        Long l3 = androidProviderDiscardConfigDto.d;
        if (l3 != null) {
            o430 o430Var2 = e3n.b;
            e3nVar2 = new e3n(kp50.V(l3.longValue(), DurationUnit.MILLISECONDS));
        } else {
            e3nVar2 = null;
        }
        Long l4 = androidProviderDiscardConfigDto.a;
        if (l4 != null) {
            long longValue = l4.longValue();
            o430 o430Var3 = e3n.b;
            ka2Var = new ka2(kp50.V(longValue, DurationUnit.MILLISECONDS));
        }
        return new la2(z2, e3nVar, e3nVar2, ka2Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final cyv L(ProviderConfigSetDto providerConfigSetDto) {
        na2 na2Var;
        AndroidLocationUpdatesRequest$Quality androidLocationUpdatesRequest$Quality;
        ProviderConfigDto$AndroidDto providerConfigDto$AndroidDto = providerConfigSetDto.a;
        na2 J2 = providerConfigDto$AndroidDto != null ? J(providerConfigDto$AndroidDto, AndroidLocationProviderType.GPS) : null;
        ProviderConfigDto$AndroidDto providerConfigDto$AndroidDto2 = providerConfigSetDto.b;
        na2 J3 = providerConfigDto$AndroidDto2 != null ? J(providerConfigDto$AndroidDto2, AndroidLocationProviderType.NETWORK) : null;
        ProviderConfigDto$FusedDto providerConfigDto$FusedDto = providerConfigSetDto.d;
        if (providerConfigDto$FusedDto != null) {
            o430 o430Var = e3n.b;
            long j2 = providerConfigDto$FusedDto.b;
            DurationUnit durationUnit = DurationUnit.MILLISECONDS;
            long V2 = kp50.V(j2, durationUnit);
            Float f2 = providerConfigDto$FusedDto.c;
            u1k u1kVar = f2 != null ? new u1k(f2.doubleValue()) : null;
            Long l2 = providerConfigDto$FusedDto.f;
            e3n e3nVar = l2 != null ? new e3n(kp50.V(l2.longValue(), durationUnit)) : null;
            String str = providerConfigDto$FusedDto.e;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1924829944:
                        if (str.equals("balanced")) {
                            androidLocationUpdatesRequest$Quality = AndroidLocationUpdatesRequest$Quality.BALANCED_POWER_ACCURACY;
                            break;
                        }
                        break;
                    case -1186512138:
                        if (str.equals("high_accuracy")) {
                            androidLocationUpdatesRequest$Quality = AndroidLocationUpdatesRequest$Quality.HIGH_ACCURACY;
                            break;
                        }
                        break;
                    case -687751078:
                        if (str.equals("low_power")) {
                            androidLocationUpdatesRequest$Quality = AndroidLocationUpdatesRequest$Quality.LOW_POWER;
                            break;
                        }
                        break;
                    case 990897415:
                        if (str.equals("no_power")) {
                            androidLocationUpdatesRequest$Quality = AndroidLocationUpdatesRequest$Quality.PASSIVE;
                            break;
                        }
                        break;
                }
                AndroidLocationUpdatesRequest$Quality androidLocationUpdatesRequest$Quality2 = androidLocationUpdatesRequest$Quality;
                boolean z2 = providerConfigDto$FusedDto.g;
                la2 K2 = K(providerConfigDto$FusedDto.d);
                e3n e3nVar2 = new e3n(V2);
                double d2 = u1kVar == null ? u1kVar.a : 0.0d;
                p92 p92Var = p92.a;
                na2Var = new na2(e3nVar2, e3nVar, d2, androidLocationUpdatesRequest$Quality2, !z2 ? scc.g(AndroidFusedLocationProviderType$MobileServicesClient.Huawei, AndroidFusedLocationProviderType$MobileServicesClient.Google, p92Var) : scc.g(AndroidFusedLocationProviderType$MobileServicesClient.Google, AndroidFusedLocationProviderType$MobileServicesClient.Huawei, p92Var), null, K2, false, 160);
            }
            androidLocationUpdatesRequest$Quality = AndroidLocationUpdatesRequest$Quality.BALANCED_POWER_ACCURACY;
            AndroidLocationUpdatesRequest$Quality androidLocationUpdatesRequest$Quality22 = androidLocationUpdatesRequest$Quality;
            boolean z22 = providerConfigDto$FusedDto.g;
            la2 K22 = K(providerConfigDto$FusedDto.d);
            e3n e3nVar22 = new e3n(V2);
            double d22 = u1kVar == null ? u1kVar.a : 0.0d;
            p92 p92Var2 = p92.a;
            na2Var = new na2(e3nVar22, e3nVar, d22, androidLocationUpdatesRequest$Quality22, !z22 ? scc.g(AndroidFusedLocationProviderType$MobileServicesClient.Huawei, AndroidFusedLocationProviderType$MobileServicesClient.Google, p92Var2) : scc.g(AndroidFusedLocationProviderType$MobileServicesClient.Google, AndroidFusedLocationProviderType$MobileServicesClient.Huawei, p92Var2), null, K22, false, 160);
        } else {
            na2Var = null;
        }
        ProviderConfigDto$AndroidDto providerConfigDto$AndroidDto3 = providerConfigSetDto.c;
        na2 J4 = providerConfigDto$AndroidDto3 != null ? J(providerConfigDto$AndroidDto3, AndroidLocationProviderType.PASSIVE) : null;
        boolean z3 = providerConfigSetDto.e;
        zy11 zy11Var = zy11.a;
        return new cyv(J2, J3, na2Var, J4, z3 ? zy11Var : null, providerConfigSetDto.f ? zy11Var : null);
    }

    public static int M(okj okjVar, Scale scale) {
        if (okjVar instanceof kkj) {
            return ((kkj) okjVar).a;
        }
        int i2 = yxg.a[scale.ordinal()];
        if (i2 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i2 == 2) {
            return Integer.MAX_VALUE;
        }
        w511.b();
        return 0;
    }

    public static nps0 N(gal galVar, DisplayMetrics displayMetrics, nml nmlVar, rvo rvoVar) {
        Number valueOf;
        jnk jnkVar;
        jnk jnkVar2;
        Expression expression = galVar.b;
        x4l x4lVar = galVar.h;
        long longValue = ((Number) expression.a(rvoVar)).longValue();
        Expression expression2 = galVar.a;
        Integer num = null;
        lml a2 = nmlVar.a(expression2 != null ? (String) expression2.a(rvoVar) : null);
        a2.getClass();
        int i2 = o05.a[((DivSizeUnit) galVar.c.a(rvoVar)).ordinal()];
        if (i2 == 1) {
            valueOf = Integer.valueOf(a.o(Long.valueOf(longValue), displayMetrics));
        } else if (i2 == 2) {
            valueOf = Integer.valueOf(a.D(Long.valueOf(longValue), displayMetrics));
        } else {
            if (i2 != 3) {
                w511.b();
                return null;
            }
            valueOf = Long.valueOf(longValue);
        }
        float floatValue = valueOf.floatValue();
        float doubleValue = ((float) ((Number) galVar.g.a(rvoVar)).doubleValue()) / longValue;
        Expression expression3 = galVar.e;
        DivFontWeight divFontWeight = expression3 != null ? (DivFontWeight) expression3.a(rvoVar) : null;
        Expression expression4 = galVar.f;
        if (expression4 != null) {
            long longValue2 = ((Number) expression4.a(rvoVar)).longValue();
            long j2 = longValue2 >> 31;
            num = Integer.valueOf((j2 == 0 || j2 == -1) ? (int) longValue2 : longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
        }
        Typeface d2 = a2.d(qje.x(divFontWeight, num));
        if (d2 == null) {
            d2 = Typeface.DEFAULT;
        }
        Typeface typeface = d2;
        float f2 = 0.0f;
        float G2 = (x4lVar == null || (jnkVar2 = x4lVar.a) == null) ? 0.0f : a.G(jnkVar2, displayMetrics, rvoVar);
        if (x4lVar != null && (jnkVar = x4lVar.b) != null) {
            f2 = a.G(jnkVar, displayMetrics, rvoVar);
        }
        return new nps0(floatValue, doubleValue, typeface, G2, f2, ((Number) galVar.i.a(rvoVar)).intValue());
    }

    public static final double O(long j2) {
        return ((j2 >>> 11) * 2048.0d) + (j2 & 2047);
    }

    public static final String P(int i2, long j2) {
        if (j2 >= 0) {
            rza.a(i2);
            return Long.toString(j2, i2);
        }
        long j3 = i2;
        long j4 = ((j2 >>> 1) / j3) << 1;
        long j5 = j2 - (j4 * j3);
        if (j5 >= j3) {
            j5 -= j3;
            j4++;
        }
        rza.a(i2);
        String l2 = Long.toString(j4, i2);
        rza.a(i2);
        return l2.concat(Long.toString(j5, i2));
    }

    public static final void Q(ContextThemeWrapper contextThemeWrapper, int i2) {
        if (Build.VERSION.SDK_INT >= 34) {
            contextThemeWrapper.setTheme((Resources.Theme) null);
        }
        contextThemeWrapper.setTheme(i2);
    }

    public static void R(int i2, int i3) {
        String j2;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                j2 = coa1.j("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    ny61.g(oyr.i(i3, "negative size: "));
                    return;
                }
                j2 = coa1.j("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(j2);
        }
    }

    public static void S(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? T(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? T(i3, i4, "end index") : coa1.j("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public static String T(int i2, int i3, String str) {
        if (i2 < 0) {
            return coa1.j("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return coa1.j("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        ny61.g(oyr.i(i3, "negative size: "));
        return null;
    }

    public static final w5e a(Context context) {
        Context applicationContext = context.getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null && qke.h(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return new x5e(connectivityManager);
            } catch (Exception unused) {
            }
        }
        return w5e.a;
    }

    public static final void b(View view, Runnable runnable, Runnable runnable2, boolean z2, long j2, NavigationDirection navigationDirection) {
        if (view.getHeight() <= 0 || navigationDirection == NavigationDirection.NO_ANIMATE) {
            runnable.run();
            runnable2.run();
            return;
        }
        float width = view.getWidth();
        int i2 = tu31.a[navigationDirection.ordinal()];
        if (i2 == 1) {
            if (!z2) {
                width = -width;
                cma1.g(width, view).setDuration(j2).setListener(new AnimUtils$AnimationStartEndListener(runnable, runnable2));
            } else {
                view.setTranslationX(width);
                width = 0.0f;
                cma1.g(width, view).setDuration(j2).setListener(new AnimUtils$AnimationStartEndListener(runnable, runnable2));
            }
        }
        if (i2 != 2) {
            if (i2 != 3) {
                w511.b();
                return;
            } else {
                ny61.r("not possible due to early check");
                return;
            }
        }
        if (z2) {
            view.setTranslationX(-width);
            width = 0.0f;
        }
        cma1.g(width, view).setDuration(j2).setListener(new AnimUtils$AnimationStartEndListener(runnable, runnable2));
    }

    public static void c(View view, Runnable runnable, Runnable runnable2, NavigationDirection navigationDirection, int i2) {
        if ((i2 & 8) != 0) {
            navigationDirection = NavigationDirection.BACKWARD;
        }
        b(view, runnable, runnable2, false, 200L, navigationDirection);
    }

    public static void d(View view, Runnable runnable, Runnable runnable2, NavigationDirection navigationDirection, int i2) {
        if ((i2 & 8) != 0) {
            navigationDirection = NavigationDirection.FORWARD;
        }
        b(view, runnable, runnable2, true, 200L, navigationDirection);
    }

    public static final ncx e(Decoder decoder) {
        ncx ncxVar = decoder instanceof ncx ? (ncx) decoder : null;
        if (ncxVar != null) {
            return ncxVar;
        }
        yci0.t(qoi0.a(decoder.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    public static final vcx f(Encoder encoder) {
        vcx vcxVar = encoder instanceof vcx ? (vcx) encoder : null;
        if (vcxVar != null) {
            return vcxVar;
        }
        yci0.t(qoi0.a(encoder.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
        return null;
    }

    public static int g(long j2, DivSizeUnit divSizeUnit, DisplayMetrics displayMetrics) {
        int i2 = ial.a[divSizeUnit.ordinal()];
        if (i2 == 1) {
            return a.o(Long.valueOf(j2), displayMetrics);
        }
        if (i2 == 2) {
            return a.D(Long.valueOf(j2), displayMetrics);
        }
        if (i2 == 3) {
            long j3 = j2 >> 31;
            return (j3 == 0 || j3 == -1) ? (int) j2 : j2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        w511.b();
        return 0;
    }

    public static void h(Object obj, Object obj2) {
        if (obj == null) {
            ny61.t(qv10.o("null key in entry: null=", obj2));
        } else {
            if (obj2 != null) {
                return;
            }
            ny61.t(qv10.p("null value in entry: ", "=null", obj));
        }
    }

    public static void i(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        ny61.g(qv10.h(i2, str, " cannot be negative but was: "));
    }

    public static final void j(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            w511.f(i2 != i3 ? b64.d(i2, i3, "Both size ", " and step ", " must be greater than zero.") : oyr.j(i2, "size ", " must be greater than zero."));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long k(jci0 jci0Var, ByteString byteString, int i2, long j2, long j3) {
        long j4;
        yp6 yp6Var = jci0Var.b;
        int i3 = i2;
        long j5 = i3;
        j.b(byteString.h(), 0L, j5);
        if (!jci0Var.c) {
            long j6 = j2;
            while (true) {
                long a2 = b.a(jci0Var.b, byteString, j6, j3, i3);
                long j7 = -1;
                if (a2 == -1) {
                    long j8 = yp6Var.b;
                    long j9 = (j8 - j5) + 1;
                    if (j9 >= j3) {
                        break;
                    }
                    if (j8 >= j3) {
                        int max = (int) Math.max(1L, (j8 - j3) + 1);
                        int min = ((int) Math.min(j5, (yp6Var.b - j6) + 1)) - 1;
                        if (max > min) {
                            break;
                        }
                        while (true) {
                            j4 = j7;
                            if (yp6Var.v(min, yp6Var.b - min, byteString)) {
                                break;
                            }
                            if (min == max) {
                                return j4;
                            }
                            min--;
                            j7 = j4;
                        }
                    } else {
                        j4 = -1;
                    }
                    if (jci0Var.a.read(yp6Var, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == j4) {
                        return j4;
                    }
                    j6 = Math.max(j6, j9);
                    i3 = i2;
                } else {
                    return a2;
                }
            }
        } else {
            ny61.r("closed");
            return 0L;
        }
    }

    public static final long l(int i2, int i3, xis0 xis0Var, Scale scale, xis0 xis0Var2) {
        int i4;
        int i5;
        if (!jl40.l(xis0Var, xis0.c)) {
            i2 = M(xis0Var.a, scale);
            i3 = M(xis0Var.b, scale);
        }
        okj okjVar = xis0Var2.a;
        okj okjVar2 = xis0Var2.b;
        if ((okjVar instanceof kkj) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i5 = ((kkj) okjVar).a)) {
            i2 = i5;
        }
        if ((okjVar2 instanceof kkj) && i3 != Integer.MIN_VALUE && i3 != Integer.MAX_VALUE && i3 > (i4 = ((kkj) okjVar2).a)) {
            i3 = i4;
        }
        return (i3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (i2 << 32);
    }

    public static final double m(int i2, int i3, int i4, int i5, Scale scale, xis0 xis0Var) {
        double max;
        double d2 = i2;
        double d3 = i4 / d2;
        double d4 = i3;
        double d5 = i5 / d4;
        int i6 = yxg.a[scale.ordinal()];
        if (i6 == 1) {
            max = Math.max(d3, d5);
        } else {
            if (i6 != 2) {
                w511.b();
                return 0.0d;
            }
            max = Math.min(d3, d5);
        }
        if (xis0Var.a instanceof kkj) {
            double d6 = ((kkj) r9).a / d2;
            if (max > d6) {
                max = d6;
            }
        }
        if (xis0Var.b instanceof kkj) {
            double d7 = ((kkj) r9).a / d4;
            if (max > d7) {
                return d7;
            }
        }
        return max;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:58|(1:(2:60|(1:113)(1:64))(2:115|116))|(4:108|109|(8:82|83|(1:(3:85|(1:103)(1:(1:91)(2:88|89))|90)(2:104|(1:106)))|92|(1:102)(1:96)|97|(1:99)|101)|(1:71)(2:72|(1:78)(2:80|81)))|66|(1:68)|82|83|(2:(0)(0)|90)|92|(1:94)|102|97|(0)|101|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00e1, code lost:
    
        if (r12 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00a1, code lost:
    
        if (r11 == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0146 A[Catch: NoSuchFieldException -> 0x0176, TryCatch #2 {NoSuchFieldException -> 0x0176, blocks: (B:83:0x013b, B:85:0x0146, B:94:0x0163, B:96:0x0169, B:97:0x016f, B:99:0x0173, B:90:0x015b), top: B:82:0x013b }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0173 A[Catch: NoSuchFieldException -> 0x0176, TRY_LEAVE, TryCatch #2 {NoSuchFieldException -> 0x0176, blocks: (B:83:0x013b, B:85:0x0146, B:94:0x0163, B:96:0x0169, B:97:0x016f, B:99:0x0173, B:90:0x015b), top: B:82:0x013b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KSerializer n(Class cls, KSerializer... kSerializerArr) {
        Object obj;
        KSerializer kSerializer;
        Field field;
        Object obj2;
        KSerializer kSerializer2;
        int length;
        int i2;
        Object obj3;
        Field field2;
        gsq0 gsq0Var;
        if (cls.isEnum() && cls.getAnnotation(gsq0.class) == null && cls.getAnnotation(p5e0.class) == null) {
            return new o4o(cls.getCanonicalName(), (Enum[]) cls.getEnumConstants());
        }
        KSerializer[] kSerializerArr2 = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        KSerializer v2 = obj == null ? null : v(obj, (KSerializer[]) Arrays.copyOf(kSerializerArr2, kSerializerArr2.length));
        if (v2 != null) {
            return v2;
        }
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null && !cvu0.x(canonicalName, "java.", false) && !cvu0.x(canonicalName, "kotlin.", false)) {
            Field[] declaredFields = cls.getDeclaredFields();
            int length2 = declaredFields.length;
            Field field3 = null;
            int i3 = 0;
            boolean z2 = false;
            while (true) {
                if (i3 < length2) {
                    Field field4 = declaredFields[i3];
                    if (jl40.l(field4.getName(), "INSTANCE") && jl40.l(field4.getType(), cls) && Modifier.isStatic(field4.getModifiers())) {
                        if (z2) {
                            break;
                        }
                        z2 = true;
                        field3 = field4;
                    }
                    i3++;
                }
            }
            field3 = null;
            if (field3 != null) {
                Object obj4 = field3.get(null);
                Method[] methods = cls.getMethods();
                int length3 = methods.length;
                Method method = null;
                int i4 = 0;
                boolean z3 = false;
                while (true) {
                    if (i4 < length3) {
                        Method method2 = methods[i4];
                        if (jl40.l(method2.getName(), "serializer") && method2.getParameterTypes().length == 0 && jl40.l(method2.getReturnType(), KSerializer.class)) {
                            if (z3) {
                                break;
                            }
                            z3 = true;
                            method = method2;
                        }
                        i4++;
                    }
                }
                method = null;
                if (method != null) {
                    Object invoke = method.invoke(obj4, null);
                    if (invoke instanceof KSerializer) {
                        kSerializer = (KSerializer) invoke;
                        if (kSerializer == null) {
                            return kSerializer;
                        }
                        KSerializer[] kSerializerArr3 = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
                        Field[] declaredFields2 = cls.getDeclaredFields();
                        int length4 = declaredFields2.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length4) {
                                field = null;
                                break;
                            }
                            field = declaredFields2[i5];
                            if (Modifier.isStatic(field.getModifiers()) && field.getType().getAnnotation(r150.class) != null) {
                                break;
                            }
                            i5++;
                        }
                        if (field != null) {
                            try {
                                field.setAccessible(true);
                                obj2 = field.get(null);
                            } catch (Throwable unused2) {
                            }
                            if (obj2 != null || (kSerializer2 = v(obj2, (KSerializer[]) Arrays.copyOf(kSerializerArr3, kSerializerArr3.length))) == null) {
                                Class<?>[] declaredClasses = cls.getDeclaredClasses();
                                length = declaredClasses.length;
                                Class<?> cls2 = null;
                                i2 = 0;
                                boolean z4 = false;
                                while (true) {
                                    if (i2 >= length) {
                                        Class<?> cls3 = declaredClasses[i2];
                                        if (cls3.getSimpleName().equals("$serializer")) {
                                            if (z4) {
                                                break;
                                            }
                                            z4 = true;
                                            cls2 = cls3;
                                        }
                                        i2++;
                                    } else if (!z4) {
                                    }
                                }
                                cls2 = null;
                                obj3 = (cls2 != null || (field2 = cls2.getField("INSTANCE")) == null) ? null : field2.get(null);
                                if (obj3 instanceof KSerializer) {
                                    kSerializer2 = (KSerializer) obj3;
                                }
                                kSerializer2 = null;
                            }
                            if (kSerializer2 == null) {
                                return kSerializer2;
                            }
                            if (cls.getAnnotation(p5e0.class) == null && ((gsq0Var = (gsq0) cls.getAnnotation(gsq0.class)) == null || !qoi0.a(gsq0Var.with()).equals(qoi0.a(v5e0.class)))) {
                                return null;
                            }
                            return new v5e0(qoi0.a(cls));
                        }
                        obj2 = null;
                        if (obj2 != null) {
                        }
                        Class<?>[] declaredClasses2 = cls.getDeclaredClasses();
                        length = declaredClasses2.length;
                        Class<?> cls22 = null;
                        i2 = 0;
                        boolean z42 = false;
                        while (true) {
                            if (i2 >= length) {
                            }
                            i2++;
                        }
                        cls22 = null;
                        if (cls22 != null) {
                        }
                        if (obj3 instanceof KSerializer) {
                        }
                        kSerializer2 = null;
                        if (kSerializer2 == null) {
                        }
                    }
                }
            }
        }
        kSerializer = null;
        if (kSerializer == null) {
        }
    }

    public static String o(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            bArr2[i2] = (byte) (bArr[i2] ^ c[i2 % 8]);
        }
        return new String(bArr2, uza.a);
    }

    public static final List p(vo2 vo2Var) {
        ovu ovuVar = (ovu) vo2Var.f.c(ovu.c);
        if (ovuVar != null) {
            return ovuVar.b;
        }
        return null;
    }

    public static m5z q(Configuration configuration) {
        return m5z.e(configuration.getLocales());
    }

    public static final String r(List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((hvu) obj).a, "X-Request-Id")) {
                break;
            }
        }
        hvu hvuVar = (hvu) obj;
        if (hvuVar != null) {
            return hvuVar.b;
        }
        return null;
    }

    public static final t5o s(vo2 vo2Var) {
        List list = vo2Var.d;
        if (list != null) {
            return (t5o) kotlin.collections.a.R(list);
        }
        return null;
    }

    public static final String t(List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((hvu) obj).a, "X-Yandex-Plus-SessionId")) {
                break;
            }
        }
        hvu hvuVar = (hvu) obj;
        if (hvuVar != null) {
            return hvuVar.b;
        }
        return null;
    }

    public static final jyj0 u(ihg0 ihg0Var, String str) {
        return new jyj0(new jhg0(ihg0Var, str));
    }

    public static final KSerializer v(Object obj, KSerializer... kSerializerArr) {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i2 = 0; i2 < length; i2++) {
                    clsArr2[i2] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (invoke instanceof KSerializer) {
                return (KSerializer) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                throw e2;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e2.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final boolean w(lfx lfxVar) {
        return ((zzb) lfxVar).a().isInterface();
    }

    public static final void x(uvo uvoVar, aok aokVar, rvo rvoVar, tls tlsVar) {
        if (aokVar == null || !(aokVar instanceof znk)) {
            return;
        }
        u8l u8lVar = ((znk) aokVar).b;
        uvoVar.addSubscription(u8lVar.a.c(rvoVar, tlsVar));
        D(uvoVar, u8lVar.b, rvoVar, tlsVar);
        F(uvoVar, u8lVar.c, rvoVar, tlsVar);
    }

    public static final void y(uvo uvoVar, DivEdgeInsets divEdgeInsets, rvo rvoVar, tls tlsVar) {
        if (divEdgeInsets == null) {
            return;
        }
        Expression expression = divEdgeInsets.b;
        uvoVar.addSubscription(divEdgeInsets.f.c(rvoVar, tlsVar));
        uvoVar.addSubscription(divEdgeInsets.a.c(rvoVar, tlsVar));
        Expression expression2 = divEdgeInsets.e;
        if (expression2 == null && expression == null) {
            uvoVar.addSubscription(divEdgeInsets.c.c(rvoVar, tlsVar));
            uvoVar.addSubscription(divEdgeInsets.d.c(rvoVar, tlsVar));
        } else {
            uvoVar.addSubscription(expression2 != null ? expression2.c(rvoVar, tlsVar) : null);
            uvoVar.addSubscription(expression != null ? expression.c(rvoVar, tlsVar) : null);
        }
    }

    public static final void z(uvo uvoVar, sqk sqkVar, rvo rvoVar, tls tlsVar) {
        if (sqkVar == null) {
            return;
        }
        uvoVar.addSubscription(sqkVar.b.c(rvoVar, tlsVar));
        uvoVar.addSubscription(sqkVar.a.c(rvoVar, tlsVar));
    }
}
