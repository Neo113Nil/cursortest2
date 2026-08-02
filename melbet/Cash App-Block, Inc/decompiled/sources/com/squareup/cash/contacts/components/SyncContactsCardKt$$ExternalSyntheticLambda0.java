package com.squareup.cash.contacts.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.media3.common.text.SpanUtil;
import com.squareup.cash.buynowpaylater.views.ImageUtilsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class SyncContactsCardKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 2;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ int f$5;

    public /* synthetic */ SyncContactsCardKt$$ExternalSyntheticLambda0(String str, String str2, Function0 function0, Modifier modifier, int i) {
        this.f$2 = str;
        this.f$3 = str2;
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$5 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                SyncContactsRowKt.SyncContactsCard(Updater.updateChangedFlags(1), this.f$5, composer, this.f$1, this.f$2, this.f$3, this.f$0);
                break;
            case 1:
                ImageUtilsKt.AfterPayErrorLoadingContent(Updater.updateChangedFlags(1), this.f$5, composer, this.f$1, this.f$2, this.f$3, this.f$0);
                break;
            default:
                SpanUtil.InputFileAttachment(Updater.updateChangedFlags(this.f$5 | 1), composer, this.f$1, this.f$2, this.f$3, this.f$0);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SyncContactsCardKt$$ExternalSyntheticLambda0(String str, Function0 function0, Modifier modifier, String str2, int i, int i2) {
        this.f$2 = str;
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$3 = str2;
        this.f$5 = i2;
    }

    public /* synthetic */ SyncContactsCardKt$$ExternalSyntheticLambda0(Function0 function0, Modifier modifier, String str, String str2, int i, int i2) {
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$2 = str;
        this.f$3 = str2;
        this.f$5 = i2;
    }
}
