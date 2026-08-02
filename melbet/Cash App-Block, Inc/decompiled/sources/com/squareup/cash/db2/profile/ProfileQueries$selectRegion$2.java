package com.squareup.cash.db2.profile;

import com.squareup.protos.franklin.api.Region;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class ProfileQueries$selectRegion$2 extends FunctionReferenceImpl implements Function1 {
    public static final /* synthetic */ int $r8$clinit = 0;

    public ProfileQueries$selectRegion$2() {
        super(1, SelectRegion.class, "<init>", "<init>(Lcom/squareup/protos/franklin/api/Region;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new SelectRegion((Region) obj);
    }
}
