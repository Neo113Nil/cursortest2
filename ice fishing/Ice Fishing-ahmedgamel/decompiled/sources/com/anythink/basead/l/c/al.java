package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class al extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10085a = "MediaFiles";

    /* renamed from: b, reason: collision with root package name */
    private static final String f10086b = "MediaFile";

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<ak> f10087c = new ArrayList<>();

    public al(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f10085a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f10086b)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f10086b);
                    this.f10087c.add(new ak(xmlPullParser));
                    xmlPullParser.require(3, null, f10086b);
                }
            }
        }
    }

    public final ArrayList<ak> a() {
        return this.f10087c;
    }
}
