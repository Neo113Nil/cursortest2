package androidx.camera.video.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.config.AudioConfigUtil;
import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda5;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.avatar.DiagonalAvatarValues;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.genie.ResolvedStyle;
import com.squareup.cash.moneybot.genie.SliderViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.work.views.shift.ShiftListContentKt$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.collections.immutable.ImmutableList;
import okhttp3.internal.Tags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import xyz.block.genie.expressions.EvalHelpersKt;
import xyz.block.genie.expressions.ExpressionEvaluator;
import xyz.block.genie.state.GenieCompositionLocalsKt;
import xyz.block.genie.state.GenieStateBinding;
import xyz.block.genie.state.GenieViewState;
import xyz.block.genie.state.StateBindingsKt;

/* loaded from: classes3.dex */
public abstract class DebugUtils {
    public static final void AvatarCarousel(ImmutableList immutableList, Function1 function1, Modifier modifier, LazyListState lazyListState, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        LazyListState lazyListState2;
        Modifier modifier3;
        Modifier modifier4;
        LazyListState rememberLazyListState;
        int i4;
        immutableList.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-26782806);
        int i5 = i | (gapComposer.changed(immutableList) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i5 | MLKEMEngine.KyberPolyBytes;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i5 | (gapComposer.changed(modifier2) ? 256 : 128);
        }
        int i7 = i3 | 1024;
        int i8 = 1;
        if (gapComposer.shouldExecute(i7 & 1, (i7 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                modifier4 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                rememberLazyListState = LazyListStateKt.rememberLazyListState(0, 3, gapComposer);
                i4 = i7 & (-7169);
            } else {
                gapComposer.skipToGroupEnd();
                i4 = i7 & (-7169);
                modifier4 = modifier2;
                rememberLazyListState = lazyListState;
            }
            gapComposer.endDefaults();
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(16.0f, RecyclerView.DECELERATION_RATE, 2);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            boolean z = ((i4 & 14) == 4) | ((i4 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ShiftListContentKt$$ExternalSyntheticLambda0(immutableList, function1, i8);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            lazyListState2 = rememberLazyListState;
            modifier3 = modifier4;
            LazyDslKt.LazyRow(modifier3, lazyListState2, m295PaddingValuesYgX7TsA$default, arrangement$SpacedAligned, null, null, false, null, (Function1) rememberedValue, gapComposer, (i4 >> 6) & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 488);
        } else {
            gapComposer.skipToGroupEnd();
            lazyListState2 = lazyListState;
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2(immutableList, function1, modifier3, lazyListState2, i, i2);
        }
    }

    public static final void AvatarCarouselItem(AvatarEntry avatarEntry, Function0 function0, Modifier modifier, String str, String str2, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(297195972);
        int i2 = i | (gapComposer.changed(avatarEntry) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | MLKEMEngine.KyberPolyBytes | (gapComposer.changed(str) ? 2048 : 1024) | (gapComposer.changed(true) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(str2) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            AvatarCarouselItemGroupBase(Tags.persistentListOf(avatarEntry), function0, companion, str, str2, gapComposer, i2 & 524272);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda4(avatarEntry, function0, modifier2, str, str2, i, 8);
        }
    }

    public static final void AvatarCarouselItemGroupBase(ImmutableList immutableList, Function0 function0, Modifier modifier, String str, String str2, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(416969479);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(immutableList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(true) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(str2) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
            Modifier m181clickableO2vRcR0 = ImageKt.m181clickableO2vRcR0(SizeKt.m290width3ABfNKs(modifier, 64.0f).then(Modifier.Companion.$$INSTANCE), mutableInteractionSourceImpl, null, true, str2, new Role(0), function0);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CopyCodeKt$$ExternalSyntheticLambda5(27);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m181clickableO2vRcR0, true, (Function1) rememberedValue2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterHorizontally, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
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
            ButtonAvatars(mutableInteractionSourceImpl, immutableList, gapComposer, ((i2 << 3) & 112) | 6);
            if (str == null || str.length() == 0) {
                gapComposer.startReplaceGroup(236817381);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(236644401);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Room.m1165Text25TpFw(0, 1, 0, 0, ((i2 >> 9) & 14) | 1572864, 0, 4018, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(immutableList, function0, modifier, str, str2, i, 13);
        }
    }

    public static final void ButtonAvatars(MutableInteractionSourceImpl mutableInteractionSourceImpl, ImmutableList immutableList, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1245309173);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(mutableInteractionSourceImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(immutableList) ? 32 : 16;
        }
        int i3 = 1;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int size = immutableList.size();
            if (1 > size || size >= 3) {
                a$$ExternalSyntheticBUOutline0.m$3("buttonAvatars only supports 1 or 2 avatars");
                return;
            }
            int size2 = immutableList.size();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (size2 == 1) {
                gapComposer2.startReplaceGroup(922152339);
                TextViewKt.Avatar(AvatarSize.Size64, (AvatarEntry) immutableList.get(0), IndicationKt.indication(companion, mutableInteractionSourceImpl, RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer2, 48, 13)), false, gapComposer2, 6, 24);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            } else {
                gapComposer2.startReplaceGroup(922423527);
                AudioConfigUtil.DiagonalStackedAvatars(DiagonalAvatarValues.Size64, (AvatarEntry) immutableList.get(0), (AvatarEntry) immutableList.get(1), IndicationKt.indication(companion, mutableInteractionSourceImpl, RippleKt.m3400rippleYJYuY3k(0L, false, RecyclerView.DECELERATION_RATE, null, gapComposer2, 48, 13)), gapComposer2, 6, 0);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            }
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(mutableInteractionSourceImpl, immutableList, i, i3);
        }
    }

    public static final void TextFieldView(ComposePlatform.TextField textField, ResolvedStyle resolvedStyle, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        TextFieldColors m559copyejIjP34;
        textField.getClass();
        modifier.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1278771214);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(textField) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(resolvedStyle) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ExpressionEvaluator expressionEvaluator = (ExpressionEvaluator) gapComposer2.consume(GenieCompositionLocalsKt.LocalGenieExpressionEvaluator);
            GenieViewState genieViewState = (GenieViewState) gapComposer2.consume(GenieCompositionLocalsKt.LocalGenieViewState);
            String evalString = EvalHelpersKt.evalString(expressionEvaluator, textField.label, genieViewState, "");
            String evalString2 = EvalHelpersKt.evalString(expressionEvaluator, genieViewState, textField.placeholder);
            ComposableLambdaImpl composableLambdaImpl = null;
            GenieStateBinding rememberStringBinding = StateBindingsKt.rememberStringBinding(textField.binding, null, gapComposer2, 2);
            Color color = resolvedStyle.contentColor;
            if (color == null) {
                gapComposer2.startReplaceGroup(-485960727);
                gapComposer2.end(false);
                m559copyejIjP34 = null;
            } else {
                gapComposer2.startReplaceGroup(-485960726);
                long j = color.value;
                long j2 = Color.Unspecified;
                m559copyejIjP34 = OutlinedTextFieldDefaults.getDefaultOutlinedTextFieldColors((ColorScheme) gapComposer2.consume(ColorSchemeKt.LocalColorScheme), gapComposer2).m559copyejIjP34(j, j, j2, j2, j2, j2, j2, j2, j2, j2, null, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j, j, j2, j2, j, j, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2, j2);
                gapComposer2.end(false);
            }
            if (m559copyejIjP34 == null) {
                gapComposer2.startReplaceGroup(538522390);
                m559copyejIjP34 = OutlinedTextFieldDefaults.colors(gapComposer2, 6);
            } else {
                gapComposer2.startReplaceGroup(538512594);
            }
            gapComposer2.end(false);
            TextFieldColors textFieldColors = m559copyejIjP34;
            String str = (String) rememberStringBinding.getValue();
            if (evalString2 == null) {
                gapComposer2.startReplaceGroup(-485515009);
            } else {
                gapComposer2.startReplaceGroup(-485515008);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(1161280471, new PoolCreateViewKt$$ExternalSyntheticLambda5(evalString2, 11), gapComposer2);
            }
            gapComposer2.end(false);
            TextStyle textStyle = resolvedStyle.textStyle;
            if (textStyle == null) {
                gapComposer2.startReplaceGroup(538529845);
                textStyle = (TextStyle) gapComposer2.consume(TextKt.LocalTextStyle);
            } else {
                gapComposer2.startReplaceGroup(538528791);
            }
            gapComposer2.end(false);
            boolean changedInstance = gapComposer2.changedInstance(rememberStringBinding);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SliderViewKt$$ExternalSyntheticLambda0(rememberStringBinding, 2);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            MenuKt.OutlinedTextField(str, (Function1) rememberedValue, modifier, false, false, textStyle, Expect_jvmKt.rememberComposableLambda(-451676364, new PoolCreateViewKt$$ExternalSyntheticLambda5(evalString, 12), gapComposer2), composableLambdaImpl, null, null, null, 0, 0, null, textFieldColors, gapComposer, (i2 & 896) | 1572864, 4194072);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda8(textField, resolvedStyle, modifier, i, 9);
        }
    }

    public static String byteBufferToHex(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return "null";
        }
        int position = byteBuffer.position();
        try {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.get(bArr);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < remaining; i++) {
                sb.append(String.format("%02X ", Byte.valueOf(bArr[i])));
            }
            return sb.toString().trim();
        } finally {
            byteBuffer.position(position);
        }
    }

    public static String readableUs(long j) {
        long j2 = j / 1000;
        long j3 = j2 / 3600000;
        TimeUnit timeUnit = TimeUnit.HOURS;
        long millis = (j2 - timeUnit.toMillis(j3)) / 60000;
        long millis2 = j2 - timeUnit.toMillis(j3);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        long millis3 = (millis2 - timeUnit2.toMillis(millis)) / 1000;
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(j3), Long.valueOf(millis), Long.valueOf(millis3), Long.valueOf(((j2 - timeUnit.toMillis(j3)) - timeUnit2.toMillis(millis)) - TimeUnit.SECONDS.toMillis(millis3)));
    }
}
