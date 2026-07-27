package L0;

import java.util.Arrays;

/* renamed from: L0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058p extends RuntimeException {
    public C0058p(String str, String[] strArr, String[] strArr2) {
        super("Could not find '" + str + "'. Looked for: " + Arrays.toString(strArr) + ", but only found: " + Arrays.toString(strArr2) + ".");
    }
}
