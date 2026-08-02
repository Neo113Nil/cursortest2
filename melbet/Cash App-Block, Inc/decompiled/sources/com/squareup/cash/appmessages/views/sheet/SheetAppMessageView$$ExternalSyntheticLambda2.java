package com.squareup.cash.appmessages.views.sheet;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.unit.Dp;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.appmessages.sheet.SheetAppMessageModel;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda8;
import com.squareup.cash.moneybot.views.markdown.MoneybotMarkdownKt;
import com.squareup.cash.sheet.RealSheetState;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.guava.ListenableFutureKt;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.ast.ASTNodeImpl;
import org.intellij.markdown.flavours.gfm.GFMElementTypes;
import org.intellij.markdown.flavours.gfm.GFMTokenTypes;

/* loaded from: classes5.dex */
public final /* synthetic */ class SheetAppMessageView$$ExternalSyntheticLambda2 implements Function3 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ SheetAppMessageView$$ExternalSyntheticLambda2(float f, ASTNodeImpl aSTNodeImpl, Function5 function5, String str, Function6 function6) {
        this.f$2 = f;
        this.f$0 = aSTNodeImpl;
        this.f$1 = function5;
        this.f$3 = str;
        this.f$4 = function6;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier fillMaxWidth;
        Throwable th;
        int i = this.$r8$classId;
        Object obj4 = this.f$4;
        Object obj5 = this.f$3;
        Object obj6 = this.f$1;
        Object obj7 = this.f$0;
        switch (i) {
            case 0:
                SheetAppMessageView sheetAppMessageView = (SheetAppMessageView) obj7;
                SheetAppMessageModel sheetAppMessageModel = (SheetAppMessageModel) obj6;
                Function1 function1 = (Function1) obj5;
                RealSheetState realSheetState = (RealSheetState) obj4;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(sheetAppMessageView.imageLoader), Expect_jvmKt.rememberComposableLambda(-1257818393, new TooltipBoxKt$$ExternalSyntheticLambda8(sheetAppMessageModel, this.f$2, sheetAppMessageView, function1, paddingValues, realSheetState), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                ASTNodeImpl aSTNodeImpl = (ASTNodeImpl) obj7;
                Function5 function5 = (Function5) obj6;
                String str = (String) obj5;
                Function6 function6 = (Function6) obj4;
                BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                Integer num = 0;
                boxWithConstraintsScopeImpl.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    float m259getMaxWidthD9Ej5fM = boxWithConstraintsScopeImpl.m259getMaxWidthD9Ej5fM();
                    float f = this.f$2;
                    int m1036compareTo0680j_4 = Dp.m1036compareTo0680j_4(m259getMaxWidthD9Ej5fM, f);
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (m1036compareTo0680j_4 <= 0) {
                        gapComposer2.startReplaceGroup(1123637633);
                        fillMaxWidth = SizeKt.m284requiredWidth3ABfNKs(ImageKt.scroll$default(companion, ImageKt.rememberScrollState(gapComposer2), true, false), f);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1123737236);
                        gapComposer2.end(false);
                        fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    }
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    Throwable th2 = null;
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
                    MoneybotMarkdownKt.SpacerVerticalSmall(null, gapComposer2, 0);
                    gapComposer2.startReplaceGroup(-418802392);
                    int i2 = 0;
                    for (Object obj8 : aSTNodeImpl.getChildren()) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            Throwable th3 = th2;
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw th3;
                        }
                        ASTNodeImpl aSTNodeImpl2 = (ASTNodeImpl) obj8;
                        MarkdownElementType markdownElementType = aSTNodeImpl2.f1630type;
                        if (Intrinsics.areEqual(markdownElementType, GFMElementTypes.HEADER)) {
                            gapComposer2.startReplaceGroup(-1707950303);
                            th = th2;
                            function5.invoke(str, aSTNodeImpl2, new Dp(f), gapComposer2, num);
                            gapComposer2.end(false);
                        } else {
                            th = th2;
                            if (Intrinsics.areEqual(markdownElementType, GFMElementTypes.ROW)) {
                                gapComposer2.startReplaceGroup(-1707948448);
                                GapComposer gapComposer3 = gapComposer2;
                                Integer num2 = num;
                                String str2 = str;
                                function6.invoke(str2, aSTNodeImpl2, new Dp(f), Boolean.valueOf(i2 != CollectionsKt__CollectionsKt.getLastIndex(aSTNodeImpl.getChildren())), gapComposer3, num2);
                                str = str2;
                                gapComposer2 = gapComposer3;
                                num = num2;
                                gapComposer2.end(false);
                            } else if (Intrinsics.areEqual(markdownElementType, GFMTokenTypes.TABLE_SEPARATOR)) {
                                gapComposer2.startReplaceGroup(-1707945301);
                                ListenableFutureKt.m4197MarkdownDivideraMcp0Q(null, 0L, RecyclerView.DECELERATION_RATE, gapComposer2, 0, 7);
                                gapComposer2.end(false);
                            } else {
                                gapComposer2.startReplaceGroup(-1406670520);
                                gapComposer2.end(false);
                            }
                        }
                        i2 = i3;
                        th2 = th;
                    }
                    gapComposer2.end(false);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SheetAppMessageView$$ExternalSyntheticLambda2(SheetAppMessageView sheetAppMessageView, SheetAppMessageModel sheetAppMessageModel, float f, Function1 function1, RealSheetState realSheetState) {
        this.f$0 = sheetAppMessageView;
        this.f$1 = sheetAppMessageModel;
        this.f$2 = f;
        this.f$3 = function1;
        this.f$4 = realSheetState;
    }
}
