package ru.yandex.taxi.ui;

import android.view.View;
import defpackage.el40;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"ru/yandex/taxi/ui/MultiClickHandler$OnClickListener", "Landroid/view/View$OnClickListener;", "Lel40;", "handler", "<init>", "(Lel40;)V", "Landroid/view/View;", "v", "Lzy11;", "performActionsOnClick", "(Landroid/view/View;)V", "onClick", "Lel40;", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class MultiClickHandler$OnClickListener implements View.OnClickListener {
    private final el40 handler;

    public MultiClickHandler$OnClickListener(el40 el40Var) {
        this.handler = el40Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        if (this.handler.satisfiesClickDelay()) {
            this.handler.updateLastClickOnItemTimestamp();
            performActionsOnClick(v);
        }
    }

    public abstract void performActionsOnClick(View v);
}
