package k;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f extends kotlin.collections.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f143d;

    public f(h hVar) {
        this.f143d = hVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f142c = arrayDeque;
        boolean zIsDirectory = hVar.f145a.isDirectory();
        File file = hVar.f145a;
        if (zIsDirectory) {
            arrayDeque.push(b(file));
        } else if (file.isFile()) {
            arrayDeque.push(new d(file));
        } else {
            this.f159a = e0.Done;
        }
    }

    @Override // kotlin.collections.c
    public final void a() {
        File file;
        while (true) {
            ArrayDeque arrayDeque = this.f142c;
            g gVar = (g) arrayDeque.peek();
            if (gVar == null) {
                file = null;
                break;
            }
            File fileA = gVar.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else {
                if (Intrinsics.a(fileA, gVar.f144a) || !fileA.isDirectory() || arrayDeque.size() >= this.f143d.f150f) {
                    file = fileA;
                    break;
                }
                arrayDeque.push(b(fileA));
            }
        }
        if (file == null) {
            this.f159a = e0.Done;
        } else {
            this.f160b = file;
            this.f159a = e0.Ready;
        }
    }

    public final b b(File file) {
        int iOrdinal = this.f143d.f146b.ordinal();
        if (iOrdinal == 0) {
            return new e(this, file);
        }
        if (iOrdinal == 1) {
            return new c(this, file);
        }
        throw new f.c();
    }
}
