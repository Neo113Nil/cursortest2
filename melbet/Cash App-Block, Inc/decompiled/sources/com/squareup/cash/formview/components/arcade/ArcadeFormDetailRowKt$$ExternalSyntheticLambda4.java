package com.squareup.cash.formview.components.arcade;

import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeFormDetailRowKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Function2 f$1;

    public /* synthetic */ ArcadeFormDetailRowKt$$ExternalSyntheticLambda4(int i, String str, Function2 function2) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    LazyDslKt.m304MarkdownTextpCuZGqc(this.f$0, this.f$1, null, null, 0L, null, null, null, 0, 0, 0, gapComposer, 0, 2044);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    LazyDslKt.m304MarkdownTextpCuZGqc(this.f$0, this.f$1, null, null, 0L, null, null, null, 0, 0, 0, gapComposer2, 0, 2044);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    LazyDslKt.m304MarkdownTextpCuZGqc(this.f$0, this.f$1, null, null, 0L, null, null, null, 0, 0, 0, gapComposer3, 0, 2044);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            default:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    LazyDslKt.m304MarkdownTextpCuZGqc(this.f$0, this.f$1, null, ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, 0L, null, null, null, 0, 0, 6, gapComposer4, 0, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
