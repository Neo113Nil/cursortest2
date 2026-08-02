package defpackage;

import android.util.Log;
import android.util.Patterns;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.Provider;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import kotlin.Pair;
import kotlin.coroutines.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes.dex */
public final class o6c implements p7q, f, w2q, bqj, m6b, e18, k8b, f4c, emj {
    public static Object b;
    public static Object c;
    public static Object d;
    public static JSONObject e;
    public static boolean f;
    public static final o6c g = new o6c(0);
    public static final o6c h = new o6c(1);
    public static final /* synthetic */ o6c i = new o6c(2);
    public static final o6c j = new o6c(3);
    public static final o6c k = new o6c(4);
    public static final /* synthetic */ o6c l = new o6c(5);
    public static final o6c m = new o6c(6);
    public static final /* synthetic */ o6c n = new o6c(7);
    public static final zdp o = new zdp(0);
    public static final zdp p = new zdp(1);
    public static final zdp q = new zdp(2);
    public static final zdp r = new zdp(3);
    public static final /* synthetic */ o6c s = new o6c(9);
    public static final o6c t = new o6c(10);
    public static final o6c u = new o6c(11);
    public static final o6c v = new o6c(12);
    public final /* synthetic */ int a;

    public /* synthetic */ o6c(int i2) {
        this.a = i2;
    }

    public static vjs B(int[] iArr, int[] iArr2, irg irgVar) {
        iArr.getClass();
        return new vjs(new nks(iArr, iArr2, irgVar.a));
    }

    public static String K(xku xkuVar, zjf zjfVar, String str) {
        int ordinal = xkuVar.ordinal();
        if (ordinal == 0) {
            zjfVar.getClass();
            jyr jyrVar = su6.e;
            if (vq1.T()) {
                String string = zjfVar.a.getString(R.string.landing_wave_settings_block_prefix_sets, str);
                string.getClass();
                return string;
            }
        } else if (ordinal != 1 && ordinal != 2) {
            b6e.s();
            return null;
        }
        return str;
    }

    public static vlf L(lwu lwuVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, zjf zjfVar) {
        lwuVar.getClass();
        zjfVar.getClass();
        if (z4) {
            return klf.a;
        }
        if (z2) {
            return new olf(new ulf(d(lwuVar)));
        }
        if (z5) {
            ulf ulfVar = new ulf(d(lwuVar));
            tlf tlfVar = plf.a;
            if (z) {
                String N = N(lwuVar, zjfVar);
                if (N != null && !StringsKt.U(N) && r(lwuVar)) {
                    tlfVar = new rlf(N, z3);
                } else if (N != null && !StringsKt.U(N)) {
                    tlfVar = new slf(N, z3);
                } else if (r(lwuVar)) {
                    tlfVar = new qlf(z3);
                }
            }
            return new mlf(ulfVar, tlfVar);
        }
        ulf ulfVar2 = new ulf(d(lwuVar));
        jlf jlfVar = hlf.a;
        if (z) {
            String N2 = N(lwuVar, zjfVar);
            if (N2 != null && !StringsKt.U(N2) && r(lwuVar)) {
                jlfVar = new flf(N2, z3);
            } else if (N2 != null && !StringsKt.U(N2)) {
                jlfVar = new glf(N2, z3);
            } else if (r(lwuVar)) {
                jlfVar = new ilf(z3);
            }
        }
        return new nlf(ulfVar2, jlfVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String N(lwu lwuVar, zjf zjfVar) {
        String str;
        hwu hwuVar = hwu.a;
        if (!Intrinsics.d(lwuVar, hwuVar)) {
            boolean z = lwuVar instanceof kwu;
            r9p r9pVar = r9p.a;
            if (z) {
                if (!Intrinsics.d(tyf.y(lwuVar), new s9p(t75.c(r9pVar)))) {
                    str = ((kwu) lwuVar).getName();
                    if (str == null) {
                        return null;
                    }
                    if (lwuVar instanceof kwu) {
                        return K(((kwu) lwuVar).a().b, zjfVar, str);
                    }
                    if (lwuVar instanceof zvu) {
                        return K(((zvu) lwuVar).a.b, zjfVar, str);
                    }
                    if (Intrinsics.d(lwuVar, hwuVar)) {
                        return str;
                    }
                    b6e.s();
                    return null;
                }
            } else {
                if (!(lwuVar instanceof zvu)) {
                    b6e.s();
                    return null;
                }
                if (!Intrinsics.d(tyf.y(lwuVar), new s9p(t75.c(r9pVar)))) {
                    str = ((zvu) lwuVar).c;
                    if (str == null) {
                    }
                }
            }
        }
        str = null;
        if (str == null) {
        }
    }

    public static llf d(lwu lwuVar) {
        if (Intrinsics.d(lwuVar, hwu.a)) {
            return new llf(false, false);
        }
        if (lwuVar instanceof zvu) {
            return new llf(true, ((zvu) lwuVar).b);
        }
        if (lwuVar instanceof ewu) {
            return new llf(false, true);
        }
        if (lwuVar instanceof cwu) {
            return new llf(false, false);
        }
        if (lwuVar instanceof dwu) {
            return new llf(false, false);
        }
        b6e.s();
        return null;
    }

    public static Album$AlbumType e(String str) {
        Album$AlbumType album$AlbumType;
        Album$AlbumType[] values = Album$AlbumType.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                album$AlbumType = null;
                break;
            }
            album$AlbumType = values[i2];
            if (Intrinsics.d(album$AlbumType.a, str)) {
                break;
            }
            i2++;
        }
        return album$AlbumType == null ? Album$AlbumType.COMMON : album$AlbumType;
    }

    public static final float[] f(String str, JSONObject jSONObject) {
        if (!bp6.a.contains(o6c.class)) {
            try {
                str.getClass();
                if (f) {
                    float[] fArr = new float[30];
                    for (int i2 = 0; i2 < 30; i2++) {
                        fArr[i2] = 0.0f;
                    }
                    try {
                        String lowerCase = str.toLowerCase();
                        lowerCase.getClass();
                        JSONObject jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                        String optString = jSONObject.optString("screenname");
                        JSONArray jSONArray = new JSONArray();
                        o6c o6cVar = g;
                        o6cVar.G(jSONObject2, jSONArray);
                        o6cVar.J(fArr, o6cVar.F(jSONObject2));
                        JSONObject p2 = o6cVar.p(jSONObject2);
                        if (p2 != null) {
                            optString.getClass();
                            String jSONObject3 = jSONObject2.toString();
                            jSONObject3.getClass();
                            o6cVar.J(fArr, o6cVar.D(p2, jSONArray, optString, jSONObject3, lowerCase));
                            return fArr;
                        }
                    } catch (JSONException unused) {
                        return fArr;
                    }
                }
            } catch (Throwable th) {
                bp6.a(o6c.class, th);
                return null;
            }
        }
        return null;
    }

    public static boolean r(lwu lwuVar) {
        if (lwuVar instanceof zvu) {
            if (((zvu) lwuVar).c != null) {
                s9p y = tyf.y(lwuVar);
                if (y != null ? hdg.N(y) : false) {
                    return true;
                }
            }
            return false;
        }
        lwuVar.getClass();
        s9p y2 = tyf.y(lwuVar);
        if (y2 != null) {
            return hdg.N(y2);
        }
        return false;
    }

    public static final String v(String str, String str2, String str3) {
        if (bp6.a.contains(o6c.class)) {
            return null;
        }
        try {
            str.getClass();
            str2.getClass();
            str3.getClass();
            String lowerCase = (str3 + " | " + str2 + ", " + str).toLowerCase();
            lowerCase.getClass();
            return lowerCase;
        } catch (Throwable th) {
            bp6.a(o6c.class, th);
            return null;
        }
    }

    public static final void z(File file) {
        if (bp6.a.contains(o6c.class)) {
            return;
        }
        try {
            try {
                e = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                e = new JSONObject(new String(bArr, Charsets.UTF_8));
                b = uah.e(new Pair("ENGLISH", "1"), new Pair("GERMAN", "2"), new Pair("SPANISH", "3"), new Pair("JAPANESE", "4"));
                c = uah.e(new Pair("VIEW_CONTENT", CommonUrlParts.Values.FALSE_INTEGER), new Pair("SEARCH", "1"), new Pair("ADD_TO_CART", "2"), new Pair("ADD_TO_WISHLIST", "3"), new Pair("INITIATE_CHECKOUT", "4"), new Pair("ADD_PAYMENT_INFO", "5"), new Pair("PURCHASE", "6"), new Pair("LEAD", "7"), new Pair("COMPLETE_REGISTRATION", "8"));
                d = uah.e(new Pair("BUTTON_TEXT", "1"), new Pair("PAGE_TITLE", "2"), new Pair("RESOLVED_DOCUMENT_LINK", "3"), new Pair("BUTTON_ID", "4"));
                f = true;
            } catch (Throwable th) {
                bp6.a(o6c.class, th);
            }
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.m6b
    public boolean A(Object obj, File file, pwj pwjVar) {
        try {
            tm3.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e2) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e2);
            return false;
        }
    }

    public boolean C(String[] strArr, String[] strArr2) {
        if (!bp6.a.contains(this)) {
            try {
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (StringsKt.M(str2, str, false)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th) {
                bp6.a(this, th);
                return false;
            }
        }
        return false;
    }

    public float[] D(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        float[] fArr;
        float[] fArr2 = null;
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            float[] fArr3 = new float[30];
            int i2 = 0;
            while (true) {
                if (i2 >= 30) {
                    break;
                }
                fArr3[i2] = 0.0f;
                i2++;
            }
            int length = jSONArray.length();
            boolean z = true;
            fArr3[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = jSONArray.length();
                int i3 = 0;
                while (i3 < length2) {
                    fArr = fArr2;
                    try {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                            jSONObject2.getClass();
                            boolean z2 = z;
                            if (!bp6.a.contains(this)) {
                                try {
                                    if (((jSONObject2.optInt("classtypebitmask") & 1) << 5) > 0) {
                                        fArr3[9] = fArr3[9] + 1.0f;
                                    }
                                } catch (Throwable th) {
                                    bp6.a(this, th);
                                }
                            }
                            i3++;
                            fArr2 = fArr;
                            z = z2;
                        } catch (JSONException unused) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bp6.a(this, th);
                        return fArr;
                    }
                }
            } catch (JSONException unused2) {
            }
            fArr = fArr2;
            fArr3[13] = -1.0f;
            fArr3[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            M(jSONObject, sb2, sb);
            String sb3 = sb.toString();
            String sb4 = sb2.toString();
            fArr3[15] = I("COMPLETE_REGISTRATION", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr3[16] = I("COMPLETE_REGISTRATION", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr3[17] = I("COMPLETE_REGISTRATION", "BUTTON_ID", sb3) ? 1.0f : 0.0f;
            fArr3[18] = StringsKt.M(str2, "password", false) ? 1.0f : 0.0f;
            fArr3[19] = H("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? 1.0f : 0.0f;
            fArr3[20] = H("(?i)(sign in)|login|signIn", str2) ? 1.0f : 0.0f;
            fArr3[21] = H("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? 1.0f : 0.0f;
            fArr3[22] = I("PURCHASE", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr3[24] = I("PURCHASE", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr3[25] = H("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", sb4) ? 1.0f : 0.0f;
            fArr3[27] = H("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4) ? 1.0f : 0.0f;
            fArr3[28] = I("LEAD", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr3[29] = I("LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            return fArr3;
        } catch (Throwable th3) {
            th = th3;
            fArr = null;
        }
    }

    public void E(ViewGroup viewGroup, MotionEvent motionEvent) {
        ViewParent parent = viewGroup.getParent();
        if (parent == null) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            parent.requestDisallowInterceptTouchEvent(true);
        } else if (actionMasked == 1 || actionMasked == 3) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    public float[] F(JSONObject jSONObject) {
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i2 = 0; i2 < 30; i2++) {
                fArr[i2] = 0.0f;
            }
            String optString = jSONObject.optString("text");
            optString.getClass();
            String lowerCase = optString.toLowerCase();
            lowerCase.getClass();
            String optString2 = jSONObject.optString("hint");
            optString2.getClass();
            String lowerCase2 = optString2.toLowerCase();
            lowerCase2.getClass();
            String optString3 = jSONObject.optString("classname");
            optString3.getClass();
            String lowerCase3 = optString3.toLowerCase();
            lowerCase3.getClass();
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (C(new String[]{"$", "amount", "price", "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (C(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (C(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (C(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (optInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (optInt == 3 || optInt == 2) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (StringsKt.M(lowerCase3, "checkbox", false)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (C(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (StringsKt.M(lowerCase3, "radio", false) && StringsKt.M(lowerCase3, "button", false)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
                    jSONObject2.getClass();
                    J(fArr, F(jSONObject2));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }

    public boolean G(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        if (!bp6.a.contains(this)) {
            try {
                if (jSONObject.optBoolean("is_interacted")) {
                    return true;
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    if (optJSONArray.getJSONObject(i2).optBoolean("is_interacted")) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                boolean z2 = z;
                JSONArray jSONArray2 = new JSONArray();
                if (z) {
                    int length2 = optJSONArray.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        jSONArray.put(optJSONArray.getJSONObject(i3));
                    }
                    return z2;
                }
                int length3 = optJSONArray.length();
                for (int i4 = 0; i4 < length3; i4++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i4);
                    jSONObject2.getClass();
                    if (G(jSONObject2, jSONArray)) {
                        jSONArray2.put(jSONObject2);
                        z2 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
                return z2;
            } catch (JSONException unused) {
            } catch (Throwable th) {
                bp6.a(this, th);
            }
        }
        return false;
    }

    public boolean H(String str, String str2) {
        if (bp6.a.contains(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            bp6.a(this, th);
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public boolean I(String str, String str2, String str3) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        if (!bp6.a.contains(this)) {
            try {
                JSONObject jSONObject = e;
                String str4 = null;
                if (jSONObject == null) {
                    Intrinsics.j("rules");
                    throw null;
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("rulesForLanguage");
                if (optJSONObject3 != null) {
                    ?? r4 = b;
                    if (r4 == 0) {
                        Intrinsics.j("languageInfo");
                        throw null;
                    }
                    JSONObject optJSONObject4 = optJSONObject3.optJSONObject((String) r4.get("ENGLISH"));
                    if (optJSONObject4 != null && (optJSONObject = optJSONObject4.optJSONObject("rulesForEvent")) != null) {
                        ?? r1 = c;
                        if (r1 == 0) {
                            Intrinsics.j("eventInfo");
                            throw null;
                        }
                        JSONObject optJSONObject5 = optJSONObject.optJSONObject((String) r1.get(str));
                        if (optJSONObject5 != null && (optJSONObject2 = optJSONObject5.optJSONObject("positiveRules")) != null) {
                            ?? r0 = d;
                            if (r0 == 0) {
                                Intrinsics.j("textTypeInfo");
                                throw null;
                            }
                            str4 = optJSONObject2.optString((String) r0.get(str2));
                        }
                    }
                }
                if (str4 != null) {
                    return H(str4, str3);
                }
            } catch (Throwable th) {
                bp6.a(this, th);
                return false;
            }
        }
        return false;
    }

    public void J(float[] fArr, float[] fArr2) {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            int length = fArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                fArr[i2] = fArr[i2] + fArr2[i2];
            }
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    public void M(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        if (bp6.a.contains(this)) {
            return;
        }
        try {
            String optString = jSONObject.optString("text", "");
            optString.getClass();
            String lowerCase = optString.toLowerCase();
            lowerCase.getClass();
            String optString2 = jSONObject.optString("hint", "");
            optString2.getClass();
            String lowerCase2 = optString2.toLowerCase();
            lowerCase2.getClass();
            if (lowerCase.length() > 0) {
                sb.append(lowerCase);
                sb.append(StringUtil.SPACE);
            }
            if (lowerCase2.length() > 0) {
                sb2.append(lowerCase2);
                sb2.append(StringUtil.SPACE);
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    try {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                        jSONObject2.getClass();
                        M(jSONObject2, sb, sb2);
                    } catch (JSONException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            bp6.a(this, th);
        }
    }

    @Override // defpackage.k8b
    public Object a(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }

    @Override // defpackage.e18
    public boolean b() {
        return false;
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        switch (this.a) {
            case 4:
                focVar.getClass();
                return zop.d;
            default:
                focVar.getClass();
                return gfw.a;
        }
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        switch (this.a) {
            case 4:
                faqVar.getClass();
                if ((faqVar instanceof daq) || (faqVar instanceof qaq) || (faqVar instanceof saq)) {
                    return zop.d;
                }
                if (faqVar instanceof naq) {
                    return a4g.G(((naq) faqVar).e) ? zop.g : zop.c;
                }
                b6e.s();
                return null;
            default:
                faqVar.getClass();
                return gfw.b;
        }
    }

    @Override // defpackage.e18
    public UUID getDeviceId() {
        return new UUID(0L, 0L);
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        switch (this.a) {
            case 4:
                jzsVar.getClass();
                return a4g.G(jzsVar.a) ? zop.g : zop.c;
            default:
                jzsVar.getClass();
                return gfw.a;
        }
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        switch (this.a) {
            case 4:
                m1qVar.getClass();
                if ((m1qVar instanceof j1q) || (m1qVar instanceof e2q)) {
                    return zop.d;
                }
                if (m1qVar instanceof c2q) {
                    return a4g.G(((c2q) m1qVar).f) ? zop.d : zop.c;
                }
                b6e.s();
                return null;
            default:
                m1qVar.getClass();
                return gfw.b;
        }
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        switch (this.a) {
            case 4:
                i5uVar.getClass();
                return null;
            default:
                i5uVar.getClass();
                return gfw.a;
        }
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        switch (this.a) {
            case 4:
                k4dVar.getClass();
                return zop.d;
            default:
                k4dVar.getClass();
                return gfw.a;
        }
    }

    @Override // defpackage.p7q
    public Object m(ioc iocVar) {
        iocVar.getClass();
        return t75.c(null);
    }

    @Override // defpackage.p7q
    public Object n(szu szuVar) {
        szuVar.getClass();
        return szuVar.b.a.a.e();
    }

    public JSONObject p(JSONObject jSONObject) {
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
        } catch (JSONException unused) {
        } catch (Throwable th) {
            bp6.a(this, th);
        }
        if (jSONObject.optBoolean("is_interacted")) {
            return jSONObject;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
        if (optJSONArray == null) {
            return null;
        }
        int length = optJSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
            jSONObject2.getClass();
            JSONObject p2 = p(jSONObject2);
            if (p2 != null) {
                return p2;
            }
        }
        return null;
    }

    @Override // defpackage.p7q
    public Object q(y4d y4dVar) {
        y4dVar.getClass();
        return t75.c(y4dVar.b);
    }

    @Override // defpackage.p7q
    public Object q0(maq maqVar) {
        maqVar.getClass();
        return maqVar.j();
    }

    @Override // defpackage.p7q
    public Object t(t1q t1qVar) {
        t1qVar.getClass();
        return t1qVar.e;
    }

    @Override // defpackage.p7q
    public Object u(u7u u7uVar) {
        u7uVar.getClass();
        return u7uVar.g;
    }

    @Override // defpackage.f4c
    public pjc x() {
        return new fs(15, Float.valueOf(1.0f));
    }

    public String y(int i2, String str) {
        int D = ouj.D(i2);
        int i3 = 1;
        if (D == 0) {
            StringBuilder sb = new StringBuilder(str.length() + 5);
            int indexOf = str.indexOf(".local.");
            int lastIndexOf = str.lastIndexOf(45);
            if (lastIndexOf < 0) {
                sb.append(str.substring(0, indexOf));
            } else {
                try {
                    int parseInt = Integer.parseInt(str.substring(lastIndexOf + 1, indexOf)) + 1;
                    sb.append(str.substring(0, lastIndexOf));
                    i3 = parseInt;
                } catch (Exception unused) {
                    sb.append(str.substring(0, indexOf));
                }
            }
            sb.append('-');
            sb.append(i3);
            sb.append(".local.");
            return sb.toString();
        }
        if (D != 1) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 5);
        int lastIndexOf2 = str.lastIndexOf(40);
        int lastIndexOf3 = str.lastIndexOf(41);
        if (lastIndexOf2 < 0 || lastIndexOf2 >= lastIndexOf3) {
            sb2.append(str);
            sb2.append(" (2)");
        } else {
            try {
                sb2.append(str.substring(0, lastIndexOf2));
                sb2.append('(');
                sb2.append(Integer.parseInt(str.substring(lastIndexOf2 + 1, lastIndexOf3)) + 1);
                sb2.append(')');
            } catch (NumberFormatException unused2) {
                sb2.setLength(0);
                sb2.append(str);
                sb2.append(" (2)");
            }
        }
        return sb2.toString();
    }

    @Override // defpackage.emj
    public void l() {
    }

    @Override // defpackage.emj
    public void o() {
    }

    @Override // defpackage.emj
    public void s() {
    }
}
