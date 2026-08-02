package ru.yandex.video.m3.player.impl;

import com.google.common.collect.ImmutableList;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.b64;
import defpackage.kju0;
import defpackage.ny61;
import defpackage.q801;
import defpackage.r801;
import defpackage.s820;
import defpackage.vmh;
import defpackage.w820;
import defpackage.xv00;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/yandex/video/m3/player/impl/PlaybackDebugHelper;", "", "<init>", "()V", "Lw820;", kju0.j, "", "printMetadata", "(Lw820;)Ljava/lang/String;", "", BackendConfig.Restrictions.ENABLED, "getTrackStatusString", "(Z)Ljava/lang/String;", "", "formatSupport", "getFormatSupportString", "(I)Ljava/lang/String;", "Lvmh;", "trackSelector", "Lr801;", "tracks", "logTrackSelection", "(Lvmh;Lr801;)Ljava/lang/String;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlaybackDebugHelper {
    public static final int $stable = 0;
    public static final PlaybackDebugHelper INSTANCE = new PlaybackDebugHelper();

    private PlaybackDebugHelper() {
    }

    private final String getFormatSupportString(int formatSupport) {
        if (formatSupport == 0) {
            return "NO";
        }
        if (formatSupport == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (formatSupport == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (formatSupport == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (formatSupport == 4) {
            return "YES";
        }
        ny61.k();
        return null;
    }

    private final String getTrackStatusString(boolean enabled) {
        return enabled ? "[X]" : "[ ]";
    }

    private final String printMetadata(w820 metadata) {
        StringBuilder sb = new StringBuilder();
        if (metadata != null) {
            s820[] s820VarArr = metadata.a;
            if (s820VarArr.length > 0) {
                sb.append(", metadata=");
            }
            for (s820 s820Var : s820VarArr) {
                sb.append("  " + s820Var);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String logTrackSelection(vmh trackSelector, r801 tracks) {
        String str;
        xv00 xv00Var;
        xv00 currentMappedTrackInfo = trackSelector.getCurrentMappedTrackInfo();
        if (currentMappedTrackInfo != null) {
            StringBuilder sb = new StringBuilder("tracks [");
            int i = currentMappedTrackInfo.a;
            int i2 = 0;
            while (i2 < i) {
                int i3 = currentMappedTrackInfo.c[i2].a;
                ImmutableList immutableList = tracks.a;
                if (i3 > 0) {
                    sb.append("\n  Renderer:" + i2 + " [");
                    int i4 = 0;
                    while (i4 < i3) {
                        sb.append("\n    Group:" + i4 + ", [");
                        q801 q801Var = (q801) immutableList.get(i4);
                        int i5 = q801Var.a;
                        int i6 = 0;
                        while (i6 < i5) {
                            PlaybackDebugHelper playbackDebugHelper = INSTANCE;
                            String trackStatusString = playbackDebugHelper.getTrackStatusString(q801Var.e[i6]);
                            String formatSupportString = playbackDebugHelper.getFormatSupportString(currentMappedTrackInfo.e[i2][i4][i6] & 7);
                            xv00 xv00Var2 = currentMappedTrackInfo;
                            StringBuilder u = b64.u(i6, "\n      ", trackStatusString, " Track:", Extension.FIX_SPACE);
                            u.append(androidx.media3.common.a.c(q801Var.a(i6)));
                            u.append(", supported=");
                            u.append(formatSupportString);
                            u.append(playbackDebugHelper.printMetadata(q801Var.a(i6).l));
                            sb.append(u.toString());
                            i6++;
                            currentMappedTrackInfo = xv00Var2;
                        }
                        sb.append("\n    ]");
                        i4++;
                        currentMappedTrackInfo = currentMappedTrackInfo;
                    }
                    xv00Var = currentMappedTrackInfo;
                    sb.append("\n  ]");
                } else {
                    xv00Var = currentMappedTrackInfo;
                }
                i2++;
                currentMappedTrackInfo = xv00Var;
            }
            str = sb.toString();
        } else {
            str = null;
        }
        return str == null ? "tracks []" : str;
    }
}
