package androidx.appcompat.widget;

import android.os.Parcelable;
import android.system.ErrnoException;
import android.system.Os;
import androidx.media3.muxer.Mp4Muxer;
import androidx.media3.muxer.MuxerException;
import androidx.navigation.NavArgument;
import androidx.navigation.NavType;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.error_reporting.ExceptionLogger;
import java.io.File;
import java.io.FileDescriptor;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.io.FilesKt__UtilsKt;

/* loaded from: classes3.dex */
public final class TintInfo {
    public boolean mHasTintList;
    public boolean mHasTintMode;
    public Object mTintList;
    public Object mTintMode;

    public NavArgument build() {
        NavType navType = (NavType) this.mTintList;
        if (navType == null) {
            Object obj = this.mTintMode;
            NavType navType2 = obj instanceof Integer ? NavType.IntType : obj instanceof int[] ? NavType.IntArrayType : obj instanceof Long ? NavType.LongType : obj instanceof long[] ? NavType.LongArrayType : obj instanceof Float ? NavType.FloatType : obj instanceof float[] ? NavType.FloatArrayType : obj instanceof Boolean ? NavType.BoolType : obj instanceof boolean[] ? NavType.BoolArrayType : ((obj instanceof String) || obj == null) ? NavType.StringType : null;
            if (navType2 == null) {
                if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                    navType = NavType.StringArrayType;
                } else {
                    obj.getClass();
                    if (obj.getClass().isArray()) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        componentType.getClass();
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            Class<?> componentType2 = obj.getClass().getComponentType();
                            componentType2.getClass();
                            navType2 = new NavType.ParcelableArrayType(componentType2);
                        }
                    }
                    if (obj.getClass().isArray()) {
                        Class<?> componentType3 = obj.getClass().getComponentType();
                        componentType3.getClass();
                        if (Serializable.class.isAssignableFrom(componentType3)) {
                            Class<?> componentType4 = obj.getClass().getComponentType();
                            componentType4.getClass();
                            navType2 = new NavType.SerializableArrayType(componentType4);
                        }
                    }
                    if (obj instanceof Parcelable) {
                        navType2 = new NavType.ParcelableType(obj.getClass());
                    } else if (obj instanceof Enum) {
                        navType2 = new NavType.EnumType(obj.getClass());
                    } else {
                        if (!(obj instanceof Serializable)) {
                            OptionalProvider$$ExternalSyntheticLambda0.m$1("Object of type ", obj.getClass().getName(), " is not supported for navigation arguments.");
                            return null;
                        }
                        navType2 = new NavType.SerializableType(obj.getClass());
                    }
                }
            }
            navType = navType2;
        }
        return new NavArgument(navType, this.mHasTintMode, this.mTintMode, this.mHasTintList);
    }

    public void clear() {
        this.mTintList = null;
        this.mHasTintList = false;
        this.mTintMode = null;
        this.mHasTintMode = false;
    }

    public void closeMuxer() {
        try {
            ((Mp4Muxer) this.mTintMode).close();
            FileDescriptor fileDescriptor = (FileDescriptor) this.mTintList;
            if (fileDescriptor != null) {
                Os.close(fileDescriptor);
            }
            this.mHasTintList = true;
            this.mHasTintMode = false;
        } catch (ErrnoException | MuxerException e) {
            a$$ExternalSyntheticBUOutline0.m(e);
        }
    }

    public void recordError(Throwable th) {
        if (this.mHasTintList) {
            try {
                ((ExceptionLogger) this.mTintList).logException(th);
            } catch (Exception unused) {
            }
            try {
                Iterator it = ((List) this.mTintMode).iterator();
                while (it.hasNext()) {
                    FilesKt__UtilsKt.deleteRecursively((File) it.next());
                }
            } catch (Exception unused2) {
            }
        }
    }
}
