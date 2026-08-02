package com.squareup.cash.data.contacts;

import com.squareup.cash.data.contacts.ContactModifiablePermissions;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes6.dex */
public final /* synthetic */ class ContactModifiablePermissions$granted$3 extends AdaptedFunctionReference implements Function3 {
    public static final ContactModifiablePermissions$granted$3 INSTANCE = new ContactModifiablePermissions$granted$3(3, ContactModifiablePermissions.PermissionTuple.class, "<init>", "<init>(ZLcom/squareup/cash/data/contacts/ContactsSyncState;)V", 4);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new ContactModifiablePermissions.PermissionTuple(((Boolean) obj).booleanValue(), (ContactsSyncState) obj2);
    }
}
