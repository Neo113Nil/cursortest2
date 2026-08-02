package com.yandex.passport.common.network;

import defpackage.ern;
import defpackage.k4f;
import defpackage.t9f;
import defpackage.w4f;
import defpackage.x4f;

/* loaded from: classes4.dex */
public final class j extends k4f {
    public final /* synthetic */ int d;
    public final t9f e;
    public final t9f f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(t9f t9fVar, t9f t9fVar2, int i) {
        super(ern.a(i.class));
        this.d = i;
        t9fVar.getClass();
        t9fVar2.getClass();
        switch (i) {
            case 1:
                super(ern.a(i.class));
                this.e = t9fVar;
                this.f = t9fVar2;
                break;
            case 2:
                super(ern.a(i.class));
                this.e = t9fVar;
                this.f = t9fVar2;
                break;
            default:
                this.e = t9fVar;
                this.f = t9fVar2;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r3.equals("ok") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        return new com.yandex.passport.common.network.m(r2.e, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r3.equals("success") != false) goto L23;
     */
    @Override // defpackage.k4f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t9f c(w4f w4fVar) {
        int i = this.d;
        w4fVar.getClass();
        switch (i) {
            case 0:
                w4f w4fVar2 = (w4f) x4f.f(w4fVar).get("status");
                t9f t9fVar = this.f;
                if (w4fVar2 == null) {
                    return new m(t9fVar, 0);
                }
                w4f w4fVar3 = (w4f) x4f.f(w4fVar2).get("status");
                return String.valueOf(w4fVar3 != null ? x4f.g(w4fVar3) : null).equals("1") ? new m(this.e, 1) : new m(t9fVar, 0);
            case 1:
                return x4f.f(w4fVar).get("error") == null ? new m(this.e, 1) : new m(this.f, 0);
            default:
                w4f w4fVar4 = (w4f) x4f.f(w4fVar).get("status");
                String a = w4fVar4 != null ? x4f.g(w4fVar4).a() : null;
                if (a != null) {
                    int hashCode = a.hashCode();
                    if (hashCode == -1867169789) {
                        break;
                    } else if (hashCode == 3548) {
                        break;
                    } else if (hashCode == 96784904 && a.equals("error")) {
                        return new m(this.f, 0);
                    }
                }
                throw new Exception("Unknown Module: key 'type' not found or does not matches any module type");
        }
    }
}
