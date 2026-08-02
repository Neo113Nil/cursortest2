package com.squareup.cash.pools.views;

import com.squareup.cash.pools.viewmodels.PoolInvitePeopleListViewEvent;
import com.squareup.cash.pools.viewmodels.PoolListSection;
import com.squareup.cash.pools.viewmodels.PoolMemberListViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class PoolMemberListViewKt$PoolMemberList$1$1$2$1$2$2$1$1 implements Function0 {
    public final /* synthetic */ Function1 $onEvent;
    public final /* synthetic */ PoolListSection.PoolListPerson $person;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ PoolMemberListViewKt$PoolMemberList$1$1$2$1$2$2$1$1(Function1 function1, PoolListSection.PoolListPerson poolListPerson, int i) {
        this.$r8$classId = i;
        this.$onEvent = function1;
        this.$person = poolListPerson;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        PoolListSection.PoolListPerson poolListPerson = this.$person;
        Function1 function1 = this.$onEvent;
        switch (i) {
            case 0:
                function1.invoke(new PoolMemberListViewEvent.RemovePerson(poolListPerson.customerId));
                break;
            case 1:
                function1.invoke(new PoolInvitePeopleListViewEvent.AvatarTapped(poolListPerson.customerId));
                break;
            default:
                function1.invoke(new PoolMemberListViewEvent.AvatarTapped(poolListPerson.customerId));
                break;
        }
        return Unit.INSTANCE;
    }
}
