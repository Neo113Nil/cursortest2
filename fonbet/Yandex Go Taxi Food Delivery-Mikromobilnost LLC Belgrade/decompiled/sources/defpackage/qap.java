package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.FamilyFragment;

/* loaded from: classes2.dex */
public final class qap implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ FamilyFragment b;

    public /* synthetic */ qap(FamilyFragment familyFragment, int i) {
        this.a = i;
        this.b = familyFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        FamilyFragment familyFragment = this.b;
        switch (i) {
        }
        return familyFragment.getViewLifecycleOwner().getLifecycle();
    }
}
