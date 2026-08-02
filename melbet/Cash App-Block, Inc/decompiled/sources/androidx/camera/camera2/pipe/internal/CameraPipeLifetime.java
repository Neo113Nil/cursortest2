package androidx.camera.camera2.pipe.internal;

import android.util.Log;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.Job;

/* loaded from: classes3.dex */
public final class CameraPipeLifetime {
    public final Object cameraLock;
    public final Job cameraPipeJob;
    public final ArrayList cameraShutdownActions;
    public final Object scopeLock;
    public final ArrayList scopeShutdownActions;
    public final Object threadLock;
    public final ArrayList threadShutdownActions;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ShutdownType {
        public static final /* synthetic */ ShutdownType[] $VALUES;
        public static final ShutdownType CAMERA;
        public static final ShutdownType SCOPE;
        public static final ShutdownType THREAD;

        static {
            ShutdownType shutdownType = new ShutdownType("CAMERA", 0);
            CAMERA = shutdownType;
            ShutdownType shutdownType2 = new ShutdownType("SCOPE", 1);
            SCOPE = shutdownType2;
            ShutdownType shutdownType3 = new ShutdownType("THREAD", 2);
            THREAD = shutdownType3;
            $VALUES = new ShutdownType[]{shutdownType, shutdownType2, shutdownType3};
        }

        public static ShutdownType valueOf(String str) {
            return (ShutdownType) Enum.valueOf(ShutdownType.class, str);
        }

        public static ShutdownType[] values() {
            return (ShutdownType[]) $VALUES.clone();
        }
    }

    public CameraPipeLifetime(Job job) {
        job.getClass();
        this.cameraPipeJob = job;
        this.cameraLock = new Object();
        this.cameraShutdownActions = new ArrayList();
        this.scopeLock = new Object();
        this.scopeShutdownActions = new ArrayList();
        this.threadLock = new Object();
        this.threadShutdownActions = new ArrayList();
    }

    public final void addShutdownAction(ShutdownType shutdownType, Runnable runnable) {
        boolean add;
        int ordinal = shutdownType.ordinal();
        if (ordinal == 0) {
            synchronized (this.cameraLock) {
                add = this.cameraShutdownActions.add(runnable);
            }
        } else if (ordinal == 1) {
            synchronized (this.scopeLock) {
                add = this.scopeShutdownActions.add(runnable);
            }
        } else if (ordinal != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        } else {
            synchronized (this.threadLock) {
                add = this.threadShutdownActions.add(runnable);
            }
        }
        if (add) {
            return;
        }
        Log.e("CXCP", "CameraPipeLifetime already shut down. This is unexpected. Executing " + shutdownType + " shutdown action immediately...");
        runnable.run();
    }

    public final void shutdown() {
        synchronized (this.cameraLock) {
            Log.d("CXCP", "Shutting down cameras...");
            Iterator it = this.cameraShutdownActions.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        synchronized (this.scopeLock) {
            try {
                Log.d("CXCP", "Shutting down scopes...");
                Iterator it2 = this.scopeShutdownActions.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.threadLock) {
            Log.d("CXCP", "Shutting down threads...");
            Iterator it3 = this.threadShutdownActions.iterator();
            while (it3.hasNext()) {
                ((Runnable) it3.next()).run();
            }
        }
    }
}
