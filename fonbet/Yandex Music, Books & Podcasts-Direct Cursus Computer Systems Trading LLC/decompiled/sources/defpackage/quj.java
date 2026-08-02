package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.os.Bundle;
import android.provider.Settings;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.a;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.c;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.music.R;
import ru.yandex.music.catalog.album.screen.AlbumScreenActivity;
import ru.yandex.music.catalog.artist.familiar.ArtistFamiliarActivity;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.video.m3.player.impl.tracking.data.DecoderEventData;
import ru.yandex.video.m3.player.impl.tracking.data.TrackFormatData;
import ru.yandex.video.m3.player.tracks.TrackType;

/* loaded from: classes.dex */
public abstract class quj {
    public static final wn5 a = new wn5(new bo5(4), 309360321, false);
    public static final wn5 b;
    public static final wn5 c;
    public static final wn5 d;
    public static final wn5 e;
    public static final Object f;
    public static final udo g;

    static {
        new wn5(new bo5(5), 2073967301, false);
        b = new wn5(new io5(15), 1264633243, false);
        c = new wn5(new po5(17), 1733013294, false);
        d = new wn5(new ro5(10), -735392211, false);
        e = new wn5(new ap5(27), 224617969, false);
        f = new Object();
        g = new udo(0.16f, 0.1f, 0.08f, 0.1f);
    }

    public static final void A(n4h n4hVar, n4h n4hVar2) {
        if (bp6.a.contains(quj.class)) {
            return;
        }
        try {
            n4hVar.getClass();
            n4hVar2.getClass();
            int[] iArr = n4hVar.c;
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            float[] fArr = n4hVar.b;
            float[] fArr2 = n4hVar2.b;
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i2; i5++) {
                    for (int i6 = 0; i6 < i3; i6++) {
                        int i7 = (i5 * i3) + (i4 * i2 * i3) + i6;
                        fArr[i7] = fArr[i7] + fArr2[i6];
                    }
                }
            }
        } catch (Throwable th) {
            bp6.a(quj.class, th);
        }
    }

    public static final qxg B(ayg aygVar, boolean z, int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(683659508);
        zxg zxgVar = zxg.a;
        if (i <= 0) {
            xq0.o(dfi.c(i, "Iterations must be a positive number (", ")."));
            return null;
        }
        if (Float.isInfinite(1.0f) || Float.isNaN(1.0f)) {
            xq0.o(ouj.m("Speed must be a finite number. It is ", 1.0f, "."));
            return null;
        }
        oq5Var.a0(2024497114);
        oq5Var.a0(-610207850);
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = new qxg();
            oq5Var.k0(K);
        }
        qxg qxgVar = (qxg) K;
        oq5Var.p(false);
        oq5Var.p(false);
        oq5Var.a0(-180606964);
        Object K2 = oq5Var.K();
        if (K2 == kjnVar) {
            K2 = szf.g0(Boolean.valueOf(z));
            oq5Var.k0(K2);
        }
        aqi aqiVar = (aqi) K2;
        oq5Var.p(false);
        oq5Var.a0(-180606834);
        Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
        Matrix matrix = rvt.a;
        float f2 = 1.0f / Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        oq5Var.p(false);
        gld.z(new Object[]{aygVar, Boolean.valueOf(z), null, Float.valueOf(f2), Integer.valueOf(i)}, new rk0(z, qxgVar, aygVar, i, f2, aqiVar, null), oq5Var);
        oq5Var.p(false);
        return qxgVar;
    }

    public static final yop C(hg3 hg3Var, hg3 hg3Var2, Function0 function0) {
        hg3Var.getClass();
        hg3Var2.getClass();
        ig3 ig3Var = (ig3) hg3Var2.b;
        wk0 wk0Var = new wk0(14, new al(hg3Var, function0));
        f4s f4sVar = nif.a;
        return new yop(ig3Var, wk0Var);
    }

    public static int D(byte[] bArr) {
        int length = bArr.length;
        if (1 > length || length >= 5) {
            xq0.x(k5r.i(length, "Length must be between 1 and 4. Length = "));
            return 0;
        }
        if (bArr.length < length) {
            xq0.x("Length or startPos not valid");
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i += (bArr[i2] & 255) << (((length - i2) - 1) * 8);
        }
        return i;
    }

    public static final int E(long j, long j2) {
        boolean X = X(j);
        if (X != X(j2)) {
            return X ? -1 : 1;
        }
        return (Math.min(O(j), O(j2)) >= 0.0f && W(j) != W(j2)) ? W(j) ? -1 : 1 : (int) Math.signum(O(j) - O(j2));
    }

    public static final n4h F(n4h[] n4hVarArr) {
        if (bp6.a.contains(quj.class)) {
            return null;
        }
        try {
            int i = n4hVarArr[0].c[0];
            int i2 = 0;
            for (n4h n4hVar : n4hVarArr) {
                i2 += n4hVar.c[1];
            }
            n4h n4hVar2 = new n4h(new int[]{i, i2});
            float[] fArr = n4hVar2.b;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * i2;
                for (n4h n4hVar3 : n4hVarArr) {
                    float[] fArr2 = n4hVar3.b;
                    int i5 = n4hVar3.c[1];
                    System.arraycopy(fArr2, i3 * i5, fArr, i4, i5);
                    i4 += i5;
                }
            }
            return n4hVar2;
        } catch (Throwable th) {
            bp6.a(quj.class, th);
            return null;
        }
    }

    public static final n4h G(n4h n4hVar, n4h n4hVar2) {
        n4h n4hVar3;
        n4h n4hVar4 = null;
        if (bp6.a.contains(quj.class)) {
            return null;
        }
        try {
            n4hVar.getClass();
            n4hVar2.getClass();
            int[] iArr = n4hVar.c;
            int i = 0;
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int[] iArr2 = n4hVar2.c;
            int i5 = iArr2[0];
            int i6 = (i3 - i5) + 1;
            int i7 = iArr2[2];
            n4h n4hVar5 = new n4h(new int[]{i2, i6, i7});
            float[] fArr = n4hVar.b;
            float[] fArr2 = n4hVar5.b;
            float[] fArr3 = n4hVar2.b;
            int i8 = 0;
            while (i8 < i2) {
                int i9 = i;
                while (i9 < i7) {
                    int i10 = i;
                    while (i10 < i6) {
                        float f2 = 0.0f;
                        n4hVar3 = n4hVar4;
                        int i11 = i;
                        while (i11 < i5) {
                            while (i < i4) {
                                try {
                                    f2 = (fArr[((i11 + i10) * i4) + (i3 * i4 * i8) + i] * fArr3[(((i11 * i4) + i) * i7) + i9]) + f2;
                                    i++;
                                } catch (Throwable th) {
                                    th = th;
                                    bp6.a(quj.class, th);
                                    return n4hVar3;
                                }
                            }
                            i11++;
                            i = 0;
                        }
                        fArr2[(i10 * i7) + (i6 * i7 * i8) + i9] = f2;
                        i10++;
                        n4hVar4 = n4hVar3;
                        i = 0;
                    }
                    i9++;
                    i = 0;
                }
                i8++;
                i = 0;
            }
            return n4hVar5;
        } catch (Throwable th2) {
            th = th2;
            n4hVar3 = null;
        }
    }

    public static Intent H(Context context, j71 j71Var) {
        context.getClass();
        Intent putExtra = new Intent(context, (Class<?>) ArtistFamiliarActivity.class).putExtra("artistFamiliarArgs", j71Var);
        putExtra.getClass();
        return putExtra;
    }

    public static final n4h I(n4h n4hVar, n4h n4hVar2, n4h n4hVar3) {
        if (bp6.a.contains(quj.class)) {
            return null;
        }
        try {
            n4hVar.getClass();
            n4hVar2.getClass();
            n4hVar3.getClass();
            int i = n4hVar.c[0];
            int i2 = n4hVar3.c[0];
            n4h b0 = b0(n4hVar, n4hVar2);
            float[] fArr = n4hVar3.b;
            float[] fArr2 = b0.b;
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    int i5 = (i3 * i2) + i4;
                    fArr2[i5] = fArr2[i5] + fArr[i4];
                }
            }
            return b0;
        } catch (Throwable th) {
            bp6.a(quj.class, th);
            return null;
        }
    }

    public static final n4h J(String[] strArr, n4h n4hVar) {
        if (bp6.a.contains(quj.class)) {
            return null;
        }
        try {
            n4hVar.getClass();
            int length = strArr.length;
            int i = n4hVar.c[1];
            n4h n4hVar2 = new n4h(new int[]{length, 128, i});
            float[] fArr = n4hVar2.b;
            float[] fArr2 = n4hVar.b;
            for (int i2 = 0; i2 < length; i2++) {
                int[] H = mvt.b.H(strArr[i2]);
                for (int i3 = 0; i3 < 128; i3++) {
                    System.arraycopy(fArr2, H[i3] * i, fArr, (i * i3) + (i * 128 * i2), i);
                }
            }
            return n4hVar2;
        } catch (Throwable th) {
            bp6.a(quj.class, th);
            return null;
        }
    }

    public static final void K(n4h n4hVar) {
        if (bp6.a.contains(quj.class)) {
            return;
        }
        try {
            n4hVar.getClass();
            int[] iArr = n4hVar.c;
            if (1 >= iArr.length) {
                return;
            }
            int length = iArr.length;
            int i = 1;
            for (int i2 = 1; i2 < length; i2++) {
                i *= n4hVar.c[i2];
            }
            int i3 = n4hVar.c[0];
            n4hVar.c = new int[]{i3, i};
            int i4 = i3 * i;
            float[] fArr = new float[i4];
            System.arraycopy(n4hVar.b, 0, fArr, 0, Math.min(n4hVar.a, i4));
            n4hVar.b = fArr;
            n4hVar.a = i4;
        } catch (Throwable th) {
            bp6.a(quj.class, th);
        }
    }

    public static String L(String str, byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        if (bArr == null) {
            stringBuffer.append("");
        } else {
            for (byte b2 : bArr) {
                stringBuffer.append(String.format(str, Arrays.copyOf(new Object[]{Integer.valueOf(b2 & 255)}, 1)));
            }
        }
        String stringBuffer2 = stringBuffer.toString();
        stringBuffer2.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        String upperCase = stringBuffer2.toUpperCase(locale);
        upperCase.getClass();
        int length = upperCase.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.e(upperCase.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return upperCase.subSequence(i, length + 1).toString();
    }

    public static pe6 M(wn5 wn5Var, p14 p14Var) {
        p14Var.getClass();
        Object obj = p14Var.a;
        nnk nnkVar = obj != null ? new nnk(obj, a0g.C(new wn5(new le6(wn5Var, obj, 4), -2072083471, true))) : null;
        nnk nnkVar2 = new nnk(p14Var.b, a0g.C(new wn5(new kw5(8, wn5Var, p14Var), -983800720, true)));
        Object obj2 = p14Var.c;
        return new pe6(nnkVar, nnkVar2, obj2 != null ? new nnk(obj2, a0g.C(new wn5(new le6(wn5Var, obj2, 7), -1585009745, true))) : null);
    }

    public static byte[] N(String str) {
        if (str == null) {
            xq0.x("Argument can't be null");
            return null;
        }
        int i = 0;
        String r = c.r(str, StringUtil.SPACE, "", false);
        if (r.length() % 2 != 0) {
            xq0.x("Hex binary needs to be even-length :".concat(str));
            return null;
        }
        byte[] bArr = new byte[Math.round(r.length() / 2.0f)];
        int i2 = 0;
        while (i < r.length()) {
            int i3 = i + 2;
            bArr[i2] = (byte) Integer.parseInt(r.substring(i, i3), CharsKt.checkRadix(16));
            i = i3;
            i2++;
        }
        return bArr;
    }

    public static final float O(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static String P(m2 m2Var) {
        String str;
        String str2;
        m2Var.getClass();
        StringBuilder sb = new StringBuilder();
        int i = v1.a[m2Var.a().ordinal()];
        if (i == 1) {
            str = "Experiment";
        } else {
            if (i != 2) {
                b6e.s();
                return null;
            }
            str = "FeatureToggle";
        }
        sb.append(str);
        if (m2Var instanceof l2) {
            str2 = "Success";
        } else if (m2Var instanceof z1) {
            str2 = "Exception";
        } else if (m2Var instanceof i2) {
            str2 = "NoTargetSlot";
        } else if (m2Var instanceof c2) {
            str2 = "NoFlag";
        } else {
            if (!(m2Var instanceof f2)) {
                b6e.s();
                return null;
            }
            str2 = "NoFlagNoSlots";
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1 A[LOOP:0: B:14:0x009f->B:15:0x00a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static qhb Q(JSONObject jSONObject) {
        int i;
        String upperCase;
        int i2;
        int length;
        int i3;
        JSONArray optJSONArray;
        jSONObject.getClass();
        String string = jSONObject.getString("event_name");
        String string2 = jSONObject.getString("method");
        string2.getClass();
        Locale locale = Locale.ENGLISH;
        locale.getClass();
        String upperCase2 = string2.toUpperCase(locale);
        upperCase2.getClass();
        if (upperCase2 != null) {
            if (upperCase2.equals("MANUAL")) {
                i = 1;
            } else if (upperCase2.equals("INFERENCE")) {
                i = 2;
            } else {
                xq0.x("No enum constant com.facebook.appevents.codeless.internal.EventBinding.MappingMethod.".concat(upperCase2));
            }
            int i4 = i;
            String string3 = jSONObject.getString("event_type");
            string3.getClass();
            upperCase = string3.toUpperCase(locale);
            upperCase.getClass();
            if (upperCase == null) {
                if (upperCase.equals("CLICK")) {
                    i2 = 1;
                } else if (upperCase.equals("SELECTED")) {
                    i2 = 2;
                } else if (upperCase.equals("TEXT_CHANGED")) {
                    i2 = 3;
                } else {
                    xq0.x("No enum constant com.facebook.appevents.codeless.internal.EventBinding.ActionType.".concat(upperCase));
                }
                int i5 = i2;
                String string4 = jSONObject.getString("app_version");
                JSONArray jSONArray = jSONObject.getJSONArray("path");
                ArrayList arrayList = new ArrayList();
                length = jSONArray.length();
                for (i3 = 0; i3 < length; i3++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                    jSONObject2.getClass();
                    arrayList.add(new fak(jSONObject2));
                }
                String optString = jSONObject.optString("path_type", "absolute");
                optJSONArray = jSONObject.optJSONArray("parameters");
                ArrayList arrayList2 = new ArrayList();
                if (optJSONArray != null) {
                    int length2 = optJSONArray.length();
                    for (int i6 = 0; i6 < length2; i6++) {
                        JSONObject jSONObject3 = optJSONArray.getJSONObject(i6);
                        jSONObject3.getClass();
                        arrayList2.add(new z5k(jSONObject3));
                    }
                }
                String optString2 = jSONObject.optString("component_id");
                String optString3 = jSONObject.optString("activity_name");
                string.getClass();
                string4.getClass();
                optString2.getClass();
                optString.getClass();
                optString3.getClass();
                return new qhb(string, i4, i5, string4, arrayList, arrayList2, optString2, optString, optString3);
            }
            jj4.j("Name is null");
            i2 = 0;
            int i52 = i2;
            String string42 = jSONObject.getString("app_version");
            JSONArray jSONArray2 = jSONObject.getJSONArray("path");
            ArrayList arrayList3 = new ArrayList();
            length = jSONArray2.length();
            while (i3 < length) {
            }
            String optString4 = jSONObject.optString("path_type", "absolute");
            optJSONArray = jSONObject.optJSONArray("parameters");
            ArrayList arrayList22 = new ArrayList();
            if (optJSONArray != null) {
            }
            String optString22 = jSONObject.optString("component_id");
            String optString32 = jSONObject.optString("activity_name");
            string.getClass();
            string42.getClass();
            optString22.getClass();
            optString4.getClass();
            optString32.getClass();
            return new qhb(string, i4, i52, string42, arrayList3, arrayList22, optString22, optString4, optString32);
        }
        jj4.j("Name is null");
        i = 0;
        int i42 = i;
        String string32 = jSONObject.getString("event_type");
        string32.getClass();
        upperCase = string32.toUpperCase(locale);
        upperCase.getClass();
        if (upperCase == null) {
        }
        i2 = 0;
        int i522 = i2;
        String string422 = jSONObject.getString("app_version");
        JSONArray jSONArray22 = jSONObject.getJSONArray("path");
        ArrayList arrayList32 = new ArrayList();
        length = jSONArray22.length();
        while (i3 < length) {
        }
        String optString42 = jSONObject.optString("path_type", "absolute");
        optJSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList222 = new ArrayList();
        if (optJSONArray != null) {
        }
        String optString222 = jSONObject.optString("component_id");
        String optString322 = jSONObject.optString("activity_name");
        string.getClass();
        string422.getClass();
        optString222.getClass();
        optString42.getClass();
        optString322.getClass();
        return new qhb(string, i42, i522, string422, arrayList32, arrayList222, optString222, optString42, optString322);
    }

    public static final Pair R(boolean z, hq5 hq5Var) {
        Pair pair;
        Float valueOf = Float.valueOf(0.75f);
        Float valueOf2 = Float.valueOf(0.25f);
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(1073054999);
        if (z) {
            oq5Var.a0(-365298646);
            pair = lf7.j(oq5Var) ? new Pair(valueOf2, valueOf) : new Pair(Float.valueOf(0.33f), Float.valueOf(0.67f));
            oq5Var.p(false);
        } else {
            oq5Var.a0(-365170740);
            pair = lf7.j(oq5Var) ? new Pair(Float.valueOf(0.2f), Float.valueOf(0.8f)) : new Pair(valueOf2, valueOf);
            oq5Var.p(false);
        }
        oq5Var.p(false);
        return pair;
    }

    public static final vat S(hq5 hq5Var) {
        Float valueOf = Float.valueOf(0.25f);
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(-1606771198);
        vat vatVar = lf7.j(oq5Var) ? new vat(valueOf, valueOf, Float.valueOf(0.5f)) : new vat(Float.valueOf(0.33f), Float.valueOf(0.27f), Float.valueOf(0.4f));
        oq5Var.p(false);
        return vatVar;
    }

    public static final Intent T(Context context, oq oqVar, PlaybackScope playbackScope) {
        context.getClass();
        oqVar.getClass();
        return U(context, new uq(oqVar, playbackScope != null ? playbackScope.b(oqVar).a() : null, null, null, 124), playbackScope);
    }

    public static final Intent U(Context context, uq uqVar, PlaybackScope playbackScope) {
        context.getClass();
        int i = AlbumScreenActivity.v0;
        Intent putExtra = new Intent(context, (Class<?>) AlbumScreenActivity.class).putExtra("extra.activityParams", (Serializable) uqVar).putExtra("extra.playbackScope", playbackScope);
        putExtra.getClass();
        return putExtra;
    }

    public static final Intent V(Context context, lt ltVar, PlaybackScope playbackScope) {
        context.getClass();
        ltVar.getClass();
        return U(context, new uq(ltVar, playbackScope != null ? playbackScope.c(ltVar).a() : null), playbackScope);
    }

    public static final boolean W(long j) {
        return (j & 2) != 0;
    }

    public static final boolean X(long j) {
        return (j & 1) != 0;
    }

    public static final boolean Y(mpf mpfVar) {
        if (mpfVar.h == null) {
            return false;
        }
        mpf u = mpfVar.u();
        return (u != null ? u.h : null) == null || mpfVar.G.b;
    }

    public static boolean Z(int i) {
        return (i & 128) != 0;
    }

    public static final void a(ja0 ja0Var, hq5 hq5Var, int i) {
        xmn r;
        cc4 cc4Var;
        ja0Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1282845039);
        int i2 = (oq5Var.f(ja0Var) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            Activity activity = (Activity) oq5Var.j(mhg.a);
            if (activity == null) {
                r = oq5Var.r();
                if (r != null) {
                    cc4Var = new cc4(ja0Var, i, 0);
                    r.d = cc4Var;
                }
                return;
            }
            Boolean valueOf = Boolean.valueOf(!((ma5) oq5Var.j(pa5.a)).g());
            boolean h = oq5Var.h(activity) | ((i2 & 14) == 4);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new cs1(activity, ja0Var, null, 19);
                oq5Var.k0(K);
            }
            gld.x(ja0Var, valueOf, activity, (Function2) K, oq5Var);
        } else {
            oq5Var.S();
        }
        r = oq5Var.r();
        if (r != null) {
            cc4Var = new cc4(ja0Var, i, 1);
            r.d = cc4Var;
        }
    }

    public static final n4h a0(n4h n4hVar, int i) {
        n4h n4hVar2;
        n4h n4hVar3 = null;
        if (bp6.a.contains(quj.class)) {
            return null;
        }
        try {
            n4hVar.getClass();
            int[] iArr = n4hVar.c;
            int i2 = 0;
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = (i4 - i) + 1;
            n4h n4hVar4 = new n4h(new int[]{i3, i6, i5});
            float[] fArr = n4hVar.b;
            float[] fArr2 = n4hVar4.b;
            int i7 = 0;
            while (i7 < i3) {
                int i8 = i2;
                while (i8 < i5) {
                    int i9 = i2;
                    while (i9 < i6) {
                        int i10 = i9 * i5;
                        int i11 = (i7 * i6 * i5) + i10 + i8;
                        int i12 = (i7 * i4 * i5) + i10 + i8;
                        fArr2[i11] = Float.MIN_VALUE;
                        int i13 = i2;
                        while (i13 < i) {
                            n4hVar2 = n4hVar3;
                            try {
                                fArr2[i11] = Math.max(fArr2[i11], fArr[(i13 * i5) + i12]);
                                i13++;
                                n4hVar3 = n4hVar2;
                            } catch (Throwable th) {
                                th = th;
                                bp6.a(quj.class, th);
                                return n4hVar2;
                            }
                        }
                        i9++;
                        i2 = 0;
                    }
                    i8++;
                    i2 = 0;
                }
                i7++;
                i2 = 0;
            }
            return n4hVar4;
        } catch (Throwable th2) {
            th = th2;
            n4hVar2 = n4hVar3;
        }
    }

    public static final void b(fvf fvfVar, vm vmVar, jz4 jz4Var, List list, hq5 hq5Var, int i) {
        oq5 oq5Var;
        fvfVar.getClass();
        jz4Var.getClass();
        list.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(850328324);
        int i2 = i | (oq5Var2.f(fvfVar) ? 4 : 2) | (oq5Var2.f(vmVar) ? 32 : 16) | (oq5Var2.h(jz4Var) ? 256 : 128) | (oq5Var2.f(list) ? 2048 : 1024);
        if (oq5Var2.P(i2 & 1, (i2 & 1171) != 1170)) {
            boolean booleanValue = ((Boolean) szf.Q(jz4Var.e, oq5Var2).getValue()).booleanValue();
            boolean h = oq5Var2.h(jz4Var);
            Object K = oq5Var2.K();
            if (h || K == gq5.a) {
                ub4 ub4Var = new ub4(0, jz4Var, jz4.class, "onRefresh", "onRefresh()V", 0, 21);
                oq5Var2.k0(ub4Var);
                K = ub4Var;
            }
            oq5Var = oq5Var2;
            bfg.f(booleanValue, (Function0) ((h9f) K), vmVar, null, ((Boolean) szf.Q(jz4Var.d, oq5Var2).getValue()).booleanValue(), ild.C(138827652, new nz4(list, fvfVar, vmVar, jz4Var), oq5Var2), oq5Var, ((i2 << 3) & 896) | 196608, 8);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new nz4(fvfVar, vmVar, jz4Var, list, i);
        }
    }

    public static final n4h b0(n4h n4hVar, n4h n4hVar2) {
        if (bp6.a.contains(quj.class)) {
            return null;
        }
        try {
            n4hVar.getClass();
            n4hVar2.getClass();
            int i = n4hVar.c[0];
            int[] iArr = n4hVar2.c;
            int i2 = iArr[0];
            int i3 = iArr[1];
            n4h n4hVar3 = new n4h(new int[]{i, i3});
            float[] fArr = n4hVar.b;
            float[] fArr2 = n4hVar2.b;
            float[] fArr3 = n4hVar3.b;
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = (i4 * i3) + i5;
                    fArr3[i6] = 0.0f;
                    for (int i7 = 0; i7 < i2; i7++) {
                        fArr3[i6] = (fArr[(i4 * i2) + i7] * fArr2[(i7 * i3) + i5]) + fArr3[i6];
                    }
                }
            }
            return n4hVar3;
        } catch (Throwable th) {
            bp6.a(quj.class, th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final bo6 bo6Var, final yci yciVar, final float f2, float f3, hq5 hq5Var, final int i, final int i2) {
        final float f4;
        xmn r;
        w4k w85Var;
        bo6Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2112879219);
        int i3 = (oq5Var.f(bo6Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            f4 = f3;
            i3 |= oq5Var.c(f4) ? 2048 : 1024;
            if (oq5Var.P(i3 & 1, (i3 & 1171) == 1170)) {
                oq5Var.S();
            } else {
                float f5 = i4 != 0 ? 0 : f4;
                bs1 bs1Var = (bs1) bo6Var.e.getValue();
                if (bs1Var instanceof as1) {
                    oq5Var.Z(1042610420);
                    oq5Var.p(false);
                    w85Var = ((as1) bs1Var).a;
                } else {
                    oq5Var.Z(1042611223);
                    w85Var = new w85(((dq0) oq5Var.j(eq0.a)).a.e);
                    oq5Var.p(false);
                }
                irf.r(w85Var, null, a.a(y1g.d0(xp3.u(androidx.compose.foundation.layout.a.d(yciVar, 1.0f), ugo.a(f2)), f5, null, false, 26), "cover"), null, hd6.g, 0.0f, null, oq5Var, 24624, 104);
                f4 = f5;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new Function2() { // from class: vn6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        quj.c(bo6.this, yciVar, f2, f4, (hq5) obj, rvf.R(i | 1), i2);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        f4 = f3;
        if (oq5Var.P(i3 & 1, (i3 & 1171) == 1170)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final File c0(Context context, String str) {
        str.getClass();
        return new File(i0(context), "offline_mode_on_".concat(str));
    }

    public static final void d(int i, hq5 hq5Var, yci yciVar, String str, String str2) {
        int i2;
        str.getClass();
        str2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-576215218);
        int i3 = i & 6;
        qho qhoVar = qho.a;
        if (i3 == 0) {
            i2 = (oq5Var.f(qhoVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.g(true) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.g(true) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i2) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            hz2 hz2Var = b2c.l;
            yci a2 = qhoVar.a(0.5f, qhoVar.b(yciVar, hz2Var), true);
            oq5Var.a0(693286680);
            nho a3 = lho.a(qx0.a, hz2Var, oq5Var, 48);
            oq5Var.a0(-1323940314);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            xp5.T.getClass();
            grb grbVar = wp5.b;
            wn5 A = ghh.A(a2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            A.invoke(new lrq(oq5Var), oq5Var, 0);
            oq5Var.a0(2058660585);
            oq5Var.a0(-1527623046);
            s((i2 >> 3) & 14, oq5Var, qhoVar.a(0.4f, yciVar, true), str);
            oq5Var.a0(-1779962770);
            v3r v3rVar = (v3r) oq5Var.j(cfs.c);
            oq5Var.p(false);
            irf.p(v3rVar.c, oq5Var, 0);
            oq5Var.p(false);
            i((i2 >> 6) & 14, oq5Var, qhoVar.a(0.6f, yciVar, true), str2);
            k5r.s(oq5Var, false, true, false, false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s73(str, str2, yciVar, i, 0);
        }
    }

    public static final void e(ua5 ua5Var, String str, String str2, yci yciVar, boolean z, hq5 hq5Var, int i) {
        int i2;
        ua5Var.getClass();
        str.getClass();
        str2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(44117094);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(ua5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.g(z) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.g(true) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i2) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else if (z) {
            Pair R = R(false, oq5Var);
            float floatValue = ((Number) R.a).floatValue();
            float floatValue2 = ((Number) R.b).floatValue();
            yci a2 = ((wa5) ua5Var).a(yciVar, b2c.p);
            hz2 hz2Var = b2c.l;
            oq5Var.a0(693286680);
            nho a3 = lho.a(qx0.a, hz2Var, oq5Var, 48);
            oq5Var.a0(-1323940314);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            xp5.T.getClass();
            grb grbVar = wp5.b;
            wn5 A = ghh.A(a2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            A.invoke(new lrq(oq5Var), oq5Var, 0);
            oq5Var.a0(2058660585);
            oq5Var.a0(-1527645023);
            if (floatValue <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            if (floatValue > Float.MAX_VALUE) {
                floatValue = Float.MAX_VALUE;
            }
            s((i2 >> 3) & 14, oq5Var, yciVar.f(new LayoutWeightElement(true, floatValue)), str);
            oq5Var.a0(-1779962770);
            v3r v3rVar = (v3r) oq5Var.j(cfs.c);
            oq5Var.p(false);
            irf.p(v3rVar.c, oq5Var, 0);
            oq5Var.p(false);
            if (floatValue2 <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            if (floatValue2 > Float.MAX_VALUE) {
                floatValue2 = Float.MAX_VALUE;
            }
            i((i2 >> 6) & 14, oq5Var, yciVar.f(new LayoutWeightElement(true, floatValue2)), str2);
            k5r.s(oq5Var, false, true, false, false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new r73(ua5Var, str, str2, yciVar, z, i);
        }
    }

    public static final void f(String str, String str2, List list, long j, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        str.getClass();
        str2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1197475384);
        int i3 = i & 6;
        wa5 wa5Var = wa5.a;
        if (i3 == 0) {
            i2 = (oq5Var.f(wa5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(list) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.e(j) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var.g(true) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= oq5Var.g(true) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((4793491 & i2) == 4793490 && oq5Var.z()) {
            oq5Var.S();
        } else {
            vat S = S(oq5Var);
            float floatValue = ((Number) S.a).floatValue();
            float floatValue2 = ((Number) S.b).floatValue();
            float floatValue3 = ((Number) S.c).floatValue();
            yci a2 = wa5Var.a(yciVar, b2c.p);
            hz2 hz2Var = b2c.l;
            oq5Var.a0(693286680);
            nho a3 = lho.a(qx0.a, hz2Var, oq5Var, 48);
            oq5Var.a0(-1323940314);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            xp5.T.getClass();
            int i5 = i2;
            grb grbVar = wp5.b;
            wn5 A = ghh.A(a2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            A.invoke(new lrq(oq5Var), oq5Var, 0);
            oq5Var.a0(2058660585);
            oq5Var.a0(-1520405549);
            qho qhoVar = qho.a;
            s((i5 >> 3) & 14, oq5Var, qhoVar.a(floatValue, yciVar, true), str);
            oq5Var.a0(-1779962770);
            v3r v3rVar = (v3r) oq5Var.j(cfs.c);
            oq5Var.p(false);
            irf.p(v3rVar.c, oq5Var, 0);
            oq5Var.p(false);
            yci a4 = qhoVar.a(floatValue2, yciVar, true);
            int i6 = i5 >> 6;
            i(i6 & 14, oq5Var, a4, str2);
            c6g.a(i6 & 896, j, oq5Var, qhoVar.a(floatValue3, yciVar, true), list == null ? c5b.a : list);
            k5r.s(oq5Var, false, true, false, false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t73(str, str2, list, j, yciVar, i, 0);
        }
    }

    public static final void g(String str, String str2, List list, long j, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        str.getClass();
        str2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(440784976);
        int i3 = i & 6;
        wa5 wa5Var = wa5.a;
        if (i3 == 0) {
            i2 = (oq5Var.f(wa5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(list) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.e(j) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i2 |= oq5Var.g(true) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= oq5Var.g(true) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((4793491 & i2) == 4793490 && oq5Var.z()) {
            oq5Var.S();
        } else {
            vat S = S(oq5Var);
            float floatValue = ((Number) S.a).floatValue();
            float floatValue2 = ((Number) S.b).floatValue();
            float floatValue3 = ((Number) S.c).floatValue();
            yci a2 = wa5Var.a(yciVar, b2c.p);
            hz2 hz2Var = b2c.l;
            oq5Var.a0(693286680);
            nho a3 = lho.a(qx0.a, hz2Var, oq5Var, 48);
            oq5Var.a0(-1323940314);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            xp5.T.getClass();
            int i5 = i2;
            grb grbVar = wp5.b;
            wn5 A = ghh.A(a2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            A.invoke(new lrq(oq5Var), oq5Var, 0);
            oq5Var.a0(2058660585);
            oq5Var.a0(1390373997);
            qho qhoVar = qho.a;
            s((i5 >> 3) & 14, oq5Var, qhoVar.a(floatValue, yciVar, true), str);
            oq5Var.a0(-1779962770);
            v3r v3rVar = (v3r) oq5Var.j(cfs.c);
            oq5Var.p(false);
            irf.p(v3rVar.c, oq5Var, 0);
            oq5Var.p(false);
            yci a4 = qhoVar.a(floatValue2, yciVar, true);
            int i6 = i5 >> 6;
            i(i6 & 14, oq5Var, a4, str2);
            dgg.a(i6 & 896, j, oq5Var, qhoVar.a(floatValue3, yciVar, true), list == null ? c5b.a : list);
            k5r.s(oq5Var, false, true, false, false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t73(str, str2, list, j, yciVar, i, 1);
        }
    }

    public static final void h(int i, hq5 hq5Var, yci yciVar, String str, String str2) {
        int i2;
        str.getClass();
        str2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1038684339);
        int i3 = i & 6;
        wa5 wa5Var = wa5.a;
        if (i3 == 0) {
            i2 = (oq5Var.f(wa5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.g(true) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i2 |= oq5Var.g(true) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i2) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Pair R = R(true, oq5Var);
            float floatValue = ((Number) R.a).floatValue();
            float floatValue2 = ((Number) R.b).floatValue();
            yci a2 = wa5Var.a(yciVar, b2c.p);
            hz2 hz2Var = b2c.l;
            oq5Var.a0(693286680);
            nho a3 = lho.a(qx0.a, hz2Var, oq5Var, 48);
            oq5Var.a0(-1323940314);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            xp5.T.getClass();
            grb grbVar = wp5.b;
            wn5 A = ghh.A(a2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            A.invoke(new lrq(oq5Var), oq5Var, 0);
            oq5Var.a0(2058660585);
            oq5Var.a0(2146159112);
            if (floatValue <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            if (floatValue > Float.MAX_VALUE) {
                floatValue = Float.MAX_VALUE;
            }
            s((i2 >> 3) & 14, oq5Var, yciVar.f(new LayoutWeightElement(true, floatValue)), str);
            oq5Var.a0(-1779962770);
            v3r v3rVar = (v3r) oq5Var.j(cfs.c);
            oq5Var.p(false);
            irf.p(v3rVar.c, oq5Var, 0);
            oq5Var.p(false);
            if (floatValue2 <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            if (floatValue2 > Float.MAX_VALUE) {
                floatValue2 = Float.MAX_VALUE;
            }
            i((i2 >> 6) & 14, oq5Var, yciVar.f(new LayoutWeightElement(true, floatValue2)), str2);
            k5r.s(oq5Var, false, true, false, false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new s73(str, str2, yciVar, i, 1);
        }
    }

    public static final void i(int i, hq5 hq5Var, yci yciVar, String str) {
        int i2;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1318287863);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            oq5Var2.a0(1636734315);
            g95 g95Var = (g95) oq5Var2.j(cfs.a);
            oq5Var2.p(false);
            long j = g95Var.a;
            o9s o9sVar = new o9s(5);
            oq5Var2.a0(-262692206);
            sdt sdtVar = (sdt) oq5Var2.j(cfs.b);
            oq5Var2.p(false);
            oq5Var = oq5Var2;
            wcs.b(str, yciVar, j, 0L, null, 0L, o9sVar, 0L, 0, false, 0, 0, sdtVar.a, oq5Var, i2 & 126, 0, 65016);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new v73(str, yciVar, i, 0);
        }
    }

    public static final File i0(Context context) {
        context.getClass();
        return new File(context.getApplicationContext().getFilesDir(), "vpn_gate_private");
    }

    public static final DecoderEventData j(String str, TrackType trackType, hg7 hg7Var, tvs tvsVar, tvs tvsVar2, Function1 function1) {
        str.getClass();
        trackType.getClass();
        hg7Var.getClass();
        tvsVar.getClass();
        mg7 mg7Var = new mg7(str, hg7Var.c(), hg7Var.b(), z(tvsVar, trackType), tvsVar2 != null ? z(tvsVar2, trackType) : null);
        function1.invoke(mg7Var);
        return mg7Var.a();
    }

    public static final void j0(n4h n4hVar) {
        if (bp6.a.contains(quj.class)) {
            return;
        }
        try {
            n4hVar.getClass();
            float[] fArr = n4hVar.b;
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                if (fArr[i] < 0) {
                    fArr[i] = 0.0f;
                }
            }
        } catch (Throwable th) {
            bp6.a(quj.class, th);
        }
    }

    public static final void k(laa laaVar, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        int i2;
        Float f2;
        laaVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1246306211);
        if ((((oq5Var.f(laaVar) ? 4 : 2) | i | 48) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            kfh d2 = ug3.d(b2c.f, false);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yciVar2 = vci.a;
            yci H = vnj.H(oq5Var, yciVar2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            boolean z = laaVar instanceof iaa;
            haa haaVar = haa.a;
            jaa jaaVar = jaa.a;
            if (z) {
                i2 = R.drawable.ic_close_32;
            } else if ((laaVar instanceof kaa) || laaVar.equals(jaaVar)) {
                i2 = R.drawable.ic_download_32;
            } else {
                if (!laaVar.equals(haaVar)) {
                    b6e.s();
                    return;
                }
                i2 = R.drawable.ic_check_32;
            }
            w4k E = a0g.E(i2, 0, oq5Var);
            qs5 qs5Var = s9b.a;
            gae.b(E, null, null, ((q9b) oq5Var.j(qs5Var)).b(oq5Var), oq5Var, 48, 4);
            if (laaVar instanceof kaa) {
                f2 = Float.valueOf(((kaa) laaVar).a);
            } else {
                f2 = null;
                if (z) {
                    iaa iaaVar = (iaa) laaVar;
                    Float valueOf = Float.valueOf(iaaVar.a);
                    if (iaaVar.b) {
                        f2 = valueOf;
                    }
                } else if (!laaVar.equals(haaVar) && !laaVar.equals(jaaVar)) {
                    b6e.s();
                    return;
                }
            }
            if (f2 == null) {
                oq5Var.Z(1582646941);
            } else {
                oq5Var.Z(1582646942);
                l(f2.floatValue(), z, d.c(yciVar2, 1.0f), ((q9b) oq5Var.j(qs5Var)).b(oq5Var), oq5Var, 384);
            }
            oq5Var.p(false);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kw5(laaVar, yciVar2, i, 18);
        }
    }

    public static final void k0(n4h n4hVar) {
        if (bp6.a.contains(quj.class)) {
            return;
        }
        try {
            n4hVar.getClass();
            int[] iArr = n4hVar.c;
            int i = iArr[0];
            int i2 = iArr[1];
            float[] fArr = n4hVar.b;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * i2;
                int i5 = i4 + i2;
                float f2 = Float.MIN_VALUE;
                for (int i6 = i4; i6 < i5; i6++) {
                    float f3 = fArr[i6];
                    if (f3 > f2) {
                        f2 = f3;
                    }
                }
                float f4 = 0.0f;
                for (int i7 = i4; i7 < i5; i7++) {
                    float exp = (float) Math.exp(fArr[i7] - f2);
                    fArr[i7] = exp;
                    f4 += exp;
                }
                while (i4 < i5) {
                    fArr[i4] = fArr[i4] / f4;
                    i4++;
                }
            }
        } catch (Throwable th) {
            bp6.a(quj.class, th);
        }
    }

    public static final void l(final float f2, final boolean z, yci yciVar, final long j, hq5 hq5Var, final int i) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(715085603);
        int i2 = i | (oq5Var.c(f2) ? 4 : 2) | (oq5Var.g(z) ? 32 : 16) | (oq5Var.e(j) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            oq5Var.U();
            if ((i & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            sdr b2 = pk0.b(360.0f * f2, weo.Q(0.0f, 500.0f, null, 5), null, null, oq5Var, 48, 28);
            amr amrVar = new amr(((jx7) oq5Var.j(es5.h)).n0(2), 0.0f, 1, 0, 26);
            yci yciVar3 = vci.a;
            if (z) {
                yciVar3 = dag.C(yciVar3, f2);
            }
            yciVar2 = yciVar;
            yci m = d.m(yciVar2.f(yciVar3), 40);
            boolean h = ((((i2 & 7168) ^ 3072) > 2048 && oq5Var.e(j)) || (i2 & 3072) == 2048) | oq5Var.h(amrVar) | oq5Var.f(b2);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new ql3(amrVar, j, b2);
                oq5Var.k0(K);
            }
            ksw.j(0, oq5Var, m, (Function1) K);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            final yci yciVar4 = yciVar2;
            r.d = new Function2(f2, z, yciVar4, j, i) { // from class: baa
                public final /* synthetic */ float a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ yci c;
                public final /* synthetic */ long d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(385);
                    quj.l(this.a, this.b, this.c, this.d, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final n4h l0(n4h n4hVar) {
        if (bp6.a.contains(quj.class)) {
            return null;
        }
        try {
            int[] iArr = n4hVar.c;
            int i = iArr[0];
            int i2 = iArr[1];
            n4h n4hVar2 = new n4h(new int[]{i2, i});
            float[] fArr = n4hVar.b;
            float[] fArr2 = n4hVar2.b;
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    fArr2[(i4 * i) + i3] = fArr[(i3 * i2) + i4];
                }
            }
            return n4hVar2;
        } catch (Throwable th) {
            bp6.a(quj.class, th);
            return null;
        }
    }

    public static final void m(p1b p1bVar, s1b s1bVar, r1b r1bVar, int i, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-641003831);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var2.f(p1bVar) : oq5Var2.h(p1bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.h(s1bVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.h(r1bVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.d(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var2.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i3 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            StationId f2 = StationId.f(p1bVar.b.a);
            f2.getClass();
            ArrayList R = o8g.R(p1bVar.b.b);
            qfn qfnVar = s1bVar.e;
            kxi kxiVar = s1bVar.b;
            k6l k6lVar = r1bVar.a;
            uwu uwuVar = r1bVar.b;
            qwu qwuVar = r1bVar.c;
            int i4 = i3;
            boolean h = oq5Var2.h(s1bVar) | ((i3 & 14) == 4 || ((i3 & 8) != 0 && oq5Var2.h(p1bVar))) | ((i3 & 7168) == 2048);
            Object K = oq5Var2.K();
            if (h || K == gq5.a) {
                K = new de(s1bVar, p1bVar, i, 14);
                oq5Var2.k0(K);
            }
            oq5Var = oq5Var2;
            y1g.a(p1bVar.a, wyf.Y(f2, R, kxiVar, (Function0) K, k6lVar, uwuVar, qwuVar, null, qfnVar, null, oq5Var, 6, 0, 640), yciVar, null, oq5Var, (i4 >> 6) & 896, 8);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hq(p1bVar, s1bVar, r1bVar, i, yciVar, i2, 10);
        }
    }

    public static final n4h m0(n4h n4hVar) {
        if (bp6.a.contains(quj.class)) {
            return null;
        }
        try {
            int[] iArr = n4hVar.c;
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            n4h n4hVar2 = new n4h(new int[]{i3, i2, i});
            float[] fArr = n4hVar.b;
            float[] fArr2 = n4hVar2.b;
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i2; i5++) {
                    for (int i6 = 0; i6 < i3; i6++) {
                        fArr2[(i5 * i) + (i6 * i * i2) + i4] = fArr[(i5 * i3) + (i4 * i2 * i3) + i6];
                    }
                }
            }
            return n4hVar2;
        } catch (Throwable th) {
            bp6.a(quj.class, th);
            return null;
        }
    }

    public static final void n(a2b a2bVar, s1b s1bVar, r1b r1bVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        yci yciVar2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1995217765);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(a2bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.h(s1bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.h(r1bVar) ? 256 : 128;
        }
        if (((i2 | 3072) & 1171) == 1170 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            ynn i3 = irv.i(oq5Var2);
            ArrayList arrayList = a2bVar.a;
            vci vciVar = vci.a;
            yci a2 = a.a(vciVar, "editorial_wave_agents_block");
            Object K = oq5Var2.K();
            if (K == gq5.a) {
                K = new uv1(15);
                oq5Var2.k0(K);
            }
            oq5Var = oq5Var2;
            hld.l(arrayList, a2, (Function1) K, 0.0f, 0.0f, 0.0f, 0.0f, null, 2, false, false, false, ild.C(-1926155601, new fb1(6, s1bVar, r1bVar, i3), oq5Var2), oq5Var, 100663688, 384, 3832);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(i, 1, a2bVar, s1bVar, r1bVar, yciVar2);
        }
    }

    public static final void o(s1b s1bVar, r1b r1bVar, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        s1bVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2081304569);
        if (((i | (oq5Var.h(s1bVar) ? 4 : 2) | (oq5Var.h(r1bVar) ? 32 : 16) | 384) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            d8t e2 = i8t.e(gld.M(s1bVar.c, oq5Var).getValue(), "editorialWaveAgentsCrossfade", oq5Var, 48, 0);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new rua(18);
                oq5Var.k0(K);
            }
            Function1 function1 = (Function1) K;
            wn5 C = ild.C(279959964, new ar(29, s1bVar, r1bVar), oq5Var);
            vci vciVar = vci.a;
            tt0.f(e2, vciVar, null, function1, C, oq5Var, 27696, 2);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new v48(i, 8, yciVar2, s1bVar, r1bVar);
        }
    }

    public static final void p(int i, d85 d85Var, hq5 hq5Var, cvd cvdVar, yci yciVar, Function0 function0, Function0 function02, Function1 function1, boolean z) {
        cvdVar.getClass();
        function1.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1131437567);
        int i2 = (oq5Var.f(cvdVar) ? 4 : 2) | i | (oq5Var.h(function1) ? 32 : 16) | (oq5Var.h(function0) ? 256 : 128) | (oq5Var.h(function02) ? 2048 : 1024) | (oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.g(z) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.f(d85Var) ? 1048576 : 524288);
        if (oq5Var.P(i2 & 1, (599187 & i2) != 599186)) {
            pd.b(new qzm[0], false, ild.C(-841896598, new rud(cvdVar, z, d85Var, function1, function0, function02, yciVar), oq5Var), oq5Var, 0, 2);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rud(cvdVar, function1, function0, function02, yciVar, z, d85Var, i);
        }
    }

    public static final void q(dfe dfeVar, yci yciVar, hq5 hq5Var, int i, int i2) {
        yci yciVar2;
        int i3;
        Object v2dVar;
        String str;
        vci vciVar;
        kb5 kb5Var;
        kjn kjnVar;
        gz2 gz2Var;
        kb5 kb5Var2;
        agr agrVar;
        float f2;
        grb grbVar;
        kx0 kx0Var;
        float f3;
        float f4;
        int i4;
        float f5;
        dfe dfeVar2;
        yci yciVar3;
        dfeVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1962196354);
        int i5 = i | (oq5Var.h(dfeVar) ? 4 : 2);
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i5 | 48;
            yciVar2 = yciVar;
        } else {
            yciVar2 = yciVar;
            i3 = i5 | (oq5Var.f(yciVar2) ? 32 : 16);
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar3 = yciVar2;
            dfeVar2 = dfeVar;
        } else {
            vci vciVar2 = vci.a;
            yci yciVar4 = i6 != 0 ? vciVar2 : yciVar2;
            w(dfeVar.c, oq5Var, 0);
            yci c2 = d.c(yciVar4, 1.0f);
            kx0 kx0Var2 = qx0.c;
            gz2 gz2Var2 = b2c.n;
            ta5 a2 = sa5.a(kx0Var2, gz2Var2, oq5Var, 0);
            int i7 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c2);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar2);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var3 = wp5.f;
            g0g.U(oq5Var, a2, kb5Var3);
            kb5 kb5Var4 = wp5.e;
            g0g.U(oq5Var, l, kb5Var4);
            kb5 kb5Var5 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var5);
            }
            kb5 kb5Var6 = wp5.d;
            g0g.U(oq5Var, H, kb5Var6);
            wn5 wn5Var = vut.d;
            wn5 C = ild.C(1445956078, new nha(19, dfeVar), oq5Var);
            agr agrVar2 = eq0.a;
            yci yciVar5 = yciVar4;
            sp0.c(wn5Var, null, C, null, ((dq0) oq5Var.j(agrVar2)).c.a, ((dq0) oq5Var.j(agrVar2)).b.a, 0, oq5Var, 1573254, 10);
            float f6 = 16;
            xcs.b(rvf.M(R.string.restore_purchases_description, oq5Var), androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.a.o(d.d(vciVar2, 1.0f), f6, 0.0f, 2), 0.0f, f6, 0.0f, 4, 5), ((dq0) oq5Var.j(agrVar2)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, 48, 0, 65528);
            String M = rvf.M(R.string.restore_previous_purchases, oq5Var);
            boolean h = oq5Var.h(dfeVar);
            Object K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (h || K == kjnVar2) {
                str = M;
                vciVar = vciVar2;
                kb5Var = kb5Var3;
                kjnVar = kjnVar2;
                gz2Var = gz2Var2;
                kb5Var2 = kb5Var4;
                agrVar = agrVar2;
                f2 = 1.0f;
                grbVar = grbVar2;
                kx0Var = kx0Var2;
                f3 = f6;
                v2dVar = new v2d(0, dfeVar, dfe.class, "restorePurchasesClick", "restorePurchasesClick()V", 0, 11);
                oq5Var.k0(v2dVar);
            } else {
                vciVar = vciVar2;
                agrVar = agrVar2;
                f2 = 1.0f;
                str = M;
                v2dVar = K;
                kjnVar = kjnVar2;
                grbVar = grbVar2;
                kx0Var = kx0Var2;
                f3 = f6;
                gz2Var = gz2Var2;
                kb5Var2 = kb5Var4;
                kb5Var = kb5Var3;
            }
            float f7 = 12;
            hdg.o(str, (Function0) ((h9f) v2dVar), a.a(androidx.compose.foundation.layout.a.o(d.d(vciVar, f2), f7, 0.0f, 2), "restore_purchases_button"), 0.0f, oq5Var, 384, 8);
            yci q = androidx.compose.foundation.layout.a.q(d.d(vciVar, f2), 0.0f, 20, 0.0f, 0.0f, 13);
            ta5 a3 = sa5.a(kx0Var, gz2Var, oq5Var, 0);
            int i8 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, q);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var, i8, kb5Var5);
            }
            g0g.U(oq5Var, H2, kb5Var6);
            kjn kjnVar3 = kjnVar;
            xcs.b(rvf.M(R.string.restore_purchases_write_to_support, oq5Var), androidx.compose.foundation.layout.a.o(d.d(vciVar, f2), f3, 0.0f, 2), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, 48, 0, 65528);
            String M2 = rvf.M(R.string.write_to_developers, oq5Var);
            boolean h2 = oq5Var.h(dfeVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar3) {
                f4 = f7;
                i4 = 2;
                f5 = 0.0f;
                v2d v2dVar2 = new v2d(0, dfeVar, dfe.class, "writeToSupportClick", "writeToSupportClick()V", 0, 12);
                dfeVar2 = dfeVar;
                oq5Var.k0(v2dVar2);
                K2 = v2dVar2;
            } else {
                f4 = f7;
                i4 = 2;
                f5 = 0.0f;
                dfeVar2 = dfeVar;
            }
            oq5Var = oq5Var;
            hdg.t(M2, (Function0) ((h9f) K2), androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.a.o(d.d(vciVar, f2), f4, f5, i4), 0.0f, 8, 0.0f, 0.0f, 13), null, oq5Var, 384, 8);
            oq5Var.p(true);
            oq5Var.p(true);
            yciVar3 = yciVar5;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gva(dfeVar2, yciVar3, i, i2);
        }
    }

    public static final i5f r(x3f x3fVar, Function1 function1) {
        x3fVar.getClass();
        function1.getClass();
        g4f g4fVar = new g4f();
        j4f j4fVar = x3fVar.a;
        g4fVar.a = j4fVar.a;
        g4fVar.b = j4fVar.e;
        g4fVar.c = j4fVar.b;
        g4fVar.d = j4fVar.c;
        String str = j4fVar.f;
        g4fVar.e = j4fVar.g;
        g4fVar.f = j4fVar.h;
        em4 em4Var = j4fVar.k;
        boolean z = j4fVar.i;
        g4fVar.g = j4fVar.j;
        g4fVar.h = j4fVar.d;
        g4fVar.i = x3fVar.b;
        function1.invoke(g4fVar);
        if (!Intrinsics.d(str, "    ")) {
            xq0.x("Indent should not be specified when default printing mode is used");
            return null;
        }
        j4f j4fVar2 = new j4f(g4fVar.a, g4fVar.c, g4fVar.d, g4fVar.h, g4fVar.b, str, g4fVar.e, g4fVar.f, z, g4fVar.g, em4Var);
        uhp uhpVar = g4fVar.i;
        uhpVar.getClass();
        i5f i5fVar = new i5f(j4fVar2, uhpVar);
        if (uhpVar.equals(pip.a)) {
            return i5fVar;
        }
        uhpVar.a(new c7f(j4fVar2));
        return i5fVar;
    }

    public static final void s(int i, hq5 hq5Var, yci yciVar, String str) {
        int i2;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(312353717);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            oq5Var2.a0(1636734315);
            g95 g95Var = (g95) oq5Var2.j(cfs.a);
            oq5Var2.p(false);
            long j = g95Var.a;
            tqc tqcVar = tqc.p;
            ges gesVar = lsq.y(oq5Var2).a;
            long j2 = lsq.y(oq5Var2).a.a.b;
            float f2 = lsq.y(oq5Var2).b;
            v7g.p(j2);
            oq5Var = oq5Var2;
            wcs.b(str, yciVar, j, 0L, tqcVar, 0L, new o9s(6), 0L, 0, false, 0, 0, ges.b(gesVar, 0L, v7g.D(kes.c(j2) * f2, 1095216660480L & j2), null, null, 0L, 0, 0L, null, null, 0, 0, 16777213), oq5Var, (i2 & 14) | 196608 | (i2 & 112), 384, 60888);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new v73(str, yciVar, i, 1);
        }
    }

    public static final void t(final dh3 dh3Var, final float f2, final q6k q6kVar, final wud wudVar, final d85 d85Var, final boolean z, final Function1 function1, final Function0 function0, hq5 hq5Var, final int i) {
        int i2;
        d85 d85Var2;
        boolean z2;
        Function1 function12;
        Function0 function02;
        oq5 oq5Var;
        Boolean valueOf;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1440678420);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(dh3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.c(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(q6kVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var2.f(wudVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            d85Var2 = d85Var;
            i2 |= oq5Var2.f(d85Var2) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            d85Var2 = d85Var;
        }
        if ((196608 & i) == 0) {
            z2 = z;
            i2 |= oq5Var2.g(z2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        } else {
            z2 = z;
        }
        if ((1572864 & i) == 0) {
            function12 = function1;
            i2 |= oq5Var2.h(function12) ? 1048576 : 524288;
        } else {
            function12 = function1;
        }
        if ((12582912 & i) == 0) {
            function02 = function0;
            i2 |= oq5Var2.h(function02) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        } else {
            function02 = function0;
        }
        int i3 = i2;
        if (oq5Var2.P(i3 & 1, (4793491 & i3) != 4793490)) {
            if (Intrinsics.d(q6kVar, zud.k)) {
                valueOf = null;
            } else if (q6kVar instanceof avd) {
                valueOf = Boolean.valueOf(((avd) q6kVar).k);
            } else {
                if (!(q6kVar instanceof yud)) {
                    b6e.s();
                    return;
                }
                valueOf = Boolean.valueOf(((yud) q6kVar).k);
            }
            yci e2 = d.e(dh3Var.a(d.d(vci.a, 1.0f), b2c.c), f2);
            kfh d2 = ug3.d(b2c.f, false);
            int i4 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, e2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d2, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            if (wudVar == null || valueOf == null) {
                oq5Var = oq5Var2;
                oq5Var.Z(-1205334268);
                int i5 = i3 >> 9;
                v(q6kVar, d85Var, z, function1, function0, oq5Var, ((i3 >> 6) & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344));
                oq5Var.p(false);
            } else {
                oq5Var2.Z(-1205927174);
                oq5Var = oq5Var2;
                oxm.a(wudVar.a, valueOf.booleanValue(), d85Var, ild.C(-1004638059, new qr(q6kVar, d85Var2, z2, function12, function02), oq5Var2), null, oq5Var, ((i3 >> 6) & 896) | 3072);
                oq5Var.p(false);
            }
            oq5Var.p(true);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: vud
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    quj.t(dh3.this, f2, q6kVar, wudVar, d85Var, z, function1, function0, (hq5) obj, rvf.R(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void u(int i, d85 d85Var, hq5 hq5Var, cvd cvdVar, yci yciVar, Function0 function0, Function0 function02, Function1 function1, boolean z) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-422027518);
        int i2 = (oq5Var.f(cvdVar) ? 4 : 2) | i | (oq5Var.g(z) ? 32 : 16) | (oq5Var.f(d85Var) ? 256 : 128) | (oq5Var.h(function1) ? 2048 : 1024) | (oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.f(yciVar) ? 1048576 : 524288);
        if (oq5Var.P(i2 & 1, (599187 & i2) != 599186)) {
            bg3.a(d.d(yciVar, 1.0f), null, false, ild.C(608202712, new h54(cvdVar, d85Var, z, function1, function0, function02), oq5Var), oq5Var, 3072, 6);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rud(cvdVar, z, d85Var, function1, function0, function02, yciVar, i);
        }
    }

    public static final void v(q6k q6kVar, d85 d85Var, boolean z, Function1 function1, Function0 function0, hq5 hq5Var, int i) {
        int i2;
        q6k q6kVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(845661367);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(q6kVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(d85Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if (!oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            q6kVar2 = q6kVar;
            oq5Var.S();
        } else if (q6kVar instanceof yud) {
            oq5Var.Z(-1180054830);
            etn.f(!z, null, androidx.compose.animation.c.e(weo.S(600, 0, null, 6), 2), androidx.compose.animation.c.f(weo.S(600, 0, null, 6), 2), null, ild.C(-1537919385, new tud(q6kVar, d85Var, function1, function0, 1), oq5Var), oq5Var, 200064, 18);
            oq5Var.p(false);
            q6kVar2 = q6kVar;
        } else if (q6kVar instanceof avd) {
            oq5Var.Z(-1177709029);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = vz1.h(oq5Var);
            }
            uoi uoiVar = (uoi) K;
            avd avdVar = (avd) q6kVar;
            oq5Var.Z(931847848);
            o43 o43Var = avdVar.m;
            yci yciVar = vci.a;
            if (o43Var != null || avdVar.n) {
                boolean z2 = ((i2 & 14) == 4) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384);
                Object K2 = oq5Var.K();
                if (z2 || K2 == kjnVar) {
                    K2 = new sud(q6kVar, function0, function1, 0);
                    oq5Var.k0(K2);
                }
                yciVar = androidx.compose.foundation.a.d(yciVar, uoiVar, null, false, null, null, (Function0) K2, 28);
            }
            yci yciVar2 = yciVar;
            oq5Var.p(false);
            q6kVar2 = q6kVar;
            x(avdVar, d85Var, yciVar2, oq5Var, i2 & 126, 0);
            oq5Var.p(false);
        } else {
            q6kVar2 = q6kVar;
            if (!Intrinsics.d(q6kVar2, zud.k)) {
                throw vz1.i(oq5Var, 931764132, false);
            }
            oq5Var.Z(931872347);
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vu0(q6kVar2, d85Var, z, function1, function0, i, 2);
        }
    }

    public static final void w(u0q u0qVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1107227310);
        if ((((oq5Var.h(u0qVar) ? 4 : 2) | i) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            Unit unit = Unit.a;
            boolean h = oq5Var.h(u0qVar) | oq5Var.h(context);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new vfe(u0qVar, context, null, 0);
                oq5Var.k0(K);
            }
            gld.w(oq5Var, unit, (Function2) K);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tfe(u0qVar, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void x(avd avdVar, d85 d85Var, yci yciVar, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        xmn r;
        long r2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(749569318);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(avdVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.f(d85Var) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 256 : 128;
            if (oq5Var.P(i3 & 1, (i3 & 147) == 146)) {
                oq5Var.S();
            } else {
                yci yciVar3 = i4 != 0 ? vci.a : yciVar2;
                if (((ma5) oq5Var.j(pa5.a)).g()) {
                    oq5Var.Z(884852413);
                    r2 = kg5.r(R.color.icon_logo_day_old, oq5Var);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(884785887);
                    r2 = kg5.r(R.color.icon_logo_night, oq5Var);
                    oq5Var.p(false);
                }
                oq5Var.Z(-1218379529);
                if (avdVar.l != null) {
                    boolean N = pd.N(oq5Var);
                    hfs hfsVar = avdVar.l;
                    r2 = N ? hfsVar.a : hfsVar.b;
                }
                oq5Var.p(false);
                w4k E = a0g.E(avdVar.k ? R.drawable.ic_yandex_music_logo_ru : R.drawable.ic_yandex_music_logo_en, 0, oq5Var);
                if (d85Var != null) {
                    r2 = d85Var.a;
                }
                irf.r(E, rvf.M(R.string.app_name_new, oq5Var), d.e(yciVar3, 44), null, hd6.c, 0.0f, new d43(((d85) bmq.b(r2, weo.S(1000, 0, null, 6), "animateLogoTintColor", oq5Var, 432, 8).getValue()).a, 5), oq5Var, 24576, 40);
                yciVar2 = yciVar3;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new lx(avdVar, d85Var, yciVar2, i, i2, 11);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if (oq5Var.P(i3 & 1, (i3 & 147) == 146)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void y(androidx.compose.foundation.layout.c cVar, float f2, bvd bvdVar, xud xudVar, Function1 function1, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        float f3;
        float f4;
        float f5;
        float f6;
        vci vciVar;
        boolean z;
        int i2;
        long j;
        boolean z2;
        long j2;
        gz2 gz2Var = b2c.o;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(739960469);
        int i3 = 4;
        int i4 = i | (oq5Var.f(cVar) ? 4 : 2) | (oq5Var.c(f2) ? 32 : 16) | (oq5Var.f(bvdVar) ? 256 : 128) | (oq5Var.f(xudVar) ? 2048 : 1024) | (oq5Var.h(function1) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(function0) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | ScreenMirroringConfig.Video.BITRATE_1_5MB;
        if (oq5Var.P(i4 & 1, (599187 & i4) != 599186)) {
            vci vciVar2 = vci.a;
            if (bvdVar == null && xudVar == null) {
                oq5Var.Z(-1915732211);
                oq5Var.p(false);
                vciVar = vciVar2;
            } else {
                oq5Var.Z(-1904404625);
                float f7 = 48;
                if (Float.compare(f2, f7) < 0) {
                    f4 = f2;
                } else {
                    if (Float.compare(f2, f7) < 0 || Float.compare(f2, 56) >= 0) {
                        if (Float.compare(f2, 56) < 0 || Float.compare(f2, 64) >= 0) {
                            f3 = 12;
                            f4 = f2 - f3;
                        } else {
                            i3 = 6;
                        }
                    }
                    f3 = i3;
                    f4 = f2 - f3;
                }
                if (bvdVar != null) {
                    oq5Var.Z(-1903892071);
                    f5 = f7;
                    ogi ogiVar = new ogi(new dn9(new mn0(bvdVar.a), nu0.j(), c5b.a, (jx7) oq5Var.j(es5.h), (ppc) oq5Var.j(es5.k)), ga6.b(cVar.b, 0, 0, 0, 0, 10), 2, 1);
                    oq5Var.p(false);
                    f6 = ogiVar.e;
                } else {
                    f5 = f7;
                    oq5Var.Z(-1903497069);
                    oq5Var.p(false);
                    f6 = 0.0f;
                }
                jx7 jx7Var = (jx7) oq5Var.j(es5.h);
                float L = jx7Var.L(f4) + f6;
                float f8 = 12;
                Integer valueOf = Integer.valueOf(jx7Var.L(f8));
                d85 d85Var = null;
                if (bvdVar == null || xudVar == null) {
                    valueOf = null;
                }
                float intValue = L + (valueOf != null ? valueOf.intValue() : 0);
                Integer valueOf2 = Integer.valueOf(jx7Var.L(f5));
                if (xudVar == null) {
                    valueOf2 = null;
                }
                if (ga6.h(cVar.b) >= intValue + (valueOf2 != null ? valueOf2.intValue() : 0) + jx7Var.L(16)) {
                    oq5Var.Z(-1902987336);
                    yci q = androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, f4, 0.0f, 0.0f, 13);
                    ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                    int i5 = oq5Var.P;
                    androidx.compose.runtime.internal.a l = oq5Var.l();
                    yci H = vnj.H(oq5Var, q);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var.d0();
                    if (oq5Var.O) {
                        oq5Var.k(grbVar);
                    } else {
                        oq5Var.n0();
                    }
                    g0g.U(oq5Var, a2, wp5.f);
                    g0g.U(oq5Var, l, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var, i5, kb5Var);
                    }
                    g0g.U(oq5Var, H, wp5.d);
                    if (bvdVar != null) {
                        hfs hfsVar = bvdVar.b;
                        oq5Var.Z(-1414443876);
                        if (hfsVar != null) {
                            oq5Var.Z(-1414397500);
                            j2 = pd.N(oq5Var) ? hfsVar.a : hfsVar.b;
                            z2 = false;
                            oq5Var.p(false);
                        } else {
                            z2 = false;
                            oq5Var.Z(-1414246034);
                            j2 = ((dq0) oq5Var.j(eq0.a)).b.a;
                            oq5Var.p(false);
                        }
                        vciVar = vciVar2;
                        i2 = i4;
                        z = z2;
                        xv7.j(bvdVar.a, new HorizontalAlignElement(gz2Var), j2, 0L, 0L, 3, 0L, 2, false, 2, 0, null, nu0.j(), oq5Var, 0, 3120, 55032);
                        oq5Var = oq5Var;
                        eta.p(vciVar, f8, oq5Var, z);
                    } else {
                        i2 = i4;
                        vciVar = vciVar2;
                        z = false;
                        oq5Var.Z(-1427312007);
                        oq5Var.p(false);
                    }
                    if (xudVar != null) {
                        oq5Var.Z(-1413617447);
                        com.yandex.music.core.ui.compose.a.a(function0, oq5Var, (i2 >> 15) & 14);
                        hfs hfsVar2 = xudVar.c;
                        if (hfsVar2 == null) {
                            oq5Var.Z(-1413511335);
                            oq5Var.p(z);
                        } else {
                            oq5Var.Z(-1413511334);
                            d85Var = k5r.f(oq5Var, z, pd.N(oq5Var) ? hfsVar2.a : hfsVar2.b);
                        }
                        d85 d85Var2 = d85Var;
                        if (d85Var2 == null) {
                            oq5Var.Z(-184139760);
                            j = ((dq0) oq5Var.j(eq0.a)).b.a;
                            oq5Var.p(z);
                        } else {
                            oq5Var.Z(-184144999);
                            oq5Var.p(z);
                            j = d85Var2.a;
                        }
                        String str = xudVar.a;
                        HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(gz2Var);
                        boolean N = pd.N(oq5Var);
                        hfs hfsVar3 = xudVar.b;
                        long j3 = N ? hfsVar3.a : hfsVar3.b;
                        boolean z3 = ((i2 & 7168) != 2048 ? z : true) | ((57344 & i2) == 16384 ? true : z);
                        Object K = oq5Var.K();
                        if (z3 || K == gq5.a) {
                            K = new zya(12, function1, xudVar);
                            oq5Var.k0(K);
                        }
                        q5g.j(str, (Function0) K, j3, new d85(j), horizontalAlignElement, null, oq5Var, 0);
                    } else {
                        oq5Var.Z(-1427312007);
                    }
                    oq5Var.p(z);
                    oq5Var.p(true);
                } else {
                    vciVar = vciVar2;
                    z = false;
                    oq5Var.Z(-1915732211);
                }
                oq5Var.p(z);
                oq5Var.p(z);
            }
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mz4(cVar, f2, bvdVar, xudVar, function1, function0, yciVar2, i);
        }
    }

    public static final TrackFormatData z(tvs tvsVar, TrackType trackType) {
        String sb;
        if (ng7.a[trackType.ordinal()] == 1) {
            StringBuilder sb2 = new StringBuilder();
            isb isbVar = (isb) tvsVar;
            sb2.append(isbVar.j);
            sb2.append(' ');
            sb2.append(isbVar.f);
            sb2.append('x');
            sb2.append(isbVar.g);
            sb2.append(' ');
            sb2.append(isbVar.b);
            sb = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            isb isbVar2 = (isb) tvsVar;
            sb3.append(isbVar2.j);
            sb3.append(" lang=");
            sb3.append(isbVar2.d);
            sb3.append(' ');
            sb3.append(isbVar2.b);
            sb = sb3.toString();
        }
        String str = sb;
        sv4 sv4Var = new sv4(12, tvsVar, trackType);
        uvs uvsVar = new uvs();
        sv4Var.invoke(uvsVar);
        return new TrackFormatData(str, uvsVar.a, uvsVar.b, uvsVar.c, null);
    }

    public abstract void h0(String str);

    public void d0(y yVar, o oVar) {
    }

    public void e0(y yVar, o oVar) {
    }

    public void g0(y yVar, o oVar) {
    }

    public void f0(y yVar, o oVar, Bundle bundle) {
    }
}
