package com.google.android.gms.internal.time;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.Room;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public abstract class zzcw {
    public static final zzeu zza;
    public static final zzev zzb;

    static {
        int i = 1;
        zza = new zzeu(i);
        zzb = new zzev(i);
    }

    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String m;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                m = "null";
            } else {
                try {
                    m = obj.toString();
                } catch (Exception e) {
                    String m2 = Recorder$$ExternalSyntheticOutline2.m(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(m2), (Throwable) e);
                    m = Boxes$$ExternalSyntheticOutline1.m("<", m2, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = m;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public abstract int zza();

    public abstract zzdq zzb(int i);

    public abstract Object zzc(zzdq zzdqVar);

    public abstract Object zzd(int i);

    public static zzew zza(Set set) {
        zzew zzewVar = new zzew();
        zzewVar.zzf = zzb;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdq zzdqVar = (zzdq) it.next();
            zza(zzdqVar, "key");
            boolean z = zzdqVar.zzc;
            HashMap hashMap = zzewVar.zzd;
            HashMap hashMap2 = zzewVar.zzc;
            if (!z) {
                hashMap.remove(zzdqVar);
                hashMap2.put(zzdqVar, zzew.zza);
            } else if (z) {
                hashMap2.remove(zzdqVar);
                hashMap.put(zzdqVar, zzew.zzb);
            } else {
                a$$ExternalSyntheticBUOutline0.m$3("key must be repeating");
                return null;
            }
        }
        return zzewVar;
    }

    public static zzw zza(Task task) {
        if (task.isComplete()) {
            if (!task.isSuccessful()) {
                if (task.isCanceled()) {
                    zzw zzwVar = new zzw();
                    zzwVar.zze();
                    return zzwVar;
                }
                Exception exception = task.getException();
                if (exception != null) {
                    return Room.forException(exception);
                }
                return Room.forException(new IllegalStateException("Task was not successful or canceled, but exception is null"));
            }
            a$$ExternalSyntheticBUOutline0.m$3("Task is successful:".concat(String.valueOf(task)));
            return null;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Task is not complete:".concat(String.valueOf(task)));
        return null;
    }

    public static void zza(Object obj, String str) {
        if (obj != null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$2(str.concat(" must not be null"));
    }
}
