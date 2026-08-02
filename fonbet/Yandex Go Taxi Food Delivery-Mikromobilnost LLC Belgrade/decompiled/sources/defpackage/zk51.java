package defpackage;

import androidx.media3.datasource.FileDataSource;
import ru.yandex.video.m3.model.config.mediasource.PreloadLiveDashConfig;
import ru.yandex.video.m3.player.impl.NetPerfMarker;

/* loaded from: classes10.dex */
public final class zk51 implements ipg, NetPerfMarker {
    public yk51 A;
    public ra7 a;
    public gpg c;
    public boolean x;
    public ipg y;
    public int z;
    public boolean B = false;
    public PreloadLiveDashConfig C = null;
    public ipg b = new FileDataSource.a();
    public pb7 w = pb7.i1;

    @Override // defpackage.ipg
    public final kpg createDataSource() {
        ipg ipgVar = this.y;
        hpg hpgVar = null;
        kpg createDataSource = ipgVar != null ? ipgVar.createDataSource() : null;
        int i = this.z;
        ra7 ra7Var = this.a;
        ra7Var.getClass();
        if (!this.x && createDataSource != null) {
            gpg gpgVar = this.c;
            if (gpgVar != null) {
                hpgVar = gpgVar.c();
            } else {
                bb7 bb7Var = new bb7();
                bb7Var.a = ra7Var;
                hpgVar = bb7Var.c();
            }
        }
        return new al51(ra7Var, createDataSource, this.b.createDataSource(), hpgVar, this.w, i, this.A, this.C);
    }

    @Override // ru.yandex.video.m3.player.impl.NetPerfMarker
    public final String getClassName() {
        return "YandexCacheDataSource.Factory";
    }

    @Override // ru.yandex.video.m3.player.impl.NetPerfMarker
    /* renamed from: isNetPerfEnabled */
    public final boolean getIsNetPerfEnabled() {
        return this.B;
    }
}
