package com.squareup.cash.db2;

import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class TreehouseAppConfigQueries$forAppName$2 extends FunctionReferenceImpl implements Function4 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public TreehouseAppConfigQueries$forAppName$2() {
        super(4, TreehouseAppConfig.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return new TreehouseAppConfig((String) obj, (String) obj2, (String) obj3, (String) obj4);
    }
}
