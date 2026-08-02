package ru.yandex.taxi.layers.presentation;

import com.yandex.mapkit.map.CameraPosition;
import defpackage.g6u;
import defpackage.jse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.layers.presentation.MapObjectsOverlay$onCameraChange$1", f = "MapObjectsOverlay.kt", l = {338, 344}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapObjectsOverlay$onCameraChange$1 extends SuspendLambda implements tls {
    final /* synthetic */ CameraPosition $cameraPosition;
    int label;
    final /* synthetic */ f this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.layers.presentation.MapObjectsOverlay$onCameraChange$1$1", f = "MapObjectsOverlay.kt", l = {342}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.layers.presentation.MapObjectsOverlay$onCameraChange$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ CameraPosition $cameraPosition;
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(f fVar, CameraPosition cameraPosition, Continuation continuation) {
            super(2, continuation);
            this.this$0 = fVar;
            this.$cameraPosition = cameraPosition;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$cameraPosition, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                if (!this.this$0.N.containsKey("selected_organizations_pin")) {
                    f.Jg(this.this$0, "selected_organizations_pin");
                }
                f fVar = this.this$0;
                Map map = fVar.N;
                CameraPosition cameraPosition = this.$cameraPosition;
                boolean z = fVar.R;
                this.label = 1;
                if (f.Lg(fVar, map, cameraPosition, z, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.layers.presentation.MapObjectsOverlay$onCameraChange$1$2", f = "MapObjectsOverlay.kt", l = {345}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.layers.presentation.MapObjectsOverlay$onCameraChange$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ CameraPosition $cameraPosition;
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(f fVar, CameraPosition cameraPosition, Continuation continuation) {
            super(2, continuation);
            this.this$0 = fVar;
            this.$cameraPosition = cameraPosition;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$cameraPosition, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                f fVar = this.this$0;
                Map map = fVar.N;
                CameraPosition cameraPosition = this.$cameraPosition;
                jse jseVar = fVar.G;
                g6u g6uVar = fVar.H;
                this.label = 1;
                if (a.d(map, cameraPosition, jseVar, g6uVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            f fVar2 = this.this$0;
            fVar2.Rg(fVar2.N);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectsOverlay$onCameraChange$1(f fVar, CameraPosition cameraPosition, Continuation continuation) {
        super(1, continuation);
        this.this$0 = fVar;
        this.$cameraPosition = cameraPosition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new MapObjectsOverlay$onCameraChange$1(this.this$0, this.$cameraPosition, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((MapObjectsOverlay$onCameraChange$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (defpackage.tje.k0(r1, r4, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (defpackage.tje.k0(r1, r5, r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            g6u g6uVar = fVar.H;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(fVar, this.$cameraPosition, null);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        f fVar2 = this.this$0;
        g6u g6uVar2 = fVar2.H;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(fVar2, this.$cameraPosition, null);
        this.label = 2;
    }
}
