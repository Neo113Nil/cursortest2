package ru.yandex.taxi.plaque.widgets;

import android.content.Context;
import android.widget.LinearLayout;
import defpackage.kp50;
import defpackage.l76;
import defpackage.mf20;
import defpackage.og20;
import defpackage.pg20;
import defpackage.sg20;
import defpackage.v8o;
import defpackage.wfz;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/plaque/widgets/HorizontalGroupMicroWidgetView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Lsg20;", "microWidgetsFactory", "Lv8o;", "errorReporter", "<init>", "(Landroid/content/Context;Lsg20;Lv8o;)V", "Lmf20;", "model", "Lzy11;", "updateModel", "(Lmf20;)V", "Lpg20;", "adapter", "Lpg20;", "l76", "plaque_sdk"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HorizontalGroupMicroWidgetView extends LinearLayout {
    private final pg20 adapter;

    public HorizontalGroupMicroWidgetView(Context context, sg20 sg20Var, v8o v8oVar) {
        super(context);
        setTransitionName("plaque_group_widget_transition_name");
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setGravity(16);
        setClipChildren(false);
        setClipToPadding(false);
        this.adapter = new pg20(this, sg20Var, l76.E, v8oVar);
    }

    public final void updateModel(mf20 model) {
        pg20 pg20Var = this.adapter;
        ArrayList arrayList = model.d;
        List list = pg20Var.A;
        pg20Var.A = arrayList;
        pg20Var.f(kp50.f(new og20(list, arrayList, pg20Var), true));
        wfz.b(this, model.c);
        wfz.a(this, model.e, null);
    }
}
