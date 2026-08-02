package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.yandex.messaging.internal.entities.AiBotAction;
import defpackage.acb;
import defpackage.kgx;
import defpackage.nka1;
import defpackage.pj91;
import defpackage.pzt0;
import defpackage.qm1;
import defpackage.rm1;
import defpackage.rp3;
import defpackage.scc;
import defpackage.sm1;
import defpackage.tje;
import defpackage.tse;
import defpackage.tu10;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes15.dex */
public final class qm1 implements kh00 {
    public boolean a;
    public final /* synthetic */ pm1 b;
    public final /* synthetic */ AiBotAction c;

    public qm1(pm1 pm1Var, AiBotAction aiBotAction, final rm1 rm1Var, final AiBotAction aiBotAction2, final tu10 tu10Var, final acb acbVar, final List list) {
        this.b = pm1Var;
        this.c = aiBotAction;
        pm1Var.b.setContentDescription(aiBotAction.getTitle());
        View view = pm1Var.a;
        view.setContentDescription(aiBotAction.getTitle());
        view.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.messaging.internal.view.timeline.AiBotActionsUiDelegate$bindActions$lambda$3$$inlined$createAiBotActionsStatesApplications$1$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                if (qm1.this.a) {
                    return;
                }
                sm1 sm1Var = rm1Var.b;
                AiBotAction aiBotAction3 = aiBotAction2;
                tu10 tu10Var2 = tu10Var;
                List M = kotlin.collections.a.M(aiBotAction3.getDirectives());
                sm1Var.a("ai_bot_action_pressed", aiBotAction3, tu10Var2, scc.g(new Pair("all_directives_count", Integer.valueOf(aiBotAction3.getDirectives().size())), new Pair("parsed_directives_count", Integer.valueOf(((ArrayList) M).size())), new Pair("parsed_directives", M)));
                acb acbVar2 = acbVar;
                rm1 rm1Var2 = rm1Var;
                if (acbVar2 == null) {
                    rp3 rp3Var = rm1Var2.i;
                    kgx kgxVar = rm1.k[0];
                    rp3Var.a(null);
                } else {
                    tse c = nka1.c(pj91.f(rm1Var2.a));
                    rm1 rm1Var3 = rm1Var;
                    pzt0 N = tje.N(c, rm1Var3.c.c, null, new AiBotActionsUiDelegate$bindActions$1$statesApplications$1$2(acbVar, list, aiBotAction2, tu10Var, rm1Var3, null), 2);
                    rp3 rp3Var2 = rm1Var2.i;
                    kgx kgxVar2 = rm1.k[0];
                    rp3Var2.a(N);
                }
            }
        });
    }

    @Override // defpackage.kh00
    public final boolean a() {
        AiBotAction.Icon icon = this.c.getIcon();
        Pair pair = null;
        if (icon.getType() == 0) {
            int value = icon.getValue();
            if (value == 0) {
                pair = new Pair(Integer.valueOf(wwg0.msg_ic_just_like_ai_bot_action), Integer.valueOf(jng0.messagingCommonTextSecondaryColor));
            } else if (value == 1) {
                pair = new Pair(Integer.valueOf(wwg0.msg_ic_pressed_like_ai_bot_action), Integer.valueOf(jng0.messagingCommonAccentLineColor));
            } else if (value == 2) {
                pair = new Pair(Integer.valueOf(wwg0.msg_ic_just_dislike_ai_bot_action), Integer.valueOf(jng0.messagingCommonTextSecondaryColor));
            } else if (value != 3) {
                z83.i();
            } else {
                pair = new Pair(Integer.valueOf(wwg0.msg_ic_pressed_dislike_ai_bot_action), Integer.valueOf(jng0.messagingCommonAccentLineColor));
            }
        } else {
            z83.i();
        }
        if (pair == null) {
            return false;
        }
        int intValue = ((Number) pair.getFirst()).intValue();
        int intValue2 = ((Number) pair.getSecond()).intValue();
        this.a = false;
        pm1 pm1Var = this.b;
        pm1Var.b.setImageResource(intValue);
        ImageView imageView = pm1Var.b;
        imageView.getDrawable().setTint(drb1.c(intValue2, imageView.getContext()));
        return true;
    }

    @Override // defpackage.kh00
    public final void b() {
        this.a = true;
        ImageView imageView = this.b.b;
        imageView.getDrawable().setTint(imageView.getResources().getColor(ipg0.ai_bot_action_disabled, null));
    }

    @Override // defpackage.kh00
    public final void c() {
        this.a = true;
        ImageView imageView = this.b.b;
        imageView.getDrawable().setTint(imageView.getResources().getColor(ipg0.ai_bot_action_disabled, null));
    }
}
