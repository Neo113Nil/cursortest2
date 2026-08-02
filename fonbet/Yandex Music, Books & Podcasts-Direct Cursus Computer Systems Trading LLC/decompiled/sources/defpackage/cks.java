package defpackage;

import android.content.Context;
import android.util.AtomicFile;
import java.io.File;

/* loaded from: classes4.dex */
public final class cks {
    public final File a;
    public final AtomicFile b;
    public final qqi c;

    public cks(Context context) {
        File file = new File(context.getFilesDir(), "tinyml_program_state.bin");
        this.a = file;
        this.b = new AtomicFile(file);
        this.c = rqi.a();
    }
}
