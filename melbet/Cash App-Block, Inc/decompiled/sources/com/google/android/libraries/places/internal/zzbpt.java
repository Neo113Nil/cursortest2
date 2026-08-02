package com.google.android.libraries.places.internal;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public abstract class zzbpt {
    public static final zzbpu zza;

    static {
        zzbpu zzbugVar;
        AtomicReference atomicReference = new AtomicReference();
        try {
            zzbugVar = (zzbpu) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(zzbpu.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            zzbugVar = new zzbug();
        } catch (Exception e2) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Storage override failed to initialize", (Throwable) e2);
            return;
        }
        zza = zzbugVar;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            zzbpv.zza.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
