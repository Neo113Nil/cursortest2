package defpackage;

import android.system.ErrnoException;
import android.system.OsConstants;
import com.yandex.music.shared.player.api.download.PlayerPlaybackException;
import com.yandex.music.shared.player.api.download.a;
import com.yandex.music.shared.player.api.download.b;
import com.yandex.music.shared.player.api.download.c;
import com.yandex.music.shared.player.api.download.d;
import com.yandex.music.shared.player.api.download.e;
import com.yandex.music.shared.player.api.download.f;
import com.yandex.music.shared.player.api.download.g;
import com.yandex.music.shared.player.api.download.i;
import com.yandex.music.shared.player.api.download.j;
import com.yandex.music.shared.player.api.download.k;
import com.yandex.music.shared.player.download2.InternalDownloadException;
import com.yandex.music.shared.player.download2.InternalTrackContentSourcesException;
import com.yandex.music.shared.player.download2.balancer.RebalancedException;
import com.yandex.music.shared.player.download2.exo.ConnectivityCheckHttpDataSource$NetworkNotAllowedException;
import com.yandex.music.shared.utils.ThrowablesKt;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class eob {
    public static final InternalDownloadException a(IOException iOException, String str) {
        if (iOException instanceof RebalancedException) {
            iOException = ((RebalancedException) iOException).a;
        }
        if (iOException instanceof InternalDownloadException) {
            return (InternalDownloadException) iOException;
        }
        iOException.getClass();
        for (Throwable th : ThrowablesKt.meAndCauses(iOException)) {
            ErrnoException errnoException = th instanceof ErrnoException ? (ErrnoException) th : null;
            if (errnoException != null && errnoException.errno == OsConstants.ENOSPC) {
                return new ute(null);
            }
        }
        if (iOException instanceof g6e) {
            g6e g6eVar = (g6e) iOException;
            if (!(g6eVar instanceof i6e)) {
                return g6eVar instanceof h6e ? new wte(null) : g6eVar instanceof ConnectivityCheckHttpDataSource$NetworkNotAllowedException ? new tte(null) : new due(g6eVar);
            }
            int i = ((i6e) g6eVar).d;
            return (i == 401 || i == 403) ? new bue(i) : new xte(i);
        }
        if (iOException instanceof olt) {
            return new rte(str);
        }
        if (iOException instanceof r7k) {
            return new qte(str);
        }
        if (iOException instanceof m9c) {
            return new eue(iOException);
        }
        if (iOException instanceof oo3) {
            return new eue(iOException);
        }
        if (iOException instanceof hb7) {
            return new cue(iOException);
        }
        for (Throwable th2 : ThrowablesKt.meAndCauses(iOException)) {
            if ((th2 instanceof g6e) || i4w.M(th2)) {
                return new due(iOException);
            }
        }
        for (Throwable th3 : ThrowablesKt.meAndCauses(iOException)) {
            if (!(th3 instanceof oo3) && !(th3 instanceof m9c) && !(th3 instanceof FileNotFoundException)) {
                Throwable cause = iOException.getCause();
                ErrnoException errnoException2 = cause instanceof ErrnoException ? (ErrnoException) cause : null;
                if (errnoException2 == null || errnoException2.errno != OsConstants.EDQUOT) {
                    Throwable cause2 = iOException.getCause();
                    ErrnoException errnoException3 = cause2 instanceof ErrnoException ? (ErrnoException) cause2 : null;
                    if (errnoException3 == null || errnoException3.errno != OsConstants.ENOSPC) {
                    }
                }
            }
            return new eue(iOException);
        }
        return new cue(iOException);
    }

    public static final PlayerPlaybackException.TrackFetchException b(InternalDownloadException internalDownloadException) {
        boolean z = internalDownloadException instanceof InternalTrackContentSourcesException;
        if ((internalDownloadException instanceof vte) || (internalDownloadException instanceof ats) || (internalDownloadException instanceof pte) || (internalDownloadException instanceof qte) || (internalDownloadException instanceof rte)) {
            return new a(false);
        }
        if ((internalDownloadException instanceof tte) || (internalDownloadException instanceof yte) || (internalDownloadException instanceof due) || (internalDownloadException instanceof cue)) {
            return new f(z);
        }
        if (internalDownloadException instanceof wte) {
            return z ? new b(true) : new d(true);
        }
        if (internalDownloadException instanceof bue) {
            return new e(((bue) internalDownloadException).a);
        }
        if (internalDownloadException instanceof xte) {
            return (z && ((xte) internalDownloadException).a == 401) ? new g(true) : z ? new c(((xte) internalDownloadException).a) : new e(((xte) internalDownloadException).a);
        }
        if (internalDownloadException instanceof eue) {
            return new i(false);
        }
        if (internalDownloadException instanceof ute) {
            return new j(false);
        }
        if (internalDownloadException instanceof aue) {
            return new k(true);
        }
        b6e.s();
        return null;
    }
}
