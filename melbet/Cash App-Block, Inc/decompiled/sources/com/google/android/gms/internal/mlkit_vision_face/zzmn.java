package com.google.android.gms.internal.mlkit_vision_face;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.datadog.android.telemetry.model.TelemetryDebugEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.input.InputFieldKt$$ExternalSyntheticLambda4;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda5;
import com.squareup.cash.composeUi.foundation.image.ImageLoadingStatus;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda2;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda21;
import com.squareup.cash.work.views.pay.PayHistoryListViewKt$PayHistoryListContent$1$1;
import com.squareup.wire.GrpcMethod;
import com.squareup.wire.internal.RealGrpcStreamingCall;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import net.idrnd.face.iad.capture.internal.o0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class zzmn {
    /* JADX WARN: Removed duplicated region for block: B:125:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0154  */
    /* renamed from: FoundationRemoteImage-NXws8ko, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2026FoundationRemoteImageNXws8ko(Function3 function3, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, String str2, Function1 function1, ColorFilter colorFilter, Color color, PaddingValues paddingValues, Function3 function32, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2, int i3) {
        Alignment alignment2;
        int i4;
        int i5;
        String str3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        ContentScale contentScale2;
        Function1 function12;
        Color color2;
        PaddingValues paddingValues2;
        String str4;
        Alignment alignment3;
        ColorFilter colorFilter2;
        Function3 function33;
        RecomposeScopeImpl endRestartGroup;
        Color color3;
        Modifier modifier2;
        Modifier modifier3;
        Function3 function34;
        boolean z;
        Unit unit;
        Modifier padding;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(755330818);
        int i19 = (gapComposer.changedInstance(function3) ? 4 : 2) | i | (gapComposer.changed(str) ? 32 : 16);
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i19 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        int i20 = i3 & 8;
        if (i20 != 0) {
            i19 |= 3072;
        } else if ((i & 3072) == 0) {
            alignment2 = alignment;
            i19 |= gapComposer.changed(alignment2) ? 2048 : 1024;
            i4 = i3 & 16;
            if (i4 == 0) {
                i19 |= 24576;
            } else if ((i & 24576) == 0) {
                i19 |= gapComposer.changed(contentScale) ? 16384 : PKIFailureInfo.certRevoked;
                i5 = i3 & 32;
                if (i5 != 0) {
                    i19 |= 196608;
                    str3 = str2;
                } else {
                    str3 = str2;
                    if ((i & 196608) == 0) {
                        i19 |= gapComposer.changed(str3) ? PKIFailureInfo.unsupportedVersion : 65536;
                    }
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i19 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i19 |= gapComposer.changedInstance(function1) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i8 = i19 | 12582912;
                } else {
                    i8 = i19 | (gapComposer.changed(colorFilter) ? 8388608 : 4194304);
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i11 = i8 | 100663296;
                    i10 = i9;
                } else {
                    i10 = i9;
                    i11 = i8 | (gapComposer.changed(color) ? 67108864 : 33554432);
                }
                i12 = i3 & 512;
                if (i12 != 0) {
                    i14 = i11 | 805306368;
                    i13 = i12;
                } else {
                    i13 = i12;
                    i14 = i11 | (gapComposer.changed(paddingValues) ? PKIFailureInfo.duplicateCertReq : 268435456);
                }
                i15 = i3 & 1024;
                if (i15 != 0) {
                    i17 = 54;
                    i16 = i15;
                } else if ((i2 & 6) == 0) {
                    i16 = i15;
                    i17 = i2 | (gapComposer.changedInstance(function32) ? 4 : 2);
                } else {
                    i16 = i15;
                    i17 = i2;
                }
                i18 = i14;
                if (gapComposer.shouldExecute(i18 & 1, (i14 & 306783379) == 306783378 || (i17 & 19) != 18)) {
                    Alignment alignment4 = i20 != 0 ? Alignment.Companion.Center : alignment2;
                    ContentScale contentScale3 = i4 != 0 ? ContentScale.Companion.Fit : contentScale;
                    if (i5 != 0) {
                        str3 = null;
                    }
                    Function1 function13 = i6 != 0 ? null : function1;
                    ColorFilter colorFilter3 = i7 != 0 ? null : colorFilter;
                    Color color4 = i10 != 0 ? null : color;
                    PaddingValues paddingValues3 = i13 != 0 ? null : paddingValues;
                    Function3 function35 = i16 != 0 ? null : function32;
                    Object rememberedValue = gapComposer.rememberedValue();
                    Alignment alignment5 = alignment4;
                    Object obj = Composer.Companion.Empty;
                    if (rememberedValue == obj) {
                        rememberedValue = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
                    }
                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
                    boolean changed = gapComposer.changed(parcelableSnapshotMutableIntState.getIntValue());
                    ContentScale contentScale4 = contentScale3;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed || rememberedValue2 == obj) {
                        rememberedValue2 = Updater.mutableStateOf$default(null);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    MutableState mutableState = (MutableState) rememberedValue2;
                    ColorFilter colorFilter4 = colorFilter3;
                    boolean changed2 = gapComposer.changed(parcelableSnapshotMutableIntState.getIntValue()) | ((i18 & 112) == 32);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue3 == obj) {
                        color3 = color4;
                        rememberedValue3 = new PainterRequest(new Pair(str, Integer.valueOf(parcelableSnapshotMutableIntState.getIntValue())), str, new CaptureCheckFaceKt$$ExternalSyntheticLambda5(1, mutableState));
                        gapComposer.updateRememberedValue(rememberedValue3);
                    } else {
                        color3 = color4;
                    }
                    Painter painter = (Painter) function3.invoke((PainterRequest) rememberedValue3, gapComposer, Integer.valueOf((i18 << 3) & 112));
                    boolean changed3 = gapComposer.changed((Throwable) mutableState.getValue()) | gapComposer.changed(painter);
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (changed3 || rememberedValue4 == obj) {
                        rememberedValue4 = Updater.derivedStateOf(new ArcadeModal2Kt$$ExternalSyntheticLambda2(7, painter, mutableState));
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    State state = (State) rememberedValue4;
                    ImageLoadingStatus imageLoadingStatus = (ImageLoadingStatus) state.getValue();
                    boolean changed4 = ((i18 & 3670016) == 1048576) | gapComposer.changed(state);
                    Object rememberedValue5 = gapComposer.rememberedValue();
                    if (changed4 || rememberedValue5 == obj) {
                        rememberedValue5 = new PayHistoryListViewKt$PayHistoryListContent$1$1(function13, state, null, 1);
                        gapComposer.updateRememberedValue(rememberedValue5);
                    }
                    Updater.LaunchedEffect(gapComposer, imageLoadingStatus, (Function2) rememberedValue5);
                    Modifier modifier4 = Modifier.Companion.$$INSTANCE;
                    if (str3 != null) {
                        gapComposer.startReplaceGroup(727993090);
                        boolean z2 = (i18 & 458752) == 131072;
                        Object rememberedValue6 = gapComposer.rememberedValue();
                        if (z2 || rememberedValue6 == obj) {
                            rememberedValue6 = new BadgeKt$$ExternalSyntheticLambda3(str3, 25);
                            gapComposer.updateRememberedValue(rememberedValue6);
                        }
                        modifier2 = SemanticsModifierKt.semantics(modifier4, false, (Function1) rememberedValue6);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(728120810);
                        gapComposer.end(false);
                        modifier2 = modifier4;
                    }
                    ImageLoadingStatus imageLoadingStatus2 = (ImageLoadingStatus) state.getValue();
                    ImageLoadingStatus.Succeeded succeeded = ImageLoadingStatus.Succeeded.INSTANCE;
                    Color color5 = Intrinsics.areEqual(imageLoadingStatus2, succeeded) ? color3 : null;
                    if (color5 == null || (modifier3 = ImageKt.m177backgroundbw27NRU(modifier4, color5.value, ColorKt.RectangleShape)) == null) {
                        modifier3 = modifier4;
                    }
                    Modifier then = modifier.then(modifier3);
                    PaddingValues paddingValues4 = paddingValues3;
                    if (paddingValues4 != null && (padding = SpacerKt.padding(modifier4, paddingValues4)) != null) {
                        modifier4 = padding;
                    }
                    Modifier clipToBounds = ClipKt.clipToBounds(ClipKt.paint$default(then.then(modifier4).then(modifier2), painter, alignment5, contentScale4, RecyclerView.DECELERATION_RATE, colorFilter4, 18));
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(alignment5, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clipToBounds);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    ImageLoadingStatus imageLoadingStatus3 = (ImageLoadingStatus) state.getValue();
                    if (Intrinsics.areEqual(imageLoadingStatus3, ImageLoadingStatus.Error.INSTANCE)) {
                        gapComposer.startReplaceGroup(-876338071);
                        function34 = function35;
                        if (function34 == null) {
                            gapComposer.startReplaceGroup(-876331872);
                            z = false;
                            gapComposer.end(false);
                            unit = null;
                        } else {
                            gapComposer.startReplaceGroup(-998100095);
                            Object rememberedValue7 = gapComposer.rememberedValue();
                            if (rememberedValue7 == obj) {
                                rememberedValue7 = new WalletHomeViewKt$$ExternalSyntheticLambda21(3, parcelableSnapshotMutableIntState);
                                gapComposer.updateRememberedValue(rememberedValue7);
                            }
                            function34.invoke((Function0) rememberedValue7, gapComposer, Integer.valueOf(((i17 << 3) & 112) | 6));
                            z = false;
                            gapComposer.end(false);
                            unit = Unit.INSTANCE;
                        }
                        if (unit == null) {
                            gapComposer.startReplaceGroup(-998099179);
                            composableLambdaImpl.invoke((Object) gapComposer, (Object) 6);
                        } else {
                            gapComposer.startReplaceGroup(-998100295);
                        }
                        gapComposer.end(z);
                        gapComposer.end(z);
                    } else {
                        function34 = function35;
                        if (Intrinsics.areEqual(imageLoadingStatus3, succeeded)) {
                            gapComposer.startReplaceGroup(-998097844);
                            gapComposer.end(false);
                        } else {
                            if (!Intrinsics.areEqual(imageLoadingStatus3, ImageLoadingStatus.Unloaded.INSTANCE)) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -998101586, false);
                            }
                            gapComposer.startReplaceGroup(-876192805);
                            composableLambdaImpl.invoke((Object) gapComposer, (Object) 6);
                            gapComposer.end(false);
                        }
                    }
                    gapComposer.end(true);
                    alignment3 = alignment5;
                    contentScale2 = contentScale4;
                    str4 = str3;
                    colorFilter2 = colorFilter4;
                    function12 = function13;
                    color2 = color3;
                    paddingValues2 = paddingValues4;
                    function33 = function34;
                } else {
                    gapComposer.skipToGroupEnd();
                    contentScale2 = contentScale;
                    function12 = function1;
                    color2 = color;
                    paddingValues2 = paddingValues;
                    str4 = str3;
                    alignment3 = alignment2;
                    colorFilter2 = colorFilter;
                    function33 = function32;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new InputFieldKt$$ExternalSyntheticLambda4(function3, str, modifier, alignment3, contentScale2, str4, function12, colorFilter2, color2, paddingValues2, function33, composableLambdaImpl, i, i2, i3);
                    return;
                }
                return;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
            }
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i12 = i3 & 512;
            if (i12 != 0) {
            }
            i15 = i3 & 1024;
            if (i15 != 0) {
            }
            i18 = i14;
            if (gapComposer.shouldExecute(i18 & 1, (i14 & 306783379) == 306783378 || (i17 & 19) != 18)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        alignment2 = alignment;
        i4 = i3 & 16;
        if (i4 == 0) {
        }
        i5 = i3 & 32;
        if (i5 != 0) {
        }
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i12 = i3 & 512;
        if (i12 != 0) {
        }
        i15 = i3 & 1024;
        if (i15 != 0) {
        }
        i18 = i14;
        if (gapComposer.shouldExecute(i18 & 1, (i14 & 306783379) == 306783378 || (i17 & 19) != 18)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final o0 asGrpcServerStreamingCall(RealGrpcStreamingCall realGrpcStreamingCall) {
        return new o0(realGrpcStreamingCall, (GrpcMethod) realGrpcStreamingCall.method);
    }

    public static TelemetryDebugEvent.Action fromJsonObject(JsonObject jsonObject) {
        try {
            String asString = jsonObject.get("id").getAsString();
            asString.getClass();
            return new TelemetryDebugEvent.Action(asString);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Action", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Action", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Action", e3);
            return null;
        }
    }
}
