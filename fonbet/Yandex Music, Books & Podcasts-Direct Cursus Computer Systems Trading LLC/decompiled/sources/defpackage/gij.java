package defpackage;

/* loaded from: classes5.dex */
public final class gij extends av2 {
    public Object e;
    public boolean f;

    @Override // defpackage.av2, defpackage.x8n
    public final int c() {
        return 0;
    }

    @Override // defpackage.wjj
    public final void onNext(Object obj) {
        if (this.d) {
            return;
        }
        try {
            if (this.f) {
                boolean s = up6.s(this.e, obj);
                this.e = obj;
                if (s) {
                    return;
                }
            } else {
                this.f = true;
                this.e = obj;
            }
            this.a.onNext(obj);
        } catch (Throwable th) {
            leu.a0(th);
            this.b.a();
            onError(th);
        }
    }

    @Override // defpackage.qjq
    public final Object poll() {
        while (true) {
            Object poll = this.c.poll();
            if (poll == null) {
                return null;
            }
            if (!this.f) {
                this.f = true;
                this.e = poll;
                return poll;
            }
            if (!up6.s(this.e, poll)) {
                this.e = poll;
                return poll;
            }
            this.e = poll;
        }
    }
}
