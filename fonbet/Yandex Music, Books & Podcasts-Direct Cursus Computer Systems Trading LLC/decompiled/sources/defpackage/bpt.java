package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.os.Build;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class bpt extends wvo {
    public final zot l;

    public bpt(zot zotVar) {
        super(19);
        this.l = zotVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b4, code lost:
    
        if (kotlin.text.c.v(kotlin.text.c.k(r11), "SM-T", false) != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    @Override // defpackage.wvo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List E(Context context, rih rihVar, dsc dscVar, boolean z, boolean z2) {
        Object obj;
        context.getClass();
        rihVar.getClass();
        dscVar.getClass();
        ArrayList y0 = CollectionsKt.y0(super.E(context, rihVar, dscVar, z, z2));
        String str = dscVar.n;
        if (!y0.isEmpty() && str != null) {
            boolean z3 = false;
            if (c.v(str, "video", false)) {
                String str2 = Build.MANUFACTURER;
                str2.getClass();
                if (c.k(str2).equals("Realme")) {
                    String str3 = Build.MODEL;
                    str3.getClass();
                    if (c.k(str3).equals("RMX3231")) {
                        Iterator it = y0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (!((mih) obj).i) {
                                break;
                            }
                        }
                        mih mihVar = (mih) obj;
                        if (mihVar != null) {
                            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                            codecProfileLevel.profile = 8;
                            codecProfileLevel.level = RemoteCameraConfig.Mic.BUFFER_SIZE;
                            MediaCodecInfo.CodecCapabilities codecCapabilities = mihVar.d;
                            if (codecCapabilities != null) {
                                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = codecCapabilities.profileLevels;
                                codecProfileLevelArr.getClass();
                                if (!xz0.u(codecProfileLevelArr, codecProfileLevel)) {
                                    int length = codecProfileLevelArr.length + 1;
                                    MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr2 = new MediaCodecInfo.CodecProfileLevel[length];
                                    int i = 0;
                                    while (i < length) {
                                        codecProfileLevelArr2[i] = (i < 0 || i >= codecProfileLevelArr.length) ? codecProfileLevel : codecProfileLevelArr[i];
                                        i++;
                                    }
                                    codecProfileLevelArr = codecProfileLevelArr2;
                                }
                                codecCapabilities.profileLevels = codecProfileLevelArr;
                            }
                        }
                    }
                }
            }
            zot zotVar = this.l;
            if (!zotVar.b) {
                if (zotVar.a) {
                    String str4 = Build.MODEL;
                    str4.getClass();
                }
                if (y0.size() > 1) {
                    y75.s(y0, new apt(dscVar, z3));
                }
            }
            z3 = true;
            if (y0.size() > 1) {
            }
        }
        return y0;
    }
}
