package com.nimbusds.jose.shaded.gson.internal.reflect;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.nimbusds.jose.shaded.gson.JsonIOException;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import operations.ComparingOperation;

/* loaded from: classes4.dex */
public abstract class ReflectionHelper {
    public static final ComparingOperation.DefaultImpls RECORD_HELPER;

    public final class RecordNotSupportedHelper extends ComparingOperation.DefaultImpls {
        @Override // operations.ComparingOperation.DefaultImpls
        public final Method getAccessor(Class cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // operations.ComparingOperation.DefaultImpls
        public final Constructor getCanonicalRecordConstructor(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // operations.ComparingOperation.DefaultImpls
        public final String[] getRecordComponentNames(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // operations.ComparingOperation.DefaultImpls
        public final boolean isRecord(Class cls) {
            return false;
        }
    }

    public final class RecordSupportedHelper extends ComparingOperation.DefaultImpls {
        public final Method getName;
        public final Method getType;
        public final Method isRecord = Class.class.getMethod("isRecord", null);
        public final Method getRecordComponents = Class.class.getMethod("getRecordComponents", null);

        public RecordSupportedHelper() {
            Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
            this.getName = cls.getMethod("getName", null);
            this.getType = cls.getMethod("getType", null);
        }

        @Override // operations.ComparingOperation.DefaultImpls
        public final Method getAccessor(Class cls, Field field) {
            try {
                return cls.getMethod(field.getName(), null);
            } catch (ReflectiveOperationException e) {
                OptionalProvider$$ExternalSyntheticLambda0.m("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", (Throwable) e);
                return null;
            }
        }

        @Override // operations.ComparingOperation.DefaultImpls
        public final Constructor getCanonicalRecordConstructor(Class cls) {
            try {
                Object[] objArr = (Object[]) this.getRecordComponents.invoke(cls, null);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    clsArr[i] = (Class) this.getType.invoke(objArr[i], null);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e) {
                OptionalProvider$$ExternalSyntheticLambda0.m("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", (Throwable) e);
                return null;
            }
        }

        @Override // operations.ComparingOperation.DefaultImpls
        public final String[] getRecordComponentNames(Class cls) {
            try {
                Object[] objArr = (Object[]) this.getRecordComponents.invoke(cls, null);
                String[] strArr = new String[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    strArr[i] = (String) this.getName.invoke(objArr[i], null);
                }
                return strArr;
            } catch (ReflectiveOperationException e) {
                OptionalProvider$$ExternalSyntheticLambda0.m("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", (Throwable) e);
                return null;
            }
        }

        @Override // operations.ComparingOperation.DefaultImpls
        public final boolean isRecord(Class cls) {
            try {
                return ((Boolean) this.isRecord.invoke(cls, null)).booleanValue();
            } catch (ReflectiveOperationException e) {
                OptionalProvider$$ExternalSyntheticLambda0.m("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", (Throwable) e);
                return false;
            }
        }
    }

    static {
        ComparingOperation.DefaultImpls recordNotSupportedHelper;
        try {
            recordNotSupportedHelper = new RecordSupportedHelper();
        } catch (ReflectiveOperationException unused) {
            recordNotSupportedHelper = new RecordNotSupportedHelper();
        }
        RECORD_HELPER = recordNotSupportedHelper;
    }

    public static void appendExecutableParameters(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
    }

    public static String constructorToString(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        appendExecutableParameters(constructor, sb);
        return sb.toString();
    }

    public static String fieldToString(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String getAccessibleObjectDescription(AccessibleObject accessibleObject, boolean z) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + fieldToString((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            appendExecutableParameters(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + constructorToString((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static String getInaccessibleTroubleshootingSuffix(Exception exc) {
        if (!exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            return "";
        }
        String message = exc.getMessage();
        return "\nSee ".concat("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat((message == null || !message.contains("to module com.google.gson")) ? "reflection-inaccessible" : "reflection-inaccessible-to-module-gson"));
    }

    public static void makeAccessible(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Failed making ", getAccessibleObjectDescription(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.");
            m3m.append(getInaccessibleTroubleshootingSuffix(e));
            throw new JsonIOException(m3m.toString(), e);
        }
    }
}
