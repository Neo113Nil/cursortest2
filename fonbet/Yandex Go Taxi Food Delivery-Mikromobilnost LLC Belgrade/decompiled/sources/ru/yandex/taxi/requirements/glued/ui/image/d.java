package ru.yandex.taxi.requirements.glued.ui.image;

import android.graphics.Bitmap;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ i b;

    public d(vpr vprVar, i iVar) {
        this.a = vprVar;
        this.b = iVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ab, code lost:
    
        if (r2.emit(r6, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DefaultCarImageBinder$attach$$inlined$map$2$2$1 defaultCarImageBinder$attach$$inlined$map$2$2$1;
        int i;
        String str;
        vpr vprVar;
        String str2;
        vpr vprVar2;
        Bitmap bitmap;
        if (continuation instanceof DefaultCarImageBinder$attach$$inlined$map$2$2$1) {
            defaultCarImageBinder$attach$$inlined$map$2$2$1 = (DefaultCarImageBinder$attach$$inlined$map$2$2$1) continuation;
            int i2 = defaultCarImageBinder$attach$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultCarImageBinder$attach$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = defaultCarImageBinder$attach$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultCarImageBinder$attach$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    str = (String) obj;
                    int length = str.length();
                    vprVar = this.a;
                    if (length != 0) {
                        defaultCarImageBinder$attach$$inlined$map$2$2$1.L$0 = null;
                        defaultCarImageBinder$attach$$inlined$map$2$2$1.L$1 = null;
                        defaultCarImageBinder$attach$$inlined$map$2$2$1.L$2 = null;
                        defaultCarImageBinder$attach$$inlined$map$2$2$1.L$3 = null;
                        defaultCarImageBinder$attach$$inlined$map$2$2$1.L$4 = vprVar;
                        defaultCarImageBinder$attach$$inlined$map$2$2$1.L$5 = null;
                        defaultCarImageBinder$attach$$inlined$map$2$2$1.L$6 = null;
                        defaultCarImageBinder$attach$$inlined$map$2$2$1.L$7 = str;
                        defaultCarImageBinder$attach$$inlined$map$2$2$1.label = 1;
                        obj2 = ru.yandex.taxi.utils.a.b(this.b.a.b().b(str), defaultCarImageBinder$attach$$inlined$map$2$2$1);
                        if (obj2 != coroutineSingletons) {
                            str2 = str;
                            vprVar2 = vprVar;
                        }
                        return coroutineSingletons;
                    }
                    bitmap = null;
                    Pair pair = new Pair(str, bitmap);
                    defaultCarImageBinder$attach$$inlined$map$2$2$1.L$0 = null;
                    defaultCarImageBinder$attach$$inlined$map$2$2$1.L$1 = null;
                    defaultCarImageBinder$attach$$inlined$map$2$2$1.L$2 = null;
                    defaultCarImageBinder$attach$$inlined$map$2$2$1.L$3 = null;
                    defaultCarImageBinder$attach$$inlined$map$2$2$1.L$4 = null;
                    defaultCarImageBinder$attach$$inlined$map$2$2$1.L$5 = null;
                    defaultCarImageBinder$attach$$inlined$map$2$2$1.L$6 = null;
                    defaultCarImageBinder$attach$$inlined$map$2$2$1.L$7 = null;
                    defaultCarImageBinder$attach$$inlined$map$2$2$1.label = 2;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    str2 = (String) defaultCarImageBinder$attach$$inlined$map$2$2$1.L$7;
                    vprVar2 = (vpr) defaultCarImageBinder$attach$$inlined$map$2$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                bitmap = (Bitmap) obj2;
                vprVar = vprVar2;
                str = str2;
                Pair pair2 = new Pair(str, bitmap);
                defaultCarImageBinder$attach$$inlined$map$2$2$1.L$0 = null;
                defaultCarImageBinder$attach$$inlined$map$2$2$1.L$1 = null;
                defaultCarImageBinder$attach$$inlined$map$2$2$1.L$2 = null;
                defaultCarImageBinder$attach$$inlined$map$2$2$1.L$3 = null;
                defaultCarImageBinder$attach$$inlined$map$2$2$1.L$4 = null;
                defaultCarImageBinder$attach$$inlined$map$2$2$1.L$5 = null;
                defaultCarImageBinder$attach$$inlined$map$2$2$1.L$6 = null;
                defaultCarImageBinder$attach$$inlined$map$2$2$1.L$7 = null;
                defaultCarImageBinder$attach$$inlined$map$2$2$1.label = 2;
            }
        }
        defaultCarImageBinder$attach$$inlined$map$2$2$1 = new DefaultCarImageBinder$attach$$inlined$map$2$2$1(this, continuation);
        Object obj22 = defaultCarImageBinder$attach$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultCarImageBinder$attach$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj22;
        vprVar = vprVar2;
        str = str2;
        Pair pair22 = new Pair(str, bitmap);
        defaultCarImageBinder$attach$$inlined$map$2$2$1.L$0 = null;
        defaultCarImageBinder$attach$$inlined$map$2$2$1.L$1 = null;
        defaultCarImageBinder$attach$$inlined$map$2$2$1.L$2 = null;
        defaultCarImageBinder$attach$$inlined$map$2$2$1.L$3 = null;
        defaultCarImageBinder$attach$$inlined$map$2$2$1.L$4 = null;
        defaultCarImageBinder$attach$$inlined$map$2$2$1.L$5 = null;
        defaultCarImageBinder$attach$$inlined$map$2$2$1.L$6 = null;
        defaultCarImageBinder$attach$$inlined$map$2$2$1.L$7 = null;
        defaultCarImageBinder$attach$$inlined$map$2$2$1.label = 2;
    }
}
