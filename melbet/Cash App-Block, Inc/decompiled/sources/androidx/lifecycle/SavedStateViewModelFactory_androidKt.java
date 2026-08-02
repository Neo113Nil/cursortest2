package androidx.lifecycle;

import android.app.Application;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class SavedStateViewModelFactory_androidKt {
    public static final List ANDROID_VIEWMODEL_SIGNATURE = CollectionsKt__CollectionsKt.listOf((Object[]) new Class[]{Application.class, SavedStateHandle.class});
    public static final List VIEWMODEL_SIGNATURE = CollectionsKt__CollectionsJVMKt.listOf(SavedStateHandle.class);

    public static final Constructor findMatchingConstructor(List list, Class cls) {
        cls.getClass();
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List list2 = ArraysKt___ArraysKt.toList(parameterTypes);
            if (Intrinsics.areEqual(list, list2)) {
                return constructor;
            }
            if (list.size() == list2.size() && list2.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final ViewModel newInstance(Class cls, Constructor constructor, Object... objArr) {
        cls.getClass();
        try {
            return (ViewModel) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m(Boxes$$ExternalSyntheticOutline1.m(cls, "Failed to access "), (Throwable) e);
            return null;
        } catch (InstantiationException e2) {
            OptionalProvider$$ExternalSyntheticLambda0.m(Boxes$$ExternalSyntheticOutline1.m(cls, "A ", " cannot be instantiated."), (Throwable) e2);
            return null;
        } catch (InvocationTargetException e3) {
            OptionalProvider$$ExternalSyntheticLambda0.m(Boxes$$ExternalSyntheticOutline1.m(cls, "An exception happened in constructor of "), e3.getCause());
            return null;
        }
    }
}
