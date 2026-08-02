package com.google.maps.android.compose;

import android.content.Intent;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Offset;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.yf$$ExternalSyntheticLambda10;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.squareup.cash.intent.InboundPushNotification$DoAppMessageAction;
import com.squareup.cash.intent.InboundPushNotification$Payment;
import com.squareup.cash.intent.InboundPushNotification$Profile;
import com.squareup.cash.intent.InboundPushNotification$Route;
import com.squareup.protos.franklin.common.appmessaging.AppMessageAction;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.ReflectKCallable;
import kotlin.reflect.jvm.internal.ReflectKParameter;
import kotlin.reflect.jvm.internal.ReflectKProperty;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller;
import kotlin.reflect.jvm.internal.impl.km.KmClass;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.PapaEvent;

/* loaded from: classes9.dex */
public abstract class MarkerKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x005f  */
    /* renamed from: Marker-qld6geY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2057Markerqld6geY(MarkerState markerState, String str, float f, long j, BitmapDescriptor bitmapDescriptor, long j2, boolean z, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Composer composer, int i, int i2, int i3) {
        Function1 function15;
        int i4;
        Function1 function16;
        int i5;
        Function1 function17;
        int i6;
        Function1 function18;
        GapComposer gapComposer;
        String str2;
        float f2;
        long j3;
        Function1 function19;
        Function1 function110;
        Function1 function111;
        Function1 function112;
        long j4;
        boolean z2;
        RecomposeScopeImpl endRestartGroup;
        int i7;
        Function1 function113;
        Function1 function114;
        Function1 function115;
        long j5;
        boolean z3;
        long j6;
        Function1 function116;
        Function1 function117;
        Function1 function118;
        Function1 function119;
        String str3;
        float f3;
        boolean z4;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(122922304);
        int i8 = i | (gapComposer2.changed(markerState) ? 4 : 2) | 224688;
        boolean changed = gapComposer2.changed(bitmapDescriptor);
        int i9 = PKIFailureInfo.signerNotTrusted;
        int i10 = i8 | (changed ? 1048576 : 524288) | 918552576;
        int i11 = i2 | 3510;
        int i12 = i3 & 16384;
        if (i12 != 0) {
            i11 = i2 | 28086;
        } else if ((i2 & 24576) == 0) {
            function15 = function1;
            i11 |= gapComposer2.changedInstance(function15) ? 16384 : PKIFailureInfo.certRevoked;
            i4 = 32768 & i3;
            if (i4 == 0) {
                i11 |= 196608;
            } else if ((196608 & i2) == 0) {
                function16 = function12;
                i11 |= gapComposer2.changedInstance(function16) ? 131072 : 65536;
                i5 = 65536 & i3;
                if (i5 != 0) {
                    i11 |= 1572864;
                } else if ((1572864 & i2) == 0) {
                    function17 = function13;
                    if (gapComposer2.changedInstance(function17)) {
                        i9 = 1048576;
                    }
                    i11 |= i9;
                    i6 = i3 & PKIFailureInfo.unsupportedVersion;
                    if (i6 == 0) {
                        i11 |= 12582912;
                    } else if ((12582912 & i2) == 0) {
                        function18 = function14;
                        i11 |= gapComposer2.changedInstance(function18) ? 8388608 : 4194304;
                        if (gapComposer2.shouldExecute(i10 & 1, (306783379 & i10) == 306783378 || (4793491 & i11) != 4793490)) {
                            gapComposer2.startDefaults();
                            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                                i7 = i10;
                                long floatToRawIntBits = (Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(1.0f) & BodyPartID.bodyIdMax);
                                long floatToRawIntBits2 = (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(0.5f) << 32);
                                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                if (i12 != 0) {
                                    Object rememberedValue = gapComposer2.rememberedValue();
                                    if (rememberedValue == neverEqualPolicy) {
                                        rememberedValue = new yf$$ExternalSyntheticLambda10(28);
                                        gapComposer2.updateRememberedValue(rememberedValue);
                                    }
                                    function113 = (Function1) rememberedValue;
                                } else {
                                    function113 = function15;
                                }
                                if (i4 != 0) {
                                    Object rememberedValue2 = gapComposer2.rememberedValue();
                                    if (rememberedValue2 == neverEqualPolicy) {
                                        rememberedValue2 = new yf$$ExternalSyntheticLambda10(29);
                                        gapComposer2.updateRememberedValue(rememberedValue2);
                                    }
                                    function114 = (Function1) rememberedValue2;
                                } else {
                                    function114 = function12;
                                }
                                if (i5 != 0) {
                                    Object rememberedValue3 = gapComposer2.rememberedValue();
                                    if (rememberedValue3 == neverEqualPolicy) {
                                        rememberedValue3 = new MarkerKt$$ExternalSyntheticLambda2(0);
                                        gapComposer2.updateRememberedValue(rememberedValue3);
                                    }
                                    function115 = (Function1) rememberedValue3;
                                } else {
                                    function115 = function17;
                                }
                                if (i6 != 0) {
                                    Object rememberedValue4 = gapComposer2.rememberedValue();
                                    if (rememberedValue4 == neverEqualPolicy) {
                                        z4 = true;
                                        rememberedValue4 = new MarkerKt$$ExternalSyntheticLambda2(1 == true ? 1 : 0);
                                        gapComposer2.updateRememberedValue(rememberedValue4);
                                    } else {
                                        z4 = true;
                                    }
                                    j5 = floatToRawIntBits;
                                    z3 = z4;
                                    j6 = floatToRawIntBits2;
                                    function116 = (Function1) rememberedValue4;
                                } else {
                                    j5 = floatToRawIntBits;
                                    z3 = true;
                                    j6 = floatToRawIntBits2;
                                    function116 = function18;
                                }
                                function117 = function113;
                                function118 = function114;
                                function119 = function115;
                                str3 = "";
                                f3 = 1.0f;
                            } else {
                                gapComposer2.skipToGroupEnd();
                                str3 = str;
                                f3 = f;
                                j5 = j;
                                j6 = j2;
                                z3 = z;
                                i7 = i10;
                                function116 = function18;
                                function117 = function15;
                                function118 = function16;
                                function119 = function17;
                            }
                            gapComposer2.endDefaults();
                            gapComposer = gapComposer2;
                            m2058MarkerImplkhPtz74(markerState, str3, f3, j5, bitmapDescriptor, j6, z3, function117, function118, function119, function116, gapComposer, i7 & 2147483646, i11 & 33554430);
                            str2 = str3;
                            f2 = f3;
                            j3 = j5;
                            j4 = j6;
                            z2 = z3;
                            function111 = function117;
                            function19 = function118;
                            function112 = function119;
                            function110 = function116;
                        } else {
                            gapComposer = gapComposer2;
                            gapComposer.skipToGroupEnd();
                            str2 = str;
                            f2 = f;
                            j3 = j;
                            function19 = function12;
                            function110 = function18;
                            function111 = function15;
                            function112 = function17;
                            j4 = j2;
                            z2 = z;
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new MarkerKt$$ExternalSyntheticLambda4(markerState, str2, f2, j3, bitmapDescriptor, j4, z2, function111, function19, function112, function110, i, i2, i3);
                            return;
                        }
                        return;
                    }
                    function18 = function14;
                    if (gapComposer2.shouldExecute(i10 & 1, (306783379 & i10) == 306783378 || (4793491 & i11) != 4793490)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function17 = function13;
                i6 = i3 & PKIFailureInfo.unsupportedVersion;
                if (i6 == 0) {
                }
                function18 = function14;
                if (gapComposer2.shouldExecute(i10 & 1, (306783379 & i10) == 306783378 || (4793491 & i11) != 4793490)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function16 = function12;
            i5 = 65536 & i3;
            if (i5 != 0) {
            }
            function17 = function13;
            i6 = i3 & PKIFailureInfo.unsupportedVersion;
            if (i6 == 0) {
            }
            function18 = function14;
            if (gapComposer2.shouldExecute(i10 & 1, (306783379 & i10) == 306783378 || (4793491 & i11) != 4793490)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function15 = function1;
        i4 = 32768 & i3;
        if (i4 == 0) {
        }
        function16 = function12;
        i5 = 65536 & i3;
        if (i5 != 0) {
        }
        function17 = function13;
        i6 = i3 & PKIFailureInfo.unsupportedVersion;
        if (i6 == 0) {
        }
        function18 = function14;
        if (gapComposer2.shouldExecute(i10 & 1, (306783379 & i10) == 306783378 || (4793491 & i11) != 4793490)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: MarkerImpl-khPtz74, reason: not valid java name */
    public static final void m2058MarkerImplkhPtz74(final MarkerState markerState, final String str, final float f, final long j, BitmapDescriptor bitmapDescriptor, long j2, final boolean z, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Composer composer, int i, int i2) {
        int i3;
        int i4;
        long j3;
        GapComposer gapComposer;
        Object obj;
        Applier applier;
        Float f2;
        Boolean bool;
        MarkerState markerState2 = markerState;
        final BitmapDescriptor bitmapDescriptor2 = bitmapDescriptor;
        final long j4 = j2;
        final Function1 function15 = function1;
        final Function1 function16 = function12;
        final Function1 function17 = function13;
        final Function1 function18 = function14;
        Float valueOf = Float.valueOf(RecyclerView.DECELERATION_RATE);
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1052021632);
        Applier applier2 = gapComposer2.applier;
        if ((i & 6) == 0) {
            i3 = i | (gapComposer2.changed(markerState2) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changed(j) ? 2048 : 1024;
        }
        int i5 = i & 24576;
        int i6 = PKIFailureInfo.certRevoked;
        if (i5 == 0) {
            i3 |= gapComposer2.changed(false) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= gapComposer2.changed(false) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i7 = i & 1572864;
        int i8 = PKIFailureInfo.signerNotTrusted;
        if (i7 == 0) {
            i3 |= gapComposer2.changed(bitmapDescriptor2) ? PKIFailureInfo.badCertTemplate : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= gapComposer2.changed(j4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= gapComposer2.changed(RecyclerView.DECELERATION_RATE) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= gapComposer2.changed((Object) null) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i9 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (gapComposer2.changedInstance(null) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer2.changed((Object) null) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changed(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= gapComposer2.changed(RecyclerView.DECELERATION_RATE) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            if (gapComposer2.changedInstance(function15)) {
                i6 = 16384;
            }
            i4 |= i6;
        }
        if ((i2 & 196608) == 0) {
            i4 |= gapComposer2.changedInstance(function16) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((i2 & 1572864) == 0) {
            if (gapComposer2.changedInstance(function17)) {
                i8 = PKIFailureInfo.badCertTemplate;
            }
            i4 |= i8;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= gapComposer2.changedInstance(function18) ? 8388608 : 4194304;
        }
        int i10 = i4 | 905969664;
        if (gapComposer2.shouldExecute(i9 & 1, ((i9 & 306783379) == 306783378 && (i10 & 306783379) == 306783378) ? false : true)) {
            gapComposer2.startDefaults();
            if ((i & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                gapComposer2.skipToGroupEnd();
            }
            gapComposer2.endDefaults();
            MapApplier mapApplier = applier2 instanceof MapApplier ? (MapApplier) applier2 : null;
            final GapComposer.CompositionContextImpl buildContext = gapComposer2.buildContext();
            final MapApplier mapApplier2 = mapApplier;
            boolean changedInstance = ((i9 & 234881024) == 67108864) | gapComposer2.changedInstance(mapApplier) | ((i9 & 112) == 32) | ((i9 & 896) == 256) | ((i9 & 7168) == 2048) | ((i9 & 57344) == 16384) | ((i9 & 458752) == 131072) | ((i9 & 3670016) == 1048576) | ((i9 & 29360128) == 8388608) | ((((i9 & 14) ^ 6) > 4 && gapComposer2.changed(markerState2)) || (i9 & 6) == 4) | ((i9 & 1879048192) == 536870912) | ((i10 & 112) == 32) | ((i10 & 896) == 256) | ((i10 & 7168) == 2048) | gapComposer2.changedInstance(null) | gapComposer2.changedInstance(buildContext) | ((i10 & 57344) == 16384) | ((i10 & 458752) == 131072) | ((i10 & 3670016) == 1048576) | ((i10 & 29360128) == 8388608) | ((i10 & 234881024) == 67108864) | ((i10 & 1879048192) == 536870912);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                applier = applier2;
                f2 = valueOf;
                bool = false;
                obj = new Function0() { // from class: com.google.maps.android.compose.MarkerKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        GoogleMap googleMap;
                        MapApplier mapApplier3 = MapApplier.this;
                        if (mapApplier3 != null && (googleMap = mapApplier3.map) != null) {
                            MarkerOptions markerOptions = new MarkerOptions();
                            markerOptions.zzr = str;
                            markerOptions.zzm = f;
                            long j5 = j;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & BodyPartID.bodyIdMax));
                            markerOptions.zze = intBitsToFloat;
                            markerOptions.zzf = intBitsToFloat2;
                            markerOptions.zzg = false;
                            markerOptions.zzi = false;
                            markerOptions.zzd = bitmapDescriptor2;
                            long j6 = j4;
                            float intBitsToFloat3 = Float.intBitsToFloat((int) (j6 >> 32));
                            float intBitsToFloat4 = Float.intBitsToFloat((int) (j6 & BodyPartID.bodyIdMax));
                            markerOptions.zzk = intBitsToFloat3;
                            markerOptions.zzl = intBitsToFloat4;
                            MarkerState markerState3 = markerState;
                            LatLng latLng = (LatLng) markerState3.position$delegate.getValue();
                            if (latLng == null) {
                                a$$ExternalSyntheticBUOutline0.m$3("latlng cannot be null - a position is required.");
                                return null;
                            }
                            markerOptions.zza = latLng;
                            markerOptions.zzj = RecyclerView.DECELERATION_RATE;
                            markerOptions.zzc = null;
                            markerOptions.zzb = null;
                            markerOptions.zzh = z;
                            markerOptions.zzn = RecyclerView.DECELERATION_RATE;
                            Marker addMarker = googleMap.addMarker(markerOptions);
                            if (addMarker != null) {
                                addMarker.setTag(null);
                                return new MarkerNode(buildContext, addMarker, markerState3, function15, function16, function17, function18);
                            }
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("Error adding marker");
                        return null;
                    }
                };
                function17 = function17;
                bitmapDescriptor2 = bitmapDescriptor2;
                function18 = function18;
                j4 = j4;
                markerState2 = markerState;
                gapComposer = gapComposer2;
                function15 = function15;
                function16 = function16;
                j3 = j;
                gapComposer.updateRememberedValue(obj);
            } else {
                j3 = j;
                obj = rememberedValue;
                applier = applier2;
                gapComposer = gapComposer2;
                f2 = valueOf;
                bool = false;
                markerState2 = markerState;
            }
            Function0 function0 = (Function0) obj;
            if (!(applier instanceof MapApplier)) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m577updateimpl(gapComposer, function15, new MarkerKt$$ExternalSyntheticLambda5(9));
            Updater.m577updateimpl(gapComposer, function16, new MarkerKt$$ExternalSyntheticLambda5(10));
            Updater.m577updateimpl(gapComposer, function17, new MarkerKt$$ExternalSyntheticLambda5(11));
            Updater.m577updateimpl(gapComposer, function18, new MarkerKt$$ExternalSyntheticLambda5(12));
            Updater.m577updateimpl(gapComposer, null, new MarkerKt$$ExternalSyntheticLambda5(13));
            int i11 = 0;
            Updater.m577updateimpl(gapComposer, null, new MarkerKt$$ExternalSyntheticLambda5(i11));
            Updater.m577updateimpl(gapComposer, Float.valueOf(f), new MarkerKt$$ExternalSyntheticLambda5(14));
            Updater.m577updateimpl(gapComposer, new Offset(j3), new MarkerKt$$ExternalSyntheticLambda5(15));
            Boolean bool2 = bool;
            Updater.m577updateimpl(gapComposer, bool2, new MarkerKt$$ExternalSyntheticLambda5(16));
            Updater.m577updateimpl(gapComposer, bool2, new MarkerKt$$ExternalSyntheticLambda5(17));
            Updater.m577updateimpl(gapComposer, bitmapDescriptor2, new MarkerKt$$ExternalSyntheticLambda10(i11));
            Updater.m577updateimpl(gapComposer, new Offset(j4), new MarkerKt$$ExternalSyntheticLambda5(1));
            Updater.m577updateimpl(gapComposer, (LatLng) markerState2.position$delegate.getValue(), new MarkerKt$$ExternalSyntheticLambda5(2));
            Float f3 = f2;
            Updater.m577updateimpl(gapComposer, f3, new MarkerKt$$ExternalSyntheticLambda5(3));
            Updater.m577updateimpl(gapComposer, null, new MarkerKt$$ExternalSyntheticLambda5(4));
            Updater.m577updateimpl(gapComposer, null, new MarkerKt$$ExternalSyntheticLambda5(5));
            Updater.m577updateimpl(gapComposer, null, new MarkerKt$$ExternalSyntheticLambda5(6));
            Updater.m577updateimpl(gapComposer, Boolean.valueOf(z), new MarkerKt$$ExternalSyntheticLambda5(7));
            Updater.m577updateimpl(gapComposer, f3, new MarkerKt$$ExternalSyntheticLambda5(8));
            gapComposer.end(true);
        } else {
            j3 = j;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkerKt$$ExternalSyntheticLambda4(markerState2, str, f, j3, bitmapDescriptor2, j4, z, function15, function16, function17, function18, i, i2);
        }
    }

    public static final MapEffectKt access$asPushNotification(Intent intent) {
        final String stringExtra = intent.getStringExtra("analytics-key");
        AppMessageAction appMessageAction = (AppMessageAction) intent.getParcelableExtra("do-app-message-action");
        if (appMessageAction != null) {
            return new InboundPushNotification$DoAppMessageAction(appMessageAction, stringExtra);
        }
        if (intent.getBooleanExtra("go-home", false)) {
            return new MapEffectKt(stringExtra) { // from class: com.squareup.cash.intent.InboundPushNotification$GoHome
                public final String analyticsKey;

                {
                    MapsKt__MapsKt.mapOf(new Pair("go_home", Boolean.TRUE), new Pair("analytics_key", stringExtra));
                    this.analyticsKey = stringExtra;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof InboundPushNotification$GoHome) && Intrinsics.areEqual(this.analyticsKey, ((InboundPushNotification$GoHome) obj).analyticsKey);
                }

                public final int hashCode() {
                    String str = this.analyticsKey;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("GoHome(analyticsKey=", this.analyticsKey, ")");
                }
            };
        }
        String stringExtra2 = intent.getStringExtra("payment-token");
        if (stringExtra2 != null && stringExtra2.length() != 0) {
            return new InboundPushNotification$Payment(stringExtra2, stringExtra);
        }
        String stringExtra3 = intent.getStringExtra("customer-token");
        if (stringExtra3 != null && stringExtra3.length() != 0) {
            return new InboundPushNotification$Profile(stringExtra3, stringExtra);
        }
        String stringExtra4 = intent.getStringExtra("client-route-url");
        if (stringExtra4 != null) {
            return new InboundPushNotification$Route(stringExtra4, stringExtra);
        }
        String stringExtra5 = intent.getStringExtra("uri");
        if (stringExtra5 != null && stringExtra5.length() != 0) {
            return new InboundPushNotification$Route(stringExtra5, stringExtra);
        }
        final String stringExtra6 = intent.getStringExtra("url-notification");
        if (stringExtra6 != null && stringExtra6.length() != 0) {
            return new MapEffectKt(stringExtra6, stringExtra) { // from class: com.squareup.cash.intent.InboundPushNotification$Url
                public final String analyticsKey;
                public final String url;

                {
                    stringExtra6.getClass();
                    MapsKt__MapsKt.mapOf(new Pair("url", stringExtra6), new Pair("analytics_key", stringExtra));
                    this.url = stringExtra6;
                    this.analyticsKey = stringExtra;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof InboundPushNotification$Url)) {
                        return false;
                    }
                    InboundPushNotification$Url inboundPushNotification$Url = (InboundPushNotification$Url) obj;
                    return Intrinsics.areEqual(this.url, inboundPushNotification$Url.url) && Intrinsics.areEqual(this.analyticsKey, inboundPushNotification$Url.analyticsKey);
                }

                public final int hashCode() {
                    int hashCode = this.url.hashCode() * 31;
                    String str = this.analyticsKey;
                    return hashCode + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
                    return Boxes$$ExternalSyntheticOutline1.m("Url(url=", this.url, ", analyticsKey=", this.analyticsKey, ")");
                }
            };
        }
        if (intent.getBooleanExtra("is-push-notification", false)) {
            return new MapEffectKt(stringExtra) { // from class: com.squareup.cash.intent.InboundPushNotification$Other
                public final String analyticsKey;

                {
                    MapsKt__MapsJVMKt.mapOf(new Pair("analytics_key", stringExtra));
                    this.analyticsKey = stringExtra;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof InboundPushNotification$Other) && Intrinsics.areEqual(this.analyticsKey, ((InboundPushNotification$Other) obj).analyticsKey);
                }

                public final int hashCode() {
                    String str = this.analyticsKey;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Other(analyticsKey=", this.analyticsKey, ")");
                }
            };
        }
        return null;
    }

    public static final Caller createValueClassAwareCallerIfNeeded(List list, ReflectKCallable reflectKCallable, Caller caller, boolean z) {
        reflectKCallable.getClass();
        list.getClass();
        List parameters = reflectKCallable.getParameters();
        if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                if (UtilKt.isInlineClassType(((ReflectKParameter) it.next()).getType())) {
                    break;
                }
            }
        }
        if (!UtilKt.isInlineClassType(reflectKCallable.getReturnType())) {
            return caller;
        }
        return new ValueClassAwareCaller(list, reflectKCallable, caller, z);
    }

    public static final Method getInlineClassUnboxMethod(Class cls, ReflectKCallable reflectKCallable) {
        reflectKCallable.getClass();
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", null);
            declaredMethod.getClass();
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            f$$ExternalSyntheticLambda0.m("No unbox method found in inline class: ", cls, " (calling ", reflectKCallable);
            return null;
        }
    }

    public static final boolean isPrimitiveType(KType kType) {
        if (kType.isMarkedNullable()) {
            return false;
        }
        KClassifier classifier = kType.getClassifier();
        KClass kClass = classifier instanceof KClass ? (KClass) classifier : null;
        Class javaPrimitiveType = kClass != null ? PapaEvent.getJavaPrimitiveType(kClass) : null;
        return (javaPrimitiveType == null || javaPrimitiveType.equals(Void.TYPE)) ? false : true;
    }

    public static final boolean isUnderlyingPropertyOfValueClass(ReflectKProperty reflectKProperty) {
        KmClass kmClass;
        reflectKProperty.getClass();
        List allParameters = reflectKProperty.getAllParameters();
        if (!(allParameters instanceof Collection) || !allParameters.isEmpty()) {
            Iterator it = allParameters.iterator();
            while (it.hasNext()) {
                if (((ReflectKParameter) it.next()).getKind() != KParameter$Kind.INSTANCE) {
                    return false;
                }
            }
        }
        String name = reflectKProperty.getName();
        KDeclarationContainerImpl container = reflectKProperty.getContainer();
        String str = null;
        KClassImpl kClassImpl = container instanceof KClassImpl ? (KClassImpl) container : null;
        if (kClassImpl != null && (kmClass = kClassImpl.getKmClass()) != null) {
            str = kmClass.getInlineClassUnderlyingPropertyName();
        }
        return Intrinsics.areEqual(name, str);
    }

    public static final MarkerState rememberUpdatedMarkerState(LatLng latLng, Composer composer, int i) {
        if ((i & 1) != 0) {
            latLng = new LatLng(0.0d, 0.0d);
        }
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new MarkerState(latLng);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MarkerState markerState = (MarkerState) rememberedValue;
        markerState.getClass();
        markerState.position$delegate.setValue(latLng);
        return markerState;
    }

    public static final Class toInlineClass(KType kType) {
        KClassifier classifier = kType != null ? kType.getClassifier() : null;
        KClass kClass = classifier instanceof KClass ? (KClass) classifier : null;
        if (kClass != null && kClass.isValue()) {
            if (!UtilKt.isNullableType(kType)) {
                return PapaEvent.getJavaClass(kClass);
            }
            KType unsubstitutedUnderlyingType = UtilKt.unsubstitutedUnderlyingType(kType);
            if (unsubstitutedUnderlyingType != null && !UtilKt.isNullableType(unsubstitutedUnderlyingType) && !isPrimitiveType(unsubstitutedUnderlyingType)) {
                return PapaEvent.getJavaClass(kClass);
            }
        }
        return null;
    }
}
