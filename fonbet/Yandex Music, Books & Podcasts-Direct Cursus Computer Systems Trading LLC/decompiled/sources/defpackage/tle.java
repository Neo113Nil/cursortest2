package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.InitMediaItemData;

/* loaded from: classes6.dex */
public final class tle {
    public final InitMediaItemData a;
    public final imh b;

    public tle(InitMediaItemData initMediaItemData, imh imhVar) {
        this.a = initMediaItemData;
        this.b = imhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tle)) {
            return false;
        }
        tle tleVar = (tle) obj;
        return this.a.equals(tleVar.a) && Intrinsics.d(this.b, tleVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        imh imhVar = this.b;
        return hashCode + (imhVar == null ? 0 : imhVar.hashCode());
    }

    public final String toString() {
        return "InitMediaItemBundle(initMediaItemData=" + this.a + ", mediaData=" + this.b + ')';
    }
}
