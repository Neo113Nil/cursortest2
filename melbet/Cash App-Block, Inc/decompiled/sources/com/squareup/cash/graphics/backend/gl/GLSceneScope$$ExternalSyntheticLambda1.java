package com.squareup.cash.graphics.backend.gl;

import android.opengl.Matrix;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.StateListIterator;
import androidx.compose.ui.unit.IntSize;
import androidx.paging.CachedPagingDataKt$cachedIn$4;
import com.squareup.cash.graphics.backend.engine.LightStateImpl;
import com.squareup.cash.graphics.backend.math.Matrix4;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class GLSceneScope$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ GLSceneScope f$0;

    public /* synthetic */ GLSceneScope$$ExternalSyntheticLambda1(GLSceneScope gLSceneScope, int i) {
        this.$r8$classId = i;
        this.f$0 = gLSceneScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object[] objArr = 0;
        Continuation continuation = null;
        GLSceneScope gLSceneScope = this.f$0;
        switch (i) {
            case 0:
                long j = ((IntSize) gLSceneScope._screenSize.getValue()).packedValue;
                if (IntSize.m1055equalsimpl0(j, 0L)) {
                    return new Matrix4();
                }
                float f = (int) (j >> 32);
                float f2 = (int) (j & BodyPartID.bodyIdMax);
                float max = Math.max(f, f2);
                float f3 = f / max;
                float f4 = f2 / max;
                Matrix4 matrix4 = new Matrix4();
                gLSceneScope.cameraState.getClass();
                Matrix.orthoM(matrix4.matrix, 0, (-f3) / 2.0f, f3 / 2.0f, (-f4) / 2.0f, f4 / 2.0f, 0.1f, 20.0f);
                return matrix4;
            case 1:
                return Boolean.valueOf(gLSceneScope._windowSurface.getValue() != null);
            case 2:
                CoroutineScope coroutineScope = gLSceneScope.glScope;
                if (coroutineScope != null) {
                    JobKt.launch$default(coroutineScope, null, null, new CachedPagingDataKt$cachedIn$4(2, null, 9), 3);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("glScope");
                throw null;
            case 3:
                SnapshotStateList snapshotStateList = gLSceneScope._lights;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(snapshotStateList, 10));
                ListIterator listIterator = snapshotStateList.listIterator();
                while (true) {
                    StateListIterator stateListIterator = (StateListIterator) listIterator;
                    if (!stateListIterator.hasNext()) {
                        return arrayList;
                    }
                    LightStateImpl lightStateImpl = (LightStateImpl) stateListIterator.next();
                    arrayList.add(new Pair(lightStateImpl.lightRGB.getValue(), lightStateImpl.entityState.getPosition().getValue()));
                }
            case 4:
                CoroutineScope coroutineScope2 = gLSceneScope.glScope;
                if (coroutineScope2 != null) {
                    JobKt.launch$default(coroutineScope2, null, null, new GLSceneScope$FrameRenderer$6$1$1(gLSceneScope, continuation, objArr == true ? 1 : 0), 3);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("glScope");
                throw null;
            case 5:
                return (IntSize) gLSceneScope._screenSize.getValue();
            case 6:
                Boolean bool = (Boolean) gLSceneScope._glAttached.getValue();
                bool.getClass();
                return bool;
            case 7:
                Boolean bool2 = (Boolean) gLSceneScope._glAttached.getValue();
                bool2.getClass();
                return bool2;
            case 8:
                Boolean bool3 = (Boolean) gLSceneScope._glAttached.getValue();
                bool3.getClass();
                return bool3;
            default:
                Boolean bool4 = (Boolean) gLSceneScope._glAttached.getValue();
                bool4.getClass();
                return bool4;
        }
    }
}
