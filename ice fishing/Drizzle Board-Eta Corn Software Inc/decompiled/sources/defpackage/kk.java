package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class kk implements ua0 {
    public final String MdtA4re8;
    public final Context NCTxEWno;
    public boolean P7K7Inc8;
    public final cb0 VgvYg0wo;
    public final DPHdAVYO wxUZMvaN;

    public kk(Context context, String str, DPHdAVYO dPHdAVYO) {
        dPHdAVYO.getClass();
        this.NCTxEWno = context;
        this.MdtA4re8 = str;
        this.wxUZMvaN = dPHdAVYO;
        this.VgvYg0wo = new cb0(new e7(2, this));
    }

    @Override // defpackage.ua0
    public final fk KlHjfFWx() {
        return ((jk) this.VgvYg0wo.getValue()).VgvYg0wo(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.VgvYg0wo.MdtA4re8 != re.jb9XjC4I) {
            ((jk) this.VgvYg0wo.getValue()).close();
        }
    }

    @Override // defpackage.ua0
    public final String getDatabaseName() {
        return this.MdtA4re8;
    }

    @Override // defpackage.ua0
    public final void setWriteAheadLoggingEnabled(boolean z) {
        if (this.VgvYg0wo.MdtA4re8 != re.jb9XjC4I) {
            ((jk) this.VgvYg0wo.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.P7K7Inc8 = z;
    }
}
