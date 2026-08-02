package defpackage;

import android.net.Uri;
import androidx.media3.decoder.flac.e;
import androidx.media3.extractor.flac.FlacExtractor;
import java.util.Map;

/* loaded from: classes.dex */
public interface u2c {
    public static final u9 a = new u2c() { // from class: u9
        public final /* synthetic */ int b = 4;

        @Override // defpackage.u2c
        public final r2c[] e() {
            int i = 0;
            switch (this.b) {
                case 0:
                    return new r2c[]{new v9()};
                case 1:
                    return new r2c[]{new y9()};
                case 2:
                    return new r2c[]{new on(0)};
                case 3:
                    return new r2c[]{new p60()};
                case 4:
                    return new r2c[0];
                case 5:
                    return new r2c[]{new FlacExtractor()};
                case 6:
                    return new r2c[]{new e(0)};
                case 7:
                    return new r2c[]{new ync()};
                case 8:
                    return new r2c[]{new xfi(spr.p0, 16)};
                case 9:
                    return new r2c[]{new qnj()};
                case 10:
                    return new r2c[]{new c0n()};
                case 11:
                    ojs ojsVar = new ojs(0L);
                    ude udeVar = yde.b;
                    return new r2c[]{new ebt(1, 1, spr.p0, ojsVar, new et7(qsn.e, i))};
                default:
                    return new r2c[]{new vku()};
            }
        }
    };

    default r2c[] d(Uri uri, Map map) {
        return e();
    }

    r2c[] e();

    default void b() {
    }

    default void a(mvt mvtVar) {
    }

    default void c(boolean z) {
    }
}
