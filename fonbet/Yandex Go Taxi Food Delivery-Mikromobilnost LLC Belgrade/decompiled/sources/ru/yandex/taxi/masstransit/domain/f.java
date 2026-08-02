package ru.yandex.taxi.masstransit.domain;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import defpackage.avj0;
import defpackage.b64;
import defpackage.fc30;
import defpackage.g8e;
import defpackage.g92;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.obm;
import defpackage.pwy0;
import defpackage.q2h0;
import defpackage.sjh;
import defpackage.su30;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vng;
import defpackage.zuj0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public final class f {
    public final ru.yandex.taxi.widget.utils.e a;
    public final pwy0 b;
    public final tt2 c;
    public final zuj0 d;
    public final ru.yandex.taxi.am.g e;

    public f(ru.yandex.taxi.widget.utils.e eVar, pwy0 pwy0Var, tt2 tt2Var, zuj0 zuj0Var, ru.yandex.taxi.am.g gVar) {
        this.a = eVar;
        this.b = pwy0Var;
        this.c = tt2Var;
        this.d = zuj0Var;
        this.e = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, String str, ThemeType themeType, ContinuationImpl continuationImpl) {
        MtAddressIconsInteractor$sourceIcon$1 mtAddressIconsInteractor$sourceIcon$1;
        int i;
        obm obmVar;
        fVar.getClass();
        zuj0 zuj0Var = fVar.d;
        if (continuationImpl instanceof MtAddressIconsInteractor$sourceIcon$1) {
            mtAddressIconsInteractor$sourceIcon$1 = (MtAddressIconsInteractor$sourceIcon$1) continuationImpl;
            int i2 = mtAddressIconsInteractor$sourceIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtAddressIconsInteractor$sourceIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtAddressIconsInteractor$sourceIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtAddressIconsInteractor$sourceIcon$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str == null || str.length() == 0) {
                        String j = b64.j(themeType.name(), "_source_default");
                        Drawable t = vng.t(q2h0.ic_transport_source, ((avj0) zuj0Var).a);
                        if (t != null) {
                            return new obm(j, t);
                        }
                        return null;
                    }
                    ru.yandex.taxi.widget.utils.e eVar = fVar.a;
                    mtAddressIconsInteractor$sourceIcon$1.L$0 = str;
                    mtAddressIconsInteractor$sourceIcon$1.L$1 = themeType;
                    mtAddressIconsInteractor$sourceIcon$1.label = 1;
                    obj = ru.yandex.taxi.widget.utils.e.f(eVar, str, null, mtAddressIconsInteractor$sourceIcon$1, 6);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    themeType = (ThemeType) mtAddressIconsInteractor$sourceIcon$1.L$1;
                    str = (String) mtAddressIconsInteractor$sourceIcon$1.L$0;
                    kotlin.b.b(obj);
                }
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                obmVar = bitmapDrawable == null ? new obm(g8e.p(themeType.name(), "_", str), bitmapDrawable) : null;
                if (obmVar == null) {
                    return obmVar;
                }
                String j2 = b64.j(themeType.name(), "_source_default");
                Drawable t2 = vng.t(q2h0.ic_transport_source, ((avj0) zuj0Var).a);
                if (t2 != null) {
                    return new obm(j2, t2);
                }
                return null;
            }
        }
        mtAddressIconsInteractor$sourceIcon$1 = new MtAddressIconsInteractor$sourceIcon$1(fVar, continuationImpl);
        Object obj2 = mtAddressIconsInteractor$sourceIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtAddressIconsInteractor$sourceIcon$1.label;
        if (i != 0) {
        }
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj2;
        if (bitmapDrawable2 == null) {
        }
        if (obmVar == null) {
        }
    }

    public final tpr b(String str) {
        tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.I(this.b.a(), new MtAddressIconsInteractor$iconsFlow$1(this, str, null)));
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(t, mdh.b);
    }

    public final tpr c(su30 su30Var) {
        return su30Var == null ? new g92(2, new fc30(null, null, null)) : b(su30Var.g.a.e);
    }
}
