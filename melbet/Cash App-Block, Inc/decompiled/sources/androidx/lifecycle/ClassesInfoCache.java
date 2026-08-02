package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class ClassesInfoCache {
    public static final ClassesInfoCache sInstance = new ClassesInfoCache();
    public final HashMap mCallbackMap = new HashMap();
    public final HashMap mHasLifecycleMethods = new HashMap();

    public final class CallbackInfo {
        public final HashMap mEventToHandlers = new HashMap();
        public final HashMap mHandlerToEvent;

        public CallbackInfo(HashMap hashMap) {
            this.mHandlerToEvent = hashMap;
            for (Map.Entry entry : hashMap.entrySet()) {
                Lifecycle.Event event = (Lifecycle.Event) entry.getValue();
                List list = (List) this.mEventToHandlers.get(event);
                if (list == null) {
                    list = new ArrayList();
                    this.mEventToHandlers.put(event, list);
                }
                list.add((MethodReference) entry.getKey());
            }
        }

        public static void invokeMethodsForEvent(List list, LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    MethodReference methodReference = (MethodReference) list.get(size);
                    Method method = methodReference.mMethod;
                    try {
                        int i = methodReference.mCallType;
                        if (i == 0) {
                            method.invoke(obj, null);
                        } else if (i == 1) {
                            method.invoke(obj, lifecycleOwner);
                        } else if (i == 2) {
                            method.invoke(obj, lifecycleOwner, event);
                        }
                    } catch (IllegalAccessException e) {
                        a$$ExternalSyntheticBUOutline0.m((Throwable) e);
                        return;
                    } catch (InvocationTargetException e2) {
                        OptionalProvider$$ExternalSyntheticLambda0.m("Failed to call observer method", e2.getCause());
                        return;
                    }
                }
            }
        }
    }

    public final class MethodReference {
        public final int mCallType;
        public final Method mMethod;

        public MethodReference(Method method, int i) {
            this.mCallType = i;
            this.mMethod = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodReference)) {
                return false;
            }
            MethodReference methodReference = (MethodReference) obj;
            return this.mCallType == methodReference.mCallType && this.mMethod.getName().equals(methodReference.mMethod.getName());
        }

        public final int hashCode() {
            return this.mMethod.getName().hashCode() + (this.mCallType * 31);
        }
    }

    public static void verifyAndPutHandler(HashMap hashMap, MethodReference methodReference, Lifecycle.Event event, Class cls) {
        Lifecycle.Event event2 = (Lifecycle.Event) hashMap.get(methodReference);
        if (event2 != null && event != event2) {
            WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Method ", methodReference.mMethod.getName(), " in ", cls.getName(), " already declared with different @OnLifecycleEvent value: previous value ", event2, ", new value ", event);
        } else if (event2 == null) {
            hashMap.put(methodReference, event);
        }
    }

    public final CallbackInfo createInfo(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.mCallbackMap;
        if (superclass != null) {
            CallbackInfo callbackInfo = (CallbackInfo) hashMap2.get(superclass);
            if (callbackInfo == null) {
                callbackInfo = createInfo(superclass, null);
            }
            hashMap.putAll(callbackInfo.mHandlerToEvent);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            CallbackInfo callbackInfo2 = (CallbackInfo) hashMap2.get(cls2);
            if (callbackInfo2 == null) {
                callbackInfo2 = createInfo(cls2, null);
            }
            for (Map.Entry entry : callbackInfo2.mHandlerToEvent.entrySet()) {
                verifyAndPutHandler(hashMap, (MethodReference) entry.getKey(), (Lifecycle.Event) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                Handlers$$ExternalSyntheticBUOutline0.m("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
                return null;
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!LifecycleOwner.class.isAssignableFrom(parameterTypes[0])) {
                        a$$ExternalSyntheticBUOutline0.m$3("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                Lifecycle.Event value = onLifecycleEvent.value();
                if (parameterTypes.length > 1) {
                    if (!Lifecycle.Event.class.isAssignableFrom(parameterTypes[1])) {
                        a$$ExternalSyntheticBUOutline0.m$3("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (value != Lifecycle.Event.ON_ANY) {
                        a$$ExternalSyntheticBUOutline0.m$3("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    a$$ExternalSyntheticBUOutline0.m$3("cannot have more than 2 params");
                    return null;
                }
                verifyAndPutHandler(hashMap, new MethodReference(method, i), value, cls);
                z = true;
            }
        }
        CallbackInfo callbackInfo3 = new CallbackInfo(hashMap);
        hashMap2.put(cls, callbackInfo3);
        this.mHasLifecycleMethods.put(cls, Boolean.valueOf(z));
        return callbackInfo3;
    }

    public final boolean hasLifecycleMethods(Class cls) {
        HashMap hashMap = this.mHasLifecycleMethods;
        Boolean bool = (Boolean) hashMap.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (((OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class)) != null) {
                    createInfo(cls, declaredMethods);
                    return true;
                }
            }
            hashMap.put(cls, Boolean.FALSE);
            return false;
        } catch (NoClassDefFoundError e) {
            Handlers$$ExternalSyntheticBUOutline0.m("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            return false;
        }
    }
}
