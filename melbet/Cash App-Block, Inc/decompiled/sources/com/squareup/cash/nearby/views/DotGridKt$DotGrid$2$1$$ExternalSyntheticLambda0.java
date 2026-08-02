package com.squareup.cash.nearby.views;

import com.squareup.cash.activity.backend.contacts.ActivityContact;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class DotGridKt$DotGrid$2$1$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Set f$0;

    public /* synthetic */ DotGridKt$DotGrid$2$1$$ExternalSyntheticLambda0(int i, Set set) {
        this.$r8$classId = i;
        this.f$0 = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Set set = this.f$0;
        switch (i) {
            case 0:
                return Boolean.valueOf(!set.contains(((FrozenPerson) obj).id));
            case 1:
                ((ActivityContact) obj).getClass();
                return Boolean.valueOf(!set.contains(r2.customerId));
            default:
                String str = (String) obj;
                str.getClass();
                set.add(str);
                return Unit.INSTANCE;
        }
    }
}
