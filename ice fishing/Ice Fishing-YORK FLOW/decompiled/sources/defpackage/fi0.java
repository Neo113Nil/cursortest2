package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class fi0 implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener, defpackage.dg1 {
    public final defpackage.di0 QiMR8OkAhezm;
    public final defpackage.pw0 WDYagTQQm9ns = defpackage.w60.hH0RRJrNssvh(java.lang.Boolean.FALSE);
    public final defpackage.ei0 oh71FJcDz6S2 = new defpackage.ei0();

    public fi0() {
        this.QiMR8OkAhezm = android.os.Build.VERSION.SDK_INT >= 33 ? new defpackage.di0(this) : null;
    }

    public static boolean ZpBGe2uQfcn8(android.view.accessibility.AccessibilityManager accessibilityManager) {
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            java.lang.String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && defpackage.tg1.Jkfc0NcwyPL8(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean giKS3J6vZuNy(android.view.accessibility.AccessibilityManager accessibilityManager) {
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            java.lang.String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && defpackage.tg1.Jkfc0NcwyPL8(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (((java.lang.Boolean) r2.ZpBGe2uQfcn8.getValue()).booleanValue() == true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (((java.lang.Boolean) r2.giKS3J6vZuNy.getValue()).booleanValue() == true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (((java.lang.Boolean) r1.WDYagTQQm9ns.getValue()).booleanValue() == true) goto L19;
     */
    @Override // defpackage.dg1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getValue() {
        boolean z;
        if (((java.lang.Boolean) this.WDYagTQQm9ns.getValue()).booleanValue()) {
            z = true;
            defpackage.ei0 ei0Var = this.oh71FJcDz6S2;
            if (ei0Var != null) {
            }
            defpackage.di0 di0Var = this.QiMR8OkAhezm;
            if (di0Var != null) {
            }
            if (di0Var != null) {
            }
        }
        z = false;
        return java.lang.Boolean.valueOf(z);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.WDYagTQQm9ns.setValue(java.lang.Boolean.valueOf(z));
    }
}
