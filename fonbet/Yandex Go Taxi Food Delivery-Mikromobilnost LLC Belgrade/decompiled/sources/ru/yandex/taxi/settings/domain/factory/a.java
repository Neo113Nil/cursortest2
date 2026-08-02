package ru.yandex.taxi.settings.domain.factory;

import defpackage.c4g0;
import defpackage.dtx;
import defpackage.e3g0;
import defpackage.i4u;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.qbr0;
import defpackage.v4r0;
import defpackage.zzs;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes6.dex */
public final class a {
    public final po21 a;
    public final e3g0 b;
    public final i4u c;

    public a(po21 po21Var, e3g0 e3g0Var, i4u i4uVar) {
        this.a = po21Var;
        this.b = e3g0Var;
        this.c = i4uVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, Set set, ContinuationImpl continuationImpl) {
        SettingsParamFactory$settingsParams$1 settingsParamFactory$settingsParams$1;
        int i;
        c4g0 a;
        Set set2;
        if (continuationImpl instanceof SettingsParamFactory$settingsParams$1) {
            settingsParamFactory$settingsParams$1 = (SettingsParamFactory$settingsParams$1) continuationImpl;
            int i2 = settingsParamFactory$settingsParams$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                settingsParamFactory$settingsParams$1.label = i2 - Integer.MIN_VALUE;
                Object obj = settingsParamFactory$settingsParams$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = settingsParamFactory$settingsParams$1.label;
                zzs zzsVar = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (z) {
                        settingsParamFactory$settingsParams$1.L$0 = set;
                        settingsParamFactory$settingsParams$1.Z$0 = z;
                        settingsParamFactory$settingsParams$1.label = 1;
                        obj = ((e) this.a).h(settingsParamFactory$settingsParams$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    a = this.b.a();
                    set2 = set;
                    if (set2 != null && !set2.isEmpty()) {
                        a = new c4g0(v4r0.h(a.b, set), a.c, a.a);
                    }
                    return new qbr0(zzsVar, a, kotlin.collections.a.N0(kotlin.collections.a.A0(((dtx) this.c.a).a(), 30)));
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                set = (Set) settingsParamFactory$settingsParams$1.L$0;
                kotlin.b.b(obj);
                zzsVar = ((mo21) obj).a();
                a = this.b.a();
                set2 = set;
                if (set2 != null) {
                    a = new c4g0(v4r0.h(a.b, set), a.c, a.a);
                }
                return new qbr0(zzsVar, a, kotlin.collections.a.N0(kotlin.collections.a.A0(((dtx) this.c.a).a(), 30)));
            }
        }
        settingsParamFactory$settingsParams$1 = new SettingsParamFactory$settingsParams$1(this, continuationImpl);
        Object obj2 = settingsParamFactory$settingsParams$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = settingsParamFactory$settingsParams$1.label;
        zzs zzsVar2 = null;
        if (i != 0) {
        }
        zzsVar2 = ((mo21) obj2).a();
        a = this.b.a();
        set2 = set;
        if (set2 != null) {
        }
        return new qbr0(zzsVar2, a, kotlin.collections.a.N0(kotlin.collections.a.A0(((dtx) this.c.a).a(), 30)));
    }
}
