package ru.yandex.taxi.plaque.level;

import android.content.Context;
import android.widget.LinearLayout;
import defpackage.bei;
import defpackage.g700;
import defpackage.gf20;
import defpackage.hjc0;
import defpackage.ijc0;
import defpackage.kp50;
import defpackage.n22;
import defpackage.og20;
import defpackage.pg20;
import defpackage.q0d0;
import defpackage.sg20;
import defpackage.v8o;
import defpackage.wfz;
import defpackage.wwx0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.plus.sdk.badge.widget.a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/plaque/level/MicroWidgetLevelView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Lsg20;", "microWidgetsFactory", "Lv8o;", "errorReporter", "Lhjc0;", "plaqueCallback", "<init>", "(Landroid/content/Context;Lsg20;Lv8o;Lhjc0;)V", "Lgf20;", "levelModel", "Lzy11;", "updateLevelModel", "(Lgf20;)V", "Lhjc0;", "Lpg20;", "adapter", "Lpg20;", "bei", "plaque_sdk"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MicroWidgetLevelView extends LinearLayout {
    private final pg20 adapter;
    private final hjc0 plaqueCallback;

    public MicroWidgetLevelView(Context context, sg20 sg20Var, v8o v8oVar, hjc0 hjc0Var) {
        super(context);
        this.plaqueCallback = hjc0Var;
        this.adapter = new pg20(this, sg20Var, bei.H, v8oVar);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(0);
        setTransitionName("plaque_level_transition_name");
        setGravity(16);
        setClipChildren(false);
        setClipToPadding(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 updateLevelModel$lambda$0$0(MicroWidgetLevelView microWidgetLevelView, gf20 gf20Var) {
        ijc0 ijc0Var = (ijc0) microWidgetLevelView.plaqueCallback;
        wwx0 wwx0Var = ijc0Var.b;
        String str = gf20Var.a;
        q0d0 q0d0Var = gf20Var.e;
        wwx0Var.b(new n22(str, q0d0Var != null ? q0d0Var : null));
        a aVar = ijc0Var.a;
        if (q0d0Var == null) {
            q0d0Var = null;
        }
        a.d(aVar, q0d0Var);
        return zy11.a;
    }

    public final void updateLevelModel(gf20 levelModel) {
        pg20 pg20Var = this.adapter;
        List list = levelModel.b;
        List list2 = pg20Var.A;
        pg20Var.A = list;
        pg20Var.f(kp50.f(new og20(list2, list, pg20Var), true));
        wfz.b(this, levelModel.c);
        wfz.a(this, levelModel.d, null);
        if (levelModel.e != null) {
            c.z(new g700(17, this, levelModel), this);
        }
    }
}
