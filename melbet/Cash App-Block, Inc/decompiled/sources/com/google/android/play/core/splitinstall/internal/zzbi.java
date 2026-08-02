package com.google.android.play.core.splitinstall.internal;

import com.miteksystems.misnap.camera.a.n;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzbi extends n {
    public final void zza(List list) {
        Object[] objArr = (Object[]) zzc();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance(((Field) this.b).getType().getComponentType(), list.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            objArr2[length] = it.next();
            length++;
        }
        zze(objArr2);
    }

    public final void zzb(Collection collection) {
        Object[] objArr = (Object[]) zzc();
        int i = 0;
        Object[] objArr2 = (Object[]) Array.newInstance(((Field) this.b).getType().getComponentType(), collection.size() + (objArr == null ? 0 : objArr.length));
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArr2[i] = it.next();
            i++;
        }
        zze(objArr2);
    }
}
