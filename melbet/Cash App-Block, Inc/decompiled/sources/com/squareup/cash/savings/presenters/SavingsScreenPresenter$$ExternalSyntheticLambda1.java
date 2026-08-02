package com.squareup.cash.savings.presenters;

import androidx.core.view.MotionEventCompat;
import kotlin.jvm.functions.Function1;
import squareup.cash.savings.VersionedSavingsFolders;

/* loaded from: classes6.dex */
public final /* synthetic */ class SavingsScreenPresenter$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SavingsScreenPresenter f$0;

    public /* synthetic */ SavingsScreenPresenter$$ExternalSyntheticLambda1(SavingsScreenPresenter savingsScreenPresenter, int i) {
        this.$r8$classId = i;
        this.f$0 = savingsScreenPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        SavingsScreenPresenter savingsScreenPresenter = this.f$0;
        VersionedSavingsFolders versionedSavingsFolders = (VersionedSavingsFolders) obj;
        switch (i) {
            case 0:
                versionedSavingsFolders.getClass();
                break;
            default:
                versionedSavingsFolders.getClass();
                break;
        }
        return MotionEventCompat.toSavingsFolders(savingsScreenPresenter, versionedSavingsFolders);
    }
}
