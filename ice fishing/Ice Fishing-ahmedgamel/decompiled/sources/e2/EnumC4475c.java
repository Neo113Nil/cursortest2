package e2;

import a4.InterfaceC0439c;

/* renamed from: e2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC4475c implements InterfaceC0439c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* renamed from: n, reason: collision with root package name */
    public final int f37258n;

    EnumC4475c(int i) {
        this.f37258n = i;
    }

    @Override // a4.InterfaceC0439c
    public final int getNumber() {
        return this.f37258n;
    }
}
