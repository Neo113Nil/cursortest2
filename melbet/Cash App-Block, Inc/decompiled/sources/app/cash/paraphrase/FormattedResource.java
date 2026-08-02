package app.cash.paraphrase;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.google.android.gms.common.zza;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.ArraysKt__ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class FormattedResource implements Parcelable {
    public static final Parcelable.Creator<FormattedResource> CREATOR = new zza(3);
    public final Object arguments;
    public final int id;

    public FormattedResource(int i, Object obj) {
        obj.getClass();
        this.id = i;
        this.arguments = obj;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean areEqual;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormattedResource)) {
            return false;
        }
        FormattedResource formattedResource = (FormattedResource) obj;
        Object obj2 = formattedResource.arguments;
        if (this.id != formattedResource.id) {
            return false;
        }
        Object obj3 = this.arguments;
        if (obj3 instanceof Object[]) {
            if (obj2 instanceof Object[]) {
                areEqual = ArraysKt__ArraysKt.contentDeepEquals((Object[]) obj3, (Object[]) obj2);
            }
            areEqual = false;
        } else if (obj3 instanceof boolean[]) {
            if (obj2 instanceof boolean[]) {
                areEqual = Arrays.equals((boolean[]) obj3, (boolean[]) obj2);
            }
            areEqual = false;
        } else if (obj3 instanceof char[]) {
            if (obj2 instanceof char[]) {
                areEqual = Arrays.equals((char[]) obj3, (char[]) obj2);
            }
            areEqual = false;
        } else if (obj3 instanceof byte[]) {
            if (obj2 instanceof byte[]) {
                areEqual = Arrays.equals((byte[]) obj3, (byte[]) obj2);
            }
            areEqual = false;
        } else if (obj3 instanceof short[]) {
            if (obj2 instanceof short[]) {
                areEqual = Arrays.equals((short[]) obj3, (short[]) obj2);
            }
            areEqual = false;
        } else if (obj3 instanceof int[]) {
            if (obj2 instanceof int[]) {
                areEqual = Arrays.equals((int[]) obj3, (int[]) obj2);
            }
            areEqual = false;
        } else if (obj3 instanceof float[]) {
            if (obj2 instanceof float[]) {
                areEqual = Arrays.equals((float[]) obj3, (float[]) obj2);
            }
            areEqual = false;
        } else if (obj3 instanceof long[]) {
            if (obj2 instanceof long[]) {
                areEqual = Arrays.equals((long[]) obj3, (long[]) obj2);
            }
            areEqual = false;
        } else if (obj3 instanceof double[]) {
            if (obj2 instanceof double[]) {
                areEqual = Arrays.equals((double[]) obj3, (double[]) obj2);
            }
            areEqual = false;
        } else {
            areEqual = Intrinsics.areEqual(obj3, obj2);
        }
        return areEqual;
    }

    public final int hashCode() {
        int i = this.id * 31;
        Object obj = this.arguments;
        return i + (obj instanceof Object[] ? Arrays.deepHashCode((Object[]) obj) : obj instanceof boolean[] ? Arrays.hashCode((boolean[]) obj) : obj instanceof char[] ? Arrays.hashCode((char[]) obj) : obj instanceof byte[] ? Arrays.hashCode((byte[]) obj) : obj instanceof short[] ? Arrays.hashCode((short[]) obj) : obj instanceof int[] ? Arrays.hashCode((int[]) obj) : obj instanceof float[] ? Arrays.hashCode((float[]) obj) : obj instanceof long[] ? Arrays.hashCode((long[]) obj) : obj instanceof double[] ? Arrays.hashCode((double[]) obj) : obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder("FormattedResource(id=");
        sb.append(this.id);
        sb.append(", arguments=");
        Object obj = this.arguments;
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            if (length > 429496729) {
                length = 429496729;
            }
            StringBuilder sb2 = new StringBuilder((length * 5) + 2);
            ArraysKt__ArraysKt.contentDeepToStringInternal$ArraysKt__ArraysKt(objArr, sb2, new ArrayList());
            valueOf = sb2.toString();
        } else {
            if (obj instanceof boolean[]) {
                valueOf = Arrays.toString((boolean[]) obj);
            } else if (obj instanceof char[]) {
                valueOf = Arrays.toString((char[]) obj);
            } else if (obj instanceof byte[]) {
                valueOf = Arrays.toString((byte[]) obj);
            } else if (obj instanceof short[]) {
                valueOf = Arrays.toString((short[]) obj);
            } else if (obj instanceof int[]) {
                valueOf = Arrays.toString((int[]) obj);
            } else if (obj instanceof float[]) {
                valueOf = Arrays.toString((float[]) obj);
            } else if (obj instanceof long[]) {
                valueOf = Arrays.toString((long[]) obj);
            } else if (obj instanceof double[]) {
                valueOf = Arrays.toString((double[]) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            valueOf.getClass();
        }
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, valueOf, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.id);
        parcel.writeValue(this.arguments);
    }
}
