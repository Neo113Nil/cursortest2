package app.cash.redwood.protocol.host;

/* loaded from: classes3.dex */
public final class UiPropertyChange implements UiChange {
    public final int id;
    public final int tag;
    public final Object value;

    public UiPropertyChange(int i, int i2, Object obj) {
        this.id = i;
        this.tag = i2;
        this.value = obj;
    }

    @Override // app.cash.redwood.protocol.host.UiChange
    /* renamed from: getId-0HhLjSo */
    public final int mo1387getId0HhLjSo() {
        return this.id;
    }
}
