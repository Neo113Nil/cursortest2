package defpackage;

import android.text.TextUtils;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import java.util.ArrayList;
import java.util.Collections;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class q9r extends q8 {
    public dsc e;

    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList o(String str) {
        byte[][] bArr;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            byte[] w = dvt.w(str);
            byte[] bArr2 = ir4.a;
            if (w.length > 4) {
                int i = 0;
                while (true) {
                    byte[] bArr3 = ir4.a;
                    if (i >= 4) {
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = 0;
                        do {
                            arrayList2.add(Integer.valueOf(i2));
                            i2 += 4;
                            int length = w.length - 4;
                            while (true) {
                                if (i2 > length) {
                                    i2 = -1;
                                    break;
                                }
                                if (w.length - i2 > 4) {
                                    int i3 = 0;
                                    while (true) {
                                        byte[] bArr4 = ir4.a;
                                        if (i3 >= 4) {
                                            break;
                                        }
                                        if (w[i2 + i3] != bArr4[i3]) {
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                                i2++;
                            }
                        } while (i2 != -1);
                        byte[][] bArr5 = new byte[arrayList2.size()][];
                        int i4 = 0;
                        while (i4 < arrayList2.size()) {
                            int intValue = ((Integer) arrayList2.get(i4)).intValue();
                            int intValue2 = (i4 < arrayList2.size() + (-1) ? ((Integer) arrayList2.get(i4 + 1)).intValue() : w.length) - intValue;
                            byte[] bArr6 = new byte[intValue2];
                            System.arraycopy(w, intValue, bArr6, 0, intValue2);
                            bArr5[i4] = bArr6;
                            i4++;
                        }
                        bArr = bArr5;
                    } else {
                        if (w[i] != bArr3[i]) {
                            break;
                        }
                        i++;
                    }
                }
                if (bArr != null) {
                    arrayList.add(w);
                    return arrayList;
                }
                Collections.addAll(arrayList, bArr);
            }
            bArr = null;
            if (bArr != null) {
            }
        }
        return arrayList;
    }

    @Override // defpackage.q8
    public final Object b() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    @Override // defpackage.q8
    public final void j(XmlPullParser xmlPullParser) {
        bsc bscVar = new bsc();
        String attributeValue = xmlPullParser.getAttributeValue(null, "FourCC");
        int i = 0;
        if (attributeValue == null) {
            throw new o9r("FourCC", 0);
        }
        String str = (attributeValue.equalsIgnoreCase(ScreenMirroringConfig.Video.CODEC) || attributeValue.equalsIgnoreCase("X264") || attributeValue.equalsIgnoreCase("AVC1") || attributeValue.equalsIgnoreCase("DAVC")) ? "video/avc" : (attributeValue.equalsIgnoreCase(ScreenMirroringConfig.Audio.CODEC) || attributeValue.equalsIgnoreCase("AACL") || attributeValue.equalsIgnoreCase("AACH") || attributeValue.equalsIgnoreCase("AACP")) ? "audio/mp4a-latm" : (attributeValue.equalsIgnoreCase("TTML") || attributeValue.equalsIgnoreCase("DFXP")) ? "application/ttml+xml" : (attributeValue.equalsIgnoreCase("ac-3") || attributeValue.equalsIgnoreCase("dac3")) ? "audio/ac3" : (attributeValue.equalsIgnoreCase("ec-3") || attributeValue.equalsIgnoreCase("dec3")) ? "audio/eac3" : attributeValue.equalsIgnoreCase("dtsc") ? "audio/vnd.dts" : (attributeValue.equalsIgnoreCase("dtsh") || attributeValue.equalsIgnoreCase("dtsl")) ? "audio/vnd.dts.hd" : attributeValue.equalsIgnoreCase("dtse") ? "audio/vnd.dts.hd;profile=lbr" : attributeValue.equalsIgnoreCase("opus") ? "audio/opus" : null;
        int intValue = ((Integer) c("Type")).intValue();
        if (intValue == 2) {
            ArrayList o = o(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            bscVar.l = l5i.p("video/mp4");
            bscVar.t = q8.i("MaxWidth", xmlPullParser);
            bscVar.u = q8.i("MaxHeight", xmlPullParser);
            bscVar.p = o;
        } else if (intValue == 1) {
            if (str == null) {
                str = "audio/mp4a-latm";
            }
            int i2 = q8.i("Channels", xmlPullParser);
            int i3 = q8.i("SamplingRate", xmlPullParser);
            ArrayList o2 = o(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            boolean isEmpty = o2.isEmpty();
            ArrayList arrayList = o2;
            if (isEmpty) {
                arrayList = o2;
                if ("audio/mp4a-latm".equals(str)) {
                    arrayList = Collections.singletonList(zsd.E(i3, i2));
                }
            }
            bscVar.l = l5i.p("audio/mp4");
            bscVar.C = i2;
            bscVar.D = i3;
            bscVar.p = arrayList;
        } else if (intValue == 3) {
            String str2 = (String) c("Subtype");
            if (str2 != null) {
                if (str2.equals("CAPT")) {
                    i = 64;
                } else if (str2.equals("DESC")) {
                    i = 1024;
                }
            }
            bscVar.l = l5i.p("application/mp4");
            bscVar.f = i;
        } else {
            bscVar.l = l5i.p("application/mp4");
        }
        bscVar.a = xmlPullParser.getAttributeValue(null, "Index");
        bscVar.b = (String) c("Name");
        bscVar.m = l5i.p(str);
        bscVar.h = q8.i("Bitrate", xmlPullParser);
        bscVar.d = (String) c("Language");
        this.e = new dsc(bscVar);
    }
}
