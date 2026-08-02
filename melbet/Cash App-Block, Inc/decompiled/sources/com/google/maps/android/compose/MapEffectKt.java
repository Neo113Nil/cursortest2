package com.google.maps.android.compose;

import androidx.compose.material.TextKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import coil3.RealImageLoader$execute$2;
import com.google.android.gms.maps.GoogleMap;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$22;
import kotlin.reflect.jvm.internal.KotlinKPropertyN$$Lambda$0;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public abstract class MapEffectKt {
    public static final void MapEffect(Object obj, Function3 function3, Composer composer, int i) {
        int i2;
        function3.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-357282938);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (gapComposer.changedInstance(function3) ? 32 : 16);
        int i4 = 26;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Applier applier = gapComposer.applier;
            applier.getClass();
            GoogleMap googleMap = ((MapApplier) applier).map;
            boolean changedInstance = gapComposer.changedInstance(function3) | gapComposer.changedInstance(googleMap);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new RealImageLoader$execute$2(function3, googleMap, (Continuation) null, i4);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, obj, (Function2) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(obj, function3, i, i4);
        }
    }

    public static final Object createAnnotationInstance(final Class cls, final Map map, final List list) {
        cls.getClass();
        map.getClass();
        list.getClass();
        final Lazy lazy = LazyKt.lazy(new KotlinKPropertyN$$Lambda$0(map, 3));
        final Lazy lazy2 = LazyKt.lazy(new KClassImpl$Data$$Lambda$22(12, cls, map));
        Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler(cls, map, lazy2, lazy, list) { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$$Lambda$2
            public final Class arg$0;
            public final Map arg$1;
            public final Lazy arg$2;
            public final Lazy arg$3;
            public final List arg$4;

            {
                this.arg$0 = cls;
                this.arg$1 = map;
                this.arg$2 = lazy2;
                this.arg$3 = lazy;
                this.arg$4 = list;
            }

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                boolean areEqual;
                String name = method.getName();
                Class cls2 = this.arg$0;
                if (name != null) {
                    int hashCode = name.hashCode();
                    if (hashCode != -1776922004) {
                        if (hashCode != 147696667) {
                            if (hashCode == 1444986633 && name.equals("annotationType")) {
                                return cls2;
                            }
                        } else if (name.equals("hashCode")) {
                            return Integer.valueOf(((Number) this.arg$3.getValue()).intValue());
                        }
                    } else if (name.equals("toString")) {
                        return (String) this.arg$2.getValue();
                    }
                }
                boolean areEqual2 = Intrinsics.areEqual(name, "equals");
                Map map2 = this.arg$1;
                boolean z = false;
                if (!areEqual2 || objArr == null || objArr.length != 1) {
                    if (map2.containsKey(name)) {
                        return map2.get(name);
                    }
                    StringBuilder sb = new StringBuilder("Method is not supported: ");
                    sb.append(method);
                    sb.append(" (args: ");
                    if (objArr == null) {
                        objArr = new Object[0];
                    }
                    sb.append(ArraysKt___ArraysKt.toList(objArr));
                    sb.append(')');
                    throw new KotlinReflectionInternalError(sb.toString());
                }
                Object single = ArraysKt___ArraysKt.single(objArr);
                Annotation annotation = single instanceof Annotation ? (Annotation) single : null;
                if (Intrinsics.areEqual(annotation != null ? PapaEvent.getJavaClass(PapaEvent.getAnnotationClass(annotation)) : null, cls2)) {
                    List<Method> list2 = this.arg$4;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (Method method2 : list2) {
                            Object obj2 = map2.get(method2.getName());
                            Object invoke = method2.invoke(single, null);
                            if (obj2 instanceof boolean[]) {
                                invoke.getClass();
                                areEqual = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                            } else if (obj2 instanceof char[]) {
                                invoke.getClass();
                                areEqual = Arrays.equals((char[]) obj2, (char[]) invoke);
                            } else if (obj2 instanceof byte[]) {
                                invoke.getClass();
                                areEqual = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                            } else if (obj2 instanceof short[]) {
                                invoke.getClass();
                                areEqual = Arrays.equals((short[]) obj2, (short[]) invoke);
                            } else if (obj2 instanceof int[]) {
                                invoke.getClass();
                                areEqual = Arrays.equals((int[]) obj2, (int[]) invoke);
                            } else if (obj2 instanceof float[]) {
                                invoke.getClass();
                                areEqual = Arrays.equals((float[]) obj2, (float[]) invoke);
                            } else if (obj2 instanceof long[]) {
                                invoke.getClass();
                                areEqual = Arrays.equals((long[]) obj2, (long[]) invoke);
                            } else if (obj2 instanceof double[]) {
                                invoke.getClass();
                                areEqual = Arrays.equals((double[]) obj2, (double[]) invoke);
                            } else if (obj2 instanceof Object[]) {
                                invoke.getClass();
                                areEqual = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                            } else {
                                areEqual = Intrinsics.areEqual(obj2, invoke);
                            }
                            if (!areEqual) {
                                break;
                            }
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        newProxyInstance.getClass();
        return newProxyInstance;
    }

    public static /* synthetic */ Object createAnnotationInstance$default(Class cls, Map map) {
        Set keySet = map.keySet();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        return createAnnotationInstance(cls, map, arrayList);
    }
}
