package ru.yandex.taxi.ui;

import android.view.View;
import defpackage.el40;
import defpackage.gtg;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\nJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/ui/DebounceClickListener;", "Lru/yandex/taxi/ui/MultiClickHandler$OnClickListener;", "Lel40;", "multiClickHandler", "Lkotlin/Function0;", "Lzy11;", "onClickAction", "<init>", "(Lel40;Lsls;)V", "Ljava/lang/Runnable;", "(Lel40;Ljava/lang/Runnable;)V", "Landroid/view/View;", "v", "performActionsOnClick", "(Landroid/view/View;)V", "Lsls;", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DebounceClickListener extends MultiClickHandler$OnClickListener {
    private final sls onClickAction;

    public DebounceClickListener(el40 el40Var, Runnable runnable) {
        this(el40Var, new gtg(0, runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(Runnable runnable) {
        runnable.run();
        return zy11.a;
    }

    @Override // ru.yandex.taxi.ui.MultiClickHandler$OnClickListener
    public void performActionsOnClick(View v) {
        this.onClickAction.invoke();
    }

    public DebounceClickListener(el40 el40Var, sls slsVar) {
        super(el40Var);
        this.onClickAction = slsVar;
    }
}
