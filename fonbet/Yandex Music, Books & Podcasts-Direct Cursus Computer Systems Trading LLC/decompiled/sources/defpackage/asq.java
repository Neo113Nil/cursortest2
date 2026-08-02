package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.core.ui.compose.b;
import com.yandex.music.shared.dto.wave.recommendation.StationIdDto;
import com.yandex.music.shared.utils.ThrowablesKt;
import com.yandex.music.shared.utils.assertions.Assertions;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import ru.yandex.music.R;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes.dex */
public final class asq implements esq {
    public final /* synthetic */ int a;

    public static mno A(byte[] bArr, Parcelable.Creator creator) {
        y1g.G(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        mno mnoVar = (mno) creator.createFromParcel(obtain);
        obtain.recycle();
        return mnoVar;
    }

    public static final dxb B(udp udpVar, v2q v2qVar) {
        udpVar.getClass();
        v2qVar.getClass();
        u2q u2qVar = v2qVar instanceof u2q ? (u2q) v2qVar : null;
        gy1 gy1Var = u2qVar != null ? u2qVar.c : null;
        int i = gy1Var == null ? -1 : pzn.b[gy1Var.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return dxb.PREVIEW;
            }
            if (i == 2) {
                return dxb.SMART_PREVIEW;
            }
            if (i != 3) {
                b6e.s();
                return null;
            }
        }
        int ordinal = udpVar.a().ordinal();
        if (ordinal == 0) {
            return dxb.AUTO;
        }
        if (ordinal == 1) {
            return dxb.LQ;
        }
        if (ordinal == 2) {
            return dxb.NQ;
        }
        if (ordinal == 3) {
            return dxb.HQ;
        }
        if (ordinal == 4) {
            return dxb.LOSSLESS;
        }
        b6e.s();
        return null;
    }

    public static final Activity C(Context context) {
        Context baseContext;
        context.getClass();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
        if (contextWrapper == null || (baseContext = contextWrapper.getBaseContext()) == null) {
            return null;
        }
        return C(baseContext);
    }

    public static final n7q D(wjl wjlVar) {
        me5 me5Var = (me5) wjlVar.d.a.getValue();
        if (Intrinsics.d(me5Var, ke5.a)) {
            return null;
        }
        if (me5Var instanceof le5) {
            return ((le5) me5Var).b;
        }
        b6e.s();
        return null;
    }

    public static final wjb E(cqu cquVar) {
        if (cquVar instanceof xpu) {
            return wjb.MultivibeAcceptingInvitationScreen;
        }
        if (cquVar instanceof zpu) {
            return wjb.MultivibePendingInvitationScreen;
        }
        if (cquVar instanceof ypu) {
            return wjb.MultivibeLimitScreen;
        }
        if (cquVar instanceof aqu) {
            return wjb.MultivibeAloneScreen;
        }
        if (cquVar instanceof wpu) {
            return wjb.MultivibeInvalidInvitationScreen;
        }
        if (cquVar instanceof vpu) {
            return wjb.MultivibeAlreadyExistScreen;
        }
        if ((cquVar instanceof tpu) || (cquVar instanceof upu)) {
            return wjb.BottomsheetScreen;
        }
        b6e.s();
        return null;
    }

    public static jlm F(AppCompatTextView appCompatTextView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new jlm(jo0.x(appCompatTextView));
        }
        TextPaint textPaint = new TextPaint(appCompatTextView.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = appCompatTextView.getBreakStrategy();
        int hyphenationFrequency = appCompatTextView.getHyphenationFrequency();
        if (appCompatTextView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i < 28 || (appCompatTextView.getInputType() & 15) != 3) {
                boolean z = appCompatTextView.getLayoutDirection() == 1;
                switch (appCompatTextView.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(jo0.k(DecimalFormatSymbols.getInstance(appCompatTextView.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new jlm(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static String G(String str, String... strArr) {
        if (strArr.length == 0) {
            Assertions.fail("columns must be set");
        }
        StringBuilder u = ouj.u("CREATE INDEX IF NOT EXISTS ind_", str, "__");
        su4.v(u, xz0.H(strArr, "_", null), " ON ", str, "(");
        return su4.o(u, xz0.H(strArr, ", ", null), ")");
    }

    public static final boolean H(Context context) {
        context.getClass();
        Configuration configuration = context.getResources().getConfiguration();
        configuration.getClass();
        return I(configuration);
    }

    public static final boolean I(Configuration configuration) {
        configuration.getClass();
        return configuration.orientation == 2;
    }

    public static final boolean J(Configuration configuration) {
        configuration.getClass();
        return configuration.orientation == 1;
    }

    public static final by7 K(vdr vdrVar, Function1 function1) {
        vdrVar.getClass();
        return new by7(new y6g(4, function1, vdrVar), new njf(vdrVar, function1, 9), 0);
    }

    public static void L(rsr rsrVar, String str, String str2) {
        String concat = str.concat("_tmp");
        rsrVar.execSQL("DROP TABLE IF EXISTS ".concat(concat));
        rsrVar.execSQL("CREATE TABLE IF NOT EXISTS " + concat + " AS SELECT * FROM " + str);
        rsrVar.execSQL("DROP TABLE IF EXISTS ".concat(str));
        rsrVar.execSQL(str2);
        String[] split = str2.substring(str2.indexOf(40) + 1, str2.indexOf(41)).split(StringUtils.COMMA);
        ArrayList arrayList = new ArrayList(split.length);
        ArrayList arrayList2 = new ArrayList(split.length);
        for (String str3 : split) {
            String trim = str3.trim();
            String substring = trim.substring(0, trim.indexOf(32));
            arrayList2.add(substring);
            arrayList.add(substring);
        }
        StringBuilder u = ouj.u("INSERT INTO ", str, " (");
        u.append(TextUtils.join(StringUtils.COMMA, arrayList2));
        u.append(") SELECT ");
        u.append(TextUtils.join(StringUtils.COMMA, arrayList));
        u.append(" FROM ");
        u.append(concat);
        rsrVar.execSQL(u.toString());
        rsrVar.execSQL("DROP TABLE IF EXISTS ".concat(concat));
    }

    public static final pcu M(Function0 function0, sdr sdrVar, aqi aqiVar, aqi aqiVar2, fvf fvfVar, hq5 hq5Var, int i) {
        Object aj4Var;
        fk0 fk0Var;
        aqi aqiVar3;
        float f;
        aqi aqiVar4;
        aqi aqiVar5;
        sbu sbuVar;
        function0.getClass();
        sdrVar.getClass();
        aqiVar.getClass();
        aqiVar2.getClass();
        fvfVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        nyf lifecycle = ((dzf) oq5Var.j(ykg.a)).getLifecycle();
        boolean f2 = oq5Var.f(lifecycle) | ((((i & 14) ^ 6) > 4 && oq5Var.f(function0)) || (i & 6) == 4);
        Object K = oq5Var.K();
        Object obj = gq5.a;
        if (f2 || K == obj) {
            dcu dcuVar = dcu.One;
            K = new sbu(function0, lifecycle);
            oq5Var.k0(K);
        }
        sbu sbuVar2 = (sbu) K;
        boolean z = ((Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a)).orientation == 1;
        Boolean bool = (Boolean) aqiVar2.getValue();
        boolean booleanValue = bool.booleanValue();
        Object K2 = oq5Var.K();
        if (K2 == obj) {
            K2 = vq2.a(0.0f);
            oq5Var.k0(K2);
        }
        fk0 fk0Var2 = (fk0) K2;
        Object K3 = oq5Var.K();
        if (K3 == obj) {
            K3 = szf.g0(Boolean.TRUE);
            oq5Var.k0(K3);
        }
        aqi aqiVar6 = (aqi) K3;
        Object K4 = oq5Var.K();
        if (K4 == obj) {
            K4 = szf.g0(kcu.a);
            oq5Var.k0(K4);
        }
        aqi aqiVar7 = (aqi) K4;
        Object K5 = oq5Var.K();
        if (K5 == obj) {
            K5 = szf.g0(Boolean.FALSE);
            oq5Var.k0(K5);
        }
        aqi aqiVar8 = (aqi) K5;
        Object[] objArr = {sbuVar2, sdrVar, Boolean.valueOf(z), bool, aqiVar6};
        boolean g = ((((i & 112) ^ 48) > 32 && oq5Var.f(sdrVar)) || (i & 48) == 32) | oq5Var.g(z) | oq5Var.g(booleanValue) | oq5Var.h(sbuVar2);
        Object K6 = oq5Var.K();
        if (g || K6 == obj) {
            fk0Var = fk0Var2;
            aqiVar3 = aqiVar7;
            f = 0.0f;
            aj4Var = new aj4(sdrVar, z, booleanValue, sbuVar2, aqiVar6, aqiVar8, null);
            sbuVar2 = sbuVar2;
            aqiVar4 = aqiVar6;
            aqiVar5 = aqiVar8;
            oq5Var.k0(aj4Var);
        } else {
            aqiVar4 = aqiVar6;
            aqiVar5 = aqiVar8;
            aj4Var = K6;
            f = 0.0f;
            fk0Var = fk0Var2;
            aqiVar3 = aqiVar7;
        }
        gld.z(objArr, (Function2) aj4Var, oq5Var);
        Object[] objArr2 = {sbuVar2, fk0Var, aqiVar, aqiVar3};
        boolean h = ((((i & 896) ^ 384) > 256 && oq5Var.f(aqiVar)) || (i & 384) == 256) | oq5Var.h(sbuVar2) | oq5Var.h(fk0Var);
        Object K7 = oq5Var.K();
        if (h || K7 == obj) {
            Object inrVar = new inr(aqiVar, aqiVar5, sbuVar2, aqiVar3, fk0Var, null, 8);
            sbuVar = sbuVar2;
            oq5Var.k0(inrVar);
            K7 = inrVar;
        } else {
            sbuVar = sbuVar2;
        }
        gld.z(objArr2, (Function2) K7, oq5Var);
        int i2 = i >> 12;
        float f3 = m4c.a;
        Object K8 = oq5Var.K();
        if (K8 == obj) {
            K8 = tlm.h(f, oq5Var);
        }
        poi poiVar = (poi) K8;
        float Q = ff7.Q(m4c.a, oq5Var);
        Float valueOf = Float.valueOf(Q);
        boolean c = ((((i2 & 14) ^ 6) > 4 && oq5Var.f(fvfVar)) || (i2 & 6) == 4) | oq5Var.c(Q);
        Object K9 = oq5Var.K();
        if (c || K9 == obj) {
            Object zp5Var = new zp5(fvfVar, Q, poiVar, null, 1);
            oq5Var.k0(zp5Var);
            K9 = zp5Var;
        }
        gld.x(fvfVar, poiVar, valueOf, (Function2) K9, oq5Var);
        boolean f4 = oq5Var.f(sbuVar) | oq5Var.f(fk0Var) | oq5Var.f(poiVar);
        Object K10 = oq5Var.K();
        if (f4 || K10 == obj) {
            K10 = new pcu(sbuVar, fk0Var, aqiVar4, aqiVar3, poiVar);
            oq5Var.k0(K10);
        }
        return (pcu) K10;
    }

    public static void N(TextView textView, ColorStateList colorStateList) {
        textView.getClass();
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static void O(TextView textView, int i) {
        o5g.v(i);
        if (Build.VERSION.SDK_INT >= 28) {
            jo0.H(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void P(TextView textView, int i) {
        o5g.v(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void Q(TextView textView, int i) {
        o5g.v(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static final Pair R(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    public static final String S(be6 be6Var) {
        be6Var.getClass();
        int ordinal = be6Var.ordinal();
        if (ordinal == 0) {
            return "track";
        }
        if (ordinal == 1) {
            return "set";
        }
        if (ordinal == 2) {
            return "trailer";
        }
        if (ordinal == 3) {
            return "non_music";
        }
        b6e.s();
        return null;
    }

    public static final StationId T(StationIdDto stationIdDto) {
        String tag;
        stationIdDto.getClass();
        String type = stationIdDto.getType();
        if (type != null && (tag = stationIdDto.getTag()) != null) {
            return new StationId(type, tag);
        }
        StationId stationId = StationId.a;
        stationId.getClass();
        return stationId;
    }

    public static final String U(Exception exc) {
        exc.getClass();
        ThrowablesKt.trimStackTraceTail(exc, u75.h(Handler.class, Looper.class, HandlerThread.class));
        return new Regex("[\\n\\t ]").replace(fob.b(exc), "");
    }

    public static String V(String str, String... strArr) {
        if (strArr.length == 0) {
            Assertions.fail("columns must be set");
        }
        StringBuilder u = ouj.u("CREATE UNIQUE INDEX IF NOT EXISTS ind_uniq_", str, "__");
        su4.v(u, xz0.H(strArr, "_", null), " ON ", str, "(");
        return su4.o(u, xz0.H(strArr, ", ", null), ")");
    }

    public static ActionMode.Callback W(ActionMode.Callback callback) {
        return (!(callback instanceof nes) || Build.VERSION.SDK_INT < 26) ? callback : ((nes) callback).a;
    }

    public static void X(rsr rsrVar, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        HashMap hashMap = new HashMap();
        Cursor query = rsrVar.query(ouj.q(f1d.m("SELECT _id, ", str2, " FROM ", str, " WHERE "), str2, " is not null AND ", str2, " <> ''"));
        int columnIndex = query.getColumnIndex("_id");
        int columnIndex2 = query.getColumnIndex(str2);
        while (query.moveToNext()) {
            String string = query.getString(columnIndex);
            String string2 = query.getString(columnIndex2);
            if (string2 != null && !string2.isEmpty()) {
                String Q = q7g.Q(Arrays.asList((String[]) ff7.D(string2).toArray(new String[0])));
                if (!Q.equals(string2)) {
                    hashMap.put(string, Q);
                }
            }
        }
        query.close();
        for (Map.Entry entry : hashMap.entrySet()) {
            contentValues.put(str2, (String) entry.getValue());
            rsrVar.update(str, 5, contentValues, "_id=?", new String[]{(String) entry.getKey()});
        }
    }

    public static void Y(rsr rsrVar, String str) {
        rsr rsrVar2;
        ContentValues contentValues = new ContentValues();
        int i = 0;
        while (true) {
            HashMap hashMap = new HashMap();
            Cursor query = rsrVar.query("Select name, name_surrogate from " + str + " limit 1000 offset " + i);
            int columnIndex = query.getColumnIndex("name");
            int columnIndex2 = query.getColumnIndex("name_surrogate");
            int count = query.getCount();
            i += count;
            while (query.moveToNext()) {
                String string = query.getString(columnIndex);
                if (string != null && !string.isEmpty()) {
                    String R = q7g.R(string);
                    if (!R.equals(query.getString(columnIndex2))) {
                        hashMap.put(string, R);
                    }
                }
            }
            query.close();
            rsrVar.beginTransaction();
            try {
                for (Map.Entry entry : hashMap.entrySet()) {
                    contentValues.put("name_surrogate", (String) entry.getValue());
                    String str2 = "name=?";
                    String[] strArr = {(String) entry.getKey()};
                    rsrVar2 = rsrVar;
                    String str3 = str;
                    try {
                        rsrVar2.update(str3, 5, contentValues, str2, strArr);
                        rsrVar = rsrVar2;
                        str = str3;
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        rsrVar2.endTransaction();
                        throw th2;
                    }
                }
                rsr rsrVar3 = rsrVar;
                String str4 = str;
                rsrVar3.setTransactionSuccessful();
                rsrVar3.endTransaction();
                if (count < 1000) {
                    return;
                }
                rsrVar = rsrVar3;
                str = str4;
            } catch (Throwable th3) {
                th = th3;
                rsrVar2 = rsrVar;
            }
        }
    }

    public static ActionMode.Callback Z(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof nes) || callback == null) ? callback : new nes(callback, textView);
    }

    public static final void c(boolean z, hq5 hq5Var, int i) {
        xmn r;
        k4m k4mVar;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(498907315);
        if ((i & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object j = oq5Var.j(AndroidCompositionLocals_androidKt.b);
            Activity activity = j instanceof Activity ? (Activity) j : null;
            if (activity == null) {
                r = oq5Var.r();
                if (r != null) {
                    k4mVar = new k4m(i, 7, z);
                    r.d = k4mVar;
                }
                return;
            }
            Window window = activity.getWindow();
            boolean z2 = z && !H(activity);
            Boolean bool = Boolean.TRUE;
            Boolean valueOf = Boolean.valueOf(z2);
            boolean h = oq5Var.h(window) | oq5Var.g(z2);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new bw5(window, z2, 2);
                oq5Var.k0(K);
            }
            gld.i(window, bool, valueOf, (Function1) K, oq5Var);
        }
        r = oq5Var.r();
        if (r != null) {
            k4mVar = new k4m(i, 8, z);
            r.d = k4mVar;
        }
    }

    public static final void d(ati atiVar, wdj wdjVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(743504394);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(atiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(wdjVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            o5g.d(atiVar.a, wdjVar, yciVar, oq5Var, i2 & 1008);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yja(atiVar, wdjVar, yciVar, i, 22);
        }
    }

    public static final void e(eti etiVar, int i, t1f t1fVar, o70 o70Var, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        wdj wdjVar;
        boolean z;
        hui huiVar;
        boolean z2;
        jui juiVar;
        esi esiVar;
        boolean z3;
        svi sviVar;
        int i4 = i;
        o70 o70Var2 = o70Var;
        l18 l18Var = l18.b;
        Object obj = gq5.a;
        etiVar.getClass();
        t1fVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(797531444);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(etiVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.d(i4) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(t1fVar) : oq5Var.h(t1fVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.d(o70Var2.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i5 = i3;
        if (!oq5Var.P(i5 & 1, (i5 & 9363) != 9362)) {
            oq5Var.S();
        } else if (etiVar instanceof dti) {
            oq5Var.Z(-499582786);
            dti dtiVar = (dti) etiVar;
            int i6 = i5 >> 6;
            oq5Var.Z(-66096013);
            if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                sviVar = new krm();
                oq5Var.p(false);
            } else {
                Object K = oq5Var.K();
                if (K == obj) {
                    K = new tvi((pui) t1fVar.b);
                    oq5Var.k0(K);
                }
                sviVar = (svi) K;
                oq5Var.p(false);
            }
            h(dtiVar, sviVar, yciVar, oq5Var, (i6 & 896) | (i5 & 14));
            oq5Var.p(false);
        } else if (etiVar instanceof zsi) {
            oq5Var.Z(-499430297);
            zsi zsiVar = (zsi) etiVar;
            oq oqVar = zsiVar.b;
            raj rajVar = zsiVar.a;
            int i7 = i5 >> 6;
            oq5Var.Z(-576484242);
            if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                esiVar = new hrm();
                oq5Var.p(false);
                z3 = false;
            } else {
                Object K2 = oq5Var.K();
                if (K2 == obj) {
                    K2 = gld.R(g.a, oq5Var);
                    oq5Var.k0(K2);
                }
                mm6 mm6Var = (mm6) K2;
                boolean f = oq5Var.f(oqVar) | oq5Var.f(zsiVar.c);
                Object K3 = oq5Var.K();
                if (f || K3 == obj) {
                    mm6Var.getClass();
                    bdt I = hag.I(haj.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    K3 = new hsi(oqVar, mm6Var, ((haj) qdcVar.C(I)).a(mm6Var, (kxi) t1fVar.c), new x0(t1fVar, i4, o70Var2, 21));
                    oq5Var.k0(K3);
                }
                esiVar = (esi) K3;
                z3 = false;
                oq5Var.p(false);
            }
            v7g.b(rajVar, esiVar, yciVar, oq5Var, i7 & 896);
            oq5Var.p(z3);
        } else if (etiVar instanceof cti) {
            oq5Var.Z(-499253039);
            cti ctiVar = (cti) etiVar;
            oq oqVar2 = ctiVar.b;
            oq5Var.Z(-858799987);
            if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                juiVar = new jrm();
                oq5Var.p(false);
                z2 = false;
            } else {
                Object K4 = oq5Var.K();
                if (K4 == obj) {
                    K4 = gld.R(g.a, oq5Var);
                    oq5Var.k0(K4);
                }
                mm6 mm6Var2 = (mm6) K4;
                Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
                mqs mqsVar = ctiVar.c;
                boolean f2 = oq5Var.f(oqVar2) | oq5Var.f(mqsVar) | oq5Var.f(context);
                Object K5 = oq5Var.K();
                if (f2 || K5 == obj) {
                    mqsVar.getClass();
                    mm6Var2.getClass();
                    context.getClass();
                    bdt I2 = hag.I(haj.class);
                    qdc qdcVar2 = l18Var.a;
                    qdcVar2.getClass();
                    z2 = false;
                    Object kuiVar = new kui(oqVar2, mqsVar, i4, o70Var2, mm6Var2, context, ((haj) qdcVar2.C(I2)).a(mm6Var2, (kxi) t1fVar.c), (pui) t1fVar.b, (pgf) t1fVar.d);
                    oq5Var.k0(kuiVar);
                    K5 = kuiVar;
                } else {
                    z2 = false;
                }
                juiVar = (jui) K5;
                oq5Var.p(z2);
            }
            g(juiVar, yciVar, oq5Var, (i5 >> 9) & 112);
            oq5Var.p(z2);
            i4 = i;
            o70Var2 = o70Var;
        } else if (etiVar instanceof bti) {
            oq5Var.Z(-499084337);
            bti btiVar = (bti) etiVar;
            rrl rrlVar = btiVar.b;
            oq5Var.Z(1481488069);
            if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                huiVar = new irm();
                oq5Var.p(false);
                i4 = i;
                o70Var2 = o70Var;
            } else {
                Object K6 = oq5Var.K();
                if (K6 == obj) {
                    K6 = gld.R(g.a, oq5Var);
                    oq5Var.k0(K6);
                }
                mm6 mm6Var3 = (mm6) K6;
                Context context2 = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
                mqs mqsVar2 = btiVar.c;
                boolean f3 = oq5Var.f(rrlVar) | oq5Var.f(mqsVar2) | oq5Var.f(context2);
                Object K7 = oq5Var.K();
                if (f3 || K7 == obj) {
                    mm6Var3.getClass();
                    context2.getClass();
                    bdt I3 = hag.I(haj.class);
                    qdc qdcVar3 = l18Var.a;
                    qdcVar3.getClass();
                    zri a = ((haj) qdcVar3.C(I3)).a(mm6Var3, (kxi) t1fVar.c);
                    i4 = i;
                    o70Var2 = o70Var;
                    Object iuiVar = new iui(rrlVar.a, mqsVar2, i4, o70Var2, mm6Var3, context2, a, (pui) t1fVar.b, (pgf) t1fVar.d);
                    oq5Var.k0(iuiVar);
                    K7 = iuiVar;
                } else {
                    i4 = i;
                    o70Var2 = o70Var;
                }
                huiVar = (hui) K7;
                oq5Var.p(false);
            }
            f(huiVar, yciVar, oq5Var, (i5 >> 9) & 112);
            oq5Var.p(false);
        } else {
            i4 = i;
            o70Var2 = o70Var;
            if (!(etiVar instanceof ati)) {
                throw vz1.i(oq5Var, 1923545824, false);
            }
            oq5Var.Z(-498914488);
            ati atiVar = (ati) etiVar;
            mqs mqsVar3 = atiVar.b;
            int i8 = i5 >> 6;
            int i9 = i5 << 3;
            int i10 = (i9 & 896) | (i8 & 14) | 24576 | (i9 & 112) | (i5 & 7168);
            oq5Var.Z(1520317465);
            if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
                wdjVar = mrm.a;
                oq5Var.p(false);
                z = false;
            } else {
                Object K8 = oq5Var.K();
                if (K8 == obj) {
                    K8 = gld.R(g.a, oq5Var);
                    oq5Var.k0(K8);
                }
                mm6 mm6Var4 = (mm6) K8;
                Context context3 = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
                boolean f4 = oq5Var.f(mqsVar3) | ((((i10 & 896) ^ 384) > 256 && oq5Var.d(i4)) || (i10 & 384) == 256) | oq5Var.f(context3);
                Object K9 = oq5Var.K();
                if (f4 || K9 == obj) {
                    mm6Var4.getClass();
                    context3.getClass();
                    bdt I4 = hag.I(fdj.class);
                    qdc qdcVar4 = l18Var.a;
                    qdcVar4.getClass();
                    K9 = new ydj((fdj) qdcVar4.C(I4), mqsVar3, false, mm6Var4, context3, new rti(t1fVar, i4, o70Var2), null);
                    oq5Var.k0(K9);
                }
                wdjVar = (wdj) K9;
                z = false;
                oq5Var.p(false);
            }
            d(atiVar, wdjVar, yciVar, oq5Var, (i5 & 14) | (i8 & 896));
            oq5Var.p(z);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hq(etiVar, i4, t1fVar, o70Var2, yciVar, i2, 17);
        }
    }

    public static final void f(hui huiVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        kjn kjnVar;
        int i3;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(567442882);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? oq5Var2.f(huiVar) : oq5Var2.h(huiVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        int i4 = i2;
        if (oq5Var2.P(i4 & 1, (i4 & 19) != 18)) {
            aqi Q = szf.Q(huiVar.f(), oq5Var2);
            aqi Q2 = szf.Q(huiVar.l(), oq5Var2);
            aqi Q3 = szf.Q(huiVar.c(), oq5Var2);
            aqi Q4 = szf.Q(huiVar.h(), oq5Var2);
            aqi Q5 = szf.Q(huiVar.g(), oq5Var2);
            raj rajVar = (raj) Q.getValue();
            if (!huiVar.k()) {
                rajVar = raj.a((raj) Q.getValue());
            }
            raj rajVar2 = rajVar;
            rba rbaVar = (rba) Q2.getValue();
            lzs lzsVar = (lzs) Q3.getValue();
            frs frsVar = (frs) Q4.getValue();
            cdj cdjVar = (cdj) Q5.getValue();
            boolean j = huiVar.j();
            int i5 = i4 & 14;
            boolean z = i5 == 4 || ((i4 & 8) != 0 && oq5Var2.h(huiVar));
            Object K = oq5Var2.K();
            kjn kjnVar2 = gq5.a;
            if (z || K == kjnVar2) {
                kjnVar = kjnVar2;
                i3 = i5;
                k5h k5hVar = new k5h(0, huiVar, hui.class, "onClick", "onClick()V", 0, 22);
                oq5Var2.k0(k5hVar);
                K = k5hVar;
            } else {
                i3 = i5;
                kjnVar = kjnVar2;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean z2 = i3 == 4 || ((i4 & 8) != 0 && oq5Var2.h(huiVar));
            Object K2 = oq5Var2.K();
            if (z2 || K2 == kjnVar) {
                k5h k5hVar2 = new k5h(0, huiVar, hui.class, "onLongClick", "onLongClick()V", 0, 23);
                oq5Var2.k0(k5hVar2);
                K2 = k5hVar2;
            }
            Function0 function02 = (Function0) ((h9f) K2);
            boolean z3 = i3 == 4 || ((i4 & 8) != 0 && oq5Var2.h(huiVar));
            Object K3 = oq5Var2.K();
            if (z3 || K3 == kjnVar) {
                K3 = new k5h(0, huiVar, hui.class, "onOverflowClick", "onOverflowClick()V", 0, 24);
                oq5Var2.k0(K3);
            }
            oq5Var = oq5Var2;
            o5g.e(rajVar2, rbaVar, lzsVar, frsVar, cdjVar, j, function0, function02, (Function0) ((h9f) K3), yciVar, null, null, 0L, 0L, null, null, oq5Var, (i4 << 24) & 1879048192, 0, 64512);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gva(huiVar, yciVar, i, 17);
        }
    }

    public static final void g(jui juiVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var;
        kjn kjnVar;
        int i3;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-832572244);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? oq5Var2.f(juiVar) : oq5Var2.h(juiVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        int i4 = i2;
        if (oq5Var2.P(i4 & 1, (i4 & 19) != 18)) {
            aqi Q = szf.Q(juiVar.f(), oq5Var2);
            aqi Q2 = szf.Q(juiVar.l(), oq5Var2);
            aqi Q3 = szf.Q(juiVar.c(), oq5Var2);
            aqi Q4 = szf.Q(juiVar.h(), oq5Var2);
            aqi Q5 = szf.Q(juiVar.g(), oq5Var2);
            raj rajVar = (raj) Q.getValue();
            if (!juiVar.k()) {
                rajVar = raj.a((raj) Q.getValue());
            }
            raj rajVar2 = rajVar;
            rba rbaVar = (rba) Q2.getValue();
            lzs lzsVar = (lzs) Q3.getValue();
            frs frsVar = (frs) Q4.getValue();
            cdj cdjVar = (cdj) Q5.getValue();
            boolean j = juiVar.j();
            int i5 = i4 & 14;
            boolean z = i5 == 4 || ((i4 & 8) != 0 && oq5Var2.h(juiVar));
            Object K = oq5Var2.K();
            kjn kjnVar2 = gq5.a;
            if (z || K == kjnVar2) {
                kjnVar = kjnVar2;
                i3 = i5;
                k5h k5hVar = new k5h(0, juiVar, jui.class, "onClick", "onClick()V", 0, 25);
                oq5Var2.k0(k5hVar);
                K = k5hVar;
            } else {
                i3 = i5;
                kjnVar = kjnVar2;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean z2 = i3 == 4 || ((i4 & 8) != 0 && oq5Var2.h(juiVar));
            Object K2 = oq5Var2.K();
            if (z2 || K2 == kjnVar) {
                k5h k5hVar2 = new k5h(0, juiVar, jui.class, "onLongClick", "onLongClick()V", 0, 26);
                oq5Var2.k0(k5hVar2);
                K2 = k5hVar2;
            }
            Function0 function02 = (Function0) ((h9f) K2);
            boolean z3 = i3 == 4 || ((i4 & 8) != 0 && oq5Var2.h(juiVar));
            Object K3 = oq5Var2.K();
            if (z3 || K3 == kjnVar) {
                K3 = new k5h(0, juiVar, jui.class, "onOverflowClick", "onOverflowClick()V", 0, 27);
                oq5Var2.k0(K3);
            }
            oq5Var = oq5Var2;
            o5g.e(rajVar2, rbaVar, lzsVar, frsVar, cdjVar, j, function0, function02, (Function0) ((h9f) K3), yciVar, null, null, 0L, 0L, null, null, oq5Var, (i4 << 24) & 1879048192, 0, 64512);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gva(juiVar, yciVar, i, 18);
        }
    }

    public static final void h(dti dtiVar, svi sviVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1060207721);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(dtiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? oq5Var.f(sviVar) : oq5Var.h(sviVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            e9g e9gVar = e9g.b;
            kbj kbjVar = dtiVar.a;
            yci o = a.o(yciVar, 0.0f, 4, 1);
            boolean z = ((i2 & 112) == 32 || ((i2 & 64) != 0 && oq5Var.h(sviVar))) | ((i2 & 14) == 4);
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new y6g(14, sviVar, dtiVar);
                oq5Var.k0(K);
            }
            p6g.d(kbjVar, (Function0) K, o, 0L, null, null, false, null, e9gVar, oq5Var, 100663296, 248);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yja(dtiVar, sviVar, yciVar, i, 21);
        }
    }

    public static final void i(g0t g0tVar, boolean z, cdj cdjVar, boolean z2, hq5 hq5Var, int i) {
        long j;
        String str;
        boolean z3;
        cdjVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(135697260);
        int i2 = i | (oq5Var.f(g0tVar) ? 4 : 2) | (oq5Var.g(z) ? 32 : 16) | (oq5Var.f(cdjVar) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            if (z) {
                oq5Var.Z(1556055125);
                j = ((dq0) oq5Var.j(eq0.a)).b.b;
            } else {
                oq5Var.Z(1556056244);
                j = ((dq0) oq5Var.j(eq0.a)).b.c;
            }
            oq5Var.p(false);
            vci vciVar = vci.a;
            yci c = b.c(androidx.compose.ui.platform.a.a(vciVar, "non_music_progress"), "progress_state", f8g.n(cdjVar));
            nho a = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (cdjVar.equals(adj.a)) {
                oq5Var.Z(218080607);
                str = rvf.M(R.string.podcast_episode_state_playing, oq5Var);
                if (z2) {
                    oq5Var.Z(218208947);
                    orl.a(54, 4, 0L, oq5Var, a.m(d.m(vciVar, 16), 2), true);
                    oq5Var = oq5Var;
                    z3 = false;
                    vz1.B(vciVar, 6, oq5Var, false);
                } else {
                    z3 = false;
                    oq5Var.Z(211866130);
                    oq5Var.p(false);
                }
                oq5Var.p(z3);
            } else if (cdjVar.equals(ycj.a)) {
                oq5Var.Z(218551776);
                str = rvf.M(R.string.podcast_episode_state_completed, oq5Var);
                o(g0tVar, z, cdjVar, null, oq5Var, i2 & 1022);
                ixf.i(b3i.k, null, 0L, oq5Var, 0);
                vz1.B(vciVar, 4, oq5Var, false);
            } else if (cdjVar instanceof zcj) {
                oq5Var.Z(218898604);
                str = ((zcj) cdjVar).a;
                o(g0tVar, z, cdjVar, null, oq5Var, i2 & 1022);
                oq5Var.p(false);
            } else {
                if (!(cdjVar instanceof bdj)) {
                    throw vz1.i(oq5Var, 838317707, false);
                }
                oq5Var.Z(219081752);
                bdj bdjVar = (bdj) cdjVar;
                str = bdjVar.a;
                o(g0tVar, z, cdjVar, null, oq5Var, i2 & 1022);
                ixf.i(new a0t(bdjVar.c), null, 0L, oq5Var, 0);
                vz1.B(vciVar, 4, oq5Var, false);
            }
            oq5 oq5Var2 = oq5Var;
            xcs.b(str, androidx.compose.ui.platform.a.a(vciVar, "non_music_subtitle_text"), j, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.i(), oq5Var2, 48, 3120, 55288);
            oq5Var = oq5Var2;
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hdj(g0tVar, z, cdjVar, z2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(final dej dejVar, final rba rbaVar, final lzs lzsVar, final frs frsVar, final cdj cdjVar, final boolean z, final Function0 function0, final Function0 function02, final Function0 function03, yci yciVar, hq5 hq5Var, final int i, final int i2) {
        int i3;
        yci yciVar2;
        oq5 oq5Var;
        final yci yciVar3;
        xmn r;
        rbaVar.getClass();
        lzsVar.getClass();
        frsVar.getClass();
        cdjVar.getClass();
        function0.getClass();
        function03.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-2146801135);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? oq5Var2.f(dejVar) : oq5Var2.h(dejVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.d(rbaVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var2.d(lzsVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var2.d(frsVar.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? oq5Var2.f(cdjVar) : oq5Var2.h(cdjVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i) == 0) {
            i3 |= oq5Var2.g(z) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i) == 0) {
            i3 |= oq5Var2.h(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= oq5Var2.h(function02) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if ((100663296 & i) == 0) {
            i3 |= oq5Var2.h(function03) ? 67108864 : 33554432;
        }
        int i4 = i2 & RemoteCameraConfig.Mic.BUFFER_SIZE;
        if (i4 != 0) {
            i3 |= 805306368;
        } else if ((805306368 & i) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var2.f(yciVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
            if (oq5Var2.P(i3 & 1, (306783379 & i3) == 306783378)) {
                oq5Var = oq5Var2;
                oq5Var.S();
                yciVar3 = yciVar2;
            } else {
                yciVar3 = i4 != 0 ? vci.a : yciVar2;
                boolean a = frsVar.a();
                int i5 = (i3 & 112) | 905969664 | (i3 & 896) | ((i3 >> 6) & 7168);
                int i6 = i3 >> 3;
                oq5Var = oq5Var2;
                qgg.l(frsVar.b(), rbaVar, lzsVar, z, a, function0, function02, function03, vq1.f, ild.C(1005069610, new oc1(dejVar, a, cdjVar, 13), oq5Var2), d.g(yciVar3, 60, 0.0f, 2), null, null, null, null, null, 0L, 0L, null, null, false, oq5Var, i5 | (458752 & i6) | (3670016 & i6) | (i6 & 29360128), 0, 0, 2095104);
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new Function2() { // from class: idj
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        asq.j(dej.this, rbaVar, lzsVar, frsVar, cdjVar, z, function0, function02, function03, yciVar3, (hq5) obj, rvf.R(i | 1), i2);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        if (oq5Var2.P(i3 & 1, (306783379 & i3) == 306783378)) {
        }
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static final void k(dej dejVar, wdj wdjVar, yci yciVar, hq5 hq5Var, int i) {
        dej dejVar2;
        int i2;
        kjn kjnVar;
        wdjVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1590249457);
        int i3 = i | (oq5Var.f(dejVar) ? 4 : 2) | (oq5Var.h(wdjVar) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            aqi Q = szf.Q(wdjVar.l(), oq5Var);
            aqi Q2 = szf.Q(wdjVar.c(), oq5Var);
            aqi Q3 = szf.Q(wdjVar.h(), oq5Var);
            aqi Q4 = szf.Q(wdjVar.g(), oq5Var);
            if (wdjVar.k()) {
                dejVar2 = dejVar;
            } else {
                String str = dejVar.a;
                boolean z = dejVar.b;
                boolean z2 = dejVar.c;
                jzb jzbVar = dejVar.d;
                g0t g0tVar = dejVar.f;
                boolean z3 = dejVar.g;
                str.getClass();
                dejVar2 = new dej(str, z, z2, jzbVar, false, g0tVar, z3);
            }
            rba rbaVar = (rba) Q.getValue();
            lzs lzsVar = (lzs) Q2.getValue();
            frs frsVar = (frs) Q3.getValue();
            cdj cdjVar = (cdj) Q4.getValue();
            boolean j = wdjVar.j();
            boolean h = oq5Var.h(wdjVar);
            Object K = oq5Var.K();
            kjn kjnVar2 = gq5.a;
            if (h || K == kjnVar2) {
                i2 = i3;
                kjnVar = kjnVar2;
                m9j m9jVar = new m9j(0, wdjVar, wdj.class, "onClick", "onClick()V", 0, 10);
                oq5Var.k0(m9jVar);
                K = m9jVar;
            } else {
                i2 = i3;
                kjnVar = kjnVar2;
            }
            Function0 function0 = (Function0) ((h9f) K);
            boolean h2 = oq5Var.h(wdjVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                m9j m9jVar2 = new m9j(0, wdjVar, wdj.class, "onLongClick", "onLongClick()V", 0, 11);
                oq5Var.k0(m9jVar2);
                K2 = m9jVar2;
            }
            Function0 function02 = (Function0) ((h9f) K2);
            boolean h3 = oq5Var.h(wdjVar);
            Object K3 = oq5Var.K();
            if (h3 || K3 == kjnVar) {
                m9j m9jVar3 = new m9j(0, wdjVar, wdj.class, "onOverflowClick", "onOverflowClick()V", 0, 12);
                oq5Var.k0(m9jVar3);
                K3 = m9jVar3;
            }
            j(dejVar2, rbaVar, lzsVar, frsVar, cdjVar, j, function0, function02, (Function0) ((h9f) K3), yciVar, oq5Var, (i2 << 21) & 1879048192, 0);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q6h(dejVar, wdjVar, yciVar, i, 12);
        }
    }

    public static final void l(final int i, final long j, final long j2, hq5 hq5Var, final yci yciVar) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-558581010);
        if (((i | (oq5Var2.e(j) ? 4 : 2) | (oq5Var2.e(j2) ? 32 : 16)) & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            nho a = lho.a(qx0.g, b2c.k, oq5Var2, 6);
            int i2 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var2, i2, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            String N = rvf.N(R.string.player_progress_description, new Object[]{xee.N(j, oq5Var2)}, oq5Var2);
            vci vciVar = vci.a;
            yci c = b.c(androidx.compose.ui.platform.a.a(ksw.D(vciVar, N, null), "progress_time_text"), "progress", Long.valueOf(j));
            String K = lxe.K(j);
            ges i3 = nu0.i();
            agr agrVar = eq0.a;
            xcs.b(K, c, ((dq0) oq5Var2.j(agrVar)).a.c, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, i3, oq5Var2, 0, 0, 65528);
            xcs.b(lxe.K(j2), b.c(androidx.compose.ui.platform.a.a(ksw.D(vciVar, rvf.N(R.string.player_duration_description, new Object[]{xee.N(j2, oq5Var2)}, oq5Var2), null), "duration_time_text"), "duration", Long.valueOf(j2)), ((dq0) oq5Var2.j(agrVar)).a.c, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var2, 0, 0, 65528);
            oq5Var = oq5Var2;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2(j, j2, yciVar, i) { // from class: yum
                public final /* synthetic */ long a;
                public final /* synthetic */ long b;
                public final /* synthetic */ yci c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    asq.l(rvf.R(385), this.a, this.b, (hq5) obj, this.c);
                    return Unit.a;
                }
            };
        }
    }

    public static final void m(int i, hq5 hq5Var, yci yciVar, Function0 function0, Function0 function02) {
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1945918247);
        int i2 = (oq5Var.h(function0) ? 4 : 2) | i | (oq5Var.h(function02) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = szf.U(new g1j(9, function02));
                oq5Var.k0(K);
            }
            if (((Boolean) ((sdr) K).getValue()).booleanValue()) {
                oq5Var.Z(-1676649365);
                pd.b(new qzm[0], true, ild.C(1101206891, new i9m(yciVar, function02, function0), oq5Var), oq5Var, 432, 0);
            } else {
                oq5Var.Z(-1678164087);
            }
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i9m(function0, function02, yciVar, i);
        }
    }

    public static final void n(wxk wxkVar, u7l u7lVar, Function2 function2, yci yciVar, hq5 hq5Var, int i) {
        aqi aqiVar;
        aqi aqiVar2;
        aqi aqiVar3;
        boolean z;
        boolean z2;
        wxk wxkVar2;
        sdr o0;
        float floatValue;
        aqi aqiVar4;
        Function2 function22;
        u7l u7lVar2;
        long floatValue2;
        yci yciVar2;
        wxkVar.getClass();
        u7lVar.getClass();
        float f = u7lVar.c;
        function2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1181942285);
        int i2 = i | (oq5Var.h(wxkVar) ? 4 : 2) | (oq5Var.h(u7lVar) ? 32 : 16) | (oq5Var.h(function2) ? 256 : 128) | 3072;
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
            wxkVar2 = wxkVar;
            function22 = function2;
        } else {
            float a = g6h.a(oq5Var);
            boolean c = oq5Var.c(a);
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (c || K == obj) {
                K = new zum(a);
                oq5Var.k0(K);
            }
            kfh kfhVar = (kfh) K;
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var, vciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, kfhVar, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            boolean f2 = oq5Var.f(wxkVar);
            Object K2 = oq5Var.K();
            if (f2 || K2 == obj) {
                K2 = szf.g0(Float.valueOf(f));
                oq5Var.k0(K2);
            }
            aqi aqiVar5 = (aqi) K2;
            boolean f3 = oq5Var.f(wxkVar);
            Object K3 = oq5Var.K();
            if (f3 || K3 == obj) {
                K3 = szf.g0(Boolean.TRUE);
                oq5Var.k0(K3);
            }
            aqi aqiVar6 = (aqi) K3;
            Object K4 = oq5Var.K();
            if (K4 == obj) {
                K4 = szf.g0(Boolean.FALSE);
                oq5Var.k0(K4);
            }
            aqi aqiVar7 = (aqi) K4;
            boolean z3 = u7lVar.g;
            boolean z4 = u7lVar.h;
            long j = u7lVar.d;
            if (z3) {
                oq5Var.Z(-1319310968);
                aqiVar2 = aqiVar5;
                z = z4;
                aqiVar = aqiVar7;
                aqiVar3 = aqiVar6;
                z2 = false;
                o0 = gut.T0(u7lVar.c, u7lVar.d, u7lVar.f, u7lVar.a, wxkVar, oq5Var, (i2 << 12) & 57344, 224);
                wxkVar2 = wxkVar;
                oq5Var.p(false);
            } else {
                aqiVar = aqiVar7;
                aqiVar2 = aqiVar5;
                aqiVar3 = aqiVar6;
                z = z4;
                z2 = false;
                wxkVar2 = wxkVar;
                oq5Var.Z(-1318952174);
                o0 = szf.o0(Float.valueOf(f), oq5Var);
                oq5Var.p(false);
            }
            if (z) {
                oq5Var.Z(-1318770793);
                boolean f4 = oq5Var.f(wxkVar2);
                Object K5 = oq5Var.K();
                if (f4 || K5 == obj) {
                    K5 = new bw6();
                    oq5Var.k0(K5);
                }
                bw6 bw6Var = (bw6) K5;
                boolean booleanValue = ((Boolean) aqiVar.getValue()).booleanValue();
                float floatValue3 = ((Number) aqiVar2.getValue()).floatValue();
                float floatValue4 = ((Number) o0.getValue()).floatValue();
                if (booleanValue) {
                    bw6Var.a.setValue(Boolean.FALSE);
                } else {
                    if (!((Boolean) bw6Var.a.getValue()).booleanValue()) {
                        if (j != 0 && floatValue3 <= floatValue4 && floatValue4 <= (500 / j) + floatValue3) {
                            bw6Var.a.setValue(Boolean.TRUE);
                        }
                    }
                    floatValue3 = floatValue4;
                }
                floatValue = yhn.c(floatValue3, 0.0f, 1.0f);
                oq5Var.p(z2);
            } else {
                oq5Var.Z(-1318302693);
                oq5Var.p(z2);
                if (((Boolean) aqiVar.getValue()).booleanValue()) {
                    aqiVar3.setValue(Boolean.FALSE);
                    floatValue = ((Number) aqiVar2.getValue()).floatValue();
                } else if (((Boolean) aqiVar3.getValue()).booleanValue()) {
                    floatValue = ((Number) o0.getValue()).floatValue();
                } else {
                    float floatValue5 = ((Number) aqiVar2.getValue()).floatValue();
                    float floatValue6 = (500.0f / j) + ((Number) aqiVar2.getValue()).floatValue();
                    float floatValue7 = ((Number) o0.getValue()).floatValue();
                    if (floatValue5 > floatValue7 || floatValue7 > floatValue6) {
                        floatValue = ((Number) aqiVar2.getValue()).floatValue();
                    } else {
                        aqiVar3.setValue(Boolean.TRUE);
                        floatValue = ((Number) o0.getValue()).floatValue();
                    }
                }
            }
            yci a2 = androidx.compose.ui.platform.a.a(d.d(androidx.compose.ui.layout.a.c(vciVar, "progress_layout"), 1.0f), "seek_bar");
            aqi aqiVar8 = aqiVar3;
            long j2 = d85.f;
            agr agrVar = eq0.a;
            lr7 s = gdg.s(j2, ((dq0) oq5Var.j(agrVar)).a.a, ((dq0) oq5Var.j(agrVar)).a.e, oq5Var, 6, 4046);
            rtq rtqVar = new rtq(2, g6h.a, 10, 1, 5, 10);
            aqi aqiVar9 = aqiVar2;
            boolean f5 = oq5Var.f(aqiVar9);
            Object K6 = oq5Var.K();
            if (f5 || K6 == obj) {
                aqiVar4 = aqiVar;
                K6 = new ui6(aqiVar4, aqiVar9, 3);
                oq5Var.k0(K6);
            } else {
                aqiVar4 = aqiVar;
            }
            Function1 function1 = (Function1) K6;
            boolean f6 = ((i2 & 896) == 256) | oq5Var.f(aqiVar9);
            Object K7 = oq5Var.K();
            if (f6 || K7 == obj) {
                function22 = function2;
                K7 = new p3e(18, function22, aqiVar9, aqiVar4);
                oq5Var.k0(K7);
            } else {
                function22 = function2;
            }
            aqi aqiVar10 = aqiVar4;
            float f7 = floatValue;
            kuq.b(f7, function1, a2, rtqVar, null, false, null, 0, (Function1) K7, s, oq5Var, 384, 752);
            if (z) {
                floatValue2 = (long) (j * f7);
                u7lVar2 = u7lVar;
            } else if (((Boolean) aqiVar10.getValue()).booleanValue() || !((Boolean) aqiVar8.getValue()).booleanValue()) {
                u7lVar2 = u7lVar;
                floatValue2 = (long) (((Number) aqiVar9.getValue()).floatValue() * j);
            } else {
                u7lVar2 = u7lVar;
                floatValue2 = u7lVar2.e;
            }
            yciVar2 = vciVar;
            oq5Var = oq5Var;
            l(384, (floatValue2 / 1000) * 1000, u7lVar2.d, oq5Var, androidx.compose.ui.layout.a.c(d.d(vciVar, 1.0f), "durations_layout"));
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gvl(i, 12, wxkVar2, u7lVar, function22, yciVar2);
        }
    }

    public static final void o(g0t g0tVar, boolean z, cdj cdjVar, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        long j;
        vci vciVar;
        long j2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(777053641);
        int i2 = i | (oq5Var.f(g0tVar) ? 4 : 2) | (oq5Var.g(z) ? 32 : 16) | (oq5Var.f(cdjVar) ? 256 : 128) | 3072;
        if (!oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            if (g0tVar == null) {
                xmn r = oq5Var.r();
                if (r != null) {
                    r.d = new oc1(g0tVar, z, cdjVar, i, 14);
                    return;
                }
                return;
            }
            if (!z) {
                oq5Var.Z(-575751567);
                j = ((dq0) oq5Var.j(eq0.a)).b.c;
                oq5Var.p(false);
            } else if (g0tVar.b) {
                oq5Var.Z(-575749329);
                j = ((dq0) oq5Var.j(eq0.a)).b.d;
                oq5Var.p(false);
            } else {
                oq5Var.Z(-575747950);
                j = ((dq0) oq5Var.j(eq0.a)).b.b;
                oq5Var.p(false);
            }
            long j3 = j;
            boolean d = Intrinsics.d(cdjVar, adj.a);
            vci vciVar2 = vci.a;
            if (d) {
                oq5Var.Z(-668236137);
                oq5Var.p(false);
                vciVar = vciVar2;
            } else if ((cdjVar instanceof bdj) || Intrinsics.d(cdjVar, ycj.a)) {
                vciVar = vciVar2;
                oq5Var.Z(-668129714);
                xcs.b(g0tVar.a, androidx.compose.ui.platform.a.a(a.q(vciVar, 0.0f, 0.0f, 8, 0.0f, 11), "track_release_date"), j3, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.i(), oq5Var, 0, 3120, 55288);
                oq5Var = oq5Var;
                oq5Var.p(false);
            } else {
                if (!(cdjVar instanceof zcj)) {
                    throw vz1.i(oq5Var, -575746079, false);
                }
                oq5Var.Z(-667705913);
                if (z) {
                    oq5Var.Z(-575726798);
                    j2 = ((dq0) oq5Var.j(eq0.a)).b.b;
                } else {
                    oq5Var.Z(-575725679);
                    j2 = ((dq0) oq5Var.j(eq0.a)).b.c;
                }
                oq5Var.p(false);
                kn0 kn0Var = new kn0();
                int g = kn0Var.g(new c4r(j3, 0L, (tqc) null, (oqc) null, (pqc) null, (qpc) null, (String) null, 0L, (wu2) null, (ccs) null, (bqg) null, 0L, (aas) null, (otp) null, 65534));
                try {
                    kn0Var.d(g0tVar.a);
                    kn0Var.f(g);
                    kn0Var.d(" • ");
                    vciVar = vciVar2;
                    xcs.c(kn0Var.h(), androidx.compose.ui.platform.a.a(vciVar2, "track_release_date"), j2, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, null, nu0.i(), oq5Var, 0, 3120, 120824);
                    oq5Var = oq5Var;
                    oq5Var.p(false);
                } catch (Throwable th) {
                    kn0Var.f(g);
                    throw th;
                }
            }
            yciVar2 = vciVar;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new s43(g0tVar, z, cdjVar, yciVar2, i, 15);
        }
    }

    public static final void p(final long j, final long j2, final long j3, final long j4, yci yciVar, hq5 hq5Var, final int i) {
        final yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1259748793);
        if (((i | (oq5Var.e(j) ? 4 : 2) | (oq5Var.e(j2) ? 32 : 16) | (oq5Var.e(j3) ? 256 : 128) | (oq5Var.e(j4) ? 2048 : 1024) | 24576) & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            tgo tgoVar = ugo.a;
            vci vciVar = vci.a;
            yci n = a.n(androidx.compose.foundation.a.b(vciVar, j3, tgoVar), 8, 4);
            kfh d = ug3.d(b2c.f, false);
            int i2 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, n);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            String o = ouj.o(lxe.K(j), " / ", lxe.K(j2));
            h6g h6gVar = nu0.a;
            h6g h6gVar2 = h6g.c;
            xcs.b(o, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ges.b(nu0.h(), j4, 0L, tqc.p, null, 0L, 0, 0L, null, null, 0, 0, 16777210), oq5Var, 0, 0, 65534);
            oq5Var.p(true);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2(j, j2, j3, j4, yciVar2, i) { // from class: kap
                public final /* synthetic */ long a;
                public final /* synthetic */ long b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ yci e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(1);
                    asq.p(this.a, this.b, this.c, this.d, this.e, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final void q(srs srsVar, bci bciVar, nrs nrsVar, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(242674007);
        int i2 = i | (oq5Var.f(srsVar) ? 4 : 2) | (oq5Var.h(bciVar) ? 32 : 16) | (oq5Var.h(nrsVar) ? 256 : 128);
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var = ((fs5) K).a;
            boolean z = srsVar instanceof rrs;
            boolean h = ((i2 & 14) == 4) | oq5Var.h(nrsVar) | oq5Var.h(mm6Var);
            Object K2 = oq5Var.K();
            if (h || K2 == kjnVar) {
                K2 = new zzq(6, srsVar, nrsVar, mm6Var);
                oq5Var.k0(K2);
            }
            vq1.g(yciVar, bciVar, z, (Function1) K2, oq5Var, 70 | (i2 & 112), 4);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new mqr(i, 2, srsVar, bciVar, nrsVar, yciVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0104, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r15.K(), java.lang.Integer.valueOf(r12)) == false) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [z9v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r(final b7v b7vVar, final float f, final float f2, final float f3, boolean z, final Function0 function0, z9v z9vVar, yci yciVar, final yci yciVar2, hq5 hq5Var, final int i) {
        final yci yciVar3;
        kb5 kb5Var;
        w4k w4kVar;
        boolean z2;
        z9v z9vVar2;
        boolean z3;
        z9v z9vVar3;
        oq5 oq5Var;
        final z9v z9vVar4;
        final boolean z4 = z;
        z9v z9vVar5 = z9vVar;
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-323692149);
        int i2 = i | (oq5Var2.f(b7vVar) ? 4 : 2) | (oq5Var2.c(f2) ? 256 : 128) | (oq5Var2.c(f3) ? 2048 : 1024) | (oq5Var2.g(z4) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.h(function0) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var2.h(z9vVar5) ? 1048576 : 524288) | 12582912 | (oq5Var2.f(yciVar2) ? 67108864 : 33554432);
        if ((38347923 & i2) == 38347922 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar3 = yciVar;
            z9vVar4 = z9vVar5;
            oq5Var = oq5Var2;
        } else {
            iz2 iz2Var = b2c.f;
            float f4 = 20;
            float f5 = (b7vVar.c - f4) / (1 + 1.2962962f);
            float f6 = (1.2962962f * f5) - 8;
            float f7 = 0;
            if (f6 >= f7) {
                f7 = f6;
            }
            q0k c = a.c(0.0f, f7, 0.0f, f5, 5);
            yciVar3 = vci.a;
            yci w = d.w(d.m(a.l(yciVar3, c), f), iz2Var, true);
            kfh d = ug3.d(iz2Var, false);
            int i3 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, w);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var2 = wp5.f;
            g0g.U(oq5Var2, d, kb5Var2);
            kb5 kb5Var3 = wp5.e;
            g0g.U(oq5Var2, l, kb5Var3);
            kb5 kb5Var4 = wp5.g;
            if (oq5Var2.O) {
                kb5Var = kb5Var3;
            } else {
                kb5Var = kb5Var3;
            }
            ouj.x(i3, oq5Var2, i3, kb5Var4);
            kb5 kb5Var5 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var5);
            w4k E = a0g.E(2131230963, 0, oq5Var2);
            yci w2 = d.w(yciVar3, iz2Var, true);
            int i4 = i2 & 458752;
            boolean z5 = i4 == 131072;
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (z5 || K == kjnVar) {
                w4kVar = E;
                K = new ex(23, function0);
                oq5Var2.k0(K);
            } else {
                w4kVar = E;
            }
            yci a = androidx.compose.ui.graphics.a.a(w2, (Function1) K);
            Object K2 = oq5Var2.K();
            int i5 = 14;
            if (K2 == kjnVar) {
                K2 = new t0v(i5);
                oq5Var2.k0(K2);
            }
            yci a2 = androidx.compose.ui.graphics.a.a(a, (Function1) K2);
            boolean z6 = (i2 & 14) == 4;
            Object K3 = oq5Var2.K();
            if (z6 || K3 == kjnVar) {
                K3 = new u7v(b7vVar, 0);
                oq5Var2.k0(K3);
            }
            yci j = a.j(d.e(d.r(androidx.compose.ui.draw.a.b(a2, (Function1) K3), f2), f3), 48, -f4);
            kb5 kb5Var6 = kb5Var;
            irf.r(w4kVar, null, j, null, null, 0.0f, null, oq5Var2, 48, 120);
            oq5 oq5Var3 = oq5Var2;
            if (b7vVar.d == x7v.a) {
                oq5Var3.Z(-1351185864);
                w4k E2 = a0g.E(R.drawable.alice, 0, oq5Var3);
                long j2 = d85.f;
                yci f8 = d.c(yciVar3, 1.0f).f(yciVar2);
                boolean z7 = i4 == 131072;
                Object K4 = oq5Var3.K();
                if (z7 || K4 == kjnVar) {
                    K4 = new gct(15, function0);
                    oq5Var3.k0(K4);
                }
                gae.b(E2, null, wyf.s(f8, (Function0) K4), j2, oq5Var3, 3120, 0);
                oq5Var3.p(false);
                z4 = z;
                z9vVar3 = z9vVar;
                z3 = true;
            } else {
                oq5Var3.Z(-1350780756);
                boolean z8 = i4 == 131072;
                Object K5 = oq5Var3.K();
                if (z8 || K5 == kjnVar) {
                    K5 = new gct(16, function0);
                    oq5Var3.k0(K5);
                }
                yci w3 = d.w(d.m(wyf.s(yciVar2, (Function0) K5), b7vVar.a), iz2Var, true);
                kfh d2 = ug3.d(iz2Var, false);
                int i6 = oq5Var3.P;
                androidx.compose.runtime.internal.a l2 = oq5Var3.l();
                yci H2 = vnj.H(oq5Var3, w3);
                oq5Var3.d0();
                if (oq5Var3.O) {
                    oq5Var3.k(grbVar);
                } else {
                    oq5Var3.n0();
                }
                g0g.U(oq5Var3, d2, kb5Var2);
                g0g.U(oq5Var3, l2, kb5Var6);
                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var3, i6, kb5Var4);
                }
                g0g.U(oq5Var3, H2, kb5Var5);
                if (b7vVar.f) {
                    oq5Var3.Z(777596472);
                    z4 = z;
                    z9v z9vVar6 = z9vVar;
                    pcg.p(new wl3(z4, z9vVar6), a.j(yciVar3, -4, 3), 0.0f, 0.0f, 0.0f, oq5Var3, 48);
                    oq5Var3.p(false);
                    z2 = false;
                    z9vVar2 = z9vVar6;
                } else {
                    z4 = z;
                    ?? r7 = z9vVar;
                    oq5Var3.Z(778189595);
                    gae.b(a0g.E(R.drawable.wave_words_sparkle_base, 0, oq5Var3), null, d.c(yciVar3, 1.0f), d85.f, oq5Var3, 3504, 0);
                    tt0.g(Integer.valueOf(((Boolean) r7.invoke(oq5Var3, Integer.valueOf((i2 >> 18) & 14))).booleanValue() ? R.drawable.wave_words_sparkle_mini_ai : R.drawable.wave_words_sparkle_mini_star), null, weo.S(200, 0, lya.a, 2), "icon_small_crossfade", quj.e, oq5Var3, 27648, 2);
                    z2 = false;
                    oq5Var3.p(false);
                    z9vVar2 = r7;
                }
                z3 = true;
                oq5Var3.p(true);
                oq5Var3.p(z2);
                z9vVar3 = z9vVar2;
            }
            oq5Var3.p(z3);
            z9vVar4 = z9vVar3;
            oq5Var = oq5Var3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2(f, f2, f3, z4, function0, z9vVar4, yciVar3, yciVar2, i) { // from class: v7v
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ z9v g;
                public final /* synthetic */ yci h;
                public final /* synthetic */ yci i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(49);
                    asq.r(b7v.this, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final void s(String str, yci yciVar, yci yciVar2, Function0 function0, Function0 function02, hq5 hq5Var, int i) {
        Function0 function03;
        Function0 function04;
        oq5 oq5Var;
        str.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1178610790);
        int i2 = (oq5Var2.f(str) ? 4 : 2) | i | (oq5Var2.f(yciVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(yciVar2) ? 256 : 128;
        }
        int i3 = i2 | 27648;
        if ((i3 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            function03 = function0;
            function04 = function02;
            oq5Var = oq5Var2;
        } else {
            Object K = oq5Var2.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = new h8v(23);
                oq5Var2.k0(K);
            }
            function03 = (Function0) K;
            Object K2 = oq5Var2.K();
            if (K2 == obj) {
                K2 = new h8v(24);
                oq5Var2.k0(K2);
            }
            function04 = (Function0) K2;
            oq5Var = oq5Var2;
            w1g.j(str, null, yciVar, null, null, b2c.f, hd6.a, 0.0f, null, 0, ild.C(244369286, new aqp(15, function04, function03, yciVar2), oq5Var2), oq5Var, (i3 & 14) | 1769520 | ((i3 << 3) & 896), 920);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x9v(str, yciVar, yciVar2, function03, function04, i);
        }
    }

    public static final void t(yk3 yk3Var, Context context, Function0 function0) {
        context.getClass();
        yk3Var.m(new h5n(1, function0), new oif(context));
    }

    public static void u(rsr rsrVar, String str, String str2, String str3, String str4) {
        StringBuilder m = f1d.m("UPDATE ", str, " SET ", str2, "='");
        su4.v(m, str4, "' WHERE ", str2, "='");
        m.append(str3);
        m.append("'");
        rsrVar.execSQL(m.toString());
    }

    public static final void v(int i, int i2) {
        if (i < 0 || i >= i2) {
            e7o.o(f1d.e(i, i2, "index: ", ", size: "));
        }
    }

    public static final void w(int i, int i2) {
        if (i < 0 || i > i2) {
            e7o.o(f1d.e(i, i2, "index: ", ", size: "));
        }
    }

    public static final void x(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            l1j.k(i3, dfi.l("fromIndex: ", i, i2, ", toIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            xq0.x(f1d.e(i, i2, "fromIndex: ", " > toIndex: "));
        }
    }

    public static f0q y(List list) {
        List list2 = list;
        int a = tah.a(v75.o(list2, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Object obj : list2) {
            linkedHashMap.put(ern.a(((e0q) obj).getClass()), obj);
        }
        return new f0q(linkedHashMap);
    }

    public static void z(rsr rsrVar) {
        rsrVar.execSQL(V("track", "original_id"));
        rsrVar.execSQL(G("track", "name"));
        rsrVar.execSQL(G("track", "name_surrogate"));
        rsrVar.execSQL(V("artist", "original_id"));
        rsrVar.execSQL(G("artist", "name_surrogate"));
        rsrVar.execSQL(V("album", "original_id"));
        rsrVar.execSQL(G("album", "name_surrogate"));
        rsrVar.execSQL(V("album_track", "album_id", "track_id"));
        rsrVar.execSQL(G("album_track", "track_id"));
        rsrVar.execSQL(G("album_track", "album_id"));
        rsrVar.execSQL(V("album_artist", "album_id", "artist_id"));
        rsrVar.execSQL(G("album_artist", "artist_id"));
        rsrVar.execSQL(V("artist_track", "artist_id", "track_id"));
        rsrVar.execSQL(G("artist_track", "track_id"));
        rsrVar.execSQL(V("playlist", "original_id", "uid"));
        rsrVar.execSQL(G("playlist_track", "playlist_id", "track_id", "album_id"));
        rsrVar.execSQL(G("playlist_track", "playlist_id"));
        rsrVar.execSQL(G("playlist_track", "timestamp"));
        rsrVar.execSQL(G("playlist_track", "track_id"));
        rsrVar.execSQL(G("playlist_track", "album_id"));
        rsrVar.execSQL(V("album_operation", "album_id"));
        rsrVar.execSQL(V("artist_operation", "artist_id"));
        rsrVar.execSQL(V("playlist_operation", "playlist_id"));
        rsrVar.execSQL(G("cache_info", "track_id"));
        rsrVar.execSQL(G("cache_info", "track_id", "storage"));
    }

    @Override // defpackage.esq
    public float a(ViewGroup viewGroup, View view) {
        return view.getTranslationY();
    }

    @Override // defpackage.esq
    public final float b(ViewGroup viewGroup, View view) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                if (viewGroup.getLayoutDirection() != 1) {
                    break;
                } else {
                    break;
                }
            case 2:
                break;
            default:
                if (viewGroup.getLayoutDirection() != 1) {
                    break;
                } else {
                    break;
                }
        }
        return view.getTranslationX() + viewGroup.getWidth();
    }
}
