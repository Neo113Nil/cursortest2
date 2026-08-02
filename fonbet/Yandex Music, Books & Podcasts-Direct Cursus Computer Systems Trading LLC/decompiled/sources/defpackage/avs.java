package defpackage;

import java.util.concurrent.Callable;
import ru.yandex.video.m3.preload_manager.DownloadResult;
import ru.yandex.video.m3.preload_manager.QualityInfo;

/* loaded from: classes6.dex */
public final class avs extends ljo implements Callable {
    public final String h;
    public final String i;
    public final ika j;
    public final QualityInfo k;
    public long l = Long.MAX_VALUE;
    public volatile DownloadResult m;

    public avs(String str, String str2, ika ikaVar, QualityInfo qualityInfo) {
        this.h = str;
        this.i = str2;
        this.j = ikaVar;
        this.k = qualityInfo;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        Object obj = get();
        obj.getClass();
        return (DownloadResult) obj;
    }

    @Override // defpackage.ljo
    public final void d() {
        this.j.cancel();
    }

    @Override // defpackage.ljo
    public final Object e() {
        boolean z;
        boolean z2;
        wqn wqnVar = new wqn();
        tqn tqnVar = new tqn();
        try {
            this.j.t(new u13(20, wqnVar, this, tqnVar));
            if (!this.g) {
                tqnVar.a = true;
            }
        } finally {
            if (!z) {
                if (!z2) {
                }
            }
            String str = this.h;
            String str2 = this.i;
            long j = wqnVar.a;
            QualityInfo qualityInfo = this.k;
            boolean z3 = tqnVar.a;
            DownloadResult l = men.l(str, str2, j, qualityInfo, z3, (this.g || z3) ? false : true);
            this.m = l;
            return l;
        }
        String str3 = this.h;
        String str22 = this.i;
        long j2 = wqnVar.a;
        QualityInfo qualityInfo2 = this.k;
        boolean z32 = tqnVar.a;
        DownloadResult l2 = men.l(str3, str22, j2, qualityInfo2, z32, (this.g || z32) ? false : true);
        this.m = l2;
        return l2;
    }
}
