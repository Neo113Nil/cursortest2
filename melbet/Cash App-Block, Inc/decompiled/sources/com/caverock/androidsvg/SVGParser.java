package com.caverock.androidsvg;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.util.TimedValueQueue;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.caverock.androidsvg.CSSParser;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.plaid.internal.EnumC0170g;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public final class SVGParser {
    public SVG.SvgContainer currentElement;
    public int ignoreDepth;
    public boolean ignoring;
    public boolean inMetadataElement;
    public boolean inStyleElement;
    public StringBuilder metadataElementContents;
    public SVGElem metadataTag;
    public StringBuilder styleElementContents;
    public SVG svgDocument;

    public abstract class AspectRatioKeywords {
        public static final HashMap aspectRatioKeywords;

        static {
            HashMap hashMap = new HashMap(10);
            aspectRatioKeywords = hashMap;
            hashMap.put("none", PreserveAspectRatio.Alignment.none);
            hashMap.put("xMinYMin", PreserveAspectRatio.Alignment.xMinYMin);
            hashMap.put("xMidYMin", PreserveAspectRatio.Alignment.xMidYMin);
            hashMap.put("xMaxYMin", PreserveAspectRatio.Alignment.xMaxYMin);
            hashMap.put("xMinYMid", PreserveAspectRatio.Alignment.xMinYMid);
            hashMap.put("xMidYMid", PreserveAspectRatio.Alignment.xMidYMid);
            hashMap.put("xMaxYMid", PreserveAspectRatio.Alignment.xMaxYMid);
            hashMap.put("xMinYMax", PreserveAspectRatio.Alignment.xMinYMax);
            hashMap.put("xMidYMax", PreserveAspectRatio.Alignment.xMidYMax);
            hashMap.put("xMaxYMax", PreserveAspectRatio.Alignment.xMaxYMax);
        }
    }

    public abstract class ColourKeywords {
        public static final HashMap colourKeywords;

        static {
            HashMap hashMap = new HashMap(47);
            colourKeywords = hashMap;
            Fragment$5$$ExternalSyntheticOutline0.m(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
            Fragment$5$$ExternalSyntheticOutline0.m(-8388652, (Integer) (-16711681), "aqua", "aquamarine", hashMap);
            Fragment$5$$ExternalSyntheticOutline0.m(-983041, hashMap, "azure", -657956, "beige");
            Fragment$5$$ExternalSyntheticOutline0.m(-6972, hashMap, "bisque", -16777216, "black");
            Fragment$5$$ExternalSyntheticOutline0.m(-5171, hashMap, "blanchedalmond", -16776961, "blue");
            Fragment$5$$ExternalSyntheticOutline0.m(-7722014, hashMap, "blueviolet", -5952982, "brown");
            Fragment$5$$ExternalSyntheticOutline0.m(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
            Fragment$5$$ExternalSyntheticOutline0.m(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
            Fragment$5$$ExternalSyntheticOutline0.m(-32944, hashMap, "coral", -10185235, "cornflowerblue");
            Fragment$5$$ExternalSyntheticOutline0.m(-1828, hashMap, "cornsilk", -2354116, "crimson");
            Fragment$5$$ExternalSyntheticOutline0.m(-16777077, (Integer) (-16711681), "cyan", "darkblue", hashMap);
            Fragment$5$$ExternalSyntheticOutline0.m(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
            Fragment$5$$ExternalSyntheticOutline0.m(-16751616, (Integer) (-5658199), "darkgray", "darkgreen", hashMap);
            Fragment$5$$ExternalSyntheticOutline0.m(-4343957, (Integer) (-5658199), "darkgrey", "darkkhaki", hashMap);
            Fragment$5$$ExternalSyntheticOutline0.m(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
            Fragment$5$$ExternalSyntheticOutline0.m(-29696, hashMap, "darkorange", -6737204, "darkorchid");
            Fragment$5$$ExternalSyntheticOutline0.m(-7667712, hashMap, "darkred", -1468806, "darksalmon");
            Fragment$5$$ExternalSyntheticOutline0.m(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
            hashMap.put("darkslategray", -13676721);
            hashMap.put("darkslategrey", -13676721);
            Fragment$5$$ExternalSyntheticOutline0.m(-7077677, (Integer) (-16724271), "darkturquoise", "darkviolet", hashMap);
            Fragment$5$$ExternalSyntheticOutline0.m(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
            hashMap.put("dimgray", -9868951);
            hashMap.put("dimgrey", -9868951);
            Fragment$5$$ExternalSyntheticOutline0.m(-5103070, (Integer) (-14774017), "dodgerblue", "firebrick", hashMap);
            Fragment$5$$ExternalSyntheticOutline0.m(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
            Fragment$5$$ExternalSyntheticOutline0.m(-2302756, (Integer) (-65281), "fuchsia", "gainsboro", hashMap);
            Fragment$5$$ExternalSyntheticOutline0.m(-460545, hashMap, "ghostwhite", -10496, "gold");
            hashMap.put("goldenrod", -2448096);
            hashMap.put("gray", -8355712);
            Fragment$5$$ExternalSyntheticOutline0.m(-16744448, hashMap, "green", -5374161, "greenyellow");
            Fragment$5$$ExternalSyntheticOutline0.m(-983056, (Integer) (-8355712), "grey", "honeydew", hashMap);
            Fragment$5$$ExternalSyntheticOutline0.m(-38476, hashMap, "hotpink", -3318692, "indianred");
            Fragment$5$$ExternalSyntheticOutline0.m(-11861886, hashMap, "indigo", -16, "ivory");
            Fragment$5$$ExternalSyntheticOutline0.m(-989556, hashMap, "khaki", -1644806, "lavender");
            Fragment$5$$ExternalSyntheticOutline0.m(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
            Fragment$5$$ExternalSyntheticOutline0.m(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
            Fragment$5$$ExternalSyntheticOutline0.m(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
            hashMap.put("lightgoldenrodyellow", -329006);
            hashMap.put("lightgray", -2894893);
            hashMap.put("lightgreen", -7278960);
            hashMap.put("lightgrey", -2894893);
            Fragment$5$$ExternalSyntheticOutline0.m(-18751, hashMap, "lightpink", -24454, "lightsalmon");
            Fragment$5$$ExternalSyntheticOutline0.m(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
            hashMap.put("lightslategray", -8943463);
            hashMap.put("lightslategrey", -8943463);
            Fragment$5$$ExternalSyntheticOutline0.m(-32, (Integer) (-5192482), "lightsteelblue", "lightyellow", hashMap);
            Fragment$5$$ExternalSyntheticOutline0.m(-16711936, hashMap, "lime", -13447886, "limegreen");
            hashMap.put("linen", -331546);
            hashMap.put("magenta", -65281);
            Fragment$5$$ExternalSyntheticOutline0.m(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
            Fragment$5$$ExternalSyntheticOutline0.m(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
            Fragment$5$$ExternalSyntheticOutline0.m(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
            Fragment$5$$ExternalSyntheticOutline0.m(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
            Fragment$5$$ExternalSyntheticOutline0.m(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
            Fragment$5$$ExternalSyntheticOutline0.m(-15132304, hashMap, "midnightblue", -655366, "mintcream");
            Fragment$5$$ExternalSyntheticOutline0.m(-6943, hashMap, "mistyrose", -6987, "moccasin");
            Fragment$5$$ExternalSyntheticOutline0.m(-8531, hashMap, "navajowhite", -16777088, "navy");
            Fragment$5$$ExternalSyntheticOutline0.m(-133658, hashMap, "oldlace", -8355840, "olive");
            Fragment$5$$ExternalSyntheticOutline0.m(-9728477, hashMap, "olivedrab", -23296, "orange");
            Fragment$5$$ExternalSyntheticOutline0.m(-47872, hashMap, "orangered", -2461482, "orchid");
            Fragment$5$$ExternalSyntheticOutline0.m(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
            Fragment$5$$ExternalSyntheticOutline0.m(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
            Fragment$5$$ExternalSyntheticOutline0.m(-4139, hashMap, "papayawhip", -9543, "peachpuff");
            Fragment$5$$ExternalSyntheticOutline0.m(-3308225, hashMap, "peru", -16181, "pink");
            Fragment$5$$ExternalSyntheticOutline0.m(-2252579, hashMap, "plum", -5185306, "powderblue");
            Fragment$5$$ExternalSyntheticOutline0.m(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
            Fragment$5$$ExternalSyntheticOutline0.m(-65536, hashMap, "red", -4419697, "rosybrown");
            Fragment$5$$ExternalSyntheticOutline0.m(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
            Fragment$5$$ExternalSyntheticOutline0.m(-360334, hashMap, "salmon", -744352, "sandybrown");
            Fragment$5$$ExternalSyntheticOutline0.m(-13726889, hashMap, "seagreen", -2578, "seashell");
            Fragment$5$$ExternalSyntheticOutline0.m(-6270419, hashMap, "sienna", -4144960, "silver");
            Fragment$5$$ExternalSyntheticOutline0.m(-7876885, hashMap, "skyblue", -9807155, "slateblue");
            hashMap.put("slategray", -9404272);
            hashMap.put("slategrey", -9404272);
            Fragment$5$$ExternalSyntheticOutline0.m(-16711809, (Integer) (-1286), "snow", "springgreen", hashMap);
            Fragment$5$$ExternalSyntheticOutline0.m(-12156236, hashMap, "steelblue", -2968436, "tan");
            Fragment$5$$ExternalSyntheticOutline0.m(-16744320, hashMap, "teal", -2572328, "thistle");
            Fragment$5$$ExternalSyntheticOutline0.m(-40121, hashMap, "tomato", -12525360, "turquoise");
            Fragment$5$$ExternalSyntheticOutline0.m(-1146130, hashMap, "violet", -663885, "wheat");
            Fragment$5$$ExternalSyntheticOutline0.m(-1, hashMap, "white", -657931, "whitesmoke");
            Fragment$5$$ExternalSyntheticOutline0.m(-256, hashMap, "yellow", -6632142, "yellowgreen");
            hashMap.put("transparent", 0);
        }
    }

    public abstract class FontSizeKeywords {
        public static final HashMap fontSizeKeywords;

        static {
            HashMap hashMap = new HashMap(9);
            fontSizeKeywords = hashMap;
            hashMap.put("xx-small", new SVG.Length(0.694f, 7));
            hashMap.put("x-small", new SVG.Length(0.833f, 7));
            hashMap.put("small", new SVG.Length(10.0f, 7));
            hashMap.put("medium", new SVG.Length(12.0f, 7));
            hashMap.put("large", new SVG.Length(14.4f, 7));
            hashMap.put("x-large", new SVG.Length(17.3f, 7));
            hashMap.put("xx-large", new SVG.Length(20.7f, 7));
            hashMap.put("smaller", new SVG.Length(83.33f, 9));
            hashMap.put("larger", new SVG.Length(120.0f, 9));
        }
    }

    public abstract class FontWeightKeywords {
        public static final HashMap fontWeightKeywords;

        static {
            HashMap hashMap = new HashMap(13);
            fontWeightKeywords = hashMap;
            hashMap.put("normal", 400);
            hashMap.put("bold", 700);
            Fragment$5$$ExternalSyntheticOutline0.m(1, hashMap, "bolder", -1, "lighter");
            Fragment$5$$ExternalSyntheticOutline0.m(100, hashMap, "100", 200, "200");
            hashMap.put("300", Integer.valueOf(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE));
            hashMap.put("400", 400);
            Fragment$5$$ExternalSyntheticOutline0.m(500, hashMap, "500", 600, "600");
            Fragment$5$$ExternalSyntheticOutline0.m(800, (Integer) 700, "700", "800", hashMap);
            hashMap.put("900", 900);
        }
    }

    public final class SAXHandler extends DefaultHandler2 {
        public SAXHandler() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void characters(char[] cArr, int i, int i2) {
            SVGParser.this.text(new String(cArr, i, i2));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void endDocument() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void endElement(String str, String str2, String str3) {
            SVGParser.this.endElement(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void processingInstruction(String str, String str2) {
            SVGParser.parseProcessingInstructionAttributes(new TimedValueQueue(str2, 7));
            str.equals("xml-stylesheet");
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void startDocument() {
            SVGParser.this.startDocument();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public final void startElement(String str, String str2, String str3, Attributes attributes) {
            SVGParser.this.startElement(str, str2, str3, attributes);
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
            SVGAttr sVGAttr2 = new SVGAttr("clip", 1);
            SVGAttr sVGAttr3 = new SVGAttr("clip_path", 2);
            SVGAttr sVGAttr4 = new SVGAttr("clipPathUnits", 3);
            SVGAttr sVGAttr5 = new SVGAttr("clip_rule", 4);
            SVGAttr sVGAttr6 = new SVGAttr("color", 5);
            SVGAttr sVGAttr7 = new SVGAttr("cx", 6);
            SVGAttr sVGAttr8 = new SVGAttr("cy", 7);
            SVGAttr sVGAttr9 = new SVGAttr("direction", 8);
            SVGAttr sVGAttr10 = new SVGAttr("dx", 9);
            SVGAttr sVGAttr11 = new SVGAttr("dy", 10);
            SVGAttr sVGAttr12 = new SVGAttr("fx", 11);
            SVGAttr sVGAttr13 = new SVGAttr("fy", 12);
            SVGAttr sVGAttr14 = new SVGAttr("d", 13);
            SVGAttr sVGAttr15 = new SVGAttr("display", 14);
            SVGAttr sVGAttr16 = new SVGAttr("fill", 15);
            SVGAttr sVGAttr17 = new SVGAttr("fill_rule", 16);
            SVGAttr sVGAttr18 = new SVGAttr("fill_opacity", 17);
            SVGAttr sVGAttr19 = new SVGAttr("font", 18);
            SVGAttr sVGAttr20 = new SVGAttr("font_family", 19);
            SVGAttr sVGAttr21 = new SVGAttr("font_size", 20);
            SVGAttr sVGAttr22 = new SVGAttr("font_weight", 21);
            SVGAttr sVGAttr23 = new SVGAttr("font_style", 22);
            SVGAttr sVGAttr24 = new SVGAttr("gradientTransform", 23);
            SVGAttr sVGAttr25 = new SVGAttr("gradientUnits", 24);
            SVGAttr sVGAttr26 = new SVGAttr("height", 25);
            SVGAttr sVGAttr27 = new SVGAttr("href", 26);
            SVGAttr sVGAttr28 = new SVGAttr("image_rendering", 27);
            SVGAttr sVGAttr29 = new SVGAttr("marker", 28);
            SVGAttr sVGAttr30 = new SVGAttr("marker_start", 29);
            SVGAttr sVGAttr31 = new SVGAttr("marker_mid", 30);
            SVGAttr sVGAttr32 = new SVGAttr("marker_end", 31);
            SVGAttr sVGAttr33 = new SVGAttr("markerHeight", 32);
            SVGAttr sVGAttr34 = new SVGAttr("markerUnits", 33);
            SVGAttr sVGAttr35 = new SVGAttr("markerWidth", 34);
            SVGAttr sVGAttr36 = new SVGAttr("mask", 35);
            SVGAttr sVGAttr37 = new SVGAttr("maskContentUnits", 36);
            SVGAttr sVGAttr38 = new SVGAttr("maskUnits", 37);
            SVGAttr sVGAttr39 = new SVGAttr("media", 38);
            SVGAttr sVGAttr40 = new SVGAttr("offset", 39);
            SVGAttr sVGAttr41 = new SVGAttr("opacity", 40);
            SVGAttr sVGAttr42 = new SVGAttr("orient", 41);
            SVGAttr sVGAttr43 = new SVGAttr("overflow", 42);
            SVGAttr sVGAttr44 = new SVGAttr("pathLength", 43);
            SVGAttr sVGAttr45 = new SVGAttr("patternContentUnits", 44);
            SVGAttr sVGAttr46 = new SVGAttr("patternTransform", 45);
            SVGAttr sVGAttr47 = new SVGAttr("patternUnits", 46);
            SVGAttr sVGAttr48 = new SVGAttr("points", 47);
            points = sVGAttr48;
            SVGAttr sVGAttr49 = new SVGAttr("preserveAspectRatio", 48);
            SVGAttr sVGAttr50 = new SVGAttr("r", 49);
            SVGAttr sVGAttr51 = new SVGAttr("refX", 50);
            SVGAttr sVGAttr52 = new SVGAttr("refY", 51);
            SVGAttr sVGAttr53 = new SVGAttr("requiredFeatures", 52);
            SVGAttr sVGAttr54 = new SVGAttr("requiredExtensions", 53);
            SVGAttr sVGAttr55 = new SVGAttr("requiredFormats", 54);
            SVGAttr sVGAttr56 = new SVGAttr("requiredFonts", 55);
            SVGAttr sVGAttr57 = new SVGAttr("rx", 56);
            SVGAttr sVGAttr58 = new SVGAttr("ry", 57);
            SVGAttr sVGAttr59 = new SVGAttr("solid_color", 58);
            SVGAttr sVGAttr60 = new SVGAttr("solid_opacity", 59);
            SVGAttr sVGAttr61 = new SVGAttr("spreadMethod", 60);
            SVGAttr sVGAttr62 = new SVGAttr("startOffset", 61);
            SVGAttr sVGAttr63 = new SVGAttr("stop_color", 62);
            SVGAttr sVGAttr64 = new SVGAttr("stop_opacity", 63);
            SVGAttr sVGAttr65 = new SVGAttr("stroke", 64);
            SVGAttr sVGAttr66 = new SVGAttr("stroke_dasharray", 65);
            SVGAttr sVGAttr67 = new SVGAttr("stroke_dashoffset", 66);
            SVGAttr sVGAttr68 = new SVGAttr("stroke_linecap", 67);
            SVGAttr sVGAttr69 = new SVGAttr("stroke_linejoin", 68);
            SVGAttr sVGAttr70 = new SVGAttr("stroke_miterlimit", 69);
            SVGAttr sVGAttr71 = new SVGAttr("stroke_opacity", 70);
            SVGAttr sVGAttr72 = new SVGAttr("stroke_width", 71);
            SVGAttr sVGAttr73 = new SVGAttr("style", 72);
            SVGAttr sVGAttr74 = new SVGAttr("systemLanguage", 73);
            SVGAttr sVGAttr75 = new SVGAttr("text_anchor", 74);
            SVGAttr sVGAttr76 = new SVGAttr("text_decoration", 75);
            SVGAttr sVGAttr77 = new SVGAttr("transform", 76);
            transform = sVGAttr77;
            SVGAttr sVGAttr78 = new SVGAttr("type", 77);
            SVGAttr sVGAttr79 = new SVGAttr("vector_effect", 78);
            SVGAttr sVGAttr80 = new SVGAttr("version", 79);
            SVGAttr sVGAttr81 = new SVGAttr("viewBox", 80);
            SVGAttr sVGAttr82 = new SVGAttr("width", 81);
            SVGAttr sVGAttr83 = new SVGAttr("x", 82);
            SVGAttr sVGAttr84 = new SVGAttr("y", 83);
            SVGAttr sVGAttr85 = new SVGAttr("x1", 84);
            SVGAttr sVGAttr86 = new SVGAttr("y1", 85);
            SVGAttr sVGAttr87 = new SVGAttr("x2", 86);
            SVGAttr sVGAttr88 = new SVGAttr("y2", 87);
            SVGAttr sVGAttr89 = new SVGAttr("viewport_fill", 88);
            SVGAttr sVGAttr90 = new SVGAttr("viewport_fill_opacity", 89);
            SVGAttr sVGAttr91 = new SVGAttr("visibility", 90);
            SVGAttr sVGAttr92 = new SVGAttr("UNSUPPORTED", 91);
            UNSUPPORTED = sVGAttr92;
            $VALUES = new SVGAttr[]{sVGAttr, sVGAttr2, sVGAttr3, sVGAttr4, sVGAttr5, sVGAttr6, sVGAttr7, sVGAttr8, sVGAttr9, sVGAttr10, sVGAttr11, sVGAttr12, sVGAttr13, sVGAttr14, sVGAttr15, sVGAttr16, sVGAttr17, sVGAttr18, sVGAttr19, sVGAttr20, sVGAttr21, sVGAttr22, sVGAttr23, sVGAttr24, sVGAttr25, sVGAttr26, sVGAttr27, sVGAttr28, sVGAttr29, sVGAttr30, sVGAttr31, sVGAttr32, sVGAttr33, sVGAttr34, sVGAttr35, sVGAttr36, sVGAttr37, sVGAttr38, sVGAttr39, sVGAttr40, sVGAttr41, sVGAttr42, sVGAttr43, sVGAttr44, sVGAttr45, sVGAttr46, sVGAttr47, sVGAttr48, sVGAttr49, sVGAttr50, sVGAttr51, sVGAttr52, sVGAttr53, sVGAttr54, sVGAttr55, sVGAttr56, sVGAttr57, sVGAttr58, sVGAttr59, sVGAttr60, sVGAttr61, sVGAttr62, sVGAttr63, sVGAttr64, sVGAttr65, sVGAttr66, sVGAttr67, sVGAttr68, sVGAttr69, sVGAttr70, sVGAttr71, sVGAttr72, sVGAttr73, sVGAttr74, sVGAttr75, sVGAttr76, sVGAttr77, sVGAttr78, sVGAttr79, sVGAttr80, sVGAttr81, sVGAttr82, sVGAttr83, sVGAttr84, sVGAttr85, sVGAttr86, sVGAttr87, sVGAttr88, sVGAttr89, sVGAttr90, sVGAttr91, sVGAttr92};
            cache = new HashMap();
            for (SVGAttr sVGAttr93 : values()) {
                if (sVGAttr93 == CLASS) {
                    cache.put("class", sVGAttr93);
                } else if (sVGAttr93 != UNSUPPORTED) {
                    cache.put(sVGAttr93.name().replace('_', '-'), sVGAttr93);
                }
            }
        }

        public static SVGAttr fromString(String str) {
            SVGAttr sVGAttr = (SVGAttr) cache.get(str);
            return sVGAttr != null ? sVGAttr : UNSUPPORTED;
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
        public static final SVGElem SWITCH;
        public static final SVGElem UNSUPPORTED;
        public static final HashMap cache;
        public static final SVGElem desc;
        public static final SVGElem title;

        /* JADX INFO: Fake field, exist only in values array */
        SVGElem EF1;

        static {
            SVGElem sVGElem = new SVGElem("svg", 0);
            SVGElem sVGElem2 = new SVGElem("a", 1);
            SVGElem sVGElem3 = new SVGElem("circle", 2);
            SVGElem sVGElem4 = new SVGElem("clipPath", 3);
            SVGElem sVGElem5 = new SVGElem("defs", 4);
            SVGElem sVGElem6 = new SVGElem("desc", 5);
            desc = sVGElem6;
            SVGElem sVGElem7 = new SVGElem("ellipse", 6);
            SVGElem sVGElem8 = new SVGElem("g", 7);
            SVGElem sVGElem9 = new SVGElem("image", 8);
            SVGElem sVGElem10 = new SVGElem("line", 9);
            SVGElem sVGElem11 = new SVGElem("linearGradient", 10);
            SVGElem sVGElem12 = new SVGElem("marker", 11);
            SVGElem sVGElem13 = new SVGElem("mask", 12);
            SVGElem sVGElem14 = new SVGElem("path", 13);
            SVGElem sVGElem15 = new SVGElem("pattern", 14);
            SVGElem sVGElem16 = new SVGElem("polygon", 15);
            SVGElem sVGElem17 = new SVGElem("polyline", 16);
            SVGElem sVGElem18 = new SVGElem("radialGradient", 17);
            SVGElem sVGElem19 = new SVGElem("rect", 18);
            SVGElem sVGElem20 = new SVGElem("solidColor", 19);
            SVGElem sVGElem21 = new SVGElem("stop", 20);
            SVGElem sVGElem22 = new SVGElem("style", 21);
            SVGElem sVGElem23 = new SVGElem("SWITCH", 22);
            SWITCH = sVGElem23;
            SVGElem sVGElem24 = new SVGElem("symbol", 23);
            SVGElem sVGElem25 = new SVGElem("text", 24);
            SVGElem sVGElem26 = new SVGElem("textPath", 25);
            SVGElem sVGElem27 = new SVGElem("title", 26);
            title = sVGElem27;
            SVGElem sVGElem28 = new SVGElem("tref", 27);
            SVGElem sVGElem29 = new SVGElem("tspan", 28);
            SVGElem sVGElem30 = new SVGElem("use", 29);
            SVGElem sVGElem31 = new SVGElem("view", 30);
            SVGElem sVGElem32 = new SVGElem("UNSUPPORTED", 31);
            UNSUPPORTED = sVGElem32;
            $VALUES = new SVGElem[]{sVGElem, sVGElem2, sVGElem3, sVGElem4, sVGElem5, sVGElem6, sVGElem7, sVGElem8, sVGElem9, sVGElem10, sVGElem11, sVGElem12, sVGElem13, sVGElem14, sVGElem15, sVGElem16, sVGElem17, sVGElem18, sVGElem19, sVGElem20, sVGElem21, sVGElem22, sVGElem23, sVGElem24, sVGElem25, sVGElem26, sVGElem27, sVGElem28, sVGElem29, sVGElem30, sVGElem31, sVGElem32};
            cache = new HashMap();
            for (SVGElem sVGElem33 : values()) {
                if (sVGElem33 == SWITCH) {
                    cache.put("switch", sVGElem33);
                } else if (sVGElem33 != UNSUPPORTED) {
                    cache.put(sVGElem33.name(), sVGElem33);
                }
            }
        }

        public static SVGElem valueOf(String str) {
            return (SVGElem) Enum.valueOf(SVGElem.class, str);
        }

        public static SVGElem[] values() {
            return (SVGElem[]) $VALUES.clone();
        }
    }

    public final class XPPAttributesWrapper implements Attributes {
        public XmlPullParser parser;

        @Override // org.xml.sax.Attributes
        public final int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public final int getLength() {
            return this.parser.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public final String getLocalName(int i) {
            return this.parser.getAttributeName(i);
        }

        @Override // org.xml.sax.Attributes
        public final String getQName(int i) {
            XmlPullParser xmlPullParser = this.parser;
            String attributeName = xmlPullParser.getAttributeName(i);
            if (xmlPullParser.getAttributePrefix(i) == null) {
                return attributeName;
            }
            return xmlPullParser.getAttributePrefix(i) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(int i) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getURI(int i) {
            return this.parser.getAttributeNamespace(i);
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(int i) {
            return this.parser.getAttributeValue(i);
        }

        @Override // org.xml.sax.Attributes
        public final int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public final String getValue(String str) {
            return null;
        }
    }

    public static int clamp255(float f) {
        if (f < RecyclerView.DECELERATION_RATE) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    public static int hslToRgb(float f, float f2, float f3) {
        float f4 = RecyclerView.DECELERATION_RATE;
        float f5 = f % 360.0f;
        if (f < RecyclerView.DECELERATION_RATE) {
            f5 += 360.0f;
        }
        float f6 = f5 / 60.0f;
        float f7 = f2 / 100.0f;
        float f8 = f3 / 100.0f;
        if (f7 < RecyclerView.DECELERATION_RATE) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f8 >= RecyclerView.DECELERATION_RATE) {
            f4 = f8 > 1.0f ? 1.0f : f8;
        }
        float f9 = f4 <= 0.5f ? (f7 + 1.0f) * f4 : (f4 + f7) - (f7 * f4);
        float f10 = (f4 * 2.0f) - f9;
        return clamp255(hueToRgb(f10, f9, f6 - 2.0f) * 256.0f) | (clamp255(hueToRgb(f10, f9, f6 + 2.0f) * 256.0f) << 16) | (clamp255(hueToRgb(f10, f9, f6) * 256.0f) << 8);
    }

    public static float hueToRgb(float f, float f2, float f3) {
        if (f3 < RecyclerView.DECELERATION_RATE) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        return f3 < 1.0f ? CameraState$Type$EnumUnboxingLocalUtility.m(f2, f, f3, f) : f3 < 3.0f ? f2 : f3 < 4.0f ? CameraState$Type$EnumUnboxingLocalUtility.m(4.0f, f3, f2 - f, f) : f;
    }

    public static void parseAttributesConditional(SVG.SvgConditional svgConditional, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int m = Thread$State$EnumUnboxingLocalUtility.m(attributes, i);
            if (m != 73) {
                switch (m) {
                    case 52:
                        TimedValueQueue timedValueQueue = new TimedValueQueue(trim, 7);
                        HashSet hashSet = new HashSet();
                        while (!timedValueQueue.empty()) {
                            String nextToken = timedValueQueue.nextToken();
                            if (nextToken.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(nextToken.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            timedValueQueue.skipWhitespace();
                        }
                        svgConditional.setRequiredFeatures(hashSet);
                        break;
                    case 53:
                        svgConditional.setRequiredExtensions(trim);
                        break;
                    case 54:
                        TimedValueQueue timedValueQueue2 = new TimedValueQueue(trim, 7);
                        HashSet hashSet2 = new HashSet();
                        while (!timedValueQueue2.empty()) {
                            hashSet2.add(timedValueQueue2.nextToken());
                            timedValueQueue2.skipWhitespace();
                        }
                        svgConditional.setRequiredFormats(hashSet2);
                        break;
                    case 55:
                        ArrayList parseFontFamily = parseFontFamily(trim);
                        svgConditional.setRequiredFonts(parseFontFamily != null ? new HashSet(parseFontFamily) : new HashSet(0));
                        break;
                }
            } else {
                TimedValueQueue timedValueQueue3 = new TimedValueQueue(trim, 7);
                HashSet hashSet3 = new HashSet();
                while (!timedValueQueue3.empty()) {
                    String nextToken2 = timedValueQueue3.nextToken();
                    int indexOf = nextToken2.indexOf(45);
                    if (indexOf != -1) {
                        nextToken2 = nextToken2.substring(0, indexOf);
                    }
                    hashSet3.add(new Locale(nextToken2, "", "").getLanguage());
                    timedValueQueue3.skipWhitespace();
                }
                svgConditional.setSystemLanguage(hashSet3);
            }
        }
    }

    public static void parseAttributesCore(SVG.SvgElementBase svgElementBase, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                svgElementBase.id = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if ("default".equals(trim)) {
                    svgElementBase.spacePreserve = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(trim)) {
                        throw new SVGParseException(Recorder$$ExternalSyntheticOutline2.m("Invalid value for \"xml:space\" attribute: ", trim));
                    }
                    svgElementBase.spacePreserve = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    public static void parseAttributesGradient(SVG.GradientElement gradientElement, Attributes attributes) {
        int i;
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String trim = attributes.getValue(i2).trim();
            int m = Thread$State$EnumUnboxingLocalUtility.m(attributes, i2);
            if (m == 23) {
                gradientElement.gradientTransform = parseTransformList(trim);
            } else if (m != 24) {
                if (m != 26) {
                    if (m == 60) {
                        if (trim != null) {
                            try {
                                if (trim.equals("pad")) {
                                    i = 1;
                                } else if (trim.equals("reflect")) {
                                    i = 2;
                                } else if (trim.equals("repeat")) {
                                    i = 3;
                                } else {
                                    a$$ExternalSyntheticBUOutline0.m$3("No enum constant com.caverock.androidsvg.SVG.GradientSpread.".concat(trim));
                                }
                                gradientElement.spreadMethod = i;
                            } catch (IllegalArgumentException unused) {
                                throw new SVGParseException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Invalid spreadMethod attribute. \"", trim, "\" is not a valid value."));
                            }
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$2("Name is null");
                        }
                        i = 0;
                        gradientElement.spreadMethod = i;
                    } else {
                        continue;
                    }
                } else if ("".equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                    gradientElement.href = trim;
                }
            } else if ("objectBoundingBox".equals(trim)) {
                gradientElement.gradientUnitsAreUser = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(trim)) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid value for attribute gradientUnits");
                    return;
                }
                gradientElement.gradientUnitsAreUser = Boolean.TRUE;
            }
        }
    }

    public static void parseAttributesPolyLine(SVG.PolyLine polyLine, Attributes attributes, String str) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.points) {
                TimedValueQueue timedValueQueue = new TimedValueQueue(attributes.getValue(i), 7);
                ArrayList arrayList = new ArrayList();
                timedValueQueue.skipWhitespace();
                while (!timedValueQueue.empty()) {
                    float nextFloat = timedValueQueue.nextFloat();
                    if (Float.isNaN(nextFloat)) {
                        throw new SVGParseException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    timedValueQueue.m1142skipCommaWhitespace();
                    float nextFloat2 = timedValueQueue.nextFloat();
                    if (Float.isNaN(nextFloat2)) {
                        throw new SVGParseException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    timedValueQueue.m1142skipCommaWhitespace();
                    arrayList.add(Float.valueOf(nextFloat));
                    arrayList.add(Float.valueOf(nextFloat2));
                }
                polyLine.points = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    polyLine.points[i2] = ((Float) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    public static void parseAttributesStyle(SVG.SvgElementBase svgElementBase, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                int m = Thread$State$EnumUnboxingLocalUtility.m(attributes, i);
                if (m == 0) {
                    CSSParser.CSSTextScanner cSSTextScanner = new CSSParser.CSSTextScanner(trim);
                    ArrayList arrayList = null;
                    while (!cSSTextScanner.empty()) {
                        String nextToken = cSSTextScanner.nextToken();
                        if (nextToken != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(nextToken);
                            cSSTextScanner.skipWhitespace();
                        }
                    }
                    svgElementBase.classNames = arrayList;
                } else if (m != 72) {
                    if (svgElementBase.baseStyle == null) {
                        svgElementBase.baseStyle = new SVG.Style();
                    }
                    processStyleProperty(svgElementBase.baseStyle, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    TimedValueQueue timedValueQueue = new TimedValueQueue(trim.replaceAll("/\\*.*?\\*/", ""), 7);
                    while (true) {
                        String nextToken2 = timedValueQueue.nextToken(false, ':');
                        timedValueQueue.skipWhitespace();
                        if (!timedValueQueue.consume(':')) {
                            break;
                        }
                        timedValueQueue.skipWhitespace();
                        String nextToken3 = timedValueQueue.nextToken(true, ';');
                        if (nextToken3 == null) {
                            break;
                        }
                        timedValueQueue.skipWhitespace();
                        if (timedValueQueue.empty() || timedValueQueue.consume(';')) {
                            if (svgElementBase.style == null) {
                                svgElementBase.style = new SVG.Style();
                            }
                            processStyleProperty(svgElementBase.style, nextToken2, nextToken3);
                            timedValueQueue.skipWhitespace();
                        }
                    }
                }
            }
        }
    }

    public static void parseAttributesTextPosition(SVG.TextPositionedContainer textPositionedContainer, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int m = Thread$State$EnumUnboxingLocalUtility.m(attributes, i);
            if (m == 9) {
                textPositionedContainer.dx = parseLengthList(trim);
            } else if (m == 10) {
                textPositionedContainer.dy = parseLengthList(trim);
            } else if (m == 82) {
                textPositionedContainer.x = parseLengthList(trim);
            } else if (m == 83) {
                textPositionedContainer.y = parseLengthList(trim);
            }
        }
    }

    public static void parseAttributesTransform(SVG.HasTransform hasTransform, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (SVGAttr.fromString(attributes.getLocalName(i)) == SVGAttr.transform) {
                hasTransform.setTransform(parseTransformList(attributes.getValue(i)));
            }
        }
    }

    public static void parseAttributesViewBox(SVG.SvgViewBoxContainer svgViewBoxContainer, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int m = Thread$State$EnumUnboxingLocalUtility.m(attributes, i);
            if (m == 48) {
                parsePreserveAspectRatio(svgViewBoxContainer, trim);
            } else if (m != 80) {
                continue;
            } else {
                TimedValueQueue timedValueQueue = new TimedValueQueue(trim, 7);
                timedValueQueue.skipWhitespace();
                float nextFloat = timedValueQueue.nextFloat();
                timedValueQueue.m1142skipCommaWhitespace();
                float nextFloat2 = timedValueQueue.nextFloat();
                timedValueQueue.m1142skipCommaWhitespace();
                float nextFloat3 = timedValueQueue.nextFloat();
                timedValueQueue.m1142skipCommaWhitespace();
                float nextFloat4 = timedValueQueue.nextFloat();
                if (Float.isNaN(nextFloat) || Float.isNaN(nextFloat2) || Float.isNaN(nextFloat3) || Float.isNaN(nextFloat4)) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid viewBox definition - should have four numbers");
                    return;
                } else if (nextFloat3 < RecyclerView.DECELERATION_RATE) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid viewBox. width cannot be negative");
                    return;
                } else {
                    if (nextFloat4 < RecyclerView.DECELERATION_RATE) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid viewBox. height cannot be negative");
                        return;
                    }
                    svgViewBoxContainer.viewBox = new SVG.Box(nextFloat, nextFloat2, nextFloat3, nextFloat4);
                }
            }
        }
    }

    public static SVG.Colour parseColour(String str) {
        long j;
        int i;
        if (str.charAt(0) == '#') {
            int length = str.length();
            IntegerParser integerParser = null;
            if (1 < length) {
                long j2 = 0;
                int i2 = 1;
                while (i2 < length) {
                    char charAt = str.charAt(i2);
                    if (charAt < '0' || charAt > '9') {
                        if (charAt >= 'A' && charAt <= 'F') {
                            j = j2 * 16;
                            i = charAt - 'A';
                        } else {
                            if (charAt < 'a' || charAt > 'f') {
                                break;
                            }
                            j = j2 * 16;
                            i = charAt - 'a';
                        }
                        j2 = j + i + 10;
                    } else {
                        j2 = (j2 * 16) + (charAt - '0');
                    }
                    if (j2 > BodyPartID.bodyIdMax) {
                        break;
                    }
                    i2++;
                }
                if (i2 != 1) {
                    integerParser = new IntegerParser(j2, i2);
                }
            }
            if (integerParser == null) {
                throw new SVGParseException("Bad hex colour value: ".concat(str));
            }
            long j3 = integerParser.value;
            int i3 = integerParser.pos;
            if (i3 == 4) {
                int i4 = (int) j3;
                int i5 = i4 & 3840;
                int i6 = i4 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
                int i7 = i4 & 15;
                return new SVG.Colour(i7 | (i5 << 8) | (i5 << 12) | (-16777216) | (i6 << 8) | (i6 << 4) | (i7 << 4));
            }
            if (i3 != 5) {
                if (i3 == 7) {
                    return new SVG.Colour(((int) j3) | (-16777216));
                }
                if (i3 != 9) {
                    throw new SVGParseException("Bad hex colour value: ".concat(str));
                }
                int i8 = (int) j3;
                return new SVG.Colour((i8 >>> 8) | (i8 << 24));
            }
            int i9 = (int) j3;
            int i10 = 61440 & i9;
            int i11 = i9 & 3840;
            int i12 = i9 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
            int i13 = i9 & 15;
            return new SVG.Colour((i13 << 24) | (i13 << 28) | (i10 << 8) | (i10 << 4) | (i11 << 4) | i11 | i12 | (i12 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean startsWith = lowerCase.startsWith("rgba(");
        if (startsWith || lowerCase.startsWith("rgb(")) {
            TimedValueQueue timedValueQueue = new TimedValueQueue(str.substring(startsWith ? 5 : 4), 7);
            timedValueQueue.skipWhitespace();
            float nextFloat = timedValueQueue.nextFloat();
            if (!Float.isNaN(nextFloat) && timedValueQueue.consume('%')) {
                nextFloat = (nextFloat * 256.0f) / 100.0f;
            }
            float checkedNextFloat = timedValueQueue.checkedNextFloat(nextFloat);
            if (!Float.isNaN(checkedNextFloat) && timedValueQueue.consume('%')) {
                checkedNextFloat = (checkedNextFloat * 256.0f) / 100.0f;
            }
            float checkedNextFloat2 = timedValueQueue.checkedNextFloat(checkedNextFloat);
            if (!Float.isNaN(checkedNextFloat2) && timedValueQueue.consume('%')) {
                checkedNextFloat2 = (checkedNextFloat2 * 256.0f) / 100.0f;
            }
            if (!startsWith) {
                timedValueQueue.skipWhitespace();
                if (Float.isNaN(checkedNextFloat2) || !timedValueQueue.consume(')')) {
                    throw new SVGParseException("Bad rgb() colour value: ".concat(str));
                }
                return new SVG.Colour((clamp255(nextFloat) << 16) | (-16777216) | (clamp255(checkedNextFloat) << 8) | clamp255(checkedNextFloat2));
            }
            float checkedNextFloat3 = timedValueQueue.checkedNextFloat(checkedNextFloat2);
            timedValueQueue.skipWhitespace();
            if (Float.isNaN(checkedNextFloat3) || !timedValueQueue.consume(')')) {
                throw new SVGParseException("Bad rgba() colour value: ".concat(str));
            }
            return new SVG.Colour((clamp255(checkedNextFloat3 * 256.0f) << 24) | (clamp255(nextFloat) << 16) | (clamp255(checkedNextFloat) << 8) | clamp255(checkedNextFloat2));
        }
        boolean startsWith2 = lowerCase.startsWith("hsla(");
        if (!startsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) ColourKeywords.colourKeywords.get(lowerCase);
            if (num != null) {
                return new SVG.Colour(num.intValue());
            }
            throw new SVGParseException("Invalid colour keyword: ".concat(lowerCase));
        }
        TimedValueQueue timedValueQueue2 = new TimedValueQueue(str.substring(startsWith2 ? 5 : 4), 7);
        timedValueQueue2.skipWhitespace();
        float nextFloat2 = timedValueQueue2.nextFloat();
        float checkedNextFloat4 = timedValueQueue2.checkedNextFloat(nextFloat2);
        if (!Float.isNaN(checkedNextFloat4)) {
            timedValueQueue2.consume('%');
        }
        float checkedNextFloat5 = timedValueQueue2.checkedNextFloat(checkedNextFloat4);
        if (!Float.isNaN(checkedNextFloat5)) {
            timedValueQueue2.consume('%');
        }
        if (!startsWith2) {
            timedValueQueue2.skipWhitespace();
            if (Float.isNaN(checkedNextFloat5) || !timedValueQueue2.consume(')')) {
                throw new SVGParseException("Bad hsl() colour value: ".concat(str));
            }
            return new SVG.Colour(hslToRgb(nextFloat2, checkedNextFloat4, checkedNextFloat5) | (-16777216));
        }
        float checkedNextFloat6 = timedValueQueue2.checkedNextFloat(checkedNextFloat5);
        timedValueQueue2.skipWhitespace();
        if (Float.isNaN(checkedNextFloat6) || !timedValueQueue2.consume(')')) {
            throw new SVGParseException("Bad hsla() colour value: ".concat(str));
        }
        return new SVG.Colour((clamp255(checkedNextFloat6 * 256.0f) << 24) | hslToRgb(nextFloat2, checkedNextFloat4, checkedNextFloat5));
    }

    public static float parseFloat(int i, String str) {
        float parseNumber = new NumberParser().parseNumber(0, i, str);
        if (Float.isNaN(parseNumber)) {
            throw new SVGParseException(Recorder$$ExternalSyntheticOutline2.m("Invalid float value: ", str));
        }
        return parseNumber;
    }

    public static ArrayList parseFontFamily(String str) {
        TimedValueQueue timedValueQueue = new TimedValueQueue(str, 7);
        ArrayList arrayList = null;
        do {
            String nextQuotedString = timedValueQueue.nextQuotedString();
            if (nextQuotedString == null) {
                nextQuotedString = timedValueQueue.nextToken(true, ',');
            }
            if (nextQuotedString == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(nextQuotedString);
            timedValueQueue.m1142skipCommaWhitespace();
        } while (!timedValueQueue.empty());
        return arrayList;
    }

    public static String parseFunctionalIRI(String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static SVG.Length parseLength(String str) {
        int i;
        if (str.length() == 0) {
            LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid length value (empty string)");
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
                i = Thread$State$EnumUnboxingLocalUtility.valueOf$1(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new SVGParseException("Invalid length unit specifier: ".concat(str));
            }
        } else {
            i = 1;
        }
        try {
            return new SVG.Length(parseFloat(length, str), i);
        } catch (NumberFormatException e) {
            throw new SVGParseException("Invalid length value: ".concat(str), e);
        }
    }

    public static ArrayList parseLengthList(String str) {
        if (str.length() == 0) {
            LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid length list (empty string)");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        TimedValueQueue timedValueQueue = new TimedValueQueue(str, 7);
        timedValueQueue.skipWhitespace();
        while (!timedValueQueue.empty()) {
            float nextFloat = timedValueQueue.nextFloat();
            if (Float.isNaN(nextFloat)) {
                StringBuilder sb = new StringBuilder("Invalid length list value: ");
                String str2 = (String) timedValueQueue.timestamps;
                int i = timedValueQueue.first;
                while (!timedValueQueue.empty() && !TimedValueQueue.isWhitespace(str2.charAt(timedValueQueue.first))) {
                    timedValueQueue.first++;
                }
                String substring = str2.substring(i, timedValueQueue.first);
                timedValueQueue.first = i;
                sb.append(substring);
                throw new SVGParseException(sb.toString());
            }
            int nextUnit = timedValueQueue.nextUnit();
            if (nextUnit == 0) {
                nextUnit = 1;
            }
            arrayList.add(new SVG.Length(nextFloat, nextUnit));
            timedValueQueue.m1142skipCommaWhitespace();
        }
        return arrayList;
    }

    public static SVG.Length parseLengthOrAuto(TimedValueQueue timedValueQueue) {
        return timedValueQueue.consume("auto") ? new SVG.Length(RecyclerView.DECELERATION_RATE) : timedValueQueue.nextLength();
    }

    public static Float parseOpacity(String str) {
        try {
            float parseFloat = parseFloat(str);
            float f = RecyclerView.DECELERATION_RATE;
            if (parseFloat >= RecyclerView.DECELERATION_RATE) {
                f = 1.0f;
                if (parseFloat > 1.0f) {
                }
                return Float.valueOf(parseFloat);
            }
            parseFloat = f;
            return Float.valueOf(parseFloat);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public static SVG.SvgPaint parsePaintSpecifier(String str) {
        boolean startsWith = str.startsWith("url(");
        SVG.SvgPaint svgPaint = SVG.Colour.TRANSPARENT;
        SVG.SvgPaint svgPaint2 = SVG.CurrentColor.instance;
        SVG.SvgPaint svgPaint3 = null;
        if (!startsWith) {
            if (str.equals("none")) {
                return svgPaint;
            }
            if (str.equals("currentColor")) {
                return svgPaint2;
            }
            try {
                return parseColour(str);
            } catch (SVGParseException unused) {
                return null;
            }
        }
        int indexOf = str.indexOf(")");
        if (indexOf == -1) {
            return new SVG.PaintReference(str.substring(4).trim(), null);
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        if (trim2.length() > 0) {
            if (!trim2.equals("none")) {
                if (trim2.equals("currentColor")) {
                    svgPaint = svgPaint2;
                } else {
                    try {
                        svgPaint = parseColour(trim2);
                    } catch (SVGParseException unused2) {
                        svgPaint = null;
                    }
                }
            }
            svgPaint3 = svgPaint;
        }
        return new SVG.PaintReference(trim, svgPaint3);
    }

    public static void parsePreserveAspectRatio(SVG.SvgPreserveAspectRatioContainer svgPreserveAspectRatioContainer, String str) {
        int i;
        TimedValueQueue timedValueQueue = new TimedValueQueue(str, 7);
        timedValueQueue.skipWhitespace();
        String nextToken = timedValueQueue.nextToken();
        if ("defer".equals(nextToken)) {
            timedValueQueue.skipWhitespace();
            nextToken = timedValueQueue.nextToken();
        }
        PreserveAspectRatio.Alignment alignment = (PreserveAspectRatio.Alignment) AspectRatioKeywords.aspectRatioKeywords.get(nextToken);
        timedValueQueue.skipWhitespace();
        if (timedValueQueue.empty()) {
            i = 0;
        } else {
            String nextToken2 = timedValueQueue.nextToken();
            nextToken2.getClass();
            if (nextToken2.equals("meet")) {
                i = 1;
            } else {
                if (!nextToken2.equals("slice")) {
                    throw new SVGParseException("Invalid preserveAspectRatio definition: ".concat(str));
                }
                i = 2;
            }
        }
        svgPreserveAspectRatioContainer.preserveAspectRatio = new PreserveAspectRatio(alignment, i);
    }

    public static HashMap parseProcessingInstructionAttributes(TimedValueQueue timedValueQueue) {
        HashMap hashMap = new HashMap();
        timedValueQueue.skipWhitespace();
        String nextToken = timedValueQueue.nextToken(false, '=');
        while (nextToken != null) {
            timedValueQueue.consume('=');
            hashMap.put(nextToken, timedValueQueue.nextQuotedString());
            timedValueQueue.skipWhitespace();
            nextToken = timedValueQueue.nextToken(false, '=');
        }
        return hashMap;
    }

    public static Matrix parseTransformList(String str) {
        Matrix matrix = new Matrix();
        TimedValueQueue timedValueQueue = new TimedValueQueue(str, 7);
        timedValueQueue.skipWhitespace();
        while (!timedValueQueue.empty()) {
            String str2 = (String) timedValueQueue.timestamps;
            String str3 = null;
            if (!timedValueQueue.empty()) {
                int i = timedValueQueue.first;
                int charAt = str2.charAt(i);
                while (true) {
                    if ((charAt >= 97 && charAt <= 122) || (charAt >= 65 && charAt <= 90)) {
                        charAt = timedValueQueue.advanceChar();
                    }
                }
                int i2 = timedValueQueue.first;
                while (TimedValueQueue.isWhitespace(charAt)) {
                    charAt = timedValueQueue.advanceChar();
                }
                if (charAt == 40) {
                    timedValueQueue.first++;
                    str3 = str2.substring(i, i2);
                } else {
                    timedValueQueue.first = i;
                }
            }
            if (str3 == null) {
                throw new SVGParseException("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (str3) {
                case "matrix":
                    timedValueQueue.skipWhitespace();
                    float nextFloat = timedValueQueue.nextFloat();
                    timedValueQueue.m1142skipCommaWhitespace();
                    float nextFloat2 = timedValueQueue.nextFloat();
                    timedValueQueue.m1142skipCommaWhitespace();
                    float nextFloat3 = timedValueQueue.nextFloat();
                    timedValueQueue.m1142skipCommaWhitespace();
                    float nextFloat4 = timedValueQueue.nextFloat();
                    timedValueQueue.m1142skipCommaWhitespace();
                    float nextFloat5 = timedValueQueue.nextFloat();
                    timedValueQueue.m1142skipCommaWhitespace();
                    float nextFloat6 = timedValueQueue.nextFloat();
                    timedValueQueue.skipWhitespace();
                    if (!Float.isNaN(nextFloat6) && timedValueQueue.consume(')')) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{nextFloat, nextFloat3, nextFloat5, nextFloat2, nextFloat4, nextFloat6, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f});
                        matrix.preConcat(matrix2);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    break;
                case "rotate":
                    timedValueQueue.skipWhitespace();
                    float nextFloat7 = timedValueQueue.nextFloat();
                    float possibleNextFloat = timedValueQueue.possibleNextFloat();
                    float possibleNextFloat2 = timedValueQueue.possibleNextFloat();
                    timedValueQueue.skipWhitespace();
                    if (Float.isNaN(nextFloat7) || !timedValueQueue.consume(')')) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(possibleNextFloat)) {
                        matrix.preRotate(nextFloat7);
                        break;
                    } else if (!Float.isNaN(possibleNextFloat2)) {
                        matrix.preRotate(nextFloat7, possibleNextFloat, possibleNextFloat2);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    break;
                case "scale":
                    timedValueQueue.skipWhitespace();
                    float nextFloat8 = timedValueQueue.nextFloat();
                    float possibleNextFloat3 = timedValueQueue.possibleNextFloat();
                    timedValueQueue.skipWhitespace();
                    if (!Float.isNaN(nextFloat8) && timedValueQueue.consume(')')) {
                        if (!Float.isNaN(possibleNextFloat3)) {
                            matrix.preScale(nextFloat8, possibleNextFloat3);
                            break;
                        } else {
                            matrix.preScale(nextFloat8, nextFloat8);
                            break;
                        }
                    } else {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    break;
                case "skewX":
                    timedValueQueue.skipWhitespace();
                    float nextFloat9 = timedValueQueue.nextFloat();
                    timedValueQueue.skipWhitespace();
                    if (!Float.isNaN(nextFloat9) && timedValueQueue.consume(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians(nextFloat9)), RecyclerView.DECELERATION_RATE);
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    break;
                case "skewY":
                    timedValueQueue.skipWhitespace();
                    float nextFloat10 = timedValueQueue.nextFloat();
                    timedValueQueue.skipWhitespace();
                    if (!Float.isNaN(nextFloat10) && timedValueQueue.consume(')')) {
                        matrix.preSkew(RecyclerView.DECELERATION_RATE, (float) Math.tan(Math.toRadians(nextFloat10)));
                        break;
                    } else {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    break;
                case "translate":
                    timedValueQueue.skipWhitespace();
                    float nextFloat11 = timedValueQueue.nextFloat();
                    float possibleNextFloat4 = timedValueQueue.possibleNextFloat();
                    timedValueQueue.skipWhitespace();
                    if (!Float.isNaN(nextFloat11) && timedValueQueue.consume(')')) {
                        if (!Float.isNaN(possibleNextFloat4)) {
                            matrix.preTranslate(nextFloat11, possibleNextFloat4);
                            break;
                        } else {
                            matrix.preTranslate(nextFloat11, RecyclerView.DECELERATION_RATE);
                            break;
                        }
                    } else {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    break;
                default:
                    throw new SVGParseException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Invalid transform list fn: ", str3, ")"));
            }
            if (timedValueQueue.empty()) {
                return matrix;
            }
            timedValueQueue.m1142skipCommaWhitespace();
        }
        return matrix;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:466:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void processStyleProperty(SVG.Style style, String str, String str2) {
        n nVar;
        Boolean bool;
        int i;
        SVG.Length length;
        String substring;
        SVG.Length length2;
        int i2;
        int i3;
        SVG.Length nextLength;
        SVG.Length[] lengthArr;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int ordinal = SVGAttr.fromString(str).ordinal();
        int i4 = 5;
        if (ordinal != 1) {
            if (ordinal == 2) {
                style.clipPath = parseFunctionalIRI(str2);
                style.specifiedFlags |= 268435456;
                return;
            }
            if (ordinal == 4) {
                style.clipRule = "nonzero".equals(str2) ? 1 : "evenodd".equals(str2) ? 2 : 0;
                style.specifiedFlags |= 536870912;
                return;
            }
            try {
                if (ordinal == 5) {
                    style.color = parseColour(str2);
                    style.specifiedFlags |= 4096;
                    return;
                }
                if (ordinal == 8) {
                    int i5 = !str2.equals("ltr") ? !str2.equals("rtl") ? 0 : 2 : 1;
                    style.direction = i5;
                    if (i5 != 0) {
                        style.specifiedFlags |= 68719476736L;
                        return;
                    }
                    return;
                }
                if (ordinal == 35) {
                    style.mask = parseFunctionalIRI(str2);
                    style.specifiedFlags |= 1073741824;
                    return;
                }
                if (ordinal == 40) {
                    style.opacity = parseOpacity(str2);
                    style.specifiedFlags |= 2048;
                    return;
                }
                if (ordinal == 42) {
                    switch (str2) {
                        case "hidden":
                        case "scroll":
                            bool = Boolean.FALSE;
                            break;
                        case "auto":
                        case "visible":
                            bool = Boolean.TRUE;
                            break;
                        default:
                            bool = null;
                            break;
                    }
                    style.overflow = bool;
                    if (bool != null) {
                        style.specifiedFlags |= 524288;
                        return;
                    }
                    return;
                }
                if (ordinal == 78) {
                    int i6 = !str2.equals("none") ? !str2.equals("non-scaling-stroke") ? 0 : 2 : 1;
                    style.vectorEffect = i6;
                    if (i6 != 0) {
                        style.specifiedFlags |= 34359738368L;
                        return;
                    }
                    return;
                }
                SVG.CurrentColor currentColor = SVG.CurrentColor.instance;
                if (ordinal == 58) {
                    if (str2.equals("currentColor")) {
                        style.solidColor = currentColor;
                    } else {
                        try {
                            style.solidColor = parseColour(str2);
                        } catch (SVGParseException e) {
                            Log.w("SVGParser", e.getMessage());
                            return;
                        }
                    }
                    style.specifiedFlags |= 2147483648L;
                    return;
                }
                if (ordinal == 59) {
                    style.solidOpacity = parseOpacity(str2);
                    style.specifiedFlags |= 4294967296L;
                    return;
                }
                if (ordinal == 74) {
                    switch (str2) {
                        case "middle":
                            i = 2;
                            break;
                        case "end":
                            i = 3;
                            break;
                        case "start":
                            i = 1;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    style.textAnchor = i;
                    if (i != 0) {
                        style.specifiedFlags |= 262144;
                        return;
                    }
                    return;
                }
                if (ordinal == 75) {
                    switch (str2) {
                        case "line-through":
                            i4 = 4;
                            break;
                        case "underline":
                            i4 = 2;
                            break;
                        case "none":
                            i4 = 1;
                            break;
                        case "blink":
                            break;
                        case "overline":
                            i4 = 3;
                            break;
                        default:
                            i4 = 0;
                            break;
                    }
                    style.textDecoration = i4;
                    if (i4 != 0) {
                        style.specifiedFlags |= 131072;
                        return;
                    }
                    return;
                }
                switch (ordinal) {
                    case 14:
                        if (str2.indexOf(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) < 0) {
                            if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                                style.display = Boolean.valueOf(!str2.equals("none"));
                                style.specifiedFlags |= 16777216;
                                break;
                            }
                        }
                        break;
                    case 15:
                        SVG.SvgPaint parsePaintSpecifier = parsePaintSpecifier(str2);
                        style.fill = parsePaintSpecifier;
                        if (parsePaintSpecifier != null) {
                            style.specifiedFlags |= 1;
                            break;
                        }
                        break;
                    case 16:
                        int i7 = "nonzero".equals(str2) ? 1 : "evenodd".equals(str2) ? 2 : 0;
                        style.fillRule = i7;
                        if (i7 != 0) {
                            style.specifiedFlags |= 2;
                            break;
                        }
                        break;
                    case 17:
                        Float parseOpacity = parseOpacity(str2);
                        style.fillOpacity = parseOpacity;
                        if (parseOpacity != null) {
                            style.specifiedFlags |= 4;
                            break;
                        }
                        break;
                    case 18:
                        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str2 + '|')) {
                            TimedValueQueue timedValueQueue = new TimedValueQueue(str2, 7);
                            Integer num = null;
                            String str3 = null;
                            int i8 = 0;
                            while (true) {
                                String nextToken = timedValueQueue.nextToken(false, '/');
                                timedValueQueue.skipWhitespace();
                                if (nextToken != null) {
                                    if (num == null || i8 == 0) {
                                        if (!nextToken.equals("normal") && (num != null || (num = (Integer) FontWeightKeywords.fontWeightKeywords.get(nextToken)) == null)) {
                                            if (i8 == 0) {
                                                switch (nextToken) {
                                                    case "oblique":
                                                        i8 = 3;
                                                        break;
                                                    case "italic":
                                                        i8 = 2;
                                                        break;
                                                    case "normal":
                                                        i8 = 1;
                                                        break;
                                                    default:
                                                        i8 = 0;
                                                        break;
                                                }
                                                if (i8 != 0) {
                                                    continue;
                                                }
                                            }
                                            if (str3 == null && nextToken.equals("small-caps")) {
                                                str3 = nextToken;
                                            }
                                        }
                                    }
                                    try {
                                        length = (SVG.Length) FontSizeKeywords.fontSizeKeywords.get(nextToken);
                                        if (length == null) {
                                            length = parseLength(nextToken);
                                        }
                                    } catch (SVGParseException unused) {
                                        length = null;
                                    }
                                    if (timedValueQueue.consume('/')) {
                                        timedValueQueue.skipWhitespace();
                                        String nextToken2 = timedValueQueue.nextToken();
                                        if (nextToken2 != null) {
                                            parseLength(nextToken2);
                                        }
                                        timedValueQueue.skipWhitespace();
                                    }
                                    if (timedValueQueue.empty()) {
                                        substring = null;
                                    } else {
                                        int i9 = timedValueQueue.first;
                                        timedValueQueue.first = timedValueQueue.size;
                                        substring = ((String) timedValueQueue.timestamps).substring(i9);
                                    }
                                    style.fontFamily = parseFontFamily(substring);
                                    style.fontSize = length;
                                    style.fontWeight = Integer.valueOf(num == null ? 400 : num.intValue());
                                    style.fontStyle = i8 == 0 ? 1 : i8;
                                    style.specifiedFlags |= 122880;
                                    break;
                                } else {
                                    break;
                                }
                            }
                        }
                        break;
                    case 19:
                        ArrayList parseFontFamily = parseFontFamily(str2);
                        style.fontFamily = parseFontFamily;
                        if (parseFontFamily != null) {
                            style.specifiedFlags |= 8192;
                            break;
                        }
                        break;
                    case 20:
                        try {
                            SVG.Length length3 = (SVG.Length) FontSizeKeywords.fontSizeKeywords.get(str2);
                            length2 = length3 == null ? parseLength(str2) : length3;
                        } catch (SVGParseException unused2) {
                            length2 = null;
                        }
                        style.fontSize = length2;
                        if (length2 != null) {
                            style.specifiedFlags |= 16384;
                            break;
                        }
                        break;
                    case 21:
                        Integer num2 = (Integer) FontWeightKeywords.fontWeightKeywords.get(str2);
                        style.fontWeight = num2;
                        if (num2 != null) {
                            style.specifiedFlags |= 32768;
                            break;
                        }
                        break;
                    case 22:
                        switch (str2) {
                            case "oblique":
                                i2 = 3;
                                break;
                            case "italic":
                                i2 = 2;
                                break;
                            case "normal":
                                i2 = 1;
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                        style.fontStyle = i2;
                        if (i2 != 0) {
                            style.specifiedFlags |= 65536;
                            break;
                        }
                        break;
                    default:
                        switch (ordinal) {
                            case 27:
                                switch (str2) {
                                    case "optimizeQuality":
                                        i3 = 2;
                                        break;
                                    case "auto":
                                        i3 = 1;
                                        break;
                                    case "optimizeSpeed":
                                        i3 = 3;
                                        break;
                                    default:
                                        i3 = 0;
                                        break;
                                }
                                style.imageRendering = i3;
                                if (i3 != 0) {
                                    style.specifiedFlags |= 137438953472L;
                                    break;
                                }
                                break;
                            case 28:
                                String parseFunctionalIRI = parseFunctionalIRI(str2);
                                style.markerStart = parseFunctionalIRI;
                                style.markerMid = parseFunctionalIRI;
                                style.markerEnd = parseFunctionalIRI;
                                style.specifiedFlags |= 14680064;
                                break;
                            case 29:
                                style.markerStart = parseFunctionalIRI(str2);
                                style.specifiedFlags |= 2097152;
                                break;
                            case 30:
                                style.markerMid = parseFunctionalIRI(str2);
                                style.specifiedFlags |= 4194304;
                                break;
                            case 31:
                                style.markerEnd = parseFunctionalIRI(str2);
                                style.specifiedFlags |= 8388608;
                                break;
                            default:
                                switch (ordinal) {
                                    case 62:
                                        if (str2.equals("currentColor")) {
                                            style.stopColor = currentColor;
                                        } else {
                                            try {
                                                style.stopColor = parseColour(str2);
                                            } catch (SVGParseException e2) {
                                                Log.w("SVGParser", e2.getMessage());
                                                return;
                                            }
                                        }
                                        style.specifiedFlags |= 67108864;
                                        break;
                                    case 63:
                                        style.stopOpacity = parseOpacity(str2);
                                        style.specifiedFlags |= 134217728;
                                        break;
                                    case 64:
                                        SVG.SvgPaint parsePaintSpecifier2 = parsePaintSpecifier(str2);
                                        style.stroke = parsePaintSpecifier2;
                                        if (parsePaintSpecifier2 != null) {
                                            style.specifiedFlags |= 8;
                                            break;
                                        }
                                        break;
                                    case 65:
                                        if ("none".equals(str2)) {
                                            style.strokeDashArray = null;
                                            style.specifiedFlags |= 512;
                                            break;
                                        } else {
                                            TimedValueQueue timedValueQueue2 = new TimedValueQueue(str2, 7);
                                            timedValueQueue2.skipWhitespace();
                                            if (!timedValueQueue2.empty() && (nextLength = timedValueQueue2.nextLength()) != null && !nextLength.isNegative()) {
                                                float f = nextLength.value;
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(nextLength);
                                                while (true) {
                                                    if (!timedValueQueue2.empty()) {
                                                        timedValueQueue2.m1142skipCommaWhitespace();
                                                        SVG.Length nextLength2 = timedValueQueue2.nextLength();
                                                        if (nextLength2 != null && !nextLength2.isNegative()) {
                                                            arrayList.add(nextLength2);
                                                            f += nextLength2.value;
                                                        }
                                                    } else if (f != RecyclerView.DECELERATION_RATE) {
                                                        lengthArr = (SVG.Length[]) arrayList.toArray(new SVG.Length[arrayList.size()]);
                                                    }
                                                }
                                                style.strokeDashArray = lengthArr;
                                                if (lengthArr == null) {
                                                    style.specifiedFlags |= 512;
                                                    break;
                                                }
                                            }
                                            lengthArr = null;
                                            style.strokeDashArray = lengthArr;
                                            if (lengthArr == null) {
                                            }
                                        }
                                        break;
                                    case 66:
                                        style.strokeDashOffset = parseLength(str2);
                                        style.specifiedFlags |= 1024;
                                        break;
                                    case 67:
                                        int i10 = "butt".equals(str2) ? 1 : "round".equals(str2) ? 2 : "square".equals(str2) ? 3 : 0;
                                        style.strokeLineCap = i10;
                                        if (i10 != 0) {
                                            style.specifiedFlags |= 64;
                                            break;
                                        }
                                        break;
                                    case 68:
                                        int i11 = "miter".equals(str2) ? 1 : "round".equals(str2) ? 2 : "bevel".equals(str2) ? 3 : 0;
                                        style.strokeLineJoin = i11;
                                        if (i11 != 0) {
                                            style.specifiedFlags |= 128;
                                            break;
                                        }
                                        break;
                                    case 69:
                                        style.strokeMiterLimit = Float.valueOf(parseFloat(str2));
                                        style.specifiedFlags |= 256;
                                        break;
                                    case 70:
                                        Float parseOpacity2 = parseOpacity(str2);
                                        style.strokeOpacity = parseOpacity2;
                                        if (parseOpacity2 != null) {
                                            style.specifiedFlags |= 16;
                                            break;
                                        }
                                        break;
                                    case 71:
                                        style.strokeWidth = parseLength(str2);
                                        style.specifiedFlags |= 32;
                                        break;
                                    default:
                                        switch (ordinal) {
                                            case 88:
                                                if (str2.equals("currentColor")) {
                                                    style.viewportFill = currentColor;
                                                } else {
                                                    try {
                                                        style.viewportFill = parseColour(str2);
                                                    } catch (SVGParseException e3) {
                                                        Log.w("SVGParser", e3.getMessage());
                                                        return;
                                                    }
                                                }
                                                style.specifiedFlags |= 8589934592L;
                                                break;
                                            case 89:
                                                style.viewportFillOpacity = parseOpacity(str2);
                                                style.specifiedFlags |= 17179869184L;
                                                break;
                                            case 90:
                                                if (str2.indexOf(EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) < 0) {
                                                    if ("|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                                                        style.visibility = Boolean.valueOf(str2.equals("visible"));
                                                        style.specifiedFlags |= 33554432;
                                                        break;
                                                    }
                                                }
                                                break;
                                        }
                                }
                        }
                }
                return;
            } catch (SVGParseException unused3) {
                return;
            }
        }
        if (!"auto".equals(str2) && str2.startsWith("rect(")) {
            TimedValueQueue timedValueQueue3 = new TimedValueQueue(str2.substring(5), 7);
            timedValueQueue3.skipWhitespace();
            SVG.Length parseLengthOrAuto = parseLengthOrAuto(timedValueQueue3);
            timedValueQueue3.m1142skipCommaWhitespace();
            SVG.Length parseLengthOrAuto2 = parseLengthOrAuto(timedValueQueue3);
            timedValueQueue3.m1142skipCommaWhitespace();
            SVG.Length parseLengthOrAuto3 = parseLengthOrAuto(timedValueQueue3);
            timedValueQueue3.m1142skipCommaWhitespace();
            SVG.Length parseLengthOrAuto4 = parseLengthOrAuto(timedValueQueue3);
            timedValueQueue3.skipWhitespace();
            if (timedValueQueue3.consume(')') || timedValueQueue3.empty()) {
                nVar = new n();
                nVar.a = parseLengthOrAuto;
                nVar.b = parseLengthOrAuto2;
                nVar.c = parseLengthOrAuto3;
                nVar.d = parseLengthOrAuto4;
                style.clip = nVar;
                if (nVar == null) {
                    style.specifiedFlags |= 1048576;
                    return;
                }
                return;
            }
        }
        nVar = null;
        style.clip = nVar;
        if (nVar == null) {
        }
    }

    public final void appendToTextContainer(String str) {
        SVG.SvgConditionalContainer svgConditionalContainer = (SVG.SvgConditionalContainer) this.currentElement;
        int size = svgConditionalContainer.children.size();
        SVG.SvgObject svgObject = size == 0 ? null : (SVG.SvgObject) svgConditionalContainer.children.get(size - 1);
        if (svgObject instanceof SVG.TextSequence) {
            SVG.TextSequence textSequence = (SVG.TextSequence) svgObject;
            textSequence.text = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), textSequence.text, str);
        } else {
            SVG.SvgContainer svgContainer = this.currentElement;
            SVG.TextSequence textSequence2 = new SVG.TextSequence();
            textSequence2.text = str;
            svgContainer.addChild(textSequence2);
        }
    }

    public final void endElement(String str, String str2, String str3) {
        if (this.ignoring) {
            int i = this.ignoreDepth - 1;
            this.ignoreDepth = i;
            if (i == 0) {
                this.ignoring = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            SVGElem sVGElem = (SVGElem) SVGElem.cache.get(str2);
            if (sVGElem == null) {
                sVGElem = SVGElem.UNSUPPORTED;
            }
            switch (sVGElem.ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case 28:
                case 29:
                case 30:
                    this.currentElement = ((SVG.SvgObject) this.currentElement).parent;
                    break;
                case 5:
                case 26:
                    this.inMetadataElement = false;
                    if (this.metadataElementContents != null) {
                        SVGElem sVGElem2 = this.metadataTag;
                        if (sVGElem2 == SVGElem.title) {
                            this.svgDocument.getClass();
                        } else if (sVGElem2 == SVGElem.desc) {
                            this.svgDocument.getClass();
                        }
                        this.metadataElementContents.setLength(0);
                        break;
                    }
                    break;
                case 21:
                    StringBuilder sb = this.styleElementContents;
                    if (sb != null) {
                        this.inStyleElement = false;
                        String sb2 = sb.toString();
                        CSSParser cSSParser = new CSSParser(1);
                        SVG svg = this.svgDocument;
                        CSSParser.CSSTextScanner cSSTextScanner = new CSSParser.CSSTextScanner(sb2);
                        cSSTextScanner.skipWhitespace();
                        ((CSSParser.Ruleset) svg.cssRules).addAll(cSSParser.parseRuleset(cSSTextScanner));
                        this.styleElementContents.setLength(0);
                        break;
                    }
                    break;
            }
        }
    }

    public final void parseUsingSAX(InputStream inputStream) {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            SAXHandler sAXHandler = new SAXHandler();
            xMLReader.setContentHandler(sAXHandler);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", sAXHandler);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new SVGParseException("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new SVGParseException("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new SVGParseException("SVG parse error", e3);
        }
    }

    public final void parseUsingXmlPullParser(InputStream inputStream) {
        try {
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                XPPAttributesWrapper xPPAttributesWrapper = new XPPAttributesWrapper();
                xPPAttributesWrapper.parser = newPullParser;
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                newPullParser.setInput(inputStream, null);
                for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.nextToken()) {
                    if (eventType == 0) {
                        startDocument();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + newPullParser.getText());
                        TimedValueQueue timedValueQueue = new TimedValueQueue(newPullParser.getText(), 7);
                        String nextToken = timedValueQueue.nextToken();
                        parseProcessingInstructionAttributes(timedValueQueue);
                        nextToken.equals("xml-stylesheet");
                    } else if (eventType != 10) {
                        if (eventType == 2) {
                            String name = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name = newPullParser.getPrefix() + ':' + name;
                            }
                            startElement(newPullParser.getNamespace(), newPullParser.getName(), name, xPPAttributesWrapper);
                        } else if (eventType == 3) {
                            String name2 = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name2 = newPullParser.getPrefix() + ':' + name2;
                            }
                            endElement(newPullParser.getNamespace(), newPullParser.getName(), name2);
                        } else if (eventType == 4) {
                            int[] iArr = new int[2];
                            text(newPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                        } else if (eventType == 5) {
                            text(newPullParser.getText());
                        }
                    } else if (((SVG.Svg) this.svgDocument.rootElement) == null && newPullParser.getText().contains("<!ENTITY ")) {
                        try {
                            Log.d("SVGParser", "Switching to SAX parser to process entities");
                            inputStream.reset();
                            parseUsingSAX(inputStream);
                            return;
                        } catch (IOException unused) {
                            Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                            return;
                        }
                    }
                }
            } catch (IOException e) {
                throw new SVGParseException("Stream error", e);
            }
        } catch (XmlPullParserException e2) {
            throw new SVGParseException("XML parser problem", e2);
        }
    }

    public final void startDocument() {
        SVG svg = new SVG(0);
        svg.rootElement = null;
        svg.cssRules = new CSSParser.Ruleset();
        svg.idToElementMap = new HashMap();
        this.svgDocument = svg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:263:0x0453, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x05f6, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ff, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0a29, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x0c38, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x0e55, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:429:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x097e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        int i;
        SVG.PathDefinition pathDefinition;
        int intValue;
        SVG.PathDefinition pathDefinition2;
        char c;
        float f;
        float nextFloat;
        float f2;
        char charAt;
        boolean z;
        if (this.ignoring) {
            this.ignoreDepth++;
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            SVGElem sVGElem = (SVGElem) SVGElem.cache.get(str2.length() > 0 ? str2 : str3);
            if (sVGElem == null) {
                sVGElem = SVGElem.UNSUPPORTED;
            }
            int i2 = 77;
            int i3 = 0;
            switch (sVGElem.ordinal()) {
                case 0:
                    SVG.Svg svg = new SVG.Svg();
                    svg.document = this.svgDocument;
                    svg.parent = this.currentElement;
                    parseAttributesCore(svg, attributes);
                    parseAttributesStyle(svg, attributes);
                    parseAttributesConditional(svg, attributes);
                    parseAttributesViewBox(svg, attributes);
                    while (i3 < attributes.getLength()) {
                        String trim = attributes.getValue(i3).trim();
                        int m = Thread$State$EnumUnboxingLocalUtility.m(attributes, i3);
                        if (m == 25) {
                            SVG.Length parseLength = parseLength(trim);
                            svg.height = parseLength;
                            if (parseLength.isNegative()) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid <svg> element. height cannot be negative");
                                return;
                            }
                        } else if (m != 79) {
                            switch (m) {
                                case 81:
                                    SVG.Length parseLength2 = parseLength(trim);
                                    svg.width = parseLength2;
                                    if (parseLength2.isNegative()) {
                                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid <svg> element. width cannot be negative");
                                        return;
                                    }
                                    break;
                                case 82:
                                    svg.x = parseLength(trim);
                                    break;
                                case 83:
                                    svg.y = parseLength(trim);
                                    break;
                            }
                        } else {
                            continue;
                        }
                        i3++;
                    }
                    SVG.SvgContainer svgContainer = this.currentElement;
                    if (svgContainer == null) {
                        this.svgDocument.rootElement = svg;
                    } else {
                        svgContainer.addChild(svg);
                    }
                    this.currentElement = svg;
                    return;
                case 1:
                case 7:
                    if (this.currentElement == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    SVG.Group group = new SVG.Group();
                    group.document = this.svgDocument;
                    group.parent = this.currentElement;
                    parseAttributesCore(group, attributes);
                    parseAttributesStyle(group, attributes);
                    parseAttributesTransform(group, attributes);
                    parseAttributesConditional(group, attributes);
                    this.currentElement.addChild(group);
                    this.currentElement = group;
                    return;
                case 2:
                    SVG.SvgContainer svgContainer2 = this.currentElement;
                    if (svgContainer2 == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    SVG.Circle circle = new SVG.Circle();
                    circle.document = this.svgDocument;
                    circle.parent = svgContainer2;
                    parseAttributesCore(circle, attributes);
                    parseAttributesStyle(circle, attributes);
                    parseAttributesTransform(circle, attributes);
                    parseAttributesConditional(circle, attributes);
                    for (int i4 = 0; i4 < attributes.getLength(); i4++) {
                        String trim2 = attributes.getValue(i4).trim();
                        int m2 = Thread$State$EnumUnboxingLocalUtility.m(attributes, i4);
                        if (m2 == 6) {
                            circle.cx = parseLength(trim2);
                        } else if (m2 == 7) {
                            circle.cy = parseLength(trim2);
                        } else if (m2 != 49) {
                            continue;
                        } else {
                            SVG.Length parseLength3 = parseLength(trim2);
                            circle.r = parseLength3;
                            if (parseLength3.isNegative()) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid <circle> element. r cannot be negative");
                                return;
                            }
                        }
                    }
                    this.currentElement.addChild(circle);
                    return;
                case 3:
                    if (this.currentElement == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    SVG.ClipPath clipPath = new SVG.ClipPath();
                    clipPath.document = this.svgDocument;
                    clipPath.parent = this.currentElement;
                    parseAttributesCore(clipPath, attributes);
                    parseAttributesStyle(clipPath, attributes);
                    parseAttributesTransform(clipPath, attributes);
                    parseAttributesConditional(clipPath, attributes);
                    for (int i5 = 0; i5 < attributes.getLength(); i5++) {
                        String trim3 = attributes.getValue(i5).trim();
                        if (Thread$State$EnumUnboxingLocalUtility.m(attributes, i5) == 3) {
                            if ("objectBoundingBox".equals(trim3)) {
                                clipPath.clipPathUnitsAreUser = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(trim3)) {
                                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid value for attribute clipPathUnits");
                                    return;
                                }
                                clipPath.clipPathUnitsAreUser = Boolean.TRUE;
                            }
                        }
                    }
                    this.currentElement.addChild(clipPath);
                    this.currentElement = clipPath;
                    return;
                case 4:
                    if (this.currentElement == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    SVG.Defs defs = new SVG.Defs();
                    defs.document = this.svgDocument;
                    defs.parent = this.currentElement;
                    parseAttributesCore(defs, attributes);
                    parseAttributesStyle(defs, attributes);
                    parseAttributesTransform(defs, attributes);
                    this.currentElement.addChild(defs);
                    this.currentElement = defs;
                    return;
                case 5:
                case 26:
                    this.inMetadataElement = true;
                    this.metadataTag = sVGElem;
                    return;
                case 6:
                    SVG.SvgContainer svgContainer3 = this.currentElement;
                    if (svgContainer3 == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    SVG.Ellipse ellipse = new SVG.Ellipse();
                    ellipse.document = this.svgDocument;
                    ellipse.parent = svgContainer3;
                    parseAttributesCore(ellipse, attributes);
                    parseAttributesStyle(ellipse, attributes);
                    parseAttributesTransform(ellipse, attributes);
                    parseAttributesConditional(ellipse, attributes);
                    for (int i6 = 0; i6 < attributes.getLength(); i6++) {
                        String trim4 = attributes.getValue(i6).trim();
                        int m3 = Thread$State$EnumUnboxingLocalUtility.m(attributes, i6);
                        if (m3 == 6) {
                            ellipse.cx = parseLength(trim4);
                        } else if (m3 == 7) {
                            ellipse.cy = parseLength(trim4);
                        } else if (m3 == 56) {
                            SVG.Length parseLength4 = parseLength(trim4);
                            ellipse.rx = parseLength4;
                            if (parseLength4.isNegative()) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid <ellipse> element. rx cannot be negative");
                                return;
                            }
                        } else if (m3 != 57) {
                            continue;
                        } else {
                            SVG.Length parseLength5 = parseLength(trim4);
                            ellipse.ry = parseLength5;
                            if (parseLength5.isNegative()) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid <ellipse> element. ry cannot be negative");
                                return;
                            }
                        }
                    }
                    this.currentElement.addChild(ellipse);
                    return;
                case 8:
                    if (this.currentElement == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    SVG.Image image = new SVG.Image();
                    image.document = this.svgDocument;
                    image.parent = this.currentElement;
                    parseAttributesCore(image, attributes);
                    parseAttributesStyle(image, attributes);
                    parseAttributesTransform(image, attributes);
                    parseAttributesConditional(image, attributes);
                    for (int i7 = 0; i7 < attributes.getLength(); i7++) {
                        String trim5 = attributes.getValue(i7).trim();
                        int m4 = Thread$State$EnumUnboxingLocalUtility.m(attributes, i7);
                        if (m4 == 25) {
                            SVG.Length parseLength6 = parseLength(trim5);
                            image.height = parseLength6;
                            if (parseLength6.isNegative()) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid <use> element. height cannot be negative");
                                return;
                            }
                        } else if (m4 != 26) {
                            if (m4 != 48) {
                                switch (m4) {
                                    case 81:
                                        SVG.Length parseLength7 = parseLength(trim5);
                                        image.width = parseLength7;
                                        if (parseLength7.isNegative()) {
                                            LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid <use> element. width cannot be negative");
                                            return;
                                        }
                                        break;
                                    case 82:
                                        image.x = parseLength(trim5);
                                        break;
                                    case 83:
                                        image.y = parseLength(trim5);
                                        break;
                                }
                            } else {
                                parsePreserveAspectRatio(image, trim5);
                            }
                        } else if ("".equals(attributes.getURI(i7)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i7))) {
                            image.href = trim5;
                        }
                    }
                    this.currentElement.addChild(image);
                    this.currentElement = image;
                    return;
                case 9:
                    SVG.SvgContainer svgContainer4 = this.currentElement;
                    if (svgContainer4 == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    SVG.Line line = new SVG.Line();
                    line.document = this.svgDocument;
                    line.parent = svgContainer4;
                    parseAttributesCore(line, attributes);
                    parseAttributesStyle(line, attributes);
                    parseAttributesTransform(line, attributes);
                    parseAttributesConditional(line, attributes);
                    for (int i8 = 0; i8 < attributes.getLength(); i8++) {
                        String trim6 = attributes.getValue(i8).trim();
                        switch (Thread$State$EnumUnboxingLocalUtility.m(attributes, i8)) {
                            case 84:
                                line.x1 = parseLength(trim6);
                                break;
                            case 85:
                                line.y1 = parseLength(trim6);
                                break;
                            case 86:
                                line.x2 = parseLength(trim6);
                                break;
                            case 87:
                                line.y2 = parseLength(trim6);
                                break;
                        }
                    }
                    this.currentElement.addChild(line);
                    return;
                case 10:
                    if (this.currentElement == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    SVG.SvgLinearGradient svgLinearGradient = new SVG.SvgLinearGradient();
                    svgLinearGradient.document = this.svgDocument;
                    svgLinearGradient.parent = this.currentElement;
                    parseAttributesCore(svgLinearGradient, attributes);
                    parseAttributesStyle(svgLinearGradient, attributes);
                    parseAttributesGradient(svgLinearGradient, attributes);
                    for (int i9 = 0; i9 < attributes.getLength(); i9++) {
                        String trim7 = attributes.getValue(i9).trim();
                        switch (Thread$State$EnumUnboxingLocalUtility.m(attributes, i9)) {
                            case 84:
                                svgLinearGradient.x1 = parseLength(trim7);
                                break;
                            case 85:
                                svgLinearGradient.y1 = parseLength(trim7);
                                break;
                            case 86:
                                svgLinearGradient.x2 = parseLength(trim7);
                                break;
                            case 87:
                                svgLinearGradient.y2 = parseLength(trim7);
                                break;
                        }
                    }
                    this.currentElement.addChild(svgLinearGradient);
                    this.currentElement = svgLinearGradient;
                    return;
                case 11:
                    if (this.currentElement == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    SVG.Marker marker = new SVG.Marker();
                    marker.document = this.svgDocument;
                    marker.parent = this.currentElement;
                    parseAttributesCore(marker, attributes);
                    parseAttributesStyle(marker, attributes);
                    parseAttributesConditional(marker, attributes);
                    parseAttributesViewBox(marker, attributes);
                    for (int i10 = 0; i10 < attributes.getLength(); i10++) {
                        String trim8 = attributes.getValue(i10).trim();
                        int m5 = Thread$State$EnumUnboxingLocalUtility.m(attributes, i10);
                        if (m5 != 41) {
                            if (m5 == 50) {
                                marker.refX = parseLength(trim8);
                            } else if (m5 != 51) {
                                switch (m5) {
                                    case 32:
                                        SVG.Length parseLength8 = parseLength(trim8);
                                        marker.markerHeight = parseLength8;
                                        if (parseLength8.isNegative()) {
                                            LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid <marker> element. markerHeight cannot be negative");
                                            return;
                                        }
                                        continue;
                                    case 33:
                                        if (!"strokeWidth".equals(trim8)) {
                                            if ("userSpaceOnUse".equals(trim8)) {
                                                marker.markerUnitsAreUser = true;
                                                break;
                                            } else {
                                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid value for attribute markerUnits");
                                                return;
                                            }
                                        } else {
                                            marker.markerUnitsAreUser = false;
                                            continue;
                                        }
                                    case 34:
                                        SVG.Length parseLength9 = parseLength(trim8);
                                        marker.markerWidth = parseLength9;
                                        if (parseLength9.isNegative()) {
                                            LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid <marker> element. markerWidth cannot be negative");
                                            return;
                                        }
                                        break;
                                }
                            } else {
                                marker.refY = parseLength(trim8);
                            }
                        } else if ("auto".equals(trim8)) {
                            marker.orient = Float.valueOf(Float.NaN);
                        } else {
                            marker.orient = Float.valueOf(parseFloat(trim8));
                        }
                    }
                    this.currentElement.addChild(marker);
                    this.currentElement = marker;
                    return;
                case 12:
                    if (this.currentElement == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    SVG.Mask mask = new SVG.Mask();
                    mask.document = this.svgDocument;
                    mask.parent = this.currentElement;
                    parseAttributesCore(mask, attributes);
                    parseAttributesStyle(mask, attributes);
                    parseAttributesConditional(mask, attributes);
                    for (int i11 = 0; i11 < attributes.getLength(); i11++) {
                        String trim9 = attributes.getValue(i11).trim();
                        int m6 = Thread$State$EnumUnboxingLocalUtility.m(attributes, i11);
                        if (m6 == 25) {
                            SVG.Length parseLength10 = parseLength(trim9);
                            mask.height = parseLength10;
                            if (parseLength10.isNegative()) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid <mask> element. height cannot be negative");
                                return;
                            }
                        } else if (m6 != 36) {
                            if (m6 != 37) {
                                switch (m6) {
                                    case 81:
                                        SVG.Length parseLength11 = parseLength(trim9);
                                        mask.width = parseLength11;
                                        if (parseLength11.isNegative()) {
                                            LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid <mask> element. width cannot be negative");
                                            return;
                                        }
                                        break;
                                    case 82:
                                        parseLength(trim9);
                                        break;
                                    case 83:
                                        parseLength(trim9);
                                        break;
                                }
                            } else if ("objectBoundingBox".equals(trim9)) {
                                mask.maskUnitsAreUser = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(trim9)) {
                                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid value for attribute maskUnits");
                                    return;
                                }
                                mask.maskUnitsAreUser = Boolean.TRUE;
                            }
                        } else if ("objectBoundingBox".equals(trim9)) {
                            mask.maskContentUnitsAreUser = Boolean.FALSE;
                        } else {
                            if (!"userSpaceOnUse".equals(trim9)) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid value for attribute maskContentUnits");
                                return;
                            }
                            mask.maskContentUnitsAreUser = Boolean.TRUE;
                        }
                    }
                    this.currentElement.addChild(mask);
                    this.currentElement = mask;
                    return;
                case 13:
                    SVG.SvgContainer svgContainer5 = this.currentElement;
                    if (svgContainer5 == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    SVG.Path path = new SVG.Path();
                    path.document = this.svgDocument;
                    path.parent = svgContainer5;
                    parseAttributesCore(path, attributes);
                    parseAttributesStyle(path, attributes);
                    parseAttributesTransform(path, attributes);
                    parseAttributesConditional(path, attributes);
                    int i12 = 0;
                    while (i12 < attributes.getLength()) {
                        String trim10 = attributes.getValue(i12).trim();
                        int m7 = Thread$State$EnumUnboxingLocalUtility.m(attributes, i12);
                        if (m7 == 13) {
                            TimedValueQueue timedValueQueue = new TimedValueQueue(trim10, 7);
                            SVG.PathDefinition pathDefinition3 = new SVG.PathDefinition(i3);
                            pathDefinition3.commandsLength = i3;
                            pathDefinition3.coordsLength = i3;
                            pathDefinition3.commands = new byte[8];
                            pathDefinition3.coords = new float[16];
                            if (!timedValueQueue.empty() && ((intValue = timedValueQueue.nextChar().intValue()) == i2 || intValue == 109)) {
                                float f3 = 0.0f;
                                float f4 = 0.0f;
                                float f5 = 0.0f;
                                float f6 = 0.0f;
                                float f7 = 0.0f;
                                float f8 = 0.0f;
                                while (true) {
                                    timedValueQueue.skipWhitespace();
                                    switch (intValue) {
                                        case 65:
                                        case 97:
                                            i = i12;
                                            pathDefinition2 = pathDefinition3;
                                            c = 'm';
                                            float nextFloat2 = timedValueQueue.nextFloat();
                                            float checkedNextFloat = timedValueQueue.checkedNextFloat(nextFloat2);
                                            float checkedNextFloat2 = timedValueQueue.checkedNextFloat(checkedNextFloat);
                                            Boolean checkedNextFlag = timedValueQueue.checkedNextFlag(Float.valueOf(checkedNextFloat2));
                                            Boolean checkedNextFlag2 = timedValueQueue.checkedNextFlag(checkedNextFlag);
                                            if (checkedNextFlag2 == null) {
                                                f = nextFloat2;
                                                nextFloat = Float.NaN;
                                            } else {
                                                timedValueQueue.m1142skipCommaWhitespace();
                                                f = nextFloat2;
                                                nextFloat = timedValueQueue.nextFloat();
                                            }
                                            float checkedNextFloat3 = timedValueQueue.checkedNextFloat(nextFloat);
                                            if (!Float.isNaN(checkedNextFloat3) && f >= RecyclerView.DECELERATION_RATE && checkedNextFloat >= RecyclerView.DECELERATION_RATE) {
                                                float f9 = nextFloat;
                                                if (intValue == 97) {
                                                    checkedNextFloat3 += f5;
                                                    f2 = f9 + f3;
                                                } else {
                                                    f2 = f9;
                                                }
                                                float f10 = checkedNextFloat3;
                                                pathDefinition2.arcTo(f, checkedNextFloat, checkedNextFloat2, checkedNextFlag.booleanValue(), checkedNextFlag2.booleanValue(), f2, f10);
                                                pathDefinition = pathDefinition2;
                                                f3 = f2;
                                                f4 = f3;
                                                f5 = f10;
                                                f6 = f5;
                                                timedValueQueue.m1142skipCommaWhitespace();
                                                if (!timedValueQueue.empty()) {
                                                    break;
                                                } else {
                                                    int i13 = timedValueQueue.first;
                                                    if (i13 != timedValueQueue.size && (((charAt = ((String) timedValueQueue.timestamps).charAt(i13)) >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z'))) {
                                                        intValue = timedValueQueue.nextChar().intValue();
                                                    }
                                                    pathDefinition3 = pathDefinition;
                                                    i12 = i;
                                                }
                                            }
                                            break;
                                        case 67:
                                        case 99:
                                            i = i12;
                                            SVG.PathDefinition pathDefinition4 = pathDefinition3;
                                            c = 'm';
                                            float nextFloat3 = timedValueQueue.nextFloat();
                                            float checkedNextFloat4 = timedValueQueue.checkedNextFloat(nextFloat3);
                                            float checkedNextFloat5 = timedValueQueue.checkedNextFloat(checkedNextFloat4);
                                            float checkedNextFloat6 = timedValueQueue.checkedNextFloat(checkedNextFloat5);
                                            float f11 = nextFloat3;
                                            float checkedNextFloat7 = timedValueQueue.checkedNextFloat(checkedNextFloat6);
                                            float checkedNextFloat8 = timedValueQueue.checkedNextFloat(checkedNextFloat7);
                                            if (Float.isNaN(checkedNextFloat8)) {
                                                Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                pathDefinition = pathDefinition4;
                                                break;
                                            } else {
                                                if (intValue == 99) {
                                                    checkedNextFloat7 += f3;
                                                    checkedNextFloat8 += f5;
                                                    checkedNextFloat4 += f5;
                                                    checkedNextFloat5 += f3;
                                                    checkedNextFloat6 += f5;
                                                    f11 += f3;
                                                }
                                                float f12 = checkedNextFloat6;
                                                float f13 = checkedNextFloat7;
                                                float f14 = checkedNextFloat5;
                                                float f15 = checkedNextFloat8;
                                                pathDefinition4.cubicTo(f11, checkedNextFloat4, f14, f12, f13, f15);
                                                f4 = f14;
                                                f6 = f12;
                                                f3 = f13;
                                                f5 = f15;
                                                pathDefinition = pathDefinition4;
                                                timedValueQueue.m1142skipCommaWhitespace();
                                                if (!timedValueQueue.empty()) {
                                                }
                                            }
                                            break;
                                        case 72:
                                        case 104:
                                            i = i12;
                                            pathDefinition = pathDefinition3;
                                            c = 'm';
                                            float nextFloat4 = timedValueQueue.nextFloat();
                                            if (Float.isNaN(nextFloat4)) {
                                                Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                break;
                                            } else {
                                                if (intValue == 104) {
                                                    nextFloat4 += f3;
                                                }
                                                f3 = nextFloat4;
                                                pathDefinition.lineTo(f3, f5);
                                                f4 = f3;
                                                timedValueQueue.m1142skipCommaWhitespace();
                                                if (!timedValueQueue.empty()) {
                                                }
                                            }
                                            break;
                                        case 76:
                                        case 108:
                                            i = i12;
                                            pathDefinition = pathDefinition3;
                                            float nextFloat5 = timedValueQueue.nextFloat();
                                            float checkedNextFloat9 = timedValueQueue.checkedNextFloat(nextFloat5);
                                            if (Float.isNaN(checkedNextFloat9)) {
                                                Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                break;
                                            } else {
                                                if (intValue == 108) {
                                                    nextFloat5 += f3;
                                                    checkedNextFloat9 += f5;
                                                }
                                                f3 = nextFloat5;
                                                f5 = checkedNextFloat9;
                                                pathDefinition.lineTo(f3, f5);
                                                f4 = f3;
                                                c = 'm';
                                                f6 = f5;
                                                timedValueQueue.m1142skipCommaWhitespace();
                                                if (!timedValueQueue.empty()) {
                                                }
                                            }
                                            break;
                                        case 77:
                                        case 109:
                                            i = i12;
                                            pathDefinition = pathDefinition3;
                                            float nextFloat6 = timedValueQueue.nextFloat();
                                            float checkedNextFloat10 = timedValueQueue.checkedNextFloat(nextFloat6);
                                            if (Float.isNaN(checkedNextFloat10)) {
                                                Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                break;
                                            } else {
                                                if (intValue == 109 && pathDefinition.commandsLength != 0) {
                                                    nextFloat6 += f3;
                                                    checkedNextFloat10 += f5;
                                                }
                                                f3 = nextFloat6;
                                                f5 = checkedNextFloat10;
                                                pathDefinition.moveTo(f3, f5);
                                                f4 = f3;
                                                f7 = f4;
                                                intValue = intValue == 109 ? 108 : 76;
                                                f8 = f5;
                                                c = 'm';
                                                f6 = f8;
                                                timedValueQueue.m1142skipCommaWhitespace();
                                                if (!timedValueQueue.empty()) {
                                                }
                                            }
                                            break;
                                        case 81:
                                        case 113:
                                            i = i12;
                                            pathDefinition = pathDefinition3;
                                            float nextFloat7 = timedValueQueue.nextFloat();
                                            float checkedNextFloat11 = timedValueQueue.checkedNextFloat(nextFloat7);
                                            float checkedNextFloat12 = timedValueQueue.checkedNextFloat(checkedNextFloat11);
                                            float checkedNextFloat13 = timedValueQueue.checkedNextFloat(checkedNextFloat12);
                                            if (Float.isNaN(checkedNextFloat13)) {
                                                Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                break;
                                            } else {
                                                if (intValue == 113) {
                                                    checkedNextFloat12 += f3;
                                                    checkedNextFloat13 += f5;
                                                    nextFloat7 += f3;
                                                    checkedNextFloat11 += f5;
                                                }
                                                f3 = checkedNextFloat12;
                                                f5 = checkedNextFloat13;
                                                f6 = checkedNextFloat11;
                                                f4 = nextFloat7;
                                                pathDefinition.quadTo(f4, f6, f3, f5);
                                                c = 'm';
                                                timedValueQueue.m1142skipCommaWhitespace();
                                                if (!timedValueQueue.empty()) {
                                                }
                                            }
                                            break;
                                        case 83:
                                        case 115:
                                            i = i12;
                                            float f16 = (f3 * 2.0f) - f4;
                                            float f17 = (2.0f * f5) - f6;
                                            float nextFloat8 = timedValueQueue.nextFloat();
                                            float checkedNextFloat14 = timedValueQueue.checkedNextFloat(nextFloat8);
                                            float checkedNextFloat15 = timedValueQueue.checkedNextFloat(checkedNextFloat14);
                                            float checkedNextFloat16 = timedValueQueue.checkedNextFloat(checkedNextFloat15);
                                            if (Float.isNaN(checkedNextFloat16)) {
                                                Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                break;
                                            } else {
                                                if (intValue == 115) {
                                                    checkedNextFloat15 += f3;
                                                    checkedNextFloat16 += f5;
                                                    nextFloat8 += f3;
                                                    checkedNextFloat14 += f5;
                                                }
                                                float f18 = nextFloat8;
                                                float f19 = checkedNextFloat14;
                                                float f20 = checkedNextFloat15;
                                                float f21 = checkedNextFloat16;
                                                SVG.PathDefinition pathDefinition5 = pathDefinition3;
                                                pathDefinition5.cubicTo(f16, f17, f18, f19, f20, f21);
                                                f4 = f18;
                                                f6 = f19;
                                                f3 = f20;
                                                f5 = f21;
                                                pathDefinition = pathDefinition5;
                                                c = 'm';
                                                timedValueQueue.m1142skipCommaWhitespace();
                                                if (!timedValueQueue.empty()) {
                                                }
                                            }
                                            break;
                                        case 84:
                                        case 116:
                                            f4 = (f3 * 2.0f) - f4;
                                            f6 = (2.0f * f5) - f6;
                                            i = i12;
                                            float nextFloat9 = timedValueQueue.nextFloat();
                                            float checkedNextFloat17 = timedValueQueue.checkedNextFloat(nextFloat9);
                                            if (Float.isNaN(checkedNextFloat17)) {
                                                Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                                break;
                                            } else {
                                                if (intValue == 116) {
                                                    nextFloat9 += f3;
                                                    checkedNextFloat17 += f5;
                                                }
                                                f3 = nextFloat9;
                                                f5 = checkedNextFloat17;
                                                pathDefinition3.quadTo(f4, f6, f3, f5);
                                                pathDefinition = pathDefinition3;
                                                c = 'm';
                                                timedValueQueue.m1142skipCommaWhitespace();
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
                                                    nextFloat10 += f5;
                                                }
                                                f5 = nextFloat10;
                                                pathDefinition3.lineTo(f3, f5);
                                                i = i12;
                                                pathDefinition = pathDefinition3;
                                                f6 = f5;
                                                c = 'm';
                                                timedValueQueue.m1142skipCommaWhitespace();
                                                if (!timedValueQueue.empty()) {
                                                }
                                            }
                                            break;
                                        case 90:
                                        case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                                            pathDefinition3.close();
                                            i = i12;
                                            pathDefinition = pathDefinition3;
                                            f3 = f7;
                                            f4 = f3;
                                            f5 = f8;
                                            f6 = f5;
                                            c = 'm';
                                            timedValueQueue.m1142skipCommaWhitespace();
                                            if (!timedValueQueue.empty()) {
                                            }
                                            break;
                                    }
                                }
                                pathDefinition = pathDefinition2;
                                Log.e("SVGParser", "Bad path coords for " + ((char) intValue) + " path segment");
                                path.d = pathDefinition;
                            }
                            i = i12;
                            pathDefinition = pathDefinition3;
                            path.d = pathDefinition;
                        } else {
                            if (m7 == 43 && parseFloat(trim10) < RecyclerView.DECELERATION_RATE) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid <path> element. pathLength cannot be negative");
                                return;
                            }
                            i = i12;
                        }
                        i12 = i + 1;
                        i2 = 77;
                        i3 = 0;
                    }
                    this.currentElement.addChild(path);
                    return;
                case 14:
                    if (this.currentElement == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    SVG.Pattern pattern = new SVG.Pattern();
                    pattern.document = this.svgDocument;
                    pattern.parent = this.currentElement;
                    parseAttributesCore(pattern, attributes);
                    parseAttributesStyle(pattern, attributes);
                    parseAttributesConditional(pattern, attributes);
                    parseAttributesViewBox(pattern, attributes);
                    while (i3 < attributes.getLength()) {
                        String trim11 = attributes.getValue(i3).trim();
                        int m8 = Thread$State$EnumUnboxingLocalUtility.m(attributes, i3);
                        if (m8 == 25) {
                            SVG.Length parseLength12 = parseLength(trim11);
                            pattern.height = parseLength12;
                            if (parseLength12.isNegative()) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid <pattern> element. height cannot be negative");
                                return;
                            }
                        } else if (m8 != 26) {
                            switch (m8) {
                                case 44:
                                    if (!"objectBoundingBox".equals(trim11)) {
                                        if ("userSpaceOnUse".equals(trim11)) {
                                            pattern.patternContentUnitsAreUser = Boolean.TRUE;
                                            break;
                                        } else {
                                            LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid value for attribute patternContentUnits");
                                            return;
                                        }
                                    } else {
                                        pattern.patternContentUnitsAreUser = Boolean.FALSE;
                                        break;
                                    }
                                case 45:
                                    pattern.patternTransform = parseTransformList(trim11);
                                    break;
                                case 46:
                                    if (!"objectBoundingBox".equals(trim11)) {
                                        if ("userSpaceOnUse".equals(trim11)) {
                                            pattern.patternUnitsAreUser = Boolean.TRUE;
                                            break;
                                        } else {
                                            LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid value for attribute patternUnits");
                                            return;
                                        }
                                    } else {
                                        pattern.patternUnitsAreUser = Boolean.FALSE;
                                        break;
                                    }
                                default:
                                    switch (m8) {
                                        case 81:
                                            SVG.Length parseLength13 = parseLength(trim11);
                                            pattern.width = parseLength13;
                                            if (parseLength13.isNegative()) {
                                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid <pattern> element. width cannot be negative");
                                                return;
                                            }
                                            break;
                                        case 82:
                                            pattern.x = parseLength(trim11);
                                            break;
                                        case 83:
                                            pattern.y = parseLength(trim11);
                                            break;
                                    }
                            }
                        } else if ("".equals(attributes.getURI(i3)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i3))) {
                            pattern.href = trim11;
                        }
                        i3++;
                    }
                    this.currentElement.addChild(pattern);
                    this.currentElement = pattern;
                    return;
                case 15:
                    SVG.SvgContainer svgContainer6 = this.currentElement;
                    if (svgContainer6 == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    SVG.Polygon polygon = new SVG.Polygon();
                    polygon.document = this.svgDocument;
                    polygon.parent = svgContainer6;
                    parseAttributesCore(polygon, attributes);
                    parseAttributesStyle(polygon, attributes);
                    parseAttributesTransform(polygon, attributes);
                    parseAttributesConditional(polygon, attributes);
                    parseAttributesPolyLine(polygon, attributes, "polygon");
                    this.currentElement.addChild(polygon);
                    return;
                case 16:
                    SVG.SvgContainer svgContainer7 = this.currentElement;
                    if (svgContainer7 == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    SVG.PolyLine polyLine = new SVG.PolyLine();
                    polyLine.document = this.svgDocument;
                    polyLine.parent = svgContainer7;
                    parseAttributesCore(polyLine, attributes);
                    parseAttributesStyle(polyLine, attributes);
                    parseAttributesTransform(polyLine, attributes);
                    parseAttributesConditional(polyLine, attributes);
                    parseAttributesPolyLine(polyLine, attributes, "polyline");
                    this.currentElement.addChild(polyLine);
                    return;
                case 17:
                    if (this.currentElement == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    SVG.SvgRadialGradient svgRadialGradient = new SVG.SvgRadialGradient();
                    svgRadialGradient.document = this.svgDocument;
                    svgRadialGradient.parent = this.currentElement;
                    parseAttributesCore(svgRadialGradient, attributes);
                    parseAttributesStyle(svgRadialGradient, attributes);
                    parseAttributesGradient(svgRadialGradient, attributes);
                    while (i3 < attributes.getLength()) {
                        String trim12 = attributes.getValue(i3).trim();
                        int m9 = Thread$State$EnumUnboxingLocalUtility.m(attributes, i3);
                        if (m9 == 6) {
                            svgRadialGradient.cx = parseLength(trim12);
                        } else if (m9 == 7) {
                            svgRadialGradient.cy = parseLength(trim12);
                        } else if (m9 == 11) {
                            svgRadialGradient.fx = parseLength(trim12);
                        } else if (m9 == 12) {
                            svgRadialGradient.fy = parseLength(trim12);
                        } else if (m9 != 49) {
                            continue;
                        } else {
                            SVG.Length parseLength14 = parseLength(trim12);
                            svgRadialGradient.r = parseLength14;
                            if (parseLength14.isNegative()) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid <radialGradient> element. r cannot be negative");
                                return;
                            }
                        }
                        i3++;
                    }
                    this.currentElement.addChild(svgRadialGradient);
                    this.currentElement = svgRadialGradient;
                    return;
                case 18:
                    SVG.SvgContainer svgContainer8 = this.currentElement;
                    if (svgContainer8 == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    SVG.Rect rect = new SVG.Rect();
                    rect.document = this.svgDocument;
                    rect.parent = svgContainer8;
                    parseAttributesCore(rect, attributes);
                    parseAttributesStyle(rect, attributes);
                    parseAttributesTransform(rect, attributes);
                    parseAttributesConditional(rect, attributes);
                    while (i3 < attributes.getLength()) {
                        String trim13 = attributes.getValue(i3).trim();
                        int m10 = Thread$State$EnumUnboxingLocalUtility.m(attributes, i3);
                        if (m10 == 25) {
                            SVG.Length parseLength15 = parseLength(trim13);
                            rect.height = parseLength15;
                            if (parseLength15.isNegative()) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid <rect> element. height cannot be negative");
                                return;
                            }
                        } else if (m10 == 56) {
                            SVG.Length parseLength16 = parseLength(trim13);
                            rect.rx = parseLength16;
                            if (parseLength16.isNegative()) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid <rect> element. rx cannot be negative");
                                return;
                            }
                        } else if (m10 != 57) {
                            switch (m10) {
                                case 81:
                                    SVG.Length parseLength17 = parseLength(trim13);
                                    rect.width = parseLength17;
                                    if (parseLength17.isNegative()) {
                                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid <rect> element. width cannot be negative");
                                        return;
                                    }
                                    break;
                                case 82:
                                    rect.x = parseLength(trim13);
                                    break;
                                case 83:
                                    rect.y = parseLength(trim13);
                                    break;
                            }
                        } else {
                            SVG.Length parseLength18 = parseLength(trim13);
                            rect.ry = parseLength18;
                            if (parseLength18.isNegative()) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid <rect> element. ry cannot be negative");
                                return;
                            }
                        }
                        i3++;
                    }
                    this.currentElement.addChild(rect);
                    return;
                case 19:
                    SVG.SvgContainer svgContainer9 = this.currentElement;
                    if (svgContainer9 == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    SVG.SolidColor solidColor = new SVG.SolidColor();
                    solidColor.document = this.svgDocument;
                    solidColor.parent = svgContainer9;
                    parseAttributesCore(solidColor, attributes);
                    parseAttributesStyle(solidColor, attributes);
                    this.currentElement.addChild(solidColor);
                    this.currentElement = solidColor;
                    return;
                case 20:
                    SVG.SvgContainer svgContainer10 = this.currentElement;
                    if (svgContainer10 == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(svgContainer10 instanceof SVG.GradientElement)) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
                        return;
                    }
                    SVG.Stop stop = new SVG.Stop();
                    stop.document = this.svgDocument;
                    stop.parent = svgContainer10;
                    parseAttributesCore(stop, attributes);
                    parseAttributesStyle(stop, attributes);
                    for (int i14 = 0; i14 < attributes.getLength(); i14++) {
                        String trim14 = attributes.getValue(i14).trim();
                        if (Thread$State$EnumUnboxingLocalUtility.m(attributes, i14) == 39) {
                            if (trim14.length() == 0) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid offset value in <stop> (empty string)");
                                return;
                            }
                            int length = trim14.length();
                            if (trim14.charAt(trim14.length() - 1) == '%') {
                                length--;
                                z = true;
                            } else {
                                z = false;
                            }
                            try {
                                float parseFloat = parseFloat(length, trim14);
                                float f22 = 100.0f;
                                if (z) {
                                    parseFloat /= 100.0f;
                                }
                                if (parseFloat < RecyclerView.DECELERATION_RATE) {
                                    f22 = 0.0f;
                                } else if (parseFloat <= 100.0f) {
                                    f22 = parseFloat;
                                }
                                stop.offset = Float.valueOf(f22);
                            } catch (NumberFormatException e) {
                                throw new SVGParseException("Invalid offset value in <stop>: ".concat(trim14), e);
                            }
                        }
                    }
                    this.currentElement.addChild(stop);
                    this.currentElement = stop;
                    return;
                case 21:
                    if (this.currentElement == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    String str4 = "all";
                    boolean z2 = true;
                    while (i3 < attributes.getLength()) {
                        String trim15 = attributes.getValue(i3).trim();
                        int m11 = Thread$State$EnumUnboxingLocalUtility.m(attributes, i3);
                        if (m11 == 38) {
                            str4 = trim15;
                        } else if (m11 == 77) {
                            z2 = trim15.equals("text/css");
                        }
                        i3++;
                    }
                    if (z2) {
                        CSSParser.CSSTextScanner cSSTextScanner = new CSSParser.CSSTextScanner(str4);
                        cSSTextScanner.skipWhitespace();
                        Iterator it = CSSParser.parseMediaList(cSSTextScanner).iterator();
                        while (it.hasNext()) {
                            CSSParser.MediaType mediaType = (CSSParser.MediaType) it.next();
                            if (mediaType == CSSParser.MediaType.all || mediaType == CSSParser.MediaType.screen) {
                                this.inStyleElement = true;
                                return;
                            }
                        }
                    }
                    this.ignoring = true;
                    this.ignoreDepth = 1;
                    return;
                case 22:
                    if (this.currentElement == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    SVG.Switch r1 = new SVG.Switch();
                    r1.document = this.svgDocument;
                    r1.parent = this.currentElement;
                    parseAttributesCore(r1, attributes);
                    parseAttributesStyle(r1, attributes);
                    parseAttributesTransform(r1, attributes);
                    parseAttributesConditional(r1, attributes);
                    this.currentElement.addChild(r1);
                    this.currentElement = r1;
                    return;
                case 23:
                    if (this.currentElement == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    SVG.Symbol symbol = new SVG.Symbol();
                    symbol.document = this.svgDocument;
                    symbol.parent = this.currentElement;
                    parseAttributesCore(symbol, attributes);
                    parseAttributesStyle(symbol, attributes);
                    parseAttributesConditional(symbol, attributes);
                    parseAttributesViewBox(symbol, attributes);
                    this.currentElement.addChild(symbol);
                    this.currentElement = symbol;
                    return;
                case 24:
                    if (this.currentElement == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    SVG.Text text = new SVG.Text();
                    text.document = this.svgDocument;
                    text.parent = this.currentElement;
                    parseAttributesCore(text, attributes);
                    parseAttributesStyle(text, attributes);
                    parseAttributesTransform(text, attributes);
                    parseAttributesConditional(text, attributes);
                    parseAttributesTextPosition(text, attributes);
                    this.currentElement.addChild(text);
                    this.currentElement = text;
                    return;
                case 25:
                    if (this.currentElement == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    SVG.TextPath textPath = new SVG.TextPath();
                    textPath.document = this.svgDocument;
                    textPath.parent = this.currentElement;
                    parseAttributesCore(textPath, attributes);
                    parseAttributesStyle(textPath, attributes);
                    parseAttributesConditional(textPath, attributes);
                    while (i3 < attributes.getLength()) {
                        String trim16 = attributes.getValue(i3).trim();
                        int m12 = Thread$State$EnumUnboxingLocalUtility.m(attributes, i3);
                        if (m12 != 26) {
                            if (m12 == 61) {
                                textPath.startOffset = parseLength(trim16);
                            }
                        } else if ("".equals(attributes.getURI(i3)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i3))) {
                            textPath.href = trim16;
                        }
                        i3++;
                    }
                    this.currentElement.addChild(textPath);
                    this.currentElement = textPath;
                    SVG.SvgContainer svgContainer11 = textPath.parent;
                    if (svgContainer11 instanceof SVG.Text) {
                        textPath.textRoot = (SVG.Text) svgContainer11;
                        return;
                    } else {
                        textPath.textRoot = ((SVG.TextChild) svgContainer11).getTextRoot();
                        return;
                    }
                case 27:
                    SVG.SvgContainer svgContainer12 = this.currentElement;
                    if (svgContainer12 == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(svgContainer12 instanceof SVG.TextContainer)) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                        return;
                    }
                    SVG.TRef tRef = new SVG.TRef();
                    tRef.document = this.svgDocument;
                    tRef.parent = this.currentElement;
                    parseAttributesCore(tRef, attributes);
                    parseAttributesStyle(tRef, attributes);
                    parseAttributesConditional(tRef, attributes);
                    while (i3 < attributes.getLength()) {
                        String trim17 = attributes.getValue(i3).trim();
                        if (Thread$State$EnumUnboxingLocalUtility.m(attributes, i3) == 26 && ("".equals(attributes.getURI(i3)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i3)))) {
                            tRef.href = trim17;
                        }
                        i3++;
                    }
                    this.currentElement.addChild(tRef);
                    SVG.SvgContainer svgContainer13 = tRef.parent;
                    if (svgContainer13 instanceof SVG.Text) {
                        tRef.textRoot = (SVG.Text) svgContainer13;
                        return;
                    } else {
                        tRef.textRoot = ((SVG.TextChild) svgContainer13).getTextRoot();
                        return;
                    }
                case 28:
                    SVG.SvgContainer svgContainer14 = this.currentElement;
                    if (svgContainer14 == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(svgContainer14 instanceof SVG.TextContainer)) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                        return;
                    }
                    SVG.TSpan tSpan = new SVG.TSpan();
                    tSpan.document = this.svgDocument;
                    tSpan.parent = this.currentElement;
                    parseAttributesCore(tSpan, attributes);
                    parseAttributesStyle(tSpan, attributes);
                    parseAttributesConditional(tSpan, attributes);
                    parseAttributesTextPosition(tSpan, attributes);
                    this.currentElement.addChild(tSpan);
                    this.currentElement = tSpan;
                    SVG.SvgContainer svgContainer15 = tSpan.parent;
                    if (svgContainer15 instanceof SVG.Text) {
                        tSpan.textRoot = (SVG.Text) svgContainer15;
                        return;
                    } else {
                        tSpan.textRoot = ((SVG.TextChild) svgContainer15).getTextRoot();
                        return;
                    }
                case 29:
                    if (this.currentElement == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    SVG.Use use = new SVG.Use();
                    use.document = this.svgDocument;
                    use.parent = this.currentElement;
                    parseAttributesCore(use, attributes);
                    parseAttributesStyle(use, attributes);
                    parseAttributesTransform(use, attributes);
                    parseAttributesConditional(use, attributes);
                    while (i3 < attributes.getLength()) {
                        String trim18 = attributes.getValue(i3).trim();
                        int m13 = Thread$State$EnumUnboxingLocalUtility.m(attributes, i3);
                        if (m13 == 25) {
                            SVG.Length parseLength19 = parseLength(trim18);
                            use.height = parseLength19;
                            if (parseLength19.isNegative()) {
                                LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid <use> element. height cannot be negative");
                                return;
                            }
                        } else if (m13 != 26) {
                            switch (m13) {
                                case 81:
                                    SVG.Length parseLength20 = parseLength(trim18);
                                    use.width = parseLength20;
                                    if (parseLength20.isNegative()) {
                                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid <use> element. width cannot be negative");
                                        return;
                                    }
                                    break;
                                case 82:
                                    use.x = parseLength(trim18);
                                    break;
                                case 83:
                                    use.y = parseLength(trim18);
                                    break;
                            }
                        } else if ("".equals(attributes.getURI(i3)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i3))) {
                            use.href = trim18;
                        }
                        i3++;
                    }
                    this.currentElement.addChild(use);
                    this.currentElement = use;
                    return;
                case 30:
                    if (this.currentElement == null) {
                        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid document. Root element must be <svg>");
                        return;
                    }
                    SVG.View view = new SVG.View();
                    view.document = this.svgDocument;
                    view.parent = this.currentElement;
                    parseAttributesCore(view, attributes);
                    parseAttributesConditional(view, attributes);
                    parseAttributesViewBox(view, attributes);
                    this.currentElement.addChild(view);
                    this.currentElement = view;
                    return;
                default:
                    this.ignoring = true;
                    this.ignoreDepth = 1;
                    return;
            }
        }
    }

    public final void text(String str) {
        if (this.ignoring) {
            return;
        }
        if (this.inMetadataElement) {
            if (this.metadataElementContents == null) {
                this.metadataElementContents = new StringBuilder(str.length());
            }
            this.metadataElementContents.append(str);
        } else if (this.inStyleElement) {
            if (this.styleElementContents == null) {
                this.styleElementContents = new StringBuilder(str.length());
            }
            this.styleElementContents.append(str);
        } else if (this.currentElement instanceof SVG.TextContainer) {
            appendToTextContainer(str);
        }
    }

    public static float parseFloat(String str) {
        int length = str.length();
        if (length != 0) {
            return parseFloat(length, str);
        }
        LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m("Invalid float value (empty string)");
        return RecyclerView.DECELERATION_RATE;
    }

    public final void text(char[] cArr, int i, int i2) {
        if (this.ignoring) {
            return;
        }
        if (this.inMetadataElement) {
            if (this.metadataElementContents == null) {
                this.metadataElementContents = new StringBuilder(i2);
            }
            this.metadataElementContents.append(cArr, i, i2);
        } else if (this.inStyleElement) {
            if (this.styleElementContents == null) {
                this.styleElementContents = new StringBuilder(i2);
            }
            this.styleElementContents.append(cArr, i, i2);
        } else if (this.currentElement instanceof SVG.TextContainer) {
            appendToTextContainer(new String(cArr, i, i2));
        }
    }
}
