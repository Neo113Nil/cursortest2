package com.squareup.cash.activity.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class EmbeddedHeaderScope$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EmbeddedHeaderScope f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ Function0 f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;

    public /* synthetic */ EmbeddedHeaderScope$$ExternalSyntheticLambda0(EmbeddedHeaderScope embeddedHeaderScope, String str, String str2, Function0 function0, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = embeddedHeaderScope;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = function0;
        this.f$4 = i;
        this.f$5 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$4;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                this.f$0.DefaultHeader(updateChangedFlags, this.f$5, (Composer) obj, this.f$1, this.f$2, this.f$3);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                this.f$0.DefaultHeaderWithoutSpace(updateChangedFlags2, this.f$5, (Composer) obj, this.f$1, this.f$2, this.f$3);
                break;
        }
        return Unit.INSTANCE;
    }
}
