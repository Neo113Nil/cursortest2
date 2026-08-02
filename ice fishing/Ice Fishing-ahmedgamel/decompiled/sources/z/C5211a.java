package z;

import w.C5126a;
import w.C5130e;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5211a extends c {

    /* renamed from: A, reason: collision with root package name */
    public int f41974A;

    /* renamed from: B, reason: collision with root package name */
    public int f41975B;

    /* renamed from: C, reason: collision with root package name */
    public C5126a f41976C;

    public boolean getAllowsGoneWidget() {
        return this.f41976C.f41231t0;
    }

    public int getMargin() {
        return this.f41976C.f41232u0;
    }

    public int getType() {
        return this.f41974A;
    }

    @Override // z.c
    public final void h(C5130e c5130e, boolean z6) {
        int i = this.f41974A;
        this.f41975B = i;
        if (z6) {
            if (i == 5) {
                this.f41975B = 1;
            } else if (i == 6) {
                this.f41975B = 0;
            }
        } else if (i == 5) {
            this.f41975B = 0;
        } else if (i == 6) {
            this.f41975B = 1;
        }
        if (c5130e instanceof C5126a) {
            ((C5126a) c5130e).f41230s0 = this.f41975B;
        }
    }

    public void setAllowsGoneWidget(boolean z6) {
        this.f41976C.f41231t0 = z6;
    }

    public void setDpMargin(int i) {
        this.f41976C.f41232u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f41976C.f41232u0 = i;
    }

    public void setType(int i) {
        this.f41974A = i;
    }
}
