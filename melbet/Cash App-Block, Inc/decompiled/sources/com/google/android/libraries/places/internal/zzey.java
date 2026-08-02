package com.google.android.libraries.places.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.libraries.places.api.auth.zzd;
import com.google.common.base.Supplier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import kotlin.text.Charsets;
import net.oneformapp.schema.Schema;

/* loaded from: classes4.dex */
public abstract class zzey {

    /* renamed from: zza, reason: collision with other field name */
    public static volatile Schema f69zza;
    public static final zzez zza = new zzez(0);
    public static final zzez zza$1 = new zzez(6);

    public static List zza(Class cls, Iterator it, Supplier supplier, zzbts zzbtsVar) {
        if (!(it instanceof ListIterator)) {
            try {
                Class.forName("android.app.Application", false, cls.getClassLoader());
                Iterable<Class> iterable = (Iterable) supplier.get();
                ArrayList arrayList = new ArrayList();
                for (Class cls2 : iterable) {
                    Object obj = null;
                    try {
                        obj = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                    } catch (ClassCastException unused) {
                    } catch (Throwable th) {
                        throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                    }
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                }
                it = arrayList.iterator();
            } catch (Exception unused2) {
                if (!it.hasNext()) {
                    it = ServiceLoader.load(cls).iterator();
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        while (it.hasNext()) {
            Object next = it.next();
            zzbtsVar.zzb(next);
            arrayList2.add(next);
        }
        Collections.sort(arrayList2, Collections.reverseOrder(new zzbtr(zzbtsVar)));
        return Collections.unmodifiableList(arrayList2);
    }

    public static zzatp zzb(zznq zznqVar, int i, zzns zznsVar, zzd zzdVar) {
        int i2;
        int ordinal = zznqVar.zzc.ordinal();
        if (ordinal != 0) {
            i2 = 4;
            if (ordinal != 1) {
                i2 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? 1 : 8 : 7 : 5;
            }
        } else {
            i2 = 2;
        }
        int i3 = zznsVar == zzns.zzc ? 2 : 3;
        zzatp zza$12 = zzatw.zza$1();
        zzabu zza$13 = zzabz.zza$1();
        String str = zznqVar.zza;
        zza$13.zzy();
        ((zzabz) zza$13.zza).zzc(str);
        int i4 = zznqVar.zzb;
        zza$13.zzy();
        ((zzabz) zza$13.zza).zzd(i4);
        zzabz zzabzVar = (zzabz) zza$13.zzD();
        zza$12.zzy();
        ((zzatw) zza$12.zza).zzc(zzabzVar);
        boolean z = i == 2;
        zza$12.zzy();
        ((zzatw) zza$12.zza).zzi(z);
        zza$12.zzy();
        ((zzatw) zza$12.zza).zzu(i);
        zza$12.zzy();
        ((zzatw) zza$12.zza).zzt(i2);
        zza$12.zzy();
        ((zzatw) zza$12.zza).zzv(i3);
        zza$12.zzy();
        ((zzatw) zza$12.zza).zzk();
        zzdVar.getClass();
        zza$12.zzy();
        ((zzatw) zza$12.zza).zzo();
        return zza$12;
    }

    public static final zzcls zza(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        zzcls zzclsVar = new zzcls(bytes);
        zzclsVar.zzd = str;
        return zzclsVar;
    }

    public static void zzb(Schema schema, boolean z) {
        zzcka zzckaVar;
        Class<?> cls;
        boolean z2;
        if (z) {
            zzckaVar = (zzcka) schema.fieldSortOrder;
        } else {
            zzckaVar = (zzcka) schema.rootElements;
        }
        try {
            cls = zzckaVar.zzc.getClass();
            z2 = false;
        } catch (ClassCastException unused) {
            cls = Object.class;
            z2 = true;
        }
        if (zzbhz.class.isAssignableFrom(cls)) {
            return;
        }
        String str = true != z ? "response" : "request";
        zzbtx zzbtxVar = zzbtx.zzh;
        String str2 = (String) schema.mVersion;
        String name = cls.getName();
        String str3 = true != z2 ? "" : ", assumed because method doesn't use ReflectableMarshaller";
        String obj = zzbhz.class.toString();
        StringBuilder sb = new StringBuilder(Boxes$$ExternalSyntheticOutline1.m(name.length() + Boxes$$ExternalSyntheticOutline1.m(str.length() + 52, 2, String.valueOf(str2)), 24, str3) + obj.length());
        Boxes$$ExternalSyntheticOutline1.m(sb, "AsyncClientInterceptor: The ", str, " message type of method ", str2);
        Boxes$$ExternalSyntheticOutline1.m(sb, " (", name, str3, ") must be a subclass of ");
        sb.append(obj);
        throw new zzbty(zzbtxVar.zze(sb.toString()));
    }

    public static final zzcls zzb(byte... bArr) {
        bArr.getClass();
        return new zzcls(Arrays.copyOf(bArr, bArr.length));
    }
}
