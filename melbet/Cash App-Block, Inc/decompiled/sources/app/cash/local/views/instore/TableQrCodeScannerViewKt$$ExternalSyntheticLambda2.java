package app.cash.local.views.instore;

import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda28;
import app.cash.molecule.PlatformKt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public final /* synthetic */ class TableQrCodeScannerViewKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ TableQrCodeCameraViewFinderState f$1;
    public final /* synthetic */ Function1 f$2;

    public /* synthetic */ TableQrCodeScannerViewKt$$ExternalSyntheticLambda2(Modifier modifier, TableQrCodeCameraViewFinderState tableQrCodeCameraViewFinderState, Function1 function1) {
        this.f$0 = modifier;
        this.f$1 = tableQrCodeCameraViewFinderState;
        this.f$2 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier modifier = this.f$0;
        Function1 function1 = this.f$2;
        TableQrCodeCameraViewFinderState tableQrCodeCameraViewFinderState = this.f$1;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new GestureNodeKt$$ExternalSyntheticLambda0(28, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    zzuk.TableQrCodeCameraViewFinder(tableQrCodeCameraViewFinderState, (Function1) rememberedValue, fillMaxSize2, gapComposer, MLKEMEngine.KyberPolyBytes);
                    boolean changed2 = gapComposer.changed(function1);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(25, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    TableQrCodeScannerViewKt.TableQrCodeScannerChrome((Function0) rememberedValue2, gapComposer, 0);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                num.getClass();
                zzuk.TableQrCodeCameraViewFinder(tableQrCodeCameraViewFinderState, function1, modifier, composer, Updater.updateChangedFlags(385));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ TableQrCodeScannerViewKt$$ExternalSyntheticLambda2(TableQrCodeCameraViewFinderState tableQrCodeCameraViewFinderState, Function1 function1, Modifier modifier, int i) {
        this.f$1 = tableQrCodeCameraViewFinderState;
        this.f$2 = function1;
        this.f$0 = modifier;
    }
}
