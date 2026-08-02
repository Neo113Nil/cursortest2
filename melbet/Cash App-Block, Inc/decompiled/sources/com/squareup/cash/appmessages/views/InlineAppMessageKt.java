package com.squareup.cash.appmessages.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda6;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.UtilsKt$$ExternalSyntheticLambda1;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.squareup.cash.appmessages.Actions$One;
import com.squareup.cash.appmessages.Actions$Two;
import com.squareup.cash.appmessages.AppMessageImage;
import com.squareup.cash.appmessages.AppMessageImage$Animated$Asset$Url;
import com.squareup.cash.appmessages.InlineAppMessageViewModel;
import com.squareup.cash.arcade.components.InlineMessageButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import utils.StringUtilsKt;

/* loaded from: classes5.dex */
public abstract class InlineAppMessageKt {
    public static final void ImageHeader(ColumnScope columnScope, String str, AppMessageImage appMessageImage, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Modifier fillMaxWidth;
        Modifier.Companion companion;
        boolean z;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2037891228);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(columnScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(appMessageImage) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z2 = appMessageImage instanceof AppMessageImage.Animated.Fill;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (z2 || (appMessageImage instanceof AppMessageImage.Static.Fill)) {
                fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            } else if (appMessageImage instanceof AppMessageImage.Animated.Fixed) {
                AppMessageImage.Animated.Fixed fixed = (AppMessageImage.Animated.Fixed) appMessageImage;
                fillMaxWidth = SizeKt.m287sizeVpY3zN4(companion2, fixed.width, fixed.height);
            } else if (appMessageImage instanceof AppMessageImage.Static.Fixed) {
                AppMessageImage.Static.Fixed fixed2 = (AppMessageImage.Static.Fixed) appMessageImage;
                fillMaxWidth = SizeKt.m287sizeVpY3zN4(companion2, fixed2.width, fixed2.height);
            } else {
                if (!(appMessageImage instanceof AppMessageImage.Animated.Inset) && !(appMessageImage instanceof AppMessageImage.Static.Inset)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(companion2, 16.0f, 24.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8), 1.0f);
            }
            boolean z3 = appMessageImage instanceof AppMessageImage.Animated;
            ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1 = ContentScale.Companion.FillWidth;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z3) {
                gapComposer.startReplaceGroup(1455654172);
                AppMessageImage$Animated$Asset$Url image = ((AppMessageImage.Animated) appMessageImage).getImage();
                if (!(image instanceof AppMessageImage$Animated$Asset$Url)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -91590695, false);
                }
                gapComposer.startReplaceGroup(1455803499);
                String urlForTheme = ThemablesKt.urlForTheme(image.asset, gapComposer);
                boolean changed = gapComposer.changed(image) | gapComposer.changed(urlForTheme);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = LottieCompositionSpec.Url.m1531boximpl(LottieCompositionSpec.Url.m1532constructorimpl(urlForTheme));
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                String m1537unboximpl = ((LottieCompositionSpec.Url) rememberedValue).m1537unboximpl();
                gapComposer.end(false);
                LottieCompositionSpec.Url m1531boximpl = LottieCompositionSpec.Url.m1531boximpl(m1537unboximpl);
                int i4 = i3 & 7168;
                boolean z4 = i4 == 2048;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z4 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new InlineAppMessageKt$ImageHeader$lottieComposition$2$1(function1, null, 0);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Modifier modifier3 = fillMaxWidth;
                LottieCompositionResult rememberLottieComposition = RememberLottieCompositionKt.rememberLottieComposition(m1531boximpl, null, null, null, null, (Function3) rememberedValue2, gapComposer, 0, 30);
                if (((LottieComposition) rememberLottieComposition.getValue()) != null) {
                    gapComposer.startReplaceGroup(1456217225);
                    LottieComposition lottieComposition = (LottieComposition) rememberLottieComposition.getValue();
                    boolean z5 = (i4 == 2048) | ((i3 & 112) == 32);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (z5 || rememberedValue3 == neverEqualPolicy) {
                        z = false;
                        rememberedValue3 = new InlineAppMessageKt$ImageHeader$1$1(function1, str, null, 0);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    } else {
                        z = false;
                    }
                    Updater.LaunchedEffect(gapComposer, lottieComposition, (Function2) rememberedValue3);
                    gapComposer.end(z);
                } else {
                    gapComposer.startReplaceGroup(1456337350);
                    gapComposer.end(false);
                }
                companion = companion2;
                LottieAnimationKt.LottieAnimation((LottieComposition) rememberLottieComposition.getValue(), columnScope.align(companion, horizontal).then(modifier3), false, false, null, RecyclerView.DECELERATION_RATE, Integer.MAX_VALUE, false, false, false, false, null, false, false, null, null, contentScale$Companion$Fit$1, false, false, null, false, null, gapComposer, 1572864, 1572864, 0, 4128700);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                companion = companion2;
                Modifier modifier4 = fillMaxWidth;
                gapComposer.startReplaceGroup(1456621093);
                if (!(appMessageImage instanceof AppMessageImage.Static)) {
                    if (!z3) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -91559082, false);
                    }
                    gapComposer.startReplaceGroup(-91542567);
                    gapComposer.end(false);
                    Path$$ExternalSyntheticBUOutline0.m();
                    return;
                }
                gapComposer.startReplaceGroup(1456751603);
                String urlForTheme2 = ThemablesKt.urlForTheme(((AppMessageImage.Static) appMessageImage).getImage(), gapComposer);
                int i5 = i3 & 7168;
                boolean z6 = ((i3 & 112) == 32) | (i5 == 2048);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (z6 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new InlineAppMessageKt$$ExternalSyntheticLambda15(function1, str, 0);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                Function1 function12 = (Function1) rememberedValue4;
                boolean z7 = i5 == 2048;
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (z7 || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new UtilsKt$$ExternalSyntheticLambda1(29, function1);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                AsyncImagePainter m1450rememberAsyncImagePainterMqRF_0 = AsyncImageKt.m1450rememberAsyncImagePainterMqRF_0(urlForTheme2, null, function12, (Function1) rememberedValue5, gapComposer, 0, 414);
                gapComposer.end(false);
                ImageKt.Image(m1450rememberAsyncImagePainterMqRF_0, null, columnScope.align(companion, horizontal).then(modifier4), null, contentScale$Companion$Fit$1, RecyclerView.DECELERATION_RATE, null, gapComposer, Painter.$stable | 24624, 104);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(columnScope, str, appMessageImage, function1, modifier2, i, 11);
        }
    }

    public static final void InlineAppMessage(final InlineAppMessageViewModel.Ready ready, final Function1 function1, Modifier modifier, Composer composer, int i) {
        ComposableLambdaImpl rememberComposableLambda;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-303454484);
        final int i2 = 2;
        int i3 = i | (gapComposer.changedInstance(ready) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        final int i4 = 0;
        final int i5 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            AppMessageImage appMessageImage = ready.image;
            if (appMessageImage == null) {
                gapComposer.startReplaceGroup(693880615);
                gapComposer.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer.startReplaceGroup(693880616);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-596577213, new LocalViewFactory$$ExternalSyntheticLambda6(28, ready, appMessageImage, function1), gapComposer);
                gapComposer.end(false);
            }
            ComposableLambdaImpl composableLambdaImpl = rememberComposableLambda;
            final StringUtilsKt stringUtilsKt = ready.actions;
            if (stringUtilsKt instanceof Actions$One) {
                gapComposer.startReplaceGroup(438032238);
                ModalKt.InlineMessage(modifier, Expect_jvmKt.rememberComposableLambda(911022646, new Function3() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i6 = i4;
                        InlineAppMessageViewModel.Ready ready2 = ready;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((ColumnScope) obj).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    String str = ready2.title;
                                    if (str == null) {
                                        gapComposer2.startReplaceGroup(377338779);
                                    } else {
                                        gapComposer2.startReplaceGroup(377338780);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((ColumnScope) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    String str2 = ready2.subtitle;
                                    if (str2 == null) {
                                        gapComposer3.startReplaceGroup(1100647161);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(1100647162);
                                        Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 2814, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, new TextLineBalancing(1), str2, (Map) null, (Function1) null, false);
                                        gapComposer3.end(false);
                                    }
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            case 2:
                                Composer composer4 = (Composer) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                ((ColumnScope) obj).getClass();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    String str3 = ready2.title;
                                    if (str3 == null) {
                                        gapComposer4.startReplaceGroup(-1688083886);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1688083885);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer5 = (Composer) obj2;
                                int intValue4 = ((Integer) obj3).intValue();
                                ((ColumnScope) obj).getClass();
                                GapComposer gapComposer5 = (GapComposer) composer5;
                                if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                    String str4 = ready2.subtitle;
                                    if (str4 == null) {
                                        gapComposer5.startReplaceGroup(1904305520);
                                        gapComposer5.end(false);
                                    } else {
                                        gapComposer5.startReplaceGroup(1904305521);
                                        Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 2814, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, new TextLineBalancing(1), str4, (Map) null, (Function1) null, false);
                                        gapComposer5.end(false);
                                    }
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), Expect_jvmKt.rememberComposableLambda(778698901, new Function3() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i6 = i5;
                        InlineAppMessageViewModel.Ready ready2 = ready;
                        switch (i6) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((ColumnScope) obj).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    String str = ready2.title;
                                    if (str == null) {
                                        gapComposer2.startReplaceGroup(377338779);
                                    } else {
                                        gapComposer2.startReplaceGroup(377338780);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((ColumnScope) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    String str2 = ready2.subtitle;
                                    if (str2 == null) {
                                        gapComposer3.startReplaceGroup(1100647161);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(1100647162);
                                        Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 2814, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, new TextLineBalancing(1), str2, (Map) null, (Function1) null, false);
                                        gapComposer3.end(false);
                                    }
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            case 2:
                                Composer composer4 = (Composer) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                ((ColumnScope) obj).getClass();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    String str3 = ready2.title;
                                    if (str3 == null) {
                                        gapComposer4.startReplaceGroup(-1688083886);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1688083885);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer5 = (Composer) obj2;
                                int intValue4 = ((Integer) obj3).intValue();
                                ((ColumnScope) obj).getClass();
                                GapComposer gapComposer5 = (GapComposer) composer5;
                                if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                    String str4 = ready2.subtitle;
                                    if (str4 == null) {
                                        gapComposer5.startReplaceGroup(1904305520);
                                        gapComposer5.end(false);
                                    } else {
                                        gapComposer5.startReplaceGroup(1904305521);
                                        Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 2814, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, new TextLineBalancing(1), str4, (Map) null, (Function1) null, false);
                                        gapComposer5.end(false);
                                    }
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), Expect_jvmKt.rememberComposableLambda(-253591038, new Function3() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i6 = i4;
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        final StringUtilsKt stringUtilsKt2 = stringUtilsKt;
                        final Function1 function12 = function1;
                        final int i7 = 2;
                        char c = 1;
                        char c2 = 1;
                        switch (i6) {
                            case 0:
                                InlineMessageButtonScope inlineMessageButtonScope = (InlineMessageButtonScope) obj;
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                inlineMessageButtonScope.getClass();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((GapComposer) composer2).changed(inlineMessageButtonScope) ? 4 : 2;
                                }
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                    boolean changed = gapComposer2.changed(function12) | gapComposer2.changedInstance(stringUtilsKt2);
                                    Object rememberedValue = gapComposer2.rememberedValue();
                                    if (changed || rememberedValue == neverEqualPolicy) {
                                        final char c3 = c == true ? 1 : 0;
                                        rememberedValue = new Function0() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda9
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i8 = c3;
                                                StringUtilsKt stringUtilsKt3 = stringUtilsKt2;
                                                Function1 function13 = function12;
                                                switch (i8) {
                                                    case 0:
                                                        function13.invoke(((Actions$Two) stringUtilsKt3).secondary.eventToTrigger);
                                                        break;
                                                    case 1:
                                                        function13.invoke(((Actions$One) stringUtilsKt3).action.eventToTrigger);
                                                        break;
                                                    default:
                                                        function13.invoke(((Actions$Two) stringUtilsKt3).primary.eventToTrigger);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        gapComposer2.updateRememberedValue(rememberedValue);
                                    }
                                    final char c4 = c2 == true ? 1 : 0;
                                    inlineMessageButtonScope.PrimaryButton(((intValue << 12) & 57344) | 3072, 6, gapComposer2, Expect_jvmKt.rememberComposableLambda(573015072, new Function3() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            int i8 = c4;
                                            StringUtilsKt stringUtilsKt3 = stringUtilsKt2;
                                            switch (i8) {
                                                case 0:
                                                    Composer composer3 = (Composer) obj5;
                                                    int intValue2 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                                    if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$Two) stringUtilsKt3).secondary.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer3.skipToGroupEnd();
                                                    }
                                                    break;
                                                case 1:
                                                    Composer composer4 = (Composer) obj5;
                                                    int intValue3 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$One) stringUtilsKt3).action.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer4.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer5 = (Composer) obj5;
                                                    int intValue4 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$Two) stringUtilsKt3).primary.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer5.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer2), null, (Function0) rememberedValue, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                InlineMessageButtonScope inlineMessageButtonScope2 = (InlineMessageButtonScope) obj;
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                inlineMessageButtonScope2.getClass();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((GapComposer) composer3).changed(inlineMessageButtonScope2) ? 4 : 2;
                                }
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    boolean changed2 = gapComposer3.changed(function12) | gapComposer3.changedInstance(stringUtilsKt2);
                                    Object rememberedValue2 = gapComposer3.rememberedValue();
                                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                        rememberedValue2 = new Function0() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda9
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i8 = i7;
                                                StringUtilsKt stringUtilsKt3 = stringUtilsKt2;
                                                Function1 function13 = function12;
                                                switch (i8) {
                                                    case 0:
                                                        function13.invoke(((Actions$Two) stringUtilsKt3).secondary.eventToTrigger);
                                                        break;
                                                    case 1:
                                                        function13.invoke(((Actions$One) stringUtilsKt3).action.eventToTrigger);
                                                        break;
                                                    default:
                                                        function13.invoke(((Actions$Two) stringUtilsKt3).primary.eventToTrigger);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        gapComposer3.updateRememberedValue(rememberedValue2);
                                    }
                                    inlineMessageButtonScope2.PrimaryButton(((intValue2 << 12) & 57344) | 3072, 6, gapComposer3, Expect_jvmKt.rememberComposableLambda(-1006772663, new Function3() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            int i8 = i7;
                                            StringUtilsKt stringUtilsKt3 = stringUtilsKt2;
                                            switch (i8) {
                                                case 0:
                                                    Composer composer32 = (Composer) obj5;
                                                    int intValue22 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer32 = (GapComposer) composer32;
                                                    if (gapComposer32.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$Two) stringUtilsKt3).secondary.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer32.skipToGroupEnd();
                                                    }
                                                    break;
                                                case 1:
                                                    Composer composer4 = (Composer) obj5;
                                                    int intValue3 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                                    if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$One) stringUtilsKt3).action.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer4.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer5 = (Composer) obj5;
                                                    int intValue4 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$Two) stringUtilsKt3).primary.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer5.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer3), null, (Function0) rememberedValue2, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                InlineMessageButtonScope inlineMessageButtonScope3 = (InlineMessageButtonScope) obj;
                                Composer composer4 = (Composer) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                inlineMessageButtonScope3.getClass();
                                if ((intValue3 & 6) == 0) {
                                    intValue3 |= ((GapComposer) composer4).changed(inlineMessageButtonScope3) ? 4 : 2;
                                }
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                                    boolean changed3 = gapComposer4.changed(function12) | gapComposer4.changedInstance(stringUtilsKt2);
                                    Object rememberedValue3 = gapComposer4.rememberedValue();
                                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                                        final int i8 = r7 ? 1 : 0;
                                        rememberedValue3 = new Function0() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda9
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i82 = i8;
                                                StringUtilsKt stringUtilsKt3 = stringUtilsKt2;
                                                Function1 function13 = function12;
                                                switch (i82) {
                                                    case 0:
                                                        function13.invoke(((Actions$Two) stringUtilsKt3).secondary.eventToTrigger);
                                                        break;
                                                    case 1:
                                                        function13.invoke(((Actions$One) stringUtilsKt3).action.eventToTrigger);
                                                        break;
                                                    default:
                                                        function13.invoke(((Actions$Two) stringUtilsKt3).primary.eventToTrigger);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        gapComposer4.updateRememberedValue(rememberedValue3);
                                    }
                                    final int i9 = r7 ? 1 : 0;
                                    inlineMessageButtonScope3.SecondaryButton(((intValue3 << 12) & 57344) | 3072, gapComposer4, Expect_jvmKt.rememberComposableLambda(2081281562, new Function3() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            int i82 = i9;
                                            StringUtilsKt stringUtilsKt3 = stringUtilsKt2;
                                            switch (i82) {
                                                case 0:
                                                    Composer composer32 = (Composer) obj5;
                                                    int intValue22 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer32 = (GapComposer) composer32;
                                                    if (gapComposer32.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$Two) stringUtilsKt3).secondary.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer32.skipToGroupEnd();
                                                    }
                                                    break;
                                                case 1:
                                                    Composer composer42 = (Composer) obj5;
                                                    int intValue32 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer42 = (GapComposer) composer42;
                                                    if (gapComposer42.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$One) stringUtilsKt3).action.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer42.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer5 = (Composer) obj5;
                                                    int intValue4 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$Two) stringUtilsKt3).primary.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer5.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer4), null, (Function0) rememberedValue3, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), (Function3) null, composableLambdaImpl, gapComposer, ((i3 >> 6) & 14) | 3504, 16);
                gapComposer.end(false);
            } else {
                if (!(stringUtilsKt instanceof Actions$Two)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 438030249, false);
                }
                gapComposer.startReplaceGroup(438051883);
                final int i6 = 3;
                ModalKt.InlineMessage(modifier, Expect_jvmKt.rememberComposableLambda(1695958751, new Function3() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i62 = i2;
                        InlineAppMessageViewModel.Ready ready2 = ready;
                        switch (i62) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((ColumnScope) obj).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    String str = ready2.title;
                                    if (str == null) {
                                        gapComposer2.startReplaceGroup(377338779);
                                    } else {
                                        gapComposer2.startReplaceGroup(377338780);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((ColumnScope) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    String str2 = ready2.subtitle;
                                    if (str2 == null) {
                                        gapComposer3.startReplaceGroup(1100647161);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(1100647162);
                                        Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 2814, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, new TextLineBalancing(1), str2, (Map) null, (Function1) null, false);
                                        gapComposer3.end(false);
                                    }
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            case 2:
                                Composer composer4 = (Composer) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                ((ColumnScope) obj).getClass();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    String str3 = ready2.title;
                                    if (str3 == null) {
                                        gapComposer4.startReplaceGroup(-1688083886);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1688083885);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer5 = (Composer) obj2;
                                int intValue4 = ((Integer) obj3).intValue();
                                ((ColumnScope) obj).getClass();
                                GapComposer gapComposer5 = (GapComposer) composer5;
                                if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                    String str4 = ready2.subtitle;
                                    if (str4 == null) {
                                        gapComposer5.startReplaceGroup(1904305520);
                                        gapComposer5.end(false);
                                    } else {
                                        gapComposer5.startReplaceGroup(1904305521);
                                        Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 2814, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, new TextLineBalancing(1), str4, (Map) null, (Function1) null, false);
                                        gapComposer5.end(false);
                                    }
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), Expect_jvmKt.rememberComposableLambda(-913108610, new Function3() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i62 = i6;
                        InlineAppMessageViewModel.Ready ready2 = ready;
                        switch (i62) {
                            case 0:
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                ((ColumnScope) obj).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    String str = ready2.title;
                                    if (str == null) {
                                        gapComposer2.startReplaceGroup(377338779);
                                    } else {
                                        gapComposer2.startReplaceGroup(377338780);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer2.end(false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                ((ColumnScope) obj).getClass();
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    String str2 = ready2.subtitle;
                                    if (str2 == null) {
                                        gapComposer3.startReplaceGroup(1100647161);
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.startReplaceGroup(1100647162);
                                        Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 2814, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, new TextLineBalancing(1), str2, (Map) null, (Function1) null, false);
                                        gapComposer3.end(false);
                                    }
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            case 2:
                                Composer composer4 = (Composer) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                ((ColumnScope) obj).getClass();
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    String str3 = ready2.title;
                                    if (str3 == null) {
                                        gapComposer4.startReplaceGroup(-1688083886);
                                    } else {
                                        gapComposer4.startReplaceGroup(-1688083885);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer5 = (Composer) obj2;
                                int intValue4 = ((Integer) obj3).intValue();
                                ((ColumnScope) obj).getClass();
                                GapComposer gapComposer5 = (GapComposer) composer5;
                                if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                    String str4 = ready2.subtitle;
                                    if (str4 == null) {
                                        gapComposer5.startReplaceGroup(1904305520);
                                        gapComposer5.end(false);
                                    } else {
                                        gapComposer5.startReplaceGroup(1904305521);
                                        Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 2814, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, new TextLineBalancing(1), str4, (Map) null, (Function1) null, false);
                                        gapComposer5.end(false);
                                    }
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), Expect_jvmKt.rememberComposableLambda(-806294613, new Function3() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i62 = i5;
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        final StringUtilsKt stringUtilsKt2 = stringUtilsKt;
                        final Function1 function12 = function1;
                        final int i7 = 2;
                        char c = 1;
                        char c2 = 1;
                        switch (i62) {
                            case 0:
                                InlineMessageButtonScope inlineMessageButtonScope = (InlineMessageButtonScope) obj;
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                inlineMessageButtonScope.getClass();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((GapComposer) composer2).changed(inlineMessageButtonScope) ? 4 : 2;
                                }
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                    boolean changed = gapComposer2.changed(function12) | gapComposer2.changedInstance(stringUtilsKt2);
                                    Object rememberedValue = gapComposer2.rememberedValue();
                                    if (changed || rememberedValue == neverEqualPolicy) {
                                        final int c3 = c == true ? 1 : 0;
                                        rememberedValue = new Function0() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda9
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i82 = c3;
                                                StringUtilsKt stringUtilsKt3 = stringUtilsKt2;
                                                Function1 function13 = function12;
                                                switch (i82) {
                                                    case 0:
                                                        function13.invoke(((Actions$Two) stringUtilsKt3).secondary.eventToTrigger);
                                                        break;
                                                    case 1:
                                                        function13.invoke(((Actions$One) stringUtilsKt3).action.eventToTrigger);
                                                        break;
                                                    default:
                                                        function13.invoke(((Actions$Two) stringUtilsKt3).primary.eventToTrigger);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        gapComposer2.updateRememberedValue(rememberedValue);
                                    }
                                    final int c4 = c2 == true ? 1 : 0;
                                    inlineMessageButtonScope.PrimaryButton(((intValue << 12) & 57344) | 3072, 6, gapComposer2, Expect_jvmKt.rememberComposableLambda(573015072, new Function3() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            int i82 = c4;
                                            StringUtilsKt stringUtilsKt3 = stringUtilsKt2;
                                            switch (i82) {
                                                case 0:
                                                    Composer composer32 = (Composer) obj5;
                                                    int intValue22 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer32 = (GapComposer) composer32;
                                                    if (gapComposer32.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$Two) stringUtilsKt3).secondary.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer32.skipToGroupEnd();
                                                    }
                                                    break;
                                                case 1:
                                                    Composer composer42 = (Composer) obj5;
                                                    int intValue32 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer42 = (GapComposer) composer42;
                                                    if (gapComposer42.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$One) stringUtilsKt3).action.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer42.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer5 = (Composer) obj5;
                                                    int intValue4 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$Two) stringUtilsKt3).primary.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer5.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer2), null, (Function0) rememberedValue, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                InlineMessageButtonScope inlineMessageButtonScope2 = (InlineMessageButtonScope) obj;
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                inlineMessageButtonScope2.getClass();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((GapComposer) composer3).changed(inlineMessageButtonScope2) ? 4 : 2;
                                }
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    boolean changed2 = gapComposer3.changed(function12) | gapComposer3.changedInstance(stringUtilsKt2);
                                    Object rememberedValue2 = gapComposer3.rememberedValue();
                                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                        rememberedValue2 = new Function0() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda9
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i82 = i7;
                                                StringUtilsKt stringUtilsKt3 = stringUtilsKt2;
                                                Function1 function13 = function12;
                                                switch (i82) {
                                                    case 0:
                                                        function13.invoke(((Actions$Two) stringUtilsKt3).secondary.eventToTrigger);
                                                        break;
                                                    case 1:
                                                        function13.invoke(((Actions$One) stringUtilsKt3).action.eventToTrigger);
                                                        break;
                                                    default:
                                                        function13.invoke(((Actions$Two) stringUtilsKt3).primary.eventToTrigger);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        gapComposer3.updateRememberedValue(rememberedValue2);
                                    }
                                    inlineMessageButtonScope2.PrimaryButton(((intValue2 << 12) & 57344) | 3072, 6, gapComposer3, Expect_jvmKt.rememberComposableLambda(-1006772663, new Function3() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            int i82 = i7;
                                            StringUtilsKt stringUtilsKt3 = stringUtilsKt2;
                                            switch (i82) {
                                                case 0:
                                                    Composer composer32 = (Composer) obj5;
                                                    int intValue22 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer32 = (GapComposer) composer32;
                                                    if (gapComposer32.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$Two) stringUtilsKt3).secondary.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer32.skipToGroupEnd();
                                                    }
                                                    break;
                                                case 1:
                                                    Composer composer42 = (Composer) obj5;
                                                    int intValue32 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer42 = (GapComposer) composer42;
                                                    if (gapComposer42.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$One) stringUtilsKt3).action.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer42.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer5 = (Composer) obj5;
                                                    int intValue4 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$Two) stringUtilsKt3).primary.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer5.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer3), null, (Function0) rememberedValue2, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                InlineMessageButtonScope inlineMessageButtonScope3 = (InlineMessageButtonScope) obj;
                                Composer composer4 = (Composer) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                inlineMessageButtonScope3.getClass();
                                if ((intValue3 & 6) == 0) {
                                    intValue3 |= ((GapComposer) composer4).changed(inlineMessageButtonScope3) ? 4 : 2;
                                }
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                                    boolean changed3 = gapComposer4.changed(function12) | gapComposer4.changedInstance(stringUtilsKt2);
                                    Object rememberedValue3 = gapComposer4.rememberedValue();
                                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                                        final int i8 = r7 ? 1 : 0;
                                        rememberedValue3 = new Function0() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda9
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i82 = i8;
                                                StringUtilsKt stringUtilsKt3 = stringUtilsKt2;
                                                Function1 function13 = function12;
                                                switch (i82) {
                                                    case 0:
                                                        function13.invoke(((Actions$Two) stringUtilsKt3).secondary.eventToTrigger);
                                                        break;
                                                    case 1:
                                                        function13.invoke(((Actions$One) stringUtilsKt3).action.eventToTrigger);
                                                        break;
                                                    default:
                                                        function13.invoke(((Actions$Two) stringUtilsKt3).primary.eventToTrigger);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        gapComposer4.updateRememberedValue(rememberedValue3);
                                    }
                                    final int i9 = r7 ? 1 : 0;
                                    inlineMessageButtonScope3.SecondaryButton(((intValue3 << 12) & 57344) | 3072, gapComposer4, Expect_jvmKt.rememberComposableLambda(2081281562, new Function3() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            int i82 = i9;
                                            StringUtilsKt stringUtilsKt3 = stringUtilsKt2;
                                            switch (i82) {
                                                case 0:
                                                    Composer composer32 = (Composer) obj5;
                                                    int intValue22 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer32 = (GapComposer) composer32;
                                                    if (gapComposer32.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$Two) stringUtilsKt3).secondary.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer32.skipToGroupEnd();
                                                    }
                                                    break;
                                                case 1:
                                                    Composer composer42 = (Composer) obj5;
                                                    int intValue32 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer42 = (GapComposer) composer42;
                                                    if (gapComposer42.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$One) stringUtilsKt3).action.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer42.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer5 = (Composer) obj5;
                                                    int intValue4 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$Two) stringUtilsKt3).primary.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer5.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer4), null, (Function0) rememberedValue3, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), Expect_jvmKt.rememberComposableLambda(879605322, new Function3() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i62 = i2;
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        final StringUtilsKt stringUtilsKt2 = stringUtilsKt;
                        final Function1 function12 = function1;
                        final int i7 = 2;
                        char c = 1;
                        char c2 = 1;
                        switch (i62) {
                            case 0:
                                InlineMessageButtonScope inlineMessageButtonScope = (InlineMessageButtonScope) obj;
                                Composer composer2 = (Composer) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                inlineMessageButtonScope.getClass();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((GapComposer) composer2).changed(inlineMessageButtonScope) ? 4 : 2;
                                }
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                    boolean changed = gapComposer2.changed(function12) | gapComposer2.changedInstance(stringUtilsKt2);
                                    Object rememberedValue = gapComposer2.rememberedValue();
                                    if (changed || rememberedValue == neverEqualPolicy) {
                                        final int c3 = c == true ? 1 : 0;
                                        rememberedValue = new Function0() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda9
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i82 = c3;
                                                StringUtilsKt stringUtilsKt3 = stringUtilsKt2;
                                                Function1 function13 = function12;
                                                switch (i82) {
                                                    case 0:
                                                        function13.invoke(((Actions$Two) stringUtilsKt3).secondary.eventToTrigger);
                                                        break;
                                                    case 1:
                                                        function13.invoke(((Actions$One) stringUtilsKt3).action.eventToTrigger);
                                                        break;
                                                    default:
                                                        function13.invoke(((Actions$Two) stringUtilsKt3).primary.eventToTrigger);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        gapComposer2.updateRememberedValue(rememberedValue);
                                    }
                                    final int c4 = c2 == true ? 1 : 0;
                                    inlineMessageButtonScope.PrimaryButton(((intValue << 12) & 57344) | 3072, 6, gapComposer2, Expect_jvmKt.rememberComposableLambda(573015072, new Function3() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            int i82 = c4;
                                            StringUtilsKt stringUtilsKt3 = stringUtilsKt2;
                                            switch (i82) {
                                                case 0:
                                                    Composer composer32 = (Composer) obj5;
                                                    int intValue22 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer32 = (GapComposer) composer32;
                                                    if (gapComposer32.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$Two) stringUtilsKt3).secondary.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer32.skipToGroupEnd();
                                                    }
                                                    break;
                                                case 1:
                                                    Composer composer42 = (Composer) obj5;
                                                    int intValue32 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer42 = (GapComposer) composer42;
                                                    if (gapComposer42.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$One) stringUtilsKt3).action.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer42.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer5 = (Composer) obj5;
                                                    int intValue4 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$Two) stringUtilsKt3).primary.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer5.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer2), null, (Function0) rememberedValue, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                InlineMessageButtonScope inlineMessageButtonScope2 = (InlineMessageButtonScope) obj;
                                Composer composer3 = (Composer) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                inlineMessageButtonScope2.getClass();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((GapComposer) composer3).changed(inlineMessageButtonScope2) ? 4 : 2;
                                }
                                GapComposer gapComposer3 = (GapComposer) composer3;
                                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    boolean changed2 = gapComposer3.changed(function12) | gapComposer3.changedInstance(stringUtilsKt2);
                                    Object rememberedValue2 = gapComposer3.rememberedValue();
                                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                                        rememberedValue2 = new Function0() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda9
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i82 = i7;
                                                StringUtilsKt stringUtilsKt3 = stringUtilsKt2;
                                                Function1 function13 = function12;
                                                switch (i82) {
                                                    case 0:
                                                        function13.invoke(((Actions$Two) stringUtilsKt3).secondary.eventToTrigger);
                                                        break;
                                                    case 1:
                                                        function13.invoke(((Actions$One) stringUtilsKt3).action.eventToTrigger);
                                                        break;
                                                    default:
                                                        function13.invoke(((Actions$Two) stringUtilsKt3).primary.eventToTrigger);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        gapComposer3.updateRememberedValue(rememberedValue2);
                                    }
                                    inlineMessageButtonScope2.PrimaryButton(((intValue2 << 12) & 57344) | 3072, 6, gapComposer3, Expect_jvmKt.rememberComposableLambda(-1006772663, new Function3() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            int i82 = i7;
                                            StringUtilsKt stringUtilsKt3 = stringUtilsKt2;
                                            switch (i82) {
                                                case 0:
                                                    Composer composer32 = (Composer) obj5;
                                                    int intValue22 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer32 = (GapComposer) composer32;
                                                    if (gapComposer32.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$Two) stringUtilsKt3).secondary.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer32.skipToGroupEnd();
                                                    }
                                                    break;
                                                case 1:
                                                    Composer composer42 = (Composer) obj5;
                                                    int intValue32 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer42 = (GapComposer) composer42;
                                                    if (gapComposer42.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$One) stringUtilsKt3).action.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer42.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer5 = (Composer) obj5;
                                                    int intValue4 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$Two) stringUtilsKt3).primary.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer5.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer3), null, (Function0) rememberedValue2, false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            default:
                                InlineMessageButtonScope inlineMessageButtonScope3 = (InlineMessageButtonScope) obj;
                                Composer composer4 = (Composer) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                inlineMessageButtonScope3.getClass();
                                if ((intValue3 & 6) == 0) {
                                    intValue3 |= ((GapComposer) composer4).changed(inlineMessageButtonScope3) ? 4 : 2;
                                }
                                GapComposer gapComposer4 = (GapComposer) composer4;
                                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                                    boolean changed3 = gapComposer4.changed(function12) | gapComposer4.changedInstance(stringUtilsKt2);
                                    Object rememberedValue3 = gapComposer4.rememberedValue();
                                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                                        final int i8 = r7 ? 1 : 0;
                                        rememberedValue3 = new Function0() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda9
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i82 = i8;
                                                StringUtilsKt stringUtilsKt3 = stringUtilsKt2;
                                                Function1 function13 = function12;
                                                switch (i82) {
                                                    case 0:
                                                        function13.invoke(((Actions$Two) stringUtilsKt3).secondary.eventToTrigger);
                                                        break;
                                                    case 1:
                                                        function13.invoke(((Actions$One) stringUtilsKt3).action.eventToTrigger);
                                                        break;
                                                    default:
                                                        function13.invoke(((Actions$Two) stringUtilsKt3).primary.eventToTrigger);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        gapComposer4.updateRememberedValue(rememberedValue3);
                                    }
                                    final int i9 = r7 ? 1 : 0;
                                    inlineMessageButtonScope3.SecondaryButton(((intValue3 << 12) & 57344) | 3072, gapComposer4, Expect_jvmKt.rememberComposableLambda(2081281562, new Function3() { // from class: com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                            int i82 = i9;
                                            StringUtilsKt stringUtilsKt3 = stringUtilsKt2;
                                            switch (i82) {
                                                case 0:
                                                    Composer composer32 = (Composer) obj5;
                                                    int intValue22 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer32 = (GapComposer) composer32;
                                                    if (gapComposer32.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$Two) stringUtilsKt3).secondary.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer32.skipToGroupEnd();
                                                    }
                                                    break;
                                                case 1:
                                                    Composer composer42 = (Composer) obj5;
                                                    int intValue32 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer42 = (GapComposer) composer42;
                                                    if (gapComposer42.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer42, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$One) stringUtilsKt3).action.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer42.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer5 = (Composer) obj5;
                                                    int intValue4 = ((Integer) obj6).intValue();
                                                    ((RowScope) obj4).getClass();
                                                    GapComposer gapComposer5 = (GapComposer) composer5;
                                                    if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((Actions$Two) stringUtilsKt3).primary.text, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer5.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer4), null, (Function0) rememberedValue3, false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), composableLambdaImpl, gapComposer, ((i3 >> 6) & 14) | 28080, 0);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InlineAppMessageKt$$ExternalSyntheticLambda8(ready, function1, modifier, i, 0);
        }
    }
}
