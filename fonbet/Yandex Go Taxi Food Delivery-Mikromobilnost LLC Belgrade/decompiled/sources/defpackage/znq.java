package defpackage;

import com.yandex.go.flex.main_screen.presentation.feed.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class znq implements i231 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ znq(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.i231
    public final c231 create() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                u131 u131Var = new u131("is_feed_go_available", false);
                u131Var.a(new dq0(2, this));
                return u131Var;
            case 1:
                u131 u131Var2 = new u131("is_feed_go_loading", false);
                u131Var2.a(new dq0(3, this));
                return u131Var2;
            case 2:
                z131 z131Var = new z131("feed_onboarding_visibility_variable", "invisible");
                z131Var.a(new dq0(4, this));
                return z131Var;
            case 3:
                return new z131("superapp.host", ((not) ((ju6) obj)).e());
            case 4:
                r0 r0Var = ((e) obj).d;
                Boolean bool = Boolean.FALSE;
                r0Var.getClass();
                r0Var.m(null, bool);
                u131 u131Var3 = new u131("is_sticked_feed", false);
                u131Var3.a(new dq0(10, this));
                return u131Var3;
            default:
                u131 u131Var4 = new u131("is_sticked_orders", false);
                u131Var4.a(new dq0(11, this));
                return u131Var4;
        }
    }
}
