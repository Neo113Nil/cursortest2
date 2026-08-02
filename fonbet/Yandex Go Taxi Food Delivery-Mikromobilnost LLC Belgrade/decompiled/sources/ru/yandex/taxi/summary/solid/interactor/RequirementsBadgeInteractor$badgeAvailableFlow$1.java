package ru.yandex.taxi.summary.solid.interactor;

import defpackage.bms;
import defpackage.evu0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class RequirementsBadgeInteractor$badgeAvailableFlow$1 extends AdaptedFunctionReference implements bms {
    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj2;
        List list = (List) obj3;
        ((s) this.receiver).getClass();
        return Boolean.valueOf((((ru.yandex.taxi.requirements.models.net.experiment.c) obj).b || (evu0.J(str) && list.isEmpty())) ? false : true);
    }
}
