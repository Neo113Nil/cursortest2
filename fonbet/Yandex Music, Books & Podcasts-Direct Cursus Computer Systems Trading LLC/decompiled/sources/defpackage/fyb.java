package defpackage;

import android.content.Context;
import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public final class fyb {
    public final String a;
    public final Context b;
    public final Gson c;
    public final ReentrantLock d;
    public Map e;

    public fyb(String str, Context context, Gson gson) {
        str.getClass();
        this.a = str;
        this.b = context;
        this.c = gson;
        this.d = new ReentrantLock();
    }

    public final nnk a(String str) {
        File filesDir = this.b.getFilesDir();
        filesDir.getClass();
        return new nnk(new File(new File(new File(filesDir, "experiments2"), str), "details.txt"), this.c);
    }

    public final Map b() {
        Map map;
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            Map map2 = this.e;
            if (map2 != null) {
                return map2;
            }
            try {
                map = a(this.a).J();
                ssg.a(3, null, "DEBUG_YM: load experiments details: " + map, null);
                this.e = map;
            } catch (IOException e) {
                ssg.a(7, null, "Failed to load experiments details from file.", e);
                this.e = null;
                map = e5b.a;
                map.getClass();
            }
            return map;
        } finally {
            reentrantLock.unlock();
        }
    }
}
