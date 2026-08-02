package org.apache.commons.imaging;

/* loaded from: classes7.dex */
public enum ImageFormats {
    UNKNOWN(0),
    BMP(1),
    DCX(2),
    GIF(3),
    ICNS(4),
    ICO(5),
    JBIG2(6),
    JPEG(7),
    PAM(8),
    PSD(9),
    PBM(10),
    PGM(11),
    PNM(12),
    PPM(13),
    PCX(14),
    PNG(15),
    RGBE(16),
    TGA(17),
    TIFF(18),
    WBMP(19),
    XBM(20),
    XPM(21);

    private final String[] extensions;

    ImageFormats(int i) {
        this.extensions = r2;
    }

    public final String a() {
        String[] strArr = this.extensions;
        if (strArr != null) {
            return strArr[0];
        }
        return null;
    }

    public final String[] b() {
        return (String[]) this.extensions.clone();
    }
}
