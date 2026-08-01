package com.bumptech.glide;

import B1.A;
import D.y;
import P2.w;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.internal.ads.C2941aq;
import com.icefishing.icefishingbigwin.AbstractC4404f;
import i8.u;
import i8.v;
import i8.x;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import s1.InterfaceC4969d;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static Field f23379a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f23380b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f23381c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f23382d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f23383e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f23384f;

    /* renamed from: g, reason: collision with root package name */
    public static Field f23385g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f23386h;

    public static final C7.b b(Enum[] entries) {
        kotlin.jvm.internal.h.e(entries, "entries");
        return new C7.b(entries);
    }

    public static final S0.j c(S0.p pVar) {
        kotlin.jvm.internal.h.e(pVar, "<this>");
        return new S0.j(pVar.f2808a, pVar.f2826t);
    }

    public static int d(ArrayList arrayList, InputStream inputStream, C2941aq c2941aq) {
        if (inputStream != null) {
            if (!inputStream.markSupported()) {
                inputStream = new A(inputStream, c2941aq);
            }
            inputStream.mark(5242880);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                try {
                    int b9 = ((InterfaceC4969d) arrayList.get(i)).b(inputStream, c2941aq);
                    if (b9 != -1) {
                        return b9;
                    }
                } finally {
                    inputStream.reset();
                }
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType e(ArrayList arrayList, InputStream inputStream, C2941aq c2941aq) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new A(inputStream, c2941aq);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType c9 = ((InterfaceC4969d) arrayList.get(i)).c(inputStream);
                inputStream.reset();
                if (c9 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return c9;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static ImageHeaderParser$ImageType f(ArrayList arrayList, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser$ImageType a9 = ((InterfaceC4969d) arrayList.get(i)).a(byteBuffer);
                AtomicReference atomicReference = N1.b.f1908a;
                if (a9 != ImageHeaderParser$ImageType.UNKNOWN) {
                    return a9;
                }
            } catch (Throwable th) {
                AtomicReference atomicReference2 = N1.b.f1908a;
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static int g(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        throw new IllegalArgumentException(AbstractC4404f.e(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static void h(Drawable drawable, int i) {
        H.a.g(drawable, i);
    }

    public static final v i(v vVar) {
        kotlin.jvm.internal.h.e(vVar, "<this>");
        u b9 = vVar.b();
        x xVar = vVar.f38258z;
        b9.f38236g = new j8.a(xVar.j(), xVar.b());
        return b9.a();
    }

    public static boolean j(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null || obj2 == null) {
                    bundle2 = obj2;
                    bundle = obj;
                } else if (obj instanceof Bundle) {
                    if (!(obj2 instanceof Bundle) || !j((Bundle) obj, (Bundle) obj2)) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                        return false;
                    }
                    for (int i = 0; i < length; i++) {
                        if (!w.l(Array.get(obj, i), Array.get(obj2, i))) {
                            return false;
                        }
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        return bundle == null && bundle2 == null;
    }

    public static HashMap k(Bundle bundle) {
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    hashMap.put(str, string);
                }
            }
        }
        return hashMap;
    }

    public static void l(int i, int i6) {
        String B9;
        if (i < 0 || i >= i6) {
            if (i < 0) {
                B9 = f.B("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i6 < 0) {
                    throw new IllegalArgumentException(y.m(i6, "negative size: ", new StringBuilder(String.valueOf(i6).length() + 15)));
                }
                B9 = f.B("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i6));
            }
            throw new IndexOutOfBoundsException(B9);
        }
    }

    public static void m(int i, int i6, int i9) {
        if (i < 0 || i6 < i || i6 > i9) {
            throw new IndexOutOfBoundsException((i < 0 || i > i9) ? n(i, i9, "start index") : (i6 < 0 || i6 > i9) ? n(i6, i9, "end index") : f.B("end index (%s) must not be less than start index (%s)", Integer.valueOf(i6), Integer.valueOf(i)));
        }
    }

    public static String n(int i, int i6, String str) {
        if (i < 0) {
            return f.B("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i6 >= 0) {
            return f.B("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i6));
        }
        throw new IllegalArgumentException(y.m(i6, "negative size: ", new StringBuilder(String.valueOf(i6).length() + 15)));
    }

    public abstract List a(String str, List list);
}
