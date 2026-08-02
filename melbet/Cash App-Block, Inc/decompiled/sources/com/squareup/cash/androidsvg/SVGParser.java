package com.squareup.cash.androidsvg;

import android.graphics.Matrix;
import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.common.util.TimedValueQueue;
import androidx.recyclerview.widget.RecyclerView;
import com.caverock.androidsvg.SVG;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.ext.DefaultHandler2;

/* loaded from: classes4.dex */
public final class SVGParser extends DefaultHandler2 {
    public SVG$GraphicsElement currentElement;
    public int ignoreDepth;
    public boolean ignoring;
    public JCAContext svgDocument;

    /* loaded from: classes5.dex */
    public abstract class AspectRatioKeywords {
        public static final HashMap aspectRatioKeywords;

        static {
            HashMap hashMap = new HashMap(10);
            aspectRatioKeywords = hashMap;
            hashMap.put("none", PreserveAspectRatio$Alignment.None);
            hashMap.put("xMinYMin", PreserveAspectRatio$Alignment.XMinYMin);
            hashMap.put("xMidYMin", PreserveAspectRatio$Alignment.XMidYMin);
            hashMap.put("xMaxYMin", PreserveAspectRatio$Alignment.XMaxYMin);
            hashMap.put("xMinYMid", PreserveAspectRatio$Alignment.XMinYMid);
            hashMap.put("xMidYMid", PreserveAspectRatio$Alignment.XMidYMid);
            hashMap.put("xMaxYMid", PreserveAspectRatio$Alignment.XMaxYMid);
            hashMap.put("xMinYMax", PreserveAspectRatio$Alignment.XMinYMax);
            hashMap.put("xMidYMax", PreserveAspectRatio$Alignment.XMidYMax);
            hashMap.put("xMaxYMax", PreserveAspectRatio$Alignment.XMaxYMax);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SVGAttr {
        public static final /* synthetic */ SVGAttr[] $VALUES;
        public static final SVGAttr CLASS;
        public static final SVGAttr UNSUPPORTED;
        public static final HashMap cache;
        public static final SVGAttr points;
        public static final SVGAttr transform;

        static {
            SVGAttr sVGAttr = new SVGAttr("CLASS", 0);
            CLASS = sVGAttr;
            SVGAttr sVGAttr2 = new SVGAttr("clipPathUnits", 1);
            SVGAttr sVGAttr3 = new SVGAttr("cx", 2);
            SVGAttr sVGAttr4 = new SVGAttr("cy", 3);
            SVGAttr sVGAttr5 = new SVGAttr("d", 4);
            SVGAttr sVGAttr6 = new SVGAttr("font", 5);
            SVGAttr sVGAttr7 = new SVGAttr("height", 6);
            SVGAttr sVGAttr8 = new SVGAttr("pathLength", 7);
            SVGAttr sVGAttr9 = new SVGAttr("points", 8);
            points = sVGAttr9;
            SVGAttr sVGAttr10 = new SVGAttr("preserveAspectRatio", 9);
            SVGAttr sVGAttr11 = new SVGAttr("r", 10);
            SVGAttr sVGAttr12 = new SVGAttr("rx", 11);
            SVGAttr sVGAttr13 = new SVGAttr("ry", 12);
            SVGAttr sVGAttr14 = new SVGAttr("transform", 13);
            transform = sVGAttr14;
            SVGAttr sVGAttr15 = new SVGAttr("version", 14);
            SVGAttr sVGAttr16 = new SVGAttr("viewBox", 15);
            SVGAttr sVGAttr17 = new SVGAttr("width", 16);
            SVGAttr sVGAttr18 = new SVGAttr("x", 17);
            SVGAttr sVGAttr19 = new SVGAttr("y", 18);
            SVGAttr sVGAttr20 = new SVGAttr("x1", 19);
            SVGAttr sVGAttr21 = new SVGAttr("y1", 20);
            SVGAttr sVGAttr22 = new SVGAttr("x2", 21);
            SVGAttr sVGAttr23 = new SVGAttr("y2", 22);
            SVGAttr sVGAttr24 = new SVGAttr("UNSUPPORTED", 23);
            UNSUPPORTED = sVGAttr24;
            $VALUES = new SVGAttr[]{sVGAttr, sVGAttr2, sVGAttr3, sVGAttr4, sVGAttr5, sVGAttr6, sVGAttr7, sVGAttr8, sVGAttr9, sVGAttr10, sVGAttr11, sVGAttr12, sVGAttr13, sVGAttr14, sVGAttr15, sVGAttr16, sVGAttr17, sVGAttr18, sVGAttr19, sVGAttr20, sVGAttr21, sVGAttr22, sVGAttr23, sVGAttr24};
            cache = new HashMap();
        }

        public static SVGAttr fromString(String str) {
            HashMap hashMap = cache;
            SVGAttr sVGAttr = (SVGAttr) hashMap.get(str);
            if (sVGAttr != null) {
                return sVGAttr;
            }
            boolean equals = str.equals("class");
            SVGAttr sVGAttr2 = CLASS;
            if (equals) {
                hashMap.put(str, sVGAttr2);
                return sVGAttr2;
            }
            int indexOf = str.indexOf(95);
            SVGAttr sVGAttr3 = UNSUPPORTED;
            if (indexOf != -1) {
                hashMap.put(str, sVGAttr3);
                return sVGAttr3;
            }
            try {
                SVGAttr valueOf = valueOf(str.replace('-', '_'));
                if (valueOf != sVGAttr2) {
                    hashMap.put(str, valueOf);
                    return valueOf;
                }
            } catch (IllegalArgumentException unused) {
            }
            hashMap.put(str, sVGAttr3);
            return sVGAttr3;
        }

        public static SVGAttr valueOf(String str) {
            return (SVGAttr) Enum.valueOf(SVGAttr.class, str);
        }

        public static SVGAttr[] values() {
            return (SVGAttr[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SVGElem {
        public static final /* synthetic */ SVGElem[] $VALUES;
        public static final SVGElem UNSUPPORTED;
        public static final HashMap cache;

        /* JADX INFO: Fake field, exist only in values array */
        SVGElem EF0;

        static {
            SVGElem sVGElem = new SVGElem("svg", 0);
            SVGElem sVGElem2 = new SVGElem("a", 1);
            SVGElem sVGElem3 = new SVGElem("circle", 2);
            SVGElem sVGElem4 = new SVGElem("clipPath", 3);
            SVGElem sVGElem5 = new SVGElem("defs", 4);
            SVGElem sVGElem6 = new SVGElem("ellipse", 5);
            SVGElem sVGElem7 = new SVGElem("g", 6);
            SVGElem sVGElem8 = new SVGElem("line", 7);
            SVGElem sVGElem9 = new SVGElem("path", 8);
            SVGElem sVGElem10 = new SVGElem("polygon", 9);
            SVGElem sVGElem11 = new SVGElem("polyline", 10);
            SVGElem sVGElem12 = new SVGElem("rect", 11);
            SVGElem sVGElem13 = new SVGElem("symbol", 12);
            SVGElem sVGElem14 = new SVGElem("UNSUPPORTED", 13);
            UNSUPPORTED = sVGElem14;
            $VALUES = new SVGElem[]{sVGElem, sVGElem2, sVGElem3, sVGElem4, sVGElem5, sVGElem6, sVGElem7, sVGElem8, sVGElem9, sVGElem10, sVGElem11, sVGElem12, sVGElem13, sVGElem14};
            cache = new HashMap();
        }

        public static SVGElem fromString(String str) {
            HashMap hashMap = cache;
            SVGElem sVGElem = (SVGElem) hashMap.get(str);
            if (sVGElem != null) {
                return sVGElem;
            }
            try {
                SVGElem valueOf = valueOf(str);
                hashMap.put(str, valueOf);
                return valueOf;
            } catch (IllegalArgumentException unused) {
                SVGElem sVGElem2 = UNSUPPORTED;
                hashMap.put(str, sVGElem2);
                return sVGElem2;
            }
        }

        public static SVGElem valueOf(String str) {
            return (SVGElem) Enum.valueOf(SVGElem.class, str);
        }

        public static SVGElem[] values() {
            return (SVGElem[]) $VALUES.clone();
        }
    }

    public static void parseAttributesCore(SVG$GraphicsElement sVG$GraphicsElement, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                attributes.getValue(i).getClass();
                return;
            } else {
                if (qName.equals("xml:space")) {
                    String trim = attributes.getValue(i).trim();
                    if (!"default".equals(trim) && !"preserve".equals(trim)) {
                        throw new SAXException(Recorder$$ExternalSyntheticOutline2.m("Invalid value for \"xml:space\" attribute: ", trim));
                    }
                    return;
                }
            }
        }
    }

    public static void parseAttributesPolyLine(SVG$PolyLine sVG$PolyLine, Attributes attributes, String str) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.points) {
                TimedValueQueue timedValueQueue = new TimedValueQueue(attributes.getValue(i), 9);
                ArrayList arrayList = new ArrayList();
                timedValueQueue.skipWhitespace();
                while (!timedValueQueue.empty()) {
                    float nextFloat = timedValueQueue.nextFloat();
                    if (Float.isNaN(nextFloat)) {
                        throw new SAXException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    timedValueQueue.skipCommaWhitespace();
                    float nextFloat2 = timedValueQueue.nextFloat();
                    if (Float.isNaN(nextFloat2)) {
                        throw new SAXException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    timedValueQueue.skipCommaWhitespace();
                    arrayList.add(Float.valueOf(nextFloat));
                    arrayList.add(Float.valueOf(nextFloat2));
                }
                sVG$PolyLine.points = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    sVG$PolyLine.points[i2] = ((Float) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0250 A[LOOP:1: B:7:0x0028->B:67:0x0250, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x024d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void parseAttributesTransform(SVG$HasTransform sVG$HasTransform, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.transform) {
                String value = attributes.getValue(i);
                Matrix matrix = new Matrix();
                TimedValueQueue timedValueQueue = new TimedValueQueue(value, 9);
                timedValueQueue.skipWhitespace();
                while (!timedValueQueue.empty()) {
                    String str = (String) timedValueQueue.timestamps;
                    String str2 = null;
                    if (!timedValueQueue.empty()) {
                        int i2 = timedValueQueue.first;
                        int charAt = str.charAt(i2);
                        while (true) {
                            if ((charAt >= 97 && charAt <= 122) || (charAt >= 65 && charAt <= 90)) {
                                charAt = timedValueQueue.advanceChar();
                            }
                        }
                        int i3 = timedValueQueue.first;
                        while (TimedValueQueue.isWhitespace$1(charAt)) {
                            charAt = timedValueQueue.advanceChar();
                        }
                        if (charAt == 40) {
                            timedValueQueue.first++;
                            str2 = str.substring(i2, i3);
                        } else {
                            timedValueQueue.first = i2;
                        }
                    }
                    if (str2 == null) {
                        throw new SAXException("Bad transform function encountered in transform list: ".concat(value));
                    }
                    switch (str2) {
                        case "matrix":
                            timedValueQueue.skipWhitespace();
                            float nextFloat = timedValueQueue.nextFloat();
                            timedValueQueue.skipCommaWhitespace();
                            float nextFloat2 = timedValueQueue.nextFloat();
                            timedValueQueue.skipCommaWhitespace();
                            float nextFloat3 = timedValueQueue.nextFloat();
                            timedValueQueue.skipCommaWhitespace();
                            float nextFloat4 = timedValueQueue.nextFloat();
                            timedValueQueue.skipCommaWhitespace();
                            float nextFloat5 = timedValueQueue.nextFloat();
                            timedValueQueue.skipCommaWhitespace();
                            float nextFloat6 = timedValueQueue.nextFloat();
                            timedValueQueue.skipWhitespace();
                            if (Float.isNaN(nextFloat6) || !timedValueQueue.consume()) {
                                throw new SAXException("Invalid transform list: ".concat(value));
                            }
                            Matrix matrix2 = new Matrix();
                            matrix2.setValues(new float[]{nextFloat, nextFloat3, nextFloat5, nextFloat2, nextFloat4, nextFloat6, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f});
                            matrix.preConcat(matrix2);
                            if (!timedValueQueue.empty()) {
                                sVG$HasTransform.setTransform(matrix);
                                break;
                            } else {
                                timedValueQueue.skipCommaWhitespace();
                            }
                            break;
                        case "rotate":
                            timedValueQueue.skipWhitespace();
                            float nextFloat7 = timedValueQueue.nextFloat();
                            float possibleNextFloat = timedValueQueue.possibleNextFloat();
                            float possibleNextFloat2 = timedValueQueue.possibleNextFloat();
                            timedValueQueue.skipWhitespace();
                            if (Float.isNaN(nextFloat7) || !timedValueQueue.consume()) {
                                throw new SAXException("Invalid transform list: ".concat(value));
                            }
                            if (Float.isNaN(possibleNextFloat)) {
                                matrix.preRotate(nextFloat7);
                            } else {
                                if (Float.isNaN(possibleNextFloat2)) {
                                    throw new SAXException("Invalid transform list: ".concat(value));
                                }
                                matrix.preRotate(nextFloat7, possibleNextFloat, possibleNextFloat2);
                            }
                            if (!timedValueQueue.empty()) {
                            }
                            break;
                        case "scale":
                            timedValueQueue.skipWhitespace();
                            float nextFloat8 = timedValueQueue.nextFloat();
                            float possibleNextFloat3 = timedValueQueue.possibleNextFloat();
                            timedValueQueue.skipWhitespace();
                            if (Float.isNaN(nextFloat8) || !timedValueQueue.consume()) {
                                throw new SAXException("Invalid transform list: ".concat(value));
                            }
                            if (Float.isNaN(possibleNextFloat3)) {
                                matrix.preScale(nextFloat8, nextFloat8);
                            } else {
                                matrix.preScale(nextFloat8, possibleNextFloat3);
                            }
                            if (!timedValueQueue.empty()) {
                            }
                            break;
                        case "skewX":
                            timedValueQueue.skipWhitespace();
                            float nextFloat9 = timedValueQueue.nextFloat();
                            timedValueQueue.skipWhitespace();
                            if (Float.isNaN(nextFloat9) || !timedValueQueue.consume()) {
                                throw new SAXException("Invalid transform list: ".concat(value));
                            }
                            matrix.preSkew((float) Math.tan(Math.toRadians(nextFloat9)), RecyclerView.DECELERATION_RATE);
                            if (!timedValueQueue.empty()) {
                            }
                            break;
                        case "skewY":
                            timedValueQueue.skipWhitespace();
                            float nextFloat10 = timedValueQueue.nextFloat();
                            timedValueQueue.skipWhitespace();
                            if (Float.isNaN(nextFloat10) || !timedValueQueue.consume()) {
                                throw new SAXException("Invalid transform list: ".concat(value));
                            }
                            matrix.preSkew(RecyclerView.DECELERATION_RATE, (float) Math.tan(Math.toRadians(nextFloat10)));
                            if (!timedValueQueue.empty()) {
                            }
                            break;
                        case "translate":
                            timedValueQueue.skipWhitespace();
                            float nextFloat11 = timedValueQueue.nextFloat();
                            float possibleNextFloat4 = timedValueQueue.possibleNextFloat();
                            timedValueQueue.skipWhitespace();
                            if (Float.isNaN(nextFloat11) || !timedValueQueue.consume()) {
                                throw new SAXException("Invalid transform list: ".concat(value));
                            }
                            if (Float.isNaN(possibleNextFloat4)) {
                                matrix.preTranslate(nextFloat11, RecyclerView.DECELERATION_RATE);
                            } else {
                                matrix.preTranslate(nextFloat11, possibleNextFloat4);
                            }
                            if (!timedValueQueue.empty()) {
                            }
                            break;
                        default:
                            throw new SAXException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Invalid transform list fn: ", str2, ")"));
                    }
                }
                sVG$HasTransform.setTransform(matrix);
            }
        }
    }

    public static void parseAttributesViewBox(SVG$SvgViewBoxContainer sVG$SvgViewBoxContainer, Attributes attributes) {
        PreserveAspectRatio$Scale preserveAspectRatio$Scale;
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int ordinal = SVGAttr.fromString(attributes.getLocalName(i)).ordinal();
            if (ordinal == 9) {
                TimedValueQueue timedValueQueue = new TimedValueQueue(trim, 9);
                timedValueQueue.skipWhitespace();
                String nextToken = timedValueQueue.nextToken();
                if ("defer".equals(nextToken)) {
                    timedValueQueue.skipWhitespace();
                    nextToken = timedValueQueue.nextToken();
                }
                PreserveAspectRatio$Alignment preserveAspectRatio$Alignment = (PreserveAspectRatio$Alignment) AspectRatioKeywords.aspectRatioKeywords.get(nextToken);
                timedValueQueue.skipWhitespace();
                if (timedValueQueue.empty()) {
                    preserveAspectRatio$Scale = null;
                } else {
                    String nextToken2 = timedValueQueue.nextToken();
                    nextToken2.getClass();
                    if (nextToken2.equals("meet")) {
                        preserveAspectRatio$Scale = PreserveAspectRatio$Scale.Meet;
                    } else {
                        if (!nextToken2.equals("slice")) {
                            throw new SAXException("Invalid preserveAspectRatio definition: ".concat(trim));
                        }
                        preserveAspectRatio$Scale = PreserveAspectRatio$Scale.Slice;
                    }
                }
                preserveAspectRatio$Alignment.getClass();
                preserveAspectRatio$Scale.getClass();
            } else if (ordinal != 15) {
                continue;
            } else {
                TimedValueQueue timedValueQueue2 = new TimedValueQueue(trim, 9);
                timedValueQueue2.skipWhitespace();
                float nextFloat = timedValueQueue2.nextFloat();
                timedValueQueue2.skipCommaWhitespace();
                float nextFloat2 = timedValueQueue2.nextFloat();
                timedValueQueue2.skipCommaWhitespace();
                float nextFloat3 = timedValueQueue2.nextFloat();
                timedValueQueue2.skipCommaWhitespace();
                float nextFloat4 = timedValueQueue2.nextFloat();
                if (Float.isNaN(nextFloat) || Float.isNaN(nextFloat2) || Float.isNaN(nextFloat3) || Float.isNaN(nextFloat4)) {
                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid viewBox definition - should have four numbers");
                    return;
                } else if (nextFloat3 < RecyclerView.DECELERATION_RATE) {
                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid viewBox. width cannot be negative");
                    return;
                } else {
                    if (nextFloat4 < RecyclerView.DECELERATION_RATE) {
                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid viewBox. height cannot be negative");
                        return;
                    }
                    sVG$SvgViewBoxContainer.viewBox = new SVG$Box(nextFloat, nextFloat2, nextFloat3, nextFloat4);
                }
            }
        }
    }

    public static float parseFloat(int i, String str) {
        float parseNumber = new NumberParser().parseNumber(0, i, str);
        if (Float.isNaN(parseNumber)) {
            throw new SAXException(Recorder$$ExternalSyntheticOutline2.m("Invalid float value: ", str));
        }
        return parseNumber;
    }

    public static SVG$Length parseLength(String str) {
        int i;
        if (str.length() == 0) {
            WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid length value (empty string)");
            return null;
        }
        int length = str.length();
        char charAt = str.charAt(length - 1);
        if (charAt == '%') {
            length--;
            i = 9;
        } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                i = SVG$Unit$EnumUnboxingLocalUtility.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new SAXException("Invalid length unit specifier: ".concat(str));
            }
        } else {
            i = 1;
        }
        try {
            float parseFloat = parseFloat(length, str);
            SVG$Length sVG$Length = new SVG$Length();
            sVG$Length.value = parseFloat;
            sVG$Length.unit = i;
            return sVG$Length;
        } catch (NumberFormatException e) {
            throw new SAXException("Invalid length value: ".concat(str), e);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
    }

    @Override // org.xml.sax.ext.DefaultHandler2, org.xml.sax.ext.LexicalHandler
    public final void comment(char[] cArr, int i, int i2) {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        if (this.ignoring) {
            int i = this.ignoreDepth - 1;
            this.ignoreDepth = i;
            if (i == 0) {
                this.ignoring = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int ordinal = SVGElem.fromString(str2).ordinal();
            if (ordinal == 0 || ordinal == 6 || ordinal == 12 || ordinal == 3 || ordinal == 4) {
                this.currentElement = this.currentElement.parent;
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
        JCAContext jCAContext = new JCAContext((byte) 0, 14);
        jCAContext.provider = null;
        this.svgDocument = jCAContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:381:0x0741, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ed, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0509 A[SYNTHETIC] */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        int i;
        Integer valueOf;
        float nextFloat;
        char charAt;
        Integer valueOf2;
        int i2 = 1;
        if (this.ignoring) {
            this.ignoreDepth++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            int i3 = 0;
            switch (SVGElem.fromString(str2.length() > 0 ? str2 : str3).ordinal()) {
                case 0:
                    SVG$Svg sVG$Svg = new SVG$Svg();
                    sVG$Svg.parent = this.currentElement;
                    parseAttributesCore(sVG$Svg, attributes);
                    parseAttributesViewBox(sVG$Svg, attributes);
                    while (i3 < attributes.getLength()) {
                        String trim = attributes.getValue(i3).trim();
                        int ordinal = SVGAttr.fromString(attributes.getLocalName(i3)).ordinal();
                        if (ordinal == 6) {
                            SVG$Length parseLength = parseLength(trim);
                            sVG$Svg.height = parseLength;
                            if (parseLength.isNegative()) {
                                WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid <svg> element. height cannot be negative");
                                break;
                            }
                        } else if (ordinal != 14) {
                            switch (ordinal) {
                                case 16:
                                    SVG$Length parseLength2 = parseLength(trim);
                                    sVG$Svg.width = parseLength2;
                                    if (parseLength2.isNegative()) {
                                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid <svg> element. width cannot be negative");
                                        break;
                                    } else {
                                        break;
                                    }
                                case 17:
                                    parseLength(trim);
                                    break;
                                case 18:
                                    parseLength(trim);
                                    break;
                            }
                        } else {
                            continue;
                        }
                        i3++;
                    }
                    SVG$GraphicsElement sVG$GraphicsElement = this.currentElement;
                    if (sVG$GraphicsElement == null) {
                        this.svgDocument.provider = sVG$Svg;
                    } else {
                        sVG$GraphicsElement.addChild(sVG$Svg);
                    }
                    this.currentElement = sVG$Svg;
                    break;
                case 1:
                case 6:
                    if (this.currentElement != null) {
                        SVG$Group sVG$Group = new SVG$Group();
                        sVG$Group.parent = this.currentElement;
                        parseAttributesCore(sVG$Group, attributes);
                        parseAttributesTransform(sVG$Group, attributes);
                        this.currentElement.addChild(sVG$Group);
                        this.currentElement = sVG$Group;
                        break;
                    } else {
                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        break;
                    }
                case 2:
                    SVG$GraphicsElement sVG$GraphicsElement2 = this.currentElement;
                    if (sVG$GraphicsElement2 != null) {
                        SVG$Circle sVG$Circle = new SVG$Circle(false);
                        sVG$Circle.parent = sVG$GraphicsElement2;
                        parseAttributesCore(sVG$Circle, attributes);
                        parseAttributesTransform(sVG$Circle, attributes);
                        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
                            String trim2 = attributes.getValue(i4).trim();
                            int ordinal2 = SVGAttr.fromString(attributes.getLocalName(i4)).ordinal();
                            if (ordinal2 == 2) {
                                sVG$Circle.cx = parseLength(trim2);
                            } else if (ordinal2 == 3) {
                                sVG$Circle.cy = parseLength(trim2);
                            } else if (ordinal2 == 10) {
                                SVG$Length parseLength3 = parseLength(trim2);
                                sVG$Circle.r = parseLength3;
                                if (parseLength3.isNegative()) {
                                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid <circle> element. r cannot be negative");
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        this.currentElement.addChild(sVG$Circle);
                        break;
                    } else {
                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        break;
                    }
                case 3:
                    if (this.currentElement != null) {
                        SVG$Defs sVG$Defs = new SVG$Defs();
                        sVG$Defs.parent = this.currentElement;
                        parseAttributesCore(sVG$Defs, attributes);
                        parseAttributesTransform(sVG$Defs, attributes);
                        for (int i5 = 0; i5 < attributes.getLength(); i5++) {
                            String trim3 = attributes.getValue(i5).trim();
                            if (SVGAttr.fromString(attributes.getLocalName(i5)).ordinal() == 1 && !"objectBoundingBox".equals(trim3) && !"userSpaceOnUse".equals(trim3)) {
                                WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid value for attribute clipPathUnits");
                                break;
                            }
                        }
                        this.currentElement.addChild(sVG$Defs);
                        this.currentElement = sVG$Defs;
                        break;
                    } else {
                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        break;
                    }
                    break;
                case 4:
                    if (this.currentElement != null) {
                        SVG$Defs sVG$Defs2 = new SVG$Defs();
                        sVG$Defs2.parent = this.currentElement;
                        parseAttributesCore(sVG$Defs2, attributes);
                        parseAttributesTransform(sVG$Defs2, attributes);
                        this.currentElement.addChild(sVG$Defs2);
                        this.currentElement = sVG$Defs2;
                        break;
                    } else {
                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        break;
                    }
                case 5:
                    SVG$GraphicsElement sVG$GraphicsElement3 = this.currentElement;
                    if (sVG$GraphicsElement3 != null) {
                        SVG$Ellipse sVG$Ellipse = new SVG$Ellipse(false);
                        sVG$Ellipse.parent = sVG$GraphicsElement3;
                        parseAttributesCore(sVG$Ellipse, attributes);
                        parseAttributesTransform(sVG$Ellipse, attributes);
                        for (int i6 = 0; i6 < attributes.getLength(); i6++) {
                            String trim4 = attributes.getValue(i6).trim();
                            int ordinal3 = SVGAttr.fromString(attributes.getLocalName(i6)).ordinal();
                            if (ordinal3 == 2) {
                                sVG$Ellipse.cx = parseLength(trim4);
                            } else if (ordinal3 == 3) {
                                sVG$Ellipse.cy = parseLength(trim4);
                            } else if (ordinal3 == 11) {
                                SVG$Length parseLength4 = parseLength(trim4);
                                sVG$Ellipse.rx = parseLength4;
                                if (parseLength4.isNegative()) {
                                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid <ellipse> element. rx cannot be negative");
                                    break;
                                }
                            } else if (ordinal3 == 12) {
                                SVG$Length parseLength5 = parseLength(trim4);
                                sVG$Ellipse.ry = parseLength5;
                                if (parseLength5.isNegative()) {
                                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid <ellipse> element. ry cannot be negative");
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        this.currentElement.addChild(sVG$Ellipse);
                        break;
                    } else {
                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        break;
                    }
                case 7:
                    SVG$GraphicsElement sVG$GraphicsElement4 = this.currentElement;
                    if (sVG$GraphicsElement4 != null) {
                        SVG$Line sVG$Line = new SVG$Line(false);
                        sVG$Line.parent = sVG$GraphicsElement4;
                        parseAttributesCore(sVG$Line, attributes);
                        parseAttributesTransform(sVG$Line, attributes);
                        for (int i7 = 0; i7 < attributes.getLength(); i7++) {
                            String trim5 = attributes.getValue(i7).trim();
                            switch (SVGAttr.fromString(attributes.getLocalName(i7)).ordinal()) {
                                case 19:
                                    sVG$Line.x1 = parseLength(trim5);
                                    break;
                                case 20:
                                    sVG$Line.y1 = parseLength(trim5);
                                    break;
                                case 21:
                                    sVG$Line.x2 = parseLength(trim5);
                                    break;
                                case 22:
                                    sVG$Line.y2 = parseLength(trim5);
                                    break;
                            }
                        }
                        this.currentElement.addChild(sVG$Line);
                        break;
                    } else {
                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        break;
                    }
                    break;
                case 8:
                    SVG$GraphicsElement sVG$GraphicsElement5 = this.currentElement;
                    if (sVG$GraphicsElement5 != null) {
                        SVG$Path sVG$Path = new SVG$Path(false);
                        sVG$Path.parent = sVG$GraphicsElement5;
                        parseAttributesCore(sVG$Path, attributes);
                        parseAttributesTransform(sVG$Path, attributes);
                        int i8 = 0;
                        while (i8 < attributes.getLength()) {
                            String trim6 = attributes.getValue(i8).trim();
                            int ordinal4 = SVGAttr.fromString(attributes.getLocalName(i8)).ordinal();
                            float f = RecyclerView.DECELERATION_RATE;
                            if (ordinal4 != 4) {
                                if (ordinal4 == 7) {
                                    int length = trim6.length();
                                    if (length != 0) {
                                        if (parseFloat(length, trim6) < RecyclerView.DECELERATION_RATE) {
                                            WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid <path> element. pathLength cannot be negative");
                                            break;
                                        }
                                    } else {
                                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid float value (empty string)");
                                        break;
                                    }
                                }
                                i = i8;
                            } else {
                                TimedValueQueue timedValueQueue = new TimedValueQueue(trim6, 9);
                                SVG.PathDefinition pathDefinition = new SVG.PathDefinition(i2);
                                pathDefinition.commandsLength = i3;
                                pathDefinition.coordsLength = i3;
                                byte b = 8;
                                pathDefinition.commands = new byte[8];
                                pathDefinition.coords = new float[16];
                                if (!timedValueQueue.empty()) {
                                    int i9 = timedValueQueue.first;
                                    if (i9 == timedValueQueue.size) {
                                        valueOf = null;
                                    } else {
                                        String str4 = (String) timedValueQueue.timestamps;
                                        timedValueQueue.first = i9 + 1;
                                        valueOf = Integer.valueOf(str4.charAt(i9));
                                    }
                                    int intValue = valueOf.intValue();
                                    if (intValue == 77 || intValue == 109) {
                                        float f2 = 0.0f;
                                        float f3 = 0.0f;
                                        float f4 = 0.0f;
                                        float f5 = 0.0f;
                                        float f6 = 0.0f;
                                        float f7 = 0.0f;
                                        while (true) {
                                            timedValueQueue.skipWhitespace();
                                            float f8 = f;
                                            switch (intValue) {
                                                case 65:
                                                case 97:
                                                    i = i8;
                                                    float nextFloat2 = timedValueQueue.nextFloat();
                                                    float checkedNextFloat = timedValueQueue.checkedNextFloat(nextFloat2);
                                                    float checkedNextFloat2 = timedValueQueue.checkedNextFloat(checkedNextFloat);
                                                    Boolean checkedNextFlag = timedValueQueue.checkedNextFlag(Float.valueOf(checkedNextFloat2));
                                                    Boolean checkedNextFlag2 = timedValueQueue.checkedNextFlag(checkedNextFlag);
                                                    if (checkedNextFlag2 == null) {
                                                        nextFloat = Float.NaN;
                                                    } else {
                                                        timedValueQueue.skipCommaWhitespace();
                                                        nextFloat = timedValueQueue.nextFloat();
                                                    }
                                                    float f9 = nextFloat;
                                                    float checkedNextFloat3 = timedValueQueue.checkedNextFloat(f9);
                                                    if (!Float.isNaN(checkedNextFloat3) && nextFloat2 >= f8 && checkedNextFloat >= f8) {
                                                        if (intValue == 97) {
                                                            checkedNextFloat3 += f2;
                                                            f3 = f9 + f3;
                                                        } else {
                                                            f3 = f9;
                                                        }
                                                        f2 = checkedNextFloat3;
                                                        pathDefinition.addCommand((byte) ((checkedNextFlag.booleanValue() ? 2 : 0) | 4 | (checkedNextFlag2.booleanValue() ? 1 : 0)));
                                                        pathDefinition.coordsEnsure(5);
                                                        float[] fArr = pathDefinition.coords;
                                                        int i10 = pathDefinition.coordsLength;
                                                        int i11 = i10 + 1;
                                                        pathDefinition.coordsLength = i11;
                                                        fArr[i10] = nextFloat2;
                                                        int i12 = i10 + 2;
                                                        pathDefinition.coordsLength = i12;
                                                        fArr[i11] = checkedNextFloat;
                                                        int i13 = i10 + 3;
                                                        pathDefinition.coordsLength = i13;
                                                        fArr[i12] = checkedNextFloat2;
                                                        int i14 = i10 + 4;
                                                        pathDefinition.coordsLength = i14;
                                                        fArr[i13] = f3;
                                                        pathDefinition.coordsLength = i10 + 5;
                                                        fArr[i14] = f2;
                                                        f5 = f2;
                                                        f4 = f3;
                                                        timedValueQueue.skipCommaWhitespace();
                                                        if (!timedValueQueue.empty()) {
                                                            break;
                                                        } else {
                                                            int i15 = timedValueQueue.first;
                                                            if (i15 != timedValueQueue.size && (((charAt = ((String) timedValueQueue.timestamps).charAt(i15)) >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z'))) {
                                                                int i16 = timedValueQueue.first;
                                                                if (i16 == timedValueQueue.size) {
                                                                    valueOf2 = null;
                                                                } else {
                                                                    String str5 = (String) timedValueQueue.timestamps;
                                                                    timedValueQueue.first = i16 + 1;
                                                                    valueOf2 = Integer.valueOf(str5.charAt(i16));
                                                                }
                                                                intValue = valueOf2.intValue();
                                                            }
                                                            f = f8;
                                                            i8 = i;
                                                            b = 8;
                                                        }
                                                    }
                                                    break;
                                                case 67:
                                                case 99:
                                                    float nextFloat3 = timedValueQueue.nextFloat();
                                                    float checkedNextFloat4 = timedValueQueue.checkedNextFloat(nextFloat3);
                                                    f4 = timedValueQueue.checkedNextFloat(checkedNextFloat4);
                                                    float checkedNextFloat5 = timedValueQueue.checkedNextFloat(f4);
                                                    i = i8;
                                                    float checkedNextFloat6 = timedValueQueue.checkedNextFloat(checkedNextFloat5);
                                                    float checkedNextFloat7 = timedValueQueue.checkedNextFloat(checkedNextFloat6);
                                                    if (Float.isNaN(checkedNextFloat7)) {
                                                        Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                        break;
                                                    } else {
                                                        if (intValue == 99) {
                                                            checkedNextFloat6 += f3;
                                                            checkedNextFloat7 += f2;
                                                            nextFloat3 += f3;
                                                            checkedNextFloat4 += f2;
                                                            f4 += f3;
                                                            checkedNextFloat5 += f2;
                                                        }
                                                        float f10 = checkedNextFloat6;
                                                        float f11 = checkedNextFloat7;
                                                        f5 = checkedNextFloat5;
                                                        pathDefinition.cubicTo(nextFloat3, checkedNextFloat4, f4, f5, f10, f11);
                                                        f3 = f10;
                                                        f2 = f11;
                                                        timedValueQueue.skipCommaWhitespace();
                                                        if (!timedValueQueue.empty()) {
                                                        }
                                                    }
                                                    break;
                                                case 72:
                                                case 104:
                                                    float nextFloat4 = timedValueQueue.nextFloat();
                                                    if (Float.isNaN(nextFloat4)) {
                                                        Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                        break;
                                                    } else {
                                                        if (intValue == 104) {
                                                            nextFloat4 += f3;
                                                        }
                                                        f3 = nextFloat4;
                                                        pathDefinition.lineTo(f3, f2);
                                                        i = i8;
                                                        f4 = f3;
                                                        timedValueQueue.skipCommaWhitespace();
                                                        if (!timedValueQueue.empty()) {
                                                        }
                                                    }
                                                    break;
                                                case 76:
                                                case 108:
                                                    float nextFloat5 = timedValueQueue.nextFloat();
                                                    float checkedNextFloat8 = timedValueQueue.checkedNextFloat(nextFloat5);
                                                    if (Float.isNaN(checkedNextFloat8)) {
                                                        Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                        break;
                                                    } else {
                                                        if (intValue == 108) {
                                                            nextFloat5 += f3;
                                                            checkedNextFloat8 += f2;
                                                        }
                                                        f3 = nextFloat5;
                                                        f2 = checkedNextFloat8;
                                                        pathDefinition.lineTo(f3, f2);
                                                        i = i8;
                                                        f5 = f2;
                                                        f4 = f3;
                                                        timedValueQueue.skipCommaWhitespace();
                                                        if (!timedValueQueue.empty()) {
                                                        }
                                                    }
                                                    break;
                                                case 77:
                                                case 109:
                                                    float nextFloat6 = timedValueQueue.nextFloat();
                                                    float checkedNextFloat9 = timedValueQueue.checkedNextFloat(nextFloat6);
                                                    if (Float.isNaN(checkedNextFloat9)) {
                                                        Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                        break;
                                                    } else {
                                                        if (intValue == 109 && pathDefinition.commandsLength != 0) {
                                                            nextFloat6 += f3;
                                                            checkedNextFloat9 += f2;
                                                        }
                                                        f3 = nextFloat6;
                                                        f2 = checkedNextFloat9;
                                                        pathDefinition.addCommand((byte) 0);
                                                        pathDefinition.coordsEnsure(2);
                                                        float[] fArr2 = pathDefinition.coords;
                                                        int i17 = pathDefinition.coordsLength;
                                                        int i18 = i17 + 1;
                                                        pathDefinition.coordsLength = i18;
                                                        fArr2[i17] = f3;
                                                        pathDefinition.coordsLength = i17 + 2;
                                                        fArr2[i18] = f2;
                                                        i = i8;
                                                        f5 = f2;
                                                        f7 = f5;
                                                        f4 = f3;
                                                        f6 = f4;
                                                        intValue = intValue == 109 ? 108 : 76;
                                                        timedValueQueue.skipCommaWhitespace();
                                                        if (!timedValueQueue.empty()) {
                                                        }
                                                    }
                                                    break;
                                                case 81:
                                                case 113:
                                                    float nextFloat7 = timedValueQueue.nextFloat();
                                                    float checkedNextFloat10 = timedValueQueue.checkedNextFloat(nextFloat7);
                                                    float checkedNextFloat11 = timedValueQueue.checkedNextFloat(checkedNextFloat10);
                                                    float checkedNextFloat12 = timedValueQueue.checkedNextFloat(checkedNextFloat11);
                                                    if (Float.isNaN(checkedNextFloat12)) {
                                                        Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                        break;
                                                    } else {
                                                        if (intValue == 113) {
                                                            checkedNextFloat11 += f3;
                                                            checkedNextFloat12 += f2;
                                                            nextFloat7 += f3;
                                                            checkedNextFloat10 += f2;
                                                        }
                                                        f3 = checkedNextFloat11;
                                                        f2 = checkedNextFloat12;
                                                        f4 = nextFloat7;
                                                        pathDefinition.quadTo(f4, checkedNextFloat10, f3, f2);
                                                        i = i8;
                                                        f5 = checkedNextFloat10;
                                                        timedValueQueue.skipCommaWhitespace();
                                                        if (!timedValueQueue.empty()) {
                                                        }
                                                    }
                                                    break;
                                                case 83:
                                                case 115:
                                                    float f12 = (f3 * 2.0f) - f4;
                                                    float f13 = (2.0f * f2) - f5;
                                                    float nextFloat8 = timedValueQueue.nextFloat();
                                                    float checkedNextFloat13 = timedValueQueue.checkedNextFloat(nextFloat8);
                                                    float checkedNextFloat14 = timedValueQueue.checkedNextFloat(checkedNextFloat13);
                                                    float checkedNextFloat15 = timedValueQueue.checkedNextFloat(checkedNextFloat14);
                                                    if (Float.isNaN(checkedNextFloat15)) {
                                                        Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                        break;
                                                    } else {
                                                        if (intValue == 115) {
                                                            checkedNextFloat14 += f3;
                                                            checkedNextFloat15 += f2;
                                                            nextFloat8 += f3;
                                                            checkedNextFloat13 += f2;
                                                        }
                                                        float f14 = checkedNextFloat15;
                                                        float f15 = checkedNextFloat14;
                                                        f5 = checkedNextFloat13;
                                                        f4 = nextFloat8;
                                                        pathDefinition.cubicTo(f12, f13, f4, f5, f15, f14);
                                                        f3 = f15;
                                                        f2 = f14;
                                                        i = i8;
                                                        timedValueQueue.skipCommaWhitespace();
                                                        if (!timedValueQueue.empty()) {
                                                        }
                                                    }
                                                    break;
                                                case 84:
                                                case 116:
                                                    f4 = (f3 * 2.0f) - f4;
                                                    float f16 = (2.0f * f2) - f5;
                                                    float nextFloat9 = timedValueQueue.nextFloat();
                                                    float checkedNextFloat16 = timedValueQueue.checkedNextFloat(nextFloat9);
                                                    if (Float.isNaN(checkedNextFloat16)) {
                                                        Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                        break;
                                                    } else {
                                                        if (intValue == 116) {
                                                            nextFloat9 += f3;
                                                            checkedNextFloat16 += f2;
                                                        }
                                                        f3 = nextFloat9;
                                                        f2 = checkedNextFloat16;
                                                        pathDefinition.quadTo(f4, f16, f3, f2);
                                                        i = i8;
                                                        f5 = f16;
                                                        timedValueQueue.skipCommaWhitespace();
                                                        if (!timedValueQueue.empty()) {
                                                        }
                                                    }
                                                    break;
                                                case 86:
                                                case 118:
                                                    float nextFloat10 = timedValueQueue.nextFloat();
                                                    if (Float.isNaN(nextFloat10)) {
                                                        Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                        break;
                                                    } else {
                                                        if (intValue == 118) {
                                                            nextFloat10 += f2;
                                                        }
                                                        f2 = nextFloat10;
                                                        pathDefinition.lineTo(f3, f2);
                                                        i = i8;
                                                        f5 = f2;
                                                        timedValueQueue.skipCommaWhitespace();
                                                        if (!timedValueQueue.empty()) {
                                                        }
                                                    }
                                                    break;
                                                case 90:
                                                case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                                                    pathDefinition.addCommand(b);
                                                    i = i8;
                                                    f3 = f6;
                                                    f4 = f3;
                                                    f2 = f7;
                                                    f5 = f2;
                                                    timedValueQueue.skipCommaWhitespace();
                                                    if (!timedValueQueue.empty()) {
                                                    }
                                                    break;
                                            }
                                        }
                                    }
                                }
                                i = i8;
                                sVG$Path.d = pathDefinition;
                            }
                            i8 = i + 1;
                            i2 = 1;
                            i3 = 0;
                        }
                        this.currentElement.addChild(sVG$Path);
                        break;
                    } else {
                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        break;
                    }
                case 9:
                    SVG$GraphicsElement sVG$GraphicsElement6 = this.currentElement;
                    if (sVG$GraphicsElement6 != null) {
                        SVG$Polygon sVG$Polygon = new SVG$Polygon(false);
                        sVG$Polygon.parent = sVG$GraphicsElement6;
                        parseAttributesCore(sVG$Polygon, attributes);
                        parseAttributesTransform(sVG$Polygon, attributes);
                        parseAttributesPolyLine(sVG$Polygon, attributes, "polygon");
                        this.currentElement.addChild(sVG$Polygon);
                        break;
                    } else {
                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        break;
                    }
                case 10:
                    SVG$GraphicsElement sVG$GraphicsElement7 = this.currentElement;
                    if (sVG$GraphicsElement7 != null) {
                        SVG$PolyLine sVG$PolyLine = new SVG$PolyLine(false);
                        sVG$PolyLine.parent = sVG$GraphicsElement7;
                        parseAttributesCore(sVG$PolyLine, attributes);
                        parseAttributesTransform(sVG$PolyLine, attributes);
                        parseAttributesPolyLine(sVG$PolyLine, attributes, "polyline");
                        this.currentElement.addChild(sVG$PolyLine);
                        break;
                    } else {
                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        break;
                    }
                case 11:
                    SVG$GraphicsElement sVG$GraphicsElement8 = this.currentElement;
                    if (sVG$GraphicsElement8 != null) {
                        SVG$Rect sVG$Rect = new SVG$Rect(false);
                        sVG$Rect.parent = sVG$GraphicsElement8;
                        parseAttributesCore(sVG$Rect, attributes);
                        parseAttributesTransform(sVG$Rect, attributes);
                        while (i3 < attributes.getLength()) {
                            String trim7 = attributes.getValue(i3).trim();
                            int ordinal5 = SVGAttr.fromString(attributes.getLocalName(i3)).ordinal();
                            if (ordinal5 != 6) {
                                if (ordinal5 != 11) {
                                    if (ordinal5 != 12) {
                                        switch (ordinal5) {
                                            case 16:
                                                SVG$Length parseLength6 = parseLength(trim7);
                                                sVG$Rect.width = parseLength6;
                                                if (parseLength6.isNegative()) {
                                                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid <rect> element. width cannot be negative");
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            case 17:
                                                sVG$Rect.x = parseLength(trim7);
                                                break;
                                            case 18:
                                                sVG$Rect.y = parseLength(trim7);
                                                break;
                                        }
                                    } else {
                                        SVG$Length parseLength7 = parseLength(trim7);
                                        sVG$Rect.ry = parseLength7;
                                        if (parseLength7.isNegative()) {
                                            WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid <rect> element. ry cannot be negative");
                                            break;
                                        }
                                    }
                                } else {
                                    SVG$Length parseLength8 = parseLength(trim7);
                                    sVG$Rect.rx = parseLength8;
                                    if (parseLength8.isNegative()) {
                                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid <rect> element. rx cannot be negative");
                                        break;
                                    }
                                }
                            } else {
                                SVG$Length parseLength9 = parseLength(trim7);
                                sVG$Rect.height = parseLength9;
                                if (parseLength9.isNegative()) {
                                    WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid <rect> element. height cannot be negative");
                                    break;
                                }
                            }
                            i3++;
                        }
                        this.currentElement.addChild(sVG$Rect);
                        break;
                    } else {
                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        break;
                    }
                    break;
                case 12:
                    if (this.currentElement != null) {
                        SVG$Symbol sVG$Symbol = new SVG$Symbol();
                        sVG$Symbol.parent = this.currentElement;
                        parseAttributesCore(sVG$Symbol, attributes);
                        parseAttributesViewBox(sVG$Symbol, attributes);
                        this.currentElement.addChild(sVG$Symbol);
                        this.currentElement = sVG$Symbol;
                        break;
                    } else {
                        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        break;
                    }
                default:
                    this.ignoring = true;
                    this.ignoreDepth = 1;
                    break;
            }
        }
    }
}
