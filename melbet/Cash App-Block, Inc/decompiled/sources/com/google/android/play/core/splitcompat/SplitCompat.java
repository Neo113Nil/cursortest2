package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.emoji2.text.MetadataRepo;
import coil3.memory.RealStrongMemoryCache;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.play.core.splitinstall.internal.zzak;
import com.google.android.play.core.splitinstall.internal.zzat;
import com.google.android.play.core.splitinstall.internal.zzbh;
import com.google.android.play.core.splitinstall.internal.zzbk;
import com.google.android.play.core.splitinstall.internal.zzbl;
import com.google.android.play.core.splitinstall.zzo;
import com.google.android.play.core.splitinstall.zzs;
import com.google.mlkit.vision.text.internal.zzr;
import com.google.mlkit.vision.text.zza;
import com.miteksystems.misnap.camera.a.n;
import com.nimbusds.jose.jca.JCAContext;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import operations.ComparingOperation;

/* loaded from: classes4.dex */
public final class SplitCompat {
    public static final AtomicReference zzb = new AtomicReference(null);
    public final RealStrongMemoryCache zzc;
    public final ActionBarPolicy zzd;
    public final HashSet zze = new HashSet();
    public final zzr zzf;

    public SplitCompat(Context context) {
        try {
            RealStrongMemoryCache realStrongMemoryCache = new RealStrongMemoryCache(context);
            this.zzc = realStrongMemoryCache;
            this.zzf = new zzr(realStrongMemoryCache, 9);
            this.zzd = new ActionBarPolicy(context, 1);
        } catch (PackageManager.NameNotFoundException e) {
            throw new zzbh("Failed to initialize FileStorage", e);
        }
    }

    public static boolean zzi(Context context, boolean z) {
        AtomicReference atomicReference;
        byte b;
        boolean z2;
        SplitCompat splitCompat = new SplitCompat(context);
        while (true) {
            atomicReference = zzb;
            b = 0;
            if (!atomicReference.compareAndSet(null, splitCompat)) {
                if (atomicReference.get() != null && atomicReference.get() != null) {
                    z2 = false;
                    break;
                }
            } else {
                z2 = true;
                break;
            }
        }
        SplitCompat splitCompat2 = (SplitCompat) atomicReference.get();
        if (z2) {
            zzo zzoVar = zzo.zza;
            ThreadPoolExecutor zza = zzd.zza();
            RealStrongMemoryCache realStrongMemoryCache = splitCompat2.zzc;
            JCAContext jCAContext = new JCAContext(b, 5);
            UnleashContext unleashContext = new UnleashContext();
            unleashContext.userId = realStrongMemoryCache;
            unleashContext.sessionId = context;
            unleashContext.remoteAddress = jCAContext;
            zzo.zzb.set(new zzak(context, zza, unleashContext, splitCompat2.zzc));
            zza zzaVar = new zza(8);
            AtomicReference atomicReference2 = com.google.android.play.core.splitinstall.zzr.zza;
            while (!atomicReference2.compareAndSet(null, zzaVar) && (atomicReference2.get() == null || atomicReference2.get() == null)) {
            }
            zzd.zza().execute(new com.google.android.gms.stats.zza(context, 11));
        }
        try {
            splitCompat2.zzh(context, z);
            return true;
        } catch (Exception e) {
            Log.e("SplitCompat", "Error installing additional splits", e);
            return false;
        }
    }

    public final void zzg(HashSet hashSet) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            RealStrongMemoryCache realStrongMemoryCache = this.zzc;
            realStrongMemoryCache.getClass();
            File file = new File(realStrongMemoryCache.zzw(), "verified-splits");
            RealStrongMemoryCache.zzu(file);
            RealStrongMemoryCache.zzl(RealStrongMemoryCache.zzq(file, String.valueOf(str).concat(".apk")));
        }
        ActionBarPolicy actionBarPolicy = this.zzd;
        actionBarPolicy.getClass();
        synchronized (ActionBarPolicy.class) {
            actionBarPolicy.mContext.getSharedPreferences("playcore_split_install_internal", 0).edit().putStringSet("modules_to_uninstall_if_emulated", new HashSet()).apply();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
    
        r2.add(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x041c A[Catch: all -> 0x000b, TRY_LEAVE, TryCatch #3 {all -> 0x000b, blocks: (B:5:0x0005, B:6:0x001d, B:8:0x0021, B:10:0x002e, B:11:0x003c, B:12:0x0051, B:14:0x0058, B:16:0x0066, B:19:0x007b, B:26:0x0073, B:22:0x0081, B:30:0x008a, B:31:0x00a2, B:32:0x00ab, B:34:0x00b2, B:36:0x00c4, B:42:0x00d0, B:47:0x00d4, B:48:0x00d8, B:50:0x00de, B:52:0x00ee, B:58:0x00fc, B:64:0x0100, B:65:0x010d, B:67:0x0113, B:69:0x0125, B:72:0x013a, B:79:0x0132, B:75:0x0140, B:82:0x0144, B:84:0x0153, B:87:0x0370, B:88:0x0379, B:90:0x037f, B:92:0x0385, B:95:0x038c, B:97:0x0397, B:105:0x03cc, B:101:0x03df, B:113:0x03ed, B:120:0x0407, B:119:0x03f2, B:128:0x0408, B:129:0x0416, B:131:0x041c, B:139:0x042c, B:135:0x044d, B:142:0x0469, B:143:0x046b, B:153:0x0477, B:154:0x015f, B:155:0x0168, B:157:0x016e, B:159:0x017c, B:161:0x0184, B:162:0x018c, B:163:0x019b, B:167:0x01b1, B:169:0x01cd, B:171:0x01da, B:173:0x01e0, B:179:0x01f8, B:181:0x01fb, B:190:0x0211, B:195:0x0215, B:198:0x0217, B:199:0x024b, B:200:0x024c, B:201:0x0250, B:203:0x0256, B:264:0x0278, B:208:0x027c, B:211:0x0283, B:212:0x028c, B:214:0x0292, B:216:0x02a0, B:218:0x02a8, B:219:0x02b0, B:220:0x02bf, B:224:0x02d5, B:240:0x02f1, B:242:0x02fe, B:244:0x0304, B:250:0x031c, B:227:0x031f, B:238:0x0335, B:255:0x0339, B:258:0x033b, B:259:0x036f, B:268:0x008e, B:270:0x0094, B:271:0x0038, B:274:0x0478, B:275:0x048e, B:276:0x000f, B:183:0x01fc, B:184:0x020b, B:229:0x0320, B:230:0x032f, B:165:0x019c, B:166:0x01b0, B:145:0x046c, B:146:0x0471, B:222:0x02c0, B:223:0x02d4), top: B:3:0x0003, inners: #1, #4, #6, #7, #8, #10, #11, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x046c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x037f A[Catch: all -> 0x000b, TRY_LEAVE, TryCatch #3 {all -> 0x000b, blocks: (B:5:0x0005, B:6:0x001d, B:8:0x0021, B:10:0x002e, B:11:0x003c, B:12:0x0051, B:14:0x0058, B:16:0x0066, B:19:0x007b, B:26:0x0073, B:22:0x0081, B:30:0x008a, B:31:0x00a2, B:32:0x00ab, B:34:0x00b2, B:36:0x00c4, B:42:0x00d0, B:47:0x00d4, B:48:0x00d8, B:50:0x00de, B:52:0x00ee, B:58:0x00fc, B:64:0x0100, B:65:0x010d, B:67:0x0113, B:69:0x0125, B:72:0x013a, B:79:0x0132, B:75:0x0140, B:82:0x0144, B:84:0x0153, B:87:0x0370, B:88:0x0379, B:90:0x037f, B:92:0x0385, B:95:0x038c, B:97:0x0397, B:105:0x03cc, B:101:0x03df, B:113:0x03ed, B:120:0x0407, B:119:0x03f2, B:128:0x0408, B:129:0x0416, B:131:0x041c, B:139:0x042c, B:135:0x044d, B:142:0x0469, B:143:0x046b, B:153:0x0477, B:154:0x015f, B:155:0x0168, B:157:0x016e, B:159:0x017c, B:161:0x0184, B:162:0x018c, B:163:0x019b, B:167:0x01b1, B:169:0x01cd, B:171:0x01da, B:173:0x01e0, B:179:0x01f8, B:181:0x01fb, B:190:0x0211, B:195:0x0215, B:198:0x0217, B:199:0x024b, B:200:0x024c, B:201:0x0250, B:203:0x0256, B:264:0x0278, B:208:0x027c, B:211:0x0283, B:212:0x028c, B:214:0x0292, B:216:0x02a0, B:218:0x02a8, B:219:0x02b0, B:220:0x02bf, B:224:0x02d5, B:240:0x02f1, B:242:0x02fe, B:244:0x0304, B:250:0x031c, B:227:0x031f, B:238:0x0335, B:255:0x0339, B:258:0x033b, B:259:0x036f, B:268:0x008e, B:270:0x0094, B:271:0x0038, B:274:0x0478, B:275:0x048e, B:276:0x000f, B:183:0x01fc, B:184:0x020b, B:229:0x0320, B:230:0x032f, B:165:0x019c, B:166:0x01b0, B:145:0x046c, B:146:0x0471, B:222:0x02c0, B:223:0x02d4), top: B:3:0x0003, inners: #1, #4, #6, #7, #8, #10, #11, #12 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzh(Context context, boolean z) {
        Iterator it;
        Iterator it2;
        IOException iOException;
        ZipFile zipFile;
        boolean z2;
        try {
            if (z) {
                this.zzc.zzk();
            } else {
                zzd.zza().execute(new com.google.android.gms.stats.zza(this, 12));
            }
            String packageName = context.getPackageName();
            try {
                int i = 0;
                String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
                List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
                HashSet zzj = this.zzc.zzj();
                Set zza = this.zzd.zza();
                HashSet hashSet = new HashSet();
                Iterator it3 = zzj.iterator();
                while (it3.hasNext()) {
                    String str = ((zzb) it3.next()).zzb;
                    if (!arrayList.contains(str)) {
                        int i2 = zzs.$r8$clinit;
                        if (zza.contains(str.startsWith("config.") ? "" : str.split("\\.config\\.", 2)[0])) {
                        }
                    }
                    hashSet.add(str);
                    it3.remove();
                }
                if (z) {
                    zzg(hashSet);
                } else if (!hashSet.isEmpty()) {
                    zzd.zza().execute(new com.google.mlkit.common.sdkinternal.zzb(14, this, hashSet));
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = zzj.iterator();
                while (true) {
                    boolean z3 = true;
                    if (!it4.hasNext()) {
                        break;
                    }
                    String str2 = ((zzb) it4.next()).zzb;
                    int i3 = zzs.$r8$clinit;
                    if (!str2.startsWith("config.") && !str2.contains(".config.")) {
                        z3 = false;
                    }
                }
                for (String str3 : arrayList) {
                    int i4 = zzs.$r8$clinit;
                    if (!str3.startsWith("config.") && !str3.contains(".config.")) {
                        z2 = false;
                        if (z2) {
                            hashSet2.add(str3);
                        }
                    }
                    z2 = true;
                    if (z2) {
                    }
                }
                HashSet hashSet3 = new HashSet(zzj.size());
                Iterator it5 = zzj.iterator();
                while (it5.hasNext()) {
                    zzb zzbVar = (zzb) it5.next();
                    String str4 = zzbVar.zzb;
                    int i5 = zzs.$r8$clinit;
                    if (!str4.startsWith("config.")) {
                        String str5 = zzbVar.zzb;
                        if (hashSet2.contains(str5.startsWith("config.") ? "" : str5.split("\\.config\\.", 2)[0])) {
                        }
                    }
                    hashSet3.add(zzbVar);
                }
                zzn zznVar = new zzn(this.zzc);
                ClassLoader classLoader = context.getClassLoader();
                int i6 = 3;
                ZipFile zipFile2 = null;
                if (z) {
                    HashSet zzc = zznVar.zzc();
                    if (!zzc.isEmpty()) {
                        HashSet hashSet4 = new HashSet();
                        Iterator it6 = zzc.iterator();
                        while (it6.hasNext()) {
                            hashSet4.add(((File) it6.next()).getParentFile());
                        }
                        Field zzh = zzbk.zzh(classLoader, "pathList");
                        try {
                            Object cast = Object.class.cast(zzh.get(classLoader));
                            n nVar = new n(i6, cast, zzbk.zzh(cast, "nativeLibraryDirectories"), List.class);
                            synchronized (ComparingOperation.DefaultImpls.class) {
                                ArrayList arrayList2 = new ArrayList((Collection) nVar.zzc());
                                hashSet4.removeAll(arrayList2);
                                arrayList2.addAll(hashSet4);
                                nVar.zze(arrayList2);
                            }
                            ArrayList arrayList3 = new ArrayList();
                            Object[] objArr = (Object[]) zzbk.zzd(cast, "makePathElements", Object[].class, List.class, new ArrayList(hashSet4));
                            if (!arrayList3.isEmpty()) {
                                zzbh zzbhVar = new zzbh("Error in makePathElements");
                                int size = arrayList3.size();
                                while (i < size) {
                                    try {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, (IOException) arrayList3.get(i));
                                    } catch (Exception unused) {
                                    }
                                    i++;
                                }
                                throw zzbhVar;
                            }
                            synchronized (ComparingOperation.DefaultImpls.class) {
                                zzbk.zza("nativeLibraryPathElements", cast, Object.class).zzb(Arrays.asList(objArr));
                            }
                        } catch (Exception e) {
                            throw new zzbl("Failed to get value of field " + zzh.getName() + " of type " + classLoader.getClass().getName() + " on object of type " + Object.class.getName(), e);
                        }
                    }
                    HashSet hashSet5 = new HashSet();
                    it = hashSet3.iterator();
                    while (it.hasNext()) {
                        zzb zzbVar2 = (zzb) it.next();
                        try {
                            zipFile = new ZipFile(zzbVar2.zza);
                        } catch (IOException e2) {
                            iOException = e2;
                        }
                        try {
                            ZipEntry entry = zipFile.getEntry("classes.dex");
                            zipFile.close();
                            if (entry != null) {
                                RealStrongMemoryCache realStrongMemoryCache = this.zzc;
                                String str6 = zzbVar2.zzb;
                                realStrongMemoryCache.getClass();
                                File file = new File(realStrongMemoryCache.zzw(), "dex");
                                RealStrongMemoryCache.zzu(file);
                                File zzq = RealStrongMemoryCache.zzq(file, str6);
                                RealStrongMemoryCache.zzu(zzq);
                                if (!zzat.zze(classLoader, zzq, zzbVar2.zza, z, new com.google.mlkit.vision.text.zzb(8), "path", new com.google.mlkit.vision.text.zzc(8))) {
                                    Log.w("SplitCompat", "split was not installed ".concat(zzbVar2.zza.toString()));
                                }
                            }
                            hashSet5.add(zzbVar2.zza);
                        } catch (IOException e3) {
                            iOException = e3;
                            zipFile2 = zipFile;
                            if (zipFile2 == null) {
                                throw iOException;
                            }
                            try {
                                zipFile2.close();
                                throw iOException;
                            } catch (IOException e4) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(iOException, e4);
                                    throw iOException;
                                } catch (Exception unused2) {
                                    throw iOException;
                                }
                            }
                        }
                    }
                    this.zzf.zza(context, hashSet5);
                    HashSet hashSet6 = new HashSet();
                    it2 = hashSet3.iterator();
                    while (it2.hasNext()) {
                        zzb zzbVar3 = (zzb) it2.next();
                        boolean contains = hashSet5.contains(zzbVar3.zza);
                        String str7 = zzbVar3.zzb;
                        if (contains) {
                            Log.d("SplitCompat", "Split '" + str7 + "' installation emulated");
                            hashSet6.add(zzbVar3.zzb);
                        } else {
                            Log.d("SplitCompat", "Split '" + str7 + "' installation not emulated.");
                        }
                    }
                    synchronized (this.zze) {
                        this.zze.addAll(hashSet6);
                    }
                } else {
                    Iterator it7 = hashSet3.iterator();
                    while (it7.hasNext()) {
                        zzb zzbVar4 = (zzb) it7.next();
                        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                        HashSet hashSet7 = new HashSet();
                        zzn.zze(zzbVar4, new MetadataRepo((Object) zznVar, (Object) zzbVar4, (Object) hashSet7, (Serializable) atomicBoolean));
                        if (!atomicBoolean.get()) {
                            hashSet7 = null;
                        }
                        if (hashSet7 == null) {
                            it7.remove();
                        } else if (!hashSet7.isEmpty()) {
                            HashSet hashSet8 = new HashSet();
                            Iterator it8 = hashSet7.iterator();
                            while (it8.hasNext()) {
                                hashSet8.add(((File) it8.next()).getParentFile());
                            }
                            Field zzh2 = zzbk.zzh(classLoader, "pathList");
                            try {
                                Object cast2 = Object.class.cast(zzh2.get(classLoader));
                                n nVar2 = new n(i6, cast2, zzbk.zzh(cast2, "nativeLibraryDirectories"), List.class);
                                synchronized (ComparingOperation.DefaultImpls.class) {
                                    ArrayList arrayList4 = new ArrayList((Collection) nVar2.zzc());
                                    hashSet8.removeAll(arrayList4);
                                    arrayList4.addAll(hashSet8);
                                    nVar2.zze(arrayList4);
                                }
                                ArrayList arrayList5 = new ArrayList();
                                Object[] objArr2 = (Object[]) zzbk.zzd(cast2, "makePathElements", Object[].class, List.class, new ArrayList(hashSet8));
                                if (!arrayList5.isEmpty()) {
                                    zzbh zzbhVar2 = new zzbh("Error in makePathElements");
                                    int size2 = arrayList5.size();
                                    while (i < size2) {
                                        try {
                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar2, (IOException) arrayList5.get(i));
                                        } catch (Exception unused3) {
                                        }
                                        i++;
                                    }
                                    throw zzbhVar2;
                                }
                                synchronized (ComparingOperation.DefaultImpls.class) {
                                    zzbk.zza("nativeLibraryPathElements", cast2, Object.class).zzb(Arrays.asList(objArr2));
                                }
                            } catch (Exception e5) {
                                throw new zzbl("Failed to get value of field " + zzh2.getName() + " of type " + classLoader.getClass().getName() + " on object of type " + Object.class.getName(), e5);
                            }
                        }
                    }
                    HashSet hashSet52 = new HashSet();
                    it = hashSet3.iterator();
                    while (it.hasNext()) {
                    }
                    this.zzf.zza(context, hashSet52);
                    HashSet hashSet62 = new HashSet();
                    it2 = hashSet3.iterator();
                    while (it2.hasNext()) {
                    }
                    synchronized (this.zze) {
                    }
                }
            } catch (PackageManager.NameNotFoundException e6) {
                throw new IOException("Cannot load data for application '" + packageName + "'", e6);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
