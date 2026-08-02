package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public final class akr extends ByteArrayOutputStream {
    public final /* synthetic */ bkr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akr(bkr bkrVar, int i) {
        super(i);
        this.a = bkrVar;
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
            xq0.w(e);
            return null;
        }
    }
}
