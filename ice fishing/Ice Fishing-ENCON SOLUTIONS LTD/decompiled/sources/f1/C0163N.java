package f1;

import F.C0038n;
import a.AbstractC0083a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import x0.AbstractC1064a;
import x0.C1065b;

/* renamed from: f1.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0163N implements g.o, o0.h {
    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static x0.e d(Context context, String[] strArr, String str, C0038n c0038n) {
        String[] g2 = g(context);
        int length = g2.length;
        int i2 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i2 >= length) {
                return null;
            }
            String str2 = g2[i2];
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i3 = i4;
                }
            }
            if (zipFile != null) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    if (i5 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c2 = File.separatorChar;
                            sb.append(c2);
                            sb.append(str3);
                            sb.append(c2);
                            sb.append(str);
                            String sb2 = sb.toString();
                            c0038n.e("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                x0.e eVar = new x0.e(23, false);
                                eVar.f8530b = zipFile;
                                eVar.f8531c = entry;
                                return eVar;
                            }
                        }
                        i5 = i6;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i2++;
        }
    }

    public static String[] f(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c2 = File.separatorChar;
        sb.append(c2);
        sb.append("([^\\");
        sb.append(c2);
        sb.append("]*)");
        sb.append(c2);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : g(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static String[] g(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // o0.h
    public void c(Object obj, Object obj2) {
        x0.c cVar = (x0.c) ((C1065b) obj).q();
        x0.f fVar = new x0.f((D0.d) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i2 = AbstractC1064a.f8524a;
        obtain.writeInt(1);
        AbstractC0083a.z(obtain, AbstractC0083a.y(obtain, 20293));
        obtain.writeStrongBinder(fVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            cVar.f8525a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // g.o
    public boolean e(g.t tVar) {
        return false;
    }

    @Override // g.o
    public void a(g.j jVar, boolean z2) {
    }
}
