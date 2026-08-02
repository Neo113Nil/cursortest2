package com.connectsdk.service.airplay;

import android.util.Xml;
import defpackage.e7o;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class PListParser {
    public static final String TAG_ARRAY = "array";
    public static final String TAG_DATA = "data";
    public static final String TAG_DATE = "date";
    public static final String TAG_DICT = "dict";
    public static final String TAG_FALSE = "false";
    public static final String TAG_INTEGER = "integer";
    public static final String TAG_KEY = "key";
    public static final String TAG_PLIST = "plist";
    public static final String TAG_REAL = "real";
    public static final String TAG_STRING = "string";
    public static final String TAG_TRUE = "true";
    private static final String ns = null;

    private JSONArray readArray(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException, JSONException {
        JSONArray jSONArray = new JSONArray();
        xmlPullParser.require(2, ns, TAG_ARRAY);
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(TAG_DICT)) {
                jSONArray.put(readDict(xmlPullParser));
            }
        }
        return jSONArray;
    }

    private String readData(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str = ns;
        xmlPullParser.require(2, str, "data");
        String readText = readText(xmlPullParser);
        xmlPullParser.require(3, str, "data");
        return readText;
    }

    private String readDate(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str = ns;
        xmlPullParser.require(2, str, TAG_DATE);
        String readText = readText(xmlPullParser);
        xmlPullParser.require(3, str, TAG_DATE);
        return readText;
    }

    private int readInteger(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str = ns;
        xmlPullParser.require(2, str, TAG_INTEGER);
        int intValue = Integer.valueOf(readText(xmlPullParser)).intValue();
        xmlPullParser.require(3, str, TAG_INTEGER);
        return intValue;
    }

    private String readKey(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str = ns;
        xmlPullParser.require(2, str, TAG_KEY);
        String readText = readText(xmlPullParser);
        xmlPullParser.require(3, str, TAG_KEY);
        return readText;
    }

    private JSONObject readPlist(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, JSONException {
        xmlPullParser.require(2, ns, TAG_PLIST);
        JSONObject jSONObject = null;
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(TAG_DICT)) {
                jSONObject = readDict(xmlPullParser);
            }
        }
        return jSONObject;
    }

    private double readReal(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str = ns;
        xmlPullParser.require(2, str, TAG_REAL);
        double doubleValue = Double.valueOf(readText(xmlPullParser)).doubleValue();
        xmlPullParser.require(3, str, TAG_REAL);
        return doubleValue;
    }

    private String readString(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str = ns;
        xmlPullParser.require(2, str, TAG_STRING);
        String readText = readText(xmlPullParser);
        xmlPullParser.require(3, str, TAG_STRING);
        return readText;
    }

    private String readText(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        if (xmlPullParser.next() != 4) {
            return "";
        }
        String text = xmlPullParser.getText();
        xmlPullParser.nextTag();
        return text;
    }

    private void skip(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            e7o.n();
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

    public JSONObject parse(InputStream inputStream) throws XmlPullParserException, IOException, JSONException {
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            newPullParser.setInput(inputStream, null);
            newPullParser.nextTag();
            return readPlist(newPullParser);
        } finally {
            inputStream.close();
        }
    }

    public JSONObject readDict(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException, JSONException {
        JSONObject jSONObject = new JSONObject();
        xmlPullParser.require(2, ns, TAG_DICT);
        while (true) {
            String str = null;
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals(TAG_KEY)) {
                        str = readKey(xmlPullParser);
                    } else if (str != null) {
                        if (name.equals("data")) {
                            jSONObject.put(str, readData(xmlPullParser));
                        } else if (name.equals(TAG_INTEGER)) {
                            jSONObject.put(str, readInteger(xmlPullParser));
                        } else if (name.equals(TAG_STRING)) {
                            jSONObject.put(str, readString(xmlPullParser));
                        } else if (name.equals(TAG_DATE)) {
                            jSONObject.put(str, readDate(xmlPullParser));
                        } else if (name.equals(TAG_REAL)) {
                            jSONObject.put(str, readReal(xmlPullParser));
                        } else if (name.equals(TAG_ARRAY)) {
                            jSONObject.put(str, readArray(xmlPullParser));
                        } else if (name.equals(TAG_DICT)) {
                            jSONObject.put(str, readDict(xmlPullParser));
                        } else if (name.equals(TAG_TRUE) || name.equals(TAG_FALSE)) {
                            jSONObject.put(str, Boolean.valueOf(name));
                            skip(xmlPullParser);
                        }
                    }
                }
            }
            return jSONObject;
        }
    }

    public JSONObject parse(String str) throws XmlPullParserException, IOException, JSONException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        newPullParser.setInput(new StringReader(str));
        newPullParser.nextTag();
        return readPlist(newPullParser);
    }
}
