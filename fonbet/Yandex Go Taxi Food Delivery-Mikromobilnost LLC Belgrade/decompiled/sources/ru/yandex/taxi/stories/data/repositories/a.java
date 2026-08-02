package ru.yandex.taxi.stories.data.repositories;

import defpackage.bvf0;
import defpackage.gtq0;
import defpackage.ij3;
import defpackage.ike;
import defpackage.lse;
import defpackage.o7m;
import defpackage.sdc;
import defpackage.tje;
import defpackage.wls;
import defpackage.wwb;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes10.dex */
public final class a {
    public final ru.yandex.taxi.stories.data.caching.a a;
    public final wls b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final CopyOnWriteArraySet d = new CopyOnWriteArraySet();
    public final kotlinx.coroutines.sync.a e = gtq0.a();
    public ike f;

    public a(ru.yandex.taxi.stories.data.caching.a aVar, wls wlsVar) {
        this.a = aVar;
        this.b = wlsVar;
    }

    public final void a(String str) {
        ike ikeVar = this.f;
        if (ikeVar == null || !bvf0.D(ikeVar)) {
            this.d.removeIf(new sdc(4, new wwb(str, 17)));
        } else {
            ike ikeVar2 = this.f;
            if (ikeVar2 != null) {
                tje.N(ikeVar2, null, null, new DownloadRepository$cancelDownload$2(this, str, null), 3);
            }
        }
    }

    public final void b(o7m o7mVar) {
        ike ikeVar = this.f;
        if (ikeVar == null || !bvf0.D(ikeVar)) {
            this.d.add(o7mVar);
            return;
        }
        ike ikeVar2 = this.f;
        if (ikeVar2 != null) {
            tje.N(ikeVar2, null, null, new DownloadRepository$load$1(this, o7mVar, null), 3);
        }
    }

    public final void c() {
        ike ikeVar = this.f;
        if (ikeVar != null) {
            tje.N(ikeVar, null, null, new DownloadRepository$pauseDownloads$1(this, null), 3);
        }
        ike ikeVar2 = this.f;
        if (ikeVar2 != null) {
            bvf0.j(ikeVar2, null);
        }
    }

    public final void d() {
        ike M = bvf0.M(bvf0.b(), new ij3(lse.a, 1));
        this.f = M;
        tje.N(M, null, null, new DownloadRepository$resumeDownloads$2(this, null), 3);
    }
}
