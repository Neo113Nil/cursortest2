package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes10.dex */
public class zdh implements owy {
    public final long A;
    public final HashMap B;
    public long C;
    public final k4h a;
    public final long b;
    public final long c;
    public final long w;
    public final long x;
    public final int y;
    public final boolean z;

    public static final class a {
        public k4h a;
        public int b = 50000;
        public int c = 50000;
        public int d = 1000;
        public int e = 2000;
        public boolean f = false;
        public boolean g;

        public final zdh a() {
            d6z.x(!this.g);
            this.g = true;
            if (this.a == null) {
                this.a = new k4h();
            }
            return new zdh(this.a, this.b, this.c, this.d, this.e, this.f);
        }

        public final void b(int i, int i2, int i3, int i4) {
            d6z.x(!this.g);
            zdh.a(i3, 0, "bufferForPlaybackMs", "0");
            zdh.a(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
            zdh.a(i, i3, "minBufferMs", "bufferForPlaybackMs");
            zdh.a(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            zdh.a(i2, i, "maxBufferMs", "minBufferMs");
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    public zdh(k4h k4hVar, int i, int i2, int i3, int i4, boolean z) {
        a(i3, 0, "bufferForPlaybackMs", "0");
        a(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i, i3, "minBufferMs", "bufferForPlaybackMs");
        a(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i2, i, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.a = k4hVar;
        this.b = tw21.W(i);
        this.c = tw21.W(i2);
        this.w = tw21.W(i3);
        this.x = tw21.W(i4);
        this.y = -1;
        this.z = z;
        this.A = tw21.W(0L);
        this.B = new HashMap();
        this.C = -1L;
    }

    public static void a(int i, int i2, String str, String str2) {
        d6z.k(str + " cannot be less than " + str2, i >= i2);
    }

    public final int b() {
        Iterator it = this.B.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((aeh) it.next()).b;
        }
        return i;
    }

    @Override // defpackage.owy
    public final au1 getAllocator() {
        return this.a;
    }

    @Override // defpackage.owy
    public final long getBackBufferDurationUs(vyc0 vyc0Var) {
        return this.A;
    }

    @Override // defpackage.owy
    public final void onPrepared(vyc0 vyc0Var) {
        long id = Thread.currentThread().getId();
        long j = this.C;
        d6z.w("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        this.C = id;
        HashMap hashMap = this.B;
        if (!hashMap.containsKey(vyc0Var)) {
            hashMap.put(vyc0Var, new aeh());
        }
        aeh aehVar = (aeh) hashMap.get(vyc0Var);
        aehVar.getClass();
        int i = this.y;
        if (i == -1) {
            i = 13107200;
        }
        aehVar.b = i;
        aehVar.a = false;
    }

    @Override // defpackage.owy
    public final void onReleased(vyc0 vyc0Var) {
        if (this.B.remove(vyc0Var) != null) {
            boolean isEmpty = this.B.isEmpty();
            k4h k4hVar = this.a;
            if (isEmpty) {
                synchronized (k4hVar) {
                    if (k4hVar.a) {
                        k4hVar.b(0);
                    }
                }
            } else {
                k4hVar.b(b());
            }
        }
        if (this.B.isEmpty()) {
            this.C = -1L;
        }
    }

    @Override // defpackage.owy
    public final void onStopped(vyc0 vyc0Var) {
        if (this.B.remove(vyc0Var) != null) {
            boolean isEmpty = this.B.isEmpty();
            k4h k4hVar = this.a;
            if (!isEmpty) {
                k4hVar.b(b());
                return;
            }
            synchronized (k4hVar) {
                if (k4hVar.a) {
                    k4hVar.b(0);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.owy
    public final void onTracksSelected(nwy nwyVar, yzz0 yzz0Var, loo[] looVarArr) {
        aeh aehVar = (aeh) this.B.get(nwyVar.a);
        aehVar.getClass();
        int i = this.y;
        if (i == -1) {
            int length = looVarArr.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = 13107200;
                if (i2 < length) {
                    loo looVar = looVarArr[i2];
                    if (looVar != null) {
                        switch (looVar.getTrackGroup().c) {
                            case -2:
                                i4 = 0;
                                i3 += i4;
                                break;
                            case -1:
                            case 1:
                                i3 += i4;
                                break;
                            case 0:
                                i4 = 144310272;
                                i3 += i4;
                                break;
                            case 2:
                                i4 = 131072000;
                                i3 += i4;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i4 = 131072;
                                i3 += i4;
                                break;
                            default:
                                w511.q();
                                return;
                        }
                    }
                    i2++;
                } else {
                    i = Math.max(13107200, i3);
                }
            }
        }
        aehVar.b = i;
        boolean isEmpty = this.B.isEmpty();
        k4h k4hVar = this.a;
        if (!isEmpty) {
            k4hVar.b(b());
            return;
        }
        synchronized (k4hVar) {
            if (k4hVar.a) {
                k4hVar.b(0);
            }
        }
    }

    @Override // defpackage.owy
    public final boolean retainBackBufferFromKeyframe(vyc0 vyc0Var) {
        return false;
    }

    @Override // defpackage.owy
    public final boolean shouldContinueLoading(nwy nwyVar) {
        aeh aehVar = (aeh) this.B.get(nwyVar.a);
        aehVar.getClass();
        boolean z = true;
        boolean z2 = this.a.a() >= b();
        float f = nwyVar.f;
        long j = this.c;
        long j2 = this.b;
        if (f > 1.0f) {
            j2 = Math.min(tw21.D(f, j2), j);
        }
        long max = Math.max(j2, 500000L);
        long j3 = nwyVar.e;
        if (j3 < max) {
            if (!this.z && z2) {
                z = false;
            }
            aehVar.a = z;
            if (!z && j3 < 500000) {
                lk91.j("Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j3 >= j || z2) {
            aehVar.a = false;
        }
        return aehVar.a;
    }

    @Override // defpackage.owy
    public final boolean shouldContinuePreloading(a9z0 a9z0Var, sf10 sf10Var, long j) {
        Iterator it = this.B.values().iterator();
        while (it.hasNext()) {
            if (((aeh) it.next()).a) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.owy
    public final boolean shouldStartPlayback(nwy nwyVar) {
        long H = tw21.H(nwyVar.f, nwyVar.e);
        long j = nwyVar.g ? this.x : this.w;
        long j2 = nwyVar.h;
        if (j2 != -9223372036854775807L) {
            j = Math.min(j2 / 2, j);
        }
        if (j <= 0 || H >= j) {
            return true;
        }
        return !this.z && this.a.a() >= b();
    }

    public zdh() {
        this(new k4h(), 50000, 50000, 1000, 2000, false);
    }
}
