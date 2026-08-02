package com.google.firebase.components;

import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.local.IidStore;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final /* synthetic */ class ComponentDiscovery$$ExternalSyntheticLambda0 implements Provider {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ComponentDiscovery$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new InvalidRegistrarException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new InvalidRegistrarException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new InvalidRegistrarException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new InvalidRegistrarException(Recorder$$ExternalSyntheticOutline2.m("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new InvalidRegistrarException(Recorder$$ExternalSyntheticOutline2.m("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                return new IidStore((FirebaseApp) obj);
        }
    }
}
