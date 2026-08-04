package com.gamericefishpro.space.i9;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v5 implements com.gamericefishpro.space.ta.d, z5 {
    public static final e5 e = new e5(3);
    public final Object d;

    public /* synthetic */ v5(Object obj) {
        this.d = obj;
    }

    @Override // com.gamericefishpro.space.i9.z5
    public boolean a(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((z5[]) this.d)[i].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.gamericefishpro.space.i9.z5
    public h6 b(Class cls) {
        for (int i = 0; i < 2; i++) {
            z5 z5Var = ((z5[]) this.d)[i];
            if (z5Var.a(cls)) {
                return z5Var.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public Object c() {
        d4 d4Var = (d4) this.d;
        ContentResolver contentResolver = d4Var.a;
        Uri uri = d4Var.b;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                return Collections.EMPTY_MAP;
            }
            try {
                Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uri, d4.j, null, null, null);
                try {
                    if (cursorQuery == null) {
                        Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                        Map map = Collections.EMPTY_MAP;
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map;
                    }
                    int count = cursorQuery.getCount();
                    if (count == 0) {
                        Map map2 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return map2;
                    }
                    Map eVar = count <= 256 ? new com.gamericefishpro.space.t.e(count) : new HashMap(count, 1.0f);
                    while (cursorQuery.moveToNext()) {
                        eVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    if (cursorQuery.isAfterLast()) {
                        cursorQuery.close();
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        return eVar;
                    }
                    Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                    Map map3 = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    contentProviderClientAcquireUnstableContentProviderClient.release();
                    return map3;
                } catch (Throwable th) {
                    if (cursorQuery == null) {
                        throw th;
                    }
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (RemoteException e2) {
                Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e2);
                Map map4 = Collections.EMPTY_MAP;
                contentProviderClientAcquireUnstableContentProviderClient.release();
                return map4;
            }
        } catch (Throwable th3) {
            contentProviderClientAcquireUnstableContentProviderClient.release();
            throw th3;
        }
    }

    public void d(int i, Object obj, i6 i6Var) {
        p4 p4Var = (p4) obj;
        x4 x4Var = (x4) this.d;
        x4Var.a0((i << 3) | 2);
        x4Var.a0(p4Var.b(i6Var));
        i6Var.e(p4Var, x4Var.g);
    }

    public void e(int i, Object obj, i6 i6Var) {
        x4 x4Var = (x4) this.d;
        x4Var.R(i, 3);
        i6Var.e((p4) obj, x4Var.g);
        x4Var.R(i, 4);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003e A[Catch: all -> 0x002a, TryCatch #5 {all -> 0x002a, blocks: (B:6:0x000f, B:8:0x0013, B:10:0x0021, B:20:0x003e, B:76:0x0187, B:15:0x002d, B:17:0x0035, B:21:0x0043, B:23:0x0049, B:24:0x004d, B:75:0x0184, B:77:0x018a, B:78:0x018d, B:79:0x018e, B:25:0x0052, B:27:0x0056, B:28:0x0063, B:30:0x0069, B:36:0x007f, B:38:0x0085, B:39:0x0091, B:62:0x0168, B:63:0x016b, B:71:0x017b, B:70:0x0178, B:72:0x017c, B:73:0x0181, B:74:0x0182, B:31:0x006f, B:35:0x0076), top: B:92:0x000f, inners: #1 }] */
    @Override // com.gamericefishpro.space.ta.d
    public Object get() {
        com.gamericefishpro.space.ta.b cVar;
        com.gamericefishpro.space.ta.b cVar2;
        Object obj = k4.g;
        Context contextCreateDeviceProtectedStorageContext = (Context) this.d;
        com.gamericefishpro.space.ta.b bVar = com.gamericefishpro.space.i.a.b;
        if (bVar != null) {
            return bVar;
        }
        synchronized (com.gamericefishpro.space.i.a.class) {
            try {
                cVar = com.gamericefishpro.space.i.a.b;
                if (cVar == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    com.gamericefishpro.space.t.e eVar = j4.a;
                    if (!str.equals("eng") && !str.equals("userdebug")) {
                        cVar = com.gamericefishpro.space.ta.a.d;
                    } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                        if (!contextCreateDeviceProtectedStorageContext.isDeviceProtectedStorage()) {
                            contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
                        }
                        Context context = contextCreateDeviceProtectedStorageContext;
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            char c = 0;
                            try {
                                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                                cVar2 = file.exists() ? new com.gamericefishpro.space.ta.c(file) : com.gamericefishpro.space.ta.a.d;
                            } catch (RuntimeException e2) {
                                Log.e("HermeticFileOverrides", "no data dir", e2);
                                cVar2 = com.gamericefishpro.space.ta.a.d;
                            }
                            if (cVar2.b()) {
                                File file2 = (File) cVar2.a();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        com.gamericefishpro.space.t.r0 r0Var = new com.gamericefishpro.space.t.r0(0);
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                StringBuilder sb = new StringBuilder(line.length() + 9);
                                                sb.append("Invalid: ");
                                                sb.append(line);
                                                Log.e("HermeticFileOverrides", sb.toString());
                                            } else {
                                                String str3 = new String(strArrSplit[c]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String str4 = (String) map.get(strArrSplit[2]);
                                                if (str4 == null) {
                                                    String str5 = new String(strArrSplit[2]);
                                                    String strDecode2 = Uri.decode(str5);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str5) {
                                                        map.put(str5, strDecode2);
                                                    }
                                                    str4 = strDecode2;
                                                }
                                                com.gamericefishpro.space.t.r0 r0Var2 = (com.gamericefishpro.space.t.r0) r0Var.get(str3);
                                                if (r0Var2 == null) {
                                                    c = 0;
                                                    r0Var2 = new com.gamericefishpro.space.t.r0(0);
                                                    r0Var.put(str3, r0Var2);
                                                } else {
                                                    c = 0;
                                                }
                                                r0Var2.put(strDecode, str4);
                                                file2 = file2;
                                            }
                                        }
                                        String string = file2.toString();
                                        String packageName = context.getPackageName();
                                        StringBuilder sb2 = new StringBuilder(string.length() + 28 + String.valueOf(packageName).length());
                                        sb2.append("Parsed ");
                                        sb2.append(string);
                                        sb2.append(" for Android package ");
                                        sb2.append(packageName);
                                        Log.w("HermeticFileOverrides", sb2.toString());
                                        e4 e4Var = new e4(r0Var);
                                        bufferedReader.close();
                                        cVar = new com.gamericefishpro.space.ta.c(e4Var);
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } catch (IOException e3) {
                                    throw new RuntimeException(e3);
                                }
                            } else {
                                cVar = com.gamericefishpro.space.ta.a.d;
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    } else {
                        cVar = com.gamericefishpro.space.ta.a.d;
                    }
                    com.gamericefishpro.space.i.a.b = cVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return cVar;
    }

    public v5(int i) {
        switch (i) {
            case 1:
                this.d = new HashMap();
                break;
            default:
                f6 f6Var = f6.c;
                v5 v5Var = new v5(new z5[]{e5.e, e});
                Charset charset = n5.a;
                this.d = v5Var;
                break;
        }
    }

    public v5(x4 x4Var) {
        Charset charset = n5.a;
        this.d = x4Var;
        x4Var.g = this;
    }
}
