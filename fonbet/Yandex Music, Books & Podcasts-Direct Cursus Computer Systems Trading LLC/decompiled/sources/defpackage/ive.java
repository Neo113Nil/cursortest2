package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.yandex.video.m3.player.PlaybackException;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class ive extends scl {
    public final yjj a;
    public final au1 b;
    public boolean d;
    public boolean e;
    public int c = -1;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public String g = "";
    public final chs h = new chs();

    public ive(gsa gsaVar, yjj yjjVar, au1 au1Var) {
        this.a = yjjVar;
        this.b = au1Var;
    }

    @Override // defpackage.f8l
    public final void L(hzk hzkVar) {
        HashSet u0;
        Object t7oVar;
        hzkVar.getClass();
        PlaybackException e = hrb.e(hzkVar);
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                ((zbl) next).Y(e);
                t7oVar = Unit.a;
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            Throwable a = z7o.a(t7oVar);
            if (a != null) {
                Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
            }
        }
    }

    @Override // defpackage.f8l
    public final void S(int i, boolean z) {
        HashSet u0;
        Object t7oVar;
        HashSet u02;
        Object t7oVar2;
        HashSet u03;
        Object t7oVar3;
        HashSet u04;
        Object t7oVar4;
        gnh gnhVar;
        HashSet u05;
        Object t7oVar5;
        HashSet u06;
        Object t7oVar6;
        HashSet u07;
        Object t7oVar7;
        HashSet u08;
        Object t7oVar8;
        HashSet u09;
        Object t7oVar9;
        HashSet u010;
        Object t7oVar10;
        chs chsVar = this.h;
        chsVar.getClass();
        StringBuilder sb = new StringBuilder("oldPlayWhenReady=");
        dfi.t(sb, this.d, " playWhenReady=", z, " isPlaying=");
        sb.append(this.f);
        sb.append(" playbackState=");
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "ENDED" : "READY" : "BUFFERING" : "IDLE");
        sb.append(" thread=");
        sb.append(Thread.currentThread().getName());
        chsVar.a("InternalPlayerEventListener", "onPlayerStateChanged", sb.toString(), new Object[0]);
        int i2 = this.c;
        chsVar.a("InternalPlayerEventListener", "onPlayerStateChanged", "oldPlaybackState=".concat(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "Unknown" : "ENDED" : "READY" : "BUFFERING" : "IDLE"), new Object[0]);
        if (this.d != z) {
            yjj yjjVar = this.a;
            synchronized (yjjVar.a) {
                u010 = CollectionsKt.u0(yjjVar.a);
            }
            Iterator it = u010.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    r7o r7oVar = z7o.b;
                    ((zbl) next).n(z);
                    t7oVar10 = Unit.a;
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar10 = new t7o(th);
                }
                Throwable a = z7o.a(t7oVar10);
                if (a != null) {
                    Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                }
            }
        }
        if (i != 1) {
            if (i == 2) {
                this.e = true;
                onh M0 = ((ExoPlayer) this.b.c).M0();
                String valueOf = String.valueOf((M0 == null || (gnhVar = M0.b) == null) ? null : gnhVar.a);
                if (!valueOf.equals(this.g)) {
                    chs chsVar2 = this.h;
                    chsVar2.getClass();
                    chsVar2.a("InternalPlayerEventListener", "onPlayerStateChanged", "onNewMediaItem playWhenReady=" + z, new Object[0]);
                    yjj yjjVar2 = this.a;
                    synchronized (yjjVar2.a) {
                        u04 = CollectionsKt.u0(yjjVar2.a);
                    }
                    Iterator it2 = u04.iterator();
                    while (it2.hasNext()) {
                        Object next2 = it2.next();
                        try {
                            r7o r7oVar3 = z7o.b;
                            ((zbl) next2).x(valueOf, z);
                            t7oVar4 = Unit.a;
                        } catch (Throwable th2) {
                            r7o r7oVar4 = z7o.b;
                            t7oVar4 = new t7o(th2);
                        }
                        Throwable a2 = z7o.a(t7oVar4);
                        if (a2 != null) {
                            Timber.INSTANCE.e(a2, "notifyObservers", new Object[0]);
                        }
                    }
                    this.g = valueOf;
                }
                chs chsVar3 = this.h;
                chsVar3.getClass();
                StringBuilder sb2 = new StringBuilder("p f1=");
                sb2.append(((ExoPlayer) this.b.c).J0() < ((ExoPlayer) this.b.c).getDuration());
                sb2.append(" f2=");
                sb2.append(((ExoPlayer) this.b.c).getDuration() == -9223372036854775807L && this.c != 2);
                chsVar3.a("InternalPlayerEventListener", "onPlayerStateChanged", sb2.toString(), new Object[0]);
                if (((ExoPlayer) this.b.c).J0() < ((ExoPlayer) this.b.c).getDuration() || (((ExoPlayer) this.b.c).getDuration() == -9223372036854775807L && this.c != 2)) {
                    yjj yjjVar3 = this.a;
                    synchronized (yjjVar3.a) {
                        u02 = CollectionsKt.u0(yjjVar3.a);
                    }
                    Iterator it3 = u02.iterator();
                    while (it3.hasNext()) {
                        Object next3 = it3.next();
                        try {
                            r7o r7oVar5 = z7o.b;
                            ((zbl) next3).W();
                            t7oVar2 = Unit.a;
                        } catch (Throwable th3) {
                            r7o r7oVar6 = z7o.b;
                            t7oVar2 = new t7o(th3);
                        }
                        Throwable a3 = z7o.a(t7oVar2);
                        if (a3 != null) {
                            Timber.INSTANCE.e(a3, "notifyObservers", new Object[0]);
                        }
                    }
                }
                if (!z && (this.f.compareAndSet(true, false) || this.d)) {
                    yjj yjjVar4 = this.a;
                    synchronized (yjjVar4.a) {
                        u03 = CollectionsKt.u0(yjjVar4.a);
                    }
                    Iterator it4 = u03.iterator();
                    while (it4.hasNext()) {
                        Object next4 = it4.next();
                        try {
                            r7o r7oVar7 = z7o.b;
                            ((zbl) next4).f();
                            t7oVar3 = Unit.a;
                        } catch (Throwable th4) {
                            r7o r7oVar8 = z7o.b;
                            t7oVar3 = new t7o(th4);
                        }
                        Throwable a4 = z7o.a(t7oVar3);
                        if (a4 != null) {
                            Timber.INSTANCE.e(a4, "notifyObservers", new Object[0]);
                        }
                    }
                }
            } else if (i == 3) {
                if (this.c == 2) {
                    yjj yjjVar5 = this.a;
                    synchronized (yjjVar5.a) {
                        u07 = CollectionsKt.u0(yjjVar5.a);
                    }
                    Iterator it5 = u07.iterator();
                    while (it5.hasNext()) {
                        Object next5 = it5.next();
                        try {
                            r7o r7oVar9 = z7o.b;
                            ((zbl) next5).V();
                            t7oVar7 = Unit.a;
                        } catch (Throwable th5) {
                            r7o r7oVar10 = z7o.b;
                            t7oVar7 = new t7o(th5);
                        }
                        Throwable a5 = z7o.a(t7oVar7);
                        if (a5 != null) {
                            Timber.INSTANCE.e(a5, "notifyObservers", new Object[0]);
                        }
                    }
                }
                if (z && this.f.compareAndSet(false, true)) {
                    yjj yjjVar6 = this.a;
                    synchronized (yjjVar6.a) {
                        u06 = CollectionsKt.u0(yjjVar6.a);
                    }
                    Iterator it6 = u06.iterator();
                    while (it6.hasNext()) {
                        Object next6 = it6.next();
                        try {
                            r7o r7oVar11 = z7o.b;
                            ((zbl) next6).a();
                            t7oVar6 = Unit.a;
                        } catch (Throwable th6) {
                            r7o r7oVar12 = z7o.b;
                            t7oVar6 = new t7o(th6);
                        }
                        Throwable a6 = z7o.a(t7oVar6);
                        if (a6 != null) {
                            Timber.INSTANCE.e(a6, "notifyObservers", new Object[0]);
                        }
                    }
                } else if (!z && this.c == 3 && this.f.compareAndSet(true, false)) {
                    yjj yjjVar7 = this.a;
                    synchronized (yjjVar7.a) {
                        u05 = CollectionsKt.u0(yjjVar7.a);
                    }
                    Iterator it7 = u05.iterator();
                    while (it7.hasNext()) {
                        Object next7 = it7.next();
                        try {
                            r7o r7oVar13 = z7o.b;
                            ((zbl) next7).f();
                            t7oVar5 = Unit.a;
                        } catch (Throwable th7) {
                            r7o r7oVar14 = z7o.b;
                            t7oVar5 = new t7o(th7);
                        }
                        Throwable a7 = z7o.a(t7oVar5);
                        if (a7 != null) {
                            Timber.INSTANCE.e(a7, "notifyObservers", new Object[0]);
                        }
                    }
                }
            } else if (i == 4 && z && this.c != 4) {
                if (this.f.compareAndSet(true, false)) {
                    yjj yjjVar8 = this.a;
                    synchronized (yjjVar8.a) {
                        u09 = CollectionsKt.u0(yjjVar8.a);
                    }
                    Iterator it8 = u09.iterator();
                    while (it8.hasNext()) {
                        Object next8 = it8.next();
                        try {
                            r7o r7oVar15 = z7o.b;
                            ((zbl) next8).f();
                            t7oVar9 = Unit.a;
                        } catch (Throwable th8) {
                            r7o r7oVar16 = z7o.b;
                            t7oVar9 = new t7o(th8);
                        }
                        Throwable a8 = z7o.a(t7oVar9);
                        if (a8 != null) {
                            Timber.INSTANCE.e(a8, "notifyObservers", new Object[0]);
                        }
                    }
                }
                yjj yjjVar9 = this.a;
                synchronized (yjjVar9.a) {
                    u08 = CollectionsKt.u0(yjjVar9.a);
                }
                Iterator it9 = u08.iterator();
                while (it9.hasNext()) {
                    Object next9 = it9.next();
                    try {
                        r7o r7oVar17 = z7o.b;
                        ((zbl) next9).e();
                        t7oVar8 = Unit.a;
                    } catch (Throwable th9) {
                        r7o r7oVar18 = z7o.b;
                        t7oVar8 = new t7o(th9);
                    }
                    Throwable a9 = z7o.a(t7oVar8);
                    if (a9 != null) {
                        Timber.INSTANCE.e(a9, "notifyObservers", new Object[0]);
                    }
                }
            }
        } else if (z && this.c == 3 && this.f.compareAndSet(true, false)) {
            yjj yjjVar10 = this.a;
            synchronized (yjjVar10.a) {
                u0 = CollectionsKt.u0(yjjVar10.a);
            }
            Iterator it10 = u0.iterator();
            while (it10.hasNext()) {
                Object next10 = it10.next();
                try {
                    r7o r7oVar19 = z7o.b;
                    ((zbl) next10).f();
                    t7oVar = Unit.a;
                } catch (Throwable th10) {
                    r7o r7oVar20 = z7o.b;
                    t7oVar = new t7o(th10);
                }
                Throwable a10 = z7o.a(t7oVar);
                if (a10 != null) {
                    Timber.INSTANCE.e(a10, "notifyObservers", new Object[0]);
                }
            }
        }
        this.d = z;
        this.c = i;
    }

    @Override // defpackage.f8l
    public final void u(int i, g8l g8lVar, g8l g8lVar2) {
        HashSet u0;
        Object t7oVar;
        g8lVar.getClass();
        g8lVar2.getClass();
        if (i == 1 && this.e) {
            yjj yjjVar = this.a;
            synchronized (yjjVar.a) {
                u0 = CollectionsKt.u0(yjjVar.a);
            }
            Iterator it = u0.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    r7o r7oVar = z7o.b;
                    ((zbl) next).t(g8lVar2.f, g8lVar.f);
                    t7oVar = Unit.a;
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                Throwable a = z7o.a(t7oVar);
                if (a != null) {
                    Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                }
            }
        }
    }
}
