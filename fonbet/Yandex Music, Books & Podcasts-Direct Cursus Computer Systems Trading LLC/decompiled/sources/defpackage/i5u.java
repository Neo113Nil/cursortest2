package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i5u implements mwk {
    public final x1u a;
    public final v80 b;
    public final wmn c;
    public final String d;

    public i5u(x1u x1uVar, v80 v80Var, wmn wmnVar, String str) {
        x1uVar.getClass();
        str.getClass();
        this.a = x1uVar;
        this.b = v80Var;
        this.c = wmnVar;
        this.d = str;
    }

    @Override // defpackage.mwk
    public final mqs a() {
        return null;
    }

    @Override // defpackage.mwk
    public final String b() {
        return this.d;
    }

    @Override // defpackage.mwk
    public final v80 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5u)) {
            return false;
        }
        i5u i5uVar = (i5u) obj;
        if (!Intrinsics.d(this.a, i5uVar.a) || !this.b.equals(i5uVar.b) || this.c != i5uVar.c) {
            return false;
        }
        String str = i5uVar.d;
        AtomicInteger atomicInteger = rwk.b;
        return Intrinsics.d(this.d, str);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        wmn wmnVar = this.c;
        int hashCode2 = (hashCode + (wmnVar == null ? 0 : wmnVar.hashCode())) * 31;
        AtomicInteger atomicInteger = rwk.b;
        return this.d.hashCode() + hashCode2;
    }

    public final String toString() {
        return "VideoClipPlayable(videoClip=" + this.a + ", analyticsValues=" + this.b + ", recommendationType=" + this.c + ", playableId=" + rwk.b(this.d) + ")";
    }
}
