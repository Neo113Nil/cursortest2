package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class ar1 implements ca7 {
    public final /* synthetic */ int a;
    public Object b;
    public final Comparable c;
    public final Object d;

    public /* synthetic */ ar1(int i, Comparable comparable, Object obj) {
        this.a = i;
        this.d = obj;
        this.c = comparable;
    }

    @Override // defpackage.ca7
    public final void b() {
        switch (this.a) {
            case 0:
                Object obj = this.b;
                if (obj != null) {
                    try {
                        g(obj);
                        break;
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            default:
                Object obj2 = this.b;
                if (obj2 != null) {
                    try {
                        g(obj2);
                        break;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // defpackage.ca7
    public final void cancel() {
        int i = this.a;
    }

    @Override // defpackage.ca7
    public final void d(nsm nsmVar, ba7 ba7Var) {
        switch (this.a) {
            case 0:
                try {
                    Object i = i((AssetManager) this.d, (String) this.c);
                    this.b = i;
                    ba7Var.g(i);
                    break;
                } catch (IOException e) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
                    }
                    ba7Var.c(e);
                    return;
                }
            default:
                try {
                    Object h = h((ContentResolver) this.d, (Uri) this.c);
                    this.b = h;
                    ba7Var.g(h);
                    break;
                } catch (FileNotFoundException e2) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                        Log.d("LocalUriFetcher", "Failed to open Uri", e2);
                    }
                    ba7Var.c(e2);
                }
        }
    }

    @Override // defpackage.ca7
    public final int e() {
        switch (this.a) {
        }
        return 1;
    }

    public abstract void g(Object obj);

    public abstract Object h(ContentResolver contentResolver, Uri uri);

    public abstract Object i(AssetManager assetManager, String str);

    private final void c() {
    }

    private final void f() {
    }
}
