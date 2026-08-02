package com.squareup.cash.localization.db;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class LocalizationConfigQueries$select$2 extends FunctionReferenceImpl implements Function1 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public LocalizationConfigQueries$select$2() {
        super(1, LocalizationConfig.class, "<init>", "<init>(Lcom/squareup/protos/franklin/common/LocalizationConfig;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new LocalizationConfig((com.squareup.protos.franklin.common.LocalizationConfig) obj);
    }
}
