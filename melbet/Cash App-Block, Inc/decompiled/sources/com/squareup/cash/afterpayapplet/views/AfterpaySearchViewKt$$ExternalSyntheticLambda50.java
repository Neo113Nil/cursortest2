package com.squareup.cash.afterpayapplet.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.composeUi.foundation.image.PainterRequest;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.ui.Image;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class AfterpaySearchViewKt$$ExternalSyntheticLambda50 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StackedAvatarViewModel.Single f$0;

    public /* synthetic */ AfterpaySearchViewKt$$ExternalSyntheticLambda50(StackedAvatarViewModel.Single single, int i) {
        this.$r8$classId = i;
        this.f$0 = single;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        String str = null;
        StackedAvatarViewModel.Single single = this.f$0;
        PainterRequest painterRequest = (PainterRequest) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                painterRequest.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-896815440);
                Image image = single.avatar.remoteImage;
                if (image == null) {
                    gapComposer.startReplaceGroup(1962858116);
                    gapComposer.end(false);
                } else {
                    str = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer, 1448791325, image, gapComposer, false);
                }
                AsyncImagePainter rememberAsyncImagePainter = AsyncImageKt.rememberAsyncImagePainter(painterRequest, str, gapComposer, intValue & 14, 0);
                gapComposer.end(false);
                return rememberAsyncImagePainter;
            case 1:
                painterRequest.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-1392384515);
                Image image2 = single.avatar.remoteImage;
                if (image2 == null) {
                    gapComposer2.startReplaceGroup(267131223);
                    gapComposer2.end(false);
                } else {
                    str = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer2, 1948279786, image2, gapComposer2, false);
                }
                AsyncImagePainter rememberAsyncImagePainter2 = AsyncImageKt.rememberAsyncImagePainter(painterRequest, str, gapComposer2, intValue & 14, 0);
                gapComposer2.end(false);
                return rememberAsyncImagePainter2;
            default:
                painterRequest.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(-45031416);
                Image image3 = single.avatar.remoteImage;
                if (image3 == null) {
                    gapComposer3.startReplaceGroup(-1501056788);
                    gapComposer3.end(false);
                } else {
                    str = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer3, -325515851, image3, gapComposer3, false);
                }
                AsyncImagePainter rememberAsyncImagePainter3 = AsyncImageKt.rememberAsyncImagePainter(painterRequest, str, gapComposer3, intValue & 14, 0);
                gapComposer3.end(false);
                return rememberAsyncImagePainter3;
        }
    }
}
