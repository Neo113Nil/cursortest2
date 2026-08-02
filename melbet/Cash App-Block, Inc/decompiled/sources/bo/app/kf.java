package bo.app;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes3.dex */
public final class kf extends ByteArrayOutputStream {
    public final /* synthetic */ lf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf(lf lfVar, int i) {
        super(i);
        this.a = lfVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i = ((ByteArrayOutputStream) this).count;
        if (i > 0) {
            int i2 = i - 1;
            if (((ByteArrayOutputStream) this).buf[i2] == 13) {
                i = i2;
            }
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i, this.a.b.name());
        } catch (UnsupportedEncodingException e) {
            a$$ExternalSyntheticBUOutline0.m$1(e);
            return null;
        }
    }
}
