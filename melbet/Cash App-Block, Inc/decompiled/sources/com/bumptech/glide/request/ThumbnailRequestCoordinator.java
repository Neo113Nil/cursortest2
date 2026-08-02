package com.bumptech.glide.request;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;

/* loaded from: classes4.dex */
public final class ThumbnailRequestCoordinator implements RequestCoordinator, Request {
    public volatile SingleRequest full;
    public boolean isRunningDuringBegin;
    public final RequestCoordinator parent;
    public final Object requestLock;
    public volatile Request thumb;
    public int fullState = 3;
    public int thumbState = 3;

    public ThumbnailRequestCoordinator(Object obj, RequestCoordinator requestCoordinator) {
        this.requestLock = obj;
        this.parent = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.Request
    public final void begin() {
        synchronized (this.requestLock) {
            try {
                this.isRunningDuringBegin = true;
                try {
                    if (this.fullState != 4 && this.thumbState != 1) {
                        this.thumbState = 1;
                        this.thumb.begin();
                    }
                    if (this.isRunningDuringBegin && this.fullState != 1) {
                        this.fullState = 1;
                        this.full.begin();
                    }
                    this.isRunningDuringBegin = false;
                } catch (Throwable th) {
                    this.isRunningDuringBegin = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean canNotifyCleared(Request request) {
        boolean z;
        synchronized (this.requestLock) {
            try {
                RequestCoordinator requestCoordinator = this.parent;
                z = (requestCoordinator == null || requestCoordinator.canNotifyCleared(this)) && request.equals(this.full) && this.fullState != 2;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean canNotifyStatusChanged(Request request) {
        boolean z;
        synchronized (this.requestLock) {
            try {
                RequestCoordinator requestCoordinator = this.parent;
                z = (requestCoordinator == null || requestCoordinator.canNotifyStatusChanged(this)) && request.equals(this.full) && !isAnyResourceSet();
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean canSetImage(Request request) {
        boolean z;
        synchronized (this.requestLock) {
            try {
                RequestCoordinator requestCoordinator = this.parent;
                z = (requestCoordinator == null || requestCoordinator.canSetImage(this)) && (request.equals(this.full) || this.fullState != 4);
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public final void clear() {
        synchronized (this.requestLock) {
            this.isRunningDuringBegin = false;
            this.fullState = 3;
            this.thumbState = 3;
            this.thumb.clear();
            this.full.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.bumptech.glide.request.RequestCoordinator] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // com.bumptech.glide.request.RequestCoordinator
    public final RequestCoordinator getRoot() {
        ?? r2;
        synchronized (this.requestLock) {
            try {
                RequestCoordinator requestCoordinator = this.parent;
                this = this;
                if (requestCoordinator != null) {
                    r2 = requestCoordinator.getRoot();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r2;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.Request
    public final boolean isAnyResourceSet() {
        boolean z;
        synchronized (this.requestLock) {
            try {
                z = this.thumb.isAnyResourceSet() || this.full.isAnyResourceSet();
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isCleared() {
        boolean z;
        synchronized (this.requestLock) {
            z = this.fullState == 3;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isComplete() {
        boolean z;
        synchronized (this.requestLock) {
            z = this.fullState == 4;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isEquivalentTo(Request request) {
        if (!(request instanceof ThumbnailRequestCoordinator)) {
            return false;
        }
        ThumbnailRequestCoordinator thumbnailRequestCoordinator = (ThumbnailRequestCoordinator) request;
        if (this.full == null) {
            if (thumbnailRequestCoordinator.full != null) {
                return false;
            }
        } else if (!this.full.isEquivalentTo(thumbnailRequestCoordinator.full)) {
            return false;
        }
        return this.thumb == null ? thumbnailRequestCoordinator.thumb == null : this.thumb.isEquivalentTo(thumbnailRequestCoordinator.thumb);
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isRunning() {
        boolean z;
        synchronized (this.requestLock) {
            z = true;
            if (this.fullState != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void onRequestFailed(Request request) {
        synchronized (this.requestLock) {
            try {
                if (!request.equals(this.full)) {
                    this.thumbState = 5;
                    return;
                }
                this.fullState = 5;
                RequestCoordinator requestCoordinator = this.parent;
                if (requestCoordinator != null) {
                    requestCoordinator.onRequestFailed(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void onRequestSuccess(Request request) {
        synchronized (this.requestLock) {
            try {
                if (request.equals(this.thumb)) {
                    this.thumbState = 4;
                    return;
                }
                this.fullState = 4;
                RequestCoordinator requestCoordinator = this.parent;
                if (requestCoordinator != null) {
                    requestCoordinator.onRequestSuccess(this);
                }
                if (!Thread$State$EnumUnboxingLocalUtility.getIsComplete(this.thumbState)) {
                    this.thumb.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public final void pause() {
        synchronized (this.requestLock) {
            try {
                if (!Thread$State$EnumUnboxingLocalUtility.getIsComplete(this.thumbState)) {
                    this.thumbState = 2;
                    this.thumb.pause();
                }
                if (!Thread$State$EnumUnboxingLocalUtility.getIsComplete(this.fullState)) {
                    this.fullState = 2;
                    this.full.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
