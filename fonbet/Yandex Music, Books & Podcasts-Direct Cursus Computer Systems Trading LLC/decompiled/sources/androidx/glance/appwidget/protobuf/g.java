package androidx.glance.appwidget.protobuf;

import defpackage.cye;
import defpackage.mkt;
import defpackage.n8n;
import defpackage.rr4;

/* loaded from: classes.dex */
public final class g {
    public static mkt a(Object obj) {
        b bVar = (b) obj;
        mkt mktVar = bVar.unknownFields;
        if (mktVar != mkt.f) {
            return mktVar;
        }
        mkt mktVar2 = new mkt(0, new int[8], new Object[8], true);
        bVar.unknownFields = mktVar2;
        return mktVar2;
    }

    public static boolean b(int i, n8n n8nVar, Object obj) {
        int i2 = n8nVar.b;
        rr4 rr4Var = (rr4) n8nVar.e;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            n8nVar.C0(0);
            ((mkt) obj).c(i3 << 3, Long.valueOf(rr4Var.t()));
            return true;
        }
        if (i4 == 1) {
            n8nVar.C0(1);
            ((mkt) obj).c((i3 << 3) | 1, Long.valueOf(rr4Var.q()));
            return true;
        }
        if (i4 == 2) {
            ((mkt) obj).c((i3 << 3) | 2, n8nVar.w());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw cye.b();
            }
            n8nVar.C0(5);
            ((mkt) obj).c(5 | (i3 << 3), Integer.valueOf(rr4Var.p()));
            return true;
        }
        mkt mktVar = new mkt(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new cye("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (n8nVar.h() != Integer.MAX_VALUE && b(i7, n8nVar, mktVar)) {
        }
        if (i6 != n8nVar.b) {
            throw new cye("Protocol message end-group tag did not match expected tag.");
        }
        if (mktVar.e) {
            mktVar.e = false;
        }
        ((mkt) obj).c(i5 | 3, mktVar);
        return true;
    }
}
