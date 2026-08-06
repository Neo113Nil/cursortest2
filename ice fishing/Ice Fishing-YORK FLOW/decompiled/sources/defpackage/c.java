package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class c implements defpackage.ze {
    public final android.content.Context ZpBGe2uQfcn8;
    public android.content.ClipboardManager giKS3J6vZuNy;

    public c(android.content.Context context) {
        this.ZpBGe2uQfcn8 = context;
    }

    public final android.content.ClipboardManager ZpBGe2uQfcn8() {
        android.content.ClipboardManager clipboardManager = this.giKS3J6vZuNy;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        java.lang.Object systemService = this.ZpBGe2uQfcn8.getSystemService("clipboard");
        systemService.getClass();
        android.content.ClipboardManager clipboardManager2 = (android.content.ClipboardManager) systemService;
        this.giKS3J6vZuNy = clipboardManager2;
        return clipboardManager2;
    }
}
