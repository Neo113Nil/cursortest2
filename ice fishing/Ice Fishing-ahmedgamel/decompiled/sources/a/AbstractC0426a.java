package a;

import D.x;
import J0.c;
import O.g0;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.anythink.basead.exoplayer.k.p;
import com.google.android.gms.internal.ads.Wv;
import f3.d;
import f3.e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.h;
import n1.j;
import u.AbstractC5050e;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0426a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f4207a = true;

    public static float a(float f2) {
        return f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float b(float f2) {
        return f2 <= 0.0031308f ? f2 * 12.92f : (float) ((Math.pow(f2, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static final LinkedHashSet c(byte[] bytes) {
        ObjectInputStream objectInputStream;
        h.e(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length != 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i = 0; i < readInt; i++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        h.d(uri, "uri");
                        linkedHashSet.add(new c(uri, readBoolean));
                    }
                    objectInputStream.close();
                    byteArrayInputStream.close();
                } finally {
                }
            } finally {
            }
        }
        return linkedHashSet;
    }

    public static int e(int i, int i4, float f2) {
        if (i == i4 || f2 <= 0.0f) {
            return i;
        }
        if (f2 >= 1.0f) {
            return i4;
        }
        float f9 = ((i >> 24) & p.f9259b) / 255.0f;
        float f10 = ((i >> 16) & p.f9259b) / 255.0f;
        float f11 = ((i >> 8) & p.f9259b) / 255.0f;
        float f12 = ((i4 >> 24) & p.f9259b) / 255.0f;
        float f13 = ((i4 >> 16) & p.f9259b) / 255.0f;
        float f14 = ((i4 >> 8) & p.f9259b) / 255.0f;
        float a9 = a(f10);
        float a10 = a(f11);
        float a11 = a((i & p.f9259b) / 255.0f);
        float a12 = a(f13);
        float a13 = a(f14);
        float a14 = a((i4 & p.f9259b) / 255.0f);
        float a15 = Wv.a(f12, f9, f2, f9);
        float a16 = Wv.a(a12, a9, f2, a9);
        float a17 = Wv.a(a13, a10, f2, a10);
        float a18 = Wv.a(a14, a11, f2, a11);
        float b9 = b(a16) * 255.0f;
        float b10 = b(a17) * 255.0f;
        return Math.round(b(a18) * 255.0f) | (Math.round(b9) << 16) | (Math.round(a15 * 255.0f) << 24) | (Math.round(b10) << 8);
    }

    public static final int f(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(x.j(i, "Could not convert ", " to BackoffPolicy"));
    }

    public static final int g(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(x.j(i, "Could not convert ", " to NetworkType"));
        }
        return 6;
    }

    public static final int h(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(x.j(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final int i(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        throw new IllegalArgumentException(x.j(i, "Could not convert ", " to State"));
    }

    public static String j(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String k(Map map) {
        String str;
        if (map == null || (str = (String) map.get("Content-Type")) == null) {
            return "ISO-8859-1";
        }
        String[] split = str.split(";", 0);
        for (int i = 1; i < split.length; i++) {
            String[] split2 = split[i].trim().split("=", 0);
            if (split2.length == 2 && split2[0].equals("charset")) {
                return split2[1];
            }
        }
        return "ISO-8859-1";
    }

    public static long l(String str) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e9) {
            if ("0".equals(str) || "-1".equals(str)) {
                j.d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            Log.e("Volley", j.a("Unable to parse dateStr: %s, falling back to 0", str), e9);
            return 0L;
        }
    }

    public static final void m(LinkedHashMap linkedHashMap, String str, String str2) {
        if (str2 != null) {
            linkedHashMap.put(str, str2);
        }
    }

    public static void n(Window window, boolean z6) {
        if (Build.VERSION.SDK_INT >= 30) {
            g0.a(window, z6);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z6 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static final int o(int i) {
        Wv.n(i, com.anythink.core.express.b.a.f18313b);
        int d9 = AbstractC5050e.d(i);
        if (d9 == 0) {
            return 0;
        }
        int i4 = 1;
        if (d9 != 1) {
            i4 = 2;
            if (d9 != 2) {
                i4 = 3;
                if (d9 != 3) {
                    i4 = 4;
                    if (d9 != 4) {
                        if (d9 == 5) {
                            return 5;
                        }
                        throw new B0.c();
                    }
                }
            }
        }
        return i4;
    }

    public static void p(ViewGroup viewGroup, boolean z6) {
        if (Build.VERSION.SDK_INT >= 29) {
            D0.x.b(viewGroup, z6);
        } else if (f4207a) {
            try {
                D0.x.b(viewGroup, z6);
            } catch (NoSuchMethodError unused) {
                f4207a = false;
            }
        }
    }

    public static void q(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static f3.c r(f3.c cVar) {
        return !(cVar instanceof e) ? cVar instanceof d ? cVar : cVar instanceof Serializable ? new d(cVar) : new e(cVar) : cVar;
    }

    public abstract List d(String str, List list);
}
