package androidx.media3.extractor.metadata.flac;

import defpackage.d7k;
import defpackage.dsc;
import defpackage.eoh;
import defpackage.k5r;
import defpackage.l5i;
import defpackage.n2i;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class PictureFrame implements n2i {
    public final int colors;
    public final int depth;
    public final String description;
    public final int height;
    public final String mimeType;
    public final byte[] pictureData;
    public final int pictureType;
    public final int width;

    public PictureFrame(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.pictureType = i;
        this.mimeType = str;
        this.description = str2;
        this.width = i2;
        this.height = i3;
        this.depth = i4;
        this.colors = i5;
        this.pictureData = bArr;
    }

    public static PictureFrame fromPictureBlock(d7k d7kVar) {
        int h = d7kVar.h();
        String p = l5i.p(d7kVar.t(d7kVar.h(), StandardCharsets.US_ASCII));
        String t = d7kVar.t(d7kVar.h(), StandardCharsets.UTF_8);
        int h2 = d7kVar.h();
        int h3 = d7kVar.h();
        int h4 = d7kVar.h();
        int h5 = d7kVar.h();
        int h6 = d7kVar.h();
        byte[] bArr = new byte[h6];
        d7kVar.f(bArr, 0, h6);
        return new PictureFrame(h, p, t, h2, h3, h4, h5, bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PictureFrame.class == obj.getClass()) {
            PictureFrame pictureFrame = (PictureFrame) obj;
            if (this.pictureType == pictureFrame.pictureType && this.mimeType.equals(pictureFrame.mimeType) && this.description.equals(pictureFrame.description) && this.width == pictureFrame.width && this.height == pictureFrame.height && this.depth == pictureFrame.depth && this.colors == pictureFrame.colors && Arrays.equals(this.pictureData, pictureFrame.pictureData)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.n2i
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override // defpackage.n2i
    public /* bridge */ /* synthetic */ dsc getWrappedMetadataFormat() {
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.pictureData) + ((((((((k5r.c(k5r.c((527 + this.pictureType) * 31, 31, this.mimeType), 31, this.description) + this.width) * 31) + this.height) * 31) + this.depth) * 31) + this.colors) * 31);
    }

    @Override // defpackage.n2i
    public void populateMediaMetadata(eoh eohVar) {
        eohVar.a(this.pictureType, this.pictureData);
    }

    public String toString() {
        return "Picture: mimeType=" + this.mimeType + ", description=" + this.description;
    }
}
