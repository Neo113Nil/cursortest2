package defpackage;

import ru.yandex.music.shortcuts.ShortcutsHelper$ShortcutsWorker;

/* loaded from: classes6.dex */
public final class rdq extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ShortcutsHelper$ShortcutsWorker k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rdq(ShortcutsHelper$ShortcutsWorker shortcutsHelper$ShortcutsWorker, cg6 cg6Var) {
        super(cg6Var);
        this.k = shortcutsHelper$ShortcutsWorker;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(this);
    }
}
