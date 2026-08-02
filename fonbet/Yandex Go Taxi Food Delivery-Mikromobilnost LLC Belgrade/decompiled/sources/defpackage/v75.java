package defpackage;

import androidx.media3.exoplayer.f;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class v75 implements zxc0 {
    public final z8z0 a = new z8z0();

    public final void a(int i) {
        b(false, -1, -9223372036854775807L);
    }

    @Override // defpackage.zxc0
    public final void addMediaItem(int i, fe10 fe10Var) {
        ((f) this).addMediaItems(i, ImmutableList.r(fe10Var));
    }

    @Override // defpackage.zxc0
    public final void addMediaItems(List list) {
        ((f) this).addMediaItems(Integer.MAX_VALUE, list);
    }

    public abstract void b(boolean z, int i, long j);

    public final void c(int i, long j) {
        f fVar = (f) this;
        long currentPosition = fVar.getCurrentPosition() + j;
        long duration = fVar.getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        b(false, fVar.getCurrentMediaItemIndex(), Math.max(currentPosition, 0L));
    }

    @Override // defpackage.zxc0
    public final boolean canAdvertiseSession() {
        return true;
    }

    @Override // defpackage.zxc0
    public final void clearMediaItems() {
        ((f) this).removeMediaItems(0, Integer.MAX_VALUE);
    }

    public final void d(int i) {
        int previousMediaItemIndex = getPreviousMediaItemIndex();
        if (previousMediaItemIndex == -1) {
            a(i);
            return;
        }
        f fVar = (f) this;
        if (previousMediaItemIndex == fVar.getCurrentMediaItemIndex()) {
            b(true, fVar.getCurrentMediaItemIndex(), -9223372036854775807L);
        } else {
            b(false, previousMediaItemIndex, -9223372036854775807L);
        }
    }

    @Override // defpackage.zxc0
    public final int getBufferedPercentage() {
        f fVar = (f) this;
        long bufferedPosition = fVar.getBufferedPosition();
        long duration = fVar.getDuration();
        if (bufferedPosition == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return tw21.i((int) ((bufferedPosition * 100) / duration), 0, 100);
    }

    @Override // defpackage.zxc0
    public final long getContentDuration() {
        f fVar = (f) this;
        a9z0 currentTimeline = fVar.getCurrentTimeline();
        if (currentTimeline.q()) {
            return -9223372036854775807L;
        }
        return tw21.l0(currentTimeline.n(fVar.getCurrentMediaItemIndex(), this.a, 0L).l);
    }

    @Override // defpackage.zxc0
    public final long getCurrentLiveOffset() {
        f fVar = (f) this;
        a9z0 currentTimeline = fVar.getCurrentTimeline();
        if (currentTimeline.q()) {
            return -9223372036854775807L;
        }
        int currentMediaItemIndex = fVar.getCurrentMediaItemIndex();
        z8z0 z8z0Var = this.a;
        if (currentTimeline.n(currentMediaItemIndex, z8z0Var, 0L).e == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (tw21.E(z8z0Var.f) - z8z0Var.e) - fVar.getContentPosition();
    }

    @Override // defpackage.zxc0
    public final Object getCurrentManifest() {
        f fVar = (f) this;
        a9z0 currentTimeline = fVar.getCurrentTimeline();
        if (currentTimeline.q()) {
            return null;
        }
        return currentTimeline.n(fVar.getCurrentMediaItemIndex(), this.a, 0L).c;
    }

    @Override // defpackage.zxc0
    public final fe10 getCurrentMediaItem() {
        f fVar = (f) this;
        a9z0 currentTimeline = fVar.getCurrentTimeline();
        if (currentTimeline.q()) {
            return null;
        }
        return currentTimeline.n(fVar.getCurrentMediaItemIndex(), this.a, 0L).b;
    }

    @Override // defpackage.zxc0
    public final int getCurrentWindowIndex() {
        return ((f) this).getCurrentMediaItemIndex();
    }

    @Override // defpackage.zxc0
    public final fe10 getMediaItemAt(int i) {
        return ((f) this).getCurrentTimeline().n(i, this.a, 0L).b;
    }

    @Override // defpackage.zxc0
    public final int getMediaItemCount() {
        return ((f) this).getCurrentTimeline().p();
    }

    @Override // defpackage.zxc0
    public final int getNextMediaItemIndex() {
        f fVar = (f) this;
        a9z0 currentTimeline = fVar.getCurrentTimeline();
        if (currentTimeline.q()) {
            return -1;
        }
        int currentMediaItemIndex = fVar.getCurrentMediaItemIndex();
        fVar.F();
        int i = fVar.G;
        if (i == 1) {
            i = 0;
        }
        fVar.F();
        return currentTimeline.e(currentMediaItemIndex, i, fVar.H);
    }

    @Override // defpackage.zxc0
    public final int getNextWindowIndex() {
        return getNextMediaItemIndex();
    }

    @Override // defpackage.zxc0
    public final int getPreviousMediaItemIndex() {
        f fVar = (f) this;
        a9z0 currentTimeline = fVar.getCurrentTimeline();
        if (currentTimeline.q()) {
            return -1;
        }
        int currentMediaItemIndex = fVar.getCurrentMediaItemIndex();
        fVar.F();
        int i = fVar.G;
        if (i == 1) {
            i = 0;
        }
        fVar.F();
        return currentTimeline.l(currentMediaItemIndex, i, fVar.H);
    }

    @Override // defpackage.zxc0
    public final int getPreviousWindowIndex() {
        return getPreviousMediaItemIndex();
    }

    @Override // defpackage.zxc0
    public final boolean hasNext() {
        return hasNextMediaItem();
    }

    @Override // defpackage.zxc0
    public final boolean hasNextMediaItem() {
        return getNextMediaItemIndex() != -1;
    }

    @Override // defpackage.zxc0
    public final boolean hasNextWindow() {
        return hasNextMediaItem();
    }

    @Override // defpackage.zxc0
    public final boolean hasPreviousMediaItem() {
        return getPreviousMediaItemIndex() != -1;
    }

    @Override // defpackage.zxc0
    public final boolean isCommandAvailable(int i) {
        f fVar = (f) this;
        fVar.F();
        return fVar.Q.a.a.get(i);
    }

    @Override // defpackage.zxc0
    public final boolean isCurrentMediaItemDynamic() {
        f fVar = (f) this;
        a9z0 currentTimeline = fVar.getCurrentTimeline();
        return !currentTimeline.q() && currentTimeline.n(fVar.getCurrentMediaItemIndex(), this.a, 0L).h;
    }

    @Override // defpackage.zxc0
    public final boolean isCurrentMediaItemLive() {
        f fVar = (f) this;
        a9z0 currentTimeline = fVar.getCurrentTimeline();
        return !currentTimeline.q() && currentTimeline.n(fVar.getCurrentMediaItemIndex(), this.a, 0L).b();
    }

    @Override // defpackage.zxc0
    public final boolean isCurrentMediaItemSeekable() {
        f fVar = (f) this;
        a9z0 currentTimeline = fVar.getCurrentTimeline();
        return !currentTimeline.q() && currentTimeline.n(fVar.getCurrentMediaItemIndex(), this.a, 0L).g;
    }

    @Override // defpackage.zxc0
    public final boolean isCurrentWindowDynamic() {
        return isCurrentMediaItemDynamic();
    }

    @Override // defpackage.zxc0
    public final boolean isCurrentWindowLive() {
        return isCurrentMediaItemLive();
    }

    @Override // defpackage.zxc0
    public final boolean isCurrentWindowSeekable() {
        return isCurrentMediaItemSeekable();
    }

    @Override // defpackage.zxc0
    public final boolean isPlaying() {
        f fVar = (f) this;
        return fVar.getPlaybackState() == 3 && fVar.getPlayWhenReady() && fVar.getPlaybackSuppressionReason() == 0;
    }

    @Override // defpackage.zxc0
    public final void moveMediaItem(int i, int i2) {
        if (i != i2) {
            ((f) this).moveMediaItems(i, i + 1, i2);
        }
    }

    @Override // defpackage.zxc0
    public final void next() {
        seekToNextMediaItem();
    }

    @Override // defpackage.zxc0
    public final void pause() {
        ((f) this).setPlayWhenReady(false);
    }

    @Override // defpackage.zxc0
    public final void play() {
        ((f) this).setPlayWhenReady(true);
    }

    @Override // defpackage.zxc0
    public final void removeMediaItem(int i) {
        ((f) this).removeMediaItems(i, i + 1);
    }

    public final void replaceMediaItem(int i, fe10 fe10Var) {
        ((f) this).replaceMediaItems(i, i + 1, ImmutableList.r(fe10Var));
    }

    @Override // defpackage.zxc0
    public final void seekBack() {
        f fVar = (f) this;
        fVar.F();
        c(11, -fVar.v);
    }

    @Override // defpackage.zxc0
    public final void seekForward() {
        f fVar = (f) this;
        fVar.F();
        c(12, fVar.w);
    }

    @Override // defpackage.zxc0
    public final void seekTo(long j) {
        b(false, ((f) this).getCurrentMediaItemIndex(), j);
    }

    @Override // defpackage.zxc0
    public final void seekToDefaultPosition() {
        b(false, ((f) this).getCurrentMediaItemIndex(), -9223372036854775807L);
    }

    @Override // defpackage.zxc0
    public final void seekToNext() {
        f fVar = (f) this;
        if (fVar.getCurrentTimeline().q() || fVar.isPlayingAd()) {
            a(9);
            return;
        }
        if (!hasNextMediaItem()) {
            if (isCurrentMediaItemLive() && isCurrentMediaItemDynamic()) {
                b(false, fVar.getCurrentMediaItemIndex(), -9223372036854775807L);
                return;
            } else {
                a(9);
                return;
            }
        }
        int nextMediaItemIndex = getNextMediaItemIndex();
        if (nextMediaItemIndex == -1) {
            a(9);
        } else if (nextMediaItemIndex == fVar.getCurrentMediaItemIndex()) {
            b(true, fVar.getCurrentMediaItemIndex(), -9223372036854775807L);
        } else {
            b(false, nextMediaItemIndex, -9223372036854775807L);
        }
    }

    @Override // defpackage.zxc0
    public final void seekToNextMediaItem() {
        int nextMediaItemIndex = getNextMediaItemIndex();
        if (nextMediaItemIndex == -1) {
            a(8);
            return;
        }
        f fVar = (f) this;
        if (nextMediaItemIndex == fVar.getCurrentMediaItemIndex()) {
            b(true, fVar.getCurrentMediaItemIndex(), -9223372036854775807L);
        } else {
            b(false, nextMediaItemIndex, -9223372036854775807L);
        }
    }

    @Override // defpackage.zxc0
    public final void seekToNextWindow() {
        seekToNextMediaItem();
    }

    @Override // defpackage.zxc0
    public final void seekToPrevious() {
        f fVar = (f) this;
        if (fVar.getCurrentTimeline().q() || fVar.isPlayingAd()) {
            a(7);
            return;
        }
        boolean hasPreviousMediaItem = hasPreviousMediaItem();
        if (isCurrentMediaItemLive() && !isCurrentMediaItemSeekable()) {
            if (hasPreviousMediaItem) {
                d(7);
                return;
            } else {
                a(7);
                return;
            }
        }
        if (hasPreviousMediaItem) {
            long currentPosition = fVar.getCurrentPosition();
            fVar.F();
            if (currentPosition <= fVar.x) {
                d(7);
                return;
            }
        }
        b(false, fVar.getCurrentMediaItemIndex(), 0L);
    }

    @Override // defpackage.zxc0
    public final void seekToPreviousMediaItem() {
        d(6);
    }

    @Override // defpackage.zxc0
    public final void seekToPreviousWindow() {
        seekToPreviousMediaItem();
    }

    @Override // defpackage.zxc0
    public final void setMediaItem(fe10 fe10Var, long j) {
        ((f) this).setMediaItems(ImmutableList.r(fe10Var), 0, j);
    }

    @Override // defpackage.zxc0
    public final void setMediaItems(List list) {
        ((f) this).setMediaItems(list, true);
    }

    @Override // defpackage.zxc0
    public final void setPlaybackSpeed(float f) {
        f fVar = (f) this;
        fVar.setPlaybackParameters(fVar.getPlaybackParameters().a(f));
    }

    @Override // defpackage.zxc0
    public final void addMediaItem(fe10 fe10Var) {
        addMediaItems(ImmutableList.r(fe10Var));
    }

    @Override // defpackage.zxc0
    public final void setMediaItem(fe10 fe10Var) {
        setMediaItems(ImmutableList.r(fe10Var));
    }

    @Override // defpackage.zxc0
    public final void seekTo(int i, long j) {
        b(false, i, j);
    }

    @Override // defpackage.zxc0
    public final void setMediaItem(fe10 fe10Var, boolean z) {
        ((f) this).setMediaItems(ImmutableList.r(fe10Var), z);
    }

    @Override // defpackage.zxc0
    public final void seekToDefaultPosition(int i) {
        b(false, i, -9223372036854775807L);
    }
}
