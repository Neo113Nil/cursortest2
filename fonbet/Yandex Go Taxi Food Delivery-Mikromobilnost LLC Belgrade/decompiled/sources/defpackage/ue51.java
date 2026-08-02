package defpackage;

import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes10.dex */
public abstract class ue51 {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r6 == (-1)) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static qgg a(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!hq91.e(newPullParser, "x:xmpmeta")) {
            throw ParserException.a(null, "Couldn't find xmp metadata");
        }
        ImmutableList p = ImmutableList.p();
        long j = -9223372036854775807L;
        loop0: while (true) {
            newPullParser.next();
            if (hq91.e(newPullParser, "rdf:Description")) {
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        break loop0;
                    }
                    String b2 = hq91.b(newPullParser, a[i2]);
                    if (b2 == null) {
                        i2++;
                    } else {
                        if (Integer.parseInt(b2) != 1) {
                            break;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 >= 4) {
                                break;
                            }
                            String b3 = hq91.b(newPullParser, b[i3]);
                            if (b3 != null) {
                                j = Long.parseLong(b3);
                            } else {
                                i3++;
                            }
                        }
                        j = -9223372036854775807L;
                        while (true) {
                            if (i >= 2) {
                                p = ImmutableList.p();
                                break;
                            }
                            String b4 = hq91.b(newPullParser, c[i]);
                            if (b4 != null) {
                                p = ImmutableList.s(new ua30("image/jpeg", 0L, 0L), new ua30("video/mp4", Long.parseLong(b4), 0L));
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else if (hq91.e(newPullParser, "Container:Directory")) {
                p = b(newPullParser, "Container", "Item");
            } else if (hq91.e(newPullParser, "GContainer:Directory")) {
                p = b(newPullParser, "GContainer", "GContainerItem");
            }
            if (hq91.d(newPullParser, "x:xmpmeta")) {
                if (!p.isEmpty()) {
                    return new qgg(j, p, 2);
                }
            }
        }
        return null;
    }

    public static ImmutableList b(XmlPullParser xmlPullParser, String str, String str2) {
        piv pivVar = ImmutableList.b;
        ImmutableList.a aVar = new ImmutableList.a();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (hq91.e(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String b2 = hq91.b(xmlPullParser, concat3);
                String b3 = hq91.b(xmlPullParser, concat4);
                String b4 = hq91.b(xmlPullParser, concat5);
                String b5 = hq91.b(xmlPullParser, concat6);
                if (b2 == null || b3 == null) {
                    return ImmutableList.p();
                }
                aVar.a(new ua30(b2, b4 != null ? Long.parseLong(b4) : 0L, b5 != null ? Long.parseLong(b5) : 0L));
            }
        } while (!hq91.d(xmlPullParser, concat2));
        return aVar.g();
    }
}
