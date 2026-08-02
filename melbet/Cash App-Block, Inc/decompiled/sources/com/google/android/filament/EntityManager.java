package com.google.android.filament;

/* loaded from: classes6.dex */
public class EntityManager {
    public final long mNativeObject;

    public abstract class Holder {
        public static final EntityManager INSTANCE = new EntityManager();
    }

    public EntityManager() {
        this.mNativeObject = nGetEntityManager();
    }

    private static native int nCreate(long j);

    private static native void nDestroy(long j, int i);

    private static native long nGetEntityManager();

    public final int create() {
        return nCreate(this.mNativeObject);
    }

    public final void destroy(int i) {
        nDestroy(this.mNativeObject, i);
    }

    public long getNativeObject() {
        return this.mNativeObject;
    }

    public EntityManager(long j) {
        nGetEntityManager();
        this.mNativeObject = j;
    }
}
