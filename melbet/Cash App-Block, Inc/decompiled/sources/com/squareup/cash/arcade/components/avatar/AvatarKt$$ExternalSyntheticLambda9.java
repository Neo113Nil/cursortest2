package com.squareup.cash.arcade.components.avatar;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.graphics.painter.Painter;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class AvatarKt$$ExternalSyntheticLambda9 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AvatarImage f$0;

    public /* synthetic */ AvatarKt$$ExternalSyntheticLambda9(AvatarImage avatarImage, int i) {
        this.$r8$classId = i;
        this.f$0 = avatarImage;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        AvatarImage avatarImage = this.f$0;
        PainterRequest painterRequest = (PainterRequest) obj;
        Composer composer = (Composer) obj2;
        ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                painterRequest.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-1090110239);
                Painter painter = avatarImage.painter(painterRequest, gapComposer);
                if (painter == null) {
                    painter = EmptyPainter.INSTANCE;
                }
                gapComposer.end(false);
                return painter;
            default:
                painterRequest.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(706671423);
                Painter painter2 = avatarImage.painter(painterRequest, gapComposer2);
                if (painter2 == null) {
                    painter2 = com.squareup.cash.common.composeui.EmptyPainter.INSTANCE;
                }
                gapComposer2.end(false);
                return painter2;
        }
    }
}
