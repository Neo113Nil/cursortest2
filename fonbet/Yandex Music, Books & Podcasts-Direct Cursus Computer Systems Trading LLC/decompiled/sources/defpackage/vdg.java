package defpackage;

import ru.yandex.video.m3.player.tracks.TrackType;

/* loaded from: classes6.dex */
public final class vdg implements va7, vyi {
    public final poj a;
    public final boolean b;
    public String c;
    public final String d;

    public vdg(poj pojVar, boolean z, String str) {
        this.a = pojVar;
        this.b = z;
        this.d = "LiveSessionDataSourceDecoratorFactory.".concat(str);
    }

    @Override // defpackage.va7
    public final db7 a() {
        return new udg(this, this.a.b());
    }

    public final void b(TrackType trackType) {
        trackType.getClass();
    }

    @Override // defpackage.vyi
    public final String d() {
        return this.d;
    }

    @Override // defpackage.vyi
    public final boolean g() {
        return this.b;
    }
}
