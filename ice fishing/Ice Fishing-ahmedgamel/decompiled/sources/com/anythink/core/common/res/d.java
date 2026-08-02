package com.anythink.core.common.res;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.x;
import com.anythink.core.common.res.a;
import com.anythink.core.common.v.o;
import com.anythink.core.common.v.w;
import com.icefishingapp.icefishing.AbstractC4404f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f16215a = "about:blank";

    /* renamed from: d, reason: collision with root package name */
    public static final String f16216d = "foldername";

    /* renamed from: f, reason: collision with root package name */
    private static final String f16217f = "anythink_internal_resouce";

    /* renamed from: g, reason: collision with root package name */
    private static final String f16218g = "anythink_custom_resouce";

    /* renamed from: h, reason: collision with root package name */
    private static final String f16219h = "anythink_internal_extra_resource";
    private static final String i = "anythink_internal_video_resource";

    /* renamed from: j, reason: collision with root package name */
    private static final String f16220j = "anythink_internal_html_resouce";

    /* renamed from: k, reason: collision with root package name */
    private static final String f16221k = "anythink_internal_html_template";

    /* renamed from: l, reason: collision with root package name */
    private static volatile d f16222l;

    /* renamed from: m, reason: collision with root package name */
    private Context f16226m;

    /* renamed from: n, reason: collision with root package name */
    private File f16227n;

    /* renamed from: e, reason: collision with root package name */
    private final String f16225e = getClass().getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    ConcurrentHashMap<Integer, a> f16223b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    final long f16224c = 172800000;

    private d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f16226m = applicationContext;
        this.f16227n = w.a(applicationContext);
    }

    public static d a(Context context) {
        if (f16222l == null) {
            synchronized (d.class) {
                try {
                    if (f16222l == null) {
                        f16222l = new d(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16222l;
    }

    public static void c() {
        try {
            long d2 = t.b().d(1);
            String a9 = a(t.b().g()).a(1);
            long a10 = w.a(a9);
            if (a10 <= 0 || a10 <= d2 * 1.5d) {
                return;
            }
            File[] listFiles = new File(a9).listFiles();
            ArrayList arrayList = new ArrayList();
            if (listFiles != null) {
                Collections.addAll(arrayList, listFiles);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (arrayList.size() > 0) {
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    File file = (File) arrayList.get(i6);
                    if (currentTimeMillis - file.lastModified() > 172800000) {
                        try {
                            file.delete();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static String d(int i6, String str) {
        if (i6 != 4) {
            if (i6 == 5) {
                return AbstractC4404f.f(str, ".zip");
            }
            if (i6 != 6) {
                return AbstractC4404f.f(str, ".0");
            }
        }
        return str;
    }

    public final void b() {
        File[] listFiles;
        try {
            File file = new File(this.f16227n, f16220j);
            if (!file.exists() || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
                return;
            }
            for (File file2 : listFiles) {
                try {
                    if (file2.isFile() && System.currentTimeMillis() - file2.lastModified() > 86400000) {
                        file2.delete();
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public final String a() {
        return this.f16227n.getAbsolutePath();
    }

    public final String a(String str, x xVar, com.anythink.core.common.h.w wVar) {
        FileOutputStream fileOutputStream;
        byte[] bytes;
        File file = new File(this.f16227n, f16220j);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, xVar.f14158d + "_" + wVar.v() + ".html");
        try {
            bytes = str.getBytes(com.anythink.expressad.foundation.g.a.bR);
            fileOutputStream = new FileOutputStream(file2);
        } catch (Throwable unused) {
            fileOutputStream = null;
        }
        try {
            fileOutputStream.write(bytes, 0, bytes.length);
            String uri = file2.toURI().toString();
            try {
                fileOutputStream.close();
                return uri;
            } catch (Throwable unused2) {
                return uri;
            }
        } catch (Throwable unused3) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused4) {
                }
            }
            return "";
        }
    }

    public final File b(x xVar, com.anythink.core.common.h.w wVar) {
        File file = new File(new File(this.f16227n, f16220j), xVar.f14158d + "_" + wVar.v() + ".html");
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final boolean b(int i6, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(c(i6, str)).exists();
    }

    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            new File(a(3) + File.separator + str + ".0").delete();
        } catch (Throwable unused) {
        }
    }

    public final String c(int i6, String str) {
        return a(i6) + File.separator + d(i6, str);
    }

    public final void a(x xVar, com.anythink.core.common.h.w wVar) {
        try {
            File file = new File(new File(this.f16227n, f16220j), xVar.f14158d + "_" + wVar.v() + ".html");
            if (file.exists()) {
                file.delete();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i6, String str, InputStream inputStream) {
        OutputStream outputStream;
        if (str == null || inputStream == null) {
            return false;
        }
        String a9 = a(i6);
        if (TextUtils.isEmpty(a9)) {
            return false;
        }
        File file = new File(a9);
        if (!file.exists()) {
            file.mkdirs();
        }
        a a10 = a(i6, file);
        if (a10 == null) {
            return false;
        }
        a.C0092a c0092a = null;
        r1 = null;
        r1 = null;
        OutputStream outputStream2 = null;
        OutputStream outputStream3 = null;
        try {
            try {
                a.c a11 = a10.a(str);
                if (a11 == null) {
                    a.C0092a b9 = a10.b(str);
                    if (b9 != null) {
                        try {
                            outputStream2 = b9.a(0);
                            byte[] bArr = new byte[2048];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                outputStream2.write(bArr, 0, read);
                            }
                            b9.a();
                            outputStream2.close();
                        } catch (Exception e9) {
                            e = e9;
                            OutputStream outputStream4 = outputStream2;
                            c0092a = b9;
                            outputStream = outputStream4;
                            try {
                                e.toString();
                                if (c0092a != null) {
                                    try {
                                        c0092a.b();
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                        if (outputStream != null) {
                                        }
                                    }
                                }
                                if (outputStream != null) {
                                    return false;
                                }
                                try {
                                    outputStream.close();
                                    return false;
                                } catch (IOException unused) {
                                    return false;
                                }
                            } catch (Throwable th) {
                                outputStream3 = outputStream;
                                th = th;
                                if (outputStream3 != null) {
                                }
                                throw th;
                            }
                        }
                    }
                } else {
                    a11.a().close();
                }
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException unused2) {
                    }
                }
                return true;
            } catch (Throwable th2) {
                th = th2;
                if (outputStream3 != null) {
                    try {
                        outputStream3.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            outputStream = null;
        }
    }

    public final FileInputStream a(int i6, String str) {
        InputStream a9;
        if (i6 != 4) {
            String a10 = a(i6);
            if (TextUtils.isEmpty(a10)) {
                return null;
            }
            File file = new File(a10);
            if (!file.exists()) {
                file.mkdirs();
            }
            a a11 = a(i6, file);
            if (a11 != null) {
                try {
                    a.c a12 = a11.a(str);
                    if (a12 != null && (a9 = a12.a()) != null) {
                        return (FileInputStream) a9;
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
            return null;
        }
        try {
            return new FileInputStream(new File(c(4, str)));
        } catch (Throwable unused) {
            return null;
        }
    }

    private synchronized a a(int i6, File file) {
        a aVar;
        aVar = this.f16223b.get(Integer.valueOf(i6));
        if (aVar == null) {
            try {
                aVar = a.a(file, t.b().d(i6));
                this.f16223b.put(Integer.valueOf(i6), aVar);
            } catch (Throwable th) {
                if (t.b().F()) {
                    Log.e(this.f16225e, "Create DiskCache error.");
                    th.printStackTrace();
                }
            }
        }
        return aVar;
    }

    public final String a(int i6) {
        String str;
        if (i6 == 1) {
            str = f16217f;
        } else if (i6 == 3) {
            str = f16219h;
        } else if (i6 == 4) {
            str = i;
        } else if (i6 != 5 && i6 != 6) {
            str = f16218g;
        } else {
            str = f16221k;
        }
        return new File(this.f16227n, str).getAbsolutePath();
    }

    public final String a(String str) {
        String c9 = c(6, o.a(str));
        try {
            if (!new File(c9).exists()) {
                return "";
            }
            String str2 = c9 + File.separator + "index.html";
            return !new File(str2).exists() ? "" : str2;
        } catch (Throwable unused) {
            return "";
        }
    }
}
