package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.core.view.PointerIconCompat;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzox implements zzms, zzoy {
    private final Context zza;
    private final zzoz zzb;
    private final PlaybackSession zzc;
    private String zzi;
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    private zzce zzn;
    private zzow zzo;
    private zzow zzp;
    private zzow zzq;
    private zzam zzr;
    private zzam zzs;
    private zzam zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;
    private final zzcw zze = new zzcw();
    private final zzcu zzf = new zzcu();
    private final HashMap zzh = new HashMap();
    private final HashMap zzg = new HashMap();
    private final long zzd = SystemClock.elapsedRealtime();
    private int zzl = 0;
    private int zzm = 0;

    private zzox(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zzov zzovVar = new zzov(zzov.zza);
        this.zzb = zzovVar;
        zzovVar.zzh(this);
    }

    public static zzox zzb(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new zzox(context, mediaMetricsManager.createPlaybackSession());
    }

    private static int zzr(int i) {
        switch (zzfy.zzi(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l = (Long) this.zzg.get(this.zzi);
            this.zzj.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.zzh.get(this.zzi);
            this.zzj.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.zzj.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.zzc.reportPlaybackMetrics(this.zzj.build());
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j, zzam zzamVar, int i) {
        if (zzfy.zzF(this.zzs, zzamVar)) {
            return;
        }
        int i2 = this.zzs == null ? 1 : 0;
        this.zzs = zzamVar;
        zzx(0, j, zzamVar, i2);
    }

    private final void zzu(long j, zzam zzamVar, int i) {
        if (zzfy.zzF(this.zzt, zzamVar)) {
            return;
        }
        int i2 = this.zzt == null ? 1 : 0;
        this.zzt = zzamVar;
        zzx(2, j, zzamVar, i2);
    }

    @RequiresNonNull({"metricsBuilder"})
    private final void zzv(zzcx zzcxVar, zzur zzurVar) {
        int zza;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zzurVar == null || (zza = zzcxVar.zza(zzurVar.zza)) == -1) {
            return;
        }
        int i = 0;
        zzcxVar.zzd(zza, this.zzf, false);
        zzcxVar.zze(this.zzf.zzd, this.zze, 0L);
        zzbi zzbiVar = this.zze.zze.zzd;
        if (zzbiVar != null) {
            int zzm = zzfy.zzm(zzbiVar.zzb);
            i = zzm != 0 ? zzm != 1 ? zzm != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        zzcw zzcwVar = this.zze;
        if (zzcwVar.zzo != -9223372036854775807L && !zzcwVar.zzm && !zzcwVar.zzj && !zzcwVar.zzb()) {
            builder.setMediaDurationMillis(zzfy.zzt(this.zze.zzo));
        }
        builder.setPlaybackType(true != this.zze.zzb() ? 1 : 2);
        this.zzz = true;
    }

    private final void zzw(long j, zzam zzamVar, int i) {
        if (zzfy.zzF(this.zzr, zzamVar)) {
            return;
        }
        int i2 = this.zzr == null ? 1 : 0;
        this.zzr = zzamVar;
        zzx(1, j, zzamVar, i2);
    }

    private final void zzx(int i, long j, zzam zzamVar, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.zzd);
        if (zzamVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = zzamVar.zzl;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzamVar.zzm;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzamVar.zzj;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzamVar.zzi;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzamVar.zzr;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzamVar.zzs;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzamVar.zzz;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzamVar.zzA;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = zzamVar.zzd;
            if (str4 != null) {
                int i8 = zzfy.zza;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                if (create.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) create.second);
                }
            }
            float f = zzamVar.zzt;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        this.zzc.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    private final boolean zzy(zzow zzowVar) {
        if (zzowVar != null) {
            return zzowVar.zzc.equals(this.zzb.zze());
        }
        return false;
    }

    public final LogSessionId zza() {
        return this.zzc.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzc(zzmq zzmqVar, String str) {
        zzur zzurVar = zzmqVar.zzd;
        if (zzurVar == null || !zzurVar.zzb()) {
            zzs();
            this.zzi = str;
            this.zzj = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.2.1");
            zzv(zzmqVar.zzb, zzmqVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoy
    public final void zzd(zzmq zzmqVar, String str, boolean z) {
        zzur zzurVar = zzmqVar.zzd;
        if ((zzurVar == null || !zzurVar.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zze(zzmq zzmqVar, zzam zzamVar, zzis zzisVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzf(zzmq zzmqVar, int i, long j, long j2) {
        zzur zzurVar = zzmqVar.zzd;
        if (zzurVar != null) {
            zzoz zzozVar = this.zzb;
            zzcx zzcxVar = zzmqVar.zzb;
            HashMap hashMap = this.zzh;
            String zzf = zzozVar.zzf(zzcxVar, zzurVar);
            Long l = (Long) hashMap.get(zzf);
            Long l2 = (Long) this.zzg.get(zzf);
            this.zzh.put(zzf, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.zzg.put(zzf, Long.valueOf((l2 != null ? l2.longValue() : 0L) + i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzg(zzmq zzmqVar, zzun zzunVar) {
        zzur zzurVar = zzmqVar.zzd;
        if (zzurVar == null) {
            return;
        }
        zzam zzamVar = zzunVar.zzb;
        zzamVar.getClass();
        zzow zzowVar = new zzow(zzamVar, 0, this.zzb.zzf(zzmqVar.zzb, zzurVar));
        int i = zzunVar.zza;
        if (i != 0) {
            if (i == 1) {
                this.zzp = zzowVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.zzq = zzowVar;
                return;
            }
        }
        this.zzo = zzowVar;
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zzh(zzmq zzmqVar, int i, long j) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x01e9, code lost:
    
        if (r8 != 1) goto L139;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzms
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(zzco zzcoVar, zzmr zzmrVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int errorCode;
        int zzj;
        zzae zzaeVar;
        int i5;
        int i6;
        if (zzmrVar.zzb() == 0) {
            return;
        }
        for (int i7 = 0; i7 < zzmrVar.zzb(); i7++) {
            int zza = zzmrVar.zza(i7);
            zzmq zzc = zzmrVar.zzc(zza);
            if (zza == 0) {
                this.zzb.zzk(zzc);
            } else if (zza == 11) {
                this.zzb.zzj(zzc, this.zzk);
            } else {
                this.zzb.zzi(zzc);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzmrVar.zzd(0)) {
            zzmq zzc2 = zzmrVar.zzc(0);
            if (this.zzj != null) {
                zzv(zzc2.zzb, zzc2.zzd);
            }
        }
        if (zzmrVar.zzd(2) && this.zzj != null) {
            zzgaa zza2 = zzcoVar.zzo().zza();
            int size = zza2.size();
            int i8 = 0;
            loop1: while (true) {
                if (i8 >= size) {
                    zzaeVar = null;
                    break;
                }
                zzdj zzdjVar = (zzdj) zza2.get(i8);
                char c = 0;
                while (true) {
                    int i9 = zzdjVar.zzb;
                    i6 = i8 + 1;
                    if (c <= 0) {
                        if (zzdjVar.zzd(0) && (zzaeVar = zzdjVar.zzb(0).zzp) != null) {
                            break loop1;
                        } else {
                            c = 1;
                        }
                    }
                }
                i8 = i6;
            }
            if (zzaeVar != null) {
                PlaybackMetrics.Builder builder = this.zzj;
                int i10 = zzfy.zza;
                int i11 = 0;
                while (true) {
                    if (i11 >= zzaeVar.zzb) {
                        i5 = 1;
                        break;
                    }
                    UUID uuid = zzaeVar.zza(i11).zza;
                    if (uuid.equals(zzo.zzd)) {
                        i5 = 3;
                        break;
                    } else if (uuid.equals(zzo.zze)) {
                        i5 = 2;
                        break;
                    } else {
                        if (uuid.equals(zzo.zzc)) {
                            i5 = 6;
                            break;
                        }
                        i11++;
                    }
                }
                builder.setDrmType(i5);
            }
        }
        if (zzmrVar.zzd(PointerIconCompat.TYPE_COPY)) {
            this.zzy++;
        }
        zzce zzceVar = this.zzn;
        if (zzceVar != null) {
            Context context = this.zza;
            if (zzceVar.zzb == 1001) {
                i4 = 20;
            } else {
                zziz zzizVar = (zziz) zzceVar;
                boolean z = zzizVar.zze == 1;
                int i12 = zzizVar.zzi;
                Throwable cause = zzceVar.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    if (cause instanceof zzhr) {
                        zzj = ((zzhr) cause).zzd;
                        i4 = 5;
                    } else if ((cause instanceof zzhq) || (cause instanceof zzcc)) {
                        zzj = 0;
                        i4 = 11;
                    } else {
                        boolean z2 = cause instanceof zzhp;
                        if (z2 || (cause instanceof zzhz)) {
                            if (zzfn.zzb(context).zza() == 1) {
                                zzj = 0;
                                i4 = 3;
                            } else {
                                Throwable cause2 = cause.getCause();
                                if (cause2 instanceof UnknownHostException) {
                                    zzj = 0;
                                    i4 = 6;
                                } else if (cause2 instanceof SocketTimeoutException) {
                                    zzj = 0;
                                    i4 = 7;
                                } else if (z2 && ((zzhp) cause).zzc == 1) {
                                    zzj = 0;
                                    i4 = 4;
                                } else {
                                    zzj = 0;
                                    i4 = 8;
                                }
                            }
                        } else if (zzceVar.zzb == 1002) {
                            i4 = 21;
                        } else if (cause instanceof zzrq) {
                            Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            int i13 = zzfy.zza;
                            if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                errorCode = zzfy.zzj(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                i3 = zzr(errorCode);
                                int i14 = i3;
                                zzj = errorCode;
                                i4 = i14;
                            } else if (zzfy.zza >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                i4 = 27;
                            } else if (cause3 instanceof NotProvisionedException) {
                                i4 = 24;
                            } else if (cause3 instanceof DeniedByServerException) {
                                i4 = 29;
                            } else {
                                if (!(cause3 instanceof zzsb)) {
                                    i4 = cause3 instanceof zzro ? 28 : 30;
                                }
                                zzj = 0;
                                i4 = 23;
                            }
                        } else if ((cause instanceof zzhl) && (cause.getCause() instanceof FileNotFoundException)) {
                            Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            Throwable cause5 = cause4.getCause();
                            int i15 = zzfy.zza;
                            if ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                i4 = 32;
                            } else {
                                zzj = 0;
                                i4 = 31;
                            }
                        } else {
                            zzj = 0;
                            i4 = 9;
                        }
                    }
                    this.zzc.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.zzd).setErrorCode(i4).setSubErrorCode(zzj).setException(zzceVar).build());
                    this.zzz = true;
                    this.zzn = null;
                } else {
                    if (z) {
                        i4 = 35;
                        if (i12 != 0) {
                        }
                    }
                    if (z && i12 == 3) {
                        i4 = 15;
                    } else {
                        if (!z || i12 != 2) {
                            if (cause instanceof zzsx) {
                                zzj = zzfy.zzj(((zzsx) cause).zzd);
                                i4 = 13;
                                this.zzc.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.zzd).setErrorCode(i4).setSubErrorCode(zzj).setException(zzceVar).build());
                                this.zzz = true;
                                this.zzn = null;
                            } else {
                                i3 = 14;
                                if (cause instanceof zzst) {
                                    errorCode = zzfy.zzj(((zzst) cause).zzb);
                                } else if (cause instanceof OutOfMemoryError) {
                                    i4 = 14;
                                } else if (cause instanceof zzpx) {
                                    errorCode = ((zzpx) cause).zza;
                                    i3 = 17;
                                } else if (cause instanceof zzqa) {
                                    errorCode = ((zzqa) cause).zza;
                                    i3 = 18;
                                } else {
                                    int i16 = zzfy.zza;
                                    if (cause instanceof MediaCodec.CryptoException) {
                                        errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                        i3 = zzr(errorCode);
                                    } else {
                                        i4 = 22;
                                    }
                                }
                                int i142 = i3;
                                zzj = errorCode;
                                i4 = i142;
                                this.zzc.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.zzd).setErrorCode(i4).setSubErrorCode(zzj).setException(zzceVar).build());
                                this.zzz = true;
                                this.zzn = null;
                            }
                        }
                        zzj = 0;
                        i4 = 23;
                        this.zzc.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.zzd).setErrorCode(i4).setSubErrorCode(zzj).setException(zzceVar).build());
                        this.zzz = true;
                        this.zzn = null;
                    }
                }
            }
            zzj = 0;
            this.zzc.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.zzd).setErrorCode(i4).setSubErrorCode(zzj).setException(zzceVar).build());
            this.zzz = true;
            this.zzn = null;
        }
        if (zzmrVar.zzd(2)) {
            zzdk zzo = zzcoVar.zzo();
            boolean zzb = zzo.zzb(2);
            boolean zzb2 = zzo.zzb(1);
            boolean zzb3 = zzo.zzb(3);
            if (!zzb && !zzb2) {
                if (zzb3) {
                    zzb3 = true;
                }
            }
            if (!zzb) {
                zzw(elapsedRealtime, null, 0);
            }
            if (!zzb2) {
                zzt(elapsedRealtime, null, 0);
            }
            if (!zzb3) {
                zzu(elapsedRealtime, null, 0);
            }
        }
        if (zzy(this.zzo)) {
            zzow zzowVar = this.zzo;
            zzam zzamVar = zzowVar.zza;
            if (zzamVar.zzs != -1) {
                int i17 = zzowVar.zzb;
                zzw(elapsedRealtime, zzamVar, 0);
                this.zzo = null;
            }
        }
        if (zzy(this.zzp)) {
            zzow zzowVar2 = this.zzp;
            zzam zzamVar2 = zzowVar2.zza;
            int i18 = zzowVar2.zzb;
            zzt(elapsedRealtime, zzamVar2, 0);
            this.zzp = null;
        }
        if (zzy(this.zzq)) {
            zzow zzowVar3 = this.zzq;
            zzam zzamVar3 = zzowVar3.zza;
            int i19 = zzowVar3.zzb;
            zzu(elapsedRealtime, zzamVar3, 0);
            this.zzq = null;
        }
        switch (zzfn.zzb(this.zza).zza()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 9;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
            case 8:
            default:
                i = 1;
                break;
            case 7:
                i = 3;
                break;
            case 9:
                i = 8;
                break;
            case 10:
                i = 7;
                break;
        }
        if (i != this.zzm) {
            this.zzm = i;
            this.zzc.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(i).setTimeSinceCreatedMillis(elapsedRealtime - this.zzd).build());
        }
        if (zzcoVar.zzf() != 2) {
            this.zzu = false;
        }
        if (((zzml) zzcoVar).zzC() == null) {
            this.zzv = false;
        } else if (zzmrVar.zzd(10)) {
            this.zzv = true;
        }
        int zzf = zzcoVar.zzf();
        if (this.zzu) {
            i2 = 5;
        } else if (this.zzv) {
            i2 = 13;
        } else {
            i2 = 4;
            if (zzf == 4) {
                i2 = 11;
            } else if (zzf == 2) {
                int i20 = this.zzl;
                i2 = (i20 == 0 || i20 == 2) ? 2 : !zzcoVar.zzv() ? 7 : zzcoVar.zzg() != 0 ? 10 : 6;
            } else if (zzf != 3) {
                i2 = (zzf != 1 || this.zzl == 0) ? this.zzl : 12;
            } else if (zzcoVar.zzv()) {
                i2 = zzcoVar.zzg() != 0 ? 9 : 3;
            }
        }
        if (this.zzl != i2) {
            this.zzl = i2;
            this.zzz = true;
            this.zzc.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.zzl).setTimeSinceCreatedMillis(elapsedRealtime - this.zzd).build());
        }
        if (zzmrVar.zzd(1028)) {
            this.zzb.zzg(zzmrVar.zzc(1028));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzj(zzmq zzmqVar, zzui zzuiVar, zzun zzunVar, IOException iOException, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zzk(zzmq zzmqVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzl(zzmq zzmqVar, zzce zzceVar) {
        this.zzn = zzceVar;
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzm(zzmq zzmqVar, zzcn zzcnVar, zzcn zzcnVar2, int i) {
        if (i == 1) {
            this.zzu = true;
            i = 1;
        }
        this.zzk = i;
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zzn(zzmq zzmqVar, Object obj, long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzo(zzmq zzmqVar, zzir zzirVar) {
        this.zzw += zzirVar.zzg;
        this.zzx += zzirVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final /* synthetic */ void zzp(zzmq zzmqVar, zzam zzamVar, zzis zzisVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzq(zzmq zzmqVar, zzdp zzdpVar) {
        zzow zzowVar = this.zzo;
        if (zzowVar != null) {
            zzam zzamVar = zzowVar.zza;
            if (zzamVar.zzs == -1) {
                zzak zzb = zzamVar.zzb();
                zzb.zzab(zzdpVar.zzc);
                zzb.zzI(zzdpVar.zzd);
                this.zzo = new zzow(zzb.zzac(), 0, zzowVar.zzc);
            }
        }
    }
}
