package com.squareup.cash.savings.applets.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.savings.applets.presenters.SavingsRepositoryModel;
import com.squareup.cash.savings.backend.api.model.SavingsAction;
import com.squareup.cash.savings.backend.api.model.SavingsApplet;
import com.squareup.cash.savings.backend.api.model.SavingsFolder;
import com.squareup.protos.common.Money;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RealSavingsAppletTileRepository$modelFlow$1 extends SuspendLambda implements Function5 {
    public final /* synthetic */ SavingsApplet $applet;
    public int I$1;
    public /* synthetic */ SavingsRepositoryModel.SavingsBalanceState L$0;
    public /* synthetic */ List L$1;
    public /* synthetic */ SavingsRepositoryModel.SavingsConfigState L$2;
    public Money L$3;
    public /* synthetic */ boolean Z$0;
    public int label;
    public final /* synthetic */ RealSavingsAppletTileRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSavingsAppletTileRepository$modelFlow$1(SavingsApplet savingsApplet, RealSavingsAppletTileRepository realSavingsAppletTileRepository, Continuation continuation) {
        super(5, continuation);
        this.$applet = savingsApplet;
        this.this$0 = realSavingsAppletTileRepository;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        RealSavingsAppletTileRepository$modelFlow$1 realSavingsAppletTileRepository$modelFlow$1 = new RealSavingsAppletTileRepository$modelFlow$1(this.$applet, this.this$0, (Continuation) obj5);
        realSavingsAppletTileRepository$modelFlow$1.L$0 = (SavingsRepositoryModel.SavingsBalanceState) obj;
        realSavingsAppletTileRepository$modelFlow$1.L$1 = (List) obj2;
        realSavingsAppletTileRepository$modelFlow$1.L$2 = (SavingsRepositoryModel.SavingsConfigState) obj3;
        realSavingsAppletTileRepository$modelFlow$1.Z$0 = booleanValue;
        return realSavingsAppletTileRepository$modelFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0035, code lost:
    
        if (r0 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0133, code lost:
    
        if (r0 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x012e, code lost:
    
        if (r0 == r5) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0114  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        int i;
        boolean z;
        SavingsAction savingsAction;
        Object withContext;
        Object access$action;
        Money money;
        ClientRoute viewSavingsHome;
        ClientRoute clientRoute;
        ArrayList arrayList;
        SavingsRepositoryModel.SavingsBalanceState savingsBalanceState = this.L$0;
        List list = this.L$1;
        SavingsRepositoryModel.SavingsConfigState savingsConfigState = this.L$2;
        boolean z2 = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        SavingsApplet savingsApplet = this.$applet;
        ArrayList arrayList2 = null;
        if (i2 == 0) {
            SafeTrace.throwOnFailure(obj);
            Money money2 = savingsBalanceState.balance;
            Boolean bool = savingsBalanceState.isAdopted;
            if (!savingsBalanceState.isLoading) {
                if (savingsConfigState == null) {
                    pair = new Pair(null, null);
                } else if (!savingsConfigState.loading) {
                    pair = new Pair(null, null);
                }
                if (pair.first != null) {
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return null;
                }
                if (pair.second != null) {
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return null;
                }
                i = 0;
                if (money2 != null) {
                    Long l = money2.amount;
                    if ((l != null ? l.longValue() : 0L) > 0) {
                        z = true;
                        if (money2 != null && Intrinsics.areEqual(bool, Boolean.FALSE) && !z) {
                            i = 1;
                        }
                        RealSavingsAppletTileRepository realSavingsAppletTileRepository = this.this$0;
                        if (money2 != null || i != 0) {
                            savingsAction = savingsApplet.action;
                            if (savingsAction != null) {
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.Z$0 = z2;
                                this.I$1 = i;
                                this.label = 1;
                                withContext = JobKt.withContext(realSavingsAppletTileRepository.ioDispatcher, new ProfileCropView.AnonymousClass3(savingsAction, realSavingsAppletTileRepository, null, 6), this);
                            }
                            if (i != 0) {
                                viewSavingsHome = new ClientRoute.ViewSavingsHome();
                                return new SavingsRepositoryModel.Uninstalled(savingsApplet, viewSavingsHome, z2);
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("ClientRoute from Null State Config missing");
                            return null;
                        }
                        this.L$0 = null;
                        this.L$1 = list;
                        this.L$2 = null;
                        this.L$3 = money2;
                        this.Z$0 = z2;
                        this.I$1 = i;
                        this.label = 3;
                        access$action = RealSavingsAppletTileRepository.access$action(realSavingsAppletTileRepository, savingsApplet, this);
                        if (access$action != coroutineSingletons) {
                            money = money2;
                            clientRoute = (ClientRoute) access$action;
                            if (list != null) {
                            }
                            arrayList = arrayList2;
                            if (arrayList != null) {
                            }
                            return new SavingsRepositoryModel.NoGoalSet(savingsApplet, money, clientRoute);
                        }
                        return coroutineSingletons;
                    }
                }
                z = false;
                if (money2 != null) {
                    i = 1;
                }
                RealSavingsAppletTileRepository realSavingsAppletTileRepository2 = this.this$0;
                if (money2 != null) {
                }
                savingsAction = savingsApplet.action;
                if (savingsAction != null) {
                }
                if (i != 0) {
                }
                a$$ExternalSyntheticBUOutline0.m$1("ClientRoute from Null State Config missing");
                return null;
            }
            return null;
        }
        if (i2 == 1) {
            int i3 = this.I$1;
            SafeTrace.throwOnFailure(obj);
            i = i3;
            withContext = obj;
            viewSavingsHome = (ClientRoute) withContext;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Money money3 = this.L$3;
                SafeTrace.throwOnFailure(obj);
                money = money3;
                access$action = obj;
                clientRoute = (ClientRoute) access$action;
                if (list != null) {
                    arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 instanceof SavingsFolder.GoalFolder) {
                            arrayList2.add(obj2);
                        }
                    }
                }
                arrayList = arrayList2;
                if (arrayList != null || arrayList.isEmpty()) {
                    return new SavingsRepositoryModel.NoGoalSet(savingsApplet, money, clientRoute);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof SavingsFolder.GeneralFolder) {
                        arrayList3.add(obj3);
                    }
                }
                return new SavingsRepositoryModel.GoalSet(this.$applet, arrayList, (SavingsFolder.GeneralFolder) CollectionsKt.firstOrNull((List) arrayList3), money, clientRoute);
            }
            SafeTrace.throwOnFailure(obj);
            viewSavingsHome = (ClientRoute) obj;
        }
    }
}
