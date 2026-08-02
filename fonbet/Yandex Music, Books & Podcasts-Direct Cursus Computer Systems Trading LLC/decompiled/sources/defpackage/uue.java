package defpackage;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.c;
import ru.yandex.video.m3.player.tracking.LoadCanceled;
import ru.yandex.video.m3.player.tracking.LoadError;
import ru.yandex.video.m3.player.tracks.TrackType;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class uue implements bwh {
    public final yjj a;
    public final tue b;
    public final yeg c;

    public uue(yjj yjjVar, tue tueVar, yeg yegVar) {
        yjjVar.getClass();
        this.a = yjjVar;
        this.b = tueVar;
        this.c = yegVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.bwh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(int i, uvh uvhVar, boh bohVar) {
        boolean z;
        HashSet u0;
        Object t7oVar;
        dsc dscVar = bohVar.c;
        if (dscVar == null) {
            return;
        }
        String str = dscVar.n;
        if (str == null) {
            str = dscVar.m;
        }
        if (!l5i.o(str)) {
            String str2 = dscVar.n;
            if (str2 == null) {
                str2 = dscVar.m;
            }
            if (!(str2 != null ? c.v(str2, "application", false) : false)) {
                z = false;
                if (!z) {
                    dscVar = null;
                }
                if (dscVar == null) {
                    if ((((crb) this.b).f(TrackType.Video).w() instanceof jxn ? dscVar : null) != null) {
                        yjj yjjVar = this.a;
                        synchronized (yjjVar.a) {
                            u0 = CollectionsKt.u0(yjjVar.a);
                        }
                        Iterator it = u0.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            try {
                                r7o r7oVar = z7o.b;
                                ((zbl) next).S();
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
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z = true;
        if (!z) {
        }
        if (dscVar == null) {
        }
    }

    @Override // defpackage.bwh
    public final void J(int i, uvh uvhVar, cfg cfgVar, boh bohVar) {
        HashSet u0;
        Object t7oVar;
        Unit unit;
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                zbl zblVar = (zbl) next;
                LoadCanceled a = a(cfgVar, bohVar);
                if (a != null) {
                    zblVar.M(a);
                    unit = Unit.a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    int i2 = bohVar.b;
                    TrackType trackType = i2 != 1 ? i2 != 2 ? null : TrackType.Video : TrackType.Audio;
                    dsc dscVar = bohVar.c;
                    zblVar.H(trackType, dscVar != null ? Integer.valueOf(dscVar.v) : null);
                }
                t7oVar = Unit.a;
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            Throwable a2 = z7o.a(t7oVar);
            if (a2 != null) {
                Timber.INSTANCE.e(a2, "notifyObservers", new Object[0]);
            }
        }
    }

    @Override // defpackage.bwh
    public final void K(int i, uvh uvhVar, cfg cfgVar, boh bohVar) {
        HashSet u0;
        Object t7oVar;
        HashSet u02;
        Object t7oVar2;
        dsc dscVar = bohVar.c;
        if (dscVar != null) {
            if (dscVar.j != -1 && bohVar.a == 1) {
                int i2 = bohVar.b;
                if (i2 == 2 || i2 == 0) {
                    yjj yjjVar = this.a;
                    synchronized (yjjVar.a) {
                        u02 = CollectionsKt.u0(yjjVar.a);
                    }
                    Iterator it = u02.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        try {
                            r7o r7oVar = z7o.b;
                            ((zbl) next).N(dscVar.j);
                            t7oVar2 = Unit.a;
                        } catch (Throwable th) {
                            r7o r7oVar2 = z7o.b;
                            t7oVar2 = new t7o(th);
                        }
                        Throwable a = z7o.a(t7oVar2);
                        if (a != null) {
                            Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (bohVar.a == 1 && bohVar.b == -1 && dvt.Q(cfgVar.a.a) == 4) {
            long j = bohVar.g;
            if (j == -9223372036854775807L || j == 0) {
                return;
            }
            long j2 = cfgVar.e * 8;
            long j3 = j / 1000;
            if (j3 == 0) {
                return;
            }
            int i3 = (int) (j2 / j3);
            yjj yjjVar2 = this.a;
            synchronized (yjjVar2.a) {
                u0 = CollectionsKt.u0(yjjVar2.a);
            }
            Iterator it2 = u0.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                try {
                    r7o r7oVar3 = z7o.b;
                    ((zbl) next2).N(i3);
                    t7oVar = Unit.a;
                } catch (Throwable th2) {
                    r7o r7oVar4 = z7o.b;
                    t7oVar = new t7o(th2);
                }
                Throwable a2 = z7o.a(t7oVar);
                if (a2 != null) {
                    Timber.INSTANCE.e(a2, "notifyObservers", new Object[0]);
                }
            }
        }
    }

    public final LoadCanceled a(cfg cfgVar, boh bohVar) {
        u7e u7eVar;
        String uri = cfgVar.b.toString();
        uri.getClass();
        try {
            s7e s7eVar = new s7e();
            s7eVar.h(null, uri);
            u7eVar = s7eVar.e();
        } catch (IllegalArgumentException unused) {
            u7eVar = null;
        }
        if (u7eVar == null) {
            return null;
        }
        lma lmaVar = new lma(u7eVar, cfgVar, this, bohVar);
        feg fegVar = new feg();
        fegVar.a = "unknown";
        fegVar.b = "unknown";
        fegVar.c = -1L;
        fegVar.d = -1L;
        fegVar.e = "TRACK_TYPE_UNKNOWN";
        fegVar.f = "TRACK_FORMAT_UNKNOWN";
        fegVar.g = "DATA_TYPE_UNKNOWN";
        lmaVar.invoke(fegVar);
        return new LoadCanceled(fegVar.a, fegVar.b, fegVar.c, fegVar.d, fegVar.e, fegVar.f, fegVar.g, null);
    }

    @Override // defpackage.bwh
    public final void i(int i, uvh uvhVar, cfg cfgVar, boh bohVar, IOException iOException, boolean z) {
        u7e u7eVar;
        HashSet u0;
        Object t7oVar;
        iOException.getClass();
        String uri = cfgVar.b.toString();
        uri.getClass();
        LoadError loadError = null;
        try {
            s7e s7eVar = new s7e();
            s7eVar.h(null, uri);
            u7eVar = s7eVar.e();
        } catch (IllegalArgumentException unused) {
            u7eVar = null;
        }
        if (u7eVar != null) {
            String name = iOException.getClass().getName();
            String message = iOException.getMessage();
            Integer valueOf = iOException instanceof i6e ? Integer.valueOf(((i6e) iOException).d) : null;
            Throwable cause = iOException.getCause();
            String name2 = cause != null ? cause.getClass().getName() : null;
            Throwable cause2 = iOException.getCause();
            String message2 = cause2 != null ? cause2.getMessage() : null;
            Throwable cause3 = iOException.getCause();
            Integer valueOf2 = cause3 instanceof i6e ? Integer.valueOf(((i6e) cause3).d) : null;
            String str = u7eVar.d;
            String str2 = u7eVar.i;
            long j = cfgVar.d;
            long j2 = cfgVar.e;
            ii iiVar = new ii(this, iOException, name2, message2, valueOf2, 23);
            str.getClass();
            IOException iOException2 = (IOException) iiVar.t;
            yeg yegVar = ((uue) iiVar.s).c;
            loadError = new LoadError(str, str2, j, j2, name, message, valueOf, yegVar != null ? Boolean.valueOf(yeg.a(iOException2)) : null, yegVar != null ? yegVar.b : null, iOException2, (String) iiVar.u, (String) iiVar.v, (Integer) iiVar.w, yegVar != null ? Boolean.valueOf(yegVar.b(iOException2)) : null, null);
        }
        if (loadError != null) {
            yjj yjjVar = this.a;
            synchronized (yjjVar.a) {
                u0 = CollectionsKt.u0(yjjVar.a);
            }
            Iterator it = u0.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                try {
                    r7o r7oVar = z7o.b;
                    ((zbl) next).I(loadError);
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
