package com.squareup.cash.account.backend;

import com.squareup.cash.account.types.PrincipalAccountToken;
import com.squareup.moshi.JsonAdapter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class PrincipalAccountTokenModule$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ JsonAdapter f$0;

    public /* synthetic */ PrincipalAccountTokenModule$$ExternalSyntheticLambda0(JsonAdapter jsonAdapter, int i) {
        this.$r8$classId = i;
        this.f$0 = jsonAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        JsonAdapter jsonAdapter = this.f$0;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                if (Intrinsics.areEqual(str, "none")) {
                    return PrincipalAccountToken.None.INSTANCE;
                }
                Object fromJson = jsonAdapter.fromJson(str);
                fromJson.getClass();
                PrincipalAccountTokenSomeJson principalAccountTokenSomeJson = (PrincipalAccountTokenSomeJson) fromJson;
                return new PrincipalAccountToken.Some(principalAccountTokenSomeJson.accountToken, principalAccountTokenSomeJson.switchingIdentifier);
            case 1:
                PrincipalAccountToken principalAccountToken = (PrincipalAccountToken) obj;
                principalAccountToken.getClass();
                if (principalAccountToken instanceof PrincipalAccountToken.None) {
                    return "none";
                }
                if (!(principalAccountToken instanceof PrincipalAccountToken.Some)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                PrincipalAccountToken.Some some = (PrincipalAccountToken.Some) principalAccountToken;
                String json = jsonAdapter.toJson(new PrincipalAccountTokenSomeJson(some.accountToken, some.switchingIdentifier));
                json.getClass();
                return json;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                Object fromJson2 = jsonAdapter.fromJson(str2);
                fromJson2.getClass();
                return (List) fromJson2;
            default:
                List list = (List) obj;
                list.getClass();
                String json2 = jsonAdapter.toJson(list);
                json2.getClass();
                return json2;
        }
    }
}
