package com.yandex.passport.internal.report.diary;

import com.yandex.passport.internal.database.PassportDatabase_Impl;
import defpackage.aur;
import defpackage.cko;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.up6;
import defpackage.x9l;
import defpackage.xjo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class p0 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ q0 k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ com.yandex.passport.internal.database.diary.f n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(q0 q0Var, long j, long j2, com.yandex.passport.internal.database.diary.f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = q0Var;
        this.l = j;
        this.m = j2;
        this.n = fVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new p0(this.k, this.l, this.m, this.n, continuation, 0);
            default:
                return new p0(this.k, this.l, this.m, this.n, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((p0) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        com.yandex.passport.internal.database.diary.f fVar = this.n;
        q0 q0Var = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                com.yandex.passport.internal.database.diary.e eVar = q0Var.a;
                eVar.getClass();
                fVar.getClass();
                PassportDatabase_Impl passportDatabase_Impl = eVar.a;
                final long j = this.l;
                final long j2 = this.m;
                List list = (List) up6.F(passportDatabase_Impl, true, false, new x9l(2, j, j2));
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Got method stats: " + list, 8);
                }
                final long j3 = fVar.a;
                final int i2 = 0;
                up6.F(passportDatabase_Impl, false, true, new Function1() { // from class: com.yandex.passport.internal.database.diary.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        cko D0;
                        switch (i2) {
                            case 0:
                                long j4 = j3;
                                long j5 = j;
                                long j6 = j2;
                                D0 = ((xjo) obj2).D0("UPDATE diary_method set uploadId = ? WHERE uploadId is null AND issuedAt >= ? AND issuedAt <= ?");
                                try {
                                    D0.bindLong(1, j4);
                                    D0.bindLong(2, j5);
                                    D0.bindLong(3, j6);
                                    D0.q();
                                    return null;
                                } finally {
                                }
                            default:
                                long j7 = j3;
                                long j8 = j;
                                long j9 = j2;
                                D0 = ((xjo) obj2).D0("UPDATE diary_parameter set uploadId = ? WHERE uploadId is null AND issuedAt >= ? AND issuedAt <= ?");
                                try {
                                    D0.bindLong(1, j7);
                                    D0.bindLong(2, j8);
                                    D0.bindLong(3, j9);
                                    D0.q();
                                    return null;
                                } finally {
                                }
                        }
                    }
                });
                return list;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                com.yandex.passport.internal.database.diary.e eVar2 = q0Var.a;
                eVar2.getClass();
                fVar.getClass();
                PassportDatabase_Impl passportDatabase_Impl2 = eVar2.a;
                final long j4 = this.l;
                final long j5 = this.m;
                List list2 = (List) up6.F(passportDatabase_Impl2, true, false, new x9l(1, j4, j5));
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Got parameter stats: " + list2, 8);
                }
                final long j6 = fVar.a;
                final int i3 = 1;
                up6.F(passportDatabase_Impl2, false, true, new Function1() { // from class: com.yandex.passport.internal.database.diary.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        cko D0;
                        switch (i3) {
                            case 0:
                                long j42 = j6;
                                long j52 = j4;
                                long j62 = j5;
                                D0 = ((xjo) obj2).D0("UPDATE diary_method set uploadId = ? WHERE uploadId is null AND issuedAt >= ? AND issuedAt <= ?");
                                try {
                                    D0.bindLong(1, j42);
                                    D0.bindLong(2, j52);
                                    D0.bindLong(3, j62);
                                    D0.q();
                                    return null;
                                } finally {
                                }
                            default:
                                long j7 = j6;
                                long j8 = j4;
                                long j9 = j5;
                                D0 = ((xjo) obj2).D0("UPDATE diary_parameter set uploadId = ? WHERE uploadId is null AND issuedAt >= ? AND issuedAt <= ?");
                                try {
                                    D0.bindLong(1, j7);
                                    D0.bindLong(2, j8);
                                    D0.bindLong(3, j9);
                                    D0.q();
                                    return null;
                                } finally {
                                }
                        }
                    }
                });
                return list2;
        }
    }
}
