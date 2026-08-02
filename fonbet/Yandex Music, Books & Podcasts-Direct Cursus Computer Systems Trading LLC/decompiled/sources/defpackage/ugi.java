package defpackage;

/* loaded from: classes.dex */
public final class ugi {
    public final long a;
    public final hep b;
    public final hep c;
    public cds e;
    public final ugi d = this;
    public int f = -1;

    public ugi(long j, hep hepVar, hep hepVar2) {
        this.a = j;
        this.b = hepVar;
        this.c = hepVar2;
    }

    public final long a(ydp ydpVar, boolean z) {
        cds cdsVar;
        xdp xdpVar = ydpVar.b;
        xdp xdpVar2 = ydpVar.a;
        long j = this.a;
        if (z && xdpVar2.c != j) {
            return 9205357640488583168L;
        }
        if ((!z && xdpVar.c != j) || c() == null || (cdsVar = (cds) this.c.invoke()) == null) {
            return 9205357640488583168L;
        }
        return p6g.y(cdsVar, yhn.d(z ? xdpVar2.b : xdpVar.b, 0, b(cdsVar)), z, ydpVar.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(cds cdsVar) {
        int i;
        boolean z;
        int f;
        int i2;
        synchronized (this.d) {
            try {
                if (this.e != cdsVar) {
                    ogi ogiVar = cdsVar.b;
                    boolean z2 = ogiVar.c;
                    int i3 = 0;
                    if (!z2 && ((int) (cdsVar.c & 4294967295L)) >= ogiVar.e) {
                        z = false;
                        if (z && !z2) {
                            f = ogiVar.f((int) (cdsVar.c & 4294967295L));
                            i2 = cdsVar.b.f - 1;
                            if (f > i2) {
                                f = i2;
                            }
                            while (f >= 0 && cdsVar.b.h(f) >= ((int) (cdsVar.c & 4294967295L))) {
                                f--;
                            }
                            if (f < 0) {
                                i3 = f;
                            }
                            this.f = cdsVar.b.d(i3, true);
                            this.e = cdsVar;
                        }
                        i3 = ogiVar.f - 1;
                        this.f = cdsVar.b.d(i3, true);
                        this.e = cdsVar;
                    }
                    z = true;
                    if (z) {
                        f = ogiVar.f((int) (cdsVar.c & 4294967295L));
                        i2 = cdsVar.b.f - 1;
                        if (f > i2) {
                        }
                        while (f >= 0) {
                            f--;
                        }
                        if (f < 0) {
                        }
                        this.f = cdsVar.b.d(i3, true);
                        this.e = cdsVar;
                    }
                    i3 = ogiVar.f - 1;
                    this.f = cdsVar.b.d(i3, true);
                    this.e = cdsVar;
                }
                i = this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final wof c() {
        wof wofVar = (wof) this.b.invoke();
        if (wofVar == null || !wofVar.d()) {
            return null;
        }
        return wofVar;
    }

    public final mn0 d() {
        cds cdsVar = (cds) this.c.invoke();
        return cdsVar == null ? new mn0("") : cdsVar.a.a;
    }
}
