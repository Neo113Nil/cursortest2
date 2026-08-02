package com.squareup.cash.integration.contacts;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class RealContactBook$getAliases$1$1 implements Function1 {
    public static final RealContactBook$getAliases$1$1 INSTANCE = new RealContactBook$getAliases$1$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ContactBook$Contact$HashedAliasContact contactBook$Contact$HashedAliasContact = (ContactBook$Contact$HashedAliasContact) obj;
        contactBook$Contact$HashedAliasContact.getClass();
        String str = contactBook$Contact$HashedAliasContact.emailAddress;
        if (str != null) {
            return new Pair(ContactBook$AliasType.EMAIL, str);
        }
        String str2 = contactBook$Contact$HashedAliasContact.phoneNumber;
        if (str2 != null) {
            return new Pair(ContactBook$AliasType.PHONE, str2);
        }
        return null;
    }
}
