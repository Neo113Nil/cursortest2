package com.squareup.cash.formview.components;

import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import coil3.compose.LocalImageLoaderKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.protos.franklin.api.FormBlocker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class FormElementViewBuilder$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ FormElementViewBuilder f$0;
    public final /* synthetic */ ColorModel f$1;
    public final /* synthetic */ FormBlocker.Element.RemoteImageElement f$2;

    public /* synthetic */ FormElementViewBuilder$$ExternalSyntheticLambda1(ColorModel colorModel, FormElementViewBuilder formElementViewBuilder, FormBlocker.Element.RemoteImageElement remoteImageElement) {
        this.f$1 = colorModel;
        this.f$0 = formElementViewBuilder;
        this.f$2 = remoteImageElement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [androidx.compose.ui.Modifier] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Color m;
        ?? m177backgroundbw27NRU;
        int i = this.$r8$classId;
        FormBlocker.Element.RemoteImageElement remoteImageElement = this.f$2;
        FormElementViewBuilder formElementViewBuilder = this.f$0;
        ColorModel colorModel = this.f$1;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(formElementViewBuilder.imageLoader), Expect_jvmKt.rememberComposableLambda(334105967, new FormElementViewBuilder$$ExternalSyntheticLambda1(colorModel, formElementViewBuilder, remoteImageElement), gapComposer), gapComposer, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    if (colorModel == null) {
                        gapComposer2.startReplaceGroup(1911682024);
                        gapComposer2.end(false);
                        m = null;
                    } else {
                        m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer2, -1046711495, colorModel, gapComposer2, false);
                    }
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (m != null && (m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion, m.value, ColorKt.RectangleShape)) != 0) {
                        companion = m177backgroundbw27NRU;
                    }
                    FormRemoteImageKt.FormRemoteImage(remoteImageElement, formElementViewBuilder.imageLoader, companion, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ FormElementViewBuilder$$ExternalSyntheticLambda1(FormElementViewBuilder formElementViewBuilder, ColorModel colorModel, FormBlocker.Element.RemoteImageElement remoteImageElement) {
        this.f$0 = formElementViewBuilder;
        this.f$1 = colorModel;
        this.f$2 = remoteImageElement;
    }
}
