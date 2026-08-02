package com.bumptech.glide.load.engine.cache;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public final class DiskCacheWriteLocker$WriteLock {
    public int interestedThreads;
    public final ReentrantLock lock = new ReentrantLock();
}
