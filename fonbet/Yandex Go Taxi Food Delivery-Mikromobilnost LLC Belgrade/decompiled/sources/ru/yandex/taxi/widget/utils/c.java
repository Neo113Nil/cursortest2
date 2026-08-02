package ru.yandex.taxi.widget.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public c(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MediaInfoConverter$iconByUrlFlow$$inlined$map$1$2$1 mediaInfoConverter$iconByUrlFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MediaInfoConverter$iconByUrlFlow$$inlined$map$1$2$1) {
            mediaInfoConverter$iconByUrlFlow$$inlined$map$1$2$1 = (MediaInfoConverter$iconByUrlFlow$$inlined$map$1$2$1) continuation;
            int i2 = mediaInfoConverter$iconByUrlFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mediaInfoConverter$iconByUrlFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mediaInfoConverter$iconByUrlFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mediaInfoConverter$iconByUrlFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Bitmap bitmap = (Bitmap) obj;
                    BitmapDrawable bitmapDrawable = bitmap != null ? new BitmapDrawable(this.b.a.getResources(), bitmap) : null;
                    mediaInfoConverter$iconByUrlFlow$$inlined$map$1$2$1.L$0 = null;
                    mediaInfoConverter$iconByUrlFlow$$inlined$map$1$2$1.L$1 = null;
                    mediaInfoConverter$iconByUrlFlow$$inlined$map$1$2$1.L$2 = null;
                    mediaInfoConverter$iconByUrlFlow$$inlined$map$1$2$1.L$3 = null;
                    mediaInfoConverter$iconByUrlFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(bitmapDrawable, mediaInfoConverter$iconByUrlFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        mediaInfoConverter$iconByUrlFlow$$inlined$map$1$2$1 = new MediaInfoConverter$iconByUrlFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mediaInfoConverter$iconByUrlFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mediaInfoConverter$iconByUrlFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
