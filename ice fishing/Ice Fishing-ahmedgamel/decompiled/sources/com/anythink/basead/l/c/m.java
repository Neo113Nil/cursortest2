package com.anythink.basead.l.c;

import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class m extends ay {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10210a = "CompanionAds";

    /* renamed from: b, reason: collision with root package name */
    private static final String f10211b = "Companion";

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<l> f10212c = new ArrayList<>();

    public m(XmlPullParser xmlPullParser) {
        xmlPullParser.require(2, null, f10210a);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name == null || !name.equals(f10211b)) {
                    ay.b(xmlPullParser);
                } else {
                    xmlPullParser.require(2, null, f10211b);
                    this.f10212c.add(new l(xmlPullParser));
                    xmlPullParser.require(3, null, f10211b);
                }
            }
        }
    }

    public final ArrayList<l> a() {
        return this.f10212c;
    }
}
