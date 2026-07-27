package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class al extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9456a = "MediaFiles";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9457b = "MediaFile";

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<ak> f9458c = new ArrayList<>();

    public al(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9456a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f9457b)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9457b);
                    this.f9458c.add(new ak(xmlPullParser));
                    xmlPullParser.require(3, null, f9457b);
                }
            }
        }
    }

    public final ArrayList<ak> a() {
        return this.f9458c;
    }
}
