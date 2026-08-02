package yads;

import java.io.IOException;

/* loaded from: classes7.dex */
public final class kv extends IOException {
    public kv(int i) {
        super("Illegal clipping: ".concat(i != 0 ? i != 1 ? i != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count"));
    }
}
