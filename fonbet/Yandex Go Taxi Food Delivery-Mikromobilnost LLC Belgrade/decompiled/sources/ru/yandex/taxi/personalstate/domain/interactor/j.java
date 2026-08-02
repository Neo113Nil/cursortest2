package ru.yandex.taxi.personalstate.domain.interactor;

import com.yandex.go.zone.model.Zone;
import defpackage.fnx0;
import defpackage.gnx0;
import defpackage.hp40;
import defpackage.j6b0;
import defpackage.ni31;
import defpackage.np40;
import defpackage.ny61;
import defpackage.s7b0;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class j {
    public final e a;
    public final f b;
    public final s7b0 c;

    public j(e eVar, f fVar, s7b0 s7b0Var) {
        this.a = eVar;
        this.b = fVar;
        this.c = s7b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Zone zone, ContinuationImpl continuationImpl) {
        SelectedTariffPersonalStateInteractorImpl$awaitSelectedVerticalClassForZoneWithFallback$1 selectedTariffPersonalStateInteractorImpl$awaitSelectedVerticalClassForZoneWithFallback$1;
        int i;
        j6b0 j6b0Var;
        gnx0 gnx0Var;
        if (continuationImpl instanceof SelectedTariffPersonalStateInteractorImpl$awaitSelectedVerticalClassForZoneWithFallback$1) {
            selectedTariffPersonalStateInteractorImpl$awaitSelectedVerticalClassForZoneWithFallback$1 = (SelectedTariffPersonalStateInteractorImpl$awaitSelectedVerticalClassForZoneWithFallback$1) continuationImpl;
            int i2 = selectedTariffPersonalStateInteractorImpl$awaitSelectedVerticalClassForZoneWithFallback$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectedTariffPersonalStateInteractorImpl$awaitSelectedVerticalClassForZoneWithFallback$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectedTariffPersonalStateInteractorImpl$awaitSelectedVerticalClassForZoneWithFallback$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectedTariffPersonalStateInteractorImpl$awaitSelectedVerticalClassForZoneWithFallback$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    selectedTariffPersonalStateInteractorImpl$awaitSelectedVerticalClassForZoneWithFallback$1.L$0 = null;
                    selectedTariffPersonalStateInteractorImpl$awaitSelectedVerticalClassForZoneWithFallback$1.label = 1;
                    obj = this.a.a(zone, selectedTariffPersonalStateInteractorImpl$awaitSelectedVerticalClassForZoneWithFallback$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                j6b0Var = (j6b0) obj;
                if (j6b0Var != null || (gnx0Var = this.c.a(j6b0Var).a) == null) {
                    return null;
                }
                fnx0 fnx0Var = gnx0Var.a;
                return new ni31(fnx0Var.a.f, fnx0Var.d);
            }
        }
        selectedTariffPersonalStateInteractorImpl$awaitSelectedVerticalClassForZoneWithFallback$1 = new SelectedTariffPersonalStateInteractorImpl$awaitSelectedVerticalClassForZoneWithFallback$1(this, continuationImpl);
        Object obj2 = selectedTariffPersonalStateInteractorImpl$awaitSelectedVerticalClassForZoneWithFallback$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectedTariffPersonalStateInteractorImpl$awaitSelectedVerticalClassForZoneWithFallback$1.label;
        if (i != 0) {
        }
        j6b0Var = (j6b0) obj2;
        if (j6b0Var != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        SelectedTariffPersonalStateInteractorImpl$getMulticlassOptions$1 selectedTariffPersonalStateInteractorImpl$getMulticlassOptions$1;
        int i;
        np40 np40Var;
        if (continuationImpl instanceof SelectedTariffPersonalStateInteractorImpl$getMulticlassOptions$1) {
            selectedTariffPersonalStateInteractorImpl$getMulticlassOptions$1 = (SelectedTariffPersonalStateInteractorImpl$getMulticlassOptions$1) continuationImpl;
            int i2 = selectedTariffPersonalStateInteractorImpl$getMulticlassOptions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectedTariffPersonalStateInteractorImpl$getMulticlassOptions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectedTariffPersonalStateInteractorImpl$getMulticlassOptions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectedTariffPersonalStateInteractorImpl$getMulticlassOptions$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    selectedTariffPersonalStateInteractorImpl$getMulticlassOptions$1.label = 1;
                    obj = this.b.a(selectedTariffPersonalStateInteractorImpl$getMulticlassOptions$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                j6b0 j6b0Var = (j6b0) obj;
                np40Var = j6b0Var == null ? j6b0Var.d : null;
                if (np40Var == null) {
                    return new hp40(Boolean.valueOf(np40Var.b), np40Var.a);
                }
                if ((j6b0Var != null ? j6b0Var.a : null) != null) {
                    return new hp40(Boolean.FALSE, null);
                }
                return null;
            }
        }
        selectedTariffPersonalStateInteractorImpl$getMulticlassOptions$1 = new SelectedTariffPersonalStateInteractorImpl$getMulticlassOptions$1(this, continuationImpl);
        Object obj2 = selectedTariffPersonalStateInteractorImpl$getMulticlassOptions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectedTariffPersonalStateInteractorImpl$getMulticlassOptions$1.label;
        if (i != 0) {
        }
        j6b0 j6b0Var2 = (j6b0) obj2;
        if (j6b0Var2 == null) {
        }
        if (np40Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        SelectedTariffPersonalStateInteractorImpl$getSelectedClass$1 selectedTariffPersonalStateInteractorImpl$getSelectedClass$1;
        int i;
        j6b0 j6b0Var;
        if (continuationImpl instanceof SelectedTariffPersonalStateInteractorImpl$getSelectedClass$1) {
            selectedTariffPersonalStateInteractorImpl$getSelectedClass$1 = (SelectedTariffPersonalStateInteractorImpl$getSelectedClass$1) continuationImpl;
            int i2 = selectedTariffPersonalStateInteractorImpl$getSelectedClass$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectedTariffPersonalStateInteractorImpl$getSelectedClass$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectedTariffPersonalStateInteractorImpl$getSelectedClass$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectedTariffPersonalStateInteractorImpl$getSelectedClass$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    selectedTariffPersonalStateInteractorImpl$getSelectedClass$1.label = 1;
                    obj = this.b.a(selectedTariffPersonalStateInteractorImpl$getSelectedClass$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                j6b0Var = (j6b0) obj;
                if (j6b0Var == null) {
                    return j6b0Var.a;
                }
                return null;
            }
        }
        selectedTariffPersonalStateInteractorImpl$getSelectedClass$1 = new SelectedTariffPersonalStateInteractorImpl$getSelectedClass$1(this, continuationImpl);
        Object obj2 = selectedTariffPersonalStateInteractorImpl$getSelectedClass$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectedTariffPersonalStateInteractorImpl$getSelectedClass$1.label;
        if (i != 0) {
        }
        j6b0Var = (j6b0) obj2;
        if (j6b0Var == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        SelectedTariffPersonalStateInteractorImpl$getSelectedClassesInVerticals$1 selectedTariffPersonalStateInteractorImpl$getSelectedClassesInVerticals$1;
        int i;
        if (continuationImpl instanceof SelectedTariffPersonalStateInteractorImpl$getSelectedClassesInVerticals$1) {
            selectedTariffPersonalStateInteractorImpl$getSelectedClassesInVerticals$1 = (SelectedTariffPersonalStateInteractorImpl$getSelectedClassesInVerticals$1) continuationImpl;
            int i2 = selectedTariffPersonalStateInteractorImpl$getSelectedClassesInVerticals$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectedTariffPersonalStateInteractorImpl$getSelectedClassesInVerticals$1.label = i2 - Integer.MIN_VALUE;
                Object obj = selectedTariffPersonalStateInteractorImpl$getSelectedClassesInVerticals$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectedTariffPersonalStateInteractorImpl$getSelectedClassesInVerticals$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    selectedTariffPersonalStateInteractorImpl$getSelectedClassesInVerticals$1.label = 1;
                    obj = this.b.a(selectedTariffPersonalStateInteractorImpl$getSelectedClassesInVerticals$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                j6b0 j6b0Var = (j6b0) obj;
                return j6b0Var != null ? EmptyList.a : this.c.a(j6b0Var).c;
            }
        }
        selectedTariffPersonalStateInteractorImpl$getSelectedClassesInVerticals$1 = new SelectedTariffPersonalStateInteractorImpl$getSelectedClassesInVerticals$1(this, continuationImpl);
        Object obj2 = selectedTariffPersonalStateInteractorImpl$getSelectedClassesInVerticals$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectedTariffPersonalStateInteractorImpl$getSelectedClassesInVerticals$1.label;
        if (i != 0) {
        }
        j6b0 j6b0Var2 = (j6b0) obj2;
        if (j6b0Var2 != null) {
        }
    }
}
