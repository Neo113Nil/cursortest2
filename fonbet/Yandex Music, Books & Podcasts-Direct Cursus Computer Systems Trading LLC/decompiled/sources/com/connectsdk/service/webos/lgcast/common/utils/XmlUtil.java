package com.connectsdk.service.webos.lgcast.common.utils;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public class XmlUtil {
    public static String findElement(String str, String str2) {
        try {
        } catch (Exception e) {
            Logger.error(e);
        }
        if (str == null) {
            throw new Exception("Invalid serviceDescription");
        }
        if (str2 == null) {
            throw new Exception("Invalid elementName");
        }
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8)), "UTF-8");
        String str3 = null;
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            if (eventType == 2) {
                str3 = newPullParser.getName();
            } else if (eventType == 4) {
                if (str3 != null && str3.equals(str2)) {
                    return newPullParser.getText();
                }
            } else if (eventType == 3) {
                str3 = null;
            }
        }
        return null;
    }
}
