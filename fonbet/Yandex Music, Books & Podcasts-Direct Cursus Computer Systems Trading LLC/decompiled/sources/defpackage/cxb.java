package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.yandex.media.ynison.service.c0;
import com.yandex.media.ynison.service.f;
import com.yandex.media.ynison.service.i0;
import com.yandex.media.ynison.service.s0;
import com.yandex.media.ynison.service.x;
import com.yandex.music.shared.playback.core.api.PlaybackQueueStartValidator$InvalidQueueException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.CoverPath;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public abstract class cxb {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final wn5 e = new wn5(new io5(2), 700660815, false);
    public static final wn5 f = new wn5(new ro5(5), 179180270, false);
    public static final wn5 g = new wn5(new dp5(3), 581408029, false);
    public static final int[] h = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] i = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, RemoteCameraConfig.Mic.SAMPLING_RATE, -1, -1, 12000, 24000, ScreenMirroringConfig.Audio.SAMPLING_RATE, -1, -1};
    public static final int[] j = {64, 112, 128, 192, 224, 256, 384, 448, RemoteCameraConfig.Mic.BUFFER_SIZE, 640, 768, 896, 1024, 1152, 1280, 1536, ScreenMirroringConfig.Video.DEFAULT_WIDTH, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] k = {8000, 16000, 32000, 64000, 128000, 22050, RemoteCameraConfig.Mic.SAMPLING_RATE, 88200, 176400, 352800, 12000, 24000, ScreenMirroringConfig.Audio.SAMPLING_RATE, 96000, 192000, 384000};
    public static final int[] l = {5, 8, 10, 12};
    public static final int[] m = {6, 9, 12, 15};
    public static final int[] n = {2, 4, 6, 8};
    public static final int[] o = {9, 11, 13, 16};
    public static final int[] p = {5, 8, 10, 12};
    public static final n1f q = new n1f();
    public static final i6c r;
    public static final i6c[] s;

    static {
        i6c i6cVar = new i6c(CommonUrlParts.APP_SET_ID, 1L);
        r = i6cVar;
        s = new i6c[]{i6cVar};
    }

    public static final void A(aqi aqiVar, fvf fvfVar, jub jubVar, Function1 function1, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1663214404);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(aqiVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(fvfVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(jubVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.h(function1) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object[] objArr = {aqiVar, fvfVar, jubVar, function1};
            boolean h2 = ((i3 & 14) == 4) | oq5Var.h(jubVar) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                swb swbVar = new swb(aqiVar, jubVar, fvfVar, function1, null, 1);
                oq5Var.k0(swbVar);
                K = swbVar;
            }
            gld.z(objArr, (Function2) K, oq5Var);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new kvb(aqiVar, fvfVar, jubVar, function1, i2, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object B(igr igrVar, cg6 cg6Var) {
        jnf jnfVar;
        int i2;
        rj6 rj6Var;
        if (cg6Var instanceof jnf) {
            jnfVar = (jnf) cg6Var;
            int i3 = jnfVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jnfVar.l = i3 - Integer.MIN_VALUE;
                Object obj = jnfVar.k;
                nm6 nm6Var = nm6.a;
                i2 = jnfVar.l;
                if (i2 != 0) {
                    qgg.h0(obj);
                    l18 l18Var = l18.b;
                    bdt I = hag.I(mfn.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    mfn mfnVar = (mfn) qdcVar.C(I);
                    e0t e0tVar = igrVar.k;
                    e0tVar.getClass();
                    if (!(e0tVar instanceof d0t)) {
                        if (e0tVar.equals(f0t.a)) {
                            return Unit.a;
                        }
                        b6e.s();
                        return null;
                    }
                    s9p s9pVar = ((d0t) e0tVar).a;
                    StationId e2 = StationId.e(s9pVar);
                    ArrayList R = o8g.R(s9pVar);
                    jnfVar.j = igrVar;
                    jnfVar.l = 1;
                    obj = mfnVar.a(e2, R, jnfVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    igrVar = jnfVar.j;
                    qgg.h0(obj);
                }
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof pj6)) {
                    throw new PlaybackQueueStartValidator$InvalidQueueException(((pj6) rj6Var).a(), null);
                }
                if (!(rj6Var instanceof qj6)) {
                    b6e.s();
                    return null;
                }
                dgr dgrVar = (dgr) ((qj6) rj6Var).a;
                List list = dgrVar.b;
                list.getClass();
                s9p E = o8g.E(list);
                String str = dgrVar.d;
                str.getClass();
                String str2 = dgrVar.c;
                str2.getClass();
                igrVar.d(new yku(E, str, str2, null, xku.b));
                return Unit.a;
            }
        }
        jnfVar = new jnf(cg6Var);
        Object obj2 = jnfVar.k;
        nm6 nm6Var2 = nm6.a;
        i2 = jnfVar.l;
        if (i2 != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof pj6)) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object C(fvf fvfVar, Continuation continuation) {
        bxb bxbVar;
        int i2;
        if (continuation instanceof bxb) {
            bxbVar = (bxb) continuation;
            int i3 = bxbVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bxbVar.k = i3 - Integer.MIN_VALUE;
                Object obj = bxbVar.j;
                Object obj2 = nm6.a;
                i2 = bxbVar.k;
                if (i2 != 0) {
                    qgg.h0(obj);
                    bxbVar.k = 1;
                    apo apoVar = fvf.w;
                    if (fvfVar.f(0, 0, bxbVar) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            }
        }
        bxbVar = new bxb(continuation);
        Object obj3 = bxbVar.j;
        Object obj22 = nm6.a;
        i2 = bxbVar.k;
        if (i2 != 0) {
        }
        return Unit.a;
    }

    public static void D(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final Boolean E(JsonElement jsonElement) {
        JsonPrimitive S = S(jsonElement);
        if (S != null) {
            if (!(S.a instanceof Boolean)) {
                S = null;
            }
            if (S != null) {
                return Boolean.valueOf(S.s());
            }
        }
        return null;
    }

    public static final Integer F(JsonElement jsonElement) {
        jsonElement.getClass();
        try {
            JsonPrimitive S = S(jsonElement);
            if (S != null) {
                if (!(S.a instanceof Number)) {
                    S = null;
                }
                if (S != null) {
                    return Integer.valueOf(S.a());
                }
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static final JsonObject G(JsonElement jsonElement) {
        jsonElement.getClass();
        jsonElement.getClass();
        if (!(jsonElement instanceof JsonObject)) {
            jsonElement = null;
        }
        if (jsonElement != null) {
            return jsonElement.m();
        }
        return null;
    }

    public static final Long H(JsonElement jsonElement) {
        try {
            JsonPrimitive S = S(jsonElement);
            if (S != null) {
                if (!(S.a instanceof Number)) {
                    S = null;
                }
                if (S != null) {
                    return Long.valueOf(S.o());
                }
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static final String I(JsonElement jsonElement) {
        jsonElement.getClass();
        JsonPrimitive S = S(jsonElement);
        if (S != null) {
            if (!(S.a instanceof String)) {
                S = null;
            }
            if (S != null) {
                return S.q();
            }
        }
        return null;
    }

    public static final Bundle J() {
        return new Bundle(0);
    }

    public static final Bundle K(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.a;
            Object obj = pair.b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        xq0.r("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, 34);
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    xq0.r("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, 34);
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static k03 L(wi4 wi4Var, RuntimeException runtimeException) {
        wi4Var.getClass();
        String message = runtimeException instanceof r7w ? ((r7w) runtimeException).getMessage() : String.valueOf(runtimeException);
        q1c q1cVar = q1c.f;
        r1c r1cVar = r1c.a;
        String str = wi4Var.a;
        String str2 = wi4Var.b;
        if (str2 == null) {
            str2 = "null";
        }
        String str3 = wi4Var.c;
        return new k03(q1cVar, r1cVar, null, str, hrg.r("Failed to handle 3ds challenge for response: ", su4.o(f1d.m("<DiehardResponse: status - ", str, ", code - ", str2, ", desc - "), str3 != null ? str3 : "null", ">"), ", error: \"", message));
    }

    public static ImageView.ScaleType M(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 5 ? i2 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static final rpc N(Context context) {
        return new rpc(new vg0(context), new wg0(Build.VERSION.SDK_INT >= 31 ? uqc.a.a(context) : 0));
    }

    public static oq O(mqs mqsVar) {
        mqsVar.getClass();
        k10 k10Var = mqsVar.d;
        String str = k10Var.a;
        String str2 = k10Var.d;
        CoverPath coverPath = mqsVar.x0.a;
        return new oq(str, str2, null, false, null, null, null, null, k10Var.b, null, 0, null, mqsVar.f, coverPath, 0, false, null, null, null, null, null, null, false, null, 536845820);
    }

    public static final u8n P(v8n v8nVar) {
        if (!(v8nVar instanceof se5)) {
            if (!(v8nVar instanceof igr)) {
                return null;
            }
            xsu xsuVar = ((igr) v8nVar).c;
            xsuVar.getClass();
            return new hgr(xsuVar);
        }
        se5 se5Var = (se5) v8nVar;
        sfm sfmVar = se5Var.d;
        int i2 = se5Var.h;
        mqs mqsVar = se5Var.g;
        int i3 = se5Var.f;
        boolean z = false;
        if (i3 == 0) {
            z = se5Var.c.a.getBoolean("is_shuffle", false);
        } else {
            int D = ouj.D(i3);
            if (D == 0) {
                z = true;
            } else if (D != 1) {
                b6e.s();
                return null;
            }
        }
        return new re5(sfmVar, i2, mqsVar, z, se5Var.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038 A[Catch: ClassNotFoundException -> 0x0057, IOException -> 0x0059, TRY_LEAVE, TryCatch #6 {IOException -> 0x0059, ClassNotFoundException -> 0x0057, blocks: (B:10:0x0015, B:12:0x002c, B:15:0x0033, B:17:0x0038, B:25:0x0053, B:33:0x005d, B:34:0x0060, B:35:0x0061, B:48:0x00a3, B:56:0x00a9, B:57:0x00ac), top: B:9:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061 A[Catch: ClassNotFoundException -> 0x0057, IOException -> 0x0059, TRY_LEAVE, TryCatch #6 {IOException -> 0x0059, ClassNotFoundException -> 0x0057, blocks: (B:10:0x0015, B:12:0x002c, B:15:0x0033, B:17:0x0038, B:25:0x0053, B:33:0x005d, B:34:0x0060, B:35:0x0061, B:48:0x00a3, B:56:0x00a9, B:57:0x00ac), top: B:9:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q97 Q(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream;
        byte[] bArr2;
        byte b2;
        int i2;
        boolean z;
        bArr.getClass();
        if (bArr.length > 10240) {
            xq0.q("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        }
        if (bArr.length == 0) {
            return q97.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            b2 = (byte) (-21267);
            i2 = 0;
        } catch (IOException e2) {
            jsg.j().h(ic7.a, "Error in Data#fromByteArray: ", e2);
        } catch (ClassNotFoundException e3) {
            jsg.j().h(ic7.a, "Error in Data#fromByteArray: ", e3);
        }
        if (bArr2[0] == ((byte) 16777132)) {
            z = true;
            if (bArr2[1] == b2) {
                byteArrayInputStream.reset();
                if (z) {
                    DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                    try {
                        short readShort = dataInputStream.readShort();
                        if (readShort == -21521) {
                            short readShort2 = dataInputStream.readShort();
                            if (readShort2 != 1) {
                                wb8.h(k5r.i(readShort2, "Unsupported version number: "));
                            }
                        } else {
                            wb8.h(k5r.i(readShort, "Magic number doesn't match: "));
                        }
                        int readInt = dataInputStream.readInt();
                        while (i2 < readInt) {
                            linkedHashMap.put(dataInputStream.readUTF(), R(dataInputStream.readByte(), dataInputStream));
                            i2++;
                        }
                        dataInputStream.close();
                    } finally {
                    }
                } else {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        int readInt2 = objectInputStream.readInt();
                        while (i2 < readInt2) {
                            linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                            i2++;
                        }
                        objectInputStream.close();
                    } finally {
                    }
                }
                return new q97(linkedHashMap);
            }
        }
        z = false;
        byteArrayInputStream.reset();
        if (z) {
        }
        return new q97(linkedHashMap);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable R(byte b2, DataInputStream dataInputStream) {
        if (b2 == 0) {
            return null;
        }
        if (b2 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b2 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b2 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b2 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b2 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b2 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b2 == 7) {
            return dataInputStream.readUTF();
        }
        int i2 = 0;
        if (b2 == 8) {
            int readInt = dataInputStream.readInt();
            ?? r0 = new Boolean[readInt];
            while (i2 < readInt) {
                r0[i2] = Boolean.valueOf(dataInputStream.readBoolean());
                i2++;
            }
            return r0;
        }
        if (b2 == 9) {
            int readInt2 = dataInputStream.readInt();
            ?? r02 = new Byte[readInt2];
            while (i2 < readInt2) {
                r02[i2] = Byte.valueOf(dataInputStream.readByte());
                i2++;
            }
            return r02;
        }
        if (b2 == 10) {
            int readInt3 = dataInputStream.readInt();
            ?? r03 = new Integer[readInt3];
            while (i2 < readInt3) {
                r03[i2] = Integer.valueOf(dataInputStream.readInt());
                i2++;
            }
            return r03;
        }
        if (b2 == 11) {
            int readInt4 = dataInputStream.readInt();
            ?? r04 = new Long[readInt4];
            while (i2 < readInt4) {
                r04[i2] = Long.valueOf(dataInputStream.readLong());
                i2++;
            }
            return r04;
        }
        if (b2 == 12) {
            int readInt5 = dataInputStream.readInt();
            ?? r05 = new Float[readInt5];
            while (i2 < readInt5) {
                r05[i2] = Float.valueOf(dataInputStream.readFloat());
                i2++;
            }
            return r05;
        }
        if (b2 == 13) {
            int readInt6 = dataInputStream.readInt();
            ?? r06 = new Double[readInt6];
            while (i2 < readInt6) {
                r06[i2] = Double.valueOf(dataInputStream.readDouble());
                i2++;
            }
            return r06;
        }
        if (b2 != 14) {
            xq0.q(k5r.i(b2, "Unsupported type "));
            return null;
        }
        int readInt7 = dataInputStream.readInt();
        ?? r1 = new String[readInt7];
        while (i2 < readInt7) {
            String readUTF = dataInputStream.readUTF();
            if (Intrinsics.d(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                readUTF = null;
            }
            r1[i2] = readUTF;
            i2++;
        }
        return r1;
    }

    public static final JsonPrimitive S(JsonElement jsonElement) {
        jsonElement.getClass();
        if (!(jsonElement instanceof JsonPrimitive)) {
            jsonElement = null;
        }
        if (jsonElement != null) {
            return jsonElement.n();
        }
        return null;
    }

    public static final List T(x xVar) {
        List A = xVar.A();
        if (A == null) {
            return c5b.a;
        }
        List<f> list = A;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        for (f fVar : list) {
            arrayList.add(fVar.u() + StringUtils.PROCESS_POSTFIX_DELIMITER + fVar.t());
        }
        return arrayList;
    }

    public static v94 U(byte[] bArr) {
        byte[] bArr2;
        byte b2 = bArr[0];
        if (b2 == Byte.MAX_VALUE || b2 == 100 || b2 == 64 || b2 == 113) {
            return new v94(bArr, bArr.length);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = copyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                byte b4 = copyOf[i2];
                int i3 = i2 + 1;
                copyOf[i2] = copyOf[i3];
                copyOf[i3] = b4;
            }
        }
        v94 v94Var = new v94(copyOf, copyOf.length);
        if (copyOf[0] == 31) {
            v94 v94Var2 = new v94(copyOf, copyOf.length);
            while (v94Var2.b() >= 16) {
                v94Var2.t(2);
                int i4 = v94Var2.i(14) & 16383;
                int min = Math.min(8 - v94Var.d, 14);
                int i5 = v94Var.d;
                int i6 = (8 - i5) - min;
                byte[] bArr3 = v94Var.b;
                int i7 = v94Var.c;
                byte b5 = (byte) (((65280 >> i5) | ((1 << i6) - 1)) & bArr3[i7]);
                bArr3[i7] = b5;
                int i8 = 14 - min;
                bArr3[i7] = (byte) (b5 | ((i4 >>> i8) << i6));
                int i9 = i7 + 1;
                while (true) {
                    bArr2 = v94Var.b;
                    if (i8 > 8) {
                        bArr2[i9] = (byte) (i4 >>> (i8 - 8));
                        i8 -= 8;
                        i9++;
                    }
                }
                int i10 = 8 - i8;
                byte b6 = (byte) (bArr2[i9] & ((1 << i10) - 1));
                bArr2[i9] = b6;
                bArr2[i9] = (byte) (((i4 & ((1 << i8) - 1)) << i10) | b6);
                v94Var.t(14);
                v94Var.a();
            }
        }
        v94Var.o(copyOf.length, copyOf);
        return v94Var;
    }

    public static final void V(Throwable th, CoroutineContext coroutineContext) {
        if (th instanceof t98) {
            th = ((t98) th).a;
        }
        try {
            fm6 fm6Var = (fm6) coroutineContext.get(rre.f);
            if (fm6Var != null) {
                fm6Var.N(th);
            } else {
                vwb.P(th, coroutineContext);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                fob.a(runtimeException, th);
                th = runtimeException;
            }
            vwb.P(th, coroutineContext);
        }
    }

    public static int W(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return aa5.c(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static k03 X(String str, String str2, wi4 wi4Var) {
        str.getClass();
        wi4Var.getClass();
        q1c q1cVar = q1c.f;
        r1c r1cVar = r1c.c;
        String str3 = wi4Var.a;
        String str4 = wi4Var.b;
        if (str4 == null) {
            str4 = "null";
        }
        String str5 = wi4Var.c;
        String o2 = su4.o(f1d.m("<DiehardResponse: status - ", str3, ", code - ", str4, ", desc - "), str5 != null ? str5 : "null", ">");
        StringBuilder m2 = f1d.m("Invalid url \"", str, "\" for property \"", str2, "\" in response: ");
        m2.append(o2);
        return new k03(q1cVar, r1cVar, null, str3, m2.toString());
    }

    public static boolean Y(String str) {
        str.getClass();
        return Intrinsics.d(oq.J.a, str);
    }

    public static float Z(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final void a(g21 g21Var, bci bciVar, b21 b21Var, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(444210301);
        int i3 = i2 | (oq5Var2.f(g21Var) ? 4 : 2) | (oq5Var2.h(bciVar) ? 32 : 16) | (oq5Var2.h(b21Var) ? 256 : 128);
        if ((i3 & 1171) == 1170 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            Context context = (Context) oq5Var2.j(AndroidCompositionLocals_androidKt.b);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = tlm.f(gld.R(g.a, oq5Var2), oq5Var2);
            }
            mm6 mm6Var = ((fs5) K).a;
            boolean z = g21Var instanceof f21;
            boolean h2 = ((i3 & 14) == 4) | oq5Var2.h(b21Var) | oq5Var2.h(mm6Var) | oq5Var2.h(context);
            Object K2 = oq5Var2.K();
            if (h2 || K2 == kjnVar) {
                i50 i50Var = new i50(g21Var, b21Var, mm6Var, context, 1);
                oq5Var2.k0(i50Var);
                K2 = i50Var;
            }
            oq5Var = oq5Var2;
            vq1.g(yciVar, bciVar, z, (Function1) K2, oq5Var, 70 | (i3 & 112), 4);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new wl(i2, 8, g21Var, bciVar, b21Var, yciVar);
        }
    }

    public static k03 a0(String str, String str2, qi4 qi4Var) {
        str.getClass();
        qi4Var.getClass();
        q1c q1cVar = q1c.f;
        r1c r1cVar = r1c.b;
        String str3 = qi4Var.a;
        String str4 = qi4Var.b;
        if (str4 == null) {
            str4 = "null";
        }
        String str5 = qi4Var.c;
        String o2 = su4.o(f1d.m("<MobileBackendResponse: status - ", str3, ", code - ", str4, ", desc - "), str5 != null ? str5 : "null", ">");
        StringBuilder m2 = f1d.m("Invalid url \"", str, "\" for property \"", str2, "\" in response: ");
        m2.append(o2);
        return new k03(q1cVar, r1cVar, null, str3, m2.toString());
    }

    public static final void b(int i2, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-735602394);
        if (i2 == 0 && oq5Var.z()) {
            oq5Var.S();
        } else {
            on1.e(1, true, (o0k) oq5Var.j(lkg.a), ((cma) oq5Var.j(lkg.b)).a, oq5Var, 54);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new j3(i2, 22);
        }
    }

    public static k03 b0(qi4 qi4Var) {
        qi4Var.getClass();
        q1c q1cVar = q1c.B;
        r1c r1cVar = r1c.b;
        String str = qi4Var.a;
        String str2 = qi4Var.b;
        if (str2 == null) {
            str2 = "null";
        }
        String str3 = qi4Var.c;
        String str4 = str3 != null ? str3 : "null";
        StringBuilder m2 = f1d.m("<MobileBackendResponse: status - ", str, ", code - ", str2, ", desc - ");
        m2.append(str4);
        m2.append(">");
        return new k03(q1cVar, r1cVar, null, str, "Undefined challenge method: ".concat(m2.toString()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [int] */
    /* JADX WARN: Type inference failed for: r15v9 */
    public static final void c(z74 z74Var, hq5 hq5Var, int i2) {
        z74 z74Var2;
        int i3;
        yci u;
        String str;
        boolean z;
        kjn kjnVar;
        c84 c84Var;
        int i4;
        boolean z2;
        vci vciVar;
        boolean z3;
        boolean z4;
        long j2;
        vci vciVar2;
        char c2;
        boolean z5;
        int i5;
        ?? r15;
        c84 c84Var2;
        vci vciVar3;
        int i6;
        float f2;
        z74Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(436792381);
        int i7 = i2 | (oq5Var.h(z74Var) ? 4 : 2);
        if (oq5Var.P(i7 & 1, (i7 & 3) != 2)) {
            c84 c84Var3 = (c84) szf.Q(z74Var.a.f, oq5Var).getValue();
            vci vciVar4 = vci.a;
            u = d.u(a.a(vciVar4, "cast_picker"), b2c.l, (r2 & 2) == 0);
            float f3 = 8;
            float f4 = 16;
            float f5 = 12;
            yci p2 = androidx.compose.foundation.layout.a.p(d.d(u, 1.0f), f5, f3, f5, f4);
            gz2 gz2Var = b2c.o;
            kx0 kx0Var = qx0.c;
            ta5 a2 = sa5.a(kx0Var, gz2Var, oq5Var, 48);
            int i8 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, p2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l2, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var, i8, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            String M = rvf.M(R.string.cast_picker_cast_title_choose, oq5Var);
            yci m2 = androidx.compose.foundation.layout.a.m(vciVar4, f4);
            Object K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (K == kjnVar2) {
                str = M;
                K = new h14(15);
                oq5Var.k0(K);
            } else {
                str = M;
            }
            float f6 = f3;
            kjn kjnVar3 = kjnVar2;
            xcs.b(str, nfp.b(m2, false, (Function1) K), ((dq0) oq5Var.j(eq0.a)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.c(), oq5Var, 0, 0, 65528);
            oq5Var = oq5Var;
            yci u2 = xp3.u(vciVar4, ugo.a(f4));
            ta5 a3 = sa5.a(kx0Var, b2c.n, oq5Var, 0);
            int i9 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, u2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i9))) {
                ouj.x(i9, oq5Var, i9, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            oq5Var.Z(-718414872);
            List list = c84Var3.a;
            vyb vybVar = c84Var3.b;
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                if (i10 != 0) {
                    oq5Var.Z(-1160228170);
                    c2 = 0;
                    xv7.k(d.d(vciVar4, 1.0f), 0L, 0.0f, 0.0f, oq5Var, 6, 14);
                    z5 = false;
                } else {
                    c2 = 0;
                    z5 = false;
                    oq5Var.Z(-1162356599);
                }
                oq5Var.p(z5);
                b18 b18Var = (b18) c84Var3.a.get(i10);
                boolean h2 = oq5Var.h(z74Var);
                Object K2 = oq5Var.K();
                kjn kjnVar4 = kjnVar3;
                if (h2 || K2 == kjnVar4) {
                    i5 = i10;
                    r15 = z5;
                    c84Var2 = c84Var3;
                    vciVar3 = vciVar4;
                    i6 = size;
                    f2 = f6;
                    m5 m5Var = new m5(1, z74Var, z74.class, "onDeviceItemClick", "onDeviceItemClick(Ljava/lang/String;)V", 0, 26);
                    oq5Var.k0(m5Var);
                    K2 = m5Var;
                } else {
                    i6 = size;
                    i5 = i10;
                    vciVar3 = vciVar4;
                    r15 = z5;
                    f2 = f6;
                    c84Var2 = c84Var3;
                }
                gld.b(b18Var, (Function1) ((h9f) K2), oq5Var, r15);
                i10 = i5 + 1;
                kjnVar3 = kjnVar4;
                c84Var3 = c84Var2;
                size = i6;
                f6 = f2;
                vciVar4 = vciVar3;
            }
            c84 c84Var4 = c84Var3;
            vci vciVar5 = vciVar4;
            float f7 = f6;
            kjn kjnVar5 = kjnVar3;
            oq5Var.p(false);
            oq5Var.p(true);
            if (vybVar != null) {
                oq5Var.Z(-298948201);
                boolean h3 = oq5Var.h(z74Var);
                Object K3 = oq5Var.K();
                if (h3 || K3 == kjnVar5) {
                    t93 t93Var = new t93(0, z74Var, z74.class, "onExplanationButtonClicked", "onExplanationButtonClicked()V", 0, 23);
                    oq5Var.k0(t93Var);
                    K3 = t93Var;
                }
                bg3.f(vybVar, (Function0) ((h9f) K3), oq5Var, 0);
            } else {
                oq5Var.Z(-301390257);
            }
            oq5Var.p(false);
            if (c84Var4.d) {
                oq5Var.Z(-298693784);
                u1g.l(oq5Var, d.e(vciVar5, 24));
                yci u3 = xp3.u(vciVar5, ugo.a(f4));
                agr agrVar = eq0.a;
                yci e2 = d.e(d.d(androidx.compose.foundation.a.b(u3, ((dq0) oq5Var.j(agrVar)).d.c, vnj.i), 1.0f), 56);
                long j3 = ((dq0) oq5Var.j(agrVar)).b.a;
                long j4 = ((dq0) oq5Var.j(agrVar)).c.c;
                boolean h4 = oq5Var.h(z74Var);
                Object K4 = oq5Var.K();
                if (h4 || K4 == kjnVar5) {
                    j2 = j3;
                    vciVar2 = vciVar5;
                    t93 t93Var2 = new t93(0, z74Var, z74.class, "onEasyLoginButtonClicked", "onEasyLoginButtonClicked()V", 0, 24);
                    oq5Var.k0(t93Var2);
                    K4 = t93Var2;
                } else {
                    vciVar2 = vciVar5;
                    j2 = j3;
                }
                c84Var = c84Var4;
                i4 = -301390257;
                kjnVar = kjnVar5;
                z2 = false;
                i3 = 24;
                z = true;
                pd.o(1572912, 32, j2, j4, xv.b, oq5Var, e2, (Function0) ((h9f) K4), true, false);
                oq5Var = oq5Var;
                vciVar = vciVar2;
                eta.p(vciVar, f7, oq5Var, false);
            } else {
                z = true;
                kjnVar = kjnVar5;
                c84Var = c84Var4;
                i4 = -301390257;
                z2 = false;
                vciVar = vciVar5;
                i3 = 24;
                oq5Var.Z(-301390257);
                oq5Var.p(false);
            }
            if (c84Var.c) {
                oq5Var.Z(-297754856);
                yci d2 = d.d(vciVar, 1.0f);
                boolean h5 = oq5Var.h(z74Var);
                Object K5 = oq5Var.K();
                if (h5 || K5 == kjnVar) {
                    z4 = z;
                    z3 = z2;
                    t93 t93Var3 = new t93(0, z74Var, z74.class, "onFeedbackButtonClicked", "onFeedbackButtonClicked()V", 0, 25);
                    z74Var2 = z74Var;
                    oq5Var.k0(t93Var3);
                    K5 = t93Var3;
                } else {
                    z74Var2 = z74Var;
                    z3 = z2;
                    z4 = z;
                }
                bcx.d((Function0) ((h9f) K5), d2, false, xv.c, oq5Var, 3120, 4);
            } else {
                z74Var2 = z74Var;
                z3 = z2;
                z4 = z;
                oq5Var.Z(i4);
            }
            oq5Var.p(z3);
            oq5Var.p(z4);
        } else {
            z74Var2 = z74Var;
            i3 = 24;
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new q2(z74Var2, i2, i3);
        }
    }

    public static int c0(v94 v94Var, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && v94Var.h(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return v94Var.i(iArr[i2]) + i4;
    }

    public static final void d(int i2, long j2, hq5 hq5Var, yci yciVar, Function0 function0) {
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-983995441);
        int i3 = (oq5Var.h(function0) ? 4 : 2) | i2 | (oq5Var.e(j2) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new wt4(function0, j2);
                oq5Var.k0(K);
            }
            ksw.j((i3 >> 6) & 14, oq5Var, yciVar, (Function1) K);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new xt4(function0, j2, yciVar, i2);
        }
    }

    public static void d0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static final void e(Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        Function0 function02;
        oq5 oq5Var;
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1019812209);
        int i3 = (oq5Var2.h(function0) ? 4 : 2) | i2;
        if ((i3 & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            function02 = function0;
            oq5Var = oq5Var2;
        } else {
            yci r2 = d.r(yciVar, 280);
            ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var2, 48);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H = vnj.H(oq5Var2, r2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a2, wp5.f);
            g0g.U(oq5Var2, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            vwb.i(d.z(new LayoutWeightElement(false, 1.0f), 3), oq5Var2, 0);
            vci vciVar = vci.a;
            xv7.k(androidx.compose.foundation.layout.a.o(vciVar, 0.0f, 16, 1), ((dq0) oq5Var2.j(eq0.a)).c.c, 1, 0.0f, oq5Var2, 390, 8);
            function02 = function0;
            hdg.o(rvf.M(R.string.start_trial_success_button_text, oq5Var2), function02, d.d(vciVar, 1.0f), 0.0f, oq5Var2, ((i3 << 3) & 112) | 384, 8);
            oq5Var = oq5Var2;
            oq5Var.p(true);
        }
        xmn r3 = oq5Var.r();
        if (r3 != null) {
            r3.d = new kx(function02, yciVar, i2, 5);
        }
    }

    public static final boolean e0(x xVar, x xVar2) {
        xVar.getClass();
        if (xVar == xVar2) {
            return true;
        }
        if (xVar2 == null) {
            return false;
        }
        s0 E = xVar.E();
        E.getClass();
        if (h0(E, xVar2.E())) {
            return true;
        }
        if (Intrinsics.d(xVar.C(), xVar2.C()) && xVar.r() == xVar2.r()) {
            List A = xVar.A();
            A.getClass();
            if (i4w.A(A, xVar2.A(), new t83(17))) {
                i0 D = xVar.D();
                D.getClass();
                if (g0(D, xVar2.D()) && Intrinsics.d(xVar.y(), xVar2.y())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void f(s48 s48Var, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1122114476);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var2.f(s48Var) : oq5Var2.h(s48Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        boolean z = false;
        if (oq5Var2.P(i3 & 1, (i3 & 19) != 18)) {
            yci a2 = a.a(yciVar, "disable_offline_button");
            kfh d2 = ug3.d(b2c.f, false);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H = vnj.H(oq5Var2, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d2, wp5.f);
            g0g.U(oq5Var2, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            String M = rvf.M(R.string.stub_button_disable_offline_mode, oq5Var2);
            if ((i3 & 14) == 4 || ((i3 & 8) != 0 && oq5Var2.h(s48Var))) {
                z = true;
            }
            Object K = oq5Var2.K();
            if (z || K == gq5.a) {
                K = new ej6(0, s48Var, s48.class, "onDisableOfflineClick", "onDisableOfflineClick()V", 0, 22);
                oq5Var2.k0(K);
            }
            oq5Var = oq5Var2;
            hdg.t(M, (Function0) ((h9f) K), d.t(vci.a, 260, 0.0f, 2), null, oq5Var, 384, 8);
            oq5Var.p(true);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new z2(s48Var, yciVar, i2, 25);
        }
    }

    public static final boolean f0(c0 c0Var, c0 c0Var2, boolean z) {
        c0Var.getClass();
        if (c0Var == c0Var2) {
            return true;
        }
        if (c0Var2 != null) {
            s0 p2 = c0Var.p();
            p2.getClass();
            if (h0(p2, c0Var2.p())) {
                return true;
            }
            if ((!z || Math.abs(c0Var.o() - c0Var2.o()) <= 2000) && c0Var.m() == c0Var2.m() && c0Var.n() == c0Var2.n()) {
                return true;
            }
        }
        return false;
    }

    public static final void g(Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-618793039);
        int i3 = (oq5Var.h(function0) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            if (vq2.R((Context) oq5Var.j(AndroidCompositionLocals_androidKt.b)) != null) {
                oq5Var.Z(-463601532);
                Object K = oq5Var.K();
                kjn kjnVar = gq5.a;
                if (K == kjnVar) {
                    K = gld.R(g.a, oq5Var);
                    oq5Var.k0(K);
                }
                mm6 mm6Var = (mm6) K;
                boolean z = (i3 & 14) == 4;
                Object K2 = oq5Var.K();
                if (z || K2 == kjnVar) {
                    K2 = new s48(mm6Var, function0);
                    oq5Var.k0(K2);
                }
                f((s48) K2, yciVar, oq5Var, 48);
            } else {
                oq5Var.Z(-464496719);
            }
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new kx(function0, yciVar, i2, 7);
        }
    }

    public static final boolean g0(i0 i0Var, i0 i0Var2) {
        i0Var.getClass();
        if (i0Var == i0Var2) {
            return true;
        }
        if (i0Var2 != null && i0Var.i() == i0Var2.i()) {
            return Intrinsics.d(i0Var.j(), i0Var2.j());
        }
        return false;
    }

    public static final void h(zwa zwaVar, hq5 hq5Var, int i2) {
        zwaVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1070924861);
        int i3 = (oq5Var.h(zwaVar) ? 4 : 2) | i2;
        if ((i3 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            x97.h(zwaVar, null, oq5Var, i3 & 14);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new nha(zwaVar, i2, 4);
        }
    }

    public static final boolean h0(s0 s0Var, s0 s0Var2) {
        if (s0Var == s0Var2) {
            return true;
        }
        return s0Var2 != null && Intrinsics.d(s0Var.j(), s0Var2.j()) && s0Var.l() == s0Var2.l();
    }

    public static final void i(seb sebVar, hq5 hq5Var, int i2) {
        sebVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-26185760);
        int i3 = (oq5Var.f(sebVar) ? 4 : 2) | i2;
        if ((i3 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean z = (i3 & 14) == 4;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new ita(8, sebVar);
                oq5Var.k0(K);
            }
            wyf.c(null, null, null, null, (Function0) K, oq5Var, 0, 31);
            float f2 = 24;
            yci p2 = androidx.compose.foundation.layout.a.p(d.d(vci.a, 1.0f), f2, f2, f2, 32);
            ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, p2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            pcg.i(null, ild.C(-215190745, new ueb(sebVar), oq5Var), oq5Var, 48);
            oq5Var.p(true);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new ueb(sebVar, i2);
        }
    }

    public static final void i0(Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final void j(ptb ptbVar, jub jubVar, hq5 hq5Var, int i2) {
        boolean z;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(438946823);
        if ((((oq5Var.d(ptbVar.ordinal()) ? 4 : 2) | i2 | (oq5Var.h(jubVar) ? 32 : 16)) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            int ordinal = ptbVar.ordinal();
            if (ordinal != 0) {
                z = true;
                if (ordinal != 1) {
                    b6e.s();
                    return;
                }
            } else {
                z = false;
            }
            boolean h2 = oq5Var.h(jubVar);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                K = new dub(jubVar, 3);
                oq5Var.k0(K);
            }
            pd.c(0, 0, oq5Var, (Function0) K, z);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new svb(ptbVar, jubVar, i2, 1);
        }
    }

    public static final void j0(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(final fvf fvfVar, final xit xitVar, sdr sdrVar, final aqi aqiVar, final ab0 ab0Var, final c6h c6hVar, final sdr sdrVar2, final hvb hvbVar, final pcu pcuVar, final sdr sdrVar3, jub jubVar, final List list, Function1 function1, final wn5 wn5Var, yci yciVar, hq5 hq5Var, int i2) {
        boolean z;
        final cma cmaVar;
        int i3;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(439916773);
        int i4 = i2 | (oq5Var.f(fvfVar) ? 4 : 2) | (oq5Var.f(xitVar) ? 32 : 16) | (oq5Var.f(sdrVar) ? 256 : 128) | (oq5Var.f(aqiVar) ? 2048 : 1024) | (oq5Var.h(ab0Var) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(c6hVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.f(sdrVar2) ? 1048576 : 524288) | (oq5Var.f(hvbVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | (oq5Var.f(pcuVar) ? 67108864 : 33554432) | (oq5Var.f(sdrVar3) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i5 = (oq5Var.h(jubVar) ? 4 : 2) | (oq5Var.f(list) ? 32 : 16) | (oq5Var.h(function1) ? 256 : 128) | (oq5Var.h(wn5Var) ? 2048 : 1024) | 24576;
        if ((i4 & 306783379) == 306783378 && (i5 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            final aqi O = gld.O(jubVar.n, oq5Var);
            boolean h2 = oq5Var.h(jubVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                K = new jvb(jubVar, 2);
                oq5Var.k0(K);
            }
            int i6 = i4 & 14;
            nt0.o(fvfVar, O, (Function1) K, oq5Var, i6);
            float f2 = ivb.a;
            hvbVar.getClass();
            boolean z2 = hvbVar instanceof gvb;
            if (z2) {
                z = z2;
                cmaVar = new cma(((gvb) hvbVar).c());
            } else {
                z = z2;
                if (!(hvbVar instanceof dvb)) {
                    b6e.s();
                    return;
                }
                cmaVar = null;
            }
            A(O, fvfVar, jubVar, function1, oq5Var, ((i4 << 3) & 112) | ((i5 << 6) & 896) | ((i5 << 3) & 7168));
            int i7 = i4 >> 21;
            n(fvfVar, pcuVar, sdrVar3, aqiVar, jubVar, oq5Var, ((i5 << 12) & 57344) | (i7 & 896) | (i7 & 112) | i6 | (i4 & 7168));
            int i8 = 1;
            boolean h3 = (i6 == 4) | oq5Var.h(jubVar);
            Object K2 = oq5Var.K();
            if (h3 || K2 == kjnVar) {
                K2 = new awb(fvfVar, jubVar, null, i8);
                oq5Var.k0(K2);
            }
            gld.w(oq5Var, fvfVar, (Function2) K2);
            final List list2 = ((mtb) O.getValue()).a;
            final boolean z3 = ((mtb) O.getValue()).b;
            Object K3 = oq5Var.K();
            if (K3 == kjnVar) {
                K3 = szf.U(new pvb(hvbVar, sdrVar, i8));
                oq5Var.k0(K3);
            }
            final sdr sdrVar4 = (sdr) K3;
            boolean z4 = ((i4 & 1879048192) == 536870912) | (i6 == 4);
            Object K4 = oq5Var.K();
            if (z4 || K4 == kjnVar) {
                i3 = 1;
                K4 = new cwb(sdrVar3, fvfVar, null, i3);
                oq5Var.k0(K4);
            } else {
                i3 = 1;
            }
            gld.w(oq5Var, sdrVar3, (Function2) K4);
            Object K5 = oq5Var.K();
            if (K5 == kjnVar) {
                K5 = szf.U(new xtb(sdrVar3, 4));
                oq5Var.k0(K5);
            }
            final sdr sdrVar5 = (sdr) K5;
            Boolean valueOf = Boolean.valueOf((((Boolean) sdrVar5.getValue()).booleanValue() && z) ? i3 : 0);
            Object K6 = oq5Var.K();
            if (K6 == kjnVar) {
                K6 = new dcb(25);
                oq5Var.k0(K6);
            }
            ot0.l(valueOf, (Function1) K6, null, p6h.a, null, false, ild.C(945162786, new pyc() { // from class: wwb
                @Override // defpackage.pyc
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Object wvbVar;
                    boolean z5;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    hq5 hq5Var2 = (hq5) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= ((oq5) hq5Var2).g(booleanValue) ? 4 : 2;
                    }
                    if ((intValue & 19) == 18) {
                        oq5 oq5Var2 = (oq5) hq5Var2;
                        if (oq5Var2.z()) {
                            oq5Var2.S();
                            return Unit.a;
                        }
                    }
                    hvb hvbVar2 = hvb.this;
                    aqi aqiVar2 = aqiVar;
                    sdr sdrVar6 = sdrVar3;
                    c6h c6hVar2 = c6hVar;
                    vci vciVar = vci.a;
                    if (booleanValue && (hvbVar2 instanceof gvb)) {
                        oq5 oq5Var3 = (oq5) hq5Var2;
                        oq5Var3.Z(-460889241);
                        b2h b2 = d2h.b((gvb) hvbVar2, tt0.F(oq5Var3), oq5Var3);
                        yci c2 = d.c(vciVar, 1.0f);
                        float j2 = qt4.j(oq5Var3);
                        WeakHashMap weakHashMap = rqv.w;
                        y2h.e(aqiVar2, sdrVar6, b2, c6hVar2, androidx.compose.foundation.layout.a.q(c2, 0.0f, ivb.a(hvbVar2) + tt0.F(oq5Var3), 0.0f, p6g.n(z7l.h(oq5Var3).e, oq5Var3).a() + j2, 5), oq5Var3, 0);
                        oq5Var3.p(false);
                    } else {
                        oq5 oq5Var4 = (oq5) hq5Var2;
                        oq5Var4.Z(-460146915);
                        ox0 ox0Var = (ox0) sdrVar4.getValue();
                        gz2 gz2Var = b2c.o;
                        boolean z6 = !((Boolean) sdrVar5.getValue()).booleanValue();
                        yci c3 = d.c(vciVar, 1.0f);
                        boolean f3 = oq5Var4.f(sdrVar6) | oq5Var4.f(aqiVar2) | oq5Var4.h(c6hVar2);
                        pcu pcuVar2 = pcuVar;
                        boolean h4 = f3 | oq5Var4.h(pcuVar2);
                        sdr sdrVar7 = sdrVar2;
                        boolean f4 = h4 | oq5Var4.f(sdrVar7);
                        ab0 ab0Var2 = ab0Var;
                        boolean h5 = f4 | oq5Var4.h(ab0Var2) | oq5Var4.f(hvbVar2);
                        List list3 = list2;
                        boolean f5 = h5 | oq5Var4.f(list3);
                        List list4 = list;
                        boolean f6 = f5 | oq5Var4.f(list4);
                        cma cmaVar2 = cmaVar;
                        boolean f7 = f6 | oq5Var4.f(cmaVar2);
                        boolean z7 = z3;
                        boolean g2 = f7 | oq5Var4.g(z7);
                        wn5 wn5Var2 = wn5Var;
                        boolean f8 = g2 | oq5Var4.f(wn5Var2);
                        aqi aqiVar3 = O;
                        boolean f9 = f8 | oq5Var4.f(aqiVar3);
                        Object K7 = oq5Var4.K();
                        if (f9 || K7 == gq5.a) {
                            z5 = false;
                            wvbVar = new wvb(list3, sdrVar6, aqiVar2, c6hVar2, pcuVar2, sdrVar7, ab0Var2, hvbVar2, list4, cmaVar2, z7, wn5Var2, aqiVar3, 1);
                            oq5Var4.k0(wvbVar);
                        } else {
                            wvbVar = K7;
                            z5 = false;
                        }
                        weo.g(c3, fvfVar, xitVar, ox0Var, gz2Var, null, z6, (Function1) wvbVar, oq5Var4, 196608, 72);
                        oq5Var4.p(z5);
                    }
                    return Unit.a;
                }
            }, oq5Var), oq5Var, 1575984, 52);
            oq5Var = oq5Var;
            yciVar2 = vci.a;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new vvb(fvfVar, xitVar, sdrVar, aqiVar, ab0Var, c6hVar, sdrVar2, hvbVar, pcuVar, sdrVar3, jubVar, list, function1, wn5Var, yciVar2, i2, 1);
        }
    }

    public static void k0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = hasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0241, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r5.K(), java.lang.Integer.valueOf(r6)) == false) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(sdr sdrVar, jub jubVar, st4 st4Var, float f2, hvb hvbVar, ab0 ab0Var, f83 f83Var, List list, Function1 function1, wn5 wn5Var, yci yciVar, hq5 hq5Var, int i2) {
        Boolean bool;
        Object ak1Var;
        aqi aqiVar;
        cma cmaVar;
        aqi aqiVar2;
        kb5 kb5Var;
        q0k a2;
        float a3;
        vci vciVar;
        pcu pcuVar;
        Object obj;
        aqi aqiVar3;
        aqi aqiVar4;
        int i3;
        pj2 pj2Var;
        c6h c6hVar;
        float f3;
        boolean z;
        ?? r11;
        oq5 oq5Var;
        yci yciVar2;
        oq5 oq5Var2;
        wn5 wn5Var2 = xv7.g;
        sdrVar.getClass();
        jubVar.getClass();
        st4Var.getClass();
        hvbVar.getClass();
        ab0Var.getClass();
        f83Var.getClass();
        list.getClass();
        function1.getClass();
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-153401233);
        int i4 = i2 | (oq5Var3.f(sdrVar) ? 4 : 2) | (oq5Var3.h(jubVar) ? 32 : 16) | (oq5Var3.h(st4Var) ? 256 : 128) | (oq5Var3.c(f2) ? 2048 : 1024) | (oq5Var3.f(hvbVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var3.h(ab0Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var3.h(f83Var) ? 1048576 : 524288) | (oq5Var3.h(function1) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        if ((i4 & 306783379) == 306783378 && oq5Var3.z()) {
            oq5Var3.S();
            f3 = f2;
            oq5Var2 = oq5Var3;
        } else {
            fvf a4 = hvf.a(0, 0, oq5Var3, 0, 3);
            boolean f4 = oq5Var3.f(jubVar);
            Object K = oq5Var3.K();
            Object obj2 = gq5.a;
            if (f4 || K == obj2) {
                K = jubVar.a();
                oq5Var3.k0(K);
            }
            c6h c6hVar2 = (c6h) K;
            aqi O = gld.O(c6hVar2.n(), oq5Var3);
            Boolean bool2 = Boolean.FALSE;
            boolean f5 = oq5Var3.f(O);
            Object K2 = oq5Var3.K();
            Continuation continuation = null;
            if (f5 || K2 == obj2) {
                K2 = new jwb(O, continuation, 1);
                oq5Var3.k0(K2);
            }
            aqi l0 = szf.l0(bool2, O, (Function2) K2, oq5Var3);
            aqi M = gld.M(jubVar.j, oq5Var3);
            Boolean bool3 = (Boolean) l0.getValue();
            boolean booleanValue = bool3.booleanValue();
            boolean f6 = oq5Var3.f(M) | oq5Var3.g(booleanValue) | oq5Var3.f(a4);
            Object K3 = oq5Var3.K();
            if (f6 || K3 == obj2) {
                bool = bool2;
                aqiVar = M;
                ak1Var = new ak1(aqiVar, booleanValue, a4, (Continuation) null, 4);
                cmaVar = null;
                oq5Var3.k0(ak1Var);
            } else {
                ak1Var = K3;
                bool = bool2;
                aqiVar = M;
                cmaVar = null;
            }
            aqi aqiVar5 = aqiVar;
            aqi j0 = szf.j0(bool, a4, bool3, aqiVar5, (Function2) ak1Var, oq5Var3, 6);
            cma cmaVar2 = ((Boolean) j0.getValue()).booleanValue() ? new cma(qt4.j(oq5Var3)) : cmaVar;
            float f7 = cmaVar2 != null ? cmaVar2.a : 0;
            WeakHashMap weakHashMap = rqv.w;
            eoe n2 = p6g.n(z7l.h(oq5Var3).l, oq5Var3);
            float d2 = n2.d();
            float a5 = n2.a() + f7;
            float f8 = 8;
            q0k c2 = androidx.compose.foundation.layout.a.c(0.0f, d2, 0.0f, a5 + f8, 5);
            q0k c3 = androidx.compose.foundation.layout.a.c(0.0f, f2, 0.0f, 0.0f, 13);
            Boolean bool4 = (Boolean) l0.getValue();
            bool4.getClass();
            boolean f9 = oq5Var3.f(l0) | oq5Var3.f(a4);
            Object K4 = oq5Var3.K();
            if (f9 || K4 == obj2) {
                aqiVar2 = O;
                K4 = new gwb(a4, l0, null, 1);
                oq5Var3.k0(K4);
            } else {
                aqiVar2 = O;
            }
            gld.w(oq5Var3, bool4, (Function2) K4);
            boolean h2 = oq5Var3.h(jubVar);
            Object K5 = oq5Var3.K();
            if (h2 || K5 == obj2) {
                K5 = new jvb(jubVar, 3);
                oq5Var3.k0(K5);
            }
            gld.k(jubVar, (Function1) K5, oq5Var3);
            aqi M2 = gld.M(c6hVar2.c(), oq5Var3);
            j((ptb) aqiVar5.getValue(), jubVar, oq5Var3, i4 & 112);
            iz2 iz2Var = b2c.b;
            kfh d3 = ug3.d(iz2Var, false);
            int i5 = oq5Var3.P;
            androidx.compose.runtime.internal.a l2 = oq5Var3.l();
            yci H = vnj.H(oq5Var3, yciVar);
            xp5.T.getClass();
            Function0 function0 = wp5.b;
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(function0);
            } else {
                oq5Var3.n0();
            }
            kb5 kb5Var2 = wp5.f;
            g0g.U(oq5Var3, d3, kb5Var2);
            kb5 kb5Var3 = wp5.e;
            g0g.U(oq5Var3, l2, kb5Var3);
            kb5 kb5Var4 = wp5.g;
            if (oq5Var3.O) {
                kb5Var = kb5Var2;
            } else {
                kb5Var = kb5Var2;
            }
            ouj.x(i5, oq5Var3, i5, kb5Var4);
            kb5 kb5Var5 = wp5.d;
            g0g.U(oq5Var3, H, kb5Var5);
            pj2 P = xv.P(sdrVar, oq5Var3);
            int i6 = i4 << 3;
            kb5 kb5Var6 = kb5Var;
            int i7 = 1;
            pcu M3 = asq.M(xpg.a(oq5Var3), sdrVar, M2, gld.O(jubVar.o, oq5Var3), a4, oq5Var3, i6 & 112);
            boolean f10 = oq5Var3.f(P);
            Object K6 = oq5Var3.K();
            if (f10 || K6 == obj2) {
                K6 = new hwb(P, i7);
                oq5Var3.k0(K6);
            }
            vci vciVar2 = vci.a;
            yci t = wyf.t(vciVar2, (Function0) K6);
            t.getClass();
            yci c4 = d.c(f83Var.b(t), 1.0f);
            kfh d4 = ug3.d(iz2Var, false);
            int i8 = oq5Var3.P;
            androidx.compose.runtime.internal.a l3 = oq5Var3.l();
            yci H2 = vnj.H(oq5Var3, c4);
            oq5Var3.d0();
            if (oq5Var3.O) {
                oq5Var3.k(function0);
            } else {
                oq5Var3.n0();
            }
            g0g.U(oq5Var3, d4, kb5Var6);
            g0g.U(oq5Var3, l3, kb5Var3);
            if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var3, i8, kb5Var4);
            }
            g0g.U(oq5Var3, H2, kb5Var5);
            o8g.f(M3, ((Boolean) l0.getValue()).booleanValue() || aqiVar5.getValue() == ptb.b, oq5Var3, 0);
            int ordinal = ((ptb) aqiVar5.getValue()).ordinal();
            if (ordinal == 0) {
                oq5Var3.Z(-86002782);
                dvb dvbVar = dvb.a;
                if (hvbVar.equals(dvbVar)) {
                    a2 = androidx.compose.foundation.layout.a.a(v0k.a, 0.0f, 2);
                } else if (!(hvbVar instanceof gvb)) {
                    b6e.s();
                    return;
                } else {
                    gvb gvbVar = (gvb) hvbVar;
                    a2 = androidx.compose.foundation.layout.a.a((gvbVar.a() - gvbVar.c()) / 2, 0.0f, 2);
                }
                if (hvbVar.equals(dvbVar)) {
                    a3 = 0;
                } else if (!(hvbVar instanceof gvb)) {
                    b6e.s();
                    return;
                } else {
                    gvb gvbVar2 = (gvb) hvbVar;
                    a3 = ((gvbVar2.a() - gvbVar2.c()) / 2) - v0k.a;
                }
                float Q = ff7.Q(a3, oq5Var3);
                qzm[] qzmVarArr = {lkg.a.a(a2), lkg.b.a(new cma(f8)), ivb.b.a(hvbVar), glg.a.a(jubVar.e)};
                vciVar = vciVar2;
                pcuVar = M3;
                obj = obj2;
                aqiVar3 = aqiVar5;
                aqiVar4 = M2;
                i3 = i6;
                nvb nvbVar = new nvb(f2, Q, c3, c2, P, a4, sdrVar, aqiVar4, ab0Var, c6hVar2, hvbVar, pcuVar, aqiVar2, jubVar, list, function1, wn5Var, 1);
                pj2Var = P;
                c6hVar = c6hVar2;
                f3 = f2;
                oq5 oq5Var4 = oq5Var3;
                etn.m(qzmVarArr, ild.C(-205135573, nvbVar, oq5Var4), oq5Var4, 56);
                z = false;
                oq5Var4.p(false);
                r11 = 1;
                oq5Var = oq5Var4;
            } else {
                if (ordinal != 1) {
                    throw vz1.i(oq5Var3, -695513197, false);
                }
                oq5Var3.Z(-83422621);
                boolean f11 = oq5Var3.f(jubVar);
                Object K7 = oq5Var3.K();
                if (f11 || K7 == obj2) {
                    K7 = new sub(jubVar.a.b, jubVar.b);
                    oq5Var3.k0(K7);
                }
                wn5Var2.invoke((sub) K7, oq5Var3, 48);
                oq5Var3.p(false);
                pcuVar = M3;
                oq5Var = oq5Var3;
                vciVar = vciVar2;
                z = false;
                obj = obj2;
                pj2Var = P;
                r11 = 1;
                aqiVar3 = aqiVar5;
                c6hVar = c6hVar2;
                aqiVar4 = M2;
                i3 = i6;
                f3 = f2;
            }
            oq5Var.p(r11);
            vci vciVar3 = vciVar;
            yci d5 = d.d(d.e(vciVar3, f3), 1.0f);
            pj2 pj2Var2 = pj2Var;
            boolean e2 = pcuVar.e();
            boolean h3 = oq5Var.h(pcuVar);
            Object K8 = oq5Var.K();
            Object obj3 = obj;
            if (h3 || K8 == obj3) {
                K8 = new at4(pcuVar, 2);
                oq5Var.k0(K8);
            }
            Function0 function02 = (Function0) K8;
            aqi aqiVar6 = aqiVar3;
            boolean f12 = oq5Var.f(aqiVar6) | oq5Var.h(pcuVar);
            Object K9 = oq5Var.K();
            if (f12 || K9 == obj3) {
                K9 = new ovb(aqiVar6, pcuVar, r11);
                oq5Var.k0(K9);
            }
            yci A = tt0.A(d5, pj2Var2, function02, (Function0) K9, e2, true, f83Var);
            iz2 iz2Var2 = b2c.c;
            b bVar = b.a;
            u1g.l(oq5Var, bVar.a(A, iz2Var2));
            oq5Var.Z(2074675216);
            yci a6 = bVar.a(vciVar3, b2c.i);
            if (((Boolean) l0.getValue()).booleanValue()) {
                boolean booleanValue2 = ((Boolean) l0.getValue()).booleanValue();
                Object K10 = oq5Var.K();
                if (K10 == obj3) {
                    K10 = vz1.h(oq5Var);
                }
                uoi uoiVar = (uoi) K10;
                boolean h4 = oq5Var.h(c6hVar);
                Object K11 = oq5Var.K();
                if (h4 || K11 == obj3) {
                    K11 = new qvb(c6hVar, r11);
                    oq5Var.k0(K11);
                }
                yciVar2 = androidx.compose.foundation.a.d(vciVar3, uoiVar, null, booleanValue2, null, null, (Function0) K11, 24);
            } else {
                yciVar2 = vciVar3;
            }
            yci f13 = a6.f(yciVar2);
            oq5Var.p(z);
            hq5 hq5Var2 = oq5Var;
            xv7.g(j0, ab0Var, aqiVar4, st4Var, pj2Var2, pcuVar, f83Var, f13, hq5Var2, ((i4 >> 12) & 112) | (i3 & 7168) | (i4 & 3670016));
            oq5 oq5Var5 = hq5Var2;
            oq5Var5.p(r11);
            oq5Var2 = oq5Var5;
        }
        xmn r2 = oq5Var2.r();
        if (r2 != null) {
            r2.d = new rvb(sdrVar, jubVar, st4Var, f3, hvbVar, ab0Var, f83Var, list, function1, wn5Var, yciVar, i2, 1);
        }
    }

    public static byte[] l0(q97 q97Var) {
        q97Var.getClass();
        HashMap hashMap = q97Var.a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(hashMap.size());
                for (Map.Entry entry : hashMap.entrySet()) {
                    m0(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } catch (IOException e2) {
            jsg.j().h(ic7.a, "Error in Data#toByteArray: ", e2);
            return new byte[0];
        }
    }

    public static final void m(t5c t5cVar, hq5 hq5Var, int i2) {
        t5cVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(214552549);
        int i3 = (oq5Var.f(t5cVar) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 3) != 2)) {
            z5c z5cVar = (z5c) gld.O(t5cVar.f, oq5Var).getValue();
            if (z5cVar instanceof x5c) {
                oq5Var.Z(823860280);
                gld.o((x5c) z5cVar, t5cVar, oq5Var, (i3 << 3) & 112);
                oq5Var.p(false);
            } else {
                if (!Intrinsics.d(z5cVar, y5c.a)) {
                    throw vz1.i(oq5Var, 26572568, false);
                }
                oq5Var.Z(824048295);
                boolean z = (i3 & 14) == 4;
                Object K = oq5Var.K();
                if (z || K == gq5.a) {
                    K = new ceb(0, t5cVar, t5c.class, "onPlayVibeClick", "onPlayVibeClick()V", 0, 20);
                    oq5Var.k0(K);
                }
                wdp.R((Function0) ((h9f) K), oq5Var, 2131231417, 0);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new nha(t5cVar, i2, 10);
        }
    }

    public static final void m0(DataOutputStream dataOutputStream, String str, Object obj) {
        int i2;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                kac.l(ern.a(obj.getClass()).h(), "Unsupported value type ");
                return;
            }
            Object[] objArr = (Object[]) obj;
            lm4 a2 = ern.a(objArr.getClass());
            if (a2.equals(ern.a(Boolean[].class))) {
                i2 = 8;
            } else if (a2.equals(ern.a(Byte[].class))) {
                i2 = 9;
            } else if (a2.equals(ern.a(Integer[].class))) {
                i2 = 10;
            } else if (a2.equals(ern.a(Long[].class))) {
                i2 = 11;
            } else if (a2.equals(ern.a(Float[].class))) {
                i2 = 12;
            } else if (a2.equals(ern.a(Double[].class))) {
                i2 = 13;
            } else {
                if (!a2.equals(ern.a(String[].class))) {
                    kac.l(ern.a(objArr.getClass()).f(), "Unsupported value type ");
                    return;
                }
                i2 = 14;
            }
            dataOutputStream.writeByte(i2);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i2 == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i2 == 9) {
                    Byte b2 = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b2 != null ? b2.byteValue() : (byte) 0);
                } else if (i2 == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i2 == 11) {
                    Long l2 = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l2 != null ? l2.longValue() : 0L);
                } else if (i2 == 12) {
                    Float f2 = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f2 != null ? f2.floatValue() : 0.0f);
                } else if (i2 == 13) {
                    Double d2 = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d2 != null ? d2.doubleValue() : 0.0d);
                } else if (i2 == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public static final void n(fvf fvfVar, pcu pcuVar, sdr sdrVar, aqi aqiVar, jub jubVar, hq5 hq5Var, int i2) {
        sdr sdrVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(955179801);
        int i3 = (oq5Var.f(fvfVar) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(pcuVar) : oq5Var.h(pcuVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            sdrVar2 = sdrVar;
            i3 |= oq5Var.f(sdrVar2) ? 256 : 128;
        } else {
            sdrVar2 = sdrVar;
        }
        int i4 = i3 | (oq5Var.f(aqiVar) ? 2048 : 1024);
        if ((i2 & 24576) == 0) {
            i4 |= oq5Var.h(jubVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i4 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            View view = (View) oq5Var.j(AndroidCompositionLocals_androidKt.f);
            boolean h2 = oq5Var.h(view);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                K = new xvb(view, 1);
                oq5Var.k0(K);
            }
            gld.k(view, (Function1) K, oq5Var);
            Object[] objArr = {fvfVar, pcuVar, aqiVar, jubVar};
            boolean h3 = ((i4 & 14) == 4) | ((i4 & 112) == 32 || ((i4 & 64) != 0 && oq5Var.h(pcuVar))) | ((i4 & 7168) == 2048) | ((i4 & 896) == 256) | oq5Var.h(jubVar) | oq5Var.h(view);
            Object K2 = oq5Var.K();
            if (h3 || K2 == kjnVar) {
                nwb nwbVar = new nwb(fvfVar, pcuVar, aqiVar, sdrVar2, jubVar, view, null, 1);
                oq5Var.k0(nwbVar);
                K2 = nwbVar;
            }
            gld.z(objArr, (Function2) K2, oq5Var);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new yvb(fvfVar, pcuVar, sdrVar, aqiVar, jubVar, i2, 1);
        }
    }

    public static final JsonObject n0(String str) {
        str.getClass();
        try {
            if (StringsKt.U(str)) {
                str = null;
            }
            if (str != null) {
                JsonElement b2 = JsonParser.b(str);
                if (!(b2 instanceof JsonObject)) {
                    b2 = null;
                }
                if (b2 != null) {
                    return b2.m();
                }
            }
        } catch (JsonParseException | IOException | IllegalStateException unused) {
        }
        return null;
    }

    public static final void o(vze vzeVar, int i2, Function2 function2, yci yciVar, hq5 hq5Var, int i3) {
        int i4;
        function2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(515360165);
        int i5 = (oq5Var.f(vzeVar) ? 4 : 2) | i3 | (oq5Var.d(i2) ? 32 : 16) | (oq5Var.h(function2) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if (oq5Var.P(i5 & 1, (i5 & 1171) != 1170)) {
            e9g e9gVar = e9g.b;
            ru ruVar = vzeVar.b;
            switch (i0f.a[vzeVar.a.b.ordinal()]) {
                case 1:
                    i4 = R.string.podcast;
                    break;
                case 2:
                    i4 = R.string.book;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    i4 = R.string.album;
                    break;
                default:
                    b6e.s();
                    return;
            }
            yci D = ksw.D(yciVar, rvf.M(i4, oq5Var), null);
            boolean z = ((i5 & 14) == 4) | ((i5 & 896) == 256) | ((i5 & 112) == 32);
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new de(function2, vzeVar, i2, 19);
                oq5Var.k0(K);
            }
            fxf.b(ruVar, (Function0) K, D, null, e9gVar, oq5Var, 24576, 8);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new yja(vzeVar, i2, function2, yciVar, i3, 11);
        }
    }

    public static k03 o0(wi4 wi4Var) {
        wi4Var.getClass();
        q1c r2 = yd5.r(wi4Var);
        r1c r1cVar = r1c.c;
        String str = wi4Var.a;
        String str2 = wi4Var.b;
        if (str2 == null) {
            str2 = "null";
        }
        String str3 = wi4Var.c;
        String str4 = str3 != null ? str3 : "null";
        StringBuilder m2 = f1d.m("<DiehardResponse: status - ", str, ", code - ", str2, ", desc - ");
        m2.append(str4);
        m2.append(">");
        return new k03(r2, r1cVar, null, str, "Undefined check payment status: ".concat(m2.toString()));
    }

    public static final void p(wze wzeVar, int i2, Function2 function2, yci yciVar, hq5 hq5Var, int i3) {
        function2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2136399085);
        int i4 = (oq5Var.f(wzeVar) ? 4 : 2) | i3 | (oq5Var.d(i2) ? 32 : 16) | (oq5Var.h(function2) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if (oq5Var.P(i4 & 1, (i4 & 1171) != 1170)) {
            e9g e9gVar = e9g.b;
            jd1 jd1Var = wzeVar.b;
            yci D = ksw.D(yciVar, rvf.M(R.string.artist, oq5Var), null);
            boolean z = ((i4 & 14) == 4) | ((i4 & 896) == 256) | ((i4 & 112) == 32);
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new de(function2, wzeVar, i2, 20);
                oq5Var.k0(K);
            }
            jf0.b((Function0) K, jd1Var, D, null, e9gVar, null, oq5Var, 24576, 40);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new yja(wzeVar, i2, function2, yciVar, i3, 12);
        }
    }

    public static float p0() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static final void q(xze xzeVar, int i2, Function2 function2, Function1 function1, yci yciVar, hq5 hq5Var, int i3) {
        function2.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-636733946);
        int i4 = (oq5Var.f(xzeVar) ? 4 : 2) | i3 | (oq5Var.d(i2) ? 32 : 16) | (oq5Var.h(function2) ? 256 : 128) | (oq5Var.h(function1) ? 2048 : 1024) | (oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i4 & 1, (i4 & 9363) != 9362)) {
            lxe.f(xzeVar.b, ehv.p(xzeVar.c, new x0(function2, i2, function1, 12), oq5Var), ksw.D(yciVar, rvf.M(R.string.music_video, oq5Var), null), null, oq5Var, 0, 8);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new wda(xzeVar, i2, function2, function1, yciVar, i3, 10);
        }
    }

    public static final void r(int i2, hq5 hq5Var, yci yciVar, boolean z) {
        boolean z2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(159374872);
        int i3 = (oq5Var.g(z) ? 4 : 2) | i2 | 48;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            float f2 = 16;
            vci vciVar = vci.a;
            yci d2 = d.d(androidx.compose.foundation.layout.a.p(vciVar, f2, f2, 8, f2), 1.0f);
            nho a2 = lho.a(qx0.g, b2c.l, oq5Var, 54);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, d2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            z2 = z;
            ivf.l(z2, d.r(androidx.compose.foundation.layout.a.o(vciVar, 0.0f, 2, 1), 192), nu0.j(), oq5Var, (i3 & 14) | 48, 0);
            u1g.l(oq5Var, d.m(vciVar, 24));
            oq5Var.p(true);
            yciVar = vciVar;
        } else {
            z2 = z;
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new q10(z2, yciVar, i2, 10);
        }
    }

    public static final void s(yze yzeVar, Function1 function1, yci yciVar, hq5 hq5Var, int i2) {
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(519545502);
        int i3 = (oq5Var.f(yzeVar) ? 4 : 2) | i2 | (oq5Var.h(function1) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            String str = yzeVar.a;
            yci a2 = a.a(yciVar, "menu_item");
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new zya(20, function1, yzeVar);
                oq5Var.k0(K);
            }
            x97.b(str, a2, null, (Function0) K, oq5Var, 0, 4);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new v48(i2, 20, yciVar, yzeVar, function1);
        }
    }

    public static final void t(zze zzeVar, int i2, Function2 function2, yci yciVar, hq5 hq5Var, int i3) {
        int i4;
        function2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(766386069);
        int i5 = i3 | (oq5Var.f(zzeVar) ? 4 : 2) | (oq5Var.d(i2) ? 32 : 16) | (oq5Var.h(function2) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if (oq5Var.P(i5 & 1, (i5 & 1171) != 1170)) {
            e9g e9gVar = e9g.b;
            kbj kbjVar = zzeVar.b;
            switch (i0f.a[zzeVar.a.b.ordinal()]) {
                case 1:
                    i4 = R.string.podcast;
                    break;
                case 2:
                    i4 = R.string.book;
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    i4 = R.string.album;
                    break;
                default:
                    b6e.s();
                    return;
            }
            yci D = ksw.D(yciVar, rvf.M(i4, oq5Var), null);
            boolean z = ((i5 & 14) == 4) | ((i5 & 896) == 256) | ((i5 & 112) == 32);
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new de(function2, zzeVar, i2, 18);
                oq5Var.k0(K);
            }
            p6g.d(kbjVar, (Function0) K, D, 0L, null, null, false, null, e9gVar, oq5Var, 100663296, 248);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new yja(zzeVar, i2, function2, yciVar, i3, 10);
        }
    }

    public static final void u(a0f a0fVar, int i2, Function2 function2, yci yciVar, hq5 hq5Var, int i3) {
        function2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-905967757);
        int i4 = i3 | (oq5Var.f(a0fVar) ? 4 : 2) | (oq5Var.d(i2) ? 32 : 16) | (oq5Var.h(function2) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if (oq5Var.P(i4 & 1, (i4 & 1171) != 1170)) {
            e9g e9gVar = e9g.b;
            int i5 = i4 & 14;
            boolean z = i5 == 4;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                K = a0fVar.b;
                oq5Var.k0(K);
            }
            lwl lwlVar = (lwl) K;
            yci D = ksw.D(yciVar, rvf.M(R.string.playlist, oq5Var), null);
            boolean z2 = (i5 == 4) | ((i4 & 896) == 256) | ((i4 & 112) == 32);
            Object K2 = oq5Var.K();
            if (z2 || K2 == kjnVar) {
                K2 = new de(function2, a0fVar, i2, 21);
                oq5Var.k0(K2);
            }
            wyf.h(lwlVar, (Function0) K2, D, 0L, null, null, e9gVar, null, oq5Var, ScreenMirroringConfig.Video.BITRATE_1_5MB, 184);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new yja(a0fVar, i2, function2, yciVar, i3, 13);
        }
    }

    public static final void v(b0f b0fVar, int i2, kxi kxiVar, Function0 function0, l0f l0fVar, yci yciVar, hq5 hq5Var, int i3) {
        q7n q7nVar;
        Object twuVar;
        kjn kjnVar;
        l18 l18Var;
        kxiVar.getClass();
        function0.getClass();
        l0fVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1690669946);
        int i4 = i3 | (oq5Var.f(b0fVar) ? 4 : 2) | (oq5Var.d(i2) ? 32 : 16) | (oq5Var.h(kxiVar) ? 256 : 128) | (oq5Var.h(function0) ? 2048 : 1024) | (oq5Var.h(l0fVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | ScreenMirroringConfig.Video.BITRATE_1_5MB;
        if (oq5Var.P(i4 & 1, (599187 & i4) != 599186)) {
            q7n q7nVar2 = b0fVar.b;
            kjn kjnVar2 = gq5.a;
            c3r c3rVar = (c3r) oq5Var.j(es5.p);
            ArrayList arrayList = b0fVar.a.c;
            gos gosVar = new gos(b0fVar, i2);
            l18 l18Var2 = l18.b;
            bdt I = hag.I(k6l.class);
            qdc qdcVar = l18Var2.a;
            qdcVar.getClass();
            k6l k6lVar = (k6l) qdcVar.C(I);
            bdt I2 = hag.I(uwu.class);
            qdc qdcVar2 = l18Var2.a;
            qdcVar2.getClass();
            uwu uwuVar = (uwu) qdcVar2.C(I2);
            bdt I3 = hag.I(qwu.class);
            qdc qdcVar3 = l18Var2.a;
            qdcVar3.getClass();
            qwu qwuVar = (qwu) qdcVar3.C(I3);
            boolean f2 = oq5Var.f(c3rVar);
            Object K = oq5Var.K();
            if (f2 || K == kjnVar2) {
                K = new h0f(c3rVar, 1);
                oq5Var.k0(K);
            }
            Function1 function1 = (Function1) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar2) {
                K2 = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var = ((fs5) K2).a;
            boolean f3 = oq5Var.f(arrayList) | oq5Var.f(gosVar) | oq5Var.f(function1);
            Object K3 = oq5Var.K();
            if (f3 || K3 == kjnVar2) {
                q7nVar = q7nVar2;
                kjnVar = kjnVar2;
                l18Var = l18Var2;
                twuVar = new twu(mm6Var, kxiVar, k6lVar, null, gosVar, qwuVar, uwuVar, arrayList, function0, function1);
                oq5Var.k0(twuVar);
            } else {
                twuVar = K3;
                q7nVar = q7nVar2;
                kjnVar = kjnVar2;
                l18Var = l18Var2;
            }
            owu owuVar = (owu) twuVar;
            boolean f4 = oq5Var.f(owuVar) | oq5Var.f(l0fVar);
            Object K4 = oq5Var.K();
            if (f4 || K4 == kjnVar) {
                bdt I4 = hag.I(d1h.class);
                qdc qdcVar4 = l18Var.a;
                qdcVar4.getClass();
                d1h d1hVar = (d1h) qdcVar4.C(I4);
                owuVar.getClass();
                ly4 ly4Var = d1hVar.a;
                bdt I5 = hag.I(q0h.class);
                qdc qdcVar5 = ly4Var.a;
                qdcVar5.getClass();
                K4 = new r7n(owuVar, (q0h) qdcVar5.C(I5), l0fVar);
                oq5Var.k0(K4);
            }
            gut.g(q7nVar, (r7n) K4, yciVar, oq5Var, (i4 >> 9) & 896);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new tu(b0fVar, kxiVar, function0, i2, l0fVar, yciVar, i3, 16);
        }
    }

    public static final void w(c0f c0fVar, int i2, Function2 function2, Function1 function1, Function1 function12, yci yciVar, hq5 hq5Var, int i3) {
        int i4;
        mqs mqsVar = c0fVar.a;
        function2.getClass();
        function1.getClass();
        function12.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(648106368);
        int i5 = i3 | (oq5Var.f(c0fVar) ? 4 : 2) | (oq5Var.d(i2) ? 32 : 16) | (oq5Var.h(function2) ? 256 : 128) | (oq5Var.h(function1) ? 2048 : 1024) | (oq5Var.h(function12) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if (oq5Var.P(i5 & 1, (74899 & i5) != 74898)) {
            po6 po6Var = c0fVar.b;
            bg5 H = up6.H(mqsVar, new q71(function2, i2, function1, function12), oq5Var, 6, 4);
            switch (mqsVar.I().ordinal()) {
                case 0:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 11:
                case 12:
                case 13:
                case 14:
                    i4 = R.string.track;
                    break;
                case 1:
                    i4 = R.string.episode;
                    break;
                case 9:
                case 10:
                    i4 = R.string.chapter;
                    break;
                default:
                    b6e.s();
                    return;
            }
            vut.i(po6Var, H, ksw.D(yciVar, rvf.M(i4, oq5Var), null), oq5Var, 0);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new tu(c0fVar, function2, function1, i2, function12, yciVar, i3, 17);
        }
    }

    public static final void x(d0f d0fVar, int i2, kxi kxiVar, Function0 function0, yci yciVar, hq5 hq5Var, int i3) {
        kxiVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-396294831);
        int i4 = i3 | (oq5Var.f(d0fVar) ? 4 : 2) | (oq5Var.d(i2) ? 32 : 16) | (oq5Var.h(kxiVar) ? 256 : 128) | (oq5Var.h(function0) ? 2048 : 1024) | (oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID) | 196608;
        if (oq5Var.P(i4 & 1, (74899 & i4) != 74898)) {
            euu euuVar = d0fVar.b;
            int i5 = (i4 & 8190) | 24576;
            c3r c3rVar = (c3r) oq5Var.j(es5.p);
            StationId e2 = StationId.e(d0fVar.a.b);
            ehv ehvVar = new ehv(d0fVar, i2);
            l18 l18Var = l18.b;
            bdt I = hag.I(k6l.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            k6l k6lVar = (k6l) qdcVar.C(I);
            bdt I2 = hag.I(uwu.class);
            qdc qdcVar2 = l18Var.a;
            qdcVar2.getClass();
            uwu uwuVar = (uwu) qdcVar2.C(I2);
            bdt I3 = hag.I(qwu.class);
            qdc qdcVar3 = l18Var.a;
            qdcVar3.getClass();
            qwu qwuVar = (qwu) qdcVar3.C(I3);
            boolean f2 = oq5Var.f(c3rVar);
            Object K = oq5Var.K();
            if (f2 || K == gq5.a) {
                K = new h0f(c3rVar, 0);
                oq5Var.k0(K);
            }
            owu X = wyf.X(e2, kxiVar, function0, k6lVar, uwuVar, qwuVar, ehvVar, (Function1) K, oq5Var, (i5 & 7168) | (i5 & 896) | 6, 128);
            oq5Var = oq5Var;
            fxf.p(euuVar, X, yciVar, null, false, e9g.b, oq5Var, 196608 | ((i4 >> 6) & 896), 24);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new wda(d0fVar, i2, kxiVar, function0, yciVar, i3, 11);
        }
    }

    public static final void y(e0f e0fVar, int i2, kxi kxiVar, Function0 function0, yci yciVar, hq5 hq5Var, int i3) {
        kxiVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-940952980);
        int i4 = i3 | (oq5Var.f(e0fVar) ? 4 : 2) | (oq5Var.d(i2) ? 32 : 16) | (oq5Var.h(kxiVar) ? 256 : 128) | (oq5Var.h(function0) ? 2048 : 1024) | (oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID) | 196608;
        if (oq5Var.P(i4 & 1, (74899 & i4) != 74898)) {
            klu kluVar = e0fVar.c;
            int i5 = (i4 & 8190) | 24576;
            c3r c3rVar = (c3r) oq5Var.j(es5.p);
            StationId e2 = StationId.e(e0fVar.a.a);
            i9w i9wVar = new i9w();
            l18 l18Var = l18.b;
            bdt I = hag.I(k6l.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            k6l k6lVar = (k6l) qdcVar.C(I);
            bdt I2 = hag.I(uwu.class);
            qdc qdcVar2 = l18Var.a;
            qdcVar2.getClass();
            uwu uwuVar = (uwu) qdcVar2.C(I2);
            bdt I3 = hag.I(qwu.class);
            qdc qdcVar3 = l18Var.a;
            qdcVar3.getClass();
            qwu qwuVar = (qwu) qdcVar3.C(I3);
            boolean f2 = oq5Var.f(c3rVar);
            Object K = oq5Var.K();
            if (f2 || K == gq5.a) {
                K = new h0f(c3rVar, 2);
                oq5Var.k0(K);
            }
            vwb.E(kluVar, wyf.X(e2, kxiVar, function0, k6lVar, uwuVar, qwuVar, i9wVar, (Function1) K, oq5Var, (i5 & 7168) | (i5 & 896) | 6, 128), yciVar, e9g.b, oq5Var, ((i4 >> 6) & 896) | 3072, 0);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new wda(e0fVar, i2, kxiVar, function0, yciVar, i3, 9);
        }
    }

    public static final void z(n9b n9bVar, pj1 pj1Var, b21 b21Var) {
        int ordinal = pj1Var.ordinal();
        if (ordinal == 0) {
            u7g.n(n9bVar, new zy(0, b21Var, b21.class, "onShareClick", "onShareClick()V", 0, 19));
            return;
        }
        if (ordinal == 1) {
            vq1.f(n9bVar, new zy(0, b21Var, b21.class, "onDevicePickerClick", "onDevicePickerClick()V", 0, 20));
            return;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                lxe.g(n9bVar, false, new u11(b21Var, 0));
                return;
            } else if (ordinal == 4) {
                lxe.g(n9bVar, true, new u11(b21Var, 1));
                return;
            } else {
                b6e.s();
                return;
            }
        }
        zy zyVar = new zy(0, b21Var, b21.class, "onDescriptionClick", "onDescriptionClick()V", 0, 21);
        n9bVar.getClass();
        n9bVar.a.a(new wn5(new q2(0, zyVar), 1626001492, true));
    }
}
