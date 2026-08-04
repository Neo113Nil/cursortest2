package com.gamericefishpro.space.n4;

import android.content.Context;
import android.content.SharedPreferences;
import com.gamericefishpro.space.o4.j;
import com.gamericefishpro.space.oh.i;
import com.gamericefishpro.space.oh.s;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final com.gamericefishpro.space.k7.e a;
    public final j b;
    public final Context c;
    public final String d;
    public final s e;
    public final LinkedHashSet f;

    public c(Context context, String sharedPreferencesName, Set keysToMigrate, com.gamericefishpro.space.k7.e shouldRunMigration, j migrate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
        com.gamericefishpro.space.b2.b bVar = new com.gamericefishpro.space.b2.b(10, context, sharedPreferencesName);
        this.a = shouldRunMigration;
        this.b = migrate;
        this.c = context;
        this.d = sharedPreferencesName;
        this.e = i.b(bVar);
        this.f = keysToMigrate == d.a ? null : CollectionsKt.N(keysToMigrate);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, com.gamericefishpro.space.vh.c cVar) {
        b bVar;
        c cVar2;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i = bVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.v = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objInvoke = bVar.e;
        com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
        int i2 = bVar.v;
        boolean z = true;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(objInvoke);
            bVar.d = this;
            bVar.v = 1;
            objInvoke = this.a.invoke(obj, bVar);
            if (objInvoke == aVar) {
                return aVar;
            }
            cVar2 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar2 = bVar.d;
            com.gamericefishpro.space.wa.b.P(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        LinkedHashSet linkedHashSet = cVar2.f;
        s sVar = cVar2.e;
        if (linkedHashSet == null) {
            Map<String, ?> all = ((SharedPreferences) sVar.getValue()).getAll();
            Intrinsics.checkNotNullExpressionValue(all, "sharedPrefs.all");
            if (all.isEmpty()) {
                z = false;
            }
        } else {
            SharedPreferences sharedPreferences = (SharedPreferences) sVar.getValue();
            if (linkedHashSet.isEmpty()) {
                z = false;
            } else {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
