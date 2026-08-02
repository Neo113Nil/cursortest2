package ru.yandex.taxi.am.internal;

import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.so90;
import defpackage.tje;
import defpackage.to90;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class h implements vpr {
    public final /* synthetic */ i a;

    public h(i iVar) {
        this.a = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (r9 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        if (r9 == r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(so90 so90Var, Continuation continuation) {
        PassportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1 passportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1;
        int i;
        to90 to90Var;
        if (continuation instanceof PassportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1) {
            passportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1 = (PassportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1) continuation;
            int i2 = passportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1.label;
                Object obj3 = zy11.a;
                i iVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Boolean bool = so90Var.b;
                    if (bool != null) {
                        if (bool.equals(Boolean.FALSE)) {
                            to90 to90Var2 = iVar.b;
                            passportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1.L$0 = null;
                            passportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1.label = 1;
                            to90Var2.a.getClass();
                            sjh sjhVar = uyj.a;
                            Object k0 = tje.k0(mdh.b, new PassportPartitionsRepositoryImpl$updatePartitions$2(to90Var2, EmptyList.a, null), passportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1);
                            if (k0 != obj2) {
                                k0 = obj3;
                            }
                        } else {
                            if (!bool.equals(Boolean.TRUE)) {
                                w511.b();
                                return null;
                            }
                            to90 to90Var3 = iVar.b;
                            List list = so90Var.c;
                            passportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1.L$0 = null;
                            passportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1.label = 2;
                            to90Var3.a.getClass();
                            sjh sjhVar2 = uyj.a;
                            Object k02 = tje.k0(mdh.b, new PassportPartitionsRepositoryImpl$updatePartitions$2(to90Var3, list, null), passportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1);
                            if (k02 != obj2) {
                                k02 = obj3;
                            }
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                to90Var = iVar.b;
                passportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1.L$0 = null;
                passportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1.label = 3;
                if (to90Var.e.get() == null) {
                    to90Var.a.getClass();
                    sjh sjhVar3 = uyj.a;
                    Object k03 = tje.k0(mdh.b, new PassportPartitionsRepositoryImpl$lockPartitionsForCurrentSession$2(to90Var, null), passportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1);
                    if (k03 == obj2) {
                        obj3 = k03;
                    }
                }
                return obj3 != obj2 ? obj2 : obj3;
            }
        }
        passportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1 = new PassportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1(this, continuation);
        Object obj4 = passportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1.label;
        Object obj32 = zy11.a;
        i iVar2 = this.a;
        if (i != 0) {
        }
        to90Var = iVar2.b;
        passportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1.L$0 = null;
        passportPartitionsUpdater$onLargestContentfulPaint$1$1$emit$1.label = 3;
        if (to90Var.e.get() == null) {
        }
        if (obj32 != obj22) {
        }
    }
}
