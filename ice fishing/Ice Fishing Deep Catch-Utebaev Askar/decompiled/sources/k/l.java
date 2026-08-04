package k;

import java.io.File;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class l extends k {
    public static final boolean c(File start) {
        Intrinsics.checkNotNullParameter(start, "<this>");
        Intrinsics.checkNotNullParameter(start, "<this>");
        FileWalkDirection direction = FileWalkDirection.BOTTOM_UP;
        Intrinsics.checkNotNullParameter(start, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
        while (true) {
            boolean z = true;
            for (File file : new h(start, direction, null, null, null, 0, 32, null)) {
                if (file.delete() || !file.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
            return z;
        }
    }
}
