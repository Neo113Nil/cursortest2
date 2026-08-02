package com.squareup.cash.securityhub.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class RelatedBookletsSectionKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ List f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ Modifier f$3;

    public /* synthetic */ RelatedBookletsSectionKt$$ExternalSyntheticLambda4(String str, List list, Function1 function1, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = list;
        this.f$2 = function1;
        this.f$3 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                EducationCardKt.RelatedBookletsSection(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(1);
                EducationCardKt.SecurityEducationSupportSection(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags2);
                break;
        }
        return Unit.INSTANCE;
    }
}
