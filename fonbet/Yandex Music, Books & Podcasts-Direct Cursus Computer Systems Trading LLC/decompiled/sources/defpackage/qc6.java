package defpackage;

import android.net.Uri;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public interface qc6 {
    static long a(qc6 qc6Var) {
        return ((tk7) qc6Var).d(-1L, "exo_len");
    }

    static Uri b(qc6 qc6Var) {
        byte[] bArr = (byte[]) ((tk7) qc6Var).b.get("exo_redir");
        String str = bArr != null ? new String(bArr, StandardCharsets.UTF_8) : null;
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }
}
