package ru.yandex.common.startup;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.aez;
import defpackage.unr0;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import ru.yandex.common.network.ErrorResponse;

/* loaded from: classes4.dex */
public class a {
    public static String a(XmlPullParser xmlPullParser, String str) {
        int eventType = xmlPullParser.getEventType();
        String str2 = null;
        while (eventType != 3 && eventType != 1) {
            if (eventType == 2) {
                if (!str.equals(xmlPullParser.getName())) {
                    StringBuilder x = unr0.x("Error accrues while parsing childless tag (", str, "): another start tag (");
                    x.append(xmlPullParser.getName());
                    x.append(") was found!");
                    throw new AssertionError(x.toString());
                }
            } else if (eventType == 4) {
                str2 = xmlPullParser.getText();
            }
            eventType = xmlPullParser.next();
        }
        if (str.equals(xmlPullParser.getName())) {
            return str2;
        }
        StringBuilder x2 = unr0.x("Error accrues while parsing childless tag (", str, "): another end tag (");
        x2.append(xmlPullParser.getName());
        x2.append(") was found!");
        throw new AssertionError(x2.toString());
    }

    public static StartupResponse b(int i, InputStream inputStream) {
        StartupResponse startupResponse = new StartupResponse(i);
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            newInstance.setNamespaceAware(false);
            XmlPullParser newPullParser = newInstance.newPullParser();
            newPullParser.setInput(inputStream, null);
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                if (eventType == 2) {
                    String name = newPullParser.getName();
                    if ("error".equals(name)) {
                        startupResponse.setError(new ErrorResponse(newPullParser.getAttributeValue(null, AuthSdkActivity.RESPONSE_TYPE_CODE)));
                        return startupResponse;
                    }
                    if ("uuid".equals(name)) {
                        startupResponse.uuid = a(newPullParser, name);
                    } else if ("app".equals(name)) {
                        startupResponse.versionCurrent = newPullParser.getAttributeValue(null, "cur_app_version");
                        startupResponse.versionMin = newPullParser.getAttributeValue(null, "min_app_version");
                    }
                }
            }
            return startupResponse;
        } catch (XmlPullParserException e) {
            aez.a("[YaSearch:StartupParser]", "Error while parsing StartupResponse", e);
            return startupResponse;
        }
    }
}
