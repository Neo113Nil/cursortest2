package m4;

import a4.InterfaceC0439c;

/* renamed from: m4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC4745c implements InterfaceC0439c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);


    /* renamed from: n, reason: collision with root package name */
    public final int f39452n;

    EnumC4745c(int i) {
        this.f39452n = i;
    }

    @Override // a4.InterfaceC0439c
    public final int getNumber() {
        return this.f39452n;
    }
}
