package com.yandex.passport.internal.ui.account_upgrade;

import com.yandex.passport.api.v;
import defpackage.cg6;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class b extends cg6 {
    public v j;
    public /* synthetic */ Object k;
    public final /* synthetic */ AccountUpgraderActivity l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AccountUpgraderActivity accountUpgraderActivity, Continuation continuation) {
        super(continuation);
        this.l = accountUpgraderActivity;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return AccountUpgraderActivity.j(this.l, null, this);
    }
}
