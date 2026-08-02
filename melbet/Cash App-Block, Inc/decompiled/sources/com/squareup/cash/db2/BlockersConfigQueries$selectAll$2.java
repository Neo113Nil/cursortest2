package com.squareup.cash.db2;

import com.squareup.protos.common.Money;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class BlockersConfigQueries$selectAll$2 extends FunctionReferenceImpl implements Function3 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public BlockersConfigQueries$selectAll$2() {
        super(3, BlockersConfig.class, "<init>", "<init>(Ljava/lang/Boolean;Ljava/lang/String;Lcom/squareup/protos/common/Money;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new BlockersConfig((Boolean) obj, (String) obj2, (Money) obj3);
    }
}
