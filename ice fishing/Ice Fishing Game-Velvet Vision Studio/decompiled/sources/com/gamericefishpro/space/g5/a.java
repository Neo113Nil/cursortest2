package com.gamericefishpro.space.g5;

import com.gamericefishpro.space.si.n0;
import com.gamericefishpro.space.z4.j0;
import com.gamericefishpro.space.z4.s0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends s0 {
    public final String b = "SaveableStateHolder_BackStackEntryKey";
    public final String c;
    public com.gamericefishpro.space.vb.c d;

    public a(j0 j0Var) {
        Object value;
        Object obj;
        j0Var.getClass();
        Intrinsics.checkNotNullParameter("SaveableStateHolder_BackStackEntryKey", "key");
        com.gamericefishpro.space.b1.d dVar = j0Var.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) dVar.d;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) dVar.v;
        Intrinsics.checkNotNullParameter("SaveableStateHolder_BackStackEntryKey", "key");
        try {
            com.gamericefishpro.space.si.z zVar = (com.gamericefishpro.space.si.z) linkedHashMap2.get("SaveableStateHolder_BackStackEntryKey");
            if (zVar == null || (value = ((n0) zVar).getValue()) == null) {
                value = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
            }
        } catch (ClassCastException unused) {
            Intrinsics.checkNotNullParameter("SaveableStateHolder_BackStackEntryKey", "key");
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            ((LinkedHashMap) dVar.i).remove("SaveableStateHolder_BackStackEntryKey");
            linkedHashMap2.remove("SaveableStateHolder_BackStackEntryKey");
            value = null;
        }
        String string = (String) value;
        if (string == null) {
            string = UUID.randomUUID().toString();
            String key = this.b;
            Intrinsics.checkNotNullParameter(key, "key");
            if (string != null) {
                ArrayList arrayList = com.gamericefishpro.space.b5.b.a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i = 0;
                    do {
                        if (i < size) {
                            obj = arrayList.get(i);
                            i++;
                        }
                    } while (!((Class) obj).isInstance(string));
                }
                throw new IllegalArgumentException(("Can't put value with type " + string.getClass() + " into saved state").toString());
            }
            ArrayList arrayList2 = com.gamericefishpro.space.b5.b.a;
            Object obj2 = j0Var.a.get(key);
            com.gamericefishpro.space.z4.b0 b0Var = obj2 instanceof com.gamericefishpro.space.z4.b0 ? (com.gamericefishpro.space.z4.b0) obj2 : null;
            if (b0Var != null) {
                b0Var.b(string);
            }
            dVar.r(string, key);
        }
        this.c = string;
    }

    @Override // com.gamericefishpro.space.z4.s0
    public final void d() {
        com.gamericefishpro.space.vb.c cVar = this.d;
        if (cVar == null) {
            Intrinsics.h("saveableStateHolderRef");
            throw null;
        }
        com.gamericefishpro.space.e1.c cVar2 = (com.gamericefishpro.space.e1.c) ((WeakReference) cVar.e).get();
        if (cVar2 != null) {
            cVar2.b(this.c);
        }
        com.gamericefishpro.space.vb.c cVar3 = this.d;
        if (cVar3 != null) {
            ((WeakReference) cVar3.e).clear();
        } else {
            Intrinsics.h("saveableStateHolderRef");
            throw null;
        }
    }
}
