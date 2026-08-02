package androidx.media3.ui.compose.state;

import androidx.compose.material3.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.geometry.Size;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.Player;
import androidx.media3.common.PlayerExtensionsKt;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class PresentationState {
    public Object lastPeriodUidWithTracks;
    public final ParcelableSnapshotMutableState videoSizeDp$delegate = Updater.mutableStateOf$default(null);
    public final ParcelableSnapshotMutableState coverSurface$delegate = Updater.mutableStateOf$default(Boolean.TRUE);

    static {
        MediaLibraryInfo.registerModule("media3.ui.compose");
    }

    /* renamed from: getVideoSizeDp-hgXytuQ, reason: not valid java name */
    public static Size m1154getVideoSizeDphgXytuQ(Player player) {
        if (player == null) {
            return null;
        }
        ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player;
        exoPlayerImpl.verifyApplicationThread();
        float f = exoPlayerImpl.videoSize.width;
        exoPlayerImpl.verifyApplicationThread();
        long Size = DimensionKt.Size(f, exoPlayerImpl.videoSize.height);
        if (Size.m643getWidthimpl(Size) == RecyclerView.DECELERATION_RATE || Size.m640getHeightimpl(Size) == RecyclerView.DECELERATION_RATE) {
            return null;
        }
        exoPlayerImpl.verifyApplicationThread();
        float f2 = exoPlayerImpl.videoSize.pixelWidthHeightRatio;
        double d = f2;
        if (d < 1.0d) {
            Size = Size.m638copyxjbvk4A$default(Size.m643getWidthimpl(Size) * f2, RecyclerView.DECELERATION_RATE, 2, Size);
        } else if (d > 1.0d) {
            Size = Size.m638copyxjbvk4A$default(RecyclerView.DECELERATION_RATE, Size.m640getHeightimpl(Size) / f2, 1, Size);
        }
        return new Size(Size);
    }

    public final void maybeHideSurface(Player player) {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.coverSurface$delegate;
        if (player == null) {
            ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue();
            parcelableSnapshotMutableState.setValue(true);
            return;
        }
        ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) player;
        boolean z = exoPlayerImpl.isCommandAvailable(30) && !exoPlayerImpl.getCurrentTracks().groups.isEmpty();
        if (!z) {
            parcelableSnapshotMutableState.setValue(Boolean.TRUE);
        }
        if (z) {
            if (exoPlayerImpl.isCommandAvailable(30) && exoPlayerImpl.getCurrentTracks().isTypeSelected(2)) {
                return;
            }
            parcelableSnapshotMutableState.setValue(Boolean.TRUE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object observe(ExoPlayer exoPlayer, ContinuationImpl continuationImpl) {
        PresentationState$observe$1 presentationState$observe$1;
        int i;
        try {
            if (continuationImpl instanceof PresentationState$observe$1) {
                presentationState$observe$1 = (PresentationState$observe$1) continuationImpl;
                int i2 = presentationState$observe$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    presentationState$observe$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = presentationState$observe$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = presentationState$observe$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        PresentationState presentationState = presentationState$observe$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        throw new KotlinNothingValueException();
                    }
                    SafeTrace.throwOnFailure(obj);
                    this.videoSizeDp$delegate.setValue(m1154getVideoSizeDphgXytuQ(exoPlayer));
                    maybeHideSurface(exoPlayer);
                    if (exoPlayer == null) {
                        return Unit.INSTANCE;
                    }
                    TextKt$$ExternalSyntheticLambda0 textKt$$ExternalSyntheticLambda0 = new TextKt$$ExternalSyntheticLambda0(25, this, exoPlayer);
                    presentationState$observe$1.L$0 = this;
                    presentationState$observe$1.label = 1;
                    PlayerExtensionsKt.listen(exoPlayer, textKt$$ExternalSyntheticLambda0, presentationState$observe$1);
                    return coroutineSingletons;
                }
            }
            if (i == 0) {
            }
        } catch (Throwable th) {
            getClass();
            throw th;
        }
        presentationState$observe$1 = new PresentationState$observe$1(this, continuationImpl);
        Object obj2 = presentationState$observe$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = presentationState$observe$1.label;
    }
}
