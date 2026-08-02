package com.squareup.cash.formview.components.arcade;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.formview.components.FormRemoteImageKt$$ExternalSyntheticLambda0;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.util.cash.StringsKt;
import com.squareup.workflow1.Worker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.ui.arcade.elements.ListOrdered;

/* loaded from: classes6.dex */
public abstract class ArcadeFormListOrderedKt {

    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ListOrdered.Variant.values().length];
            try {
                iArr[ListOrdered.Variant.SUBTLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ArcadeFormListOrdered(FormBlocker.Element.ListOrderedElement listOrderedElement, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        int i2;
        AnnotatedString annotatedString;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1241169988);
        int i3 = 32;
        int i4 = i | (gapComposer.changedInstance(listOrderedElement) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            ListOrdered listOrdered = listOrderedElement.list;
            if (listOrdered == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return;
            }
            gapComposer.startReplaceGroup(-1236542814);
            List<ListOrdered.ListItem> list = listOrdered.items;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (ListOrdered.ListItem listItem : list) {
                gapComposer.startReplaceGroup(-1236542115);
                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                LocalizedString localizedString = listItem.label;
                String translated = localizedString != null ? StringsKt.translated(localizedString) : null;
                if (translated == null) {
                    translated = "";
                }
                int i5 = i4 & 112;
                boolean z = i5 == i3;
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (z || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new NfcNotAvailableKt$$ExternalSyntheticLambda0(3, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Worker.DefaultImpls.appendMarkdown$default(builder, translated, (Function2) rememberedValue, 2);
                AnnotatedString annotatedString2 = builder.toAnnotatedString();
                gapComposer.end(false);
                LocalizedString localizedString2 = listItem.body;
                if (localizedString2 == null) {
                    gapComposer.startReplaceGroup(2059593222);
                    gapComposer.end(false);
                    i2 = 32;
                    annotatedString = null;
                } else {
                    gapComposer.startReplaceGroup(2059593223);
                    gapComposer.startReplaceGroup(66439349);
                    AnnotatedString.Builder builder2 = new AnnotatedString.Builder();
                    String translated2 = StringsKt.translated(localizedString2);
                    i2 = 32;
                    boolean z2 = i5 == 32;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (z2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new NfcNotAvailableKt$$ExternalSyntheticLambda0(4, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Worker.DefaultImpls.appendMarkdown$default(builder2, translated2, (Function2) rememberedValue2, 2);
                    annotatedString = builder2.toAnnotatedString();
                    gapComposer.end(false);
                    gapComposer.end(false);
                }
                arrayList.add(new Pair(annotatedString2, annotatedString));
                i3 = i2;
            }
            gapComposer.end(false);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1954371727, new ErrorView$$ExternalSyntheticLambda1(listOrdered, arrayList), gapComposer), gapComposer, 3072, 7);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormRemoteImageKt$$ExternalSyntheticLambda0(listOrderedElement, function1, modifier2, i, 16);
        }
    }
}
