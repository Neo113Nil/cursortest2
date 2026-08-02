package com.squareup.cash.db2.profile;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class ProfileQueries$profileToken$2 extends FunctionReferenceImpl implements Function1 {
    public static final ProfileQueries$profileToken$2 INSTANCE = new ProfileQueries$profileToken$2(1, ProfileToken.class, "<init>", "<init>(Ljava/lang/String;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new ProfileToken((String) obj);
    }
}
