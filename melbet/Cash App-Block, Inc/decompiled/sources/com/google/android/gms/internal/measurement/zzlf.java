package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.bugsnag.android.DeliveryDelegate;
import com.google.common.base.Absent;
import com.google.common.base.Optional;
import com.google.common.base.Present;
import com.google.common.collect.ImmutableList;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public abstract class zzlf implements zzrt {
    public static volatile Optional zza;

    /* renamed from: zza, reason: collision with other field name */
    public static final Object f66zza = new Object();
    public static Thread zzb;
    public static volatile Handler zzc;

    /* JADX WARN: Can't wrap try/catch for region: R(18:8|(4:10|(1:12)|13|14)|15|(4:17|(1:19)|13|14)|20|(1:22)(1:88)|23|24|25|26|27|28|29|(1:31)(1:80)|32|(9:34|35|36|37|38|(2:39|(3:41|(3:57|58|59)(7:43|44|(2:46|(1:49))|50|(1:52)(1:56)|53|54)|55)(1:60))|61|62|63)(1:79)|64|14) */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0073, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0074, code lost:
    
        android.util.Log.e("HermeticFileOverrides", "no data dir", r0);
        r5 = com.google.common.base.Absent.INSTANCE;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Optional zza(Context context) {
        Optional optional;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        Optional optional2;
        char c;
        Optional optional3 = zza;
        if (optional3 != null) {
            return optional3;
        }
        synchronized (zzlf.class) {
            try {
                optional = zza;
                if (optional == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    ArrayMap arrayMap = zzlg.zzb;
                    if (!str.equals("eng")) {
                        if (str.equals("userdebug")) {
                        }
                        optional = Absent.INSTANCE;
                        zza = optional;
                    }
                    if (!str2.contains("dev-keys")) {
                        if (str2.contains("test-keys")) {
                        }
                        optional = Absent.INSTANCE;
                        zza = optional;
                    }
                    Context createDeviceProtectedStorageContext = !context.isDeviceProtectedStorage() ? context.createDeviceProtectedStorageContext() : context;
                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    StrictMode.allowThreadDiskWrites();
                    char c2 = 0;
                    File file = new File(createDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                    Optional optional4 = file.exists() ? new Present(file) : Absent.INSTANCE;
                    if (optional4.isPresent()) {
                        File file2 = (File) optional4.get();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                            try {
                                SimpleArrayMap simpleArrayMap = new SimpleArrayMap(0);
                                HashMap hashMap = new HashMap();
                                while (true) {
                                    String readLine = bufferedReader.readLine();
                                    if (readLine == null) {
                                        break;
                                    }
                                    String[] split = readLine.split(" ", 3);
                                    if (split.length != 3) {
                                        StringBuilder sb = new StringBuilder(readLine.length() + 9);
                                        sb.append("Invalid: ");
                                        sb.append(readLine);
                                        Log.e("HermeticFileOverrides", sb.toString());
                                    } else {
                                        String str3 = new String(split[c2]);
                                        String decode = Uri.decode(new String(split[1]));
                                        String str4 = (String) hashMap.get(split[2]);
                                        if (str4 == null) {
                                            String str5 = new String(split[2]);
                                            str4 = Uri.decode(str5);
                                            if (str4.length() < 1024 || str4 == str5) {
                                                hashMap.put(str5, str4);
                                            }
                                        }
                                        SimpleArrayMap simpleArrayMap2 = (SimpleArrayMap) simpleArrayMap.get(str3);
                                        if (simpleArrayMap2 == null) {
                                            c = 0;
                                            simpleArrayMap2 = new SimpleArrayMap(0);
                                            simpleArrayMap.put(str3, simpleArrayMap2);
                                        } else {
                                            c = 0;
                                        }
                                        simpleArrayMap2.put(decode, str4);
                                        c2 = c;
                                    }
                                }
                                String obj = file2.toString();
                                String packageName = createDeviceProtectedStorageContext.getPackageName();
                                StringBuilder sb2 = new StringBuilder(obj.length() + 28 + String.valueOf(packageName).length());
                                sb2.append("Parsed ");
                                sb2.append(obj);
                                sb2.append(" for Android package ");
                                sb2.append(packageName);
                                Log.w("HermeticFileOverrides", sb2.toString());
                                zzle zzleVar = new zzle(simpleArrayMap);
                                bufferedReader.close();
                                optional2 = new Present(zzleVar);
                            } catch (Throwable th) {
                                try {
                                    bufferedReader.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        optional2 = Absent.INSTANCE;
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    optional = optional2;
                    zza = optional;
                }
            } catch (Throwable th3) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th3;
            } finally {
            }
        }
        return optional;
    }

    public static Handler zzb() {
        if (zzc == null) {
            synchronized (f66zza) {
                try {
                    if (zzc == null) {
                        zzc = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return zzc;
    }

    public static final InputStream zzc(zzzm zzzmVar) {
        zzrp zza2;
        zzsl zzd = ((zzsx) zzzmVar.zzc).zzd((Uri) zzzmVar.zzf);
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzd);
        ArrayList arrayList2 = (ArrayList) zzzmVar.zze;
        if (!arrayList2.isEmpty() && (zza2 = zzrp.zza(zzd, arrayList2)) != null) {
            arrayList.add(zza2);
        }
        Iterator it = ((ImmutableList) zzzmVar.zzd).iterator();
        if (!it.hasNext()) {
            Collections.reverse(arrayList);
            return (InputStream) arrayList.get(0);
        }
        JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(it.next());
        throw null;
    }

    public static final void zzc(Level level, Executor executor, Exception exc, String str, Object... objArr) {
        zzly zzlyVar = new zzly(level, exc, str, objArr);
        int i = zzxa.$r8$clinit;
        executor.execute(new DeliveryDelegate.AnonymousClass1(new Ref$ObjectRef(), zzvy.zzb(), zzlyVar));
    }

    public static boolean zza(Thread thread) {
        if (zzb == null) {
            zzb = Looper.getMainLooper().getThread();
        }
        return thread == zzb;
    }
}
