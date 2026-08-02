package com.squareup.cash.clientrouting.routers.account;

import com.squareup.cash.clientrouting.routers.account.RoutableAccount;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class RoutableAccountsProvider$setup$1$1$1$emit$$inlined$replaceAccounts$1 implements Function1 {
    public static final RoutableAccountsProvider$setup$1$1$1$emit$$inlined$replaceAccounts$1 INSTANCE = new RoutableAccountsProvider$setup$1$1$1$emit$$inlined$replaceAccounts$1(0);
    public static final RoutableAccountsProvider$setup$1$1$1$emit$$inlined$replaceAccounts$1 INSTANCE$1 = new RoutableAccountsProvider$setup$1$1$1$emit$$inlined$replaceAccounts$1(1);
    public static final RoutableAccountsProvider$setup$1$1$1$emit$$inlined$replaceAccounts$1 INSTANCE$2 = new RoutableAccountsProvider$setup$1$1$1$emit$$inlined$replaceAccounts$1(2);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RoutableAccountsProvider$setup$1$1$1$emit$$inlined$replaceAccounts$1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                RoutableAccount routableAccount = (RoutableAccount) obj;
                routableAccount.getClass();
                return Boolean.valueOf(routableAccount instanceof RoutableAccount.Account);
            case 1:
                RoutableAccount routableAccount2 = (RoutableAccount) obj;
                routableAccount2.getClass();
                return Boolean.valueOf(routableAccount2 instanceof RoutableAccount.Dependent);
            default:
                RoutableAccount routableAccount3 = (RoutableAccount) obj;
                routableAccount3.getClass();
                return Boolean.valueOf(routableAccount3 instanceof RoutableAccount.Sponsor);
        }
    }
}
