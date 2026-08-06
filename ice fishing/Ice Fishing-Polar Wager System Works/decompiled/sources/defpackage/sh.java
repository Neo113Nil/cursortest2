package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class sh implements java.util.concurrent.ThreadFactory {
    public final /* synthetic */ java.lang.String IHQe1A4L2xu;

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable, this.IHQe1A4L2xu);
        thread.setPriority(10);
        return thread;
    }
}
