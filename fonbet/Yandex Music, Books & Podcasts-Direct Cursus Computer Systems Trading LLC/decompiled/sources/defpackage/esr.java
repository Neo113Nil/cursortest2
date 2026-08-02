package defpackage;

/* loaded from: classes5.dex */
public enum esr {
    PAYWALL("paywall"),
    PAYWALL_RESTORE_PURCHASES("restore_paywall"),
    PROFILE("profile"),
    PROFILE_RESTORE_PURCHASES("restore"),
    BATTERY_RESTRICTIONS("battery_restrictions");

    public final String a;

    esr(String str) {
        this.a = str;
    }
}
