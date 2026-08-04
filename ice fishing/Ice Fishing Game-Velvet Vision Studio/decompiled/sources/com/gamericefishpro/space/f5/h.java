package com.gamericefishpro.space.f5;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import com.gamericefishpro.space.i9.g4;
import com.gamericefishpro.space.z4.x0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static String a(com.gamericefishpro.space.b9.b context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        context.getClass();
        try {
            Context context2 = context.a;
            Intrinsics.b(context2);
            String resourceName = context2.getResources().getResourceName(i);
            Intrinsics.b(resourceName);
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    public static Sequence b(x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        return com.gamericefishpro.space.li.j.c(xVar, new q(1));
    }

    public static p c(x0 store) {
        Intrinsics.checkNotNullParameter(store, "viewModelStore");
        com.gamericefishpro.space.c5.d factory = r.a;
        com.gamericefishpro.space.c5.a defaultCreationExtras = com.gamericefishpro.space.c5.a.b;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "extras");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        com.gamericefishpro.space.u6.i iVar = new com.gamericefishpro.space.u6.i(store, factory, defaultCreationExtras);
        com.gamericefishpro.space.ei.g modelClass = com.gamericefishpro.space.ei.b0.a(p.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String strB = modelClass.b();
        if (strB != null) {
            return (p) iVar.d(modelClass, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static String d(Class navigatorClass) {
        Intrinsics.checkNotNullParameter(navigatorClass, "navigatorClass");
        LinkedHashMap linkedHashMap = q0.b;
        String strValue = (String) linkedHashMap.get(navigatorClass);
        if (strValue == null) {
            o0 o0Var = (o0) navigatorClass.getAnnotation(o0.class);
            strValue = o0Var != null ? o0Var.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(navigatorClass.getSimpleName()).toString());
            }
            linkedHashMap.put(navigatorClass, strValue);
        }
        Intrinsics.b(strValue);
        return strValue;
    }

    public static final ArrayList e(Map map, Function1 isArgumentMissing) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(isArgumentMissing, "isArgumentMissing");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            i iVar = (i) entry.getValue();
            Boolean bool = iVar != null ? Boolean.FALSE : null;
            Intrinsics.b(bool);
            if (!bool.booleanValue() && !iVar.b) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) isArgumentMissing.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    public static final g f(String name, Function1 builder) {
        n0 m0Var;
        Class<?> componentType;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(builder, "builder");
        j jVar = new j();
        builder.invoke(jVar);
        g4 g4Var = jVar.a;
        n0 n0Var = (n0) g4Var.b;
        if (n0Var == null) {
            Object obj = (String) g4Var.c;
            if (obj instanceof int[]) {
                m0Var = n0.b;
            } else if (obj instanceof long[]) {
                m0Var = n0.d;
            } else if (obj instanceof float[]) {
                m0Var = n0.f;
            } else if (obj instanceof boolean[]) {
                m0Var = n0.h;
            } else {
                m0Var = (obj != null || obj == null) ? n0.i : null;
            }
            if (m0Var != null) {
                n0Var = m0Var;
            } else if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                n0Var = n0.j;
            } else {
                Intrinsics.b(obj);
                if (obj.getClass().isArray()) {
                    Class<?> componentType2 = obj.getClass().getComponentType();
                    Intrinsics.b(componentType2);
                    if (Parcelable.class.isAssignableFrom(componentType2)) {
                        Class<?> componentType3 = obj.getClass().getComponentType();
                        Intrinsics.c(componentType3, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                        m0Var = new j0(componentType3);
                    } else if (obj.getClass().isArray()) {
                        componentType = obj.getClass().getComponentType();
                        Intrinsics.b(componentType);
                        if (Serializable.class.isAssignableFrom(componentType)) {
                            Class<?> componentType4 = obj.getClass().getComponentType();
                            Intrinsics.c(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                            m0Var = new l0(componentType4);
                        } else if (obj instanceof Parcelable) {
                            m0Var = new k0(obj.getClass());
                        } else {
                            m0Var = new m0(obj.getClass());
                        }
                    } else if (obj instanceof Parcelable) {
                        m0Var = new k0(obj.getClass());
                    } else {
                        m0Var = new m0(obj.getClass());
                    }
                } else if (obj.getClass().isArray()) {
                    componentType = obj.getClass().getComponentType();
                    Intrinsics.b(componentType);
                    if (Serializable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType5 = obj.getClass().getComponentType();
                        Intrinsics.c(componentType5, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        m0Var = new l0(componentType5);
                    } else if (obj instanceof Parcelable) {
                        m0Var = new k0(obj.getClass());
                    } else {
                        m0Var = new m0(obj.getClass());
                    }
                } else if (obj instanceof Parcelable) {
                    m0Var = new k0(obj.getClass());
                } else {
                    m0Var = new m0(obj.getClass());
                }
                n0Var = m0Var;
            }
        }
        return new g(name, new i(n0Var, (String) g4Var.c, g4Var.a));
    }

    public static final g0 g(Function1 optionsBuilder) {
        Intrinsics.checkNotNullParameter(optionsBuilder, "optionsBuilder");
        h0 h0Var = new h0();
        optionsBuilder.invoke(h0Var);
        boolean z = h0Var.b;
        f0 f0Var = h0Var.a;
        f0Var.a = z;
        f0Var.b = h0Var.c;
        String str = h0Var.e;
        if (str != null) {
            boolean z2 = h0Var.f;
            boolean z3 = h0Var.g;
            f0Var.d = str;
            f0Var.c = -1;
            f0Var.e = z2;
            f0Var.f = z3;
        } else {
            int i = h0Var.d;
            boolean z4 = h0Var.f;
            boolean z5 = h0Var.g;
            f0Var.c = i;
            f0Var.d = null;
            f0Var.e = z4;
            f0Var.f = z5;
        }
        String str2 = f0Var.d;
        if (str2 == null) {
            return new g0(f0Var.a, f0Var.b, f0Var.c, f0Var.e, f0Var.f, f0Var.g, f0Var.h);
        }
        boolean z6 = f0Var.a;
        boolean z7 = f0Var.b;
        boolean z8 = f0Var.e;
        boolean z9 = f0Var.f;
        int i2 = f0Var.g;
        int i3 = f0Var.h;
        int i4 = x.w;
        g0 g0Var = new g0(z6, z7, "android-app://androidx.navigation/".concat(str2).hashCode(), z8, z9, i2, i3);
        g0Var.h = str2;
        return g0Var;
    }
}
