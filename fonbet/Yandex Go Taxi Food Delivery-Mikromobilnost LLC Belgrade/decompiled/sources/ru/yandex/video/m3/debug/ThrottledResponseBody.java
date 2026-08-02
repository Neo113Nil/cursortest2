package ru.yandex.video.m3.debug;

import defpackage.i06;
import defpackage.i0z0;
import defpackage.jci0;
import defpackage.qq6;
import defpackage.rvj0;
import defpackage.wg10;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/debug/ThrottledResponseBody;", "Lrvj0;", "delegate", "", "bytesLimit", "<init>", "(Lrvj0;J)V", "contentLength", "()J", "Lwg10;", "contentType", "()Lwg10;", "Lqq6;", "source", "()Lqq6;", "Lrvj0;", "J", "Li0z0;", "throttler", "Li0z0;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThrottledResponseBody extends rvj0 {
    public static final int $stable = 8;
    private final long bytesLimit;
    private final rvj0 delegate;
    private final i0z0 throttler;

    public ThrottledResponseBody(rvj0 rvj0Var, long j) {
        this.delegate = rvj0Var;
        this.bytesLimit = j;
        i0z0 i0z0Var = new i0z0();
        long j2 = i0z0Var.c;
        long j3 = i0z0Var.d;
        ReentrantLock reentrantLock = i0z0Var.e;
        reentrantLock.lock();
        try {
            if (j < 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (j2 <= 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (j3 < j2) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            i0z0Var.b = j;
            i0z0Var.c = j2;
            i0z0Var.d = j3;
            i0z0Var.f.signalAll();
            reentrantLock.unlock();
            this.throttler = i0z0Var;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.rvj0
    public long contentLength() {
        return this.delegate.contentLength();
    }

    @Override // defpackage.rvj0
    public wg10 contentType() {
        return this.delegate.contentType();
    }

    @Override // defpackage.rvj0
    public qq6 source() {
        i0z0 i0z0Var = this.throttler;
        qq6 source = this.delegate.source();
        i0z0Var.getClass();
        return new jci0(new i06(source, i0z0Var));
    }
}
