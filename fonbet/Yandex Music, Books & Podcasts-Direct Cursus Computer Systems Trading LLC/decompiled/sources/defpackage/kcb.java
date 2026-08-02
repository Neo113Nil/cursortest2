package defpackage;

import ru.yandex.music.entry.EntryScreenActivity;

/* loaded from: classes5.dex */
public final class kcb extends kpj {
    public final /* synthetic */ EntryScreenActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kcb(EntryScreenActivity entryScreenActivity) {
        super(true);
        this.b = entryScreenActivity;
    }

    @Override // defpackage.kpj
    public final void handleOnBackPressed() {
        this.b.finish();
    }
}
