package com.squareup.cash.data.profile;

import com.squareup.cash.db.profile.ProfileAlias;
import com.squareup.protos.franklin.api.UiAlias;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class RealProfileAliasRepository$allProfileValues$1 extends FunctionReferenceImpl implements Function3 {
    public static final RealProfileAliasRepository$allProfileValues$1 INSTANCE = new RealProfileAliasRepository$allProfileValues$1(3, ProfileAlias.class, "<init>", "<init>(Ljava/lang/String;ZLcom/squareup/protos/franklin/api/UiAlias$Type;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        UiAlias.Type type2 = (UiAlias.Type) obj3;
        str.getClass();
        type2.getClass();
        return new ProfileAlias(type2, str, booleanValue);
    }
}
