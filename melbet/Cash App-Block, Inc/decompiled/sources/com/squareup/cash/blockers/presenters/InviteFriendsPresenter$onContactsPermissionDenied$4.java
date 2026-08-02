package com.squareup.cash.blockers.presenters;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes4.dex */
public final /* synthetic */ class InviteFriendsPresenter$onContactsPermissionDenied$4 extends AdaptedFunctionReference implements Function3 {
    public static final InviteFriendsPresenter$onContactsPermissionDenied$4 INSTANCE = new InviteFriendsPresenter$onContactsPermissionDenied$4(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new Pair((Unit) obj, new Long(((Number) obj2).longValue()));
    }
}
