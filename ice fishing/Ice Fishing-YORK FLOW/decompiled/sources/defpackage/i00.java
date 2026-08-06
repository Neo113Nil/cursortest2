package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class i00 implements java.util.concurrent.Callable {
    public final /* synthetic */ java.lang.String ZpBGe2uQfcn8;
    public final /* synthetic */ java.util.ArrayList fWTAfUmVKrZq;
    public final /* synthetic */ android.content.Context giKS3J6vZuNy;

    public i00(java.lang.String str, android.content.Context context, java.util.ArrayList arrayList) {
        this.ZpBGe2uQfcn8 = str;
        this.giKS3J6vZuNy = context;
        this.fWTAfUmVKrZq = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        try {
            return defpackage.k00.ZpBGe2uQfcn8(this.ZpBGe2uQfcn8, this.giKS3J6vZuNy, this.fWTAfUmVKrZq);
        } catch (java.lang.Throwable unused) {
            return new defpackage.j00(-3);
        }
    }
}
