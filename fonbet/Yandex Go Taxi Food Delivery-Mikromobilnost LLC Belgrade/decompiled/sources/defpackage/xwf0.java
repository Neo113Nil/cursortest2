package defpackage;

import com.yandex.quark.utils.Disposable;

/* loaded from: classes2.dex */
public final class xwf0 implements Disposable {
    public Disposable a;
    public boolean b;

    public final synchronized void a(Disposable disposable) {
        try {
            if (this.b) {
                disposable.dispose();
            } else {
                this.a = disposable;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.yandex.quark.utils.Disposable
    public final synchronized void dispose() {
        try {
            this.b = true;
            Disposable disposable = this.a;
            if (disposable != null) {
                disposable.dispose();
            }
            this.a = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
