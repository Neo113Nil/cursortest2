package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class b implements defpackage.ye {
    public final defpackage.c ZpBGe2uQfcn8;

    public b(defpackage.c cVar) {
        this.ZpBGe2uQfcn8 = cVar;
    }

    public final void ZpBGe2uQfcn8(defpackage.xe xeVar) {
        defpackage.c cVar = this.ZpBGe2uQfcn8;
        if (xeVar != null) {
            cVar.ZpBGe2uQfcn8().setPrimaryClip(xeVar.ZpBGe2uQfcn8);
        } else if (android.os.Build.VERSION.SDK_INT >= 28) {
            cVar.ZpBGe2uQfcn8().clearPrimaryClip();
        } else {
            cVar.ZpBGe2uQfcn8().setPrimaryClip(android.content.ClipData.newPlainText("", ""));
        }
    }
}
