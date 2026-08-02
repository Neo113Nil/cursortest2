package defpackage;

import android.text.TextUtils;
import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser;
import androidx.media3.exoplayer.smoothstreaming.manifest.a;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.ArrayList;
import java.util.Collections;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes10.dex */
public final class rxt0 extends a {
    public androidx.media3.common.a e;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m(String str) {
        byte[][] bArr;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            byte[] u = tw21.u(str);
            if (u.length <= 4) {
                byte[] bArr2 = bac.a;
            } else {
                int i = 0;
                while (true) {
                    byte[] bArr3 = bac.a;
                    if (i >= 4) {
                        ArrayList arrayList2 = new ArrayList();
                        int i2 = 0;
                        do {
                            arrayList2.add(Integer.valueOf(i2));
                            i2 += 4;
                            int length = u.length - 4;
                            while (true) {
                                if (i2 > length) {
                                    i2 = -1;
                                    break;
                                }
                                if (u.length - i2 > 4) {
                                    int i3 = 0;
                                    while (true) {
                                        byte[] bArr4 = bac.a;
                                        if (i3 >= 4) {
                                            break;
                                        }
                                        if (u[i2 + i3] != bArr4[i3]) {
                                            break;
                                        }
                                        i3++;
                                    }
                                } else {
                                    byte[] bArr5 = bac.a;
                                }
                                i2++;
                            }
                        } while (i2 != -1);
                        byte[][] bArr6 = new byte[arrayList2.size()][];
                        int i4 = 0;
                        while (i4 < arrayList2.size()) {
                            int intValue = ((Integer) arrayList2.get(i4)).intValue();
                            int intValue2 = (i4 < arrayList2.size() + (-1) ? ((Integer) arrayList2.get(i4 + 1)).intValue() : u.length) - intValue;
                            byte[] bArr7 = new byte[intValue2];
                            System.arraycopy(u, intValue, bArr7, 0, intValue2);
                            bArr6[i4] = bArr7;
                            i4++;
                        }
                        bArr = bArr6;
                    } else {
                        if (u[i] != bArr3[i]) {
                            break;
                        }
                        i++;
                    }
                }
                if (bArr != null) {
                    arrayList.add(u);
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

    @Override // androidx.media3.exoplayer.smoothstreaming.manifest.a
    public final Object b() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    @Override // androidx.media3.exoplayer.smoothstreaming.manifest.a
    public final void j(XmlPullParser xmlPullParser) {
        int i;
        f7s f7sVar = new f7s();
        String attributeValue = xmlPullParser.getAttributeValue(null, "FourCC");
        if (attributeValue == null) {
            throw new SsManifestParser.MissingFieldException("FourCC");
        }
        String str = (attributeValue.equalsIgnoreCase("H264") || attributeValue.equalsIgnoreCase("X264") || attributeValue.equalsIgnoreCase("AVC1") || attributeValue.equalsIgnoreCase("DAVC")) ? "video/avc" : (attributeValue.equalsIgnoreCase("AAC") || attributeValue.equalsIgnoreCase("AACL") || attributeValue.equalsIgnoreCase("AACH") || attributeValue.equalsIgnoreCase("AACP")) ? "audio/mp4a-latm" : (attributeValue.equalsIgnoreCase("TTML") || attributeValue.equalsIgnoreCase("DFXP")) ? "application/ttml+xml" : (attributeValue.equalsIgnoreCase("ac-3") || attributeValue.equalsIgnoreCase("dac3")) ? "audio/ac3" : (attributeValue.equalsIgnoreCase("ec-3") || attributeValue.equalsIgnoreCase("dec3")) ? "audio/eac3" : attributeValue.equalsIgnoreCase("dtsc") ? "audio/vnd.dts" : (attributeValue.equalsIgnoreCase("dtsh") || attributeValue.equalsIgnoreCase("dtsl")) ? "audio/vnd.dts.hd" : attributeValue.equalsIgnoreCase("dtse") ? "audio/vnd.dts.hd;profile=lbr" : attributeValue.equalsIgnoreCase("opus") ? "audio/opus" : null;
        int intValue = ((Integer) c("Type")).intValue();
        if (intValue == 2) {
            ArrayList m = m(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            f7sVar.l = eh20.q("video/mp4");
            f7sVar.t = a.i(xmlPullParser, "MaxWidth");
            f7sVar.u = a.i(xmlPullParser, "MaxHeight");
            f7sVar.p = m;
        } else if (intValue == 1) {
            if (str == null) {
                str = "audio/mp4a-latm";
            }
            int i2 = a.i(xmlPullParser, "Channels");
            int i3 = a.i(xmlPullParser, "SamplingRate");
            ArrayList m2 = m(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            boolean isEmpty = m2.isEmpty();
            ArrayList arrayList = m2;
            if (isEmpty) {
                arrayList = m2;
                if ("audio/mp4a-latm".equals(str)) {
                    arrayList = Collections.singletonList(pw21.c(i3, i2));
                }
            }
            f7sVar.l = eh20.q("audio/mp4");
            f7sVar.C = i2;
            f7sVar.D = i3;
            f7sVar.p = arrayList;
        } else if (intValue == 3) {
            String str2 = (String) c("Subtype");
            if (str2 != null) {
                if (str2.equals("CAPT")) {
                    i = 64;
                } else if (str2.equals("DESC")) {
                    i = 1024;
                }
                f7sVar.l = eh20.q("application/mp4");
                f7sVar.f = i;
            }
            i = 0;
            f7sVar.l = eh20.q("application/mp4");
            f7sVar.f = i;
        } else {
            f7sVar.l = eh20.q("application/mp4");
        }
        f7sVar.a = xmlPullParser.getAttributeValue(null, "Index");
        f7sVar.b = (String) c(PlusAcquisitionSmartOffer.Texts.NAME);
        f7sVar.m = eh20.q(str);
        f7sVar.h = a.i(xmlPullParser, "Bitrate");
        f7sVar.d = (String) c("Language");
        this.e = new androidx.media3.common.a(f7sVar);
    }
}
