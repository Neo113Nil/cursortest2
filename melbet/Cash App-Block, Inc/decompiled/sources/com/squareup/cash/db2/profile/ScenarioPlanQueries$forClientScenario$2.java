package com.squareup.cash.db2.profile;

import com.squareup.protos.franklin.api.ClientScenario;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class ScenarioPlanQueries$forClientScenario$2 extends FunctionReferenceImpl implements Function2 {
    public static final ScenarioPlanQueries$forClientScenario$2 INSTANCE = new ScenarioPlanQueries$forClientScenario$2(2, ScenarioPlan.class, "<init>", "<init>(Lcom/squareup/protos/franklin/api/ClientScenario;Lcom/squareup/protos/franklin/common/scenarios/ScenarioPlan;)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ClientScenario clientScenario = (ClientScenario) obj;
        com.squareup.protos.franklin.common.scenarios.ScenarioPlan scenarioPlan = (com.squareup.protos.franklin.common.scenarios.ScenarioPlan) obj2;
        clientScenario.getClass();
        scenarioPlan.getClass();
        return new ScenarioPlan(clientScenario, scenarioPlan);
    }
}
