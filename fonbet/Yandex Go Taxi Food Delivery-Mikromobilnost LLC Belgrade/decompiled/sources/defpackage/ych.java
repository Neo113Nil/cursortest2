package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes11.dex */
public final class ych extends t150 {
    public final /* synthetic */ int c;
    public final /* synthetic */ w3i w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ych(w3i w3iVar, int i) {
        super(0, "ImageCache-cleanUp");
        this.c = i;
        switch (i) {
            case 1:
                this.w = w3iVar;
                super(0, "ImageCache-trimDiskCache");
                break;
            default:
                this.w = w3iVar;
                break;
        }
    }

    @Override // defpackage.t150
    public final void a() {
        int i = this.c;
        w3i w3iVar = this.w;
        switch (i) {
            case 0:
                ((ReentrantLock) w3iVar.b).lock();
                try {
                    try {
                        ((ArrayList) w3iVar.x).clear();
                        qna1.d(w3iVar.i());
                        qna1.d(w3iVar.j());
                        File file = (File) w3iVar.z;
                        if (file != null) {
                            qna1.e(file);
                        }
                    } catch (IOException | RuntimeException e) {
                        ydz.c("[Y:ImageCache]", "Error deleting files", e);
                    }
                    return;
                } finally {
                }
            default:
                File file2 = (File) w3iVar.z;
                biv bivVar = (biv) w3iVar.y;
                ReentrantLock reentrantLock = (ReentrantLock) w3iVar.b;
                if (file2 == null) {
                    file2 = w3iVar.i();
                }
                if (file2 != null) {
                    reentrantLock.lock();
                    try {
                        bivVar.getClass();
                        bivVar.getClass();
                        ihb1.n(file2, 262144000L, 0.8f);
                        return;
                    } finally {
                    }
                }
                return;
        }
    }
}
