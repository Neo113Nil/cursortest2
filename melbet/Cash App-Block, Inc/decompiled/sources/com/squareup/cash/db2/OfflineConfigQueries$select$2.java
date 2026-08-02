package com.squareup.cash.db2;

import com.squareup.protos.franklin.common.StatusResult;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class OfflineConfigQueries$select$2 extends FunctionReferenceImpl implements Function15 {
    public static final OfflineConfigQueries$select$2 INSTANCE = new OfflineConfigQueries$select$2(15, OfflineConfig.class, "<init>", "<init>(ZLjava/lang/String;Lcom/squareup/protos/franklin/common/StatusResult;Lcom/squareup/protos/franklin/common/StatusResult;Lcom/squareup/protos/franklin/common/StatusResult;Lcom/squareup/protos/franklin/common/StatusResult;Lcom/squareup/protos/franklin/common/StatusResult;Lcom/squareup/protos/franklin/common/StatusResult;Lcom/squareup/protos/franklin/common/StatusResult;Lcom/squareup/protos/franklin/common/StatusResult;Ljava/util/List;Lcom/squareup/protos/franklin/common/StatusResult;Lcom/squareup/protos/franklin/common/StatusResult;Lcom/squareup/protos/franklin/common/scenarios/ScenarioPlan;Lcom/squareup/protos/franklin/common/scenarios/ScenarioPlan;)V", 0);

    @Override // kotlin.jvm.functions.Function15
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Serializable serializable) {
        return new OfflineConfig(((Boolean) obj).booleanValue(), (String) obj2, (StatusResult) obj3, (StatusResult) obj4, (StatusResult) obj5, (StatusResult) obj6, (StatusResult) obj7, (StatusResult) obj8, (StatusResult) obj9, (StatusResult) obj10, (List) obj11, (StatusResult) obj12, (StatusResult) obj13, (ScenarioPlan) obj14, (ScenarioPlan) serializable);
    }
}
