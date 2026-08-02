package com.google.maps.android.compose;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzg;

/* loaded from: classes4.dex */
public abstract class MapUpdaterKt {
    public static final PaddingValuesImpl DefaultMapContentPadding = SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 3);

    public static final void access$applyContentPadding(MapPropertiesNode mapPropertiesNode, GoogleMap googleMap, PaddingValues paddingValues) {
        Density density = mapPropertiesNode.density;
        int mo230roundToPx0680j_4 = density.mo230roundToPx0680j_4(paddingValues.mo265calculateLeftPaddingu2uoSUM(mapPropertiesNode.layoutDirection));
        int mo230roundToPx0680j_42 = density.mo230roundToPx0680j_4(paddingValues.mo267calculateTopPaddingD9Ej5fM());
        int mo230roundToPx0680j_43 = density.mo230roundToPx0680j_4(paddingValues.mo266calculateRightPaddingu2uoSUM(mapPropertiesNode.layoutDirection));
        int mo230roundToPx0680j_44 = density.mo230roundToPx0680j_4(paddingValues.mo264calculateBottomPaddingD9Ej5fM());
        googleMap.getClass();
        try {
            zzg zzgVar = googleMap.zza;
            Parcel zza = zzgVar.zza();
            zza.writeInt(mo230roundToPx0680j_4);
            zza.writeInt(mo230roundToPx0680j_42);
            zza.writeInt(mo230roundToPx0680j_43);
            zza.writeInt(mo230roundToPx0680j_44);
            zzgVar.zzc(zza, 39);
        } catch (RemoteException e) {
            TransportImpl$$ExternalSyntheticLambda0.m(e);
        }
    }
}
