package com.zennvvarroo.pealkkk.ui.screens.areas;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.zennvvarroo.pealkkk.data.model.AreaColor;
import com.zennvvarroo.pealkkk.data.model.StorageArea;
import com.zennvvarroo.pealkkk.ui.MainViewModel;
import com.zennvvarroo.pealkkk.ui.components.CommonKt;
import com.zennvvarroo.pealkkk.ui.model.AppUiState;
import com.zennvvarroo.pealkkk.ui.theme.ColorKt;
import com.zennvvarroo.pealkkk.util.MappersKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: AreaDialog.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\t¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002²\u0006\u0010\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002"}, d2 = {"AreaDialog", "", "mainViewModel", "Lcom/zennvvarroo/pealkkk/ui/MainViewModel;", "onDismiss", "Lkotlin/Function0;", "onSaved", "Lkotlin/Function1;", "", "(Lcom/zennvvarroo/pealkkk/ui/MainViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_release", "uiState", "Lcom/zennvvarroo/pealkkk/ui/model/AppUiState;", "areas", "", "Lcom/zennvvarroo/pealkkk/data/model/StorageArea;", "title", "", "note", "colorIdx", ""}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AreaDialogKt {
    public static final void AreaDialog(final MainViewModel mainViewModel, final Function0<Unit> onDismiss, final Function1<? super Boolean, Unit> onSaved, Composer composer, final int i) {
        Object obj;
        AreaColor areaColor;
        String note;
        String str;
        Intrinsics.checkNotNullParameter(mainViewModel, "mainViewModel");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onSaved, "onSaved");
        Composer startRestartGroup = composer.startRestartGroup(774714449);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(774714449, i, -1, "com.zennvvarroo.pealkkk.ui.screens.areas.AreaDialog (AreaDialog.kt:38)");
        }
        State collectAsState = SnapshotStateKt.collectAsState(mainViewModel.getUiState(), null, startRestartGroup, 8, 1);
        Iterator<T> it = AreaDialog$lambda$1(SnapshotStateKt.collectAsState(mainViewModel.getAreas(), null, startRestartGroup, 8, 1)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((StorageArea) obj).getId(), AreaDialog$lambda$0(collectAsState).getEditingAreaId())) {
                    break;
                }
            }
        }
        final StorageArea storageArea = (StorageArea) obj;
        startRestartGroup.startReplaceableGroup(-947880281);
        Object rememberedValue = startRestartGroup.rememberedValue();
        String str2 = "";
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            if (storageArea == null || (str = storageArea.getTitle()) == null) {
                str = "";
            }
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        final MutableState mutableState = (MutableState) rememberedValue;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-947878170);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            if (storageArea != null && (note = storageArea.getNote()) != null) {
                str2 = note;
            }
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str2, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        final MutableState mutableState2 = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.startReplaceableGroup(-947875921);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            AreaColor[] values = AreaColor.values();
            if (storageArea == null || (areaColor = storageArea.getColor()) == null) {
                areaColor = AreaColor.CYAN;
            }
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(ArraysKt.indexOf(values, areaColor)), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        final MutableState mutableState3 = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceableGroup();
        AndroidAlertDialog_androidKt.m1225AlertDialogOix01E0(onDismiss, ComposableLambdaKt.composableLambda(startRestartGroup, -551459575, true, new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.AreaDialogKt$AreaDialog$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-551459575, i2, -1, "com.zennvvarroo.pealkkk.ui.screens.areas.AreaDialog.<anonymous> (AreaDialog.kt:86)");
                    }
                    final StorageArea storageArea2 = StorageArea.this;
                    final MainViewModel mainViewModel2 = mainViewModel;
                    final Function1<Boolean, Unit> function1 = onSaved;
                    final MutableState<Integer> mutableState4 = mutableState3;
                    final MutableState<String> mutableState5 = mutableState;
                    final MutableState<String> mutableState6 = mutableState2;
                    ButtonKt.TextButton(new Function0<Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.AreaDialogKt$AreaDialog$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            int AreaDialog$lambda$10;
                            String AreaDialog$lambda$4;
                            String AreaDialog$lambda$7;
                            String AreaDialog$lambda$42;
                            String AreaDialog$lambda$72;
                            AreaColor[] values2 = AreaColor.values();
                            AreaDialog$lambda$10 = AreaDialogKt.AreaDialog$lambda$10(mutableState4);
                            AreaColor areaColor2 = values2[RangesKt.coerceIn(AreaDialog$lambda$10, 0, AreaColor.values().length - 1)];
                            StorageArea storageArea3 = StorageArea.this;
                            if (storageArea3 == null) {
                                MainViewModel mainViewModel3 = mainViewModel2;
                                AreaDialog$lambda$42 = AreaDialogKt.AreaDialog$lambda$4(mutableState5);
                                AreaDialog$lambda$72 = AreaDialogKt.AreaDialog$lambda$7(mutableState6);
                                mainViewModel3.addArea(AreaDialog$lambda$42, AreaDialog$lambda$72, areaColor2);
                                function1.invoke(true);
                                return;
                            }
                            MainViewModel mainViewModel4 = mainViewModel2;
                            String id = storageArea3.getId();
                            AreaDialog$lambda$4 = AreaDialogKt.AreaDialog$lambda$4(mutableState5);
                            AreaDialog$lambda$7 = AreaDialogKt.AreaDialog$lambda$7(mutableState6);
                            mainViewModel4.updateArea(id, AreaDialog$lambda$4, AreaDialog$lambda$7, areaColor2);
                            function1.invoke(false);
                        }
                    }, null, false, null, null, null, null, null, null, ComposableSingletons$AreaDialogKt.INSTANCE.m6211getLambda1$app_release(), composer2, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), null, ComposableLambdaKt.composableLambda(startRestartGroup, -133570873, true, new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.AreaDialogKt$AreaDialog$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-133570873, i2, -1, "com.zennvvarroo.pealkkk.ui.screens.areas.AreaDialog.<anonymous> (AreaDialog.kt:98)");
                }
                ButtonKt.TextButton(onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$AreaDialogKt.INSTANCE.m6212getLambda2$app_release(), composer2, 805306368, 510);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), null, ComposableLambdaKt.composableLambda(startRestartGroup, 284317829, true, new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.AreaDialogKt$AreaDialog$3
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(284317829, i2, -1, "com.zennvvarroo.pealkkk.ui.screens.areas.AreaDialog.<anonymous> (AreaDialog.kt:52)");
                }
                TextKt.m2125Text4IGK_g(StorageArea.this == null ? "New Area" : "Edit Area", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 131038);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), ComposableLambdaKt.composableLambda(startRestartGroup, -1654221468, true, new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.AreaDialogKt$AreaDialog$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                String AreaDialog$lambda$4;
                String AreaDialog$lambda$7;
                int AreaDialog$lambda$10;
                int AreaDialog$lambda$102;
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1654221468, i2, -1, "com.zennvvarroo.pealkkk.ui.screens.areas.AreaDialog.<anonymous> (AreaDialog.kt:54)");
                    }
                    Modifier imePadding = WindowInsetsPadding_androidKt.imePadding(ScrollKt.verticalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null));
                    final MutableState<String> mutableState4 = mutableState;
                    final MutableState<String> mutableState5 = mutableState2;
                    final MutableState<Integer> mutableState6 = mutableState3;
                    composer2.startReplaceableGroup(-483455358);
                    ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(imePadding);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m2937constructorimpl = Updater.m2937constructorimpl(composer2);
                    Updater.m2944setimpl(m2937constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m2944setimpl(m2937constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m2937constructorimpl.getInserting() || !Intrinsics.areEqual(m2937constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m2937constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m2937constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m2928boximpl(SkippableUpdater.m2929constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    CommonKt.FieldLabel("Title", composer2, 6);
                    AreaDialog$lambda$4 = AreaDialogKt.AreaDialog$lambda$4(mutableState4);
                    composer2.startReplaceableGroup(515465122);
                    Object rememberedValue4 = composer2.rememberedValue();
                    if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = (Function1) new Function1<String, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.AreaDialogKt$AreaDialog$4$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(String str3) {
                                invoke2(str3);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(String it2) {
                                Intrinsics.checkNotNullParameter(it2, "it");
                                mutableState4.setValue(it2);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    float f = 12;
                    OutlinedTextFieldKt.OutlinedTextField(AreaDialog$lambda$4, (Function1<? super String, Unit>) rememberedValue4, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(f)), (TextFieldColors) null, composer2, 432, 12582912, 0, 6160376);
                    float f2 = 10;
                    SpacerKt.Spacer(SizeKt.m597height3ABfNKs(Modifier.INSTANCE, Dp.m5734constructorimpl(f2)), composer2, 6);
                    CommonKt.FieldLabel("Note", composer2, 6);
                    AreaDialog$lambda$7 = AreaDialogKt.AreaDialog$lambda$7(mutableState5);
                    composer2.startReplaceableGroup(515476961);
                    Object rememberedValue5 = composer2.rememberedValue();
                    if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = (Function1) new Function1<String, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.AreaDialogKt$AreaDialog$4$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(String str3) {
                                invoke2(str3);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(String it2) {
                                Intrinsics.checkNotNullParameter(it2, "it");
                                mutableState5.setValue(it2);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue5);
                    }
                    composer2.endReplaceableGroup();
                    OutlinedTextFieldKt.OutlinedTextField(AreaDialog$lambda$7, (Function1<? super String, Unit>) rememberedValue5, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) RoundedCornerShapeKt.m832RoundedCornerShape0680j_4(Dp.m5734constructorimpl(f)), (TextFieldColors) null, composer2, 432, 0, 0, 6291448);
                    SpacerKt.Spacer(SizeKt.m597height3ABfNKs(Modifier.INSTANCE, Dp.m5734constructorimpl(f2)), composer2, 6);
                    CommonKt.FieldLabel("Color", composer2, 6);
                    AreaColor[] values2 = AreaColor.values();
                    ArrayList arrayList = new ArrayList(values2.length);
                    for (AreaColor areaColor2 : values2) {
                        String lowerCase = areaColor2.name().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                        if (lowerCase.length() > 0) {
                            StringBuilder sb = new StringBuilder();
                            String valueOf = String.valueOf(lowerCase.charAt(0));
                            Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
                            String upperCase = valueOf.toUpperCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                            StringBuilder append = sb.append((Object) upperCase);
                            String substring = lowerCase.substring(1);
                            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                            lowerCase = append.append(substring).toString();
                        }
                        arrayList.add(lowerCase);
                    }
                    ArrayList arrayList2 = arrayList;
                    AreaDialog$lambda$10 = AreaDialogKt.AreaDialog$lambda$10(mutableState6);
                    AreaColor[] values3 = AreaColor.values();
                    AreaDialog$lambda$102 = AreaDialogKt.AreaDialog$lambda$10(mutableState6);
                    long areaColorToPaint = MappersKt.areaColorToPaint(values3[RangesKt.coerceIn(AreaDialog$lambda$102, 0, AreaColor.values().length - 1)]);
                    composer2.startReplaceableGroup(515495077);
                    Object rememberedValue6 = composer2.rememberedValue();
                    if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = (Function1) new Function1<Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.AreaDialogKt$AreaDialog$4$1$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                                invoke(num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int i3) {
                                AreaDialogKt.AreaDialog$lambda$11(mutableState6, i3);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue6);
                    }
                    composer2.endReplaceableGroup();
                    CommonKt.m6204EnumChipsFNF3uiM(arrayList2, AreaDialog$lambda$10, areaColorToPaint, (Function1) rememberedValue6, composer2, 3080);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), null, ColorKt.getPeakPanel(), 0L, ColorKt.getPeakWhite(), ColorKt.getPeakWhite(), 0.0f, null, startRestartGroup, ((i >> 3) & 14) | 102435888, 54, 12948);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.zennvvarroo.pealkkk.ui.screens.areas.AreaDialogKt$AreaDialog$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    AreaDialogKt.AreaDialog(MainViewModel.this, onDismiss, onSaved, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AreaDialog$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AreaDialog$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AreaDialog$lambda$10(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AreaDialog$lambda$11(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    private static final AppUiState AreaDialog$lambda$0(State<AppUiState> state) {
        return state.getValue();
    }

    private static final List<StorageArea> AreaDialog$lambda$1(State<? extends List<StorageArea>> state) {
        return state.getValue();
    }
}
