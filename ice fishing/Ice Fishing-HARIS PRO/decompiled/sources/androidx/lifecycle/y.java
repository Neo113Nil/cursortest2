package androidx.lifecycle;

import Z.AbstractComponentCallbacksC0070s;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public final A f2056a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2057b;

    /* renamed from: c, reason: collision with root package name */
    public int f2058c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f2059d;

    public y(z zVar, A a2) {
        this.f2059d = zVar;
        this.f2056a = a2;
    }

    public final void b(boolean z2) {
        if (z2 == this.f2057b) {
            return;
        }
        this.f2057b = z2;
        int i = z2 ? 1 : -1;
        z zVar = this.f2059d;
        int i2 = zVar.f2062c;
        zVar.f2062c = i + i2;
        if (!zVar.f2063d) {
            zVar.f2063d = true;
            while (true) {
                try {
                    int i3 = zVar.f2062c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    zVar.f2063d = false;
                }
            }
        }
        if (this.f2057b) {
            zVar.c(this);
        }
    }

    public void c() {
    }

    public boolean d(AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s) {
        return false;
    }

    public abstract boolean e();
}
