package com.anythink.core.common.n.a;

import android.text.TextUtils;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f15573a;

    /* renamed from: c, reason: collision with root package name */
    private volatile i[] f15575c;

    /* renamed from: d, reason: collision with root package name */
    private volatile k f15576d = null;

    /* renamed from: e, reason: collision with root package name */
    private i f15577e = null;

    /* renamed from: b, reason: collision with root package name */
    private final j<String, l[]> f15574b = new j<>();

    private c() {
    }

    public static c a() {
        if (f15573a == null) {
            synchronized (c.class) {
                try {
                    if (f15573a == null) {
                        f15573a = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f15573a;
    }

    private synchronized void c() {
        this.f15574b.clear();
    }

    public final synchronized boolean b() {
        if (this.f15575c != null) {
            if (this.f15575c.length > 0) {
                return true;
            }
        }
        return false;
    }

    private static String[] b(l[] lVarArr) {
        if (lVarArr == null || lVarArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(lVarArr.length);
        for (l lVar : lVarArr) {
            arrayList.add(lVar.f15632g);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private l[] c(h hVar) {
        l[] lVarArr;
        l[] lVarArr2 = this.f15574b.get(hVar.f15604a);
        Exception e9 = null;
        if (lVarArr2 != null && lVarArr2.length != 0) {
            ArrayList arrayList = new ArrayList(lVarArr2.length);
            for (l lVar : lVarArr2) {
                if (lVar != null && !TextUtils.isEmpty(lVar.f15632g)) {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    int i = lVar.i;
                    if (i == -1 || lVar.f15634j + i > currentTimeMillis) {
                        arrayList.add(lVar);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                lVarArr = (l[]) arrayList.toArray(new l[arrayList.size()]);
                if (lVarArr == null && lVarArr.length > 0) {
                    return lVarArr;
                }
                if (this.f15575c == null && this.f15575c.length != 0) {
                    for (i iVar : this.f15575c) {
                        try {
                            lVarArr2 = iVar.a(hVar);
                            if (lVarArr2 != null && lVarArr2.length > 0) {
                                this.f15577e = iVar;
                                break;
                            }
                        } catch (Exception e10) {
                            e9 = e10;
                        }
                    }
                    if (lVarArr2 != null && lVarArr2.length != 0) {
                        l[] a9 = a(lVarArr2);
                        if (a9.length != 0) {
                            this.f15574b.put(hVar.f15604a, a9);
                            return a9;
                        }
                        throw new UnknownHostException("no A/AAAA records");
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(hVar.f15604a);
                    sb.append(" ");
                    sb.append(e9 != null ? e9.getMessage() : "");
                    throw new UnknownHostException(sb.toString());
                }
                throw new IllegalArgumentException("no resolver");
            }
        }
        lVarArr = null;
        if (lVarArr == null) {
        }
        if (this.f15575c == null) {
        }
        throw new IllegalArgumentException("no resolver");
    }

    public final synchronized void a(k kVar, i[] iVarArr) {
        if (kVar == null) {
            try {
                kVar = k.f15619j;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f15576d = kVar;
        this.f15575c = iVarArr;
    }

    private l[] b(String str) {
        return b(new h(str));
    }

    private l[] b(h hVar) {
        if (hVar != null) {
            String str = hVar.f15604a;
            if (str != null && !str.trim().isEmpty()) {
                if (a(hVar.f15604a)) {
                    return new l[]{new l(hVar.f15604a, 1, -1, new Date().getTime(), 0, "")};
                }
                return c(hVar);
            }
            throw new IllegalArgumentException("empty domain " + hVar.f15604a);
        }
        throw new IOException("null domain");
    }

    private static l[] a(l[] lVarArr) {
        ArrayList arrayList = new ArrayList(lVarArr.length);
        for (l lVar : lVarArr) {
            if (lVar != null && (lVar.a() || lVar.b())) {
                arrayList.add(lVar);
            }
        }
        return (l[]) arrayList.toArray(new l[arrayList.size()]);
    }

    private static boolean a(String str) {
        if (str == null || str.length() < 7 || str.length() > 15 || str.contains("-")) {
            return false;
        }
        try {
            int indexOf = str.indexOf(46);
            if (indexOf != -1 && Integer.parseInt(str.substring(0, indexOf)) > 255) {
                return false;
            }
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(46, i);
            if (indexOf2 != -1 && Integer.parseInt(str.substring(i, indexOf2)) > 255) {
                return false;
            }
            int i4 = indexOf2 + 1;
            int indexOf3 = str.indexOf(46, i4);
            if (indexOf3 != -1 && Integer.parseInt(str.substring(i4, indexOf3)) > 255 && Integer.parseInt(str.substring(indexOf3 + 1, str.length() - 1)) > 255) {
                if (str.charAt(str.length() - 1) != '.') {
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[Catch: all -> 0x0021, LOOP:1: B:20:0x0040->B:22:0x0043, LOOP_END, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x000d, B:10:0x0017, B:12:0x0023, B:14:0x002b, B:16:0x0039, B:19:0x003d, B:20:0x0040, B:22:0x0043, B:24:0x004e), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized m a(h hVar) {
        String[] strArr;
        try {
            l[] b9 = b(hVar);
            if (b9 != null && b9.length != 0) {
                ArrayList arrayList = new ArrayList(b9.length);
                for (l lVar : b9) {
                    arrayList.add(lVar.f15632g);
                }
                if (arrayList.size() != 0) {
                    strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                    if (strArr != null && strArr.length != 0) {
                        InetAddress[] inetAddressArr = new InetAddress[strArr.length];
                        for (int i = 0; i < strArr.length; i++) {
                            inetAddressArr[i] = InetAddress.getByName(strArr[i]);
                        }
                        return new m(inetAddressArr, this.f15577e);
                    }
                    return null;
                }
            }
            strArr = null;
            if (strArr != null) {
                InetAddress[] inetAddressArr2 = new InetAddress[strArr.length];
                while (i < strArr.length) {
                }
                return new m(inetAddressArr2, this.f15577e);
            }
            return null;
        } finally {
        }
    }

    private static l[] c(l[] lVarArr) {
        if (lVarArr == null || lVarArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(lVarArr.length);
        for (l lVar : lVarArr) {
            if (lVar != null && !TextUtils.isEmpty(lVar.f15632g)) {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                int i = lVar.i;
                if (i == -1 || lVar.f15634j + i > currentTimeMillis) {
                    arrayList.add(lVar);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (l[]) arrayList.toArray(new l[arrayList.size()]);
    }
}
