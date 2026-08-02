package app.cash.redwood.protocol.host;

import app.cash.redwood.Modifier;

/* loaded from: classes3.dex */
public final class UiModifierChange implements UiChange {
    public final int id;
    public final Modifier modifier;
    public final boolean reuse;

    public UiModifierChange(int i, boolean z, Modifier modifier) {
        modifier.getClass();
        this.id = i;
        this.reuse = z;
        this.modifier = modifier;
    }

    @Override // app.cash.redwood.protocol.host.UiChange
    /* renamed from: getId-0HhLjSo */
    public final int mo1387getId0HhLjSo() {
        return this.id;
    }
}
