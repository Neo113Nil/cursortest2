package ru.yandex.taxi.summary.solid.interactor;

import defpackage.amc;
import defpackage.g580;
import defpackage.hqj0;
import defpackage.tpr;
import defpackage.x8;

/* loaded from: classes6.dex */
public final class s {
    public final hqj0 a;
    public final amc b;
    public final g580 c;

    public s(hqj0 hqj0Var, amc amcVar, g580 g580Var) {
        this.a = hqj0Var;
        this.b = amcVar;
        this.c = g580Var;
    }

    public final tpr a() {
        return kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(this.a.c(), new kotlinx.coroutines.flow.n(new com.yandex.go.requirements.comment.repositories.b(this.b.c), new RequirementsBadgeInteractor$commentFlowWithStartComment$1(this, null)), new r(new kotlinx.coroutines.flow.n(((x8) this.c).b, new RequirementsBadgeInteractor$requirementsFlow$1(2, null)), this), new RequirementsBadgeInteractor$badgeAvailableFlow$1(4, this, s.class, "isBadgeAvailable", "isBadgeAvailable(Lru/yandex/taxi/requirements/models/net/experiment/RequirementsV2Experiment;Ljava/lang/String;Ljava/util/List;)Z", 4)));
    }
}
