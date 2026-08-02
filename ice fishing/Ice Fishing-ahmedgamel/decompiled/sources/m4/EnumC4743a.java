package m4;

import a4.InterfaceC0439c;

/* renamed from: m4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC4743a implements InterfaceC0439c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_OPEN(2);


    /* renamed from: n, reason: collision with root package name */
    public final int f39445n;

    EnumC4743a(int i) {
        this.f39445n = i;
    }

    @Override // a4.InterfaceC0439c
    public final int getNumber() {
        return this.f39445n;
    }
}
