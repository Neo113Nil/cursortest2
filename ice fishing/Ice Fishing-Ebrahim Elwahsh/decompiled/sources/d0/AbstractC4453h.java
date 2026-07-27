package d0;

import android.system.Os;
import java.io.FileDescriptor;

/* renamed from: d0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4453h {
    public static void a(FileDescriptor fileDescriptor) {
        Os.close(fileDescriptor);
    }

    public static FileDescriptor b(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    public static long c(FileDescriptor fileDescriptor, long j9, int i) {
        return Os.lseek(fileDescriptor, j9, i);
    }
}
