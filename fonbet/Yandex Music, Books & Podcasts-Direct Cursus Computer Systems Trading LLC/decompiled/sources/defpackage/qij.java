package defpackage;

/* loaded from: classes5.dex */
public final class qij extends cv2 implements wjj, Runnable {
    private static final long serialVersionUID = 6576896619930983584L;
    public final wjj a;
    public final ito b;
    public final int c;
    public qjq d;
    public ka8 e;
    public Throwable f;
    public volatile boolean g;
    public volatile boolean h;
    public int i;
    public boolean j;

    public qij(wjj wjjVar, ito itoVar, int i) {
        this.a = wjjVar;
        this.b = itoVar;
        this.c = i;
    }

    @Override // defpackage.ka8
    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.a();
        this.b.a();
        if (this.j || getAndIncrement() != 0) {
            return;
        }
        this.d.clear();
    }

    @Override // defpackage.wjj
    public final void b(ka8 ka8Var) {
        if (ra8.h(this.e, ka8Var)) {
            this.e = ka8Var;
            if (ka8Var instanceof x8n) {
                x8n x8nVar = (x8n) ka8Var;
                int c = x8nVar.c();
                if (c == 1) {
                    this.i = c;
                    this.d = x8nVar;
                    this.g = true;
                    this.a.b(this);
                    if (getAndIncrement() == 0) {
                        this.b.d(this);
                        return;
                    }
                    return;
                }
                if (c == 2) {
                    this.i = c;
                    this.d = x8nVar;
                    this.a.b(this);
                    return;
                }
            }
            this.d = new d9r(this.c);
            this.a.b(this);
        }
    }

    @Override // defpackage.x8n
    public final int c() {
        this.j = true;
        return 2;
    }

    @Override // defpackage.qjq
    public final void clear() {
        this.d.clear();
    }

    public final boolean d(boolean z, boolean z2, wjj wjjVar) {
        if (this.h) {
            this.d.clear();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.f;
        if (th != null) {
            this.h = true;
            this.d.clear();
            wjjVar.onError(th);
            this.b.a();
            return true;
        }
        if (!z2) {
            return false;
        }
        this.h = true;
        wjjVar.onComplete();
        this.b.a();
        return true;
    }

    @Override // defpackage.qjq
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // defpackage.wjj
    public final void onComplete() {
        if (this.g) {
            return;
        }
        this.g = true;
        if (getAndIncrement() == 0) {
            this.b.d(this);
        }
    }

    @Override // defpackage.wjj
    public final void onError(Throwable th) {
        if (this.g) {
            y5g.g0(th);
            return;
        }
        this.f = th;
        this.g = true;
        if (getAndIncrement() == 0) {
            this.b.d(this);
        }
    }

    @Override // defpackage.wjj
    public final void onNext(Object obj) {
        if (this.g) {
            return;
        }
        if (this.i != 2) {
            this.d.offer(obj);
        }
        if (getAndIncrement() == 0) {
            this.b.d(this);
        }
    }

    @Override // defpackage.qjq
    public final Object poll() {
        return this.d.poll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x006e, code lost:
    
        r3 = addAndGet(-r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0073, code lost:
    
        if (r3 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        if (!this.j) {
            qjq qjqVar = this.d;
            wjj wjjVar = this.a;
            int i = 1;
            while (!d(this.g, qjqVar.isEmpty(), wjjVar)) {
                while (true) {
                    boolean z = this.g;
                    try {
                        Object poll = qjqVar.poll();
                        boolean z2 = poll == null;
                        if (d(z, z2, wjjVar)) {
                            return;
                        }
                        if (z2) {
                            break;
                        } else {
                            wjjVar.onNext(poll);
                        }
                    } catch (Throwable th) {
                        leu.a0(th);
                        this.h = true;
                        this.e.a();
                        qjqVar.clear();
                        wjjVar.onError(th);
                        this.b.a();
                        return;
                    }
                }
            }
            return;
        }
        int i2 = 1;
        while (!this.h) {
            boolean z3 = this.g;
            Throwable th2 = this.f;
            if (z3 && th2 != null) {
                this.h = true;
                this.a.onError(this.f);
                this.b.a();
                return;
            }
            this.a.onNext(null);
            if (z3) {
                this.h = true;
                Throwable th3 = this.f;
                wjj wjjVar2 = this.a;
                if (th3 != null) {
                    wjjVar2.onError(th3);
                } else {
                    wjjVar2.onComplete();
                }
                this.b.a();
                return;
            }
            i2 = addAndGet(-i2);
            if (i2 == 0) {
                return;
            }
        }
    }
}
