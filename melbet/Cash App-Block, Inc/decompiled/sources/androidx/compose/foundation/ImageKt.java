package androidx.compose.foundation;

import android.content.res.Configuration;
import android.view.KeyEvent;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.pager.PagerBringIntoViewSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.InvalidationTracker$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes.dex */
public abstract class ImageKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Image(final Painter painter, final String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        ContentScale contentScale2;
        int i6;
        float f2;
        int i7;
        ColorFilter colorFilter2;
        int i8;
        final Modifier modifier3;
        final ContentScale contentScale3;
        final float f3;
        final ColorFilter colorFilter3;
        final Alignment alignment2;
        RecomposeScopeImpl endRestartGroup;
        Alignment alignment3;
        ContentScale contentScale4;
        Alignment alignment4;
        float f4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1142754848);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? gapComposer.changed(painter) : gapComposer.changedInstance(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(str) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= gapComposer.changed(alignment) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    contentScale2 = contentScale;
                    i3 |= gapComposer.changed(contentScale2) ? 16384 : PKIFailureInfo.certRevoked;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((196608 & i) == 0) {
                        f2 = f;
                        i3 |= gapComposer.changed(f2) ? PKIFailureInfo.unsupportedVersion : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((1572864 & i) == 0) {
                            colorFilter2 = colorFilter;
                            i3 |= gapComposer.changed(colorFilter2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                            i8 = i3;
                            int i10 = 0;
                            if (gapComposer.shouldExecute(i8 & 1, (i3 & 599187) == 599186)) {
                                gapComposer.skipToGroupEnd();
                                modifier3 = modifier2;
                                contentScale3 = contentScale2;
                                f3 = f2;
                                colorFilter3 = colorFilter2;
                                alignment2 = alignment;
                            } else {
                                Modifier modifier4 = Modifier.Companion.$$INSTANCE;
                                Modifier modifier5 = i9 != 0 ? modifier4 : modifier2;
                                Alignment alignment5 = i4 != 0 ? Alignment.Companion.Center : alignment;
                                if (i5 != 0) {
                                    alignment3 = alignment5;
                                    contentScale4 = ContentScale.Companion.Fit;
                                } else {
                                    alignment3 = alignment5;
                                    contentScale4 = contentScale2;
                                }
                                if (i6 != 0) {
                                    alignment4 = alignment3;
                                    f4 = 1.0f;
                                } else {
                                    alignment4 = alignment3;
                                    f4 = f2;
                                }
                                Alignment alignment6 = alignment4;
                                ColorFilter colorFilter4 = i7 != 0 ? null : colorFilter2;
                                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                if (str != null) {
                                    gapComposer.startReplaceGroup(1899222916);
                                    boolean z = (i8 & 112) == 32;
                                    Object rememberedValue = gapComposer.rememberedValue();
                                    if (z || rememberedValue == neverEqualPolicy) {
                                        rememberedValue = new ImageKt$$ExternalSyntheticLambda0(str, i10);
                                        gapComposer.updateRememberedValue(rememberedValue);
                                    }
                                    modifier4 = SemanticsModifierKt.semantics(modifier4, false, (Function1) rememberedValue);
                                    gapComposer.end(false);
                                } else {
                                    gapComposer.startReplaceGroup(1899381698);
                                    gapComposer.end(false);
                                }
                                Modifier modifier6 = modifier5;
                                Modifier paint$default = ClipKt.paint$default(ClipKt.clipToBounds(modifier5.then(modifier4)), painter, alignment6, contentScale4, f4, colorFilter4, 2);
                                Object rememberedValue2 = gapComposer.rememberedValue();
                                if (rememberedValue2 == neverEqualPolicy) {
                                    rememberedValue2 = ImageKt$Image$1$1.INSTANCE;
                                    gapComposer.updateRememberedValue(rememberedValue2);
                                }
                                MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
                                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, paint$default);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
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
                                Updater.m576setimpl(gapComposer, measurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                gapComposer.end(true);
                                f3 = f4;
                                colorFilter3 = colorFilter4;
                                alignment2 = alignment6;
                                contentScale3 = contentScale4;
                                modifier3 = modifier6;
                            }
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.block = new Function2() { // from class: androidx.compose.foundation.ImageKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        ImageKt.Image(Painter.this, str, modifier3, alignment2, contentScale3, f3, colorFilter3, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                                        return Unit.INSTANCE;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        colorFilter2 = colorFilter;
                        i8 = i3;
                        int i102 = 0;
                        if (gapComposer.shouldExecute(i8 & 1, (i3 & 599187) == 599186)) {
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    f2 = f;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    colorFilter2 = colorFilter;
                    i8 = i3;
                    int i1022 = 0;
                    if (gapComposer.shouldExecute(i8 & 1, (i3 & 599187) == 599186)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                contentScale2 = contentScale;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                f2 = f;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                colorFilter2 = colorFilter;
                i8 = i3;
                int i10222 = 0;
                if (gapComposer.shouldExecute(i8 & 1, (i3 & 599187) == 599186)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            contentScale2 = contentScale;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            f2 = f;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            colorFilter2 = colorFilter;
            i8 = i3;
            int i102222 = 0;
            if (gapComposer.shouldExecute(i8 & 1, (i3 & 599187) == 599186)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        contentScale2 = contentScale;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        f2 = f;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        colorFilter2 = colorFilter;
        i8 = i3;
        int i1022222 = 0;
        if (gapComposer.shouldExecute(i8 & 1, (i3 & 599187) == 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: Image-5h-nEew, reason: not valid java name */
    public static final void m176Image5hnEew(AndroidImageBitmap androidImageBitmap, String str, Modifier modifier, ContentScale contentScale, BlendModeColorFilter blendModeColorFilter, Composer composer, int i, int i2) {
        if ((i2 & 4) != 0) {
            modifier = Modifier.Companion.$$INSTANCE;
        }
        Modifier modifier2 = modifier;
        BiasAlignment biasAlignment = Alignment.Companion.Center;
        ContentScale contentScale2 = (i2 & 16) != 0 ? ContentScale.Companion.Fit : contentScale;
        BlendModeColorFilter blendModeColorFilter2 = (i2 & 64) != 0 ? null : blendModeColorFilter;
        GapComposer gapComposer = (GapComposer) composer;
        boolean changed = gapComposer.changed(androidImageBitmap);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = BitmapPainterKt.m760BitmapPainterQZhYCtY$default(androidImageBitmap, 1);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Image((BitmapPainter) rememberedValue, str, modifier2, biasAlignment, contentScale2, 1.0f, blendModeColorFilter2, gapComposer, (i & 112) | 8 | (i & 896) | (i & 7168) | (57344 & i) | (458752 & i) | (3670016 & i), 0);
    }

    public static Modifier background$default(Modifier modifier, Brush brush, Shape shape, int i) {
        if ((i & 2) != 0) {
            shape = ColorKt.RectangleShape;
        }
        return modifier.then(new BackgroundElement(0L, brush, shape, 1));
    }

    /* renamed from: background-bw27NRU, reason: not valid java name */
    public static final Modifier m177backgroundbw27NRU(Modifier modifier, long j, Shape shape) {
        return modifier.then(new BackgroundElement(j, null, shape, 2));
    }

    /* renamed from: border-xT4_qwU, reason: not valid java name */
    public static final Modifier m178borderxT4_qwU(Modifier modifier, float f, long j, Shape shape) {
        return m179borderziNgDLE(modifier, f, new SolidColor(j), shape);
    }

    /* renamed from: border-ziNgDLE, reason: not valid java name */
    public static final Modifier m179borderziNgDLE(Modifier modifier, float f, Brush brush, Shape shape) {
        return modifier.then(new BorderModifierNodeElement(f, brush, shape));
    }

    /* renamed from: checkScrollableContainerConstraints-K40F9xA, reason: not valid java name */
    public static final void m180checkScrollableContainerConstraintsK40F9xA(long j, Orientation orientation) {
        if (orientation == Orientation.Vertical) {
            if (Constraints.m1024getMaxHeightimpl(j) != Integer.MAX_VALUE) {
                return;
            }
            InlineClassHelperKt.throwIllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (Constraints.m1025getMaxWidthimpl(j) != Integer.MAX_VALUE) {
                return;
            }
            InlineClassHelperKt.throwIllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    /* renamed from: clickable-O2vRcR0, reason: not valid java name */
    public static final Modifier m181clickableO2vRcR0(Modifier modifier, MutableInteractionSourceImpl mutableInteractionSourceImpl, final IndicationNodeFactory indicationNodeFactory, final boolean z, final String str, final Role role, final Function0 function0) {
        Modifier then;
        if (indicationNodeFactory != null) {
            then = new ClickableElement(mutableInteractionSourceImpl, indicationNodeFactory, false, z, str, role, function0);
        } else if (indicationNodeFactory == null) {
            then = new ClickableElement(mutableInteractionSourceImpl, null, false, z, str, role, function0);
        } else {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            then = mutableInteractionSourceImpl != null ? IndicationKt.indication(companion, mutableInteractionSourceImpl, indicationNodeFactory).then(new ClickableElement(mutableInteractionSourceImpl, null, false, z, str, role, function0)) : PlatformKt.composed(companion, new Function3() { // from class: androidx.compose.foundation.ClickableKt$clickable-O2vRcR0$$inlined$clickableWithIndicationIfNeeded$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                    gapComposer.startReplaceGroup(-1525724089);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) rememberedValue;
                    Modifier then2 = IndicationKt.indication(Modifier.Companion.$$INSTANCE, mutableInteractionSourceImpl2, IndicationNodeFactory.this).then(new ClickableElement(mutableInteractionSourceImpl2, null, false, z, str, role, function0));
                    gapComposer.end(false);
                    return then2;
                }
            });
        }
        return modifier.then(then);
    }

    /* renamed from: clickable-O2vRcR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m182clickableO2vRcR0$default(Modifier modifier, MutableInteractionSourceImpl mutableInteractionSourceImpl, IndicationNodeFactory indicationNodeFactory, boolean z, String str, Role role, Function0 function0, int i) {
        Role role2;
        Modifier modifier2;
        MutableInteractionSourceImpl mutableInteractionSourceImpl2;
        IndicationNodeFactory indicationNodeFactory2;
        Function0 function02;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        String str2 = (i & 8) != 0 ? null : str;
        if ((i & 16) != 0) {
            role2 = null;
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
            indicationNodeFactory2 = indicationNodeFactory;
            function02 = function0;
            modifier2 = modifier;
        } else {
            role2 = role;
            modifier2 = modifier;
            mutableInteractionSourceImpl2 = mutableInteractionSourceImpl;
            indicationNodeFactory2 = indicationNodeFactory;
            function02 = function0;
        }
        return m181clickableO2vRcR0(modifier2, mutableInteractionSourceImpl2, indicationNodeFactory2, z2, str2, role2, function02);
    }

    /* renamed from: clickable-oSLSa3U$default, reason: not valid java name */
    public static Modifier m183clickableoSLSa3U$default(Modifier modifier, boolean z, String str, Role role, Function0 function0, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        return modifier.then(new ClickableElement(null, null, true, z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : role, function0));
    }

    /* renamed from: combinedClickable-auXiCPI$default, reason: not valid java name */
    public static Modifier m184combinedClickableauXiCPI$default(Modifier modifier, MutableInteractionSourceImpl mutableInteractionSourceImpl, final RippleNodeFactory rippleNodeFactory, boolean z, String str, Role role, String str2, Function0 function0, final Function0 function02, int i) {
        Modifier composed;
        if ((i & 4) != 0) {
            z = true;
        }
        final boolean z2 = z;
        String str3 = (i & 8) != 0 ? null : str;
        Role role2 = (i & 16) != 0 ? null : role;
        String str4 = (i & 32) != 0 ? null : str2;
        final Function0 function03 = (i & 64) != 0 ? null : function0;
        if (rippleNodeFactory != null) {
            composed = new CombinedClickableElement(rippleNodeFactory, mutableInteractionSourceImpl, role2, str3, str4, function02, function03, false, z2);
        } else if (rippleNodeFactory == null) {
            composed = new CombinedClickableElement(null, mutableInteractionSourceImpl, role2, str3, str4, function02, function03, false, z2);
        } else {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (mutableInteractionSourceImpl != null) {
                composed = IndicationKt.indication(companion, mutableInteractionSourceImpl, rippleNodeFactory).then(new CombinedClickableElement(null, mutableInteractionSourceImpl, role2, str3, str4, function02, function03, false, z2));
            } else {
                final String str5 = str3;
                final Role role3 = role2;
                final String str6 = str4;
                composed = PlatformKt.composed(companion, new Function3() { // from class: androidx.compose.foundation.ClickableKt$combinedClickable-auXiCPI$$inlined$clickableWithIndicationIfNeeded$1
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        ((Number) obj3).intValue();
                        GapComposer gapComposer = (GapComposer) ((Composer) obj2);
                        gapComposer.startReplaceGroup(-1525724089);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                        }
                        MutableInteractionSourceImpl mutableInteractionSourceImpl2 = (MutableInteractionSourceImpl) rememberedValue;
                        Modifier then = IndicationKt.indication(Modifier.Companion.$$INSTANCE, mutableInteractionSourceImpl2, IndicationNodeFactory.this).then(new CombinedClickableElement(null, mutableInteractionSourceImpl2, role3, str5, str6, function02, function03, false, z2));
                        gapComposer.end(false);
                        return then;
                    }
                });
            }
        }
        return modifier.then(composed);
    }

    /* renamed from: isEnter-ZmokQxo, reason: not valid java name */
    public static final boolean m186isEnterZmokQxo(KeyEvent keyEvent) {
        long m782getKeyZmokQxo = KeyEventType.m782getKeyZmokQxo(keyEvent);
        int i = Key.$r8$clinit;
        return Key.m771equalsimpl0(m782getKeyZmokQxo, KeyEventType.m775getDirectionCenterEK5gGoQ()) || Key.m771equalsimpl0(m782getKeyZmokQxo, KeyEventType.m780getEnterEK5gGoQ()) || Key.m771equalsimpl0(m782getKeyZmokQxo, KeyEventType.m785getNumPadEnterEK5gGoQ()) || Key.m771equalsimpl0(m782getKeyZmokQxo, KeyEventType.m788getSpacebarEK5gGoQ());
    }

    public static final boolean isSystemInDarkTheme(Composer composer) {
        return (((Configuration) ((GapComposer) composer).consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).uiMode & 48) == 32;
    }

    public static final ScrollState rememberScrollState(Composer composer) {
        Object[] objArr = new Object[0];
        boolean changed = ((GapComposer) composer).changed(0);
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new InvalidationTracker$$ExternalSyntheticLambda0(7);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (ScrollState) SaverKt.m581rememberSaveable(objArr, (Saver) ScrollState.Saver, (Function0) rememberedValue, (Composer) gapComposer, 0);
    }

    public static Modifier scroll$default(Modifier modifier, ScrollState scrollState, boolean z, boolean z2) {
        Orientation orientation = z2 ? Orientation.Vertical : Orientation.Horizontal;
        MutableInteractionSourceImpl mutableInteractionSourceImpl = scrollState.internalInteractionSource;
        Orientation orientation2 = Orientation.Vertical;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        return modifier.then(orientation == orientation2 ? ClipKt.clip(companion, VerticalScrollableClipShape.INSTANCE) : ClipKt.clip(companion, HorizontalScrollableClipShape.INSTANCE)).then(new ScrollableAreaElement(null, null, null, orientation, scrollState, mutableInteractionSourceImpl, z, true)).then(new ScrollingLayoutElement(scrollState, z2));
    }

    public static final Modifier scrollableArea(Modifier modifier, ScrollableState scrollableState, Orientation orientation, AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, boolean z, FlingBehavior flingBehavior, MutableInteractionSourceImpl mutableInteractionSourceImpl, PagerBringIntoViewSpec pagerBringIntoViewSpec) {
        Orientation orientation2 = Orientation.Vertical;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        return modifier.then(orientation == orientation2 ? ClipKt.clip(companion, VerticalScrollableClipShape.INSTANCE) : ClipKt.clip(companion, HorizontalScrollableClipShape.INSTANCE)).then(new ScrollableAreaElement(androidEdgeEffectOverscrollEffect, pagerBringIntoViewSpec, flingBehavior, orientation, scrollableState, mutableInteractionSourceImpl, z, false));
    }

    /* renamed from: shrink-Kibmq7A, reason: not valid java name */
    public static final long m187shrinkKibmq7A(long j, float f) {
        float max = Math.max(RecyclerView.DECELERATION_RATE, Float.intBitsToFloat((int) (j >> 32)) - f);
        float max2 = Math.max(RecyclerView.DECELERATION_RATE, Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) - f);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & BodyPartID.bodyIdMax);
    }

    public static Modifier verticalScroll$default(Modifier modifier, ScrollState scrollState, boolean z, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        return scroll$default(modifier, scrollState, z, true);
    }
}
