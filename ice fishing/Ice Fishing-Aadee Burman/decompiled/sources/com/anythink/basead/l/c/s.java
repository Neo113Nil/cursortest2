package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class s extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9442a = "Creatives";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9443b = "Creative";

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<p> f9444c = new ArrayList<>();

    public s(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f9442a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f9443b)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f9443b);
                    this.f9444c.add(new p(xmlPullParser));
                    xmlPullParser.require(3, null, f9443b);
                }
            }
        }
    }

    public final ArrayList<p> a() {
        return this.f9444c;
    }
}
