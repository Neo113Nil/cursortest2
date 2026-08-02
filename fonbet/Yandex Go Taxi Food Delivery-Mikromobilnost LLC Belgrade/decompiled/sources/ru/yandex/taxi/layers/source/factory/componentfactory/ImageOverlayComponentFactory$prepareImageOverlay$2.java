package ru.yandex.taxi.layers.source.factory.componentfactory;

import android.graphics.Bitmap;
import com.yandex.go.layers.api.model.AppearanceType;
import defpackage.bxu0;
import defpackage.f0k;
import defpackage.fkp;
import defpackage.hxu0;
import defpackage.jl40;
import defpackage.jmp;
import defpackage.mcv;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vm00;
import defpackage.wls;
import defpackage.ym00;
import defpackage.zy11;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lym00;", "<anonymous>", "(Ltse;)Lym00;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.source.factory.componentfactory.ImageOverlayComponentFactory$prepareImageOverlay$2", f = "ImageOverlayComponentFactory.kt", l = {64, 65, HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ImageOverlayComponentFactory$prepareImageOverlay$2 extends SuspendLambda implements wls {
    final /* synthetic */ vm00 $animation;
    final /* synthetic */ fkp $feature;
    final /* synthetic */ mcv $overlay;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ w this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageOverlayComponentFactory$prepareImageOverlay$2(w wVar, mcv mcvVar, fkp fkpVar, vm00 vm00Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wVar;
        this.$overlay = mcvVar;
        this.$feature = fkpVar;
        this.$animation = vm00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ImageOverlayComponentFactory$prepareImageOverlay$2 imageOverlayComponentFactory$prepareImageOverlay$2 = new ImageOverlayComponentFactory$prepareImageOverlay$2(this.this$0, this.$overlay, this.$feature, this.$animation, continuation);
        imageOverlayComponentFactory$prepareImageOverlay$2.L$0 = obj;
        return imageOverlayComponentFactory$prepareImageOverlay$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ImageOverlayComponentFactory$prepareImageOverlay$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f0, code lost:
    
        if (r14 == r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0050, code lost:
    
        if (r14 == r1) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:15:0x0071, B:17:0x0075, B:53:0x005f), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096  */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.graphics.Bitmap] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        ?? r2;
        f0k f0kVar;
        hxu0 hxu0Var;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            r2 = i;
        }
        if (i == 0) {
            kotlin.b.b(obj);
            w wVar = this.this$0;
            bxu0 bxu0Var = this.$overlay.d;
            this.L$0 = tseVar;
            this.label = 1;
            obj = w.e(wVar, bxu0Var, this);
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return (ym00) obj;
            }
            ?? r22 = (Bitmap) this.L$1;
            kotlin.b.b(obj);
            i = r22;
            failure = (Bitmap) obj;
            r2 = i;
            if (failure == null) {
                failure = w.d;
                r2 = i;
            }
            if (Result.a(failure) != null) {
                failure = w.d;
            }
            Bitmap bitmap = (Bitmap) failure;
            w wVar2 = this.this$0;
            mcv mcvVar = this.$overlay;
            jmp jmpVar = this.$feature.b;
            f0kVar = jmpVar == null ? jmpVar.j : null;
            if (f0kVar != null) {
                ny61.g("Required value was null.");
                return null;
            }
            if (jl40.l(bitmap, w.d)) {
                bitmap = null;
            }
            wVar2.getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Float f = f0kVar.b;
            bxu0 bxu0Var2 = mcvVar.e;
            Float[] fArr = (bxu0Var2 == null || (hxu0Var = bxu0Var2.b) == null) ? null : hxu0Var.e;
            if (f != null && fArr != null && bitmap != null) {
                linkedHashSet.add(w.f(AppearanceType.SIMPLIFIED, bitmap, f0kVar, bxu0Var2));
            }
            linkedHashSet.add(w.f(AppearanceType.NORMAL, r2, f0kVar, mcvVar.d));
            if (linkedHashSet.isEmpty()) {
                return null;
            }
            w wVar3 = this.this$0;
            mcv mcvVar2 = this.$overlay;
            fkp fkpVar = this.$feature;
            vm00 vm00Var = this.$animation;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 3;
            obj = w.d(wVar3, mcvVar2, fkpVar, linkedHashSet, vm00Var, this);
        }
        Bitmap bitmap2 = (Bitmap) obj;
        if (bitmap2 == null) {
            bitmap2 = w.d;
        }
        ?? r23 = bitmap2;
        w wVar4 = this.this$0;
        bxu0 bxu0Var3 = this.$overlay.e;
        this.L$0 = null;
        this.L$1 = r23;
        this.L$2 = null;
        this.label = 2;
        obj = w.e(wVar4, bxu0Var3, this);
        i = r23;
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        failure = (Bitmap) obj;
        r2 = i;
        if (failure == null) {
        }
        if (Result.a(failure) != null) {
        }
        Bitmap bitmap3 = (Bitmap) failure;
        w wVar22 = this.this$0;
        mcv mcvVar3 = this.$overlay;
        jmp jmpVar2 = this.$feature.b;
        if (jmpVar2 == null) {
        }
        if (f0kVar != null) {
        }
    }
}
