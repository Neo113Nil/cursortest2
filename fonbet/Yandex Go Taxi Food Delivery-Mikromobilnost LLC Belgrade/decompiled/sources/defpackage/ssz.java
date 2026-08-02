package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.parser.moshi.a;
import com.airbnb.lottie.parser.moshi.c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.ssl.Alerts;

/* loaded from: classes.dex */
public abstract class ssz {
    public static final HashMap a = new HashMap();
    public static final HashSet b = new HashSet();
    public static final byte[] c = {Alerts.alert_internal_error, 75, 3, 4};
    public static final byte[] d = {31, -117, 8};

    public static nuz a(final String str, Callable callable, Runnable runnable) {
        nsz a2 = str == null ? null : osz.b.a(str);
        nuz nuzVar = a2 != null ? new nuz(a2) : null;
        HashMap hashMap = a;
        if (str != null && hashMap.containsKey(str)) {
            nuzVar = (nuz) hashMap.get(str);
        }
        if (nuzVar != null) {
            if (runnable != null) {
                runnable.run();
            }
            return nuzVar;
        }
        final int i = 0;
        nuz nuzVar2 = new nuz(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            nuzVar2.b(new xtz() { // from class: qsz
                @Override // defpackage.xtz
                public final void onResult(Object obj) {
                    int i2 = i;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    switch (i2) {
                        case 0:
                            HashMap hashMap2 = ssz.a;
                            hashMap2.remove(str2);
                            atomicBoolean2.set(true);
                            if (hashMap2.size() == 0) {
                                ssz.m();
                                break;
                            }
                            break;
                        default:
                            HashMap hashMap3 = ssz.a;
                            hashMap3.remove(str2);
                            atomicBoolean2.set(true);
                            if (hashMap3.size() == 0) {
                                ssz.m();
                                break;
                            }
                            break;
                    }
                }
            });
            final int i2 = 1;
            nuzVar2.a(new xtz() { // from class: qsz
                @Override // defpackage.xtz
                public final void onResult(Object obj) {
                    int i22 = i2;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    switch (i22) {
                        case 0:
                            HashMap hashMap2 = ssz.a;
                            hashMap2.remove(str2);
                            atomicBoolean2.set(true);
                            if (hashMap2.size() == 0) {
                                ssz.m();
                                break;
                            }
                            break;
                        default:
                            HashMap hashMap3 = ssz.a;
                            hashMap3.remove(str2);
                            atomicBoolean2.set(true);
                            if (hashMap3.size() == 0) {
                                ssz.m();
                                break;
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                hashMap.put(str, nuzVar2);
                if (hashMap.size() == 1) {
                    m();
                }
            }
        }
        return nuzVar2;
    }

    public static euz b(Context context, String str, String str2) {
        nsz a2 = str2 == null ? null : osz.b.a(str2);
        if (a2 != null) {
            return new euz(a2);
        }
        try {
            return c(context, context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new euz(e);
        }
    }

    public static euz c(Context context, InputStream inputStream, String str) {
        nsz a2 = str == null ? null : osz.b.a(str);
        if (a2 != null) {
            return new euz(a2);
        }
        try {
            jci0 jci0Var = new jci0(vng.H(inputStream));
            if (l(jci0Var, c).booleanValue()) {
                return j(context, new ZipInputStream(new wp6(jci0Var, 1)), str);
            }
            if (l(jci0Var, d).booleanValue()) {
                return d(new GZIPInputStream(new wp6(jci0Var, 1)), str);
            }
            String[] strArr = a.x;
            return e(new c(jci0Var), str, true);
        } catch (IOException e) {
            return new euz(e);
        }
    }

    public static euz d(InputStream inputStream, String str) {
        jci0 jci0Var = new jci0(vng.H(inputStream));
        String[] strArr = a.x;
        return e(new c(jci0Var), str, true);
    }

    public static euz e(c cVar, String str, boolean z) {
        nsz a2;
        try {
            if (str == null) {
                a2 = null;
            } else {
                try {
                    a2 = osz.b.a(str);
                } catch (Exception e) {
                    euz euzVar = new euz(e);
                    if (z) {
                        zw21.b(cVar);
                    }
                    return euzVar;
                }
            }
            if (a2 != null) {
                euz euzVar2 = new euz(a2);
                if (z) {
                    zw21.b(cVar);
                }
                return euzVar2;
            }
            nsz a3 = tsz.a(cVar);
            if (str != null) {
                osz.b.a.d(str, a3);
            }
            euz euzVar3 = new euz(a3);
            if (z) {
                zw21.b(cVar);
            }
            return euzVar3;
        } catch (Throwable th) {
            if (z) {
                zw21.b(cVar);
            }
            throw th;
        }
    }

    public static nuz f(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return a(str, new Callable() { // from class: rsz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return ssz.g(context2, i, str);
            }
        }, null);
    }

    public static euz g(Context context, int i, String str) {
        nsz a2 = str == null ? null : osz.b.a(str);
        if (a2 != null) {
            return new euz(a2);
        }
        try {
            jci0 jci0Var = new jci0(vng.H(context.getResources().openRawResource(i)));
            if (l(jci0Var, c).booleanValue()) {
                return j(context, new ZipInputStream(new wp6(jci0Var, 1)), str);
            }
            if (!l(jci0Var, d).booleanValue()) {
                String[] strArr = a.x;
                return e(new c(jci0Var), str, true);
            }
            try {
                return d(new GZIPInputStream(new wp6(jci0Var, 1)), str);
            } catch (IOException e) {
                return new euz(e);
            }
        } catch (Resources.NotFoundException e2) {
            return new euz(e2);
        }
    }

    public static nuz h(Context context, String str) {
        return i(context, str, "url_" + str);
    }

    public static nuz i(Context context, String str, String str2) {
        return a(str2, new psz(0, context, str, str2), null);
    }

    public static euz j(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return k(context, zipInputStream, str);
        } finally {
            zw21.b(zipInputStream);
        }
    }

    public static euz k(Context context, ZipInputStream zipInputStream, String str) {
        nsz a2;
        wtz wtzVar;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (str == null) {
            a2 = null;
        } else {
            try {
                a2 = osz.b.a(str);
            } catch (IOException e) {
                return new euz(e);
            }
        }
        if (a2 != null) {
            return new euz(a2);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        nsz nszVar = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                jci0 jci0Var = new jci0(vng.H(zipInputStream));
                String[] strArr = a.x;
                nszVar = e(new c(jci0Var), null, false).a;
            } else {
                if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                    if (!name.contains(".ttf") && !name.contains(".otf")) {
                        zipInputStream.closeEntry();
                    }
                    String[] split = name.split("/");
                    String str2 = split[split.length - 1];
                    String str3 = str2.split("\\.")[0];
                    if (context == null) {
                        return new euz(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                    }
                    File file = new File(context.getCacheDir(), str2);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = zipInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    fileOutputStream2.write(bArr, 0, read);
                                }
                                fileOutputStream2.flush();
                                fileOutputStream2.close();
                                fileOutputStream.close();
                            } catch (Throwable th) {
                                try {
                                    fileOutputStream2.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable unused) {
                        lgz.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ");
                    }
                    Typeface createFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        lgz.b("Failed to delete temp font file " + file.getAbsolutePath() + Extension.DOT_CHAR);
                    }
                    hashMap2.put(str3, createFromFile);
                }
                String[] split2 = name.split("/");
                hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (nszVar == null) {
            return new euz(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) nszVar.c()).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    wtzVar = null;
                    break;
                }
                wtzVar = (wtz) it.next();
                if (wtzVar.d.equals(str4)) {
                    break;
                }
            }
            if (wtzVar != null) {
                wtzVar.f = zw21.d((Bitmap) entry.getValue(), wtzVar.a, wtzVar.b);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            boolean z = false;
            for (xxr xxrVar : nszVar.f.values()) {
                if (xxrVar.a().equals(entry2.getKey())) {
                    xxrVar.d((Typeface) entry2.getValue());
                    z = true;
                }
            }
            if (!z) {
                lgz.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (hashMap.isEmpty()) {
            Iterator it2 = ((HashMap) nszVar.c()).entrySet().iterator();
            while (it2.hasNext()) {
                wtz wtzVar2 = (wtz) ((Map.Entry) it2.next()).getValue();
                if (wtzVar2 == null) {
                    return null;
                }
                String str5 = wtzVar2.d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] decode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                        if (decodeByteArray != null) {
                            wtzVar2.f = zw21.d(decodeByteArray, wtzVar2.a, wtzVar2.b);
                        }
                    } catch (IllegalArgumentException unused2) {
                        lgz.c("data URL did not have correct base64 format.");
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            osz.b.a.d(str, nszVar);
        }
        return new euz(nszVar);
    }

    public static Boolean l(jci0 jci0Var, byte[] bArr) {
        try {
            jci0 peek = jci0Var.peek();
            for (byte b2 : bArr) {
                if (peek.readByte() != b2) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            lgz.a.getClass();
            AsyncUpdates asyncUpdates = upx.a;
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void m() {
        ArrayList arrayList = new ArrayList(b);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        ny61.u();
    }

    public static String n(int i, Context context) {
        return unr0.m(i, (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", new StringBuilder("rawRes"));
    }
}
