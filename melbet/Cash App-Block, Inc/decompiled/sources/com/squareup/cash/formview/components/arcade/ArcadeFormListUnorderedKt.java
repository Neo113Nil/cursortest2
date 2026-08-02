package com.squareup.cash.formview.components.arcade;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.list.ListUnorderedItem;
import com.squareup.cash.arcade.components.list.ListUnorderedSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.formview.components.FormRemoteImageKt$$ExternalSyntheticLambda0;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.workflow1.Worker;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.Tags;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import squareup.cash.ui.arcade.elements.ListUnordered;

/* loaded from: classes6.dex */
public abstract class ArcadeFormListUnorderedKt {

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FormBlocker.Element.ListUnorderedElement.Type.values().length];
            try {
                iArr[FormBlocker.Element.ListUnorderedElement.Type.SUBTLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormBlocker.Element.ListUnorderedElement.Type.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ListUnordered.Size.values().length];
            try {
                iArr2[ListUnordered.Size.LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void ArcadeFormListUnordered(FormBlocker.Element.ListUnorderedElement listUnorderedElement, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        Icons icons;
        AnnotatedString annotatedString;
        String str;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1106728533);
        int i2 = 2;
        int i3 = i | (gapComposer.changedInstance(listUnorderedElement) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            gapComposer.startReplaceGroup(1585775265);
            List<FormBlocker.Element.ListUnorderedElement.Item> list = listUnorderedElement.items;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (FormBlocker.Element.ListUnorderedElement.Item item : list) {
                gapComposer.startReplaceGroup(1585777225);
                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                String str2 = item.label;
                if (str2 == null) {
                    str2 = "";
                }
                boolean z = (i3 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new NfcNotAvailableKt$$ExternalSyntheticLambda0(5, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Worker.DefaultImpls.appendMarkdown$default(builder, str2, (Function2) rememberedValue, i2);
                AnnotatedString annotatedString2 = builder.toAnnotatedString();
                gapComposer.end(false);
                Icon icon = item.icon;
                AnnotatedString annotatedString3 = null;
                if (icon == null || (str = icon.arcade_id) == null) {
                    icons = null;
                } else {
                    Icons.Companion.getClass();
                    icons = zzd.get(str);
                }
                String str3 = item.value;
                if (str3 != null) {
                    AnnotatedString.Builder builder2 = new AnnotatedString.Builder();
                    Worker.DefaultImpls.appendMarkdown$default(builder2, str3, null, 6);
                    annotatedString = builder2.toAnnotatedString();
                } else {
                    annotatedString = null;
                }
                String str4 = item.body;
                if (str4 != null) {
                    AnnotatedString.Builder builder3 = new AnnotatedString.Builder();
                    Worker.DefaultImpls.appendMarkdown$default(builder3, str4, null, 6);
                    annotatedString3 = builder3.toAnnotatedString();
                }
                arrayList.add(new ListUnorderedItem(annotatedString2, icons, annotatedString, annotatedString3));
                i2 = 2;
            }
            gapComposer.end(false);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1314087498, new ErrorView$$ExternalSyntheticLambda1(listUnorderedElement, Tags.toImmutableList(arrayList)), gapComposer), gapComposer, 3072, 7);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FormRemoteImageKt$$ExternalSyntheticLambda0(listUnorderedElement, function1, modifier2, i, 17);
        }
    }

    public static final ListUnorderedSize toArcadeSize(ListUnordered.Size size) {
        return (size == null ? -1 : WhenMappings.$EnumSwitchMapping$1[size.ordinal()]) == 1 ? ListUnorderedSize.Large : ListUnorderedSize.Compact;
    }
}
