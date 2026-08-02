package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import kotlin.collections.ArraysKt__ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes3.dex */
public abstract class NavType {
    public static final IntListNavType BoolArrayType;
    public static final IntListNavType BoolListType;
    public static final IntNavType BoolType;
    public static final IntListNavType FloatArrayType;
    public static final IntListNavType FloatListType;
    public static final IntNavType FloatType;
    public static final IntListNavType IntArrayType;
    public static final IntListNavType IntListType;
    public static final IntNavType IntType;
    public static final IntListNavType LongArrayType;
    public static final IntListNavType LongListType;
    public static final IntNavType LongType;
    public static final IntNavType ReferenceType;
    public static final IntListNavType StringArrayType;
    public static final IntListNavType StringListType;
    public static final IntNavType StringType;
    public final boolean isNullableAllowed;

    public final class EnumType extends SerializableType {

        /* renamed from: type, reason: collision with root package name */
        public final Class f902type;

        public EnumType(Class cls) {
            super(cls, 0);
            if (cls.isEnum()) {
                this.f902type = cls;
            } else {
                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(cls, " is not an Enum type.");
                throw null;
            }
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        public final String getName() {
            return this.f902type.getName();
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        /* renamed from: parseValue */
        public final Enum mo1158parseValue(String str) {
            Object obj;
            str.getClass();
            Class cls = this.f902type;
            Object[] enumConstants = cls.getEnumConstants();
            enumConstants.getClass();
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    obj = null;
                    break;
                }
                obj = enumConstants[i];
                if (StringsKt__StringsJVMKt.equals(((Enum) obj).name(), str, true)) {
                    break;
                }
                i++;
            }
            Enum r3 = (Enum) obj;
            if (r3 != null) {
                return r3;
            }
            StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Enum value ", str, " not found for type ");
            m3m.append(cls.getName());
            m3m.append('.');
            throw new IllegalArgumentException(m3m.toString());
        }
    }

    public final class ParcelableArrayType extends NavType {
        public final Class arrayType;

        public ParcelableArrayType(Class cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(cls, " does not implement Parcelable.");
                throw null;
            }
            try {
                this.arrayType = Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e) {
                a$$ExternalSyntheticBUOutline0.m((Throwable) e);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !ParcelableArrayType.class.equals(obj.getClass())) {
                return false;
            }
            return Intrinsics.areEqual(this.arrayType, ((ParcelableArrayType) obj).arrayType);
        }

        @Override // androidx.navigation.NavType
        public final Object get(Bundle bundle, String str) {
            bundle.getClass();
            return (Parcelable[]) bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public final String getName() {
            return this.arrayType.getName();
        }

        public final int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // androidx.navigation.NavType
        /* renamed from: parseValue */
        public final Object mo1158parseValue(String str) {
            str.getClass();
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public final void put(Bundle bundle, String str, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            str.getClass();
            this.arrayType.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        @Override // androidx.navigation.NavType
        public final boolean valueEquals(Object obj, Object obj2) {
            return ArraysKt__ArraysKt.contentDeepEquals((Parcelable[]) obj, (Parcelable[]) obj2);
        }
    }

    public final class ParcelableType extends NavType {

        /* renamed from: type, reason: collision with root package name */
        public final Class f903type;

        public ParcelableType(Class cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f903type = cls;
            } else {
                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(cls, " does not implement Parcelable or Serializable.");
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !ParcelableType.class.equals(obj.getClass())) {
                return false;
            }
            return Intrinsics.areEqual(this.f903type, ((ParcelableType) obj).f903type);
        }

        @Override // androidx.navigation.NavType
        public final Object get(Bundle bundle, String str) {
            bundle.getClass();
            return bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public final String getName() {
            return this.f903type.getName();
        }

        public final int hashCode() {
            return this.f903type.hashCode();
        }

        @Override // androidx.navigation.NavType
        /* renamed from: parseValue */
        public final Object mo1158parseValue(String str) {
            str.getClass();
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public final void put(Bundle bundle, String str, Object obj) {
            str.getClass();
            this.f903type.cast(obj);
            if (obj == null || (obj instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            }
        }
    }

    public final class SerializableArrayType extends NavType {
        public final Class arrayType;

        public SerializableArrayType(Class cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(cls, " does not implement Serializable.");
                throw null;
            }
            try {
                this.arrayType = Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e) {
                a$$ExternalSyntheticBUOutline0.m((Throwable) e);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !SerializableArrayType.class.equals(obj.getClass())) {
                return false;
            }
            return Intrinsics.areEqual(this.arrayType, ((SerializableArrayType) obj).arrayType);
        }

        @Override // androidx.navigation.NavType
        public final Object get(Bundle bundle, String str) {
            bundle.getClass();
            return (Serializable[]) bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public final String getName() {
            return this.arrayType.getName();
        }

        public final int hashCode() {
            return this.arrayType.hashCode();
        }

        @Override // androidx.navigation.NavType
        /* renamed from: parseValue */
        public final Object mo1158parseValue(String str) {
            str.getClass();
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
        @Override // androidx.navigation.NavType
        public final void put(Bundle bundle, String str, Object obj) {
            ?? r3 = (Serializable[]) obj;
            str.getClass();
            this.arrayType.cast(r3);
            bundle.putSerializable(str, r3);
        }

        @Override // androidx.navigation.NavType
        public final boolean valueEquals(Object obj, Object obj2) {
            return ArraysKt__ArraysKt.contentDeepEquals((Serializable[]) obj, (Serializable[]) obj2);
        }
    }

    static {
        boolean z = false;
        IntType = new IntNavType(z, 0);
        ReferenceType = new IntNavType(z, 4);
        boolean z2 = true;
        IntArrayType = new IntListNavType(z2, 5);
        IntListType = new IntListNavType(z2, 0);
        LongType = new IntNavType(z, 3);
        LongArrayType = new IntListNavType(z2, 6);
        LongListType = new IntListNavType(z2, 7);
        FloatType = new IntNavType(z, 2);
        FloatArrayType = new IntListNavType(z2, 3);
        FloatListType = new IntListNavType(z2, 4);
        int i = 1;
        BoolType = new IntNavType(z, i);
        BoolArrayType = new IntListNavType(z2, i);
        BoolListType = new IntListNavType(z2, 2);
        StringType = new IntNavType(z2, 5);
        StringArrayType = new IntListNavType(z2, 8);
        StringListType = new IntListNavType(z2, 9);
    }

    public NavType(boolean z) {
        this.isNullableAllowed = z;
    }

    public abstract Object get(Bundle bundle, String str);

    public abstract String getName();

    public Object parseValue(Object obj, String str) {
        return mo1158parseValue(str);
    }

    /* renamed from: parseValue */
    public abstract Object mo1158parseValue(String str);

    public abstract void put(Bundle bundle, String str, Object obj);

    public String serializeAsValue(Object obj) {
        return String.valueOf(obj);
    }

    public final String toString() {
        return getName();
    }

    public boolean valueEquals(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    public class SerializableType extends NavType {

        /* renamed from: type, reason: collision with root package name */
        public final Class f904type;

        public SerializableType(Class cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(cls, " does not implement Serializable.");
                throw null;
            }
            if (cls.isEnum()) {
                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(cls, " is an Enum. You should use EnumType instead.");
                throw null;
            }
            this.f904type = cls;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SerializableType)) {
                return false;
            }
            return Intrinsics.areEqual(this.f904type, ((SerializableType) obj).f904type);
        }

        @Override // androidx.navigation.NavType
        public final Object get(Bundle bundle, String str) {
            bundle.getClass();
            return (Serializable) bundle.get(str);
        }

        @Override // androidx.navigation.NavType
        public String getName() {
            return this.f904type.getName();
        }

        public final int hashCode() {
            return this.f904type.hashCode();
        }

        @Override // androidx.navigation.NavType
        /* renamed from: parseValue */
        public Serializable mo1158parseValue(String str) {
            str.getClass();
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public final void put(Bundle bundle, String str, Object obj) {
            Serializable serializable = (Serializable) obj;
            str.getClass();
            serializable.getClass();
            this.f904type.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        public SerializableType(Class cls, int i) {
            super(false);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f904type = cls;
            } else {
                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(cls, " does not implement Serializable.");
                throw null;
            }
        }
    }
}
