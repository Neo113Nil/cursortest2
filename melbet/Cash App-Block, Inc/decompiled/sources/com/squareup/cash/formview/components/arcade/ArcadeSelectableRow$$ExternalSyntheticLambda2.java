package com.squareup.cash.formview.components.arcade;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeSelectableRow$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArcadeSelectableRow f$0;

    public /* synthetic */ ArcadeSelectableRow$$ExternalSyntheticLambda2(ArcadeSelectableRow arcadeSelectableRow, int i) {
        this.$r8$classId = 0;
        this.f$0 = arcadeSelectableRow;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ArcadeSelectableRow arcadeSelectableRow = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                arcadeSelectableRow.Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                ((String) obj2).getClass();
                arcadeSelectableRow.onEvent.invoke(new FormViewEvent.FormUrlClicked(str));
                break;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                ((String) obj2).getClass();
                arcadeSelectableRow.onEvent.invoke(new FormViewEvent.FormUrlClicked(str2));
                break;
            default:
                String str3 = (String) obj;
                str3.getClass();
                ((String) obj2).getClass();
                arcadeSelectableRow.onEvent.invoke(new FormViewEvent.FormUrlClicked(str3));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ArcadeSelectableRow$$ExternalSyntheticLambda2(ArcadeSelectableRow arcadeSelectableRow, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = arcadeSelectableRow;
    }
}
