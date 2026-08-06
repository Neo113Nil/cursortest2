package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class m4 extends java.lang.ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final java.lang.Object initialValue() {
        android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper != null) {
            defpackage.o4 o4Var = new defpackage.o4(choreographer, defpackage.ma0.T1fB7bDYiVJQ(myLooper));
            return defpackage.h0.zJPqDeoF0Os1(o4Var, o4Var.XntWc4eZSQ8j);
        }
        defpackage.h7.P05cfTpS5W5L("no Looper on this thread");
        return null;
    }
}
