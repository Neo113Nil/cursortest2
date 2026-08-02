package com.squareup.cash.qrcodes.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.moneybot.views.markdown.MoneybotMarkdownKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class CameraXPreviewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ CameraXPreviewKt$$ExternalSyntheticLambda0(Modifier modifier, String str, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = modifier;
        this.f$1 = str;
        this.f$2 = i;
        this.f$3 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                CameraXPreviewKt.CameraXPreviewOverlay(Updater.updateChangedFlags(this.f$2 | 1), this.f$3, composer, this.f$0, this.f$1);
                break;
            default:
                MoneybotMarkdownKt.MoneybotMarkdown(Updater.updateChangedFlags(this.f$2 | 1), this.f$3, composer, this.f$0, this.f$1);
                break;
        }
        return Unit.INSTANCE;
    }
}
