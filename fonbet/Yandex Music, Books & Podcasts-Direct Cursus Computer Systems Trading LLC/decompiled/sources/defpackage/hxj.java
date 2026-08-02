package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.player.ui.debug.model.DrmMode;

/* loaded from: classes6.dex */
public final class hxj {
    public final mmq a;
    public final DrmMode b;
    public final int c;
    public final String d;
    public final String e;

    public hxj(mmq mmqVar, DrmMode drmMode, int i, String str, String str2) {
        this.a = mmqVar;
        this.b = drmMode;
        this.c = i;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxj)) {
            return false;
        }
        hxj hxjVar = (hxj) obj;
        return Intrinsics.d(this.a, hxjVar.a) && this.b == hxjVar.b && this.c == hxjVar.c && Intrinsics.d(this.d, hxjVar.d) && Intrinsics.d(this.e, hxjVar.e);
    }

    public final int hashCode() {
        mmq mmqVar = this.a;
        int hashCode = (mmqVar == null ? 0 : mmqVar.hashCode()) * 31;
        DrmMode drmMode = this.b;
        int a = f1d.a(this.c, (hashCode + (drmMode == null ? 0 : drmMode.hashCode())) * 31, 31);
        String str = this.d;
        int hashCode2 = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OtherData(viewPortSize=");
        sb.append(this.a);
        sb.append(", drmMode=");
        sb.append(this.b);
        sb.append(", droppedFrames=");
        sb.append(this.c);
        sb.append(", networkTypeName=");
        sb.append(this.d);
        sb.append(", lastError=");
        return dfi.i(sb, this.e, ')');
    }
}
