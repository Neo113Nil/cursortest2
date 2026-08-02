package com.squareup.cash.dialog;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.room.Room;
import com.squareup.cash.appmessages.views.InlineAppMessageKt$$ExternalSyntheticLambda15;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda3;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda3;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda8;
import java.util.Map;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes6.dex */
public final /* synthetic */ class ComposeDialogKt$$ExternalSyntheticLambda8 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ Function1 f$3;
    public final /* synthetic */ String f$4;

    public /* synthetic */ ComposeDialogKt$$ExternalSyntheticLambda8(String str, String str2, String str3, Function1 function1, String str4) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
        this.f$3 = function1;
        this.f$4 = str4;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((Unit) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 17) != 16)) {
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda14((int) (z2 ? 1 : 0));
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Function1 function1 = (Function1) rememberedValue;
                    String str = this.f$0;
                    boolean changed = gapComposer.changed(str);
                    String str2 = this.f$1;
                    boolean changed2 = changed | gapComposer.changed(str2);
                    String str3 = this.f$2;
                    boolean changed3 = changed2 | gapComposer.changed(str3);
                    Function1 function12 = this.f$3;
                    boolean changed4 = changed3 | gapComposer.changed(function12);
                    String str4 = this.f$4;
                    boolean changed5 = gapComposer.changed(str4) | changed4;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed5 || rememberedValue2 == neverEqualPolicy) {
                        OverlayKt$$ExternalSyntheticLambda3 overlayKt$$ExternalSyntheticLambda3 = new OverlayKt$$ExternalSyntheticLambda3(str, str2, str3, str4, function12, 16);
                        gapComposer.updateRememberedValue(overlayKt$$ExternalSyntheticLambda3);
                        rememberedValue2 = overlayKt$$ExternalSyntheticLambda3;
                    }
                    AndroidView_androidKt.AndroidView(function1, null, (Function1) rememberedValue2, gapComposer, 6, 2);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Triple triple = (Triple) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                triple.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(triple) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 19) != 18)) {
                    String str5 = (String) triple.first;
                    boolean booleanValue = ((Boolean) triple.second).booleanValue();
                    boolean booleanValue2 = ((Boolean) triple.third).booleanValue();
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Function1 function13 = this.f$3;
                    if (booleanValue2) {
                        gapComposer2.startReplaceGroup(-1193529752);
                        boolean changed6 = gapComposer2.changed(function13);
                        Object rememberedValue3 = gapComposer2.rememberedValue();
                        Object obj4 = rememberedValue3;
                        if (changed6 || rememberedValue3 == neverEqualPolicy) {
                            ScoreHomeKt$$ExternalSyntheticLambda8 scoreHomeKt$$ExternalSyntheticLambda8 = new ScoreHomeKt$$ExternalSyntheticLambda8(function13, z, 6);
                            gapComposer2.updateRememberedValue(scoreHomeKt$$ExternalSyntheticLambda8);
                            obj4 = scoreHomeKt$$ExternalSyntheticLambda8;
                        }
                        Function2 function2 = (Function2) obj4;
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                        String str6 = this.f$1;
                        boolean changed7 = gapComposer2.changed(str6) | gapComposer2.changed(function13);
                        Object rememberedValue4 = gapComposer2.rememberedValue();
                        Object obj5 = rememberedValue4;
                        if (changed7 || rememberedValue4 == neverEqualPolicy) {
                            InlineAppMessageKt$$ExternalSyntheticLambda15 inlineAppMessageKt$$ExternalSyntheticLambda15 = new InlineAppMessageKt$$ExternalSyntheticLambda15(str6, function13, 2);
                            gapComposer2.updateRememberedValue(inlineAppMessageKt$$ExternalSyntheticLambda15);
                            obj5 = inlineAppMessageKt$$ExternalSyntheticLambda15;
                        }
                        LazyDslKt.m304MarkdownTextpCuZGqc(this.f$0, function2, SemanticsModifierKt.clearAndSetSemantics(fillMaxWidth, (Function1) obj5), null, 0L, null, null, null, 0, 0, 3, gapComposer2, 0, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                        gapComposer2.end(false);
                    } else if (booleanValue) {
                        gapComposer2.startReplaceGroup(-1192883650);
                        boolean changed8 = gapComposer2.changed(function13);
                        Object rememberedValue5 = gapComposer2.rememberedValue();
                        Object obj6 = rememberedValue5;
                        if (changed8 || rememberedValue5 == neverEqualPolicy) {
                            ScoreHomeKt$$ExternalSyntheticLambda8 scoreHomeKt$$ExternalSyntheticLambda82 = new ScoreHomeKt$$ExternalSyntheticLambda8(function13, z3 ? 1 : 0, 7);
                            gapComposer2.updateRememberedValue(scoreHomeKt$$ExternalSyntheticLambda82);
                            obj6 = scoreHomeKt$$ExternalSyntheticLambda82;
                        }
                        Function2 function22 = (Function2) obj6;
                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                        String str7 = this.f$4;
                        boolean changed9 = gapComposer2.changed(str7) | gapComposer2.changed(function13);
                        Object rememberedValue6 = gapComposer2.rememberedValue();
                        Object obj7 = rememberedValue6;
                        if (changed9 || rememberedValue6 == neverEqualPolicy) {
                            InlineAppMessageKt$$ExternalSyntheticLambda15 inlineAppMessageKt$$ExternalSyntheticLambda152 = new InlineAppMessageKt$$ExternalSyntheticLambda15(str7, function13, 3);
                            gapComposer2.updateRememberedValue(inlineAppMessageKt$$ExternalSyntheticLambda152);
                            obj7 = inlineAppMessageKt$$ExternalSyntheticLambda152;
                        }
                        LazyDslKt.m304MarkdownTextpCuZGqc(this.f$2, function22, SemanticsModifierKt.clearAndSetSemantics(fillMaxWidth2, (Function1) obj7), null, 0L, null, null, null, 0, 0, 3, gapComposer2, 0, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-1192275430);
                        Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                        boolean changed10 = gapComposer2.changed(str5);
                        Object rememberedValue7 = gapComposer2.rememberedValue();
                        Object obj8 = rememberedValue7;
                        if (changed10 || rememberedValue7 == neverEqualPolicy) {
                            ClusterItemKt$$ExternalSyntheticLambda3 clusterItemKt$$ExternalSyntheticLambda3 = new ClusterItemKt$$ExternalSyntheticLambda3(str5, 25);
                            gapComposer2.updateRememberedValue(clusterItemKt$$ExternalSyntheticLambda3);
                            obj8 = clusterItemKt$$ExternalSyntheticLambda3;
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3836, 0L, (Composer) gapComposer2, SemanticsModifierKt.clearAndSetSemantics(fillMaxWidth3, (Function1) obj8), (TextStyle) null, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ComposeDialogKt$$ExternalSyntheticLambda8(String str, Function1 function1, String str2, String str3, String str4) {
        this.f$0 = str;
        this.f$3 = function1;
        this.f$1 = str2;
        this.f$2 = str3;
        this.f$4 = str4;
    }
}
