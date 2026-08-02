package ru.yandex.taxi.design.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RotateDrawable;
import defpackage.dzg0;
import defpackage.h3y;
import defpackage.hgr0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.scc;
import defpackage.tje;
import defpackage.tt2;
import defpackage.usg0;
import defpackage.uyj;
import defpackage.xng0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class b {
    public final Context a;
    public final tt2 b;
    public final h3y c;
    public final hgr0 d;

    public b(Context context, tt2 tt2Var, h3y h3yVar) {
        this.a = context;
        this.b = tt2Var;
        this.c = h3yVar;
        this.d = new hgr0(0.0f, 0.0f, tje.x(context, 1.0f), 637534208);
    }

    public static Object e(b bVar, int i, hgr0 hgr0Var, boolean z, ContinuationImpl continuationImpl, int i2) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return bVar.d(i, hgr0Var, z, qje.t(xng0.bgMain, bVar.a), continuationImpl);
    }

    public final Object a(int i, boolean z, ContinuationImpl continuationImpl) {
        int i2 = xng0.effectShadowBottom;
        Context context = this.a;
        return e(this, i, new hgr0(0.0f, tje.w(8, context), tje.w(20, context), qje.u(context.getTheme(), i2)), z, continuationImpl, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ShadowBgRepository$controlOnMapShadows$1 shadowBgRepository$controlOnMapShadows$1;
        Object obj;
        Object obj2;
        int i;
        int i2;
        int i3;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Object[] objArr4;
        if (continuationImpl instanceof ShadowBgRepository$controlOnMapShadows$1) {
            shadowBgRepository$controlOnMapShadows$1 = (ShadowBgRepository$controlOnMapShadows$1) continuationImpl;
            int i4 = shadowBgRepository$controlOnMapShadows$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                shadowBgRepository$controlOnMapShadows$1.label = i4 - Integer.MIN_VALUE;
                ShadowBgRepository$controlOnMapShadows$1 shadowBgRepository$controlOnMapShadows$12 = shadowBgRepository$controlOnMapShadows$1;
                obj = shadowBgRepository$controlOnMapShadows$12.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = shadowBgRepository$controlOnMapShadows$12.label;
                Context context = this.a;
                int i5 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i2 = usg0.address_on_map_bg_radius;
                    Object[] objArr5 = new Drawable[2];
                    shadowBgRepository$controlOnMapShadows$12.L$0 = objArr5;
                    shadowBgRepository$controlOnMapShadows$12.L$1 = objArr5;
                    shadowBgRepository$controlOnMapShadows$12.I$0 = i2;
                    i3 = 0;
                    shadowBgRepository$controlOnMapShadows$12.I$1 = 0;
                    shadowBgRepository$controlOnMapShadows$12.label = 1;
                    obj = a(tje.r(i2, context), false, shadowBgRepository$controlOnMapShadows$12);
                    if (obj != obj2) {
                        objArr = objArr5;
                        objArr2 = objArr5;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = shadowBgRepository$controlOnMapShadows$12.I$1;
                    Object[] objArr6 = (Drawable[]) shadowBgRepository$controlOnMapShadows$12.L$1;
                    objArr3 = (Drawable[]) shadowBgRepository$controlOnMapShadows$12.L$0;
                    kotlin.b.b(obj);
                    objArr4 = objArr6;
                    objArr4[i5] = obj;
                    return scc.g(objArr3);
                }
                i3 = shadowBgRepository$controlOnMapShadows$12.I$1;
                i2 = shadowBgRepository$controlOnMapShadows$12.I$0;
                Object[] objArr7 = (Drawable[]) shadowBgRepository$controlOnMapShadows$12.L$1;
                objArr = (Drawable[]) shadowBgRepository$controlOnMapShadows$12.L$0;
                kotlin.b.b(obj);
                objArr2 = objArr7;
                objArr2[i3] = obj;
                shadowBgRepository$controlOnMapShadows$12.L$0 = objArr;
                shadowBgRepository$controlOnMapShadows$12.L$1 = objArr;
                shadowBgRepository$controlOnMapShadows$12.I$0 = i2;
                shadowBgRepository$controlOnMapShadows$12.I$1 = 1;
                shadowBgRepository$controlOnMapShadows$12.label = 2;
                obj = e(this, tje.r(i2, context), this.d, false, shadowBgRepository$controlOnMapShadows$12, 8);
                if (obj != obj2) {
                    Object[] objArr8 = objArr;
                    objArr3 = objArr8;
                    objArr4 = objArr8;
                    objArr4[i5] = obj;
                    return scc.g(objArr3);
                }
                return obj2;
            }
        }
        shadowBgRepository$controlOnMapShadows$1 = new ShadowBgRepository$controlOnMapShadows$1(this, continuationImpl);
        ShadowBgRepository$controlOnMapShadows$1 shadowBgRepository$controlOnMapShadows$122 = shadowBgRepository$controlOnMapShadows$1;
        obj = shadowBgRepository$controlOnMapShadows$122.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = shadowBgRepository$controlOnMapShadows$122.label;
        Context context2 = this.a;
        int i52 = 1;
        if (i != 0) {
        }
        objArr2[i3] = obj;
        shadowBgRepository$controlOnMapShadows$122.L$0 = objArr;
        shadowBgRepository$controlOnMapShadows$122.L$1 = objArr;
        shadowBgRepository$controlOnMapShadows$122.I$0 = i2;
        shadowBgRepository$controlOnMapShadows$122.I$1 = 1;
        shadowBgRepository$controlOnMapShadows$122.label = 2;
        obj = e(this, tje.r(i2, context2), this.d, false, shadowBgRepository$controlOnMapShadows$122, 8);
        if (obj != obj2) {
        }
        return obj2;
    }

    public final Object c(ContinuationImpl continuationImpl) {
        RotateDrawable rotateDrawable = new RotateDrawable();
        rotateDrawable.setDrawable(tje.y(dzg0.bubble_default_pointer, this.a).mutate());
        rotateDrawable.setFromDegrees(180.0f);
        rotateDrawable.setToDegrees(180.0f);
        rotateDrawable.setLevel(1);
        this.b.getClass();
        return tje.k0(uyj.a, new ShadowBgRepository$pinV2Shadows$2(this, rotateDrawable, null), continuationImpl);
    }

    public final Object d(int i, hgr0 hgr0Var, boolean z, int i2, ContinuationImpl continuationImpl) {
        this.b.getClass();
        return tje.k0(uyj.a, new ShadowBgRepository$roundRectRaw$2(this, i, hgr0Var, z, i2, null), continuationImpl);
    }

    public final Object f(int i, ContinuationImpl continuationImpl) {
        Context context = this.a;
        return e(this, tje.r(i, context), new hgr0(0.0f, tje.w(-4, context), tje.w(20, context), qje.u(context.getTheme(), xng0.effectShadowTop)), false, continuationImpl, 8);
    }

    public final Object g(int i, ContinuationImpl continuationImpl) {
        Context context = this.a;
        return e(this, tje.u(i, context), new hgr0(0.0f, tje.w(-4, context), tje.w(20, context), qje.u(context.getTheme(), xng0.effectShadowTop)), false, continuationImpl, 8);
    }
}
