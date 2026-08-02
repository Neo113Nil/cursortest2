package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.ui.debug.PreloadState;

/* loaded from: classes6.dex */
public final class zye {
    public final imh a;
    public final boolean b;
    public final paw c;
    public final Integer d;
    public final PreloadState e;

    public zye(imh imhVar, boolean z, paw pawVar, Integer num, PreloadState preloadState) {
        imhVar.getClass();
        preloadState.getClass();
        this.a = imhVar;
        this.b = z;
        this.c = pawVar;
        this.d = num;
        this.e = preloadState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zye)) {
            return false;
        }
        zye zyeVar = (zye) obj;
        return Intrinsics.d(this.a, zyeVar.a) && this.b == zyeVar.b && Intrinsics.d(this.c, zyeVar.c) && Intrinsics.d(this.d, zyeVar.d) && this.e == zyeVar.e;
    }

    public final int hashCode() {
        int e = k5r.e(this.a.hashCode() * 31, 31, this.b);
        paw pawVar = this.c;
        int hashCode = (e + (pawVar == null ? 0 : pawVar.hashCode())) * 31;
        Integer num = this.d;
        return this.e.hashCode() + ((hashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Item(mediaData=" + this.a + ", visible=" + this.b + ", attachedEngine=" + this.c + ", listPlayerIndex=" + this.d + ", preloadState=" + this.e + ')';
    }
}
