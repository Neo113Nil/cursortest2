package defpackage;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class lkh extends MediaController.Callback {
    public final /* synthetic */ int a = 1;
    public final WeakReference b;

    public lkh(zlh zlhVar) {
        this.b = new WeakReference(zlhVar);
    }

    @Override // android.media.session.MediaController.Callback
    public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
        switch (this.a) {
            case 0:
                zlh zlhVar = (zlh) this.b.get();
                if (zlhVar != null && playbackInfo != null) {
                    zlhVar.a(new rkh(playbackInfo.getPlaybackType(), hv1.a(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                    break;
                }
                break;
            default:
                if (((xph) this.b.get()) != null) {
                    playbackInfo.getPlaybackType();
                    playbackInfo.getAudioAttributes();
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                    playbackInfo.getVolumeControl();
                    playbackInfo.getMaxVolume();
                    playbackInfo.getCurrentVolume();
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onExtrasChanged(Bundle bundle) {
        switch (this.a) {
            case 0:
                nsh.g(bundle);
                zlh zlhVar = (zlh) this.b.get();
                if (zlhVar != null) {
                    zlhVar.c(bundle);
                    break;
                }
                break;
            default:
                osh.C(bundle);
                break;
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        int i = this.a;
        ioh iohVar = null;
        MediaMetadataCompat mediaMetadataCompat = null;
        WeakReference weakReference = this.b;
        switch (i) {
            case 0:
                zlh zlhVar = (zlh) weakReference.get();
                if (zlhVar != null) {
                    xy0 xy0Var = ioh.c;
                    if (mediaMetadata != null) {
                        Parcel obtain = Parcel.obtain();
                        mediaMetadata.writeToParcel(obtain, 0);
                        obtain.setDataPosition(0);
                        ioh createFromParcel = ioh.CREATOR.createFromParcel(obtain);
                        obtain.recycle();
                        createFromParcel.b = mediaMetadata;
                        iohVar = createFromParcel;
                    }
                    zlhVar.d(iohVar);
                    break;
                }
                break;
            default:
                xph xphVar = (xph) weakReference.get();
                if (xphVar != null) {
                    xy0 xy0Var2 = MediaMetadataCompat.d;
                    if (mediaMetadata != null) {
                        Parcel obtain2 = Parcel.obtain();
                        mediaMetadata.writeToParcel(obtain2, 0);
                        obtain2.setDataPosition(0);
                        MediaMetadataCompat createFromParcel2 = MediaMetadataCompat.CREATOR.createFromParcel(obtain2);
                        obtain2.recycle();
                        createFromParcel2.b = mediaMetadata;
                        mediaMetadataCompat = createFromParcel2;
                    }
                    xphVar.a(mediaMetadataCompat);
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        switch (this.a) {
            case 0:
                zlh zlhVar = (zlh) this.b.get();
                if (zlhVar != null && zlhVar.c == null) {
                    zlhVar.e(i6l.a(playbackState));
                    break;
                }
                break;
            default:
                xph xphVar = (xph) this.b.get();
                if (xphVar != null && xphVar.c == null) {
                    xphVar.b(PlaybackStateCompat.a(playbackState));
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueChanged(List list) {
        MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem;
        switch (this.a) {
            case 0:
                zlh zlhVar = (zlh) this.b.get();
                if (zlhVar != null) {
                    zlhVar.f(ksh.a(list));
                    break;
                }
                break;
            default:
                if (((xph) this.b.get()) != null && list != null) {
                    ArrayList arrayList = new ArrayList(list.size());
                    for (Object obj : list) {
                        if (obj != null) {
                            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                            mediaSessionCompat$QueueItem = new MediaSessionCompat$QueueItem(MediaDescriptionCompat.a(jsh.b(queueItem)), jsh.c(queueItem));
                        } else {
                            mediaSessionCompat$QueueItem = null;
                        }
                        arrayList.add(mediaSessionCompat$QueueItem);
                    }
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onQueueTitleChanged(CharSequence charSequence) {
        switch (this.a) {
            case 0:
                zlh zlhVar = (zlh) this.b.get();
                if (zlhVar != null) {
                    zlhVar.g(charSequence);
                    break;
                }
                break;
            default:
                break;
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionDestroyed() {
        switch (this.a) {
            case 0:
                zlh zlhVar = (zlh) this.b.get();
                if (zlhVar != null) {
                    zlhVar.e.b.a();
                    break;
                }
                break;
            default:
                xph xphVar = (xph) this.b.get();
                if (xphVar != null) {
                    xphVar.d();
                    break;
                }
                break;
        }
    }

    @Override // android.media.session.MediaController.Callback
    public final void onSessionEvent(String str, Bundle bundle) {
        switch (this.a) {
            case 0:
                nsh.g(bundle);
                zlh zlhVar = (zlh) this.b.get();
                if (zlhVar != null) {
                    zlhVar.h(str, bundle);
                    break;
                }
                break;
            default:
                osh.C(bundle);
                break;
        }
    }

    public lkh(xph xphVar) {
        this.b = new WeakReference(xphVar);
    }
}
