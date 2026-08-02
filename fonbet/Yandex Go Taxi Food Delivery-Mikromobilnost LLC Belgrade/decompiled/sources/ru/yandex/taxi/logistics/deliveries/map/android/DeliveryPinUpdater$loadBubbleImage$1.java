package ru.yandex.taxi.logistics.deliveries.map.android;

import android.graphics.Bitmap;
import com.yandex.runtime.image.ImageProvider;
import defpackage.f4c0;
import defpackage.g16;
import defpackage.jst;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tji;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.deliveries.map.android.DeliveryPinUpdater$loadBubbleImage$1", f = "DeliveryPinUpdater.kt", l = {109}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryPinUpdater$loadBubbleImage$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $imageTag;
    final /* synthetic */ f4c0 $placemark;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ String $title;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ tji this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryPinUpdater$loadBubbleImage$1(tji tjiVar, String str, String str2, String str3, f4c0 f4c0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tjiVar;
        this.$imageTag = str;
        this.$title = str2;
        this.$subtitle = str3;
        this.$placemark = f4c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeliveryPinUpdater$loadBubbleImage$1(this.this$0, this.$imageTag, this.$title, this.$subtitle, this.$placemark, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryPinUpdater$loadBubbleImage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        ImageProvider a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Bitmap bitmap = null;
        try {
            if (i == 0) {
                b.b(obj);
                String a2 = ((m7x0) this.this$0.b).a(this.$imageTag);
                tji tjiVar = this.this$0;
                String str2 = this.$imageTag;
                try {
                    g16 b = tjiVar.c.b().b(a2);
                    this.L$0 = null;
                    this.L$1 = str2;
                    this.label = 1;
                    obj = b.a(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = str2;
                } catch (Throwable th) {
                    th = th;
                    str = str2;
                    jst.e.k(th, String.format("Failed to load image with tag %s", Arrays.copyOf(new Object[]{str}, 1)));
                    a = ((ru.yandex.taxi.logistics.deliveries.map.data.a) this.this$0.a).a(bitmap, this.$title, this.$subtitle);
                    if (a != null) {
                    }
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) this.L$1;
                try {
                    b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    jst.e.k(th, String.format("Failed to load image with tag %s", Arrays.copyOf(new Object[]{str}, 1)));
                    a = ((ru.yandex.taxi.logistics.deliveries.map.data.a) this.this$0.a).a(bitmap, this.$title, this.$subtitle);
                    if (a != null) {
                    }
                    return zy11.a;
                }
            }
            bitmap = (Bitmap) obj;
            a = ((ru.yandex.taxi.logistics.deliveries.map.data.a) this.this$0.a).a(bitmap, this.$title, this.$subtitle);
            if (a != null) {
                this.$placemark.y(a);
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
