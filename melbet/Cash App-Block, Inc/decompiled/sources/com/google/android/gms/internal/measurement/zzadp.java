package com.google.android.gms.internal.measurement;

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
public abstract class zzadp implements Cloneable {
    public zzadu zza;
    public final zzadu zzb;

    public zzadp(zzadu zzaduVar) {
        this.zzb = zzaduVar;
        if (zzaduVar.zzch()) {
            a$$ExternalSyntheticBUOutline0.m$3("Default instance must be immutable.");
            throw null;
        }
        this.zza = zzaduVar.zzck();
    }

    public static void zza(int i, List list) {
        int size = list.size() - i;
        String m = re$$ExternalSyntheticOutline0.m(size, "Element at index ", " is null.", new StringBuilder(String.valueOf(size).length() + 26));
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(m);
            }
            list.remove(size2);
        }
    }

    public static void zzaV(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof zzaen) {
            List zza = ((zzaen) iterable).zza();
            zzaen zzaenVar = (zzaen) list;
            int size = list.size();
            for (Object obj : zza) {
                if (obj == null) {
                    int size2 = zzaenVar.size() - size;
                    String m = re$$ExternalSyntheticOutline0.m(size2, "Element at index ", " is null.", new StringBuilder(String.valueOf(size2).length() + 26));
                    int size3 = zzaenVar.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            a$$ExternalSyntheticBUOutline0.m$2(m);
                            return;
                        }
                        zzaenVar.remove(size3);
                    }
                } else if (obj instanceof zzacr) {
                    zzaenVar.zzb();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    zzacr.zzj(0, bArr.length, bArr);
                    zzaenVar.zzb();
                } else {
                    zzaenVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof zzafk) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size4 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size4);
            } else if (list instanceof zzafm) {
                zzafm zzafmVar = (zzafm) list;
                int i = zzafmVar.zzd + size4;
                int length = zzafmVar.zzc.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = re$$ExternalSyntheticOutline0.m(length, 3, 2, 1, 10);
                        }
                        zzafmVar.zzc = Arrays.copyOf(zzafmVar.zzc, length);
                    } else {
                        zzafmVar.zzc = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size5 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    zza(size5, list);
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
                zza(size5, list);
                throw null;
            }
            list.add(obj3);
        }
    }

    public final zzadp zzaW(byte[] bArr, zzadf zzadfVar) {
        zzbf(bArr, bArr.length, zzadfVar);
        return this;
    }

    public final zzadp zzaX(byte[] bArr) {
        int length = bArr.length;
        zzadf zzadfVar = zzadf.zzd;
        int i = zzacf.$r8$clinit;
        zzbf(bArr, length, zzadf.zza);
        return this;
    }

    public final void zzaY() {
        if (this.zza.zzch()) {
            return;
        }
        zzadu zzck = this.zzb.zzck();
        zzafl.zza.zzb(zzck.getClass()).zzd(zzck, this.zza);
        this.zza = zzck;
    }

    /* renamed from: zzbb, reason: merged with bridge method [inline-methods] */
    public final zzadp clone() {
        zzadp zzadpVar = (zzadp) this.zzb.zzg(5);
        boolean zzch = this.zza.zzch();
        zzadu zzaduVar = this.zza;
        if (zzch) {
            zzaduVar.getClass();
            zzafl.zza().zzb(zzaduVar.getClass()).zzk(zzaduVar);
            zzaduVar.zzci();
            zzaduVar = this.zza;
        }
        zzadpVar.zza = zzaduVar;
        return zzadpVar;
    }

    public final zzadu zzbd() {
        boolean zzch = this.zza.zzch();
        zzadu zzaduVar = this.zza;
        if (zzch) {
            zzaduVar.getClass();
            zzafl.zza().zzb(zzaduVar.getClass()).zzk(zzaduVar);
            zzaduVar.zzci();
            zzaduVar = this.zza;
        }
        zzaduVar.getClass();
        if (zzadu.zzd(zzaduVar, true)) {
            return zzaduVar;
        }
        throw new zzafy();
    }

    public final void zzbe(zzadu zzaduVar) {
        zzadu zzaduVar2 = this.zzb;
        if (zzaduVar2.equals(zzaduVar)) {
            return;
        }
        if (!this.zza.zzch()) {
            zzadu zzck = zzaduVar2.zzck();
            zzafl.zza.zzb(zzck.getClass()).zzd(zzck, this.zza);
            this.zza = zzck;
        }
        zzadu zzaduVar3 = this.zza;
        zzafl.zza.zzb(zzaduVar3.getClass()).zzd(zzaduVar3, zzaduVar);
    }

    public final void zzbf(byte[] bArr, int i, zzadf zzadfVar) {
        if (!this.zza.zzch()) {
            zzadu zzck = this.zzb.zzck();
            zzafl.zza.zzb(zzck.getClass()).zzd(zzck, this.zza);
            this.zza = zzck;
        }
        try {
            zzafl.zza.zzb(this.zza.getClass()).zzj(this.zza, bArr, 0, i, new zzacg(zzadfVar));
        } catch (zzaeh e) {
            throw e;
        } catch (IOException e2) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Reading from byte array should not throw IOException.", (Throwable) e2);
        } catch (IndexOutOfBoundsException unused) {
            a$$ExternalSyntheticBUOutline0.m$5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
