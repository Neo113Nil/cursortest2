package ru.yandex.video.m3.player.report;

import android.media.MediaCodecInfo;
import android.util.Log;
import defpackage.ac10;
import defpackage.ad10;
import defpackage.bc10;
import defpackage.cc10;
import defpackage.dc10;
import defpackage.ec10;
import defpackage.fc10;
import defpackage.fe10;
import defpackage.gc10;
import defpackage.gkb1;
import defpackage.hc10;
import defpackage.ic10;
import defpackage.jc10;
import defpackage.kc10;
import defpackage.lb10;
import defpackage.lc10;
import defpackage.mc10;
import defpackage.nc10;
import defpackage.oc10;
import defpackage.oyr;
import defpackage.pc10;
import defpackage.qc10;
import defpackage.rc10;
import defpackage.sb10;
import defpackage.sc10;
import defpackage.tc10;
import defpackage.tw21;
import defpackage.uc10;
import defpackage.vc10;
import defpackage.wc10;
import defpackage.xc10;
import defpackage.yb10;
import defpackage.yc10;
import defpackage.zb10;
import defpackage.zc10;
import defpackage.zd10;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0006H\u0000¢\u0006\u0004\b\u0002\u0010\u0007\"\u0014\u0010\b\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Llb10;", "", "toLogString", "(Llb10;)Ljava/lang/String;", "Lhc10;", "(Lhc10;)Ljava/lang/String;", "Lfe10;", "(Lfe10;)Ljava/lang/String;", "UNEXPECTED_STATE_TRANSITION", "Ljava/lang/String;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UtilKt {
    private static final String UNEXPECTED_STATE_TRANSITION = "Unexpected state transition";

    public static final String toLogString(hc10 hc10Var) {
        gkb1 gkb1Var = hc10Var.b;
        StringBuilder sb = new StringBuilder("id=");
        sb.append(hc10Var.a);
        sb.append(" ");
        if (hc10Var instanceof gc10) {
            gc10 gc10Var = (gc10) hc10Var;
            if (gc10Var instanceof dc10) {
                sb.append("Configured cause=");
                if (gkb1Var instanceof jc10) {
                    sb.append("Configure configuration=");
                    sb.append(toLogString((lb10) ((jc10) gkb1Var).a.a));
                } else {
                    sb.append(UNEXPECTED_STATE_TRANSITION);
                }
            } else if (gc10Var instanceof fc10) {
                sb.append("Uninitialized cause=");
                if (gkb1Var instanceof kc10) {
                    sb.append("Create codecName=");
                    kc10 kc10Var = (kc10) gkb1Var;
                    sb.append(kc10Var.a);
                    sb.append(" type=");
                    sb.append(kc10Var.b);
                } else if (gkb1Var instanceof ad10) {
                    sb.append("Stop");
                } else if (gkb1Var instanceof vc10) {
                    sb.append("Reset");
                } else {
                    sb.append(UNEXPECTED_STATE_TRANSITION);
                }
            } else if (gc10Var instanceof ec10) {
                sb.append("Error codecName=");
                ec10 ec10Var = (ec10) hc10Var;
                sb.append(ec10Var.c);
                sb.append(", configuration=");
                sb.append(toLogString((lb10) ec10Var.d.a));
                sb.append(", cause=");
                gkb1 gkb1Var2 = ec10Var.e;
                if (gkb1Var2 instanceof kc10) {
                    sb.append("Create");
                } else if (gkb1Var2 instanceof jc10) {
                    sb.append("Configure");
                } else if (gkb1Var2 instanceof zc10) {
                    sb.append("Start");
                } else if (gkb1Var2 instanceof ad10) {
                    sb.append("Stop");
                } else if (gkb1Var2 instanceof vc10) {
                    sb.append("Reset");
                } else if (gkb1Var2 instanceof pc10) {
                    sb.append("Flush");
                } else if (gkb1Var2 instanceof tc10) {
                    sb.append("Release");
                } else if (gkb1Var2 instanceof oc10) {
                    sb.append("Error ");
                    sb.append(Log.getStackTraceString(((oc10) gkb1Var2).a));
                } else if (gkb1Var2 instanceof lc10) {
                    sb.append("DequeueInputBuffer");
                } else if (gkb1Var2 instanceof rc10) {
                    sb.append("QueueInputBufferEos");
                } else if (gkb1Var2 instanceof sc10) {
                    sb.append("QueueSecureInputBuffer");
                } else if (gkb1Var2 instanceof qc10) {
                    sb.append("QueueInputBuffer");
                } else if (gkb1Var2 instanceof mc10) {
                    sb.append("DequeueOutputBuffer");
                } else if (gkb1Var2 instanceof uc10) {
                    sb.append("ReleaseOutputBuffer");
                } else if (gkb1Var2 instanceof wc10) {
                    sb.append("SetOutputSurface isValid=");
                    sb.append(((wc10) gkb1Var2).a);
                } else if (gkb1Var2 instanceof nc10) {
                    sb.append("DetachOutputSurface");
                } else if (gkb1Var2 instanceof xc10) {
                    sb.append("SetParameters params=");
                    sb.append(((xc10) gkb1Var2).a.toString());
                } else if (gkb1Var2 instanceof yc10) {
                    sb.append("SetVideoScalingMode mode=");
                    int i = ((yc10) gkb1Var2).a;
                    sb.append(i != 1 ? i != 2 ? "UNKNOWN" : "SCALE_TO_FIT_WITH_CROPPING" : "SCALE_TO_FIT");
                } else if (gkb1Var2 instanceof ic10) {
                    sb.append("Failed to set async callback.");
                }
                sb.append(" inputFormat=");
                sb.append(ec10Var.f);
                sb.append(" outputFormat=");
                sb.append(ec10Var.g);
            }
        } else if (hc10Var instanceof bc10) {
            bc10 bc10Var = (bc10) hc10Var;
            if (bc10Var instanceof zb10) {
                sb.append("Flushed cause=");
                if (gkb1Var instanceof pc10) {
                    sb.append("Flush");
                } else if (gkb1Var instanceof zc10) {
                    sb.append("Start");
                } else {
                    sb.append(UNEXPECTED_STATE_TRANSITION);
                }
            } else if (bc10Var instanceof ac10) {
                sb.append("Running ");
                if (gkb1Var instanceof zc10) {
                    sb.append("Start");
                } else if (gkb1Var instanceof lc10) {
                    sb.append("DequeueInputBuffer");
                } else {
                    sb.append(UNEXPECTED_STATE_TRANSITION);
                }
            } else if (bc10Var instanceof yb10) {
                sb.append("EndOfStream ");
                if (gkb1Var instanceof rc10) {
                    sb.append("QueueInputBufferEos");
                } else {
                    sb.append(UNEXPECTED_STATE_TRANSITION);
                }
            }
        } else if (hc10Var instanceof cc10) {
            sb.append(" Released codecName=");
            sb.append(((cc10) hc10Var).c);
        }
        return sb.toString();
    }

    public static final String toLogString(lb10 lb10Var) {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        StringBuilder sb = new StringBuilder("Configuration(format=");
        sb.append(lb10Var.c.toString());
        sb.append(", mediaFormat=");
        sb.append(lb10Var.b);
        sb.append(", codecName=");
        sb10 sb10Var = lb10Var.a;
        sb.append(sb10Var.a);
        sb.append(", mimeType=");
        sb.append(sb10Var.b);
        sb.append(", codecMimeType=");
        sb.append(sb10Var.c);
        sb.append(", adaptive=");
        sb.append(sb10Var.e);
        sb.append(", secure=");
        sb.append(sb10Var.g);
        sb.append(", hardwareAccelerated=");
        sb.append(sb10Var.h);
        sb.append(", maxSupportedInstances=");
        return oyr.m((tw21.a < 23 || (codecCapabilities = sb10Var.d) == null) ? -1 : codecCapabilities.getMaxSupportedInstances(), Extension.C_BRAKE, sb);
    }

    public static final String toLogString(fe10 fe10Var) {
        StringBuilder sb = new StringBuilder("MediaItem(uri=");
        zd10 zd10Var = fe10Var.b;
        sb.append(zd10Var != null ? zd10Var.a : null);
        sb.append(", mimeType=");
        return oyr.t(sb, zd10Var != null ? zd10Var.b : null, Extension.C_BRAKE);
    }
}
