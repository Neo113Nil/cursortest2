package app.cash.redwood.protocol.host;

/* loaded from: classes3.dex */
public final class UiCreate implements UiChange {
    public final int id;
    public final int tag;

    public UiCreate(int i, int i2) {
        this.id = i;
        this.tag = i2;
    }

    @Override // app.cash.redwood.protocol.host.UiChange
    /* renamed from: getId-0HhLjSo */
    public final int mo1387getId0HhLjSo() {
        return this.id;
    }
}
