package app.cash.redwood.protocol.host;

import app.cash.redwood.protocol.ChildrenChange;

/* loaded from: classes3.dex */
public final class UiChildrenChange implements UiChange {
    public final ChildrenChange change;

    public UiChildrenChange(ChildrenChange childrenChange) {
        this.change = childrenChange;
    }

    @Override // app.cash.redwood.protocol.host.UiChange
    /* renamed from: getId-0HhLjSo */
    public final int mo1387getId0HhLjSo() {
        return this.change.mo1368getId0HhLjSo();
    }
}
