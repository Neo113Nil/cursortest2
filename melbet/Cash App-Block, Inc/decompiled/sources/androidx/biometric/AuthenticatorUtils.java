package androidx.biometric;

import android.os.Build;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.limits.viewmodels.LimitsMessageViewModel;
import com.squareup.cash.limits.views.arcade.LimitsInlineMessageKt$$ExternalSyntheticLambda0;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.marketing.components.CardUpsellIllustration;
import com.squareup.cash.marketing.components.CardUpsellKt;
import com.squareup.cash.money.booklet.MoneyTabBookletKt$$ExternalSyntheticLambda4;
import com.squareup.cash.money.views.MoneyTabSectionUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.scrubbing.USPhoneNumberVisualTransformer$filter$3;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import net.idrnd.face.iad.capture.internal.p0;
import org.commonmark.internal.BlockContent;
import org.intellij.markdown.parser.sequentialparsers.TokensCache$RangesListIterator;

/* loaded from: classes3.dex */
public abstract class AuthenticatorUtils {
    public static final void LimitsInlineMessage(LimitsMessageViewModel limitsMessageViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1396706003);
        int i2 = 2;
        int i3 = 4;
        int i4 = i | (gapComposer.changedInstance(limitsMessageViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        int i5 = 0;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            ComposableLambdaImpl composableLambdaImpl = null;
            if (limitsMessageViewModel instanceof LimitsMessageViewModel.InlineMessage) {
                gapComposer.startReplaceGroup(-374366168);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1499856585, new LimitsInlineMessageKt$$ExternalSyntheticLambda0(limitsMessageViewModel, i5), gapComposer);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1763553610, new LimitsInlineMessageKt$$ExternalSyntheticLambda0(limitsMessageViewModel, i2), gapComposer);
                ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(705737853, new MoneyTabBookletKt$$ExternalSyntheticLambda4(24, function1, limitsMessageViewModel), gapComposer);
                gapComposer.startReplaceGroup(-374048543);
                gapComposer.end(false);
                gapComposer.startReplaceGroup(-373865953);
                gapComposer.end(false);
                ModalKt.InlineMessage(modifier, rememberComposableLambda, rememberComposableLambda2, rememberComposableLambda3, (Function3) null, (Function3) null, gapComposer, ((i4 >> 6) & 14) | 3504, 0);
                gapComposer.end(false);
            } else if (limitsMessageViewModel instanceof LimitsMessageViewModel.CardUpsell) {
                gapComposer.startReplaceGroup(-372636616);
                LimitsMessageViewModel.CardUpsell cardUpsell = (LimitsMessageViewModel.CardUpsell) limitsMessageViewModel;
                String str = cardUpsell.descriptionText;
                if (str == null) {
                    gapComposer.startReplaceGroup(-372548422);
                } else {
                    gapComposer.startReplaceGroup(-372548421);
                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-957080623, new PoolCreateViewKt$$ExternalSyntheticLambda5(str, 7), gapComposer);
                }
                gapComposer.end(false);
                CardUpsellIllustration cardUpsellIllustration = cardUpsell.illustration;
                ComposableLambdaImpl rememberComposableLambda4 = Expect_jvmKt.rememberComposableLambda(-75982925, new CashMapViewKt$$ExternalSyntheticLambda5(limitsMessageViewModel, 13), gapComposer);
                ComposableLambdaImpl rememberComposableLambda5 = Expect_jvmKt.rememberComposableLambda(363457884, new LimitsInlineMessageKt$$ExternalSyntheticLambda0(limitsMessageViewModel, 3), gapComposer);
                boolean z = (i4 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new CashMapViewKt$$ExternalSyntheticLambda4(i3, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                CardUpsellKt.CardUpsellSmall(rememberComposableLambda4, rememberComposableLambda5, (Function0) rememberedValue, modifier, composableLambdaImpl, cardUpsellIllustration, gapComposer, ((i4 << 3) & 7168) | 54, 0);
                gapComposer.end(false);
            } else {
                if (!limitsMessageViewModel.equals(LimitsMessageViewModel.None.INSTANCE)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -2090287797, false);
                }
                gapComposer.startReplaceGroup(-372295306);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(i, 19, modifier, limitsMessageViewModel, function1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        if (((1676673024 >> java.lang.Character.getType(r8)) & 1) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0070, code lost:
    
        if (((1676673024 >> java.lang.Character.getType(r7)) & 1) == 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair canOpenClose(p0 p0Var, BlockContent blockContent, BlockContent blockContent2, boolean z) {
        boolean z2;
        blockContent.getClass();
        blockContent2.getClass();
        boolean z3 = true;
        boolean z4 = !isWhitespace(blockContent2, 1) && (!isPunctuation(blockContent2, 1) || isWhitespace(blockContent, -1) || isPunctuation(blockContent, -1));
        boolean z5 = (blockContent.charLookup(-1) == ((p0) blockContent.sb).getRawCharAt(blockContent.info(0).tokenStart) || isWhitespace(blockContent, -1) || (isPunctuation(blockContent, -1) && !isWhitespace(blockContent2, 1) && !isPunctuation(blockContent2, 1))) ? false : true;
        if (z) {
            z2 = z4;
        } else {
            if (z4) {
                if (z5) {
                    char charLookup = blockContent.charLookup(-1);
                    if (!StringsKt.contains((CharSequence) "$^`", charLookup, false)) {
                    }
                }
                z2 = true;
            }
            z2 = false;
        }
        if (z) {
            z3 = z5;
        } else {
            if (z5) {
                if (z4) {
                    char charLookup2 = blockContent2.charLookup(1);
                    if (!StringsKt.contains((CharSequence) "$^`", charLookup2, false)) {
                    }
                }
            }
            z3 = false;
        }
        return new Pair(Boolean.valueOf(z2), Boolean.valueOf(z3));
    }

    public static boolean isDeviceCredentialAllowed(int i) {
        return (i & 32768) != 0;
    }

    public static boolean isPunctuation(BlockContent blockContent, int i) {
        blockContent.getClass();
        char charLookup = blockContent.charLookup(i);
        return StringsKt.contains((CharSequence) "$^`", charLookup, false) || ((1676673024 >> Character.getType(charLookup)) & 1) != 0;
    }

    public static boolean isSupportedCombination(int i) {
        if (i == 15 || i == 255) {
            return true;
        }
        return i != 32768 ? i != 32783 ? i == 33023 || i == 0 : Build.VERSION.SDK_INT > 29 : Build.VERSION.SDK_INT >= 30;
    }

    public static boolean isWeakBiometricAllowed(int i) {
        return (i & 255) == 255;
    }

    public static boolean isWhitespace(BlockContent blockContent, int i) {
        blockContent.getClass();
        char charLookup = blockContent.charLookup(i);
        return charLookup == 0 || Character.isSpaceChar(charLookup) || CharsKt.isWhitespace(charLookup);
    }

    public abstract void process(p0 p0Var, TokensCache$RangesListIterator tokensCache$RangesListIterator, ArrayList arrayList, USPhoneNumberVisualTransformer$filter$3 uSPhoneNumberVisualTransformer$filter$3);

    public abstract int scan(p0 p0Var, BlockContent blockContent, ArrayList arrayList);
}
