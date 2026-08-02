package androidx.camera.core.impl;

import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.impl.utils.MatrixExt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Vertical;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import com.android.volley.toolbox.HurlStack;
import com.google.android.gms.internal.mlkit_vision_common.zzjm;
import com.google.android.gms.internal.mlkit_vision_common.zzjs;
import com.squareup.cash.api.ContextKt;
import com.squareup.cash.appmessages.AppMessageImage;
import com.squareup.cash.appmessages.AppMessageImage$Animated$Asset$Url;
import com.squareup.cash.db.EnumListAdapter$encode$1;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.genie.AlignmentResolverKt$WhenMappings;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.protos.cash.messagingplatformcommon.app.Animation;
import com.squareup.protos.cash.messagingplatformcommon.app.Animation$Message$Fill;
import com.squareup.protos.cash.messagingplatformcommon.app.Animation$Message$Fixed;
import com.squareup.protos.cash.messagingplatformcommon.app.Animation$Message$Inset;
import com.squareup.protos.cash.messagingplatformcommon.app.AnimationFixed;
import com.squareup.protos.cash.messagingplatformcommon.app.Image;
import com.squareup.protos.cash.messagingplatformcommon.app.Image$Message$ImageFill;
import com.squareup.protos.cash.messagingplatformcommon.app.Image$Message$ImageFixed;
import com.squareup.protos.cash.messagingplatformcommon.app.Image$Message$ImageInset;
import com.squareup.protos.cash.messagingplatformcommon.app.ImageFill;
import com.squareup.protos.cash.messagingplatformcommon.app.ImageFixed;
import com.squareup.protos.cash.messagingplatformcommon.app.ImageInset;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1;
import xyz.block.genie.expressions.ExpressionEvaluator;
import xyz.block.genie.state.GenieCollectionItem;
import xyz.block.genie.state.GenieCompositionLocalsKt;
import xyz.block.genie.state.GenieIdValue;
import xyz.block.genie.state.GenieRootViewState;
import xyz.block.genie.state.GenieStateValue;
import xyz.block.genie.state.GenieViewState;
import xyz.block.protos.genie.CollectionItem;
import xyz.block.protos.genie.Expression;
import xyz.block.protos.genie.IdValue;
import xyz.block.protos.genie.KeyValueMap;

/* loaded from: classes3.dex */
public abstract class CameraCaptureCallbacks {

    public final class NoOpCameraCaptureCallback extends CameraCaptureCallback {
        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void onCaptureCompleted(int i, CameraCaptureResult cameraCaptureResult) {
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void onCaptureFailed(int i, HurlStack hurlStack) {
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void onCaptureStarted(int i) {
        }
    }

    public static final void ComposeColumnView(ComposePlatform.Column column, Modifier modifier, Composer composer, int i) {
        int i2;
        column.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1971935638);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(column) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            GenieViewState genieViewState = (GenieViewState) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieViewState);
            ExpressionEvaluator expressionEvaluator = (ExpressionEvaluator) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieExpressionEvaluator);
            Dp resolveDp = ContextKt.resolveDp(expressionEvaluator, genieViewState, column.spacing);
            Expression expression = column.vertical_arrangement;
            Arrangement$Vertical arrangement$Vertical = SpacerKt.Top;
            ComposePlatform.VerticalArrangement verticalArrangement = (ComposePlatform.VerticalArrangement) ContextKt.resolveProtoEnum(expression, expressionEvaluator, genieViewState, new EnumListAdapter$encode$1(1, ComposePlatform.VerticalArrangement.Companion, ComposePlatform.VerticalArrangement.Companion.class, "fromValue", "fromValue(I)Lcom/squareup/cash/moneybot/genie/protos/ComposePlatform$VerticalArrangement;", 0, 28));
            switch (verticalArrangement == null ? -1 : AlignmentResolverKt$WhenMappings.$EnumSwitchMapping$3[verticalArrangement.ordinal()]) {
                case 1:
                    arrangement$Vertical = SpacerKt.Center;
                    break;
                case 2:
                    arrangement$Vertical = SpacerKt.Bottom;
                    break;
                case 3:
                    arrangement$Vertical = SpacerKt.SpaceBetween;
                    break;
                case 4:
                    arrangement$Vertical = SpacerKt.SpaceAround;
                    break;
                case 5:
                    arrangement$Vertical = SpacerKt.SpaceEvenly;
                    break;
                case 6:
                    arrangement$Vertical = new Arrangement$SpacedAligned(resolveDp != null ? resolveDp.value : RecyclerView.DECELERATION_RATE, true, new Drop$$ExternalSyntheticBUOutline0(3));
                    break;
            }
            Expression expression2 = column.horizontal_alignment;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ComposePlatform.HorizontalAlignment horizontalAlignment = (ComposePlatform.HorizontalAlignment) ContextKt.resolveProtoEnum(expression2, expressionEvaluator, genieViewState, new EnumListAdapter$encode$1(1, ComposePlatform.HorizontalAlignment.Companion, ComposePlatform.HorizontalAlignment.Companion.class, "fromValue", "fromValue(I)Lcom/squareup/cash/moneybot/genie/protos/ComposePlatform$HorizontalAlignment;", 0, 25));
            int i3 = horizontalAlignment != null ? AlignmentResolverKt$WhenMappings.$EnumSwitchMapping$0[horizontalAlignment.ordinal()] : -1;
            if (i3 == 1) {
                horizontal = Alignment.Companion.CenterHorizontally;
            } else if (i3 == 2) {
                horizontal = Alignment.Companion.End;
            }
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Vertical, horizontal, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(132982611);
            Iterator it = column.children.iterator();
            while (it.hasNext()) {
                MatrixExt.GenieNodeView((Node) it.next(), Modifier.Companion.$$INSTANCE, gapComposer, 48);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(column, modifier, i, 9);
        }
    }

    public static final AppMessageImage asAppMessageImage(Image image, boolean z) {
        image.getClass();
        zzjs zzjsVar = image.message;
        if (zzjsVar instanceof Image$Message$ImageInset) {
            Image$Message$ImageInset image$Message$ImageInset = (Image$Message$ImageInset) zzjsVar;
            LockFreeLinkedListNode$toString$1 lockFreeLinkedListNode$toString$1 = new LockFreeLinkedListNode$toString$1(0, 6, ImageInset.class, image$Message$ImageInset.value, "image_asset", "getImage_asset()Lcom/squareup/protos/cash/ui/Image;");
            LockFreeLinkedListNode$toString$1 lockFreeLinkedListNode$toString$12 = new LockFreeLinkedListNode$toString$1(0, 7, ImageInset.class, image$Message$ImageInset.value, "asset_url", "getAsset_url()Ljava/lang/String;");
            com.squareup.protos.cash.ui.Image image2 = (com.squareup.protos.cash.ui.Image) lockFreeLinkedListNode$toString$1.get();
            String str = (String) lockFreeLinkedListNode$toString$12.get();
            if (image2 != null) {
                return new AppMessageImage.Static.Inset(image2, z);
            }
            if (str != null) {
                return new AppMessageImage.Static.Inset(new com.squareup.protos.cash.ui.Image(str, str, 4), z);
            }
        } else {
            if (zzjsVar instanceof Image$Message$ImageFixed) {
                Image$Message$ImageFixed image$Message$ImageFixed = (Image$Message$ImageFixed) zzjsVar;
                LockFreeLinkedListNode$toString$1 lockFreeLinkedListNode$toString$13 = new LockFreeLinkedListNode$toString$1(0, 8, ImageFixed.class, image$Message$ImageFixed.value, "image_asset", "getImage_asset()Lcom/squareup/protos/cash/ui/Image;");
                LockFreeLinkedListNode$toString$1 lockFreeLinkedListNode$toString$14 = new LockFreeLinkedListNode$toString$1(0, 9, ImageFixed.class, image$Message$ImageFixed.value, "asset_url", "getAsset_url()Ljava/lang/String;");
                com.squareup.protos.cash.ui.Image image3 = (com.squareup.protos.cash.ui.Image) lockFreeLinkedListNode$toString$13.get();
                String str2 = (String) lockFreeLinkedListNode$toString$14.get();
                if (image3 != null) {
                    ImageFixed imageFixed = ((Image$Message$ImageFixed) zzjsVar).value;
                    Integer num = imageFixed.width;
                    num.getClass();
                    int intValue = num.intValue();
                    Integer num2 = imageFixed.height;
                    num2.getClass();
                    return new AppMessageImage.Static.Fixed(image3, z, intValue, num2.intValue());
                }
                if (str2 == null) {
                    return null;
                }
                com.squareup.protos.cash.ui.Image image4 = new com.squareup.protos.cash.ui.Image(str2, str2, 4);
                ImageFixed imageFixed2 = ((Image$Message$ImageFixed) zzjsVar).value;
                Integer num3 = imageFixed2.width;
                num3.getClass();
                int intValue2 = num3.intValue();
                Integer num4 = imageFixed2.height;
                num4.getClass();
                return new AppMessageImage.Static.Fixed(image4, z, intValue2, num4.intValue());
            }
            if (zzjsVar instanceof Image$Message$ImageFill) {
                Image$Message$ImageFill image$Message$ImageFill = (Image$Message$ImageFill) zzjsVar;
                LockFreeLinkedListNode$toString$1 lockFreeLinkedListNode$toString$15 = new LockFreeLinkedListNode$toString$1(0, 10, ImageFill.class, image$Message$ImageFill.value, "image_asset", "getImage_asset()Lcom/squareup/protos/cash/ui/Image;");
                LockFreeLinkedListNode$toString$1 lockFreeLinkedListNode$toString$16 = new LockFreeLinkedListNode$toString$1(0, 11, ImageFill.class, image$Message$ImageFill.value, "asset_url", "getAsset_url()Ljava/lang/String;");
                com.squareup.protos.cash.ui.Image image5 = (com.squareup.protos.cash.ui.Image) lockFreeLinkedListNode$toString$15.get();
                String str3 = (String) lockFreeLinkedListNode$toString$16.get();
                if (image5 != null) {
                    return new AppMessageImage.Static.Fill(image5, z);
                }
                if (str3 != null) {
                    return new AppMessageImage.Static.Fill(new com.squareup.protos.cash.ui.Image(str3, str3, 4), z);
                }
            } else if (zzjsVar != null) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        return null;
    }

    public static CameraCaptureCallback createComboCallback(CameraCaptureCallback... cameraCaptureCallbackArr) {
        List asList = Arrays.asList(cameraCaptureCallbackArr);
        return asList.isEmpty() ? new NoOpCameraCaptureCallback() : asList.size() == 1 ? (CameraCaptureCallback) asList.get(0) : new MetadataImageReader.AnonymousClass1(asList);
    }

    public static GenieCollectionItem fromProto(CollectionItem collectionItem) {
        GenieIdValue genieIdValue;
        GenieStateValue stateValueFromEntry$android_release;
        collectionItem.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        KeyValueMap keyValueMap = collectionItem.fields;
        GenieIdValue genieIdValue2 = null;
        List<KeyValueMap.Entry> list = keyValueMap != null ? keyValueMap.entries : null;
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        for (KeyValueMap.Entry entry : list) {
            String str = entry.key;
            if (str != null && (stateValueFromEntry$android_release = GenieRootViewState.Companion.stateValueFromEntry$android_release(entry)) != null) {
                linkedHashMap.put(str, stateValueFromEntry$android_release);
            }
        }
        IdValue idValue = collectionItem.identity;
        if (idValue != null) {
            String str2 = idValue.server;
            if (str2 != null) {
                genieIdValue = new GenieIdValue(str2, null, 2);
            } else {
                String str3 = idValue.local;
                if (str3 != null) {
                    genieIdValue2 = new GenieIdValue(null, str3, 1);
                } else {
                    genieIdValue = new GenieIdValue(null, null, 3);
                }
            }
            genieIdValue2 = genieIdValue;
        }
        return new GenieCollectionItem(linkedHashMap, genieIdValue2);
    }

    public static final AppMessageImage.Animated asAppMessageImage(Animation animation) {
        animation.getClass();
        zzjm zzjmVar = animation.message;
        if (zzjmVar instanceof Animation$Message$Inset) {
            com.squareup.protos.cash.ui.Image image = ((Animation$Message$Inset) zzjmVar).value.lottie_asset;
            if (image != null) {
                return new AppMessageImage.Animated.Inset(new AppMessageImage$Animated$Asset$Url(image));
            }
        } else if (zzjmVar instanceof Animation$Message$Fixed) {
            AnimationFixed animationFixed = ((Animation$Message$Fixed) zzjmVar).value;
            com.squareup.protos.cash.ui.Image image2 = animationFixed.lottie_asset;
            if (image2 != null) {
                AppMessageImage$Animated$Asset$Url appMessageImage$Animated$Asset$Url = new AppMessageImage$Animated$Asset$Url(image2);
                Integer num = animationFixed.width;
                num.getClass();
                int intValue = num.intValue();
                Integer num2 = animationFixed.height;
                num2.getClass();
                return new AppMessageImage.Animated.Fixed(appMessageImage$Animated$Asset$Url, intValue, num2.intValue());
            }
        } else if (zzjmVar instanceof Animation$Message$Fill) {
            com.squareup.protos.cash.ui.Image image3 = ((Animation$Message$Fill) zzjmVar).value.lottie_asset;
            if (image3 != null) {
                return new AppMessageImage.Animated.Fill(new AppMessageImage$Animated$Asset$Url(image3));
            }
        } else if (zzjmVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        return null;
    }
}
