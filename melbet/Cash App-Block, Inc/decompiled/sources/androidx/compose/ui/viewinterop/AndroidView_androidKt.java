package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.animation.CrossfadeKt$Crossfade$1;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.InnerNodeCoordinator;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.UiApplier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.glance.text.TextKt$Text$3;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.compose.LocalSavedStateRegistryOwnerKt;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes.dex */
public abstract class AndroidView_androidKt {
    public static final AndroidViewHolder_androidKt$NoOpScrollConnection$1 NoOpScrollConnection = new AndroidViewHolder_androidKt$NoOpScrollConnection$1();

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AndroidView(Function1 function1, Modifier modifier, Function1 function12, Function1 function13, Function1 function14, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1 function15;
        int i5;
        Function1 function16;
        Modifier modifier3;
        Function1 function17;
        Function1 function18;
        RecomposeScopeImpl endRestartGroup;
        Function1 function19 = AndroidView_androidKt$NoOpUpdate$1.INSTANCE;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-180024211);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                function15 = function12;
                i3 |= gapComposer.changedInstance(function15) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function16 = function13;
                    i3 |= gapComposer.changedInstance(function16) ? 2048 : 1024;
                    if ((i & 24576) == 0) {
                        i3 |= gapComposer.changedInstance(function14) ? 16384 : PKIFailureInfo.certRevoked;
                    }
                    if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
                        gapComposer.skipToGroupEnd();
                        modifier3 = modifier2;
                        function17 = function15;
                        function18 = function16;
                    } else {
                        Modifier modifier4 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                        if (i4 != 0) {
                            function15 = null;
                        }
                        if (i5 == 0) {
                            function19 = function16;
                        }
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier4.then(FocusGroupPropertiesElement.INSTANCE).then(FocusTargetNode.FocusTargetElement.INSTANCE).then(FocusTargetPropertiesElement.INSTANCE).then(FocusTargetInteropElement.INSTANCE));
                        Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                        LayoutDirection layoutDirection = (LayoutDirection) gapComposer.consume(CompositionLocalsKt.LocalLayoutDirection);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        LifecycleOwner lifecycleOwner = (LifecycleOwner) gapComposer.consume(LocalLifecycleOwnerKt.LocalLifecycleOwner);
                        SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) gapComposer.consume(LocalSavedStateRegistryOwnerKt.LocalSavedStateRegistryOwner);
                        if (function15 != null) {
                            gapComposer.startReplaceGroup(1313917368);
                            Function0 createAndroidViewNodeFactory = createAndroidViewNodeFactory(function1, gapComposer, i3 & 14);
                            if (!(applier instanceof UiApplier)) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer.startReusableNode();
                            if (gapComposer.inserting) {
                                gapComposer.createNode(createAndroidViewNodeFactory);
                            } else {
                                gapComposer.useNode();
                            }
                            function17 = function15;
                            m1074updateViewHolderParams6NefGtU(gapComposer, materializeModifier, hashCode, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalScope);
                            Updater.m576setimpl(gapComposer, function17, AndroidView_androidKt$AndroidView$2$1.INSTANCE);
                            Updater.m576setimpl(gapComposer, function14, AndroidView_androidKt$AndroidView$2$1.INSTANCE$1);
                            Updater.m576setimpl(gapComposer, function19, AndroidView_androidKt$AndroidView$2$1.INSTANCE$2);
                            gapComposer.end(true);
                            gapComposer.end(false);
                        } else {
                            int i7 = i3;
                            function17 = function15;
                            gapComposer.startReplaceGroup(1314774735);
                            Function0 createAndroidViewNodeFactory2 = createAndroidViewNodeFactory(function1, gapComposer, i7 & 14);
                            if (!(applier instanceof UiApplier)) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer.startNode();
                            if (gapComposer.inserting) {
                                gapComposer.createNode(createAndroidViewNodeFactory2);
                            } else {
                                gapComposer.useNode();
                            }
                            m1074updateViewHolderParams6NefGtU(gapComposer, materializeModifier, hashCode, density, lifecycleOwner, savedStateRegistryOwner, layoutDirection, currentCompositionLocalScope);
                            Updater.m576setimpl(gapComposer, function14, AndroidView_androidKt$AndroidView$3$1.INSTANCE);
                            Updater.m576setimpl(gapComposer, function19, AndroidView_androidKt$AndroidView$3$1.INSTANCE$1);
                            gapComposer.end(true);
                            gapComposer.end(false);
                        }
                        modifier3 = modifier4;
                        function18 = function19;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new CrossfadeKt$Crossfade$1(function1, modifier3, function17, function18, function14, i, i2, 2);
                        return;
                    }
                    return;
                }
                function16 = function13;
                if ((i & 24576) == 0) {
                }
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function15 = function12;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function16 = function13;
            if ((i & 24576) == 0) {
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function15 = function12;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function16 = function13;
        if ((i & 24576) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final View access$getEmbeddedView(Modifier.Node node) {
        ViewFactoryHolder viewFactoryHolder = DepthSortedSetKt.requireLayoutNode(node.getNode()).interopViewFactoryHolder;
        View view = viewFactoryHolder != null ? viewFactoryHolder.view : null;
        if (view != null) {
            return view;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Could not fetch interop view");
        return null;
    }

    public static final void access$layoutAccordingTo(ViewFactoryHolder viewFactoryHolder, LayoutNode layoutNode) {
        long mo841localToRootMKHz9U = ((InnerNodeCoordinator) layoutNode.nodes.innerCoordinator).mo841localToRootMKHz9U(0L);
        int round = Math.round(Float.intBitsToFloat((int) (mo841localToRootMKHz9U >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (mo841localToRootMKHz9U & BodyPartID.bodyIdMax)));
        viewFactoryHolder.layout(round, round2, viewFactoryHolder.getMeasuredWidth() + round, viewFactoryHolder.getMeasuredHeight() + round2);
    }

    public static final ViewFactoryHolder access$requireViewFactoryHolder(LayoutNode layoutNode) {
        ViewFactoryHolder viewFactoryHolder = layoutNode.interopViewFactoryHolder;
        if (viewFactoryHolder != null) {
            return viewFactoryHolder;
        }
        throw Boxes$$ExternalSyntheticOutline1.m1150m("Required value was null.");
    }

    public static final Function0 createAndroidViewNodeFactory(final Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        final int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
        final Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
        final GapComposer.CompositionContextImpl buildContext = gapComposer.buildContext();
        final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) gapComposer.consume(SaveableStateRegistryKt.LocalSaveableStateRegistry);
        final View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
        boolean changedInstance = ((((i & 14) ^ 6) > 4 && gapComposer.changed(function1)) || (i & 6) == 4) | gapComposer.changedInstance(context) | gapComposer.changedInstance(buildContext) | gapComposer.changedInstance(saveableStateRegistry) | gapComposer.changed(hashCode) | gapComposer.changedInstance(view);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            Function0 function0 = new Function0() { // from class: androidx.compose.ui.viewinterop.AndroidView_androidKt$createAndroidViewNodeFactory$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    KeyEvent.Callback callback = view;
                    callback.getClass();
                    return new ViewFactoryHolder(context, function1, buildContext, saveableStateRegistry, hashCode, (Owner) callback).layoutNode;
                }
            };
            gapComposer.updateRememberedValue(function0);
            rememberedValue = function0;
        }
        return (Function0) rememberedValue;
    }

    /* renamed from: updateViewHolderParams-6NefGtU, reason: not valid java name */
    public static final void m1074updateViewHolderParams6NefGtU(Composer composer, Modifier modifier, int i, Density density, LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner, LayoutDirection layoutDirection, PersistentCompositionLocalHashMap persistentCompositionLocalHashMap) {
        ComposeUiNode.Companion.getClass();
        Updater.m576setimpl(composer, persistentCompositionLocalHashMap, ComposeUiNode.Companion.SetResolvedCompositionLocals);
        Updater.m576setimpl(composer, modifier, AndroidView_androidKt$AndroidView$3$1.INSTANCE$2);
        Updater.m576setimpl(composer, density, AndroidView_androidKt$AndroidView$3$1.INSTANCE$3);
        Updater.m576setimpl(composer, lifecycleOwner, AndroidView_androidKt$AndroidView$3$1.INSTANCE$4);
        Updater.m576setimpl(composer, savedStateRegistryOwner, AndroidView_androidKt$AndroidView$3$1.INSTANCE$5);
        Updater.m576setimpl(composer, layoutDirection, AndroidView_androidKt$AndroidView$3$1.INSTANCE$6);
        Updater.m576setimpl(composer, Integer.valueOf(i), ComposeUiNode.Companion.SetCompositeKeyHash);
    }

    public static final void AndroidView(Function1 function1, Modifier modifier, Function1 function12, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Function1 function13;
        AndroidView_androidKt$NoOpUpdate$1 androidView_androidKt$NoOpUpdate$1 = AndroidView_androidKt$NoOpUpdate$1.INSTANCE;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1783766393);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function12) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.$$INSTANCE;
            }
            Modifier modifier3 = modifier;
            Function1 function14 = i5 != 0 ? androidView_androidKt$NoOpUpdate$1 : function12;
            AndroidView(function1, modifier3, null, androidView_androidKt$NoOpUpdate$1, function14, gapComposer, (i3 & 14) | 3072 | (i3 & 112) | (57344 & (i3 << 6)), 4);
            modifier2 = modifier3;
            function13 = function14;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            function13 = function12;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$Text$3(function1, modifier2, function13, i, i2);
        }
    }
}
