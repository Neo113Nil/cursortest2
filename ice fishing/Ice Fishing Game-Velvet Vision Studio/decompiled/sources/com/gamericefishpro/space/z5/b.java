package com.gamericefishpro.space.z5;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.d.k;
import com.gamericefishpro.space.z4.m0;
import com.gamericefishpro.space.z4.o;
import com.gamericefishpro.space.z4.s;
import com.gamericefishpro.space.z4.s0;
import com.gamericefishpro.space.z4.u;
import com.gamericefishpro.space.z4.x0;
import com.gamericefishpro.space.z4.y0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements s {
    public final /* synthetic */ int d = 1;
    public final e e;

    public b(e owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.e = owner;
    }

    @Override // com.gamericefishpro.space.z4.s
    public final void j(u source, o event) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event != o.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                source.g().f(this);
                e owner = this.e;
                Bundle source2 = owner.b().f("androidx.savedstate.Restarter");
                if (source2 == null) {
                    return;
                }
                Intrinsics.checkNotNullParameter(source2, "source");
                Intrinsics.checkNotNullParameter("classes_to_restore", "key");
                ArrayList<String> stringArrayList = source2.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                int size = stringArrayList.size();
                int i = 0;
                while (i < size) {
                    String str = stringArrayList.get(i);
                    i++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, b.class.getClassLoader()).asSubclass(c.class);
                        Intrinsics.b(clsAsSubclass);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                Intrinsics.b(objNewInstance);
                                Intrinsics.checkNotNullParameter(owner, "owner");
                                if (!(owner instanceof y0)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + owner).toString());
                                }
                                x0 x0VarF = ((y0) owner).f();
                                com.gamericefishpro.space.u6.s sVarB = owner.b();
                                x0VarF.getClass();
                                LinkedHashMap linkedHashMap = x0VarF.a;
                                for (String key : new HashSet(linkedHashMap.keySet())) {
                                    Intrinsics.checkNotNullParameter(key, "key");
                                    s0 s0Var = (s0) linkedHashMap.get(key);
                                    if (s0Var != null) {
                                        m0.a(s0Var, sVarB, owner.g());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    sVarB.m();
                                }
                            } catch (Exception e) {
                                throw new RuntimeException(com.gamericefishpro.space.m5.a.u("Failed to instantiate ", str2), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(com.gamericefishpro.space.t0.y0.g("Class ", str2, " wasn't found"), e3);
                    }
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                k kVar = (k) this.e;
                if (kVar.w == null) {
                    com.gamericefishpro.space.d.g gVar = (com.gamericefishpro.space.d.g) kVar.getLastNonConfigurationInstance();
                    if (gVar != null) {
                        kVar.w = gVar.a;
                    }
                    if (kVar.w == null) {
                        kVar.w = new x0();
                    }
                }
                kVar.d.f(this);
                return;
        }
    }

    public b(k kVar) {
        this.e = kVar;
    }
}
