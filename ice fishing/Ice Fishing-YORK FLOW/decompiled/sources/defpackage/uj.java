package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class uj implements java.util.concurrent.ThreadFactory {
    public final /* synthetic */ java.lang.String ZpBGe2uQfcn8;

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable, this.ZpBGe2uQfcn8);
        thread.setPriority(10);
        return thread;
    }
}
