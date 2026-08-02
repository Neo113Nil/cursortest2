package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.s;
import coil3.request.ViewTargetRequestManager;
import com.adjust.sdk.Constants;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivFontWeight;
import com.yandex.plus.core.graphql.type.CONSUMER_TYPE;
import com.yandex.plus.core.graphql.type.THEME;
import jason.statham.interpreter.error.a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonEncodingException;
import okio.SegmentedByteString;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.CryptoPro.JCP.ASN.PKIXCMP.PKIBody;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes8.dex */
public abstract class qje {
    public static final seu a = new seu(17);
    public static final byte[] b = {96, 109, 24, Alerts.alert_no_renegotiation, -117, 96, -6, Alerts.alert_insufficient_security};
    public static final byte[] c = {22, 92, 55, PKIBody._CKUANN, -7, 1, -108, 52, 6, 8, 106, 23, -92, 22, -55, 104, 20, 4, 104, 23, -92, PKIBody._CKUANN, -110, Alerts.alert_handshake_failure, PKIBody._CCR, 8, 55, 7, -29, 5, -103, Alerts.alert_certificate_revoked, 63, 24, 107, 1, -7, 63, -104, 38, PKIBody._CCR, 6};
    public static final byte[] d = {56, DerValue.TAG_APPLICATION, 65, 5, -55, 1, -108, Alerts.alert_certificate_revoked, 77, Alerts.alert_certificate_unknown, 119, 8, -28, 18, -82, Alerts.alert_illegal_parameter, 5, 0, 125};
    public static final byte[] e = {56, DerValue.TAG_APPLICATION, 65, 5, -55, 1, -108, Alerts.alert_certificate_revoked, 77, 35, 126, 7, -90, 36, -97, BlobHeaderStructure.KEXP15_BLOB_VERSION, 1, 24, 116, PKIBody._CKUANN, -90, 48, -120, Alerts.alert_handshake_failure, 4, 24, 123, PKIBody._CKUANN, -90, 52, -125, 55, 5};
    public static final byte[] f = {56, DerValue.TAG_APPLICATION, 65, 5, -55, 1, -108, Alerts.alert_certificate_revoked, 77, 62, 125, 23, -8, 9, -107, Alerts.alert_no_certificate, 53, 56, 81, BlobHeaderStructure.BLOB_VERSION};
    public static final byte[] g = {56, DerValue.TAG_APPLICATION, 65, 5, -55, 1, -108, Alerts.alert_certificate_revoked, 77, 34, 104, 1, -7, 1, -114, Alerts.alert_certificate_unknown, PKIBody._CCP, 3, 53, Alerts.alert_certificate_expired, -17};
    public static final byte[] h = {56, DerValue.TAG_APPLICATION, 65, 5, -55, 1, -108, Alerts.alert_certificate_revoked, 77, 37, 119, 23, -1, 77, -77, Alerts.alert_no_certificate, 6, 2};
    public static final byte[] i = {56, DerValue.TAG_APPLICATION, 65, 5, -55, 1, -108, Alerts.alert_certificate_revoked, 77, 35, 126, 7, -90, 36, -97, BlobHeaderStructure.KEXP15_BLOB_VERSION, 1, 24, 116, PKIBody._CKUANN};
    public static final byte[] j = {56, DerValue.TAG_APPLICATION, 65, 5, -55, 1, -108, Alerts.alert_certificate_revoked, 77, 57, Alerts.alert_bad_certificate_status_response, 9, -18, 77, -96, Alerts.alert_handshake_failure, PKIBody._CCR, 8};
    public static final byte[] k = {56, DerValue.TAG_APPLICATION, 65, 5, -55, 1, -108, Alerts.alert_certificate_revoked, 77, 35, 126, 7, -90, 52, -107, Alerts.alert_certificate_revoked, 5, 3, Alerts.alert_bad_certificate_status_response, 30, -18, 4, -41, 23, 18, 2, 124, PKIBody._CANN, -24, 20, -41, 19, 25, 29, 125, 23};
    public static final byte[] l = {56, DerValue.TAG_APPLICATION, 65, 5, -55, 1, -108, Alerts.alert_certificate_revoked, 77, 59, 125, 22, -30, 6, -109, 36, 1, 25, Alerts.alert_bad_certificate_status_response, PKIBody._KRP, -27, 77, -82, Alerts.alert_handshake_failure, PKIBody._KRP, 8, 118};
    public static final byte[] m = {56, DerValue.TAG_APPLICATION, 65, 5, -55, 1, -108, Alerts.alert_certificate_revoked, 77, 35, 126, 7, -90, BlobHeaderStructure.KEXP15_BLOB_VERSION, -116, 38, 9, 1, 121, 6, -25, 5};
    public static final byte[] n = {24, DerValue.TAG_APPLICATION, 97, 5, -1, 18, -101, 36, 5, 4, 124};
    public static final byte[] o = {22, 92, 55, PKIBody._CKUANN, -7, 1, -108, 52, 6, 8, 106, 23, -92, 22, -55, 104, PKIBody._CKUANN, 5, 119, 10, -18, 79, -103, Alerts.alert_illegal_parameter, 5, PKIBody._CCR, 115, 59, -2, 19, -97, 53, 63, PKIBody._CCP, 121, 10, -32};
    public static final byte[] p = {56, DerValue.TAG_APPLICATION, 65, 5, -55, 1, -108, Alerts.alert_certificate_revoked, 77, 35, 126, 7, -90, Alerts.alert_decrypt_error, -97, Alerts.alert_decrypt_error, 21, 29};
    public static final byte[] q = {22, 92, 55, 1, -13, 20, -97, 53, PKIBody._CCR, 12, 116, 59, -23, 1, -108, Alerts.alert_certificate_revoked, 63, 29, 121, 29, -26, 5, -108, Alerts.alert_decrypt_error, 19, 66, 106, 1, -6, 21, -97, 52, 20, 66, 107, PKIBody._CKUANN, -22, 20, -113, 52};
    public static final tms r = new tms(7);

    public static /* synthetic */ void A(b8 b8Var) {
        z(b8Var, "object");
        throw null;
    }

    public static final boolean B(Expression expression) {
        return expression == null || (expression instanceof kvo);
    }

    public static boolean C(String str, AttributeSet attributeSet) {
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", str);
        return attributeValue != null && cvu0.x(attributeValue, "?", false);
    }

    public static final boolean D(Context context) {
        Object failure;
        String installerPackageName;
        InstallSourceInfo installSourceInfo;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                installSourceInfo = context.getPackageManager().getInstallSourceInfo(context.getPackageName());
                installerPackageName = installSourceInfo.getInstallingPackageName();
            } else {
                installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            }
            failure = Boolean.valueOf(installerPackageName != null);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            failure = Boolean.FALSE;
        }
        return ((Boolean) failure).booleanValue();
    }

    public static final String E(String str) {
        if ((str == null ? "" : str).equals("es-la")) {
            return "es-la";
        }
        if (str == null || evu0.J(str)) {
            return "und";
        }
        i3y i3yVar = u5z.a;
        return !((Regex) u5z.a.getValue()).h(str) ? "und" : jl40.l(str, "iw") ? "he" : jl40.l(str, "in") ? "id" : jl40.l(str, "ji") ? "yi" : jl40.l(str, "es") ? "es-la" : (jl40.l(str, "nn") || jl40.l(str, "nb")) ? "no" : str;
    }

    public static final pax0 F(pax0 pax0Var) {
        return pax0.a(pax0Var, c0(THEME.LIGHT));
    }

    public static final CharSequence G(int i2, CharSequence charSequence) {
        if (charSequence.length() >= 200) {
            if (i2 != -1) {
                int i3 = i2 - 30;
                int i4 = i2 + 30;
                String str = i3 <= 0 ? "" : ".....";
                String str2 = i4 >= charSequence.length() ? "" : ".....";
                StringBuilder t = qv10.t(str);
                if (i3 < 0) {
                    i3 = 0;
                }
                int length = charSequence.length();
                if (i4 > length) {
                    i4 = length;
                }
                t.append(charSequence.subSequence(i3, i4).toString());
                t.append(str2);
                return t.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List H(ows0 ows0Var, int i2, ows0 ows0Var2, boolean z, boolean z2, boolean z3) {
        EmptyList emptyList;
        boolean z4;
        int i3;
        int i4;
        int u = ows0Var.u(i2);
        int i5 = i2 + u;
        int f2 = ows0Var.f(i2);
        int f3 = ows0Var.f(i5);
        int i6 = f3 - f2;
        boolean z5 = i2 >= 0 && (ows0Var.b[(ows0Var.r(i2) * 5) + 1] & 201326592) != 0;
        ows0Var2.w(u);
        ows0Var2.x(i6, ows0Var2.t);
        if (ows0Var.g < i5) {
            ows0Var.B(i5);
        }
        if (ows0Var.k < f3) {
            ows0Var.C(f3, i5);
        }
        int[] iArr = ows0Var2.b;
        int i7 = ows0Var2.t;
        int i8 = i7 * 5;
        f73.d(i8, i2 * 5, i5 * 5, ows0Var.b, iArr);
        Object[] objArr = ows0Var2.c;
        int i9 = ows0Var2.i;
        System.arraycopy(ows0Var.c, f2, objArr, i9, i6);
        int i10 = ows0Var2.v;
        iArr[i8 + 2] = i10;
        int i11 = i7 - i2;
        int i12 = i7 + u;
        int g2 = i9 - ows0Var2.g(i7, iArr);
        int i13 = ows0Var2.m;
        int i14 = ows0Var2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i15 = i13;
        int i16 = i7;
        while (i16 < i12) {
            if (i16 != i7) {
                int i17 = (i16 * 5) + 2;
                iArr[i17] = iArr[i17] + i11;
            }
            int[] iArr2 = iArr;
            int g3 = ows0Var2.g(i16, iArr) + g2;
            if (i15 < i16) {
                i3 = i7;
                i4 = 0;
            } else {
                i3 = i7;
                i4 = ows0Var2.k;
            }
            iArr2[(i16 * 5) + 4] = ows0.i(g3, i4, i14, length);
            if (i16 == i15) {
                i15++;
            }
            i16++;
            i7 = i3;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        ows0Var2.m = i15;
        int b2 = uus0.b(i2, ows0Var.p(), ows0Var.d);
        int b3 = uus0.b(i5, ows0Var.p(), ows0Var.d);
        if (b2 < b3) {
            ArrayList arrayList = ows0Var.d;
            ArrayList arrayList2 = new ArrayList(b3 - b2);
            for (int i18 = b2; i18 < b3; i18++) {
                yss yssVar = (yss) arrayList.get(i18);
                yssVar.a += i11;
                arrayList2.add(yssVar);
            }
            ows0Var2.d.addAll(uus0.b(ows0Var2.t, ows0Var2.p(), ows0Var2.d), arrayList2);
            arrayList.subList(b2, b3).clear();
            emptyList = arrayList2;
        } else {
            emptyList = EmptyList.a;
        }
        EmptyList emptyList2 = emptyList;
        if (!emptyList2.isEmpty()) {
            HashMap hashMap = ows0Var.e;
            HashMap hashMap2 = ows0Var2.e;
            if (hashMap != null && hashMap2 != null) {
                int size = emptyList2.size();
                for (int i19 = 0; i19 < size; i19++) {
                }
            }
        }
        int i20 = ows0Var2.v;
        ows0Var2.Q(i10);
        int G = ows0Var.G(i2, ows0Var.b);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = G >= 0;
            if (z7) {
                ows0Var.R();
                ows0Var.a(G - ows0Var.t);
                ows0Var.R();
            }
            ows0Var.a(i2 - ows0Var.t);
            boolean J = ows0Var.J();
            if (z7) {
                ows0Var.O();
                ows0Var.j();
                ows0Var.O();
                ows0Var.j();
            }
            z4 = J;
        } else {
            boolean K = ows0Var.K(i2, u);
            ows0Var.L(f2, i6, i2 - 1);
            z4 = K;
        }
        if (z4) {
            lid.a("Unexpectedly removed anchors");
        }
        int i21 = ows0Var2.o;
        int i22 = iArr3[i8 + 1];
        ows0Var2.o = i21 + ((1073741824 & i22) != 0 ? 1 : i22 & 67108863);
        if (z2) {
            ows0Var2.t = i12;
            ows0Var2.i = i9 + i6;
        }
        if (z6) {
            ows0Var2.W(i10);
        }
        return emptyList;
    }

    public static final String I(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return oyr.t(sb, str != null ? oyr.p(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    public static void J(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static rq60 K(tls tlsVar) {
        return new rq60(null, tlsVar);
    }

    public static final Object L(xdx xdxVar) {
        JsonReader$Token peek = xdxVar.peek();
        switch (wo2.a[peek.ordinal()]) {
            case 1:
                xdxVar.B0();
                return null;
            case 2:
                return Boolean.valueOf(xdxVar.nextBoolean());
            case 3:
            case 4:
                try {
                    try {
                        try {
                            return Integer.valueOf(xdxVar.nextInt());
                        } catch (Exception unused) {
                            return xdxVar.J0();
                        }
                    } catch (Exception unused2) {
                        return Long.valueOf(xdxVar.nextLong());
                    }
                } catch (Exception unused3) {
                    return Double.valueOf(xdxVar.nextDouble());
                }
            case 5:
                return xdxVar.nextString();
            case 6:
                xdxVar.u();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (xdxVar.hasNext()) {
                    linkedHashMap.put(xdxVar.nextName(), L(xdxVar));
                }
                xdxVar.y();
                return linkedHashMap;
            case 7:
                ArrayList z = oyr.z(xdxVar);
                while (xdxVar.hasNext()) {
                    z.add(L(xdxVar));
                }
                xdxVar.j();
                return z;
            default:
                yhl.d(peek, "unknown token ");
                return null;
        }
    }

    public static final void M(fid fidVar, tls tlsVar) {
        ((bts) fidVar).i(zy11.a, new jid(11, tlsVar));
    }

    public static final s N(cqh cqhVar, int i2) {
        s coordinator$ui = cqhVar.getNode().getCoordinator$ui();
        return (coordinator$ui.b1() == cqhVar && ce60.h(i2)) ? coordinator$ui.J : coordinator$ui;
    }

    public static final s O(cqh cqhVar) {
        if (!cqhVar.getNode().isAttached()) {
            ixv.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        s N = N(cqhVar, 2);
        if (!N.d()) {
            ixv.b("LayoutCoordinates is not attached.");
        }
        return N;
    }

    public static final LayoutNode P(cqh cqhVar) {
        s coordinator$ui = cqhVar.getNode().getCoordinator$ui();
        if (coordinator$ui != null) {
            return coordinator$ui.I;
        }
        throw x4e.v("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final m390 Q(cqh cqhVar) {
        m390 m390Var = P(cqhVar).G;
        if (m390Var != null) {
            return m390Var;
        }
        throw x4e.v("This node does not have an owner.");
    }

    public static final void R(AttributeSet attributeSet, String str, int i2, Consumer consumer, Consumer consumer2) {
        int q2;
        if (C(str, attributeSet) && (q2 = q(attributeSet, "http://schemas.android.com/apk/res-auto", str)) != 0) {
            consumer.accept(Integer.valueOf(q2));
            return;
        }
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", str);
        if (attributeValue != null) {
            int i3 = 0;
            if (cvu0.x(attributeValue, "@", false)) {
                String attributeValue2 = attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", str);
                if (attributeValue2 != null && cvu0.x(attributeValue2, "@", false)) {
                    i3 = Integer.valueOf(cvu0.v(attributeValue2, "@", "", false)).intValue();
                }
                if (i3 != 0) {
                    consumer2.accept(Integer.valueOf(i3));
                    return;
                }
            }
        }
        consumer.accept(Integer.valueOf(i2));
    }

    public static final void S(AttributeSet attributeSet, TypedArray typedArray, String str, int i2, int i3, Consumer consumer, Consumer consumer2) {
        int resourceId;
        int q2;
        int q3;
        boolean C = C(str, attributeSet);
        if (C && (q3 = q(attributeSet, "http://schemas.android.com/apk/res-auto", str)) != 0) {
            consumer.accept(Integer.valueOf(q3));
            return;
        }
        if (evu0.y(str, "android:", false) && (q2 = q(attributeSet, "http://schemas.android.com/apk/res/android", cvu0.v(str, "android:", "", false))) != 0) {
            consumer.accept(Integer.valueOf(q2));
        } else if (C || (resourceId = typedArray.getResourceId(i2, 0)) == 0) {
            consumer.accept(Integer.valueOf(i3));
        } else {
            consumer2.accept(Integer.valueOf(resourceId));
        }
    }

    public static final kdc T(AttributeSet attributeSet, TypedArray typedArray, String str, int i2, Integer num) {
        int resourceId;
        int q2;
        boolean C = C(str, attributeSet);
        if (C && (q2 = q(attributeSet, "http://schemas.android.com/apk/res-auto", str)) != 0) {
            return new bdc(q2);
        }
        if (!C && (resourceId = typedArray.getResourceId(i2, 0)) != 0) {
            return new gdc(resourceId);
        }
        if (num != null) {
            return new bdc(num.intValue());
        }
        return null;
    }

    public static final int U(SegmentedByteString segmentedByteString, int i2) {
        int i3;
        int[] iArr = segmentedByteString.x;
        int i4 = i2 + 1;
        int length = segmentedByteString.w.length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= length) {
                i3 = (i5 + length) >>> 1;
                int i6 = iArr[i3];
                if (i6 >= i4) {
                    if (i6 <= i4) {
                        break;
                    }
                    length = i3 - 1;
                } else {
                    i5 = i3 + 1;
                }
            } else {
                i3 = (-i5) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }

    public static final u1m V(e3m e3mVar) {
        if (e3mVar instanceof a3m) {
            return ((a3m) e3mVar).c;
        }
        if (e3mVar instanceof b3m) {
            return ((b3m) e3mVar).c;
        }
        if (e3mVar instanceof c3m) {
            return ((c3m) e3mVar).c;
        }
        if (e3mVar instanceof d3m) {
            return ((d3m) e3mVar).c;
        }
        if (e3mVar instanceof z2m) {
            return ((z2m) e3mVar).c;
        }
        w511.b();
        return null;
    }

    public static final void W(fid fidVar, wls wlsVar, Object obj) {
        if (((bts) fidVar).S || !jl40.l(((bts) fidVar).Q(), obj)) {
            bts btsVar = (bts) fidVar;
            btsVar.o0(obj);
            btsVar.i(obj, wlsVar);
        }
    }

    public static final ThemeType X(Context context) {
        return s(xng0.themeDarkMode, context) ? ThemeType.DARK : ThemeType.LIGHT;
    }

    public static final void Y(int[] iArr, int[] iArr2, SerialDescriptor serialDescriptor) {
        ArrayList arrayList = new ArrayList();
        int length = iArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr2[i2] & (~iArr[i2]);
            if (i3 != 0) {
                for (int i4 = 0; i4 < 32; i4++) {
                    if ((i3 & 1) != 0) {
                        arrayList.add(serialDescriptor.f((i2 * 32) + i4));
                    }
                    i3 >>>= 1;
                }
            }
        }
        throw new MissingFieldException(arrayList, serialDescriptor.h());
    }

    public static final void Z(int i2, int i3, SerialDescriptor serialDescriptor) {
        ArrayList arrayList = new ArrayList();
        int i4 = (~i2) & i3;
        for (int i5 = 0; i5 < 32; i5++) {
            if ((i4 & 1) != 0) {
                arrayList.add(serialDescriptor.f(i5));
            }
            i4 >>>= 1;
        }
        throw new MissingFieldException(arrayList, serialDescriptor.h());
    }

    public static final JsonEncodingException a(SerialDescriptor serialDescriptor) {
        return new JsonEncodingException("Value of type '" + serialDescriptor.h() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.getKind() + '\'', serialDescriptor.h(), "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final String a0(eoe eoeVar) {
        StringBuilder sb = new StringBuilder("(lat=");
        sb.append(eoeVar.b);
        sb.append("; lon=");
        sb.append(eoeVar.c);
        sb.append("; accuracy=");
        return unr0.q(sb, eoeVar.a, ')');
    }

    public static final void b(wz40 wz40Var, e530 e530Var) {
        wz40 x = P(e530Var).x();
        int i2 = x.c - 1;
        Object[] objArr = x.a;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                wz40Var.b((e530) ((LayoutNode) objArr[i2]).a0.g);
                i2--;
            }
        }
    }

    public static final String b0(pax0 pax0Var) {
        StringBuilder sb = new StringBuilder("appVersion=");
        sb.append((String) pax0Var.b.a());
        sb.append(", sdkVersion=");
        sb.append((String) pax0Var.v.a());
        sb.append(", service=");
        sb.append(pax0Var.x);
        sb.append(", consumerType=");
        CONSUMER_TYPE consumer_type = (CONSUMER_TYPE) pax0Var.d.a();
        sb.append(consumer_type != null ? consumer_type.name() : null);
        sb.append(", place=");
        sb.append((String) pax0Var.r.a());
        sb.append(", message=");
        sb.append((String) pax0Var.o.a());
        sb.append(", language=");
        sb.append(pax0Var.k);
        sb.append(", testIds=");
        sb.append(pax0Var.A.a());
        sb.append(", location=");
        n9z n9zVar = (n9z) pax0Var.m.a();
        if (n9zVar != null) {
            StringBuilder sb2 = new StringBuilder("(coordinates=");
            eoe eoeVar = (eoe) n9zVar.a.a();
            sb2.append(eoeVar != null ? a0(eoeVar) : null);
            sb2.append(", pinPosition=");
            eoe eoeVar2 = (eoe) n9zVar.c.a();
            r2 = b64.p(sb2, eoeVar2 != null ? a0(eoeVar2) : null, ')');
        }
        sb.append(r2);
        sb.append(", appMetricaUUID=");
        sb.append((String) pax0Var.a.a());
        return sb.toString();
    }

    public static final e530 c(wz40 wz40Var) {
        int i2;
        if (wz40Var == null || (i2 = wz40Var.c) == 0) {
            return null;
        }
        return (e530) wz40Var.k(i2 - 1);
    }

    public static final yf70 c0(Object obj) {
        return obj == null ? vf70.a : new xf70(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final v0y d(e530 e530Var) {
        if ((e530Var.getKindSet$ui() & 2) != 0) {
            if (e530Var instanceof v0y) {
                return (v0y) e530Var;
            }
            if (e530Var instanceof lqh) {
                e530 e530Var2 = ((lqh) e530Var).b;
                while (e530Var2 != 0) {
                    if (e530Var2 instanceof v0y) {
                        return (v0y) e530Var2;
                    }
                    e530Var2 = (!(e530Var2 instanceof lqh) || (e530Var2.getKindSet$ui() & 2) == 0) ? e530Var2.getChild$ui() : ((lqh) e530Var2).b;
                }
            }
        }
        return null;
    }

    public static final void d0(bfx bfxVar, Object obj) {
        if (obj == null) {
            bfxVar.k2();
            return;
        }
        if (obj instanceof Boolean) {
            bfxVar.n1(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Byte) {
            bfxVar.Y0(((Number) obj).byteValue());
            return;
        }
        if (obj instanceof Short) {
            bfxVar.Y0(((Number) obj).shortValue());
            return;
        }
        if (obj instanceof Integer) {
            bfxVar.Y0(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            bfxVar.X0(((Number) obj).longValue());
            return;
        }
        if (obj instanceof Float) {
            bfxVar.Z0(((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            bfxVar.Z0(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof String) {
            bfxVar.r0((String) obj);
            return;
        }
        if (obj instanceof Object[]) {
            bfxVar.l();
            for (Object obj2 : (Object[]) obj) {
                d0(bfxVar, obj2);
            }
            bfxVar.j();
            return;
        }
        if (!(obj instanceof Collection)) {
            if (obj instanceof Map) {
                e0(bfxVar, (Map) obj);
            }
        } else {
            bfxVar.l();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                d0(bfxVar, it.next());
            }
            bfxVar.j();
        }
    }

    public static final void e(int i2) {
        new Integer(i2);
    }

    public static final void e0(bfx bfxVar, Map map) {
        bfxVar.u();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            try {
                bfxVar.A1(String.valueOf(key));
                d0(bfxVar, value);
            } catch (Throwable unused) {
                System.out.getClass();
            }
        }
        bfxVar.y();
    }

    public static final Serializable f(Object obj) {
        if (!(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(f(it.next()));
                }
                return arrayList;
            }
            if (!(obj instanceof Map)) {
                throw a.a("Function \"clone\" is not defined for ".concat(rhb1.e(obj)));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                linkedHashMap.put((String) entry.getKey(), f(entry.getValue()));
            }
            return linkedHashMap;
        }
        return (Serializable) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f0(Context context, Executor executor, qef0 qef0Var, boolean z) {
        boolean T;
        boolean z2;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z3 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z2 = readLong == packageInfo.lastUpdateTime;
                            if (z2) {
                                qef0Var.c(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z2) {
                        context.getPackageName();
                        ihf0.c(context, false);
                        return;
                    }
                }
                z2 = false;
                if (z2) {
                }
            }
            context.getPackageName();
            pbj pbjVar = new pbj(assets, executor, qef0Var, name, new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof"));
            if (pbjVar.g()) {
                pbj M = pbjVar.M();
                M.S();
                T = M.T();
                if (T) {
                    J(packageInfo, filesDir);
                }
            } else {
                T = false;
            }
            if (T && z) {
                z3 = true;
            }
            ihf0.c(context, z3);
        } catch (PackageManager.NameNotFoundException e2) {
            qef0Var.c(7, e2);
            ihf0.c(context, false);
        }
    }

    public static final pax0 g(pax0 pax0Var) {
        return pax0.a(pax0Var, c0(THEME.DARK));
    }

    public static void g0(int i2, Object[] objArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr[i3] == null) {
                ny61.t(oyr.i(i3, "at index "));
                return;
            }
        }
    }

    public static String h(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            bArr2[i2] = (byte) (bArr[i2] ^ b[i2 % 8]);
        }
        return new String(bArr2, uza.a);
    }

    public static final void i(qam qamVar, androidx.compose.ui.graphics.layer.a aVar) {
        aVar.c(qamVar.N().q(), (androidx.compose.ui.graphics.layer.a) qamVar.N().b);
    }

    public static final boolean j(pvo pvoVar, pvo pvoVar2) {
        if (pvoVar == null && pvoVar2 == null) {
            return true;
        }
        return pvoVar != null && (pvoVar instanceof t6e) && pvoVar2 != null && (pvoVar2 instanceof t6e) && jl40.l(((t6e) pvoVar).a, ((t6e) pvoVar2).a);
    }

    public static final boolean k(Expression expression, Expression expression2) {
        if (expression == null && expression2 == null) {
            return true;
        }
        if (expression == null || !(expression instanceof kvo) || expression2 == null || !(expression2 instanceof kvo)) {
            return false;
        }
        Object obj = ((kvo) expression).a;
        return ((obj instanceof JSONObject) || (obj instanceof JSONArray)) ? jl40.l(obj.toString(), ((kvo) expression2).a.toString()) : obj.equals(((kvo) expression2).a);
    }

    public static long l(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int min = Math.min(i4, 262142);
        int min2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i5, 262142);
        int i7 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    p8e.l(i7);
                    ny61.A();
                    return 0L;
                }
                i6 = 8190;
            }
        }
        return p8e.a(Math.min(i6, i2), i3 != Integer.MAX_VALUE ? Math.min(i6, i3) : Integer.MAX_VALUE, min, min2);
    }

    public static long m(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int min = Math.min(i2, 262142);
        int min2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int i7 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    p8e.l(i7);
                    ny61.A();
                    return 0L;
                }
                i6 = 8190;
            }
        }
        return p8e.a(min, min2, Math.min(i6, i4), i5 != Integer.MAX_VALUE ? Math.min(i6, i5) : Integer.MAX_VALUE);
    }

    public static final String n(int i2, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i2 >= 0) {
            sb.append("Unexpected JSON token at offset " + i2 + Extension.COLON_SPACE);
        }
        sb.append(str);
        if (str2 != null && !evu0.J(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !evu0.J(str3)) {
            sb.append("\n".concat(str3));
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    public static wg10 o(String str) {
        w610 f2 = wg10.e.f(0, str);
        if (f2 == null) {
            ny61.g(unr0.l(OpenList.CHAR_QUOTE, "No subtype found for: \"", str));
            return null;
        }
        String str2 = (String) ((u1l) f2.a()).get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        String lowerCase2 = ((String) ((u1l) f2.a()).get(2)).toLowerCase(locale);
        ArrayList arrayList = new ArrayList();
        int i2 = f2.b().b;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= str.length()) {
                return new wg10((String[]) arrayList.toArray(new String[0]), str, lowerCase, lowerCase2);
            }
            w610 f3 = wg10.f.f(i3, str);
            if (f3 == null) {
                vg10.a(34, str.substring(i3), "\" for: \"", str, "Parameter is not formatted correctly: \"");
                return null;
            }
            v610 v610Var = f3.c;
            t610 a2 = v610Var.a(1);
            String str3 = a2 != null ? a2.a : null;
            if (str3 == null) {
                i2 = f3.b().b;
            } else {
                t610 a3 = v610Var.a(2);
                String str4 = a3 != null ? a3.a : null;
                if (str4 == null) {
                    str4 = v610Var.a(3).a;
                } else if (evu0.a0(str4, '\'') && evu0.B(str4, '\'') && str4.length() > 2) {
                    str4 = oyr.g(1, 1, str4);
                }
                arrayList.add(str3);
                arrayList.add(str4);
                i2 = f3.b().b;
            }
        }
    }

    public static final String p(yaf0 yaf0Var) {
        return yaf0Var == yaf0.b ? "FlexMain" : yaf0Var == yaf0.a ? "MapMain" : yaf0Var == yaf0.c ? "Multiorder" : yaf0Var == yaf0.d ? "TaxiMain" : yaf0Var instanceof waf0 ? ((vaf0) ((waf0) yaf0Var)).f : "Unknown";
    }

    public static int q(AttributeSet attributeSet, String str, String str2) {
        String attributeValue = attributeSet.getAttributeValue(str, str2);
        if (attributeValue == null || !cvu0.x(attributeValue, "?", false)) {
            return 0;
        }
        return Integer.valueOf(cvu0.v(attributeValue, "?", "", false)).intValue();
    }

    public static final BluetoothAdapter r(Context context) {
        BluetoothManager bluetoothManager;
        if (!context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le") || (bluetoothManager = (BluetoothManager) context.getSystemService(BluetoothManager.class)) == null) {
            return null;
        }
        return bluetoothManager.getAdapter();
    }

    public static final boolean s(int i2, Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        if (typedValue.type == 18) {
            return typedValue.data != 0;
        }
        xby.d.k(new IllegalArgumentException(), "Type of " + context.getResources().getResourceName(i2) + " is not boolean!");
        return false;
    }

    public static final int t(int i2, Context context) {
        return u(context.getTheme(), i2);
    }

    public static final int u(Resources.Theme theme, int i2) {
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i2, typedValue, true);
        return typedValue.data;
    }

    public static final ViewTargetRequestManager v(View view) {
        ViewTargetRequestManager viewTargetRequestManager;
        Object tag = view.getTag(edh0.coil3_request_manager);
        ViewTargetRequestManager viewTargetRequestManager2 = tag instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag : null;
        if (viewTargetRequestManager2 != null) {
            return viewTargetRequestManager2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(edh0.coil3_request_manager);
                viewTargetRequestManager = tag2 instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag2 : null;
                if (viewTargetRequestManager == null) {
                    viewTargetRequestManager = new ViewTargetRequestManager(view);
                    view.addOnAttachStateChangeListener(viewTargetRequestManager);
                    view.setTag(edh0.coil3_request_manager, viewTargetRequestManager);
                }
            } finally {
            }
        }
        return viewTargetRequestManager;
    }

    public static final List w() {
        LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
        if (locales.isEmpty()) {
            return Collections.singletonList(Locale.getDefault());
        }
        ArrayList arrayList = new ArrayList();
        int size = locales.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(locales.get(i2));
        }
        return arrayList;
    }

    public static final int x(DivFontWeight divFontWeight, Integer num) {
        if (num != null) {
            return num.intValue();
        }
        int i2 = divFontWeight == null ? -1 : oml.a[divFontWeight.ordinal()];
        if (i2 == 1) {
            return 300;
        }
        if (i2 == 2) {
            return Constants.MINIMAL_ERROR_STATUS_CODE;
        }
        if (i2 == 3) {
            return 500;
        }
        if (i2 != 4) {
            return Constants.MINIMAL_ERROR_STATUS_CODE;
        }
        return 700;
    }

    public static final void y(fid fidVar, Integer num, wls wlsVar) {
        if (((bts) fidVar).S) {
            ((bts) fidVar).i(num, wlsVar);
        }
    }

    public static final void z(b8 b8Var, String str) {
        b8Var.p(b8Var.b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }
}
