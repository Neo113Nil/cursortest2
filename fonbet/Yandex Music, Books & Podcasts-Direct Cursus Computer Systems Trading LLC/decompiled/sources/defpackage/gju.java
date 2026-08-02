package defpackage;

import android.media.VolumeProvider;

/* loaded from: classes.dex */
public final class gju extends VolumeProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gju(Object obj, int i, int i2, int i3, int i4) {
        super(i, i2, i3);
        this.a = i4;
        this.b = obj;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        switch (this.a) {
            case 0:
                krl krlVar = (krl) this.b;
                dvt.c0(krlVar.f, new jrl(krlVar, i, 1));
                break;
            default:
                ((mch) this.b).b(i);
                break;
        }
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        switch (this.a) {
            case 0:
                krl krlVar = (krl) this.b;
                dvt.c0(krlVar.f, new jrl(krlVar, i, 0));
                break;
            default:
                ((mch) this.b).d(i);
                break;
        }
    }
}
