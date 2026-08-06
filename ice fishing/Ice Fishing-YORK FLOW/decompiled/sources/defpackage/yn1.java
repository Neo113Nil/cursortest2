package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class yn1 implements defpackage.im {
    public final java.lang.ThreadLocal WDYagTQQm9ns;

    public yn1(java.lang.ThreadLocal threadLocal) {
        this.WDYagTQQm9ns = threadLocal;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.yn1) && defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns, ((defpackage.yn1) obj).WDYagTQQm9ns);
    }

    public final int hashCode() {
        return this.WDYagTQQm9ns.hashCode();
    }

    public final java.lang.String toString() {
        return "ThreadLocalKey(threadLocal=" + this.WDYagTQQm9ns + ')';
    }
}
