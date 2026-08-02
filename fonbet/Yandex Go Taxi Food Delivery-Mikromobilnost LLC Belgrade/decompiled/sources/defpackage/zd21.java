package defpackage;

import androidx.media3.common.a;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.util.Comparator;

/* loaded from: classes10.dex */
public final class zd21 implements Comparator {
    public final /* synthetic */ a a;
    public final /* synthetic */ boolean b;

    public zd21(a aVar, boolean z) {
        this.a = aVar;
        this.b = z;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        boolean z = this.b;
        a aVar = this.a;
        sb10 sb10Var = (sb10) obj2;
        int i2 = -1;
        try {
            i = sb10Var.e(aVar) ? 2 : 0;
            if (z) {
                i += !sb10Var.i ? 1 : 0;
            }
        } catch (MediaCodecUtil$DecoderQueryException unused) {
            i = -1;
        }
        Integer valueOf = Integer.valueOf(i);
        sb10 sb10Var2 = (sb10) obj;
        try {
            int i3 = sb10Var2.e(aVar) ? 2 : 0;
            if (z) {
                i3 += !sb10Var2.i ? 1 : 0;
            }
            i2 = i3;
        } catch (MediaCodecUtil$DecoderQueryException unused2) {
        }
        return valueOf.compareTo(Integer.valueOf(i2));
    }
}
