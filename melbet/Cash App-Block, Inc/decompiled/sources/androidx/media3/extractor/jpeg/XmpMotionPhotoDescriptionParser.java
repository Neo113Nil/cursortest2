package androidx.media3.extractor.jpeg;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import java.io.StringReader;
import okhttp3.internal.http1.HeadersReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes3.dex */
public abstract class XmpMotionPhotoDescriptionParser {
    public static final String[] MOTION_PHOTO_ATTRIBUTE_NAMES = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r6 == (-1)) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HeadersReader parseInternal(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!Log.isStartTag(newPullParser, "x:xmpmeta")) {
            throw ParserException.createForMalformedContainer(null, "Couldn't find xmp metadata");
        }
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
        long j = -9223372036854775807L;
        loop0: while (true) {
            newPullParser.next();
            if (Log.isStartTag(newPullParser, "rdf:Description")) {
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        break loop0;
                    }
                    String attributeValue = Log.getAttributeValue(newPullParser, MOTION_PHOTO_ATTRIBUTE_NAMES[i2]);
                    if (attributeValue == null) {
                        i2++;
                    } else {
                        if (Integer.parseInt(attributeValue) != 1) {
                            break;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 >= 4) {
                                break;
                            }
                            String attributeValue2 = Log.getAttributeValue(newPullParser, DESCRIPTION_MOTION_PHOTO_PRESENTATION_TIMESTAMP_ATTRIBUTE_NAMES[i3]);
                            if (attributeValue2 != null) {
                                j = Long.parseLong(attributeValue2);
                            } else {
                                i3++;
                            }
                        }
                        j = -9223372036854775807L;
                        while (true) {
                            if (i >= 2) {
                                ImmutableList.Itr itr2 = ImmutableList.EMPTY_ITR;
                                regularImmutableList = RegularImmutableList.EMPTY;
                                break;
                            }
                            String attributeValue3 = Log.getAttributeValue(newPullParser, DESCRIPTION_MICRO_VIDEO_OFFSET_ATTRIBUTE_NAMES[i]);
                            if (attributeValue3 != null) {
                                regularImmutableList = ImmutableList.of((Object) new MotionPhotoDescription$ContainerItem(0L, 0L, "image/jpeg"), (Object) new MotionPhotoDescription$ContainerItem(Long.parseLong(attributeValue3), 0L, "video/mp4"));
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else if (Log.isStartTag(newPullParser, "Container:Directory")) {
                regularImmutableList = parseMotionPhotoV1Directory(newPullParser, "Container", "Item");
            } else if (Log.isStartTag(newPullParser, "GContainer:Directory")) {
                regularImmutableList = parseMotionPhotoV1Directory(newPullParser, "GContainer", "GContainerItem");
            }
            if (Log.isEndTag(newPullParser, "x:xmpmeta")) {
                if (!regularImmutableList.isEmpty()) {
                    return new HeadersReader(j, regularImmutableList, 5);
                }
            }
        }
        return null;
    }

    public static RegularImmutableList parseMotionPhotoV1Directory(XmlPullParser xmlPullParser, String str, String str2) {
        ImmutableList.Builder builder = ImmutableList.builder();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (Log.isStartTag(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String attributeValue = Log.getAttributeValue(xmlPullParser, concat3);
                String attributeValue2 = Log.getAttributeValue(xmlPullParser, concat4);
                String attributeValue3 = Log.getAttributeValue(xmlPullParser, concat5);
                String attributeValue4 = Log.getAttributeValue(xmlPullParser, concat6);
                if (attributeValue == null || attributeValue2 == null) {
                    return RegularImmutableList.EMPTY;
                }
                builder.m2032add((Object) new MotionPhotoDescription$ContainerItem(attributeValue3 != null ? Long.parseLong(attributeValue3) : 0L, attributeValue4 != null ? Long.parseLong(attributeValue4) : 0L, attributeValue));
            }
        } while (!Log.isEndTag(xmlPullParser, concat2));
        return builder.build();
    }
}
