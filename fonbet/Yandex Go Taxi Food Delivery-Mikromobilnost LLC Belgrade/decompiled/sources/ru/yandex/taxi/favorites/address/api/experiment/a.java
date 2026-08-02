package ru.yandex.taxi.favorites.address.api.experiment;

import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tdp;
import defpackage.tpr;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a implements t1b0 {
    public final /* synthetic */ t1b0 a;

    public a(rqo rqoVar) {
        tdp.Companion.getClass();
        this.a = ((jbh) rqoVar).e(tdp.m);
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        return this.a.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return (tdp) this.a.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        if (((defpackage.tdp) r6).d != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        FavoriteAddressNewUiExperimentRepository$isEditEnabled$1 favoriteAddressNewUiExperimentRepository$isEditEnabled$1;
        Object obj;
        int i;
        if (continuationImpl instanceof FavoriteAddressNewUiExperimentRepository$isEditEnabled$1) {
            favoriteAddressNewUiExperimentRepository$isEditEnabled$1 = (FavoriteAddressNewUiExperimentRepository$isEditEnabled$1) continuationImpl;
            int i2 = favoriteAddressNewUiExperimentRepository$isEditEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoriteAddressNewUiExperimentRepository$isEditEnabled$1.label = i2 - Integer.MIN_VALUE;
                obj = favoriteAddressNewUiExperimentRepository$isEditEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoriteAddressNewUiExperimentRepository$isEditEnabled$1.label;
                t1b0 t1b0Var = this.a;
                boolean z = true;
                if (i != 0) {
                    b.b(obj);
                    favoriteAddressNewUiExperimentRepository$isEditEnabled$1.label = 1;
                    obj = t1b0Var.b(favoriteAddressNewUiExperimentRepository$isEditEnabled$1);
                } else if (i == 1) {
                    b.b(obj);
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                if (((tdp) obj).b) {
                    favoriteAddressNewUiExperimentRepository$isEditEnabled$1.label = 2;
                    obj = t1b0Var.b(favoriteAddressNewUiExperimentRepository$isEditEnabled$1);
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        favoriteAddressNewUiExperimentRepository$isEditEnabled$1 = new FavoriteAddressNewUiExperimentRepository$isEditEnabled$1(this, continuationImpl);
        obj = favoriteAddressNewUiExperimentRepository$isEditEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoriteAddressNewUiExperimentRepository$isEditEnabled$1.label;
        t1b0 t1b0Var2 = this.a;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((tdp) obj).b) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        if (((defpackage.tdp) r6).e != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        FavoriteAddressNewUiExperimentRepository$isEntryPointOnMapEnabled$1 favoriteAddressNewUiExperimentRepository$isEntryPointOnMapEnabled$1;
        Object obj;
        int i;
        if (continuationImpl instanceof FavoriteAddressNewUiExperimentRepository$isEntryPointOnMapEnabled$1) {
            favoriteAddressNewUiExperimentRepository$isEntryPointOnMapEnabled$1 = (FavoriteAddressNewUiExperimentRepository$isEntryPointOnMapEnabled$1) continuationImpl;
            int i2 = favoriteAddressNewUiExperimentRepository$isEntryPointOnMapEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                favoriteAddressNewUiExperimentRepository$isEntryPointOnMapEnabled$1.label = i2 - Integer.MIN_VALUE;
                obj = favoriteAddressNewUiExperimentRepository$isEntryPointOnMapEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = favoriteAddressNewUiExperimentRepository$isEntryPointOnMapEnabled$1.label;
                t1b0 t1b0Var = this.a;
                boolean z = true;
                if (i != 0) {
                    b.b(obj);
                    favoriteAddressNewUiExperimentRepository$isEntryPointOnMapEnabled$1.label = 1;
                    obj = t1b0Var.b(favoriteAddressNewUiExperimentRepository$isEntryPointOnMapEnabled$1);
                } else if (i == 1) {
                    b.b(obj);
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                if (((tdp) obj).b) {
                    favoriteAddressNewUiExperimentRepository$isEntryPointOnMapEnabled$1.label = 2;
                    obj = t1b0Var.b(favoriteAddressNewUiExperimentRepository$isEntryPointOnMapEnabled$1);
                }
                z = false;
                return Boolean.valueOf(z);
            }
        }
        favoriteAddressNewUiExperimentRepository$isEntryPointOnMapEnabled$1 = new FavoriteAddressNewUiExperimentRepository$isEntryPointOnMapEnabled$1(this, continuationImpl);
        obj = favoriteAddressNewUiExperimentRepository$isEntryPointOnMapEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = favoriteAddressNewUiExperimentRepository$isEntryPointOnMapEnabled$1.label;
        t1b0 t1b0Var2 = this.a;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((tdp) obj).b) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }
}
