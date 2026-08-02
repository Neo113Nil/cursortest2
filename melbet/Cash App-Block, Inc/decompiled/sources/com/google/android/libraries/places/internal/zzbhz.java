package com.google.android.libraries.places.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public abstract class zzbhz {
    protected transient int zza;

    public static void zzbu(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof zzbkk) {
            List zza = ((zzbkk) iterable).zza();
            zzbkk zzbkkVar = (zzbkk) list;
            int size = list.size();
            for (Object obj : zza) {
                if (obj == null) {
                    int size2 = zzbkkVar.size() - size;
                    String m = re$$ExternalSyntheticOutline0.m(size2, "Element at index ", " is null.", new StringBuilder(String.valueOf(size2).length() + 26));
                    int size3 = zzbkkVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            a$$ExternalSyntheticBUOutline0.m$2(m);
                            return;
                        }
                        zzbkkVar.remove(size3);
                    }
                } else if (obj instanceof zzbim) {
                    zzbkkVar.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    try {
                        zzbim.zzk(0, bArr.length, bArr);
                        zzbkkVar.zzb();
                    } catch (zzbke e) {
                        throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                    }
                } else {
                    zzbkkVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzbli) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof zzblk) {
                zzblk zzblkVar = (zzblk) list;
                int i = zzblkVar.zzd + size4;
                int length = zzblkVar.zzc.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = re$$ExternalSyntheticOutline0.m(length, 3, 2, 1, 10);
                        }
                        zzblkVar.zzc = Arrays.copyOf(zzblkVar.zzc, length);
                    } else {
                        zzblkVar.zzc = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    zzbjl.zza(size5, list);
                    throw null;
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size6 = list2.size();
        for (int i2 = 0; i2 < size6; i2++) {
            Object obj3 = list2.get(i2);
            if (obj3 == null) {
                zzbjl.zza(size5, list);
                throw null;
            }
            list.add(obj3);
        }
    }

    public final byte[] zzbr() {
        try {
            zzbjr zzbjrVar = (zzbjr) this;
            int zzbD = zzbjrVar.zzbD();
            byte[] bArr = new byte[zzbD];
            boolean z = zzbiv.zzc;
            zzbis zzbisVar = new zzbis(bArr, 0, zzbD);
            zzbjrVar.zzbR(zzbisVar);
            zzbisVar.zzJ();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            OptionalProvider$$ExternalSyntheticLambda0.m(Recorder$$ExternalSyntheticOutline2.m(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), (Throwable) e);
            return null;
        }
    }

    public abstract int zzbt(zzbln zzblnVar);
}
