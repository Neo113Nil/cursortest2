package ru.yandex.taxi.preorder.source.userposition;

import defpackage.j73;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.yne;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lyne;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.userposition.CoordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1", f = "CoordinateProvidersFactory.kt", l = {HProv.PP_DHOID, HProv.PP_RESERVED1, HProv.PP_BIO_STATISTICA_LEN, HProv.PP_REBOOT, 99, 100, 101, 102}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class CoordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1 extends SuspendLambda implements wls {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CoordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1 coordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1 = new CoordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1(this.this$0, continuation);
        coordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1.L$0 = obj;
        return coordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CoordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0265  */
    /* JADX WARN: Type inference failed for: r10v15, types: [noh] */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r4v10, types: [noh] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r5v8, types: [noh] */
    /* JADX WARN: Type inference failed for: r7v20, types: [noh] */
    /* JADX WARN: Type inference failed for: r8v6, types: [noh] */
    /* JADX WARN: Type inference failed for: r9v11, types: [noh] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh h2;
        noh h3;
        Object s;
        qoh qohVar;
        int i;
        noh nohVar;
        noh nohVar2;
        noh nohVar3;
        yne[] yneVarArr;
        ?? r10;
        Object k;
        int i2;
        ?? r1;
        noh nohVar4;
        qoh qohVar2;
        noh nohVar5;
        yne[] yneVarArr2;
        Object k2;
        noh nohVar6;
        noh nohVar7;
        noh nohVar8;
        int i3;
        yne[] yneVarArr3;
        ?? r4;
        Object k3;
        noh nohVar9;
        noh nohVar10;
        yne[] yneVarArr4;
        noh nohVar11;
        ?? r3;
        Object k4;
        noh nohVar12;
        qoh qohVar3;
        int i4;
        ?? r12;
        yne[] yneVarArr5;
        Object k5;
        int i5;
        yne[] yneVarArr6;
        ?? r42;
        Object k6;
        noh nohVar13;
        int i6;
        ?? r13;
        int i7;
        Object k7;
        yne[] yneVarArr7;
        ?? r14;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = 3;
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                qoh h4 = tje.h(tseVar, null, null, new CoordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1$gps$1(this.this$0, null), 3);
                h = tje.h(tseVar, null, null, new CoordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1$platformLbs$1(this.this$0, null), 3);
                qoh h5 = tje.h(tseVar, null, null, new CoordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1$lbsGsm$1(this.this$0, null), 3);
                h2 = tje.h(tseVar, null, null, new CoordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1$lbsIp$1(this.this$0, null), 3);
                qoh h6 = tje.h(tseVar, null, null, new CoordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1$lbsWifi$1(this.this$0, null), 3);
                h3 = tje.h(tseVar, null, null, new CoordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1$mapkit$1(this.this$0, null), 3);
                qoh h7 = tje.h(tseVar, null, null, new CoordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1$fused$1(this.this$0, null), 3);
                qoh h8 = tje.h(tseVar, null, null, new CoordinateProvidersFactory$currentCoordinatesParallel$coopProviders$1$ridetech$1(this.this$0, null), 3);
                yne[] yneVarArr8 = new yne[8];
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = h;
                this.L$3 = h5;
                this.L$4 = h2;
                this.L$5 = h6;
                this.L$6 = h3;
                this.L$7 = h7;
                this.L$8 = h8;
                this.L$9 = yneVarArr8;
                this.L$10 = yneVarArr8;
                this.I$0 = 0;
                this.label = 1;
                s = h4.s(this);
                if (s != coroutineSingletons) {
                    qohVar = h8;
                    i = 0;
                    nohVar = h6;
                    nohVar2 = h7;
                    nohVar3 = h5;
                    yneVarArr = yneVarArr8;
                    r10 = yneVarArr8;
                    r10[i] = s;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = nohVar3;
                    this.L$4 = h2;
                    this.L$5 = nohVar;
                    this.L$6 = h3;
                    this.L$7 = nohVar2;
                    this.L$8 = qohVar;
                    this.L$9 = yneVarArr;
                    this.L$10 = yneVarArr;
                    this.I$0 = 1;
                    this.label = 2;
                    k = h.k(this);
                    if (k != coroutineSingletons) {
                        i2 = 1;
                        r1 = yneVarArr;
                        nohVar4 = h3;
                        qohVar2 = qohVar;
                        nohVar5 = nohVar3;
                        yneVarArr2 = yneVarArr;
                        r1[i2] = k;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = h2;
                        this.L$5 = nohVar;
                        this.L$6 = nohVar4;
                        this.L$7 = nohVar2;
                        this.L$8 = qohVar2;
                        this.L$9 = yneVarArr2;
                        this.L$10 = yneVarArr2;
                        this.I$0 = 2;
                        this.label = 3;
                        k2 = nohVar5.k(this);
                        if (k2 != coroutineSingletons) {
                            nohVar6 = nohVar2;
                            nohVar7 = nohVar4;
                            nohVar8 = nohVar;
                            i3 = 2;
                            yneVarArr3 = yneVarArr2;
                            r4 = yneVarArr2;
                            r4[i3] = k2;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = nohVar8;
                            this.L$6 = nohVar7;
                            this.L$7 = nohVar6;
                            this.L$8 = qohVar2;
                            this.L$9 = yneVarArr3;
                            this.L$10 = yneVarArr3;
                            this.I$0 = 3;
                            this.label = 4;
                            k3 = h2.k(this);
                            if (k3 != coroutineSingletons) {
                                noh nohVar14 = nohVar6;
                                nohVar9 = nohVar7;
                                nohVar10 = nohVar14;
                                yneVarArr4 = yneVarArr3;
                                nohVar11 = nohVar8;
                                r3 = yneVarArr3;
                                r3[i8] = k3;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = nohVar9;
                                this.L$7 = nohVar10;
                                this.L$8 = qohVar2;
                                this.L$9 = yneVarArr4;
                                this.L$10 = yneVarArr4;
                                this.I$0 = 4;
                                this.label = 5;
                                k4 = nohVar11.k(this);
                                if (k4 != coroutineSingletons) {
                                    nohVar12 = nohVar10;
                                    qohVar3 = qohVar2;
                                    i4 = 4;
                                    r12 = yneVarArr4;
                                    yneVarArr5 = yneVarArr4;
                                    r12[i4] = k4;
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = null;
                                    this.L$7 = nohVar12;
                                    this.L$8 = qohVar3;
                                    this.L$9 = yneVarArr5;
                                    this.L$10 = yneVarArr5;
                                    this.I$0 = 5;
                                    this.label = 6;
                                    k5 = nohVar9.k(this);
                                    if (k5 != coroutineSingletons) {
                                        i5 = 5;
                                        yneVarArr6 = yneVarArr5;
                                        r42 = yneVarArr5;
                                        r42[i5] = k5;
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.L$4 = null;
                                        this.L$5 = null;
                                        this.L$6 = null;
                                        this.L$7 = null;
                                        this.L$8 = qohVar3;
                                        this.L$9 = yneVarArr6;
                                        this.L$10 = yneVarArr6;
                                        this.I$0 = 6;
                                        this.label = 7;
                                        k6 = nohVar12.k(this);
                                        if (k6 != coroutineSingletons) {
                                            nohVar13 = qohVar3;
                                            i6 = 6;
                                            r13 = yneVarArr6;
                                            r13[i6] = k6;
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.L$3 = null;
                                            this.L$4 = null;
                                            this.L$5 = null;
                                            this.L$6 = null;
                                            this.L$7 = null;
                                            this.L$8 = null;
                                            this.L$9 = yneVarArr6;
                                            this.L$10 = yneVarArr6;
                                            i7 = 7;
                                            this.I$0 = 7;
                                            this.label = 8;
                                            k7 = nohVar13.k(this);
                                            if (k7 != coroutineSingletons) {
                                                yne[] yneVarArr9 = yneVarArr6;
                                                yneVarArr7 = yneVarArr9;
                                                r14 = yneVarArr9;
                                                r14[i7] = k7;
                                                return j73.A(yneVarArr7);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                i = this.I$0;
                yne[] yneVarArr10 = (yne[]) this.L$10;
                yne[] yneVarArr11 = (yne[]) this.L$9;
                ?? r5 = (noh) this.L$8;
                noh nohVar15 = (noh) this.L$7;
                h3 = (noh) this.L$6;
                nohVar = (noh) this.L$5;
                h2 = (noh) this.L$4;
                nohVar3 = (noh) this.L$3;
                h = (noh) this.L$2;
                kotlin.b.b(obj);
                qohVar = r5;
                nohVar2 = nohVar15;
                r10 = yneVarArr10;
                s = obj;
                yneVarArr = yneVarArr11;
                r10[i] = s;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = nohVar3;
                this.L$4 = h2;
                this.L$5 = nohVar;
                this.L$6 = h3;
                this.L$7 = nohVar2;
                this.L$8 = qohVar;
                this.L$9 = yneVarArr;
                this.L$10 = yneVarArr;
                this.I$0 = 1;
                this.label = 2;
                k = h.k(this);
                if (k != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 2:
                i2 = this.I$0;
                yne[] yneVarArr12 = (yne[]) this.L$10;
                yne[] yneVarArr13 = (yne[]) this.L$9;
                ?? r43 = (noh) this.L$8;
                nohVar2 = (noh) this.L$7;
                noh nohVar16 = (noh) this.L$6;
                noh nohVar17 = (noh) this.L$5;
                noh nohVar18 = (noh) this.L$4;
                nohVar5 = (noh) this.L$3;
                kotlin.b.b(obj);
                qohVar2 = r43;
                nohVar4 = nohVar16;
                nohVar = nohVar17;
                h2 = nohVar18;
                yneVarArr2 = yneVarArr13;
                k = obj;
                r1 = yneVarArr12;
                r1[i2] = k;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = h2;
                this.L$5 = nohVar;
                this.L$6 = nohVar4;
                this.L$7 = nohVar2;
                this.L$8 = qohVar2;
                this.L$9 = yneVarArr2;
                this.L$10 = yneVarArr2;
                this.I$0 = 2;
                this.label = 3;
                k2 = nohVar5.k(this);
                if (k2 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 3:
                i3 = this.I$0;
                yne[] yneVarArr14 = (yne[]) this.L$10;
                yne[] yneVarArr15 = (yne[]) this.L$9;
                ?? r102 = (noh) this.L$8;
                noh nohVar19 = (noh) this.L$7;
                noh nohVar20 = (noh) this.L$6;
                nohVar8 = (noh) this.L$5;
                noh nohVar21 = (noh) this.L$4;
                kotlin.b.b(obj);
                qohVar2 = r102;
                nohVar6 = nohVar19;
                nohVar7 = nohVar20;
                h2 = nohVar21;
                r4 = yneVarArr14;
                k2 = obj;
                yneVarArr3 = yneVarArr15;
                r4[i3] = k2;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = nohVar8;
                this.L$6 = nohVar7;
                this.L$7 = nohVar6;
                this.L$8 = qohVar2;
                this.L$9 = yneVarArr3;
                this.L$10 = yneVarArr3;
                this.I$0 = 3;
                this.label = 4;
                k3 = h2.k(this);
                if (k3 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 4:
                i8 = this.I$0;
                yne[] yneVarArr16 = (yne[]) this.L$10;
                yne[] yneVarArr17 = (yne[]) this.L$9;
                ?? r9 = (noh) this.L$8;
                noh nohVar22 = (noh) this.L$7;
                noh nohVar23 = (noh) this.L$6;
                nohVar11 = (noh) this.L$5;
                kotlin.b.b(obj);
                yneVarArr4 = yneVarArr17;
                qohVar2 = r9;
                nohVar10 = nohVar22;
                nohVar9 = nohVar23;
                r3 = yneVarArr16;
                k3 = obj;
                r3[i8] = k3;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = nohVar9;
                this.L$7 = nohVar10;
                this.L$8 = qohVar2;
                this.L$9 = yneVarArr4;
                this.L$10 = yneVarArr4;
                this.I$0 = 4;
                this.label = 5;
                k4 = nohVar11.k(this);
                if (k4 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 5:
                i4 = this.I$0;
                yne[] yneVarArr18 = (yne[]) this.L$10;
                yne[] yneVarArr19 = (yne[]) this.L$9;
                ?? r8 = (noh) this.L$8;
                noh nohVar24 = (noh) this.L$7;
                nohVar9 = (noh) this.L$6;
                kotlin.b.b(obj);
                yneVarArr5 = yneVarArr19;
                qohVar3 = r8;
                nohVar12 = nohVar24;
                k4 = obj;
                r12 = yneVarArr18;
                r12[i4] = k4;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = nohVar12;
                this.L$8 = qohVar3;
                this.L$9 = yneVarArr5;
                this.L$10 = yneVarArr5;
                this.I$0 = 5;
                this.label = 6;
                k5 = nohVar9.k(this);
                if (k5 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 6:
                i5 = this.I$0;
                yne[] yneVarArr20 = (yne[]) this.L$10;
                yneVarArr6 = (yne[]) this.L$9;
                ?? r7 = (noh) this.L$8;
                nohVar12 = (noh) this.L$7;
                kotlin.b.b(obj);
                r42 = yneVarArr20;
                qohVar3 = r7;
                k5 = obj;
                r42[i5] = k5;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = qohVar3;
                this.L$9 = yneVarArr6;
                this.L$10 = yneVarArr6;
                this.I$0 = 6;
                this.label = 7;
                k6 = nohVar12.k(this);
                if (k6 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 7:
                i6 = this.I$0;
                yne[] yneVarArr21 = (yne[]) this.L$10;
                yneVarArr6 = (yne[]) this.L$9;
                nohVar13 = (noh) this.L$8;
                kotlin.b.b(obj);
                k6 = obj;
                r13 = yneVarArr21;
                r13[i6] = k6;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = yneVarArr6;
                this.L$10 = yneVarArr6;
                i7 = 7;
                this.I$0 = 7;
                this.label = 8;
                k7 = nohVar13.k(this);
                if (k7 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 8:
                i7 = this.I$0;
                yne[] yneVarArr22 = (yne[]) this.L$10;
                yneVarArr7 = (yne[]) this.L$9;
                kotlin.b.b(obj);
                k7 = obj;
                r14 = yneVarArr22;
                r14[i7] = k7;
                return j73.A(yneVarArr7);
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
