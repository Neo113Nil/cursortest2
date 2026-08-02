package com.squareup.cash.graphics.swampgl;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
import com.squareup.cash.work.tinygraph.models.EntityType;
import com.squareup.cash.work.tinygraph.models.Membership;
import com.squareup.cash.work.tinygraph.real.RealMembershipRepository;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class EngineSurfaceTarget$destroyInternal$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ Object $androidSurfaceToRelease;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $surfaceTextureToRelease;
    public final /* synthetic */ Object $surfaceToDestroy;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EngineSurfaceTarget$destroyInternal$1(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$surfaceToDestroy = obj2;
        this.$androidSurfaceToRelease = obj3;
        this.$surfaceTextureToRelease = obj4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        Object obj = this.$surfaceTextureToRelease;
        Object obj2 = this.$androidSurfaceToRelease;
        Object obj3 = this.$surfaceToDestroy;
        Object obj4 = this.this$0;
        switch (i) {
            case 0:
                return new EngineSurfaceTarget$destroyInternal$1((EngineSurfaceTarget) obj4, (EGLSurface) obj3, (Surface) obj2, (SurfaceTexture) obj, continuation, 0);
            default:
                return new EngineSurfaceTarget$destroyInternal$1((RealMembershipRepository) obj4, (EntityType) obj3, (EntityType) obj2, (String) obj, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((EngineSurfaceTarget$destroyInternal$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$surfaceTextureToRelease;
        Object obj3 = this.$androidSurfaceToRelease;
        Object obj4 = this.$surfaceToDestroy;
        Object obj5 = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Engine engine = ((EngineSurfaceTarget) obj5).engine;
                engine.restoreSurfacelessCurrent();
                EGLSurface eGLSurface = (EGLSurface) obj4;
                if (eGLSurface != null) {
                    if (eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                        eGLSurface = null;
                    }
                    if (eGLSurface != null) {
                        EGL14.eglDestroySurface(engine.eglDisplay, eGLSurface);
                        Timber.Forest forest = Timber.Forest;
                        forest.tag("EngineSurfaceTarget");
                        forest.d("EGL surface destroyed", new Object[0]);
                    }
                }
                Surface surface = (Surface) obj3;
                if (surface != null) {
                    surface.release();
                }
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj2;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                Timber.Forest forest2 = Timber.Forest;
                forest2.tag("EngineSurfaceTarget");
                forest2.d("Surface destroyed", new Object[0]);
                return Unit.INSTANCE;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                EntityType entityType = (EntityType) obj4;
                EntityType entityType2 = (EntityType) obj3;
                String str = (String) obj2;
                ArrayList all = ((RealMembershipRepository) obj5).dao.getAll();
                ArrayList arrayList = new ArrayList();
                Iterator it = all.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Membership membership = (Membership) next;
                    if (entityType == null || membership.fromReference.entityType == entityType) {
                        if (entityType2 == null || membership.toReference.entityType == entityType2) {
                            if (str == null || Intrinsics.areEqual(membership.toReference.id, str)) {
                                arrayList.add(next);
                            }
                        }
                    }
                }
                return arrayList;
        }
    }
}
