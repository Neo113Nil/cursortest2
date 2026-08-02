package defpackage;

import android.media.AudioTrack;

/* loaded from: classes10.dex */
public final class qh3 {
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public final Object f;

    public qh3(AudioTrack audioTrack, int i) {
        switch (i) {
            case 1:
                if (rf71.a < 19) {
                    this.f = null;
                    b(3);
                    break;
                } else {
                    this.f = new rd71(audioTrack);
                    a();
                    break;
                }
            default:
                this.f = new ph3(audioTrack);
                c();
                break;
        }
    }

    public void a() {
        if (((rd71) this.f) != null) {
            b(0);
        }
    }

    public void b(int i) {
        this.a = i;
        if (i == 0) {
            this.d = 0L;
            this.e = -1L;
            this.b = System.nanoTime() / 1000;
            this.c = 10000L;
            return;
        }
        if (i == 1) {
            this.c = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.c = 10000000L;
        } else if (i == 4) {
            this.c = 500000L;
        } else {
            ny61.k();
        }
    }

    public void c() {
        if (((ph3) this.f) != null) {
            d(0);
        }
    }

    public void d(int i) {
        this.a = i;
        if (i == 0) {
            this.d = 0L;
            this.e = -1L;
            this.b = System.nanoTime() / 1000;
            this.c = 10000L;
            return;
        }
        if (i == 1) {
            this.c = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.c = 10000000L;
        } else if (i == 4) {
            this.c = 500000L;
        } else {
            ny61.k();
        }
    }
}
