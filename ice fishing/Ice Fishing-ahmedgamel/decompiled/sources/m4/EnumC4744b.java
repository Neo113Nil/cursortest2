package m4;

import a4.InterfaceC0439c;

/* renamed from: m4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC4744b implements InterfaceC0439c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    DATA_MESSAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);


    /* renamed from: n, reason: collision with root package name */
    public final int f39449n;

    EnumC4744b(int i) {
        this.f39449n = i;
    }

    @Override // a4.InterfaceC0439c
    public final int getNumber() {
        return this.f39449n;
    }
}
