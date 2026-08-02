package ru.yandex.taxi.preorder.summary.tariffpage.data.holder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import defpackage.g16;
import defpackage.ihc0;
import defpackage.k7x0;
import defpackage.lct0;
import defpackage.m7x0;
import defpackage.mct0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pqk0;
import defpackage.pzt0;
import defpackage.uqk0;
import defpackage.vqk0;
import defpackage.w511;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class d {
    public final pav a;
    public final k7x0 b;
    public final Context c;
    public pzt0 d;
    public Pair e;

    public d(pav pavVar, k7x0 k7x0Var, Context context) {
        this.a = pavVar;
        this.b = k7x0Var;
        this.c = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, String str, ContinuationImpl continuationImpl) {
        RouteTimeIconLoader$loadIcon$1 routeTimeIconLoader$loadIcon$1;
        int i;
        dVar.getClass();
        if (continuationImpl instanceof RouteTimeIconLoader$loadIcon$1) {
            routeTimeIconLoader$loadIcon$1 = (RouteTimeIconLoader$loadIcon$1) continuationImpl;
            int i2 = routeTimeIconLoader$loadIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeTimeIconLoader$loadIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeTimeIconLoader$loadIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeTimeIconLoader$loadIcon$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g16 b = dVar.a.b().b(((m7x0) dVar.b).a(str));
                    routeTimeIconLoader$loadIcon$1.L$0 = str;
                    routeTimeIconLoader$loadIcon$1.L$1 = null;
                    routeTimeIconLoader$loadIcon$1.label = 1;
                    obj = ru.yandex.taxi.utils.a.b(b, routeTimeIconLoader$loadIcon$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) routeTimeIconLoader$loadIcon$1.L$0;
                    kotlin.b.b(obj);
                }
                Bitmap bitmap = (Bitmap) obj;
                BitmapDrawable bitmapDrawable = bitmap != null ? new BitmapDrawable(dVar.c.getResources(), bitmap) : null;
                dVar.e = new Pair(str, bitmapDrawable);
                return bitmapDrawable;
            }
        }
        routeTimeIconLoader$loadIcon$1 = new RouteTimeIconLoader$loadIcon$1(dVar, continuationImpl);
        Object obj2 = routeTimeIconLoader$loadIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeTimeIconLoader$loadIcon$1.label;
        if (i != 0) {
        }
        Bitmap bitmap2 = (Bitmap) obj2;
        if (bitmap2 != null) {
        }
        dVar.e = new Pair(str, bitmapDrawable);
        return bitmapDrawable;
    }

    public static mct0 b(mct0 mct0Var, BitmapDrawable bitmapDrawable) {
        lct0 b = mct0Var.b();
        pqk0 pqk0Var = mct0Var.k;
        if (pqk0Var == null) {
            pqk0Var = ihc0.a;
        } else if (!pqk0Var.equals(ihc0.a)) {
            if (pqk0Var instanceof uqk0) {
                pqk0Var = new uqk0(bitmapDrawable);
            } else {
                if (!(pqk0Var instanceof vqk0)) {
                    w511.b();
                    return null;
                }
                vqk0 vqk0Var = (vqk0) pqk0Var;
                pqk0Var = new vqk0(bitmapDrawable, vqk0Var.b, vqk0Var.c, vqk0Var.d);
            }
        }
        b.k = pqk0Var;
        return b.a();
    }
}
