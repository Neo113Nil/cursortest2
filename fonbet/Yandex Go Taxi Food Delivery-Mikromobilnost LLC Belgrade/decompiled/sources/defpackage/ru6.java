package defpackage;

import androidx.media3.common.a;
import java.util.List;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class ru6 {
    public dlh a = new dlh();
    public boolean b;

    public final su6 a(int i, a aVar, boolean z, List list, syc0 syc0Var) {
        b5p lesVar;
        String str = aVar.m;
        if (!eh20.o(str)) {
            if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                lesVar = new q810(this.b ? 1 : 3, this.a);
            } else if (Objects.equals(str, "image/jpeg")) {
                lesVar = new x9x(1);
            } else if (Objects.equals(str, "image/png")) {
                lesVar = new osd0();
            } else {
                int i2 = z ? 4 : 0;
                if (!this.b) {
                    i2 |= 32;
                }
                lesVar = new les(this.a, i2, null, null, list, syc0Var);
            }
        } else {
            if (!this.b) {
                return null;
            }
            lesVar = new j2v0(this.a.e(aVar), aVar);
        }
        return new su6(lesVar, i, aVar);
    }
}
