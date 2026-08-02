package com.mikepenz.markdown.compose.components;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.markdown.compose.elements.MarkdownHeaderKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.channels.ChannelsKt__ChannelsKt;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.FlowKt__CollectionKt;
import kotlinx.coroutines.guava.ListenableFutureKt;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.rx3.RxAwaitKt;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.encoding.AbstractEncoder;
import net.idrnd.face.iad.capture.internal.s2;
import org.intellij.markdown.MarkdownTokenTypes;

/* loaded from: classes4.dex */
public final class ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public static final ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1 INSTANCE$1 = new ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1(1);
    public static final ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1 INSTANCE$2 = new ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1(2);
    public static final ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1 INSTANCE$3 = new ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1(3);
    public static final ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1 INSTANCE$4 = new ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1(4);
    public static final ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1 INSTANCE$5 = new ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1(5);
    public static final ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1 INSTANCE$6 = new ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1(6);
    public static final ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1 INSTANCE$7 = new ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1(7);
    public static final ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1 INSTANCE$8 = new ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1(8);
    public static final ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1 INSTANCE$9 = new ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1(9);
    public static final ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1 INSTANCE$10 = new ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1(10);
    public static final ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1 INSTANCE$11 = new ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1(11);
    public static final ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1 INSTANCE$12 = new ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1(12);
    public static final ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1 INSTANCE$13 = new ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1(13);
    public static final ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1 INSTANCE$14 = new ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1(14);
    public static final ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1 INSTANCE$15 = new ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1(15);
    public static final ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1 INSTANCE$16 = new ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1(16);
    public static final ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1 INSTANCE$17 = new ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1(17);
    public static final ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1 INSTANCE = new ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1(0);
    public static final ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1 INSTANCE$18 = new ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1(18);
    public static final ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1 INSTANCE$19 = new ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1(19);
    public static final ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1 INSTANCE$20 = new ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1(20);

    public /* synthetic */ ComposableSingletons$MarkdownComponentsKt$lambda$242326187$1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Number) obj3).intValue();
                ((MarkdownComponentModel) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                MarkdownComponentModel markdownComponentModel = (MarkdownComponentModel) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Number) obj3).intValue();
                markdownComponentModel.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(markdownComponentModel) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    PolymorphicSerializerKt.MarkdownOrderedList(markdownComponentModel.content, markdownComponentModel.node, markdownComponentModel.typography.ordered, PolymorphicSerializerKt.getListDepth(markdownComponentModel), null, null, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                MarkdownComponentModel markdownComponentModel2 = (MarkdownComponentModel) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Number) obj3).intValue();
                markdownComponentModel2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(markdownComponentModel2) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    SendChannel.DefaultImpls.MarkdownCheckBox(markdownComponentModel2.content, markdownComponentModel2.node, markdownComponentModel2.typography.text, null, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 3:
                MarkdownComponentModel markdownComponentModel3 = (MarkdownComponentModel) obj;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Number) obj3).intValue();
                markdownComponentModel3.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer4).changed(markdownComponentModel3) ? 4 : 2;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    RxAwaitKt.MarkdownInlineImage(markdownComponentModel3.content, markdownComponentModel3.node, gapComposer4, 0);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 4:
                MarkdownComponentModel markdownComponentModel4 = (MarkdownComponentModel) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Number) obj3).intValue();
                markdownComponentModel4.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer5).changed(markdownComponentModel4) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    ChannelsKt__ChannelsKt.MarkdownBlockQuote(markdownComponentModel4.content, markdownComponentModel4.node, markdownComponentModel4.typography.quote, gapComposer5, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 5:
                MarkdownComponentModel markdownComponentModel5 = (MarkdownComponentModel) obj;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Number) obj3).intValue();
                markdownComponentModel5.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer6).changed(markdownComponentModel5) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                    MarkdownHeaderKt.MarkdownHeader(markdownComponentModel5.content, markdownComponentModel5.node, markdownComponentModel5.typography.h4, null, gapComposer6, 0, 8);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            case 6:
                MarkdownComponentModel markdownComponentModel6 = (MarkdownComponentModel) obj;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Number) obj3).intValue();
                markdownComponentModel6.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((GapComposer) composer7).changed(markdownComponentModel6) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                    PolymorphicSerializerKt.MarkdownBulletList(markdownComponentModel6.content, markdownComponentModel6.node, markdownComponentModel6.typography.bullet, PolymorphicSerializerKt.getListDepth(markdownComponentModel6), null, null, gapComposer7, 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
            case 7:
                MarkdownComponentModel markdownComponentModel7 = (MarkdownComponentModel) obj;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Number) obj3).intValue();
                markdownComponentModel7.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((GapComposer) composer8).changed(markdownComponentModel7) ? 4 : 2;
                }
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 19) != 18)) {
                    ContextAwareKt.MarkdownParagraph(markdownComponentModel7.content, markdownComponentModel7.node, null, markdownComponentModel7.typography.paragraph, null, gapComposer8, 0);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                break;
            case 8:
                MarkdownComponentModel markdownComponentModel8 = (MarkdownComponentModel) obj;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Number) obj3).intValue();
                markdownComponentModel8.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((GapComposer) composer9).changed(markdownComponentModel8) ? 4 : 2;
                }
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                    MarkdownHeaderKt.MarkdownHeader(markdownComponentModel8.content, markdownComponentModel8.node, markdownComponentModel8.typography.h5, null, gapComposer9, 0, 8);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                break;
            case 9:
                MarkdownComponentModel markdownComponentModel9 = (MarkdownComponentModel) obj;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Number) obj3).intValue();
                markdownComponentModel9.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((GapComposer) composer10).changed(markdownComponentModel9) ? 4 : 2;
                }
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 19) != 18)) {
                    AbstractDecoder.MarkdownTable(markdownComponentModel9.content, markdownComponentModel9.node, markdownComponentModel9.typography.table, null, null, null, gapComposer10, 0);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                break;
            case 10:
                MarkdownComponentModel markdownComponentModel10 = (MarkdownComponentModel) obj;
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Number) obj3).intValue();
                markdownComponentModel10.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((GapComposer) composer11).changed(markdownComponentModel10) ? 4 : 2;
                }
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 19) != 18)) {
                    MarkdownHeaderKt.MarkdownHeader(markdownComponentModel10.content, markdownComponentModel10.node, markdownComponentModel10.typography.h1, null, gapComposer11, 0, 8);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                break;
            case 11:
                MarkdownComponentModel markdownComponentModel11 = (MarkdownComponentModel) obj;
                Composer composer12 = (Composer) obj2;
                int intValue12 = ((Number) obj3).intValue();
                markdownComponentModel11.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((GapComposer) composer12).changed(markdownComponentModel11) ? 4 : 2;
                }
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 19) != 18)) {
                    FlowKt__CollectionKt.MarkdownCodeFence(markdownComponentModel11.content, markdownComponentModel11.node, markdownComponentModel11.typography.code, null, gapComposer12, 0);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                break;
            case 12:
                Composer composer13 = (Composer) obj2;
                int intValue13 = ((Number) obj3).intValue();
                ((MarkdownComponentModel) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    ListenableFutureKt.m4197MarkdownDivideraMcp0Q(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), 0L, RecyclerView.DECELERATION_RATE, gapComposer13, 6, 6);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                break;
            case 13:
                MarkdownComponentModel markdownComponentModel12 = (MarkdownComponentModel) obj;
                Composer composer14 = (Composer) obj2;
                int intValue14 = ((Number) obj3).intValue();
                markdownComponentModel12.getClass();
                if ((intValue14 & 6) == 0) {
                    intValue14 |= ((GapComposer) composer14).changed(markdownComponentModel12) ? 4 : 2;
                }
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 19) != 18)) {
                    MarkdownHeaderKt.MarkdownHeader(markdownComponentModel12.content, markdownComponentModel12.node, markdownComponentModel12.typography.h3, null, gapComposer14, 0, 8);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                break;
            case 14:
                MarkdownComponentModel markdownComponentModel13 = (MarkdownComponentModel) obj;
                Composer composer15 = (Composer) obj2;
                int intValue15 = ((Number) obj3).intValue();
                markdownComponentModel13.getClass();
                if ((intValue15 & 6) == 0) {
                    intValue15 |= ((GapComposer) composer15).changed(markdownComponentModel13) ? 4 : 2;
                }
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 19) != 18)) {
                    FlowKt__CollectionKt.MarkdownCodeBlock(markdownComponentModel13.content, markdownComponentModel13.node, markdownComponentModel13.typography.code, null, gapComposer15, 0);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                break;
            case 15:
                MarkdownComponentModel markdownComponentModel14 = (MarkdownComponentModel) obj;
                Composer composer16 = (Composer) obj2;
                int intValue16 = ((Number) obj3).intValue();
                markdownComponentModel14.getClass();
                if ((intValue16 & 6) == 0) {
                    intValue16 |= ((GapComposer) composer16).changed(markdownComponentModel14) ? 4 : 2;
                }
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 19) != 18)) {
                    OnUndeliveredElementKt.MarkdownImage(markdownComponentModel14.content, markdownComponentModel14.node, gapComposer16, 0);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                break;
            case 16:
                MarkdownComponentModel markdownComponentModel15 = (MarkdownComponentModel) obj;
                Composer composer17 = (Composer) obj2;
                int intValue17 = ((Number) obj3).intValue();
                markdownComponentModel15.getClass();
                if ((intValue17 & 6) == 0) {
                    intValue17 |= ((GapComposer) composer17).changed(markdownComponentModel15) ? 4 : 2;
                }
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 19) != 18)) {
                    MarkdownHeaderKt.MarkdownHeader(markdownComponentModel15.content, markdownComponentModel15.node, markdownComponentModel15.typography.h2, MarkdownTokenTypes.SETEXT_CONTENT, gapComposer17, 0, 0);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                break;
            case 17:
                MarkdownComponentModel markdownComponentModel16 = (MarkdownComponentModel) obj;
                Composer composer18 = (Composer) obj2;
                int intValue18 = ((Number) obj3).intValue();
                markdownComponentModel16.getClass();
                if ((intValue18 & 6) == 0) {
                    intValue18 |= ((GapComposer) composer18).changed(markdownComponentModel16) ? 4 : 2;
                }
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 19) != 18)) {
                    AbstractEncoder.MarkdownText(s2.getUnescapedTextInNode(markdownComponentModel16.node, markdownComponentModel16.content), markdownComponentModel16.node, (Modifier) null, markdownComponentModel16.typography.text, gapComposer18, 0, 4);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                break;
            case 18:
                MarkdownComponentModel markdownComponentModel17 = (MarkdownComponentModel) obj;
                Composer composer19 = (Composer) obj2;
                int intValue19 = ((Number) obj3).intValue();
                markdownComponentModel17.getClass();
                if ((intValue19 & 6) == 0) {
                    intValue19 |= ((GapComposer) composer19).changed(markdownComponentModel17) ? 4 : 2;
                }
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 19) != 18)) {
                    MarkdownHeaderKt.MarkdownHeader(markdownComponentModel17.content, markdownComponentModel17.node, markdownComponentModel17.typography.h2, null, gapComposer19, 0, 8);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                break;
            case 19:
                MarkdownComponentModel markdownComponentModel18 = (MarkdownComponentModel) obj;
                Composer composer20 = (Composer) obj2;
                int intValue20 = ((Number) obj3).intValue();
                markdownComponentModel18.getClass();
                if ((intValue20 & 6) == 0) {
                    intValue20 |= ((GapComposer) composer20).changed(markdownComponentModel18) ? 4 : 2;
                }
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 19) != 18)) {
                    MarkdownHeaderKt.MarkdownHeader(markdownComponentModel18.content, markdownComponentModel18.node, markdownComponentModel18.typography.h6, null, gapComposer20, 0, 8);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                break;
            default:
                MarkdownComponentModel markdownComponentModel19 = (MarkdownComponentModel) obj;
                Composer composer21 = (Composer) obj2;
                int intValue21 = ((Number) obj3).intValue();
                markdownComponentModel19.getClass();
                if ((intValue21 & 6) == 0) {
                    intValue21 |= ((GapComposer) composer21).changed(markdownComponentModel19) ? 4 : 2;
                }
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 19) != 18)) {
                    MarkdownHeaderKt.MarkdownHeader(markdownComponentModel19.content, markdownComponentModel19.node, markdownComponentModel19.typography.h1, MarkdownTokenTypes.SETEXT_CONTENT, gapComposer21, 0, 0);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
