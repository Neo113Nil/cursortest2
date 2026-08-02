package androidx.core.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.RippleKt;
import androidx.compose.material.RippleNodeFactory;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.molecule.PlatformKt;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda0;
import com.squareup.util.cash.Countries;
import com.stripe.android.uicore.elements.FormLabelKt$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class ContextCompat$Api26Impl {
    public static final void EmojiTextView(int i, int i2, Composer composer, Modifier modifier, String str) {
        String str2 = str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-43609074);
        int i3 = (gapComposer.changed(modifier) ? 4 : 2) | i2 | (gapComposer.changed(str2) ? 32 : 16) | (gapComposer.changed(i) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, (i3 >> 3) & 14, 0, 4088, 0L, (Composer) gapComposer, AlphaKt.alpha(modifier, ((Number) AnimateAsStateKt.animateFloatAsState(1.0f, AnimatableKt.tween$default(0, i, null, 5), "", null, gapComposer, 3078, 20).getValue()).floatValue()), TextStyle.m994copyp1EtxEg$default(MooncakeTheme.getCurrentTextStyle(gapComposer, 0), 0L, ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo238toSp0xMU5do(32.0f), null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213), (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            str2 = str;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormLabelKt$$ExternalSyntheticLambda0(modifier, str2, i, i2);
        }
    }

    public static final void MessageReactionBar(int i, Composer composer, Modifier modifier, List list, Function0 function0, Function1 function1) {
        Modifier modifier2;
        function1.getClass();
        function0.getClass();
        list.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1979841912);
        int i2 = i | (gapComposer.changedInstance(function1) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16) | MLKEMEngine.KyberPolyBytes | (gapComposer.changedInstance(list) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SpacerKt.m300paddingVpY3zN4$default(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 64.0f), 32.0f, RecyclerView.DECELERATION_RATE, 2), MooncakeTheme.getColors(gapComposer).elevatedBackground, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f));
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceEvenly, Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            Function0 function02 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function02);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-679555596);
            Iterator it = CollectionsKt.take(list, 4).iterator();
            int i3 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                Object obj = Composer.Companion.Empty;
                if (hasNext) {
                    Object next = it.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    String str = (String) next;
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == obj) {
                        rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                    RippleNodeFactory m500rippleH2RKhps$default = RippleKt.m500rippleH2RKhps$default(RecyclerView.DECELERATION_RATE, 6, 0L, false);
                    boolean changed = ((i2 & 14) == 4) | gapComposer.changed(str);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed || rememberedValue2 == obj) {
                        rememberedValue2 = new P2PListViewKt$$ExternalSyntheticLambda13(function1, str, 21);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    EmojiTextView(i3 * 100, 0, gapComposer, ImageKt.m182clickableO2vRcR0$default(companion, mutableInteractionSourceImpl, m500rippleH2RKhps$default, false, null, null, (Function0) rememberedValue2, 28), str);
                    i3 = i4;
                } else {
                    gapComposer.end(false);
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 32.0f);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (rememberedValue3 == obj) {
                        rememberedValue3 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) rememberedValue3;
                    RippleNodeFactory m500rippleH2RKhps$default2 = RippleKt.m500rippleH2RKhps$default(RecyclerView.DECELERATION_RATE, 6, 0L, false);
                    boolean z = (i2 & 112) == 32;
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (z || rememberedValue4 == obj) {
                        rememberedValue4 = new ToViewKt$$ExternalSyntheticLambda2(24, function0);
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(m285size3ABfNKs, mutableInteractionSourceImpl2, m500rippleH2RKhps$default2, false, null, null, (Function0) rememberedValue4, 28);
                    Painter painterResource = Countries.painterResource(R.drawable.ellipsis, 0, gapComposer);
                    String stringResource = Room.stringResource(gapComposer, R.string.more_button_content_description);
                    long j = MooncakeTheme.getColors(gapComposer).secondaryIcon;
                    ImageKt.Image(painterResource, stringResource, m182clickableO2vRcR0$default, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable, 56);
                    gapComposer.end(true);
                    modifier2 = companion;
                }
            }
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolGoalMetKt$$ExternalSyntheticLambda0(function1, function0, modifier2, list, i);
        }
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewGroups.deepLinkSpecs;
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, int i) {
        if ((i & 4) == 0 || str != null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, null, 0);
        }
        String str2 = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (PermissionChecker.checkSelfPermission(context, str2) != 0) {
            str2 = context.getOpPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            if (PermissionChecker.checkSelfPermission(context, str2) != 0) {
                OptionalProvider$$ExternalSyntheticLambda0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Permission ", str2, " is required by your application to receive broadcasts, please add it to your manifest"));
                return null;
            }
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str2, null);
    }
}
