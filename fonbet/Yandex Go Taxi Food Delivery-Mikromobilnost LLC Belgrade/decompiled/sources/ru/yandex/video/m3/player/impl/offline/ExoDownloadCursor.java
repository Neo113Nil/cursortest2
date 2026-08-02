package ru.yandex.video.m3.player.impl.offline;

import defpackage.u6m;
import defpackage.x6m;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/video/m3/player/impl/offline/ExoDownloadCursor;", "Lx6m;", "", "Lu6m;", "downloads", "", "currentPosition", "<init>", "(Ljava/util/List;I)V", "getDownload", "()Lu6m;", "getPosition", "()I", "position", "", "moveToPosition", "(I)Z", "Lzy11;", "close", "()V", "isClosed", "()Z", "getCount", "Ljava/util/List;", CA20Status.STATUS_USER_I, "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ExoDownloadCursor implements x6m {
    private int currentPosition;
    private final List<u6m> downloads;

    public /* synthetic */ ExoDownloadCursor(List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? -1 : i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // defpackage.x6m
    public int getCount() {
        return this.downloads.size();
    }

    @Override // defpackage.x6m
    public u6m getDownload() {
        return this.downloads.get(this.currentPosition);
    }

    @Override // defpackage.x6m
    /* renamed from: getPosition, reason: from getter */
    public int getCurrentPosition() {
        return this.currentPosition;
    }

    public boolean isAfterLast() {
        return getCount() == 0 || getCurrentPosition() == getCount();
    }

    public boolean isBeforeFirst() {
        return getCount() == 0 || getCurrentPosition() == -1;
    }

    public boolean isClosed() {
        return false;
    }

    public boolean isFirst() {
        return getCurrentPosition() == 0 && getCount() != 0;
    }

    public boolean isLast() {
        int count = getCount();
        return getCurrentPosition() == count + (-1) && count != 0;
    }

    public boolean moveToFirst() {
        return moveToPosition(0);
    }

    public boolean moveToLast() {
        return moveToPosition(getCount() - 1);
    }

    @Override // defpackage.x6m
    public boolean moveToNext() {
        return moveToPosition(getCurrentPosition() + 1);
    }

    @Override // defpackage.x6m
    public boolean moveToPosition(int position) {
        if (position < 0 || position >= this.downloads.size()) {
            return false;
        }
        this.currentPosition = position;
        return true;
    }

    public boolean moveToPrevious() {
        return moveToPosition(getCurrentPosition() - 1);
    }

    public ExoDownloadCursor(List<u6m> list, int i) {
        this.downloads = list;
        this.currentPosition = i;
    }
}
