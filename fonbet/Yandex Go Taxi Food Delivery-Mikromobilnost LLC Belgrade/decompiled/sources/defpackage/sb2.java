package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.runtime.h;
import com.yandex.div.core.expression.variables.a;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.b;
import com.yandex.div.evaluable.c;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.ybsdk.widgets.common.MoneyInputEditView;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.channels.BufferOverflow;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCSP.CStructReader.BlobHeaderStructure;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidLocationProviderType;
import ru.yandex.taxi.locationsdk.locationprovider.android.AndroidLocationUpdatesRequest$Quality;
import ru.yandex.taxi.locationsdk.locationprovider.android.impl.LocationManagerAdapter$Request$Quality;

/* loaded from: classes9.dex */
public abstract class sb2 {
    public static final Continuation[] a = new Continuation[0];
    public static final byte[] b = {Alerts.alert_no_certificate, 7, -108, -120, 85, 94, Alerts.alert_handshake_failure, -53};
    public static final byte[] c = {74, 104, -7, -90, Alerts.alert_certificate_revoked, 63, Alerts.alert_protocol_version, -81, 76, Byte.MAX_VALUE, -70, -22, 52, 48, 67, -27, 93, 117, -11, -26, 38, 56, 77, -71, Alerts.alert_user_canceled};
    public static final byte[] d = {74, 104, -7, -90, Alerts.alert_certificate_revoked, 63, Alerts.alert_protocol_version, -81, 76, Byte.MAX_VALUE, -70, -22, 52, 48, 67, -27, 93, Alerts.alert_certificate_unobtainable, -15, -27, 48};
    public static final byte[] e = {74, 104, -7, -90, Alerts.alert_certificate_revoked, 63, Alerts.alert_protocol_version, -81, 76, Byte.MAX_VALUE, -70, -22, 52, 48, 67, -27, 89, Alerts.alert_unsupported_extension, -6};
    public static final byte[] f = {74, 104, -7, -90, Alerts.alert_certificate_revoked, 63, Alerts.alert_protocol_version, -81, 76, Byte.MAX_VALUE, -70, -22, 52, 48, 67, -27, Alerts.alert_user_canceled, Alerts.alert_certificate_unobtainable, -5, -6, BlobHeaderStructure.KEXP15_BLOB_VERSION, 61, 93, -65, Alerts.alert_user_canceled};
    public static final byte[] g = {74, 104, -7, -90, Alerts.alert_certificate_revoked, 63, Alerts.alert_protocol_version, -81, 76, Byte.MAX_VALUE, -70, -22, 52, 48, 67, -27, 91, 98, -28, -28, 48, 48, 65, -72, 65};
    public static final byte[] h = {74, 104, -7, -90, Alerts.alert_certificate_revoked, 63, Alerts.alert_protocol_version, -81, 76, Byte.MAX_VALUE, -70, -22, 52, 48, 67, -27, 77, 98, -10, -3, Alerts.alert_decode_error, 1, 88, -86, Alerts.alert_insufficient_security, 98, -8};
    public static final byte[] i = {74, 104, -7, -90, Alerts.alert_certificate_revoked, 63, Alerts.alert_protocol_version, -81, 76, Byte.MAX_VALUE, -70, -22, 52, 48, 67, -27, 77, 98, -30, -31, 54, 59, 119, -94, 77};
    public static final byte[] j = {74, 104, -7, -90, Alerts.alert_certificate_revoked, 63, Alerts.alert_protocol_version, -81, 76, Byte.MAX_VALUE, -70, -22, 52, 48, 67, -27, 91, 102, -32, -19};
    public static final byte[] k = {74, 104, -7, -90, Alerts.alert_certificate_revoked, 63, Alerts.alert_protocol_version, -81, 76, Byte.MAX_VALUE, -70, -22, 52, 48, 67, -27, 72, Alerts.alert_bad_certificate_hash_value, -32, -32, 10, 61, Alerts.alert_insufficient_security, -90, 68, 104, -6};
    public static final byte[] l = {75, 102, -6, -29, 10, Alerts.alert_certificate_expired, 76, -96, 118, 117, -15, -27, 58, Alerts.alert_bad_certificate, 77, -108, 74, 104, -6, -18, Alerts.alert_export_restriction, 57, 119, -92, 95, 98, -26, -6, Alerts.alert_export_restriction, 58, 77, -72};
    public static final byte[] m = {74, 104, -7, -90, Alerts.alert_certificate_revoked, 63, Alerts.alert_protocol_version, -81, 76, Byte.MAX_VALUE, -70, -22, 52, 48, 67, -27, 74, 104, -7, -27, 58, 48, 119, -68, DerValue.TAG_APPLICATION, 115, -4, -25, BlobHeaderStructure.BLOB_VERSION, Alerts.alert_bad_certificate, 119, -88, 69, 98, -11, -26, BlobHeaderStructure.BLOB_VERSION, Alerts.alert_certificate_unknown};
    public static final byte[] n = {74, 104, -7, -90, Alerts.alert_certificate_revoked, 63, Alerts.alert_protocol_version, -81, 76, Byte.MAX_VALUE, -70, -22, 52, 48, 67, -27, 74, 104, -7, -27, 58, 48};
    public static final byte[] o = {75, 102, -6, -29, 10, Alerts.alert_certificate_expired, 76, -96, 118, 102, -31, -4, 61, 1, 91, -65, Alerts.alert_protocol_version, 117, -11, -17, 48};
    public static final byte[] p = {74, 104, -7, -90, Alerts.alert_certificate_revoked, 63, Alerts.alert_protocol_version, -81, 76, Byte.MAX_VALUE, -70, -22, 52, 48, 67, -27, 89, 117, -3, -14, 48, Alerts.alert_certificate_expired};
    public static final byte[] q = {75, 102, -6, -29, 10, Alerts.alert_certificate_expired, 76, -96, 118, 117, -15, -27, 58, Alerts.alert_bad_certificate, 77, -108, 74, 104, -6, -18, Alerts.alert_export_restriction, 57};
    public static final byte[] r = {74, 104, -7, -90, Alerts.alert_certificate_revoked, 63, Alerts.alert_protocol_version, -81, 76, Byte.MAX_VALUE, -70, -22, 52, 48, 67, -27, 74, 104, -26, -19, 123, Alerts.alert_certificate_unknown, 77, -71, 68, Alerts.alert_unsupported_extension, -25, -5, Alerts.alert_export_restriction, 49, Alerts.alert_protocol_version, -72};
    public static final byte[] s = {74, 104, -7, -90, Alerts.alert_certificate_revoked, 63, Alerts.alert_protocol_version, -81, 76, Byte.MAX_VALUE, -70, -22, 52, 48, 67, -27, 89, 117, -5, -20, BlobHeaderStructure.BLOB_VERSION, 61, 92, -72, 118, 116, -9, -6, 48, 59, Alerts.alert_protocol_version, -108, Alerts.alert_user_canceled, 115, -5, -6, 52, 57, 77};
    public static final byte[] t = {74, 104, -7, -90, Alerts.alert_certificate_revoked, 63, Alerts.alert_protocol_version, -81, 76, Byte.MAX_VALUE, -70, -22, 52, 48, 67, -27, 76, 105, -30, -31, 39, 49, Alerts.alert_protocol_version, -90, 76, 105, -32};
    public static final byte[] u = {74, 104, -7, -90, Alerts.alert_certificate_revoked, 63, Alerts.alert_protocol_version, -81, 76, Byte.MAX_VALUE, -70, -22, 52, 48, 67, -27, Alerts.alert_insufficient_security, 97, -9};
    public static final byte[] v = {74, 104, -7, -90, Alerts.alert_certificate_revoked, 63, Alerts.alert_protocol_version, -81, 76, Byte.MAX_VALUE, -70, -22, 52, 48, 67, -27, 89, Alerts.alert_bad_certificate_hash_value, -25, -32, 10, 48, Alerts.alert_insufficient_security, -65, DerValue.TAG_APPLICATION, 97, -3, -21, 52, Alerts.alert_bad_certificate, 65, -92, Alerts.alert_insufficient_security, 116};
    public static final StackTraceElement[] w = new StackTraceElement[0];

    public static final int A(bjs0 bjs0Var, Context context, int i2) {
        if (bjs0Var instanceof cua0) {
            return m810.b((((cua0) bjs0Var).a * i2) / 100.0f);
        }
        if (bjs0Var instanceof f3c0) {
            return m810.b(((f3c0) bjs0Var).a);
        }
        if (bjs0Var instanceof kwd0) {
            return m810.b(((kwd0) bjs0Var).a * context.getResources().getDisplayMetrics().density);
        }
        w511.b();
        return 0;
    }

    public static Bitmap B(Context context, Drawable drawable, Canvas canvas) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int u2 = drawable.getIntrinsicWidth() <= 0 ? tje.u(24, context) : drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight() <= 0 ? u2 : drawable.getIntrinsicHeight();
        drawable.setBounds(0, 0, u2, intrinsicHeight);
        Bitmap createBitmap = Bitmap.createBitmap(u2, intrinsicHeight, Bitmap.Config.ARGB_8888);
        canvas.setBitmap(createBitmap);
        drawable.draw(canvas);
        return createBitmap;
    }

    public static final Boolean C(a aVar, String str) {
        c231 g2 = aVar.g(str);
        u131 u131Var = g2 instanceof u131 ? (u131) g2 : null;
        Object d2 = u131Var != null ? u131Var.d() : null;
        if (d2 instanceof Boolean) {
            return (Boolean) d2;
        }
        return null;
    }

    public static final String D(a aVar, String str) {
        c231 g2 = aVar.g(str);
        z131 z131Var = g2 instanceof z131 ? (z131) g2 : null;
        Object d2 = z131Var != null ? z131Var.d() : null;
        if (d2 instanceof String) {
            return (String) d2;
        }
        return null;
    }

    public static byte E(int i2, List list) {
        if (list.isEmpty()) {
            return (byte) 0;
        }
        byte size = (byte) list.size();
        if (((Number) list.get(0)).intValue() > 0) {
            size = (byte) (size + 1);
        }
        return ((Number) kotlin.collections.a.Z(list)).intValue() == i2 ? (byte) (size - 1) : size;
    }

    public static l1t0 F() {
        return new l1t0(0);
    }

    public static twt0 G(float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new twt0(f2, f3, obj);
    }

    public static final Object H(fbp0 fbp0Var, boolean z, fbp0 fbp0Var2, wls wlsVar) {
        Object tzcVar;
        Object U;
        try {
            if (wlsVar instanceof BaseContinuationImpl) {
                ym11.e(2, wlsVar);
                tzcVar = wlsVar.invoke(fbp0Var2, fbp0Var);
            } else {
                fse fseVar = fbp0Var.get_context();
                Object intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1 = fseVar == EmptyCoroutineContext.a ? new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1(fbp0Var) : new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2(fseVar, fbp0Var);
                ym11.e(2, wlsVar);
                tzcVar = wlsVar.invoke(fbp0Var2, intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1);
            }
        } catch (DispatchException e2) {
            fbp0Var.T(new tzc(e2.getCause(), false));
            throw e2.getCause();
        } catch (Throwable th) {
            tzcVar = new tzc(th, false);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (tzcVar == coroutineSingletons || (U = fbp0Var.U(tzcVar)) == ffx.c) {
            return coroutineSingletons;
        }
        fbp0Var.n0();
        if (!(U instanceof tzc)) {
            return ffx.g0(U);
        }
        if (!z) {
            Throwable th2 = ((tzc) U).a;
            if ((th2 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th2).a == fbp0Var) {
                if (tzcVar instanceof tzc) {
                    throw ((tzc) tzcVar).a;
                }
                return tzcVar;
            }
        }
        throw ((tzc) U).a;
    }

    public static final a7u0 I(sls slsVar) {
        return new a7u0(slsVar);
    }

    public static final long J(long j2, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) * Float.intBitsToFloat((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) * Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        return (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static ck11 K(int i2, int i3, rbn rbnVar, int i4) {
        if ((i4 & 1) != 0) {
            i2 = 300;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            rbnVar = ubn.a;
        }
        return new ck11(i2, i3, rbnVar);
    }

    public static void L(View view, int i2, int i3, int i4, int i5, int i6) {
        if ((i6 & 1) != 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            i2 = (layoutParams == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) ? 0 : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        }
        if ((i6 & 2) != 0) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            i3 = (layoutParams2 == null || !(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) ? 0 : ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        }
        if ((i6 & 4) != 0) {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            i4 = (layoutParams3 == null || !(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) ? 0 : ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin;
        }
        if ((i6 & 8) != 0) {
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            i5 = (layoutParams4 == null || !(layoutParams4 instanceof ViewGroup.MarginLayoutParams)) ? 0 : ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
        }
        ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams5;
            marginLayoutParams.leftMargin = i2;
            marginLayoutParams.topMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.bottomMargin = i5;
            view.requestLayout();
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(layoutParams5);
        marginLayoutParams2.leftMargin = i2;
        marginLayoutParams2.topMargin = i3;
        marginLayoutParams2.rightMargin = i4;
        marginLayoutParams2.bottomMargin = i5;
        view.setLayoutParams(marginLayoutParams2);
    }

    public static void M(ViewGroup viewGroup, int i2, int i3, int i4) {
        int paddingLeft = viewGroup.getPaddingLeft();
        if ((i4 & 2) != 0) {
            i2 = viewGroup.getPaddingTop();
        }
        int paddingRight = viewGroup.getPaddingRight();
        if ((i4 & 8) != 0) {
            i3 = viewGroup.getPaddingBottom();
        }
        viewGroup.setPadding(paddingLeft, i2, paddingRight, i3);
    }

    public static final boolean N(List list, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!map.containsKey((String) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final void O(c cVar, ArrayList arrayList) {
        bb1 h2 = cVar.h(arrayList);
        if (h2 instanceof qls) {
            return;
        }
        if (h2 instanceof ols) {
            StringBuilder sb = new StringBuilder();
            kms kmsVar = (kms) kotlin.collections.a.b0(cVar.b());
            sb.append(kmsVar != null ? kmsVar.b : false ? "At least" : "Exactly");
            sb.append(HexString.CHAR_SPACE);
            sb.append(((ols) h2).p0());
            sb.append(" argument(s) expected.");
            throw new EvaluableException(sb.toString(), null);
        }
        if (!(h2 instanceof pls)) {
            w511.b();
            return;
        }
        if (cVar.i(arrayList).equals(qls.f)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Invalid argument type: expected ");
        pls plsVar = (pls) h2;
        sb2.append(plsVar.f);
        EvaluableType evaluableType = plsVar.g;
        sb2.append(", got ");
        sb2.append(evaluableType);
        sb2.append('.');
        throw new EvaluableException(sb2.toString(), null);
    }

    public static final q6x P(Object obj) {
        if (!(obj instanceof Map)) {
            if (obj instanceof String) {
                return new p6x((String) obj);
            }
            vg10.h("Unsupported tag tree node '", obj, 39);
            return null;
        }
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), P(entry.getValue()));
        }
        return new r6x(linkedHashMap);
    }

    public static kotlinx.coroutines.channels.a a(int i2, BufferOverflow bufferOverflow, of11 of11Var, int i3) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        if ((i3 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i3 & 4) != 0) {
            of11Var = null;
        }
        if (i2 == -2) {
            if (bufferOverflow != BufferOverflow.SUSPEND) {
                return new h4e(1, bufferOverflow, of11Var);
            }
            ci9.A1.getClass();
            return new kotlinx.coroutines.channels.a(bi9.b, of11Var);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? bufferOverflow == BufferOverflow.SUSPEND ? new kotlinx.coroutines.channels.a(i2, of11Var) : new h4e(i2, bufferOverflow, of11Var) : new kotlinx.coroutines.channels.a(Integer.MAX_VALUE, of11Var) : bufferOverflow == BufferOverflow.SUSPEND ? new kotlinx.coroutines.channels.a(0, of11Var) : new h4e(1, bufferOverflow, of11Var);
        }
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            return new h4e(1, BufferOverflow.DROP_OLDEST, of11Var);
        }
        ny61.g("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(vvf0 vvf0Var, wls wlsVar, fid fidVar, int i2) {
        boolean z;
        aii0 v2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-149765515);
        m6w m6wVar = btsVar.x;
        r1b0 o2 = btsVar.o();
        btsVar.b0(201, lid.b);
        Object Q = btsVar.Q();
        j131 j131Var = jl40.l(Q, did.a) ? null : (j131) Q;
        h hVar = vvf0Var.a;
        j131 c2 = hVar.c(vvf0Var, j131Var);
        boolean equals = c2.equals(j131Var);
        if (!equals) {
            btsVar.o0(c2);
        }
        int i3 = 1;
        if (btsVar.S) {
            if (vvf0Var.f || !o2.containsKey(hVar)) {
                o2 = o2.d(hVar, c2);
            }
            btsVar.J = true;
        } else {
            dus0 dus0Var = btsVar.G;
            r1b0 r1b0Var = (r1b0) dus0Var.b(dus0Var.g, dus0Var.b);
            if (!(btsVar.E() && equals) && (vvf0Var.f || !o2.containsKey(hVar))) {
                o2 = o2.d(hVar, c2);
            } else if ((equals && !btsVar.w) || !btsVar.w) {
                o2 = r1b0Var;
            }
            if (btsVar.y || r1b0Var != o2) {
                z = true;
                if (z && !btsVar.S) {
                    btsVar.O(o2);
                }
                m6wVar.c(btsVar.w ? 1 : 0);
                btsVar.w = z;
                btsVar.K = o2;
                btsVar.Z(202, lid.c, o2, 0);
                qv10.A((i2 >> 3) & 14, wlsVar, btsVar, false, false);
                btsVar.w = m6wVar.b() != 0;
                btsVar.K = null;
                v2 = btsVar.v();
                if (v2 == null) {
                    v2.d = new s1d(vvf0Var, wlsVar, i2, i3);
                    return;
                }
                return;
            }
        }
        z = false;
        if (z) {
            btsVar.O(o2);
        }
        m6wVar.c(btsVar.w ? 1 : 0);
        btsVar.w = z;
        btsVar.K = o2;
        btsVar.Z(202, lid.c, o2, 0);
        qv10.A((i2 >> 3) & 14, wlsVar, btsVar, false, false);
        btsVar.w = m6wVar.b() != 0;
        btsVar.K = null;
        v2 = btsVar.v();
        if (v2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(vvf0[] vvf0VarArr, wls wlsVar, fid fidVar, int i2) {
        r1b0 a2;
        boolean z;
        aii0 v2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(415205898);
        m6w m6wVar = btsVar.x;
        r1b0 o2 = btsVar.o();
        btsVar.b0(201, lid.b);
        boolean z2 = btsVar.S;
        s370 s370Var = lid.d;
        if (z2) {
            r1b0 W = uh6.W(vvf0VarArr, o2, r1b0.w);
            o2.getClass();
            q1b0 q1b0Var = new q1b0(o2);
            q1b0Var.z = o2;
            q1b0Var.putAll(W);
            a2 = q1b0Var.a();
            btsVar.b0(204, s370Var);
            btsVar.I();
            btsVar.p0(a2);
            btsVar.I();
            btsVar.p0(W);
            btsVar.t(false);
            btsVar.J = true;
        } else {
            dus0 dus0Var = btsVar.G;
            r1b0 r1b0Var = (r1b0) dus0Var.h(dus0Var.g, 0);
            dus0 dus0Var2 = btsVar.G;
            r1b0 r1b0Var2 = (r1b0) dus0Var2.h(dus0Var2.g, 1);
            r1b0 W2 = uh6.W(vvf0VarArr, o2, r1b0Var2);
            if (btsVar.E() && !btsVar.y && r1b0Var2.equals(W2)) {
                btsVar.l = btsVar.G.s() + btsVar.l;
                a2 = r1b0Var;
            } else {
                o2.getClass();
                q1b0 q1b0Var2 = new q1b0(o2);
                q1b0Var2.z = o2;
                q1b0Var2.putAll(W2);
                a2 = q1b0Var2.a();
                btsVar.b0(204, s370Var);
                btsVar.I();
                btsVar.p0(a2);
                btsVar.I();
                btsVar.p0(W2);
                btsVar.t(false);
                if (btsVar.y || !jl40.l(a2, r1b0Var)) {
                    z = true;
                    if (z && !btsVar.S) {
                        btsVar.O(a2);
                    }
                    m6wVar.c(btsVar.w ? 1 : 0);
                    btsVar.w = z;
                    btsVar.K = a2;
                    btsVar.Z(202, lid.c, a2, 0);
                    qv10.A((i2 >> 3) & 14, wlsVar, btsVar, false, false);
                    btsVar.w = m6wVar.b() != 0;
                    btsVar.K = null;
                    v2 = btsVar.v();
                    if (v2 == null) {
                        v2.d = new s1d(vvf0VarArr, wlsVar, i2, 2);
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        if (z) {
            btsVar.O(a2);
        }
        m6wVar.c(btsVar.w ? 1 : 0);
        btsVar.w = z;
        btsVar.K = a2;
        btsVar.Z(202, lid.c, a2, 0);
        qv10.A((i2 >> 3) & 14, wlsVar, btsVar, false, false);
        btsVar.w = m6wVar.b() != 0;
        btsVar.K = null;
        v2 = btsVar.v();
        if (v2 == null) {
        }
    }

    public static final p9z d(na2 na2Var, AndroidLocationProviderType androidLocationProviderType) {
        LocationManagerAdapter$Request$Quality locationManagerAdapter$Request$Quality;
        e3n e3nVar = na2Var.a;
        AndroidLocationUpdatesRequest$Quality androidLocationUpdatesRequest$Quality = na2Var.d;
        e3n e3nVar2 = androidLocationUpdatesRequest$Quality != AndroidLocationUpdatesRequest$Quality.PASSIVE ? e3nVar : null;
        e3n e3nVar3 = na2Var.b;
        if (e3nVar2 == null) {
            e3nVar3 = new e3n(e3nVar3 != null ? e3nVar3.a : e3nVar != null ? e3nVar.a : na2.k);
        }
        e3n e3nVar4 = e3nVar3;
        int i2 = rb2.a[androidLocationUpdatesRequest$Quality.ordinal()];
        if (i2 == 1) {
            locationManagerAdapter$Request$Quality = LocationManagerAdapter$Request$Quality.HIGH_ACCURACY;
        } else if (i2 == 2) {
            locationManagerAdapter$Request$Quality = LocationManagerAdapter$Request$Quality.BALANCED_POWER_ACCURACY;
        } else if (i2 == 3) {
            locationManagerAdapter$Request$Quality = LocationManagerAdapter$Request$Quality.LOW_POWER;
        } else {
            if (i2 != 4) {
                w511.b();
                return null;
            }
            locationManagerAdapter$Request$Quality = LocationManagerAdapter$Request$Quality.LOW_POWER;
        }
        return new p9z(androidLocationProviderType, e3nVar2, e3nVar4, na2Var.c, locationManagerAdapter$Request$Quality);
    }

    public static final int e(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - MoneyInputEditView.DEFAULT_VALUE;
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final void f(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            ny61.m(oyr.h(i2, i3, "index: ", ", size: "));
        }
    }

    public static final void g(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            ny61.m(oyr.h(i2, i3, "index: ", ", size: "));
        }
    }

    public static final void h(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            ny61.i(b64.s(i2, i3, "fromIndex: ", ", toIndex: ", ", size: "), i4);
        } else {
            if (i2 <= i3) {
                return;
            }
            ny61.g(oyr.h(i2, i3, "fromIndex: ", " > toIndex: "));
        }
    }

    public static int i(Context context, String str) {
        try {
            return qke.h(context, str);
        } catch (Exception e2) {
            jst.e.x(e2, String.format("Failed to check permission '%s'", Arrays.copyOf(new Object[]{str}, 1)));
            return -1;
        }
    }

    public static float j(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
    }

    public static int k(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public static final NinePatchDrawable l(Canvas canvas, Context context, Drawable drawable, wa60 wa60Var, wa60... wa60VarArr) {
        Bitmap B = B(context, drawable, canvas);
        int length = wa60VarArr.length;
        xa60[] xa60VarArr = new xa60[length];
        for (int i2 = 0; i2 < length; i2++) {
            wa60 wa60Var2 = wa60VarArr[i2];
            float width = B.getWidth();
            float height = B.getHeight();
            xa60VarArr[i2] = new xa60((int) (wa60Var2.a * width), (int) (wa60Var2.b * width), (int) (wa60Var2.c * height), (int) (wa60Var2.d * height));
        }
        float width2 = B.getWidth();
        float height2 = B.getHeight();
        return m(context, B, new xa60((int) (wa60Var.a * width2), (int) (wa60Var.b * width2), (int) (wa60Var.c * height2), (int) (wa60Var.d * height2)), xa60VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    public static NinePatchDrawable m(Context context, Bitmap bitmap, xa60 xa60Var, xa60[] xa60VarArr) {
        ArrayList arrayList;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = xa60Var.a;
        int i3 = xa60Var.c;
        int i4 = xa60Var.b;
        if (i4 != 0) {
            i4 = width - i4;
        }
        int i5 = xa60Var.d;
        if (i5 != 0) {
            i5 = height - i5;
        }
        Rect rect = new Rect(i2, i3, i4, i5);
        int length = xa60VarArr.length;
        ?? r2 = EmptyList.a;
        if (length == 0) {
            arrayList = r2;
        } else {
            arrayList = new ArrayList();
            for (xa60 xa60Var2 : xa60VarArr) {
                int i6 = xa60Var2.a;
                int i7 = xa60Var2.b;
                if (!arrayList.contains(Integer.valueOf(i6)) || !arrayList.contains(Integer.valueOf(i7))) {
                    arrayList.add(Integer.valueOf(xa60Var2.a));
                    arrayList.add(Integer.valueOf(i7));
                }
            }
        }
        if (xa60VarArr.length != 0) {
            r2 = new ArrayList();
            for (xa60 xa60Var3 : xa60VarArr) {
                int i8 = xa60Var3.c;
                int i9 = xa60Var3.d;
                if (!r2.contains(Integer.valueOf(i8)) || !r2.contains(Integer.valueOf(i9))) {
                    r2.add(Integer.valueOf(xa60Var3.c));
                    r2.add(Integer.valueOf(i9));
                }
            }
        }
        byte E = (byte) (E(height, r2) * E(width, arrayList));
        ByteBuffer allocate = ByteBuffer.allocate((E * 4) + (r2.size() * 4) + (arrayList.size() * 4) + 32);
        allocate.order(ByteOrder.nativeOrder());
        allocate.put((byte) 1);
        allocate.put((byte) arrayList.size());
        allocate.put((byte) r2.size());
        allocate.put(E);
        allocate.putInt(0);
        allocate.putInt(0);
        allocate.putInt(rect.left);
        allocate.putInt(rect.right);
        allocate.putInt(rect.top);
        allocate.putInt(rect.bottom);
        allocate.putInt(0);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            allocate.putInt(((Number) it.next()).intValue());
        }
        Iterator it2 = ((Iterable) r2).iterator();
        while (it2.hasNext()) {
            allocate.putInt(((Number) it2.next()).intValue());
        }
        for (int i10 = 0; i10 < E; i10++) {
            allocate.putInt(1);
        }
        return new NinePatchDrawable(context.getResources(), bitmap, allocate.array(), rect, null);
    }

    public static final File n(Context context, String str) {
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    public static String o(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            bArr2[i2] = (byte) (bArr[i2] ^ b[i2 % 8]);
        }
        return new String(bArr2, uza.a);
    }

    public static final ArrayList p(ZoneTariffInfo zoneTariffInfo) {
        PaymentMethod$Type paymentMethod$Type;
        Iterable<String> iterable = zoneTariffInfo.l;
        if (iterable == null) {
            iterable = EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : iterable) {
            if (str != null) {
                PaymentMethod$Type.Companion.getClass();
                paymentMethod$Type = b4a0.a(str);
            } else {
                paymentMethod$Type = null;
            }
            if (paymentMethod$Type != null) {
                arrayList.add(paymentMethod$Type);
            }
        }
        return arrayList;
    }

    public static String q(String str, HashMap hashMap) {
        return sho.a.i(str, new awd(1, hashMap));
    }

    public static EvaluableException s(String str, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return new EvaluableException("Function requires non empty argument list.", null);
        }
        return new EvaluableException("Function has no matching overload for given argument types: " + b.i(arrayList) + '.', null);
    }

    public static final EvaluableException u(ArrayList arrayList) {
        if (arrayList.size() == 1) {
            return new EvaluableException("Method requires non empty argument list.", null);
        }
        return new EvaluableException("Method has no matching overload for given argument types: " + b.i(arrayList.subList(1, arrayList.size())) + '.', null);
    }

    public static SharedPreferences v(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static nsv w(f3n f3nVar, RepeatMode repeatMode, long j2, int i2) {
        if ((i2 & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i2 & 4) != 0) {
            j2 = pfb1.a(0);
        }
        return new nsv(f3nVar, repeatMode, j2);
    }

    public static final boolean x(Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }

    public static final xkx y(tls tlsVar) {
        wkx wkxVar = new wkx();
        tlsVar.invoke(wkxVar);
        return new xkx(wkxVar);
    }

    public static final s6x z(r5x r5xVar, s6x s6xVar) {
        ArrayList<o5x> arrayList = r5xVar.a;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (o5x o5xVar : arrayList) {
            if (!(o5xVar instanceof q5x)) {
                vg10.r(o5xVar, "Expected JasonPath.Key because the path for tags consists of string keys but actual value is ");
                return null;
            }
            arrayList2.add(((q5x) o5xVar).a);
        }
        List q0 = kotlin.collections.a.q0(arrayList2);
        Map map = s6xVar.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Iterator it = q0.iterator();
            while (it.hasNext()) {
                value = new r6x(gw00.e(new Pair((String) it.next(), value)));
            }
            linkedHashMap.put(key, (q6x) value);
        }
        return new s6x(linkedHashMap);
    }

    public abstract int r();

    public abstract bb1 t();
}
