package com.yandex.passport.internal.flags.experiments;

import defpackage.b6e;
import defpackage.vz1;

/* loaded from: classes4.dex */
public final class m extends n {
    public final j a;
    public final int b;

    public m(j jVar, int i) {
        this.a = jVar;
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        return !r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        if (75401 >= r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        if (75401 <= r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        if (75401 == r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (75401 != r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r1 = true;
     */
    @Override // com.yandex.passport.internal.flags.experiments.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(d dVar) {
        dVar.getClass();
        int ordinal = this.a.ordinal();
        int i = this.b;
        boolean z = false;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        b6e.s();
                        return false;
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a == mVar.a && this.b == mVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VersionRestriction(operator=");
        sb.append(this.a);
        sb.append(", version=");
        return vz1.r(sb, this.b, ')');
    }
}
