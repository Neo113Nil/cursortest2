package androidx.compose.foundation.lazy;

import androidx.camera.core.processing.TargetUtils;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.utils.StorageUtil;
import androidx.collection.ArrayMap;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.DecayAnimationSpecImpl;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.DefaultFlingBehavior;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$Horizontal;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Vertical;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda2;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda10;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda30;
import androidx.compose.material3.IconButtonKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidClipboard;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.arcade.values.Attribute;
import app.cash.arcade.values.AttributeRange;
import app.cash.arcade.values.AttributedString;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda30;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.mlkit.vision.text.zzb;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.HapticsKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Motion;
import com.squareup.cash.arcade.MotionKt;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.AlignmentLinesKt;
import com.squareup.cash.arcade.components.haptic.HapticVibratorKt;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.arcade.components.list.ListOrderedColors$Subtle;
import com.squareup.cash.arcade.components.list.ListOrderedKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.arcade.treehouse.NavBarBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.composeUi.foundation.text.MarkdownBlock;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda3;
import com.squareup.cash.maps.views.MapMarkerPropertiesKt$$ExternalSyntheticLambda1;
import com.squareup.cash.markdown.compose_ui.MarkdownTextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.markdownparser.MarkdownParserKt;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda16;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.moneybot.viewmodels.chat.MemoryTooltip;
import com.squareup.cash.moneybot.viewmodels.chat.MessageViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewEvent;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda2;
import com.squareup.cash.moneybot.views.markdown.MoneybotMarkdownStylesKt;
import com.squareup.cash.moneybot.views.message.MoneybotMessageUiKt$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.views.message.MoneybotMessageUiKt$MoneybotMessageUi$2$uriHandler$1$1;
import com.squareup.cash.moneybot.views.shared.LocalMoneybotAnimationsEnabledKt;
import com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.sheet.BasicShieetScope$$ExternalSyntheticLambda13;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda17;
import com.squareup.util.Strings;
import com.squareup.workflow1.Worker;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatcherMatchResult;
import kotlin.text.MatcherMatchResult$groupValues$1;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class LazyDslKt {
    /* renamed from: Bullet-RPmYEkk, reason: not valid java name */
    public static final void m303BulletRPmYEkk(long j, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-300966374);
        int i2 = (gapComposer.changed(j) ? 32 : 16) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ArrayMap(1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo231toDpGaN1DYA(Room.getSp(6))), j, RoundedCornerShapeKt.CircleShape);
            HorizontalAlignmentLine horizontalAlignmentLine = AlignmentLinesKt.FirstLineCenter;
            BoxKt.Box(AlignmentLinesKt.recordVerticalCenter(m177backgroundbw27NRU, horizontalAlignmentLine, (ArrayMap) rememberedValue).then(new WithAlignmentLineElement(horizontalAlignmentLine)), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MapMarkerPropertiesKt$$ExternalSyntheticLambda1(i, 3, j);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyColumn(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, Arrangement$Vertical arrangement$Vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, Function1 function1, Composer composer, int i, int i2) {
        int i3;
        LazyListState lazyListState2;
        PaddingValues paddingValues2;
        int i4;
        Arrangement$Vertical arrangement$Vertical2;
        int i5;
        Alignment.Horizontal horizontal2;
        int i6;
        boolean z2;
        GapComposer gapComposer;
        Modifier modifier2;
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect2;
        LazyListState lazyListState3;
        PaddingValues paddingValues3;
        Arrangement$Vertical arrangement$Vertical3;
        Alignment.Horizontal horizontal3;
        boolean z3;
        FlingBehavior flingBehavior2;
        RecomposeScopeImpl endRestartGroup;
        Modifier modifier3;
        FlingBehavior flingBehavior3;
        int i7;
        AndroidEdgeEffectOverscrollEffect rememberOverscrollEffect;
        int i8;
        int i9;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(53695811);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListState2 = lazyListState;
                if (gapComposer2.changed(lazyListState2)) {
                    i9 = 32;
                    i3 |= i9;
                }
            } else {
                lazyListState2 = lazyListState;
            }
            i9 = 16;
            i3 |= i9;
        } else {
            lazyListState2 = lazyListState;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            paddingValues2 = paddingValues;
            i3 |= gapComposer2.changed(paddingValues2) ? 256 : 128;
            i4 = i3 | 3072;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    arrangement$Vertical2 = arrangement$Vertical;
                    if (gapComposer2.changed(arrangement$Vertical2)) {
                        i8 = 16384;
                        i4 |= i8;
                    }
                } else {
                    arrangement$Vertical2 = arrangement$Vertical;
                }
                i8 = PKIFailureInfo.certRevoked;
                i4 |= i8;
            } else {
                arrangement$Vertical2 = arrangement$Vertical;
            }
            i5 = i2 & 32;
            if (i5 == 0) {
                i4 |= 196608;
            } else if ((196608 & i) == 0) {
                horizontal2 = horizontal;
                i4 |= gapComposer2.changed(horizontal2) ? PKIFailureInfo.unsupportedVersion : 65536;
                if ((1572864 & i) == 0) {
                    i4 |= PKIFailureInfo.signerNotTrusted;
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((12582912 & i) == 0) {
                    z2 = z;
                    i4 |= gapComposer2.changed(z2) ? 8388608 : 4194304;
                    if ((100663296 & i) == 0) {
                        i4 |= 33554432;
                    }
                    if ((805306368 & i) == 0) {
                        i4 |= gapComposer2.changedInstance(function1) ? PKIFailureInfo.duplicateCertReq : 268435456;
                    }
                    if (gapComposer2.shouldExecute(i4 & 1, (306783379 & i4) == 306783378)) {
                        gapComposer = gapComposer2;
                        gapComposer.skipToGroupEnd();
                        modifier2 = modifier;
                        androidEdgeEffectOverscrollEffect2 = androidEdgeEffectOverscrollEffect;
                        lazyListState3 = lazyListState2;
                        paddingValues3 = paddingValues2;
                        arrangement$Vertical3 = arrangement$Vertical2;
                        horizontal3 = horizontal2;
                        z3 = z2;
                        flingBehavior2 = flingBehavior;
                    } else {
                        gapComposer2.startDefaults();
                        if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                            Modifier modifier4 = i10 != 0 ? Modifier.Companion.$$INSTANCE : modifier;
                            if ((i2 & 2) != 0) {
                                i4 &= -113;
                                lazyListState2 = LazyListStateKt.rememberLazyListState(0, 3, gapComposer2);
                            }
                            if (i11 != 0) {
                                paddingValues2 = new PaddingValuesImpl(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
                            }
                            if ((i2 & 16) != 0) {
                                i4 &= -57345;
                                arrangement$Vertical2 = SpacerKt.Top;
                            }
                            if (i5 != 0) {
                                horizontal2 = Alignment.Companion.Start;
                            }
                            DecayAnimationSpecImpl rememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(gapComposer2);
                            boolean changed = gapComposer2.changed(rememberSplineBasedDecay);
                            Object rememberedValue = gapComposer2.rememberedValue();
                            if (changed || rememberedValue == Composer.Companion.Empty) {
                                rememberedValue = new DefaultFlingBehavior(rememberSplineBasedDecay);
                                gapComposer2.updateRememberedValue(rememberedValue);
                            }
                            DefaultFlingBehavior defaultFlingBehavior = (DefaultFlingBehavior) rememberedValue;
                            if (i6 != 0) {
                                z2 = true;
                            }
                            modifier3 = modifier4;
                            flingBehavior3 = defaultFlingBehavior;
                            i7 = i4 & (-238551041);
                            rememberOverscrollEffect = OverscrollKt.rememberOverscrollEffect(gapComposer2);
                        } else {
                            gapComposer2.skipToGroupEnd();
                            if ((i2 & 2) != 0) {
                                i4 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i4 &= -57345;
                            }
                            i7 = i4 & (-238551041);
                            modifier3 = modifier;
                            flingBehavior3 = flingBehavior;
                            rememberOverscrollEffect = androidEdgeEffectOverscrollEffect;
                        }
                        PaddingValues paddingValues4 = paddingValues2;
                        Arrangement$Vertical arrangement$Vertical4 = arrangement$Vertical2;
                        Alignment.Horizontal horizontal4 = horizontal2;
                        boolean z4 = z2;
                        LazyListState lazyListState4 = lazyListState2;
                        gapComposer2.endDefaults();
                        gapComposer = gapComposer2;
                        LazyListKt.LazyList(modifier3, lazyListState4, paddingValues4, true, flingBehavior3, z4, rememberOverscrollEffect, horizontal4, arrangement$Vertical4, null, null, function1, gapComposer, (i7 & 14) | 24576 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | ((i7 >> 3) & 3670016) | ((i7 << 12) & 1879048192), ((i7 >> 12) & 14) | ((i7 >> 18) & 7168), 6400);
                        modifier2 = modifier3;
                        lazyListState3 = lazyListState4;
                        paddingValues3 = paddingValues4;
                        flingBehavior2 = flingBehavior3;
                        z3 = z4;
                        androidEdgeEffectOverscrollEffect2 = rememberOverscrollEffect;
                        horizontal3 = horizontal4;
                        arrangement$Vertical3 = arrangement$Vertical4;
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.block = new ButtonKt$$ExternalSyntheticLambda2(modifier2, lazyListState3, paddingValues3, arrangement$Vertical3, horizontal3, flingBehavior2, z3, androidEdgeEffectOverscrollEffect2, function1, i, i2, 1);
                        return;
                    }
                    return;
                }
                z2 = z;
                if ((100663296 & i) == 0) {
                }
                if ((805306368 & i) == 0) {
                }
                if (gapComposer2.shouldExecute(i4 & 1, (306783379 & i4) == 306783378)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            horizontal2 = horizontal;
            if ((1572864 & i) == 0) {
            }
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            z2 = z;
            if ((100663296 & i) == 0) {
            }
            if ((805306368 & i) == 0) {
            }
            if (gapComposer2.shouldExecute(i4 & 1, (306783379 & i4) == 306783378)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i3 | 3072;
        if ((i & 24576) != 0) {
        }
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        horizontal2 = horizontal;
        if ((1572864 & i) == 0) {
        }
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        z2 = z;
        if ((100663296 & i) == 0) {
        }
        if ((805306368 & i) == 0) {
        }
        if (gapComposer2.shouldExecute(i4 & 1, (306783379 & i4) == 306783378)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyRow(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, Arrangement$Horizontal arrangement$Horizontal, BiasAlignment.Vertical vertical, FlingBehavior flingBehavior, boolean z, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, Function1 function1, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        LazyListState lazyListState2;
        PaddingValues paddingValues2;
        Arrangement$Horizontal arrangement$Horizontal2;
        int i4;
        BiasAlignment.Vertical vertical2;
        FlingBehavior flingBehavior2;
        int i5;
        Function1 function12;
        GapComposer gapComposer;
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect2;
        Modifier modifier3;
        LazyListState lazyListState3;
        PaddingValues paddingValues3;
        Arrangement$Horizontal arrangement$Horizontal3;
        BiasAlignment.Vertical vertical3;
        FlingBehavior flingBehavior3;
        boolean z2;
        RecomposeScopeImpl endRestartGroup;
        AndroidEdgeEffectOverscrollEffect rememberOverscrollEffect;
        FlingBehavior flingBehavior4;
        Modifier modifier4;
        int i6;
        int i7;
        int i8;
        int i9;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1884325601);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer2.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListState2 = lazyListState;
                if (gapComposer2.changed(lazyListState2)) {
                    i9 = 32;
                    i3 |= i9;
                }
            } else {
                lazyListState2 = lazyListState;
            }
            i9 = 16;
            i3 |= i9;
        } else {
            lazyListState2 = lazyListState;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            paddingValues2 = paddingValues;
            i3 |= gapComposer2.changed(paddingValues2) ? 256 : 128;
            int i12 = i3 | 3072;
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    arrangement$Horizontal2 = arrangement$Horizontal;
                    if (gapComposer2.changed(arrangement$Horizontal2)) {
                        i8 = 16384;
                        i12 |= i8;
                    }
                } else {
                    arrangement$Horizontal2 = arrangement$Horizontal;
                }
                i8 = PKIFailureInfo.certRevoked;
                i12 |= i8;
            } else {
                arrangement$Horizontal2 = arrangement$Horizontal;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i12 |= 196608;
            } else if ((196608 & i) == 0) {
                vertical2 = vertical;
                i12 |= gapComposer2.changed(vertical2) ? PKIFailureInfo.unsupportedVersion : 65536;
                if ((1572864 & i) == 0) {
                    if ((i2 & 64) == 0) {
                        flingBehavior2 = flingBehavior;
                        if (gapComposer2.changed(flingBehavior2)) {
                            i7 = PKIFailureInfo.badCertTemplate;
                            i12 |= i7;
                        }
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i7 = PKIFailureInfo.signerNotTrusted;
                    i12 |= i7;
                } else {
                    flingBehavior2 = flingBehavior;
                }
                i5 = 12582912 | i12;
                if ((100663296 & i) == 0) {
                    i5 = 46137344 | i12;
                }
                if ((805306368 & i) == 0) {
                    function12 = function1;
                    i5 |= gapComposer2.changedInstance(function12) ? PKIFailureInfo.duplicateCertReq : 268435456;
                } else {
                    function12 = function1;
                }
                boolean z3 = true;
                if (gapComposer2.shouldExecute(i5 & 1, (306783379 & i5) != 306783378)) {
                    gapComposer2.startDefaults();
                    if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                        Modifier modifier5 = i10 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                        if ((i2 & 2) != 0) {
                            i5 &= -113;
                            lazyListState2 = LazyListStateKt.rememberLazyListState(0, 3, gapComposer2);
                        }
                        if (i11 != 0) {
                            paddingValues2 = new PaddingValuesImpl(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
                        }
                        if ((i2 & 16) != 0) {
                            i5 &= -57345;
                            arrangement$Horizontal2 = SpacerKt.Start;
                        }
                        if (i4 != 0) {
                            vertical2 = Alignment.Companion.Top;
                        }
                        if ((i2 & 64) != 0) {
                            DecayAnimationSpecImpl rememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(gapComposer2);
                            boolean changed = gapComposer2.changed(rememberSplineBasedDecay);
                            Object rememberedValue = gapComposer2.rememberedValue();
                            if (changed || rememberedValue == Composer.Companion.Empty) {
                                rememberedValue = new DefaultFlingBehavior(rememberSplineBasedDecay);
                                gapComposer2.updateRememberedValue(rememberedValue);
                            }
                            i5 &= -3670017;
                            flingBehavior2 = (DefaultFlingBehavior) rememberedValue;
                        }
                        rememberOverscrollEffect = OverscrollKt.rememberOverscrollEffect(gapComposer2);
                        flingBehavior4 = flingBehavior2;
                        modifier4 = modifier5;
                        i6 = i5 & (-234881025);
                    } else {
                        gapComposer2.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i5 &= -113;
                        }
                        if ((i2 & 16) != 0) {
                            i5 &= -57345;
                        }
                        if ((i2 & 64) != 0) {
                            i5 &= -3670017;
                        }
                        i6 = i5 & (-234881025);
                        z3 = z;
                        rememberOverscrollEffect = androidEdgeEffectOverscrollEffect;
                        flingBehavior4 = flingBehavior2;
                        modifier4 = modifier2;
                    }
                    LazyListState lazyListState4 = lazyListState2;
                    PaddingValues paddingValues4 = paddingValues2;
                    Arrangement$Horizontal arrangement$Horizontal4 = arrangement$Horizontal2;
                    BiasAlignment.Vertical vertical4 = vertical2;
                    gapComposer2.endDefaults();
                    int i13 = i6 >> 3;
                    gapComposer = gapComposer2;
                    LazyListKt.LazyList(modifier4, lazyListState4, paddingValues4, false, flingBehavior4, z3, rememberOverscrollEffect, null, null, vertical4, arrangement$Horizontal4, function12, gapComposer, (i6 & 14) | 24576 | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (458752 & i13) | (i13 & 3670016), ((i6 >> 12) & 112) | ((i6 >> 6) & 896) | ((i6 >> 18) & 7168), 1792);
                    modifier3 = modifier4;
                    lazyListState3 = lazyListState4;
                    paddingValues3 = paddingValues4;
                    flingBehavior3 = flingBehavior4;
                    z2 = z3;
                    androidEdgeEffectOverscrollEffect2 = rememberOverscrollEffect;
                    vertical3 = vertical4;
                    arrangement$Horizontal3 = arrangement$Horizontal4;
                } else {
                    gapComposer = gapComposer2;
                    gapComposer.skipToGroupEnd();
                    androidEdgeEffectOverscrollEffect2 = androidEdgeEffectOverscrollEffect;
                    modifier3 = modifier2;
                    lazyListState3 = lazyListState2;
                    paddingValues3 = paddingValues2;
                    arrangement$Horizontal3 = arrangement$Horizontal2;
                    vertical3 = vertical2;
                    flingBehavior3 = flingBehavior2;
                    z2 = z;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ButtonKt$$ExternalSyntheticLambda2(modifier3, lazyListState3, paddingValues3, arrangement$Horizontal3, vertical3, flingBehavior3, z2, androidEdgeEffectOverscrollEffect2, function1, i, i2, 2);
                    return;
                }
                return;
            }
            vertical2 = vertical;
            if ((1572864 & i) == 0) {
            }
            i5 = 12582912 | i12;
            if ((100663296 & i) == 0) {
            }
            if ((805306368 & i) == 0) {
            }
            boolean z32 = true;
            if (gapComposer2.shouldExecute(i5 & 1, (306783379 & i5) != 306783378)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        paddingValues2 = paddingValues;
        int i122 = i3 | 3072;
        if ((i & 24576) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        vertical2 = vertical;
        if ((1572864 & i) == 0) {
        }
        i5 = 12582912 | i122;
        if ((100663296 & i) == 0) {
        }
        if ((805306368 & i) == 0) {
        }
        boolean z322 = true;
        if (gapComposer2.shouldExecute(i5 & 1, (306783379 & i5) != 306783378)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0112 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* renamed from: MarkdownText-pCuZGqc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m304MarkdownTextpCuZGqc(String str, Function2 function2, Modifier modifier, TextStyle textStyle, long j, MarkdownSpanValues markdownSpanValues, Function1 function1, TextLineBalancing textLineBalancing, int i, int i2, int i3, Composer composer, int i4, int i5) {
        int i6;
        Modifier modifier2;
        TextStyle textStyle2;
        int i7;
        long j2;
        MarkdownSpanValues markdownSpanValues2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        GapComposer gapComposer;
        TextLineBalancing textLineBalancing2;
        Modifier modifier3;
        TextStyle textStyle3;
        long j3;
        MarkdownSpanValues markdownSpanValues3;
        Function1 function12;
        int i13;
        int i14;
        int i15;
        RecomposeScopeImpl endRestartGroup;
        TextStyle textStyle4;
        long j4;
        MarkdownSpanValues markdownSpanValues4;
        int i16;
        int i17;
        Modifier modifier4;
        TextStyle textStyle5;
        Function1 function13;
        TextLineBalancing textLineBalancing3;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z2;
        int i22;
        int i23;
        int i24;
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1420285282);
        if ((i4 & 6) == 0) {
            i6 = (gapComposer2.changed(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= gapComposer2.changedInstance(function2) ? 32 : 16;
        }
        int i25 = i5 & 4;
        if (i25 != 0) {
            i6 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i4 & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i6 |= gapComposer2.changed(modifier2) ? 256 : 128;
            if ((i4 & 3072) != 0) {
                if ((i5 & 8) == 0) {
                    textStyle2 = textStyle;
                    if (gapComposer2.changed(textStyle2)) {
                        i24 = 2048;
                        i6 |= i24;
                    }
                } else {
                    textStyle2 = textStyle;
                }
                i24 = 1024;
                i6 |= i24;
            } else {
                textStyle2 = textStyle;
            }
            i7 = i5 & 16;
            if (i7 == 0) {
                i6 |= 24576;
            } else if ((i4 & 24576) == 0) {
                j2 = j;
                i6 |= gapComposer2.changed(j2) ? 16384 : PKIFailureInfo.certRevoked;
                if ((196608 & i4) == 0) {
                    if ((i5 & 32) == 0) {
                        markdownSpanValues2 = markdownSpanValues;
                        if (gapComposer2.changed(markdownSpanValues2)) {
                            i23 = PKIFailureInfo.unsupportedVersion;
                            i6 |= i23;
                        }
                    } else {
                        markdownSpanValues2 = markdownSpanValues;
                    }
                    i23 = 65536;
                    i6 |= i23;
                } else {
                    markdownSpanValues2 = markdownSpanValues;
                }
                i8 = 1572864 | i6;
                i9 = i5 & 128;
                if (i9 != 0) {
                    i8 = 14155776 | i6;
                } else if ((12582912 & i4) == 0) {
                    i8 |= gapComposer2.changed(textLineBalancing) ? 8388608 : 4194304;
                    if ((i4 & 100663296) == 0) {
                        if ((i5 & 256) == 0 && gapComposer2.changed(i)) {
                            i22 = 67108864;
                            i8 |= i22;
                        }
                        i22 = 33554432;
                        i8 |= i22;
                    }
                    i10 = i5 & 512;
                    if (i10 == 0) {
                        i8 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        i11 = i10;
                        i8 |= gapComposer2.changed(i2) ? PKIFailureInfo.duplicateCertReq : 268435456;
                        if ((i5 & 1024) != 0 && gapComposer2.changed(i3)) {
                            i12 = 4;
                            if ((i8 & 306783379) != 306783378 && (i12 & 3) == 2) {
                                z = false;
                                if (gapComposer2.shouldExecute(i8 & 1, z)) {
                                    gapComposer2.startDefaults();
                                    int i26 = i4 & 1;
                                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                    int i27 = 14;
                                    if (i26 == 0 || gapComposer2.getDefaultsInvalid()) {
                                        Modifier modifier5 = i25 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                                        if ((i5 & 8) != 0) {
                                            textStyle4 = (TextStyle) gapComposer2.consume(ArcadeThemeKt.LocalTextStyle);
                                            if (textStyle4 == null) {
                                                gapComposer2.startReplaceGroup(-1100573765);
                                                textStyle4 = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                                z2 = false;
                                            } else {
                                                z2 = false;
                                                gapComposer2.startReplaceGroup(-1100574912);
                                            }
                                            gapComposer2.end(z2);
                                            i8 &= -7169;
                                        } else {
                                            textStyle4 = textStyle2;
                                        }
                                        j4 = i7 != 0 ? Color.Unspecified : j2;
                                        if ((i5 & 32) != 0) {
                                            markdownSpanValues4 = MarkdownSpanValues.Default;
                                            i8 &= -458753;
                                        } else {
                                            markdownSpanValues4 = markdownSpanValues2;
                                        }
                                        Object rememberedValue = gapComposer2.rememberedValue();
                                        if (rememberedValue == neverEqualPolicy) {
                                            rememberedValue = new NavBarBinding$$ExternalSyntheticLambda2(i27);
                                            gapComposer2.updateRememberedValue(rememberedValue);
                                        }
                                        Function1 function14 = (Function1) rememberedValue;
                                        TextLineBalancing textLineBalancing4 = i9 != 0 ? null : textLineBalancing;
                                        if ((i5 & 256) != 0) {
                                            i16 = textLineBalancing4 != null ? 3 : 2;
                                            i8 &= -234881025;
                                        } else {
                                            i16 = i;
                                        }
                                        i17 = i11 != 0 ? Integer.MAX_VALUE : i2;
                                        modifier4 = modifier5;
                                        textStyle5 = textStyle4;
                                        function13 = function14;
                                        textLineBalancing3 = textLineBalancing4;
                                        i18 = i8;
                                        if ((i5 & 1024) != 0) {
                                            i19 = 0;
                                            i20 = 0;
                                        } else {
                                            i19 = i12;
                                            i20 = i3;
                                        }
                                        i21 = i16;
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                        if ((i5 & 8) != 0) {
                                            i8 &= -7169;
                                        }
                                        if ((i5 & 32) != 0) {
                                            i8 &= -458753;
                                        }
                                        if ((i5 & 256) != 0) {
                                            i8 &= -234881025;
                                        }
                                        function13 = function1;
                                        textLineBalancing3 = textLineBalancing;
                                        i17 = i2;
                                        if ((i5 & 1024) != 0) {
                                            i20 = i3;
                                            modifier4 = modifier2;
                                            textStyle5 = textStyle2;
                                            j4 = j2;
                                            markdownSpanValues4 = markdownSpanValues2;
                                            i18 = i8;
                                            i19 = 0;
                                            i21 = i;
                                        } else {
                                            modifier4 = modifier2;
                                            textStyle5 = textStyle2;
                                            j4 = j2;
                                            markdownSpanValues4 = markdownSpanValues2;
                                            i18 = i8;
                                            i19 = i12;
                                            i21 = i;
                                            i20 = i3;
                                        }
                                    }
                                    gapComposer2.endDefaults();
                                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                    if (colors == null) {
                                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                    } else {
                                        gapComposer2.startReplaceGroup(-1762997739);
                                        gapComposer2.end(false);
                                    }
                                    MarkdownSpanValues markdownSpanValues5 = new MarkdownSpanValues(new SpanStyle(colors.semantic.text.link, 0L, FontWeight.Medium, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61434).merge(markdownSpanValues4.linkSpan), markdownSpanValues4.boldSpan);
                                    boolean changed = ((i18 & 14) == 4) | gapComposer2.changed(markdownSpanValues5);
                                    Object rememberedValue2 = gapComposer2.rememberedValue();
                                    Object obj = rememberedValue2;
                                    if (changed || rememberedValue2 == neverEqualPolicy) {
                                        AnnotatedString.Builder builder = new AnnotatedString.Builder();
                                        Worker.DefaultImpls.appendMarkdown(builder, str, markdownSpanValues5, function2);
                                        AnnotatedString annotatedString = builder.toAnnotatedString();
                                        if (function2 == null && !annotatedString.getLinkAnnotations(0, annotatedString.text.length()).isEmpty()) {
                                            a$$ExternalSyntheticBUOutline0.m$1("MarkdownText() can't display links if onUrlClick is null");
                                            return;
                                        } else {
                                            gapComposer2.updateRememberedValue(annotatedString);
                                            obj = annotatedString;
                                        }
                                    }
                                    int i28 = i18 >> 9;
                                    gapComposer = gapComposer2;
                                    long j5 = j4;
                                    Room.m1164Text25TpFw(i21, i17, 0, i20, ((i18 >> 3) & 8176) | (57344 & (i18 >> 6)) | (458752 & i28) | (i28 & 3670016) | ((i19 << 24) & 234881024), (i18 >> 21) & 14, 2688, j5, (Composer) gapComposer, modifier4, (AnnotatedString) obj, textStyle5, textLineBalancing3, (Map) null, function13, false);
                                    markdownSpanValues3 = markdownSpanValues4;
                                    i13 = i21;
                                    i14 = i17;
                                    i15 = i20;
                                    j3 = j5;
                                    modifier3 = modifier4;
                                    textStyle3 = textStyle5;
                                    textLineBalancing2 = textLineBalancing3;
                                    function12 = function13;
                                } else {
                                    gapComposer = gapComposer2;
                                    gapComposer.skipToGroupEnd();
                                    textLineBalancing2 = textLineBalancing;
                                    modifier3 = modifier2;
                                    textStyle3 = textStyle2;
                                    j3 = j2;
                                    markdownSpanValues3 = markdownSpanValues2;
                                    function12 = function1;
                                    i13 = i;
                                    i14 = i2;
                                    i15 = i3;
                                }
                                endRestartGroup = gapComposer.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.block = new MarkdownTextKt$$ExternalSyntheticLambda1(str, function2, modifier3, textStyle3, j3, markdownSpanValues3, function12, textLineBalancing2, i13, i14, i15, i4, i5);
                                    return;
                                }
                                return;
                            }
                            z = true;
                            if (gapComposer2.shouldExecute(i8 & 1, z)) {
                            }
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        i12 = 2;
                        if ((i8 & 306783379) != 306783378) {
                            z = false;
                            if (gapComposer2.shouldExecute(i8 & 1, z)) {
                            }
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        z = true;
                        if (gapComposer2.shouldExecute(i8 & 1, z)) {
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i11 = i10;
                    if ((i5 & 1024) != 0) {
                        i12 = 4;
                        if ((i8 & 306783379) != 306783378) {
                        }
                        z = true;
                        if (gapComposer2.shouldExecute(i8 & 1, z)) {
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i12 = 2;
                    if ((i8 & 306783379) != 306783378) {
                    }
                    z = true;
                    if (gapComposer2.shouldExecute(i8 & 1, z)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                if ((i4 & 100663296) == 0) {
                }
                i10 = i5 & 512;
                if (i10 == 0) {
                }
                i11 = i10;
                if ((i5 & 1024) != 0) {
                }
                i12 = 2;
                if ((i8 & 306783379) != 306783378) {
                }
                z = true;
                if (gapComposer2.shouldExecute(i8 & 1, z)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            j2 = j;
            if ((196608 & i4) == 0) {
            }
            i8 = 1572864 | i6;
            i9 = i5 & 128;
            if (i9 != 0) {
            }
            if ((i4 & 100663296) == 0) {
            }
            i10 = i5 & 512;
            if (i10 == 0) {
            }
            i11 = i10;
            if ((i5 & 1024) != 0) {
            }
            i12 = 2;
            if ((i8 & 306783379) != 306783378) {
            }
            z = true;
            if (gapComposer2.shouldExecute(i8 & 1, z)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i4 & 3072) != 0) {
        }
        i7 = i5 & 16;
        if (i7 == 0) {
        }
        j2 = j;
        if ((196608 & i4) == 0) {
        }
        i8 = 1572864 | i6;
        i9 = i5 & 128;
        if (i9 != 0) {
        }
        if ((i4 & 100663296) == 0) {
        }
        i10 = i5 & 512;
        if (i10 == 0) {
        }
        i11 = i10;
        if ((i5 & 1024) != 0) {
        }
        i12 = 2;
        if ((i8 & 306783379) != 306783378) {
        }
        z = true;
        if (gapComposer2.shouldExecute(i8 & 1, z)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void MoneybotMessageStreamingText(int i, Composer composer, String str, Function0 function0) {
        Modifier.Companion companion;
        boolean z;
        boolean z2;
        Function0 function02 = function0;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-932790942);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changedInstance(function02) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean booleanValue = ((Boolean) gapComposer.consume(LocalMoneybotAnimationsEnabledKt.LocalMoneybotAnimationsEnabled)).booleanValue();
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.standard;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
            TextStyle textStyle = ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMedium;
            FontListFontFamily fontListFontFamily = MoneybotMarkdownStylesKt.cashSansForMarkdown;
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, 0L, null, fontListFontFamily, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183);
            TextStyle m994copyp1EtxEg$default2 = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(staticProvidableCompositionLocal)).sectionTitle, 0L, 0L, null, fontListFontFamily, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183);
            boolean z3 = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (z3 || rememberedValue == obj) {
                rememberedValue = StringsKt__StringsJVMKt.replace$default(str, "\\$", "$");
                gapComposer.updateRememberedValue(rememberedValue);
            }
            String str2 = (String) rememberedValue;
            boolean changed = gapComposer.changed(str2);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == obj) {
                MatcherMatchResult find = new Regex("^#{1,6}\\s+(.+?)(?:\\n\\n|$)", RegexOption.DOT_MATCHES_ALL).find(str2);
                rememberedValue2 = find == null ? null : new Pair(StringsKt.trim((String) ((MatcherMatchResult$groupValues$1) find.getGroupValues()).get(1)).toString(), StringsKt.trim(str2.substring(find.getRange().last + 1)).toString());
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Pair pair = (Pair) rememberedValue2;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion2);
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
            if (pair != null) {
                gapComposer.startReplaceGroup(303615288);
                String str3 = (String) pair.first;
                String str4 = (String) pair.second;
                boolean changed2 = gapComposer.changed(str2);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue3 == obj) {
                    rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                MutableState mutableState = (MutableState) rememberedValue3;
                boolean changed3 = gapComposer.changed(mutableState);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changed3 || rememberedValue4 == obj) {
                    rememberedValue4 = new CashMapViewKt$$ExternalSyntheticLambda2(28, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                Function0 function03 = (Function0) rememberedValue4;
                boolean changed4 = ((i2 & 112) == 32) | gapComposer.changed(str4);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (changed4 || rememberedValue5 == obj) {
                    rememberedValue5 = new UtilsKt$$ExternalSyntheticLambda0(13, str4, function02);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                LazyGridDslKt.m315BaselineFlowhkzSW1g(str3, m994copyp1EtxEg$default2, (Modifier) null, j, (TextMeasurer) null, (String) null, booleanValue, 100L, function03, (Function0) rememberedValue5, gapComposer, 12582912, 52);
                gapComposer = gapComposer;
                if (!((Boolean) mutableState.getValue()).booleanValue() || str4.length() <= 0) {
                    companion = companion2;
                    z2 = false;
                    z = true;
                    gapComposer.startReplaceGroup(304333930);
                    gapComposer.end(false);
                } else {
                    re$$ExternalSyntheticOutline0.m(gapComposer, 304084070, companion2, 20.0f, gapComposer);
                    companion = companion2;
                    z2 = false;
                    z = true;
                    LazyGridDslKt.m315BaselineFlowhkzSW1g(str4, m994copyp1EtxEg$default, (Modifier) null, j, (TextMeasurer) null, (String) null, booleanValue, 0L, (Function0) null, function02, gapComposer, (i2 << 24) & 1879048192, 436);
                    gapComposer.end(false);
                }
                gapComposer.end(z2);
                function02 = function0;
            } else {
                companion = companion2;
                z = true;
                gapComposer.startReplaceGroup(304354049);
                function02 = function0;
                LazyGridDslKt.m315BaselineFlowhkzSW1g(str2, m994copyp1EtxEg$default, (Modifier) null, j, (TextMeasurer) null, (String) null, booleanValue, 100L, (Function0) null, function02, gapComposer, ((i2 << 24) & 1879048192) | 12582912, EnumC0170g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE);
                gapComposer.end(false);
            }
            re$$ExternalSyntheticOutline0.m(companion, 20.0f, gapComposer, z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ToViewKt$$ExternalSyntheticLambda0(str, function02, i, 7);
        }
    }

    public static final void MoneybotMessageUi(Modifier modifier, String str, final String str2, final boolean z, final MessageViewModel.MoneybotMessageViewModel.ThumbState thumbState, final String str3, final MemoryTooltip memoryTooltip, final boolean z2, final boolean z3, final Function0 function0, Function1 function1, Composer composer, final int i, final int i2) {
        int i3;
        GapComposer gapComposer;
        Modifier modifier2;
        Object moneybotMessageUiKt$$ExternalSyntheticLambda0;
        int i4;
        int i5;
        int i6;
        final Function1 function12;
        final String str4 = str;
        Function1 function13 = function1;
        str2.getClass();
        function13.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1712359668);
        int i7 = i | 6;
        if ((i & 48) == 0) {
            i7 |= gapComposer2.changed(str4) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i7 |= gapComposer2.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i7 |= gapComposer2.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i7 |= gapComposer2.changed(thumbState == null ? -1 : thumbState.ordinal()) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i7 |= gapComposer2.changed(str3) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i7 |= gapComposer2.changedInstance(memoryTooltip) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i7 |= gapComposer2.changed(z2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i7 |= gapComposer2.changed(z3) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i7 |= gapComposer2.changedInstance(function0) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i2 & 6) == 0) {
            i3 = i2 | (gapComposer2.changedInstance(function13) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (gapComposer2.shouldExecute(i7 & 1, ((i7 & 306783379) == 306783378 && (i3 & 3) == 2) ? false : true)) {
            AndroidClipboard androidClipboard = (AndroidClipboard) gapComposer2.consume(CompositionLocalsKt.LocalClipboard);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            int i8 = i7;
            int i9 = i3 & 14;
            int i10 = i8 & 112;
            boolean changedInstance = gapComposer2.changedInstance(coroutineScope) | gapComposer2.changedInstance(androidClipboard) | ((i7 & 896) == 256) | (i9 == 4) | (i10 == 32);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                i4 = i10;
                i5 = 0;
                i6 = i9;
                moneybotMessageUiKt$$ExternalSyntheticLambda0 = new MoneybotMessageUiKt$$ExternalSyntheticLambda0(coroutineScope, function13, str4, androidClipboard, str2);
                function12 = function13;
                str4 = str4;
                gapComposer2.updateRememberedValue(moneybotMessageUiKt$$ExternalSyntheticLambda0);
            } else {
                i6 = i9;
                function12 = function13;
                i4 = i10;
                moneybotMessageUiKt$$ExternalSyntheticLambda0 = rememberedValue2;
                i5 = 0;
            }
            Function0 function02 = (Function0) moneybotMessageUiKt$$ExternalSyntheticLambda0;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, i5);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            modifier2 = companion;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            boolean z4 = i6 == 4;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (z4 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new UriHandler() { // from class: com.squareup.cash.moneybot.views.message.MoneybotMessageUiKt$MoneybotMessageUi$2$uriHandler$1$1
                    @Override // androidx.compose.ui.platform.UriHandler
                    public final void openUri(String str5) {
                        str5.getClass();
                        Function1.this.invoke(new MoneybotChatViewEvent.MessageLinkTap(str5));
                    }
                };
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            ProvidedValue defaultProvidedValue$runtime = CompositionLocalsKt.LocalUriHandler.defaultProvidedValue$runtime((MoneybotMessageUiKt$MoneybotMessageUi$2$uriHandler$1$1) rememberedValue3);
            int i11 = i6;
            function13 = function12;
            gapComposer = gapComposer2;
            Updater.CompositionLocalProvider(defaultProvidedValue$runtime, Expect_jvmKt.rememberComposableLambda(-1071840490, new DatePickerKt$$ExternalSyntheticLambda30(str3, memoryTooltip, function13, str2, z3, function0, z2), gapComposer), gapComposer, 56);
            if (z) {
                gapComposer.startReplaceGroup(1016156202);
                int i12 = i4;
                boolean z5 = (i11 == 4) | (i12 == 32);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (z5 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new P2PListViewKt$$ExternalSyntheticLambda13(function13, str4, 19);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                Function0 function03 = (Function0) rememberedValue4;
                boolean z6 = (i11 == 4) | (i12 == 32);
                Object rememberedValue5 = gapComposer.rememberedValue();
                int i13 = 20;
                if (z6 || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new P2PListViewKt$$ExternalSyntheticLambda13(function13, str4, i13);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                Function0 function04 = (Function0) rememberedValue5;
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = new MoneyTabUIKt$$ExternalSyntheticLambda6(20);
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                QuickActionsBar(thumbState, function02, function03, function04, (Function0) rememberedValue6, false, gapComposer, ((i8 >> 12) & 14) | 24576, 32);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1016434892);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final Function1 function14 = function13;
            final Modifier modifier3 = modifier2;
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.moneybot.views.message.MoneybotMessageUiKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                    int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                    LazyDslKt.MoneybotMessageUi(Modifier.this, str4, str2, z, thumbState, str3, memoryTooltip, z2, z3, function0, function14, (Composer) obj, updateChangedFlags, updateChangedFlags2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void MoneybotQuickActionsBar(String str, String str2, MessageViewModel.MoneybotMessageViewModel.ThumbState thumbState, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        String str3 = str;
        str3.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1029531675);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(thumbState.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            AndroidClipboard androidClipboard = (AndroidClipboard) gapComposer.consume(CompositionLocalsKt.LocalClipboard);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            boolean z = str2 != null;
            int i4 = i3 & 7168;
            int i5 = i3 & 14;
            boolean changedInstance = ((i3 & 112) == 32) | gapComposer.changedInstance(coroutineScope) | gapComposer.changedInstance(androidClipboard) | (i4 == 2048) | (i5 == 4);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == obj) {
                Object moneybotMessageUiKt$$ExternalSyntheticLambda0 = new MoneybotMessageUiKt$$ExternalSyntheticLambda0(str2, coroutineScope, function1, str3, androidClipboard);
                str3 = str3;
                gapComposer.updateRememberedValue(moneybotMessageUiKt$$ExternalSyntheticLambda0);
                rememberedValue2 = moneybotMessageUiKt$$ExternalSyntheticLambda0;
            }
            Function0 function02 = (Function0) rememberedValue2;
            boolean z2 = (i4 == 2048) | (i5 == 4);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z2 || rememberedValue3 == obj) {
                rememberedValue3 = new P2PListViewKt$$ExternalSyntheticLambda13(function1, str3, 17);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Function0 function03 = (Function0) rememberedValue3;
            boolean z3 = (i4 == 2048) | (i5 == 4);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (z3 || rememberedValue4 == obj) {
                rememberedValue4 = new P2PListViewKt$$ExternalSyntheticLambda13(function1, str3, 18);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Function0 function04 = (Function0) rememberedValue4;
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == obj) {
                rememberedValue5 = new MoneyTabUIKt$$ExternalSyntheticLambda6(19);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            QuickActionsBar(thumbState, function02, function03, function04, (Function0) rememberedValue5, z, gapComposer, ((i3 >> 6) & 14) | 24576, 0);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabToolbarsKt$$ExternalSyntheticLambda17((Object) str3, (Object) str2, (Object) thumbState, function1, (Object) modifier2, i, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* renamed from: MultiblockMarkdown-1kVgcOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m305MultiblockMarkdown1kVgcOc(final String str, final Function2 function2, Modifier modifier, final TextStyle textStyle, long j, MarkdownSpanValues markdownSpanValues, int i, ListOrderedColors$Subtle listOrderedColors$Subtle, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        MarkdownSpanValues markdownSpanValues2;
        int i5;
        int i6;
        Applier applier;
        int i7;
        GapComposer gapComposer;
        final long j2;
        final ListOrderedColors$Subtle listOrderedColors$Subtle2;
        final Modifier modifier3;
        final int i8;
        final MarkdownSpanValues markdownSpanValues3;
        RecomposeScopeImpl endRestartGroup;
        int i9;
        int i10;
        ListOrderedColors$Subtle listOrderedColors$Subtle3;
        MarkdownSpanValues markdownSpanValues4;
        int i11;
        long j3;
        MarkdownSpanValues markdownSpanValues5;
        ListOrderedColors$Subtle listOrderedColors$Subtle4;
        int i12;
        Modifier modifier4;
        MarkdownBlock orderedListItem;
        boolean z;
        long j4;
        int i13;
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1687421869);
        Applier applier2 = gapComposer2.applier;
        int i14 = (i2 & 6) == 0 ? (gapComposer2.changed(str) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i14 |= gapComposer2.changedInstance(function2) ? 32 : 16;
        }
        int i15 = i3 & 4;
        if (i15 != 0) {
            i14 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i14 |= gapComposer2.changed(modifier2) ? 256 : 128;
            if ((i2 & 3072) == 0) {
                i14 |= gapComposer2.changed(textStyle) ? 2048 : 1024;
            }
            i4 = i3 & 16;
            if (i4 == 0) {
                i14 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i14 |= gapComposer2.changed(j) ? 16384 : PKIFailureInfo.certRevoked;
                if ((i2 & 196608) == 0) {
                    if ((i3 & 32) == 0) {
                        markdownSpanValues2 = markdownSpanValues;
                        if (gapComposer2.changed(markdownSpanValues2)) {
                            i13 = PKIFailureInfo.unsupportedVersion;
                            i14 |= i13;
                        }
                    } else {
                        markdownSpanValues2 = markdownSpanValues;
                    }
                    i13 = 65536;
                    i14 |= i13;
                } else {
                    markdownSpanValues2 = markdownSpanValues;
                }
                if ((i2 & 1572864) == 0) {
                    i5 = i;
                    i14 |= ((i3 & 64) == 0 && gapComposer2.changed(i5)) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                } else {
                    i5 = i;
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                    i14 |= 12582912;
                    applier = applier2;
                } else {
                    applier = applier2;
                    if ((i2 & 12582912) == 0) {
                        i14 |= gapComposer2.changed(listOrderedColors$Subtle) ? 8388608 : 4194304;
                    }
                }
                i7 = i14;
                if (gapComposer2.shouldExecute(i7 & 1, (i14 & 4793491) != 4793490)) {
                    gapComposer2.startDefaults();
                    int i16 = i2 & 1;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (i16 == 0 || gapComposer2.getDefaultsInvalid()) {
                        if (i15 != 0) {
                            modifier2 = companion;
                        }
                        long j5 = i4 != 0 ? Color.Unspecified : j;
                        if ((i3 & 32) != 0) {
                            i9 = i7 & (-458753);
                            markdownSpanValues2 = MarkdownSpanValues.Default;
                        } else {
                            i9 = i7;
                        }
                        if ((i3 & 64) != 0) {
                            i10 = i9 & (-3670017);
                            i5 = 0;
                        } else {
                            i10 = i9;
                        }
                        listOrderedColors$Subtle3 = i6 != 0 ? ListOrderedColors$Subtle.INSTANCE$1 : listOrderedColors$Subtle;
                        markdownSpanValues4 = markdownSpanValues2;
                        i11 = i10;
                        j3 = j5;
                    } else {
                        gapComposer2.skipToGroupEnd();
                        if ((i3 & 32) != 0) {
                            i7 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            i7 &= -3670017;
                        }
                        j3 = j;
                        listOrderedColors$Subtle3 = listOrderedColors$Subtle;
                        markdownSpanValues4 = markdownSpanValues2;
                        i11 = i7;
                    }
                    int i17 = i5;
                    gapComposer2.endDefaults();
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    MarkdownSpanValues markdownSpanValues6 = new MarkdownSpanValues(new SpanStyle(colors.semantic.text.link, 0L, FontWeight.Medium, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61434).merge(markdownSpanValues4.linkSpan), markdownSpanValues4.boldSpan);
                    boolean z2 = ((i11 & 14) == 4) | ((((458752 & i11) ^ 196608) > 131072 && gapComposer2.changed(markdownSpanValues4)) || (i11 & 196608) == 131072);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (z2 || rememberedValue == neverEqualPolicy) {
                        AttributedString parseMarkdownWith = MarkdownParserKt.parseMarkdownWith(str, MarkdownParserKt.multiblockMarkdownRegex);
                        String str2 = parseMarkdownWith.text;
                        List list = parseMarkdownWith.attributeRanges;
                        markdownSpanValues5 = markdownSpanValues4;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            ListOrderedColors$Subtle listOrderedColors$Subtle5 = listOrderedColors$Subtle3;
                            int i18 = i11;
                            Attribute attribute = ((AttributeRange) obj).attribute;
                            Modifier modifier5 = modifier2;
                            if (Intrinsics.areEqual(attribute, Attribute.UnorderedListItem.INSTANCE) || (attribute instanceof Attribute.OrderedListItem)) {
                                arrayList.add(obj);
                            }
                            i11 = i18;
                            listOrderedColors$Subtle3 = listOrderedColors$Subtle5;
                            modifier2 = modifier5;
                        }
                        listOrderedColors$Subtle4 = listOrderedColors$Subtle3;
                        i12 = i11;
                        modifier4 = modifier2;
                        if (arrayList.isEmpty()) {
                            rememberedValue = CollectionsKt__CollectionsJVMKt.listOf(new MarkdownBlock.Text(Worker.DefaultImpls.toAnnotatedString(parseMarkdownWith, markdownSpanValues6, function2)));
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = arrayList.iterator();
                            int i19 = 0;
                            while (it.hasNext()) {
                                AttributeRange attributeRange = (AttributeRange) it.next();
                                int i20 = attributeRange.beginIndexInclusive;
                                Iterator it2 = it;
                                int i21 = attributeRange.endIndexExclusive;
                                Attribute attribute2 = attributeRange.attribute;
                                AttributedString inlineText = Worker.DefaultImpls.getInlineText(str2, i19, i20, list);
                                if (inlineText != null) {
                                    arrayList2.add(new MarkdownBlock.Text(Worker.DefaultImpls.toAnnotatedString(inlineText, markdownSpanValues6, function2)));
                                }
                                if (Intrinsics.areEqual(attribute2, Attribute.UnorderedListItem.INSTANCE)) {
                                    String obj2 = StringsKt.trim(str2.substring(i20, i21)).toString();
                                    obj2.getClass();
                                    orderedListItem = new MarkdownBlock.UnorderedListItem(Worker.DefaultImpls.toAnnotatedString(MarkdownParserKt.parseMarkdownWith(obj2, MarkdownParserKt.inlineMarkdownRegex), markdownSpanValues6, function2));
                                } else if (!(attribute2 instanceof Attribute.OrderedListItem)) {
                                    a$$ExternalSyntheticBUOutline0.m$1("Unhandled self-contained markdown block attribute.");
                                    return;
                                } else {
                                    String obj3 = StringsKt.trim(str2.substring(i20, i21)).toString();
                                    obj3.getClass();
                                    orderedListItem = new MarkdownBlock.OrderedListItem(((Attribute.OrderedListItem) attribute2).number, Worker.DefaultImpls.toAnnotatedString(MarkdownParserKt.parseMarkdownWith(obj3, MarkdownParserKt.inlineMarkdownRegex), markdownSpanValues6, function2));
                                }
                                arrayList2.add(orderedListItem);
                                i19 = i21;
                                it = it2;
                            }
                            AttributedString inlineText2 = Worker.DefaultImpls.getInlineText(str2, i19, str2.length(), list);
                            if (inlineText2 != null) {
                                arrayList2.add(new MarkdownBlock.Text(Worker.DefaultImpls.toAnnotatedString(inlineText2, markdownSpanValues6, function2)));
                            }
                            rememberedValue = arrayList2;
                        }
                        gapComposer2.updateRememberedValue(rememberedValue);
                    } else {
                        markdownSpanValues5 = markdownSpanValues4;
                        listOrderedColors$Subtle4 = listOrderedColors$Subtle3;
                        i12 = i11;
                        modifier4 = modifier2;
                    }
                    List list2 = (List) rememberedValue;
                    Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                    int i22 = 6;
                    BiasAlignment.Horizontal horizontal = i17 == 3 ? Alignment.Companion.CenterHorizontally : i17 == 6 ? Alignment.Companion.End : Alignment.Companion.Start;
                    IntrinsicSize intrinsicSize = IntrinsicSize.Min;
                    Modifier width = OffsetKt.width(modifier4);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$SpacedAligned, horizontal, gapComposer2, 6);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, width);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    gapComposer2.startReplaceGroup(1671016720);
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        MarkdownBlock markdownBlock = (MarkdownBlock) it3.next();
                        if (markdownBlock instanceof MarkdownBlock.Text) {
                            gapComposer2.startReplaceGroup(261966849);
                            int i23 = i12 >> 3;
                            GapComposer gapComposer3 = gapComposer2;
                            Room.m1164Text25TpFw(0, 0, 0, i17, (i23 & 7168) | (i23 & 896) | 48 | (234881024 & (i12 << 6)), 0, 3824, j3, (Composer) gapComposer3, SizeKt.fillMaxWidth(companion, 1.0f), ((MarkdownBlock.Text) markdownBlock).annotatedString, textStyle, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                            gapComposer3.end(false);
                            gapComposer2 = gapComposer3;
                            i17 = i17;
                            neverEqualPolicy = neverEqualPolicy;
                        } else {
                            GapComposer gapComposer4 = gapComposer2;
                            NeverEqualPolicy neverEqualPolicy2 = neverEqualPolicy;
                            int i24 = i17;
                            long j6 = j3;
                            if (markdownBlock instanceof MarkdownBlock.UnorderedListItem) {
                                gapComposer4.startReplaceGroup(262239773);
                                Arrangement$SpacedAligned arrangement$SpacedAligned2 = new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
                                Modifier.Companion companion2 = companion;
                                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion2, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                                Object rememberedValue2 = gapComposer4.rememberedValue();
                                if (rememberedValue2 == neverEqualPolicy2) {
                                    rememberedValue2 = new NavBarBinding$$ExternalSyntheticLambda2(15);
                                    gapComposer4.updateRememberedValue(rememberedValue2);
                                }
                                Modifier semantics = SemanticsModifierKt.semantics(m302paddingqDBjuR0$default, true, (Function1) rememberedValue2);
                                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$SpacedAligned2, Alignment.Companion.Top, gapComposer4, i22);
                                Iterator it4 = it3;
                                int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
                                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, semantics);
                                ComposeUiNode.Companion.getClass();
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                if (applier == null) {
                                    Updater.invalidApplier();
                                    throw null;
                                }
                                gapComposer4.startReusableNode();
                                if (gapComposer4.inserting) {
                                    gapComposer4.createNode(layoutNode$Companion$Constructor$12);
                                } else {
                                    gapComposer4.useNode();
                                }
                                Updater.m576setimpl(gapComposer4, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                                Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer4, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                                gapComposer4.startReplaceGroup(-209887199);
                                if (j6 != 16) {
                                    j4 = j6;
                                    z = false;
                                } else {
                                    gapComposer4.startReplaceGroup(1044898235);
                                    long j7 = ((Color) gapComposer4.consume(ArcadeThemeKt.LocalTextColor)).value;
                                    long j8 = j7 != 16 ? j7 : Strings.getColors(gapComposer4).semantic.text.standard;
                                    z = false;
                                    gapComposer4.end(false);
                                    j4 = j8;
                                }
                                gapComposer4.end(z);
                                i22 = 6;
                                m303BulletRPmYEkk(j4, gapComposer4, 6);
                                j3 = j6;
                                i17 = i24;
                                Room.m1164Text25TpFw(0, 0, 0, i17, ((i12 >> 3) & 8064) | ((i12 << 6) & 234881024), 0, 3824, j3, (Composer) gapComposer4, (Modifier) new WithAlignmentLineElement(AlignmentLinesKt.FirstLineCenter), ((MarkdownBlock.UnorderedListItem) markdownBlock).annotatedString, textStyle, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                                gapComposer2 = gapComposer4;
                                gapComposer2.end(true);
                                gapComposer2.end(false);
                                companion = companion2;
                                neverEqualPolicy = neverEqualPolicy2;
                                it3 = it4;
                            } else {
                                Iterator it5 = it3;
                                Modifier.Companion companion3 = companion;
                                j3 = j6;
                                if (!(markdownBlock instanceof MarkdownBlock.OrderedListItem)) {
                                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, 1671017644, false);
                                }
                                gapComposer4.startReplaceGroup(262786458);
                                MarkdownBlock.OrderedListItem orderedListItem2 = (MarkdownBlock.OrderedListItem) markdownBlock;
                                i17 = i24;
                                ListOrderedKt.OrderedListItemStandard(((i12 >> 12) & 7168) | 48, gapComposer4, Expect_jvmKt.rememberComposableLambda(566644396, new BasicShieetScope$$ExternalSyntheticLambda13(i24, 5, j3, orderedListItem2, textStyle), gapComposer4), null, listOrderedColors$Subtle4, orderedListItem2.number);
                                gapComposer4.end(false);
                                companion = companion3;
                                neverEqualPolicy = neverEqualPolicy2;
                                it3 = it5;
                                gapComposer2 = gapComposer4;
                            }
                        }
                    }
                    gapComposer = gapComposer2;
                    gapComposer.end(false);
                    gapComposer.end(true);
                    listOrderedColors$Subtle2 = listOrderedColors$Subtle4;
                    i8 = i17;
                    j2 = j3;
                    markdownSpanValues3 = markdownSpanValues5;
                    modifier3 = modifier4;
                } else {
                    gapComposer = gapComposer2;
                    gapComposer.skipToGroupEnd();
                    j2 = j;
                    listOrderedColors$Subtle2 = listOrderedColors$Subtle;
                    modifier3 = modifier2;
                    i8 = i5;
                    markdownSpanValues3 = markdownSpanValues2;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new Function2() { // from class: com.squareup.cash.arcade.components.text.MarkdownTextKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            ((Integer) obj5).getClass();
                            LazyDslKt.m305MultiblockMarkdown1kVgcOc(str, function2, modifier3, textStyle, j2, markdownSpanValues3, i8, listOrderedColors$Subtle2, (Composer) obj4, Updater.updateChangedFlags(i2 | 1), i3);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            if ((i2 & 196608) == 0) {
            }
            if ((i2 & 1572864) == 0) {
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            i7 = i14;
            if (gapComposer2.shouldExecute(i7 & 1, (i14 & 4793491) != 4793490)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 3072) == 0) {
        }
        i4 = i3 & 16;
        if (i4 == 0) {
        }
        if ((i2 & 196608) == 0) {
        }
        if ((i2 & 1572864) == 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        i7 = i14;
        if (gapComposer2.shouldExecute(i7 & 1, (i14 & 4793491) != 4793490)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void QuickActionThumbButton(Icons icons, Icons icons2, boolean z, String str, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(722274324);
        int i2 = i | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changed(str) ? 2048 : 1024) | (gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            RealHapticVibrator realHapticVibrator = (RealHapticVibrator) gapComposer.consume(HapticVibratorKt.LocalHapticVibrator);
            Haptics haptics = (Haptics) gapComposer.consume(HapticsKt.LocalHaptics);
            float f = z ? 0.0f : 1.0f;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = MotionKt.LocalMotion;
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f, TargetUtils.fast$default((zzb) ((Motion) gapComposer.consume(staticProvidableCompositionLocal)).springs.text), "outlineThumbIconAlpha", null, gapComposer, 3072, 20);
            State animateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, TargetUtils.fast$default((zzb) ((Motion) gapComposer.consume(staticProvidableCompositionLocal)).springs.text), "filledThumbIconAlpha", null, gapComposer, 3072, 20);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 24.0f);
            boolean z2 = (i2 & 7168) == 2048;
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (z2 || rememberedValue == obj) {
                rememberedValue = new ClusterItemKt$$ExternalSyntheticLambda3(str, 16);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m285size3ABfNKs, false, (Function1) rememberedValue);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
            RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, false, 20.0f, null, gapComposer, 432, 9);
            Role role = new Role(0);
            boolean changedInstance = ((i2 & 57344) == 16384) | gapComposer.changedInstance(realHapticVibrator) | gapComposer.changed(haptics);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue3 == obj) {
                rememberedValue3 = new SuggestionUiKt$$ExternalSyntheticLambda2(realHapticVibrator, haptics, function0, 3);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(semantics, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, str, role, (Function0) rememberedValue3, 4);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.CenterStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m182clickableO2vRcR0$default);
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
            gapComposer = gapComposer;
            Trace.m1191Iconww6aTOc(icons, (String) null, AlphaKt.alpha(companion, ((Number) animateFloatAsState.getValue()).floatValue()), 0L, gapComposer, 54, 8);
            Trace.m1191Iconww6aTOc(icons2, (String) null, AlphaKt.alpha(companion, ((Number) animateFloatAsState2.getValue()).floatValue()), 0L, gapComposer, 54, 8);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda30(icons, icons2, z, str, function0, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void QuickActionsBar(final MessageViewModel.MoneybotMessageViewModel.ThumbState thumbState, final Function0 function0, final Function0 function02, final Function0 function03, Function0 function04, boolean z, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        GapComposer gapComposer;
        boolean z3;
        RecomposeScopeImpl endRestartGroup;
        final boolean z4;
        final boolean z5;
        Colors colors;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1257322804);
        if ((i & 6) == 0) {
            i3 = (gapComposer2.changed(thumbState.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changedInstance(function03) ? 2048 : 1024;
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            z2 = z;
            i3 |= gapComposer2.changed(z2) ? PKIFailureInfo.unsupportedVersion : 65536;
            if (gapComposer2.shouldExecute(i3 & 1, (66707 & i3) == 66706)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                z3 = z2;
            } else {
                boolean z6 = i4 != 0 ? true : z2;
                final RealHapticVibrator realHapticVibrator = (RealHapticVibrator) gapComposer2.consume(HapticVibratorKt.LocalHapticVibrator);
                final Haptics haptics = (Haptics) gapComposer2.consume(HapticsKt.LocalHaptics);
                final String stringResource = Room.stringResource(gapComposer2, R.string.moneybot_message_copy_button_content_description);
                final String stringResource2 = Room.stringResource(gapComposer2, R.string.moneybot_message_caret_up_button_content_description);
                final String stringResource3 = Room.stringResource(gapComposer2, R.string.moneybot_message_caret_down_button_content_description);
                MessageViewModel.MoneybotMessageViewModel.ThumbState thumbState2 = MessageViewModel.MoneybotMessageViewModel.ThumbState.THUMBS_UP;
                final float f = thumbState == thumbState2 ? 1.0f : RecyclerView.DECELERATION_RATE;
                MessageViewModel.MoneybotMessageViewModel.ThumbState thumbState3 = MessageViewModel.MoneybotMessageViewModel.ThumbState.THUMBS_DOWN;
                float f2 = thumbState != thumbState3 ? RecyclerView.DECELERATION_RATE : 1.0f;
                boolean z7 = thumbState != thumbState3;
                if (thumbState != thumbState2) {
                    z4 = z7;
                    z5 = true;
                } else {
                    z4 = z7;
                    z5 = false;
                }
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ArcadeThemeKt.LocalIconColor;
                final boolean z8 = z6;
                Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                    colors = colors2;
                }
                ProvidedValue m = Recorder$$ExternalSyntheticOutline2.m(colors.semantic.icon.subtle, dynamicProvidableCompositionLocal);
                gapComposer = gapComposer2;
                final float f3 = f2;
                Updater.CompositionLocalProvider(m, Expect_jvmKt.rememberComposableLambda(-1300112268, new Function2() { // from class: com.squareup.cash.moneybot.views.message.MoneybotMessageUiKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        int intValue = ((Integer) obj2).intValue();
                        final int i5 = 0;
                        GapComposer gapComposer3 = (GapComposer) composer2;
                        if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                            SpringSpec fast$default = TargetUtils.fast$default((zzb) ((Motion) gapComposer3.consume(MotionKt.LocalMotion)).springs.text);
                            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                            Modifier animateContentSize$default = AnimatedContentKt.animateContentSize$default(companion, fast$default, 2);
                            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer3, 0);
                            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, animateContentSize$default);
                            ComposeUiNode.Companion.getClass();
                            Function0 function05 = ComposeUiNode.Companion.Constructor;
                            if (gapComposer3.applier == null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer3.startReusableNode();
                            if (gapComposer3.inserting) {
                                gapComposer3.createNode(function05);
                            } else {
                                gapComposer3.useNode();
                            }
                            Updater.m576setimpl(gapComposer3, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                            boolean z9 = z8;
                            if (z9) {
                                gapComposer3.startReplaceGroup(1558486583);
                                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 24.0f);
                                String str = stringResource;
                                boolean changed = gapComposer3.changed(str);
                                Object rememberedValue = gapComposer3.rememberedValue();
                                Object obj3 = Composer.Companion.Empty;
                                if (changed || rememberedValue == obj3) {
                                    rememberedValue = new ClusterItemKt$$ExternalSyntheticLambda3(str, 15);
                                    gapComposer3.updateRememberedValue(rememberedValue);
                                }
                                Modifier semantics = SemanticsModifierKt.semantics(m285size3ABfNKs, false, (Function1) rememberedValue);
                                Icons icons = Icons.Copy16;
                                BiasAlignment biasAlignment = Alignment.Companion.CenterStart;
                                RealHapticVibrator realHapticVibrator2 = realHapticVibrator;
                                boolean changedInstance = gapComposer3.changedInstance(realHapticVibrator2);
                                Haptics haptics2 = haptics;
                                boolean changed2 = changedInstance | gapComposer3.changed(haptics2);
                                Function0 function06 = function0;
                                boolean changed3 = changed2 | gapComposer3.changed(function06);
                                Object rememberedValue2 = gapComposer3.rememberedValue();
                                if (changed3 || rememberedValue2 == obj3) {
                                    rememberedValue2 = new SuggestionUiKt$$ExternalSyntheticLambda2(realHapticVibrator2, haptics2, function06, 2);
                                    gapComposer3.updateRememberedValue(rememberedValue2);
                                }
                                StorageUtil.ButtonIcon(icons, str, (Function0) rememberedValue2, semantics, false, biasAlignment, gapComposer3, 196614, 16);
                                gapComposer3.end(false);
                            } else {
                                gapComposer3.startReplaceGroup(1558889490);
                                gapComposer3.end(false);
                            }
                            Modifier zIndex = ZIndexModifierKt.zIndex(companion, f);
                            final MessageViewModel.MoneybotMessageViewModel.ThumbState thumbState4 = thumbState;
                            final String str2 = stringResource2;
                            final Function0 function07 = function02;
                            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(790025282, new Function2() { // from class: com.squareup.cash.moneybot.views.message.MoneybotMessageUiKt$$ExternalSyntheticLambda18
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    int i6 = i5;
                                    MessageViewModel.MoneybotMessageViewModel.ThumbState thumbState5 = thumbState4;
                                    Composer composer3 = (Composer) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    switch (i6) {
                                        case 0:
                                            GapComposer gapComposer4 = (GapComposer) composer3;
                                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                LazyDslKt.QuickActionThumbButton(Icons.ThumbsUp16, Icons.ThumbsUpFill16, thumbState5 == MessageViewModel.MoneybotMessageViewModel.ThumbState.THUMBS_UP, str2, function07, gapComposer4, 54);
                                            } else {
                                                gapComposer4.skipToGroupEnd();
                                            }
                                            break;
                                        default:
                                            GapComposer gapComposer5 = (GapComposer) composer3;
                                            if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                LazyDslKt.QuickActionThumbButton(Icons.ThumbsDown16, Icons.ThumbsDownFill16, thumbState5 == MessageViewModel.MoneybotMessageViewModel.ThumbState.THUMBS_DOWN, str2, function07, gapComposer5, 54);
                                            } else {
                                                gapComposer5.skipToGroupEnd();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer3);
                            boolean z10 = z4;
                            LazyDslKt.ThumbActionVisibility(z10, z9, zIndex, false, false, rememberComposableLambda, gapComposer3, 196608, 24);
                            boolean z11 = z9 || z10;
                            Modifier zIndex2 = ZIndexModifierKt.zIndex(companion, f3);
                            final String str3 = stringResource3;
                            final Function0 function08 = function03;
                            final int i6 = 1;
                            LazyDslKt.ThumbActionVisibility(z5, z11, zIndex2, true, false, Expect_jvmKt.rememberComposableLambda(-1397700373, new Function2() { // from class: com.squareup.cash.moneybot.views.message.MoneybotMessageUiKt$$ExternalSyntheticLambda18
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    int i62 = i6;
                                    MessageViewModel.MoneybotMessageViewModel.ThumbState thumbState5 = thumbState4;
                                    Composer composer3 = (Composer) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    switch (i62) {
                                        case 0:
                                            GapComposer gapComposer4 = (GapComposer) composer3;
                                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                LazyDslKt.QuickActionThumbButton(Icons.ThumbsUp16, Icons.ThumbsUpFill16, thumbState5 == MessageViewModel.MoneybotMessageViewModel.ThumbState.THUMBS_UP, str3, function08, gapComposer4, 54);
                                            } else {
                                                gapComposer4.skipToGroupEnd();
                                            }
                                            break;
                                        default:
                                            GapComposer gapComposer5 = (GapComposer) composer3;
                                            if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                LazyDslKt.QuickActionThumbButton(Icons.ThumbsDown16, Icons.ThumbsDownFill16, thumbState5 == MessageViewModel.MoneybotMessageViewModel.ThumbState.THUMBS_DOWN, str3, function08, gapComposer5, 54);
                                            } else {
                                                gapComposer5.skipToGroupEnd();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer3), gapComposer3, 199680, 16);
                            gapComposer3.end(true);
                        } else {
                            gapComposer3.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, 56);
                z3 = z8;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new IconButtonKt$$ExternalSyntheticLambda0(thumbState, function0, function02, function03, function04, z3, i, i2, 10);
                return;
            }
            return;
        }
        z2 = z;
        if (gapComposer2.shouldExecute(i3 & 1, (66707 & i3) == 66706)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ThumbActionVisibility(final boolean z, final boolean z2, final Modifier modifier, boolean z3, boolean z4, ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i, final int i2) {
        final boolean z5;
        int i3;
        final ComposableLambdaImpl composableLambdaImpl2;
        final boolean z6;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1903253496);
        int i4 = 2;
        int i5 = (gapComposer.changed(z) ? 4 : 2) | i | (gapComposer.changed(z2) ? 32 : 16) | (gapComposer.changed(modifier) ? 256 : 128);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i5 |= 3072;
        } else if ((i & 3072) == 0) {
            z5 = z3;
            i5 |= gapComposer.changed(z5) ? 2048 : 1024;
            i3 = i5 | 24576;
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
                composableLambdaImpl2 = composableLambdaImpl;
                gapComposer.skipToGroupEnd();
                z6 = z4;
            } else {
                if (i6 != 0) {
                    z5 = false;
                }
                LayoutDirection layoutDirection = (LayoutDirection) gapComposer.consume(CompositionLocalsKt.LocalLayoutDirection);
                int mo230roundToPx0680j_4 = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo230roundToPx0680j_4(32.0f);
                if (layoutDirection != LayoutDirection.Rtl) {
                    mo230roundToPx0680j_4 = -mo230roundToPx0680j_4;
                }
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = MotionKt.LocalMotion;
                SpringSpec fast$default = TargetUtils.fast$default((zzb) ((Motion) gapComposer.consume(staticProvidableCompositionLocal)).springs.text);
                BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                EnterTransitionImpl plus = EnterExitTransitionKt.expandHorizontally$default(fast$default, horizontal, 8).plus(EnterExitTransitionKt.fadeIn$default(TargetUtils.sharp$default((zzb) ((Motion) gapComposer.consume(staticProvidableCompositionLocal)).springs.text), 2));
                ExitTransitionImpl shrinkHorizontally$default = EnterExitTransitionKt.shrinkHorizontally$default(TargetUtils.fast$default((zzb) ((Motion) gapComposer.consume(staticProvidableCompositionLocal)).springs.text), horizontal, 8);
                gapComposer.startReplaceGroup(-1960637178);
                ExitTransitionImpl fadeOut$default = EnterExitTransitionKt.fadeOut$default(TargetUtils.sharp$default((zzb) ((Motion) gapComposer.consume(staticProvidableCompositionLocal)).springs.text), 2);
                gapComposer.end(false);
                ExitTransitionImpl plus2 = shrinkHorizontally$default.plus(fadeOut$default);
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (z5) {
                    gapComposer.startReplaceGroup(-1960395688);
                    SpringSpec fast$default2 = TargetUtils.fast$default((zzb) ((Motion) gapComposer.consume(staticProvidableCompositionLocal)).springs.text);
                    boolean changed = gapComposer.changed(mo230roundToPx0680j_4);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new DatePickerKt$$ExternalSyntheticLambda10(mo230roundToPx0680j_4, i4);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    plus = plus.plus(EnterExitTransitionKt.slideInHorizontally(fast$default2, (Function1) rememberedValue));
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1960202589);
                    gapComposer.end(false);
                }
                EnterTransitionImpl enterTransitionImpl = plus;
                if (z5) {
                    gapComposer.startReplaceGroup(-1960132839);
                    SpringSpec fast$default3 = TargetUtils.fast$default((zzb) ((Motion) gapComposer.consume(staticProvidableCompositionLocal)).springs.text);
                    boolean changed2 = gapComposer.changed(mo230roundToPx0680j_4);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new DatePickerKt$$ExternalSyntheticLambda10(mo230roundToPx0680j_4, i4);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    plus2 = plus2.plus(EnterExitTransitionKt.slideOutHorizontally(fast$default3, (Function1) rememberedValue2));
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1959940732);
                    gapComposer.end(false);
                }
                composableLambdaImpl2 = composableLambdaImpl;
                AnimatedContentKt.AnimatedVisibility(z, modifier, enterTransitionImpl, plus2, (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(269712944, new MoneyTabUIKt$$ExternalSyntheticLambda16(z2, composableLambdaImpl2, 3), gapComposer), (Composer) gapComposer, (i3 & 14) | 196608 | ((i3 >> 3) & 112), 16);
                z6 = true;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new Function2() { // from class: com.squareup.cash.moneybot.views.message.MoneybotMessageUiKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        LazyDslKt.ThumbActionVisibility(z, z2, modifier, z5, z6, composableLambdaImpl2, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        z5 = z3;
        i3 = i5 | 24576;
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) == 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
