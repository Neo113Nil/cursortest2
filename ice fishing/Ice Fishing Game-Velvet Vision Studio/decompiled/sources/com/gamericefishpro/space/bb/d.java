package com.gamericefishpro.space.bb;

import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.t0.y0;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements com.gamericefishpro.space.nb.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.gamericefishpro.space.nb.a
    public final Object get() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String str = (String) this.b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new p("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new p(y0.g("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new p(y0.g("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new p(com.gamericefishpro.space.m5.a.u("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new p(com.gamericefishpro.space.m5.a.u("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) this.b;
            default:
                return new com.gamericefishpro.space.pb.c((com.gamericefishpro.space.wa.g) this.b);
        }
    }
}
