package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
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

/* loaded from: classes.dex */
public abstract class gyg {
    public static final HashMap a = new HashMap();
    public static final HashSet b = new HashSet();
    public static final byte[] c = {80, 75, 3, 4};
    public static final byte[] d = {31, -117, 8};

    public static pzg a(final String str, Callable callable, Runnable runnable) {
        ayg a2 = str == null ? null : byg.b.a(str);
        pzg pzgVar = a2 != null ? new pzg(a2) : null;
        HashMap hashMap = a;
        if (str != null && hashMap.containsKey(str)) {
            pzgVar = (pzg) hashMap.get(str);
        }
        if (pzgVar != null) {
            if (runnable != null) {
                runnable.run();
            }
            return pzgVar;
        }
        pzg pzgVar2 = new pzg(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i = 0;
            pzgVar2.b(new izg() { // from class: fyg
                @Override // defpackage.izg
                public final void onResult(Object obj) {
                    switch (i) {
                        case 0:
                            HashMap hashMap2 = gyg.a;
                            hashMap2.remove(str);
                            atomicBoolean.set(true);
                            if (hashMap2.size() == 0) {
                                gyg.k();
                                break;
                            }
                            break;
                        default:
                            HashMap hashMap3 = gyg.a;
                            hashMap3.remove(str);
                            atomicBoolean.set(true);
                            if (hashMap3.size() == 0) {
                                gyg.k();
                                break;
                            }
                            break;
                    }
                }
            });
            final int i2 = 1;
            pzgVar2.a(new izg() { // from class: fyg
                @Override // defpackage.izg
                public final void onResult(Object obj) {
                    switch (i2) {
                        case 0:
                            HashMap hashMap2 = gyg.a;
                            hashMap2.remove(str);
                            atomicBoolean.set(true);
                            if (hashMap2.size() == 0) {
                                gyg.k();
                                break;
                            }
                            break;
                        default:
                            HashMap hashMap3 = gyg.a;
                            hashMap3.remove(str);
                            atomicBoolean.set(true);
                            if (hashMap3.size() == 0) {
                                gyg.k();
                                break;
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                hashMap.put(str, pzgVar2);
                if (hashMap.size() == 1) {
                    k();
                }
            }
        }
        return pzgVar2;
    }

    public static nzg b(Context context, String str, String str2) {
        ayg a2 = str2 == null ? null : byg.b.a(str2);
        if (a2 != null) {
            return new nzg(a2);
        }
        try {
            return c(context, context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new nzg(e);
        }
    }

    public static nzg c(Context context, InputStream inputStream, String str) {
        ayg a2 = str == null ? null : byg.b.a(str);
        if (a2 != null) {
            return new nzg(a2);
        }
        try {
            ikn iknVar = new ikn(fxf.T(inputStream));
            int i = 1;
            if (j(iknVar, c).booleanValue()) {
                return h(context, new ZipInputStream(new fi3(iknVar, i)), str);
            }
            if (j(iknVar, d).booleanValue()) {
                return d(new GZIPInputStream(new fi3(iknVar, i)), str);
            }
            String[] strArr = b7f.e;
            return e(new m7f(iknVar), str, true);
        } catch (IOException e) {
            return new nzg(e);
        }
    }

    public static nzg d(InputStream inputStream, String str) {
        ikn iknVar = new ikn(fxf.T(inputStream));
        String[] strArr = b7f.e;
        return e(new m7f(iknVar), str, true);
    }

    public static nzg e(m7f m7fVar, String str, boolean z) {
        ayg a2;
        try {
            if (str == null) {
                a2 = null;
            } else {
                try {
                    a2 = byg.b.a(str);
                } catch (Exception e) {
                    nzg nzgVar = new nzg(e);
                    if (z) {
                        rvt.b(m7fVar);
                    }
                    return nzgVar;
                }
            }
            if (a2 != null) {
                nzg nzgVar2 = new nzg(a2);
                if (z) {
                    rvt.b(m7fVar);
                }
                return nzgVar2;
            }
            ayg a3 = hyg.a(m7fVar);
            if (str != null) {
                byg.b.a.put(str, a3);
            }
            nzg nzgVar3 = new nzg(a3);
            if (z) {
                rvt.b(m7fVar);
            }
            return nzgVar3;
        } catch (Throwable th) {
            if (z) {
                rvt.b(m7fVar);
            }
            throw th;
        }
    }

    public static pzg f(Context context, final String str, final int i) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return a(str, new Callable() { // from class: eyg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return gyg.g(context2, str, i);
            }
        }, null);
    }

    public static nzg g(Context context, String str, int i) {
        ayg a2 = str == null ? null : byg.b.a(str);
        if (a2 != null) {
            return new nzg(a2);
        }
        try {
            ikn iknVar = new ikn(fxf.T(context.getResources().openRawResource(i)));
            int i2 = 1;
            if (j(iknVar, c).booleanValue()) {
                return h(context, new ZipInputStream(new fi3(iknVar, i2)), str);
            }
            if (!j(iknVar, d).booleanValue()) {
                String[] strArr = b7f.e;
                return e(new m7f(iknVar), str, true);
            }
            try {
                return d(new GZIPInputStream(new fi3(iknVar, i2)), str);
            } catch (IOException e) {
                return new nzg(e);
            }
        } catch (Resources.NotFoundException e2) {
            return new nzg(e2);
        }
    }

    public static nzg h(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return i(context, zipInputStream, str);
        } finally {
            rvt.b(zipInputStream);
        }
    }

    public static nzg i(Context context, ZipInputStream zipInputStream, String str) {
        ayg a2;
        hzg hzgVar;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (str == null) {
            a2 = null;
        } else {
            try {
                a2 = byg.b.a(str);
            } catch (IOException e) {
                return new nzg(e);
            }
        }
        if (a2 != null) {
            return new nzg(a2);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        ayg aygVar = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                ikn iknVar = new ikn(fxf.T(zipInputStream));
                String[] strArr = b7f.e;
                aygVar = e(new m7f(iknVar), null, false).a;
            } else {
                if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                    if (!name.contains(".ttf") && !name.contains(".otf")) {
                        zipInputStream.closeEntry();
                    }
                    String[] split = name.split("/");
                    String str2 = split[split.length - 1];
                    String str3 = str2.split("\\.")[0];
                    if (context == null) {
                        return new nzg(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
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
                        } finally {
                        }
                    } catch (Throwable th3) {
                        psg.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th3);
                    }
                    Typeface createFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        psg.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    hashMap2.put(str3, createFromFile);
                }
                String[] split2 = name.split("/");
                hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (aygVar == null) {
            return new nzg(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) aygVar.c()).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    hzgVar = null;
                    break;
                }
                hzgVar = (hzg) it.next();
                if (hzgVar.d.equals(str4)) {
                    break;
                }
            }
            if (hzgVar != null) {
                hzgVar.f = rvt.d((Bitmap) entry.getValue(), hzgVar.a, hzgVar.b);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            boolean z = false;
            for (lpc lpcVar : aygVar.f.values()) {
                if (lpcVar.a.equals(entry2.getKey())) {
                    lpcVar.d = (Typeface) entry2.getValue();
                    z = true;
                }
            }
            if (!z) {
                psg.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (hashMap.isEmpty()) {
            Iterator it2 = ((HashMap) aygVar.c()).entrySet().iterator();
            while (it2.hasNext()) {
                hzg hzgVar2 = (hzg) ((Map.Entry) it2.next()).getValue();
                if (hzgVar2 == null) {
                    return null;
                }
                String str5 = hzgVar2.d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] decode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                        if (decodeByteArray != null) {
                            hzgVar2.f = rvt.d(decodeByteArray, hzgVar2.a, hzgVar2.b);
                        }
                    } catch (IllegalArgumentException e2) {
                        psg.c("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            byg.b.a.put(str, aygVar);
        }
        return new nzg(aygVar);
    }

    public static Boolean j(ikn iknVar, byte[] bArr) {
        try {
            ikn peek = iknVar.peek();
            for (byte b2 : bArr) {
                if (peek.readByte() != b2) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            psg.a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void k() {
        ArrayList arrayList = new ArrayList(b);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        l1j.f();
    }

    public static String l(Context context, int i) {
        StringBuilder sb = new StringBuilder("rawRes");
        sb.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        sb.append(i);
        return sb.toString();
    }
}
