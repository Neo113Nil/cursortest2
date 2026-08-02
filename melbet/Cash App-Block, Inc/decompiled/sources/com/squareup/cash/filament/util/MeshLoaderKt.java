package com.squareup.cash.filament.util;

import com.google.android.filament.Engine;
import com.google.android.filament.EntityManager;
import com.google.android.gms.internal.mlkit_vision_text_common.zzcd;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.common.collect.Sets$ImprovedAbstractSet;
import com.stripe.attestation.AttestationError;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class MeshLoaderKt {
    public static final void destroyMesh(Engine engine, Mesh mesh) {
        mesh.getClass();
        int i = mesh.renderable;
        engine.destroyEntity(i);
        engine.destroyIndexBuffer(mesh.indexBuffer);
        engine.destroyVertexBuffer(mesh.vertexBuffer);
        EntityManager.Holder.INSTANCE.destroy(i);
    }

    public static AttestationError fromException(Throwable th) {
        if (!(th instanceof StandardIntegrityException)) {
            return new AttestationError(AttestationError.ErrorType.UNKNOWN, "An unknown error occurred", th);
        }
        AttestationError.ErrorType errorType = (AttestationError.ErrorType) AttestationError.errorCodeToErrorTypeMap.get(Integer.valueOf(((StandardIntegrityException) th).mStatus.zza));
        if (errorType == null) {
            errorType = AttestationError.ErrorType.UNKNOWN;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "Integrity error occurred";
        }
        return new AttestationError(errorType, message, th);
    }

    public static boolean zzb(Sets$ImprovedAbstractSet sets$ImprovedAbstractSet, Collection collection) {
        collection.getClass();
        if (collection instanceof zzcd) {
            collection = ((zzcd) collection).zza();
        }
        boolean z = false;
        if (!(collection instanceof Set) || collection.size() <= sets$ImprovedAbstractSet.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                z |= sets$ImprovedAbstractSet.remove(it.next());
            }
            return z;
        }
        Iterator<E> it2 = sets$ImprovedAbstractSet.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }
}
