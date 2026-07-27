package c2;

/* renamed from: c2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0536c implements Y3.c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* renamed from: n, reason: collision with root package name */
    public final int f5543n;

    EnumC0536c(int i) {
        this.f5543n = i;
    }

    @Override // Y3.c
    public final int getNumber() {
        return this.f5543n;
    }
}
