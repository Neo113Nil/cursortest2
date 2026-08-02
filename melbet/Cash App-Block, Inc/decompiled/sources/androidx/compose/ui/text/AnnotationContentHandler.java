package androidx.compose.ui.text;

import android.text.Editable;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;

/* loaded from: classes3.dex */
public final class AnnotationContentHandler implements ContentHandler {
    public int bulletIndentation;
    public final ContentHandler contentHandler;
    public BulletSpanWithLevel currentBulletSpan;
    public final Editable output;

    public AnnotationContentHandler(ContentHandler contentHandler, Editable editable) {
        this.contentHandler = contentHandler;
        this.output = editable;
    }

    @Override // org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        this.contentHandler.characters(cArr, i, i2);
    }

    public final void commitCurrentBulletSpan() {
        BulletSpanWithLevel bulletSpanWithLevel = this.currentBulletSpan;
        if (bulletSpanWithLevel != null) {
            int i = bulletSpanWithLevel.start;
            Editable editable = this.output;
            editable.setSpan(bulletSpanWithLevel, i, editable.length(), 33);
        }
        this.currentBulletSpan = null;
    }

    @Override // org.xml.sax.ContentHandler
    public final void endDocument() {
        this.contentHandler.endDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -1555043537) {
                if (hashCode != 3453) {
                    if (hashCode == 3735 && str2.equals("ul")) {
                        commitCurrentBulletSpan();
                        this.bulletIndentation--;
                        return;
                    }
                } else if (str2.equals("li")) {
                    commitCurrentBulletSpan();
                    return;
                }
            } else if (str2.equals("annotation")) {
                Editable editable = this.output;
                Object[] spans = editable.getSpans(0, editable.length(), AnnotationSpan.class);
                ArrayList arrayList = new ArrayList();
                for (Object obj : spans) {
                    if (editable.getSpanFlags((AnnotationSpan) obj) == 17) {
                        arrayList.add(obj);
                    }
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    AnnotationSpan annotationSpan = (AnnotationSpan) arrayList.get(i);
                    int spanStart = editable.getSpanStart(annotationSpan);
                    int length = editable.length();
                    editable.removeSpan(annotationSpan);
                    if (spanStart != length) {
                        editable.setSpan(annotationSpan, spanStart, length, 33);
                    }
                }
                return;
            }
        }
        this.contentHandler.endElement(str, str2, str3);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endPrefixMapping(String str) {
        this.contentHandler.endPrefixMapping(str);
    }

    @Override // org.xml.sax.ContentHandler
    public final void ignorableWhitespace(char[] cArr, int i, int i2) {
        this.contentHandler.ignorableWhitespace(cArr, i, i2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void processingInstruction(String str, String str2) {
        this.contentHandler.processingInstruction(str, str2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void setDocumentLocator(Locator locator) {
        this.contentHandler.setDocumentLocator(locator);
    }

    @Override // org.xml.sax.ContentHandler
    public final void skippedEntity(String str) {
        this.contentHandler.skippedEntity(str);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startDocument() {
        this.contentHandler.startDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        if (str2 != null) {
            int hashCode = str2.hashCode();
            Editable editable = this.output;
            if (hashCode != -1555043537) {
                if (hashCode != 3453) {
                    if (hashCode == 3735 && str2.equals("ul")) {
                        commitCurrentBulletSpan();
                        this.bulletIndentation++;
                        return;
                    }
                } else if (str2.equals("li")) {
                    commitCurrentBulletSpan();
                    this.currentBulletSpan = new BulletSpanWithLevel(Bullet.Default, this.bulletIndentation, editable.length());
                    return;
                }
            } else if (str2.equals("annotation")) {
                if (attributes != null) {
                    int length = attributes.getLength();
                    for (int i = 0; i < length; i++) {
                        String localName = attributes.getLocalName(i);
                        if (localName == null) {
                            localName = "";
                        }
                        String value = attributes.getValue(i);
                        String str4 = value != null ? value : "";
                        if (localName.length() > 0 && str4.length() > 0) {
                            int length2 = editable.length();
                            editable.setSpan(new AnnotationSpan(localName, str4), length2, length2, 17);
                        }
                    }
                    return;
                }
                return;
            }
        }
        this.contentHandler.startElement(str, str2, str3, attributes);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startPrefixMapping(String str, String str2) {
        this.contentHandler.startPrefixMapping(str, str2);
    }
}
