package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzqf {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private zzel zzI;
    private final zzqe zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private zzqd zze;
    private int zzf;
    private boolean zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private Method zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzqf(zzqe zzqeVar) {
        this.zza = zzqeVar;
        int i = zzfy.zza;
        try {
            this.zzm = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
        this.zzI = zzel.zza;
    }

    private final long zzl() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = 2;
        if (this.zzx != -9223372036854775807L) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.zzz;
            }
            return Math.min(this.zzA, this.zzz + zzfy.zzn(zzfy.zzo(zzfy.zzq(elapsedRealtime) - this.zzx, this.zzi), this.zzf));
        }
        if (elapsedRealtime - this.zzr >= 5) {
            AudioTrack audioTrack2 = this.zzc;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition() & 4294967295L;
                long j = 0;
                if (this.zzg) {
                    if (playState != 2) {
                        i = playState;
                    } else if (playbackHeadPosition == 0) {
                        this.zzu = this.zzs;
                    }
                    playbackHeadPosition += this.zzu;
                    playState = i;
                }
                if (zzfy.zza <= 29) {
                    if (playbackHeadPosition != 0) {
                        j = playbackHeadPosition;
                    } else if (this.zzs > 0 && playState == 3) {
                        if (this.zzy == -9223372036854775807L) {
                            this.zzy = elapsedRealtime;
                        }
                    }
                    this.zzy = -9223372036854775807L;
                    playbackHeadPosition = j;
                }
                if (this.zzs > playbackHeadPosition) {
                    this.zzt++;
                }
                this.zzs = playbackHeadPosition;
            }
            this.zzr = elapsedRealtime;
        }
        return this.zzs + this.zzH + (this.zzt << 32);
    }

    private final long zzm() {
        return zzfy.zzr(zzl(), this.zzf);
    }

    private final void zzn() {
        this.zzk = 0L;
        this.zzw = 0;
        this.zzv = 0;
        this.zzl = 0L;
        this.zzC = 0L;
        this.zzF = 0L;
        this.zzj = false;
    }

    public final long zza(boolean z) {
        long zzm;
        zzpy zzpyVar;
        zzpy zzpyVar2;
        zzpt zzptVar;
        Method method;
        AudioTrack audioTrack;
        long zzI;
        long zzJ;
        long zzI2;
        long zzJ2;
        zzqf zzqfVar = this;
        AudioTrack audioTrack2 = zzqfVar.zzc;
        audioTrack2.getClass();
        if (audioTrack2.getPlayState() == 3) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - zzqfVar.zzl >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                long zzm2 = zzm();
                if (zzm2 != 0) {
                    zzqfVar.zzb[zzqfVar.zzv] = zzfy.zzp(zzm2, zzqfVar.zzi) - nanoTime;
                    zzqfVar.zzv = (zzqfVar.zzv + 1) % 10;
                    int i = zzqfVar.zzw;
                    if (i < 10) {
                        zzqfVar.zzw = i + 1;
                    }
                    zzqfVar.zzl = nanoTime;
                    zzqfVar.zzk = 0L;
                    int i2 = 0;
                    while (true) {
                        int i3 = zzqfVar.zzw;
                        if (i2 >= i3) {
                            break;
                        }
                        zzqfVar.zzk += zzqfVar.zzb[i2] / i3;
                        i2++;
                    }
                }
            }
            if (!zzqfVar.zzg) {
                zzqd zzqdVar = zzqfVar.zze;
                zzqdVar.getClass();
                if (zzqdVar.zzg(nanoTime)) {
                    long zzb = zzqdVar.zzb();
                    long zza = zzqdVar.zza();
                    long zzm3 = zzm();
                    if (Math.abs(zzb - nanoTime) > 5000000) {
                        zzrd zzrdVar = ((zzqy) zzqfVar.zza).zza;
                        zzI2 = zzrdVar.zzI();
                        zzJ2 = zzrdVar.zzJ();
                        zzff.zzf("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + zza + ", " + zzb + ", " + nanoTime + ", " + zzm3 + ", " + zzI2 + ", " + zzJ2);
                        zzqdVar.zzd();
                    } else if (Math.abs(zzfy.zzr(zza, zzqfVar.zzf) - zzm3) > 5000000) {
                        zzrd zzrdVar2 = ((zzqy) zzqfVar.zza).zza;
                        zzI = zzrdVar2.zzI();
                        zzJ = zzrdVar2.zzJ();
                        zzff.zzf("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + zza + ", " + zzb + ", " + nanoTime + ", " + zzm3 + ", " + zzI + ", " + zzJ);
                        zzqdVar.zzd();
                    } else {
                        zzqdVar.zzc();
                    }
                    zzqfVar = this;
                }
                if (zzqfVar.zzp && (method = zzqfVar.zzm) != null && nanoTime - zzqfVar.zzq >= 500000) {
                    try {
                        audioTrack = zzqfVar.zzc;
                    } catch (Exception unused) {
                        zzqfVar.zzm = null;
                    }
                    if (audioTrack == null) {
                        throw null;
                    }
                    Integer num = (Integer) method.invoke(audioTrack, new Object[0]);
                    int i4 = zzfy.zza;
                    long intValue = (num.intValue() * 1000) - zzqfVar.zzh;
                    zzqfVar.zzn = intValue;
                    long max = Math.max(intValue, 0L);
                    zzqfVar.zzn = max;
                    if (max > 5000000) {
                        zzff.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                        zzqfVar.zzn = 0L;
                    }
                    zzqfVar.zzq = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        zzqd zzqdVar2 = zzqfVar.zze;
        zzqdVar2.getClass();
        boolean zzf = zzqdVar2.zzf();
        if (zzf) {
            zzm = zzfy.zzr(zzqdVar2.zza(), zzqfVar.zzf) + zzfy.zzo(nanoTime2 - zzqdVar2.zzb(), zzqfVar.zzi);
        } else {
            zzm = zzqfVar.zzw == 0 ? zzm() : zzfy.zzo(zzqfVar.zzk + nanoTime2, zzqfVar.zzi);
            if (!z) {
                zzm = Math.max(0L, zzm - zzqfVar.zzn);
            }
        }
        if (zzqfVar.zzD != zzf) {
            zzqfVar.zzF = zzqfVar.zzC;
            zzqfVar.zzE = zzqfVar.zzB;
        }
        long j = nanoTime2 - zzqfVar.zzF;
        if (j < 1000000) {
            long zzo = zzqfVar.zzE + zzfy.zzo(j, zzqfVar.zzi);
            long j2 = (j * 1000) / 1000000;
            zzm = ((zzm * j2) + ((1000 - j2) * zzo)) / 1000;
        }
        if (!zzqfVar.zzj) {
            long j3 = zzqfVar.zzB;
            if (zzm > j3) {
                zzqfVar.zzj = true;
                int i5 = zzfy.zza;
                long currentTimeMillis = System.currentTimeMillis() - zzfy.zzt(zzfy.zzp(zzfy.zzt(zzm - j3), zzqfVar.zzi));
                zzrd zzrdVar3 = ((zzqy) zzqfVar.zza).zza;
                zzpyVar = zzrdVar3.zzp;
                if (zzpyVar != null) {
                    zzpyVar2 = zzrdVar3.zzp;
                    zzptVar = ((zzri) zzpyVar2).zza.zzc;
                    zzptVar.zzv(currentTimeMillis);
                }
            }
        }
        zzqfVar.zzC = nanoTime2;
        zzqfVar.zzB = zzm;
        zzqfVar.zzD = zzf;
        return zzm;
    }

    public final void zzb(long j) {
        this.zzz = zzl();
        this.zzx = zzfy.zzq(SystemClock.elapsedRealtime());
        this.zzA = j;
    }

    public final void zzc() {
        zzn();
        this.zzc = null;
        this.zze = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        boolean z2;
        this.zzc = audioTrack;
        this.zzd = i3;
        this.zze = new zzqd(audioTrack);
        this.zzf = audioTrack.getSampleRate();
        if (z && zzfy.zza < 23) {
            z2 = true;
            if (i != 5) {
                if (i == 6) {
                    i = 6;
                }
            }
            this.zzg = z2;
            boolean zzH = zzfy.zzH(i);
            this.zzp = zzH;
            this.zzh = !zzH ? zzfy.zzr(i3 / i2, this.zzf) : -9223372036854775807L;
            this.zzs = 0L;
            this.zzt = 0L;
            this.zzG = false;
            this.zzH = 0L;
            this.zzu = 0L;
            this.zzo = false;
            this.zzx = -9223372036854775807L;
            this.zzy = -9223372036854775807L;
            this.zzq = 0L;
            this.zzn = 0L;
            this.zzi = 1.0f;
        }
        z2 = false;
        this.zzg = z2;
        boolean zzH2 = zzfy.zzH(i);
        this.zzp = zzH2;
        this.zzh = !zzH2 ? zzfy.zzr(i3 / i2, this.zzf) : -9223372036854775807L;
        this.zzs = 0L;
        this.zzt = 0L;
        this.zzG = false;
        this.zzH = 0L;
        this.zzu = 0L;
        this.zzo = false;
        this.zzx = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzq = 0L;
        this.zzn = 0L;
        this.zzi = 1.0f;
    }

    public final void zze(zzel zzelVar) {
        this.zzI = zzelVar;
    }

    public final void zzf() {
        if (this.zzx != -9223372036854775807L) {
            this.zzx = zzfy.zzq(SystemClock.elapsedRealtime());
        }
        zzqd zzqdVar = this.zze;
        zzqdVar.getClass();
        zzqdVar.zze();
    }

    public final boolean zzg(long j) {
        if (j > zzfy.zzn(zza(false), this.zzf)) {
            return true;
        }
        if (this.zzg) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && zzl() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzi(long j) {
        return this.zzy != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.zzy >= 200;
    }

    public final boolean zzj(long j) {
        zzpy zzpyVar;
        long j2;
        zzpy zzpyVar2;
        zzpt zzptVar;
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.zzg) {
            if (playState == 2) {
                this.zzo = false;
                return false;
            }
            if (playState == 1) {
                if (zzl() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.zzo;
        boolean zzg = zzg(j);
        this.zzo = zzg;
        if (z && !zzg && playState != 1) {
            zzqe zzqeVar = this.zza;
            int i = this.zzd;
            long zzt = zzfy.zzt(this.zzh);
            zzqy zzqyVar = (zzqy) zzqeVar;
            zzrd zzrdVar = zzqyVar.zza;
            zzpyVar = zzrdVar.zzp;
            if (zzpyVar != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j2 = zzrdVar.zzS;
                zzpyVar2 = zzqyVar.zza.zzp;
                zzptVar = ((zzri) zzpyVar2).zza.zzc;
                zzptVar.zzx(i, zzt, elapsedRealtime - j2);
            }
        }
        return true;
    }

    public final boolean zzk() {
        zzn();
        if (this.zzx != -9223372036854775807L) {
            this.zzz = zzl();
            return false;
        }
        zzqd zzqdVar = this.zze;
        zzqdVar.getClass();
        zzqdVar.zze();
        return true;
    }
}
