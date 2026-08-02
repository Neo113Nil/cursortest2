package com.squareup.cash.family.profileselection.real;

import com.squareup.cash.account.types.PrincipalAccountToken;
import com.squareup.cash.data.profile.PublicProfile;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.text.StringsKt;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealFamilyProfileManager$familyProfile$2 extends SuspendLambda implements Function4 {
    public /* synthetic */ PublicProfile L$0;
    public /* synthetic */ PrincipalAccountToken L$1;
    public /* synthetic */ String L$2;

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        RealFamilyProfileManager$familyProfile$2 realFamilyProfileManager$familyProfile$2 = new RealFamilyProfileManager$familyProfile$2(4, (Continuation) obj4);
        realFamilyProfileManager$familyProfile$2.L$0 = (PublicProfile) obj;
        realFamilyProfileManager$familyProfile$2.L$1 = (PrincipalAccountToken) obj2;
        realFamilyProfileManager$familyProfile$2.L$2 = (String) obj3;
        return realFamilyProfileManager$familyProfile$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List split$default;
        PublicProfile publicProfile = this.L$0;
        PrincipalAccountToken principalAccountToken = this.L$1;
        String str = this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        String str2 = null;
        if (principalAccountToken instanceof PrincipalAccountToken.Some) {
            String fullName = publicProfile.getFullName();
            if (fullName != null && (split$default = StringsKt.split$default(fullName, new char[]{' '}, 6)) != null) {
                str2 = (String) CollectionsKt.firstOrNull(split$default);
            }
            return new FamilyProfile.ManagedAccount(str2, str, ((PrincipalAccountToken.Some) principalAccountToken).accountToken);
        }
        if ((principalAccountToken instanceof PrincipalAccountToken.None) || principalAccountToken == null) {
            return FamilyProfile.Standard.INSTANCE;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
