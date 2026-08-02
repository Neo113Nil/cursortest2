package com.squareup.cash.card.onboarding;

import androidx.camera.video.internal.utils.StorageUtil;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardStudioViewV2Kt$$ExternalSyntheticLambda7 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ CardStudioViewV2Kt$$ExternalSyntheticLambda7(float f, Function1 function1) {
        this.$r8$classId = 0;
        this.f$0 = f;
        this.f$1 = function1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0202, code lost:
    
        if (r11 == r9) goto L43;
     */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj5 = Composer.Companion.Empty;
        float f = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                Strings.getSizes(composer).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion, 16.0f);
                Strings.getSizes(composer).getClass();
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, composer, 0);
                GapComposer gapComposer = (GapComposer) composer;
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(composer, m298padding3ABfNKs);
                ComposeUiNode.Companion.getClass();
                Function0 function0 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(function0);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(composer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 52.0f);
                RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
                Modifier clip = ClipKt.clip(m285size3ABfNKs, roundedCornerShape);
                long j = Strings.getColors(composer).component.button.standard.background.f163default;
                RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                Modifier rotate = RotateKt.rotate(ImageKt.m177backgroundbw27NRU(clip, j, rectangleShapeKt$RectangleShape$1), f);
                Icons icons = Icons.Stickers24;
                String stringResource = Room.stringResource(composer, R.string.accessibility_add_stamp);
                boolean changed = gapComposer2.changed(function1);
                Object rememberedValue = gapComposer2.rememberedValue();
                if (changed || rememberedValue == obj5) {
                    rememberedValue = new DisclosureView$$ExternalSyntheticLambda1(19, function1);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                StorageUtil.ButtonIcon(icons, stringResource, (Function0) rememberedValue, rotate, false, null, composer, 6, 48);
                Modifier rotate2 = RotateKt.rotate(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 52.0f), roundedCornerShape), Strings.getColors(composer).component.button.standard.background.f163default, rectangleShapeKt$RectangleShape$1), f);
                Icons icons2 = Icons.NumberPad24;
                String stringResource2 = Room.stringResource(composer, R.string.accessibility_toggle_pattern_personalization);
                boolean changed2 = gapComposer2.changed(function1);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (!changed2) {
                    obj4 = obj5;
                    break;
                } else {
                    obj4 = obj5;
                }
                rememberedValue2 = new DisclosureView$$ExternalSyntheticLambda1(20, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
                Object obj6 = obj4;
                StorageUtil.ButtonIcon(icons2, stringResource2, (Function0) rememberedValue2, rotate2, false, null, composer, 6, 48);
                Modifier rotate3 = RotateKt.rotate(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 52.0f), roundedCornerShape), Strings.getColors(composer).component.button.standard.background.f163default, rectangleShapeKt$RectangleShape$1), f);
                Icons icons3 = Icons.Draw24;
                String stringResource3 = Room.stringResource(composer, R.string.accessibility_draw_mode);
                boolean changed3 = gapComposer2.changed(function1);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (changed3 || rememberedValue3 == obj6) {
                    rememberedValue3 = new DisclosureView$$ExternalSyntheticLambda1(21, function1);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                StorageUtil.ButtonIcon(icons3, stringResource3, (Function0) rememberedValue3, rotate3, false, null, composer, 6, 48);
                gapComposer2.end(true);
                return Unit.INSTANCE;
            case 1:
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer2).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    Icons icons4 = Icons.NavigationMore;
                    String stringResource4 = Room.stringResource(gapComposer3, R.string.accessibility_customization_settings);
                    boolean changed4 = gapComposer3.changed(function1);
                    Object rememberedValue4 = gapComposer3.rememberedValue();
                    if (changed4 || rememberedValue4 == obj5) {
                        rememberedValue4 = new DisclosureView$$ExternalSyntheticLambda1(23, function1);
                        gapComposer3.updateRememberedValue(rememberedValue4);
                    }
                    TransactorKt.IconAction(titleBarActionScope, icons4, stringResource4, (Function0) rememberedValue4, RotateKt.rotate(companion, f), null, null, null, null, null, false, gapComposer3, (intValue & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                AndroidPath androidPath = (AndroidPath) obj;
                Size size = (Size) obj2;
                androidPath.getClass();
                ((LayoutDirection) obj3).getClass();
                long j2 = ((Offset) function1.invoke(size)).packedValue;
                int i2 = (int) (j2 >> 32);
                float max = Math.max(Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (size.packedValue >> 32)) - Float.intBitsToFloat(i2));
                int i3 = (int) (j2 & BodyPartID.bodyIdMax);
                AndroidPath.addOval$default(androidPath, DBUtil.m1179Rect3MmeM6k(j2, ((float) Math.hypot(max, Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & size.packedValue)) - Float.intBitsToFloat(i3)))) * f));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ CardStudioViewV2Kt$$ExternalSyntheticLambda7(Function1 function1, float f, int i) {
        this.$r8$classId = i;
        this.f$1 = function1;
        this.f$0 = f;
    }
}
