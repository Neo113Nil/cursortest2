package com.squareup.cash.sheet;

import android.os.Bundle;
import androidx.camera.core.processing.TargetUtils;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.credentials.Credential;
import androidx.credentials.CustomCredential;
import androidx.credentials.DigitalCredential;
import androidx.credentials.PublicKeyCredential;
import androidx.credentials.RestoreCredential;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import app.cash.molecule.PlatformKt;
import com.google.mlkit.vision.text.zzb;
import com.squareup.cash.arcade.Motion;
import com.squareup.cash.arcade.MotionKt;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class BasicShieetKt {
    public static final void BasicShieet(RealSheetState realSheetState, Function0 function0, SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight, Modifier modifier, AnimatedVisibilityScope animatedVisibilityScope, SharedTransitionScope sharedTransitionScope, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        ComposableLambdaImpl composableLambdaImpl2;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1978979634);
        int i2 = i | (gapComposer.changed(realSheetState) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changed(sheetPeekPosition$FixedHeight) ? 256 : 128) | (gapComposer.changed(modifier) ? 2048 : 1024) | (gapComposer.changedInstance(animatedVisibilityScope) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(sharedTransitionScope) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            gapComposer.startReplaceGroup(871096725);
            realSheetState.peekPosition$delegate.setValue(sheetPeekPosition$FixedHeight);
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            density.getClass();
            realSheetState.density = density;
            SpringSpec steady$default = TargetUtils.steady$default((zzb) ((Motion) gapComposer.consume(MotionKt.LocalMotion)).springs.text);
            realSheetState.enterAnimationSpec = steady$default;
            realSheetState.exitAnimationSpec = steady$default;
            realSheetState.CreateDragAnchorsEffect(gapComposer, 0);
            realSheetState.ProcessQueuedNestedFlingsEffect(gapComposer, 0);
            gapComposer.end(false);
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.BottomCenter, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            Continuation continuation = null;
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
            composableLambdaImpl2 = composableLambdaImpl;
            composableLambdaImpl2.invoke((Object) new BasicShieetScope(realSheetState, animatedVisibilityScope, sharedTransitionScope), (Object) gapComposer, (Object) 48);
            gapComposer.end(true);
            boolean changedInstance = ((i2 & 14) == 4) | gapComposer.changedInstance(animatedVisibilityScope) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                BasicShieetKt$BasicShieet$4$1 basicShieetKt$BasicShieet$4$1 = new BasicShieetKt$BasicShieet$4$1(realSheetState, animatedVisibilityScope, function0, continuation, 0);
                gapComposer.updateRememberedValue(basicShieetKt$BasicShieet$4$1);
                rememberedValue = basicShieetKt$BasicShieet$4$1;
            }
            Updater.LaunchedEffect(gapComposer, realSheetState, (Function2) rememberedValue);
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BasicShieetKt$$ExternalSyntheticLambda0(realSheetState, function0, sheetPeekPosition$FixedHeight, modifier, animatedVisibilityScope, sharedTransitionScope, composableLambdaImpl2, i, 0);
        }
    }

    public static Credential createFrom(Bundle bundle, String str) {
        str.getClass();
        bundle.getClass();
        try {
            switch (str.hashCode()) {
                case -1678407252:
                    if (str.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                        try {
                            Object obj = bundle.get("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                            obj.getClass();
                            return obj instanceof byte[] ? new DigitalCredential(bundle, new String((byte[]) obj, Charsets.UTF_8)) : new DigitalCredential(bundle, (String) obj);
                        } catch (Exception unused) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                    throw new FrameworkClassParsingException();
                case -1072734346:
                    if (str.equals("androidx.credentials.TYPE_RESTORE_CREDENTIAL")) {
                        String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE");
                        if (string2 == null) {
                            throw new NoCredentialException("The device does not contain a restore credential.");
                        }
                        RestoreCredential restoreCredential = new RestoreCredential(bundle, "androidx.credentials.TYPE_RESTORE_CREDENTIAL");
                        if (string2.length() != 0) {
                            try {
                                new JSONObject(string2);
                                return restoreCredential;
                            } catch (Exception unused2) {
                            }
                        }
                        throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
                    }
                    throw new FrameworkClassParsingException();
                case -543568185:
                    if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                        try {
                            String string3 = bundle.getString("androidx.credentials.BUNDLE_KEY_ID");
                            String string4 = bundle.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                            string3.getClass();
                            string4.getClass();
                            return new RestoreCredential(bundle, string4);
                        } catch (Exception unused3) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                    throw new FrameworkClassParsingException();
                case -95037569:
                    if (str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            String string5 = bundle.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                            string5.getClass();
                            return new PublicKeyCredential(bundle, string5);
                        } catch (Exception unused4) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                    throw new FrameworkClassParsingException();
                default:
                    throw new FrameworkClassParsingException();
            }
        } catch (FrameworkClassParsingException unused5) {
            return new CustomCredential(bundle, str);
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.InternalBenchmarking.deepLinkSpecs;
    }
}
