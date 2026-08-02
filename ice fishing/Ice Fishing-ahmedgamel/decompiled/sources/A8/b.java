package A8;

import B1.C0259a;
import B1.C0260b;
import B1.C0261c;
import B1.C0264f;
import B1.C0265g;
import B1.E;
import B1.I;
import B1.m;
import B1.p;
import B1.t;
import D.y;
import G1.f;
import S7.AbstractC0383a;
import a.AbstractC0422a;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import android.view.View;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.h;
import com.bumptech.glide.l;
import com.bumptech.glide.load.data.k;
import com.google.android.gms.internal.ads.C2941aq;
import com.google.android.gms.internal.ads.Wt;
import com.icefishingapp.icefishing.AbstractC4404f;
import g1.C4522b;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.u;
import l.C4648e;
import m.Y0;
import m.a1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s1.j;
import t0.C4986A;
import t0.C4988C;
import u2.z;
import v1.InterfaceC5104a;
import v2.i;
import v7.AbstractC5129j;
import v7.C5135p;
import v7.r;
import w7.C5159f;
import w7.C5162i;
import y1.C5203B;
import y1.C5212g;
import y1.C5213h;
import y2.e;
import z1.C5255b;
import z7.C5265b;
import z7.C5273j;
import z7.InterfaceC5267d;
import z7.InterfaceC5270g;
import z7.InterfaceC5271h;
import z7.InterfaceC5272i;

/* loaded from: classes2.dex */
public abstract class b {
    public static void A(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int G7 = G(parcel, i);
        parcel.writeStringArray(strArr);
        I(parcel, G7);
    }

    public static void B(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int G7 = G(parcel, i);
        parcel.writeStringList(list);
        I(parcel, G7);
    }

    public static void C(Parcel parcel, int i, Parcelable[] parcelableArr, int i6) {
        if (parcelableArr == null) {
            return;
        }
        int G7 = G(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i6);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        I(parcel, G7);
    }

    public static void D(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int G7 = G(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            Parcelable parcelable = (Parcelable) list.get(i6);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        I(parcel, G7);
    }

    public static List E(JSONArray jSONArray, ArrayList arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
        }
        return arrayList;
    }

    public static void F(Parcel parcel, int i, int i6) {
        parcel.writeInt(i | (i6 << 16));
    }

    public static int G(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static ArrayList H(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static void I(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static JSONObject J(JsonReader jsonReader) {
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONObject.put(nextName, K(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONObject.put(nextName, J(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(peek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
                }
                jSONObject.put(nextName, jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static JSONArray K(JsonReader jsonReader) {
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONArray.put(K(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONArray.put(J(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(peek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
                }
                jSONArray.put(jsonReader.nextString());
            }
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static void L(JsonWriter jsonWriter, JSONObject jSONObject) {
        try {
            jsonWriter.beginObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    L(jsonWriter.name(next), (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        String valueOf = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                        sb.append("unable to write field: ");
                        sb.append(valueOf);
                        throw new JSONException(sb.toString());
                    }
                    M(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e9) {
            throw new IOException(e9);
        }
    }

    public static void M(JsonWriter jsonWriter, JSONArray jSONArray) {
        try {
            jsonWriter.beginArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    L(jsonWriter, (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        String valueOf = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                        sb.append("unable to write field: ");
                        sb.append(valueOf);
                        throw new JSONException(sb.toString());
                    }
                    M(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e9) {
            throw new IOException(e9);
        }
    }

    public static JSONObject N(String str, JSONObject jSONObject) {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static Bundle O(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                if (opt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) opt).booleanValue());
                } else if (opt instanceof Double) {
                    bundle.putDouble(next, ((Double) opt).doubleValue());
                } else if (opt instanceof Integer) {
                    bundle.putInt(next, ((Integer) opt).intValue());
                } else if (opt instanceof Long) {
                    bundle.putLong(next, ((Long) opt).longValue());
                } else if (opt instanceof String) {
                    bundle.putString(next, (String) opt);
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i = 0;
                        Object obj = null;
                        for (int i6 = 0; obj == null && i6 < length; i6++) {
                            obj = !jSONArray.isNull(i6) ? jSONArray.opt(i6) : null;
                        }
                        if (obj == null) {
                            String valueOf = String.valueOf(next);
                            int i9 = z.f41322b;
                            i.f("Expected JSONArray with at least 1 non-null element for key:".concat(valueOf));
                        } else if (obj instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i < length) {
                                bundleArr[i] = !jSONArray.isNull(i) ? O(jSONArray.optJSONObject(i)) : null;
                                i++;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (obj instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i < length) {
                                dArr[i] = jSONArray.optDouble(i);
                                i++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (obj instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i < length) {
                                strArr[i] = !jSONArray.isNull(i) ? jSONArray.optString(i) : null;
                                i++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (obj instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i < length) {
                                zArr[i] = jSONArray.optBoolean(i);
                                i++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            String str = "JSONArray with unsupported type " + obj.getClass().getCanonicalName() + " for key:" + next;
                            int i10 = z.f41322b;
                            i.f(str);
                        }
                    }
                } else if (opt instanceof JSONObject) {
                    bundle.putBundle(next, O((JSONObject) opt));
                } else {
                    String valueOf2 = String.valueOf(next);
                    int i11 = z.f41322b;
                    i.f("Unsupported type for key:".concat(valueOf2));
                }
            }
        }
        return bundle;
    }

    public static String P(Wt wt) {
        if (wt == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            Q(jsonWriter, wt);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e9) {
            int i = z.f41322b;
            i.d("Error when writing JSON.", e9);
            return null;
        }
    }

    public static void Q(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof Wt) {
            L(jsonWriter, ((Wt) obj).f28429d);
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                Q(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                Q(jsonWriter.name((String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }

    public static JSONObject R(JSONObject jSONObject, String[] strArr) {
        for (int i = 0; i < strArr.length - 1; i = 1) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[0]);
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r9.bottom <= r11.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r8 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r8 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r10 = n(r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r8 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r8 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r8 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r8 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r8 = r11.bottom;
        r9 = r9.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r10 >= java.lang.Math.max(1, r8 - r9)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r8 = r11.right;
        r9 = r9.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r8 = r9.top;
        r9 = r11.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        r8 = r9.left;
        r9 = r11.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0032, code lost:
    
        if (r9.right <= r11.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0039, code lost:
    
        if (r9.top >= r11.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0040, code lost:
    
        if (r9.left >= r11.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean b9 = b(i, rect, rect2);
        if (b(i, rect, rect3) || !b9) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
        }
        return true;
    }

    public static boolean b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static C5162i c(C5162i c5162i) {
        C5159f c5159f = c5162i.f41695n;
        c5159f.c();
        return c5159f.f41679B > 0 ? c5162i : C5162i.f41694u;
    }

    public static Object d(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static l e(c cVar, ArrayList arrayList) {
        j c0264f;
        j c0259a;
        int i;
        Resources resources;
        String str;
        String str2;
        InterfaceC5104a interfaceC5104a = cVar.f23372n;
        com.bumptech.glide.i iVar = cVar.f23374v;
        Context applicationContext = iVar.getApplicationContext();
        C4522b c4522b = iVar.f23399h;
        l lVar = new l();
        m mVar = new m();
        I1.b bVar = lVar.f23412g;
        synchronized (bVar) {
            bVar.f1277a.add(mVar);
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 27) {
            t tVar = new t();
            I1.b bVar2 = lVar.f23412g;
            synchronized (bVar2) {
                bVar2.f1277a.add(tVar);
            }
        }
        Resources resources2 = applicationContext.getResources();
        ArrayList e9 = lVar.e();
        C2941aq c2941aq = cVar.f23375w;
        F1.b bVar3 = new F1.b(applicationContext, e9, interfaceC5104a, c2941aq);
        I i9 = new I(interfaceC5104a, new M2.i(2));
        p pVar = new p(lVar.e(), resources2.getDisplayMetrics(), interfaceC5104a, c2941aq);
        if (i6 < 28 || !((Map) c4522b.f37625u).containsKey(d.class)) {
            c0264f = new C0264f(pVar, 0);
            c0259a = new C0259a(2, pVar, c2941aq);
        } else {
            c0259a = new C0265g(1);
            c0264f = new C0265g(0);
        }
        Class<InputStream> cls = InputStream.class;
        if (i6 >= 28) {
            i = i6;
            resources = resources2;
            int i10 = 1;
            lVar.d("Animation", InputStream.class, Drawable.class, new D1.a(new S0.l(i10, e9, c2941aq), i10));
            lVar.d("Animation", ByteBuffer.class, Drawable.class, new D1.a(new S0.l(1, e9, c2941aq), 0));
        } else {
            i = i6;
            resources = resources2;
        }
        D1.c cVar2 = new D1.c(applicationContext);
        C0260b c0260b = new C0260b(c2941aq);
        G1.a aVar = new G1.a((byte) 0, 0);
        f fVar = new f(1);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        lVar.b(ByteBuffer.class, new y1.z(5));
        lVar.b(InputStream.class, new C4648e(14, c2941aq));
        lVar.d("Bitmap", ByteBuffer.class, Bitmap.class, c0264f);
        lVar.d("Bitmap", InputStream.class, Bitmap.class, c0259a);
        String str3 = Build.FINGERPRINT;
        Class<ParcelFileDescriptor> cls2 = ParcelFileDescriptor.class;
        if ("robolectric".equals(str3)) {
            str = str3;
            str2 = "Animation";
        } else {
            str = str3;
            str2 = "Animation";
            lVar.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C0264f(pVar, 1));
        }
        lVar.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new I(interfaceC5104a, new M2.i(1)));
        lVar.d("Bitmap", ParcelFileDescriptor.class, Bitmap.class, i9);
        y1.z zVar = y1.z.f41844u;
        lVar.a(Bitmap.class, Bitmap.class, zVar);
        lVar.d("Bitmap", Bitmap.class, Bitmap.class, new E(0));
        lVar.c(Bitmap.class, c0260b);
        Resources resources3 = resources;
        lVar.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C0259a(resources3, c0264f));
        lVar.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C0259a(resources3, c0259a));
        lVar.d("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C0259a(resources3, i9));
        lVar.c(BitmapDrawable.class, new S0.c(1, interfaceC5104a, c0260b));
        String str4 = str2;
        lVar.d(str4, InputStream.class, F1.c.class, new F1.j(e9, bVar3, c2941aq));
        lVar.d(str4, ByteBuffer.class, F1.c.class, bVar3);
        lVar.c(F1.c.class, new M2.i(3));
        lVar.a(r1.d.class, r1.d.class, zVar);
        lVar.d("Bitmap", r1.d.class, Bitmap.class, new C0261c(interfaceC5104a));
        lVar.d("legacy_append", Uri.class, Drawable.class, cVar2);
        lVar.d("legacy_append", Uri.class, Bitmap.class, new C0259a(1, cVar2, interfaceC5104a));
        lVar.h(new C1.a(0));
        lVar.a(File.class, ByteBuffer.class, new y1.z(6));
        lVar.a(File.class, InputStream.class, new C5212g(5, new y1.z(9)));
        lVar.d("legacy_append", File.class, File.class, new E(2));
        lVar.a(File.class, ParcelFileDescriptor.class, new C5212g(5, new y1.z(8)));
        lVar.a(File.class, File.class, zVar);
        lVar.h(new k(c2941aq));
        if (!"robolectric".equals(str)) {
            lVar.h(new C1.a(2));
        }
        Z1.j jVar = new Z1.j(applicationContext, 1);
        L3.i iVar2 = new L3.i(applicationContext, 1);
        com.bumptech.glide.manager.m mVar2 = new com.bumptech.glide.manager.m(applicationContext, 2);
        Class cls3 = Integer.TYPE;
        lVar.a(cls3, InputStream.class, jVar);
        lVar.a(Integer.class, InputStream.class, jVar);
        lVar.a(cls3, AssetFileDescriptor.class, iVar2);
        lVar.a(Integer.class, AssetFileDescriptor.class, iVar2);
        lVar.a(cls3, Drawable.class, mVar2);
        lVar.a(Integer.class, Drawable.class, mVar2);
        lVar.a(Uri.class, InputStream.class, new Z1.j(applicationContext, 2));
        lVar.a(Uri.class, AssetFileDescriptor.class, new com.bumptech.glide.manager.m(applicationContext, 3));
        G1.b bVar4 = new G1.b(resources3);
        C4988C c4988c = new C4988C(5, resources3);
        C4648e c4648e = new C4648e(13, resources3);
        lVar.a(Integer.class, Uri.class, bVar4);
        lVar.a(cls3, Uri.class, bVar4);
        lVar.a(Integer.class, AssetFileDescriptor.class, c4988c);
        lVar.a(cls3, AssetFileDescriptor.class, c4988c);
        lVar.a(Integer.class, InputStream.class, c4648e);
        lVar.a(cls3, InputStream.class, c4648e);
        lVar.a(String.class, InputStream.class, new C4648e());
        lVar.a(Uri.class, InputStream.class, new C4648e());
        lVar.a(String.class, InputStream.class, new y1.z(13));
        lVar.a(String.class, ParcelFileDescriptor.class, new y1.z(12));
        lVar.a(String.class, AssetFileDescriptor.class, new y1.z(11));
        lVar.a(Uri.class, InputStream.class, new C4988C(4, applicationContext.getAssets()));
        lVar.a(Uri.class, AssetFileDescriptor.class, new C4986A(applicationContext.getAssets()));
        lVar.a(Uri.class, InputStream.class, new V2.b(applicationContext, 3));
        lVar.a(Uri.class, InputStream.class, new L3.i(applicationContext, 2));
        if (i >= 29) {
            lVar.a(Uri.class, InputStream.class, new C5255b(8, applicationContext, cls));
            lVar.a(Uri.class, ParcelFileDescriptor.class, new C5255b(8, applicationContext, cls2));
        }
        boolean containsKey = ((Map) c4522b.f37625u).containsKey(h.class);
        lVar.a(Uri.class, InputStream.class, new C5203B(contentResolver, containsKey, 2));
        lVar.a(Uri.class, ParcelFileDescriptor.class, new C5203B(contentResolver, containsKey, 1));
        lVar.a(Uri.class, AssetFileDescriptor.class, new C5203B(contentResolver, containsKey, 0));
        lVar.a(Uri.class, InputStream.class, new y1.z(14));
        lVar.a(URL.class, InputStream.class, new e());
        lVar.a(Uri.class, File.class, new V2.b(applicationContext, 2));
        lVar.a(C5213h.class, InputStream.class, new C4988C(6));
        lVar.a(byte[].class, ByteBuffer.class, new y1.z(2));
        lVar.a(byte[].class, InputStream.class, new y1.z(4));
        lVar.a(Uri.class, Uri.class, zVar);
        lVar.a(Drawable.class, Drawable.class, zVar);
        lVar.d("legacy_append", Drawable.class, Drawable.class, new E(1));
        lVar.i(Bitmap.class, BitmapDrawable.class, new G1.b(resources3));
        lVar.i(Bitmap.class, byte[].class, aVar);
        lVar.i(Drawable.class, byte[].class, new Z2.e(5, interfaceC5104a, aVar, fVar));
        lVar.i(F1.c.class, byte[].class, fVar);
        I i11 = new I(interfaceC5104a, new a4.e());
        lVar.d("legacy_append", ByteBuffer.class, Bitmap.class, i11);
        lVar.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new C0259a(resources3, i11));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw y.j(it);
        }
        return lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC5267d f(I7.p pVar, AbstractC0383a abstractC0383a, AbstractC0383a abstractC0383a2) {
        kotlin.jvm.internal.h.e(pVar, "<this>");
        if (pVar instanceof B7.a) {
            return ((B7.a) pVar).create(abstractC0383a, abstractC0383a2);
        }
        C5273j c5273j = C5273j.f42272n;
        InterfaceC5272i interfaceC5272i = abstractC0383a2.f2942v;
        return interfaceC5272i == c5273j ? new A7.b(pVar, abstractC0383a2, abstractC0383a) : new A7.c(abstractC0383a2, interfaceC5272i, pVar, abstractC0383a);
    }

    public static i8.k g(SSLSession sSLSession) {
        Object obj;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        i8.f b9 = i8.f.f38095b.b(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        i8.z.f38266u.getClass();
        i8.z c9 = i8.b.c(protocol);
        try {
            obj = j8.d.k(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            obj = C5135p.f41442n;
        }
        return new i8.k(c9, b9, j8.d.k(sSLSession.getLocalCertificates()), new c6.l(2, obj));
    }

    public static Set i() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static E6.b j(String rootDir, long j6) {
        kotlin.jvm.internal.h.e(rootDir, "rootDir");
        File file = new File(rootDir);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.toMillis(30L);
        timeUnit.toMillis(33L);
        TimeUnit.HOURS.toMillis(18L);
        byte b9 = (byte) (((byte) (((byte) (((byte) (((byte) (((byte) (((byte) 8) | 16)) | 1)) | 2)) | 4)) | 1)) | 2);
        int i = R7.a.f2760w;
        R7.c unit = R7.c.f2768y;
        kotlin.jvm.internal.h.e(unit, "unit");
        long k9 = unit.compareTo(R7.c.f2766w) <= 0 ? AbstractC0422a.k(d.e(72, unit, R7.c.f2764u)) : AbstractC0422a.w(72, unit);
        long f3 = ((((int) k9) & 1) != 1 || R7.a.d(k9)) ? R7.a.f(k9, R7.c.f2765v) : k9 >> 1;
        byte b10 = (byte) (b9 | 4);
        if (b10 == 31) {
            E6.a aVar = new E6.a(com.anythink.basead.exoplayer.i.a.f7883f, j6, f3);
            if (j6 <= com.anythink.basead.exoplayer.i.a.f7883f) {
                throw new IllegalArgumentException("The configured max file age for writing must be lower than the configured min file age for reading");
            }
            if (file.isFile()) {
                throw new IllegalArgumentException("destinationDir must be a directory");
            }
            if (file.exists() || file.mkdirs()) {
                return new E6.b(new A6.a(new A6.d(new A6.b(file, aVar)), new C4986A(7)));
            }
            throw new IllegalStateException("Could not create dir: " + file);
        }
        StringBuilder sb = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb.append(" maxFileAgeForWriteMillis");
        }
        if ((b10 & 2) == 0) {
            sb.append(" minFileAgeForReadMillis");
        }
        if ((b10 & 4) == 0) {
            sb.append(" maxFileAgeForReadMillis");
        }
        if ((b10 & 8) == 0) {
            sb.append(" maxFileSize");
        }
        if ((b10 & 16) == 0) {
            sb.append(" maxFolderSize");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb));
    }

    public static String k(byte[] bArr) {
        int a9;
        N6.c cVar = new N6.c(bArr, 0);
        boolean z3 = false;
        while (!z3) {
            int i = cVar.f1959c;
            int i6 = cVar.f1958b;
            if (i == i6) {
                cVar.f1960d = 0;
                a9 = 0;
            } else {
                a9 = cVar.a();
                cVar.f1960d = a9;
                if ((a9 >>> 3) == 0) {
                    throw new IOException("Invalid tag: " + cVar.f1960d);
                }
            }
            if (a9 != 0) {
                byte[] bArr2 = cVar.f1957a;
                if (a9 == 18) {
                    int a10 = cVar.a();
                    if (a10 > 0) {
                        int i9 = cVar.f1959c;
                        if (a10 <= i6 - i9) {
                            String str = new String(bArr2, i9, a10, StandardCharsets.UTF_8);
                            cVar.f1959c += a10;
                            return str;
                        }
                    }
                    if (a10 == 0) {
                        return "";
                    }
                    if (a10 <= 0) {
                        throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                    }
                    throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                int i10 = a9 & 7;
                if (i10 == 0) {
                    if (i6 - cVar.f1959c >= 10) {
                        for (int i11 = 0; i11 < 10; i11++) {
                            int i12 = cVar.f1959c;
                            cVar.f1959c = i12 + 1;
                            if (bArr2[i12] >= 0) {
                                break;
                            }
                        }
                        throw new IOException("CodedInputStream encountered a malformed varint.");
                    }
                    for (int i13 = 0; i13 < 10; i13++) {
                        int i14 = cVar.f1959c;
                        if (i14 == i6) {
                            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                        cVar.f1959c = i14 + 1;
                        if (bArr2[i14] >= 0) {
                            break;
                        }
                    }
                    throw new IOException("CodedInputStream encountered a malformed varint.");
                }
                if (i10 == 1) {
                    cVar.b(8);
                } else if (i10 == 2) {
                    cVar.b(cVar.a());
                } else {
                    if (i10 != 5) {
                        throw new IOException(AbstractC4404f.e(a9, "Invalid wire type: "));
                    }
                    cVar.b(4);
                }
            } else {
                z3 = true;
            }
        }
        return "";
    }

    public static InterfaceC5267d l(InterfaceC5267d interfaceC5267d) {
        InterfaceC5267d intercepted;
        kotlin.jvm.internal.h.e(interfaceC5267d, "<this>");
        B7.c cVar = interfaceC5267d instanceof B7.c ? (B7.c) interfaceC5267d : null;
        return (cVar == null || (intercepted = cVar.intercepted()) == null) ? interfaceC5267d : intercepted;
    }

    public static boolean m(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i6 = rect.right;
            int i9 = rect2.right;
            return (i6 > i9 || rect.left >= i9) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            return (i10 > i11 || rect.top >= i11) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i12 = rect.left;
            int i13 = rect2.left;
            return (i12 < i13 || rect.right <= i13) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i14 = rect.top;
        int i15 = rect2.top;
        return (i14 < i15 || rect.bottom <= i15) && rect.bottom < rect2.bottom;
    }

    public static int n(int i, Rect rect, Rect rect2) {
        int i6;
        int i9;
        if (i == 17) {
            i6 = rect.left;
            i9 = rect2.right;
        } else if (i == 33) {
            i6 = rect.top;
            i9 = rect2.bottom;
        } else if (i == 66) {
            i6 = rect2.left;
            i9 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i6 = rect2.top;
            i9 = rect.bottom;
        }
        return Math.max(0, i6 - i9);
    }

    public static int o(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static Set p(Set set, Set elements) {
        kotlin.jvm.internal.h.e(set, "<this>");
        kotlin.jvm.internal.h.e(elements, "elements");
        if (elements.isEmpty()) {
            return AbstractC5129j.P(set);
        }
        if (!(elements instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(elements);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!elements.contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static InterfaceC5272i q(InterfaceC5270g interfaceC5270g, InterfaceC5271h key) {
        kotlin.jvm.internal.h.e(key, "key");
        return kotlin.jvm.internal.h.a(interfaceC5270g.getKey(), key) ? C5273j.f42272n : interfaceC5270g;
    }

    public static InterfaceC5272i r(InterfaceC5270g interfaceC5270g, InterfaceC5272i context) {
        kotlin.jvm.internal.h.e(context, "context");
        return context == C5273j.f42272n ? interfaceC5270g : (InterfaceC5272i) context.l(interfaceC5270g, new C5265b(1));
    }

    public static Set s(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return r.f41444n;
        }
        if (length == 1) {
            Set singleton = Collections.singleton(objArr[0]);
            kotlin.jvm.internal.h.d(singleton, "singleton(...)");
            return singleton;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(v7.t.P(objArr.length));
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
        return linkedHashSet;
    }

    public static void t(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            Y0.a(view, charSequence);
            return;
        }
        a1 a1Var = a1.f39108D;
        if (a1Var != null && a1Var.f39113n == view) {
            a1.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new a1(view, charSequence);
            return;
        }
        a1 a1Var2 = a1.f39109E;
        if (a1Var2 != null && a1Var2.f39113n == view) {
            a1Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static Object u(I7.p pVar, Object obj, InterfaceC5267d interfaceC5267d) {
        kotlin.jvm.internal.h.e(pVar, "<this>");
        InterfaceC5272i context = interfaceC5267d.getContext();
        Object dVar = context == C5273j.f42272n ? new A7.d(interfaceC5267d) : new A7.e(interfaceC5267d, context);
        u.b(2, pVar);
        return pVar.invoke(obj, dVar);
    }

    public static void v(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int G7 = G(parcel, i);
        parcel.writeBundle(bundle);
        I(parcel, G7);
    }

    public static void w(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int G7 = G(parcel, i);
        parcel.writeByteArray(bArr);
        I(parcel, G7);
    }

    public static void x(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int G7 = G(parcel, i);
        parcel.writeStrongBinder(iBinder);
        I(parcel, G7);
    }

    public static void y(Parcel parcel, int i, Parcelable parcelable, int i6) {
        if (parcelable == null) {
            return;
        }
        int G7 = G(parcel, i);
        parcelable.writeToParcel(parcel, i6);
        I(parcel, G7);
    }

    public static void z(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int G7 = G(parcel, i);
        parcel.writeString(str);
        I(parcel, G7);
    }

    public abstract void h(E3.u uVar, float f3, float f9);
}
