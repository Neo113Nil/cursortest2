package ru.yandex.taxi.preorder.source;

import android.widget.ImageView;
import android.widget.ViewSwitcher;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.SourcePointPinAppearanceProcessor$processOverlayImage$1$1", f = "SourcePointPinAppearanceProcessor.kt", l = {157}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SourcePointPinAppearanceProcessor$processOverlayImage$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isClearForced;
    final /* synthetic */ Ref$ObjectRef<String> $newPinOverlayImageTag;
    final /* synthetic */ ImageView $nextView;
    final /* synthetic */ ViewSwitcher $overlayImageView;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcePointPinAppearanceProcessor$processOverlayImage$1$1(j jVar, ImageView imageView, Ref$ObjectRef ref$ObjectRef, ViewSwitcher viewSwitcher, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
        this.$nextView = imageView;
        this.$newPinOverlayImageTag = ref$ObjectRef;
        this.$overlayImageView = viewSwitcher;
        this.$isClearForced = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SourcePointPinAppearanceProcessor$processOverlayImage$1$1(this.this$0, this.$nextView, this.$newPinOverlayImageTag, this.$overlayImageView, this.$isClearForced, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SourcePointPinAppearanceProcessor$processOverlayImage$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        j jVar;
        boolean z;
        ViewSwitcher viewSwitcher;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                jVar = this.this$0;
                ImageView imageView = this.$nextView;
                Ref$ObjectRef<String> ref$ObjectRef = this.$newPinOverlayImageTag;
                ViewSwitcher viewSwitcher2 = this.$overlayImageView;
                boolean z2 = this.$isClearForced;
                try {
                    String str = ref$ObjectRef.element;
                    this.L$0 = viewSwitcher2;
                    this.L$1 = jVar;
                    this.Z$0 = z2;
                    this.label = 1;
                    if (j.a(jVar, imageView, str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    viewSwitcher = viewSwitcher2;
                    z = z2;
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                    jst.e.k(th, "Invalid pin overlay tag");
                    jVar.b(z);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = this.Z$0;
                jVar = (j) this.L$1;
                viewSwitcher = (ViewSwitcher) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    jst.e.k(th, "Invalid pin overlay tag");
                    jVar.b(z);
                    return zy11.a;
                }
            }
            viewSwitcher.showNext();
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
