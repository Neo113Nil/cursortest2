package com.google.maps.android.compose;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.maps.zzah;
import com.google.android.gms.internal.maps.zzc;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes4.dex */
public final /* synthetic */ class MarkerKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MarkerKt$$ExternalSyntheticLambda5(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                MarkerNode markerNode = (MarkerNode) obj;
                markerNode.getClass();
                markerNode.infoWindow = (Function3) obj2;
                return Unit.INSTANCE;
            case 1:
                MarkerNode markerNode2 = (MarkerNode) obj;
                Offset offset = (Offset) obj2;
                markerNode2.getClass();
                Marker marker = markerNode2.marker;
                float intBitsToFloat = Float.intBitsToFloat((int) (offset.packedValue >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (offset.packedValue & BodyPartID.bodyIdMax));
                try {
                    zzah zzahVar = (zzah) marker.zza;
                    Parcel zza = zzahVar.zza();
                    zza.writeFloat(intBitsToFloat);
                    zza.writeFloat(intBitsToFloat2);
                    zzahVar.zzc(zza, 24);
                    return Unit.INSTANCE;
                } catch (RemoteException e) {
                    TransportImpl$$ExternalSyntheticLambda0.m(e);
                    return null;
                }
            case 2:
                MarkerNode markerNode3 = (MarkerNode) obj;
                LatLng latLng = (LatLng) obj2;
                markerNode3.getClass();
                latLng.getClass();
                markerNode3.marker.setPosition(latLng);
                return Unit.INSTANCE;
            case 3:
                MarkerNode markerNode4 = (MarkerNode) obj;
                float floatValue = ((Float) obj2).floatValue();
                markerNode4.getClass();
                try {
                    zzah zzahVar2 = (zzah) markerNode4.marker.zza;
                    Parcel zza2 = zzahVar2.zza();
                    zza2.writeFloat(floatValue);
                    zzahVar2.zzc(zza2, 22);
                    return Unit.INSTANCE;
                } catch (RemoteException e2) {
                    TransportImpl$$ExternalSyntheticLambda0.m(e2);
                    return null;
                }
            case 4:
                MarkerNode markerNode5 = (MarkerNode) obj;
                String str = (String) obj2;
                markerNode5.getClass();
                Marker marker2 = markerNode5.marker;
                try {
                    zzah zzahVar3 = (zzah) marker2.zza;
                    Parcel zza3 = zzahVar3.zza();
                    zza3.writeString(str);
                    zzahVar3.zzc(zza3, 7);
                    if (marker2.isInfoWindowShown()) {
                        marker2.showInfoWindow();
                    }
                    return Unit.INSTANCE;
                } catch (RemoteException e3) {
                    TransportImpl$$ExternalSyntheticLambda0.m(e3);
                    return null;
                }
            case 5:
                MarkerNode markerNode6 = (MarkerNode) obj;
                markerNode6.getClass();
                markerNode6.marker.setTag(obj2);
                return Unit.INSTANCE;
            case 6:
                MarkerNode markerNode7 = (MarkerNode) obj;
                String str2 = (String) obj2;
                markerNode7.getClass();
                Marker marker3 = markerNode7.marker;
                try {
                    zzah zzahVar4 = (zzah) marker3.zza;
                    Parcel zza4 = zzahVar4.zza();
                    zza4.writeString(str2);
                    zzahVar4.zzc(zza4, 5);
                    if (marker3.isInfoWindowShown()) {
                        marker3.showInfoWindow();
                    }
                    return Unit.INSTANCE;
                } catch (RemoteException e4) {
                    TransportImpl$$ExternalSyntheticLambda0.m(e4);
                    return null;
                }
            case 7:
                MarkerNode markerNode8 = (MarkerNode) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                markerNode8.getClass();
                try {
                    zzah zzahVar5 = (zzah) markerNode8.marker.zza;
                    Parcel zza5 = zzahVar5.zza();
                    int i2 = zzc.$r8$clinit;
                    zza5.writeInt(booleanValue ? 1 : 0);
                    zzahVar5.zzc(zza5, 14);
                    return Unit.INSTANCE;
                } catch (RemoteException e5) {
                    TransportImpl$$ExternalSyntheticLambda0.m(e5);
                    return null;
                }
            case 8:
                MarkerNode markerNode9 = (MarkerNode) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                markerNode9.getClass();
                markerNode9.marker.setZIndex(floatValue2);
                return Unit.INSTANCE;
            case 9:
                MarkerNode markerNode10 = (MarkerNode) obj;
                Function1 function1 = (Function1) obj2;
                markerNode10.getClass();
                function1.getClass();
                markerNode10.onMarkerClick = function1;
                return Unit.INSTANCE;
            case 10:
                MarkerNode markerNode11 = (MarkerNode) obj;
                Function1 function12 = (Function1) obj2;
                markerNode11.getClass();
                function12.getClass();
                markerNode11.onInfoWindowClick = function12;
                return Unit.INSTANCE;
            case 11:
                MarkerNode markerNode12 = (MarkerNode) obj;
                Function1 function13 = (Function1) obj2;
                markerNode12.getClass();
                function13.getClass();
                markerNode12.onInfoWindowClose = function13;
                return Unit.INSTANCE;
            case 12:
                MarkerNode markerNode13 = (MarkerNode) obj;
                Function1 function14 = (Function1) obj2;
                markerNode13.getClass();
                function14.getClass();
                markerNode13.onInfoWindowLongClick = function14;
                return Unit.INSTANCE;
            case 13:
                MarkerNode markerNode14 = (MarkerNode) obj;
                markerNode14.getClass();
                markerNode14.infoContent = (Function3) obj2;
                return Unit.INSTANCE;
            case 14:
                MarkerNode markerNode15 = (MarkerNode) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                markerNode15.getClass();
                try {
                    zzah zzahVar6 = (zzah) markerNode15.marker.zza;
                    Parcel zza6 = zzahVar6.zza();
                    zza6.writeFloat(floatValue3);
                    zzahVar6.zzc(zza6, 25);
                    return Unit.INSTANCE;
                } catch (RemoteException e6) {
                    TransportImpl$$ExternalSyntheticLambda0.m(e6);
                    return null;
                }
            case 15:
                MarkerNode markerNode16 = (MarkerNode) obj;
                Offset offset2 = (Offset) obj2;
                markerNode16.getClass();
                markerNode16.marker.setAnchor(Float.intBitsToFloat((int) (offset2.packedValue >> 32)), Float.intBitsToFloat((int) (offset2.packedValue & BodyPartID.bodyIdMax)));
                return Unit.INSTANCE;
            case 16:
                MarkerNode markerNode17 = (MarkerNode) obj;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                markerNode17.getClass();
                try {
                    zzah zzahVar7 = (zzah) markerNode17.marker.zza;
                    Parcel zza7 = zzahVar7.zza();
                    int i3 = zzc.$r8$clinit;
                    zza7.writeInt(booleanValue2 ? 1 : 0);
                    zzahVar7.zzc(zza7, 9);
                    return Unit.INSTANCE;
                } catch (RemoteException e7) {
                    TransportImpl$$ExternalSyntheticLambda0.m(e7);
                    return null;
                }
            case 17:
                MarkerNode markerNode18 = (MarkerNode) obj;
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                markerNode18.getClass();
                try {
                    zzah zzahVar8 = (zzah) markerNode18.marker.zza;
                    Parcel zza8 = zzahVar8.zza();
                    int i4 = zzc.$r8$clinit;
                    zza8.writeInt(booleanValue3 ? 1 : 0);
                    zzahVar8.zzc(zza8, 20);
                    return Unit.INSTANCE;
                } catch (RemoteException e8) {
                    TransportImpl$$ExternalSyntheticLambda0.m(e8);
                    return null;
                }
            case 18:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.at_street_address_hint_line_1), (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer2, R.string.at_street_address_hint_line_2), (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer3, R.string.at_city_hint), (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer4, R.string.at_country_label), (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    ProgressCircularKt.ProgressCircular(6, 0, gapComposer5, SizeKt.m285size3ABfNKs(companion, 24.0f));
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    gapComposer6.startReplaceGroup(-1329707039);
                    gapComposer6.end(false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    gapComposer7.startReplaceGroup(577867906);
                    gapComposer7.end(false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 25:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 44.0f, 1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode = Long.hashCode(gapComposer8.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer8.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer8, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer8.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer8.startReusableNode();
                    if (gapComposer8.inserting) {
                        gapComposer8.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer8.useNode();
                    }
                    Updater.m576setimpl(gapComposer8, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer8, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer8, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer8, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer8, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    ProgressCircularKt.ProgressCircular(0, 1, gapComposer8, null);
                    gapComposer8.end(true);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 26:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer9, R.string.account_header_qr_mode_share), (Map) null, (Function1) null, false);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer10, R.string.account_header_qr_mode_scan), (Map) null, (Function1) null, false);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 28:
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer11, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer11, R.string.edit_profile_edit_toggle), (Map) null, (Function1) null, false);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer12, R.string.edit_profile_preview_toggle), (Map) null, (Function1) null, false);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
