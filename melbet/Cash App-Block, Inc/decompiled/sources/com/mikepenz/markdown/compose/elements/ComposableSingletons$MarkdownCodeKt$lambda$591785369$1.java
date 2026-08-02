package com.mikepenz.markdown.compose.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.text.TextStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlinx.coroutines.flow.FlowKt__CollectionKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes9.dex */
public final class ComposableSingletons$MarkdownCodeKt$lambda$591785369$1 implements Function5 {
    public final /* synthetic */ int $r8$classId;
    public static final ComposableSingletons$MarkdownCodeKt$lambda$591785369$1 INSTANCE$1 = new ComposableSingletons$MarkdownCodeKt$lambda$591785369$1(1);
    public static final ComposableSingletons$MarkdownCodeKt$lambda$591785369$1 INSTANCE = new ComposableSingletons$MarkdownCodeKt$lambda$591785369$1(0);

    public /* synthetic */ ComposableSingletons$MarkdownCodeKt$lambda$591785369$1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        switch (this.$r8$classId) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                TextStyle textStyle = (TextStyle) obj3;
                Composer composer = (Composer) obj4;
                int intValue = ((Number) obj5).intValue();
                str.getClass();
                textStyle.getClass();
                if ((intValue & 6) == 0) {
                    i = intValue | (((GapComposer) composer).changed(str) ? 4 : 2);
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= ((GapComposer) composer).changed(str2) ? 32 : 16;
                }
                if ((intValue & MLKEMEngine.KyberPolyBytes) == 0) {
                    i |= ((GapComposer) composer).changed(textStyle) ? 256 : 128;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(i & 1, (i & 1171) != 1170)) {
                    FlowKt__CollectionKt.MarkdownCode(str, str2, textStyle, gapComposer, i & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                TextStyle textStyle2 = (TextStyle) obj3;
                Composer composer2 = (Composer) obj4;
                int intValue2 = ((Number) obj5).intValue();
                str3.getClass();
                textStyle2.getClass();
                if ((intValue2 & 6) == 0) {
                    i2 = intValue2 | (((GapComposer) composer2).changed(str3) ? 4 : 2);
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i2 |= ((GapComposer) composer2).changed(str4) ? 32 : 16;
                }
                if ((intValue2 & MLKEMEngine.KyberPolyBytes) == 0) {
                    i2 |= ((GapComposer) composer2).changed(textStyle2) ? 256 : 128;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
                    FlowKt__CollectionKt.MarkdownCode(str3, str4, textStyle2, gapComposer2, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
