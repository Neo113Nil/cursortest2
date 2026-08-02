package defpackage;

import com.yandex.plus2.sdk.widget.daily.internal.entry.DailyWidgetWorker;

/* loaded from: classes5.dex */
public final class y87 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ DailyWidgetWorker k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y87(DailyWidgetWorker dailyWidgetWorker, cg6 cg6Var) {
        super(cg6Var);
        this.k = dailyWidgetWorker;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(this);
    }
}
