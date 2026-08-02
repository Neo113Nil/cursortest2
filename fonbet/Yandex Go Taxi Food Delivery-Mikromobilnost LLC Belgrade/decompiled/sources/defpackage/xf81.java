package defpackage;

import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes7.dex */
public final class xf81 {
    public static String a(XmlPullParser xmlPullParser) {
        String str;
        if (xmlPullParser.next() == 4) {
            str = xmlPullParser.getText();
            xmlPullParser.nextTag();
        } else {
            str = "";
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = jl40.q(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    public static void b(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 2) {
            ny61.r("Check failed.");
            return;
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
