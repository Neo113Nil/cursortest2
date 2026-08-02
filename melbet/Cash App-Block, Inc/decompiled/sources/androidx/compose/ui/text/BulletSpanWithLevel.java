package androidx.compose.ui.text;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class BulletSpanWithLevel {
    public final Bullet bullet;
    public final int indentationLevel;
    public final int start;

    public BulletSpanWithLevel(Bullet bullet, int i, int i2) {
        this.bullet = bullet;
        this.indentationLevel = i;
        this.start = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletSpanWithLevel)) {
            return false;
        }
        BulletSpanWithLevel bulletSpanWithLevel = (BulletSpanWithLevel) obj;
        return Intrinsics.areEqual(this.bullet, bulletSpanWithLevel.bullet) && this.indentationLevel == bulletSpanWithLevel.indentationLevel && this.start == bulletSpanWithLevel.start;
    }

    public final int hashCode() {
        return Integer.hashCode(this.start) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.indentationLevel, this.bullet.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BulletSpanWithLevel(bullet=");
        sb.append(this.bullet);
        sb.append(", indentationLevel=");
        sb.append(this.indentationLevel);
        sb.append(", start=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.start, ')');
    }
}
