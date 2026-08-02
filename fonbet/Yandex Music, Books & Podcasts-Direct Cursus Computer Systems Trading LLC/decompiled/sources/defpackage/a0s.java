package defpackage;

/* loaded from: classes5.dex */
public enum a0s implements hse {
    INSTALLER_PACKAGE_UNKNOWN(0),
    INSTALLER_PACKAGE_NONE(1),
    INSTALLER_PACKAGE_GOOGLE_PLAY_STORE(2),
    INSTALLER_PACKAGE_OTHER(3);

    public final int a;

    a0s(int i) {
        this.a = i;
    }

    @Override // defpackage.hse
    public final int a() {
        return this.a;
    }
}
