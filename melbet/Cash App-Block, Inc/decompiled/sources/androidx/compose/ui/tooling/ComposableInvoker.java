package androidx.compose.ui.tooling;

import android.util.Log;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.compose.FullScreenKt$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Headers;
import papa.PapaEvent;

/* loaded from: classes3.dex */
public abstract class ComposableInvoker {
    public static final ComposableLambdaImpl lambda$558638247 = new ComposableLambdaImpl(new FullScreenKt$$ExternalSyntheticLambda0(11), false, 558638247);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static Method findCompatibleComposeMethod(Method[] methodArr, String str, Class... clsArr) {
        Method method;
        int length = methodArr.length;
        boolean z = false;
        int i = 0;
        loop0: while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = methodArr[i];
            if (str.equals(method.getName()) || StringsKt__StringsJVMKt.startsWith(method.getName(), str.concat("-"), z)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                if (parameterTypes.length == clsArr2.length) {
                    ArrayList arrayList = new ArrayList(parameterTypes.length);
                    int length2 = parameterTypes.length;
                    boolean z2 = z;
                    ?? r12 = z2;
                    for (?? r11 = z2; r11 < length2; r11++) {
                        Class<?> cls = parameterTypes[r11];
                        int i2 = r12 + 1;
                        Class<?> cls2 = clsArr2[r12];
                        arrayList.add(Boolean.valueOf(PapaEvent.getKotlinClass(cls).equals(PapaEvent.getKotlinClass(cls2)) || cls.isAssignableFrom(cls2)));
                        r12 = i2;
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                continue;
            }
            i++;
            z = false;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str.concat(" not found"));
    }

    public static Method findComposableMethod(Class cls, String str, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj = objArr[i];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int length2 = clsArr.length;
                int ceil = length2 == 0 ? 1 : (int) Math.ceil(length2 / 10.0d);
                Class cls3 = Integer.TYPE;
                IntRange until = RangesKt___RangesKt.until(0, ceil);
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10));
                IntProgressionIterator it = until.iterator();
                while (it.hasNext) {
                    it.nextInt();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                Headers.Builder builder = new Headers.Builder(3);
                ArrayList arrayList3 = builder.namesAndValues;
                builder.addSpread(clsArr);
                builder.add(Composer.class);
                builder.addSpread(clsArr2);
                return findCompatibleComposeMethod(declaredMethods, str, (Class[]) arrayList3.toArray(new Class[arrayList3.size()]));
            } catch (ReflectiveOperationException unused) {
                for (Method method : cls.getDeclaredMethods()) {
                    if (!Intrinsics.areEqual(method.getName(), str)) {
                        if (!StringsKt__StringsJVMKt.startsWith(method.getName(), str + '-', false)) {
                        }
                    }
                    return method;
                }
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            return null;
        }
    }

    public static void invokeComposable(String str, String str2, GapComposer gapComposer, Object... objArr) {
        try {
            Class<?> cls = Class.forName(str);
            Method findComposableMethod = findComposableMethod(cls, str2, Arrays.copyOf(objArr, objArr.length));
            if (findComposableMethod != null) {
                findComposableMethod.setAccessible(true);
                if (Modifier.isStatic(findComposableMethod.getModifiers())) {
                    invokeComposableMethod(findComposableMethod, null, gapComposer, Arrays.copyOf(objArr, objArr.length));
                    return;
                } else {
                    invokeComposableMethod(findComposableMethod, cls.getConstructor(null).newInstance(null), gapComposer, Arrays.copyOf(objArr, objArr.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + '.' + str2 + " not found");
        } catch (Exception e) {
            Log.w("PreviewLogger", "Failed to invoke Composable Method '" + str + '.' + str2 + '\'', null);
            throw e;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d2, code lost:
    
        if (r8.equals("int") == false) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void invokeComposableMethod(Method method, Object obj, Composer composer, Object... objArr) {
        Object obj2;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (Intrinsics.areEqual(parameterTypes[length], Composer.class)) {
                    i = length;
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        int i3 = i + 1;
        int ceil = (i != 0 ? (int) Math.ceil(((obj != null ? 1 : 0) + i) / 10.0d) : 1) + i3;
        int length2 = method.getParameterTypes().length;
        if ((length2 != ceil ? (int) Math.ceil(i / 31.0d) : 0) + ceil != length2) {
            a$$ExternalSyntheticBUOutline0.m$1("params don't add up to total params");
            return;
        }
        Object[] objArr2 = new Object[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            if (i4 < 0 || i4 >= i) {
                if (i4 == i) {
                    obj2 = composer;
                } else {
                    if (i3 > i4 || i4 >= ceil) {
                        if (ceil > i4 || i4 >= length2) {
                            a$$ExternalSyntheticBUOutline0.m$1("Unexpected index");
                            return;
                        }
                        obj2 = 2097151;
                    }
                    obj2 = 0;
                }
            } else if (i4 < 0 || i4 >= objArr.length) {
                String name = method.getParameterTypes()[i4].getName();
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            obj2 = Double.valueOf(0.0d);
                            break;
                        }
                        obj2 = null;
                        break;
                    case 104431:
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            obj2 = (byte) 0;
                            break;
                        }
                        obj2 = null;
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            obj2 = (char) 0;
                            break;
                        }
                        obj2 = null;
                        break;
                    case 3327612:
                        if (name.equals("long")) {
                            obj2 = 0L;
                            break;
                        }
                        obj2 = null;
                        break;
                    case 64711720:
                        if (name.equals(InquiryField.BooleanField.TYPE)) {
                            obj2 = Boolean.FALSE;
                            break;
                        }
                        obj2 = null;
                        break;
                    case 97526364:
                        if (name.equals(InquiryField.FloatField.TYPE)) {
                            obj2 = Float.valueOf(RecyclerView.DECELERATION_RATE);
                            break;
                        }
                        obj2 = null;
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            obj2 = (short) 0;
                            break;
                        }
                        obj2 = null;
                        break;
                    default:
                        obj2 = null;
                        break;
                }
            } else {
                obj2 = objArr[i4];
            }
            objArr2[i4] = obj2;
        }
        method.invoke(obj, Arrays.copyOf(objArr2, length2));
    }

    public static final Object unwrapIfInline(Object obj) {
        if (obj != null) {
            for (Annotation annotation : obj.getClass().getAnnotations()) {
                if (annotation instanceof JvmInline) {
                    for (Field field : obj.getClass().getDeclaredFields()) {
                        if (field.getType().isPrimitive()) {
                            Field declaredField = obj.getClass().getDeclaredField(field.getName());
                            declaredField.setAccessible(true);
                            return declaredField.get(obj);
                        }
                    }
                    OptionalProvider$$ExternalSyntheticLambda0.m("Array contains no element matching the predicate.");
                    return null;
                }
            }
        }
        return obj;
    }
}
