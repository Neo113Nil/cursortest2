package com.mikepenz.markdown.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import com.mikepenz.markdown.compose.components.DefaultMarkdownComponents;
import com.mikepenz.markdown.model.State;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlinx.coroutines.InterruptibleKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* renamed from: com.mikepenz.markdown.compose.ComposableSingletons$MarkdownKt$lambda$-322200773$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$MarkdownKt$lambda$322200773$1 implements Function5 {
    public final /* synthetic */ int $r8$classId;
    public static final ComposableSingletons$MarkdownKt$lambda$322200773$1 INSTANCE$1 = new ComposableSingletons$MarkdownKt$lambda$322200773$1(1);
    public static final ComposableSingletons$MarkdownKt$lambda$322200773$1 INSTANCE = new ComposableSingletons$MarkdownKt$lambda$322200773$1(0);

    public /* synthetic */ ComposableSingletons$MarkdownKt$lambda$322200773$1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        switch (this.$r8$classId) {
            case 0:
                State.Success success = (State.Success) obj;
                DefaultMarkdownComponents defaultMarkdownComponents = (DefaultMarkdownComponents) obj2;
                Modifier modifier = (Modifier) obj3;
                Composer composer = (Composer) obj4;
                int intValue = ((Number) obj5).intValue();
                success.getClass();
                defaultMarkdownComponents.getClass();
                modifier.getClass();
                if ((intValue & 6) == 0) {
                    i = intValue | (((GapComposer) composer).changed(success) ? 4 : 2);
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= ((GapComposer) composer).changed(defaultMarkdownComponents) ? 32 : 16;
                }
                if ((intValue & MLKEMEngine.KyberPolyBytes) == 0) {
                    i |= ((GapComposer) composer).changed(modifier) ? 256 : 128;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(i & 1, (i & 1171) != 1170)) {
                    InterruptibleKt.MarkdownSuccess(success, defaultMarkdownComponents, modifier, gapComposer, i & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                State.Success success2 = (State.Success) obj;
                DefaultMarkdownComponents defaultMarkdownComponents2 = (DefaultMarkdownComponents) obj2;
                Modifier modifier2 = (Modifier) obj3;
                Composer composer2 = (Composer) obj4;
                int intValue2 = ((Number) obj5).intValue();
                success2.getClass();
                defaultMarkdownComponents2.getClass();
                modifier2.getClass();
                if ((intValue2 & 6) == 0) {
                    i2 = intValue2 | (((GapComposer) composer2).changed(success2) ? 4 : 2);
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i2 |= ((GapComposer) composer2).changed(defaultMarkdownComponents2) ? 32 : 16;
                }
                if ((intValue2 & MLKEMEngine.KyberPolyBytes) == 0) {
                    i2 |= ((GapComposer) composer2).changed(modifier2) ? 256 : 128;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
                    InterruptibleKt.MarkdownSuccess(success2, defaultMarkdownComponents2, modifier2, gapComposer2, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
