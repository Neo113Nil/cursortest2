package com.bumptech.glide.request;

/* loaded from: classes4.dex */
public final class ErrorRequestCoordinator implements RequestCoordinator, Request {
    public volatile Request error;
    public final RequestCoordinator parent;
    public volatile Request primary;
    public final Object requestLock;
    public int primaryState = 3;
    public int errorState = 3;

    public ErrorRequestCoordinator(Object obj, RequestCoordinator requestCoordinator) {
        this.requestLock = obj;
        this.parent = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.Request
    public final void begin() {
        synchronized (this.requestLock) {
            try {
                if (this.primaryState != 1) {
                    this.primaryState = 1;
                    this.primary.begin();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean canNotifyCleared(Request request) {
        boolean z;
        synchronized (this.requestLock) {
            RequestCoordinator requestCoordinator = this.parent;
            z = (requestCoordinator == null || requestCoordinator.canNotifyCleared(this)) && request.equals(this.primary);
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean canNotifyStatusChanged(Request request) {
        boolean z;
        int i;
        synchronized (this.requestLock) {
            RequestCoordinator requestCoordinator = this.parent;
            z = false;
            if (requestCoordinator == null || requestCoordinator.canNotifyStatusChanged(this)) {
                if (this.primaryState != 5 ? request.equals(this.primary) : request.equals(this.error) && ((i = this.errorState) == 4 || i == 5)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean canSetImage(Request request) {
        boolean z;
        synchronized (this.requestLock) {
            RequestCoordinator requestCoordinator = this.parent;
            z = requestCoordinator == null || requestCoordinator.canSetImage(this);
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public final void clear() {
        synchronized (this.requestLock) {
            try {
                this.primaryState = 3;
                this.primary.clear();
                if (this.errorState != 3) {
                    this.errorState = 3;
                    this.error.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
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
                z = this.primary.isAnyResourceSet() || this.error.isAnyResourceSet();
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isCleared() {
        boolean z;
        synchronized (this.requestLock) {
            try {
                z = this.primaryState == 3 && this.errorState == 3;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isComplete() {
        boolean z;
        synchronized (this.requestLock) {
            try {
                z = this.primaryState == 4 || this.errorState == 4;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isEquivalentTo(Request request) {
        if (request instanceof ErrorRequestCoordinator) {
            ErrorRequestCoordinator errorRequestCoordinator = (ErrorRequestCoordinator) request;
            if (this.primary.isEquivalentTo(errorRequestCoordinator.primary) && this.error.isEquivalentTo(errorRequestCoordinator.error)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isRunning() {
        boolean z;
        synchronized (this.requestLock) {
            try {
                z = true;
                if (this.primaryState != 1 && this.errorState != 1) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void onRequestFailed(Request request) {
        synchronized (this.requestLock) {
            try {
                if (request.equals(this.error)) {
                    this.errorState = 5;
                    RequestCoordinator requestCoordinator = this.parent;
                    if (requestCoordinator != null) {
                        requestCoordinator.onRequestFailed(this);
                    }
                    return;
                }
                this.primaryState = 5;
                if (this.errorState != 1) {
                    this.errorState = 1;
                    this.error.begin();
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
                if (request.equals(this.primary)) {
                    this.primaryState = 4;
                } else if (request.equals(this.error)) {
                    this.errorState = 4;
                }
                RequestCoordinator requestCoordinator = this.parent;
                if (requestCoordinator != null) {
                    requestCoordinator.onRequestSuccess(this);
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
                if (this.primaryState == 1) {
                    this.primaryState = 2;
                    this.primary.pause();
                }
                if (this.errorState == 1) {
                    this.errorState = 2;
                    this.error.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
