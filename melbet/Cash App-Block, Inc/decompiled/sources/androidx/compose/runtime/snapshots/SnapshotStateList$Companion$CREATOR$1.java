package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import androidx.navigation.Navigator$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public final class SnapshotStateList$Companion$CREATOR$1 implements Parcelable.ClassLoaderCreator {
    public static SnapshotStateList createFromParcel(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = SnapshotStateList$Companion$CREATOR$1.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        Navigator$$ExternalSyntheticLambda0 navigator$$ExternalSyntheticLambda0 = new Navigator$$ExternalSyntheticLambda0(20, parcel, classLoader);
        if (readInt == 0) {
            return new SnapshotStateList();
        }
        PersistentVectorBuilder builder = SmallPersistentVector.EMPTY.builder();
        for (int i = 0; i < readInt; i++) {
            builder.add(navigator$$ExternalSyntheticLambda0.invoke(Integer.valueOf(i)));
        }
        return new SnapshotStateList(builder.build());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SnapshotStateList[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return createFromParcel(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return createFromParcel(parcel, (ClassLoader) null);
    }
}
