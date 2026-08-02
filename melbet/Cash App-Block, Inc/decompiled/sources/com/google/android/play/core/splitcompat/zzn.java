package com.google.android.play.core.splitcompat;

import android.os.Build;
import android.util.Log;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.RealStrongMemoryCache;
import com.miteksystems.misnap.camera.a.n;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes4.dex */
public final class zzn {
    public static final Pattern zza = Pattern.compile("lib/([^/]+)/(.*\\.so)$");
    public final RealStrongMemoryCache zzb;

    public zzn(RealStrongMemoryCache realStrongMemoryCache) {
        this.zzb = realStrongMemoryCache;
    }

    public static void zze(zzb zzbVar, zzk zzkVar) {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(zzbVar.zza);
        } catch (IOException e) {
            e = e;
            zipFile = null;
        }
        try {
            String str = zzbVar.zzb;
            HashMap hashMap = new HashMap();
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                Matcher matcher = zza.matcher(nextElement.getName());
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    Log.d("SplitCompat", "NativeLibraryExtractor: split '" + str + "' has native library '" + group2 + "' for ABI '" + group + "'");
                    Set set = (Set) hashMap.get(group);
                    if (set == null) {
                        set = new HashSet();
                        hashMap.put(group, set);
                    }
                    set.add(new zzm(nextElement, group2));
                }
            }
            HashMap hashMap2 = new HashMap();
            for (String str2 : Build.SUPPORTED_ABIS) {
                if (hashMap.containsKey(str2)) {
                    Log.d("SplitCompat", "NativeLibraryExtractor: there are native libraries for supported ABI " + str2 + "; will use this ABI");
                    for (zzm zzmVar : (Set) hashMap.get(str2)) {
                        String str3 = zzmVar.zza;
                        if (hashMap2.containsKey(str3)) {
                            Log.d("SplitCompat", "NativeLibraryExtractor: skipping library " + str3 + " for ABI " + str2 + "; already present for a better ABI");
                        } else {
                            hashMap2.put(str3, zzmVar);
                            Log.d("SplitCompat", "NativeLibraryExtractor: using library " + str3 + " for ABI " + str2);
                        }
                    }
                } else {
                    Log.d("SplitCompat", "NativeLibraryExtractor: there are no native libraries for supported ABI " + str2);
                }
            }
            zzkVar.zza(zipFile, new HashSet(hashMap2.values()));
            zipFile.close();
        } catch (IOException e2) {
            e = e2;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException e3) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e3);
                }
            }
            throw e;
        }
    }

    public final HashSet zzc() {
        Log.d("SplitCompat", "NativeLibraryExtractor: synchronizing native libraries");
        RealStrongMemoryCache realStrongMemoryCache = this.zzb;
        HashSet zzj = realStrongMemoryCache.zzj();
        ArrayList arrayList = new ArrayList();
        File file = new File(realStrongMemoryCache.zzw(), "native-libraries");
        RealStrongMemoryCache.zzu(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    arrayList.add(file2.getName());
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = zzj.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Log.i("SplitCompat", "NativeLibraryExtractor: extracted split '" + str + "' has no corresponding split; deleting");
                    File file3 = new File(realStrongMemoryCache.zzw(), "native-libraries");
                    RealStrongMemoryCache.zzu(file3);
                    File zzq = RealStrongMemoryCache.zzq(file3, str);
                    RealStrongMemoryCache.zzu(zzq);
                    RealStrongMemoryCache.zzl(zzq);
                    break;
                }
                if (((zzb) it2.next()).zzb.equals(str)) {
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it3 = zzj.iterator();
        while (it3.hasNext()) {
            zzb zzbVar = (zzb) it3.next();
            HashSet hashSet2 = new HashSet();
            zze(zzbVar, new n(this, hashSet2, zzbVar));
            String str2 = zzbVar.zzb;
            HashSet hashSet3 = new HashSet();
            File file4 = new File(realStrongMemoryCache.zzw(), "native-libraries");
            RealStrongMemoryCache.zzu(file4);
            File zzq2 = RealStrongMemoryCache.zzq(file4, str2);
            RealStrongMemoryCache.zzu(zzq2);
            File[] listFiles2 = zzq2.listFiles();
            if (listFiles2 != null) {
                for (File file5 : listFiles2) {
                    if (file5.isFile()) {
                        hashSet3.add(file5);
                    }
                }
            }
            Iterator it4 = hashSet3.iterator();
            while (it4.hasNext()) {
                File file6 = (File) it4.next();
                if (!hashSet2.contains(file6)) {
                    String absolutePath = file6.getAbsolutePath();
                    String absolutePath2 = zzbVar.zza.getAbsolutePath();
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NativeLibraryExtractor: file '", absolutePath, "' found in split '", str2, "' that is not in the split file '");
                    m.append(absolutePath2);
                    m.append("'; removing");
                    Log.i("SplitCompat", m.toString());
                    File parentFile = file6.getParentFile().getParentFile();
                    File file7 = new File(realStrongMemoryCache.zzw(), "native-libraries");
                    RealStrongMemoryCache.zzu(file7);
                    if (!parentFile.equals(file7)) {
                        a$$ExternalSyntheticBUOutline0.m$1("File to remove is not a native library");
                        return null;
                    }
                    RealStrongMemoryCache.zzl(file6);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    public final void zzf(zzb zzbVar, HashSet hashSet, zzl zzlVar) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            zzm zzmVar = (zzm) it.next();
            String str = zzbVar.zzb;
            String str2 = zzmVar.zza;
            RealStrongMemoryCache realStrongMemoryCache = this.zzb;
            realStrongMemoryCache.getClass();
            File file = new File(realStrongMemoryCache.zzw(), "native-libraries");
            RealStrongMemoryCache.zzu(file);
            File zzq = RealStrongMemoryCache.zzq(file, str);
            RealStrongMemoryCache.zzu(zzq);
            File zzq2 = RealStrongMemoryCache.zzq(zzq, str2);
            boolean z = false;
            if (zzq2.exists() && zzq2.length() == zzmVar.zzb.getSize() && !zzq2.canWrite()) {
                z = true;
            }
            zzlVar.zza(zzmVar, zzq2, z);
        }
    }
}
