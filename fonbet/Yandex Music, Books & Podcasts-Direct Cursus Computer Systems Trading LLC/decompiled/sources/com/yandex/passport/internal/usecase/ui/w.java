package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.data.network.b2;
import com.yandex.passport.data.network.g2;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class w extends com.yandex.passport.common.domain.a {
    public final g2 b;
    public final com.yandex.passport.internal.network.mappers.b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.yandex.passport.common.coroutine.a aVar, g2 g2Var, com.yandex.passport.internal.network.mappers.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        g2Var.getClass();
        bVar.getClass();
        this.b = g2Var;
        this.c = bVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:20|21))(3:22|23|(1:25))|11|(1:13)(1:19)|14|15|16))|33|6|7|(0)(0)|11|(0)(0)|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002b, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        r9 = defpackage.z7o.b;
        r9 = new defpackage.t7o(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0029, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0027, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        r9 = defpackage.z7o.b;
        r9 = new defpackage.t7o(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a A[Catch: all -> 0x0027, CancellationException -> 0x0029, wis -> 0x002b, TryCatch #2 {wis -> 0x002b, CancellationException -> 0x0029, all -> 0x0027, blocks: (B:10:0x0023, B:11:0x0062, B:13:0x006a, B:14:0x0071, B:19:0x006f, B:23:0x0037), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f A[Catch: all -> 0x0027, CancellationException -> 0x0029, wis -> 0x002b, TryCatch #2 {wis -> 0x002b, CancellationException -> 0x0029, all -> 0x0027, blocks: (B:10:0x0023, B:11:0x0062, B:13:0x006a, B:14:0x0071, B:19:0x006f, B:23:0x0037), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(u uVar, cg6 cg6Var) {
        v vVar;
        int i;
        Object obj;
        if (cg6Var instanceof v) {
            vVar = (v) cg6Var;
            int i2 = vVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = vVar.j;
                nm6 nm6Var = nm6.a;
                i = vVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    r7o r7oVar = z7o.b;
                    g2 g2Var = this.b;
                    com.yandex.passport.internal.network.mappers.b bVar = this.c;
                    com.yandex.passport.internal.l lVar = uVar.a;
                    com.yandex.passport.common.core.b bVar2 = lVar.b.a;
                    bVar.getClass();
                    b2 b2Var = new b2(com.yandex.passport.internal.network.mappers.b.a(bVar2), lVar.h(), lVar.d.d());
                    vVar.l = 1;
                    obj2 = g2Var.g(b2Var, vVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (obj instanceof t7o) {
                    r7o r7oVar2 = z7o.b;
                } else {
                    r7o r7oVar3 = z7o.b;
                }
                Object obj3 = Unit.a;
                return new z7o(obj3);
            }
        }
        vVar = new v(this, cg6Var);
        Object obj22 = vVar.j;
        nm6 nm6Var2 = nm6.a;
        i = vVar.l;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (obj instanceof t7o) {
        }
        Object obj32 = Unit.a;
        return new z7o(obj32);
    }
}
