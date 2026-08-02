package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.preload_manager.TransactionException;
import ru.yandex.video.m3.preload_manager.h;
import ru.yandex.video.m3.preload_manager.i;

/* loaded from: classes6.dex */
public final class com implements aom {
    public final inm a;
    public final Handler b;
    public final Looper c;
    public final ArrayList d;
    public volatile boolean e;

    public com(inm inmVar, Handler handler) {
        handler.getClass();
        this.a = inmVar;
        this.b = handler;
        this.c = Looper.myLooper();
        this.d = new ArrayList();
        this.e = true;
    }

    @Override // defpackage.aom
    public final void K(VideoData videoData, dnm dnmVar, jnm jnmVar) {
        videoData.getClass();
        a();
        this.d.add(new bom(1, videoData, dnmVar, jnmVar));
    }

    public final void a() {
        if (!Intrinsics.d(Looper.myLooper(), this.c)) {
            throw new TransactionException("All transaction calls should happen from same thread");
        }
        if (!this.e) {
            throw new TransactionException("Transaction already completed by commit / revert");
        }
    }

    public final void b(bom bomVar) {
        int i = bomVar.a;
        jnm jnmVar = bomVar.d;
        VideoData videoData = bomVar.b;
        int D = ouj.D(i);
        inm inmVar = this.a;
        if (D == 0) {
            dnm dnmVar = bomVar.c;
            dnmVar.getClass();
            jnmVar.getClass();
            videoData.getClass();
            chs chsVar = inmVar.l;
            chsVar.getClass();
            chsVar.a("PreloadManagerImpl", "startPreload", "called with: videoData = " + videoData + ", config = " + dnmVar + ", priority = " + jnmVar, new Object[0]);
            inmVar.a(new i(inmVar, videoData, dnmVar, jnmVar, dnmVar.d));
            return;
        }
        if (D != 1) {
            if (D != 2) {
                return;
            }
            inmVar.c(videoData);
            return;
        }
        jnmVar.getClass();
        videoData.getClass();
        chs chsVar2 = inmVar.l;
        chsVar2.getClass();
        chsVar2.a("PreloadManagerImpl", "setPriority", "called with: videoData = " + videoData + ", priority = " + jnmVar, new Object[0]);
        inmVar.a(new h(videoData, inmVar, jnmVar));
    }

    @Override // defpackage.aom
    public final void c(VideoData videoData) {
        videoData.getClass();
        a();
        this.d.add(new bom(3, videoData, null, null));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        commit();
    }

    @Override // defpackage.aom
    public final void commit() {
        a();
        this.e = false;
        dvt.c0(this.b, new dyg(21, this));
    }
}
