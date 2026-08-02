package defpackage;

import ru.yandex.music.widget.VivoWidgetUpdateWorker;

/* loaded from: classes6.dex */
public final class viu extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ VivoWidgetUpdateWorker k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public viu(VivoWidgetUpdateWorker vivoWidgetUpdateWorker, cg6 cg6Var) {
        super(cg6Var);
        this.k = vivoWidgetUpdateWorker;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(this);
    }
}
