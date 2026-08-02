package androidx.compose.foundation.text;

import android.content.res.Resources;
import androidx.camera.camera2.pipe.core.Threads$$ExternalSyntheticLambda1;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGesturesModifierKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda5;
import androidx.compose.material3.SliderKt$SliderImpl$2$1;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.OffsetApplier;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.input.pointer.AndroidPointerIconType;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.StringAnnotation;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.os.BundleKt;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.molecule.PlatformKt;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import radiography.Radiography$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public abstract class BasicTextKt {
    public static final KeyMapping_androidKt$platformDefaultKeyMapping$1 platformDefaultKeyMapping = new KeyMapping_androidKt$platformDefaultKeyMapping$1();
    public static final AndroidPointerIconType handwritingPointerIcon = new AndroidPointerIconType(IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* renamed from: BasicText-CL7eQgs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m346BasicTextCL7eQgs(final AnnotatedString annotatedString, Modifier modifier, final TextStyle textStyle, Function1 function1, final int i, final boolean z, final int i2, int i3, Map map, ColorProducer colorProducer, Composer composer, final int i4, final int i5) {
        Modifier modifier2;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        final Function1 function12;
        final Map map2;
        final ColorProducer colorProducer2;
        final Modifier modifier3;
        final int i13;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        Map map3;
        Function1 function13;
        Modifier modifier4;
        int i14;
        SelectionController selectionController;
        ?? r10;
        boolean z3;
        Modifier modifier5;
        Map map4;
        Function1 function14;
        int i15;
        GapComposer gapComposer2;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-1343466571);
        int i16 = (i4 & 6) == 0 ? (gapComposer3.changed(annotatedString) ? 4 : 2) | i4 : i4;
        int i17 = i5 & 2;
        if (i17 != 0) {
            i16 |= 48;
        } else if ((i4 & 48) == 0) {
            modifier2 = modifier;
            i16 |= gapComposer3.changed(modifier2) ? 32 : 16;
            if ((i4 & MLKEMEngine.KyberPolyBytes) == 0) {
                i16 |= gapComposer3.changed(textStyle) ? 256 : 128;
            }
            i6 = i5 & 8;
            if (i6 == 0) {
                i16 |= 3072;
            } else if ((i4 & 3072) == 0) {
                i16 |= gapComposer3.changedInstance(function1) ? 2048 : 1024;
                if ((i4 & 24576) == 0) {
                    i16 |= gapComposer3.changed(i) ? 16384 : PKIFailureInfo.certRevoked;
                }
                if ((196608 & i4) == 0) {
                    z2 = z;
                    i16 |= gapComposer3.changed(z2) ? PKIFailureInfo.unsupportedVersion : 65536;
                } else {
                    z2 = z;
                }
                if ((1572864 & i4) == 0) {
                    i16 |= gapComposer3.changed(i2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                }
                i7 = i5 & 128;
                if (i7 != 0) {
                    i16 |= 12582912;
                } else if ((12582912 & i4) == 0) {
                    i8 = i3;
                    i16 |= gapComposer3.changed(i8) ? 8388608 : 4194304;
                    i9 = i5 & 256;
                    if (i9 == 0) {
                        i16 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        i10 = i16 | (gapComposer3.changedInstance(map) ? 67108864 : 33554432);
                        i11 = i5 & 512;
                        if (i11 != 0) {
                            i10 |= 805306368;
                        } else if ((i4 & 805306368) == 0) {
                            i12 = i11;
                            i10 |= gapComposer3.changedInstance(colorProducer) ? PKIFailureInfo.duplicateCertReq : 268435456;
                            if (gapComposer3.shouldExecute(i10 & 1, (i10 & 306783379) == 306783378)) {
                                GapComposer gapComposer4 = gapComposer3;
                                gapComposer4.skipToGroupEnd();
                                function12 = function1;
                                map2 = map;
                                colorProducer2 = colorProducer;
                                modifier3 = modifier2;
                                i13 = i8;
                                gapComposer = gapComposer4;
                            } else {
                                if (i17 != 0) {
                                    modifier2 = Modifier.Companion.$$INSTANCE;
                                }
                                Function1 function15 = i6 != 0 ? null : function1;
                                Modifier modifier6 = modifier2;
                                int i18 = i7 != 0 ? 1 : i8;
                                if (i9 != 0) {
                                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                                    emptyMap.getClass();
                                    map3 = emptyMap;
                                } else {
                                    map3 = map;
                                }
                                ColorProducer colorProducer3 = i12 != 0 ? null : colorProducer;
                                validateMinMaxLines(i18, i2);
                                SelectionRegistrar selectionRegistrar = (SelectionRegistrar) gapComposer3.consume(SelectionRegistrarKt.LocalSelectionRegistrar);
                                Object obj = Composer.Companion.Empty;
                                if (selectionRegistrar != null) {
                                    gapComposer3.startReplaceGroup(1588268245);
                                    long m459getBackgroundColor0d7_KjU = ((TextSelectionColors) gapComposer3.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).m459getBackgroundColor0d7_KjU();
                                    Object[] objArr = {selectionRegistrar};
                                    function13 = function15;
                                    modifier4 = modifier6;
                                    i14 = i18;
                                    WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(8, new HintHandler$$ExternalSyntheticLambda0(selectionRegistrar, 3), new BasicTextKt$$ExternalSyntheticLambda14(0));
                                    boolean changedInstance = gapComposer3.changedInstance(selectionRegistrar);
                                    Object rememberedValue = gapComposer3.rememberedValue();
                                    if (changedInstance || rememberedValue == obj) {
                                        rememberedValue = new ImageLoader$Builder$$ExternalSyntheticLambda1(selectionRegistrar, 5);
                                        gapComposer3.updateRememberedValue(rememberedValue);
                                    }
                                    long longValue = ((Number) SaverKt.m581rememberSaveable(objArr, (Saver) workLauncherImpl, (Function0) rememberedValue, (Composer) gapComposer3, 0)).longValue();
                                    boolean changed = gapComposer3.changed(longValue) | gapComposer3.changed(selectionRegistrar) | gapComposer3.changed(m459getBackgroundColor0d7_KjU);
                                    Object rememberedValue2 = gapComposer3.rememberedValue();
                                    if (changed || rememberedValue2 == obj) {
                                        rememberedValue2 = new SelectionController(longValue, selectionRegistrar, m459getBackgroundColor0d7_KjU);
                                        gapComposer3.updateRememberedValue(rememberedValue2);
                                    }
                                    selectionController = (SelectionController) rememberedValue2;
                                    gapComposer3.end(false);
                                } else {
                                    function13 = function15;
                                    modifier4 = modifier6;
                                    i14 = i18;
                                    gapComposer3.startReplaceGroup(1588759409);
                                    gapComposer3.end(false);
                                    selectionController = null;
                                }
                                Pair pair = AnnotatedStringResolveInlineContentKt.EmptyInlineContent;
                                int length = annotatedString.text.length();
                                List list = annotatedString.annotations;
                                if (list != null) {
                                    int size = list.size();
                                    for (int i19 = 0; i19 < size; i19++) {
                                        AnnotatedString.Range range = (AnnotatedString.Range) list.get(i19);
                                        if ((range.item instanceof StringAnnotation) && "androidx.compose.foundation.text.inlineContent".equals(range.tag)) {
                                            r10 = 0;
                                            if (AnnotatedStringKt.intersect(0, length, range.start, range.end)) {
                                                z3 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                r10 = 0;
                                z3 = false;
                                boolean hasLinks = BundleKt.hasLinks(annotatedString);
                                FontFamilyResolverImpl fontFamilyResolverImpl = (FontFamilyResolverImpl) gapComposer3.consume(CompositionLocalsKt.LocalFontFamilyResolver);
                                if (z3 || hasLinks) {
                                    Function1 function16 = function13;
                                    ?? r14 = gapComposer3;
                                    SelectionController selectionController2 = selectionController;
                                    int i20 = r10;
                                    int i21 = i14;
                                    modifier5 = modifier4;
                                    r14.startReplaceGroup(1590022070);
                                    int i22 = (i10 & 14) == 4 ? 1 : i20;
                                    Object rememberedValue3 = r14.rememberedValue();
                                    if (i22 != 0 || rememberedValue3 == obj) {
                                        rememberedValue3 = Updater.mutableStateOf$default(annotatedString);
                                        r14.updateRememberedValue(rememberedValue3);
                                    }
                                    MutableState mutableState = (MutableState) rememberedValue3;
                                    AnnotatedString annotatedString2 = (AnnotatedString) mutableState.getValue();
                                    boolean changed2 = r14.changed(mutableState);
                                    Object rememberedValue4 = r14.rememberedValue();
                                    if (changed2 || rememberedValue4 == obj) {
                                        rememberedValue4 = new BasicTextKt$$ExternalSyntheticLambda1(i20, mutableState);
                                        r14.updateRememberedValue(rememberedValue4);
                                    }
                                    int i23 = i10 << 6;
                                    map4 = map3;
                                    m348LayoutWithLinksAndInlineContent11Od_4g(modifier5, annotatedString2, function16, z3, map4, textStyle, i, z, i2, i21, fontFamilyResolverImpl, selectionController2, colorProducer3, (Function1) rememberedValue4, r14, ((i10 >> 3) & 910) | ((i10 >> 12) & 57344) | ((i10 << 9) & 458752) | (3670016 & i23) | (29360128 & i23) | (234881024 & i23) | (i23 & 1879048192), ((i10 >> 21) & 896) | 24576);
                                    function14 = function16;
                                    i15 = i21;
                                    r14.end(false);
                                    gapComposer2 = r14;
                                } else {
                                    gapComposer3.startReplaceGroup(1589006262);
                                    BasicText_androidKt.BackgroundTextMeasurement(annotatedString, textStyle, fontFamilyResolverImpl, null, gapComposer3);
                                    boolean z4 = r10;
                                    GapComposer gapComposer5 = gapComposer3;
                                    i15 = i14;
                                    function14 = function13;
                                    modifier5 = modifier4;
                                    Modifier m349textModifierCL7eQgs = m349textModifierCL7eQgs(modifier5, annotatedString, textStyle, function14, i, z2, i2, i15, fontFamilyResolverImpl, null, null, selectionController, colorProducer3, null);
                                    int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
                                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, m349textModifierCL7eQgs);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                    if (gapComposer5.applier == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    gapComposer5.startReusableNode();
                                    if (gapComposer5.inserting) {
                                        gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                                    } else {
                                        gapComposer5.useNode();
                                    }
                                    Updater.m576setimpl(gapComposer5, EmptyMeasurePolicy.INSTANCE, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m575reconcileimpl(gapComposer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer5, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                    Updater.m576setimpl(gapComposer5, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    gapComposer5.end(true);
                                    gapComposer5.end(z4);
                                    map4 = map3;
                                    gapComposer2 = gapComposer5;
                                }
                                modifier3 = modifier5;
                                map2 = map4;
                                i13 = i15;
                                colorProducer2 = colorProducer3;
                                function12 = function14;
                                gapComposer = gapComposer2;
                            }
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.block = new Function2() { // from class: androidx.compose.foundation.text.BasicTextKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj2, Object obj3) {
                                        ((Integer) obj3).getClass();
                                        BasicTextKt.m346BasicTextCL7eQgs(AnnotatedString.this, modifier3, textStyle, function12, i, z, i2, i13, map2, colorProducer2, (Composer) obj2, Updater.updateChangedFlags(i4 | 1), i5);
                                        return Unit.INSTANCE;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        i12 = i11;
                        if (gapComposer3.shouldExecute(i10 & 1, (i10 & 306783379) == 306783378)) {
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i10 = i16;
                    i11 = i5 & 512;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    if (gapComposer3.shouldExecute(i10 & 1, (i10 & 306783379) == 306783378)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i8 = i3;
                i9 = i5 & 256;
                if (i9 == 0) {
                }
                i10 = i16;
                i11 = i5 & 512;
                if (i11 != 0) {
                }
                i12 = i11;
                if (gapComposer3.shouldExecute(i10 & 1, (i10 & 306783379) == 306783378)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            if ((i4 & 24576) == 0) {
            }
            if ((196608 & i4) == 0) {
            }
            if ((1572864 & i4) == 0) {
            }
            i7 = i5 & 128;
            if (i7 != 0) {
            }
            i8 = i3;
            i9 = i5 & 256;
            if (i9 == 0) {
            }
            i10 = i16;
            i11 = i5 & 512;
            if (i11 != 0) {
            }
            i12 = i11;
            if (gapComposer3.shouldExecute(i10 & 1, (i10 & 306783379) == 306783378)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i4 & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        i6 = i5 & 8;
        if (i6 == 0) {
        }
        if ((i4 & 24576) == 0) {
        }
        if ((196608 & i4) == 0) {
        }
        if ((1572864 & i4) == 0) {
        }
        i7 = i5 & 128;
        if (i7 != 0) {
        }
        i8 = i3;
        i9 = i5 & 256;
        if (i9 == 0) {
        }
        i10 = i16;
        i11 = i5 & 512;
        if (i11 != 0) {
        }
        i12 = i11;
        if (gapComposer3.shouldExecute(i10 & 1, (i10 & 306783379) == 306783378)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0331  */
    /* renamed from: BasicText-RWo7tUw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m347BasicTextRWo7tUw(String str, Modifier modifier, final TextStyle textStyle, Function1 function1, int i, boolean z, int i2, int i3, ColorProducer colorProducer, Composer composer, final int i4, final int i5) {
        int i6;
        Modifier modifier2;
        int i7;
        Function1 function12;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        final boolean z2;
        final int i17;
        final Modifier modifier3;
        final Function1 function13;
        final int i18;
        GapComposer gapComposer;
        final int i19;
        final ColorProducer colorProducer2;
        RecomposeScopeImpl endRestartGroup;
        int i20;
        SelectionController selectionController;
        boolean z3;
        Modifier m349textModifierCL7eQgs;
        final String str2 = str;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1040751001);
        if ((i4 & 6) == 0) {
            i6 = (gapComposer2.changed(str2) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i21 = i5 & 2;
        if (i21 != 0) {
            i6 |= 48;
        } else if ((i4 & 48) == 0) {
            modifier2 = modifier;
            i6 |= gapComposer2.changed(modifier2) ? 32 : 16;
            if ((i4 & MLKEMEngine.KyberPolyBytes) == 0) {
                i6 |= gapComposer2.changed(textStyle) ? 256 : 128;
            }
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i4 & 3072) == 0) {
                function12 = function1;
                i6 |= gapComposer2.changedInstance(function12) ? 2048 : 1024;
                i8 = i5 & 16;
                if (i8 != 0) {
                    i6 |= 24576;
                } else if ((i4 & 24576) == 0) {
                    i9 = i;
                    i6 |= gapComposer2.changed(i9) ? 16384 : PKIFailureInfo.certRevoked;
                    i10 = i5 & 32;
                    if (i10 == 0) {
                        i6 |= 196608;
                    } else if ((196608 & i4) == 0) {
                        i6 |= gapComposer2.changed(z) ? PKIFailureInfo.unsupportedVersion : 65536;
                        i11 = i5 & 64;
                        if (i11 != 0) {
                            i6 |= 1572864;
                        } else if ((1572864 & i4) == 0) {
                            i6 |= gapComposer2.changed(i2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                            int i22 = i6;
                            i12 = i5 & 128;
                            if (i12 == 0) {
                                i14 = i22 | 12582912;
                                i13 = i12;
                            } else if ((i4 & 12582912) == 0) {
                                i13 = i12;
                                i14 = i22 | (gapComposer2.changed(i3) ? 8388608 : 4194304);
                            } else {
                                i13 = i12;
                                i14 = i22;
                            }
                            i15 = i5 & 256;
                            if (i15 == 0) {
                                i14 |= 100663296;
                            } else if ((i4 & 100663296) == 0) {
                                i16 = i15;
                                i14 |= gapComposer2.changedInstance(colorProducer) ? 67108864 : 33554432;
                                if ((i5 & 512) != 0) {
                                    i14 |= 805306368;
                                } else if ((i4 & 805306368) == 0) {
                                    i14 |= (i4 & 1073741824) == 0 ? gapComposer2.changed((Object) null) : gapComposer2.changedInstance(null) ? PKIFailureInfo.duplicateCertReq : 268435456;
                                }
                                if (gapComposer2.shouldExecute(i14 & 1, (i14 & 306783379) != 306783378)) {
                                    Modifier modifier4 = i21 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                                    Function1 function14 = i7 != 0 ? null : function12;
                                    int i23 = i8 != 0 ? 1 : i9;
                                    boolean z4 = i10 != 0 ? true : z;
                                    int i24 = i11 != 0 ? Integer.MAX_VALUE : i2;
                                    int i25 = i13 != 0 ? 1 : i3;
                                    ColorProducer colorProducer3 = i16 != 0 ? null : colorProducer;
                                    validateMinMaxLines(i25, i24);
                                    SelectionRegistrar selectionRegistrar = (SelectionRegistrar) gapComposer2.consume(SelectionRegistrarKt.LocalSelectionRegistrar);
                                    if (selectionRegistrar != null) {
                                        gapComposer2.startReplaceGroup(356423075);
                                        long m459getBackgroundColor0d7_KjU = ((TextSelectionColors) gapComposer2.consume(TextSelectionColorsKt.getLocalTextSelectionColors())).m459getBackgroundColor0d7_KjU();
                                        Object[] objArr = {selectionRegistrar};
                                        i20 = i23;
                                        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(8, new HintHandler$$ExternalSyntheticLambda0(selectionRegistrar, 3), new BasicTextKt$$ExternalSyntheticLambda14(0));
                                        boolean changedInstance = gapComposer2.changedInstance(selectionRegistrar);
                                        Object rememberedValue = gapComposer2.rememberedValue();
                                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                        if (changedInstance || rememberedValue == neverEqualPolicy) {
                                            rememberedValue = new Threads$$ExternalSyntheticLambda1(selectionRegistrar, 18);
                                            gapComposer2.updateRememberedValue(rememberedValue);
                                        }
                                        long longValue = ((Number) SaverKt.m581rememberSaveable(objArr, (Saver) workLauncherImpl, (Function0) rememberedValue, (Composer) gapComposer2, 0)).longValue();
                                        boolean changed = gapComposer2.changed(longValue) | gapComposer2.changed(selectionRegistrar) | gapComposer2.changed(m459getBackgroundColor0d7_KjU);
                                        Object rememberedValue2 = gapComposer2.rememberedValue();
                                        if (changed || rememberedValue2 == neverEqualPolicy) {
                                            rememberedValue2 = new SelectionController(longValue, selectionRegistrar, m459getBackgroundColor0d7_KjU);
                                            gapComposer2.updateRememberedValue(rememberedValue2);
                                        }
                                        gapComposer2.end(false);
                                        selectionController = (SelectionController) rememberedValue2;
                                    } else {
                                        i20 = i23;
                                        gapComposer2.startReplaceGroup(356914239);
                                        gapComposer2.end(false);
                                        selectionController = null;
                                    }
                                    FontFamilyResolverImpl fontFamilyResolverImpl = (FontFamilyResolverImpl) gapComposer2.consume(CompositionLocalsKt.LocalFontFamilyResolver);
                                    Executor executor = (Executor) gapComposer2.consume(BasicText_androidKt.LocalBackgroundTextMeasurementExecutor);
                                    if (executor == null || !BasicText_androidKt.shouldPrefetch(str.length())) {
                                        z3 = false;
                                        gapComposer2.startReplaceGroup(1255914055);
                                        gapComposer2.end(false);
                                    } else {
                                        gapComposer2.startReplaceGroup(1254298614);
                                        try {
                                            try {
                                                executor.execute(new Radiography$$ExternalSyntheticLambda0(textStyle, (LayoutDirection) gapComposer2.consume(CompositionLocalsKt.LocalLayoutDirection), str, (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity), fontFamilyResolverImpl, 1));
                                            } catch (RejectedExecutionException unused) {
                                                fontFamilyResolverImpl = fontFamilyResolverImpl;
                                            }
                                        } catch (RejectedExecutionException unused2) {
                                        }
                                        z3 = false;
                                        gapComposer2.end(false);
                                    }
                                    if (selectionController == null && function14 == null) {
                                        gapComposer2.startReplaceGroup(357875859);
                                        gapComposer2.end(z3);
                                        str2 = str;
                                        m349textModifierCL7eQgs = modifier4.then(new TextStringSimpleElement(str2, textStyle, fontFamilyResolverImpl, i20, z4, i24, i25, colorProducer3));
                                    } else {
                                        str2 = str;
                                        gapComposer2.startReplaceGroup(357232113);
                                        m349textModifierCL7eQgs = m349textModifierCL7eQgs(modifier4, new AnnotatedString(str2), textStyle, function14, i20, z4, i24, i25, (FontFamilyResolverImpl) gapComposer2.consume(CompositionLocalsKt.LocalFontFamilyResolver), null, null, selectionController, colorProducer3, null);
                                        gapComposer2.end(false);
                                    }
                                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m349textModifierCL7eQgs);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
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
                                    Updater.m576setimpl(gapComposer2, EmptyMeasurePolicy.INSTANCE, ComposeUiNode.Companion.SetMeasurePolicy);
                                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                                    gapComposer2.end(true);
                                    gapComposer = gapComposer2;
                                    modifier3 = modifier4;
                                    function13 = function14;
                                    colorProducer2 = colorProducer3;
                                    i17 = i25;
                                    i19 = i24;
                                    z2 = z4;
                                    i18 = i20;
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                    z2 = z;
                                    i17 = i3;
                                    modifier3 = modifier2;
                                    function13 = function12;
                                    i18 = i9;
                                    gapComposer = gapComposer2;
                                    i19 = i2;
                                    colorProducer2 = colorProducer;
                                }
                                endRestartGroup = gapComposer.endRestartGroup();
                                if (endRestartGroup != null) {
                                    endRestartGroup.block = new Function2() { // from class: androidx.compose.foundation.text.BasicTextKt$$ExternalSyntheticLambda12
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            ((Integer) obj2).getClass();
                                            BasicTextKt.m347BasicTextRWo7tUw(str2, modifier3, textStyle, function13, i18, z2, i19, i17, colorProducer2, (Composer) obj, Updater.updateChangedFlags(i4 | 1), i5);
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    return;
                                }
                                return;
                            }
                            i16 = i15;
                            if ((i5 & 512) != 0) {
                            }
                            if (gapComposer2.shouldExecute(i14 & 1, (i14 & 306783379) != 306783378)) {
                            }
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup != null) {
                            }
                        }
                        int i222 = i6;
                        i12 = i5 & 128;
                        if (i12 == 0) {
                        }
                        i15 = i5 & 256;
                        if (i15 == 0) {
                        }
                        i16 = i15;
                        if ((i5 & 512) != 0) {
                        }
                        if (gapComposer2.shouldExecute(i14 & 1, (i14 & 306783379) != 306783378)) {
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                        }
                    }
                    i11 = i5 & 64;
                    if (i11 != 0) {
                    }
                    int i2222 = i6;
                    i12 = i5 & 128;
                    if (i12 == 0) {
                    }
                    i15 = i5 & 256;
                    if (i15 == 0) {
                    }
                    i16 = i15;
                    if ((i5 & 512) != 0) {
                    }
                    if (gapComposer2.shouldExecute(i14 & 1, (i14 & 306783379) != 306783378)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i9 = i;
                i10 = i5 & 32;
                if (i10 == 0) {
                }
                i11 = i5 & 64;
                if (i11 != 0) {
                }
                int i22222 = i6;
                i12 = i5 & 128;
                if (i12 == 0) {
                }
                i15 = i5 & 256;
                if (i15 == 0) {
                }
                i16 = i15;
                if ((i5 & 512) != 0) {
                }
                if (gapComposer2.shouldExecute(i14 & 1, (i14 & 306783379) != 306783378)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function12 = function1;
            i8 = i5 & 16;
            if (i8 != 0) {
            }
            i9 = i;
            i10 = i5 & 32;
            if (i10 == 0) {
            }
            i11 = i5 & 64;
            if (i11 != 0) {
            }
            int i222222 = i6;
            i12 = i5 & 128;
            if (i12 == 0) {
            }
            i15 = i5 & 256;
            if (i15 == 0) {
            }
            i16 = i15;
            if ((i5 & 512) != 0) {
            }
            if (gapComposer2.shouldExecute(i14 & 1, (i14 & 306783379) != 306783378)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i4 & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        function12 = function1;
        i8 = i5 & 16;
        if (i8 != 0) {
        }
        i9 = i;
        i10 = i5 & 32;
        if (i10 == 0) {
        }
        i11 = i5 & 64;
        if (i11 != 0) {
        }
        int i2222222 = i6;
        i12 = i5 & 128;
        if (i12 == 0) {
        }
        i15 = i5 & 256;
        if (i15 == 0) {
        }
        i16 = i15;
        if ((i5 & 512) != 0) {
        }
        if (gapComposer2.shouldExecute(i14 & 1, (i14 & 306783379) != 306783378)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void CommonContextMenuArea(TextFieldSelectionState textFieldSelectionState, boolean z, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        Modifier modifier;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1442752422);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(textFieldSelectionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 256 : 128;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.startReplaceGroup(-1299459355);
            if (z) {
                gapComposer.startReplaceGroup(-1299415211);
                boolean changedInstance = gapComposer.changedInstance(textFieldSelectionState);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1(textFieldSelectionState, null, i3);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                modifier = TextContextMenuGesturesModifierKt.showTextContextMenuOnSecondaryClick((Function2) rememberedValue);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1298836224);
                gapComposer.end(false);
                modifier = Modifier.Companion.$$INSTANCE;
            }
            AndroidTextContextMenuToolbarProvider_androidKt.ProvideDefaultPlatformTextContextMenuProviders(modifier, composableLambdaImpl, gapComposer, (i2 >> 3) & 112);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ContextMenu_androidKt$$ExternalSyntheticLambda0(textFieldSelectionState, z, composableLambdaImpl, i, 1);
        }
    }

    public static final void ContextMenuArea(TextFieldSelectionState textFieldSelectionState, boolean z, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-579239002);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(textFieldSelectionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            CommonContextMenuArea(textFieldSelectionState, z, composableLambdaImpl, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ContextMenu_androidKt$$ExternalSyntheticLambda0(textFieldSelectionState, z, composableLambdaImpl, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: LayoutWithLinksAndInlineContent-11Od_4g, reason: not valid java name */
    public static final void m348LayoutWithLinksAndInlineContent11Od_4g(final Modifier modifier, final AnnotatedString annotatedString, final Function1 function1, final boolean z, final Map map, final TextStyle textStyle, final int i, final boolean z2, final int i2, final int i3, final FontFamilyResolverImpl fontFamilyResolverImpl, final SelectionController selectionController, final ColorProducer colorProducer, final Function1 function12, Composer composer, final int i4, final int i5) {
        int i6;
        int i7;
        GapComposer gapComposer;
        final TextLinkScope textLinkScope;
        Function0 function0;
        Function0 function02;
        Pair pair;
        Object obj;
        MutableState mutableState;
        Function1 function13;
        int i8;
        Object obj2;
        Object textMeasurePolicy;
        Map map2 = map;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-2118572703);
        if ((i4 & 6) == 0) {
            i6 = (gapComposer2.changed(modifier) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= gapComposer2.changed(annotatedString) ? 32 : 16;
        }
        if ((i4 & MLKEMEngine.KyberPolyBytes) == 0) {
            i6 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= gapComposer2.changed(z) ? 2048 : 1024;
        }
        int i9 = i4 & 24576;
        int i10 = PKIFailureInfo.certRevoked;
        if (i9 == 0) {
            i6 |= gapComposer2.changedInstance(map2) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i6 |= gapComposer2.changed(textStyle) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i4) == 0) {
            i6 |= gapComposer2.changed(i) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= gapComposer2.changed(z2) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= gapComposer2.changed(i2) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= gapComposer2.changed(i3) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i5 & 6) == 0) {
            i7 = i5 | (gapComposer2.changedInstance(fontFamilyResolverImpl) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= gapComposer2.changedInstance(selectionController) ? 32 : 16;
        }
        if ((i5 & MLKEMEngine.KyberPolyBytes) == 0) {
            i7 |= gapComposer2.changedInstance(colorProducer) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= gapComposer2.changedInstance(function12) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            if ((i5 & 32768) == 0 ? gapComposer2.changed((Object) null) : gapComposer2.changedInstance(null)) {
                i10 = 16384;
            }
            i7 |= i10;
        }
        if (gapComposer2.shouldExecute(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 9363) == 9362) ? false : true)) {
            boolean hasLinks = BundleKt.hasLinks(annotatedString);
            Object obj3 = Composer.Companion.Empty;
            if (hasLinks) {
                gapComposer2.startReplaceGroup(145641571);
                boolean z3 = (i6 & 112) == 32;
                Object rememberedValue = gapComposer2.rememberedValue();
                Object obj4 = rememberedValue;
                if (z3 || rememberedValue == obj3) {
                    Object textLinkScope2 = new TextLinkScope(annotatedString);
                    gapComposer2.updateRememberedValue(textLinkScope2);
                    obj4 = textLinkScope2;
                }
                gapComposer2.end(false);
                textLinkScope = (TextLinkScope) obj4;
            } else {
                gapComposer2.startReplaceGroup(145707228);
                gapComposer2.end(false);
                textLinkScope = null;
            }
            if (BundleKt.hasLinks(annotatedString)) {
                gapComposer2.startReplaceGroup(145905443);
                boolean changed = ((i6 & 112) == 32) | gapComposer2.changed(textLinkScope);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                Object obj5 = rememberedValue2;
                if (changed || rememberedValue2 == obj3) {
                    Object dialogHostKt$$ExternalSyntheticLambda0 = new DialogHostKt$$ExternalSyntheticLambda0(13, textLinkScope, annotatedString);
                    gapComposer2.updateRememberedValue(dialogHostKt$$ExternalSyntheticLambda0);
                    obj5 = dialogHostKt$$ExternalSyntheticLambda0;
                }
                function0 = (Function0) obj5;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(146002721);
                boolean z4 = (i6 & 112) == 32;
                Object rememberedValue3 = gapComposer2.rememberedValue();
                Object obj6 = rememberedValue3;
                if (z4 || rememberedValue3 == obj3) {
                    Object threads$$ExternalSyntheticLambda1 = new Threads$$ExternalSyntheticLambda1(annotatedString, 19);
                    gapComposer2.updateRememberedValue(threads$$ExternalSyntheticLambda1);
                    obj6 = threads$$ExternalSyntheticLambda1;
                }
                function0 = (Function0) obj6;
                gapComposer2.end(false);
            }
            if (z) {
                if (map2 != null) {
                    Pair pair2 = AnnotatedStringResolveInlineContentKt.EmptyInlineContent;
                    if (!map2.isEmpty()) {
                        function02 = function0;
                        List stringAnnotations = annotatedString.getStringAnnotations(annotatedString.text.length(), "androidx.compose.foundation.text.inlineContent");
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int size = stringAnnotations.size();
                        int i11 = 0;
                        while (i11 < size) {
                            List list = stringAnnotations;
                            AnnotatedString.Range range = (AnnotatedString.Range) stringAnnotations.get(i11);
                            int i12 = size;
                            Object obj7 = range.item;
                            int i13 = i11;
                            int i14 = range.end;
                            int i15 = range.start;
                            InlineTextContent inlineTextContent = (InlineTextContent) map2.get(obj7);
                            if (inlineTextContent != null) {
                                arrayList.add(new AnnotatedString.Range(inlineTextContent.getPlaceholder(), i15, i14));
                                arrayList2.add(new AnnotatedString.Range(inlineTextContent.getChildren(), i15, i14));
                            }
                            i11 = i13 + 1;
                            map2 = map;
                            size = i12;
                            stringAnnotations = list;
                        }
                        pair = new Pair(arrayList, arrayList2);
                        obj = null;
                    }
                }
                function02 = function0;
                pair = AnnotatedStringResolveInlineContentKt.EmptyInlineContent;
                obj = null;
            } else {
                function02 = function0;
                obj = null;
                pair = new Pair(null, null);
            }
            List list2 = (List) pair.first;
            List list3 = (List) pair.second;
            if (z) {
                gapComposer2.startReplaceGroup(146318828);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                Object obj8 = rememberedValue4;
                if (rememberedValue4 == obj3) {
                    Object mutableStateOf$default = Updater.mutableStateOf$default(obj);
                    gapComposer2.updateRememberedValue(mutableStateOf$default);
                    obj8 = mutableStateOf$default;
                }
                mutableState = (MutableState) obj8;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(146406588);
                gapComposer2.end(false);
                mutableState = null;
            }
            if (z) {
                gapComposer2.startReplaceGroup(146499837);
                boolean changed2 = gapComposer2.changed(mutableState);
                Object rememberedValue5 = gapComposer2.rememberedValue();
                Object obj9 = rememberedValue5;
                if (changed2 || rememberedValue5 == obj3) {
                    Object dateInputKt$$ExternalSyntheticLambda5 = new DateInputKt$$ExternalSyntheticLambda5(2, mutableState);
                    gapComposer2.updateRememberedValue(dateInputKt$$ExternalSyntheticLambda5);
                    obj9 = dateInputKt$$ExternalSyntheticLambda5;
                }
                gapComposer2.end(false);
                function13 = (Function1) obj9;
            } else {
                gapComposer2.startReplaceGroup(146571260);
                gapComposer2.end(false);
                function13 = null;
            }
            int i16 = (i6 >> 3) & 14;
            BasicText_androidKt.BackgroundTextMeasurement(annotatedString, textStyle, fontFamilyResolverImpl, list2, gapComposer2);
            AnnotatedString annotatedString2 = (AnnotatedString) function02.invoke();
            boolean changedInstance = gapComposer2.changedInstance(textLinkScope) | ((i6 & 896) == 256);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue6 == obj3) {
                i8 = 0;
                Object basicTextKt$$ExternalSyntheticLambda6 = new BasicTextKt$$ExternalSyntheticLambda6(textLinkScope, function1, i8);
                gapComposer2.updateRememberedValue(basicTextKt$$ExternalSyntheticLambda6);
                obj2 = basicTextKt$$ExternalSyntheticLambda6;
            } else {
                i8 = 0;
                obj2 = rememberedValue6;
            }
            GapComposer gapComposer3 = gapComposer2;
            boolean z5 = i8;
            Modifier m349textModifierCL7eQgs = m349textModifierCL7eQgs(modifier, annotatedString2, textStyle, (Function1) obj2, i, z2, i2, i3, fontFamilyResolverImpl, list2, function13, selectionController, colorProducer, function12);
            if (z) {
                gapComposer3.startReplaceGroup(147927697);
                boolean changedInstance2 = gapComposer3.changedInstance(textLinkScope);
                Object rememberedValue7 = gapComposer3.rememberedValue();
                Object obj10 = rememberedValue7;
                if (changedInstance2 || rememberedValue7 == obj3) {
                    final int i17 = 1;
                    Object obj11 = new Function0() { // from class: androidx.compose.foundation.text.BasicTextKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i18 = i17;
                            boolean z6 = false;
                            TextLinkScope textLinkScope3 = textLinkScope;
                            switch (i18) {
                                case 0:
                                    if (textLinkScope3 != null) {
                                        AnnotatedString annotatedString3 = textLinkScope3.text;
                                        TextLayoutResult textLayoutResult = (TextLayoutResult) textLinkScope3.textLayoutResult$delegate.getValue();
                                        z6 = Intrinsics.areEqual(annotatedString3, textLayoutResult != null ? textLayoutResult.layoutInput.text : null);
                                    }
                                    return Boolean.valueOf(z6);
                                default:
                                    if (textLinkScope3 != null) {
                                        AnnotatedString annotatedString4 = textLinkScope3.text;
                                        TextLayoutResult textLayoutResult2 = (TextLayoutResult) textLinkScope3.textLayoutResult$delegate.getValue();
                                        z6 = Intrinsics.areEqual(annotatedString4, textLayoutResult2 != null ? textLayoutResult2.layoutInput.text : null);
                                    }
                                    return Boolean.valueOf(z6);
                            }
                        }
                    };
                    gapComposer3.updateRememberedValue(obj11);
                    obj10 = obj11;
                }
                Function0 function03 = (Function0) obj10;
                boolean changed3 = gapComposer3.changed(mutableState);
                Object rememberedValue8 = gapComposer3.rememberedValue();
                Object obj12 = rememberedValue8;
                if (changed3 || rememberedValue8 == obj3) {
                    Object tooltipKt$$ExternalSyntheticLambda1 = new TooltipKt$$ExternalSyntheticLambda1(6, mutableState);
                    gapComposer3.updateRememberedValue(tooltipKt$$ExternalSyntheticLambda1);
                    obj12 = tooltipKt$$ExternalSyntheticLambda1;
                }
                textMeasurePolicy = new TextMeasurePolicy(z5 ? 1 : 0, function03, (Function0) obj12);
                gapComposer3.end(z5);
            } else {
                gapComposer3.startReplaceGroup(147750935);
                boolean changedInstance3 = gapComposer3.changedInstance(textLinkScope);
                Object rememberedValue9 = gapComposer3.rememberedValue();
                Object obj13 = rememberedValue9;
                if (changedInstance3 || rememberedValue9 == obj3) {
                    final int i18 = z5 ? 1 : 0;
                    Object obj14 = new Function0() { // from class: androidx.compose.foundation.text.BasicTextKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i182 = i18;
                            boolean z6 = false;
                            TextLinkScope textLinkScope3 = textLinkScope;
                            switch (i182) {
                                case 0:
                                    if (textLinkScope3 != null) {
                                        AnnotatedString annotatedString3 = textLinkScope3.text;
                                        TextLayoutResult textLayoutResult = (TextLayoutResult) textLinkScope3.textLayoutResult$delegate.getValue();
                                        z6 = Intrinsics.areEqual(annotatedString3, textLayoutResult != null ? textLayoutResult.layoutInput.text : null);
                                    }
                                    return Boolean.valueOf(z6);
                                default:
                                    if (textLinkScope3 != null) {
                                        AnnotatedString annotatedString4 = textLinkScope3.text;
                                        TextLayoutResult textLayoutResult2 = (TextLayoutResult) textLinkScope3.textLayoutResult$delegate.getValue();
                                        z6 = Intrinsics.areEqual(annotatedString4, textLayoutResult2 != null ? textLayoutResult2.layoutInput.text : null);
                                    }
                                    return Boolean.valueOf(z6);
                            }
                        }
                    };
                    gapComposer3.updateRememberedValue(obj14);
                    obj13 = obj14;
                }
                textMeasurePolicy = new SliderKt$SliderImpl$2$1((Function0) obj13, 1);
                gapComposer3.end(z5);
            }
            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, m349textModifierCL7eQgs);
            ComposeUiNode.Companion.getClass();
            Function0 function04 = ComposeUiNode.Companion.Constructor;
            if (gapComposer3.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer3.startReusableNode();
            if (gapComposer3.inserting) {
                gapComposer3.createNode(function04);
            } else {
                gapComposer3.useNode();
            }
            Updater.m576setimpl(gapComposer3, textMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
            if (textLinkScope == null) {
                gapComposer3.startReplaceGroup(-433557001);
            } else {
                gapComposer3.startReplaceGroup(-291080374);
                textLinkScope.LinksComposables(gapComposer3, z5 ? 1 : 0);
            }
            gapComposer3.end(z5);
            if (list3 == null) {
                gapComposer3.startReplaceGroup(-433506223);
                gapComposer3.end(z5);
            } else {
                gapComposer3.startReplaceGroup(-433506222);
                AnnotatedStringResolveInlineContentKt.InlineChildren(annotatedString, list3, gapComposer3, i16);
                gapComposer3.end(z5);
            }
            gapComposer3.end(true);
            gapComposer = gapComposer3;
        } else {
            GapComposer gapComposer4 = gapComposer2;
            gapComposer4.skipToGroupEnd();
            gapComposer = gapComposer4;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: androidx.compose.foundation.text.BasicTextKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj15, Object obj16) {
                    ((Integer) obj16).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i4 | 1);
                    int updateChangedFlags2 = Updater.updateChangedFlags(i5);
                    BasicTextKt.m348LayoutWithLinksAndInlineContent11Od_4g(Modifier.this, annotatedString, function1, z, map, textStyle, i, z2, i2, i3, fontFamilyResolverImpl, selectionController, colorProducer, function12, (Composer) obj15, updateChangedFlags, updateChangedFlags2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final ArrayList access$measureWithTextRangeMeasureConstraints(List list, Function0 function0) {
        if (!((Boolean) function0.invoke()).booleanValue()) {
            return null;
        }
        TextRangeLayoutMeasureScope textRangeLayoutMeasureScope = new TextRangeLayoutMeasureScope();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Measurable measurable = (Measurable) list.get(i);
            Object parentData = measurable.getParentData();
            parentData.getClass();
            OffsetApplier measure = ((TextRangeLayoutModifier) parentData).getMeasurePolicy().measure(textRangeLayoutMeasureScope);
            arrayList.add(new Pair(measurable.mo833measureBRTryo0(DimensionKt.m1465fitPrioritizingWidthZbe2FdA(measure.getWidth(), measure.getWidth(), measure.getHeight(), measure.getHeight())), measure.getPlace()));
        }
        return arrayList;
    }

    public static final int ceilToIntPx(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final void textItem(TextContextMenuBuilderScope textContextMenuBuilderScope, Resources resources, TextContextMenuItems textContextMenuItems, boolean z, Function1 function1) {
        if (z) {
            MooncakeTheme.item(textContextMenuBuilderScope, textContextMenuItems.getKey(), resources.getString(textContextMenuItems.m364getStringId9Hzcbyc()), textContextMenuItems.m363getDrawableId3I4p1mQ(), function1);
        }
    }

    /* renamed from: textModifier-CL7eQgs, reason: not valid java name */
    public static final Modifier m349textModifierCL7eQgs(Modifier modifier, AnnotatedString annotatedString, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, int i3, FontFamilyResolverImpl fontFamilyResolverImpl, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, Function1 function13) {
        if (selectionController == null) {
            return modifier.then(Modifier.Companion.$$INSTANCE).then(new TextAnnotatedStringElement(annotatedString, textStyle, fontFamilyResolverImpl, function1, i, z, i2, i3, list, function12, colorProducer, function13));
        }
        return modifier.then(selectionController.modifier).then(new SelectableTextAnnotatedStringElement(annotatedString, textStyle, fontFamilyResolverImpl, function1, i, z, i2, i3, list, function12, selectionController, colorProducer));
    }

    public static final void validateMinMaxLines(int i, int i2) {
        if (!(i > 0 && i2 > 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    public static final void ContextMenuArea(TextFieldSelectionManager textFieldSelectionManager, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2080741862);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            CommonContextMenuArea(textFieldSelectionManager, composableLambdaImpl, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ContextMenu_androidKt$$ExternalSyntheticLambda1(textFieldSelectionManager, composableLambdaImpl, i, i3);
        }
    }

    public static final void ContextMenuArea(SelectionManager selectionManager, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-954926513);
        int i2 = (gapComposer.changedInstance(selectionManager) ? 4 : 2) | i;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            CommonContextMenuArea(selectionManager, composableLambdaImpl, gapComposer, i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ContextMenu_androidKt$$ExternalSyntheticLambda2(selectionManager, composableLambdaImpl, i, i3);
        }
    }

    public static final void CommonContextMenuArea(TextFieldSelectionManager textFieldSelectionManager, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1533506138);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 32 : 16;
        }
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.startReplaceGroup(-885604480);
            AndroidTextContextMenuToolbarProvider_androidKt.ProvideDefaultPlatformTextContextMenuProviders(textFieldSelectionManager.getContextMenuAreaModifier(), composableLambdaImpl, gapComposer, i2 & 112);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ContextMenu_androidKt$$ExternalSyntheticLambda1(textFieldSelectionManager, composableLambdaImpl, i, i3);
        }
    }

    public static final void CommonContextMenuArea(SelectionManager selectionManager, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-614342087);
        int i2 = (gapComposer.changedInstance(selectionManager) ? 4 : 2) | i;
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.startReplaceGroup(-1009319487);
            AndroidTextContextMenuToolbarProvider_androidKt.ProvideDefaultPlatformTextContextMenuProviders(selectionManager.getContextMenuAreaModifier(), composableLambdaImpl, gapComposer, 48);
            gapComposer.end(false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ContextMenu_androidKt$$ExternalSyntheticLambda2(selectionManager, composableLambdaImpl, i, i3);
        }
    }
}
