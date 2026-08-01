package X0;

import D.RunnableC0282a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import i1.AbstractC4579a;
import i1.C4580b;
import j1.AbstractC4599c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
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
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f3639a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f3640b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f3641c = {80, 75, 3, 4};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f3642d = {31, -117, 8};

    public static C a(final String str, Callable callable, RunnableC0282a runnableC0282a) {
        i a9 = str == null ? null : c1.g.f5521b.a(str);
        C c9 = a9 != null ? new C(a9) : null;
        HashMap hashMap = f3639a;
        if (str != null && hashMap.containsKey(str)) {
            c9 = (C) hashMap.get(str);
        }
        if (c9 != null) {
            if (runnableC0282a != null) {
                runnableC0282a.run();
            }
            return c9;
        }
        C c10 = new C(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i = 0;
            c10.b(new y() { // from class: X0.k
                @Override // X0.y
                public final void onResult(Object obj) {
                    switch (i) {
                        case 0:
                            HashMap hashMap2 = m.f3639a;
                            hashMap2.remove(str);
                            atomicBoolean.set(true);
                            if (hashMap2.size() == 0) {
                                m.j();
                                break;
                            }
                            break;
                        default:
                            HashMap hashMap3 = m.f3639a;
                            hashMap3.remove(str);
                            atomicBoolean.set(true);
                            if (hashMap3.size() == 0) {
                                m.j();
                                break;
                            }
                            break;
                    }
                }
            });
            final int i6 = 1;
            c10.a(new y() { // from class: X0.k
                @Override // X0.y
                public final void onResult(Object obj) {
                    switch (i6) {
                        case 0:
                            HashMap hashMap2 = m.f3639a;
                            hashMap2.remove(str);
                            atomicBoolean.set(true);
                            if (hashMap2.size() == 0) {
                                m.j();
                                break;
                            }
                            break;
                        default:
                            HashMap hashMap3 = m.f3639a;
                            hashMap3.remove(str);
                            atomicBoolean.set(true);
                            if (hashMap3.size() == 0) {
                                m.j();
                                break;
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                hashMap.put(str, c10);
                if (hashMap.size() == 1) {
                    j();
                }
            }
        }
        return c10;
    }

    public static A b(Context context, String str, String str2) {
        i a9 = str2 == null ? null : c1.g.f5521b.a(str2);
        if (a9 != null) {
            return new A(a9);
        }
        try {
            return c(context, context.getAssets().open(str), str2);
        } catch (IOException e9) {
            return new A(e9);
        }
    }

    public static A c(Context context, InputStream inputStream, String str) {
        i a9 = str == null ? null : c1.g.f5521b.a(str);
        if (a9 != null) {
            return new A(a9);
        }
        try {
            y8.r b9 = y8.b.b(y8.b.h(inputStream));
            if (i(b9, f3641c).booleanValue()) {
                return g(context, new ZipInputStream(new y8.q(b9)), str);
            }
            if (i(b9, f3642d).booleanValue()) {
                return d(str, new GZIPInputStream(new y8.q(b9)));
            }
            String[] strArr = AbstractC4579a.f38029x;
            return e(new C4580b(b9), str, true);
        } catch (IOException e9) {
            return new A(e9);
        }
    }

    public static A d(String str, InputStream inputStream) {
        y8.r b9 = y8.b.b(y8.b.h(inputStream));
        String[] strArr = AbstractC4579a.f38029x;
        return e(new C4580b(b9), str, true);
    }

    public static A e(C4580b c4580b, String str, boolean z3) {
        i a9;
        try {
            if (str == null) {
                a9 = null;
            } else {
                try {
                    a9 = c1.g.f5521b.a(str);
                } catch (Exception e9) {
                    A a10 = new A(e9);
                    if (z3) {
                        j1.j.b(c4580b);
                    }
                    return a10;
                }
            }
            if (a9 != null) {
                A a11 = new A(a9);
                if (z3) {
                    j1.j.b(c4580b);
                }
                return a11;
            }
            i a12 = h1.r.a(c4580b);
            if (str != null) {
                c1.g.f5521b.f5522a.b(str, a12);
            }
            A a13 = new A(a12);
            if (z3) {
                j1.j.b(c4580b);
            }
            return a13;
        } catch (Throwable th) {
            if (z3) {
                j1.j.b(c4580b);
            }
            throw th;
        }
    }

    public static A f(Context context, String str, int i) {
        i a9 = str == null ? null : c1.g.f5521b.a(str);
        if (a9 != null) {
            return new A(a9);
        }
        try {
            y8.r b9 = y8.b.b(y8.b.h(context.getResources().openRawResource(i)));
            if (i(b9, f3641c).booleanValue()) {
                return g(context, new ZipInputStream(new y8.q(b9)), str);
            }
            if (!i(b9, f3642d).booleanValue()) {
                String[] strArr = AbstractC4579a.f38029x;
                return e(new C4580b(b9), str, true);
            }
            try {
                return d(str, new GZIPInputStream(new y8.q(b9)));
            } catch (IOException e9) {
                return new A(e9);
            }
        } catch (Resources.NotFoundException e10) {
            return new A(e10);
        }
    }

    public static A g(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return h(context, zipInputStream, str);
        } finally {
            j1.j.b(zipInputStream);
        }
    }

    public static A h(Context context, ZipInputStream zipInputStream, String str) {
        i a9;
        x xVar;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (str == null) {
            a9 = null;
        } else {
            try {
                a9 = c1.g.f5521b.a(str);
            } catch (IOException e9) {
                return new A(e9);
            }
        }
        if (a9 != null) {
            return new A(a9);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        i iVar = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                y8.r b9 = y8.b.b(y8.b.h(zipInputStream));
                String[] strArr = AbstractC4579a.f38029x;
                iVar = e(new C4580b(b9), null, false).f3575a;
            } else {
                if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                    if (!name.contains(".ttf") && !name.contains(".otf")) {
                        zipInputStream.closeEntry();
                    }
                    String[] split = name.split("/");
                    String str2 = split[split.length - 1];
                    String str3 = str2.split("\\.")[0];
                    if (context == null) {
                        return new A(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
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
                        AbstractC4599c.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th3);
                    }
                    Typeface createFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        AbstractC4599c.b("Failed to delete temp font file " + file.getAbsolutePath() + com.anythink.core.common.d.j.f12378z);
                    }
                    hashMap2.put(str3, createFromFile);
                }
                String[] split2 = name.split("/");
                hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (iVar == null) {
            return new A(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) iVar.c()).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    xVar = null;
                    break;
                }
                xVar = (x) it.next();
                if (xVar.f3713d.equals(str4)) {
                    break;
                }
            }
            if (xVar != null) {
                xVar.f3715f = j1.j.d((Bitmap) entry.getValue(), xVar.f3710a, xVar.f3711b);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            boolean z3 = false;
            for (c1.c cVar : iVar.f3618f.values()) {
                if (cVar.f5509a.equals(entry2.getKey())) {
                    cVar.f5512d = (Typeface) entry2.getValue();
                    z3 = true;
                }
            }
            if (!z3) {
                AbstractC4599c.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (hashMap.isEmpty()) {
            Iterator it2 = ((HashMap) iVar.c()).entrySet().iterator();
            while (it2.hasNext()) {
                x xVar2 = (x) ((Map.Entry) it2.next()).getValue();
                if (xVar2 == null) {
                    return null;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                String str5 = xVar2.f3713d;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] decode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                        if (decodeByteArray != null) {
                            xVar2.f3715f = j1.j.d(decodeByteArray, xVar2.f3710a, xVar2.f3711b);
                        }
                    } catch (IllegalArgumentException e10) {
                        AbstractC4599c.c("data URL did not have correct base64 format.", e10);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            c1.g.f5521b.f5522a.b(str, iVar);
        }
        return new A(iVar);
    }

    public static Boolean i(y8.r rVar, byte[] bArr) {
        try {
            y8.r b9 = y8.b.b(new y8.o(rVar));
            for (byte b10 : bArr) {
                if (b9.z() != b10) {
                    return Boolean.FALSE;
                }
            }
            b9.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            AbstractC4599c.f38302a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void j() {
        ArrayList arrayList = new ArrayList(f3640b);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public static String k(Context context, int i) {
        return D.y.m(i, (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", new StringBuilder("rawRes"));
    }
}
