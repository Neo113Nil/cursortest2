package ru.yandex.taxi.favorites.rides.settings_modal.domain;

import android.content.Context;
import defpackage.bvf0;
import defpackage.dar0;
import defpackage.g8r0;
import defpackage.k9r0;
import defpackage.l9r0;
import defpackage.m9r0;
import defpackage.mdh;
import defpackage.mth;
import defpackage.n7v;
import defpackage.nqs0;
import defpackage.ny61;
import defpackage.o9r0;
import defpackage.oar0;
import defpackage.q5z;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpo0;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.z9r0;
import defpackage.zy11;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes5.dex */
public final class a {
    public final dar0 a;
    public final b b;
    public final r0 c;
    public final mth d;

    public a(dar0 dar0Var, b bVar) {
        this.a = dar0Var;
        this.b = bVar;
        r0 c = bvf0.c(oar0.e);
        this.c = c;
        this.d = new mth(e.d(c), 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        if (r13 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, List list, ContinuationImpl continuationImpl) {
        SettingsModalInteractor$updateContent$1 settingsModalInteractor$updateContent$1;
        int i;
        List list2;
        r0 r0Var;
        Object value;
        aVar.getClass();
        if (continuationImpl instanceof SettingsModalInteractor$updateContent$1) {
            settingsModalInteractor$updateContent$1 = (SettingsModalInteractor$updateContent$1) continuationImpl;
            int i2 = settingsModalInteractor$updateContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                settingsModalInteractor$updateContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = settingsModalInteractor$updateContent$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = settingsModalInteractor$updateContent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    settingsModalInteractor$updateContent$1.L$0 = list;
                    settingsModalInteractor$updateContent$1.label = 1;
                    obj = aVar.c(list, settingsModalInteractor$updateContent$1, true);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    list = (List) settingsModalInteractor$updateContent$1.L$0;
                    kotlin.b.b(obj);
                }
                list2 = (List) obj;
                r0Var = aVar.c;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, oar0.a((oar0) value, null, null, list2, null, 11)));
                settingsModalInteractor$updateContent$1.L$0 = null;
                settingsModalInteractor$updateContent$1.L$1 = null;
                settingsModalInteractor$updateContent$1.label = 2;
                Object e = aVar.e(list, settingsModalInteractor$updateContent$1);
                return e != obj2 ? obj2 : e;
            }
        }
        settingsModalInteractor$updateContent$1 = new SettingsModalInteractor$updateContent$1(aVar, continuationImpl);
        Object obj3 = settingsModalInteractor$updateContent$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = settingsModalInteractor$updateContent$1.label;
        if (i != 0) {
        }
        list2 = (List) obj3;
        r0Var = aVar.c;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, oar0.a((oar0) value, null, null, list2, null, 11)));
        settingsModalInteractor$updateContent$1.L$0 = null;
        settingsModalInteractor$updateContent$1.L$1 = null;
        settingsModalInteractor$updateContent$1.label = 2;
        Object e2 = aVar.e(list, settingsModalInteractor$updateContent$1);
        if (e2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r9 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(a aVar, n7v n7vVar, ThemeType themeType, ContinuationImpl continuationImpl) {
        SettingsModalInteractor$updateIcon$1 settingsModalInteractor$updateIcon$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof SettingsModalInteractor$updateIcon$1) {
            settingsModalInteractor$updateIcon$1 = (SettingsModalInteractor$updateIcon$1) continuationImpl;
            int i2 = settingsModalInteractor$updateIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                settingsModalInteractor$updateIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = settingsModalInteractor$updateIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = settingsModalInteractor$updateIcon$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = aVar.b;
                    settingsModalInteractor$updateIcon$1.L$0 = null;
                    settingsModalInteractor$updateIcon$1.L$1 = null;
                    settingsModalInteractor$updateIcon$1.label = 1;
                    bVar.f.getClass();
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new SettingsModalUiStateMapper$mapIconFlow$2(n7vVar, bVar, themeType, null), settingsModalInteractor$updateIcon$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                tpo0 tpo0Var = new tpo0(6, aVar);
                settingsModalInteractor$updateIcon$1.L$0 = null;
                settingsModalInteractor$updateIcon$1.L$1 = null;
                settingsModalInteractor$updateIcon$1.label = 2;
                Object collect = ((tpr) obj).collect(tpo0Var, settingsModalInteractor$updateIcon$1);
                return collect != coroutineSingletons ? coroutineSingletons : collect;
            }
        }
        settingsModalInteractor$updateIcon$1 = new SettingsModalInteractor$updateIcon$1(aVar, continuationImpl);
        Object obj2 = settingsModalInteractor$updateIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = settingsModalInteractor$updateIcon$1.label;
        if (i != 0) {
        }
        tpo0 tpo0Var2 = new tpo0(6, aVar);
        settingsModalInteractor$updateIcon$1.L$0 = null;
        settingsModalInteractor$updateIcon$1.L$1 = null;
        settingsModalInteractor$updateIcon$1.label = 2;
        Object collect2 = ((tpr) obj2).collect(tpo0Var2, settingsModalInteractor$updateIcon$1);
        if (collect2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (r8 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, ContinuationImpl continuationImpl, boolean z) {
        SettingsModalInteractor$getContent$1 settingsModalInteractor$getContent$1;
        int i;
        if (continuationImpl instanceof SettingsModalInteractor$getContent$1) {
            settingsModalInteractor$getContent$1 = (SettingsModalInteractor$getContent$1) continuationImpl;
            int i2 = settingsModalInteractor$getContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                settingsModalInteractor$getContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = settingsModalInteractor$getContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = settingsModalInteractor$getContent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SettingsModalInteractor$getContent$2 settingsModalInteractor$getContent$2 = new SettingsModalInteractor$getContent$2(list, this, z, null);
                    settingsModalInteractor$getContent$1.L$0 = null;
                    settingsModalInteractor$getContent$1.Z$0 = z;
                    settingsModalInteractor$getContent$1.label = 1;
                    obj = bvf0.n(settingsModalInteractor$getContent$2, settingsModalInteractor$getContent$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return kotlin.collections.a.M((Iterable) obj);
                    }
                    z = settingsModalInteractor$getContent$1.Z$0;
                    kotlin.b.b(obj);
                }
                settingsModalInteractor$getContent$1.L$0 = null;
                settingsModalInteractor$getContent$1.Z$0 = z;
                settingsModalInteractor$getContent$1.label = 2;
                obj = kotlinx.coroutines.a.b((Collection) obj, settingsModalInteractor$getContent$1);
            }
        }
        settingsModalInteractor$getContent$1 = new SettingsModalInteractor$getContent$1(this, continuationImpl);
        Object obj2 = settingsModalInteractor$getContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = settingsModalInteractor$getContent$1.label;
        if (i != 0) {
        }
        settingsModalInteractor$getContent$1.L$0 = null;
        settingsModalInteractor$getContent$1.Z$0 = z;
        settingsModalInteractor$getContent$1.label = 2;
        obj2 = kotlinx.coroutines.a.b((Collection) obj2, settingsModalInteractor$getContent$1);
    }

    public final void d(String str, nqs0 nqs0Var) {
        boolean z = nqs0Var instanceof k9r0;
        int i = 2;
        dar0 dar0Var = this.a;
        if (z) {
            dar0Var.a.r(new g8r0(((k9r0) nqs0Var).b, i));
            return;
        }
        if (nqs0Var instanceof o9r0) {
            q5z.b0((Context) dar0Var.a.F, ((o9r0) nqs0Var).b);
        } else if (nqs0Var instanceof l9r0) {
            dar0Var.a.r(new g8r0(str, 1));
        } else if (nqs0Var instanceof m9r0) {
            dar0Var.a.r(new g8r0(((m9r0) nqs0Var).b, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(List list, ContinuationImpl continuationImpl) {
        SettingsModalInteractor$updateContentWithImages$1 settingsModalInteractor$updateContentWithImages$1;
        int i;
        List list2;
        r0 r0Var;
        Object value;
        if (continuationImpl instanceof SettingsModalInteractor$updateContentWithImages$1) {
            settingsModalInteractor$updateContentWithImages$1 = (SettingsModalInteractor$updateContentWithImages$1) continuationImpl;
            int i2 = settingsModalInteractor$updateContentWithImages$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                settingsModalInteractor$updateContentWithImages$1.label = i2 - Integer.MIN_VALUE;
                Object obj = settingsModalInteractor$updateContentWithImages$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = settingsModalInteractor$updateContentWithImages$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    settingsModalInteractor$updateContentWithImages$1.L$0 = null;
                    settingsModalInteractor$updateContentWithImages$1.label = 1;
                    obj = c(list, settingsModalInteractor$updateContentWithImages$1, false);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                list2 = (List) obj;
                do {
                    r0Var = this.c;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, oar0.a((oar0) value, null, null, list2, null, 11)));
                return zy11.a;
            }
        }
        settingsModalInteractor$updateContentWithImages$1 = new SettingsModalInteractor$updateContentWithImages$1(this, continuationImpl);
        Object obj3 = settingsModalInteractor$updateContentWithImages$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = settingsModalInteractor$updateContentWithImages$1.label;
        if (i != 0) {
        }
        list2 = (List) obj3;
        do {
            r0Var = this.c;
            value = r0Var.getValue();
        } while (!r0Var.k(value, oar0.a((oar0) value, null, null, list2, null, 11)));
        return zy11.a;
    }

    public final Object f(z9r0 z9r0Var, ThemeType themeType, Continuation continuation) {
        return bvf0.n(new SettingsModalInteractor$updateState$2(this, z9r0Var, themeType, null), continuation);
    }
}
