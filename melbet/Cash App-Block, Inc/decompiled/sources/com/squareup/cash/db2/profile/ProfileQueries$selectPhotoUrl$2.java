package com.squareup.cash.db2.profile;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes6.dex */
public final /* synthetic */ class ProfileQueries$selectPhotoUrl$2 extends FunctionReferenceImpl implements Function1 {
    public static final ProfileQueries$selectPhotoUrl$2 INSTANCE = new ProfileQueries$selectPhotoUrl$2(1, SelectPhotoUrl.class, "<init>", "<init>(Ljava/lang/String;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new SelectPhotoUrl((String) obj);
    }
}
