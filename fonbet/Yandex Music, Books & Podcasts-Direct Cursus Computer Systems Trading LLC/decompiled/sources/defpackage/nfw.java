package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class nfw implements zyc {
    public final /* synthetic */ osw a;

    public nfw(osw oswVar) {
        this.a = oswVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nfw) {
            return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        return new ezc(2, 0, osw.class, this.a, "reportErrorVolumeOther", "reportErrorVolumeOther(Lcom/yandex/media/ynison/service/DeviceVolume;Lkotlin/ranges/ClosedFloatingPointRange;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
