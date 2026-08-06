package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class qn {
    public android.os.Parcel ZpBGe2uQfcn8;

    public void JhCgjQRTAOCT(float f) {
        this.ZpBGe2uQfcn8.writeFloat(f);
    }

    public void WDYagTQQm9ns(long j) {
        long giKS3J6vZuNy = defpackage.tn1.giKS3J6vZuNy(j);
        byte b = 0;
        if (!defpackage.un1.ZpBGe2uQfcn8(giKS3J6vZuNy, 0L)) {
            if (defpackage.un1.ZpBGe2uQfcn8(giKS3J6vZuNy, 4294967296L)) {
                b = 1;
            } else if (defpackage.un1.ZpBGe2uQfcn8(giKS3J6vZuNy, 8589934592L)) {
                b = 2;
            }
        }
        fWTAfUmVKrZq(b);
        if (defpackage.un1.ZpBGe2uQfcn8(defpackage.tn1.giKS3J6vZuNy(j), 0L)) {
            return;
        }
        JhCgjQRTAOCT(defpackage.tn1.fWTAfUmVKrZq(j));
    }

    public long ZpBGe2uQfcn8() {
        int i = defpackage.pf.P05cfTpS5W5L;
        long readLong = this.ZpBGe2uQfcn8.readLong();
        long j = 63 & readLong;
        return j < 16 ? readLong : (readLong & (-64)) | (j + 1);
    }

    public void fWTAfUmVKrZq(byte b) {
        this.ZpBGe2uQfcn8.writeByte(b);
    }

    public long giKS3J6vZuNy() {
        android.os.Parcel parcel = this.ZpBGe2uQfcn8;
        byte readByte = parcel.readByte();
        long j = readByte == 1 ? 4294967296L : readByte == 2 ? 8589934592L : 0L;
        return defpackage.un1.ZpBGe2uQfcn8(j, 0L) ? defpackage.tn1.fWTAfUmVKrZq : defpackage.m90.UmgHb6n58gfG(j, parcel.readFloat());
    }
}
