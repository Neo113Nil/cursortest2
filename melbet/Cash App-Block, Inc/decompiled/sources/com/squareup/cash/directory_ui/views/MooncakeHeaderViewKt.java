package com.squareup.cash.directory_ui.views;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import app.cash.broadway.ui.Ui;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import coil3.RealImageLoader;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import com.squareup.cash.stablecoin.views.StablecoinHomeViewKt$$ExternalSyntheticLambda10;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public abstract class MooncakeHeaderViewKt {
    public static final void MooncakeHeaderView(DirectoryListItem.Header header, Modifier modifier, RealImageLoader realImageLoader, PaddingValuesImpl paddingValuesImpl, Ui.EventReceiver eventReceiver, Composer composer, int i) {
        GapComposer gapComposer;
        realImageLoader.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(632627426);
        int i2 = i | (gapComposer2.changedInstance(header) ? 4 : 2) | (gapComposer2.changedInstance(realImageLoader) ? 256 : 128) | (gapComposer2.changedInstance(eventReceiver) ? 16384 : PKIFailureInfo.certRevoked);
        int i3 = 1;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            gapComposer2.startDefaults();
            if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            LayoutDirection layoutDirection = (LayoutDirection) gapComposer2.consume(CompositionLocalsKt.LocalLayoutDirection);
            Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
            boolean changedInstance = gapComposer2.changedInstance(realImageLoader);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new StablecoinHomeViewKt$$ExternalSyntheticLambda10(realImageLoader, i3);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            boolean changedInstance2 = gapComposer2.changedInstance(header) | gapComposer2.changedInstance(eventReceiver) | gapComposer2.changed(density) | gapComposer2.changed(layoutDirection.ordinal());
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                OverlayKt$$ExternalSyntheticLambda3 overlayKt$$ExternalSyntheticLambda3 = new OverlayKt$$ExternalSyntheticLambda3(header, eventReceiver, density, paddingValuesImpl, layoutDirection, 17);
                gapComposer2.updateRememberedValue(overlayKt$$ExternalSyntheticLambda3);
                rememberedValue2 = overlayKt$$ExternalSyntheticLambda3;
            }
            gapComposer = gapComposer2;
            AndroidView_androidKt.AndroidView(function1, modifier, (Function1) rememberedValue2, gapComposer, 48, 0);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda4(header, modifier, realImageLoader, paddingValuesImpl, eventReceiver, i);
        }
    }

    public static int beginObjectHeader(Parcel parcel) {
        return zzb(parcel, 20293);
    }

    public static final MapBuilder filterNotNullValues(Map map) {
        map.getClass();
        MapBuilder mapBuilder = new MapBuilder();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                mapBuilder.put(key, value);
            }
        }
        return mapBuilder.build();
    }

    public static void finishObjectHeader(Parcel parcel, int i) {
        zzc(parcel, i);
    }

    public static void writeBoolean(Parcel parcel, int i, boolean z) {
        zza(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void writeBundle(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int zzb = zzb(parcel, i);
        parcel.writeBundle(bundle);
        zzc(parcel, zzb);
    }

    public static void writeByteArray(Parcel parcel, int i, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int zzb = zzb(parcel, i);
        parcel.writeByteArray(bArr);
        zzc(parcel, zzb);
    }

    public static void writeByteArrayArray(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int zzb = zzb(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        zzc(parcel, zzb);
    }

    public static void writeIBinder(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int zzb = zzb(parcel, i);
        parcel.writeStrongBinder(iBinder);
        zzc(parcel, zzb);
    }

    public static void writeInt(Parcel parcel, int i, int i2) {
        zza(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void writeIntArray(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int zzb = zzb(parcel, i);
        parcel.writeIntArray(iArr);
        zzc(parcel, zzb);
    }

    public static void writeIntegerList(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int zzb = zzb(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) list.get(i2)).intValue());
        }
        zzc(parcel, zzb);
    }

    public static void writeIntegerObject(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        zza(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void writeLong(Parcel parcel, int i, long j) {
        zza(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void writeLongObject(Parcel parcel, int i, Long l) {
        if (l == null) {
            return;
        }
        zza(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    public static void writeParcelable(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable == null) {
            return;
        }
        int zzb = zzb(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        zzc(parcel, zzb);
    }

    public static void writeString(Parcel parcel, int i, String str) {
        if (str == null) {
            return;
        }
        int zzb = zzb(parcel, i);
        parcel.writeString(str);
        zzc(parcel, zzb);
    }

    public static void writeStringArray(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int zzb = zzb(parcel, i);
        parcel.writeStringArray(strArr);
        zzc(parcel, zzb);
    }

    public static void writeStringList(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int zzb = zzb(parcel, i);
        parcel.writeStringList(list);
        zzc(parcel, zzb);
    }

    public static void writeTypedArray(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int zzb = zzb(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i2);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        zzc(parcel, zzb);
    }

    public static void writeTypedList(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int zzb = zzb(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        zzc(parcel, zzb);
    }

    public static void zza(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    public static int zzb(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void zzc(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }
}
