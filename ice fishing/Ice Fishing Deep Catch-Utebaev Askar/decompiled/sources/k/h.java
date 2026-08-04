package k;

import java.io.File;
import java.util.Iterator;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileWalkDirection f146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function2 f149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f150f;

    public h(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function2, Function2 function3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        fileWalkDirection = (i3 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection;
        i2 = (i3 & 32) != 0 ? Integer.MAX_VALUE : i2;
        this.f145a = file;
        this.f146b = fileWalkDirection;
        this.f147c = function1;
        this.f148d = function2;
        this.f149e = function3;
        this.f150f = i2;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new f(this);
    }
}
