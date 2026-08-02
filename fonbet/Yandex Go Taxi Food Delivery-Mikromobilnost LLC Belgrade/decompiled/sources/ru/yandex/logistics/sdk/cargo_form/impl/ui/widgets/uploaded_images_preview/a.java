package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.uploaded_images_preview;

import defpackage.c0k0;
import defpackage.do6;
import defpackage.nd21;
import defpackage.ny61;
import defpackage.o690;
import defpackage.od21;
import defpackage.pd21;
import defpackage.rkb0;
import defpackage.skb0;
import defpackage.tkb0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ b b;
    public final /* synthetic */ pd21 c;

    public a(vpr vprVar, b bVar, pd21 pd21Var) {
        this.a = vprVar;
        this.b = bVar;
        this.c = pd21Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UploadedImagesStateHolder$getWidgets$lambda$0$$inlined$map$1$2$1 uploadedImagesStateHolder$getWidgets$lambda$0$$inlined$map$1$2$1;
        int i;
        tkb0 skb0Var;
        if (continuation instanceof UploadedImagesStateHolder$getWidgets$lambda$0$$inlined$map$1$2$1) {
            uploadedImagesStateHolder$getWidgets$lambda$0$$inlined$map$1$2$1 = (UploadedImagesStateHolder$getWidgets$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = uploadedImagesStateHolder$getWidgets$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uploadedImagesStateHolder$getWidgets$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = uploadedImagesStateHolder$getWidgets$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = uploadedImagesStateHolder$getWidgets$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = (List) obj;
                    do6 do6Var = this.b.e;
                    do6Var.getClass();
                    pd21 pd21Var = this.c;
                    c0k0 c0k0Var = pd21Var.b;
                    int i3 = nd21.a[pd21Var.c.ordinal()];
                    if (i3 == 1) {
                        skb0Var = new skb0();
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        skb0Var = new rkb0();
                    }
                    tkb0 tkb0Var = skb0Var;
                    ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = do6Var.a;
                    o690 o690Var = pd21Var.d;
                    aVar.getClass();
                    List singletonList = Collections.singletonList(new od21(c0k0Var, list, tkb0Var, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.i(o690Var), pd21Var.e, pd21Var.a));
                    uploadedImagesStateHolder$getWidgets$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    uploadedImagesStateHolder$getWidgets$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    uploadedImagesStateHolder$getWidgets$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    uploadedImagesStateHolder$getWidgets$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    uploadedImagesStateHolder$getWidgets$lambda$0$$inlined$map$1$2$1.I$0 = 0;
                    uploadedImagesStateHolder$getWidgets$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(singletonList, uploadedImagesStateHolder$getWidgets$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        uploadedImagesStateHolder$getWidgets$lambda$0$$inlined$map$1$2$1 = new UploadedImagesStateHolder$getWidgets$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = uploadedImagesStateHolder$getWidgets$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = uploadedImagesStateHolder$getWidgets$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
